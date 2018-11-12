import * as readline from "readline";

import { Lock } from "@vorfol/common";

import { IConnectConfig } from "../api";
import { ISettingsFiller } from "./settings-filler";

import * as nls from "vscode-nls";
nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

const lock = new Lock();

export class PasswordConsoleFiller implements ISettingsFiller {

    /**
     * True it settings has unempty host and username
     * @param settings
     */
    public testSettings(settings: IConnectConfig): boolean {
        const ret = typeof settings.host === "string" &&
                    !!settings.host &&
                    typeof settings.username === "string" &&
                    !!settings.username;
        return ret;
    }

    public async fillSetting(settings: IConnectConfig): Promise<boolean> {

        if (typeof settings.password === "string" &&
            settings.password) {
            // ok, already has
            return true;
        }

        await lock.acquire();  // to prevent concurrent use of console

        let retCode = false;
        const waitUser = new Lock(true);    // to wait user input

        settings.port = settings.port || 22;
        const readLineInterface = readline.createInterface(process.stdin, process.stdout);
        const prompt = localize("query.password", "Password for {0}@{1}:{2} ", settings.username, settings.host, settings.port);
        // TODO: how to use * instead of symbols?
        readLineInterface.question(prompt, (answer) => {
            readLineInterface.close();
            if (answer) {
                settings.password = answer;
                retCode = true;
            }
            waitUser.release();     // ok, may proceed
        });

        await waitUser.acquire();   // do not pass until password entered

        lock.release();
        return retCode;
    }

}
