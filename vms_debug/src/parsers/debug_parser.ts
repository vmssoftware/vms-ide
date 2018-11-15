import { HolderDebugFileInfo } from './debug_file_info';
import { DebugFileInfo } from './debug_file_info';
import { DebugCmdVMS, CommandMessage } from '../command/debug_commands';
import { Queue } from '../queue/queues';
import { ftpPathSeparator } from '@vorfol/common';
import { FileManagerExt } from '../ext-api/file_manager';


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
	private fleInfo : HolderDebugFileInfo;
	private commandDone : boolean;
	private topicNumberString : Array<number> = new Array<number>();
	private displayDataString : string[] = ["", "", ""];
	private fileManager : FileManagerExt;

	constructor()
	{
		this.currentName = "";
		this.fleInfo = new HolderDebugFileInfo();
		this.fileManager = new FileManagerExt();
		this.commandDone = false;
	}


	public parseDebugData(command : CommandMessage, data : string, sourcePaths: string[], lisPaths: string[])
	{
		if(data !== "")
		{
			let cmd = command.getBody();

			this.splitData(command, data);

			let msgLines = this.displayDataString[1].split("\n");//debugger data

			switch(cmd)
			{
				case DebugCmdVMS.dbgRunExe:
				case DebugCmdVMS.dbgRerunExe:
				case DebugCmdVMS.dbgStop:
				case DebugCmdVMS.dbgExit:
					this.commandDone = true;
					break;

				case DebugCmdVMS.dbgGo:
				case DebugCmdVMS.dbgStep:
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

				case DebugCmdVMS.dbgCurrentLine:
				case DebugCmdVMS.dbgExamine:
				case DebugCmdVMS.dbgEvaluate:
				case DebugCmdVMS.dbgDeposit:
				case DebugCmdVMS.dbgCallStack:
				case DebugCmdVMS.dbgStack:
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

				default:
					break;
			}
		}
	}


	private splitData(command : CommandMessage, data : string)
	{
		if(data.length > 2)
		{
			let typeData = data.substr(0, 2);
			let dataMsg = data.substr(2);

			//clean the old data
			this.displayDataString[0] = "";
			this.displayDataString[1] = "";
			this.displayDataString[2] = "";


			if(typeData === "C:")//command
			{
				let userData = dataMsg.replace(command.getCommand(), "");
				this.queueMsgCommand.push(MessagePrompt.prmtCMD + command.getCommand());

				if(userData !== "")//data
				{
					this.parseEscSequence(userData);
				}
			}
			else//data
			{
				this.parseEscSequence(dataMsg);
			}
		}
	}

	private parseEscSequence(data : string)
	{
		let positionOld : number = 0;
		let escapes = data.split("\x1B");
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
										this.displayDataString[i] += " " + item.substr(index, item.length);
									}
									else
									{
										if(this.displayDataString[i] === "")
										{
											this.displayDataString[i] = item.substr(index, item.length);
										}
										else
										{
											this.displayDataString[i] += "\n" + item.substr(index, item.length);
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

	private parseLineMsg(msgLine: string, sourcePaths: string[], lisPaths: string[])
	{
		if(msgLine.includes(MessageDebuger.msgStepped) ||
			msgLine.includes(MessageDebuger.msgBreak) ||
			msgLine.includes(MessageDebuger.msgSteppedOn) ||
			msgLine.includes(MessageDebuger.msgBreakOn))
		{
			this.commandDone = true;
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

			let shift = this.fleInfo.getShiftLine(fileName);

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
					this.fleInfo.setItem(pathFile, fileName, shift, currentLineNumber);
					debugFileInfo = this.fleInfo.getItem(fileName);
				}
			}
			else
			{
				currentLineNumber = parseInt(array[0], 10) - shift;
				debugFileInfo = this.fleInfo.getItem(fileName);

				if(debugFileInfo)
				{
					debugFileInfo.currLine = currentLineNumber;
				}
			}
		}

		return debugFileInfo;
	}

	//examples a lines
	// DBG> show calls
	// module name    routine name     line           rel PC           abs PC
	// *REM            rem                12       0000000000000012 0000000000020432
	// *HELLO          main             1648       0000000000000360 0000000000020360
	// *HELLO          __main           1634       00000000000000E0 00000000000200E0
	// 											   FFFFFFFF80A3CF10 FFFFFFFF80A3CF10
	public async parseCallStackMsg(data : string, sourcePaths: string[], lisPaths: string[], startFrame: number, endFrame: number) //: any
	{
		let numberLine : number = -1;
		const frames = new Array<any>();
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
				let shift = this.fleInfo.getShiftLine(fileName);

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
						this.fleInfo.setItem(pathFile, fileName, shift, numberLine);
					}
					else
					{
						numberLine = parseInt(numberLineDebug, 10) - this.fleInfo.getShiftLine(fileName);
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

		return {
			frames: frames,
			count: frames.length
		};
	}

	public parseVariableMsg()
	{

	}


	public getCommandStatus() : boolean
	{
		let status = this.commandDone;
		this.commandDone = false;

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
	public findeBreakPointNumberLine(currentNumberLine : number, sourceLisLines: string[]) : number
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