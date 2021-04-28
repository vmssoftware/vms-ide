import { Readable, Writable } from "stream";

import { ICanCreateReadStream, ICanCreateWriteStream, IMemoryStreamCreator } from "./../api";

import { LogFunction, LogType, MemoryReadStream, MemoryWriteStream } from "../../common/main";

export class MemoryStreamCreator implements IMemoryStreamCreator, ICanCreateReadStream, ICanCreateWriteStream {

    public readStream?: MemoryReadStream;
    public writeStream?: MemoryWriteStream;

    constructor(public chunks?: Array<Buffer | null>, public emulateError?: boolean, public logFn?: LogFunction) {
    }

    public async createReadStream(file: string): Promise<Readable> {
        return this.readStream = new MemoryReadStream(this.chunks, this.logFn);
    }

    public async createWriteStream(file: string): Promise<Writable> {
        return this.writeStream = new MemoryWriteStream(this.logFn, this.emulateError);
    }

}
