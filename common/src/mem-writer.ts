import { Writable } from "stream";
import { LogFunction, LogType } from "./log-type";

export class MemoryWriteStream extends Writable {

    public static badChunk: Buffer = Buffer.from([0, 0, 0, 0, 0]);

    public chunks: Buffer[] = [];

    constructor(public debugLog?: LogFunction, public emulateError?: boolean) {
        super();
        this.on("error", (err) => {
            if (this.debugLog) {
                this.debugLog(LogType.error, () => `memstream error: ${err}`);
            }
        });
    }

    public _write(chunk: any, encoding: string, callback: (err?: Error) => any) {
        if (this.emulateError) {
            callback(new Error("Writing prohibited"));
        }
        if (Buffer.isBuffer(chunk)) {
            if (chunk.equals(MemoryWriteStream.badChunk)) {
                callback(new Error("Bad chunk encountered"));
            } else {
                this.chunks.push(chunk);
                callback();
            }
        } else {
            callback(new Error("Chunk isn't Buffer"));
        }
    }
}
