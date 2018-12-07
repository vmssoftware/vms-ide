export interface VariableFileInfo
{
	filePath: string;
	fileName: string;
	functionName: string;//if "" => global variable
	variableName: string;
	variableType: string;
	variableValue: string;
}

export class HolderDebugVariableInfo
{
	private variables = new Map<string, VariableFileInfo[]>();


	public getSize() : number
	{
		return this.variables.size;
	}

	public getVariableFile(parhName : string) : VariableFileInfo[] | undefined
	{
		return this.variables.get(parhName);
	}

	public setVariableFile(parhName : string, vars: VariableFileInfo[]) : void
	{
		this.variables.set(parhName, vars);
	}
}