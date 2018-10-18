
import { commands, ExtensionContext, window } from "vscode";
import { LogType } from "./common/log-type";
import { IConfigHelper } from "./config/config";
import { GetConfigHelperFromApi } from "./config/get-config-helper";
import { ToOutputChannel } from "./output-channel";
import { Synchronizer } from "./syncronize";
import { DownloadProject } from "./vms/download-project";

import * as nls from "vscode-nls";

const localize = nls.config()();

export let logFn: LogType | undefined;

// tslint:disable-next-line:no-console
logFn = console.log;

export async function activate(context: ExtensionContext) {

    // uncomment lines to enable log
    // require("./ssh/connection").logFn = logFn;
    // require("./ssh/sftp-connection").logFn = logFn;
    // require("./ssh/shell-connection").logFn = logFn;
    // require("./ssh/exec").logFn = logFn;
    // require("./ssh/queued-connection").logFn = logFn;
    // require("./ssh/simply-shell-parser").logFn = logFn;
    // require("./ssh/password-checker").logFn = logFn;
    // require("./sync/sync-impl").logFn = logFn;
    // require("./sync/fs-source").logFn = logFn;
    // require("./sync/fs-source-file").logFn = logFn;
    // require("./sync/sync-impl").logFn = logFn;
    // require("./vms/vms-ssh-helper").logFn = logFn;
    // require("./syncronize").logFn = logFn;
    // require("./vms/download-project").logFn = logFn;

    if (logFn) { logFn(localize("extension.activated", "OpenVMS extension is activated")); }

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
                synchronizer = new Synchronizer();
            }
            if (synchronizer.isInProgress) {
                window.showInformationMessage("Syncronization in progress");
            } else {
                synchronizer.SyncronizeProject(configHelper).then((result) => {
                    if (result) {
                        window.showInformationMessage(`Syncronization: sent ${result.sent} of ${result.all}`);
                    } else {
                        window.showErrorMessage(`Syncronization: failed`);
                    }
                });
            }
        }
    }));

    context.subscriptions.push( commands.registerCommand("VMS.downloadProject", async () => {
        if (configHelper) {
            DownloadProject(configHelper).then((result) => {
                ToOutputChannel(`DownloadProject returns ${result}`);
            });
        }
    }));

    context.subscriptions.push( commands.registerCommand("VMS.buildProject", async () => {
        if (configHelper) {
            // BuildProject(configHelper);
        }
    }));

    context.subscriptions.push( commands.registerCommand("VMS.editProject", async () => {
        if (configHelper) {
            const editor = configHelper.getEditor();
            await editor.invoke();
        }
    }));
}

// this method is called when your extension is deactivated
// tslint:disable-next-line:no-empty
export function deactivate() {
    if (logFn) { logFn(localize("extension.deactivated", "OpenVMS extension is deactivated")); }
}
