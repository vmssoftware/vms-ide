import { Client, ClientChannel, SFTPWrapper} from "ssh2";
import { Disposable } from "vscode";
import { AsyncTaskQueue } from "../common/async-task-queue";
import { UserPasswordSection } from "../config/sections/user-password";
import { IConfigHelper } from "../ext-api/config";
import { SSHSettings } from "../ssh-settings";
import { SimplyShellParser } from "./simply-shell-parser";

// tslint:disable-next-line:no-console
const logFn = console.log;
// tslint:disable-next-line:no-empty
// logFn = () => {};

type Resolve<T> = ((value?: T | PromiseLike<T> | undefined) => void);

export class ExecutionResult {
    public stdout = "";
    public stderr?: string;
}

// tslint:disable-next-line:max-classes-per-file
export class SshHelper implements Disposable {

    public lastError: any;

    protected client: Client | undefined;
    protected channel: ClientChannel | undefined;
    protected sftp: SFTPWrapper | undefined;

    protected taskQueue: AsyncTaskQueue = new AsyncTaskQueue();

    constructor(private configHelper: IConfigHelper) {
    }

    public dispose() {
        this.taskQueue.stop();
        this.disconnect();
    }

    public waitComplete(): Promise<boolean> {
        return new Promise<boolean>(async (resolve) => {
            this.taskQueue.enqueue( async () => {
                this.lastError = undefined;
                resolve(true);
                return;
            });
        });
    }

    public executeShellCmd(cmd: string): Promise<ExecutionResult|undefined> {
        return new Promise<ExecutionResult|undefined>(async (resolve) => {
            this.taskQueue.enqueue( async () => {
                this.lastError = undefined;
                const retCode = await this.ensureShell();
                if (!retCode || !this.channel ) {
                    logFn(`executeShellCmd: failed shell: ${this.lastError} of ${cmd}`);
                    resolve(undefined);
                    return;
                }
                const result = await this.shellExec(cmd);
                resolve(result);
                return;
            });
        });
    }

    public executeCmd(cmd: string): Promise<ExecutionResult|undefined> {
        return new Promise<ExecutionResult|undefined>(async (resolve) => {
            this.taskQueue.enqueue( async () => {
                this.lastError = undefined;
                const retCode = await this.ensureConnection();
                if (!retCode || !this.client ) {
                    logFn(`executeCmd: failed shell: ${this.lastError} of ${cmd}`);
                    resolve(undefined);
                    return;
                }
                const result = await this.cmdExec(cmd);
                resolve(result);
                return;
            });
        });
    }

    public getModifiedDate(relPath: string): Promise<Date|undefined> {
        return new Promise<Date|undefined>(async (resolve) => {
            this.taskQueue.enqueue( async () => {
                this.lastError = undefined;
                const retCode = await this.ensureSftp();
                if (!retCode || !this.sftp ) {
                    logFn(`getFileModTime: failed sftp: ${this.lastError} of ${relPath}`);
                    resolve(undefined);
                    return;
                }
                const date = await this.sftpGetModTime(relPath);
                if (!date) {
                    logFn(`getFileModTime: failed: ${this.lastError}`);
                    resolve(undefined);
                    return;
                }
                resolve(date);
                logFn(`getFileModTime: ok: ${date}`);
                return;
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
                    return;
                }
                const handle = await this.sftpOpen(relPath);
                if (!handle || !handle.length) {
                    logFn(`sendFile: failed open: ${this.lastError} of ${relPath}`);
                    resolve(false);
                    return;
                }
                retCode = await this.sftpWrite(handle, buffer);
                if (!retCode) {
                    logFn(`sendFile: failed write: ${this.lastError} of ${relPath}`);
                    resolve(false);
                    return;
                }
                retCode = await this.sftpClose(handle);
                resolve(retCode);
            });
        });
    }

    protected disconnect() {
        if (this.client) {
            this.client.end();
        }
        this.client = undefined;
        this.channel = undefined;
        this.sftp = undefined;
    }

    protected ensureShell(): Promise<boolean> {
        if (this.channel) {
            logFn(`ensureShell: already`);
            return Promise.resolve(true);
        }
        return this.createShell();
    }

    protected createShell(): Promise<boolean> {
        return new Promise<boolean>(async (resolve) => {
            const retCode = await this.ensureConnection();
            if (!retCode || !this.client) {
                logFn(`createShell: failed connect: ${this.lastError}`);
                resolve(false);
                return;
            }

            await this.stopSftp();

            this.client.shell((err, channelRet) => {
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
                    const parser: SimplyShellParser = new SimplyShellParser("> ");
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

    protected stopShell(): Promise<boolean> {
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

    protected ensureSftp(): Promise<boolean> {
        if (this.sftp) {
            logFn(`ensureSftp: already`);
            return Promise.resolve(true);
        }
        return this.createSFTP();
    }

    protected createSFTP(): Promise<boolean> {
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

    protected stopSftp(): Promise<boolean> {
        return new Promise<boolean>((resolve) => {
            if (this.sftp) {
                this.sftp.end();
            }
            resolve(true);
        });
    }

    protected ensureConnection(): Promise<boolean> {
        if (this.client) {
            return Promise.resolve(true);
        } else {
            return this.connect();
        }
    }

    /**
     * Using settings from config
     */
    protected connect(): Promise<boolean> {
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
                        const settings = new SSHSettings(configSection);
                        if (!await settings.ensurePassword()) {
                            this.lastError = new Error("No password");
                            resolve(false);
                            return;
                        }
                        const retCode = await this.innerConnect(settings);
                        settings.didUse(retCode);
                        resolve(retCode);
                        return;
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

    protected innerConnect(settings: SSHSettings): Promise<boolean> {
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
            });
            // clientTmp.connect(Object.assign({debug: console.log}, _settings));
            clientTmp.connect( settings );
        });
    }

    protected sftpOpenExecutor(resolve: Resolve<Buffer>, relPath: string): void {
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

    protected sftpOpen(relPath: string): Promise<Buffer> {
        return new Promise<Buffer>((resolve) => {
            this.sftpOpenExecutor(resolve, relPath);
        });
    }

    protected sftpWriteExecutor(resolve: Resolve<boolean>, handle: Buffer, buffer: Buffer): void {
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

    protected sftpWrite(handle: Buffer, buffer: Buffer): Promise<boolean> {
        return new Promise<boolean>((resolve) => {
            this.sftpWriteExecutor(resolve, handle, buffer);
        });
    }

    protected sftpCloseExecutor(resolve: Resolve<boolean>, handle: Buffer): void {
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

    protected sftpClose(handle: Buffer): Promise<boolean> {
        return new Promise<boolean>((resolve) => {
            this.sftpCloseExecutor(resolve, handle);
        });
    }

    protected sftpGetModTimeExecutor(resolve: Resolve<Date|undefined>, relPath: string): void {
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
            logFn(`sftpGetModTime: ok ${date}`);
        })) {
            // execute later on "continue" event
            logFn(`sftpGetModTime: wait`);
            this.sftp.once("continue", () => {
                this.sftpGetModTimeExecutor(resolve, relPath);
            });
        }
    }

    protected sftpGetModTime(relPath: string): Promise<Date|undefined> {
        return new Promise<Date|undefined>((resolve) => {
            this.sftpGetModTimeExecutor(resolve, relPath);
        });
    }

    protected shellExec(cmd: string): Promise<ExecutionResult|undefined> {
        return new Promise<ExecutionResult|undefined>((resolve) => {
            if (!this.channel) {
                resolve(undefined);
                this.lastError = new Error("No channel");
                logFn(`shellExec: failed: ${this.lastError}`);
                return;
            }
            const channel = this.channel;
            const retCode = this.channel.write(cmd + "\r\n", (err) => {
                logFn(`write cmd: flushed`);
                if (err) {
                    this.lastError = err;
                    resolve(undefined);
                } else {
                    const parser = new SimplyShellParser("> ");
                    // send one command and close connection
                    channel.on("close", () => {
                        resolve(parser);
                        logFn(`shellExec: closed`);
                    });
                    channel.on("data", (data: any) => {
                        if (Buffer.isBuffer(data)) {
                            data = data.toString("utf8");
                        }
                        if (typeof data === "string") {
                            if (parser.onData(data)) {
                                logFn(`shellExec: parsed ok`);
                                channel.removeAllListeners("data");
                                channel.stderr.removeAllListeners("data");
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
                                logFn(`shellExec: parsed stderr ok`);
                                channel.removeAllListeners("data");
                                channel.stderr.removeAllListeners("data");
                                resolve(parser);
                            }
                        }
                    });
                }
            });
            logFn(`write cmd: ${retCode}`);
        });
    }

    protected cmdExecutor(resolve: Resolve<ExecutionResult|undefined>, cmd: string): void {
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
                            // channel.removeAllListeners("data");
                            // channel.stderr.removeAllListeners("data");
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
                            // channel.removeAllListeners("data");
                            // channel.stderr.removeAllListeners("data");
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

    protected cmdExec(cmd: string): Promise<ExecutionResult|undefined> {
        return new Promise<ExecutionResult|undefined>((resolve) => {
            this.cmdExecutor(resolve, cmd);
        });
    }
}
