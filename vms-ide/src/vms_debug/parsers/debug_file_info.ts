export interface DebugFileInfo
{
	filePath: string;
	moduleName: string;
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

	public getShiftLine(moduleName : string) : number
	{
		moduleName = moduleName.toLowerCase();

		for (let item of this.fileInfo)
		{
			if(item.moduleName === moduleName)
			{
				return item.shitfLine;
			}
		}

		return -1;
	}

	public getIndexItem(moduleName : string) : number
	{
		let index : number = -1;
		moduleName = moduleName.toLowerCase();

		for (let item of this.fileInfo)
		{
			index++;

			if(item.moduleName === moduleName)
			{
				return index;
			}
		}

		return index;
	}

	public getItem(moduleName : string) : DebugFileInfo | undefined
	{
		moduleName = moduleName.toLowerCase();

		for (let item of this.fileInfo)
		{
			if(item.moduleName === moduleName)
			{
				return item;
			}
		}

		return undefined;
	}

	public setItem(filePath: string, moduleName : string, shitfLine : number, currLine: number) : number
	{
		moduleName = moduleName.toLowerCase();

		let item = <DebugFileInfo> { filePath, moduleName, shitfLine, currLine };

		return this.fileInfo.push(item);
	}
}