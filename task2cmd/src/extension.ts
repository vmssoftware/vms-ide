'use strict';
import * as vscode from 'vscode';
import { tasks } from 'vscode';
import { setContext } from './common';
import { Task2CmdProvider } from './task2cmd-prov';

export function activate(context: vscode.ExtensionContext) {

    setContext(context);

    const taskProvider = new Task2CmdProvider();
    let disposable = tasks.registerTaskProvider(Task2CmdProvider.taskType, taskProvider);

    context.subscriptions.push(disposable);
    context.subscriptions.push(taskProvider);
}

export function deactivate() {
}