import {ToOutputChannel} from '../io/output-channel';
import { Queue } from '../queue/queues';
import { DebugCmdVMS, CommandMessage } from '../command/debug_commands';
import { SshHelper } from '../ext-api/ssh-helper';
import { LogType } from '@vorfol/common';
import { GetSshHelperFromApi } from '../ext-api/get-ssh-helper';
import { ISshShell } from '../ext-api/api';
import { ShellParser } from './shell-parser';
import { runInThisContext } from 'vm';

export enum ModeWork
{
    shell = 1,
    debug,
}

export class ShellSession
{
    private enterCmd : string;
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

    constructor( ExtensionDataCb: (data: string, mode: ModeWork) => void, ExtensionReadyCb: () => void, ExtensionCloseCb: () => void, public debugLog?: LogType)
    {
        this.enterCmd = "";
        this.resultData = "";
        this.extensionDataCb = ExtensionDataCb;
        this.extensionReadyCb = ExtensionReadyCb;
        this.extensionCloseCb = ExtensionCloseCb;
        this.readyCmd = false;
        this.receiveCmd = false;
        this.mode = ModeWork.shell;
        this.currentCmd = new CommandMessage("", "");
        this.shellParser = new ShellParser(this.DataCb, this.CloseCb, this.ClientErrorCb, debugLog);

        this.ShellInitialise();
    }


    private async ShellInitialise()
    {
        try
        {
            if (!this.sshHelper)
            {
                const sshHelperType = await GetSshHelperFromApi();

                if (!sshHelperType)
                {
                    if (this.debugLog)
                    {
                        this.debugLog(`Cannot get ssh-helper api`);
                    }

                    return false;
                }
                this.sshHelper = new sshHelperType(this.debugLog);
            }

            if (this.sshHelper)
            {
                this.sshHelper.clearPasswordCashe();
                this.sshShell = await this.sshHelper.getDefaultVmsShell();

                if (this.sshShell)
                {
                    const attached = await this.sshShell.attachUser(this.shellParser);

                    if (!attached)
                    {
                        throw this.sshShell.lastClientError? this.sshShell.lastClientError :
                            this.sshShell.lastShellError ? this.sshShell.lastShellError : new Error("error");
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
                ToOutputChannel(error.message);

                if(this.sshShell)
                {
                    this.sshShell.dispose();
                    this.sshShell = undefined;
                }
            }
            else
            {
                if (this.debugLog)
                {
                    this.debugLog(error);
                }
            }
        }
    }

    private DataCb = (data: string) : void =>
    {
        if(this.enterCmd === "")
        {
            this.enterCmd = this.sshShell!.prompt!;//set prompt
            this.readyCmd = true;
            this.extensionReadyCb();
        }
        else if(data.includes("\x00") && (data.includes(this.enterCmd) || data.includes("DBG> ")))
        {
            if(data.includes("DBG> "))
            {
                if(this.mode === ModeWork.shell)
                {
                    this.resultData = "";
                }

                this.mode = ModeWork.debug;
            }
            else
            {
                this. mode = ModeWork.shell;
            }

            if(this.resultData !== "")
            {
                this.extensionDataCb(this.resultData, this.mode);
                this.resultData = "";
            }

            this.readyCmd = true;

            if(this.queueCmd.size() > 0)
            {
                this.SendCommandToQueue(this.queueCmd.pop());
            }
        }
        else
        {
            if(this.receiveCmd)
            {
                if(this.resultData === "")
                {
                    this.resultData = "D:";
                }
            }

            this.resultData += data;
            let cmd = this.currentCmd.getBody();

            if(!this.receiveCmd)
            {
                if(this.resultData.includes(this.currentCmd.getCommand()))
                {
                    this.resultData = "C:" + this.resultData;
                    this.extensionDataCb(this.resultData, this.mode);
                    this.resultData = "";
                    this.receiveCmd = true;
                }
            }
            else if(cmd.includes(DebugCmdVMS.dbgGo) ||
                cmd.includes(DebugCmdVMS.dbgStep) ||
                cmd.includes(DebugCmdVMS.dbgStepIn) ||
                cmd.includes(DebugCmdVMS.dbgStepReturn))
            {
                if(this.resultData !== "")
                {
                    this.extensionDataCb(this.resultData, this.mode);
                    this.resultData = "";

                    if(this.readyCmd)
                    {
                        if(this.queueCmd.size() > 0)
                        {
                            this.SendCommandToQueue(this.queueCmd.pop());
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

        if (this.debugLog)
        {
            this.debugLog("Connection was closed");
        }

        this.extensionCloseCb();
    }

    private ClientErrorCb = (err) : void =>
    {
        ToOutputChannel(`${err}`);

        this.extensionCloseCb();
    }

    public getCurrentCommand() : CommandMessage
    {
        return this.currentCmd;
    }

    public SendCommand(command : CommandMessage) : boolean
    {
        let result = false;

        if(this.sshShell)
        {
            this.currentCmd = command;
            this.receiveCmd = false;
            result = this.shellParser.push(command.getCommand() + '\r\n');
        }

        return result;
    }

    public SendCommandToQueue(command : CommandMessage) : void
    {
        if(this.readyCmd === true)
        {
            if(this.sshShell)
            {
                let result : boolean;

                this.currentCmd = command;
                this.receiveCmd = false;
                result = this.shellParser.push(command.getCommand() + '\r\n');

                if(!result)
                {
                    this.queueCmd.push(command);
                    this.readyCmd = true;
                }
                else
                {
                    this.readyCmd = false;
                }
            }
            else
            {
                this.queueCmd.push(command);
            }
        }
        else
        {
            this.queueCmd.push(command);
        }
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
