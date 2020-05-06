import { LogFunction, LogType } from "../../common/main";
import { WorkspaceFolder } from "vscode";
import { GetSshHelperType } from "../../ext-api/ext-api";
import { ISshShell } from "../../ssh-helper/api";
import { SshHelper } from "../../ssh-helper/ssh-helper";
import { CommandMessage, DebugCmdVMS } from "../command/debug_commands";
import { Queue } from "../queue/queues";
import { ShellParser } from "./shell-parser";
import { OsCmdVMS, OsCommands } from '../command/os_commands';
import * as nls from "vscode-nls";
import { copy } from "fs-extra";

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export enum ModeWork
{
    shell = 1,
    debug,
}

export enum TypeTerminal
{
    user = 1,
    debug,
}

export enum TypeDataMessage
{
    typeCmd = 1,
    typeData,
    typeClose,
    typeError,
}


export class ShellSession
{
    private promptCmd : string;
    private mode : ModeWork;
    private typeTerminal: TypeTerminal;
    private resultData : string = "";
    private extensionDataCb : Function;
    private extensionReadyCb : Function;
    private extensionCloseCb : Function;
    private queueCmd = new Queue<CommandMessage>();
    private readyCmd : boolean = false;
    private completeCmd : boolean = false;
    private receiveCmd : boolean = false;
    private disconnect : boolean = false;
    private dbgModeOn : boolean = false;
    private dbgLastCmd : boolean = false;
    private checkVersion : number;
    private currentCmd : CommandMessage = new CommandMessage("", "");
    private previousCmd : CommandMessage = new CommandMessage("", "");

    private sshHelper?: SshHelper;
    private sshShell?: ISshShell;

    private shellParser: ShellParser;

    constructor(public folder: WorkspaceFolder | undefined, typeTerminal: TypeTerminal, ExtensionDataCb: (mode: ModeWork, type: TypeDataMessage, data: string) => void, ExtensionReadyCb: () => void, ExtensionCloseCb: (reasonMessage: string) => void, public logFn?: LogFunction)
    {
        this.checkVersion = -1;
        this.promptCmd = "";
        this.mode = ModeWork.shell;
        this.typeTerminal = typeTerminal;

        this.extensionDataCb = ExtensionDataCb;
        this.extensionReadyCb = ExtensionReadyCb;
        this.extensionCloseCb = ExtensionCloseCb;
        this.shellParser = new ShellParser(this.DataCb, this.CloseCb, this.ClientErrorCb, logFn);

        this.resetParameters();
        this.ShellInitialize();
    }


    private async ShellInitialize()
    {
        try
        {
            if (!this.sshHelper)
            {
                const sshHelperType = await GetSshHelperType();

                if (!sshHelperType)
                {
                    if (this.logFn)
                    {
                        this.logFn(LogType.error, () => `Cannot get ssh-helper api`);
                    }

                    this.DisconectSession(true, ": Cannot get ssh-helper api");

                    return false;
                }
                this.sshHelper = new sshHelperType(this.logFn);
            }

            if (this.sshHelper)
            {
                this.sshHelper.clearPasswordCache();
                this.sshShell = await this.sshHelper.getDefaultVmsShell(this.folder ? this.folder.name : "");

                if (this.sshShell)
                {
                    const attached = await this.sshShell.attachUser(this.shellParser);

                    if (!attached)
                    {
                        throw new Error(localize("output.cannot_attach", "Cannot connect"));
                    }
                    else
                    {
                        this.shellParser.push("\r\n");
                    }
                }
                else
                {
                    this.extensionCloseCb("(Internal error: the session was interrupted.)");
                }
            }
        }
        catch(error)
        {
            let messageErr : string;

            if (error instanceof Error)
            {
                if (this.logFn)
                {
                    this.logFn(LogType.error, () => error.message);
                }
                if(this.sshShell)
                {
                    this.sshShell.dispose();
                    this.sshShell = undefined;
                }

                messageErr = error.message;
            }
            else
            {
                if (this.logFn)
                {
                    this.logFn(LogType.debug, () => String(error));
                }

                messageErr = error;
            }

            this.extensionCloseCb(": " + messageErr);
        }
    }

    private DataCb = (data: string) : void =>
    {
        //console.log(data);
        
        if(this.promptCmd === "" || this.checkVersion !== 0)
        {
            if(this.checkVersion !== 0 && this.promptCmd !== "")
            {
                if(this.checkVersion === 2)
                {
                    let check = false;
                    let matcher = /^[V](\d+).(\d+)-?(\w+)?\s*/;
                    let matches = data.trim().match(matcher);

                    if(matches && matches.length === 3)//Vx.y
                    {
                        let number1 = parseInt(matches[1], 10);
                        let number2 = parseInt(matches[2], 10);

                        if(number1 > 8)
                        {
                            check = true;
                        }
                        else if(number1 === 8 && number2 > 4)
                        {
                            check = true;
                        }
                    }
                    else if(matches && matches.length === 4)//Vx.y-z
                    {
                        let number1 = parseInt(matches[1], 10);
                        let number2 = parseInt(matches[2], 10);

                        if(number1 > 8)
                        {
                            check = true;
                        }
                        else if(number1 === 8)
                        {
                            if(number2 > 4)
                            {
                                check = true;
                            }
                            else if(number2 === 4 && matches[3] !== "")
                            {
                                check = true;
                            }
                        }
                    }

                    if(check)
                    {
                        this.checkVersion = 0;
                        this.extensionReadyCb();
                    }
                    else
                    {
                        this.checkVersion = -1;
                        this.DisconectSession(true, ": OS don't support");
                    }

                    this.readyCmd = true;
                    this.completeCmd = true;
                }

                if(data.includes(this.currentCmd.getBody()))
                {
                    this.checkVersion = 2;
                }
            }
            else
            {
                this.promptCmd = this.sshShell!.prompt!;//set prompt
                this.readyCmd = true;
                this.completeCmd = true;

                if(this.checkVersion === -1)
                {
                    this.checkVersion = 1;
                    let osCmd = new OsCommands();
                    this.SendCommand(osCmd.getVersionOS());
                }
            }
        }
        else if(data.includes("\x00") && (data.includes(this.promptCmd) || data.includes("DBG> ")))
        {
            if(this.receiveCmd || data.includes(this.currentCmd.getBody()))
            { 
                data = data.replace(/\x00/g, '');

                if(data.includes("DBG> "))
                {
                    this.resultData += data;
                    this.mode = ModeWork.debug;
                    this.dbgModeOn = true;
                }
                else
                {
                    data = data.replace(this.promptCmd, '');

                    this.resultData += data;// + "> ";
                    this.mode = ModeWork.shell;

                    if (this.disconnect)
                    {
                        this.DisconectSession(true, ": The program complete");//close SSH session
                        this.readyCmd = true;
                        this.extensionDataCb(this.mode, TypeDataMessage.typeData, this.resultData);
                        this.resultData = "";
                    }

                    if (this.dbgModeOn &&
                        this.currentCmd.getBody() !== DebugCmdVMS.dbgGo &&
                        this.currentCmd.getBody() !== DebugCmdVMS.dbgStepOver &&
                        this.currentCmd.getBody() !== DebugCmdVMS.dbgStepIn &&
                        this.currentCmd.getBody() !== DebugCmdVMS.dbgStepReturn &&
                        this.currentCmd.getBody() !== DebugCmdVMS.dbgRunExe &&
                        this.currentCmd.getBody() !== OsCmdVMS.osRunProgram &&
                        this.currentCmd.getBody() !== OsCmdVMS.osRunProgramArgs)
                    {
                        this.dbgLastCmd = true;
                    }
                }

                this.readyCmd = true;

                let emptyStr = this.resultData.trim();

                if(emptyStr !== "")
                {
                    if(!this.receiveCmd)
                    {
                        if(this.resultData.includes(this.currentCmd.getBody()))//getCommand()
                        {
                            this.extensionDataCb(this.mode, TypeDataMessage.typeCmd, this.resultData);
                            this.resultData = "";
                            this.receiveCmd = true;
                        }
                    }
                    else
                    {
                        this.extensionDataCb(this.mode, TypeDataMessage.typeData, this.resultData);
                        this.resultData = "";
                        if (this.dbgModeOn)
                        {
                            this.dbgLastCmd = true;
                        }
                    }
                }

                let cmd = this.currentCmd.getBody();

                if(!(cmd.includes(DebugCmdVMS.dbgGo) ||
                    cmd.includes(DebugCmdVMS.dbgStepOver) ||
                    cmd.includes(DebugCmdVMS.dbgStepIn) ||
                    cmd.includes(DebugCmdVMS.dbgStepReturn) ||
                    cmd.includes(OsCmdVMS.osRunProgram) ||
                    cmd.includes(OsCmdVMS.osRunProgramArgs) ||
                    cmd === ""))
                {
                    this.previousCmd = this.currentCmd;
                    this.currentCmd = new CommandMessage("", "");
                }

                this.completeCmd = true;
                this.SendCommandFromQueue();
            }
        }
        else
        {
            this.resultData += data;
            let cmd = this.currentCmd.getBody();
            if (this.dbgModeOn)
            {
                this.dbgLastCmd = true;
            }

            if(!this.receiveCmd)
            {
                if(this.resultData.includes(this.currentCmd.getBody()))//getCommand()
                {
                    this.extensionDataCb(this.mode, TypeDataMessage.typeCmd, this.resultData);
                    this.resultData = "";
                    this.receiveCmd = true;
                }
            }
            else
            {
                if (this.typeTerminal === TypeTerminal.user)
                {
                    if(cmd.includes(OsCmdVMS.osRunDbg) ||
                        cmd.includes(OsCmdVMS.osRunProgram) ||
                        cmd.includes(OsCmdVMS.osRunProgramArgs) ||
                        cmd === "")
                    {
                        if(this.resultData !== "")
                        {
                            this.extensionDataCb(ModeWork.shell, TypeDataMessage.typeData, this.resultData);
                            this.resultData = "";
                        }
                    }
                }
                else
                {
                    if(cmd.includes(DebugCmdVMS.dbgGo) ||
                        cmd.includes(DebugCmdVMS.dbgStepOver) ||
                        cmd.includes(DebugCmdVMS.dbgStepIn) ||
                        cmd.includes(DebugCmdVMS.dbgStepReturn))
                    {
                        if(this.resultData !== "")
                        {
                            this.extensionDataCb(ModeWork.debug, TypeDataMessage.typeData, this.resultData);
                            this.resultData = "";
                        }
                    }
                }
            }
        }
    }

    private CloseCb = (code?: any, signal?: any) : void =>
    {
        if(this.sshShell)
        {
            this.sshShell.dispose();
            this.sshShell = undefined;
        }

        if (this.logFn)
        {
            this.logFn(LogType.debug, () => "Connection was closed");
        }

        if(code)
        {
            this.extensionCloseCb(": code: " + String(code));
        }
        else
        {
            this.extensionCloseCb("");
        }
    }

    private ClientErrorCb = (err: any) : void =>
    {
        if (this.logFn)
        {
            this.logFn(LogType.error, () => String(err));
        }

        this.extensionCloseCb(": " + String(err));
    }


    public resetParameters()
    {
        this.resultData = "";
        this.readyCmd = true;
        this.completeCmd = true;
        this.receiveCmd = false;
        this.disconnect = false;
        this.dbgLastCmd = false;
        this.currentCmd = new CommandMessage("", "");
        this.previousCmd = new CommandMessage("", "");
        this.queueCmd = new Queue<CommandMessage>();
    }

    public cleanQueueCommands()
    {
        this.queueCmd = new Queue<CommandMessage>();
    }

    public getModeWork() : ModeWork
    {
        return this.mode;
    }

    public getStatusCommand() : boolean
    {
        return this.readyCmd;
    }

    public getCurrentCommand() : CommandMessage
    {
        return this.currentCmd;
    }

    public getPreviousCommand() : CommandMessage
    {
        return this.previousCmd;
    }

    public getDbgModeOn() : boolean
    {
        return this.dbgModeOn;
    }

    public SendData(data : string) : boolean
    {
        let result = false;

        if(this.sshShell)
        {
            this.readyCmd = false;
            this.completeCmd = false;

            result = this.shellParser.push(data + '\r\n');
        }
        else
        {
            this.extensionCloseCb("(Internal error: the session was interrupted.)");
        }

        return result;
    }

    public SendCommand(command : CommandMessage) : boolean
    {
        let result = false;

        if(this.sshShell)
        {
            if(this.currentCmd.getBody() !== "")
            {
                this.previousCmd = this.currentCmd;
            }

            this.readyCmd = false;
            this.completeCmd = false;

            if(this.dbgModeOn)
            {
                if(this.mode === ModeWork.debug)
                {
                    this.currentCmd = command;
                    this.receiveCmd = false;

                    result = this.shellParser.push(command.getCommand() + '\r\n');
                }
                else
                {
                    this.shellParser.push('\r\n');
                }
            }
            else
            {
                this.currentCmd = command;
                this.receiveCmd = false;

                result = this.shellParser.push(command.getCommand() + '\r\n');
            }
        }
        else
        {
            this.extensionCloseCb("(Internal error: the session was interrupted.)");
        }

        return result;
    }

    public SendCommandFromQueue() : void
    {
        if(this.completeCmd === true)
        {
            if(this.queueCmd.size() > 0)
            {
                let cmd = this.queueCmd.getv();

                if(cmd)
                {
                    let result = this.SendCommand(cmd);

                    if(!result)//???
                    {
                        // this.readyCmd = true;
                        // this.completeCmd = true;
                    }
                    else
                    {
                        this.queueCmd.pop();
                        this.readyCmd = false;
                        this.completeCmd = false;
                        this.dbgLastCmd = true;
                    }
                }
            }
            else if(this.dbgModeOn && this.dbgLastCmd)
            {
                if(this.mode !== ModeWork.debug)
                {
                    this.readyCmd = false;
                    this.completeCmd = false;
                    this.dbgLastCmd = false;
                    this.shellParser.push('\r\n');
                }
            }
        }
    }

    public SendCommandToQueue(command : CommandMessage) : void
    {
        this.queueCmd.push(command);

        if(this.queueCmd.size() === 1)
        {
            this.SendCommandFromQueue();
        }
    }

    public DisconectSession(callCloseCb : boolean, reasonMessage: string)
    {
        if(this.sshShell)
        {
            this.sshShell.detachUser();
            this.sshShell.dispose();
            this.sshShell = undefined;
        }

        if(callCloseCb)
        {
            this.extensionCloseCb(reasonMessage);
        }
    }

    public SetDisconnectInShellSession()
    {
        this.disconnect = true;
    }
}
