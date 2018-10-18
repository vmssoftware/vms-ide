import { Writable } from "stream";

type LogType = (message?: any, ...optionalParams: any[]) => void;

export class PromptedStreamCatcher {

    public readyEvent: symbol = Symbol("ready");
    public content = "";    // The content that caught until prompt is encountered.

    /**
     * Note: only the last prompt will be caught properly.
     * If do write several commands without catching each prompt some of these prompts may not be caught.
     */
    constructor(public prompt: string, public log?: LogType) {
    }

    public async createWriteStream(filename: string) {
        this.content = "";
        const writeable = new Writable({
            write: (chunk: any, encoding: string, callback: (error?: Error | null) => void) => {
                if (Buffer.isBuffer(chunk)) {
                    this.content += chunk.toString("utf8");
                } else if (typeof chunk === "string") {
                    this.content += chunk;
                }
                if (this.content.endsWith(this.prompt)) {
                    // emit event and clear lastString
                    const content = this.content;
                    setImmediate(() => writeable.emit(this.readyEvent, content));
                    this.content = "";
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
