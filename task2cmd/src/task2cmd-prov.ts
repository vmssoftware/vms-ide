import * as vscode from 'vscode';
import * as path from 'path';
import * as net from "net";
import { getContext } from './common';

interface IParams {
    command: string;
    scope: string;
    parameter: string;
    extension: string;
}

export class Task2CmdProvider implements vscode.TaskProvider {

    public static taskType = 'task2cmd';

    private server?: net.Server;
    private port?: number;
    private recv = "";

    constructor() {
        this.server = net.createServer((client) => {
            client.on("error", (err) => {
            });
            client.on("data", (data) => {
                this.recv += data.toString("utf8");
                Promise.resolve().then(() => {
                    const params: IParams = JSON.parse(this.recv);
                    this.recv = "";
                    if (typeof params.extension === "string") {
                        return this.activateExtension(params.extension).then(() => params);
                    }
                    return params;
                }).then((params) => {
                    vscode.commands.getCommands(true).then((cmds) => {
                        if (cmds.some((s) => s === params.command)) {
                            const thenable = vscode.commands.executeCommand(params.command, params.scope, params.parameter);
                            if (thenable) {
                                thenable.then((ret) => {
                                    if (ret) {
                                        client.end(`Done`);
                                    } else {
                                        client.end(`Failed`);
                                    }
                                });
                            } else {
                                client.end(`Command returns nothing "${params.command}"`);
                            }        
                        } else {
                            client.end(`No such command "${params.command}"`);
                        }
                    });
                }).catch((err) => {
                    client.end(`Error: (${err})`);
                });
            });
        });
        this.server.on('error', (err) => {
            this.server = undefined;
            this.port = undefined;
        });
        this.server.listen(() => {
            this.port = this.server!.address().port;
        });        
    }

    public dispose() {
        if (this.server) {
            this.server.close();
            this.server = undefined;
            this.port = undefined;
        }
    }

    public async activateExtension(extensionName: string) {
        const extension = vscode.extensions.getExtension(extensionName);
        if (extension) {
            if (!extension.isActive) {
                return extension.activate();
            }
        }
    }

    public provideTasks(token?: vscode.CancellationToken | undefined): vscode.ProviderResult<vscode.Task[]> {
        const retTasks: vscode.Task[] = [];
        let context  = getContext();
        if (context && vscode.workspace.workspaceFolders) {
            let helperFile = path.join(context.extensionPath, "out", "client");
            for (const workspace of vscode.workspace.workspaceFolders) {
                const configuration = vscode.workspace.getConfiguration("tasks", workspace.uri);
                if (configuration) {
                    const tasks = configuration.get<[any]>("tasks");
                    if (tasks) {
                        for (const taskDef of tasks) {
                            if (taskDef.type === Task2CmdProvider.taskType && typeof taskDef.command === "string") {
                                let task = new vscode.Task(taskDef, workspace, taskDef.label || taskDef.command, Task2CmdProvider.taskType);
                                const params: IParams = {
                                    command: taskDef.command,
                                    scope: workspace.name,
                                    parameter: taskDef.parameter,
                                    extension: taskDef.extension,
                                };
                                const strParams = JSON.stringify(params,undefined,4);
                                const strParams64 = Buffer.from(strParams).toString("base64");
                                task.execution = new vscode.ShellExecution('node', [helperFile, String(this.port), strParams64]);
                                task.presentationOptions = { echo: false, focus: false, showReuseMessage: false, reveal: 2 };
                                retTasks.push(task);
                            }
                        }
                    }
                }
            }
        }
        return retTasks;
    }    
    
    public resolveTask(task: vscode.Task, token?: vscode.CancellationToken | undefined): vscode.ProviderResult<vscode.Task> {
        return undefined;
    }

}