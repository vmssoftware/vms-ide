import { Client, ClientChannel, SFTPWrapper, ClientErrorExtensions } from 'ssh2';
import { UserPasswordSection } from '../config/sections/user-password';
import { SSHSettings } from './ssh-settings';
import { IConfigHelper } from '../ext-api/config';
import * as nls from 'vscode-nls';

let _localize = nls.loadMessageBundle();

let _user_password_section: UserPasswordSection = new UserPasswordSection();
let _settings: SSHSettings = new SSHSettings(_user_password_section);
let _cfg: IConfigHelper | undefined = undefined;

export async function InitCfg(config: IConfigHelper) {
    _cfg = config;
    _cfg.getConfig().add(_user_password_section);
    console.log('added ' + _user_password_section.name());
}


export class SSHClient
{
    private static readonly _messagePasswordIsEmpty = _localize('create_ssh.warning', 'Please, enter password.');
    private static readonly _log_end = _localize('create_ssh.ends', 'Client ends');
    private static readonly _log_close_err = _localize('create_ssh.closed_err', 'Client closed with error');
    private static readonly _log_close = _localize('create_ssh.closed', 'Client closed');

    constructor() {
    }

    public async CreateClientSSH(ClientErrorCB : (err: Error & ClientErrorExtensions) => void) : Promise<Client>
    {
        return new Promise(async (resolve : (client : Client) => void, reject: (error: Error) => void) =>
        {
            //ensure we are not in -=loading=-
            if (_cfg) {
                await _cfg.getConfig().get(_user_password_section.name());
            }

            let client = new Client();

            //Allow user to setup password, if it doesn't exist
            if (!await _settings.ensurePassword()) {
                reject(new Error(SSHClient._messagePasswordIsEmpty));
                return;
            }

            //OnReady
            client.on('ready', () => {
                _settings.didUse(true);
                resolve(client);
            });
            //OnError
            client.on('error', (error) => {
                _settings.didUse(false);
                reject(error);
                ClientErrorCB(error);
            });
            //OnEnd
            client.on('end', () => {
                console.log(SSHClient._log_end);
            });
            //OnClose
            client.on('close', (hadError) => {
                if (hadError) {
                    console.log(SSHClient._log_close_err);
                } else {
                    console.log(SSHClient._log_close);
                }
            });
            //client.connect(Object.assign({debug: console.log}, _settings));
            client.connect( _settings );
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
