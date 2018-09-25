export enum DebugCmdVMS
{
	dbgRunExe = "run",
	dbgGo = "go",
	dbgStep = "step",
	dbgStop = "exit",
}


export class DebugCommands
{
	public run(fileName : string) : string
	{
		return DebugCmdVMS.dbgRunExe + fileName;
	}

	public go() : string
	{
		return DebugCmdVMS.dbgGo;
	}

	// public step() : string
	// {
	// 	return DebugCmdVMS.dbgStep;
	// }

	public step(line : string) : string
	{
		return DebugCmdVMS.dbgStep;
	}

	public exit() : string
	{
		return DebugCmdVMS.dbgStop;
	}
}