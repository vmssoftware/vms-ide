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
    const done = new Lock(true);
    srcStream = await source.createReadStream(file);
    if (!srcStream) {
        logFn(LogType.error, () => localize("debug.source_fail", "Could not create source {0}.", file));
        return false;
    }
    srcStream.once("error", (srcError) => {
        // catch source errors
        logFn(LogType.error, () => localize("debug.source_error", "Source error {0}.", srcError.message));
        srcStream = undefined;
        errPassed = true;
        if (dstStream) {
            dstStream.destroy();
        }
        done.release(); // release on source error
    });
    destFile = destFile || file;
    dstStream = await dest.createWriteStream(destFile);
    if (!dstStream) {
        const errorStr = localize("debug.dest_fail", "Could not create destination {0}.", destFile);
        logFn(LogType.error, () => errorStr);
        if (srcStream) {
            srcStream.destroy();
        }
        return false;
    }
    dstStream.once("error", (dstError) => {
        // catch destination errors
        logFn(LogType.error, () => localize("debug.dest_error", "Destination error {0}.", dstError.message));
        dstStream = undefined;
        errPassed = true;
        if (srcStream) {
            srcStream.destroy();
        }
        done.release(); // release on dest error
    });
    if (srcStream) {
        srcStream.pipe(dstStream);
        dstStream.once("finish", () => {
            logFn(LogType.debug, () => localize("debug.dest_finished", "Destination finished."));
            done.release(); // release on dest finished
        });
        dstStream.once("close", () => {
            logFn(LogType.debug, () => localize("debug.dest_closed", "Destination closed."));
            done.release(); // release on dest closed
        });
        await done.acquire();
        logFn(LogType.debug, () => localize("debug.done", "Done {0}.", !errPassed));
        return !errPassed;
    } else {
        // source disappeared suddenly (on error) while awaiting destination
        const errorStr = localize("debug.source_lost", "Source disappeared.");
        logFn(LogType.error, () => errorStr);
        if (dstStream) {
            dstStream.destroy();
        }
        return false;
    }
}
