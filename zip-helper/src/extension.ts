
import * as vscode from 'vscode';
import { ZipApi } from './zip-api';

export async function activate(context: vscode.ExtensionContext) {

    return ZipApi;
}

export function deactivate() {
    // do nothing
}