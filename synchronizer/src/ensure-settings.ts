import { ConfigHelper, IConfig, IConfigHelper, IConfigSection } from "./ext-api/config";

import { LogFunction, LogType } from "@vorfol/common";

import { GetConfigHelperFromApi } from "./config/get-config-helper";
import { ProjectSection } from "./config/sections/project";
import { SynchronizeSection } from "./config/sections/synchronize";

export const sections: IConfigSection[] = [];
sections.push(new ProjectSection());
sections.push(new SynchronizeSection());

export let settingsEnsured: boolean | undefined;
export let configApi: typeof ConfigHelper | undefined;
export let configHelper: IConfigHelper | undefined;
export let synchronizerConfig: IConfig | undefined;

const sectionName = "vmssoftware.synchronizer";

import * as nls from "vscode-nls";
nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export async function EnsureSettings(debugLog?: LogFunction) {
    if (settingsEnsured !== undefined) {
        return settingsEnsured;
    }
    if (!synchronizerConfig) {
        configApi = await GetConfigHelperFromApi();
        if (configApi) {
            configHelper = configApi.getConfigHelper(sectionName);
            synchronizerConfig = configHelper.getConfig();
            synchronizerConfig.onDidLoad(() => {
                if (debugLog) {
                    debugLog( LogType.debug, () => localize("debug.did_load_config", "Configuration did load"));
                }
            });
        } else {
            settingsEnsured = false;
            return settingsEnsured;
        }
    }
    if (!synchronizerConfig) {
        settingsEnsured = false;
        return settingsEnsured;
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
            debugLog(LogType.debug, () => localize("debug.different_types", "Different types of sections ${0}", section.name()));
            settingsEnsured = false;
            return settingsEnsured;
        }
    }
    settingsEnsured = true;
    return settingsEnsured;
}
