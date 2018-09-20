import * as nls from 'vscode-nls';
import { window } from "vscode";
import { UserPasswordHostConfig } from './host-config';
let _localize = nls.loadMessageBundle();

/**
 * SSH settings helper
 * It uses outer HostConfig implementation to hold/retrieve data
 * 
 */

export class SSH_Settings implements UserPasswordHostConfig {

    get host() {
        return this._user_password.host;
    }

    get port() {
        return this._user_password.port;
    }

    get username() {
        return this._user_password.username;
    }

    get password() {
        return this._user_password.password;
    }
    
    constructor(protected _user_password : UserPasswordHostConfig) {

    }

    protected _ensurePasswordPromise : Thenable<boolean> | undefined = undefined;
    private _pass_was_entered: boolean = false;

    /**
     * Test password and prompt user if it is empty.
     */
    ensurePassword() : Thenable<boolean> {
        if (this.password) {  //exists and isn't empty
            return Promise.resolve(true);
        }
        if (!this._ensurePasswordPromise) {
            this._ensurePasswordPromise = new Promise<boolean>((resolve, reject) => {
                let prompt = _localize('user_password.prompt', "Enter password for {0}{1}:{2}", 
                    this.username ? this.username+'@':'', this.host, this.port);
                window.showInputBox( { password: true, prompt })
                .then((value) => {
                    if (value) {
                        this._user_password.password = value;
                        //clear password only if user entered it
                        this._pass_was_entered = true;
                        resolve(true);
                    }
                    else {
                        resolve(false);
                    }
                    this._ensurePasswordPromise = undefined;
                }, (error) => {
                    this._user_password.password = '';
                    resolve(false);
                    this._ensurePasswordPromise = undefined;
                });
            })
        }
        return this._ensurePasswordPromise;
    }

    /**
     * One must call this function after trying to connect.
     * @param using_result true if all ok and connect estabilished, else false
     */
    didUse(using_result: boolean) : void {
        if (!using_result && this._pass_was_entered) {
            this._user_password.password = '';
        }
        this._pass_was_entered = false;
    }
}
