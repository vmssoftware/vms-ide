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

import * as nls from "vscode-nls";
nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export async function EnsureSettings(debugLog?: LogType) {
    if (settingsEnsured !== undefined) {
        return settingsEnsured;
    }
    if (!synchronizerConfig) {
        const api = await GetConfigHelperFromApi();
        if (api) {
            configHelper = api.getConfigHelper(sectionName);
            synchronizerConfig = configHelper.getConfig();
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
            debugLog(localize("debug.different_types", "Different types of sections ${0}", section.name()));
            settingsEnsured = false;
            return settingsEnsured;
        }
    }
    settingsEnsured = true;
    return settingsEnsured;
}
