import { Queue } from "../queue/queues";

export enum DebugCmdVMS
{
	dbgRunExe = "run",
	dbgRerunExe = "rerun",
	dbgStop = "stop",//pause debuging
	dbgExit = "exit",//exit from debuging

	dbgGo = "go",
	dbgStep = "step /over",
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
}


export class DebugCommands
{
	private queueCmd = new Queue<string>();


	public getCurrentCommand() : string
	{
		let command : string = "";

		if(this.queueCmd.size() > 0)
		{
			command = this.queueCmd.pop();
		}

		return command;
	}


	//general
	public run(fileName : string) : string
	{
		this.queueCmd.push(DebugCmdVMS.dbgRunExe);

		return DebugCmdVMS.dbgRunExe + " " + fileName;
	}

	public rerun() : string
	{
		this.queueCmd.push(DebugCmdVMS.dbgRerunExe);

		return DebugCmdVMS.dbgRerunExe;
	}

	public showCurrentLine() : string//show current line
	{
		this.queueCmd.push(DebugCmdVMS.dbgCurrentLine);

		return DebugCmdVMS.dbgCurrentLine;
	}

	public stop() : string
	{
		this.queueCmd.push(DebugCmdVMS.dbgStop);

		return DebugCmdVMS.dbgStop;
	}

	public exit() : string
	{
		this.queueCmd.push(DebugCmdVMS.dbgExit);

		return DebugCmdVMS.dbgExit;
	}

	public go() : string
	{
		this.queueCmd.push(DebugCmdVMS.dbgGo);

		return DebugCmdVMS.dbgGo;
	}
	public step() : string
	{
		this.queueCmd.push(DebugCmdVMS.dbgStep);

		return DebugCmdVMS.dbgStep;
	}
	public stepIn() : string
	{
		this.queueCmd.push(DebugCmdVMS.dbgStepIn);

		return DebugCmdVMS.dbgStepIn;
	}
	public stepReturn() : string
	{
		this.queueCmd.push(DebugCmdVMS.dbgStepReturn);

		return DebugCmdVMS.dbgStepReturn;
	}

	//break points
	public breakPointSet(fileName : string, numberLine : number) : string
	{
		this.queueCmd.push(DebugCmdVMS.dbgBreakPointSet);

		return DebugCmdVMS.dbgBreakPointSet + " " + fileName.toUpperCase()  + "\\%line " + numberLine.toString();
	}
	public breakPointRemove(fileName : string, numberLine : number) : string
	{
		this.queueCmd.push(DebugCmdVMS.dbgBreakPointRemove);

		return DebugCmdVMS.dbgBreakPointRemove + " " + fileName.toUpperCase()  + "\\%line " + numberLine.toString();
	}
	public breakPointsRemove() : string
	{
		this.queueCmd.push(DebugCmdVMS.dbgBreakPointRemove);

		return DebugCmdVMS.dbgBreakPointRemove + " /all";
	}
	public breakPointShow() : string
	{
		this.queueCmd.push(DebugCmdVMS.dbgBreakPointShow);

		return DebugCmdVMS.dbgBreakPointShow;
	}
	public breakPointsActivate() : string
	{
		this.queueCmd.push(DebugCmdVMS.dbgBreakPointActivate);

		return DebugCmdVMS.dbgBreakPointActivate  + " /all";
	}
	public breakPointActivate(fileName : string, numberLine : number) : string
	{
		this.queueCmd.push(DebugCmdVMS.dbgBreakPointActivate);

		return DebugCmdVMS.dbgBreakPointActivate + " " + fileName.toUpperCase()  + "\\%line " + numberLine.toString();
	}
	public breakPointsDeactivate() : string
	{
		this.queueCmd.push(DebugCmdVMS.dbgBreakPointDeactivate);

		return DebugCmdVMS.dbgBreakPointDeactivate  + " /all";
	}
	public breakPointDeactivate(fileName : string, numberLine : number) : string
	{
		this.queueCmd.push(DebugCmdVMS.dbgBreakPointDeactivate);

		return DebugCmdVMS.dbgBreakPointDeactivate + " " + fileName.toUpperCase()  + "\\%line " + numberLine.toString();
	}


	//get value of variable by name
	//(show format) (file\locateFunc\nameVar:       value) - local variable
	//(show format) (file\nameVar:       value) - global variable
	public examine(nameVar : string) : string
	{
		this.queueCmd.push(DebugCmdVMS.dbgExamine);

		return DebugCmdVMS.dbgExamine + " " + nameVar;
	}
	//get value of variable by name (don't for array)
	public evaluate(nameVar : string) : string
	{
		this.queueCmd.push(DebugCmdVMS.dbgEvaluate);

		return DebugCmdVMS.dbgEvaluate + " " + nameVar;
	}

	//set value of variable by name
	public deposit(nameVar : string, value : number) : string
	{
		this.queueCmd.push(DebugCmdVMS.dbgDeposit);

		return DebugCmdVMS.dbgDeposit + " " + nameVar + "=" + value.toString();
	}

	//show call stack
	public callStack() : string
	{
		this.queueCmd.push(DebugCmdVMS.dbgCallStack);

		return DebugCmdVMS.dbgCallStack;
	}
	//show stack
	public stack() : string
	{
		this.queueCmd.push(DebugCmdVMS.dbgStack);

		return DebugCmdVMS.dbgStack;
	}

	//dump
	public dump(nameVar : string) : string
	{
		this.queueCmd.push(DebugCmdVMS.dbgDump);

		return DebugCmdVMS.dbgDump + " " + nameVar;
	}
	public dumpAddress(addressStart : string, addressStop : string) : string
	{
		this.queueCmd.push(DebugCmdVMS.dbgDump);

		return DebugCmdVMS.dbgDump + " " + addressStart + ":" + addressStop;
	}
	public dumpHex(nameVar : string) : string
	{
		this.queueCmd.push(DebugCmdVMS.dbgDump);

		return DebugCmdVMS.dbgDump + "/hex" + " " + nameVar;
	}
	public dumpAddressHex(addressStart : string, addressStop : string) : string
	{
		this.queueCmd.push(DebugCmdVMS.dbgDump);

		return DebugCmdVMS.dbgDump + "/hex" + " " + addressStart + ":" + addressStop;
	}

	//trace
	//watch

	public modeNoWait() : string
	{
		this.queueCmd.push(DebugCmdVMS.dbgSetModeNoWait);

		return DebugCmdVMS.dbgSetModeNoWait;
	}
	public modeScreen() : string
	{
		this.queueCmd.push(DebugCmdVMS.dbgSetModeScreen);

		return DebugCmdVMS.dbgSetModeScreen;
	}
}