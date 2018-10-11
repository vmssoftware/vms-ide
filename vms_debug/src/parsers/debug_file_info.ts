export interface DebugFileInfo
{
	filePath: string;
	fileName: string;
	shitfLine: number;
	currLine: number;
}

export class HolderDebugFileInfo
{
	private fileInfo = new Array<DebugFileInfo>();

	public getSize() : number
	{
		return this.fileInfo.length;
	}

	public getShiftLine(fileName : string) : number
	{
		fileName = fileName.toLowerCase();

		for (let item of this.fileInfo)
		{
			if(item.fileName === fileName)
			{
				return item.shitfLine;
			}
		}

		return -1;
	}

	public getIndexItem(fileName : string) : number
	{
		let index : number = -1;
		fileName = fileName.toLowerCase();

		for (let item of this.fileInfo)
		{
			index++;

			if(item.fileName === fileName)
			{
				return index;
			}
		}

		return index;
	}

	public getItem(fileName : string) : DebugFileInfo | undefined
	{
		fileName = fileName.toLowerCase();

		for (let item of this.fileInfo)
		{
			if(item.fileName === fileName)
			{
				return item;
			}
		}

		return undefined;
	}

	public setItem(filePath: string, fileName : string, shitfLine : number, currLine: number) : number
	{
		let item = <DebugFileInfo> { filePath, fileName, shitfLine, currLine };

		return this.fileInfo.push(item);
	}
}