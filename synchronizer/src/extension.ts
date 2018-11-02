
import { commands, Disposable, env, ExtensionContext, InputBox, window } from "vscode";

import { LogType } from "@vorfol/common";

import { BuildProject } from "./build";
import { configHelper, EnsureSettings } from "./ensure-settings";
import { ToOutputChannel } from "./output-channel";
import { setBuilding, setSynchronizing } from "./stop";
import { StopSyncProject, SyncProject } from "./synchronize";

let debugLogFn: LogType | undefined;
debugLogFn = undefined;
// tslint:disable-next-line:no-console
debugLogFn = console.log;

const locale = env.language ;
import * as nls from "vscode-nls";
const localize = nls.config({ locale, messageFormat: nls.MessageFormat.both })();

if (debugLogFn) {
    debugLogFn(`Loaded NLS for: ${env.language}`);
}

let contextSaved: ExtensionContext | undefined;

export async function activate(context: ExtensionContext) {

    contextSaved = context;

    const syncMessage = localize("message.synchronizing", "Synchronizing...");
    const buildMessage = localize("message.building", "Building...");

    if (debugLogFn) {
        debugLogFn(localize("debug.activated", "OpenVMS extension is activated"));
    }

    context.subscriptions.push( window.registerUriHandler({
        handleUri(uri) {
            if (debugLogFn) {
                debugLogFn(`command: ${uri.path}`);
                debugLogFn(`query: ${uri.query}`);
                debugLogFn(`fragment: ${uri.fragment}`);
            }
        }}));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.syncProject", async () => {
        return EnsureSettings(debugLogFn)
            .then((ok) => {
                if (ok && configHelper) {
                    setSynchronizing(true);
                    const msg = window.setStatusBarMessage(syncMessage);
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
                    let msg = window.setStatusBarMessage(syncMessage);
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
                                msg = window.setStatusBarMessage(buildMessage);
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

    // const inputBox = window.createInputBox();
    // inputBox.ignoreFocusOut = true;
    // let onHide: Disposable | undefined = inputBox.onDidHide(() => inputBox.show());
    // inputBox.prompt = "> ";
    // inputBox.title = "Enter command";
    // inputBox.onDidAccept(() => {
    //     if (inputBox.value === "quit") {
    //         if (onHide) {
    //             onHide.dispose();
    //             onHide = undefined;
    //         }
    //         inputBox.hide();
    //     }
    //     ToOutputChannel(inputBox.value);
    //     inputBox.value = "";
    // });
    // inputBox.show();

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.editProject", async () => {

        // if (onHide === undefined) {
        //     onHide = inputBox.onDidHide(() => inputBox.show());
        //     inputBox.show();
        // }

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
        debugLogFn(localize("debug.deactivated", "OpenVMS extension is deactivated"));
    }
}
