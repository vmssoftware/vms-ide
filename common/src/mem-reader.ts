import { Readable } from "stream";
import { LogFunction, LogType } from "./log-type";

export class MemoryReadStream extends Readable {

    public pos = 0;

    constructor(public chunks?: Array<Buffer|null>, public debugLog?: LogFunction) {
        super();
        this.on("error", (err) => {
            if (this.debugLog) {
                this.debugLog(LogType.error, () => `memstream error: ${err}`);
            }
        });
    }

    public _read(size: number) {
        if (this.chunks) {
            if (this.pos < this.chunks.length) {
                if (this.chunks[this.pos] === null) {
                    process.nextTick(() => this.emit("error", new Error("Null Chunk")));
                } else {
                    this.push(this.chunks[this.pos++]);
                }
            } else {
                this.push(null);
            }
        } else {
            this.push(null);
        }
    }
}
