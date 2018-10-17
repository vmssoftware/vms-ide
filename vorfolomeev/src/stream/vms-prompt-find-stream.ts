import { Writable } from "stream";

type LogType = (message?: any, ...optionalParams: any[]) => void;

export class VmsPromptFindStream {

    public lastString = "";

    public chunks: Buffer[] = [];

    constructor(public prompt: string, public log?: LogType) {
    }

    public async createWriteStream(filename: string) {
        this.lastString = "";
        const writeable = new Writable( {
            write: (chunk: any, encoding: string, callback: (error?: Error | null) => void) => {
                let tailStr = "";
                if (Buffer.isBuffer(chunk)) {
                    this.chunks.push(chunk);
                    if (chunk.length > this.prompt.length) {
                        this.lastString = "";
                        const tailChunk = chunk.slice(chunk.length - this.prompt.length);
                        tailStr = tailChunk.toString("utf8");
                    } else {
                        tailStr = chunk.toString("utf8");
                    }
                } else if (typeof chunk === "string") {
                    if (chunk.length > this.prompt.length) {
                        this.lastString = "";
                        tailStr = chunk.slice(chunk.length - this.prompt.length);
                    } else {
                        tailStr = chunk;
                    }
                }
                this.lastString += tailStr;
                if (this.lastString.endsWith(this.prompt)) {
                    // emit event and clear lastString
                    setImmediate(() => writeable.emit("ready"));
                    this.lastString = "";
                }
                callback();
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
