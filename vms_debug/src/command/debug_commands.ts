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
	dbgStepReturn = "step /return",

	dbgBreakPointSet = "set break",
	dbgBreakPointRemove = "cancel break",
	dbgBreakPointsRemove = "cancel break /all",
	dbgBreakPointShow = "show break",
	dbgBreakPointsActivate = "activate break /all",
	dbgBreakPointActivate = "activate break",
	dbgBreakPointsDeactivate = "deactivate break /all",
	dbgBreakPointDeactivate = "deactivate break",

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
	public stepReturn() : string
	{
		return DebugCmdVMS.dbgStepReturn;
	}

	//break points
	public breakPointSet(fileName : string, numberLine : number) : string
	{
		return DebugCmdVMS.dbgBreakPointSet + " " + fileName.toUpperCase()  + "\\%line " + numberLine.toString();
	}
	public breakPointRemove(fileName : string, numberLine : number) : string
	{
		return DebugCmdVMS.dbgBreakPointRemove + " " + fileName.toUpperCase()  + "\\%line " + numberLine.toString();
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
	public breakPointActivate(fileName : string, numberLine : number) : string
	{
		return DebugCmdVMS.dbgBreakPointActivate + " " + fileName.toUpperCase()  + "\\%line " + numberLine.toString();
	}
	public breakPointsDeactivate() : string
	{
		return DebugCmdVMS.dbgBreakPointsDeactivate;
	}
	public breakPointDeactivate(fileName : string, numberLine : number) : string
	{
		return DebugCmdVMS.dbgBreakPointDeactivate + " " + fileName.toUpperCase()  + "\\%line " + numberLine.toString();
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
		return DebugCmdVMS.dbgDeposit + " " + nameVar + "=" + value.toString();
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