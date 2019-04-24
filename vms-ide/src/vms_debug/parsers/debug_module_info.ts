export interface IModuleInfo
{
	moduleName: string;
	sourcePath: string;
	listingPath: string;
}

export class HolderModuleInfo
{
	private moduleInfo = new Array<IModuleInfo>();	

	public getSize() : number
	{
		return this.moduleInfo.length;
	}

	public getIndexItem(moduleName : string) : number
	{
		let index : number = -1;
		moduleName = moduleName.toUpperCase();

		for (let item of this.moduleInfo)
		{
			index++;

			if(item.moduleName === moduleName)
			{
				return index;
			}
		}

		return index;
	}

	public getItem(moduleName : string) : IModuleInfo
	{
		moduleName = moduleName.toUpperCase();

		for (let item of this.moduleInfo)
		{
			if(item.moduleName === moduleName)
			{
				return item;
			}
		}

		return <IModuleInfo> { moduleName: "", sourcePath: "", listingPath: "" };
	}

	public getItemByPath(sourcePath : string) : IModuleInfo
	{
		for (let item of this.moduleInfo)
		{
			if(item.sourcePath === sourcePath)
			{
				return item;
			}
		}

		return <IModuleInfo> { moduleName: "", sourcePath: "", listingPath: "" };
	}

	public setItem(moduleName: string, sourcePath: string, listingPath: string) : number
	{
		moduleName = moduleName.toUpperCase();

		let item = <IModuleInfo> { moduleName, sourcePath, listingPath };

		return this.moduleInfo.push(item);
	}
}