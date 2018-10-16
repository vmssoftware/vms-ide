import { Writable, WritableOptions } from "stream";

export class WriteToBuffer extends Writable {

    public chunks: Buffer[] = [];

    constructor(options?: WritableOptions) {
        // Calls the stream.Writable() constructor
        super(options);
        // ...
    }

    public _write(chunk: any, encoding: string, callback: (error?: Error | null) => void): void {
        if (Buffer.isBuffer(chunk)) {
            this.chunks.push(chunk);
        }
        callback();
    }
}
