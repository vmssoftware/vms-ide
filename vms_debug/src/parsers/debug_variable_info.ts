export enum ReflectKind
{
	Invalid = 0,
	Atomic,
	Array,
	Class,
	Func,
	Map,
	Pointer,
	String,
	Struct
}

export interface DebugVariable
{
	name: string;
	addr: number;
	type: string;
	kind: ReflectKind;
	value: string;
	info: string;
	len: number;
	children: DebugVariable[];
	unreadable: string;
	fullyQualifiedName: string;
}

export interface VariableFileInfo
{
	filePath: string;
	fileName: string;
	functionName: string;//if "" => global variable
	variableName: string;
	variableType: string;
	variableValue: string;
	variableInfo: string;
	variableAddress: number;
	variableKind: ReflectKind;
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