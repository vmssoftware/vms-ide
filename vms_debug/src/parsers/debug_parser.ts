import { HolderDebugFileInfo, DebugFileInfo } from './debug_file_info';
import { readFileSync } from 'fs';
import { DebugCmdVMS, DebugCommands } from '../command/debug_commands';
import { Queue } from '../queue/queues';


export enum MessageDebuger
{
	msgStepped = "stepped to",
	msgSteppedReturn = "stepped on return",
	msgBreak = "break at",
	msgException = "break on unhandled exception",
	msgKeyDbg = "%DEBUG-",
	msgKeySys = "%SYSTEM-",
	msgKeyDcl = "%DCL-",
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
	private dbgCmd : DebugCommands;
	private stateParseLine;
	private fileNameFind : string;
	private command : string;
	private commandDone : boolean;


	constructor(commands : DebugCommands)
	{
		this.currentName = "";
		this.fleInfo = new HolderDebugFileInfo();
		this.dbgCmd = commands;
		this.stateParseLine = 0;
		this.fileNameFind = "";
		this.command = "";
		this.commandDone = false;
	}


	public parseDebugData(data : string, sourcePaths: string[], lisPaths: string[])
	{
		let msgLines = data.split("\n");

		if(this.command === "")
		{
			this.command = this.dbgCmd.getCurrentCommand();
		}

		if(this.command !== "")
		{
			for(let line of msgLines)
			{
				line = line.trim();

				if(line !== "")
				{
					if(line.includes(this.command))
					{
						this.queueMsgCommand.push(MessagePrompt.prmtCMD + line);
						break;
					}
					else
					{
						if(line.includes(DebugCmdVMS.dbgStop))//???
						{
							this.command = this.dbgCmd.getCurrentCommand();
							this.queueMsgCommand.push(MessagePrompt.prmtCMD + this.command);
						}
					}
				}
			}
		}

		switch(this.command)
		{
			case DebugCmdVMS.dbgRunExe:
			case DebugCmdVMS.dbgRerunExe:
			case DebugCmdVMS.dbgStop:
			case DebugCmdVMS.dbgExit:
				this.commandDone = true;
				break;

			case "":
			case DebugCmdVMS.dbgGo:
			case DebugCmdVMS.dbgStep:
			case DebugCmdVMS.dbgStepIn:
			case DebugCmdVMS.dbgStepReturn:
				for(let item of msgLines)
				{
					if(item !== "")
					{
						if(this.command === "" || !item.includes(this.command))
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
						if(!item.includes(this.command))
						{
							this.queueMsgData.push(item);
						}
					}
				}
				this.commandDone = true;
				break;

			default:
				this.commandDone = true;
				break;
		}

		if(this.commandDone)
		{
			this.command = "";
		}
	}


	private parseLineMsg(msgLine: string, sourcePaths: string[], lisPaths: string[])
	{
		switch(this.stateParseLine)
		{
			case 0:
				if(msgLine.includes(MessageDebuger.msgStepped) ||
					msgLine.includes(MessageDebuger.msgBreak) ||
					msgLine.includes(MessageDebuger.msgSteppedReturn) ||
					msgLine.includes(MessageDebuger.msgException))
				{
					//this.fileNameFind = this.findFileName(msgLine);
					this.stateParseLine = 1;
				}
				else if(msgLine.includes(MessageDebuger.msgKeyDbg) ||
						msgLine.includes(MessageDebuger.msgKeySys) ||
						msgLine.includes(MessageDebuger.msgKeyDcl))//debug message
				{
					this.queueMsgDebug.push(MessagePrompt.prmtDBG + msgLine);
					this.stateParseLine = 0;
				}
				else//user message
				{
					if(msgLine.trim() !== "")
					{
						this.queueMsgUser.push(MessagePrompt.prmtUSER + msgLine);
					}

					this.stateParseLine = 0;
				}
				break;

			case 1:
				if(msgLine.includes(MessageDebuger.msgKeyDbg) ||
					msgLine.includes(MessageDebuger.msgKeySys))//debug message
				{
					this.queueMsgDebug.push(MessagePrompt.prmtDBG + msgLine);
				}
				else
				{
					//this.parseNumberLineCodeMsg(this.fileNameFind, msgLine, sourcePaths, lisPaths);
					this.commandDone = true;
					this.stateParseLine = 0;
				}
				break;

			default:
				break;
		}
	}

	//examples debug lines
	//1629:   int count = 5;
	//1631:   for(int i = 1; i < 3; i++)
	private parseNumberLineCodeMsg(fileName : string, msgLine: string, sourcePaths: string[], lisPaths: string[]) : DebugFileInfo | undefined
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
				lisLines = this.loadSource(pathLisFile);

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
	public parseCallStackMsg(data : string, sourcePaths: string[], lisPaths: string[], startFrame: number, endFrame: number) : any
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
					if(shift === -1)
					{
						let lisLines = this.loadSource(pathLisFile);
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
						file: pathFile,
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
			let folders = item.split("\\");

			for(let folder of folders)
			{
				folder = folder.toLowerCase();

				if(folder.includes(fileName))
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
	private findFileName(line : string) : string
	{
		let name : string = "";
		let findItem : string = "";
		let array = line.split(" ");

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
		let LineSourceCode : number = -1;

		for(let i = 3; i < lisLines.length; i++)
		{
			let items = lisLines[i].trim().split(/\s+/);
			let lisLineNumber = items[1];

			if(debugLineNumber === lisLineNumber)
			{
				LineSourceCode = i - 3;
				break;
			}
		}

		return LineSourceCode;
	}

	private loadSource(file: string): string[]
	{
		return readFileSync(file).toString().split('\n');
	}

	//examples a lines of lis file
	// 		1634 int main ()
	// 1    1635 {
	// 1    1636   int count = 5;
	// 1    1637   int del = 0;
	public findeBreakPointNumberLine(currentNumberLine : number, sourceLisLines: string[]) : number
	{
		let number : number = NaN;

		let line = sourceLisLines[currentNumberLine - 1 + 4].trim();
		let array = line.split(/\s+/);

		if(!Number.isNaN(parseInt(array[0], 10)))
		{
			number = parseInt(array[1], 10);
		}

		return number;
	}
}