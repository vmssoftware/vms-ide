
import { commands, Disposable, env, ExtensionContext, InputBox, window } from "vscode";

import { setExtensionContext } from "./context";
import { configHelper, EnsureSettings } from "./ensure-settings";
import { createLogFunction } from "./log";
import { StopSyncProject, SyncProject } from "./synchronize";

import { LogType } from "@vorfol/common";

const syncLog = createLogFunction("OpenVMS synchronizer");
const buildLog = createLogFunction("OpenVMS builder");

const locale = env.language ;
import * as nls from "vscode-nls";
import { Perform } from "./performer";
const localize = nls.config({ locale, messageFormat: nls.MessageFormat.both })();

export async function activate(context: ExtensionContext) {

    setExtensionContext(context);

    syncLog(LogType.debug, () => localize("debug.activated", "OpenVMS extension is activated"));

    context.subscriptions.push( window.registerUriHandler({
        handleUri(uri) {
            syncLog(LogType.debug, () => `command: ${uri.path}`);
            syncLog(LogType.debug, () => `query: ${uri.query}`);
            syncLog(LogType.debug, () => `fragment: ${uri.fragment}`);
        }}));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.syncProject", async () => {
        return SyncProject(syncLog);
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.buildProject", async () => {
        return SyncProject(syncLog)
                .then((syncOk) => {
                    if (syncOk) {
                        return Perform("build", buildLog);
                    }
                    return syncOk;
                });
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.cleanProject", async () => {
        return Perform("clean", buildLog);
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.stopSync", async () => {
        return StopSyncProject();
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
                syncLog(LogType.error, () => String(err));
                return false;
            });
    }));
}

// this method is called when your extension is deactivated
export function deactivate() {
    syncLog(LogType.debug, () => localize("debug.deactivated", "OpenVMS extension is deactivated"));
}
