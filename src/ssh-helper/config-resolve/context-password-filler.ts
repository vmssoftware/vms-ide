import { Lock } from "../../common/main";

import { IConnectConfig } from "../api";
import { ISettingsFiller } from "./settings-filler";

export interface IContextPassword {
    host?: string;
    password?: string;
}

export class ContextPasswordFiller implements ISettingsFiller {

    private lock = new Lock();

    constructor(public contexts: IContextPassword[] = [], public emulateUserDelay = 0) {
    }

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

        for (const context of this.contexts) {
            if (context.host === settings.host) {
                if (this.emulateUserDelay !== 0) {
                    await this.lock.acquire();  // to prevent concurrent use of console
                    const waitUser = new Lock(true);    // simulate user
                    setTimeout(() => {
                        settings.password = context.password;
                        waitUser.release();
                    }, this.emulateUserDelay);
                    await waitUser.acquire();   // do not pass until password entered
                    this.lock.release();
                } else {
                    settings.password = context.password;
                }
            }
        }

        return !!settings.password;
    }

}
