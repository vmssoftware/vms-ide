import * as nls from "vscode-nls";
import { LogFunction } from "../common/main";

import { IConfigApi, IConfigHelper, IConfigSection } from "../config-helper/config/config";
import { GetConfigHelperFromApi } from "../ext-api/ext-api";
import { ProjectSection } from "./config/sections/project";
import { SynchronizeSection } from "./config/sections/synchronize";
import { ISyncScopeSettings } from "./sync/sync-api";
import { BuildsSection } from "./config/sections/builds";

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export interface IEnsured extends ISyncScopeSettings {
    scope?: string;
    configHelper: IConfigHelper;
}

export let configApi: IConfigApi | undefined;

export async function ensureConfigHelperApi(): Promise<boolean> {
    if (!configApi) {
        configApi = await GetConfigHelperFromApi();
    }
    return configApi !== undefined;
}

const extensionName = "vmssoftware.synchronizer";

/**
 * Returns always new IEnsured object with properly filled values.
 * @param scope name of workspaseFolder
 * @param log log
 */
export async function ensureSettings(scope?: string, log?: LogFunction): Promise<IEnsured | undefined> {
    // tslint:disable-next-line:no-empty
    const logFn = log || (() => {});
    if (!await ensureConfigHelperApi() || configApi === undefined) {
        return undefined;
    }
    const configHelper = configApi.getConfigHelper(extensionName, scope);

    if (!configHelper.workspaceFolder) {
        return undefined;
    }

    const config = configHelper.getConfig();
    // first try
    let [projectSection, synchronizeSection, buildsSection] =
        await Promise.all(
            [config.get(ProjectSection.section),
             config.get(SynchronizeSection.section),
             config.get(BuildsSection.section),
            ]);
    // test and add if missed
    const wait = [];
    if (!projectSection) {
        config.add(new ProjectSection());
        wait.push(config.get(ProjectSection.section).then((section) => {
            projectSection = section;
        }));
    }
    if (!synchronizeSection) {
        config.add(new SynchronizeSection());
        wait.push(config.get(SynchronizeSection.section).then((section) => {
            synchronizeSection = section;
        }));
    }
    if (!buildsSection) {
        config.add(new BuildsSection());
        wait.push(config.get(BuildsSection.section).then((section) => {
            buildsSection = section;
        }));
    }
    // wait
    if (wait.length > 0) {
        await Promise.all(wait);
    }
    // then ensure all are loaded
    if (ProjectSection.is(projectSection) && 
        SynchronizeSection.is(synchronizeSection) &&
        BuildsSection.is(buildsSection)) {
        return {
            scope,
            configHelper,
            projectSection,
            synchronizeSection,
            buildsSection,
        };
    }
    return undefined;
}

export async function ensureConfigSection(extension: string, cfgSection: IConfigSection, scope?: string, log?: LogFunction): Promise<IConfigSection | undefined> {

    if (!await ensureConfigHelperApi() || configApi === undefined) {
        return undefined;
    }
    const configHelper = configApi.getConfigHelper(extension, scope);

    if (!configHelper.workspaceFolder) {
        return undefined;
    }

    const config = configHelper.getConfig();
    
    // first try
    let storedCfgSection = await config.get(cfgSection.name());

    // test, then add if missed
    if (!storedCfgSection) {
        config.add(cfgSection);
        storedCfgSection = await config.get(cfgSection.name());
    }
    
    return storedCfgSection;
}
