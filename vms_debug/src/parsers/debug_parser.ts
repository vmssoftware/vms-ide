import { HolderDebugFileInfo, DebugFileInfo } from './debug_file_info';
import { readFileSync } from 'fs';
import { DebugCmdVMS } from '../command/debug_commands';

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


export class DebugParser
{
	private currentName : string;
	private queueMsgFileInfo = new QueueDbg<DebugFileInfo>();
	private queueMsgDebug = new QueueDbg<string>();
	private queueMsgUser = new QueueDbg<string>();
	private queueMsgCommand = new QueueDbg<string>();
	private queueMsgData = new QueueDbg<string>();
	private fleInfo : HolderDebugFileInfo;


	constructor()
	{
		this.currentName = "";
		this.fleInfo = new HolderDebugFileInfo();
	}


	public parseDebugData(data : string, sourcePaths: string[])
	{
		let sourceLines: string[];
		let currentLineNumber : number = -1;
		let debugFileInfo : DebugFileInfo | undefined;
		let msgLines = data.split("\n");

		if(msgLines[0].trim() !== "")
		{
			this.queueMsgCommand.push("CMD : " + msgLines[0]);
		}

		if(msgLines[0].includes(DebugCmdVMS.dbgExamine))//if replace switch !!!
		{
			for(let i = 1; i < msgLines.length; i++)
			{
				this.queueMsgData.push(msgLines[i]);
			}
		}
		else
		{
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
							this.queueMsgDebug.push("DBG : " + msgLines[j]);
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
						sourceLines = this.loadSource(pathFile);

						//calculate shift line
						shift = this.calculateShiftLine(msgLines[lineCode], sourceLines);

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
						this.queueMsgDebug.push("DBG : " + msgLines[i] + msgLines[i+1]);
					}
					else
					{
						this.queueMsgDebug.push("DBG : " + msgLines[i]);
					}

					i++;
				}
				else//user message
				{
					if(msgLines[i].trim() !== "")
					{
						this.queueMsgUser.push("USER : " + msgLines[i]);
					}
				}
			}
		}
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

		for(let item of sourcePaths)
		{
			let folders = item.split("\\");

			for(let folder of folders)
			{
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

	//examples a lines
	//1629:   int count = 5;
	//1631:   for(int i = 1; i < 3; i++)
	private calculateShiftLine(lineDbg : string, sourceLines: string[]) : number
	{
		let shift : number = -1;
		let array = lineDbg.split(":");
		const curLineCode = array[1].trim();

		for(let i = 0; i < sourceLines.length; i++)
		{
			const line = sourceLines[i].trim();

			if(line !== "" && curLineCode !== "")
			{
				if(curLineCode.includes(line))
				{
					shift = parseInt(array[0], 10) - i;
					break;
				}
			}
		}

		return shift;
	}

	private loadSource(file: string): string[]
	{
		return readFileSync(file).toString().split('\n');
	}


	public findeBreakPointNumberLine(currentNumberLine : number, sourceListLines: string[]) : number
	{
		let index = 1;
		let number : number = -1;

		let line = sourceListLines[currentNumberLine - 1 + 4].trim();
		let array = line.split(" ");

		while(array[index] === "")
		{
			index++;
		}

		number = parseInt(array[index], 10);

		return number;
	}
}

class QueueDbg<T>
{
    private data : any[] = [];

    push = (item: T) => this.data.push(item);
    pop = (): T => this.data.shift();
    size = () : number => this.data.length;
}