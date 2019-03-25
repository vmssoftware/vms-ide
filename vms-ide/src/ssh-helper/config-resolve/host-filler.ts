
import { LogFunction } from "../../common/main";
import { IConnectConfig, IHostsSection } from "../api";
import { ISettingsFiller } from "./settings-filler";

export class HostFiller implements ISettingsFiller {

    private static rg = /^<(.*)>$/;

    public logFn: LogFunction;

    constructor(public hostSection: IHostsSection, logFunc?: LogFunction) {
        // tslint:disable-next-line:no-empty
        this.logFn = logFunc || (() => {});
    }

    /**
     * If settings has <host> then resolve it from hosts and pass to the next fillers
     * @param settings
     */
    public testSettings(settings: IConnectConfig): boolean {
        if (typeof settings.host === "string" && !!settings.host) {
            const matched = settings.host.match(HostFiller.rg);
            if (matched) {
                for (const host of this.hostSection.hosts) {
                    if (host.label === matched[1]) {
                        settings.host = host.host;
                        settings.port = host.port;
                        settings.username = host.username;
                        settings.keyFile = host.keyFile;
                        settings.password = host.password;
                        break;
                    }
                }
            }
        }
        return false;
    }

    public async fillSetting(settings: IConnectConfig): Promise<boolean> {
        return false;
    }

}
