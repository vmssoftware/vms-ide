import {ToOutputChannel} from '../io/output-channel';
import { SSHClient } from './ssh-client';
import { Client, ClientChannel, SFTPWrapper, ClientErrorExtensions } from 'ssh2';

export enum ModeWork
{
    shell = 1,
    debug,
}

export class ShellSession
{
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


    constructor( DataCb: (data: string, mode: ModeWork) => void, ReadyCb: () => void)
    {
        this.enterCmd = "";
        this.resultData = "";
        this.funcData = DataCb;
        this.funcReady = ReadyCb;
        this.readyCmd = false;
        this.currentCmd = "";
        this.mode = ModeWork.shell;

        this.ShellInitialise();
    }


    private async ShellInitialise()
    {
        try
        {
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
            if(data.includes("> "))
            {
                if(data.includes("\n\r"))
                {
                    this.enterCmd += data;
                    this.enterCmd = this.enterCmd.substring(2);
                    this.readyCmd = true;
                    this.funcReady();
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

            this.funcData(this.resultData, this.mode);
            this.resultData = "";
            this.readyCmd = true;

            if(this.queueCmd.size() > 0)
            {
                this.SendCommandToQueue(this.queueCmd.pop());
            }
        }
        else
        {
            this.resultData += data;
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


class Queue<T>
{
    private data : any[] = [];

    push = (item: T) => this.data.push(item);
    pop = (): T => this.data.shift();
    size = () : number => this.data.length;
}
