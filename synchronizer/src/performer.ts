import { LogFunction, LogType } from "@vorfol/common";

import { CommandContext, setContext } from "./command-context";
import { configHelper, EnsureSettings } from "./ensure-settings";

import { window, workspace } from "vscode";

import { Builder } from "./build/builder";
import { Synchronizer } from "./sync/synchronizer";

import * as nls from "vscode-nls";
nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export type AsyncAction = (logFn?: LogFunction) => Promise<boolean>;

export type ActionType = "save.all" | "syncronize" | "build" | "clean";

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
        actionName: "save.all",
        context: CommandContext.isSaving,
        fail: localize("saving.fail", "Saving failed"),
        status: localize("saving.status", "Saving..."),
        success: localize("saving.success", "Saving ok"),
    },
    {
        actionFunc: async (logFn?: LogFunction) => {
            const syncronizer = Synchronizer.acquire(logFn);
            return syncronizer.syncronizeProject();
        },
        actionName: "syncronize",
        context: CommandContext.isSyncronizing,
        fail: localize("synchronizing.fail", "Synchronizing failed"),
        status: localize("synchronizing.status", "Synchronizing..."),
        success: localize("synchronizing.success", "Synchronizing ok"),
    },
    {
        actionFunc: async (logFn?: LogFunction) => {
            const builder = Builder.acquire(logFn);
            return builder.buildProject();
        },
        actionName: "build",
        context: CommandContext.isBuilding,
        fail: localize("building.fail", "Building failed"),
        status: localize("building.status", "Building..."),
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
        status: localize("clean.status", "Clean..."),
        success: localize("clean.success", "Clean ok"),
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
    return EnsureSettings(logFn)
        .then((ok) => {
            if (ok && configHelper) {
                setContext(actionToDo.context, true);
                const msg = window.setStatusBarMessage(actionToDo.status);
                return actionToDo.actionFunc(logFn)
                    .catch((err) => {
                        if (logFn) {
                            logFn(LogType.debug, () => err);
                        }
                        return false;
                    }).then((result) => {
                        setContext(actionToDo.context, false);
                        msg.dispose();
                        if (result) {
                            window.showInformationMessage(actionToDo.success);
                            if (logFn) {
                                logFn(LogType.informtion, () => actionToDo.success);
                            }
                        } else {
                            window.showInformationMessage(actionToDo.fail);
                            if (logFn) {
                                logFn(LogType.informtion, () => actionToDo.fail);
                            }
                        }
                        return result;
                    });
            } else {
                return false;
            }
        });
}
