import { CommandMessage } from "./debug_commands";

export enum OsCmdVMS
{
	osLs = "dir",
	osCd = "set def",
	osHomeDir = "set def sys$login",
	osExit = "logout",

	dbgRunProgram = "run /nodebug",
	dbgRunDbg = "debug /keep",
	dbgRunCC = "cc",
	dbgRunCOM = "@",
	dbgRunMMS = "mms/description=",
}


export class OsCommands
{
	public ls() : CommandMessage
	{
		return new CommandMessage(OsCmdVMS.osLs, "");
	}

	public cd(directory : string) : CommandMessage
	{
		return new CommandMessage(OsCmdVMS.osCd, "[" + directory + "]");
	}

	public home() : CommandMessage
	{
		return new CommandMessage(OsCmdVMS.osHomeDir, "");
	}

	public exit() : CommandMessage
	{
		return new CommandMessage(OsCmdVMS.osExit, "");
	}


	public runProgram(programName : string) : CommandMessage
	{
		return new CommandMessage(OsCmdVMS.dbgRunProgram, programName);
	}

	public runDebug() : CommandMessage
	{
		return new CommandMessage(OsCmdVMS.dbgRunDbg, "");
	}

	public runCC() : CommandMessage
	{
		return new CommandMessage(OsCmdVMS.dbgRunCC, "");
	}

	public runCOM(fileName : string) : CommandMessage
	{
		return new CommandMessage(OsCmdVMS.dbgRunCOM, fileName);
	}

	public runMMS(fileName : string) : CommandMessage
	{
		return new CommandMessage(OsCmdVMS.dbgRunMMS, fileName);
	}

	public cleanMMS(fileName : string) : CommandMessage
	{
		return new CommandMessage(OsCmdVMS.dbgRunMMS, fileName + " clean");
	}
}