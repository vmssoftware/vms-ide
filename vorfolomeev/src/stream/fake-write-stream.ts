import { Writable } from "stream";

type LogType = (message?: any, ...optionalParams: any[]) => void;

export class FakeWriteStream {

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
            write: (chunk: any, encoding: string, callback: (error?: Error | null) => void) => {
                if (this.emulateError) {
                    callback(new Error("Writing prohibited"));
                } else {
                    if (Buffer.isBuffer(chunk)) {
                        if (chunk.equals(FakeWriteStream.badChunk)) {
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
