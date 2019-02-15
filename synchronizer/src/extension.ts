import { commands, env, ExtensionContext, window, workspace, extensions } from "vscode";

import { Builder } from "./build/builder";
import { setExtensionContext } from "./context";
import { ProjectState } from "./dep-tree/proj-state";
import { ProjDepProvider } from "./dep-tree/project-dep";
import { ProjDescrProvider } from "./dep-tree/project-descr";
import { configApi, ensureConfigHelperApi } from "./ensure-settings";
import { Perform } from "./performer";
import { SyncApi } from "./sync/sync-api";
import { Synchronizer } from "./sync/synchronizer";

import { LogFunction, LogType } from "@vorfol/common";

const locale = env.language ;
import * as nls from "vscode-nls";
const localize = nls.config({ locale, messageFormat: nls.MessageFormat.both })();

// tslint:disable-next-line:no-empty
let logFn: LogFunction = () => {};

export async function activate(context: ExtensionContext) {

    if (!await ensureConfigHelperApi() || configApi === undefined) {
        return undefined;
    }

    const syncLog = configApi.createLogFunction("OpenVMS synchronizer");
    const buildLog = configApi.createLogFunction("OpenVMS builder");

    logFn = syncLog;

    setExtensionContext(context);

    syncLog(LogType.debug, () => localize("debug.activated", "OpenVMS extension is activated"));

    context.subscriptions.push(Synchronizer.acquire(syncLog));
    context.subscriptions.push(Builder.acquire(buildLog));

    context.subscriptions.push( window.registerUriHandler({
        handleUri(uri) {
            syncLog(LogType.debug, () => `command: ${uri.path}`);
            syncLog(LogType.debug, () => `query: ${uri.query}`);
            syncLog(LogType.debug, () => `fragment: ${uri.fragment}`);
        }}));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.syncProject", async (scope: string) => {
        return workspace.saveAll(true)
            .then((saved) => {
                if (saved) {
                    return Perform("synchronize", scope, syncLog);
                }
                return saved;
            });
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.buildProject", async (scope: string, params: string) => {
        return workspace.saveAll(true)
            .then((saved) => {
                if (saved) {
                    return Perform("build", scope, buildLog, params);
                }
                return saved;
            });
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.reBuildProject", async (scope: string, params: string) => {
        return workspace.saveAll(true)
            .then((saved) => {
                if (saved) {
                    return Perform("rebuild", scope, buildLog, params);
                }
                return saved;
            });
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.cleanProject", async (scope: string, buildType: string) => {
        return Perform("clean", scope, buildLog, buildType);
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.createMMS", async (scope: string) => {
        return Perform("create mms", scope, buildLog);
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.stopSync", async () => {
        return Synchronizer.acquire().disableRemote();
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.editProject", async (scope: string) => {
        return Perform("edit settings", scope, syncLog);
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.changeCRLF", async (scope: string) => {
        return Perform("crlf", scope, syncLog);
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.forceSynchronized", async (scope: string) => {
        return ProjectState.acquire().setSynchronized(scope, true);
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.forceBuilt", async (scope: string, buildType: string) => {
        return ProjectState.acquire().setBuilt(scope, buildType, true);
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.uploadZip", async (scope: string, clear: string) => {
        return Perform("zip", scope, syncLog, clear);
    }));

    const projectDependenciesProvider = new ProjDepProvider();
    const projectDescriptionProvider = new ProjDescrProvider();

    context.subscriptions.push( window.registerTreeDataProvider("vmssoftware.project-dep.projectDependencies", projectDependenciesProvider) );
    context.subscriptions.push( commands.registerCommand("vmssoftware.project-dep.projectDependencies.select",
        (element) => projectDependenciesProvider.select(element)) );
    context.subscriptions.push( commands.registerCommand("vmssoftware.project-dep.projectDependencies.add",
        (element) => projectDependenciesProvider.add(element)) );
    context.subscriptions.push( commands.registerCommand("vmssoftware.project-dep.projectDependencies.build",
        (element) => projectDependenciesProvider.build(element)) );
    context.subscriptions.push( commands.registerCommand("vmssoftware.project-dep.projectDependencies.rebuild",
        (element) => projectDependenciesProvider.rebuild(element)) );
    context.subscriptions.push( commands.registerCommand("vmssoftware.project-dep.projectDependencies.clean",
        (element) => projectDependenciesProvider.clean(element)) );
    context.subscriptions.push( commands.registerCommand("vmssoftware.project-dep.projectDependencies.remove",
        (element) => projectDependenciesProvider.remove(element)) );
    context.subscriptions.push( commands.registerCommand("vmssoftware.project-dep.projectDependencies.refresh",
        () => projectDependenciesProvider.refresh()) );

    context.subscriptions.push( window.registerTreeDataProvider("vmssoftware.project-dep.projectDescription", projectDescriptionProvider) );
    context.subscriptions.push( commands.registerCommand("vmssoftware.project-dep.projectDescription.select",
        (projectName) => projectDescriptionProvider.select(projectName)) );
    context.subscriptions.push( commands.registerCommand("vmssoftware.project-dep.projectDescription.refresh",
        () => projectDescriptionProvider.refresh()) );
    context.subscriptions.push( commands.registerCommand("vmssoftware.project-dep.projectDescription.edit",
        (element) => projectDescriptionProvider.edit(element)) );
    context.subscriptions.push( commands.registerCommand("vmssoftware.project-dep.projectDescription.changeBuildType",
        () => projectDescriptionProvider.changeBuildType()) );

    context.subscriptions.push( commands.registerCommand("vmssoftware.project-dep.projectState.didSynchronize",
        (folderName: string) => ProjectState.acquire().setSynchronized(folderName)) );
    context.subscriptions.push( commands.registerCommand("vmssoftware.project-dep.projectState.didBuild",
        (folderName: string, buildType: string) => ProjectState.acquire().setBuilt(folderName, buildType)) );

    return new SyncApi();
}

// this method is called when your extension is deactivated
export function deactivate() {
    logFn(LogType.debug, () => localize("debug.deactivated", "OpenVMS extension is deactivated"));
}
