import { Lock } from "../../common/main";

import { IConnectConfig } from "../api";
import { ISettingsFiller } from "./settings-filler";

export class ConstPasswordFiller implements ISettingsFiller {

    private lock = new Lock();

    constructor(public password: string, public timeout?: number) {

    }

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

        await this.lock.acquire();  // to prevent concurrent use of console

        if (this.timeout) {
            const waitUser = new Lock(true);    // simulate user
            setTimeout(() => {
                settings.password = this.password;
                if (settings.keyFile !== undefined) {
                    delete settings.keyFile;
                }
                waitUser.release();
            }, this.timeout);
            await waitUser.acquire();   // do not pass until password entered
        } else {
            settings.password = this.password;
        }

        this.lock.release();

        return !!settings.password;
    }

}
