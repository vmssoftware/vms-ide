import { IConfig, IConfigHelper, IConfigSection } from "./config/config";

import { LogType } from "@vorfol/common";

import { GetConfigHelperFromApi } from "./config/get-config-helper";
import { ProjectSection } from "./config/sections/project";
import { SynchronizeSection } from "./config/sections/synchronize";

export const sections: IConfigSection[] = [];
sections.push(new ProjectSection());
sections.push(new SynchronizeSection());

export let settingsEnsured: boolean | undefined;
export let configHelper: IConfigHelper | undefined;
export let synchronizerConfig: IConfig | undefined;

const sectionName = "vmssoftware.synchronizer";

export async function EnsureSettings(debugLog?: LogType) {
    if (settingsEnsured !== undefined) {
        return settingsEnsured;
    }
    if (!synchronizerConfig) {
        const api = await GetConfigHelperFromApi();
        if (api) {
            configHelper = api.getConfigHelper(sectionName);
            synchronizerConfig = configHelper.getConfig();
        }
    }
    if (!synchronizerConfig) {
        settingsEnsured = false;
        return false;
    }
    // in first add missed
    for (const section of sections) {
        const testSection = await synchronizerConfig.get(section.name());
        if (!testSection) {
            synchronizerConfig.add(section);
        }
    }
    // then ensure all are loaded
    for (const section of sections) {
        const testSection = await synchronizerConfig.get(section.name());
        if (debugLog && typeof section !== typeof testSection) {
            debugLog(`Different types of sections ${section.name()}`);
            return false;
        }
    }
    return true;
}
