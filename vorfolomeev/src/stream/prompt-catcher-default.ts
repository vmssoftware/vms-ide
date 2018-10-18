import { Writable } from "stream";
import { LogType } from "../common/log-type";
import { IPromptCatcher } from "./prompt-catcher";

export class PromptCatcherDefault implements IPromptCatcher {

    public readyEvent: symbol = Symbol("ready");
    public content = "";    // The content that caught until prompt is encountered.

    /**
     * Note: only the last prompt will be caught properly.
     * If do write several commands without catching each prompt some of these prompts may not be caught.
     */
    constructor(public prompt: string, public log?: LogType) {
    }

    public async createWriteStream() {
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
                    const content = this.content.slice(0, this.content.length - this.prompt.length);
                    setImmediate(() => writeable.emit(this.readyEvent, content));
                    this.content = "";
                }
                callback();
            },
        });
        writeable.on("error", (err) => {
            if (this.log) {
                this.log(`PromptCatcher error: ${err}`);
            }
        });
        writeable.on("close", () => {
            if (this.log) {
                this.log(`PromptCatcher closed`);
            }
        });
        writeable.on("unpipe", () => {
            if (this.log) {
                this.log(`PromptCatcher unpiped`);
            }
            setImmediate(() => writeable.emit(this.readyEvent, undefined));
        });
        return writeable;
    }
}
