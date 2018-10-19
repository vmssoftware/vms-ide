import {ToOutputChannel} from '../io/output-channel';
import { SSHClient } from './ssh-client';
import { Client, ClientChannel, SFTPWrapper, ClientErrorExtensions } from 'ssh2';
import { Queue } from '../queue/queues';
import { DebugCmdVMS } from '../command/debug_commands';

export enum ModeWork
{
    shell = 1,
    debug,
}

export class ShellSession
{
    private userPrompt : string = "$$$> ";
    private sshClient : Client | undefined;
    private stream : ClientChannel | undefined;
    private sftp : SFTPWrapper | undefined;
    private enterCmd : string;
    private mode : ModeWork;
    private resultData : string;
    private funcData : Function;
    private funcReady : Function;
    private queueCmd = new Queue<string>();
    private readyCmd : boolean;
    private currentCmd : string;
    private stepSetupTerminal : number;


    constructor( DataCb: (data: string, mode: ModeWork) => void, ReadyCb: () => void)
    {
        this.enterCmd = "";
        this.resultData = "";
        this.funcData = DataCb;
        this.funcReady = ReadyCb;
        this.readyCmd = false;
        this.currentCmd = "";
        this.mode = ModeWork.shell;
        this.stepSetupTerminal = 0;

        this.ShellInitialise();
    }


    private async ShellInitialise()
    {
        try
        {
            this.stepSetupTerminal = 0;

            let conn = await new SSHClient();

            this.sshClient = await conn.CreateClientSSH(this.ClientErrorCb);
            this.sftp = await conn.CreateClientSFTP(this.sshClient);
            this.stream = await conn.GetStreamSSH(this.sshClient, this.DataCb, this.CloseCb);
        }
        catch(error)
        {
            if (error instanceof Error)
            {
                ToOutputChannel(error.message);

                if(this.sshClient)
                {
                    this.sshClient.end();
                }
                //this.ShellInitialise();
            }
            else
            {
                console.log(error);
            }
        }
    }

    private DataCb = (data: string) : void =>
    {
        if(this.enterCmd === "")
        {
            if(data.includes(this.userPrompt))
            {
                this.enterCmd = this.userPrompt;//set prompt
                this.readyCmd = true;
                this.funcReady();
            }
            else
            {
                //setup terminal on connecting
                switch(this.stepSetupTerminal)
                {
                    case 0:
                        this.stepSetupTerminal++;
                        this.stream.write("\x1B[?62;1c");//answer on <esc>[c
                        break;

                    case 1:
                        this.stepSetupTerminal++;
                        this.stream.write("\x1B[24;132R");//answer on <esc>7<esc>[255;255H<esc>[6n<esc>8
                        this.stream.write("\x1B[0;0R");
                        break;

                    case 2:
                        this.stepSetupTerminal++;
                        //this.stream.write("\x1B[0;0R");//answer on <esc>[62"p<esc> F
                        break;

                    case 3:
                        this.stepSetupTerminal++;
                        this.stream.write("set prompt =\"" + this.userPrompt + "\"" + '\r\n');//setup prompt >
                        break;

                    default:
                        break;
                }
            }
        }
        else if(data.includes(this.enterCmd) || data.includes("DBG> "))
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
                this.funcData(this.resultData, this.mode);
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
            this.resultData += data;

            if(this.currentCmd.includes(DebugCmdVMS.dbgGo) ||
                this.currentCmd.includes(DebugCmdVMS.dbgStep) ||
                this.currentCmd.includes(DebugCmdVMS.dbgStepIn) ||
                this.currentCmd.includes(DebugCmdVMS.dbgStepReturn))
            {
                if(this.resultData !== "")
                {
                    this.funcData(this.resultData, this.mode);
                    this.resultData = "";
                }
            }
        }
    }

    private CloseCb = (code : any, signal : any) : void =>
    {
        if(this.sshClient)
        {
            this.sshClient.end();
        }
        console.log("Connection was closed");
    }

    private ClientErrorCb = (err: Error & ClientErrorExtensions) : void =>
    {
        if (err instanceof Error)
        {
            ToOutputChannel(err.message);
           // this.ShellInitialise();
        }
        else
        {
            console.log(err);
        }
    }

    public getCurrentCommand() : string
    {
        return this.currentCmd;
    }

    public SendCommand(command : string) : boolean
    {
        let result = false;

        if(this.stream)
        {
            this.currentCmd = command;
            result = this.stream.write(command + '\r\n');
        }

        return result;
    }

    public SendCommandToQueue(command : string) : void
    {
        if(this.readyCmd === true)
        {
            if(this.stream)
            {
                let result : boolean;

                this.currentCmd = command;
                result = this.stream.write(command + '\r\n');

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


    public GetStream() : ClientChannel
    {
        return this.stream!;
    }

    public GetSftp() : SFTPWrapper
    {
        return this.sftp!;
    }

    public DisconectSession()
    {
        if(this.stream)
        {
            this.stream.end("logoff\r\n");
        }
    }
}
