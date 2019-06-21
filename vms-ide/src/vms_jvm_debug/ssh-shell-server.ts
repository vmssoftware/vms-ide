import { ICmdServer, ICmdClient } from "./communication";
import { GetSshHelperType } from "../ext-api/ext-api";
import { LogFunction } from "../common/main";
import { ShellSplitter } from "./shell-splitter";
import { ISshShell } from "../ssh-helper/api";

export class SshShellServer implements ICmdServer, ICmdClient {

    private _cmdListener: ((line: string) => void) | undefined;
    private _lineListener: ((line: string | undefined) => void) | undefined;
    private _shell: ISshShell | undefined;

    constructor(private logFn?: LogFunction) {
        this.logFn = logFn || (() => {});    
    }

    // server for CmdQueue
    sendCommand(line: string): boolean {
        if (this._cmdListener) {
            this._cmdListener(line);
            return true;
        }
        return false;
    }

    onLineReceived(lineListener: (line: string | undefined) => void): { dispose: () => void; } {
        this._lineListener = lineListener;
        return {
            dispose: () => { this._lineListener = undefined }
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
            this._shell = await sshHelper.getDefaultVmsShell(scope);
            if (this._shell) {
                this._shell.on("cleanClient", () => {
                    this.dispose();
                });
                this._shell.on("cleanChannel", () => {
                    this.dispose();
                });		
                if (await this._shell.attachUser(new ShellSplitter(this))) {
                    return true;
                }
            }
        }
        return false;
    }   
}