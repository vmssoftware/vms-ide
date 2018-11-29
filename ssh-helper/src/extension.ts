
import * as vscode from 'vscode';
import { SshHelper } from './ssh-helper';
import { ensureConfigHelperApi, configApi } from './config-api';

const locale = vscode.env.language ;
import * as nls from "vscode-nls";
const localize = nls.config({ locale, messageFormat: nls.MessageFormat.both })();

export async function activate(context: vscode.ExtensionContext) {

    if (!await ensureConfigHelperApi() || !configApi) {
        return undefined;
    }

    const sshHelper = new SshHelper(configApi.createLogFunction("OpenVMS: SSH"));

    let disposable = vscode.commands.registerCommand('vmssoftware.ssh-helper.editSettings', (scope: string) => {
        let scopes = [scope];
        if (scope === undefined) {
            // TODO: get sorted by dependencies list of scopes
            if (vscode.workspace.workspaceFolders) {
                scopes = vscode.workspace.workspaceFolders.map((wf) => wf.name);
            }
        }
        for (const curScope of scopes) {
            sshHelper.editSettings(curScope);
        }
    });

    context.subscriptions.push(disposable);
    context.subscriptions.push(sshHelper);

    return SshHelper;   // class, not object
}

export function deactivate() {
    // do nothing
}