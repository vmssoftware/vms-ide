import { LogFunction, LogType } from "../../common/main";

import { IPromptCatcher } from "../api";
import { ShellParser } from "./shell-parser";

export class PromptCatcherVms extends ShellParser implements IPromptCatcher {

    /**
     * Note: only the last prompt will be caught properly.
     * If do write several commands without catching each prompt some of these prompts may not be caught.
     */
    constructor(public prompt: string, timeout?: number, logFn?: LogFunction, tag?: string) {
        super(timeout, logFn, tag);
    }

    public _transform(chunk: any, encoding: string, callback: () => any) {
        super._transform(chunk, encoding, callback);
        if (Buffer.isBuffer(chunk)) {
            if (chunk.includes(0)) {
                const promptIdx = this.content.indexOf(String.fromCharCode(0));
                if (promptIdx >= 0) {
                    this.content = this.content.slice(0, promptIdx);
                }
                this.setReady();
            }
        }
    }
}
