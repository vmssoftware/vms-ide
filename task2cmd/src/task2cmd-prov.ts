import * as vscode from 'vscode';
import * as path from 'path';
import * as net from "net";
import { readFile } from 'fs';
import { getContext } from './common';

export class Task2CmdProvider implements vscode.TaskProvider {

    public static taskType = 'task2cmd';

    private server?: net.Server;
    private port?: number;

    constructor() {
        this.server = net.createServer((client) => {
            client.on("error", (err) => {
            });
            client.on("data", (data) => {
                const cmd = data.toString("utf8");
                vscode.commands.executeCommand(cmd)
                    .then((ret) => {
                        if (ret) {
                            client.end(`Done`);
                        } else {
                            client.end(`Failed`);
                        }
                        console.log(`Done (${ret})`);
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

    public provideTasks(token?: vscode.CancellationToken | undefined): vscode.ProviderResult<vscode.Task[]> {
        if (vscode.workspace.workspaceFolders) {
            let context  = getContext();
            if (context) {
                const wsPath = vscode.workspace.workspaceFolders[0].uri.fsPath;
                let helperFile = path.join(context.extensionPath, "out", "client");
                return new Promise((resolve) => {
                    const tasksFile = path.join(wsPath, ".vscode", "tasks.json");
                    readFile(tasksFile, (err, data) => {
                        if (err || this.port === undefined) {
                            resolve([]);
                        } else {
                            const strData = data.toString("utf8")
                                .split("\n")
                                .map((s) => s.trim())
                                .filter((s) => !s.match(/^\/\/.*$/))
                                .join("\n");
                            const tasksJson = JSON.parse(strData);
                            const retTasks: vscode.Task[] = [];
                            for (const taskDef of tasksJson.tasks) {
                                if (taskDef.type === Task2CmdProvider.taskType && typeof taskDef.command === "string") {
                                    let task = new vscode.Task(taskDef, taskDef.label || taskDef.command, Task2CmdProvider.taskType);
                                    task.execution = new vscode.ShellExecution('node', [helperFile, `--port=${this.port}`, `--command="${taskDef.command}"`]);
                                    retTasks.push(task);
                                }
                            }
                            resolve(retTasks);
                        }
                    });
                });
            }
        }
        return [];
    }    
    
    public resolveTask(task: vscode.Task, token?: vscode.CancellationToken | undefined): vscode.ProviderResult<vscode.Task> {
        return undefined;
    }

}