import { LogFunction, LogType } from "@vorfol/common";

import { CommandContext, setContext } from "./command-context";
import { ensureSettings, IEnsured } from "./ensure-settings";

import { window, workspace } from "vscode";

import { Builder } from "./build/builder";
import { ChangeCrLf } from "./change-crlf";
import { Synchronizer } from "./sync/synchronizer";

import * as nls from "vscode-nls";
nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export type AsyncAction = (ensured: IEnsured, logFn: LogFunction) => Promise<boolean>;

export type ActionType = "save all" | "synchronize" | "build" | "clean" | "upload source" | "crlf" | "edit settings";

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
        actionFunc: async (ensured: IEnsured, logFn: LogFunction) => {
            const syncronizer = Synchronizer.acquire(logFn);
            return syncronizer.syncronizeProject(ensured);
        },
        actionName: "synchronize",
        context: CommandContext.isSyncronizing,
        fail: localize("synchronizing.fail", "Synchronizing failed"),
        status: localize("synchronizing.status", "$(sync) Synchronizing..."),
        success: localize("synchronizing.success", "Synchronizing ok"),
    },
    {
        actionFunc: async (ensured: IEnsured, logFn: LogFunction) => {
            const syncronizer = Synchronizer.acquire(logFn);
            return syncronizer.uploadSource(ensured);
        },
        actionName: "upload source",
        context: CommandContext.isBuilding,
        fail: localize("upload.source.fail", "Upload source failed"),
        status: localize("upload.source.status", "$(sync) Uploading source..."),
        success: localize("upload.source.success", "Upload source ok"),
    },
    {
        actionFunc: async (ensured: IEnsured, logFn: LogFunction) => {
            const builder = Builder.acquire(logFn);
            return builder.buildProject(ensured);
        },
        actionName: "build",
        context: CommandContext.isBuilding,
        fail: localize("building.fail", "Building failed"),
        status: localize("building.status", "$(tools) Building..."),
        success: localize("buiding.success", "Building ok"),
    },
    {
        actionFunc: async (ensured: IEnsured, logFn: LogFunction) => {
            const builder = Builder.acquire(logFn);
            return builder.cleanProject(ensured);
        },
        actionName: "clean",
        context: CommandContext.isBuilding,
        fail: localize("clean.fail", "Clean failed"),
        status: localize("clean.status", "$(trashcan) Clean..."),
        success: localize("clean.success", "Clean ok"),
    },
    {
        actionFunc: async (ensured: IEnsured, logFn: LogFunction) => {
            const crlf = new ChangeCrLf(logFn);
            return crlf.perform(ensured);
        },
        actionName: "crlf",
        context: CommandContext.isCrLf,
        fail: localize("crlf.fail", "Change CrLf failed"),
        status: localize("crlf.status", "$(search) Changing..."),
        success: localize("crlf.success", "Change CrLf done"),
    },
    {
        actionFunc: async (ensured: IEnsured) => {
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

export async function Perform(actionName: ActionType, scope: string, logFn: LogFunction) {
    const actionToDo = actions.find((action) => action.actionName === actionName);
    if (!actionToDo) {
        logFn(LogType.debug, () => localize("error.no_action", "Cannot find action: {0}", actionName));
        return false;
    }
    let scopes = [scope];
    if (scope === undefined) {
        // TODO: get sorted by dependencies list of scopes
        if (workspace.workspaceFolders) {
            scopes = workspace.workspaceFolders.map((wf) => wf.name);
        }
    }
    let result = true;
    for (const curScope of scopes) {
        const scopeResult = await ensureSettings(curScope, logFn)
            .then((ensured) => {
                if (ensured) {
                    setContext(actionToDo.context, true);
                    const msg = window.setStatusBarMessage(actionToDo.status + ` [${curScope}]`);
                    return actionToDo.actionFunc(ensured, logFn)
                        .catch((err) => {
                            logFn(LogType.error, () => err);
                            return false;
                        }).then((actionResult) => {
                            setContext(actionToDo.context, false);
                            msg.dispose();
                            if (actionResult) {
                                window.showInformationMessage(actionToDo.success + ` [${curScope}]`);
                                logFn(LogType.information, () => actionToDo.success + ` [${curScope}]`, true);
                            } else {
                                window.showInformationMessage(actionToDo.fail + ` [${curScope}]`);
                                logFn(LogType.error, () => actionToDo.fail + ` [${curScope}]`, true);
                            }
                            return actionResult;
                        });
                } else {
                    return false;
                }
            });
        if (!scopeResult) {
            return false;
        }
        result = result && scopeResult;
    }
    return result;
}
