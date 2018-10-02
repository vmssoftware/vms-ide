import { Client, ClientChannel, SFTPWrapper} from "ssh2";
import { Disposable } from "vscode";
import { AsyncTaskQueue } from "../common/async-task-queue";
import { UserPasswordSection } from "../config/sections/user-password";
import { IConfigHelper } from "../ext-api/config";
import { SSHSettings } from "../ssh-settings";

// tslint:disable-next-line:no-console
const logFn = console.log;
// tslint:disable-next-line:no-empty
// logFn = () => {};

export class SshHelper implements Disposable {

    public lastError: any;

    protected client: Client | undefined;
    protected channel: ClientChannel | undefined;
    protected sftp: SFTPWrapper | undefined;

    protected taskQueue: AsyncTaskQueue = new AsyncTaskQueue();

    constructor(private configHelper: IConfigHelper) {
    }

    public dispose() {
        this.disconnect();
    }

    public getFileModTime(relPath: string): Promise<Date|undefined> {
        return new Promise<Date|undefined>(async (resolve) => {
            this.taskQueue.enqueue( async () => {
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

    public sendFile(relPath: string, buffer: Buffer): Promise<boolean> {
        return new Promise<boolean>(async (resolve) => {
            this.taskQueue.enqueue( async () => {
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
            this.client.sftp((err, sftpRet) => {
                if (err) {
                    this.lastError = err;
                    resolve(false);
                    logFn(`createSFTP: failed sftp: ${this.lastError}`);
                } else {
                    sftpRet.on("error", (errSftp) => {
                        this.lastError = errSftp;
                        logFn(`createSFTP: on error: ${this.lastError}`);
                    });
                    sftpRet.on("continue", () => {
                        // continue sftp operations
                        logFn(`createSFTP: on continue`);
                        // get waiting operation and do it
                    });
                    this.sftp = sftpRet;
                    resolve(true);
                    logFn(`createSFTP: ok`);
                }
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

            this.lastError = undefined;

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

    protected sftpOpen(relPath: string): Promise<Buffer> {
        return new Promise<Buffer>((resolve) => {
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
                // add parameters and resolve object to array in "continue" event
                logFn(`sftpOpen: wait`);
            }
        });
    }

    protected sftpWrite(handle: Buffer, buffer: Buffer): Promise<boolean> {
        return new Promise<boolean>((resolve) => {
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
                // add parameters and resolve object to array in "continue" event
                logFn(`sftpWrite: wait`);
            }
        });
    }

    protected sftpClose(handle: Buffer): Promise<boolean> {
        return new Promise<boolean>((resolve) => {
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
                // add parameters and resolve object to array in "continue" event
                logFn(`sftpClose: wait`);
            }
        });
    }

    protected sftpGetModTime(relPath: string): Promise<Date|undefined> {
        return new Promise<Date|undefined>((resolve) => {
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
                // add parameters and resolve object to array in "continue" event
                logFn(`sftpGetModTime: wait`);
            }
        });
    }
}
