import {Client} from 'ssh2';
import { Configuration } from './configuration/config';
import { UserPasswordHostConfig } from './user-password-config';

import * as nls from 'vscode-nls';
let _localize = nls.loadMessageBundle();

const _messagePasswordIsEmpty = _localize('create_ssh.warning', 'Please, enter password.');
const _log_end = _localize('create_ssh.ends', 'Client ends');
const _log_close_err = _localize('create_ssh.closed_err', 'Client closed with error');
const _log_close = _localize('create_ssh.closed', 'Client closed');

let _settings: UserPasswordHostConfig = new UserPasswordHostConfig();

export async function InitCfg(config: Configuration) {
    if (!await config.get('connection')) {
        config.add('connection', _settings);
        await config.load();
        console.log('create-ssh-client InitCfg loaded');
    }
}

/**
 * Create SSH client using settings from current workspace.
 * 
 * @param config configuration assistent
 */
export function CreateSSHClient()  {
    return new Promise(async (resolve : (client : Client) => void, reject: (error: Error) => void) => {
        
        let client = new Client();

        //Allow user to setup password, if it doesn't exist
        if (!await _settings.ensurePassword()) {
            reject(new Error(_messagePasswordIsEmpty));
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
        });
        //OnEnd
        client.on('end', () => {
            console.log(_log_end);
        });
        //OnClose
        client.on('close', (hadError) => {
            if (hadError) {
                console.log(_log_close_err);
            } else {
                console.log(_log_close);
            }
        });
        //client.connect(Object.assign({debug: console.log}, _settings));
        client.connect( _settings );
    });
}

