import { Client, ClientChannel, PseudoTtyOptions, SFTPWrapper} from "ssh2";
import { InputAttributes, Stats } from "ssh2-streams";
import { AsyncTaskQueue } from "../common/async-task-queue";
import { IConfigHelper } from "../config/config";
import { ShellSection } from "../config/sections/shell";
import { UserPasswordSection } from "../config/sections/user-password";
import { IUserPasswordHostConfig } from "../host-config";
import { PasswordChecker } from "../password-checker";
import { FsPathConverter } from "./fs-path-converter";
import { IPathConverter } from "./path-converter";
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
    executeShellCmd(cmd: string, parser?: IShellParser, asap?: boolean): Promise<IExecutionResult|undefined>;
    executeCmd(cmd: string, asap?: boolean): Promise<IExecutionResult|undefined>;
    getModifiedTime(relPath: string, asap?: boolean): Promise<Date | undefined>;
    setModifiedTime(relPath: string, date: Date, asap?: boolean): Promise<boolean>;
    updateContent(relPath: string, buffer: Buffer, asap?: boolean): Promise<boolean>;
}

export class SshHelper implements ISshHelper {

    public lastError: any;

    private client: Client | undefined;
    private channel: ClientChannel | undefined;
    private sftp: SFTPWrapper | undefined;
    private pathConverter: IPathConverter;
    private taskQueue: AsyncTaskQueue = new AsyncTaskQueue();

    constructor(private configHelper: IConfigHelper,
                pathConverter?: IPathConverter,
                private override?: ISshSettings) {
        this.pathConverter = pathConverter || new FsPathConverter();
    }

    public dispose(): Promise<boolean> {
        return Promise.resolve().then(() => {
            this.taskQueue.stop();
            this.disconnect();
            return true;
        });
    }

    /**
     * Wait while queue isn't empty
     */
    public waitComplete(): Promise<boolean> {
        return new Promise<boolean>(async (resolve) => {
            this.taskQueue.enqueue( async () => {
                this.waitCompleteExecutor(resolve);
            });
        });
    }

    /**
     * Execute cmd in shell
     * @param cmd command to execute
     * @param parser custom pareser
     * @param asap as soon as possible
     */
    public executeShellCmd(cmd: string, parser?: IShellParser, asap: boolean = false)
        : Promise<IExecutionResult|undefined> {
        return new Promise<IExecutionResult|undefined>(async (resolve) => {
            this.taskQueue.enqueue( async () => {
                this.lastError = undefined;
                const retCode = await this.ensureShell();
                if (!retCode || !this.channel ) {
                    logFn(`executeShellCmd: failed shell: ${cmd} => ${this.lastError}`);
                    resolve(undefined);
                } else {
                    const result = await this.shellExec(cmd, parser);
                    logFn(`executeShellCmd: ok : ${cmd}`);
                    resolve(result);
                }
            }, asap);
        });
    }

    /**
     * Execuet command and close connection (no shell)
     * @param cmd command
     * @param asap as soon as posiible
     */
    public executeCmd(cmd: string, asap: boolean = false): Promise<IExecutionResult|undefined> {
        return new Promise<IExecutionResult|undefined>(async (resolve) => {
            this.taskQueue.enqueue( async () => {
                this.lastError = undefined;
                const retCode = await this.ensureConnection();
                if (!retCode || !this.client ) {
                    logFn(`executeCmd: failed exec: ${cmd} => ${this.lastError}`);
                    resolve(undefined);
                } else {
                    const result = await this.cmdExec(cmd);
                    logFn(`executeCmd: ok: ${cmd}`);
                    resolve(result);
                }
            }, asap);
        });
    }

    /**
     * Get file modification time
     * @param relPath relative path
     * @param asap as soon as possible
     */
    public getModifiedTime(relPath: string, asap: boolean = false): Promise<Date|undefined> {
        return new Promise<Date|undefined>(async (resolve) => {
            this.taskQueue.enqueue( async () => {
                this.lastError = undefined;
                const retCode = await this.ensureSftp();
                if (!retCode || !this.sftp ) {
                    logFn(`getFileModTime: failed sftp: ${relPath} => ${this.lastError}`);
                    resolve(undefined);
                } else {
                    const converted = this.pathConverter.from(relPath).fullPath;
                    const stats = await this.sftpStats(converted);
                    if (!stats) {
                        logFn(`getFileModTime: failed: ${relPath} => ${this.lastError}`);
                        resolve(undefined);
                    } else {
                        const date = new Date(stats.mtime);
                        logFn(`getFileModTime: ok: ${date}`);
                        resolve(date);
                    }
                }
            }, asap);
        });
    }

    /**
     * Set modification file time
     * @param relPath relative path
     * @param date date to set
     * @param asap as soon as posiible
     */
    public setModifiedTime(relPath: string, date: Date, asap: boolean = false): Promise<boolean> {
        return new Promise<boolean>(async (resolve) => {
            this.taskQueue.enqueue( async () => {
                this.lastError = undefined;
                let retCode = await this.ensureSftp();
                if (!retCode || !this.sftp ) {
                    logFn(`getFileModTime: failed sftp: ${relPath} => ${this.lastError}`);
                    resolve(undefined);
                } else {
                    const attr: InputAttributes = { atime: date, mtime: date};
                    const converted = this.pathConverter.from(relPath).fullPath;
                    retCode = await this.sftpSetStats(converted, attr);
                    logFn(`getFileModTime: ok: ${date}`);
                    resolve(retCode);
                }
            }, asap);
        });
    }

    /**
     * Update file content. Also create directory if need.
     * @param relPath relative path
     * @param buffer buffer to send
     * @param asap as soon as possible
     */
    public updateContent(relPath: string, buffer: Buffer, asap: boolean = false): Promise<boolean> {
        return new Promise<boolean>(async (resolve) => {
            this.taskQueue.enqueue( async () => {
                this.lastError = undefined;
                let retCode = await this.ensureSftp();
                if (!retCode || !this.sftp ) {
                    logFn(`sendFile: failed sftp: ${relPath} => ${this.lastError}`);
                    resolve(false);
                } else {
                    // ensure directory
                    const converted = this.pathConverter.from(relPath);
                    const dir = converted.directory;
                    const stats = await this.sftpStats(dir);
                    if (!stats) {
                        // create directory
                        const result = await this.sftpMkDir(dir);
                        if (!result) {
                            logFn(`sendFile: failed create directory for: ${relPath} => ${this.lastError}`);
                            resolve(false);
                            return;
                        }
                    }
                    const handle = await this.sftpOpen(converted.fullPath);
                    if (!handle || !handle.length) {
                        logFn(`sendFile: failed open: ${relPath} => ${this.lastError}`);
                        resolve(false);
                    } else {
                        retCode = await this.sftpWrite(handle, buffer);
                        if (!retCode) {
                            logFn(`sendFile: failed write: ${relPath} => ${this.lastError}`);
                            resolve(false);
                        } else {
                            retCode = await this.sftpClose(handle);
                            resolve(retCode);
                        }
                    }
                }
            }, asap);
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
                                // send one command and close connection
                                this.channel.on("close", () => {
                                    logFn(`shell: closed`);
                                    this.channel = undefined;
                                });
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
                                logFn(`createShell: failed => ${data}`);
                                channelRet.removeAllListeners("data");
                                channelRet.stderr.removeAllListeners("data");
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
                logFn(`Shell was created and now it is ended.`);
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
            logFn(`ensureSftp: already created`);
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
                logFn(`SFTP was created and now it is stopped.`);
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
                logFn(`shellExec: failed: ${cmd} => ${this.lastError}`);
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
            logFn(`cmdExec: failed: ${cmd} => ${this.lastError}`);
            resolve(undefined);
            return;
        }
        if (!this.client.exec(cmd, (err, channel) => {
            if (err) {
                this.lastError = err;
                logFn(`cmdExec: exec failed: ${cmd} => ${this.lastError}`);
                resolve(undefined);
            } else {
                const parser = new SimplyShellParser("> ");
                // send one command and this channel will be closed
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
            logFn(`cmdExec: wait`);
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

    private sftpSetStatsExecutor(resolve: Resolve<boolean>, relPath: string, stats: InputAttributes): void {
        if (!this.sftp) {
            this.lastError = new Error("No sftp");
            logFn(`sftpSetModTime: no sftp`);
            resolve(undefined);
            return;
        }
        if (!this.sftp.setstat(relPath, stats , (err) => {
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
                this.sftpSetStatsExecutor(resolve, relPath, stats);
            });
        }
    }

    private sftpSetStats(relPath: string, stats: InputAttributes): Promise<boolean> {
        return new Promise<boolean>((resolve) => {
            this.sftpSetStatsExecutor(resolve, relPath, stats);
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

    private sftpStats(relPath: string): Promise<Stats|undefined> {
        return new Promise<Stats|undefined>((resolve) => {
            this.sftpStatExecutor(resolve, relPath);
        });
    }

    private sftpStatExecutor(resolve: Resolve<Stats|undefined>, relPath: string): void {
        if (!this.sftp) {
            this.lastError = new Error("No sftp");
            logFn(`sftpStats: no sftp`);
            resolve(undefined);
            return;
        }
        if (!this.sftp.stat(relPath, (err, stats) => {
            if (err) {
                this.lastError = err;
                resolve(undefined);
                return;
            }
            resolve(stats);
        })) {
            // execute later on "continue" event
            logFn(`sftpStatExecutor: wait`);
            this.sftp.once("continue", () => {
                this.sftpStatExecutor(resolve, relPath);
            });
        }
    }

    private sftpMkDir(relPath: string): Promise<boolean> {
        return new Promise<boolean>((resolve) => {
            this.sftpMkDirExecutor(resolve, relPath);
        });
    }

    private sftpMkDirExecutor(resolve: Resolve<boolean>, relPath: string): void {
        if (!this.sftp) {
            this.lastError = new Error("No sftp");
            logFn(`sftpMkDir: no sftp`);
            resolve(undefined);
            return;
        }
        if (!this.sftp.mkdir(relPath, (err) => {
            if (err) {
                this.lastError = err;
                resolve(false);
            } else {
                resolve(true);
            }
        })) {
            // execute later on "continue" event
            logFn(`sftpMkDirExecutor: wait`);
            this.sftp.once("continue", () => {
                this.sftpMkDirExecutor(resolve, relPath);
            });
        }
    }
}
