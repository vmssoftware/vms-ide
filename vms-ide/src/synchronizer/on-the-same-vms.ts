import { LogFunction } from "../common/main";

import { GetSshHelperType } from "../ext-api/ext-api";
import { IConnectConfig } from "../ssh-helper/api";
import { ProjDepTree } from "./dep-tree/proj-dep-tree";

export async function onTheSameVms(scope: string, logFn: LogFunction) {
    if (!scope) {
        return true;
    }
    const sshHelperType = await GetSshHelperType();
    if (!sshHelperType) {
        return true;
    }
    const sshHelper = new sshHelperType(logFn);
    const deps = new ProjDepTree().getDepList(scope);
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
