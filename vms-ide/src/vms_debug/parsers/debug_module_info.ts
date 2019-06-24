export interface IModuleInfo
{
	moduleName: string;
	sourcePath: string;
	listingPath: string;
	language: string;
}

export class HolderModuleInfo
{
	private moduleInfo = new Array<IModuleInfo>();	

	public getSize() : number
	{
		return this.moduleInfo.length;
	}

	public getItems() : Array<IModuleInfo>
	{
		return this.moduleInfo;
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

		return <IModuleInfo> { moduleName: "", sourcePath: "", listingPath: "", language: "" };
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

		return <IModuleInfo> { moduleName: "", sourcePath: "", listingPath: "", language: "" };
	}

	public setItem(moduleName: string, sourcePath: string, listingPath: string, language: string) : number
	{
		moduleName = moduleName.toUpperCase();

		let item = <IModuleInfo> { moduleName, sourcePath, listingPath, language };

		return this.moduleInfo.push(item);
	}
}