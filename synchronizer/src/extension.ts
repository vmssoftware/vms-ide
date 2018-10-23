
import { commands, ExtensionContext, window } from "vscode";
import { LogType } from "./common/log-type";
import { IConfigHelper } from "./config/config";
import { GetConfigHelperFromApi } from "./config/get-config-helper";
import { ToOutputChannel } from "./output-channel";
import { Synchronizer } from "./sync/syncronize";

import * as nls from "vscode-nls";
import { EnsureSettings } from "./ensure-settings";
import { setStopCommand } from "./stop";

const localize = nls.config()();

let debugLogFn: LogType | undefined;
debugLogFn = undefined;
// tslint:disable-next-line:no-console
debugLogFn = console.log;

let contextSaved: ExtensionContext | undefined;

export async function activate(context: ExtensionContext) {

    contextSaved = context;
    setStopCommand(context, false);

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

    let synchronizer: Synchronizer | undefined;
    context.subscriptions.push( commands.registerCommand("VMS.syncProject", async () => {
        if (configHelper) {
            if (!synchronizer) {
                synchronizer = new Synchronizer(debugLogFn);
                context.subscriptions.push(synchronizer);
            }
            if (synchronizer.isInProgress) {
                window.showInformationMessage("Syncronization in progress");
            } else {
                setStopCommand(context, true);
                synchronizer.syncronizeProject(configHelper.getConfig()).then((result) => {
                    setStopCommand(context, false);
                    ToOutputChannel(`Synchronization is done.`);
                    if (result) {
                        window.showInformationMessage(`Syncronization: ok`);
                    } else {
                        window.showErrorMessage(`Syncronization: some files failed to synchronize, see output`);
                    }
                });
            }
        }
    }));

    context.subscriptions.push( commands.registerCommand("VMS.buildProject", async () => {
        if (configHelper) {
            // BuildProject(configHelper);
        }
    }));

    context.subscriptions.push( commands.registerCommand("VMS.stopSync", async () => {
        if (synchronizer) {
            synchronizer.disableRemote();
        }
    }));

    context.subscriptions.push( commands.registerCommand("VMS.editProject", async () => {
        if (configHelper) {
            await EnsureSettings(configHelper.getConfig());
            const editor = configHelper.getEditor();
            await editor.invoke();
        }
    }));
}

// this method is called when your extension is deactivated
// tslint:disable-next-line:no-empty
export function deactivate() {
    if (contextSaved) {
        setStopCommand(contextSaved, false);
    }
    if (debugLogFn) {
        debugLogFn(localize("extension.deactivated", "OpenVMS extension is deactivated"));
    }
}
