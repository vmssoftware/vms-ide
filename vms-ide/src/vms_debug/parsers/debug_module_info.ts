export interface IModuleInfo
{
	moduleName: string;
	sourcePath: string;
	listingPath: string;
	language: string;
}

export class HolderModuleInfo
{
	private moduleInfo = new Map<string, IModuleInfo>();
	private fileInfo = new Map<string, IModuleInfo>();

	public getSize() : number
	{
		return this.moduleInfo.size;
	}

	public getItems() : IModuleInfo[]
	{
		let infos: IModuleInfo[] = [];
		for(let [moduleName, moduleInfo] of this.moduleInfo) {
			infos.push(moduleInfo);
		}
		return infos;
	}

	public getItem(moduleName : string) : IModuleInfo
	{
		let info = this.moduleInfo.get(moduleName.toUpperCase());
		if (info !== undefined) {
			return info;
		}
		return <IModuleInfo> { moduleName: "", sourcePath: "", listingPath: "", language: "" };
	}

	public getItemByPath(sourcePath : string) : IModuleInfo
	{
		let info = this.fileInfo.get(sourcePath);
		if (info !== undefined) {
			return info;
		}
		return <IModuleInfo> { moduleName: "", sourcePath: "", listingPath: "", language: "" };
	}

	public setItem(moduleName: string, sourcePath: string, listingPath: string, language: string)
	{
		let item = <IModuleInfo> { moduleName: moduleName.toUpperCase(), sourcePath, listingPath, language };
		this.moduleInfo.set(item.moduleName, item);
		this.fileInfo.set(item.sourcePath, item);
	}
}