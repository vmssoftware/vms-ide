import { Client, ConnectConfig, SFTPWrapper } from "ssh2";
import stream = require("stream");
import { Lock } from "../common/lock";
import { LogType } from "../common/log-type";
import { IUnSubscribe, Subscribe } from "../common/subscribe";
import { IConnectConfigResolver } from "../config-resolve/connect-config-resolver";
import { WaitableOperation } from "../simple-ssh/waitable-operation";
import { ICanCreateReadStream, ICanCreateWriteStream } from "./can-create-stream";
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
        await this.ensureSftp();
        if (this.sftp) {
            readStream = this.sftp.createReadStream(file);
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
        await this.ensureSftp();
        if (this.sftp) {
            writeStream = this.sftp.createWriteStream(file);
        }
        this.waitOperation.release();
        return writeStream;
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
            await WaitableOperation(`create sftp${this.tag ? " " + this.tag : ""}`,
                                    this.client, "continue", this.client, "error", (complete) => {
                if (!this.client) {
                    return false;
                }
                return !this.client.sftp((err, sftpGot) => {
                    if (err) {
                        if (this.debugLog) {
                            this.debugLog(`${err}`);
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
        if (!this.sftp) {
            await this.ensureClient();
            if (this.client) {
                await this.sftpConnect();
            }
        }
    }
}
