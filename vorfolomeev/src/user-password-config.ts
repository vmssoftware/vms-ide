import { window } from "vscode";

import * as nls from 'vscode-nls';
let _localize = nls.loadMessageBundle();

export interface HostConfig {
    method: string;
    host: string;
    port?: number;
    username?: string;
    password?: string;
}

/**
 * 
 */
export class UserPasswordHostConfig implements HostConfig {
    method: string = 'user_password';    
    host: string = '';
    port: number = 22;
    username: string  = '';
    password: string = '';

    private _pass_was_entered: boolean = false;

    /**
     * Test password and prompt user if it is empty.
     */
    ensurePassword() : Thenable<boolean> {
        return new Promise<boolean>((resolve, reject) => {
            if (!this.password) {
                let prompt = _localize('user_pass_cfg.prompt', "Enter password for {0}{1}:{2}", 
                                        this.username?this.username+'@':'', this.host, this.port);
                window.showInputBox( { password: true, prompt })
                .then((value) => {
                    if (value) {
                        this.password = value;
                        //clear password only if user entered it
                        this._pass_was_entered = true;
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
            } else {
                resolve(true);
            }
        });
    }

    /**
     * One must call this function after trying to connect.
     * @param using_result true if all ok and connect estabilished, else false
     */
    didUse(using_result: boolean) : void {
        if (!using_result && this._pass_was_entered) {
            this.password = '';
        }
        this._pass_was_entered = false;
    }
}
