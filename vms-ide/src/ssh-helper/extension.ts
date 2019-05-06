
import * as vscode from "vscode";

import { configApi, ensureConfigHelperApi } from "./config-api";
import { SshHelper } from "./ssh-helper";

const locale = vscode.env.language ;
import * as nls from "vscode-nls";
const localize = nls.config({ locale, messageFormat: nls.MessageFormat.both })();

export async function activate(context: vscode.ExtensionContext) {

    if (!await ensureConfigHelperApi() || !configApi) {
        return undefined;
    }

    const sshHelper = new SshHelper(configApi.createLogFunction("VMS IDE: SSH"));

    setupWatchers(sshHelper);

    vscode.workspace.onDidChangeWorkspaceFolders(() => {
        setupWatchers(sshHelper);
    });

    context.subscriptions.push(sshHelper);

    return SshHelper;   // class, not object
}

let watchers: vscode.Disposable[] = [];

function setupWatchers(sshHelper: SshHelper) {
    watchers.forEach((watcher) => watcher.dispose());
    watchers = [];
    if (vscode.workspace.workspaceFolders) {
        for (const wf of vscode.workspace.workspaceFolders) {
            watchers.push(sshHelper.setConfigWatcher(wf.name, () => {
                sshHelper.killPasswordCache();
            }));
        }
    }
}

export function deactivate() {
    // do nothing
}
