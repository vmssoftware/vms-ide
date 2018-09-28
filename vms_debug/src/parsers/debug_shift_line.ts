export interface ShiftLine
{
	fileName: string;
	shift: number;
}

export class HolderShiftLine
{
	private shiftLines = new Array<ShiftLine>();

	public getSize() : number
	{
		return this.shiftLines.length;
	}

	public getShiftLine(fileName : string) : number
	{
		for (let item of this.shiftLines)
		{
			if(item.fileName === fileName)
			{
				return item.shift;
			}
		}

		return -1;
	}

	public setShiftLine(fileName : string, shift : number) : number
	{
		let item = <ShiftLine> { fileName, shift };

		return this.shiftLines.push(item);
	}
}