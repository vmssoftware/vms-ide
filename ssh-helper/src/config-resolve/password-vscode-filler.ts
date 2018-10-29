import { ConnectConfig } from "ssh2";
import { window } from "vscode";

import { Lock } from "@vorfol/common";

import { ISettingsFiller } from "./settings-filler";

export class PasswordVscodeFiller implements ISettingsFiller {

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
        settings.port = settings.port || 22;
        const prompt = `Password for ${settings.username}@${settings.host}:${settings.port} `;
        settings.password = await window.showInputBox( { password: true, prompt, ignoreFocusOut: true });
        this.lock.release();
        return settings.password !== undefined;
    }

}
