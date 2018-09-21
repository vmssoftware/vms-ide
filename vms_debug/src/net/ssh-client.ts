import { Client, ClientChannel, SFTPWrapper, ClientErrorExtensions } from 'ssh2';
import { SSHSettings } from './host-settings';
import { WorkspaceSettings } from '../config/workspace-settings';

let _messageHostSettingsIncomlete = `Host settings is incomplete: need username, host and port.`;
let _messagePasswordIsEmpty = `Please, enter password.`;
let _passwordCache : Map<string, string> = new Map<string, string>();


export class SSHClient
{
    constructor()
    {

    }
    /** Build cache settings string
     *
     */
    private CacheString(settings: SSHSettings): string
    {
        return `${settings.username}@${settings.host}:${settings.port}`;
    }

    /** Create SSH client using settings from current workspace.
     *
     *  Also ensures password and save it into cache (by 'username@host:port')
    */
    public async CreateClientSSH(ClientErrorCB : (err: Error & ClientErrorExtensions) => void) : Promise<Client>
    {
        return new Promise(async (resolve : (client : Client) => void, reject: (error: Error) => void) =>
        {
            let client = new Client();
            //Get all from project config
            let sshSettings = SSHSettings.FromWorkspace();

            if (!sshSettings.IsComplete)
            {
                WorkspaceSettings.WarnUser();
                reject(new Error(_messageHostSettingsIncomlete));
                return;
            }

            //Get password from cache
            sshSettings.password = _passwordCache.get(this.CacheString(sshSettings)) || '';
            //Allow user to setup password, if it doesn't exist
            if (!await sshSettings.EnsurePassword())
            {
                reject(new Error(_messagePasswordIsEmpty));
                return;
            }

            client.on('ready', () =>
            {
                //Put password to cache
                _passwordCache.set(this.CacheString(sshSettings), sshSettings.password);
                //client.removeAllListeners('error');
                resolve(client);
            })
            .on('error', (error) =>
            {
                //Remove passowrd from cache
                _passwordCache.delete(this.CacheString(sshSettings));
                reject(error);
                ClientErrorCB(error);
            })
            .connect(sshSettings);
        });
    }

    public GetStreamSSH(client : Client, DataCb: (data: string) => void, CloseCb: (code : any, signal : any) => void) : Promise<ClientChannel>
    {
        return new Promise((resolve : (result : ClientChannel) => void, reject : (error:Error) => void) =>
        {
            client.shell((error : Error, stream : ClientChannel) =>
            {
                if (error)
                {
                    reject(error);
                }
                else
                {
                    stream.on('close', CloseCb)
                    .on('data', DataCb)
                    .stderr.on('data', DataCb);

                    resolve(stream);
                }
            });
        });
    }

    public ExecCommandSSH(client : Client, command: string, CloseCb: (code : any, signal : any) => void) : Promise<string>
    {
        return new Promise((resolve : (result : string) => void, reject : (error:Error) => void) =>
        {
            client.exec(command, (error : Error, stream : ClientChannel) =>
            {
                if (error)
                {
                    reject(error);
                }
                else
                {
                    let result : string;
                    stream.on('close', (code : any, signal : any) =>
                    {
                        resolve(result);
                        CloseCb(code, signal);
                    })
                    .on('data', function(data : string)
                    {
                        result += data;
                    })
                    .stderr.on('data', function(data)
                    {
                        result += data;
                    });
                }
            });
        });
    }

    public CreateClientSFTP(client : Client) : Promise<SFTPWrapper>
    {
        return new Promise((resolve : (sftp : SFTPWrapper) => void, reject : (error:Error) => void) =>
        {
            client.sftp(function(err, sftp)
            {
                if (err)
                {
                    reject(err);
                }
                else
                {
                    resolve(sftp);
                }
            });
        });
    }
}
