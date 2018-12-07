import { HolderDebugFileInfo } from './debug_file_info';
import { DebugFileInfo } from './debug_file_info';
import { DebugCmdVMS, CommandMessage } from '../command/debug_commands';
import { Queue } from '../queue/queues';
import { ftpPathSeparator } from '@vorfol/common';
import { FileManagerExt } from '../ext-api/file_manager';
import { TypeDataMessage } from '../net/shell-session';
import { VariableFileInfo, HolderDebugVariableInfo } from './debug_variable_info';
import { WorkspaceFolder } from 'vscode';


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
	msgEnd = "%DEBUG-I-EXITSTATUS, is '%SYSTEM-S-NORMAL, normal successful completion",
}

export enum MessagePrompt
{
	prmtCMD = "CMD: ",
	prmtDBG = "DBG: ",
	prmtUSER = "USER: ",
}


export class DebugParser
{
	private currentName : string;
	private queueMsgDebug = new Queue<string>();
	private queueMsgUser = new Queue<string>();
	private queueMsgCommand = new Queue<string>();
	private queueMsgData = new Queue<string>();
	private fileInfo : HolderDebugFileInfo;
	private varsInfo : HolderDebugVariableInfo;
	private commandDone : boolean;
	private commandButtonDone : boolean;
	private topicNumberString : Array<number> = new Array<number>();
	private displayDataString : string[] = ["", "", ""];
	private fileManager : FileManagerExt;
	private framesOld = new Array<any>();

	constructor(public folder: WorkspaceFolder | undefined)
	{
		this.currentName = "";
		this.fileInfo = new HolderDebugFileInfo();
		this.varsInfo = new HolderDebugVariableInfo();
		this.fileManager = new FileManagerExt(folder?folder.name:"");
		this.commandDone = false;
		this.commandButtonDone = false;
	}


	public parseDebugData(command : CommandMessage, type: TypeDataMessage, data : string, sourcePaths: string[], lisPaths: string[])
	{
		if(data !== "")
		{
			let cmd = command.getBody();

			this.splitData(command, type, data);

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


	private splitData(command : CommandMessage, type: TypeDataMessage, data : string)
	{
		if(data.length > 0)
		{
			//clean the old data
			this.displayDataString[0] = "";//debugger message
			this.displayDataString[1] = "";//debugger data
			this.displayDataString[2] = "";//user data

			if(type === TypeDataMessage.typeCmd)//command
			{
				let userData = data.replace(command.getCommand(), "");
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
	}

	private parseEscSequence(data : string)
	{
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
								this.topicNumberString.push(position[0]);
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
		}
		else if(msgLine.includes(MessageDebuger.msgKeyDbg) ||
				msgLine.includes(MessageDebuger.msgKeySys) ||
				msgLine.includes(MessageDebuger.msgKeyDcl))//debug message
		{
			this.queueMsgDebug.push(MessagePrompt.prmtDBG + msgLine);
		}
	}

	//examples debug lines
	//1629:   int count = 5;
	//1631:   for(int i = 1; i < 3; i++)
	public async parseNumberLineCodeMsg(fileName : string, msgLine: string, sourcePaths: string[], lisPaths: string[]) // : DebugFileInfo | undefined
	{
		let debugFileInfo : DebugFileInfo | undefined;

		if(msgLine.includes(":"))
		{
			let lisLines : string[];
			let currentLineNumber : number = -1;
			//number: string of code; array[0]-number, array[1]-string of code
			let array = msgLine.split(":");

			if(fileName === "")
			{
				fileName = this.currentName;
			}
			else
			{
				this.currentName = fileName;
			}

			let shift = this.fileInfo.getShiftLine(fileName);

			if(shift === -1)
			{
				let pathFile = this.findPathFileByName(fileName, sourcePaths);
				let pathLisFile = this.findPathFileByName(fileName, lisPaths);
				lisLines = await this.fileManager.loadContextFile(pathLisFile);

				//calculate shift line
				shift = this.calculateShiftLine(msgLine, lisLines);

				if(shift !== -1)//calculate successfull
				{
					currentLineNumber = parseInt(array[0], 10) - shift;
					this.fileInfo.setItem(pathFile, fileName, shift, currentLineNumber);
					debugFileInfo = this.fileInfo.getItem(fileName);
				}
			}
			else
			{
				currentLineNumber = parseInt(array[0], 10) - shift;
				debugFileInfo = this.fileInfo.getItem(fileName);

				if(debugFileInfo)
				{
					debugFileInfo.currLine = currentLineNumber;
				}
			}
		}

		return debugFileInfo;
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
					let localSource = await this.fileManager.getLocalSource();

					if(shift === -1)
					{
						let lisLines = await this.fileManager.loadContextFile(pathLisFile);
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
						name: `${routineName}(${startFrame})`,
						file: localSource!.root + ftpPathSeparator + pathFile,
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
	public parseVariableMsg(rootPath: string, sourcePaths: string[], data: string) : void
	{
		let filePath : string = "";
		let variableInfo = new Array<VariableFileInfo>();
		let msgLines = data.split("\n");

		for(let i = 0; i < msgLines.length; i++)
		{
			let type = msgLines[i].trim().split(/\s+/);

			if(type[0] === "data")
			{
				let info = msgLines[i].substr(type[0].length+1);
				let infoData = info.split("\\");
				let fileName = infoData[0];
				let functionName = infoData[1];
				let variableName = infoData[infoData.length-1];

				if(infoData.length === 2)
				{
					functionName = "";//it is global variable
				}

				if(filePath === "")
				{
					filePath = rootPath + ftpPathSeparator + this.findPathFileByName(fileName, sourcePaths);
				}

				if(variableName !== "__func__")
				{
					let variableType = msgLines[i+1].trim();
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
	public parseVariableValuesMsg(currentPath: string, data: string) : void
	{
		let variableInfo = this.varsInfo.getVariableFile(currentPath);
		let msgLines = data.split("\n");

		if(variableInfo)
		{
			for(let i = 0; i < msgLines.length; i++)
			{
				let info = msgLines[i].trim().split("\\");

				if(info.length < 2)//data of array
				{

				}
				else if(info.length < 3)//global variable
				{
					let nameVar = info[info.length-1].split(":")[0].trim();

					if(nameVar.includes("["))//array
					{
						nameVar = nameVar.split("[")[0];
					}

					for(let item of variableInfo)
					{
						if(item.functionName === "" &&
							nameVar === item.variableName)
						{
							if(info[info.length-1].includes("["))//array
							{
								let values : string = "";

								while(i < (msgLines.length-1))
								{
									let arrayData = msgLines[++i].trim();

									if(arrayData.includes("["))
									{
										values += arrayData + "\n";
									}
									else
									{
										--i;
										break;
									}
								}

								item.variableValue = values;
							}
							else
							{
								let values = info[info.length-1].split(":");
								item.variableValue = values[1].trim();
							}
						}
					}
				}
				else//local variable
				{
					let nameVar = info[info.length-1].split(":")[0].trim();

					if(nameVar.includes("["))//array
					{
						nameVar = nameVar.split("[")[0];
					}

					for(let item of variableInfo)
					{
						if(info[1] === item.functionName &&
							nameVar === item.variableName)
						{
							if(info[info.length-1].includes("["))//array
							{
								let values : string = "";

								while(i < (msgLines.length-1))
								{
									let arrayData = msgLines[++i].trim();

									if(arrayData.includes("["))
									{
										values += arrayData + "\n";
									}
									else
									{
										--i;
										break;
									}
								}

								item.variableValue = values;
							}
							else
							{
								let values = info[info.length-1].split(":");
								item.variableValue = values[1].trim();
							}
						}
					}
				}
			}
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

	//examples debug lines
	//1629:   int count = 5;
	//1631:   for(int i = 1; i < 3; i++)
	private calculateShiftLine(lineDbg : string, lisLines: string[]) : number
	{
		let shift : number = -1;
		let LineSourceCode : number = -1;
		let debugLine : number = -1;
		let array = lineDbg.split(":");
		let debugLineNumber = array[0].trim();

		LineSourceCode = this.getNumberLineSourceCode(debugLineNumber, lisLines);

		if(LineSourceCode > 0)
		{
			debugLine = parseInt(debugLineNumber, 10);
			shift = debugLine - LineSourceCode;
		}

		return shift;
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
}