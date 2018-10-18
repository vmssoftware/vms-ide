import { Client, ConnectConfig, SFTPWrapper } from "ssh2";
import stream = require("stream");
import { Lock } from "../common/lock";
import { LogType } from "../common/log-type";
import { IConnectConfigResolver } from "../config-resolve/connect-config-resolver";
import { WaitableOperation } from "../simple-ssh/waitable-operation";
import { ICanCreateReadStream, ICanCreateWriteStream } from "./can-create-stream";
import { SshClient } from "./ssh-client";

export class SftpClient extends SshClient implements ICanCreateReadStream, ICanCreateWriteStream {

    public static async makeSftp(client: Client, log?: LogType) {
        let sftp: SFTPWrapper | undefined;
        await WaitableOperation("create sftp", client, "continue", client, "error", (complete) => {
            return !client.sftp((clientError, sftpGot) => {
                if (clientError) {
                    if (log) { log(`${clientError}`); }
                    complete.release();
                } else {
                    if (log) { log(`sftp ready`); }
                    sftpGot.on("end", () => {
                        if (log) { log(`sftp ends`); }
                    });
                    sftpGot.on("error", (sftpError) => {
                        if (log) { log(`sftp error: ${sftpError}`); }
                    });
                    sftpGot.on("close", () => {
                        if (log) { log(`sftp close`); }
                    });
                    sftp = sftpGot;
                    complete.release();
                }
            });
        });
        return sftp;
    }

    public static makeReadStream(sftp: SFTPWrapper, file: string, log?: LogType): stream.Readable {
        const readStream = sftp.createReadStream(file);
        readStream.on("error", (err) => {
            if (log) { log(`read stream error ${err} ${file}`); }
        });
        readStream.on("end", () => {
            if (log) { log(`read stream end ${file}`); }
        });
        readStream.on("close", () => {
            if (log) { log(`read stream closed ${file}`); }
        });
        return readStream;
    }

    public static makeWriteStream(sftp: SFTPWrapper, file: string, log?: LogType): stream.Writable {
        const writeStream = sftp.createWriteStream(file);
        writeStream.on("error", (err) => {
            if (log) { log(`write stream error ${err} ${file}`); }
        });
        writeStream.on("finish", () => {
            if (log) { log(`write stream finished ${file}`); }
        });
        writeStream.on("close", () => {
            if (log) { log(`write stream closed ${file}`); }
        });
        return writeStream;
    }

    protected sftp?: SFTPWrapper;
    protected waitOperation = new Lock(undefined, "waitOperation");

    constructor(public config: ConnectConfig, resolver?: IConnectConfigResolver, log?: LogType) {
        super(config, resolver, log);
    }

    public dispose() {
        this.waitOperation.release();
        if (this.sftp) {
            this.sftp.end();
        }
        super.dispose();
        delete this.sftp;
    }

    public async createReadStream(file: string) {
        await this.waitOperation.acquire();
        let readStream: stream.Readable | undefined;
        await this.ensureSftp();
        if (this.sftp) {
            readStream = SftpClient.makeReadStream(this.sftp, file, this.log);
        }
        this.waitOperation.release();
        return readStream;
    }

    public async createWriteStream(file: string) {
        await this.waitOperation.acquire();
        let writeStream: stream.Writable | undefined;
        await this.ensureSftp();
        if (this.sftp) {
            writeStream = SftpClient.makeWriteStream(this.sftp, file);
        }
        this.waitOperation.release();
        return writeStream;
    }

    private async ensureSftp() {
        if (!this.sftp) {
            await this.ensureClient();
            if (this.client) {
                this.sftp = await SftpClient.makeSftp(this.client, this.log);
            }
        }
    }
}
