import * as vscode from 'vscode';

const locale = vscode.env.language;
import * as nls from "vscode-nls";

const localize = nls.config({ locale, messageFormat: nls.MessageFormat.both })();

export async function activate(context: vscode.ExtensionContext) {

}

export function deactivate() {
    // do nothing
}