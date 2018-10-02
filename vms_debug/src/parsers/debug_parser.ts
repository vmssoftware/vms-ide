import { HolderDebugFileInfo, DebugFileInfo } from './debug_file_info';
import { readFileSync } from 'fs';

export enum MessageDebuger
{
	msgStepped = "stepped to",
	msgBreak = "break at routine",
	msgKeyDbg = "%DEBUG-I-EXITSTATUS",
	msgEnd = "%DEBUG-I-EXITSTATUS, is '%SYSTEM-S-NORMAL, normal successful completion",

// 	%DCL-W-ACTIMAGE, error activating image HELLO
// -CLI-E-IMAGEFNF, image file not found BOSTON$DKA400:[KULIKOVSKIY.DEMOS]HELLO.EXE
// go
// %DEBUG-E-NOPROCESSES, the current command is targetted at an empty process set
}


export class DebugParser
{
	private fleInfo : HolderDebugFileInfo;

	constructor()
	{
		this.fleInfo = new HolderDebugFileInfo();
	}


	public getCurrentLineInfo(data : string, sourcePaths: string[]) : DebugFileInfo | undefined
	{
		let sourceLines: string[];
		let currentLineNumber : number = -1;
		let debugFileInfo : DebugFileInfo | undefined;
		let msgLines = data.split("\n");

		for(let i = 0; i < msgLines.length; i++)
		{
			if(msgLines[i].includes(MessageDebuger.msgStepped) ||
				msgLines[i].includes(MessageDebuger.msgBreak))
			{
				let name = this.findFileName(msgLines[i]);
				let shift = this.fleInfo.getShiftLine(name);

				let array = msgLines[i+1].split(":");//number: string of code; array[0]-number, array[1]-string of code

				if(shift === -1)
				{
					let pathFile = this.findPathFileByName(name, sourcePaths);
					sourceLines = this.loadSource(pathFile);

					//calculate shift line
					shift = this.calculateShiftLine(msgLines[i+1], sourceLines);

					if(shift !== -1)//calculate successfull
					{
						currentLineNumber = parseInt(array[0], 10) - shift;
						this.fleInfo.setItem(pathFile, name, shift, currentLineNumber);
						debugFileInfo = this.fleInfo.getItem(name);
					}
				}
				else
				{
					currentLineNumber = parseInt(array[0], 10) - shift;
					debugFileInfo = this.fleInfo.getItem(name);

					if(debugFileInfo)
					{
						debugFileInfo.currLine = currentLineNumber;
					}
				}

				break;
			}
		}

		return debugFileInfo;
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
		let name :string = "";
		let array = line.split(" ");

		for (let item of array)
		{
			if(item.includes("\\"))
			{
				item = item.toLowerCase();
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

	private loadSource(file: string): string[]
	{
		return readFileSync(file).toString().split('\n');
	}
}