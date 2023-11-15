
import { LogFunction, LogType } from "../../common/main";
import { IConnectConfig } from "../api";
import { ISettingsFiller } from "./settings-filler";

export class AgentFiller implements ISettingsFiller {

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
                    ((typeof settings.addConnectConfig?.agent === "string" && !!settings.addConnectConfig?.agent));
        return ret;
    }

    public async fillSetting(settings: IConnectConfig): Promise<boolean> {

        if (typeof settings.addConnectConfig?.agent === "string" && !!settings.addConnectConfig?.agent) {
            // ok, already has
            return true;
        }
        return false;
    }

}
