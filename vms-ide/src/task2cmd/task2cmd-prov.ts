import * as vscode from 'vscode';
import * as net from "net";
import * as os from "os";
import * as path from "path";
import { LogFunction, LogType } from '../common/main';

interface IParams {
    command: string;
    scope: string;
    parameter: string;
    extension: string;
}

export class Task2CmdProvider implements vscode.TaskProvider {

    public static taskType = 'task2cmd';

    public listenPath: string = "";
    public listenPort: number = 0;

    private server?: net.Server;
    private recv = "";

    public logFn: LogFunction;

    constructor(logFn?: LogFunction) {

        this.logFn = logFn || (() => {});

        if (os.platform() === 'win32') {
            this.listenPath = 'vmssoftware.socket';
            if (vscode.workspace.workspaceFolders && vscode.workspace.workspaceFolders.length) {
                this.listenPath = path.join(vscode.workspace.workspaceFolders[0].uri.fsPath, this.listenPath);
            }
            this.listenPath = "\\\\.\\pipe\\" + this.listenPath;
            this.logFn(LogType.debug, () => `Built listen path: "${this.listenPath}"`);
        }

        this.server = net.createServer((client) => {
            client.on("error", (err) => {
            });
            client.on("data", (data) => {
                this.recv += data.toString("utf8");
                Promise.resolve().then(() => {
                    const buff = Buffer.from(this.recv, "base64");
                    const jsonContent = buff.toString("utf8");
                    const params: IParams = JSON.parse(jsonContent);
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
                                    if (!ret) {
                                        this.logFn(LogType.error, () => `Command fails "${params.command}"`);
                                    } 
                                });
                            } else {
                                this.logFn(LogType.error, () => `Command returns nothing "${params.command}"`);
                            }        
                        } else {
                            this.logFn(LogType.error, () => `No such command "${params.command}"`);
                        }
                    });
                }).catch((err) => {
                    this.logFn(LogType.error, () => String(err));
                });
            });
        });

        this.server.on('error', (err) => {
            this.logFn(LogType.error, () => String(err));
            this.server = undefined;
        });

        switch(os.platform()) {
            default:
                this.server.listen(() => {
                    this.listenPort = this.server!.address().port;
                    this.logFn(LogType.debug, () => `Listen port: "${this.listenPort}"`);
                });
                break;
            case 'win32':
                this.server.listen(this.listenPath, () => {
                    this.logFn(LogType.debug, () => `Listen path: "${this.listenPath}"`);
                });
                break;
        }
    }

    public dispose() {
        if (this.server) {
            this.server.close();
            this.server = undefined;
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
        if (vscode.workspace.workspaceFolders) {
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
                                // TODO: create command line for other platforms
                                switch(os.platform()) {
                                    case 'win32':
                                        task.execution = new vscode.ShellExecution(`cmd`, [`/C`, `echo ${strParams64} >> ${this.listenPath}`]);
                                        this.logFn(LogType.debug, () => `Execute ECHO`);
                                        break;
                                    default:
                                        task.execution = new vscode.ShellExecution(`sh`, [`-c`, `"echo ${strParams64} | nc localhost ${this.listenPort}"`]);
                                        this.logFn(LogType.debug, () => `Execute NC`);
                                        break;
                                }
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