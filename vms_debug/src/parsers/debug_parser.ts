import { HolderDebugFileInfo } from './debug_file_info';
import { DebugCmdVMS, CommandMessage } from '../command/debug_commands';
import { Queue } from '../queue/queues';
import { ftpPathSeparator } from '@vorfol/common';
import { TypeDataMessage, ShellSession } from '../net/shell-session';
import { VariableFileInfo, HolderDebugVariableInfo, ReflectKind, DebugVariable } from './debug_variable_info';
import { readFileSync } from 'fs';


export enum MessageDebuger
{
	msgStepped = "stepped to",
	msgSteppedOn = "stepped on",
	msgBreak = "break at",
	msgBreakOn = "break on",
	msgKeyDbg = "%DEBUG-",
	msgKeySys = "%SYSTEM-",
	msgKeyDcl = "%DCL-",
	msgNoImage = "%DCL-W-ACTIMAGE, error activating image",
	msgNoSccess = "%DEBUG-E-NOACCESSR, no read access to address",
	msgNoFind = "%DEBUG-E-NOTRAZERO, Unable to find",
	msgUnAlloc = "%DEBUG-W-UNALLOCATED",
	msgNotAct = "%DEBUG-W-SYMNOTACT",
	msgNoSymbol = "%DEBUG-E-NOSYMBOL, symbol",
	msgNoProcess = "%DEBUG-E-NOPROCESSES, the current command is targetted at an empty process set",
	msgEnd = "%DEBUG-I-EXITSTATUS, is '%SYSTEM-S-NORMAL, normal successful completion",
}

export enum MessagePrompt
{
	prmtCMD = "CMD: ",
	prmtDBG = "DBG: ",
	prmtUSER = "USER: ",
	prmtINFO = "INFO: ",
}

export enum StringsPrompt
{
	cppString = "._C_data",
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


	public parseDebugData(shell : ShellSession, type: TypeDataMessage, data : string, sourcePaths: string[], lisPaths: string[])
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
								this.parseLineMsg(item, sourcePaths, lisPaths);
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
				case DebugCmdVMS.dbgDump:
					for(let item of msgLines)
					{
						if(item !== "")
						{
							if(!item.includes(cmd))
							{
								this.queueMsgData.push(item);
								this.commandDone = true;
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

	private parseLineMsg(msgLine: string, sourcePaths: string[], lisPaths: string[])
	{
		if(msgLine.includes(MessageDebuger.msgStepped) ||
			msgLine.includes(MessageDebuger.msgBreak) ||
			msgLine.includes(MessageDebuger.msgSteppedOn) ||
			msgLine.includes(MessageDebuger.msgBreakOn))
		{
			this.commandDone = true;
			this.commandButtonDone = true;
			this.queueMsgDebugInfo.push(MessagePrompt.prmtINFO + msgLine);
		}
		else if(msgLine.includes(MessageDebuger.msgKeyDbg) ||
				msgLine.includes(MessageDebuger.msgKeySys) ||
				msgLine.includes(MessageDebuger.msgKeyDcl))//debug message
		{
			this.queueMsgDebug.push(MessagePrompt.prmtDBG + msgLine);
		}
		else
		{
			this.queueMsgDebugInfo.push(MessagePrompt.prmtINFO + msgLine);
		}
	}

	//examples lines
	// DBG> show calls
	// module name    routine name     line           rel PC           abs PC
	// *REM            rem                12       0000000000000012 0000000000020432
	// *HELLO          main             1648       0000000000000360 0000000000020360
	// *HELLO          __main           1634       00000000000000E0 00000000000200E0
	// 											   FFFFFFFF80A3CF10 FFFFFFFF80A3CF10
	public async parseCallStackMsg(data : string, sourcePaths: string[], lisPaths: string[], startFrame: number, endFrame: number) //: any
	{
		let numberLine : number = -1;
		let frames = new Array<any>();
		let msgLines = data.split("\n");

		for(let i = 1; i < msgLines.length; i++)
		{
			const columns = msgLines[i].trim().split(/\s+/);

			if(columns.length === 5 && columns[0].includes("*"))
			{
				const routineName = columns[1];
				let fileName = columns[0].substring(1);//remove symbol '*'
				let numberLineDebug = columns[2];
				let pathFile = this.findPathFileByName(fileName, sourcePaths);
				let pathLisFile = this.findPathFileByName(fileName, lisPaths);
				let shift = this.fileInfo.getShiftLine(fileName);

				if(pathFile !== "" && pathLisFile !== "")
				{
					if(shift === -1)
					{
						let lisLines = this.loadFileContext(pathLisFile);
						//get source line
						numberLine = this.getNumberLineSourceCode(numberLineDebug, lisLines);
						//save file info
						shift = parseInt(numberLineDebug, 10) - numberLine;
						this.fileInfo.setItem(pathFile, fileName, shift, numberLine);
					}
					else
					{
						numberLine = parseInt(numberLineDebug, 10) - this.fileInfo.getShiftLine(fileName);
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
	public parseVariableMsg(sourcePaths: string[], data: string) : void
	{
		let filePath : string = "";
		let variableInfo = new Array<VariableFileInfo>();
		let msgLines = data.split("\n");

		for(let i = 0; i < msgLines.length; i++)
		{
			let type = msgLines[i].trim().split(/\s+/);

			if(type[0] === "data" || type[0] === "record")
			{
				let fileName : string = "";
				let functionName : string = "";
				let variableName : string = "";
				const matcherR = /^\S+\s*(\S+)::(\S+)/;
				const matcherS = /^\s*(\S+)::(\S+)\\(\S+)/;//class::member\field
				let info = msgLines[i].substr(type[0].length+1);
				let matches = info.match(matcherS);

				if(type[0] === "record")
				{
					let matchesR = info.match(matcherR);

					if(matchesR)
					{
						fileName = matchesR[matchesR.length-2].toUpperCase();
						functionName = "";
						variableName = matchesR[matchesR.length-1];
					}
				}
				else if(matches)//Class
				{
					fileName = matches[matches.length-3].toUpperCase();
					functionName = matches[matches.length-2];
					variableName = matches[matches.length-1];
				}
				else
				{
					let infoData = info.split("\\");
					fileName = infoData[0];
					functionName = infoData[1];
					variableName = infoData[infoData.length-1];

					if(infoData.length === 2)
					{
						functionName = "";//it is global variable
					}
				}

				if(filePath === "")
				{
					filePath = this.findPathFileByName(fileName, sourcePaths);
				}

				if(variableName !== "__func__" && variableName !== "")
				{
					let variableType : string = "";

					while(i < (msgLines.length-1))
					{
						let arrayData = msgLines[++i].trim();

						if(!arrayData.includes("\\") && !arrayData.includes("::"))
						{
							variableType += arrayData + "\n   ";//full data info
						}
						else
						{
							--i;
							variableType = variableType.trim();
							break;
						}
					}

					let variable = <VariableFileInfo> { filePath, fileName, functionName, variableName, variableType };

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
	public parseVariableValuesMsg(currentPath: string, data: string) : void
	{
		let variableInfo = this.varsInfo.getVariableFile(currentPath);
		let msgLines = data.split("\n");

		if(variableInfo)
		{
			for(let i = 0; i < msgLines.length; i++)
			{
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
							nameFunc = info[1];
						}

						nameVar = info[info.length-1].split(":")[0].trim();

						if(nameVar.includes(StringsPrompt.cppString))
						{
							nameVar = nameVar.replace(StringsPrompt.cppString, "");
						}
					}

					if(nameVar.includes("["))//array
					{
						nameVar = nameVar.split("[")[0];
					}

					for(let item of variableInfo)
					{
						if(item.functionName === nameFunc &&
							item.variableName === nameVar)
						{
							if(info[info.length-1].includes("["))//array
							{
								item.variableKind = ReflectKind.Array;
							}
							else
							{
								const matcherS = /^\s*(\S+):\s*(\S+)/;//Struct name: 23
								let matches = info[info.length-1].match(matcherS);

								if(item.variableType.includes("pointer to"))
								{
									if(matches)
									{
										if(info[0].charAt(0) === "*")//it is value
										{
											let indexStart = info[info.length-1].indexOf(":");
                        					item.variableValue = info[info.length-1].substr(indexStart+1).trim();
										}
										else//it is address
										{
											let addr = parseInt(matches[matches.length-1], 10);

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
												let indexStart = info[info.length-1].indexOf(":");
												item.variableInfo = info[info.length-1].substr(indexStart+1).trim();
											}
										}
									}

									item.variableKind = ReflectKind.Pointer;
								}
								else if(item.variableType.includes("typedef string"))
								{
									if(matches)
									{
										if(item.variableAddress && item.variableAddress !== 0)
										{
											let indexStart = info[info.length-1].indexOf(":");
                        					item.variableValue = info[info.length-1].substr(indexStart+1).trim();
										}
										else
										{
											let value : string = "";

											while(i < (msgLines.length-1))
											{
												let arrayData = msgLines[++i];

												if(!arrayData.includes("\\"))
												{
													value += arrayData + "\n";
												}
												else
												{
													--i;
													break;
												}
											}

											let indexStart = value.indexOf(":");
                        					let addrString = value.substr(indexStart+1);
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
								else if(item.variableType.includes("record type"))
								{
									if(matches)
									{
										let indexStart = info[info.length-1].indexOf(":");
										item.variableInfo = info[info.length-1].substr(indexStart+1).trim();
									}

									item.variableKind = ReflectKind.Struct;
								}
								else
								{
									if(matches)//simple variable
									{
										let indexStart = info[info.length-1].indexOf(":");
                        				item.variableValue = info[info.length-1].substr(indexStart+1).trim();
										item.variableKind = ReflectKind.Atomic;
									}
									else //stucture
									{
										item.variableKind = ReflectKind.Struct;
									}
								}
							}

							if(item.variableKind !== ReflectKind.Atomic &&
								item.variableKind !== ReflectKind.String)
							{
								let values : string = "";

								while(i < (msgLines.length-1))
								{
									let arrayData = msgLines[++i];

									if(arrayData !== "" && !arrayData.includes("\\"))
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
						}
					}
				}
			}
		}
	}

	public parseStructValues(variable: VariableFileInfo, prm : Parameters) : DebugVariable[]
	{
		const shiftLevel : number = 4;
		let countItems : number = 0;
		let childs : DebugVariable[] = [];
		let items = variable.variableValue.split("\n");
		const matcherA = /^\s*\[(\d+)\](\-\[(\d+)\])?:\s*(\S+)/;//Array ([0]-[2]: 23)
		const matcherS = /^\s*(\S+):\s*(\S+)/;//Struct (name: 23)

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

				if(v.includes("["))//array
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
								kind = this.getKindVariable(items[prm.counter]);
								let indexStart = v.indexOf(":");
								itemInfo = v.substr(indexStart+1).trim();
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
						kind = this.getKindVariable(items[prm.counter]);
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
								kind = this.getKindVariable(items[prm.counter]);
								let indexStart = v.indexOf(":");
								itemInfo = v.substr(indexStart+1).trim();
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
						kind = this.getKindVariable(items[prm.counter]);
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
					let count : number = 0;
					let name : string = "";
					let value = matches[matches.length-1];
					prm.level = itemLevel;

					if(matches.length === 3)//struct info
					{
						count = 1;
						name = matches[1];
					}
					else if(matches.length === 5)//array  info
					{
						if(matches[3])
						{
							count = parseInt(matches[3], 10) - parseInt(matches[1], 10) + 1;
						}
						else
						{
							count = 1;
						}
					}

					for(let i = 0; i < count; i++)
					{
						if(matches.length === 5)
						{
							name =  "[" + countItems++ + "]";
						}

						let child = <DebugVariable>
						{
							name: name,
							addr: 0,
							type: "atomic",
							kind: ReflectKind.Atomic,
							value: value,
							info: "",
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
							addr: 0,
							type: typeName,
							kind: kind,
							value: value,
							info: itemInfo,
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
		if(item.includes("["))//array
		{
			return ReflectKind.Array;
		}
		else //struct
		{
			return ReflectKind.Struct;
		}
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
			const matcher = /^\s*\d*\t\s*(\d+)/;
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
			const matcher = /^\s*\d*\t\s*(\d+)/;
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