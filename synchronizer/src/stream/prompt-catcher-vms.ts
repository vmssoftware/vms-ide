
import { LogType } from "../common/log-type";
import { PromptCatcherDefault } from "./prompt-catcher-default";

export class PromptCatcherVms extends PromptCatcherDefault {

    /**
     * Wait 0-symbol as prompt start
     * @param prompt unused
     * @param log log
     */
    constructor(public prompt: string, public log?: LogType) {
        super(prompt, log);
    }

    public async createWriteStream() {
        const stream = await super.createWriteStream();
        stream._write = (chunk: any, encoding: string, callback: (error?: Error) => void) => {
                if (Buffer.isBuffer(chunk)) {
                    const promptIdx = chunk.indexOf(0);
                    if (promptIdx >= 0) {
                        // emit event and clear lastString
                        const content = this.content + chunk.slice(0, promptIdx).toString("utf8");
                        setImmediate(() => stream.emit(this.readyEvent, content));
                        this.content = "";
                    } else {
                    this.content += chunk.toString("utf8");
                    }
                } else {
                    if (this.log) {
                        this.log(`chunk must be Buffer else prompt will be missed`);
                    }
                }
                callback();
        };
        return stream;
    }
}
