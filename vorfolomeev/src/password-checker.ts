import { window } from "vscode";
import * as nls from "vscode-nls";
import { IUserPasswordHostConfig } from "./host-config";
const localize = nls.loadMessageBundle();

export class PasswordChecker  {

    get host() {
        return this.userPassword.host;
    }

    get port() {
        return this.userPassword.port;
    }

    get username() {
        return this.userPassword.username;
    }

    get password() {
        return this.userPassword.password;
    }

    protected ensurePasswordPromise: Promise<boolean> | undefined = undefined;
    private passWasEntered: boolean = false;

    constructor(protected userPassword: IUserPasswordHostConfig) {

    }

    /**
     * Test password and prompt user if it is empty.
     */
    public ensurePassword(): Promise<boolean> {
        if (this.password) {  // exists and isn't empty
            return Promise.resolve(true);
        }
        if (!this.ensurePasswordPromise) {
            this.ensurePasswordPromise = new Promise<boolean>((resolve, reject) => {
                const prompt = localize("user_password.prompt", "Enter password for {0}{1}:{2}",
                    this.username ? this.username + "@" : "", this.host, this.port);
                window.showInputBox( { password: true, prompt })
                .then((value) => {
                    if (value) {
                        this.userPassword.password = value;
                        // clear password only if user entered it
                        this.passWasEntered = true;
                        resolve(true);
                    } else {
                        resolve(false);
                    }
                    this.ensurePasswordPromise = undefined;
                }, (error) => {
                    this.userPassword.password = "";
                    resolve(false);
                    this.ensurePasswordPromise = undefined;
                });
            });
        }
        return this.ensurePasswordPromise;
    }

    /**
     * One must call this function after trying to connect.
     * @param usingResult true if all ok and connect estabilished, else false
     */
    public didUse(usingResult: boolean): void {
        if (!usingResult && this.passWasEntered) {
            this.userPassword.password = "";
        }
        this.passWasEntered = false;
    }
}
