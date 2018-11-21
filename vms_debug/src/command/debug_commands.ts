export enum DebugCmdVMS
{
	dbgRunExe = "run",
	dbgRerunExe = "rerun",
	dbgStop = "stop",//pause debuging
	dbgExit = "exit",//exit from debuging

	dbgGo = "go",
	dbgStep = "step",
	dbgStepOver = "step /over",
	dbgStepIn = "step /into",
	dbgStepReturn = "step /return",

	dbgBreakPointSet = "set break",
	dbgBreakPointRemove = "cancel break",
	dbgBreakPointShow = "show break",
	dbgBreakPointActivate = "activate break",
	dbgBreakPointDeactivate = "deactivate break",

	dbgCurrentLine = "type",
	dbgExamine = "examine",
	dbgEvaluate = "evaluate",
	dbgDeposit = "deposit",

	dbgCallStack = "show calls",
	dbgStack = "show stack",

	dbgDump = "dump",

	dbgSetModeNoWait = "set mode nowait",
	dbgSetModeScreen = "set mode screen",
	dbgSelect = "select",
	dbgSetDisplay = "display",
}

export class CommandMessage
{
	private body : string;
	private params: string;
	private command: string;

	constructor(body : string, params: string)
	{
		this.body = body;
		this.params = params;

		if(params === "")
		{
			this.command = this.body;
		}
		else
		{
			this.command = this.body + " " + this.params;
		}
	}

	public getBody() : string
	{
		return this.body;
	}

	public getCommand() : string
	{
		return this.command;
	}
}


export class DebugCommands
{
	//general
	public run(fileName : string) : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgRunExe, fileName);
	}

	public rerun() : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgRerunExe, "");
	}

	public showCurrentLine() : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgCurrentLine, "");
	}

	public stop() : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgStop, "");
	}

	public exit() : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgExit, "");
	}

	public go() : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgGo, "");
	}
	public step() : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgStepOver, "");
	}
	public stepIn() : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgStepIn, "");
	}
	public stepReturn() : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgStepReturn, "");
	}

	//break points
	public breakPointSet(fileName : string, numberLine : number) : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgBreakPointSet, fileName.toUpperCase()  + "\\%line " + numberLine.toString());
	}
	public breakPointRemove(fileName : string, numberLine : number) : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgBreakPointRemove, fileName.toUpperCase()  + "\\%line " + numberLine.toString());
	}
	public breakPointsRemove() : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgBreakPointRemove, "/all");
	}
	public breakPointShow() : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgBreakPointShow, "");
	}
	public breakPointsActivate() : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgBreakPointActivate, "/all");
	}
	public breakPointActivate(fileName : string, numberLine : number) : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgBreakPointActivate, fileName.toUpperCase()  + "\\%line " + numberLine.toString());
	}
	public breakPointsDeactivate() : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgBreakPointDeactivate, "/all");
	}
	public breakPointDeactivate(fileName : string, numberLine : number) : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgBreakPointDeactivate, fileName.toUpperCase()  + "\\%line " + numberLine.toString());
	}


	//get value of variable by name
	//(show format) (file\locateFunc\nameVar:       value) - local variable
	//(show format) (file\nameVar:       value) - global variable
	public examine(nameVar : string) : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgExamine, nameVar);
	}
	//get value of variable by name (don't for array)
	public evaluate(nameVar : string) : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgEvaluate, nameVar);
	}

	//set value of variable by name
	public deposit(nameVar : string, value : number) : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgDeposit, nameVar + "=" + value.toString());
	}

	//show call stack
	public callStack() : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgCallStack, "");
	}
	//show stack
	public stack() : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgStack, "");
	}

	//dump
	public dump(nameVar : string) : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgDump, nameVar);
	}
	public dumpAddress(addressStart : string, addressStop : string) : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgDump, addressStart + ":" + addressStop);
	}
	public dumpHex(nameVar : string) : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgDump, "/hex" + " " + nameVar);
	}
	public dumpAddressHex(addressStart : string, addressStop : string) : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgDump, "/hex" + " " + addressStart + ":" + addressStop);
	}

	//trace
	//watch

	public modeNoWait() : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgSetModeNoWait, "");
	}
	public modeScreen() : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgSetModeScreen, "");
	}
	public redirectDataToDisplay(dataName : string, displayName : string) : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgSelect, "/" + dataName + " " + displayName);
	}
	public setDisplay(displayName : string, positionName : string, dataType : string) : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgSetDisplay, displayName + " AT " + positionName + " " + dataType);
	}
	public removeDisplay(displayName : string) : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgSetDisplay, "/remove " + displayName);
	}

	public customCmdNoParam(command : string) : CommandMessage
	{
		return new CommandMessage(command, "");
	}
}