
import { window } from "vscode";

import { Lock } from "@vorfol/common";

import { IConnectConfig } from "../api";
import { ISettingsFiller } from "./settings-filler";

import * as nls from "vscode-nls";
nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

const lock = new Lock();

export class PasswordVscodeFiller implements ISettingsFiller {

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
        await lock.acquire();  // to prevent concurrent using
        settings.port = settings.port || 22;
        const prompt = localize("query.password", "Password for {0}@{1}:{2} ", settings.username, settings.host, settings.port);
        settings.password = await window.showInputBox( { password: true, prompt, ignoreFocusOut: true });
        lock.release();
        return settings.password !== undefined;
    }

}
