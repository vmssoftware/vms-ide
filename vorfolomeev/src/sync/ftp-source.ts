import { FileEntry } from "ssh2-streams";
import { Readable, Writable } from "stream";
import { Lock } from "../common/lock";
import { LogType } from "../common/log-type";
import { SimpleSftp } from "../simple-ssh/simple-sftp";
import { ICanCreateWriteStream } from "../stream/can-create-stream";
import { ISource } from "./source";

export let logFn: LogType | undefined;

export class FtpSource implements ISource {

    constructor(protected sftp: SimpleSftp) {
    }

    public findFiles(include: string, exclude: string): Promise<FileEntry[]> {
        throw new Error("Method not implemented.");
    }

    public async getDate(filename: string): Promise<Date | undefined> {
        const stat = await this.sftp.getFileStats(filename);
        if ( stat ) {
            const date = new Date(stat.mtime);
            return date;
        }
        return undefined;
    }

    public setDate(filename: string, date: Date): Promise<boolean> {
        throw new Error("Method not implemented.");
    }

    public createReadStream(filename: string): Promise<Readable | undefined> {
        return this.sftp.createReadStream(filename);
    }

    public createWriteStream(filename: string): Promise<Writable | undefined> {
        return this.sftp.createWriteStream(filename);
    }

    public async pipe(filename: string, dest: ICanCreateWriteStream): Promise<boolean> {
        let errPassed = false;

        const srcStream: Readable|undefined = await this.sftp.createReadStream(filename);
        if (srcStream) {
            const dstStream: Writable|undefined = await dest.createWriteStream(filename);
            if (dstStream) {

                const doneSource = new Lock(true);
                const doneDest = new Lock(true);

                srcStream.pipe(dstStream);

                srcStream.once("error", (err) => {
                    if (!errPassed) {
                        if (logFn) { logFn(`source error ${err} ${filename}`); }
                        setImmediate(() => dstStream.emit("error", err));
                        errPassed = true;
                    }
                    doneSource.release();
                });

                dstStream.once("error", (err) => {
                    if (!errPassed) {
                        if (logFn) { logFn(`dest error ${err} ${filename}`); }
                        setImmediate(() => srcStream.emit("error", err));
                        errPassed = true;
                    }
                    doneDest.release();
                });

                srcStream.once("end", () => {
                    if (logFn) { logFn("source ended " + filename); }
                    doneSource.release();
                });

                dstStream.once("finish", () => {
                    if (logFn) { logFn("dest finished " + filename); }
                    doneDest.release();
                });

                await doneSource.acquire();
                await doneDest.acquire();

                if (logFn) { logFn("done " + filename + " with error=" + errPassed); }

            } else {
                // srcStream close?
                srcStream.emit("error", new Error("no dest"));
                if (logFn) { logFn("no dest"); }
            }
        } else {
            if (logFn) { logFn("no source"); }
        }

        return !errPassed;
    }

}
