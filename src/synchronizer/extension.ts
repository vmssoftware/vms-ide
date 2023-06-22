import {
    Event,
    ExtensionContext,
    commands,
    env,
    window,
    workspace,
    TextDocumentContentProvider,
    EventEmitter,
    Uri,
} from "vscode";

import fs from "fs";
import path from "path";

import * as nls from "vscode-nls";

import { Builder } from "./build/builder";
import { setExtensionContext } from "./context";
import { ProjectState } from "./dep-tree/proj-state";
import { ProjDepProvider } from "./dep-tree/project-dep";
import { ProjDescrProvider } from "./dep-tree/project-descr";
import { configApi, ensureConfigHelperApi } from "./ensure-settings";
import { Perform } from "./performer";
import { SyncApi } from "./sync/sync-api";
import { Synchronizer } from "./sync/synchronizer";
import { LogFunction, LogType, Delay } from "../common/main";
import { createFsWatchers, disposeFsWatchers, ProjectFilesWatchEmitter } from "./scopeWatchers";
import { setProjectDependenciesChanged } from "./projectDepend";
import { ShellParser } from "../ssh-helper/stream/shell-parser";

const locale = env.language ;
const localize = nls.config({ locale, messageFormat: nls.MessageFormat.both })();

// tslint:disable-next-line:no-empty
let logFn: LogFunction = () => {};

export async function activate(context: ExtensionContext) {

    if (!await ensureConfigHelperApi() || configApi === undefined) {
        return undefined;
    }

    logFn = configApi.createLogFunction("VMS-IDE");

    ProjectState.acquire().setLogFn(logFn);

    setExtensionContext(context);

    logFn(LogType.debug, () => localize("debug.activated", "VMS-IDE: Sync extension is activated."));

    context.subscriptions.push(Synchronizer.acquire(logFn));
    context.subscriptions.push(Builder.acquire(logFn));

    // context.subscriptions.push( window.registerUriHandler({
    //     handleUri(uri) {
    //         logFn(LogType.debug, () => `command: ${uri.path}`);
    //         logFn(LogType.debug, () => `query: ${uri.query}`);
    //         logFn(LogType.debug, () => `fragment: ${uri.fragment}`);
    //     }}));

    const readonlyScheme = 'readonly';
	const readonlyProvider = new class implements TextDocumentContentProvider {

		// emitter and its event
		onDidChangeEmitter = new EventEmitter<Uri>();
		onDidChange = this.onDidChangeEmitter.event;

		provideTextDocumentContent(uri: Uri): string {
			// simply invoke cowsay, use uri-path as text
            let source = ""
            try {
                source = fs.readFileSync(uri.fsPath, 'utf8');
                fs.unlinkSync(uri.fsPath);
                fs.rmdirSync(path.dirname(uri.fsPath));
            } catch (e) {
                source = "";
            }
			return source;
		}
	};
	context.subscriptions.push(workspace.registerTextDocumentContentProvider(readonlyScheme, readonlyProvider));

    const projectDependenciesProvider = new ProjDepProvider();
    setProjectDependenciesChanged(projectDependenciesProvider.didChangeDependencies as Event<void>);

    const projectDescriptionProvider = new ProjDescrProvider();

    ProjectFilesWatchEmitter.on('created', (scope, filePath) => {
        ProjectState.acquire().setModified(scope, filePath);
    });
    ProjectFilesWatchEmitter.on('deleted', (scope, filePath) => {
        ProjectState.acquire().setDeleted(scope, filePath);
    });
    ProjectFilesWatchEmitter.on('changed', (scope, filePath) => {
        ProjectState.acquire().setModified(scope, filePath);
    });
    createFsWatchers(logFn);
    workspace.onDidChangeWorkspaceFolders((e) => {
        createFsWatchers(logFn);
        projectDependenciesProvider.refresh();
        projectDescriptionProvider.refresh();
        ProjectState.acquire().create();
    });

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.prepareDebug", async (scope?: string) => {
        scope = checkScope(scope);
        return Perform("prepare debug", scope, logFn).then(async (ret) => { return String(ret); });
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.syncProject", async (scope?: string) => {
        scope = checkScope(scope);
        return workspace.saveAll(true)
            .then(async (saved) => {
                if (saved) {
                    await Delay(500);
                    return Perform("synchronize", scope, logFn);
                }
                return saved;
            }).then(async (ret) => { return String(ret); });
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.syncDepProject", async (scope?: string) => {
        scope = checkScope(scope);
        return workspace.saveAll(true)
            .then(async (saved) => {
                if (saved) {
                    await Delay(500);
                    return Perform("synch all", scope, logFn);
                }
                return saved;
            }).then(async (ret) => { return String(ret); });
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.buildProject", async (scope?: string, buildName?: string) => {
        scope = checkScope(scope);
        return workspace.saveAll(true)
            .then(async (saved) => {
                if (saved) {
                    await Delay(500);
                    return Perform("build", scope, logFn, buildName);
                }
                return saved;
            }).then(async (ret) => { return String(ret); });
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.reBuildProject", async (scope?: string, buildName?: string) => {
        scope = checkScope(scope);
        return workspace.saveAll(true)
            .then(async (saved) => {
                if (saved) {
                    await Delay(500);
                    return Perform("rebuild", scope, logFn, buildName);
                }
                return saved;
            }).then(async (ret) => { return String(ret); });
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.buildOnlyProject", async (scope?: string, buildName?: string) => {
        scope = checkScope(scope);
        return workspace.saveAll(true)
            .then(async (saved) => {
                if (saved) {
                    await Delay(500);
                    return Perform("buildOnly", scope, logFn, buildName);
                }
                return saved;
            }).then(async (ret) => { return String(ret); });
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.reBuildOnlyProject", async (scope?: string, buildName?: string) => {
        scope = checkScope(scope);
        return workspace.saveAll(true)
            .then(async (saved) => {
                if (saved) {
                    await Delay(500);
                    return Perform("rebuildOnly", scope, logFn, buildName);
                }
                return saved;
            }).then(async (ret) => { return String(ret); });
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.quickSync", async (scope?: string) => {
        scope = checkScope(scope);
        return workspace.saveAll(true)
            .then(async (saved) => {
                if (saved) {
                    await Delay(500);
                    return Perform("quicksync", scope, logFn);
                }
                return saved;
            }).then(async (ret) => { return String(ret); });
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.cleanProject", async (scope?: string, buildName?: string) => {
        scope = checkScope(scope);
        return Perform("clean", scope, logFn, buildName).then(async (ret) => { return String(ret); });
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.createMMS", async (scope?: string) => {
        scope = checkScope(scope);
        return Perform("create mms", scope, logFn).then(async (ret) => { return String(ret); });
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.stopAction", async () => {
        Synchronizer.acquire().disableRemote();
        Builder.acquire().disableRemote();
        ShellParser.terminate_parser = true;
        return String();
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.editProject", async (scope?: string) => {
        scope = checkScope(scope);
        return Perform("edit settings", scope, logFn).then(async (ret) => { return String(ret); });
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.ssh-helper.editSettings", (scope?: string) => {
        scope = checkScope(scope);
        return Perform("edit ssh settings", scope, logFn).then(async (ret) => { return String(ret); });
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.changeCRLF", async (scope?: string) => {
        return Perform("crlf", scope, logFn).then(async (ret) => { return String(ret); });
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.forceSynchronized", async (scope?: string) => {
        scope = checkScope(scope);
        ProjectState.acquire().setSynchronized(scope, true);
        return String(true);
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.forceBuilt", async (scope?: string, buildName?: string) => {
        scope = checkScope(scope);
        buildName = buildName || ProjectState.acquire().getDefBuildName();
        ProjectState.acquire().setBuilt(scope, buildName, true);
        return String(true);
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.uploadZip", async (scope?: string, clear?: string) => {
        scope = checkScope(scope);
        return workspace.saveAll(true)
            .then(async (saved) => {
                if (saved) {
                    await Delay(500);
                    return Perform("zip", scope, logFn, clear);
                }
                return saved;
            }).then(async (ret) => { return String(ret); });
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.uploadDepZip", async (scope?: string, clear?: string) => {
        scope = checkScope(scope);
        return workspace.saveAll(true)
            .then(async (saved) => {
                if (saved) {
                    await Delay(500);
                    return Perform("zip all", scope, logFn, clear);
                }
                return saved;
            }).then(async (ret) => { return String(ret); });
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.upload", async (scope?: string) => {
        scope = checkScope(scope);
        return workspace.saveAll(true)
            .then(async (saved) => {
                if (saved) {
                    await Delay(500);
                    return Perform("upload", scope, logFn);
                }
                return saved;
            }).then(async (ret) => { return String(ret); });
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.uploadDep", async (scope?: string) => {
        scope = checkScope(scope);
        return workspace.saveAll(true)
            .then(async (saved) => {
                if (saved) {
                    await Delay(500);
                    return Perform("upload all", scope, logFn);
                }
                return saved;
            }).then(async (ret) => { return String(ret); });
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.downloadHeaders", async (scope?: string, params?: string) => {
        return Perform("headers", scope, logFn, params).then(async (ret) => { return String(ret); });
    }));

    context.subscriptions.push( window.registerTreeDataProvider("vmssoftware.project-dep.projectDependencies", projectDependenciesProvider) );
    context.subscriptions.push( commands.registerCommand("vmssoftware.project-dep.projectDependencies.select",
        (element) => projectDependenciesProvider.select(element)) );
    context.subscriptions.push( commands.registerCommand("vmssoftware.project-dep.projectDependencies.add",
        (element) => projectDependenciesProvider.add(element)) );
    context.subscriptions.push( commands.registerCommand("vmssoftware.project-dep.projectDependencies.prepareDebug",
        (element) => projectDependenciesProvider.prepareDebug(element)) );
    context.subscriptions.push( commands.registerCommand("vmssoftware.project-dep.projectDependencies.syncProject",
        (element) => projectDependenciesProvider.syncProject(element)) );
    context.subscriptions.push( commands.registerCommand("vmssoftware.project-dep.projectDependencies.syncDepProject",
        (element) => projectDependenciesProvider.syncDepProject(element)) );
    context.subscriptions.push( commands.registerCommand("vmssoftware.project-dep.projectDependencies.upload",
        (element) => projectDependenciesProvider.upload(element)) );
    context.subscriptions.push( commands.registerCommand("vmssoftware.project-dep.projectDependencies.uploadDep",
        (element) => projectDependenciesProvider.uploadDep(element)) );
    context.subscriptions.push( commands.registerCommand("vmssoftware.project-dep.projectDependencies.build",
        (element) => projectDependenciesProvider.build(element)) );
    context.subscriptions.push( commands.registerCommand("vmssoftware.project-dep.projectDependencies.rebuild",
        (element) => projectDependenciesProvider.rebuild(element)) );
    context.subscriptions.push( commands.registerCommand("vmssoftware.project-dep.projectDependencies.buildOnly",
        (element) => projectDependenciesProvider.buildOnly(element)) );
    context.subscriptions.push( commands.registerCommand("vmssoftware.project-dep.projectDependencies.rebuildOnly",
        (element) => projectDependenciesProvider.rebuildOnly(element)) );
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
    context.subscriptions.push( commands.registerCommand("vmssoftware.project-dep.projectDescription.changeBuildName",
        () => projectDescriptionProvider.changeBuildName()) );

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.getCurrentScope", () => {
        return checkScope(undefined);
    }));

    return new SyncApi();

    /**
     * Returns current selected scope if given parameter is empty
     * @param scope
     */
    function checkScope(scope: string | undefined) {
        if (!scope) {
            const selectedScope = projectDependenciesProvider.selectedProject();
            if (!selectedScope) {
                logFn(LogType.warning, () => localize("scope.undefined", "No project is selected in the Project explorer."));
            }
            return selectedScope;
        }
        return scope;
    }

}

// this method is called when your extension is deactivated
export function deactivate() {
    disposeFsWatchers();
    logFn(LogType.debug, () => localize("debug.deactivated", "VMS-IDE: Sync extension is deactivated."));
}
