/*---------------------------------------------------------
 * Copyright (C) VMS Corporation. All rights reserved.
 *--------------------------------------------------------*/

import * as readline from 'readline';
import * as vscode from 'vscode';
import { EventEmitter } from 'events';
import { ShellSession, ModeWork } from '../net/shell-session';
import { OsCommands } from '../command/os_commands';
import { DebugCommands, DebugCmdVMS } from '../command/debug_commands';
import { DebugParser, MessageDebuger } from '../parsers/debug_parser';
import { DebugProtocol } from 'vscode-debugprotocol';
import { LogFunction, LogType, IFileEntry, Lock, ftpPathSeparator } from '@vorfol/common';
import { ISource } from '../ext-api/source';
import { GetSourceHelperFromApi } from '../ext-api/get-source-helper';
import { ensureProjectSettings, projectSection } from '../ext-api/ensure-project';


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
	private lisFile: string;
	private buttonPressd : DebugButtonEvent;
	private shell : ShellSession;
	private osCmd : OsCommands;
	private dbgCmd : DebugCommands;
	private dbgParser : DebugParser;
	private debugRun : boolean;

	private stackStartFrame: number;
	private stackEndFrame: number;

	private localSource?: ISource;

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


	constructor(shell : ShellSession, public logFn?: LogFunction)
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
	public async start(programName: string)
	{
		if (!await ensureProjectSettings() || !projectSection ) {
			return;
		}

		this.sourcePaths = await this.loadSourcePathList(projectSection.source);
		this.lisPaths = await this.loadSourcePathList(projectSection.listing);

		this.shell.resetParameters();
		//run debuger
		this.shell.SendCommandToQueue(this.osCmd.runDebug());
		this.shell.SendCommandToQueue(this.dbgCmd.setDisplay("dbge", "q1", "output"));
		this.shell.SendCommandToQueue(this.dbgCmd.redirectDataToDisplay("error", "dbge"));
		//this.shell.SendCommandToQueue(this.dbgCmd.redirectDataToDisplay("input", "out"));
		this.shell.SendCommandToQueue(this.dbgCmd.modeScreen());
		this.shell.SendCommandToQueue(this.dbgCmd.removeDisplay("src"));
		this.shell.SendCommandToQueue(this.dbgCmd.modeNoWait());
		this.shell.SendCommandToQueue(this.dbgCmd.run(programName));

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

	public sendDataToProgram(data : string) : boolean
	{
		let result = false;

		if(!this.shell.getStatusCommand())
		{
			this.shell.SendData(data);
			result = true;
		}

		return result;
	}

	public getSourceFile() : string
	{
		return this.sourceFile;
	}


	// Set breakpoints in file.
	public async setBreakPoints(path: string, lines: number[]) // : VMSBreakpoint[] | undefined
	{
		let newBps : VMSBreakpoint[] = new Array<VMSBreakpoint>();
		let setBps : VMSBreakpoint[] = new Array<VMSBreakpoint>();
		let remBps : VMSBreakpoint[] = new Array<VMSBreakpoint>();

		if (!await this.ensureLocalSource() || !this.localSource) {
			return;
		}
		path = path.slice(this.localSource.root!.length + 1);	// to relative path

		let fileName = this.getNameFromPath(path);
		let key = path; //.substring(2);
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

		await this.verifyBreakpoints(path);
		//set remote breakpoints
		await this.setRemoteBreakpointsPath(path);

		return newBps;
	}

	// Set breakpoint in file with given line.
	public async setBreakPoint(path: string, line: number) // : VMSBreakpoint
	{
		let fileName = this.getNameFromPath(path);
		const bp = <VMSBreakpoint> { file: fileName, verified: false, line, id: this.breakpointId++ };
		let key = path; //.substring(2);
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
		let key = path; //.substring(2);
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

	private async ensureLocalSource() {
		if (!this.localSource) {
			const sourceHelper = await GetSourceHelperFromApi();
			if (sourceHelper) {
				this.localSource = await sourceHelper.getSource("local");
			}
		}
		return this.localSource !== undefined;
	}

	private async loadSourcePathList(pattern : string) : Promise<string[]>
	{
		if (!await this.ensureLocalSource()) {
			return [] as string[];
		}

		let list : string[] = [];
		let entries : IFileEntry[] = await this.localSource!.findFiles(pattern);

		for(let item of entries)
		{
			// list.push(this.localSource!.root! + ftpPathSeparator + item.filename);
			list.push(item.filename);
		}

		return list;
	}

	private getNameFromPath(item: string) {
		let namePos = item.lastIndexOf(ftpPathSeparator) + 1;	// if no path -> from start (-1 + 1 = 0 ;)
		let extPos = item.lastIndexOf(".");
		if (extPos === -1) {
			// if no ext -> to the end
			extPos = item.length;
		}
		if (0 <= namePos && namePos < extPos) {
			// check name
			return item.slice(namePos, extPos).toLowerCase();
		}
		return item;
	}

	private findPathFileByName(fileName : string, paths : string[]) : string
	{
		let pathFile : string = "";

		const name = this.getNameFromPath(fileName);

		for(let item of paths)
		{
			if (name === this.getNameFromPath(item)) {
				pathFile = item;
				break;
			}
		}

		return pathFile;
	}
	private async loadSource(file: string)
	{
		if (await this.ensureLocalSource()) {
			const stream = await this.localSource!.createReadStream(file);
			if (stream) {
				const ret: string[] = [];
				const lock = new Lock(true);
				const rl = readline.createInterface(stream);
				rl.on("close", () => {
					lock.release();
				});
				rl.on("line", (line) => {
					ret.push(line);
				});
				await lock.acquire();
				return ret;
			}
		}
		return [] as string[];
	}

	private async loadSourceLis(file: string)
	{
		const lisFile = this.findPathFileByName(file, this.lisPaths);
		if (this.lisFile !== lisFile) {
			this.lisFile = lisFile;
			this.lisLines = await this.loadSource(this.lisFile);
		}
	}

	private async verifyBreakpoints(path: string) // : void
	{
		let key = path; //.substring(2);
		let bps = this.breakPoints.get(key);

		if (bps)
		{
			this.sourceLines = await this.loadSource(path);

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

	private async setRemoteBreakpointsAll() // : void
	{
		for(let path of this.sourcePaths)
		{
			await this.setRemoteBreakpoints(path);
		}
	}

	private async setRemoteBreakpointsPath(path: string) // : void
	{
		if(this.debugRun === true)
		{
			await this.setRemoteBreakpoints(path);
		}
	}

	private async setRemoteBreakpoints(path: string) // : void
	{
		let key = path; //.substring(2);
		let setBps = this.breakPointsSet.get(key);
		let remBps = this.breakPointsRem.get(key);

		if (remBps)
		{
			if(remBps.length > 0)
			{
				await this.loadSourceLis(path);

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
				await this.loadSourceLis(path);

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
							.then((stack) => {
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