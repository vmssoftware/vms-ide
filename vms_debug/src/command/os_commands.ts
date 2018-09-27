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
	public ls() : string
	{
		return OsCmdVMS.osLs;
	}

	public cd(directory : string) : string
	{
		return OsCmdVMS.osCd + " [" + directory + "]";
	}

	public home() : string
	{
		return OsCmdVMS.osHomeDir;
	}

	public exit() : string
	{
		return OsCmdVMS.osExit;
	}


	public runProgram(programName : string) : string
	{
		return OsCmdVMS.dbgRunProgram + " " + programName;
	}

	public runDebug() : string
	{
		return OsCmdVMS.dbgRunDbg;
	}

	public runCC() : string
	{
		return OsCmdVMS.dbgRunCC;
	}

	public runCOM(fileName : string) : string
	{
		return OsCmdVMS.dbgRunCOM + fileName;
	}

	public runMMS(fileName : string) : string
	{
		return OsCmdVMS.dbgRunMMS + fileName;
	}

	public cleanMMS(fileName : string) : string
	{
		return OsCmdVMS.dbgRunMMS + fileName + " clean";
	}
}