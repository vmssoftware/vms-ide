import { SFTPWrapper } from "ssh2";
import { InputAttributes, Stats } from "ssh2-streams";
import { ISshConnectionSettings, SshConnection } from "./connection";
import { IPathConverter } from "./path-converter";
import { QueuedConnection } from "./queued-connection";

// tslint:disable-next-line:no-console
export let logFn = console.log;
// tslint:disable-next-line:no-empty
logFn = () => {};

type Resolve<T> = ((value?: T | PromiseLike<T> | undefined) => void);

export interface ISftpSettings extends ISshConnectionSettings {
    pathConverter?: IPathConverter;
}

export class SftpConnection extends QueuedConnection {

    public get isConnected(): boolean {
        return this.sftp !== undefined;
    }

    private sftp: SFTPWrapper | undefined;
    private pathConverter: IPathConverter | undefined;

    constructor(settings: ISftpSettings) {
        super(settings);
        this.pathConverter = settings.pathConverter;
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
                    let converted = relPath;
                    if (this.pathConverter) {
                        converted = this.pathConverter.from(relPath).fullPath;
                    }
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
                    let converted = relPath;
                    if (this.pathConverter) {
                        converted = this.pathConverter.from(relPath).fullPath;
                    }
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
                    let converted = relPath;
                    if (this.pathConverter) {
                        const converter = this.pathConverter.from(relPath);
                        const dir = converter.directory;
                        converted = converter.fullPath;
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
                    }
                    const handle = await this.sftpOpen(converted);
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

    protected ensureSftp(): Promise<boolean> {
        if (this.sftp) {
            logFn(`ensureSftp: already exists`);
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
            this.client.sftp((err, sftpRet) => {
                if (err) {
                    this.lastError = err;
                    resolve(false);
                    logFn(`createSFTP: failed sftp: ${this.lastError}`);
                } else {
                    sftpRet.on("error", (errSftp) => {
                        this.sftp = undefined;
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
            } else {
                resolve(handle);
                logFn(`sftpOpen: ok`);
            }
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

    protected sftpSetStatsExecutor(resolve: Resolve<boolean>, relPath: string, stats: InputAttributes): void {
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

    protected sftpSetStats(relPath: string, stats: InputAttributes): Promise<boolean> {
        return new Promise<boolean>((resolve) => {
            this.sftpSetStatsExecutor(resolve, relPath, stats);
        });
    }

    protected sftpStats(relPath: string): Promise<Stats|undefined> {
        return new Promise<Stats|undefined>((resolve) => {
            this.sftpStatExecutor(resolve, relPath);
        });
    }

    protected sftpStatExecutor(resolve: Resolve<Stats|undefined>, relPath: string): void {
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

    protected sftpMkDir(relPath: string): Promise<boolean> {
        return new Promise<boolean>((resolve) => {
            this.sftpMkDirExecutor(resolve, relPath);
        });
    }

    protected sftpMkDirExecutor(resolve: Resolve<boolean>, relPath: string): void {
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
