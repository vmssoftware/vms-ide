import { LogFunction, LogType } from "@vorfol/common";

import { CommandContext, setContext } from "./command-context";
import { ensureSettings, IEnsured } from "./ensure-settings";

import { window, workspace } from "vscode";

import { Builder } from "./build/builder";
import { ChangeCrLf } from "./change-crlf";
import { GetProjectDepApi } from "./ext-api/get-proj-api";
import { ProjApi } from "./ext-api/proj-api";
import { Synchronizer } from "./sync/synchronizer";

import * as nls from "vscode-nls";
nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export type AsyncAction = (scope: string, logFn: LogFunction, params?: string) => Promise<boolean>;

export type ActionType = "synchronize" | "build" | "clean" | "crlf" | "edit settings";

export interface IPerform {
    actionFunc: AsyncAction;
    actionName: ActionType;
    context: CommandContext;
    status: string;
    success: string;
    fail: string;
}

let projApi: ProjApi | undefined;

async function ensureProjApi() {
    if (projApi) {
        return projApi;
    }
    projApi = await GetProjectDepApi();
    return projApi;
}

export const actions: IPerform[] = [
    {
        actionFunc: async (scope: string, logFn: LogFunction) => {
            const api = await ensureProjApi();
            if (api && api.isSynchronized(scope)) {
                return true;
            }
            const ensured = await ensureSettings(scope, logFn);
            if (ensured) {
                const syncronizer = Synchronizer.acquire(logFn);
                return syncronizer.syncronizeProject(ensured)
                    .then(async (result) => {
                        if (result) {
                            if (api) {
                                api.setSynchronized(scope, true);
                            }
                        }
                        return result;
                    });
            } else {
                return false;
            }
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
        actionFunc: async (scope: string, logFn: LogFunction, params?: string) => {
            let scopes: string[] = [scope];
            const api = await ensureProjApi();
            if (api) {
                scopes = api.getDepList(scope).reverse();
            } else if (!scope) {
                if (workspace.workspaceFolders) {
                    scopes = workspace.workspaceFolders.map((wf) => wf.name);
                }
            }
            params = params || "DEBUG";
            const builder = Builder.acquire(logFn);
            let retCode = true;
            for (const curScope of scopes) {
                if (!api || !api.isSynchronized(curScope)) {
                    const ensured = await ensureSettings(curScope, logFn);
                    if (ensured) {
                        const syncronizer = Synchronizer.acquire(logFn);
                        const result = await syncronizer.uploadSource(ensured);
                        if (result && api) {
                            api.setSynchronized(curScope, true);
                        }
                        retCode = retCode && result;
                    } else {
                        retCode = false;
                    }
                }
                if (retCode && (!api || !api.isBuilt(curScope, params))) {
                    const ensured = await ensureSettings(curScope, logFn);
                    if (ensured) {
                        const result = await builder.buildProject(ensured, params);
                        if (api && params) {
                            api.setBuilt(curScope, params, result);
                        }
                        retCode = retCode && result;
                    } else {
                        retCode = false;
                    }
                }
                if (!retCode) {
                    break;
                }
            }
            return retCode;
        },
        actionName: "build",
        context: CommandContext.isBuilding,
        fail: localize("building.fail", "Building failed"),
        status: localize("building.status", "$(tools) Building..."),
        success: localize("buiding.success", "Building ok"),
    },
    {
        actionFunc: async (scope: string, logFn: LogFunction, params?: string) => {
            const ensured = await ensureSettings(scope, logFn);
            if (!ensured) {
                return false;
            }
            const builder = Builder.acquire(logFn);
            return builder.cleanProject(ensured, params)
                .then(async (result) => {
                    if (result) {
                        const api = await ensureProjApi();
                        if (api && params) {
                            api.setBuilt(scope, params, false);
                        }
                    }
                    return result;
                });
        },
        actionName: "clean",
        context: CommandContext.isBuilding,
        fail: localize("clean.fail", "Clean failed"),
        status: localize("clean.status", "$(trashcan) Clean..."),
        success: localize("clean.success", "Clean ok"),
    },
    {
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
    const msg = window.setStatusBarMessage(actionToDo.status + ` [${scope}]`);
    return actionToDo.actionFunc(scope, logFn, params)
        .catch((err) => {
            logFn(LogType.error, () => err);
            return false;
        }).then((actionResult) => {
            setContext(actionToDo.context, false);
            msg.dispose();
            if (actionResult) {
                const str = actionToDo.success + ` [${scope}]`;
                window.showInformationMessage(str);
                logFn(LogType.information, () => str, true);
            } else {
                const str = actionToDo.fail + ` [${scope}]`;
                window.showInformationMessage(str);
                logFn(LogType.error, () => str, true);
            }
            return actionResult;
        });
}
