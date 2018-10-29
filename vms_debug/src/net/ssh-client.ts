import { Client, ClientChannel, ClientErrorExtensions } from 'ssh2';
import * as nls from 'vscode-nls';

let _localize = nls.loadMessageBundle();

export class SSHClient
{
    constructor() {
    }

    public async CreateClientSSH(ClientErrorCB : (err: Error & ClientErrorExtensions) => void): Promise<Client>
    {
        return undefined;
    }

    public async GetStreamSSH(client : Client, DataCb: (data: string) => void, CloseCb: (code : any, signal : any) => void) : Promise<ClientChannel>
    {
        return undefined;
    }

}
