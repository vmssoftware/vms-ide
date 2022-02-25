import * as nls from "vscode-nls";

import { ftpPathSeparator, LogFunction, LogType, printLike } from "../common/main";

import { CommandContext, setContext, getContext } from "./command-context";
import { ensureSettings, IEnsured } from "./ensure-settings";

import { window, workspace } from "vscode";

import { GetSshHelperType } from "../ext-api/ext-api";
import { Builder } from "./build/builder";
import { ChangeCrLf } from "./change-crlf";
import { ProjDepTree } from "./dep-tree/proj-dep-tree";
import { ProjectState, SourceState } from "./dep-tree/proj-state";
import { onTheSameVms } from "./on-the-same-vms";
import { Synchronizer } from "./sync/synchronizer";
import { UploadZip } from "./upload-zip";
import { VmsPathConverter } from "./vms/vms-path-converter";
import { DownloadHeaders } from "./downloadHeaders";

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export type AsyncAction = (scope: string | undefined, logFn: LogFunction, param?: string) => Promise<boolean>;

export type ActionType =
      "synchronize"
    | "synch all"
    | "quicksync"
    | "upload"
    | "build"
    | "rebuild"
    | "buildOnly"
    | "rebuildOnly"
    | "clean"
    | "crlf"
    | "edit settings"
    | "edit ssh settings"
    | "create mms"
    | "zip"
    | "headers"
    | "prepare debug";

export interface IPerform {
    actionFunc: AsyncAction;
    actionName: ActionType;
    status: string;
    success: string;
    fail: string;
}

export const actions: IPerform[] = [
    {
        // synchronize with dependensies (!) simultaneously
        actionFunc: async (scope: string | undefined, logFn: LogFunction) => {
            let scopes: string[] = [];
            if (!scope) {
                if (workspace.workspaceFolders) {
                    scopes = workspace.workspaceFolders.map((wf) => wf.name);
                }
            } else {
                scopes = [scope];
            }
            let depend_scopes = new Set<string>();
            for (const curScope of scopes) {
                for (const curDep of new ProjDepTree().getDepList(curScope).reverse()) {
                    depend_scopes.add(curDep);
                }
            }
            const wait: Array<Promise<boolean>> = [];
            for (const curScope of depend_scopes) {
                wait.push( (async () => {
                    const ensured = await ensureSettings(curScope, logFn);
                    if (ensured) {
                        const syncronizer = Synchronizer.acquire(logFn);
                        return syncronizer.syncronizeProject(ensured)
                            .then(async (result) => {
                                if (result) {
                                    ProjectState.acquire().setSynchronized(curScope, true);
                                }
                                return result;
                            });
                    } else {
                        logFn(LogType.error, () => localize("ensure.settings", "Cannot get settings for: {0}", curScope));
                        return false;
                    }
                })() );
            }
            return Promise.all(wait).then((all) => {
                return all.reduce((res, cur) => res && cur, true);
            });
        },
        actionName: "synch all",
        fail: localize("synchronizing.fail", "Synchronization failed."),
        status: localize("synchronizing.status", "$(sync) Synchronizing..."),
        success: localize("synchronizing.success", "Synchronization completed successfully."),
    },
    {
        // synchronize (!) simultaneously
        actionFunc: async (scope: string | undefined, logFn: LogFunction) => {
            let scopes: string[] = [];
            if (!scope) {
                if (workspace.workspaceFolders) {
                    scopes = workspace.workspaceFolders.map((wf) => wf.name);
                }
            } else {
                scopes = [scope];
            }
            const wait: Array<Promise<boolean>> = [];
            for (const curScope of scopes) {
                wait.push( (async () => {
                    // Feature #769 - Give the user ability to synchronize files several times using command "OpenVMS: Synchronize project files with VMS"
                    // if (ProjectState.acquire().isSynchronized(curScope)) {
                    //     return true;
                    // }
                    const ensured = await ensureSettings(curScope, logFn);
                    if (ensured) {
                        const syncronizer = Synchronizer.acquire(logFn);
                        return syncronizer.syncronizeProject(ensured)
                            .then(async (result) => {
                                if (result) {
                                    ProjectState.acquire().setSynchronized(curScope, true);
                                }
                                return result;
                            });
                    } else {
                        logFn(LogType.error, () => localize("ensure.settings", "Cannot get settings for: {0}", curScope));
                        return false;
                    }
                })() );
            }
            return Promise.all(wait).then((all) => {
                return all.reduce((res, cur) => res && cur, true);
            });
        },
        actionName: "synchronize",
        fail: localize("synchronizing.fail", "Synchronization failed."),
        status: localize("synchronizing.status", "$(sync) Synchronizing..."),
        success: localize("synchronizing.success", "Synchronization completed successfully."),
    },
    {
        // quick synchronize (!) simultaneously
        actionFunc: async (scope: string | undefined, logFn: LogFunction) => {
            let scopes: string[] = [];
            if (!scope) {
                if (workspace.workspaceFolders) {
                    scopes = workspace.workspaceFolders.map((wf) => wf.name);
                }
            } else {
                scopes = [scope];
            }
            const wait: Array<Promise<boolean>> = [];
            for (const curScope of scopes) {
                wait.push( (async () => {
                    const ensured = await ensureSettings(curScope, logFn);
                    if (ensured) {
                        const syncronizer = Synchronizer.acquire(logFn);
                        return syncronizer.quickSync(ensured);
                    } else {
                        logFn(LogType.error, () => localize("ensure.settings", "Cannot get settings for: {0}", curScope));
                        return false;
                    }
                })() );
            }
            return Promise.all(wait).then((all) => {
                return all.reduce((res, cur) => res && cur, true);
            });
        },
        actionName: "quicksync",
        fail: localize("quicksync.fail", "Quick upload failed."),
        status: localize("quicksync.status", "$(sync) Quick uploading..."),
        success: localize("quicksync.success", "Quick upload completed successfully."),
    },
    {
        // build
        actionFunc: async (scope: string | undefined, logFn: LogFunction, buildName?: string) => {

            buildName = buildName || ProjectState.acquire().getDefBuildName();

            let scopes: string[] = new ProjDepTree().getDepList(scope).reverse();
            const builder = Builder.acquire(logFn);
            let retCode = scopes.length > 0;
            // execute using AWAIT, not simultaneously
            for (const curScope of scopes) {
                if (!await onTheSameVms(curScope, logFn)) {
                    logFn(LogType.error, () => localize("error.depend.vms", "All dependent projects must be on the same VMS host ({0}).", curScope));
                } else {
                    const ensured = await ensureSettings(curScope, logFn);
                    if (ensured) {
                        if (ProjectState.acquire().sourceState(curScope) === SourceState.unknown) {
                            logFn(LogType.information, () => localize("do.upload.first", "You should execute UPLOAD or SYNCHRONIZE for {0} first.", curScope));
                        }
                        const isBuilt = await builder.buildProject(ensured, buildName);
                        ProjectState.acquire().setBuilt(curScope, buildName, isBuilt);
                        retCode = isBuilt;
                    } else {
                        logFn(LogType.error, () => localize("ensure.settings", "Cannot get settings for: {0}", curScope));
                        retCode = false;
                    }
                }
            }
            return retCode;
        },
        actionName: "build",
        fail: localize("building.fail", "Build failed."),
        status: localize("building.status", "$(tools) Building..."),
        success: localize("buiding.success", "Build completed successfully."),
    },
    {
        // build only
        actionFunc: async (scope: string | undefined, logFn: LogFunction, buildName?: string) => {

            buildName = buildName || ProjectState.acquire().getDefBuildName();

            const builder = Builder.acquire(logFn);
            const ensured = await ensureSettings(scope, logFn);
            if (ensured && ensured.scope) {
                if (ProjectState.acquire().sourceState(ensured.scope) === SourceState.unknown) {
                    logFn(LogType.information, () => localize("do.upload.first", "You should execute UPLOAD or SYNCHRONIZE for {0} first.", ensured.scope));
                }
                const isBuilt = await builder.buildProject(ensured, buildName);
                ProjectState.acquire().setBuilt(ensured.scope, buildName, isBuilt);
                return isBuilt;
            } else {
                logFn(LogType.error, () => localize("ensure.settings", "Cannot get settings for: {0}", scope));
                return false;
            }
        },
        actionName: "buildOnly",
        fail: localize("building.fail", "Build failed."),
        status: localize("building.status", "$(tools) Building..."),
        success: localize("buiding.success", "Build completed successfully."),
    },
    {
        // re-build, the same as build but execute clean before
        actionFunc: async (scope: string | undefined, logFn: LogFunction, buildName?: string) => {

            buildName = buildName || ProjectState.acquire().getDefBuildName();

            let scopes: string[] = new ProjDepTree().getDepList(scope).reverse();
            const builder = Builder.acquire(logFn);
            let retCode = scopes.length > 0;
            for (const curScope of scopes) {
                if (!await onTheSameVms(curScope, logFn)) {
                    logFn(LogType.error, () => localize("error.depend.vms", "All dependent projects must be on the same VMS host ({0}).", curScope));
                } else {
                    const ensured = await ensureSettings(curScope, logFn);
                    if (ensured) {
                        // just do clean, ignore result
                        await builder.cleanProject(ensured, buildName);
                        if (ProjectState.acquire().sourceState(curScope) === SourceState.unknown) {
                            logFn(LogType.information, () => localize("do.upload.first", "You should execute UPLOAD or SYNCHRONIZE for {0} first.", curScope));
                        }
                        const isBuilt = await builder.buildProject(ensured, buildName);
                        ProjectState.acquire().setBuilt(curScope, buildName, isBuilt);
                        retCode = isBuilt;
                    } else {
                        logFn(LogType.error, () => localize("ensure.settings", "Cannot get settings for: {0}", curScope));
                        retCode = false;
                    }
                }
            }
            return retCode;
        },
        actionName: "rebuild",
        fail: localize("building.fail", "Build failed."),
        status: localize("building.status", "$(tools) Building..."),
        success: localize("buiding.success", "Build completed successfully."),
    },
    {
        // re-build only, the same as build only but execute clean before
        actionFunc: async (scope: string | undefined, logFn: LogFunction, buildName?: string) => {

            buildName = buildName || ProjectState.acquire().getDefBuildName();

            const builder = Builder.acquire(logFn);
            const ensured = await ensureSettings(scope, logFn);
            if (ensured && ensured.scope) {
                // just do clean, ignore result
                await builder.cleanProject(ensured, buildName);
                if (ProjectState.acquire().sourceState(ensured.scope) === SourceState.unknown) {
                    logFn(LogType.information, () => localize("do.upload.first", "You should execute UPLOAD or SYNCHRONIZE for {0} first.", ensured.scope));
                }
                const isBuilt = await builder.buildProject(ensured, buildName);
                ProjectState.acquire().setBuilt(ensured.scope, buildName, isBuilt);
                return isBuilt;
            } else {
                logFn(LogType.error, () => localize("ensure.settings", "Cannot get settings for: {0}", scope));
                return false;
            }
        },
        actionName: "rebuildOnly",
        fail: localize("building.fail", "Build failed."),
        status: localize("building.status", "$(tools) Building..."),
        success: localize("buiding.success", "Build completed successfully."),
    },
    {
        // clean
        actionFunc: async (scope: string | undefined, logFn: LogFunction, buildName?: string) => {

            buildName = buildName || ProjectState.acquire().getDefBuildName();

            let scopes: string[] = [];
            if (!scope) {
                if (workspace.workspaceFolders) {
                    scopes = workspace.workspaceFolders.map((wf) => wf.name);
                }
            } else {
                scopes = [scope];
            }
            const wait: Array<Promise<boolean>> = [];
            for (const curScope of scopes) {
                wait.push( (async () => {
                    const ensured = await ensureSettings(curScope, logFn);
                    if (ensured) {
                        const builder = Builder.acquire(logFn);
                        const result = await builder.cleanProject(ensured, buildName)
                        ProjectState.acquire().setBuilt(curScope, buildName, false);
                        return result;
                    } else {
                        logFn(LogType.error, () => localize("ensure.settings", "Cannot get settings for: {0}", curScope));
                        return false;
                    }
                })() );
            }
            return Promise.all(wait).then((all) => {
                return all.reduce((res, cur) => res && cur, true);
            });
        },
        actionName: "clean",
        fail: localize("clean.fail", "Clean failed"),
        status: localize("clean.status", "$(trashcan) Cleaning..."),
        success: localize("clean.success", "Clean completed successfully."),
    },
    {
        // create MMS
        actionFunc: async (scope: string | undefined, logFn: LogFunction) => {
            let scopes: string[] = [];
            if (!scope) {
                if (workspace.workspaceFolders) {
                    scopes = workspace.workspaceFolders.map((wf) => wf.name);
                }
            } else {
                scopes = [scope];
            }
            const wait: Array<Promise<boolean>> = [];
            for (const curScope of scopes) {
                wait.push( (async () => {
                    const ensured = await ensureSettings(curScope, logFn);
                    if (ensured) {
                        const builder = Builder.acquire(logFn);
                        return builder.createMmsFiles(ensured);
                    } else {
                        logFn(LogType.error, () => localize("ensure.settings", "Cannot get settings for: {0}", curScope));
                        return false;
                    }
                })() );
            }
            return Promise.all(wait).then((all) => {
                return all.reduce((res, cur) => res && cur, true);
            });
        },
        actionName: "create mms",
        fail: localize("mms.fail", "Creating MMS failed."),
        status: localize("mms.status", "Creating MMS..."),
        success: localize("mms.success", "Creating MMS completed successfully."),
    },
    {
        // change CR/LF
        actionFunc: async (scope: string | undefined, logFn: LogFunction) => {
            let scopes: string[] = [];
            if (!scope) {
                if (workspace.workspaceFolders) {
                    scopes = workspace.workspaceFolders.map((wf) => wf.name);
                }
            } else {
                scopes = [scope];
            }
            const wait: Array<Promise<boolean>> = [];
            for (const curScope of scopes) {
                const ensured = await ensureSettings(curScope, logFn);
                if (ensured) {
                    const crlf = new ChangeCrLf(logFn);
                    wait.push(crlf.perform(ensured));
                }
            }
            return Promise.all(wait).then((all) => {
                return all.reduce((res, cur) => res && cur, true);
            });
        },
        actionName: "crlf",
        fail: localize("crlf.fail", "CRLF conversion failed."),
        status: localize("crlf.status", "$(search) Changing..."),
        success: localize("crlf.success", "CRLF conversion completed successfully."),
    },
    {
        // ZIP
        actionFunc: async (scope: string | undefined, logFn: LogFunction, clear?: string) => {
            let scopes: string[] = [];
            if (!scope) {
                if (workspace.workspaceFolders) {
                    scopes = workspace.workspaceFolders.map((wf) => wf.name);
                }
            } else {
                scopes = [scope];
            }
            const wait: Array<Promise<boolean>> = [];
            for (const curScope of scopes) {
                const ensured = await ensureSettings(curScope, logFn);
                if (ensured) {
                    wait.push(doUpload(ensured, logFn, true, clear));
                }
            }
            return Promise.all(wait).then((all) => {
                return all.reduce((res, cur) => res && cur, true);
            });
        },
        actionName: "zip",
        fail: localize("zip.fail", "Upload using Zip failed."),
        status: localize("zip.status", "$(file-zip) Uploading using Zip..."),
        success: localize("zip.success", "Upload using Zip completed successfully."),
    },
    {
        // edit settings
        actionFunc: async (scope: string | undefined, logFn: LogFunction) => {
            const ensured = await ensureSettings(scope, logFn);
            if (!ensured) {
                return false;
            }
            if (ensured.configHelper) {
                const editor = ensured.configHelper.getEditor();
                return editor.invoke();
            }
            return false;
        },
        actionName: "edit settings",
        fail: localize("edit.fail", "Editing settings failed."),
        status: localize("edit.status", "Editing settings..."),
        success: localize("edit.success", "Editing settings completed successfully."),
    },
    {
        // edit ssh settings
        actionFunc: async (scope: string | undefined, logFn: LogFunction) => {
            const sshHelperType = await GetSshHelperType();
            if (sshHelperType) {
                const sshHelper = new sshHelperType(logFn);
                return sshHelper.editSettings(scope);
            }
            return false;
        },
        actionName: "edit ssh settings",
        fail: localize("edit.fail", "Editing settings failed."),
        status: localize("edit.status", "Edit settings..."),
        success: localize("edit.success", "Editing settings completed successfully."),
    },
    {
        // headers
        actionFunc: async (scope: string | undefined, logFn: LogFunction) => {
            return DownloadHeaders(scope, logFn);
        },
        actionName: "headers",
        fail: localize("headers.fail", "Headers download failed."),
        status: localize("headers.status", "Downloading headers..."),
        success: localize("headers.success", "Headers download completed successfully."),
    },
    {
        // upload
        actionFunc: async (scope: string | undefined, logFn: LogFunction) => {
            let scopes: string[] = [];
            if (!scope) {
                if (workspace.workspaceFolders) {
                    scopes = workspace.workspaceFolders.map((wf) => wf.name);
                }
            } else {
                scopes = [scope];
            }
            const wait: Array<Promise<boolean>> = [];
            for (const curScope of scopes) {
                const ensured = await ensureSettings(curScope, logFn);
                if (ensured) {
                    wait.push(doUpload(ensured, logFn));
                }
            }
            return Promise.all(wait).then((all) => {
                return all.reduce((res, cur) => res && cur, true);
            });
        },
        actionName: "upload",
        fail: localize("upload.fail", "Upload failed."),
        status: localize("upload.status", "Uploading..."),
        success: localize("upload.success", "Upload completed successfully."),
    },
    {
        // preparing debug
        actionFunc: async (scope: string | undefined, logFn: LogFunction, buildName?: string) => {
            buildName = buildName || ProjectState.acquire().getDefBuildName();
            let scopes: string[] = [];
            if (!scope) {
                if (workspace.workspaceFolders) {
                    scopes = workspace.workspaceFolders.map((wf) => wf.name);
                }
            } else {
                scopes = [scope];
            }
            const wait: Array<Promise<boolean>> = [];
            for (const curScope of scopes) {
                const ensured = await ensureSettings(curScope, logFn);
                if (ensured) {
                    wait.push(Builder.acquire().prepareDebug(ensured, buildName));
                }
            }
            return Promise.all(wait).then((all) => {
                return all.reduce((res, cur) => res && cur, true);
            });
        },
        actionName: "prepare debug",
        fail: localize("collect.fail", "Preparing to debug failed"),
        status: localize("collect.status", "Preparing to debug..."),
        success: localize("collect.success", "Preparing to debug completed successfully"),
    },
];

export async function Perform(actionName: ActionType, scope: string | undefined, logFn: LogFunction, param?: string) {
    const actionToDo = actions.find((action) => action.actionName === actionName);
    if (!actionToDo) {
        logFn(LogType.error, () => localize("error.no_action", "Could not find action: {0}.", actionName));
        return false;
    }
    if (getContext(CommandContext.isInAction)) {
        logFn(LogType.error, () => localize("error.action_in_progress", "Could not run '{0}' because another action is already in progress.", actionName));
        return false;
    }
    setContext(CommandContext.isInAction, true);
    const scopeStr = scope ? ` [${scope}]` : ` [All]`;
    const msg = window.setStatusBarMessage(actionToDo.status + scopeStr);
    Synchronizer.acquire().enableRemote();
    Builder.acquire().enableRemote();
    return actionToDo.actionFunc(scope, logFn, param)
        .catch((err) => {
            logFn(LogType.error, () => err);
            return false;
        }).then((actionResult) => {
            setContext(CommandContext.isInAction, false);
            msg.dispose();
            if (actionResult) {
                const str = actionToDo.success + scopeStr;
                window.showInformationMessage(str);
                logFn(LogType.information, () => str, true);
            } else {
                const str = actionToDo.fail + scopeStr;
                window.showInformationMessage(str);
                logFn(LogType.error, () => str, true);
            }
            return actionResult;
        });
}

const purgeCmd = printLike`purge ${"disk"}[${"directory"}...]`;

/**
 * Uploads source using preferred way, sets synchronized and executes purge if required
 * @param ensured
 * @param logFn
 */
async function doUpload(ensured: IEnsured, logFn: LogFunction, forceZip = false, clear?: string) {
    let retCode = false;
    if (ensured.scope) {
        if (forceZip || ensured.synchronizeSection.preferZip) {
            const zipper = new UploadZip(logFn);
            retCode = await zipper.perform(ensured, clear);
        } else {
            const syncronizer = Synchronizer.acquire(logFn);
            retCode = await syncronizer.uploadSource(ensured);
        }
        if (retCode) {
            retCode = ProjectState.acquire().setSynchronized(ensured.scope, true);
        }
        // this part is optional so do not return error if it occurs
        if (retCode && ensured.synchronizeSection.purge) {
            const converter = new VmsPathConverter(ensured.projectSection.root + ftpPathSeparator);
            const sshHelperType = await GetSshHelperType();
            if (sshHelperType) {
                const sshHelper = new sshHelperType(logFn);
                const shell = await sshHelper.getDefaultVmsShell(ensured.scope);
                if (shell) {
                    await shell.execCmd(purgeCmd(converter.disk, converter.bareDirectory));
                    shell.dispose();
                }
            }
        }
    }
    return retCode;
}
