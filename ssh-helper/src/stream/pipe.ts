import { Readable, Writable } from "stream";

import { Lock } from "@vorfol/common";
import { LogType } from "@vorfol/common";
import { ICanCreateReadStream, ICanCreateWriteStream } from "../api";

/**
 * Pipe
 * @param source source
 * @param dest destination
 * @param file source file
 * @param destFile destination file
 * @param debugLog log
 * @returns true if ok
 */
export async function PipeFile(
        source: ICanCreateReadStream,
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
        if (debugLog) {
            debugLog(`source error ${srcError}`);
        }
        srcStream = undefined;
        errPassed = true;
        if (dstStream) {
            dstStream.emit("error", srcError);
        }
    });
    destFile = destFile || file;
    dstStream = await dest.createWriteStream(destFile);
    if (!dstStream) {
        const errorStr = "can't create destination";
        if (debugLog) {
            debugLog(errorStr);
        }
        if (srcStream) {
            srcStream.emit("error", new Error(errorStr));
        }
        return false;
    }
    const done = new Lock(true);
    dstStream.once("error", (dstError) => {
        // catch destination errors
        if (debugLog) {
            debugLog(`dest error ${dstError}`);
        }
        dstStream = undefined;
        errPassed = true;
        if (srcStream) {
            srcStream.emit("error", dstError);
        }
        done.release(); // release on dest error
    });
    if (srcStream) {
        srcStream.pipe(dstStream);
        dstStream.once("finish", () => {
            if (debugLog) {
                debugLog(`dest finished`);
            }
            done.release(); // release on dest finished
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
        if (dstStream) {
            dstStream.emit("error", new Error(errorStr));
        }
        return false;
    }
}
