import {Client} from 'ssh2';

import * as nls from 'vscode-nls';
import { UserPasswordSection } from './config_v2/sections/user-password';
import { Config } from './config_v2/config_v2';
import { SSH_Settings } from './ssh-settings';
let _localize = nls.loadMessageBundle();

const _messagePasswordIsEmpty = _localize('create_ssh.warning', 'Please, enter password.');
const _log_end = _localize('create_ssh.ends', 'Client ends');
const _log_close_err = _localize('create_ssh.closed_err', 'Client closed with error');
const _log_close = _localize('create_ssh.closed', 'Client closed');

let _user_password_section: UserPasswordSection = new UserPasswordSection();
let _settings: SSH_Settings = new SSH_Settings(_user_password_section);
let _cfg: Config | undefined = undefined;

export async function InitCfg(config: Config) {
    _cfg = config;
    _cfg.add(_user_password_section);
    console.log('added ' + _user_password_section.name());
}

/**
 * Create SSH client using settings from current workspace.
 * 
 * @param config configuration assistent
 */
export function CreateSSHClient()  {
    return new Promise(async (resolve : (client : Client) => void, reject: (error: Error) => void) => {
        
        //ensure we are not in -=loading=-
        if (_cfg) {
            await _cfg.get(_user_password_section.name());
        }

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

