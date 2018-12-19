import { WorkspaceFolder } from 'vscode';
import { Queue } from '../queue/queues';
import { DebugCmdVMS, CommandMessage } from '../command/debug_commands';
import { SshHelper } from '../ext-api/ssh-helper';
import { LogType, LogFunction } from '@vorfol/common';
import { GetSshHelperType } from '../ext-api/get-ssh-helper';
import { ISshShell } from '../ext-api/api';
import { ShellParser } from './shell-parser';
import { OsCmdVMS } from '../command/os_commands';

export enum ModeWork
{
    shell = 1,
    debug,
}

export enum TypeDataMessage
{
    typeCmd = 1,
    typeData,
}

import * as nls from "vscode-nls";
nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();


export class ShellSession
{
    private promptCmd : string;
    private mode : ModeWork;
    private resultData : string;
    private extensionDataCb : Function;
    private extensionReadyCb : Function;
    private extensionCloseCb : Function;
    private queueCmd = new Queue<CommandMessage>();
    private readyCmd : boolean;
    private receiveCmd : boolean;
    private currentCmd : CommandMessage;

    private sshHelper?: SshHelper;
    private sshShell?: ISshShell;

    private shellParser: ShellParser;

    constructor(public folder: WorkspaceFolder | undefined, ExtensionDataCb: (mode: ModeWork, type: TypeDataMessage, data: string) => void, ExtensionReadyCb: () => void, ExtensionCloseCb: () => void, public logFn?: LogFunction)
    {
        this.promptCmd = "";
        this.mode = ModeWork.shell;
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

                    return false;
                }
                this.sshHelper = new sshHelperType(this.logFn);
            }

            if (this.sshHelper)
            {
                this.sshHelper.clearPasswordCashe();
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
            }
        }
        catch(error)
        {
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
            }
            else
            {
                if (this.logFn)
                {
                    this.logFn(LogType.debug, () => String(error));
                }
            }

            this.extensionCloseCb();
        }
    }

    private DataCb = (data: string) : void =>
    {
        if(this.promptCmd === "")
        {
            this.promptCmd = this.sshShell!.prompt!;//set prompt
            this.readyCmd = true;
            this.extensionReadyCb();
        }
        else if(data.includes("\x00") && (data.includes(this.promptCmd) || data.includes("DBG> ")))
        {
            if(this.receiveCmd)
            {
                if(data.includes("DBG> "))
                {
                    let indexEnd = data.indexOf("\x00");
                    let dataS = data.substr(0, indexEnd-1);
                    let dataP = data.substr(indexEnd-1);
                    indexEnd = dataP.indexOf(" ");
                    let dataE = dataP.substr(indexEnd, dataP.length-1);

                    this.resultData += dataS + dataE;
                    this.mode = ModeWork.debug;
                }
                else
                {
                    if(this.currentCmd.getBody() !== "")
                    {
                        let indexEnd = data.indexOf("\x00");
                        data = data.substr(0, indexEnd-1);

                        this.resultData += data + "> ";
                        if (this.currentCmd.getBody() !== OsCmdVMS.osRunCOM)
                        {
                            this.DisconectSession();//close SSH session
                            this.extensionCloseCb();
                        }
                    }

                    this.mode = ModeWork.shell;
                }

                this.readyCmd = true;

                if(this.resultData !== "")
                {
                    this.extensionDataCb(this.mode, TypeDataMessage.typeData, this.resultData);
                    this.resultData = "";
                }

                let cmd = this.currentCmd.getBody();

                if(!(cmd.includes(DebugCmdVMS.dbgGo) ||
                    cmd.includes(DebugCmdVMS.dbgStepOver) ||
                    cmd.includes(DebugCmdVMS.dbgStepIn) ||
                    cmd.includes(DebugCmdVMS.dbgStepReturn) ||
                    cmd.includes(OsCmdVMS.osRunProgram)))
                {
                    this.currentCmd = new CommandMessage("", "");
                }

                this.SendCommandFromQueue();
            }
        }
        else
        {
            this.resultData += data;
            let cmd = this.currentCmd.getBody();

            if(!this.receiveCmd)
            {
                if(this.resultData.includes(this.currentCmd.getBody()))//getCommand()
                {
                    this.extensionDataCb(this.mode, TypeDataMessage.typeCmd, this.resultData);
                    this.resultData = "";
                    this.receiveCmd = true;
                }
            }
            else if(cmd.includes(DebugCmdVMS.dbgGo) ||
                cmd.includes(DebugCmdVMS.dbgStepOver) ||
                cmd.includes(DebugCmdVMS.dbgStepIn) ||
                cmd.includes(DebugCmdVMS.dbgStepReturn) ||
                cmd.includes(OsCmdVMS.osRunProgram))
            {
                if(this.resultData !== "")
                {
                    this.extensionDataCb(this.mode, TypeDataMessage.typeData, this.resultData);
                    this.resultData = "";
                    this.SendCommandFromQueue();
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

        this.extensionCloseCb();
    }

    private ClientErrorCb = (err) : void =>
    {
        if (this.logFn)
        {
            this.logFn(LogType.error, () => String(err));
        }

        this.extensionCloseCb();
    }


    public resetParameters()
    {
        this.resultData = "";
        this.readyCmd = true;
        this.receiveCmd = false;
        this.currentCmd = new CommandMessage("", "");
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

    public SendData(data : string) : boolean
    {
        let result = false;

        if(this.sshShell)
        {
            result = this.shellParser.push(data + '\r\n');
        }

        return result;
    }

    public SendCommand(command : CommandMessage) : boolean
    {
        let result = false;

        if(this.sshShell)
        {
            this.currentCmd = command;
            this.receiveCmd = false;
            this.readyCmd = false;
            result = this.shellParser.push(command.getCommand() + '\r\n');
        }

        return result;
    }

    public SendCommandFromQueue() : void
    {
        if(this.readyCmd === true)
        {
            if(this.queueCmd.size() > 0)
            {
                let cmd = this.queueCmd.getv();

                if(cmd)
                {
                    let result = this.SendCommand(cmd);

                    if(!result)
                    {
                        this.readyCmd = true;
                    }
                    else
                    {
                        this.queueCmd.pop();
                        this.readyCmd = false;
                    }
                }
            }
        }
    }

    public SendCommandToQueue(command : CommandMessage) : void
    {
        this.queueCmd.push(command);

        this.SendCommandFromQueue();
    }

    public DisconectSession()
    {
        if(this.sshShell)
        {
            this.sshShell.detachUser();
            this.sshShell.dispose();
            this.sshShell = undefined;
        }
    }
}
