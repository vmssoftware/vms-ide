import { ftpPathSeparator } from "../../common/main";
import { readFileSync } from "fs";
import { CommandMessage, DebugCmdVMS } from "../command/debug_commands";
import { ShellSession, TypeDataMessage } from "../net/shell-session";
import { Queue } from "../queue/queues";
import { HolderDebugFileInfo } from "./debug_file_info";
import { DebugVariable, HolderDebugVariableInfo, ReflectKind, VariableFileInfo } from "./debug_variable_info";
import { HolderModuleInfo } from "./debug_module_info";


export enum MessageDebuger
{
	msgStepped = "stepped to",
	msgSteppedOn = "stepped on",
	msgBreak = "break at",
	msgBreakOn = "break on",
	msgInitial = "%DEBUG-I-INITIAL, Language:",
	msgGoMain = "%DEBUG-I-NOTATMAIN, Type GO to reach MAIN program",
	msgNoImage = "%DCL-W-ACTIMAGE, error activating image",
	msgNoSccess = "%DEBUG-E-NOACCESSR, no read access to address",
	msgNullPtr = "%DEBUG-W-NULLPTR, cannot dereference null pointer",
	msgNoFind = "%DEBUG-E-NOTRAZERO, Unable to find",
	msgUnAlloc = "%DEBUG-W-UNALLOCATED",
	msgNotAct = "%DEBUG-W-SYMNOTACT",
	msgNoSymbol = "%DEBUG-E-NOSYMBOL, symbol",
	msgMisplaced = "%DEBUG-E-MISOPEMIS, misplaced operator",
	msgNoProcess = "%DEBUG-E-NOPROCESSES, the current command is targetted at an empty process set",
	msgEnd = "%DEBUG-I-EXITSTATUS, is",
}

export enum MessagePrompt
{
	prmtCMD = "CMD: ",
	prmtDBG = "DBG: ",
	prmtUSER = "USER: ",
	prmtINFO = "INFO: ",
	prmtDATA = "DATA: ",
}


export class DebugParser
{
	private queueMsgDebug = new Queue<string>();
	private queueMsgUser = new Queue<string>();
	private queueMsgCommand = new Queue<string>();
	private queueMsgData = new Queue<string>();
	private queueMsgDebugInfo = new Queue<string>();
	private fileInfo : HolderDebugFileInfo;
	private varsInfo : HolderDebugVariableInfo;
	private commandDone : boolean;
	private commandButtonDone : boolean;
	private typeBracketsSquare : boolean = false;
	private topicNumberString : Array<number> = new Array<number>();
	private displayDataString : string[] = ["", "", ""];
	private framesOld = new Array<any>();

	constructor()
	{
		this.fileInfo = new HolderDebugFileInfo();
		this.varsInfo = new HolderDebugVariableInfo();
		this.commandDone = false;
		this.commandButtonDone = false;
	}


	public parseDebugData(shell : ShellSession, type: TypeDataMessage, data : string)
	{
		if(data !== "")
		{
			let cmd = this.splitData(shell.getCurrentCommand(), shell.getPreviousCommand(), type, data);

			let msgLines = this.displayDataString[1].split("\n");//debugger data

			switch(cmd)
			{
				case DebugCmdVMS.dbgRunExe:
				case DebugCmdVMS.dbgRerunExe:
				case DebugCmdVMS.dbgStop:
				case DebugCmdVMS.dbgExit:
					this.commandDone = true;
					this.commandButtonDone = true;
					break;

				case DebugCmdVMS.dbgGo:
				case DebugCmdVMS.dbgStepOver:
				case DebugCmdVMS.dbgStepIn:
				case DebugCmdVMS.dbgStepReturn:
					if(shell.getStatusCommand())
					{
						this.commandDone = true;
						this.commandButtonDone = true;
					}

					for(let item of msgLines)
					{
						if(item !== "")
						{
							if(!item.includes(cmd))
							{
								this.parseLineMsg(item);
							}
						}
					}
					break;

				case DebugCmdVMS.dbgBreakPointSet:
				case DebugCmdVMS.dbgBreakPointRemove:
				case DebugCmdVMS.dbgBreakPointShow:
				case DebugCmdVMS.dbgBreakPointActivate:
				case DebugCmdVMS.dbgBreakPointDeactivate:
					this.commandDone = true;
					break;

				case DebugCmdVMS.dbgTypeLine:
				case DebugCmdVMS.dbgExamine:
				case DebugCmdVMS.dbgEvaluate:
				case DebugCmdVMS.dbgDeposit:
				case DebugCmdVMS.dbgCallStack:
				case DebugCmdVMS.dbgStack:
				case DebugCmdVMS.dbgSymbol:
				case DebugCmdVMS.dbgShowScope:
				case DebugCmdVMS.dbgDump:
					for(let item of msgLines)
					{
						if(item !== "")
						{
							if(!item.includes(cmd))
							{
								this.queueMsgData.push(item);
								this.commandDone = true;
								this.queueMsgDebugInfo.push(MessagePrompt.prmtDATA + item);
							}
						}
					}
					break;

				case "":
					this.queueMsgUser.push(/*MessagePrompt.prmtUSER +*/ this.displayDataString[1]);
					break;

				default:
					break;
			}
		}
	}


	private splitData(command : CommandMessage, commandPrev : CommandMessage, type: TypeDataMessage, data : string)
	{
		let cmdBody = command.getBody();

		if(data.length > 0)
		{
			//clean the old data
			this.displayDataString[0] = "";//debugger message
			this.displayDataString[1] = "";//debugger data
			this.displayDataString[2] = "";//user data

			if(type === TypeDataMessage.typeCmd)//command
			{
				let position = data.indexOf(command.getCommand());

				if(position > 0)
				{
					cmdBody = commandPrev.getBody();
				}

				let userData = data.replace(command.getCommand(), "").trim();
				this.queueMsgCommand.push(MessagePrompt.prmtCMD + command.getCommand());

				if(userData !== "")//data
				{
					this.parseEscSequence(userData);
				}
			}
			else//data
			{
				this.parseEscSequence(data);
			}
		}

		return cmdBody;
	}

	private parseEscSequence(data : string)
	{
		let topicMsg = false;
		let positionOld : number = 0;
		let escapes = data.split("\x1B");//[ESC]
		let dataPrompt = escapes.shift();

		if(dataPrompt)//prompt data (coommand and user data)
		{
			dataPrompt = dataPrompt.trim();

			if(dataPrompt !== "")
			{
				this.queueMsgUser.push(/*MessagePrompt.prmtUSER +*/ dataPrompt);
			}
		}

		for (let item of escapes)//windows data (debug, error)
		{
			item = item.trim();

			if(item !== "")
			{
				if(item.charAt(0) === "[")
				{
					let position : number[] = [0, 0];
					let index : number = 0;

					for(let i = 1; i < item.length; i++)
					{
						if(item.charAt(i) === "H")
						{
							let positionLine = item.substr(1, i-1).split(";");

							if(positionLine.length === 2)
							{
								if(positionLine[0] !== "")
								{
									position[0] = parseInt(positionLine[0], 10);
									position[1] = parseInt(positionLine[1], 10);

									if((i + 1) < item.length)
									{
										index = i + 1;
									}
									else
									{
										positionOld = position[0];
									}
								}
							}

							break;
						}
					}

					if(index > 0)
					{
						if(item.charAt(index) === "\x0E")//topic of display
						{
							if(item.charAt(index+2) === "\x0F")
							{
								let numFind = false;

								for(let item of this.topicNumberString)
								{
									if(item === position[0])
									{
										numFind = true;
										break;
									}
								}

								if(!numFind)
								{
									this.topicNumberString.push(position[0]);
								}

								topicMsg = true;
							}
						}
						else//data of display
						{
							for(let i = this.topicNumberString.length-1; i >= 0; i--)
							{
								if(position[0] > this.topicNumberString[i])
								{
									if(positionOld === position[0])
									{
										this.displayDataString[i] = this.addLine(this.displayDataString[i], item.substr(index, item.length), position[1]);
									}
									else
									{
										if(this.displayDataString[i] === "")
										{
											this.displayDataString[i] = this.addLine(this.displayDataString[i], item.substr(index, item.length), position[1]);
										}
										else
										{
											this.displayDataString[i] += "\n";
											this.displayDataString[i] = this.addLine(this.displayDataString[i], item.substr(index, item.length), position[1]);
										}
									}

									positionOld = position[0];
									break;
								}
							}
						}
					}
				}
			}
		}

		if(topicMsg)
		{
			for(let i = 0; i < this.topicNumberString.length; i++)
			{
				this.displayDataString[i] = "";
			}
		}

		for(let i = 0; i < this.displayDataString.length; i++)
		{
			if(this.displayDataString[i].includes("\x0E\x60\x0F"))
			{
				let pieces = this.displayDataString[i].split("\x0E\x60\x0F\n");
				this.displayDataString[i] = "";

				for(let j = 0; j < pieces.length; j++)
				{
					this.displayDataString[i] += pieces[j];
				}
			}
		}

		if(this.displayDataString[0] !== "")
		{
			this.queueMsgDebug.push(MessagePrompt.prmtDBG + this.displayDataString[0]);
		}
		if(this.displayDataString[2] !== "")
		{
			this.queueMsgUser.push(/*MessagePrompt.prmtUSER +*/ this.displayDataString[2]);
		}
	}

	private addLine(lineBase : string, lineAdd : string, position : number) : string
	{
		let items = lineBase.split("\n");
		let sizeLastLine = items[items.length - 1].length;

		for(let i = 0; i < (position - sizeLastLine - 1); i++)
		{
			lineBase += " ";
		}

		lineBase += lineAdd;

		return lineBase;
	}

	private parseLineMsg(msgLine: string)
	{
		const matcher = /^[-%](\w+)-([EFWIS])-(\w+)/;
		let matches = msgLine.match(matcher);

		if(matches && matches.length === 4)//debug message
		{
			this.queueMsgDebug.push(MessagePrompt.prmtDBG + msgLine);
		}
		else if(msgLine.includes(MessageDebuger.msgStepped) ||
			msgLine.includes(MessageDebuger.msgBreak) ||
			msgLine.includes(MessageDebuger.msgSteppedOn) ||
			msgLine.includes(MessageDebuger.msgBreakOn))
		{
			this.commandDone = true;
			this.commandButtonDone = true;
			this.queueMsgDebugInfo.push(MessagePrompt.prmtINFO + msgLine);
		}
		else
		{
			this.queueMsgDebugInfo.push(MessagePrompt.prmtINFO + msgLine);
		}
	}

	//examples lines
	// DBG> show calls
	// module name    routine name     line           rel PC           abs PC
	// *REM_TEST_LONG_NAME_CALL
	//                 rem_test_long_name_call
	//                                    11       0000000000000011 00000000000205A1
	// *REM            rem                12       0000000000000012 0000000000020432
	// *HELLO          main             1648       0000000000000360 0000000000020360
	// *HELLO          __main           1634       00000000000000E0 00000000000200E0
	// 											   FFFFFFFF80A3CF10 FFFFFFFF80A3CF10
	public parseCallStackMsg(data : string, moduleHolder: HolderModuleInfo, startFrame: number, endFrame: number) : any
	{
		let numberLine : number = -1;
		let columns : string[] = [];
		let frames = new Array<any>();
		let msgLines = data.split("\n");

		for(let i = 1; i < msgLines.length; i++)
		{
			columns = msgLines[i].trim().split(/\s+/);

			if(columns[0].includes("*"))
			{
				let routineName = "";
				let numberLineDebug = "-1";
				let moduleName = columns[0].substring(1);//remove symbol '*'

				if(columns.length === 1)//module name is long
				{
					i += 1;
					columns = msgLines[i].trim().split(/\s+/);
					routineName = columns[0];

					if(columns.length === 1)//routine name is long
					{
						i += 1;
						columns = msgLines[i].trim().split(/\s+/);

						if(columns.length === 3)
						{
							numberLineDebug = columns[0];
						}
					}
					else
					{
						if(columns.length === 3)
						{
							numberLineDebug = columns[1];
						}
					}
				}
				else
				{
					routineName = columns[1];

					if(columns.length === 2)//routine name is long
					{
						i += 1;
						columns = msgLines[i].trim().split(/\s+/);

						if(columns.length === 3)
						{
							numberLineDebug = columns[0];
						}
					}
					else
					{
						if(columns.length === 5)
						{
							numberLineDebug = columns[2];
						}
					}
				}

				let moduleItem = moduleHolder.getItem(moduleName);
				let pathFile = moduleItem.sourcePath;
				let pathLisFile = moduleItem.listingPath;
				let shift = this.fileInfo.getShiftLine(moduleName);

				if(pathFile !== "" && pathLisFile !== "")
				{
					if(shift === -1)
					{
						let lisLines = this.loadFileContext(pathLisFile);
						//get source line
						numberLine = this.getNumberLineSourceCode(numberLineDebug, lisLines);
						//save file info
						shift = parseInt(numberLineDebug, 10) - numberLine;
						this.fileInfo.setItem(pathFile, moduleName, shift, numberLine);
					}
					else
					{
						numberLine = parseInt(numberLineDebug, 10) - this.fileInfo.getShiftLine(moduleName);
					}

					frames.push({
						index: startFrame,
						name: `${routineName}[${startFrame}]`,
						file: pathFile,
						line: numberLine
					});

					startFrame++;
				}
			}
		}

		if(frames.length === 0)
		{
			frames = this.framesOld;
		}
		else
		{
			this.framesOld = frames;
		}

		return {
			frames: frames,
			count: frames.length
		};
	}

	// 	SHOW SYMBOL/type * in REM
	// data REM\rem\__func__
	// 	array type, 1 dimension, bounds: [0:3], size: 4 bytes
	// 		cell type: const
	// 			atomic type, byte integer, size: 1 byte
	// data REM\rem\num2
	// 	atomic type, longword integer, size: 4 bytes
	// data HELLO\main\%LINE 1641\a
	//  atomic type, longword integer, size: 4 bytes
	// routine REM\rem
	// type REM\long pointer
	// 	atomic type, quadword logical, size: 8 bytes
	// record component HELLO\_iobuf._pad2
    //  atomic type, byte logical, size: 1 byte
	public parseVariableMsg(modulesInfo: HolderModuleInfo, data: string) : void
	{
		let filePath : string = "";
		let variableInfo = new Array<VariableFileInfo>();
		let msgLines = data.split("\n");

		for(let i = 0; i < msgLines.length; i++)
		{
			let type = msgLines[i].trim().split(/\s+/);

			if(type[0] === "data" || type[0] === "record")
			{
				let moduleName : string = "";
				let wrapName : string = "";
				let functionName : string = "";
				let variableName : string = "";
				let variableNameFull : string = "";
				const matcherR = /^\S+\s*(\S+)::(\S+)/;
				const matcherS = /^\s*(\S+)::(\S+)\\(\S+)/;//class::member\field
				let info = msgLines[i].substr(type[0].length+1);
				let matches = info.match(matcherS);

				if(type[0] === "record")
				{
					let matchesR = info.match(matcherR);

					if(matchesR)
					{
						moduleName = matchesR[matchesR.length-2].toUpperCase();
						functionName = "";
						variableName = matchesR[matchesR.length-1];
					}
				}
				else if(matches)//Class
				{
					moduleName = matches[matches.length-3].toUpperCase();
					functionName = matches[matches.length-2];
					variableName = matches[matches.length-1];
				}
				else
				{
					let infoData = info.split("\\");
					moduleName = infoData[0].toUpperCase();
					functionName = infoData[infoData.length-2];
					variableName = infoData[infoData.length-1];
					variableNameFull = info;

					if(infoData.length === 4)
					{
						if(infoData[infoData.length-2].includes("%LINE "))//MAIN\R\%LINE 30\IDX:    200
						{
							functionName = infoData[infoData.length-3];
						}
						else
						{
							wrapName = infoData[infoData.length-3];
						}
					}

					if(infoData.length === 2)
					{
						functionName = "";//it is global variable
					}
				}

				if(filePath === "")
				{
					filePath = modulesInfo.getItem(moduleName).sourcePath;
				}

				if(variableName !== "__func__" &&
					!variableName.includes(".") &&
					variableName !== "")
				{
					let variableType : string = "";
					let variableAddress : string = "";

					while(i < (msgLines.length-1))
					{
						let arrayData = msgLines[++i];

						if(arrayData.charAt(0) === " ")
						{
							if(arrayData.includes("address:") || arrayData.includes("constant:"))
							{
								variableAddress = ", " + arrayData.trim();
							}
							else
							{
								variableType += arrayData + "\n";//full data info
							}
						}
						else
						{
							--i;
							variableType = variableType.trim() + variableAddress;
							break;
						}
					}

					let variable = <VariableFileInfo> { filePath, moduleName, wrapName, functionName, variableName, variableNameFull , variableType };

					variableInfo.push(variable);
				}
			}
			else if(type[0] === "routine")
			{

			}
			else if(type[0] === "type")
			{

			}
		}

		this.varsInfo.setVariableFile(filePath, variableInfo);
	}

	// examine a,del,data,count
	// HELLO\main\%LINE 1641\a:        0
	// HELLO\main\del: 0
	// HELLO\data[0:9]
	//     [0]-[9]:    0
	// HELLO\main\count:       5
	// HELLO\data[0:9]
    // 	[0]:        0
    // 	[1]:        100
	// 	[2]-[9]:    0
	// ADD\sum\structData
	// state:      I2C_STATE_DISABLE
	// channal:    0
	// data
	// 	[0]
	// 		dataAdc:    2068890056
	// 		buffer:     "P{"
	// 	[1]
	// 		dataAdc:    0
	// 		buffer:     ""
	// battery:    54828
	public parseVariableValuesMsg(currentPath: string, data: string, pointerDereferencing : string) : void
	{
		let variableInfo = this.varsInfo.getVariableFile(currentPath);
		let msgLines = data.split("\n");

		if(variableInfo)
		{
			for(let i = 0; i < msgLines.length; i++)
			{
				let typeArray : ReflectKind = ReflectKind.Invalid;
				let nameFunc : string;
				let nameVar : string;
				const matcherS = /^\s*(\S+)::(\S+)\\(\S+)\:/;//class::func\var: val
				let matches = msgLines[i].match(matcherS);
				let info = msgLines[i].trim().split("\\");

				if(info.length > 1)//variable
				{
					if(matches)//variable of class
					{
						if(matches[matches.length-1].includes("this->"))
						{
							nameFunc = "";
							nameVar = matches[matches.length-1].replace("this->", "");
						}
						else
						{
							nameFunc = matches[matches.length-2];
							nameVar = matches[matches.length-1];
						}
					}
					else
					{
						if(info.length === 2)//global variable
						{
							nameFunc = "";
						}
						else //local variable
						{
							if(msgLines[i].includes("%LINE "))//MAIN\R\%LINE 30\IDX:    00000200
							{
								nameFunc = info[info.length-3];
							}
							else
							{
								nameFunc = info[info.length-2];
							}
						}

						let matcherArray = /^\s*(\S+)[\(\[]([0-9,:]*)[\)\]]/;
						let matches = info[info.length-1].match(matcherArray);

						if(matches && matches.length === 3)
						{
							nameVar = matches[1];

							if(matches[2] === "")//it is Block
							{
								typeArray = ReflectKind.Block;
							}
							else
							{
								typeArray = ReflectKind.Array;
							}
						}
						else
						{
							nameVar = info[info.length-1].split(":")[0].trim();
						}
					}

					for(let item of variableInfo)
					{
						let symbols = "^.*";

						for(let i = 0; i < symbols.length; i++)//remove tail from variable
						{
							let symbol = symbols.charAt(i);
							let index = nameVar.indexOf(symbol);

							if(index > 0)
							{
								nameVar = nameVar.substring(0, index);
								break;
							}
						}

						if(item.functionName === nameFunc &&
							item.variableName === nameVar &&
							msgLines[i].includes(item.variableNameFull))
						{
							if(typeArray === ReflectKind.Array)
							{
								item.variableKind = ReflectKind.Array;
							}
							else
							{
								const matcherS = /^\s*(\S+):\s*(.*)/;//Struct name: 23
								let matches = info[info.length-1].match(matcherS);

								if(typeArray === ReflectKind.Block)
								{
									if(matches)
									{
										item.variableValue = matches[matches.length-1];
										item.variableKind = ReflectKind.Block;
									}
									else
									{
										item.variableKind = ReflectKind.Struct;
									}								
								}
								else if(item.variableType.includes("pointer to") ||
									item.variableType.includes("pointer type"))
								{
									if(matches)
									{
										if((item.variableAddress && item.variableAddress !== 0) ||
											pointerDereferencing === "")
										{
											item.variableValue = matches[matches.length-1];
										}
										else//it is address
										{
											let addr = parseInt(matches[matches.length-1], 10);

											if(!Number.isNaN(addr))
											{
												if(addr < 0x1000 /*&& addr > 0*/)//???
												{
													item.variableAddress = 0;
												}
												else
												{
													item.variableAddress = addr;
												}
											}
											else
											{
												item.variableInfo = matches[matches.length-1];
											}
										}
									}

									item.variableKind = ReflectKind.Pointer;
								}
								else if(item.variableType.includes("basic_string"))
								{
									if(matches)
									{
										if(item.variableAddress && item.variableAddress !== 0)
										{
											item.variableValue = matches[matches.length-1];
										}
										else
										{
											let addrString : string = "";
											item.variablePrefix = "";

											while(i < (msgLines.length-1))
											{
												let arrayData = msgLines[++i];

												if(arrayData.charAt(0) === " ")
												{
													const matcherAddress = /^\s*(\S+):\s*(\d+)/;//name: 23
													let matchesAddress = arrayData.match(matcherAddress);

													if(matchesAddress)
													{
														item.variablePrefix += "." + matchesAddress[1];
														addrString = matchesAddress[matchesAddress.length-1];
													}
													else
													{
														let matchesData = arrayData.match(matcherS);

														if(matchesData)
														{
															item.variablePrefix += "." + matchesData[1];
														}
													}
												}
												else
												{
													--i;
												 	break;
												}
											}

											let addr = parseInt(addrString, 10);

											if(!Number.isNaN(addr))
											{
												if(addr < 0x1000 && addr > 0)
												{
													item.variableAddress = 0;
												}
												else
												{
													item.variableAddress = addr;
												}
											}
											else
											{
												item.variableAddress = 0;
											}
										}

										item.variableKind = ReflectKind.String;
									}
								}
								else if(item.variableType.includes("record type") ||
									item.variableType.includes("struct"))
								{
									if(matches)
									{
										item.variableInfo = matches[matches.length-1];
									}

									item.variableKind = ReflectKind.Struct;
								}
								else
								{
									if(matches)//simple variable
									{
										item.variableValue = matches[matches.length-1];
										item.variableKind = ReflectKind.Atomic;
									}
									else //stucture
									{
										item.variableKind = ReflectKind.Struct;
									}
								}
							}

							if(item.variableKind !== ReflectKind.Atomic &&
								item.variableKind !== ReflectKind.Block &&
								item.variableKind !== ReflectKind.String)
							{
								let values : string = "";

								while(i < (msgLines.length-1))
								{
									let arrayData = msgLines[++i];

									if(arrayData !== "" && arrayData.charAt(0) === " ")
									{
										values += arrayData + "\n";
									}
									else
									{
										--i;
										break;
									}
								}

								if(values !== "")
								{
									item.variableValue = values;
								}
								else if(!item.variableValue)
								{
									item.variableValue = "";
								}
							}

							break;
						}
					}
				}
			}
		}
	}

	public parseStructValues(variable: VariableFileInfo, prm : Parameters) : DebugVariable[]
	{
		const shiftLevel : number = 4;
		let childs : DebugVariable[] = [];
		let dimensions : string = "";
		let items = variable.variableValue.split("\n");
		const matcherA = /^\s*[\[\(]([0-9,]*)[\]\)](-[\[\(]([0-9,]*)[\]\)])?:\s*(.*)/;//Array ( [0,2, ...]-[2,5, ...]: 23 or (0)-(2): 23 )
		const matcherS = /^\s*(\S+):\s*(.*)/;//Struct (name: 23)

		while(prm.counter < items.length)
		{
			let goNextLevel : boolean = true;
			let itemInfo : string = "";
			let v = items[prm.counter];
			prm.counter++;

			if(v !== "")
			{
				let matches : RegExpMatchArray | null;
				let kind : number;
				let itemLevel = v.length - v.trim().length;

				if(itemLevel < prm.level)//go to up level
				{
					prm.level -= shiftLevel;
					prm.counter--;
					return childs;
				}

				let typeVar = this.getKindVariable(v);

				if(typeVar === ReflectKind.Invalid)
				{
					kind = ReflectKind.Invalid;
					continue;
				}
				else if(typeVar === ReflectKind.Array) //array
				{
					matches = v.match(matcherA);

					if(matches)
					{
						if((prm.counter) < items.length)
						{
							let itemNext = items[prm.counter];
							let itemLevelNext = itemNext.length - itemNext.trim().length;

							if(itemLevelNext > itemLevel)
							{
								itemInfo = matches[matches.length-1];

								do
								{
									kind = this.getKindVariable(items[prm.counter]);

									if(kind === ReflectKind.Invalid)
									{
										if(itemInfo === "")
										{
											itemInfo = items[prm.counter].trim();
										}
										else
										{
											itemInfo += "\n" + items[prm.counter].trim();
										}
										prm.counter++;
									}

								} while(kind === ReflectKind.Invalid && prm.counter < items.length);
							}
							else
							{
								goNextLevel = false;
								kind = ReflectKind.Array;
							}
						}
						else
						{
							goNextLevel = false;
							kind = ReflectKind.Array;
						}
					}
					else if((prm.counter) < items.length)
					{
						itemInfo = "";

						do
						{
							kind = this.getKindVariable(items[prm.counter]);

							if(kind === ReflectKind.Invalid)
							{
								if(itemInfo === "")
								{
									itemInfo = items[prm.counter].trim();
								}
								else
								{
									itemInfo += "\n" + items[prm.counter].trim();
								}								
								prm.counter++;
							}
							else if(kind === ReflectKind.Value)
							{
								v += ": " + items[prm.counter];
								matches = v.match(matcherA);
								
								kind = ReflectKind.Array;
								goNextLevel = false;
								prm.counter++;
							}

						} while(kind === ReflectKind.Invalid && prm.counter < items.length);						
					}
					else
					{
						kind = ReflectKind.Array;
					}
				}
				else //struct
				{
					matches = v.match(matcherS);

					if(matches && v.charAt(0) !== '"')
					{
						if((prm.counter) < items.length)
						{
							let itemNext = items[prm.counter];
							let itemLevelNext = itemNext.length - itemNext.trim().length;

							if(itemLevelNext > itemLevel)
							{
								itemInfo = matches[matches.length-1];

								do
								{
									kind = this.getKindVariable(items[prm.counter]);
		
									if(kind === ReflectKind.Invalid)
									{
										if(itemInfo === "")
										{
											itemInfo = items[prm.counter].trim();
										}
										else
										{
											itemInfo += "\n" + items[prm.counter].trim();
										}										
										prm.counter++;
									}
		
								} while(kind === ReflectKind.Invalid && prm.counter < items.length);	
							}
							else
							{
								goNextLevel = false;
								kind = ReflectKind.Struct;
							}
						}
						else
						{
							goNextLevel = false;
							kind = ReflectKind.Struct;
						}
					}
					else if((prm.counter) < items.length)
					{
						itemInfo = "";

						do
						{
							kind = this.getKindVariable(items[prm.counter]);

							if(kind === ReflectKind.Invalid)
							{
								if(itemInfo === "")
								{
									itemInfo = items[prm.counter].trim();
								}
								else
								{
									itemInfo += "\n" + items[prm.counter].trim();
								}								
								prm.counter++;
							}							
							else if(kind === ReflectKind.Value)
							{
								v += ": " + items[prm.counter];
								matches = v.match(matcherS);
								
								kind = ReflectKind.Struct;
								goNextLevel = false;
								prm.counter++;
							}

						} while(kind === ReflectKind.Invalid && prm.counter < items.length);						
					}
					else
					{
						if(variable.variableType.includes("atomic type"))
						{
							kind = ReflectKind.Atomic;
						}
						else
						{
							kind = ReflectKind.Struct;
						}
					}
				}

				if(matches && !goNextLevel)//add item
				{
					let itemsArray : string[] = [];
					let value = matches[matches.length-1];
					prm.level = itemLevel;

					if(matches.length === 3)//struct info
					{
						itemsArray.push(matches[1]);
					}
					else if(matches.length === 5)//array  info
					{
						if(dimensions === "" && matches[1].includes(","))// [1,3,2]
						{
							dimensions = this.defineDimensionsArray(prm.counter, items, matches, matcherA);
						}
						
						itemsArray = this.parseItemsArray(v, dimensions);
					}

					for(let nameItem of itemsArray)
					{
						let child = <DebugVariable>
						{
							name: nameItem,
							nameFull: "",
							addr: 0,
							type: "atomic",
							kind: ReflectKind.Atomic,
							value: value,
							info: "",
							prefix: "",
							len: 0,
							unreadable: "",
							fullyQualifiedName: "",
							children : [],
						};

						childs.push(child);
					}
				}
				else
				{
					if(itemLevel >= prm.level)//go to down level
					{
						let name : string;
						let typeName : string;
						let value : string;
						let childsIn : DebugVariable[] = [];

						if(kind !== ReflectKind.Atomic)
						{
							name = v.split(":")[0].trim();
							typeName = (kind === ReflectKind.Array) ? "array" : "struct";
							value = "";
							childsIn = this.parseStructValues(variable, prm);//parse next inner level
						}
						else
						{
							name = "value";
							typeName = "atomic";
							value = v;
						}

						let child = <DebugVariable>
						{
							name: name,
							nameFull: "",
							addr: 0,
							type: typeName,
							kind: kind,
							value: value,
							info: itemInfo,
							prefix: "",
							len: 0,
							unreadable: "",
							fullyQualifiedName: "",
							children : childsIn,
						};

						childs.push(child);
					}
					else//go to up level
					{
						prm.level -= shiftLevel;
						prm.counter--;
						return childs;
					}
				}
			}
		}

		return childs;
	}

	private getKindVariable(item : string) : ReflectKind
	{
		const matcherArrayType = /^\s*[\[\(]([0-9,]*)[\]\)]\s*(.*)/;//[2, ...] or (2, ....)
		const matcherStructType = /^\s*(\S+): \s*(.*)/;//structure
		const matcherInfoType = /^\s*[\[\(](.*)[\]\)]\s*(.*)/;//[info] or (info)

		let matches = item.match(matcherArrayType);

		if(matches)//array
		{
			if(item.includes("["))
			{
				this.typeBracketsSquare = true;
			}
			else
			{
				this.typeBracketsSquare = false;
			}

			return ReflectKind.Array;
		}
		else //struct
		{
			let matchesInfo = item.match(matcherInfoType);

			if(matchesInfo)
			{
				return ReflectKind.Invalid;
			}
			else
			{
				let matchesStruct = item.match(matcherStructType);
				let items = item.trim().split(" ");

				if(!Number.isNaN(parseInt(items[0], 16)))
				{
					return ReflectKind.Value;
				}
				else if(matchesStruct || items.length === 1)
				{
					return ReflectKind.Struct;
				}
				else
				{
					return ReflectKind.Invalid;					
				}
			}
		}
	}

	//  ARRAY
	//      (1,1)-(1,2):        0
	//      (1,3):              10
	//      (1,4)-(3,10):       0
	//  DATA
	private defineDimensionsArray(indexItem : number, items: string[], matches : RegExpMatchArray, matcherRegExp: RegExp) : string
	{
		let dimensions : string = "";
		let nextIndex = indexItem;
		let matchesArr : RegExpMatchArray | null = matches;
		let startIndexes : string = matches[1];
		let endIndexis : string = "";

		do
		{
			if(matchesArr)
			{
				if(matchesArr[3])
				{
					endIndexis = matchesArr[3];
				}
				else
				{
					endIndexis = matchesArr[1];
				}									
			}

			let itemNext = items[nextIndex];
			matchesArr = itemNext.match(matcherRegExp);
			nextIndex++;

		} while(matchesArr);

		let numsStart = startIndexes.split(",");
		let numsEnd = endIndexis.split(",");

		for(let i = 0; i < numsStart.length; i ++)
		{
			if(dimensions === "")
			{
				dimensions += numsStart[i] + ":" + numsEnd[i];
			}
			else
			{
				dimensions += "," + numsStart[i] + ":" + numsEnd[i];
			}
		}

		dimensions = "bounds: [" + dimensions + "]";

		return dimensions;
	}

	private parseItemsArray(data : string, dimension : string) : string[]//[2,10, ...]-[3,2, ...]: 235, bounds: [1:10,1:10, ...]
	{
		let parse = true;
		let itemsStart : number[] = [];
		let itemsEnd : number[] = [];
		let itemsMin : number[] = [];
		let itemsMax : number[] = [];
		let itemsArray : string[] = [];

		const matcherA = /^\s*[\[\(]([0-9,]*)[\]\)](-[\[\(]([0-9,]*)[\]\)])?:\s*(.*)/;//Array ( [2,10]-[3,2]: 23)
		const matcherD = /^.*bounds: [\[\(]([0-9,:]*)[\]\)]/;//bounds: [1:10,1:10]
		let matches = data.match(matcherA);
		let matchesDim = dimension.match(matcherD);

		if(matches && !matches[1].includes(","))// simple items array [2]-[3]: 23
		{
			if(!matches[2])
			{
				itemsArray.push(data.split(":")[0].trim());
			}
			else
			{
				itemsStart.push(parseInt(matches[1], 10));
				itemsEnd.push(parseInt(matches[3], 10));

				for(let i = itemsStart[0]; i <= itemsEnd[0]; i ++)
				{
					itemsArray.push(this.createItemLabelArray(itemsStart));
					itemsStart[0]++;					
				}
			}
		}
		else if(matches && matchesDim && matches.length === 5)
		{
			if(!matches[2])
			{
				itemsArray.push(data.split(":")[0].trim());
			}
			else
			{
				let numsStart = matches[1].split(",");
				let numsEnd = matches[3].split(",");
				let dimMinMax = matchesDim[1].split(",");

				for(let i = 0; i < numsStart.length; i ++)
				{
					itemsStart.push(parseInt(numsStart[i], 10));
					itemsEnd.push(parseInt(numsEnd[i], 10));

					let dims = dimMinMax[i].split(":");
					itemsMin.push(parseInt(dims[0], 10));
					itemsMax.push(parseInt(dims[1], 10));
				}

				itemsArray.push(this.createItemLabelArray(itemsStart));

				while(parse)
				{
					for(let i = itemsStart.length-1; i > -1; i --)
					{
						itemsStart[i]++;

						if(itemsStart[i] > itemsMax[i])
						{
							itemsStart[i] = itemsMin[i];					
						}
						else
						{
							break;
						}
					}

					parse = false;

					for(let i = 0; i < itemsStart.length; i ++)
					{
						if(itemsStart[i] !== itemsEnd[i])
						{
							parse = true;
						}
					}

					itemsArray.push(this.createItemLabelArray(itemsStart));
				}
			}
		}

		return itemsArray;
	}

	private createItemLabelArray(itemsStart : number[]) : string
	{
		let item : string = "";

		for(let i = 0; i < itemsStart.length; i ++)
		{
			if(item === "")
			{
				item += String(itemsStart[i]);
			}
			else
			{
				item += "," + String(itemsStart[i]);
			}					
		}

		if(this.typeBracketsSquare === true)
		{
			item = "[" + item + "]";
		}
		else
		{
			item = "(" + item + ")";
		}

		return item;
	}

	// scope:
    // 0 [ = HELLO\main ] or 0 [ = HELLO\main\%LINE 1645 ]
	public parseScopeMsg(data: string) : string
	{
		let result = "";
		let msgLines = data.split("\n");

		for(let item of msgLines)
		{
			result = this.findNumberLineScope(item);

			if(result !== "-1")
			{
				break;
			}
			else
			{
				result = "";
			}
		}

		return result;
	}


	public getVariableFileInfo() : HolderDebugVariableInfo
	{
		return this.varsInfo;
	}

	public getCommandStatus() : boolean
	{
		let status = this.commandDone;
		this.commandDone = false;

		return status;
	}

	public getCommandButtonStatus() : boolean
	{
		let status = this.commandButtonDone;
		this.commandButtonDone = false;

		return status;
	}

	public getCommandMessage() : string
	{
		let message : string = "";

		if(this.queueMsgCommand.size() > 0)
		{
			message = this.queueMsgCommand.pop();
		}

		return message;
	}

	public getDataMessage() : string
	{
		let message : string = "";

		while(this.queueMsgData.size() > 0)
		{
			message += this.queueMsgData.pop() + "\n";
		}

		return message;
	}

	public getUserMessage() : string
	{
		let message : string = "";

		while(this.queueMsgUser.size() > 0)
		{
			message += this.queueMsgUser.pop() + "\n";
		}

		return message;
	}

	public getDebugMessage() : string
	{
		let message : string = "";

		while(this.queueMsgDebug.size() > 0)
		{
			message += this.queueMsgDebug.pop() + "\n";
		}

		return message;
	}

	public getDebugInfoMessage() : string
	{
		let message : string = "";

		while(this.queueMsgDebugInfo.size() > 0)
		{
			message += this.queueMsgDebugInfo.pop() + "\n";
		}

		return message;
	}


	private findPathFileByName(fileName : string, paths : string[]) : string
	{
		let pathFile : string = "";

		fileName = fileName.toLowerCase();

		for(let item of paths)
		{
			let namePos = item.lastIndexOf(ftpPathSeparator) + 1;// if no path -> from start (-1 + 1 = 0 ;)
			let extPos = item.lastIndexOf(".");

			if (extPos === -1)
			{
				extPos = item.length;// if no ext -> to the end
			}

			if (namePos >= 0 && namePos < extPos)
			{
				const name = item.slice(namePos, extPos).toLowerCase();// check name

				if (name === fileName)
				{
					pathFile = item;
					break;
				}
			}
		}

		return pathFile;
	}

	//examples a lines
	//stepped to HELLO\main\%LINE 1631
	//break at routine HELLO\main
	public findFileName(line : string) : string
	{
		let name : string = "";
		let findItem : string = "";
		let array = line.split(/\s+/);

		for (let item of array)//search the last item
		{
			if(item.includes("\\"))
			{
				findItem = item;
			}
		}

		if(findItem !== "")
		{
			findItem = findItem.toLowerCase();
			let names = findItem.split("\\");
			name = names[0];
		}

		return  name;
	}

	private getNumberLineSourceCode(debugLineNumber : string, lisLines: string[]) : number
	{
		let indexLine : number = 0;
		let shiftHeader : number = 3;
		let LineSourceCode : number = -1;

		for(let i = shiftHeader; i < lisLines.length; i++)
		{
			let line = lisLines[i];
			const matcher = /^\s*\S*\s*\d*\s*\d*[\tX]\s*(\d+)/;// (/^\s*\d*\t\s*(\d+)/; (c/c++)) X - for preprocessor
			const matches = line.match(matcher);

			if(matches && matches.length === 2)
			{
				if(!Number.isNaN(parseInt(matches[1], 10)))
				{
					let lisLineNumber = matches[1];

					if(debugLineNumber === lisLineNumber)
					{
						LineSourceCode = indexLine;
						break;
					}

					indexLine++;
				}
			}
		}

		return LineSourceCode;
	}

	//examples a lines of lis file
	// 		1634 int main ()
	// 1    1635 {
	// 1    1636   int count = 5;
	// 1    1637   int del = 0;
	public findBreakPointNumberLine(currentNumberLine : number, sourceLisLines: string[]) : number
	{
		let indexLine : number = 0;
		let shiftHeader : number = 3;
		let number : number = NaN;

		for(let i = shiftHeader; i < sourceLisLines.length; i++)
		{
			let line = sourceLisLines[i];
			const matcher = /^\s*\S*\s*\d*\s*\d*[\tX]\s*(\d+)/;// (/^\s*\d*\t\s*(\d+)/; (c/c++)) X - for preprocessor
			const matches = line.match(matcher);

			if(matches && matches.length === 2)
			{
				if(!Number.isNaN(parseInt(matches[1], 10)))
				{
					if(indexLine === currentNumberLine)
					{
						number = parseInt(matches[1], 10);
						break;
					}

					indexLine++;
				}
			}
		}

		return number;
	}

	//module\routine\%LINE NUMBER\variable
	public findNumberLineScope(dataLine : string) : string
	{
		let number = "-1";
		const matcher = /^.*\\%LINE (\d+)/;// ^\S+\\%LINE (\d+)\\
		let matches = dataLine.match(matcher);

		if(matches && matches.length === 2)
		{
			number = matches[1];
		}

		return number;
	}

	public getNumberLineScope(fileName : string, fullVariableName : string) : number
	{
		let numberLine = -1;

		let info = this.fileInfo.getItem(fileName);

		if(info)
		{
			let varNumberLine = parseInt(this.findNumberLineScope(fullVariableName), 10);
			numberLine = varNumberLine - this.fileInfo.getShiftLine(fileName);
		}

		return numberLine;
	}

	public loadFileContext(file: string) : string[]
	{
		let lines : string[] = [];

		if (file !== "")
		{
			lines = readFileSync(file).toString().split('\n');
		}

		return lines;
	}
}

export class Parameters
{
	public counter : number;
	public level : number;

	constructor()
	{
		this.counter = 0;
		this.level = 0;
	}
}