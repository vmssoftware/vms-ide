import { ConnectConfig } from "ssh2";
import { window } from "vscode";
import { IConnectConfigResolver } from "./connect-config-resolver";

import * as nls from "vscode-nls";
const localize = nls.loadMessageBundle();

export class PasswordChecker implements IConnectConfigResolver {

    public get resolvedConfig(): ConnectConfig | undefined {
        return this.settings;
    }

    private ensurePasswordPromise: Promise<ConnectConfig|undefined> | undefined = undefined;
    private passWasEntered = false;
    private settings: ConnectConfig | undefined;

    public resolveConnectConfig(settings: ConnectConfig): Promise<ConnectConfig|undefined> {
        if (!this.ensurePasswordPromise) {
            this.ensurePasswordPromise = new Promise<ConnectConfig|undefined>((resolve) => {
                if (!settings ||
                    !settings.host ||
                    !settings.username) {
                    resolve(undefined);
                    return;
                }
                if (typeof settings.password === "string" &&
                    settings.password) {
                    this.holdSettings(settings, settings.password);
                    resolve(settings);
                    return;
                }
                settings.port = settings.port || 22;
                const prompt = localize("user_password.prompt", "Enter password for {0}@{1}:{2}",
                    settings.username, settings.host, settings.port);
                window.showInputBox( { password: true, prompt })
                .then((value) => {
                    if (value) {
                        this.holdSettings(settings, value);
                        this.passWasEntered = true;
                        resolve(this.settings);
                    } else {
                        this.passWasEntered = false;
                        resolve(undefined);
                    }
                }, (error) => {
                    this.passWasEntered = false;
                    resolve(undefined);
                });
            });
        }
        return this.ensurePasswordPromise;
    }

    public clearCache(): boolean  {
        this.ensurePasswordPromise = undefined;
        return true;
    }

    public feedBack(settings: ConnectConfig, accepted: boolean): void {
        if (!accepted && this.passWasEntered) {
            this.settings = undefined;
        }
        this.passWasEntered = false;
    }

    private holdSettings(settings: ConnectConfig, password: string) {
        this.settings = {};
        this.settings.host = settings.host;
        this.settings.port = settings.port;
        this.settings.username = settings.username;
        this.settings.password = password;
    }
}
