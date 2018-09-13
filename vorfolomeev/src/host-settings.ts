import {window} from 'vscode';

import {WorkspaceSettings} from './workspace-settings';

import * as nls from 'vscode-nls';
let _localize = nls.loadMessageBundle();

export class SSHSettings {

    /**
     * Default constructor.
     */
    constructor( public host: string = '', 
                 public port: number = 0,
                 public username: string = '',
                 public password: string = '' ) {

    }

    /**
     * Test `username`, `host` and `port`.
     */
    public get IsComplete() : boolean {
        return !!this.host && !!this.port && !!this.username;
    }

    /**
     * Get all values from WorkspaceSettings
     */
    public static FromWorkspace() {
        let sshSettings = new SSHSettings(
            WorkspaceSettings.GetValue<string>('host') || '',
            WorkspaceSettings.GetValue<number>('port') || 0,
            WorkspaceSettings.GetValue<string>('username') || '',
            WorkspaceSettings.GetValue<string>('password') || '');
        return sshSettings;
    }

    /**
     * Test password is non-empty.
     *
     * The returned value will be `true` if the password is entered and it is not empty. Otherwise the
     * returned value will be `false`. No reject() calls, always resolve().
     *
     */
    public async EnsurePassword() : Promise<boolean> {
        if (!this.password) {
            let prompt = _localize('host_settings.prompt', 'Enter password for {0}{1}:{2}',
                                    this.username?this.username+'@':'', this.host, this.port);
            return new Promise((resolve : (result:boolean) => void, reject) => {
                window.showInputBox( { password: true, prompt })
                .then((value) => {
                    if (value) {
                        this.password = value;
                        resolve(true);
                    }
                    else {
                        resolve(false);
                    }
                },
                (error) => {
                    this.password = '';
                    resolve(false);
                });
            });
        }
        else {
            return Promise.resolve(true);
        }
    }
    
}

