import { Readable } from "stream";
import { LogType } from "../common/log-type";

export class FakeReadStream {

    public filename?: string;

    /**
     *
     * @param chunks set one element to null to emit error on such element
     * @param log like console.log
     */
    constructor(public chunks?: Array<Buffer|string|null>, public log?: LogType) {
    }

    /**
     * Create Readable by using this.chunks
     * @param filename ignored
     */
    public async createReadStream(filename: string) {
        let pos = 0;
        this.filename = filename;
        const readable = new Readable( {
            read: (size: number) => {
                if (this.chunks) {
                    if (pos < this.chunks.length) {
                        if (this.chunks[pos] === null) {
                            process.nextTick(() => readable.emit("error", new Error("Null Chunk")));
                        } else {
                            readable.push(this.chunks[pos++]);
                        }
                    } else {
                        readable.push(null);
                    }
                } else {
                    readable.push(null);
                }
            },
        });
        readable.on("error", (err) => {
            if (this.log) {
                this.log(`${err}`);
            }
        });
        return readable;
    }
}
