import { LogFunction } from "@vorfol/common";
import { IConnectConfig } from "./ext-api/api";
import { GetProjectDepApi } from "./ext-api/get-proj-api";
import { GetSshHelperType } from "./ext-api/get-ssh-helper";

export async function onTheSameVms(scope: string, logFn: LogFunction) {
    if (!scope) {
        return true;
    }
    const projApi = await GetProjectDepApi();
    if (!projApi) {
        return true;
    }
    const sshHelperType = await GetSshHelperType();
    if (!sshHelperType) {
        return true;
    }
    const sshHelper = new sshHelperType(logFn);
    const deps = projApi.getDepList(scope);
    let   testConnectionSettings: IConnectConfig | undefined;
    for (const dep of deps) {
        const cfg = await sshHelper.getSettings(dep);
        if (cfg) {
            const res = cfg.connectConfigResolver.testConnectConfig(cfg.connectionSection);
            if (res.settings) {
                if (!testConnectionSettings) {
                    testConnectionSettings = res.settings;
                } else if (testConnectionSettings.host !== res.settings.host ||
                           testConnectionSettings.username !== res.settings.username) {
                    return false;
                }
            }
        }
    }
    return true;
}
