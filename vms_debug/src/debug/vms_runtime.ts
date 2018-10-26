/*---------------------------------------------------------
 * Copyright (C) Microsoft Corporation. All rights reserved.
 *--------------------------------------------------------*/

import { readFileSync } from 'fs';
import * as Path from 'path';
import { EventEmitter } from 'events';
import { ShellSession, ModeWork } from '../net/shell-session';
import { OsCommands } from '../command/os_commands';
import { DebugCommands, DebugCmdVMS } from '../command/debug_commands';
import { DebugParser } from '../parsers/debug_parser';
import { workspace, Uri } from 'vscode';
import { DebugProtocol } from 'vscode-debugprotocol';
import {ToOutputChannel} from '../io/output-channel';


export interface VMSBreakpoint
{
	id: number;
	file: string;
	line: number;
	verified: boolean;
}

export enum DebugButtonEvent
{
	btnNoEvent = 0,
    btnContinue = 1,
	btnStepOver,
	btnStepInto,
	btnStepOut,
	btnRestart,
	btnPause,
	btnStop,
}


// VMS runtime with minimal debugger functionality.
export class VMSRuntime extends EventEmitter
{
	// the initial (and one and only) file we are 'debugging'
	private sourceFile: string;
	private workspaceFolder: string;
	private lisFile: string;
	private buttonPressd : DebugButtonEvent;
	private shell : ShellSession;
	private osCmd : OsCommands;
	private dbgCmd : DebugCommands;
	private dbgParser : DebugParser;
	private debugRun : boolean;

	private stackStartFrame: number;
	private stackEndFrame: number;

	// the contents (= lines) of the one and only file
	private sourceLines: string[];
	private sourcePaths: string[];
	private lisLines: string[];
	private lisPaths: string[];

	// maps from sourceFile to array of VMS breakpoints
	private breakPoints = new Map<string, VMSBreakpoint[]>();
	private breakPointsSet = new Map<string, VMSBreakpoint[]>();
	private breakPointsRem = new Map<string, VMSBreakpoint[]>();

	// since we want to send breakpoint events, we will assign an id to every event
	// so that the frontend can match events with breakpoints.
	private breakpointId = 1;


	constructor(shell : ShellSession)
	{
		super();

		this.shell = shell;
		this.buttonPressd = DebugButtonEvent.btnNoEvent;
		this.osCmd = new OsCommands();
		this.dbgCmd = new DebugCommands();
		this.dbgParser = new DebugParser();
		this.debugRun = false;
	}

	// Start executing the given program.
	public async start(programName: string, languageExt: string)
	{
		this.sourcePaths = await this.loadSourcePathList(languageExt);
		this.lisPaths = await this.loadSourcePathList("lis");

		if(workspace.workspaceFolders)
		{
			this.workspaceFolder = workspace.workspaceFolders[0].uri.fsPath;
		}

		//run debuger
		this.shell.SendCommandToQueue(this.osCmd.runDebug());
		this.shell.SendCommandToQueue(this.dbgCmd.setDisplay("dbge", "q1", "output"));
		this.shell.SendCommandToQueue(this.dbgCmd.redirectDataToDisplay("error", "dbge"));
		//this.shell.SendCommandToQueue(this.dbgCmd.redirectDataToDisplay("input", "out"));
		this.shell.SendCommandToQueue(this.dbgCmd.modeScreen());
		this.shell.SendCommandToQueue(this.dbgCmd.removeDisplay("src"));
		this.shell.SendCommandToQueue(this.dbgCmd.modeNoWait());
		this.shell.SendCommandToQueue(this.dbgCmd.run(programName));

		this.setRemoteBreakpointsAll();

		this.continue();
	}

	//Continue execution to the end/beginning.
	public continue()
	{
		this.buttonPressd = DebugButtonEvent.btnContinue;

		this.shell.SendCommandToQueue(this.dbgCmd.go());
	}

	public stepOver()
	{
		this.buttonPressd = DebugButtonEvent.btnStepOver;
		this.shell.SendCommandToQueue(this.dbgCmd.step());
	}

	public stepInto()
	{
		this.buttonPressd = DebugButtonEvent.btnStepInto;
		this.shell.SendCommandToQueue(this.dbgCmd.stepIn());
	}

	public stepOut()
	{
		this.buttonPressd = DebugButtonEvent.btnStepOut;
		this.shell.SendCommandToQueue(this.dbgCmd.stepReturn());
	}

	public stop()
	{
		this.buttonPressd = DebugButtonEvent.btnPause;
		this.shell.SendCommand(this.dbgCmd.stop());
	}

	public exit()
	{
		this.buttonPressd = DebugButtonEvent.btnStop;
		this.shell.SendCommandToQueue(this.dbgCmd.exit());
	}

	public variableValue(nameVar : string)
	{
		this.shell.SendCommandToQueue(this.dbgCmd.examine(nameVar));
	}

	public stack(startFrame: number, endFrame: number)
	{
		this.stackStartFrame = startFrame;
		this.stackEndFrame = endFrame;

		this.shell.SendCommandToQueue(this.dbgCmd.callStack());
	}

	public getVariables(id : string) : Array<DebugProtocol.Variable>
	{
		const variables = new Array<DebugProtocol.Variable>();

		if (id !== null)
		{
			variables.push({
				name: id + "_i",
				type: "int",
				value: "123",
				variablesReference: 0
			});
			variables.push({
				name: id + "_f",
				type: "float",
				value: "3.14",
				variablesReference: 0
			});
			variables.push({
				name: id + "_s",
				type: "string",
				value: "hello world",
				variablesReference: 0
			});
		}

		return variables;
	}

	public getSourceFile() : string
	{
		return this.sourceFile;
	}


	// Set breakpoints in file.
	public setBreakPoints(path: string, lines: number[]) : VMSBreakpoint[] | undefined
	{
		let newBps : VMSBreakpoint[] = new Array<VMSBreakpoint>();
		let setBps : VMSBreakpoint[] = new Array<VMSBreakpoint>();
		let remBps : VMSBreakpoint[] = new Array<VMSBreakpoint>();

		let fileName = this.getFileNameFromPath(path);
		let key = path.substring(2);
		let currBps = this.breakPoints.get(key);


		for(let line of lines)
		{
			const bp = <VMSBreakpoint> { file: fileName, verified: false, line, id: this.breakpointId++ };
			newBps.push(bp);
		}

		//find new and old breakpoint
		if (currBps)
		{
			for(let bpO of currBps)
			{
				let bpFound = false;

				for(let bpN of newBps)
				{
					if(bpN.line === bpO.line)
					{
						bpFound = true;
						break;
					}
				}

				if(!bpFound)
				{
					remBps.push(bpO);
				}
			}

			for(let bpN of newBps)
			{
				let bpFound = false;

				for(let bpO of currBps)
				{
					if(bpN.line === bpO.line)
					{
						bpFound = true;
						break;
					}
				}

				if(!bpFound)
				{
					setBps.push(bpN);
				}
			}
		}
		else
		{
			for(let bpN of newBps)
			{
				setBps.push(bpN);
			}
		}

		this.breakPoints.delete(key);
		this.breakPointsSet.delete(key);
		this.breakPointsRem.delete(key);

		this.breakPoints.set(key, newBps);
		this.breakPointsSet.set(key, setBps);
		this.breakPointsRem.set(key, remBps);

		this.verifyBreakpoints(path);
		//set remote breakpoints
		this.setRemoteBreakpointsPath(path);

		return newBps;
	}

	// Set breakpoint in file with given line.
	public setBreakPoint(path: string, line: number) : VMSBreakpoint
	{
		let fileName = this.getFileNameFromPath(path);
		const bp = <VMSBreakpoint> { file: fileName, verified: false, line, id: this.breakpointId++ };
		let key = path.substring(2);
		let bps = this.breakPoints.get(key);

		if (!bps)
		{
			bps = new Array<VMSBreakpoint>();
			this.breakPoints.set(key, bps);
		}

		bps.push(bp);

		this.verifyBreakpoints(path);

		return bp;
	}
	// Clear breakpoint in file with given line.
	public clearBreakPoint(path: string, line: number) : VMSBreakpoint | undefined
	{
		let key = path.substring(2);
		let bps = this.breakPoints.get(key);

		if (bps)
		{
			const index = bps.findIndex(bp => bp.line === line);
			if (index >= 0)
			{
				const bp = bps[index];
				bps.splice(index, 1);
				return bp;
			}
		}

		return undefined;
	}

	// Clear all breakpoints for file.
	public clearBreakpoints(path: string): void
	{
		this.breakPoints.delete(path);
	}

	// private methods //

	private getFileNameFromPath(path: string) : string
	{
		let fileName : string = "";

		let ext = Path.extname(path);

		if (ext)
		{
			fileName = path.substr(0, path.length - ext.length);
			let array = fileName.split("\\");
			fileName = array[array.length-1];
		}

		return fileName;
	}

	private async loadSourcePathList(extensionFile : string) : Promise<string[]>
	{
		let list : string[] = [];
		let uris : Uri[] = await workspace.findFiles("**/*." + extensionFile);

		for(let item of uris)
		{
			list.push(item.fsPath);
		}

		return list;
	}

	private loadSource(file: string)
	{
		if (this.sourceFile !== file)
		{
			this.sourceFile = file;
			this.sourceLines = readFileSync(this.sourceFile).toString().split('\n');
		}
	}

	private loadSourceLis(file: string)
	{
		if (this.lisFile !== file)
		{
			this.lisFile = file;
			file = file.substr(this.workspaceFolder.length, file.length);

			let ext = Path.extname(file);

			if (ext)
			{
				file = file.substr(0, file.length - ext.length);
			}

			for(let item of this.lisPaths)
			{
				if(item.includes(file))
				{
					file = item;
					break;
				}
			}

			this.lisLines = readFileSync(file).toString().split('\n');
		}
	}

	private verifyBreakpoints(path: string) : void
	{
		let key = path.substring(2);
		let bps = this.breakPoints.get(key);

		if (bps)
		{
			this.loadSource(path);

			bps.forEach(bp =>
			{
				if (!bp.verified && bp.line < this.sourceLines.length)
				{
					let srcLine = this.sourceLines[bp.line].trim();

					// if a line is empty or starts with '{' we don't allow to set a breakpoint but move the breakpoint down
					while ((srcLine.length === 0 || srcLine.indexOf('{') === 0) && bp.line < this.sourceLines.length)
					{
						bp.line++;
						srcLine = this.sourceLines[bp.line].trim();
					}
					// if a line starts with '}' we don't allow to set a breakpoint but move the breakpoint up
					while (srcLine.indexOf('}') === 0 && bp.line < this.sourceLines.length)
					{
						bp.line--;
						srcLine = this.sourceLines[bp.line].trim();
					}

					bp.verified = true;
					this.sendEvent('breakpointValidated', bp);
				}
			});
		}
	}

	private setRemoteBreakpointsAll() : void
	{
		for(let path of this.sourcePaths)
		{
			this.setRemoteBreakpoints(path);
		}
	}

	private setRemoteBreakpointsPath(path: string) : void
	{
		if(this.debugRun === true)
		{
			this.setRemoteBreakpoints(path);
		}
	}

	private setRemoteBreakpoints(path: string) : void
	{
		let key = path.substring(2);
		let setBps = this.breakPointsSet.get(key);
		let remBps = this.breakPointsRem.get(key);

		if (remBps)
		{
			if(remBps.length > 0)
			{
				this.loadSourceLis(path);

				remBps.forEach(bp =>
				{
					//finde number of line
					let numberLine = this.dbgParser.findeBreakPointNumberLine(bp.line,  this.lisLines);

					if(!Number.isNaN(numberLine))
					{
						this.shell.SendCommandToQueue(this.dbgCmd.breakPointRemove(bp.file, numberLine));
					}
					else//clear breakpoint
					{
						const bpm = this.clearBreakPoint(path, bp.line);
						this.sendEvent('breakpointRemoved', bpm);
					}
				});
			}
		}

		if (setBps)
		{
			if(setBps.length > 0)
			{
				this.loadSourceLis(path);

				setBps.forEach(bp =>
				{
					//finde number of line
					let numberLine = this.dbgParser.findeBreakPointNumberLine(bp.line,  this.lisLines);

					if(!Number.isNaN(numberLine))
					{
						this.shell.SendCommandToQueue(this.dbgCmd.breakPointSet(bp.file, numberLine));
					}
					else//clear breakpoint
					{
						const bpm = this.clearBreakPoint(path, bp.line);
						this.sendEvent('breakpointRemoved', bpm);
					}
				});
			}
		}
	}

	private sendEvent(event: string, ... args: any[])
	{
		setImmediate(_ => {
			this.emit(event, ...args);
		});
	}


	public receiveData(data: string, mode: ModeWork)
	{
		if(mode === ModeWork.shell)
		{
			this.debugRun = false;
		}
		else if(mode === ModeWork.debug)
		{
			this.debugRun = true;

			this.dbgParser.parseDebugData(this.shell.getCurrentCommand(), data, this.sourcePaths, this.lisPaths);

			let messageCommand = this.dbgParser.getCommandMessage();
			let messageDebug = this.dbgParser.getDebugMessage();
			let messageUser = this.dbgParser.getUserMessage();

			if(messageCommand !== "")
			{
				ToOutputChannel(messageCommand);

				if(messageCommand.includes(DebugCmdVMS.dbgExamine))//show selected variable
				{
					let messageData = this.dbgParser.getDataMessage();
					this.sendEvent(DebugCmdVMS.dbgExamine, messageData);
				}
				else if(messageCommand.includes(DebugCmdVMS.dbgCallStack))//show call stack
				{
					let messageData = this.dbgParser.getDataMessage();

					let stack = this.dbgParser.parseCallStackMsg(messageData, this.sourcePaths, this.lisPaths, this.stackStartFrame, this.stackEndFrame);
					this.sendEvent(DebugCmdVMS.dbgStack, stack);
				}
			}
			if(messageUser !== "")
			{
				ToOutputChannel(messageUser);
			}
			if(messageDebug !== "")
			{
				ToOutputChannel(messageDebug);

				if(messageDebug.includes("%SYSTEM-S-NORMAL, normal successful completion"))
				{
					this.sendEvent('end');
				}
			}

			if(this.dbgParser.getCommandStatus())
			{
				switch(this.buttonPressd)
				{
					case DebugButtonEvent.btnContinue:
						this.sendEvent('stopOnBreakpoint');
						this.buttonPressd = 0;
						break;

					case DebugButtonEvent.btnStepOver:
						this.sendEvent('stopOnStep');
						this.buttonPressd = 0;
						break;

					case DebugButtonEvent.btnStepInto:
						this.sendEvent('stopOnStep');
						this.buttonPressd = 0;
						break;

					case DebugButtonEvent.btnStepOut:
						this.buttonPressd = DebugButtonEvent.btnStepOver;
						this.shell.SendCommandToQueue(this.dbgCmd.step());
						break;

					case DebugButtonEvent.btnRestart:
						this.buttonPressd = 0;
						break;

					case DebugButtonEvent.btnPause:
					console.log("stop");
						this.sendEvent('stopOnStep');
						this.buttonPressd = 0;
						break;

					case DebugButtonEvent.btnStop:
						this.buttonPressd = 0;
						break;

					default:
						break;
				}
			}
		}
	}
}