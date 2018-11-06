'use strict';
import * as vscode from 'vscode';
import { SshHelper } from './ssh-helper';

import { logConsoleFn } from '@vorfol/common';

const sshHelper = new SshHelper(undefined);

const locale = vscode.env.language ;
import * as nls from "vscode-nls";
const localize = nls.config({ locale, messageFormat: nls.MessageFormat.both })();

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