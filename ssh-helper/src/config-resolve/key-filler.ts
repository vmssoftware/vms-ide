import * as fs from "fs-extra";

import { ISettingsFiller } from "./settings-filler";
import { IConnectConfig } from "../api";
import { LogFunction, LogType } from "@vorfol/common";

export class KeyFiller implements ISettingsFiller {

    public logFn: LogFunction;
    
    constructor(logFunc?: LogFunction) {
        // tslint:disable-next-line:no-empty
        this.logFn = logFunc || (() => {});
    }

    /**
     * True it settings has unempty host and username
     * @param settings
     */
    public testSettings(settings: IConnectConfig): boolean {
        const ret = typeof settings.host === "string" && !!settings.host &&
                    typeof settings.username === "string" && !!settings.username &&
                    ( (typeof settings.privateKey === "string" && !!settings.privateKey) || 
                      Buffer.isBuffer(settings.privateKey) || 
                      (typeof settings.keyFile === "string" && !!settings.keyFile)
                    );
        return ret;
    }

    public async fillSetting(settings: IConnectConfig): Promise<boolean> {

        if (typeof settings.privateKey === "string" ||
            Buffer.isBuffer(settings.privateKey)) {
            // ok, already has
            return true;
        }
        if (!settings.keyFile) {
            return false;
        }
        try {
            settings.privateKey = await fs.readFile(settings.keyFile);
            if (settings.keyFile !== undefined) {
                delete settings.keyFile;
            }
            if (settings.password !== undefined) {
                delete settings.password;
            }
            return true;
        } catch (err) {
            this.logFn(LogType.error, () => String(err));
            return false;
        }
    }

}
