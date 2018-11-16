
import { commands, env, ExtensionContext, window } from "vscode";

import { setExtensionContext } from "./context";
import { configApi, configHelper, EnsureSettings } from "./ensure-settings";
import { Perform } from "./performer";
import { SourceHelper } from "./sync/get-source";
import { StopSyncProject, SyncProject } from "./synchronize";

import { LogFunction, LogType } from "@vorfol/common";

const locale = env.language ;
import * as nls from "vscode-nls";
const localize = nls.config({ locale, messageFormat: nls.MessageFormat.both })();

// tslint:disable-next-line:no-empty
let logFn: LogFunction = () => {};

export async function activate(context: ExtensionContext) {

    const apiLoaded = await EnsureSettings();
    if (!apiLoaded || configApi === undefined) {
        return undefined;
    }

    const syncLog = configApi.createLogFunction("OpenVMS synchronizer");
    const buildLog = configApi.createLogFunction("OpenVMS builder");

    logFn = syncLog;

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

    return new SourceHelper();
}

// this method is called when your extension is deactivated
export function deactivate() {
    logFn(LogType.debug, () => localize("debug.deactivated", "OpenVMS extension is deactivated"));
}
