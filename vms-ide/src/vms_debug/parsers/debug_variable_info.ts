export enum ReflectKind
{
	Value = -1,
	Invalid = 0,
	Atomic,
	Block,
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
	nameFull: string;
	addr: number;
	type: string;
	kind: ReflectKind;
	value: string;
	info: string;
	prefix: string;
	len: number;
	children: DebugVariable[];
	unreadable: string;
	fullyQualifiedName: string;
}

export interface VariableFileInfo
{
	filePath: string;
	moduleName: string;
	wrapName: string;//wrap function name
	functionName: string;//if "" => global variable
	variableName: string;
	variableNameFull: string;
	variableType: string;
	variableValue: string;
	variableInfo: string;
	variablePrefix: string;
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

	public getVariableFile(pathName : string) : VariableFileInfo[] | undefined
	{
		return this.variables.get(pathName);
	}

	public setVariableFile(pathName : string, vars: VariableFileInfo[]) : void
	{
		this.variables.set(pathName, vars);
	}
}