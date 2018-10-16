import { Writable } from "stream";
import { WriteToBuffer } from "./write-to-buffer";

export class WriteToBufferCreator {

    public stream = new WriteToBuffer();

    public async createWriteStream(f: string) {
        return this.stream;
    }
}
