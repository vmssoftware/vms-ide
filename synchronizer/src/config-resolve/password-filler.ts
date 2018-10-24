import { ConnectConfig } from "ssh2";
import { Lock } from "../common/lock";
import { ISettingsFiller } from "./settings-filler";

export class ConstPasswordFiller implements ISettingsFiller {

    private lock = new Lock();

    constructor(public password: string, public timeout?: number) {

    }

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

        if (this.timeout) {
            const waitUser = new Lock(true);    // simulate user
            setTimeout(() => {
                settings.password = this.password;
                waitUser.release();
            }, this.timeout);
            await waitUser.acquire();   // do not pass until password entered
        }

        this.lock.release();

        return !!settings.password;
    }

}
