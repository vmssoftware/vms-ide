import assert = require("assert");
import { Readable, Writable } from "stream";
import { Lock } from "../common/lock";

type LogType = (message?: any, ...optionalParams: any[]) => void;

export interface ICanCreateWriteStream {
    createWriteStream(filename: string): Promise<Writable|undefined> | Writable | undefined;
}

export interface ICanCreateReadStream {
    createReadStream(filename: string): Promise<Readable|undefined> | Readable | undefined;
}

export async function PipeFile(source: ICanCreateReadStream,
                               dest: ICanCreateWriteStream,
                               file: string,
                               destFile?: string,
                               log?: LogType) {
    let errPassed = false;
    const srcStream = await source.createReadStream(file);
    if (srcStream) {
        destFile = destFile || file;
        const dstStream = await dest.createWriteStream(destFile);
        if (dstStream) {
            const done = new Lock(true);
            srcStream.pipe(dstStream);
            srcStream.once("error", (err) => {
                if (log) {
                    log(`source error ${err}`);
                }
                setImmediate(() => dstStream.emit("error", err));
                errPassed = true;
            });
            dstStream.once("error", (err) => {
                if (log) {
                    log(`dest error ${err}`);
                }
                setImmediate(() => srcStream.emit("error", err));
                errPassed = true;
            });
            dstStream.on("unpipe", (src) => {
                if (log) {
                    log(`dest unpiped`);
                }
                assert.equal(src, srcStream, "Unpiped isn't a source");
                done.release();
            });
            await done.acquire();
            if (log) {
                log("done " + file + " with error=" + errPassed);
            }
        } else {
            if (log) {
                log(`can't create dest`);
            }
            srcStream.destroy(new Error(`can't create dest`));
        }
    } else {
        if (log) {
            log("can't create source");
        }
    }
    return !errPassed;
}
