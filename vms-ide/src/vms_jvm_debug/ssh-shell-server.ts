import { ICmdServer, ICmdClient } from "./communication";
import { GetSshHelperType } from "../ext-api/ext-api";
import { LogFunction, LogType } from "../common/main";
import { ShellSplitter } from "./shell-splitter";
import { ISshShell } from "../ssh-helper/api";
import { SimpleCmdClient } from "./simple-cmd-client";
import { EventEmitter } from "vscode";


export class SshShellServer implements ICmdServer, ICmdClient {

    private _cmdListener: ((line: string) => void ) | undefined;
    private _lineListener: ((line: string | undefined) => void ) | undefined;
    private _stderrLineListener: ((line: string | undefined) => void ) | undefined;
    private _shell: ISshShell | undefined;
    private _stderr: SimpleCmdClient;

    private logFn: LogFunction;

    constructor(logFn?: LogFunction) {
        this.logFn = logFn || (() => {});
        const emitter = new EventEmitter<string>();
        this._stderr = new SimpleCmdClient(emitter);
        emitter.event(
            (line) => {
                setImmediate((line) => {
                    if (this._stderrLineListener) {
                        this._stderrLineListener(line);
                    }
                }, line);
            }
        );
    }

    // server for CmdQueue
    public async sendCommand(line: string) {
        if (this._cmdListener) {
            this._cmdListener(line);
            return true;
        }
        // this.logFn(LogType.error, () => "COMMAND WILL BE LOST: " + String(line));
        return false;
    }

    onLineReceived(lineListener: (line: string | undefined) => void): { dispose: () => void; } {
        this._lineListener = lineListener;
        return {
            dispose: () => { this._lineListener = undefined }
        }
    }

    onStderrLineReceived(stderrLineListener: (line: string | undefined) => void): { dispose: () => void; } {
        this._stderrLineListener = stderrLineListener;
        return {
            dispose: () => { this._stderrLineListener = undefined }
        }
    }

    // client for ShellSplitter
    onCommand(cmdListener: (line: string) => void): { dispose: () => void; } {
        this._cmdListener = cmdListener;
        return {
            dispose: () => { this._cmdListener = undefined }
        }
    }

    lineReceived(line: string | undefined): boolean {
        if (this._lineListener) {
            this._lineListener(line);
            return true;
        }
        // this.logFn(LogType.error, () => "LINE WILL BE LOST: " + String(line));
        return false;
    }

    public dispose() {
        if (this._lineListener) {
            this._lineListener(undefined);
        }
        this._lineListener = undefined;
        this._cmdListener = undefined;
        const shellToDispose = this._shell;
        this._shell = undefined;
        if (shellToDispose) {
            shellToDispose.dispose();
        }
        
    }

    public async create(scope?: string) {
        if (this._shell) {
            return true;
        }
        const sshHelperType = await GetSshHelperType();
        if (sshHelperType) {
            const sshHelper = new sshHelperType(this.logFn);
            sshHelper.clearPasswordCache();
            this._shell = await sshHelper.getDefaultVmsShell(scope);
            if (this._shell) {
                this._shell.on("cleanClient", () => {
                    this.dispose();
                });
                this._shell.on("cleanChannel", () => {
                    this.dispose();
                });
                if (await this._shell.attachUser(new ShellSplitter(this), new ShellSplitter(this._stderr))) {
                    return true;
                }
                // in case of 'false' fall to dispose()
            }
        }
        this.dispose();
        return false;
    }   
}