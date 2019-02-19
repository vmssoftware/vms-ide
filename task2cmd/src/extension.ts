import * as vscode from 'vscode';
import { tasks } from 'vscode';
import { Task2CmdProvider } from './task2cmd-prov';
import { GetConfigApi } from './ext-api/get-config-api';

export async function activate(context: vscode.ExtensionContext) {

    const configApi = await GetConfigApi();
    if (!configApi) {
        return;
    }
    const logFn = configApi.createLogFunction("OpenVMS Task2Cmd");

    const taskProvider = new Task2CmdProvider(logFn);
    let disposable = tasks.registerTaskProvider(Task2CmdProvider.taskType, taskProvider);

    context.subscriptions.push(disposable);
    context.subscriptions.push(taskProvider);
}

export function deactivate() {
}