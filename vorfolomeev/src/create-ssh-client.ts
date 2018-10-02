import {Client} from "ssh2";

import * as nls from "vscode-nls";
import { UserPasswordSection } from "./config/sections/user-password";
import { IConfigHelper } from "./ext-api/config";
import { SSHSettings } from "./ssh-settings";
const localize = nls.loadMessageBundle();

const messagePasswordIsEmpty = localize("create_ssh.warning", "Please, enter password.");
const logEnd = localize("create_ssh.ends", "Client ends");
const logCloseErr = localize("create_ssh.closed_err", "Client closed with error");
const logClose = localize("create_ssh.closed", "Client closed");

const userPasswordSection: UserPasswordSection = new UserPasswordSection();
const settings: SSHSettings = new SSHSettings(userPasswordSection);
let cfg: IConfigHelper | undefined;

// tslint:disable-next-line:no-console
let logFn = console.log;
// tslint:disable-next-line:no-empty
logFn = () => {};

export async function InitCfg(config: IConfigHelper) {
    cfg = config;
    cfg.getConfig().add(userPasswordSection);
    logFn("added " + userPasswordSection.name());
}

/**
 * Create SSH client using settings from current workspace.
 *
 * @param config configuration assistent
 */
export function CreateSSHClient()  {
    return new Promise(async (resolve: (client: Client) => void, reject: (error: Error) => void) => {

        // ensure we are not in -=loading=-
        if (cfg) {
            await cfg.getConfig().get(userPasswordSection.name());
        }

        const client = new Client();

        // Allow user to setup password, if it doesn't exist
        if (!await settings.ensurePassword()) {
            reject(new Error(messagePasswordIsEmpty));
            return;
        }

        // OnReady
        client.on("ready", () => {
            settings.didUse(true);
            resolve(client);
        });
        // OnError
        client.on("error", (error) => {
            settings.didUse(false);
            reject(error);
        });
        // OnEnd
        client.on("end", () => {
            logFn(logEnd);
        });
        // OnClose
        client.on("close", (hadError) => {
            if (hadError) {
                logFn(logCloseErr);
            } else {
                logFn(logClose);
            }
        });
        // client.connect(Object.assign({debug: console.log}, _settings));
        client.connect( settings );
    });
}
