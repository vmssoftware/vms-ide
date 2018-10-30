'use strict';
import * as vscode from 'vscode';
import { SshHelper } from './ssh-helper';

const sshHelper = new SshHelper(console.log);

const locale = vscode.env.language ;
import * as nls from "vscode-nls";
const localize = nls.config({ locale })();

export function activate(context: vscode.ExtensionContext) {

    let disposable = vscode.commands.registerCommand('vmssoftware.ssh-helper.editSettings', () => {
        sshHelper.editSettings();
    });

    context.subscriptions.push(disposable);
    context.subscriptions.push(sshHelper);

    return SshHelper;
}

export function deactivate() {
    // do nothing
}