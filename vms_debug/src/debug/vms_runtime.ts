/*---------------------------------------------------------
 * Copyright (C) Microsoft Corporation. All rights reserved.
 *--------------------------------------------------------*/

import { readFileSync } from 'fs';
import { EventEmitter } from 'events';
import { ShellSession, ModeWork } from '../net/shell-session';
import { OsCommands } from '../command/os_commands';
import { DebugCommands } from '../command/debug_commands';
import { DebugParser } from '../parsers/debug_parser';
import { workspace, Uri } from 'vscode';

export interface VMSBreakpoint
{
	id: number;
	line: number;
	verified: boolean;
	installed: boolean;
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


/**
 * A VMS runtime with minimal debugger functionality.
 */
export class VMSRuntime extends EventEmitter
{
	// the initial (and one and only) file we are 'debugging'
	private sourceFile: string;
	private buttonPressd : DebugButtonEvent;
	private shell : ShellSession;
	private osCmd : OsCommands;
	private dbgCmd : DebugCommands;
	private dbgParser : DebugParser;
	private debugRun : boolean;

	// the contents (= lines) of the one and only file
	private sourceLines: string[];
	private sourcePaths: string[];

	// This is the next line that will be 'executed'
	private currentLine = 0;

	// maps from sourceFile to array of VMS breakpoints
	private _breakPoints = new Map<string, VMSBreakpoint[]>();

	// since we want to send breakpoint events, we will assign an id to every event
	// so that the frontend can match events with breakpoints.
	private _breakpointId = 1;


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

	/**
	 * Start executing the given program.
	 */
	public async start(programName: string, languageExt: string)
	{
		this.currentLine = -1;
		this.sourcePaths = await this.loadSourcePathList(languageExt);

		//run debuger
		this.shell.SendCommandToQueue(this.osCmd.runDebug());
		this.shell.SendCommandToQueue(this.dbgCmd.run(programName));

		this.setRemoteBreakpoints();

		this.continue();
	}

	//Continue execution to the end/beginning.
	public continue()
	{
		this.buttonPressd = DebugButtonEvent.btnContinue;

		this.shell.SendCommandToQueue(this.dbgCmd.go());
		this.currentLine = -1;
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
		this.shell.SendCommandToQueue(this.dbgCmd.step());
	}

	public stop()
	{
		this.buttonPressd = DebugButtonEvent.btnStop;
		this.shell.SendCommandToQueue(this.dbgCmd.stop());
	}

	public exit()
	{
		this.buttonPressd = DebugButtonEvent.btnStop;
		this.shell.SendCommandToQueue(this.dbgCmd.exit());
	}


	public getVariableValue(nameVar : string)
	{
		this.shell.SendCommandToQueue(this.dbgCmd.examine(nameVar));
	}

	public getSourceFile() : string
	{
		return this.sourceFile;
	}


	public stack(startFrame: number, endFrame: number): any
	{
		const words = this.sourceLines[this.currentLine].trim().split(/\s+/);

		const frames = new Array<any>();
		// every word of the current line becomes a stack frame.
		for (let i = startFrame; i < Math.min(endFrame, words.length); i++)
		{
			const name = words[i];	// use a word of the line as the stackframe name
			frames.push({
				index: i,
				name: `${name}(${i})`,
				file: this.sourceFile,
				line: this.currentLine
			});
		}
		return {
			frames: frames,
			count: words.length
		};
	}

	//Set breakpoint in file with given line.
	public setBreakPoint(path: string, line: number) : VMSBreakpoint
	{
		const bp = <VMSBreakpoint> { verified: false, line, id: this._breakpointId++ };
		let bps = this._breakPoints.get(path);

		if (!bps)
		{
			bps = new Array<VMSBreakpoint>();
			//
			this._breakPoints.set(path, bps);
		}

		bps.push(bp);

		this.verifyBreakpoints(path);

		//set remote breakpoint if debug runing
		if(this.debugRun === true)
		{
			this.setRemoteBreakpoints();
		}

		return bp;
	}

	//Clear breakpoint in file with given line.
	public clearBreakPoint(path: string, line: number) : VMSBreakpoint | undefined
	{
		let bps = this._breakPoints.get(path);

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

	//Clear all breakpoints for file.
	public clearBreakpoints(path: string): void
	{
		this._breakPoints.delete(path);
	}

	// private methods //

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

	private verifyBreakpoints(path: string) : void
	{
		let bps = this._breakPoints.get(path);

		if (bps)
		{
			this.loadSource(path);

			bps.forEach(bp =>
			{
				if (!bp.verified && bp.line < this.sourceLines.length)
				{
					const srcLine = this.sourceLines[bp.line].trim();

					// if a line is empty or starts with '+' we don't allow to set a breakpoint but move the breakpoint down
					if (srcLine.length === 0 || srcLine.indexOf('+') === 0)
					{
						bp.line++;
					}
					// if a line starts with '-' we don't allow to set a breakpoint but move the breakpoint up
					if (srcLine.indexOf('-') === 0)
					{
						bp.line--;
					}

					bp.verified = true;
					this.sendEvent('breakpointValidated', bp);
				}
			});
		}
	}

	private setRemoteBreakpoints() : void
	{
		for(let path of this.sourcePaths)
		{
			path = path.toLowerCase();
			let bps = this._breakPoints.get(path);

			if (bps)
			{
				this.loadSource(path);

				bps.forEach(bp =>
				{
					if (!bp.installed)
					{
						this.shell.SendCommandToQueue(this.dbgCmd.breakPointSet(1644));

						bp.installed = true;
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

			this.dbgParser.parseDebugData(data, this.sourcePaths);

			let lineInfo = this.dbgParser.getFileInfo();
			let messageCommand = this.dbgParser.getCommandMessage();
			let messageDebug = this.dbgParser.getDebugMessage();
			let messageUser = this.dbgParser.getUserMessage();

			if(messageCommand !== "")
			{
				console.log(messageCommand);

				if(messageCommand.includes("examine"))//show selected variable
				{
					let messageData = this.dbgParser.getDataMessage();
					this.sendEvent('examine', messageData);
				}
			}
			if(messageUser !== "")
			{
				console.log(messageUser);
			}
			if(messageDebug !== "")
			{
				console.log(messageDebug);

				if(messageDebug.includes("is '%SYSTEM-S-NORMAL, normal successful completion"))
				{
					this.sendEvent('end');
				}
			}

			if(lineInfo)
			{
				this.loadSource(lineInfo.filePath);
				this.currentLine = lineInfo.currLine;

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