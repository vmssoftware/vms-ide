
import { commands, window } from "vscode";
import { ExtensionContext } from "vscode";
import { IConfigHelper } from "./config/config";
import { GetConfigHelperFromApi } from "./config/get-config-helper";
import { Synchronizer } from "./syncronize";

import * as nls from "vscode-nls";
import { ToOutputChannel } from "./output-channel";
import { DownloadProject } from "./vms/download-project";

const localize = nls.config()();

// tslint:disable-next-line:no-console
export let logFn = console.log;
// tslint:disable-next-line:no-empty
// logFn = () => {};

export async function activate(context: ExtensionContext) {

    // uncomment lines to enable log
    require("./ssh/connection").logFn = logFn;
    require("./ssh/sftp-connection").logFn = logFn;
    require("./ssh/shell-connection").logFn = logFn;
    require("./ssh/exec").logFn = logFn;
    require("./ssh/queued-connection").logFn = logFn;
    require("./ssh/simply-shell-parser").logFn = logFn;
    require("./ssh/password-checker-3").logFn = logFn;
    require("./sync/sync-impl").logFn = logFn;
    require("./sync/fs-source").logFn = logFn;
    require("./sync/fs-source-file").logFn = logFn;
    require("./sync/sync-impl").logFn = logFn;
    require("./vms/vms-ssh-helper").logFn = logFn;
    require("./syncronize").logFn = logFn;
    require("./vms/download-project").logFn = logFn;

    logFn(localize("extension.activated", "OpenVMS extension is activated"));

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
    logFn(localize("extension.deactivated", "OpenVMS extension is deactivated"));
}
