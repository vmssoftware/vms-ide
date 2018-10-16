import { Client, ConnectConfig, SFTPWrapper } from "ssh2";
import { FileEntry, InputAttributes, Stats } from "ssh2-streams";
import stream = require("stream");
import { Lock } from "./../common/lock";
import { IConnectConfigResolver } from "./connect-config-resolver";
import { SimpleSsh } from "./simple-ssh";
import { WaitableOperation } from "./waitable-operation";

export type LogType = (message?: any, ...optionalParams: any[]) => void;
export let logFn: LogType | undefined;

export enum SimpleSftpEventType {
}

export class SimpleSftp extends SimpleSsh {
    public sftpCleaned: symbol = Symbol.for("sftpCleaned");
    public readStreamCleaned: symbol = Symbol.for("readStreamCleaned");
    public writeStreamCleaned: symbol = Symbol.for("writeStreamCleaned");

    protected lock: Lock = new Lock();

    protected readStream?: stream.Readable;
    protected writeStream?: stream.Writable;
    protected sftp?: SFTPWrapper;
    protected file?: string;
    protected lastSftpError?: Error;
    protected lastOperationError?: Error;

    constructor(public config: ConnectConfig, resolver?: IConnectConfigResolver) {
        super(config, resolver);
    }

    public disconnect() {
        // from top to bottom
        this.cleanReadableStream();
        this.cleanWriteableStream();
        this.cleanSftp();
        super.disconnect();
    }

    /**
     * Create readable stream
     * @param file file name
     * @returns readable stream
     */
    public async createReadStream(file: string): Promise<stream.Readable|undefined> {
        await this.lock.acquire();

        this.file = file;
        this.lastOperationError = undefined;

        // tslint:disable-next-line:no-unused-expression
        logFn && logFn(`try read from ${file} via ${this.keyString}`);
        const hasSftp = await this.connect();
        if (hasSftp && this.sftp) {
            this.readStream = this.sftp.createReadStream(file); // stream set

            this.readStream.on("error", (err) => {
                // tslint:disable-next-line:no-unused-expression
                logFn && logFn(`read stream error: ${err} in ${file}`);
                this.lastOperationError = err;
                this.cleanReadableStream();
                // if (this.readStream) {
                //     // let it "end"
                //     this.readStream.emit("end");
                // }
            });

            this.readStream.on("end", () => {
                // tslint:disable-next-line:no-unused-expression
                logFn && logFn(`read stream end for ${file}`);
                this.cleanReadableStream();
            });
        } else {
            this.lock.release();
        }
        return this.readStream;
    }

    /**
     * Create writeable stream
     * @param file file name
     * @returns writeable stream
     */
    public async createWriteStream(file: string): Promise<stream.Writable|undefined> {
        await this.lock.acquire();

        this.file = file;
        this.lastOperationError = undefined;

        // tslint:disable-next-line:no-unused-expression
        logFn && logFn(`try write to ${file} via ${this.keyString}`);
        const hasSftp = await this.connect();
        if (hasSftp && this.sftp) {
            this.writeStream = this.sftp.createWriteStream(file); // stream set

            this.writeStream.on("error", (err) => {
                // tslint:disable-next-line:no-unused-expression
                logFn && logFn(`write stream error: ${err} in ${file}`);
                this.lastOperationError = err;
                this.cleanWriteableStream();
                // if (this.writeStream) {
                //     // let it "finish"?
                //     this.writeStream.emit("finish");
                // }
            });

            this.writeStream.on("finish", () => {
                // tslint:disable-next-line:no-unused-expression
                logFn && logFn(`write stream finished for ${file}`);
                this.cleanWriteableStream();
            });

        } else {
            this.lock.release();
        }
        return this.writeStream;
    }

    /**
     * Read directory content
     * @param directory directory
     * @returns FileEntry[] array
     */
    public async readDirectory(directory: string): Promise<FileEntry[]|undefined> {
        await this.lock.acquire();
        this.lastOperationError = undefined;

        this.file = directory;
        let files: FileEntry[] | undefined;

        // tslint:disable-next-line:no-unused-expression
        logFn && logFn(`try read directory ${directory} via ${this.keyString}`);
        const hasSftp = await this.connect();
        if (hasSftp && this.sftp) {

            const opName = `read directory ${directory}`;
            await WaitableOperation(opName, this.sftp, "continue", this.emitter, this.sftpCleaned, (complete) => {
                if (!this.sftp) {
                    complete.release();
                    this.lastOperationError = this.lastSftpError;
                    return false;
                }
                return !this.sftp.readdir(directory, (err, list) => {
                    if (err) {
                        // tslint:disable-next-line:no-unused-expression
                        logFn && logFn(`${opName} failed: ${err}`);
                        this.lastOperationError = err;
                    } else {
                        files = list;
                    }
                    complete.release();
                });
            });
        }
        this.lock.release();

        return files;
    }

    /**
     * Get file attributes
     * @param filename file name
     * @returns file stats
     */
    public async getFileStats(filename: string): Promise<Stats|undefined> {
        await this.lock.acquire();
        this.lastOperationError = undefined;

        this.file = filename;
        let retStat: Stats | undefined;

        // tslint:disable-next-line:no-unused-expression
        logFn && logFn(`try get file stats ${this.file} via ${this.keyString}`);
        const hasSftp = await this.connect();
        if (hasSftp && this.sftp) {

            const opName = `get file stats ${filename}`;
            await WaitableOperation(opName, this.sftp, "continue", this.emitter, this.sftpCleaned, (complete) => {
                if (!this.sftp) {
                    complete.release();
                    this.lastOperationError = this.lastSftpError;
                    return false;
                }
                return !this.sftp.stat(filename, (err, stat) => {
                    if (err) {
                        // tslint:disable-next-line:no-unused-expression
                        logFn && logFn(`${opName} failed: ${err}`);
                        this.lastOperationError = err;
                    } else {
                        retStat = stat;
                    }
                    complete.release();
                });
            });
        }

        this.lock.release();

        return retStat;
    }

    /**
     * Set file attributes
     * @param filename file name
     * @param attr new attributes
     * @returns true if no errors
     */
    public async setFileStats(filename: string, attr: InputAttributes): Promise<boolean> {
        await this.lock.acquire();
        this.lastOperationError = undefined;

        this.file = filename;
        let retCode = false;

        // tslint:disable-next-line:no-unused-expression
        logFn && logFn(`try set file stats ${this.file} via ${this.keyString}`);
        const hasSftp = await this.connect();
        if (hasSftp && this.sftp) {

            const opName = `set file stats ${filename}`;
            await WaitableOperation(opName, this.sftp, "continue", this.emitter, this.sftpCleaned, (complete) => {
                if (!this.sftp) {
                    complete.release();
                    this.lastOperationError = this.lastSftpError;
                    return false;
                }
                return !this.sftp.setstat(filename, attr, (err) => {
                    if (err) {
                        // tslint:disable-next-line:no-unused-expression
                        logFn && logFn(`${opName} failed: ${err}`);
                        this.lastOperationError = err;
                    }
                    retCode = (err === undefined);
                    complete.release();
                });
            });
        }

        this.lock.release();

        return retCode;
    }

    /**
     * Create sftp connection
     * @returns true if ok
     */
    protected async connect(): Promise<boolean> {
        if (this.sftp) {
            // tslint:disable-next-line:no-unused-expression
            logFn && logFn(`sftp already in action ${this.keyString}`);
            return true;
        }
        const hasClient: boolean = await super.connect();
        if (hasClient && this.client) {

            const opName = `sftp connection ${this.keyString}`;
            await WaitableOperation(opName, this.client, "continue", this.emitter, this.clientCleaned, (complete) => {
                if (!this.client) {
                    complete.release();
                    this.lastSftpError = this.lastClientError;
                    return false;
                }
                return !this.client.sftp((err, sftp) => {
                    if (err) {
                        // tslint:disable-next-line:no-unused-expression
                        logFn && logFn(`${opName} failed: ${err}`);
                    } else {
                        // tslint:disable-next-line:no-unused-expression
                        logFn && logFn(`${opName} ready`);

                        this.sftp = sftp;   // set sftp

                        this.sftp.on("end", () => {
                            // tslint:disable-next-line:no-unused-expression
                            logFn && logFn(`${opName} ended`);
                            this.cleanSftp();
                        });

                        this.sftp.on("error", (errSftp) => {
                            // tslint:disable-next-line:no-unused-expression
                            logFn && logFn(`${opName} error: ${errSftp}`);
                            this.lastSftpError = err;
                        });

                        this.sftp.on("close", () => {
                            // tslint:disable-next-line:no-unused-expression
                            logFn && logFn(`${opName} closed`);
                        });
                    }
                    complete.release();
                });
            });

        } else {
            // tslint:disable-next-line:no-unused-expression
            logFn && logFn(`sftp cannot get client ${this.keyString}`);
        }
        return this.sftp !== undefined;
    }

    /**
     * Clean sftp and allow create new sftp connection
     */
    protected cleanSftp() {
        // tslint:disable-next-line:no-unused-expression
        logFn && logFn(`sftp clean ${this.keyString}`);
        if (this.sftp) {
            // tslint:disable-next-line:no-unused-expression
            logFn && logFn(`sftp still exists, end it ${this.keyString}`);
            this.sftp.end();
            this.sftp = undefined;  // reset sftp
            const lastError = this.lastSftpError;
            setImmediate(() => {
                this.emitter.emit(this.sftpCleaned, lastError);
            });
            this.lastSftpError = undefined;
        }
    }

    /**
     * Clean readable stream and allow next sftp operation
     */
    protected cleanReadableStream() {
        // tslint:disable-next-line:no-unused-expression
        logFn && logFn(`read stream clean ${this.keyString}`);
        if (this.readStream) {
            // tslint:disable-next-line:no-unused-expression
            logFn && logFn(`read stream still exists: for ${this.keyString} ${this.file}`);
            this.readStream = undefined;    // stream reset
            this.lock.release();
            const lastError = this.lastOperationError;
            setImmediate(() => {
                this.emitter.emit(this.readStreamCleaned, lastError);
            });
            this.lastOperationError = undefined;
        }
    }

    /**
     * Clean writable stream and allow next sftp operation
     */
    protected cleanWriteableStream() {
        // tslint:disable-next-line:no-unused-expression
        logFn && logFn(`write stream clean: for ${this.keyString}`);
        if (this.writeStream) {
            // tslint:disable-next-line:no-unused-expression
            logFn && logFn(`write stream still exists: for ${this.keyString} ${this.file}`);
            this.writeStream = undefined;    // stream reset
            this.lock.release();
            const lastError = this.lastOperationError;
            setImmediate(() => {
                this.emitter.emit(this.writeStreamCleaned, lastError);
            });
            this.lastOperationError = undefined;
        }
    }

}
