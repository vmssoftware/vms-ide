import { LogFunction, LogType } from "@vorfol/common";

import { CommandContext, setContext } from "./command-context";
import { configHelper, ensureSettings } from "./ensure-settings";

import { window, workspace } from "vscode";

import { Builder } from "./build/builder";
import { Synchronizer } from "./sync/synchronizer";

import * as nls from "vscode-nls";
import { ChangeCrLf } from "./change-crlf";
nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export type AsyncAction = (logFn?: LogFunction) => Promise<boolean>;

export type ActionType = "save all" | "synchronize" | "build" | "clean" | "upload source" | "crlf";

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
        actionFunc: async (logFn?: LogFunction) => workspace.saveAll(false),
        actionName: "save all",
        context: CommandContext.isSaving,
        fail: localize("saving.fail", "Saving failed"),
        status: localize("saving.status", "$(check) Saving..."),
        success: localize("saving.success", "Saving ok"),
    },
    {
        actionFunc: async (logFn?: LogFunction) => {
            const syncronizer = Synchronizer.acquire(logFn);
            return syncronizer.syncronizeProject();
        },
        actionName: "synchronize",
        context: CommandContext.isSyncronizing,
        fail: localize("synchronizing.fail", "Synchronizing failed"),
        status: localize("synchronizing.status", "$(sync) Synchronizing..."),
        success: localize("synchronizing.success", "Synchronizing ok"),
    },
    {
        actionFunc: async (logFn?: LogFunction) => {
            const syncronizer = Synchronizer.acquire(logFn);
            return syncronizer.uploadSource();
        },
        actionName: "upload source",
        context: CommandContext.isBuilding,
        fail: localize("upload.source.fail", "Upload source failed"),
        status: localize("upload.source.status", "$(sync) Uploading source..."),
        success: localize("upload.source.success", "Upload source ok"),
    },
    {
        actionFunc: async (logFn?: LogFunction) => {
            const builder = Builder.acquire(logFn);
            return builder.buildProject();
        },
        actionName: "build",
        context: CommandContext.isBuilding,
        fail: localize("building.fail", "Building failed"),
        status: localize("building.status", "$(tools) Building..."),
        success: localize("buiding.success", "Building ok"),
    },
    {
        actionFunc: async (logFn?: LogFunction) => {
            const builder = Builder.acquire(logFn);
            return builder.cleanProject();
        },
        actionName: "clean",
        context: CommandContext.isBuilding,
        fail: localize("clean.fail", "Clean failed"),
        status: localize("clean.status", "$(trashcan) Clean..."),
        success: localize("clean.success", "Clean ok"),
    },
    {
        actionFunc: async (logFn?: LogFunction) => {
            const crlf = new ChangeCrLf(logFn);
            return crlf.perform();
        },
        actionName: "crlf",
        context: CommandContext.isBuilding,
        fail: localize("crlf.fail", "Change CrLf failed"),
        status: localize("crlf.status", "$(search) Changing..."),
        success: localize("crlf.success", "Change CrLf done"),
    },
];

export async function Perform(actionName: ActionType, logFn?: LogFunction) {
    const actionToDo = actions.find((action) => action.actionName === actionName);
    if (!actionToDo) {
        if (logFn) {
            logFn(LogType.debug, () => localize("error.no_action", "Cannot find action: {0}", actionName));
        }
        return false;
    }
    return ensureSettings(logFn)
        .then((ok) => {
            if (ok && configHelper) {
                setContext(actionToDo.context, true);
                const msg = window.setStatusBarMessage(actionToDo.status);
                return actionToDo.actionFunc(logFn)
                    .catch((err) => {
                        if (logFn) {
                            logFn(LogType.error, () => err);
                        }
                        return false;
                    }).then((result) => {
                        setContext(actionToDo.context, false);
                        msg.dispose();
                        if (result) {
                            window.showInformationMessage(actionToDo.success);
                            if (logFn) {
                                logFn(LogType.information, () => actionToDo.success, true);
                            }
                        } else {
                            window.showInformationMessage(actionToDo.fail);
                            if (logFn) {
                                logFn(LogType.error, () => actionToDo.fail, true);
                            }
                        }
                        return result;
                    });
            } else {
                return false;
            }
        });
}
