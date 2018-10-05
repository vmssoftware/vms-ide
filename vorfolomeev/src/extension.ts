
import { commands, window } from "vscode";
import { ExtensionContext } from "vscode";
import { IConfigHelper } from "./ext-api/config";
import { GetConfigHelperFromApi } from "./ext-api/get";
import { SyncronizeProject } from "./syncronize";

import * as nls from "vscode-nls";
import { ToOutputChannel } from "./output-channel";

const localize = nls.config()();

// tslint:disable-next-line:no-console
export let logFn = console.log;
// tslint:disable-next-line:no-empty
// logFn = () => {};

export async function activate(context: ExtensionContext) {

    // require("./ssh/ssh-helper").logFn = logFn;
    // require("./ssh/simply-shell-parser").logFn = logFn;
    // require("./sync/sync-v1").logFn = logFn;
    // require("./sync/test/test").logFn = logFn;
    // require("./vms/vms-ssh-helper").logFn = logFn;

    logFn(localize("extension.activated", "OpenVMS extension is activated"));

    let configHelper: IConfigHelper | undefined;
    GetConfigHelperFromApi().then((helperApi) => {
        if (helperApi) {
            configHelper = helperApi.getConfigHelper("open-vms");
            context.subscriptions.push(configHelper);
        }
    });

    let syncInProgress = false;
    context.subscriptions.push( commands.registerCommand("VMS.syncProject", async () => {
        logFn("sync start");
        if (configHelper) {
            if (syncInProgress) {
                window.showInformationMessage("Syncronization in progress");
            } else {
                syncInProgress = true;
                SyncronizeProject(configHelper).then((result) => {
                    if (result) {
                        ToOutputChannel(`Syncronization: sent ${result.sent ? result.sent : "none"} of ${result.all}`);
                    } else {
                        ToOutputChannel(`Syncronization: failed`);
                    }
                    syncInProgress = false;
                });
            }
        }
        logFn("sync end");
    }));

    context.subscriptions.push( commands.registerCommand("VMS.buildProject", async () => {
        logFn("build start");
        if (configHelper) {
            // BuildProject(configHelper);
        }
        logFn("build end");
    }));

    context.subscriptions.push( commands.registerCommand("VMS.editProject", async () => {
        logFn("edit start");
        if (configHelper) {
            const editor = configHelper.getEditor();
            await editor.invoke();
        }
        logFn("edit end");
    }));

    logFn("activation end");
}

// this method is called when your extension is deactivated
// tslint:disable-next-line:no-empty
export function deactivate() {
}
