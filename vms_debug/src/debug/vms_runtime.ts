/*---------------------------------------------------------
 * Copyright (C) VMS Corporation. All rights reserved.
 *--------------------------------------------------------*/

import * as vscode from 'vscode';
import * as nls from 'vscode-nls';
import { EventEmitter } from 'events';
import { ShellSession, ModeWork, TypeDataMessage } from '../net/shell-session';
import { OsCommands } from '../command/os_commands';
import { DebugCommands, DebugCmdVMS } from '../command/debug_commands';
import { DebugParser, MessageDebuger, Parameters, StringsPrompt } from '../parsers/debug_parser';
import { LogFunction, LogType, ftpPathSeparator } from '@vorfol/common';
import { FileManagerExt } from '../ext-api/file_manager';
import { HolderDebugVariableInfo, DebugVariable, ReflectKind, VariableFileInfo } from '../parsers/debug_variable_info';
const { Subject } = require('await-notify');
import * as WaitSubject from 'await-notify';
import { Queue } from '../queue/queues';
import { GetSyncApi } from '../ext-api/get-sync-api';

nls.config({ messageFormat: nls.MessageFormat.both });
const localize = nls.loadMessageBundle();


export interface VMSBreakpoint
{
	id: number;
	file: string;
	line: number;
	verified: boolean;
}

export interface VMSWatchpoint
{
	name: string;
	params: string;
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
	private varsInfo : HolderDebugVariableInfo;
	private debugRun : boolean;
	private programEnd : boolean;
	private waitSymbols = new Subject();
	private queueWaitVar = new Queue<WaitSubject>();

	private stackStartFrame: number;
	private stackEndFrame: number;

	private sourcePaths: string[];
	private lisPaths: string[];
	private workSpacePath: string;
	private rootFolderName: string;

	private currentFilePath: string;
	private currentRoutine: string;

	// maps from sourceFile to array of VMS breakpoints
	private breakPoints = new Map<string, VMSBreakpoint[]>();
	private breakPointsSet = new Map<string, VMSBreakpoint[]>();
	private breakPointsRem = new Map<string, VMSBreakpoint[]>();
	// maps of VSM watchpoints
	private watchPoints = new Map<string, VMSWatchpoint[]>();

	// since we want to send breakpoint events, we will assign an id to every event
	// so that the frontend can match events with breakpoints.
	private breakpointId = 1;


	constructor(public folder: vscode.WorkspaceFolder | undefined, shell : ShellSession, public logFn?: LogFunction)
	{
		super();

		this.shell = shell;
		this.buttonPressd = DebugButtonEvent.btnNoEvent;
		this.rootFolderName = folder ? folder.name : "";
		this.osCmd = new OsCommands();
		this.dbgCmd = new DebugCommands();
		this.dbgParser = new DebugParser(folder);
		this.varsInfo = new HolderDebugVariableInfo();
		this.debugRun = false;
		this.programEnd = false;
		this.workSpacePath = "";
		this.currentFilePath = "";
		this.currentRoutine = "";
		this.sourcePaths = [];
		this.lisPaths = [];
	}

	// Start executing the given program.
	public async start(programName: string, stopOnEntry : boolean) : Promise<void>
	{
		this.programEnd = false;
		let fileManager = new FileManagerExt(this.rootFolderName);
		let section = await fileManager.getProjectSection();

		if (!section)
		{
			return;
		}

		let syncApi = await GetSyncApi();
		let localSource = await fileManager.getLocalSource();
		let rootPath = "" + localSource!.root;
		this.workSpacePath = rootPath.substring(0, rootPath.length - this.rootFolderName.length);

		if(syncApi)
		{
			let listFolders = syncApi.getDepList(this.rootFolderName);

			for(let folder of listFolders)
			{
				let fileM = new FileManagerExt(folder);
				let sourcePaths = await fileM.loadPathListFiles(section.source);
				let lisPaths = await fileM.loadPathListFiles(section.listing);

				this.addPrefixToArray(folder, sourcePaths);
				this.addPrefixToArray(folder, lisPaths);

				this.sourcePaths = this.sourcePaths.concat(sourcePaths);
				this.lisPaths = this.lisPaths.concat(lisPaths);
			}
		}
		else
		{
			this.sourcePaths = await fileManager.loadPathListFiles(section.source);
			this.lisPaths = await fileManager.loadPathListFiles(section.listing);

			this.addPrefixToArray(this.rootFolderName, this.sourcePaths);
			this.addPrefixToArray(this.rootFolderName, this.lisPaths);
		}

		this.checkLisFiles(this.sourcePaths, this.lisPaths);
		this.shell.resetParameters();

		//run debugger
		if(this.shell.getModeWork() === ModeWork.shell)
		{
			// run appropriate COM file, if it exists
			const preRunFile = section.projectName + ".com";
			const found = await localSource!.findFiles(preRunFile);
			if (found.length === 1)
			{
				const dotted_root = section.root.replace(/\//g, ".");
				const pathToPreRunFile = `[.${dotted_root}]${preRunFile} DEBUG`;
				this.shell.SendCommandToQueue(this.osCmd.runCOM(pathToPreRunFile));
			}
			//config debugger
			this.shell.SendCommandToQueue(this.osCmd.runDebug());
			this.shell.SendCommandToQueue(this.dbgCmd.setDisplay("dbge", "q1", "output"));
			this.shell.SendCommandToQueue(this.dbgCmd.redirectDataToDisplay("error", "dbge"));
			this.shell.SendCommandToQueue(this.dbgCmd.modeScreen());
			this.shell.SendCommandToQueue(this.dbgCmd.removeDisplay("src"));
			this.shell.SendCommandToQueue(this.dbgCmd.modeNoWait());
			this.shell.SendCommandToQueue(this.dbgCmd.run(programName));
		}
		else//reload program
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

	private addPrefixToArray(perfix : string, array : string[])
	{
		for(let i = 0; i < array.length; i++)
		{
			array[i] = perfix + ftpPathSeparator + array[i];
		}
	}

	private checkLisFiles(sources : string[], lis : string[])
	{
		for(let itemSource of sources)
		{
			let found = false;
			let name = this.getNameFromPath(itemSource);

			for(let itemLis of lis)
			{
				if(name === this.getNameFromPath(itemLis))
				{
					found = true;
					break;
				}
			}

			if(!found)
			{
				const message = localize('runtime.lis_not_found', ".LIS file don't found for the source file");
				vscode.window.showWarningMessage(message + " " + itemSource + "\n");

				if (this.logFn)
				{
					this.logFn(LogType.information, () => message + " " + itemSource + "\n");
				}
			}
		}
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

	public stack(startFrame: number, endFrame: number)
	{
		this.stackStartFrame = startFrame;
		this.stackEndFrame = endFrame;

		this.shell.SendCommandToQueue(this.dbgCmd.callStack());
	}

	public setVariableValue(nameVar : string, valueVar : string)
	{
		if(nameVar.length > 0)
		{
			this.shell.SendCommandToQueue(this.dbgCmd.deposit(nameVar, valueVar));
		}
	}

	public setWatchVariable(nameVar : string, params : string)
	{
		if(nameVar.length > 0)
		{
			let wpFound = false;
			let wpChanged = false;
			let wpIndex = -1;
			let currWps = this.watchPoints.get("keyWatchPoints");
			params = params.toLowerCase();

			if (currWps)
			{
				for(let wp of currWps)//finding watchpoint
				{
					wpIndex++;

					if(wp.name === nameVar)
					{
						if(wp.params !== params)
						{
							wpChanged = true;
							wp.params = params;
						}
						wpFound = true;
						break;
					}
				}
			}
			else
			{
				currWps = new Array<VMSWatchpoint>();
			}

			if(!wpFound || wpChanged)
			{
				if(params.includes("()") || params.includes("when"))//set watch to variable
				{
					if(!wpFound)
					{
						const wp = <VMSWatchpoint> { name: nameVar, params: params };

						currWps.push(wp);
						this.watchPoints.delete("keyWatchPoints");
						this.watchPoints.set("keyWatchPoints", currWps);
					}

					if(params.includes("when"))//add condition to watchpoint
					{
						params = params.substring(1, params.length-1);
						nameVar = nameVar + " " + params;
					}

					this.shell.SendCommandToQueue(this.dbgCmd.watchPointSet(nameVar));
				}
				else if(wpChanged)//cancel watch
				{
					currWps.splice(wpIndex, 1);
					this.watchPoints.delete("keyWatchPoints");
					this.watchPoints.set("keyWatchPoints", currWps);

					this.shell.SendCommandToQueue(this.dbgCmd.watchPointRemove(nameVar));
				}
				else
				{
					if(params !== "")
					{
						//error parameters!
						const message = localize('runtime.watch_error', "Watch: Error parameter. Example: (when (x > 3)) or ().");
						vscode.debug.activeDebugConsole.append(message + "\n");
					}
				}
			}
		}
	}

	public async getVariable(nameVar : string) : Promise<Array<DebugVariable>>
	{
		const variables = new Array<DebugVariable>();

		if(nameVar.length > 0)
		{
			if(nameVar.charAt(0) === "&" || nameVar.charAt(0) === "*")
			{
				nameVar = nameVar.substr(1);
			}

			this.varsInfo = this.dbgParser.getVariableFileInfo();
			let vars = this.varsInfo.getVariableFile(this.currentFilePath);

			if(vars)
			{
				for(let item of vars)
				{
					if(item.variableName === nameVar)
					{
						if(item.functionName === this.currentRoutine ||
							item.functionName === "")
						{
							if(item.variableType.includes("pointer to"))
							{
								nameVar = "*" + nameVar;
							}
							else if(item.variableType.includes("typedef string"))
							{
								if(item.variableAddress && item.variableAddress !== 0)
								{
									nameVar = "*" + nameVar + StringsPrompt.cppString;
								}
							}

							this.shell.SendCommandToQueue(this.dbgCmd.examine(nameVar));

							let wait = new Subject();
							this.queueWaitVar.push(wait);
							await wait.wait(5000);

							if(wait.message === undefined)//no answer
							{
								if(this.queueWaitVar.size() > 0)
								{
									this.queueWaitVar.pop();
								}
							}

							let childs : DebugVariable[] = [];

							if(item.variableKind === ReflectKind.Array ||
								item.variableKind === ReflectKind.Struct ||
								item.variableKind === ReflectKind.Pointer)
							{
								childs = this.dbgParser.parseStructValues(item, new Parameters());
							}

							variables.push({
								name: item.variableName,
								addr: item.variableAddress,
								type: item.variableType,
								kind: item.variableKind,
								value: item.variableValue,
								info: item.variableInfo,
								len: 0,
								unreadable: "",
								fullyQualifiedName: "",
								children : childs
							});
							break;
						}
					}
				}
			}
		}

		return variables;
	}

	public async getVariables(id : string) : Promise<Array<DebugVariable>>
	{
		const variables = new Array<DebugVariable>();

		if (id !== null)
		{
			let funcName : string = "";//if function name = "" search global variable
			this.varsInfo = this.dbgParser.getVariableFileInfo();
			let vars = this.varsInfo.getVariableFile(this.currentFilePath);

			if(!vars)//request variables info
			{
				let nameFile = this.getNameFromPath(this.currentFilePath);
				this.shell.SendCommandToQueue(this.dbgCmd.showSymbols(nameFile));
				await this.waitSymbols.wait(5000);

				vars = this.varsInfo.getVariableFile(this.currentFilePath);
			}

			if(id === ("local"))
			{
				funcName = this.currentRoutine;
			}
			else // global
			{
				funcName = "";
			}

			if(vars)
			{
				let nameVars : string = "";

				for(let item of vars)//create string of variables
				{
					if(item.functionName === funcName)
					{
						nameVars = this.addVariableToString(nameVars, item);
					}
				}

				if(nameVars !== "")
				{
					this.shell.SendCommandToQueue(this.dbgCmd.examine(nameVars));//request values of variables

					let wait = new Subject();
					this.queueWaitVar.push(wait);
					await wait.wait(5000);

					if(wait.message === undefined)//no answer
					{
						if(this.queueWaitVar.size() > 0)
						{
							this.queueWaitVar.pop();
						}
					}

					nameVars = "";

					for(let item of vars)//create string of pointers
					{
						if(item.functionName === funcName)
						{
							if(!item.variableValue && !item.variableInfo && item.variableAddress !== 0)//check a value of variable
							{
								nameVars = this.addVariableToString(nameVars, item);
							}
						}
					}

					if(nameVars !== "")
					{
						this.shell.SendCommandToQueue(this.dbgCmd.examine(nameVars));//request values of pointers

						let wait = new Subject();
						this.queueWaitVar.push(wait);
						await wait.wait(5000);

						if(wait.message === undefined)//no answer
						{
							if(this.queueWaitVar.size() > 0)
							{
								this.queueWaitVar.pop();
							}
						}
					}

					for(let item of vars)
					{
						if(item.functionName === funcName)
						{
							let childs : DebugVariable[] = [];

							if(item.variableKind === ReflectKind.Array ||
								item.variableKind === ReflectKind.Struct ||
								item.variableKind === ReflectKind.Pointer)
							{
								childs = this.dbgParser.parseStructValues(item, new Parameters());
							}

							variables.push({
								name: item.variableName,
								addr: item.variableAddress,
								type: item.variableType,
								kind: item.variableKind,
								value: item.variableValue,
								info: item.variableInfo,
								len: 0,
								unreadable: "",
								fullyQualifiedName: "",
								children : childs
							});
						}
					}
				}
			}
		}

		return variables;
	}

	private addVariableToString(variables : string, item : VariableFileInfo) : string
	{
		if(variables !== "")
		{
			variables += ",";
		}

		if(item.variableType.includes("pointer to"))
		{
			if(item.variableAddress)
			{
				if(item.variableAddress !== 0)
				{
					variables += "*" + item.variableName;
				}
				else
				{
					variables += item.variableName;
				}
			}
			else
			{
				if(item.variableName === "this")
				{
					variables += "*" + item.variableName;
				}
				else
				{
					variables += item.variableName;
				}
			}
		}
		else if(item.variableType.includes("typedef string"))
		{
			if(item.variableAddress && item.variableAddress !== 0)
			{
				variables += "*" + item.variableName + StringsPrompt.cppString;
			}
			else
			{
				variables += item.variableName;
			}
		}
		else
		{
			variables += item.variableName;
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
			let allow : boolean = true;
			let command = data.toLowerCase();
			let parts = command.split(/\s+/);

			switch(parts[0])
			{
				case DebugCmdVMS.dbgRunExe:
				case DebugCmdVMS.dbgRerunExe:
				case DebugCmdVMS.dbgStop:
				case DebugCmdVMS.dbgExit:
				case DebugCmdVMS.dbgGo:
				case DebugCmdVMS.dbgStep:
				case DebugCmdVMS.dbgSelect:
				case DebugCmdVMS.dbgSetDisplay:
					//don't resolve from the debug console
					allow = false;
					break;

				case DebugCmdVMS.dbgSet:
					if(command.includes(DebugCmdVMS.dbgSetModeScreen) ||
						command.includes(DebugCmdVMS.dbgSetModeNoScreen))
					{
						allow = false;
					}
					else
					{
						this.shell.SendData(data);//send command to the debugger
					}
					break;

				default:
					this.shell.SendData(data);//send command to the debugger
					break;
			}

			if(!allow)
			{
				const message = localize('runtime.command_ignore', "This command is not allowed!");
				vscode.debug.activeDebugConsole.append(message + "\n");
			}
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

		let fullPath = path;
		path = path.replace(/\\/g, ftpPathSeparator);

		if(this.workSpacePath === "")
		{
			let fileManager = new FileManagerExt(this.rootFolderName);
			let localSource = await fileManager.getLocalSource();
			let rootPath = "" + localSource!.root;
			this.workSpacePath = rootPath.substring(0, rootPath.length - this.rootFolderName.length);
		}

		path = path.slice(this.workSpacePath.length);
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

		//set remote breakpoints
		await this.setRemoteBreakpointsPath(path);
		//verify breakpoints
		await this.verifyBreakpoints(path);

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

	private getFolderName(item: string) : string //get name of the folder project, item="folder/path/file.ext"
	{
		let indexStart = item.indexOf(ftpPathSeparator);
		let folderProject = item.substr(0, indexStart);

		return folderProject;
	}

	private getLocalPath(item: string) : string //item="folder/path/file.ext"
	{
		let indexStart = item.indexOf(ftpPathSeparator);
		let pathFile = item.substr(indexStart + 1);

		return pathFile;
	}

	private findPathFileByName(fileName : string, paths : string[]) : string
	{
		let pathFile : string = "";

		let name = this.getNameFromPath(fileName);
		let folder = this.getFolderName(fileName);

		for(let item of paths)
		{
			if(folder === this.getFolderName(item))
			{
				if (name === this.getNameFromPath(item))
				{
					pathFile = item;
					break;
				}
			}
		}

		return pathFile;
	}

	private async loadSourceLang(file: string) : Promise<string[]>
	{
		let folderProject = this.getFolderName(file);
		let fileManager = new FileManagerExt(folderProject);

		let pathFile = this.getLocalPath(file);

		return fileManager.loadContextFile(pathFile);
	}

	private async loadSourceLis(file: string) : Promise<string[]>
	{
		let folderProject = this.getFolderName(file);
		let fileManager = new FileManagerExt(folderProject);

		let pathFileLis = this.findPathFileByName(file, this.lisPaths);
		let pathFile = this.getLocalPath(pathFileLis);

		return fileManager.loadContextFile(pathFile);
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
					let numberLine = this.dbgParser.findBreakPointNumberLine(bp.line,  lisLines);

					if(!Number.isNaN(numberLine))
					{
						this.shell.SendCommandToQueue(this.dbgCmd.breakPointRemove(bp.file, numberLine));
					}
					else//clear breakpoint
					{
						this.clearBreakPoint(path, bp.line);

						bp.verified = false;
						this.sendEvent('breakpointValidated', bp);//breakpoint off
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
					let numberLine = this.dbgParser.findBreakPointNumberLine(bp.line,  lisLines);

					if(!Number.isNaN(numberLine))
					{
						this.shell.SendCommandToQueue(this.dbgCmd.breakPointSet(bp.file, numberLine));
					}
					else//clear breakpoint
					{
						this.clearBreakPoint(path, bp.line);

						bp.verified = false;
						this.sendEvent('breakpointValidated', bp);//breakpoint off
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


	public receiveData(mode: ModeWork, type: TypeDataMessage, data: string) : void
	{
		if(mode === ModeWork.shell)
		{
			this.debugRun = false;
		}
		else if(mode === ModeWork.debug)
		{
			this.debugRun = true;

			this.dbgParser.parseDebugData(this.shell.getCurrentCommand(), type, data, this.sourcePaths, this.lisPaths);

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
						this.dbgParser.parseVariableValuesMsg(this.currentFilePath, messageData);

						if(this.queueWaitVar.size() > 0)
						{
							let event = this.queueWaitVar.pop();
							event.message = "OK";
							event.notify();
						}
						break;

					case DebugCmdVMS.dbgCallStack:
						this.dbgParser.parseCallStackMsg(messageData, this.sourcePaths, this.lisPaths, this.stackStartFrame, this.stackEndFrame)
							.then((stack) =>
							{
								//get current file and routine
								if(stack.count > 0)
								{
									this.currentFilePath = stack.frames[0].file.slice(this.workSpacePath.length);
									this.currentRoutine = stack.frames[0].name.substr(0, stack.frames[0].name.indexOf("["));
								}

								this.sendEvent(DebugCmdVMS.dbgStack, stack);
							});
						break;

					case DebugCmdVMS.dbgSymbol:
						this.dbgParser.parseVariableMsg(this.sourcePaths, messageData);
						this.waitSymbols.notify();
						break;

					default:
						break;
				}
			}
			if(messageDebug !== "")
			{
				let showMsg : boolean = true;

				if (this.logFn)
				{
					this.logFn(LogType.information, () => messageDebug);
				}

				if(messageDebug.includes(MessageDebuger.msgEnd))
				{
					this.programEnd = true;
					this.sendEvent('end');
				}
				else if(messageDebug.includes(MessageDebuger.msgNoSccess))
				{
					showMsg = false;

					let indexStart = messageDebug.indexOf(":");
					let addressStr = messageDebug.substr(indexStart+1).replace(MessageDebuger.msgNoSccess, "");
					let address = parseInt(addressStr, 16);

					if(!Number.isNaN(address))
					{
						let vars = this.varsInfo.getVariableFile(this.currentFilePath);

						if(vars)
						{
							for(let item of vars)//check the unresolved address of variable
							{
								if(item.functionName === this.currentRoutine)
								{
									if(!item.variableValue && item.variableAddress && item.variableAddress !== 0)
									{
										if(item.variableAddress === address)
										{
											item.variableAddress = 0;
										}
									}
								}
							}
						}
					}

					if(this.queueWaitVar.size() > 0)
					{
						let event = this.queueWaitVar.pop();
						event.message = "ERROR";
						event.notify();
					}
				}
				else if(messageDebug.includes(MessageDebuger.msgNoFind) ||
						messageDebug.includes(MessageDebuger.msgUnAlloc) ||
						messageDebug.includes(MessageDebuger.msgNoSymbol) ||
						messageDebug.includes(MessageDebuger.msgNotAct))
				{
					if(this.queueWaitVar.size() > 0)
					{
						let event = this.queueWaitVar.pop();
						event.message = "ERROR";
						event.notify();
					}
				}

				if(showMsg)
				{
					vscode.debug.activeDebugConsole.append(messageDebug);
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