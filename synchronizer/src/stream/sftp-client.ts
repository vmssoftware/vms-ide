import stream = require("stream");

import { ConnectConfig, SFTPWrapper } from "ssh2";
import { FileEntry, InputAttributes, Stats } from "ssh2-streams";
import { ftpPathSeparator } from "../common/find-files";
import { Lock } from "../common/lock";
import { LogType } from "../common/log-type";
import { IUnSubscribe, Subscribe } from "../common/subscribe";
import { WaitableOperation } from "../common/waitable-operation";
import { IConnectConfigResolver } from "../config-resolve/connect-config-resolver";
import { ICanCreateReadStream, ICanCreateWriteStream } from "./can-create-stream";
import { IFileEntry } from "./read-directory";
import { SshClient } from "./ssh-client";

export class SftpClient extends SshClient implements ICanCreateReadStream, ICanCreateWriteStream {

    public lastSftpError?: Error;

    protected sftp?: SFTPWrapper;
    protected waitOperation = new Lock(undefined, "waitOperation");

    private sftpClose?: IUnSubscribe;
    private sftpError?: IUnSubscribe;
    private sftpEnd?: IUnSubscribe;

    constructor(public config: ConnectConfig,
                resolver?: IConnectConfigResolver,
                debugLog?: LogType,
                tag?: string) {
        super(config, resolver, debugLog, tag);
    }

    /**
     * Note: no event listeners attached => define at least "error" in this microtick
     * @param file file
     */
    public async createReadStream(file: string) {
        await this.waitOperation.acquire();
        let readStream: stream.Readable | undefined;
        if (await this.ensureSftp()) {
            if (this.sftp) {
                readStream = this.sftp.createReadStream(file);
            }
        }
        this.waitOperation.release();
        return readStream;
    }

    /**
     * Note: no event listeners attached => define at least "error" in this microtick
     * @param file file
     */
    public async createWriteStream(file: string) {
        await this.waitOperation.acquire();
        let writeStream: stream.Writable | undefined;
        if (await this.ensureSftp()) {
            if (this.sftp) {
                writeStream = this.sftp.createWriteStream(file);
            }
        }
        this.waitOperation.release();
        return writeStream;
    }

    public async getStat(file: string) {
        await this.waitOperation.acquire();
        let statRet: Stats | undefined;
        if (await this.ensureSftp()) {
            if (this.sftp) {
                const opName = `get stat ${file} via sftp${this.tag ? " " + this.tag : ""}`;
                await WaitableOperation(opName, this.sftp, "continue", this.sftp, "error", (complete) => {
                    if (!this.sftp) {
                        return false;
                    }
                    return !this.sftp.stat(file, (err, stat) => {
                        if (err) {
                            if (this.debugLog) {
                                this.debugLog(`${opName} error: ${err}`);
                            }
                        } else {
                            statRet = stat;
                        }
                        complete.release();
                    });
                }, this.debugLog);
            }
        }
        this.waitOperation.release();
        return statRet;
    }

    public async setStat(file: string, stat: InputAttributes) {
        await this.waitOperation.acquire();
        if (await this.ensureSftp()) {
            if (this.sftp) {
                const opName = `set stat ${file} via sftp${this.tag ? " " + this.tag : ""}`;
                await WaitableOperation(opName, this.sftp, "continue", this.sftp, "error", (complete) => {
                    if (!this.sftp) {
                        return false;
                    }
                    return !this.sftp.setstat(file, stat, (err) => {
                        if (err) {
                            if (this.debugLog) {
                                this.debugLog(`${opName} error: ${err}`);
                            }
                        }
                        complete.release();
                    });
                }, this.debugLog);
            }
        }
        this.waitOperation.release();
        return;
    }

    public async readDirectory(directory: string) {
        await this.waitOperation.acquire();
        let files: FileEntry[] | undefined;
        if (await this.ensureSftp()) {
            if (this.sftp) {
                const opName = `read directory ${directory} via sftp${this.tag ? " " + this.tag : ""}`;
                await WaitableOperation(opName, this.sftp, "continue", this.sftp, "error", (complete) => {
                    if (!this.sftp) {
                        return false;
                    }
                    return !this.sftp.readdir(directory, (err, list) => {
                        if (err) {
                            if (this.debugLog) {
                                this.debugLog(`${opName} error: ${err}`);
                            }
                        } else {
                            files = list;
                        }
                        complete.release();
                    });
                }, this.debugLog);
            }
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
                const leading = /^[/\\]+/g;
                const middle = /[/\\]+/g;
                const trailing = /[/\\]+$/g;
                directory = directory.replace(leading, "").replace(trailing, "").replace(middle, ftpPathSeparator);
                this.waitOperation.release();   // let getStat work
                const stat = await this.getStat(directory);
                await this.waitOperation.acquire();
                if (!stat && this.enabled) {
                    const opName = `create directory ${directory} via sftp${this.tag ? " " + this.tag : ""}`;
                    await WaitableOperation(opName, this.sftp, "continue", this.sftp, "error", (complete) => {
                        if (!this.sftp) {
                            return false;
                        }
                        return !this.sftp.mkdir(directory, (err) => {
                            if (err) {
                                if (this.debugLog) {
                                    this.debugLog(`${opName} error: ${err}`);
                                }
                            } else {
                                retCode = true;
                            }
                            complete.release();
                        });
                    }, this.debugLog);
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
    }

    private async sftpConnect() {
        if (this.client) {
            const opName = `create sftp${this.tag ? " " + this.tag : ""}`;
            await WaitableOperation(opName, this.client, "continue", this.client, "error", (complete) => {
                if (!this.client) {
                    return false;
                }
                return !this.client.sftp((err, sftpGot) => {
                    if (err) {
                        if (this.debugLog) {
                            this.debugLog(`${opName} error: ${err}`);
                        }
                    } else {
                        if (this.debugLog) {
                            this.debugLog(`sftp${this.tag ? " " + this.tag : ""} ready`);
                        }
                        this.sftp = sftpGot;
                        this.sftpEnd = Subscribe(this.sftp, "end", () => {
                            if (this.debugLog) {
                                this.debugLog(`sftp${this.tag ? " " + this.tag : ""} end`);
                            }
                            this.cleanSftp();
                        });
                        this.sftpError = Subscribe(this.sftp, "error", (sftpError) => {
                            if (this.debugLog) {
                                this.debugLog(`sftp${this.tag ? " " + this.tag : ""} error: ${sftpError}`);
                            }
                            this.lastSftpError = sftpError;
                            this.cleanSftp();
                        });
                        this.sftpClose = Subscribe(this.sftp, "close", () => {
                            if (this.debugLog) {
                                this.debugLog(`sftp${this.tag ? " " + this.tag : ""} close`);
                            }
                            this.cleanSftp();
                        });
                    }
                    complete.release();
                });
            }, this.debugLog);
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
