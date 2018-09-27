export enum DebugCmdVMS
{
	dbgRunExe = "run",
	dbgRerunExe = "rerun",
	dbgCurrentLine = "type",
	dbgStop = "stop",//pause debuging
	dbgExit = "exit",//exit from debuging

	dbgGo = "go",
	dbgStep = "step /over",
	dbgStepIn = "step /into",
	dbgStepOut = "step /return",

	dbgBreakPointSet = "set break %line",
	dbgBreakPointRemove = "cancel break %line",
	dbgBreakPointsRemove = "cancel break /all",
	dbgBreakPointShow = "show break",
	dbgBreakPointsActivate = "activate break /all",
	dbgBreakPointActivate = "activate break %line",
	dbgBreakPointsDeactivate = "deactivate break /all",
	dbgBreakPointDeactivate = "deactivate break %line",

	dbgExamine = "examine",
	dbgEvaluate = "evaluate",
	dbgDeposit = "deposit",

	dbgCallStack = "show calls /image",
	dbgStack = "show stack",

	dbgDump = "dump",
	dbgDumpHex = "dump/hex",
}


export class DebugCommands
{
	//general
	public run(fileName : string) : string
	{
		return DebugCmdVMS.dbgRunExe + " " + fileName;
	}

	public rerun() : string
	{
		return DebugCmdVMS.dbgRerunExe;
	}

	public currentLine() : string//show current line
	{
		return DebugCmdVMS.dbgCurrentLine;
	}

	public stop() : string
	{
		return DebugCmdVMS.dbgStop;
	}

	public exit() : string
	{
		return DebugCmdVMS.dbgExit;
	}

	public go() : string
	{
		return DebugCmdVMS.dbgGo;
	}
	public step() : string
	{
		return DebugCmdVMS.dbgStep;
	}
	public stepIn() : string
	{
		return DebugCmdVMS.dbgStepIn;
	}
	public stepOut() : string
	{
		return DebugCmdVMS.dbgStepOut;
	}

	//break points
	public breakPointSet(numberLine : number) : string
	{
		return DebugCmdVMS.dbgBreakPointSet + " " + numberLine.valueOf;
	}
	public breakPointRemove(numberLine : number) : string
	{
		return DebugCmdVMS.dbgBreakPointRemove + " " + numberLine.valueOf;
	}
	public breakPointsRemove() : string
	{
		return DebugCmdVMS.dbgBreakPointsRemove;
	}
	public breakPointShow() : string
	{
		return DebugCmdVMS.dbgBreakPointShow;
	}
	public breakPointsActivate() : string
	{
		return DebugCmdVMS.dbgBreakPointsActivate;
	}
	public breakPointActivate(numberLine : number) : string
	{
		return DebugCmdVMS.dbgBreakPointActivate + " " + numberLine.valueOf;
	}
	public breakPointsDeactivate() : string
	{
		return DebugCmdVMS.dbgBreakPointsDeactivate;
	}
	public breakPointDeactivate(numberLine : number) : string
	{
		return DebugCmdVMS.dbgBreakPointDeactivate + " " + numberLine.valueOf;
	}


	//get value of variable by name
	//(show format) (file\locateFunc\nameVar:       value) - local variable
	//(show format) (file\nameVar:       value) - global variable
	public examine(nameVar : string) : string
	{
		return DebugCmdVMS.dbgExamine + " " + nameVar;
	}
	//get value of variable by name (don't for array)
	public evaluate(nameVar : string) : string
	{
		return DebugCmdVMS.dbgEvaluate + " " + nameVar;
	}

	//set value of variable by name
	public deposit(nameVar : string, value : number) : string
	{
		return DebugCmdVMS.dbgDeposit + " " + nameVar + "=" + value.valueOf;
	}

	//show call stack
	public callStack() : string
	{
		return DebugCmdVMS.dbgCallStack;
	}
	//show stack
	public stack() : string
	{
		return DebugCmdVMS.dbgStack;
	}

	//dump
	public dump(nameVar : string) : string
	{
		return DebugCmdVMS.dbgDump + " " + nameVar;
	}
	public dumpAddress(addressStart : string, addressStop : string) : string
	{
		return DebugCmdVMS.dbgDump + " " + addressStart + ":" + addressStop;
	}
	public dumpHex(nameVar : string) : string
	{
		return DebugCmdVMS.dbgDumpHex + " " + nameVar;
	}
	public dumpAddressHex(addressStart : string, addressStop : string) : string
	{
		return DebugCmdVMS.dbgDumpHex + " " + addressStart + ":" + addressStop;
	}

	//trace
	//watch
}