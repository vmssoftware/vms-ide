import { CommandMessage } from "./debug_commands";

export enum OsCmdVMS
{
	osLs = "dir",
	osCd = "set def",
	osHomeDir = "set def sys$login",
	osExit = "logout",
	osKillProgram = "\x03",

	osRunProgram = "run /nodebug",
	osRunProgramArgs = "MCR",
	osRunDbg = "debug /keep",
	osRunCC = "cc",
	osRunCOM = "@",
	osRunMMS = "mms/description=",
	osVersion = "write sys$output f$getsyi(\"VERSION\")",
	osTerminalShow = "show terminal/brief",
	osTerminalType = "set terminal/device=",
	osTerminalWidth = "set terminal/width=",

	osSetProcess = "set process/priv=",
	osSetAcl = "SET ACL/OBJECT_TYPE=DEVICE/ACL=",
	osSetProtection = "SET PROTECTION=",
	osDefine = "DEFINE",
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

	public killProgram() : CommandMessage
	{
		return new CommandMessage(OsCmdVMS.osKillProgram, "");
	}


	public runProgram(programName : string, args: string) : CommandMessage
	{
		if(args && args !== "")
		{
			return new CommandMessage(OsCmdVMS.osRunProgramArgs, programName + " " + args);
		}
		else
		{
			return new CommandMessage(OsCmdVMS.osRunProgram, programName);
		}
	}

	public runDebug() : CommandMessage
	{
		return new CommandMessage(OsCmdVMS.osRunDbg, "");
	}

	public runCC() : CommandMessage
	{
		return new CommandMessage(OsCmdVMS.osRunCC, "");
	}

	public runCOM(fileName : string) : CommandMessage
	{
		return new CommandMessage(OsCmdVMS.osRunCOM, fileName);
	}

	public runMMS(fileName : string) : CommandMessage
	{
		return new CommandMessage(OsCmdVMS.osRunMMS, fileName);
	}

	public cleanMMS(fileName : string) : CommandMessage
	{
		return new CommandMessage(OsCmdVMS.osRunMMS, fileName + " clean");
	}

	public getVersionOS() : CommandMessage
	{
		return new CommandMessage(OsCmdVMS.osVersion, "");
	}

	public showTerminal() : CommandMessage
	{
		return new CommandMessage(OsCmdVMS.osTerminalShow, "");
	}

	public setTerminalType(type : string) : CommandMessage
	{
		return new CommandMessage(OsCmdVMS.osTerminalType, type);
	}

	public setTerminalWidth(width : string) : CommandMessage
	{
		return new CommandMessage(OsCmdVMS.osTerminalWidth, width);
	}

	public setProcessPriv(type : string) : CommandMessage
	{
		return new CommandMessage(OsCmdVMS.osSetProcess, type);
	}

	public setAclDevice(userName : string, terminalName: string) : CommandMessage
	{
		return new CommandMessage(OsCmdVMS.osSetAcl, `(IDENT=${userName},ACCESS=READ+WRITE) ${terminalName}`);
	}

	public setProtectionDeviceRW(terminalName: string) : CommandMessage
	{
		return new CommandMessage(OsCmdVMS.osSetProtection, `WORLD:RW/DEVICE ${terminalName}`);
	}

	public redefineStreemToTerminal(streem: string, terminalName: string) : CommandMessage
	{
		return new CommandMessage(OsCmdVMS.osDefine, `${streem} ${terminalName}`);
	}
}