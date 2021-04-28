export enum DebugCmdVMS
{
	dbgRunExe = "run",
	dbgRerunExe = "rerun",
	dbgStop = "stop",//pause debuging
	dbgExit = "exit",//exit from debuging
	dbgQuit = "quit",

	dbgGo = "go",
	dbgStep = "step",
	dbgStepOver = "step /over",
	dbgStepIn = "step /into",
	dbgStepReturn = "step /return",

	dbgSet = "set",

	dbgBreakPointSet = "set break",
	dbgBreakPointRemove = "cancel break",
	dbgBreakPointShow = "show break",
	dbgBreakPointActivate = "activate break",
	dbgBreakPointDeactivate = "deactivate break",

	dbgWatchPointSet = "set watch",
	dbgWatchPointRemove = "cancel watch",
	dbgWatchPointShow = "show watch",

	dbgTypeLine = "type",
	dbgExamine = "examine",
	dbgEvaluate = "evaluate",
	dbgDeposit = "deposit",

	dbgCallStack = "show calls",
	dbgStack = "show stack",
	dbgSymbol = "show symbol/address/type * in",
	dbgSetScope = "set scope",
	dbgShowScope = "show scope",

	dbgDump = "dump",

	dbgSetModeNoWait = "set mode nowait",
	dbgSetModeScreen = "set mode screen",
	dbgSetModeNoScreen = "set mode noscreen",
	dbgSetAbortKey = "set abort_key =",
	dbgSelect = "select",
	dbgSetDisplay = "display",
	dbgHelp = "help",
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
	public constructor(public makeModulesUppercase: boolean) {
		//
	}
	//general
	public run(fileName : string, args: string) : CommandMessage
	{
		if(args && args !== "")
		{
			return new CommandMessage(DebugCmdVMS.dbgRunExe, `/arguments=\"${args}\" ` + fileName);
		}
		else
		{
			return new CommandMessage(DebugCmdVMS.dbgRunExe, fileName);
		}		
	}

	public rerun() : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgRerunExe, "");
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
	public breakPointSet(moduleName : string, numberLine : number) : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgBreakPointSet, (this.makeModulesUppercase? moduleName.toUpperCase() : moduleName) + "\\%line " + numberLine.toString());
	}
	public breakPointRemove(moduleName : string, numberLine : number) : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgBreakPointRemove, (this.makeModulesUppercase? moduleName.toUpperCase() : moduleName) + "\\%line " + numberLine.toString());
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
	public breakPointActivate(moduleName : string, numberLine : number) : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgBreakPointActivate, (this.makeModulesUppercase? moduleName.toUpperCase() : moduleName)  + "\\%line " + numberLine.toString());
	}
	public breakPointsDeactivate() : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgBreakPointDeactivate, "/all");
	}
	public breakPointDeactivate(moduleName : string, numberLine : number) : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgBreakPointDeactivate, (this.makeModulesUppercase? moduleName.toUpperCase() : moduleName)  + "\\%line " + numberLine.toString());
	}

	//watch points
	public watchPointSet(variableName : string) : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgWatchPointSet, variableName);
	}
	public watchPointRemove(variableName : string) : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgWatchPointRemove, variableName);
	}
	public watchPointsRemove() : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgWatchPointRemove, "/all");
	}
	public watchPointShow() : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgWatchPointShow, "");
	}

	public showCurrentLine() : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgTypeLine, "");
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
	public deposit(nameVar : string, value : string) : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgDeposit, nameVar + "=" + value);
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
	//show variables, types
	public showSymbols(moduleName : string) : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgSymbol, " " + (this.makeModulesUppercase? moduleName.toUpperCase() : moduleName));
	}
	public setScope(moduleName : string, routineName : string) : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgSetScope, " " + (this.makeModulesUppercase? moduleName.toUpperCase() : moduleName) + "\\" + routineName);
	}
	public setScopeBase() : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgSetScope, " 0");
	}
	public showScope() : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgShowScope, "");
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
	public setAbortKey(key : string) : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgSetAbortKey, "CTRL_" + key);
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
	public clearDisplay(displayNames : string) : CommandMessage
	{
		return new CommandMessage(DebugCmdVMS.dbgSetDisplay, "/clear " + displayNames);
	}

	public customCommand(command : string) : CommandMessage
	{
		return new CommandMessage(command, "");
	}

	public getCtrlPlusSymbol(symbolAZ : string) : string
	{
		let code = symbolAZ.toLowerCase().charCodeAt(0) - "a".charCodeAt(0) + 1;

		return String.fromCharCode(code);
	}
}