import { Disposable } from "vscode";

import { LogFunction, LogType } from "@vorfol/common";

import { GetConfigHelperFromApi } from "./config/get-config-helper";
import { IProjectSection, ProjectSection } from "./config/sections/project";
import { ISynchronizeSection, SynchronizeSection } from "./config/sections/synchronize";
import { ConfigHelper, IConfig, IConfigHelper } from "./ext-api/config";

export let projectSection: IProjectSection | undefined;
export let synchronizeSection: ISynchronizeSection | undefined;
export let configIsInvalid = false;
export let didLoadDispose: Disposable;

export let configApi: typeof ConfigHelper | undefined;
export let configHelper: IConfigHelper | undefined;
export let synchronizerConfig: IConfig | undefined;

const sectionName = "vmssoftware.synchronizer";

import * as nls from "vscode-nls";
nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export async function ensureSettings(log?: LogFunction) {
    // tslint:disable-next-line:no-console
    const logFn = log || ((t, mf) => console.log(mf()));
    if (!configIsInvalid &&
        projectSection &&
        synchronizeSection) {
        logFn(LogType.debug, () => localize("already", "Already have all sections loaded"));
        return true;
    }
    if (!synchronizerConfig) {
        configApi = await GetConfigHelperFromApi();
        if (configApi) {
            configHelper = configApi.getConfigHelper(sectionName);
            synchronizerConfig = configHelper.getConfig();
            didLoadDispose = synchronizerConfig.onDidLoad(() => {
                configIsInvalid = true;
                logFn(LogType.debug, () => localize("invalidate", "Invalidate settings: onDidLoad()"));
            });
        }
    }
    if (!synchronizerConfig) {
        logFn(LogType.debug, () => localize("config.failed", "Failed to load config-helper"));
        return false;
    }
    // first try
    let [projectSectionT, syncSectionT] =
        await Promise.all(
            [synchronizerConfig.get(ProjectSection.section),
             synchronizerConfig.get(SynchronizeSection.section)]);
    // test and add if missed
    if (!projectSectionT) {
        synchronizerConfig.add(new ProjectSection());
    }
    if (!syncSectionT) {
        synchronizerConfig.add(new SynchronizeSection());
    }
    // second try
    [projectSectionT, syncSectionT] =
        await Promise.all(
            [synchronizerConfig.get(ProjectSection.section),
             synchronizerConfig.get(SynchronizeSection.section)]);
    // then ensure all are loaded
    if (ProjectSection.is(projectSectionT)) {
        projectSection = projectSectionT;
    }
    if (SynchronizeSection.is(syncSectionT)) {
        synchronizeSection = syncSectionT;
    }
    configIsInvalid =
        projectSection === undefined ||
        synchronizeSection === undefined;
    logFn(LogType.debug, () => localize("returns", "returns: {0}", !configIsInvalid));
    return !configIsInvalid;
}
