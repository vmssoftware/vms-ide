import { commands, env, ExtensionContext, window, workspace } from "vscode";

import { Builder } from "./build/builder";
import { setExtensionContext } from "./context";
import { configApi, ensureConfigHelperApi } from "./ensure-settings";
import { Perform } from "./performer";
import { SyncApi } from "./sync/sync-api";
import { Synchronizer } from "./sync/synchronizer";

import { LogFunction, LogType } from "@vorfol/common";

const locale = env.language ;
import * as nls from "vscode-nls";
const localize = nls.config({ locale, messageFormat: nls.MessageFormat.both })();

// tslint:disable-next-line:no-empty
let logFn: LogFunction = () => {};

export async function activate(context: ExtensionContext) {

    if (!await ensureConfigHelperApi() || configApi === undefined) {
        return undefined;
    }

    const syncLog = configApi.createLogFunction("OpenVMS synchronizer");
    const buildLog = configApi.createLogFunction("OpenVMS builder");

    logFn = syncLog;

    setExtensionContext(context);

    syncLog(LogType.debug, () => localize("debug.activated", "OpenVMS extension is activated"));

    context.subscriptions.push(Synchronizer.acquire(syncLog));
    context.subscriptions.push(Builder.acquire(buildLog));

    context.subscriptions.push( window.registerUriHandler({
        handleUri(uri) {
            syncLog(LogType.debug, () => `command: ${uri.path}`);
            syncLog(LogType.debug, () => `query: ${uri.query}`);
            syncLog(LogType.debug, () => `fragment: ${uri.fragment}`);
        }}));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.syncProject", async (scope: string) => {
        return workspace.saveAll(true)
            .then((saved) => {
                if (saved) {
                    return Perform("synchronize", scope, syncLog);
                }
                return saved;
            });
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.buildProject", async (scope: string) => {
        return workspace.saveAll(true)
            .then((saved) => {
                if (saved) {
                    return Perform("upload source", scope, syncLog);
                }
                return saved;
            })
            .then((uploadOk) => {
                if (uploadOk) {
                    return Perform("build", scope, buildLog);
                }
                return uploadOk;
            });
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.cleanProject", async (scope: string) => {
        return Perform("clean", scope, buildLog);
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.stopSync", async (scope: string) => {
        return Synchronizer.acquire().disableRemote();
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.editProject", async (scope: string) => {
        return Perform("edit settings", scope, syncLog);
    }));

    context.subscriptions.push( commands.registerCommand("vmssoftware.synchronizer.changeCRLF", async (scope: string) => {
        return Perform("crlf", scope, syncLog);
    }));

    return new SyncApi();
}

// this method is called when your extension is deactivated
export function deactivate() {
    logFn(LogType.debug, () => localize("debug.deactivated", "OpenVMS extension is deactivated"));
}
