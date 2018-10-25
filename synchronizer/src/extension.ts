
import { commands, ExtensionContext, window, workspace } from "vscode";
import { LogType } from "./common/log-type";
import { IConfigHelper } from "./config/config";
import { GetConfigHelperFromApi } from "./config/get-config-helper";

import * as nls from "vscode-nls";
import { BuildProject } from "./build";
import { EnsureSettings } from "./ensure-settings";
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

    let configHelper: IConfigHelper | undefined;
    GetConfigHelperFromApi().then((helperApi) => {
        if (helperApi) {
            configHelper = helperApi.getConfigHelper("open-vms");
            context.subscriptions.push(configHelper);
        }
    });

    context.subscriptions.push( commands.registerCommand("VMS.syncProject", async () => {
        if (configHelper) {
            return SyncProject(context, configHelper.getConfig(), debugLogFn)
                .catch((err) => {
                    if (debugLogFn) {
                        debugLogFn(err);
                    }
                    return false;
                });
        }
        return false;
    }));

    context.subscriptions.push( commands.registerCommand("VMS.buildProject", async () => {
        if (configHelper) {
            const config = configHelper.getConfig();
            return SyncProject(context, config, debugLogFn)
                .then((ok) => {
                    if (ok) {
                        return BuildProject(context, config, debugLogFn);
                    } else {
                        return false;
                    }
                }).catch((err) => {
                    if (debugLogFn) {
                        debugLogFn(err);
                    }
                    return false;
                });
        } else {
            return false;
        }
    }));

    context.subscriptions.push( commands.registerCommand("VMS.stopSync", async () => {
        return StopSyncProject()
            .catch((err) => {
                if (debugLogFn) {
                    debugLogFn(err);
                }
                return false;
        });
    }));

    context.subscriptions.push( commands.registerCommand("VMS.editProject", async () => {
        if (configHelper) {
            return EnsureSettings(configHelper.getConfig())
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
        } else {
            return false;
        }
    }));
}

// this method is called when your extension is deactivated
// tslint:disable-next-line:no-empty
export function deactivate() {
    if (debugLogFn) {
        debugLogFn(localize("extension.deactivated", "OpenVMS extension is deactivated"));
    }
}
