import { Readable, Writable } from "stream";

import { Lock } from "@vorfol/common";
import { LogType } from "@vorfol/common";
import { ICanCreateReadStream, ICanCreateWriteStream } from "../api";

import * as nls from "vscode-nls";
const localize = nls.loadMessageBundle();

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
            debugLog(localize("debug.source_fail", "can't create source {0}", file));
        }
        return false;
    }
    srcStream.once("error", (srcError) => {
        // catch source errors
        if (debugLog) {
            debugLog(localize("debug.source_error", "source error {0}", srcError));
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
        const errorStr = localize("debug.dest_fail", "can't create destination {0}", destFile);
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
            debugLog(localize("debug.dest_error", "dest error {0}", dstError));
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
                debugLog(localize("debug.dest_finished", "dest finished"));
            }
            done.release(); // release on dest finished
        });
        await done.acquire();
        if (debugLog) {
            debugLog(localize("debug.done", "done {0}", !errPassed));
        }
        return !errPassed;
    } else {
        // source disappeared suddenly (on error) while awaiting destination
        const errorStr = localize("debug.source_lost", "source disappeared");
        if (debugLog) {
            debugLog(errorStr);
        }
        if (dstStream) {
            dstStream.emit("error", new Error(errorStr));
        }
        return false;
    }
}
