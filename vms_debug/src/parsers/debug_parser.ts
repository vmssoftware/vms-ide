import { HolderShiftLine } from './debug_shift_line';

export enum MessageDebuger
{
	msgStepped = "stepped to",
	msgBreak = "break at routine",
	msgKeyDbg = "%DEBUG-I-EXITSTATUS",
	msgEnd = "%DEBUG-I-EXITSTATUS, is '%SYSTEM-S-NORMAL, normal successful completion",
}


export class DebugParser
{
	private shiftLines : HolderShiftLine;

	constructor()
	{
		this.shiftLines = new HolderShiftLine();
	}


	public getCurrentLineNumber(data : string, curSourceFile : string, sourceLines: string[]) : number
	{
		let currentLineNumber : number = -1;
		let msgLines =data.split("\n");

		for(let i = 0; i < msgLines.length; i++)
		{
			if(msgLines[i].includes(MessageDebuger.msgStepped) ||
				msgLines[i].includes(MessageDebuger.msgStepped))
			{
				let name = this.findeFileName(msgLines[i]);
				let shift = this.shiftLines.getShiftLine(name);
				let array = msgLines[i+1].split(":");//number: string of code; array[0]-number, array[1]-string of code

				if(shift === -1)
				{
					//calculate shift line
					shift = this.calculateShiftLine(msgLines[i+1], sourceLines);

					if(shift !== -1)//calculate successfull
					{
						this.shiftLines.setShiftLine(name, shift);
						currentLineNumber = parseInt(array[0], 10) - shift;
					}
				}
				else
				{
					currentLineNumber = parseInt(array[0], 10) - shift;
				}

				break;
			}
		}

		return currentLineNumber;
	}

	//examples a lines
	//stepped to HELLO\main\%LINE 1631
	//break at routine HELLO\main
	private findeFileName(line : string) : string
	{
		let name :string = "";
		let array = line.split(" ");

		for (let item of array)
		{
			if(item.includes("\\"))
			{
				item.toLowerCase();
				let names = item.split("\\");
				name = names[0];

				break;
			}
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
}