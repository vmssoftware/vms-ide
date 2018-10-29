import { Readable, Writable } from "stream";

import { ICanCreateReadStream, ICanCreateWriteStream, IMemoryStreamCreator } from "./../api";

import { MemoryReadStream, LogType, MemoryWriteStream } from "@vorfol/common";

export class MemoryStreamCreator implements IMemoryStreamCreator, ICanCreateReadStream, ICanCreateWriteStream {

    public readStream?: MemoryReadStream;
    public writeStream?: MemoryWriteStream;
    
    constructor(public chunks?: (Buffer | null)[], public emulateError?: boolean, public debugLog?: LogType) {
    }

    public async createReadStream(file: string): Promise<Readable> {
        return this.readStream = new MemoryReadStream(this.chunks, this.debugLog);
    }

    public async createWriteStream(file: string): Promise<Writable> {
        return this.writeStream = new MemoryWriteStream(this.debugLog, this.emulateError);
    }

}