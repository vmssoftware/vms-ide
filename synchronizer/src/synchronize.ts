import { ExtensionContext, window, workspace } from "vscode";

import { LogType } from "@vorfol/common";

import { ToOutputChannel } from "./output-channel";
import { Synchronizer } from "./sync/syncronizer";

export let synchronizer: Synchronizer | undefined;

export async function StopSyncProject() {
    if (synchronizer) {
        synchronizer.disableRemote();
        return true;
    }
    return false;
}

import * as nls from "vscode-nls";
const localize = nls.loadMessageBundle();

export async function SyncProject(context: ExtensionContext, debugLog?: LogType) {
    return workspace.saveAll(false).then((ok) => {
        if (ok) {
            if (!synchronizer) {
                synchronizer = new Synchronizer(debugLog);
                context.subscriptions.push(synchronizer);
            }
            if (synchronizer.isInProgress) {
                window.showInformationMessage(localize("message.sync_in_progress", "Syncronization in progress"));
                return false;
            } else {
                return synchronizer.syncronizeProject()
                    .then((result) => {
                        if (result) {
                            window.showInformationMessage(localize("message.sync.ok", "Syncronization: ok"));
                            ToOutputChannel(localize("output.sync.done", "Synchronization is done."));
                        } else {
                            window.showErrorMessage(localize("message.sync.wrong", "Syncronization: some files failed to synchronize, see output"));
                            ToOutputChannel(localize("output.sync.failed", "Synchronization is failed"));
                            for (const err of synchronizer!.lastErrors) {
                                ToOutputChannel(`${err}`);
                            }
                        }
                        return result;
                    }).catch((err) => {
                        if (debugLog) {
                            debugLog(err);
                        }
                        return false;
                    });
                }
        } else {
            return false;
        }
    });
}
