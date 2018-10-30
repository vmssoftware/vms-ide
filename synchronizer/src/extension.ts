
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
        return EnsureSettings(debugLogFn)
            .then((ok) => {
                if (ok && configHelper) {
                    setSynchronizing(true);
                    const msg = window.setStatusBarMessage("Synchronizing...");
                    return SyncProject(context, debugLogFn)
                        .catch((err) => {
                            if (debugLogFn) {
                                debugLogFn(err);
                            }
                            return false;
                        }).then((result) => {
                            setSynchronizing(false);
                            msg.dispose();
                            return result;
                        });
                } else {
                    return false;
                }
            });
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.buildProject", async () => {
        return EnsureSettings(debugLogFn)
            .then((ok) => {
                if (ok && configHelper) {
                    setSynchronizing(true);
                    let msg = window.setStatusBarMessage("Synchronizing...");
                    return SyncProject(context, debugLogFn)
                        .catch((err) => {
                            if (debugLogFn) {
                                debugLogFn(err);
                            }
                            return false;
                        }).then((syncResult) => {
                            setSynchronizing(false);
                            msg.dispose();
                            if (syncResult) {
                                setBuilding(true);
                                msg = window.setStatusBarMessage("Building...");
                                return BuildProject(context, debugLogFn)
                                    .catch((err) => {
                                        if (debugLogFn) {
                                            debugLogFn(err);
                                        }
                                        return false;
                                    }).then((buildResult) => {
                                        setBuilding(false);
                                        msg.dispose();
                                        return buildResult;
                                    });
                            }
                            return syncResult;
                        });
                } else {
                    return false;
                }
            });
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
