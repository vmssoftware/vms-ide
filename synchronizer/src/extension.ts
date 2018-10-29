
import { commands, ExtensionContext, TreeItem, window, workspace } from "vscode";
import * as nls from "vscode-nls";

import { LogType } from "@vorfol/common";

import { BuildProject } from "./build";
import { configHelper, EnsureSettings } from "./ensure-settings";
import { ToOutputChannel } from "./output-channel";
import { setBuilding, setSynchronizing } from "./stop";
import { StopSyncProject, SyncProject } from "./synchronize";

const localize = nls.config()();

let debugLogFn: LogType | undefined;
debugLogFn = undefined;
// tslint:disable-next-line:no-console
debugLogFn = console.log;

let contextSaved: ExtensionContext | undefined;

export async function activate(context: ExtensionContext) {

    contextSaved = context;

    if (debugLogFn) {
        debugLogFn(localize("extension.activated", "OpenVMS extension is activated"));
    }

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.syncProject", async () => {
        if (EnsureSettings(debugLogFn) && configHelper) {
            setSynchronizing(true);
            const msg = window.setStatusBarMessage("Synchronizing...");
            return SyncProject(context, debugLogFn)
                .catch((err) => {
                    setSynchronizing(false);
                    if (debugLogFn) {
                        debugLogFn(err);
                    }
                    return false;
                }).then((result) => {
                    msg.dispose();
                    setSynchronizing(false);
                    return result;
                });
        }
        return false;
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.buildProject", async () => {
        if (EnsureSettings(debugLogFn) && configHelper) {
            setBuilding(true);
            setSynchronizing(true);
            let msg = window.setStatusBarMessage("Synchronizing...");
            return SyncProject(context, debugLogFn)
                .then((ok) => {
                    msg.dispose();
                    if (ok) {
                        msg = window.setStatusBarMessage("Building...");
                        return BuildProject(context, debugLogFn)
                            .then((result) => {
                                if (result) {
                                    window.showInformationMessage(`Build operation is done`);
                                    ToOutputChannel(`Build operation is done.`);
                                } else {
                                    window.showErrorMessage(`Build operation is failed`);
                                    ToOutputChannel(`Build operation is failed.`);
                                }
                                return result;
                            });
                    } else {
                        return false;
                    }
                }).catch((err) => {
                    if (debugLogFn) {
                        debugLogFn(err);
                    }
                    return false;
                }).then((result) => {
                    msg.dispose();
                    setSynchronizing(false);
                    setBuilding(false);
                    return result;
                });
        } else {
            return false;
        }
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.stopSync", async () => {
        return StopSyncProject()
            .catch((err) => {
                if (debugLogFn) {
                    debugLogFn(err);
                }
                return false;
        });
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.editProject", async () => {
        return EnsureSettings()
            .then((ok) => {
                if (ok && configHelper) {
                    const editor = configHelper.getEditor();
                    return editor.invoke();
                } else {
                    return false;
                }
            }).catch((err) => {
                if (debugLogFn) {
                    debugLogFn(err);
                }
                return false;
            });
    }));
}

// this method is called when your extension is deactivated
export function deactivate() {
    if (debugLogFn) {
        debugLogFn(localize("extension.deactivated", "OpenVMS extension is deactivated"));
    }
}
