import * as nls from "vscode-nls";

import { LogFunction, LogType, printLike, ftpPathSeparator } from "@vorfol/common";

import { CommandContext, setContext } from "./command-context";
import { ensureSettings, IEnsured } from "./ensure-settings";

import { window, workspace } from "vscode";

import { Builder } from "./build/builder";
import { ChangeCrLf } from "./change-crlf";
import { ProjDepTree } from "./dep-tree/proj-dep-tree";
import { ProjectState } from "./dep-tree/proj-state";
import { onTheSameVms } from "./on-the-same-vms";
import { Synchronizer } from "./sync/synchronizer";
import { UploadZip } from "./upload-zip";
import { VmsPathConverter } from "./vms/vms-path-converter";
import { GetSshHelperType } from "./ext-api/get-ssh-helper";

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export type AsyncAction = (scope: string, logFn: LogFunction, params?: string) => Promise<boolean>;

export type ActionType = "synchronize" | "build" | "rebuild" | "clean" | "crlf" | "edit settings" | "create mms" | "zip";

export interface IPerform {
    actionFunc: AsyncAction;
    actionName: ActionType;
    context: CommandContext;
    status: string;
    success: string;
    fail: string;
}

export const actions: IPerform[] = [
    {
        // synchronize (!) simultaneously
        actionFunc: async (scope: string, logFn: LogFunction) => {
            let scopes: string[] = [scope];
            if (!scope) {
                if (workspace.workspaceFolders) {
                    scopes = workspace.workspaceFolders.map((wf) => wf.name);
                }
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
                        return false;
                    }
                })() );
            }
            return Promise.all(wait).then((all) => {
                return all.reduce((res, cur) => res && cur, true);
            });
        },
        actionName: "synchronize",
        context: CommandContext.isSyncronizing,
        fail: localize("synchronizing.fail", "Synchronizing failed"),
        status: localize("synchronizing.status", "$(sync) Synchronizing..."),
        success: localize("synchronizing.success", "Synchronizing ok"),
    },
    // {
    //     actionFunc: async (scope: string, ensured: IEnsured, logFn: LogFunction) => {
    //         const api = await ensureProjApi();
    //         if (api && api.isSynchronized(scope)) {
    //             return true;
    //         }
    //         const syncronizer = Synchronizer.acquire(logFn);
    //         return syncronizer.uploadSource(ensured)
    //             .then(async (result) => {
    //                 if (result) {
    //                     if (api) {
    //                         api.setSynchronized(scope, true);
    //                     }
    //                 }
    //                 return result;
    //             });
    //     },
    //     actionName: "upload source",
    //     context: CommandContext.isBuilding,
    //     fail: localize("upload.source.fail", "Upload source failed"),
    //     status: localize("upload.source.status", "$(sync) Uploading source..."),
    //     success: localize("upload.source.success", "Upload source ok"),
    // },
    {
        // build
        actionFunc: async (scope: string, logFn: LogFunction, params?: string) => {
            if (!await onTheSameVms(scope, logFn)) {
                logFn(LogType.error, () => localize("error.depend.vms", "All dependent projects must be on the same VMS host"));
                return false;
            }
            let scopes: string[] = [scope];
            scopes = new ProjDepTree().getDepList(scope).reverse();
            params = params || ProjectState.acquire().getDefBuildType();
            const builder = Builder.acquire(logFn);
            for (const curScope of scopes) {
                const ensured = await ensureSettings(curScope, logFn);
                if (ensured) {
                    if (ProjectState.acquire().isSynchronized(curScope) || await doUpload(ensured, logFn)) {
                        if (ProjectState.acquire().isBuilt(curScope, params) || await builder.buildProject(ensured, params)) {
                            if (params) {
                                ProjectState.acquire().setBuilt(curScope, params, true);
                            }
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return true;
        },
        actionName: "build",
        context: CommandContext.isBuilding,
        fail: localize("building.fail", "Building failed"),
        status: localize("building.status", "$(tools) Building..."),
        success: localize("buiding.success", "Building ok"),
    },
    {
        // re-build
        actionFunc: async (scope: string, logFn: LogFunction, params?: string) => {
            if (!await onTheSameVms(scope, logFn)) {
                logFn(LogType.error, () => localize("error.depend.vms", "All dependent projects must be on the same VMS host"));
                return false;
            }
            let scopes: string[] = [scope];
            scopes = new ProjDepTree().getDepList(scope).reverse();
            params = params || ProjectState.acquire().getDefBuildType();
            const builder = Builder.acquire(logFn);
            for (const curScope of scopes) {
                const ensured = await ensureSettings(curScope, logFn);
                if (ensured) {
                    if (await doUpload(ensured, logFn)) {
                        // just do clean, despite result
                        await builder.cleanProject(ensured, params);
                        if (await builder.buildProject(ensured, params)) {
                            if (params) {
                                ProjectState.acquire().setBuilt(curScope, params, true);
                            }
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return true;
        },
        actionName: "rebuild",
        context: CommandContext.isBuilding,
        fail: localize("building.fail", "Building failed"),
        status: localize("building.status", "$(tools) Building..."),
        success: localize("buiding.success", "Building ok"),
    },
    {
        // clean
        actionFunc: async (scope: string, logFn: LogFunction, params?: string) => {
            let scopes: string[] = [scope];
            if (!scope) {
                if (workspace.workspaceFolders) {
                    scopes = workspace.workspaceFolders.map((wf) => wf.name);
                }
            }
            const wait: Array<Promise<boolean>> = [];
            for (const curScope of scopes) {
                wait.push( (async () => {
                    const ensured = await ensureSettings(curScope, logFn);
                    if (ensured) {
                        params = params || ProjectState.acquire().getDefBuildType();
                        const builder = Builder.acquire(logFn);
                        return builder.cleanProject(ensured, params)
                            .then(async (result) => {
                                if (result) {
                                    if (params) {
                                        ProjectState.acquire().setBuilt(curScope, params, false);
                                    }
                                }
                                return result;
                            });
                    } else {
                        return false;
                    }
                })() );
            }
            return Promise.all(wait).then((all) => {
                return all.reduce((res, cur) => res && cur, true);
            });
        },
        actionName: "clean",
        context: CommandContext.isBuilding,
        fail: localize("clean.fail", "Clean failed"),
        status: localize("clean.status", "$(trashcan) Clean..."),
        success: localize("clean.success", "Clean ok"),
    },
    {
        // create MMS
        actionFunc: async (scope: string, logFn: LogFunction, params?: string) => {
            const ensured = await ensureSettings(scope, logFn);
            if (!ensured) {
                return false;
            }
            const builder = Builder.acquire(logFn);
            return builder.createMmsFiles(ensured);
        },
        actionName: "create mms",
        context: CommandContext.isBuilding,
        fail: localize("mms.fail", "Create MMS failed"),
        status: localize("mms.status", "Creating MMS..."),
        success: localize("mms.success", "Create MMS ok"),
    },
    {
        // change CR/LF
        actionFunc: async (scope: string, logFn: LogFunction) => {
            let scopes: string[] = [scope];
            if (!scope) {
                if (workspace.workspaceFolders) {
                    scopes = workspace.workspaceFolders.map((wf) => wf.name);
                }
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
        context: CommandContext.isCrLf,
        fail: localize("crlf.fail", "Change CrLf failed"),
        status: localize("crlf.status", "$(search) Changing..."),
        success: localize("crlf.success", "Change CrLf done"),
    },
    {
        // ZIP
        actionFunc: async (scope: string, logFn: LogFunction, clear?: string) => {
            let scopes: string[] = [scope];
            if (!scope) {
                if (workspace.workspaceFolders) {
                    scopes = workspace.workspaceFolders.map((wf) => wf.name);
                }
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
        context: CommandContext.isCrLf,
        fail: localize("zip.fail", "Uploading via Zip failed"),
        status: localize("zip.status", "$(file-zip) Uploading via Zip..."),
        success: localize("zip.success", "Uploading via Zip done"),
    },
    {
        // edit settings
        actionFunc: async (scope: string, logFn: LogFunction) => {
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
        context: CommandContext.isEdit,
        fail: localize("edit.fail", "Edit settings failed"),
        status: localize("edit.status", "Edit settings..."),
        success: localize("edit.success", "Edit settings done"),
    },
];

export async function Perform(actionName: ActionType, scope: string, logFn: LogFunction, params?: string) {
    const actionToDo = actions.find((action) => action.actionName === actionName);
    if (!actionToDo) {
        logFn(LogType.debug, () => localize("error.no_action", "Cannot find action: {0}", actionName));
        return false;
    }
    setContext(actionToDo.context, true);
    const scopeStr = scope ? ` [${scope}]` : ` [All]`;
    const msg = window.setStatusBarMessage(actionToDo.status + scopeStr);
    return actionToDo.actionFunc(scope, logFn, params)
        .catch((err) => {
            logFn(LogType.error, () => err);
            return false;
        }).then((actionResult) => {
            setContext(actionToDo.context, false);
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

const purgeCmd = printLike`purge [${"directory"}...]`;

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
                    await shell.execCmd(purgeCmd(converter.bareDirectory));
                    shell.dispose();
                }
            }
        }
    }
    return retCode;
}
