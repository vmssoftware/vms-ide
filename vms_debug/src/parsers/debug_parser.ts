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
	private queueMsgFileInfo = new Queue<DebugFileInfo>();
	private queueMsgDebug = new Queue<string>();
	private queueMsgUser = new Queue<string>();
	private queueMsgCommand = new Queue<string>();
	private queueMsgData = new Queue<string>();
	private fleInfo : HolderDebugFileInfo;
	private dbgCmd : DebugCommands;


	constructor(commands : DebugCommands)
	{
		this.currentName = "";
		this.fleInfo = new HolderDebugFileInfo();
		this.dbgCmd = commands;
	}


	public parseDebugData(data : string, sourcePaths: string[], lisPaths: string[])
	{
		let msgLines = data.split("\n");
		let command = this.dbgCmd.getCurrentCommand();

		if(command !== "")
		{
			if(msgLines[0].trim() !== "")
			{
				this.queueMsgCommand.push(MessagePrompt.prmtCMD + msgLines[0].trim());
			}
		}

		switch(command)
		{
			case DebugCmdVMS.dbgRunExe:
			case DebugCmdVMS.dbgRerunExe:
			case DebugCmdVMS.dbgStop:
			case DebugCmdVMS.dbgExit:
				break;

			case "":
			case DebugCmdVMS.dbgGo:
			case DebugCmdVMS.dbgStep:
			case DebugCmdVMS.dbgStepIn:
			case DebugCmdVMS.dbgStepReturn:
				this.parseStepMsg(msgLines, sourcePaths, lisPaths);
				break;

			case DebugCmdVMS.dbgBreakPointSet:
			case DebugCmdVMS.dbgBreakPointRemove:
			case DebugCmdVMS.dbgBreakPointShow:
			case DebugCmdVMS.dbgBreakPointActivate:
			case DebugCmdVMS.dbgBreakPointDeactivate:
				break;

			case DebugCmdVMS.dbgCurrentLine:
			case DebugCmdVMS.dbgExamine:
			case DebugCmdVMS.dbgEvaluate:
			case DebugCmdVMS.dbgDeposit:
			case DebugCmdVMS.dbgCallStack:
			case DebugCmdVMS.dbgStack:
			case DebugCmdVMS.dbgDump:
				for(let i = 1; i < msgLines.length; i++)
				{
					this.queueMsgData.push(msgLines[i]);
				}
				break;

			default:
				break;
		}
	}


	private parseStepMsg(msgLines: string[], sourcePaths: string[], lisPaths: string[])
	{
		let lisLines: string[];
		let currentLineNumber : number = -1;
		let debugFileInfo : DebugFileInfo | undefined;

		for(let i = 1; i < msgLines.length; i++)
		{
			if(msgLines[i].includes(MessageDebuger.msgStepped) ||
				msgLines[i].includes(MessageDebuger.msgBreak) ||
				msgLines[i].includes(MessageDebuger.msgSteppedReturn) ||
				msgLines[i].includes(MessageDebuger.msgException))
			{
				let lineCode : number = i+1;

				for(let j = i+1; j < msgLines.length-1; j++)
				{
					if(msgLines[j].includes(MessageDebuger.msgKeyDbg) ||
						msgLines[j].includes(MessageDebuger.msgKeySys))//debug message
					{
						this.queueMsgDebug.push(MessagePrompt.prmtDBG + msgLines[j]);
						lineCode = msgLines.length-1;
					}
				}

				//number: string of code; array[0]-number, array[1]-string of code
				let array = msgLines[lineCode].split(":");
				let name = this.findFileName(msgLines[i]);

				if(name === "")
				{
					name = this.currentName;
				}
				else
				{
					this.currentName = name;
				}

				let shift = this.fleInfo.getShiftLine(name);

				if(shift === -1)
				{
					let pathFile = this.findPathFileByName(name, sourcePaths);
					let pathLisFile = this.findPathFileByName(name, lisPaths);
					lisLines = this.loadSource(pathLisFile);

					//calculate shift line
					shift = this.calculateShiftLine(msgLines[lineCode], lisLines);

					if(shift !== -1)//calculate successfull
					{
						currentLineNumber = parseInt(array[0], 10) - shift;
						this.fleInfo.setItem(pathFile, name, shift, currentLineNumber);
						debugFileInfo = this.fleInfo.getItem(name);

						if(debugFileInfo)
						{
							this.queueMsgFileInfo.push(debugFileInfo);
						}
					}
				}
				else
				{
					currentLineNumber = parseInt(array[0], 10) - shift;
					debugFileInfo = this.fleInfo.getItem(name);

					if(debugFileInfo)
					{
						debugFileInfo.currLine = currentLineNumber;
						this.queueMsgFileInfo.push(debugFileInfo);
					}
				}

				break;
			}
			else if(msgLines[i].includes(MessageDebuger.msgKeyDbg) ||
					msgLines[i].includes(MessageDebuger.msgKeySys) ||
					msgLines[i].includes(MessageDebuger.msgKeyDcl))//debug message
			{
				let len = msgLines[i].length;

				if(len > 80)
				{
					this.queueMsgDebug.push(MessagePrompt.prmtDBG + msgLines[i] + msgLines[i+1]);
					i++;
				}
				else
				{
					this.queueMsgDebug.push(MessagePrompt.prmtDBG + msgLines[i]);
				}
			}
			else//user message
			{
				if(msgLines[i].trim() !== "")
				{
					this.queueMsgUser.push(MessagePrompt.prmtUSER + msgLines[i]);
				}
			}
		}
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

			if(columns.length > 4)
			{
				const routineName = columns[1];
				let fileName = columns[0].substring(1);
				let numberLineDebug = columns[2];
				let pathFile = this.findPathFileByName(fileName, sourcePaths);
				let pathLisFile = this.findPathFileByName(fileName, lisPaths);
				let shift = this.fleInfo.getShiftLine(fileName);

				if(shift === -1)
				{
					let lisLines = this.loadSource(pathLisFile);

					//get source line
					numberLine = this.getNumberLineSourceCode(numberLineDebug, lisLines);
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

		return {
			frames: frames,
			count: frames.length
		};
	}

	public parseVariableMsg()
	{

	}

	public getFileInfo() : DebugFileInfo | undefined
	{
		let fileInfo : DebugFileInfo | undefined;

		if(this.queueMsgFileInfo.size() > 0)
		{
			fileInfo = this.queueMsgFileInfo.pop();
		}

		return fileInfo;
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


	private findPathFileByName(fileName : string, sourcePaths : string[]) : string
	{
		let pathFile : string = "";

		fileName = fileName.toLowerCase();

		for(let item of sourcePaths)
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

		if(parseInt(array[0], 10) !== NaN)
		{
			number = parseInt(array[1], 10);
		}

		return number;
	}
}