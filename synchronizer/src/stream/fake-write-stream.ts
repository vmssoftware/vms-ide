import { Writable } from "stream";
import { LogType } from "../common/log-type";

export class FakeWriteStreamCreator {

    // callback error if chunk is badChunk
    public static badChunk: Buffer = Buffer.from([0, 0, 0, 0]);

    public chunks: Buffer[] = [];

    /**
     * constructor
     * @param emulateError true to callback error
     * @param log like console.log
     */
    constructor(public emulateError = false, public log?: LogType) {
    }

    /**
     * Create Writable, save chunks in this.chunks
     * @param filename ignored
     */
    public async createWriteStream(filename: string) {
        this.chunks = [];
        const writeable = new Writable( {
            // tslint:disable-next-line:ban-types
            write: (chunk: any, encoding: string, callback: Function) => {
                if (this.emulateError) {
                    callback(new Error("Writing prohibited"));
                } else {
                    if (Buffer.isBuffer(chunk)) {
                        if (chunk.equals(FakeWriteStreamCreator.badChunk)) {
                            callback(new Error("Bad chunk encountered"));
                        } else {
                            this.chunks.push(chunk);
                            callback();
                        }
                    } else {
                        callback(new Error("Chunk isn't Buffer"));
                    }
                }
            },
        });
        writeable.on("error", (err) => {
            if (this.log) {
                this.log(`${err}`);
            }
        });
        return writeable;
    }
}
