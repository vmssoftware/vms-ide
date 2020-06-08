import { SFTPWrapper } from "ssh2";
import { FileEntry } from "ssh2-streams";
import stream = require("stream");

import { Lock, LogFunction } from "../../common/main";
import { LogType } from "../../common/main";
import { IUnSubscribe, Subscribe } from "../../common/main";
import { WaitableOperation } from "../../common/main";
import { ftpPathSeparator } from "../../common/main";
import { IFileEntry } from "../../common/main";

import { IConnectConfigResolver, IInputAttributes, IStats } from "../api";
import { IConnectConfig } from "../api";
import { SshClient } from "./ssh-client";
import { leadingSepRg, trailingSepRg, middleSepRg } from "../../synchronizer/common/find-files";

import * as nls from "vscode-nls";
nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export class SftpClient extends SshClient {

    protected sftp?: SFTPWrapper;
    protected waitOperation = new Lock(undefined, "waitOperation");

    private sftpClose?: IUnSubscribe;
    private sftpError?: IUnSubscribe;
    private sftpEnd?: IUnSubscribe;

    constructor(public config: IConnectConfig,
                resolver?: IConnectConfigResolver<IConnectConfig>,
                logFn?: LogFunction,
                tag?: string) {
        super(config, resolver, logFn, tag);
    }

    public async createReadStream(file: string) {
        await this.waitOperation.acquire();
        let readStream: stream.Readable | undefined;
        if (await this.ensureSftp()) {
            if (this.sftp) {
                readStream = this.sftp.createReadStream(file);
            }
        }
        this.waitOperation.release();
        if (readStream) {
            this.logFn(LogType.debug, () => `readstream created for ${file}`);
            readStream.on("error", (err) => {
                this.logFn(LogType.debug, () => localize("debug.read.err", "read stream{0} error: {1}", this.tag ? " " + this.tag : "", err.message));
            });
        } else {
            this.logFn(LogType.debug, () => `readstream failed for ${file}`);
        }
        return readStream;
    }

    public async createWriteStream(file: string) {
        await this.waitOperation.acquire();
        let writeStream: stream.Writable | undefined;
        if (await this.ensureSftp()) {
            if (this.sftp) {
                writeStream = this.sftp.createWriteStream(file);
            }
        }
        this.waitOperation.release();
        if (writeStream) {
            this.logFn(LogType.debug, () => `writestream created for ${file}`);
            writeStream.on("error", (err) => {
                this.logFn(LogType.debug, () => localize("debug.write.err", "write stream{0} error: {1}", this.tag ? " " + this.tag : "", err.message));
            });
        } else {
            this.logFn(LogType.debug, () => `writestream failed for ${file}`);
        }
        return writeStream;
    }

    public async getStat(file: string) {
        await this.waitOperation.acquire();
        let statRet: IStats | undefined;
        if (await this.ensureSftp()) {
            if (this.sftp) {
                const opName = localize("operation.getstat", "get stat {0} via sftp{1}", file, this.tag ? " " + this.tag : "");
                await WaitableOperation(opName, this.sftp, "continue", this.sftp, "error", (complete) => {
                    if (!this.sftp) {
                        return false;
                    }
                    return !this.sftp.stat(file, (err, stat) => {
                        if (err) {
                            this.logFn(LogType.debug, () => localize("debug.operation.error", "{0} error: {1}", opName, err.message));
                        } else {
                            statRet = stat;
                        }
                        complete.release();
                    });
                }, this.logFn);
            }
        }
        this.waitOperation.release();
        return statRet;
    }

    public async deleteFile(file: string) {
        let fileDeleted = false;
        await this.waitOperation.acquire();
        if (await this.ensureSftp()) {
            if (this.sftp) {
                const opName = localize("operation.delete", "delete {0} via sftp{1}", file, this.tag ? " " + this.tag : "");
                await WaitableOperation(opName, this.sftp, "continue", this.sftp, "error", (complete) => {
                    if (!this.sftp) {
                        return false;
                    }
                    return !this.sftp.unlink(file, (err) => {
                        if (err) {
                            this.logFn(LogType.debug, () => localize("debug.operation.error", "{0} error: {1}", opName, err.message));
                        } else {
                            fileDeleted = true;
                        }
                        complete.release();
                    });
                }, this.logFn);
            }
        }
        this.waitOperation.release();
        return fileDeleted;
    }

    public async setStat(file: string, stat: IInputAttributes) {
        await this.waitOperation.acquire();
        if (await this.ensureSftp()) {
            if (this.sftp) {
                const opName = localize("operation.setstat", "set stat {0} via sftp{1}", file, this.tag ? " " + this.tag : "");
                await WaitableOperation(opName, this.sftp, "continue", this.sftp, "error", (complete) => {
                    if (!this.sftp) {
                        return false;
                    }
                    return !this.sftp.setstat(file, stat, (err) => {
                        if (err) {
                            this.logFn(LogType.debug, () => localize("debug.operation.error", "{0} error: {1}", opName, err.message));
                        }
                        complete.release();
                    });
                }, this.logFn);
            }
        }
        this.waitOperation.release();
        return;
    }

    public async readDirectory(directory: string) {
        await this.waitOperation.acquire();
        let files: FileEntry[] | undefined;
        if (await this.ensureSftp() && this.sftp) {
            // set empty list => return 'undefined' only if stfp fails, but not if directory doesn't exist
            files = [];
            const opName = localize("operation.readdir", "read directory {0} via sftp{1}", directory, this.tag ? " " + this.tag : "");
            await WaitableOperation(opName, this.sftp, "continue", this.sftp, "error", (complete) => {
                if (!this.sftp) {
                    return false;
                }
                return !this.sftp.readdir(directory, (err, list) => {
                    if (err) {
                        this.logFn(LogType.debug, () => localize("debug.operation.error", "{0} error: {1}", opName, err.message));
                    } else {
                        files = list;
                    }
                    complete.release();
                });
            }, this.logFn);
        }
        this.waitOperation.release();
        if (files) {
            return files.map((file) => {
                const isDirectory = file.longname.startsWith("d");
                const entry: IFileEntry = {
                    date: new Date(file.attrs.mtime * 1000),
                    filename: file.filename,
                    isDirectory,
                    isFile: !isDirectory,
                };
                return entry;
            });
        }
        return undefined;
    }

    public async ensureDirectory(directory: string) {
        let retCode = false;
        await this.waitOperation.acquire();
        if (await this.ensureSftp()) {
            if (this.sftp) {
                directory = directory.replace(trailingSepRg, "").replace(middleSepRg, ftpPathSeparator);
                this.waitOperation.release();   // let getStat work
                const stat = await this.getStat(directory);
                await this.waitOperation.acquire();
                if (!stat && this.enabled) {
                    const opName = localize("operation.createdir", "create directory {0} via sftp{1}", directory, this.tag ? " " + this.tag : "");
                    await WaitableOperation(opName, this.sftp, "continue", this.sftp, "error", (complete) => {
                        if (!this.sftp) {
                            return false;
                        }
                        return !this.sftp.mkdir(directory, (err) => {
                            if (err) {
                                this.logFn(LogType.debug, () => localize("debug.operation.error", "{0} error: {1}", opName, err.message));
                            } else {
                                retCode = true;
                            }
                            complete.release();
                        });
                    }, this.logFn);
                }
            }
        }
        this.waitOperation.release();
        return retCode;
    }

    public dispose() {
        this.waitOperation.release();
        if (this.sftp) {
            this.sftp.end();
        }
        super.dispose();
        this.cleanSftp();
    }

    protected cleanSftp() {
        if (this.sftpClose) {
            this.sftpClose.unsubscribe();
            delete this.sftpClose;
        }
        if (this.sftpError) {
            this.sftpError.unsubscribe();
            delete this.sftpError;
        }
        if (this.sftpEnd) {
            this.sftpEnd.unsubscribe();
            delete this.sftpEnd;
        }
        delete this.sftp;
        this.emit("cleanSftp");
    }

    private async sftpConnect() {
        if (this.client) {
            const opName = localize("operation.sftp", "create sftp{0}", this.tag ? " " + this.tag : "");
            await WaitableOperation(opName, this.client, "continue", this.client, "error", (complete) => {
                if (!this.client) {
                    return false;
                }
                return !this.client.sftp((err, sftpGot) => {
                    if (err) {
                        this.logFn(LogType.debug, () => localize("debug.operation.error", "{0} error: {1}", opName, err.message));
                    } else {
                        this.logFn(LogType.debug, () => localize("debug.sftp.ready", "sftp{0} ready", this.tag ? " " + this.tag : ""));
                        this.sftp = sftpGot;
                        this.sftpEnd = Subscribe(this.sftp, "end", () => {
                            this.logFn(LogType.debug, () => localize("debug.sftp.end", "sftp{0} end", this.tag ? " " + this.tag : ""));
                            this.cleanSftp();
                        });
                        this.sftpError = Subscribe(this.sftp, "error", (sftpError) => {
                            this.logFn(LogType.error, () => localize("debug.sftp.error", "sftp{0} error: {1}", this.tag ? " " + this.tag : "", String(sftpError)));
                            this.cleanSftp();
                        });
                        this.sftpClose = Subscribe(this.sftp, "close", () => {
                            this.logFn(LogType.debug, () => localize("debug.sftp.close", "sftp{0} close", this.tag ? " " + this.tag : ""));
                            this.cleanSftp();
                        });
                    }
                    complete.release();
                });
            }, this.logFn);
        }
        return this.sftp !== undefined;
    }

    private async ensureSftp() {
        if (!this.enabled) {
            return false;
        }
        if (!this.sftp) {
            if (await this.ensureClient()) {
                if (this.client) {
                    await this.sftpConnect();
                }
            }
        }
        return this.sftp !== undefined;
    }
}
