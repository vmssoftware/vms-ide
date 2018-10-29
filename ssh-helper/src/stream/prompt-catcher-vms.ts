import { LogType } from "@vorfol/common";

import { ShellParser } from "./shell-parser";
import { IPromptCatcher } from "../api";

export class PromptCatcherVms extends ShellParser implements IPromptCatcher {

    /**
     * Note: only the last prompt will be caught properly.
     * If do write several commands without catching each prompt some of these prompts may not be caught.
     */
    constructor(public prompt: string, timeout?: number, debugLog?: LogType, tag?: string) {
        super(timeout, debugLog, tag);
    }

    public _transform(chunk: any, encoding: string, callback: Function) {
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
