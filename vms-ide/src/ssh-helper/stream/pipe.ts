import { Readable, Writable } from "stream";

import { Lock, LogFunction } from "../../common/main";
import { LogType } from "../../common/main";
import { ICanCreateReadStream, ICanCreateWriteStream } from "../api";

import * as nls from "vscode-nls";
nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

/**
 * Pipe
 * @param source source
 * @param dest destination
 * @param file source file
 * @param destFile destination file
 * @param logFunc log
 * @returns true if ok
 */
export async function PipeFile(
        source: ICanCreateReadStream,
        dest: ICanCreateWriteStream,
        file: string,
        destFile?: string,
        logFunc?: LogFunction) {
    // tslint:disable-next-line:no-empty
    const logFn = logFunc || (() => {});
    let srcStream: Readable | undefined;
    let dstStream: Writable | undefined;
    let errPassed = false;
    srcStream = await source.createReadStream(file);
    if (!srcStream) {
        logFn(LogType.debug, () => localize("debug.source_fail", "can't create source {0}", file));
        return false;
    }
    srcStream.once("error", (srcError) => {
        // catch source errors
        logFn(LogType.debug, () => localize("debug.source_error", "source error {0}", srcError.message));
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
        logFn(LogType.debug, () => errorStr);
        if (srcStream) {
            srcStream.emit("error", new Error(errorStr));
        }
        return false;
    }
    const done = new Lock(true);
    dstStream.once("error", (dstError) => {
        // catch destination errors
        logFn(LogType.debug, () => localize("debug.dest_error", "dest error {0}", dstError.message));
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
            logFn(LogType.debug, () => localize("debug.dest_finished", "dest finished"));
            done.release(); // release on dest finished
        });
        await done.acquire();
        logFn(LogType.debug, () => localize("debug.done", "done {0}", !errPassed));
        return !errPassed;
    } else {
        // source disappeared suddenly (on error) while awaiting destination
        const errorStr = localize("debug.source_lost", "source disappeared");
        logFn(LogType.debug, () => errorStr);
        if (dstStream) {
            dstStream.emit("error", new Error(errorStr));
        }
        return false;
    }
}
