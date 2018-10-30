import { LogType } from "@vorfol/common";

import { ShellParser } from "./shell-parser";
import { IParseWelcome } from "../api";

import * as nls from "vscode-nls";
const localize = nls.loadMessageBundle();

export class ParseWelcomeVms extends ShellParser implements IParseWelcome {

    public prompt?: string;

    protected readonly ttCmd = [
        {
            if:     Buffer.from([27, 91, 99]),
            then:   "\x1B[?62;1c",
        }, {
            if:     Buffer.from([27, 91, 50, 53, 53, 59, 50, 53, 53, 72]),
            then:   "\x1B[24;132R",
        },
    ];

    constructor(timeout?: number, debugLog?: LogType, tag?: string, width?: number) {
        super(timeout, debugLog, tag);
        if (width !== undefined && width > 80 && width < 255) {
            this.ttCmd[1].then = `\x1B[24;${width}R`;
        }
    }

    /**
     * Just write some if esc-code found, else welcome!
     */
    public _transform(chunk: any, encoding: string, callback: Function) {
        super._transform(chunk, encoding, callback);
        if (Buffer.isBuffer(chunk)) {
            // prompt just after the zero-byte
            const promptIdx = chunk.indexOf(0);
            if (promptIdx >= 0) {
                this.prompt = chunk.slice(promptIdx + 1).toString("utf8");
                if (this.debugLog) { 
                    this.debugLog(localize("debug.prompt", "vms parse: found prompt '{0}'", this.prompt)); 
                }
                this.setReady();
            }
            // speed up shell :)
            this.ttCmd.some((tt, idx) => {
                if (chunk.includes(tt.if)) {
                    if (this.debugLog) { 
                        this.debugLog(localize("debug.tt", "vms parse: found tt {0}", idx)); 
                    }
                    this.push(tt.then);
                    return true;
                }
                return false;
            });
        }
    }
}
