import {Client} from 'ssh2';

import * as nls from 'vscode-nls';
import { UserPasswordSection } from './config/sections/user-password';
import { SSH_Settings } from './ssh-settings';
import { IConfigHelper } from "./ext-api/config";
let _localize = nls.loadMessageBundle();

const _messagePasswordIsEmpty = _localize('create_ssh.warning', 'Please, enter password.');
const _log_end = _localize('create_ssh.ends', 'Client ends');
const _log_close_err = _localize('create_ssh.closed_err', 'Client closed with error');
const _log_close = _localize('create_ssh.closed', 'Client closed');

let _user_password_section: UserPasswordSection = new UserPasswordSection();
let _settings: SSH_Settings = new SSH_Settings(_user_password_section);
let _cfg: IConfigHelper | undefined = undefined;

export async function InitCfg(config: IConfigHelper) {
    _cfg = config;
    _cfg.getConfig().add(_user_password_section);
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
            await _cfg.getConfig().get(_user_password_section.name());
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

