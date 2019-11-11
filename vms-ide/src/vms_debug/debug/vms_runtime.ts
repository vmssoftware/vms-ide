/*---------------------------------------------------------
 * Copyright (C) VMS Corporation. All rights reserved.
 *--------------------------------------------------------*/

import { ftpPathSeparator, LogFunction, LogType } from "../../common/main";
import { EventEmitter } from "events";
const { Subject } = require("await-notify");
import * as vscode from "vscode";
import * as nls from "vscode-nls";
import { DebugCmdVMS, DebugCommands } from "../command/debug_commands";
import { OsCommands } from "../command/os_commands";
import { ConfigManager } from "../ext-api/config_manager";
import { ModeWork, ShellSession, TypeDataMessage } from "../net/shell-session";
import { DebugParser, MessageDebuger, Parameters } from "../parsers/debug_parser";
import { DebugVariable, HolderDebugVariableInfo, ReflectKind, VariableFileInfo } from "../parsers/debug_variable_info";
import { Queue } from "../queue/queues";
import { HolderModuleInfo } from "../parsers/debug_module_info";

nls.config({ messageFormat: nls.MessageFormat.both });
const localize = nls.loadMessageBundle();


export interface VMSBreakpoint
{
	id: number;
	path: string;
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
	private stopOnEntry : boolean;
	private debugRun : boolean;
	private programEnd : boolean;
	private waitSymbols = new Subject();
	private waitScope = new Subject();
	private waitDeposit = new Subject();
	private waitShellMode = new Subject();
	private queueWaitVar = new Queue<any>();

	private stackStartFrame: number = 0;
	private stackEndFrame: number = 0;

	private modulesHolder: HolderModuleInfo;
	private sourcePaths: string[];
	private lisPaths: string[];
	private rootFolderName: string;
	private rootFolderNames = new Array<string>();

	private currentFilePath: string;
	private currentRoutine: string;
	private currentScope: string;

	// maps from sourceFile to array of VMS breakpoints
	private breakPoints = new Map<string, VMSBreakpoint[]>();
	private breakPointsSet = new Map<string, VMSBreakpoint[]>();
	private breakPointsRem = new Map<string, VMSBreakpoint[]>();
	// maps of VSM watchpoints
	private watchPoints = new Map<string, VMSWatchpoint[]>();
	private watchPointsSet = new Map<string, VMSWatchpoint[]>();

	// since we want to send breakpoint events, we will assign an id to every event
	// so that the frontend can match events with breakpoints.
	private breakpointId = 1;
	private abortKey = "C";//by default
	private language = "";	
	private variablePeriod = ".";//"::"
	private pointerPeriod = "->";//"->", "^."
	private pointerDereferencing = ".";//"*", "^."


	constructor(public folder: vscode.WorkspaceFolder | undefined, shell : ShellSession, public logFn?: LogFunction)
	{
		super();

		this.shell = shell;
		this.buttonPressd = DebugButtonEvent.btnNoEvent;
		this.rootFolderName = folder ? folder.name : "";
		this.osCmd = new OsCommands();
		this.dbgCmd = new DebugCommands();
		this.dbgParser = new DebugParser();
		this.varsInfo = new HolderDebugVariableInfo();
		this.modulesHolder = new HolderModuleInfo();
		this.stopOnEntry = false;
		this.debugRun = false;
		this.programEnd = false;
		this.currentFilePath = "";
		this.currentRoutine = "";
		this.currentScope = "";
		this.sourcePaths = [];
		this.lisPaths = [];
	}

	// Start executing the given program.
	public async start(programName : string, programArgs : string, stopOnEntry : boolean) : Promise<void>
	{
		this.stopOnEntry = stopOnEntry;
		this.programEnd = false;
		let configManager = new ConfigManager(this.rootFolderName);
		let section = await configManager.getProjectSection();
		const messageSync = localize('runtime.sync_api_not_find', "Sync API doesn't find");

		if (!section)
		{
			vscode.window.showErrorMessage(messageSync);

			if (this.logFn)
			{
				this.logFn(LogType.information, () => messageSync + "\n");
			}

			this.sendEvent('end');//close debugger
			return;
		}

		if(vscode.workspace.workspaceFolders)
		{
			let listFolders = await configManager.getDependencyList();

			if(listFolders)
			{
				for(let folder of listFolders)
				{
					let path = "";

					for(let item of vscode.workspace.workspaceFolders)
					{
						if(item.name === folder)
						{
							path = item.uri.fsPath;
							path = path.replace(/\\/g, ftpPathSeparator);
							this.rootFolderNames.push(path);
							break;
						}
					}

					if(path !== "")
					{
						let fileM = new ConfigManager(folder);
						let sectionCur = await fileM.getProjectSection();

						if (sectionCur)
						{
							let sourcePaths = await fileM.loadPathListFiles(sectionCur.source);
							let lisPaths = await fileM.loadPathListFiles(sectionCur.listing);

							this.addPrefixToArray(path, sourcePaths);
							this.addPrefixToArray(path, lisPaths);

							this.sourcePaths = this.sourcePaths.concat(sourcePaths);
							this.lisPaths = this.lisPaths.concat(lisPaths);
						}						
					}
				}
			}
			else
			{
				vscode.window.showErrorMessage(messageSync);

				if (this.logFn)
				{
					this.logFn(LogType.information, () => messageSync + "\n");
				}

				this.sendEvent('end');//close debugger
				return;
			}
		}
		else
		{
			const message = localize('runtime.workspace_not_find', "Workspace Folders don't find");
			vscode.window.showErrorMessage(message);

			if (this.logFn)
			{
				this.logFn(LogType.information, () => message + "\n");
			}

			this.sendEvent('end');//close debugger
			return;
		}

		this.checkLisFiles(this.sourcePaths, this.lisPaths);
		this.modulesHolder = await this.getModuleInfo(this.sourcePaths, this.lisPaths);
		this.shell.resetParameters();
		this.abortKey = section.break;

		if(this.shell.getModeWork() !== ModeWork.shell)
		{
			await this.waitShellMode.wait(1000);//wait ending the debugger
		}

		//run debugger
		if(this.shell.getModeWork() === ModeWork.shell)
		{
			const preRunFile = section.projectName + ".com";
			let localSource = await configManager.getLocalSource();
			const found = await localSource!.findFiles(preRunFile);
			// run appropriate COM file, if it exists
			if (found && found.length === 1)
			{
				const dotted_root = section.root.replace(/\//g, ".");
				const pathToPreRunFile = `[.${dotted_root}]${preRunFile} DEBUG`;
				this.shell.SendCommandToQueue(this.osCmd.runCOM(pathToPreRunFile));
			}
			//set vms terminal
			this.shell.SendCommandToQueue(this.osCmd.setTerminalType("vt102"));
			this.shell.SendCommandToQueue(this.osCmd.setTerminalWidth("160"));
			//config debugger
			this.shell.SendCommandToQueue(this.osCmd.runDebug());
			this.shell.SendCommandToQueue(this.dbgCmd.setDisplay("dbge", "q1", "output"));
			this.shell.SendCommandToQueue(this.dbgCmd.redirectDataToDisplay("error", "dbge"));
			this.shell.SendCommandToQueue(this.dbgCmd.modeScreen());
			this.shell.SendCommandToQueue(this.dbgCmd.removeDisplay("src"));
			this.shell.SendCommandToQueue(this.dbgCmd.setAbortKey(this.abortKey));
			this.shell.SendCommandToQueue(this.dbgCmd.run(programName, programArgs));
			this.shell.SendCommandToQueue(this.dbgCmd.setScopeBase());
		}
		else//reload program
		{
			// this.shell.SendCommandToQueue(this.dbgCmd.clearDisplay("dbge, out"));
			// this.shell.SendCommandToQueue(this.dbgCmd.modeScreen());
			// this.shell.SendCommandToQueue(this.dbgCmd.rerun());
			this.sendEvent('restart');//go to restart debugger
			return;
		}
		//clear entry breakpoint
		if(!stopOnEntry)
		{
			this.shell.SendCommandToQueue(this.dbgCmd.breakPointsRemove());//remove entry breakpoint
		}
		//set breakpoint
		await this.setRemoteBreakpointsAll();

		vscode.debug.activeDebugConsole.append("\n\x1B[2J\x1B[H");//clean old data from DEBUG CONSOLE
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
			let folder = this.getFolderName(itemSource);

			for(let itemLis of lis)
			{
				if(folder === this.getFolderName(itemLis))
				{
					if(name === this.getNameFromPath(itemLis))
					{
						found = true;
						break;
					}
				}
			}

			if(!found)
			{
				const message = localize('runtime.lis_not_find', ".LIS file doesn't find for the source file");
				vscode.window.showWarningMessage(message + " " + itemSource);

				if (this.logFn)
				{
					this.logFn(LogType.information, () => message + " " + itemSource + "\n");
				}
			}
		}
	}

// Module/Image     File           Ident              Attributes          Bytes  Creation Date      Creator
// ------------     ----           -----           ----------------       -----  -------------      -------
// ADD                             V1.0                Lkg     Dnrm        224   2-APR-2019 00:41  VSI C V7.4-001
//                  WORK:[KULIKOVSKIY.project.OUT.DEBUG.OBJ]ADD.OBJ;2
// REM_TEST_LONG_NAME_CALL         V1.0                Lkg     Dnrm        120  20-MAR-2019 07:41  VSI C V7.4-001
//                  WORK:[KULIKOVSKIY.project.OUT.DEBUG.OBJ.INTO]REM_TEST_LONG_NAME_CALL.OBJ;1
// DECC$SHR                        V8.4-00             Lkg                   0  15-FEB-2016 11:06  Linker I02-37
//                  SYS$COMMON:[SYSLIB]DECC$SHR.EXE;1
	private async getModuleInfo(sourcePaths: string[], lisPaths: string[]) : Promise<HolderModuleInfo>
	{
		const matcher = /^(\S+)\s*Source.*\d+:\d+:\d+\s+(.*)/;				//MODULE_NAME  Source Listing  25-APR-2019 02:09:09  VSI LANGUAGE V3.1-0007
		const matcherHead = /^Module\/Image\s*File\s*Ident/;				//Module/Image     File    Ident
		const matcherModule = /^(\S+)\s*.*\s(\d*-\S+-\d+\s*\d+:\d+)\s+(.*)/;//BASIC_MENU    Fast   8235  19-JUN-2019 05:35   I64 BASIC V1.8-004
		const matcherFile = /^\s*\S+:\[\S+\](\S+)\.O\S+;/i;					// WORK:[KULIKOVSKIY.project.OUT.DEBUG.OBJ]ADD.OBJ;2

		let moduleNames : string[] = [];
		let info : HolderModuleInfo = new HolderModuleInfo();

		for(let path of lisPaths)
		{
			if (this.checkExtension(path, "MAP"))
			{
				let block = false;
				let sourceLines = await this.dbgParser.loadFileContext(path);
				
				for(let i = 0; i < sourceLines.length; i++)
				{
					if(block)
					{
						if(sourceLines[i] !== "")
						{
							let matchesM = sourceLines[i].match(matcherModule);
							let matchesN = sourceLines[i+1].match(matcherFile);

							if(matchesN && matchesM && matchesM.length === 4 && matchesN.length === 2)
							{
								moduleNames.push(matchesM[1]);
								i++;
							}
						}
						else
						{
							break;
						}						
					}
					else
					{
						let matches = sourceLines[i].match(matcherHead);

						if(matches)//find heaader line
						{
							block = true;
						}
					}
				}
			}
		}

		for(let path of sourcePaths)
		{
			let listingPath = this.findPathFileByName(path, lisPaths, "LIS");
			let sourceLines = await this.dbgParser.loadFileContext(listingPath);

			for(let line of sourceLines)
			{
				let matches = line.match(matcher);

				if(matches && matches.length === 3)
				{
					let find = false;
					let sourcePath = path;
					let moduleName = matches[1];
					let languageInfo = matches[2].toUpperCase();

					if(languageInfo.includes("COBOL"))
					{
						while(moduleName.includes("-"))
						{
							moduleName = moduleName.replace("-", "_");
						}
					}

					if(moduleName.includes("$BLK"))
					{
						moduleName = moduleName.replace("$BLK", "");
					}

					if(languageInfo.includes("BASIC"))
					{
						if(moduleNames.length === 0)
						{
							const message = localize('runtime.map_not_find', ".MAP file or module name could not be found");
							vscode.window.showWarningMessage(message);

							if (this.logFn)
							{
								this.logFn(LogType.information, () => message + "\n");
							}
						}
						else
						{
							for(let item of moduleNames)
							{
								if(moduleName === item)
								{
									find = true;
									break;
								}
							}

							if(!find)
							{
								moduleName = this.getNameFromPath(path);
							}
						}
					}

					info.setItem(moduleName, sourcePath, listingPath, languageInfo);
					break;
				}
			}
		}
		
		return info;
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
		if(this.buttonPressd !== DebugButtonEvent.btnPause &&
			this.language !== "")
		{
			this.buttonPressd = DebugButtonEvent.btnPause;
			let symbol = this.dbgCmd.getCtrlPlusSymbol(this.abortKey);
			this.shell.SendData(this.dbgCmd.customCommand(symbol).getCommand());//interrupt program execution
			this.shell.SendData(this.dbgCmd.stop().getCommand());
		}
	}

	public exit(restart? : boolean)
	{
		this.buttonPressd = DebugButtonEvent.btnStop;
		//if the programm is running
		if(this.programEnd === false && this.shell.getCurrentCommand().getBody() !== "")
		{
			let symbol = this.dbgCmd.getCtrlPlusSymbol(this.abortKey);
			this.shell.SendData(this.dbgCmd.customCommand(symbol).getCommand());//interrupt program execution
			this.shell.SendCommand(this.dbgCmd.stop());
		}

		this.shell.resetParameters();

		if(!restart)
		{
			this.shell.SetDisconnectInShellSession();
		}

		this.shell.SendCommandToQueue(this.dbgCmd.exit());
	}

	public stack(startFrame: number, endFrame: number)
	{
		this.stackStartFrame = startFrame;
		this.stackEndFrame = endFrame;

		this.resetNotifys();
		this.shell.SendCommandToQueue(this.dbgCmd.callStack());
	}

	public async setVariableValue(nameVar : string, valueVar : string): Promise<boolean>
	{
		let result : boolean = false;

		if(nameVar.length > 0)
		{
			if(valueVar.length === 1 && (valueVar.includes("-") || valueVar.includes("+")))
			{
				result = false;
			}
			else
			{
				nameVar = this.convertVariable(nameVar);
				this.shell.SendCommandToQueue(this.dbgCmd.deposit(nameVar, valueVar));

				this.waitDeposit.message = "";
				await this.waitDeposit.wait(5000);
			}
			
			if(this.waitDeposit.message === "OK")
			{
				result = true;
			}
			else
			{
				result = false;
			}
		}

		return result;
	}

	private convertVariable(nameVar : string) : string
	{
		if(this.language === "COBOL")
		{
			const matcherArray = /^(\S+)([\(\[]\d+[\)\]])/;	
			let items = nameVar.split(this.variablePeriod);
			let ofVariable : string = "";

			if(items.length > 1)
			{
				for(let item of items)
				{
					let matchesA = item.match(matcherArray);

					if(ofVariable === "")
					{
						ofVariable = item;
					}

					if(matchesA && matchesA.length === 3)
					{
						ofVariable += matchesA[2];
					}
				}

				let matchesA = items[items.length - 1].match(matcherArray);

				if(matchesA && matchesA.length === 3)
				{
					nameVar = matchesA[matchesA.length - 2] + " OF " + ofVariable;
				}
				else
				{
					nameVar = items[items.length - 1] + " OF " + ofVariable;
				}
			}
		}

		return nameVar;
	}

	public setWatchVariable(nameVar : string, params : string)
	{
		if(nameVar.length > 0)
		{
			let wpFound = false;
			let wpChanged = false;
			let wpIndex = -1;
			let currWps = this.watchPoints.get("keyWatchPoints");
			let setWps = this.watchPointsSet.get("keyWatchPointsSet");

			params = params.toLowerCase();

			if(params.includes("()"))
			{
				if(!setWps)
				{
					setWps = new Array<VMSWatchpoint>();
				}

				const wp = <VMSWatchpoint> { name: nameVar, params: params };

				for(let wps of setWps)//finding watchpoint
				{
					if(wps.name === nameVar)
					{
						wpFound = true;
						break;
					}
				}

				if(!wpFound)
				{
					setWps.push(wp);
					this.watchPointsSet.delete("keyWatchPointsSet");
					this.watchPointsSet.set("keyWatchPointsSet", setWps);
				}				
			}

			wpFound = false;

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

	private checkWatchPoints() : void
	{
		let verWps : VMSWatchpoint[] = [];
		let currWps = this.watchPoints.get("keyWatchPoints");
		let setWps = this.watchPointsSet.get("keyWatchPointsSet");

		if(!setWps)
		{
			if (currWps)
			{
				for(let wp of currWps)
				{
					this.shell.SendCommandToQueue(this.dbgCmd.watchPointRemove(wp.name));
				}

				this.watchPoints.delete("keyWatchPoints");
			}
		}
		else if (currWps)
		{
			let wpFind : boolean;

			for(let wpc of currWps)
			{
				wpFind = false;

				for(let wps of setWps)
				{
					if(wpc.name === wps.name)
					{
						verWps.push(wpc);
						wpFind = true;
						break;
					}
				}
				
				if(!wpFind)
				{
					this.shell.SendCommandToQueue(this.dbgCmd.watchPointRemove(wpc.name));
				}				
			}
		}

		this.watchPoints.delete("keyWatchPoints");
		this.watchPoints.set("keyWatchPoints", verWps);
		this.watchPointsSet.delete("keyWatchPointsSet");
	}

	public async getVariable(nameVar : string) : Promise<Array<DebugVariable>>
	{
		const variables = new Array<DebugVariable>();

		if(nameVar.length > 0)
		{
			if(nameVar.charAt(0) === "&" ||
				nameVar.charAt(0) === "*" ||
				nameVar.charAt(0) === ".")
			{
				nameVar = nameVar.substr(1);
			}

			this.varsInfo = this.dbgParser.getVariableFileInfo();
			let vars = this.varsInfo.getVariableFile(this.currentFilePath);

			if(vars)
			{
				let wrapFunctionName = "";

				for(let item of vars)
				{
					if(item.functionName === this.currentRoutine)
					{
						if(item.wrapName)
						{
							wrapFunctionName = item.wrapName;
							break;
						}
					}
				}

				for(let item of vars)
				{
					if(item.variableName.toLowerCase() === nameVar.toLowerCase())
					{
						if(item.functionName === this.currentRoutine ||
							item.functionName === "" ||
							item.functionName === wrapFunctionName)
						{
							let request = true;

							if(this.checkVariableInScope(item))
							{
								if(item.variableType.includes("pointer to") ||
									item.variableType.includes("pointer type"))
								{
									if(this.language === "COBOL")
									{
										request = false;
									}

									nameVar = this.pointerDereferencing + nameVar;
								}
								else if(item.variableType.includes("basic_string"))
								{
									if(item.variableAddress)
									{
										if(item.variablePrefix)
										{
											nameVar = this.pointerDereferencing + nameVar + item.variablePrefix;
										}
										else
										{
											nameVar = this.pointerDereferencing + nameVar;
										}
									}
								}

								if(this.checkVariableToRequest(item) && request)
								{
									await this.requestVariables(nameVar);
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
									nameFull: item.variableNameFull,
									addr: item.variableAddress,
									type: item.variableType,
									kind: item.variableKind,
									value: item.variableValue,
									info: item.variableInfo,
									prefix: item.variablePrefix,
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
		}

		return variables;
	}

	public async getVariables(id : string) : Promise<Array<DebugVariable>>
	{
		const variables = new Array<DebugVariable>();

		//check watch points
		this.checkWatchPoints();

		if (id !== null)
		{
			let funcName : string = "";//if function name = "" search global variable
			this.varsInfo = this.dbgParser.getVariableFileInfo();
			let vars = this.varsInfo.getVariableFile(this.currentFilePath);

			if(!vars)//request variables info
			{
				let moduleName = this.modulesHolder.getItemByPath(this.currentFilePath).moduleName;
				this.shell.SendCommandToQueue(this.dbgCmd.showSymbols(moduleName));
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

			if(vars && this.buttonPressd === 0)
			{
				let nameVars : string = "";
				let namePtrs : string = "";

				this.shell.SendCommandToQueue(this.dbgCmd.showScope());
				await this.waitScope.wait(5000);

				for(let item of vars)//create string of variables
				{
					if(item.functionName === funcName &&
						this.checkVariableToRequest(item))
					{
						if(this.language !== "FORTRAN")
						{
							item.variableAddress = 0;
						}

						if(item.variableType.includes("pointer to") ||
							item.variableType.includes("pointer type") ||
							item.variableType.includes("basic_string"))				
						{
							namePtrs = this.addVariableToString(namePtrs, item, false);
						}
						else
						{
							nameVars = this.addVariableToString(nameVars, item, false);
						}
					}
				}

				if(nameVars !== "" || namePtrs !== "")
				{
					if(nameVars !== "")
					{
						await this.requestVariables(nameVars);//request values of variables
					}

					if(namePtrs !== "")
					{
						await this.requestVariables(namePtrs);//request address of pointers

						namePtrs = "";

						for(let item of vars)//create string of pointers
						{
							if(item.functionName === funcName &&
								this.checkVariableToRequest(item))
							{
								if(item.variableAddress)//check adress of pointer
								{
									namePtrs = this.addVariableToString(namePtrs, item, true);
								}
							}
						}

						if(namePtrs !== "" && this.language !== "COBOL")//don't support for Cobol
						{
							await this.requestVariables(namePtrs);//request values of pointers
						}
					}

					for(let item of vars)
					{
						if(item.functionName === funcName &&
							this.checkVariableInScope(item) &&
							this.checkVariableToRequest(item))
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
								nameFull: item.variableNameFull,
								addr: item.variableAddress,
								type: item.variableType,
								kind: item.variableKind,
								value: item.variableValue,
								info: item.variableInfo,
								prefix: item.variablePrefix,
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

	private async requestVariables(nameVars : string) : Promise<void>
	{
		if(this.buttonPressd === 0)
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
		}
	}

	private resetNotifys() : void
	{
		this.waitScope.notify();

		while(this.queueWaitVar.size() > 0)
		{
			let event = this.queueWaitVar.pop();
			event.message = "ERROR";
			event.notify();
		}
	}

	private addVariableToString(variables : string, item : VariableFileInfo, pointer : boolean) : string
	{
		if(this.checkVariableInScope(item))
		{
			let nameVar = "";

			if(variables !== "")
			{
				variables += ",";
			}

			nameVar = item.variableName;

			if(pointer === true)
			{
				if(item.variableType.includes("pointer to") ||
					item.variableType.includes("pointer type"))
				{
					if(item.variableAddress)
					{
						variables += this.pointerDereferencing + nameVar;
					}
					else
					{
						if(item.variableName === "this")
						{
							variables += this.pointerDereferencing + nameVar;
						}
						else
						{
							variables += nameVar;
						}
					}
				}
				else if(item.variableType.includes("basic_string"))
				{
					if(item.variableAddress)
					{
						if(item.variablePrefix)
						{
							variables += this.pointerDereferencing + nameVar + item.variablePrefix;
						}
						else
						{
							variables += this.pointerDereferencing + nameVar;
						}
					}
					else
					{
						variables += nameVar;
					}
				}
				else
				{
					variables += nameVar;
				}
			}
			else
			{
				variables += nameVar;
			}
		}

		return variables;
	}

	private checkVariableInScope(variable : VariableFileInfo) : boolean
	{
		let check = true;

		if(variable.variableNameFull.includes("%LINE "))//module\routine\%LINE NUM\variable: data
		{
			let scopeVariable = this.dbgParser.findNumberLineScope(variable.variableNameFull);

			if(scopeVariable === this.currentScope)
			{
				check = true;
			}
			else
			{
				check = false;
			}
		}

		return check;
	}

	private checkVariableToRequest(varInfo : VariableFileInfo) : boolean
	{
		let result = true;

		if(varInfo.variableType.includes("constant:") ||
			varInfo.variableType.includes("address: (no value") ||
			varInfo.variableType.includes("bliss field type"))
		{
			result = false;
		}

		return result;
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
			let command = data.toLowerCase().trim();
			let parts = command.split(/\s+/);
			let cmd = parts[0].split(/\//);

			switch(cmd[0])
			{
				case DebugCmdVMS.dbgRunExe:
				case DebugCmdVMS.dbgRerunExe:
				case DebugCmdVMS.dbgStop:
				case DebugCmdVMS.dbgExit:
				case DebugCmdVMS.dbgQuit:
				case DebugCmdVMS.dbgGo:
				case DebugCmdVMS.dbgStep:
				case DebugCmdVMS.dbgSelect:
				case DebugCmdVMS.dbgSetDisplay:
				case DebugCmdVMS.dbgHelp:
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

		path = path.charAt(0).toLowerCase() + path.replace(/\\/g, ftpPathSeparator).substring(1);
		let key = path.toLowerCase();
		let currBps = this.breakPoints.get(key);

		for(let line of lines)
		{
			const bp = <VMSBreakpoint> { path, verified: false, line, id: this.breakpointId++ };
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
						this.sendEvent('breakpointAdd', bpO, path);
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
		const bp = <VMSBreakpoint> { path, verified: false, line, id: this.breakpointId++ };
		let key = path.toLowerCase();
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
		let key = path.toLowerCase();
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

	private checkExtension(file: string, extension: string) : boolean
	{
		let result : boolean = false;

		let extPos = file.lastIndexOf(".");

		if(extPos !== -1)
		{
			extPos += 1;
			let ext = file.substring(extPos).toUpperCase();

			if(ext === extension.toUpperCase())
			{
				result = true;
			}
		}

		return result;
	}

	private getFolderName(fullPath: string) : string //get name of the folder project, item="folder/path/file.ext"
	{
		let folderProject = "";

		for(let item of this.rootFolderNames)
		{
			if(fullPath.includes(item))
			{
				folderProject = item;
			}
		}

		return folderProject;
	}

	private findPathFileByName(fileName : string, paths : string[], extension: string) : string
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
					if (this.checkExtension(item, extension))
					{						
						pathFile = item;
						break;
					}
				}
			}
		}

		return pathFile;
	}

	private async loadSourceLang(file: string) : Promise<string[]>
	{
		return this.dbgParser.loadFileContext(file);
	}

	private async loadSourceLis(file: string) : Promise<string[]>
	{
		let pathFileLis = this.findPathFileByName(file, this.lisPaths, "LIS");

		return this.dbgParser.loadFileContext(pathFileLis);
	}

	private async verifyBreakpoints(path: string) : Promise<void>
	{
		let key = path.toLowerCase();
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
		let key = path.toLowerCase();
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
						let moduleName = this.modulesHolder.getItemByPath(path).moduleName;
						this.shell.SendCommandToQueue(this.dbgCmd.breakPointRemove(moduleName, numberLine));
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
						let moduleName = this.modulesHolder.getItemByPath(path).moduleName;
						this.shell.SendCommandToQueue(this.dbgCmd.breakPointSet(moduleName, numberLine));
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

			this.dbgParser.parseDebugData(this.shell, type, data);

			let messageCommand = this.dbgParser.getCommandMessage();
			let messageDebug = this.dbgParser.getDebugMessage();
			let messageUser = this.dbgParser.getUserMessage();
			let messageData = this.dbgParser.getDataMessage();
			let messageDebugInfo = this.dbgParser.getDebugInfoMessage();


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
						this.dbgParser.parseVariableValuesMsg(this.currentFilePath, messageData, this.pointerDereferencing);

						if(this.queueWaitVar.size() > 0)
						{
							let event = this.queueWaitVar.pop();
							event.message = "OK";
							event.notify();
						}
						break;

					case DebugCmdVMS.dbgCallStack:
						let stack = this.dbgParser.parseCallStackMsg(messageData, this.modulesHolder, this.stackStartFrame, this.stackEndFrame);
						//get current file and routine
						if(stack.count > 0)
						{
							this.currentFilePath = stack.frames[0].file;
							this.currentRoutine = stack.frames[0].name.substr(0, stack.frames[0].name.indexOf("["));
							
							let moduleItem = this.modulesHolder.getItemByPath(this.currentFilePath);
							this.language = this.getLanguageFromInfo(moduleItem.language);
							this.setDelimiters(this.language);
						}
						this.sendEvent(DebugCmdVMS.dbgStack, stack);
						break;

					case DebugCmdVMS.dbgSymbol:
						this.dbgParser.parseVariableMsg(this.modulesHolder, messageData);
						this.waitSymbols.notify();
						break;

					case DebugCmdVMS.dbgShowScope:
						this.currentScope = this.dbgParser.parseScopeMsg(messageData);
						this.waitScope.notify();
						break;

					default:
						break;
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
					this.shell.cleanQueueCommands();
					this.sendEvent('end');//close debugger
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
					this.shell.cleanQueueCommands();
					this.sendEvent('end');//close debugger
				}
				else if(messageDebug.includes(MessageDebuger.msgNoSccess))
				{
					let indexStart = messageDebug.indexOf(":");
					let addressStr = messageDebug.substr(indexStart+1).replace(MessageDebuger.msgNoSccess, "");
					let address = parseInt(addressStr, 16) >> 0;

					if(!Number.isNaN(address))
					{
						let vars = this.varsInfo.getVariableFile(this.currentFilePath);

						if(vars)
						{
							for(let item of vars)//check the unresolved address of variable
							{
								if(item.functionName === this.currentRoutine)
								{
									if(!item.variableValue && item.variableAddress)
									{
										if(item.variableAddress === address)
										{
											showMsg = false;
											item.variableAddress = 0;
											break;
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
						messageDebug.includes(MessageDebuger.msgNotAct) ||
						messageDebug.includes(MessageDebuger.msgNullPtr)||
						messageDebug.includes(MessageDebuger.msgMisplaced))
				{
					if(this.queueWaitVar.size() > 0)
					{
						let event = this.queueWaitVar.pop();
						event.message = "ERROR";
						event.notify();
					}
				}
				else if(messageDebug.includes(MessageDebuger.msgNoProcess))
				{
					this.shell.cleanQueueCommands();
					this.sendEvent('end');//close debugger //Error loading image
				}
				else if(messageDebug.includes(MessageDebuger.msgInitial))
				{
					const matcherLang = /^.*Language: (\S+),/;
					let matches = messageDebug.match(matcherLang);

					if(matches && matches.length === 2)
					{
						this.language = matches[1];
						this.setDelimiters(this.language);
					}

					if(this.stopOnEntry)
					{
						if(messageDebug.includes(MessageDebuger.msgGoMain))
						{
							this.continue();
						}
						else
						{
							this.stepOver();
						}
					}
					else
					{
						this.continue();
					}
				}

				if(showMsg)
				{
					vscode.debug.activeDebugConsole.append(messageDebug);
				}
			}
			if(messageDebugInfo !== "")
			{
				if (this.logFn)
				{
					this.logFn(LogType.information, () => messageDebugInfo);
				}
			}

			if(type === TypeDataMessage.typeData)
			{
				if(this.shell.getCurrentCommand().getBody() === DebugCmdVMS.dbgDeposit)
				{
					if(messageDebug !== "")
					{
						if(messageDebug.includes(MessageDebuger.msgNoAccessr) ||
							messageDebug.includes(MessageDebuger.msgOpNotAllow) ||
							messageDebug.includes(MessageDebuger.msgInvNumStr) ||
							messageDebug.includes(MessageDebuger.msgInvNumber) ||
							messageDebug.includes(MessageDebuger.msgNoSymbol) ||
							messageDebug.includes(MessageDebuger.msgMisInvOper) ||
							messageDebug.includes(MessageDebuger.msgIllPathIdent) ||
							messageDebug.includes(MessageDebuger.msgMisOpeMis) ||
							messageDebug.includes(MessageDebuger.msgSynErrExpr) ||
							messageDebug.includes(MessageDebuger.msgDivByZero) ||
							messageDebug.includes(MessageDebuger.msgNullPtr) ||
							messageDebug.includes(MessageDebuger.msgAnaCvt) ||
							messageDebug.includes(MessageDebuger.msgIllType) ||
							messageDebug.includes(MessageDebuger.msgMatQuoMis) ||
							messageDebug.includes(MessageDebuger.msgNoValue) ||
							messageDebug.includes(MessageDebuger.msgAmpersand) ||
							messageDebug.includes(MessageDebuger.msgIvalOutBnds))
						{
							this.waitDeposit.message = "ERROR";
							this.waitDeposit.notify();
						}
						else
						{
							this.waitDeposit.message = "OK";
							this.waitDeposit.notify();
						}
					}
					else
					{
						this.waitDeposit.message = "OK";
						this.waitDeposit.notify();
					}
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

	public getLanguage() : string
	{
		return this.language;
	}

	public getLanguageFromInfo(info: string) : string
	{
		let language = "";
		info = info.toUpperCase();
		
		if(info.includes("BASIC"))
		{
			language = "BASIC";
		}
		else if(info.includes("BLISS"))
		{
			language = "BLISS";
		}
		else if(info.includes("COBOL"))
		{
			language = "COBOL";
		}
		else if(info.includes("FORTRAN"))
		{
			language = "FORTRAN";
		}
		else if(info.includes("PASCAL"))
		{
			language = "PASCAL";
		}
		else
		{
			language = "C";
		}

		return language;
	}

	public getVariablePeriod() : string
	{
		return this.variablePeriod;
	}

	public getPointerPeriod() : string
	{
		return this.pointerPeriod;
	}

	public getPointerDereferencing() : string
	{
		return this.pointerDereferencing;
	}

	private setDelimiters(language : string)
	{
		switch(language)
		{
			case "C":
			case "C++":
			case "BLISS":
				this.variablePeriod = ".";
				this.pointerPeriod = "->";
				this.pointerDereferencing = ".";
				break;
			case "BASIC":
				this.variablePeriod = "::";
				this.pointerPeriod = "->";
				this.pointerDereferencing = ".";
				break;
			case "FORTRAN":
				this.variablePeriod = ".";
				this.pointerPeriod = ".";
				this.pointerDereferencing = "";
				break;
			case "PASCAL":
				this.variablePeriod = ".";
				this.pointerPeriod = "^.";
				this.pointerDereferencing = ".";
				break;
			case "COBOL":
				this.variablePeriod = ".";
				this.pointerPeriod = ".";
				this.pointerDereferencing = ".";
				break;
		}
	}
}