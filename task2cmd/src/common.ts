import * as vscode from 'vscode';

let _context: vscode.ExtensionContext|undefined = undefined;

export function setContext(context: vscode.ExtensionContext) {
    _context = context;
}

export function getContext(): vscode.ExtensionContext|undefined {
    return _context;
}
