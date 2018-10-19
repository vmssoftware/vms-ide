import { Readable, Writable } from "stream";
import { Lock } from "../common/lock";
import { LogType } from "../common/log-type";
import { ICanCreateReadStream, ICanCreateWriteStream } from "./can-create-stream";

/**
 * Pipe
 * @param source source
 * @param dest destination
 * @param file source file
 * @param destFile destination file
 * @param debugLog log
 * @returns true if ok
 */
export async function PipeFile(source: ICanCreateReadStream,
                               dest: ICanCreateWriteStream,
                               file: string,
                               destFile?: string,
                               debugLog?: LogType) {
    let srcStream: Readable | undefined;
    let dstStream: Writable | undefined;
    let errPassed = false;
    srcStream = await source.createReadStream(file);
    if (!srcStream) {
        if (debugLog) {
            debugLog("can't create source");
        }
        return false;
    }
    srcStream.once("error", (srcError) => {
        // catch source errors
        srcStream = undefined;
        if (debugLog) {
            debugLog(`source error ${srcError}`);
        }
        setImmediate(() => {
            if (dstStream) {
                dstStream.emit("error", srcError);
            }
        });
        errPassed = true;
    });
    destFile = destFile || file;
    dstStream = await dest.createWriteStream(destFile);
    if (!dstStream) {
        const errorStr = "can't create destination";
        if (debugLog) {
            debugLog(errorStr);
        }
        setImmediate(() => {
            if (srcStream) {
                srcStream.emit("error", new Error(errorStr));
            }
        });
        return false;
    }
    dstStream.once("error", (dstError) => {
        // catch destination errors
        dstStream = undefined;
        if (debugLog) {
            debugLog(`dest error ${dstError}`);
        }
        setImmediate(() => {
            if (srcStream) {
                srcStream.emit("error", dstError);
            }
        });
        errPassed = true;
    });
    if (srcStream) {
        const done = new Lock(true);
        srcStream.pipe(dstStream);
        dstStream.once("unpipe", async (src) => {
            if (debugLog) {
                debugLog(`dest unpiped`);
            }
            done.release();
        });
        await done.acquire();
        if (debugLog) {
            debugLog(`done${errPassed ? " with error" : ""}`);
        }
        return !errPassed;
    } else {
        // source disappeared suddenly (on error) while awaiting destination
        const errorStr = `source disappeared`;
        if (debugLog) {
            debugLog(errorStr);
        }
        setImmediate(() => {
            if (dstStream) {
                dstStream.emit("error", new Error(errorStr));
            }
        });
        return false;
    }
}
