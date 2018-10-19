import { DebugProtocol } from "vscode-debugprotocol";

export enum variableTypesC
{
	typeChar = "char",
	typeShort = "short",
	typeInt = "int",
	typeLong = "long",
	typeFloat = "float",
	typeDouble = "double",
}

export class SourceParserC
{
	public getVariablesGlobal(sourceLines: string[]) : Array<DebugProtocol.Variable>
	{
		let variables = new Array<DebugProtocol.Variable>();

		// for(let item of sourceLines)
		// {
		// 	item = "";
		// }

		return variables;
	}
}