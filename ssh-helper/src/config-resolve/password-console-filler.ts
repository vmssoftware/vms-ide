import * as readline from "readline";
import { ConnectConfig } from "ssh2";

import { Lock } from "@vorfol/common";

import { ISettingsFiller } from "./settings-filler";

export class PasswordConsoleFiller implements ISettingsFiller {

    private lock = new Lock();

    /**
     * True it settings has unempty host and username
     * @param settings
     */
    public testSettings(settings: ConnectConfig): boolean {
        const ret = typeof settings.host === "string" &&
                    !!settings.host &&
                    typeof settings.username === "string" &&
                    !!settings.username;
        return ret;
    }

    public async fillSetting(settings: ConnectConfig): Promise<boolean> {

        if (typeof settings.password === "string" &&
            settings.password) {
            // ok, already has
            return true;
        }

        await this.lock.acquire();  // to prevent concurrent use of console

        let retCode = false;
        const waitUser = new Lock(true);    // to wait user input

        settings.port = settings.port || 22;
        const readLineInterface = readline.createInterface(process.stdin, process.stdout);
        const prompt = `Password for ${settings.username}@${settings.host}:${settings.port} `;
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

        this.lock.release();
        return retCode;
    }

}
