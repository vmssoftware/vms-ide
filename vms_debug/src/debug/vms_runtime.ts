/*---------------------------------------------------------
 * Copyright (C) VMS Corporation. All rights reserved.
 *--------------------------------------------------------*/

import * as vscode from 'vscode';
import * as nls from 'vscode-nls';
import { EventEmitter } from 'events';
import { ShellSession, ModeWork } from '../net/shell-session';
import { OsCommands } from '../command/os_commands';
import { DebugCommands, DebugCmdVMS } from '../command/debug_commands';
import { DebugParser, MessageDebuger } from '../parsers/debug_parser';
import { DebugProtocol } from 'vscode-debugprotocol';
import { LogFunction, LogType, ftpPathSeparator } from '@vorfol/common';
import { FileManagerExt } from '../ext-api/file_manager';

nls.config({ messageFormat: nls.MessageFormat.both });
const localize = nls.loadMessageBundle();


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
	//private lisFile: string;
	private buttonPressd : DebugButtonEvent;
	private shell : ShellSession;
	private osCmd : OsCommands;
	private dbgCmd : DebugCommands;
	private dbgParser : DebugParser;
	private fileManager : FileManagerExt;
	private debugRun : boolean;
	private programEnd : boolean;

	private stackStartFrame: number;
	private stackEndFrame: number;

	private sourcePaths: string[];
	private lisPaths: string[];

	// maps from sourceFile to array of VMS breakpoints
	private breakPoints = new Map<string, VMSBreakpoint[]>();
	private breakPointsSet = new Map<string, VMSBreakpoint[]>();
	private breakPointsRem = new Map<string, VMSBreakpoint[]>();

	// since we want to send breakpoint events, we will assign an id to every event
	// so that the frontend can match events with breakpoints.
	private breakpointId = 1;


	constructor(shell : ShellSession, public logFn?: LogFunction)
	{
		super();

		this.shell = shell;
		this.buttonPressd = DebugButtonEvent.btnNoEvent;
		this.osCmd = new OsCommands();
		this.dbgCmd = new DebugCommands();
		this.dbgParser = new DebugParser();
		this.fileManager = new FileManagerExt();
		this.debugRun = false;
		this.programEnd = false;
	}

	// Start executing the given program.
	public async start(programName: string, stopOnEntry : boolean) : Promise<void>
	{
		this.programEnd = false;
		let section = await this.fileManager.getProjectSection();

		if (!section)
		{
			return;
		}

		this.sourcePaths = await this.fileManager.loadPathListFiles(section.source);
		this.lisPaths = await this.fileManager.loadPathListFiles(section.listing);

		this.shell.resetParameters();
		//run debuger
		if(this.shell.getModeWork() === ModeWork.shell)
		{
			this.shell.SendCommandToQueue(this.osCmd.runDebug());
			this.shell.SendCommandToQueue(this.dbgCmd.setDisplay("dbge", "q1", "output"));
			this.shell.SendCommandToQueue(this.dbgCmd.redirectDataToDisplay("error", "dbge"));
			this.shell.SendCommandToQueue(this.dbgCmd.modeScreen());
			this.shell.SendCommandToQueue(this.dbgCmd.removeDisplay("src"));
			this.shell.SendCommandToQueue(this.dbgCmd.modeNoWait());
			this.shell.SendCommandToQueue(this.dbgCmd.run(programName));
		}
		else
		{
			this.shell.SendCommandToQueue(this.dbgCmd.clearDisplay("dbge, out"));
			this.shell.SendCommandToQueue(this.dbgCmd.modeScreen());
			this.shell.SendCommandToQueue(this.dbgCmd.rerun());
		}
		//clear entry breakpoint
		if(!stopOnEntry)
		{
			this.shell.SendCommandToQueue(this.dbgCmd.breakPointsRemove());//remove entry breakpoint
		}
		//set breakpoint
		await this.setRemoteBreakpointsAll();

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
		this.shell.SendCommandToQueue(this.dbgCmd.stop());
	}

	public exit(restart? : boolean)
	{
		this.buttonPressd = DebugButtonEvent.btnStop;
		//if the programm is running
		if(this.programEnd === false && this.shell.getCurrentCommand().getBody() !== "")
		{
			if(this.shell.getStatusCommand() === false)
			{
				this.shell.SendCommand(this.dbgCmd.customCmdNoParam("0"));
			}
			else
			{
				this.shell.SendCommand(this.dbgCmd.customCmdNoParam(""));
				this.shell.SendCommand(this.dbgCmd.customCmdNoParam("0"));
			}
		}

		if(!restart)
		{
			this.shell.SendCommandToQueue(this.dbgCmd.exit());
		}
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

	public sendDataToProgram(data : string) : boolean
	{
		let result = false;

		if(this.shell.getCurrentCommand().getBody() !== "")//go, step
		{
			this.shell.SendData(data);
			result = true;
		}
		else//enter bebug command
		{
			let command = data.toLowerCase();

			switch(command)
			{
				case DebugCmdVMS.dbgRunExe:
				case DebugCmdVMS.dbgRerunExe:
				case DebugCmdVMS.dbgStop:
				case DebugCmdVMS.dbgExit:
				case DebugCmdVMS.dbgGo:
				case DebugCmdVMS.dbgStep:
				case DebugCmdVMS.dbgStepOver:
				case DebugCmdVMS.dbgStepIn:
				case DebugCmdVMS.dbgStepReturn:
				//case DebugCmdVMS.dbgBreakPointSet:
				// case DebugCmdVMS.dbgBreakPointRemove:
				// case DebugCmdVMS.dbgBreakPointActivate:
				// case DebugCmdVMS.dbgBreakPointDeactivate:
				case DebugCmdVMS.dbgSetModeNoWait:
				case DebugCmdVMS.dbgSetModeScreen:
				case DebugCmdVMS.dbgSelect:
				case DebugCmdVMS.dbgSetDisplay:
					//don't resolve in manual
					const message = localize('runtime.command_ignore', "This command is not allowed!");
					vscode.debug.activeDebugConsole.append(message + "\n");
					break;

				default:
					this.shell.SendData(data);//send command to the debugger
					break;
			}

			result = true;
		}

		return result;
	}


	// Set breakpoints in file.
	public async setBreakPoints(path: string, lines: number[]) : Promise<VMSBreakpoint[] | undefined>
	{
		let newBps : VMSBreakpoint[] = new Array<VMSBreakpoint>();
		let setBps : VMSBreakpoint[] = new Array<VMSBreakpoint>();
		let remBps : VMSBreakpoint[] = new Array<VMSBreakpoint>();
		let notBps : VMSBreakpoint[] = new Array<VMSBreakpoint>();
		let vrfBps : VMSBreakpoint[] = new Array<VMSBreakpoint>();

		let source = await this.fileManager.getLocalSource();

		if (!source)
		{
			return undefined;
		}

		let fullPath = path;
		path = path.replace(/\\/g, ftpPathSeparator);
		path = path.slice(source.root!.length + 1);// to relative path

		let fileName = this.getNameFromPath(path);
		let key = path;
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
					if(this.shell.getCurrentCommand().getBody() !== DebugCmdVMS.dbgGo)
					{
						remBps.push(bpO);
					}
					else
					{
						newBps.push(bpO);
						this.sendEvent('breakpointAdd', bpO, fullPath);
					}
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
					if(this.shell.getCurrentCommand().getBody() !== DebugCmdVMS.dbgGo)
					{
						setBps.push(bpN);
					}
					else
					{
						notBps.push(bpN);
					}
				}
			}
		}
		else
		{
			for(let bpN of newBps)
			{
				if(this.shell.getCurrentCommand().getBody() !== DebugCmdVMS.dbgGo)
				{
					setBps.push(bpN);
				}
				else
				{
					notBps.push(bpN);
				}
			}
		}

		this.breakPoints.delete(key);
		this.breakPointsSet.delete(key);
		this.breakPointsRem.delete(key);

		this.breakPointsSet.set(key, setBps);
		this.breakPointsRem.set(key, remBps);

		for(let bp of newBps)
		{
			let find = false;

			for(let nBp of notBps)
			{
				if(bp === nBp)
				{
					find = true;
					break;
				}
			}

			if(!find)
			{
				vrfBps.push(bp);
			}
		}

		this.breakPoints.set(key, vrfBps);

		await this.verifyBreakpoints(path);
		//set remote breakpoints
		await this.setRemoteBreakpointsPath(path);

		return newBps;
	}

	// Set breakpoint in file with given line.
	public async setBreakPoint(path: string, line: number) : Promise<VMSBreakpoint>
	{
		let fileName = this.getNameFromPath(path);
		const bp = <VMSBreakpoint> { file: fileName, verified: false, line, id: this.breakpointId++ };
		let key = path;
		let bps = this.breakPoints.get(key);

		if (!bps)
		{
			bps = new Array<VMSBreakpoint>();
			this.breakPoints.set(key, bps);
		}

		bps.push(bp);

		await this.verifyBreakpoints(path);

		return bp;
	}
	// Clear breakpoint in file with given line.
	public clearBreakPoint(path: string, line: number) : VMSBreakpoint | undefined
	{
		let key = path;
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

	private getNameFromPath(item: string) : string
	{
		let namePos = item.lastIndexOf(ftpPathSeparator) + 1;// if no path -> from start (-1 + 1 = 0 ;)
		let extPos = item.lastIndexOf(".");

		if (extPos === -1)
		{
			extPos = item.length;// if no ext -> to the end
		}

		if (namePos >= 0 && namePos < extPos)
		{
			return item.slice(namePos, extPos).toLowerCase();// check name
		}

		return item;
	}

	private findPathFileByName(fileName : string, paths : string[]) : string
	{
		let pathFile : string = "";

		const name = this.getNameFromPath(fileName);

		for(let item of paths)
		{
			if (name === this.getNameFromPath(item))
			{
				pathFile = item;
				break;
			}
		}

		return pathFile;
	}

	private async loadSourceLang(file: string) : Promise<string[]>
	{
		return this.fileManager.loadContextFile(file);
	}

	private async loadSourceLis(file: string) : Promise<string[]>
	{
		return this.fileManager.loadContextFile(this.findPathFileByName(file, this.lisPaths));
	}

	private async verifyBreakpoints(path: string) : Promise<void>
	{
		let key = path;
		let bps = this.breakPoints.get(key);

		if (bps)
		{
			let sourceLines = await this.loadSourceLang(path);

			bps.forEach(bp =>
			{
				if (!bp.verified && bp.line < sourceLines.length)
				{
					let srcLine = sourceLines[bp.line].trim();

					// if a line is empty or starts with '{' we don't allow to set a breakpoint but move the breakpoint down
					while ((srcLine.length === 0 || srcLine.indexOf('{') === 0) && bp.line < sourceLines.length)
					{
						bp.line++;
						srcLine = sourceLines[bp.line].trim();
					}
					// if a line starts with '}' we don't allow to set a breakpoint but move the breakpoint up
					while (srcLine.indexOf('}') === 0 && bp.line < sourceLines.length)
					{
						bp.line--;
						srcLine = sourceLines[bp.line].trim();
					}

					bp.verified = true;
					this.sendEvent('breakpointValidated', bp);
				}
			});
		}
	}

	private async setRemoteBreakpointsAll() : Promise<void>
	{
		for(let path of this.sourcePaths)
		{
			await this.setRemoteBreakpoints(path);
		}
	}

	private async setRemoteBreakpointsPath(path: string) : Promise<void>
	{
		if(this.debugRun === true)
		{
			await this.setRemoteBreakpoints(path);
		}
	}

	private async setRemoteBreakpoints(path: string) : Promise<void>
	{
		let key = path;
		let setBps = this.breakPointsSet.get(key);
		let remBps = this.breakPointsRem.get(key);

		if (remBps)
		{
			if(remBps.length > 0)
			{
				let lisLines = await this.loadSourceLis(path);

				remBps.forEach(bp =>
				{
					//finde number of line
					let numberLine = this.dbgParser.findeBreakPointNumberLine(bp.line,  lisLines);

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
				let lisLines = await this.loadSourceLis(path);

				setBps.forEach(bp =>
				{
					//finde number of line
					let numberLine = this.dbgParser.findeBreakPointNumberLine(bp.line,  lisLines);

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


	public receiveData(data: string, mode: ModeWork) : void
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
			let messageData = this.dbgParser.getDataMessage();


			if(messageCommand !== "")
			{
				if (this.logFn)
				{
					this.logFn(LogType.information, () => messageCommand);
				}
			}
			if(messageData !== "")
			{
				switch(this.shell.getCurrentCommand().getBody())
				{
					case DebugCmdVMS.dbgExamine:
						this.sendEvent(DebugCmdVMS.dbgExamine, messageData);
						break;

					case DebugCmdVMS.dbgCallStack:
						this.dbgParser.parseCallStackMsg(messageData, this.sourcePaths, this.lisPaths, this.stackStartFrame, this.stackEndFrame)
							.then((stack) =>
							{
								this.sendEvent(DebugCmdVMS.dbgStack, stack);
							});
						break;
					default:
						break;
				}
			}
			if(messageDebug !== "")
			{
				if (this.logFn)
				{
					this.logFn(LogType.information, () => messageDebug);
				}

				vscode.debug.activeDebugConsole.append(messageDebug);

				if(messageDebug.includes(MessageDebuger.msgEnd))
				{
					this.programEnd = true;
					this.sendEvent('end');
				}
			}
			if(messageUser !== "")
			{
				if (this.logFn)
				{
					this.logFn(LogType.information, () => messageUser);
				}

				vscode.debug.activeDebugConsole.append(messageUser);

				if(messageUser.includes(MessageDebuger.msgNoImage))
				{
					this.programEnd = true;
					this.sendEvent('end');
				}
			}

			if(this.dbgParser.getCommandButtonStatus())
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