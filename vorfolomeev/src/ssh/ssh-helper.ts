import { Client, ClientChannel, PseudoTtyOptions, SFTPWrapper} from "ssh2";
import { InputAttributes } from "ssh2-streams";
import { Disposable } from "vscode";
import { AsyncTaskQueue } from "../common/async-task-queue";
import { ShellSection } from "../config/sections/shell";
import { UserPasswordSection } from "../config/sections/user-password";
import { IConfigHelper } from "../ext-api/config";
import { IUserPasswordHostConfig } from "../host-config";
import { PasswordChecker } from "../password-checker";
import { IShellParser } from "./shell-parser";
import { SimplyShellParser } from "./simply-shell-parser";

// tslint:disable-next-line:no-console
export let logFn = console.log;
// tslint:disable-next-line:no-empty
logFn = () => {};

type Resolve<T> = ((value?: T | PromiseLike<T> | undefined) => void);

export interface IExecutionResult {
    stdout?: string;
    stderr?: string;
}

export interface ISshSettings {
    host?: string;
    port?: number;
    username?: string;
    password?: string;
    sellEnding?: string;
}

export interface ISshHelper {
    lastError: any;
    dispose(): Promise<boolean>;
    waitComplete(): Promise<boolean>;
    executeShellCmd(cmd: string, parser?: IShellParser | undefined): Promise<IExecutionResult | undefined>;
    executeCmd(cmd: string): Promise<IExecutionResult | undefined>;
    getModifiedTime(relPath: string): Promise<Date | undefined>;
    setModifiedTime(relPath: string, date: Date): Promise<boolean>;
    updateContent(relPath: string, buffer: Buffer): Promise<boolean>;
}

export class SshHelper implements ISshHelper {

    public lastError: any;

    private client: Client | undefined;
    private channel: ClientChannel | undefined;
    private sftp: SFTPWrapper | undefined;

    private taskQueue: AsyncTaskQueue = new AsyncTaskQueue();

    constructor(private configHelper: IConfigHelper, private override?: ISshSettings) {

    }

    public dispose(): Promise<boolean> {
        return Promise.resolve().then(() => {
            this.taskQueue.stop();
            this.disconnect();
            return true;
        });
    }

    public waitComplete(): Promise<boolean> {
        return new Promise<boolean>(async (resolve) => {
            this.taskQueue.enqueue( async () => {
                this.waitCompleteExecutor(resolve);
            });
        });
    }

    public executeShellCmd(cmd: string, parser?: IShellParser): Promise<IExecutionResult|undefined> {
        return new Promise<IExecutionResult|undefined>(async (resolve) => {
            this.taskQueue.enqueue( async () => {
                this.lastError = undefined;
                const retCode = await this.ensureShell();
                if (!retCode || !this.channel ) {
                    logFn(`executeShellCmd: failed shell: ${this.lastError} of ${cmd}`);
                    resolve(undefined);
                } else {
                    const result = await this.shellExec(cmd, parser);
                    resolve(result);
                }
            });
        });
    }

    public executeCmd(cmd: string, next: boolean = false): Promise<IExecutionResult|undefined> {
        return new Promise<IExecutionResult|undefined>(async (resolve) => {
            this.taskQueue.enqueue( async () => {
                this.lastError = undefined;
                const retCode = await this.ensureConnection();
                if (!retCode || !this.client ) {
                    logFn(`executeCmd: failed shell: ${this.lastError} of ${cmd}`);
                    resolve(undefined);
                } else {
                    const result = await this.cmdExec(cmd);
                    logFn(`executeCmd: ok: ${cmd}`);
                    resolve(result);
                }
            }, next);
        });
    }

    public getModifiedTime(relPath: string): Promise<Date|undefined> {
        return new Promise<Date|undefined>(async (resolve) => {
            this.taskQueue.enqueue( async () => {
                this.lastError = undefined;
                const retCode = await this.ensureSftp();
                if (!retCode || !this.sftp ) {
                    logFn(`getFileModTime: failed sftp: ${this.lastError} of ${relPath}`);
                    resolve(undefined);
                } else {
                    const date = await this.sftpGetModTime(relPath);
                    if (!date) {
                        logFn(`getFileModTime: failed: ${this.lastError}`);
                        resolve(undefined);
                    } else {
                        logFn(`getFileModTime: ok: ${date}`);
                        resolve(date);
                    }
                }
            });
        });
    }

    public setModifiedTime(relPath: string, date: Date): Promise<boolean> {
        return new Promise<boolean>(async (resolve) => {
            this.taskQueue.enqueue( async () => {
                this.lastError = undefined;
                let retCode = await this.ensureSftp();
                if (!retCode || !this.sftp ) {
                    logFn(`getFileModTime: failed sftp: ${this.lastError} of ${relPath}`);
                    resolve(undefined);
                } else {
                    retCode = await this.sftpSetModTime(relPath, date);
                    logFn(`getFileModTime: ok: ${date}`);
                    resolve(retCode);
                }
            });
        });
    }

    public updateContent(relPath: string, buffer: Buffer): Promise<boolean> {
        return new Promise<boolean>(async (resolve) => {
            this.taskQueue.enqueue( async () => {
                this.lastError = undefined;
                let retCode = await this.ensureSftp();
                if (!retCode || !this.sftp ) {
                    logFn(`sendFile: failed sftp: ${this.lastError} of ${relPath}`);
                    resolve(false);
                } else {
                    const handle = await this.sftpOpen(relPath);
                    if (!handle || !handle.length) {
                        logFn(`sendFile: failed open: ${this.lastError} of ${relPath}`);
                        resolve(false);
                    } else {
                        retCode = await this.sftpWrite(handle, buffer);
                        if (!retCode) {
                            logFn(`sendFile: failed write: ${this.lastError} of ${relPath}`);
                            resolve(false);
                        } else {
                            retCode = await this.sftpClose(handle);
                            resolve(retCode);
                        }
                    }
                }
            });
        });
    }

    private disconnect() {
        if (this.client) {
            this.client.end();
        }
        this.client = undefined;
        this.channel = undefined;
        this.sftp = undefined;
    }

    private ensureShell(): Promise<boolean> {
        if (this.channel) {
            logFn(`ensureShell: already`);
            return Promise.resolve(true);
        }
        return this.createShell();
    }

    private createShell(): Promise<boolean> {
        return new Promise<boolean>(async (resolve) => {
            const retCode = await this.ensureConnection();
            if (!retCode || !this.client) {
                logFn(`createShell: failed connect: ${this.lastError}`);
                resolve(false);
                return;
            }

            await this.stopSftp();

            const opt: PseudoTtyOptions = {
                cols: 80,
                height: 480,
                rows: 24,
                term: "VT100",
                width: 640,
            };
            this.client.shell(opt, async (err, channelRet) => {
                if (err) {
                    this.lastError = err;
                    resolve(false);
                    logFn(`createShell: failed shell: ${this.lastError}`);
                } else {
                    // initail shell parser => must parse output and resolve promise when prompt appears
                    channelRet.once("close", () => {
                        this.channel = undefined;
                        logFn(`shell: closed`);
                        resolve(false); // does not have effect if already resolved
                    });
                    const parser = await this.buildShellParser();
                    channelRet.on("data", (data: any) => {
                        if (Buffer.isBuffer(data)) {
                            data = data.toString("utf8");
                        }
                        if (typeof data === "string") {
                            if (parser.onData(data)) {
                                logFn(`createShell: ok`);
                                this.channel = channelRet;
                                channelRet.removeAllListeners("data");
                                channelRet.stderr.removeAllListeners("data");
                                resolve(true);
                            }
                        }
                    });
                    channelRet.stderr.on("data", (data) => {
                        if (Buffer.isBuffer(data)) {
                            data = data.toString("utf8");
                        }
                        if (typeof data === "string") {
                            logFn(`ERR: ${data}`);
                            if (parser.onDataErr(data)) {
                                logFn(`createShell: failed`);
                                resolve(false);
                            }
                        }
                    });
                }
            });
        });
    }

    private stopShell(): Promise<boolean> {
        return new Promise<boolean>((resolve) => {
            if (this.channel) {
                this.channel.end(() => {
                    resolve(true);
                });
            } else {
                resolve(true);
            }
        });
    }

    private ensureSftp(): Promise<boolean> {
        if (this.sftp) {
            logFn(`ensureSftp: already`);
            return Promise.resolve(true);
        }
        return this.createSFTP();
    }

    private createSFTP(): Promise<boolean> {
        return new Promise<boolean>(async (resolve) => {
            const retCode = await this.ensureConnection();
            if (!retCode || !this.client) {
                logFn(`createSFTP: failed connect: ${this.lastError}`);
                resolve(false);
                return;
            }

            await this.stopShell();

            this.client.sftp((err, sftpRet) => {
                if (err) {
                    this.lastError = err;
                    resolve(false);
                    logFn(`createSFTP: failed sftp: ${this.lastError}`);
                } else {
                    sftpRet.on("error", (errSftp) => {
                        this.lastError = errSftp;
                        logFn(`SFTP: on error: ${this.lastError}`);
                    });
                    sftpRet.on("end", () => {
                        this.sftp = undefined;
                        logFn(`SFTP: end`);
                    });
                    this.sftp = sftpRet;
                    resolve(true);
                    logFn(`createSFTP: ok`);
                }
            });
        });
    }

    private stopSftp(): Promise<boolean> {
        return new Promise<boolean>((resolve) => {
            if (this.sftp) {
                this.sftp.end();
            }
            resolve(true);
        });
    }

    private ensureConnection(): Promise<boolean> {
        if (this.client) {
            logFn(`ensureConnection: already`);
            return Promise.resolve(true);
        } else {
            return this.connect();
        }
    }

    /**
     * Using settings from config
     */
    private connect(): Promise<boolean> {
        return new Promise<boolean>(async (resolve) => {
            if (this.configHelper) {
                this.lastError = undefined;
                try {
                    const config = this.configHelper.getConfig();
                    let   configSection = await config.get(UserPasswordSection.section);
                    if (!configSection) {
                        const userPasswordSection = new UserPasswordSection();
                        config.add(userPasswordSection);
                        configSection = await config.get(UserPasswordSection.section);
                    }
                    if (configSection instanceof UserPasswordSection) {
                        const passwordChecker = new PasswordChecker(configSection);
                        if (this.override) {
                            if (typeof this.override.password === "string") {
                                configSection.password = this.override.password;
                            }
                        }
                        if (!await passwordChecker.ensurePassword()) {
                            this.lastError = new Error("No password");
                            resolve(false);
                            return;
                        }
                        const retCode = await this.innerConnect(configSection);
                        passwordChecker.didUse(retCode);
                        resolve(retCode);
                        return;
                    } else {
                        this.lastError = new Error(`No SSH settings under "${UserPasswordSection.section}" name`);
                        resolve(false);
                    }
                } catch (err) {
                    // error while connection?
                    this.lastError = err;
                    resolve(false);
                    return;
                }
            } else {
                // no default settings
                this.lastError = new Error("No config provided");
                resolve(false);
                return;
            }
        });
    }

    private innerConnect(settings: IUserPasswordHostConfig): Promise<boolean> {
        return new Promise<boolean>((resolve) => {
            const clientTmp = new Client();
            // OnReady - only once
            clientTmp.once("ready", () => {
                this.client = clientTmp;
                // OnClose now
                this.client.on("close", (hadError) => {
                    if ( hadError ) {
                        this.lastError = new Error("Closed with error");
                    }
                    this.client = undefined;
                });
                resolve(true);
            });
            // OnError - only once
            clientTmp.once("error", (error) => {
                this.lastError = error;
                resolve(false);
                logFn(`innerConnet: error: ${this.lastError}`);
            });
            // clientTmp.connect(Object.assign({debug: logFn}, settings));
            clientTmp.connect( settings );
        });
    }

    private sftpOpenExecutor(resolve: Resolve<Buffer>, relPath: string): void {
            if (!this.sftp) {
                this.lastError = new Error("No sftp");
                logFn(`sftpOpen: no sftp`);
                resolve(Buffer.allocUnsafe(0));
                return;
            }
            if (!this.sftp.open(relPath, "w", (err, handle) => {
                if (err) {
                    this.lastError = err;
                    resolve(Buffer.allocUnsafe(0));
                    return;
                }
                resolve(handle);
                logFn(`sftpOpen: ok`);
            })) {
                // execute later on "continue" event
                logFn(`sftpOpen: wait`);
                this.sftp.once("continue", () => {
                    this.sftpOpenExecutor(resolve, relPath);
                });
            }
    }

    private sftpOpen(relPath: string): Promise<Buffer> {
        return new Promise<Buffer>((resolve) => {
            this.sftpOpenExecutor(resolve, relPath);
        });
    }

    private sftpWriteExecutor(resolve: Resolve<boolean>, handle: Buffer, buffer: Buffer): void {
        if (!this.sftp) {
            this.lastError = new Error("No sftp");
            logFn(`sftpWrite: no sftp`);
            resolve(false);
            return;
        }
        if (!this.sftp.write(handle, buffer, 0, buffer.length, 0, (err) => {
            if (err) {
                this.lastError = err;
                resolve(false);
                return;
            }
            resolve(true);
            logFn(`sftpWrite: ok`);
        })) {
            // execute later on "continue" event
            logFn(`sftpWrite: wait`);
            this.sftp.once("continue", () => {
                this.sftpWriteExecutor(resolve, handle, buffer);
            });
        }
    }

    private sftpWrite(handle: Buffer, buffer: Buffer): Promise<boolean> {
        return new Promise<boolean>((resolve) => {
            this.sftpWriteExecutor(resolve, handle, buffer);
        });
    }

    private sftpCloseExecutor(resolve: Resolve<boolean>, handle: Buffer): void {
        if (!this.sftp) {
            this.lastError = new Error("No sftp");
            logFn(`sftpClose: no sftp`);
            resolve(false);
            return;
        }
        if (!this.sftp.close(handle, (err) => {
            if (err) {
                this.lastError = err;
                resolve(false);
                logFn(`sftpClose: failed: ${this.lastError}`);
                return;
            }
            resolve(true);
            logFn(`sftpClose: ok`);
        })) {
            // execute later on "continue" event
            logFn(`sftpClose: wait`);
            this.sftp.once("continue", () => {
                this.sftpCloseExecutor(resolve, handle);
            });
        }
    }

    private sftpClose(handle: Buffer): Promise<boolean> {
        return new Promise<boolean>((resolve) => {
            this.sftpCloseExecutor(resolve, handle);
        });
    }

    private sftpGetModTimeExecutor(resolve: Resolve<Date|undefined>, relPath: string): void {
        if (!this.sftp) {
            this.lastError = new Error("No sftp");
            logFn(`sftpGetModTime: no sftp`);
            resolve(undefined);
            return;
        }
        if (!this.sftp.stat(relPath, (err, stats) => {
            if (err) {
                this.lastError = err;
                resolve(undefined);
                return;
            }
            const date = new Date(stats.mtime * 1000);  // mtime in seconds
            resolve(date);
            // logFn(`sftpGetModTime: ok ${date}`);
        })) {
            // execute later on "continue" event
            logFn(`sftpGetModTime: wait`);
            this.sftp.once("continue", () => {
                this.sftpGetModTimeExecutor(resolve, relPath);
            });
        }
    }

    private sftpGetModTime(relPath: string): Promise<Date|undefined> {
        return new Promise<Date|undefined>((resolve) => {
            this.sftpGetModTimeExecutor(resolve, relPath);
        });
    }

    /**
     * From config
     */
    private buildShellParser(): Promise<IShellParser> {
        return new Promise<IShellParser>(async (resolve) => {
            if (this.override && typeof this.override.sellEnding === "string") {
                resolve(new SimplyShellParser(this.override.sellEnding));
            } else {
                let parser = new SimplyShellParser("> ");
                let shellSection = await this.configHelper.getConfig().get(ShellSection.name);
                if (!shellSection) {
                    shellSection = new ShellSection();
                    this.configHelper.getConfig().add(shellSection);
                    shellSection = await this.configHelper.getConfig().get(ShellSection.name);
                }
                if (shellSection instanceof ShellSection) {
                    parser = new SimplyShellParser(shellSection.ending);
                }
                resolve(parser);
            }
        });
    }

    private shellExec(cmd: string, parser?: IShellParser): Promise<IExecutionResult|undefined> {
        return new Promise<IExecutionResult|undefined>((resolve) => {
            if (!this.channel) {
                resolve(undefined);
                this.lastError = new Error("No channel");
                logFn(`shellExec: failed: ${this.lastError}`);
                return;
            }
            const channel = this.channel;
            const retCode = this.channel.write(cmd + "\r\n", async (err) => {
                logFn(`write cmd: flushed`);
                if (err) {
                    this.lastError = err;
                    resolve(undefined);
                } else {
                    let result: IExecutionResult = {};
                    const shellParser: IShellParser = parser || await this.buildShellParser();
                    if (shellParser instanceof SimplyShellParser) {
                        result = shellParser;
                    }
                    // send one command and close connection
                    channel.on("close", () => {
                        resolve(result);
                        logFn(`shellExec: closed`);
                    });
                    channel.on("data", (data: any) => {
                        if (Buffer.isBuffer(data)) {
                            data = data.toString("utf8");
                        }
                        if (typeof data === "string") {
                            if (shellParser.onData(data)) {
                                logFn(`shellExec: parsed ok`);
                                channel.removeAllListeners("data");
                                channel.stderr.removeAllListeners("data");
                                resolve(result);
                            }
                        }
                    });
                    channel.stderr.on("data", (data: any) => {
                        if (Buffer.isBuffer(data)) {
                            data = data.toString("utf8");
                        }
                        if (typeof data === "string") {
                            if (shellParser.onData(data)) {
                                logFn(`shellExec: parsed stderr ok`);
                                channel.removeAllListeners("data");
                                channel.stderr.removeAllListeners("data");
                                resolve(result);
                            }
                        }
                    });
                }
            });
            logFn(`write cmd: ${retCode}`);
        });
    }

    private cmdExecutor(resolve: Resolve<IExecutionResult|undefined>, cmd: string): void {
        if (!this.client) {
            this.lastError = new Error("No client");
            logFn(`cmdExec: failed: ${this.lastError}`);
            resolve(undefined);
            return;
        }
        if (!this.client.exec(cmd, (err, channel) => {
            if (err) {
                this.lastError = err;
                logFn(`cmdExec: exec failed: ${this.lastError}`);
                resolve(undefined);
            } else {
                const parser = new SimplyShellParser("> ");
                // send one command and close connection
                channel.on("close", () => {
                    resolve(parser);
                    logFn(`cmdExec: closed`);
                });
                channel.on("data", (data: any) => {
                    if (Buffer.isBuffer(data)) {
                        data = data.toString("utf8");
                    }
                    if (typeof data === "string") {
                        if (parser.onData(data)) {
                            logFn(`cmdExec: parsed ok`);
                            resolve(parser);
                        }
                    }
                });
                channel.stderr.on("data", (data: any) => {
                    if (Buffer.isBuffer(data)) {
                        data = data.toString("utf8");
                    }
                    if (typeof data === "string") {
                        if (parser.onData(data)) {
                            logFn(`cmdExec: parsed stderr ok`);
                            resolve(parser);
                        }
                    }
                });
            }
        })) {
            logFn(`sftpGetModTime: wait`);
            this.client.once("continue", () => {
                this.cmdExecutor(resolve, cmd);
            });
        }
    }

    private cmdExec(cmd: string): Promise<IExecutionResult|undefined> {
        return new Promise<IExecutionResult|undefined>((resolve) => {
            this.cmdExecutor(resolve, cmd);
        });
    }

    private sftpSetModTimeExecutor(resolve: Resolve<boolean>, relPath: string, date: Date): void {
        if (!this.sftp) {
            this.lastError = new Error("No sftp");
            logFn(`sftpSetModTime: no sftp`);
            resolve(undefined);
            return;
        }
        // const dateNum = Math.floor(date.valueOf() / 1000);
        const attr: InputAttributes = { atime: date, mtime: date};
        if (!this.sftp.setstat(relPath, attr , (err) => {
            if (err) {
                this.lastError = err;
                resolve(false);
                return;
            }
            resolve(true);
        })) {
            // execute later on "continue" event
            logFn(`sftpSetModTime: wait`);
            this.sftp.once("continue", () => {
                this.sftpSetModTimeExecutor(resolve, relPath, date);
            });
        }
    }

    private sftpSetModTime(relPath: string, date: Date): Promise<boolean> {
        return new Promise<boolean>((resolve) => {
            this.sftpSetModTimeExecutor(resolve, relPath, date);
        });
    }

    private waitCompleteExecutor(resolve: Resolve<boolean>): void {
        if (this.taskQueue.numTasks) {
            logFn(`waitComplete: wait again`);
            this.taskQueue.enqueue(() => {
                this.waitCompleteExecutor(resolve);
            });
        } else {
            logFn(`waitComplete: queue is empty`);
            resolve(true);
        }
}
}
