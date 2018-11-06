import { LogFunction, LogType, printLike } from "@vorfol/common";

import { ShellParser } from "./shell-parser";
import { IParseWelcome } from "../api";

import * as nls from "vscode-nls";
nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export class ParseWelcomeVms extends ShellParser implements IParseWelcome {

    public prompt?: string;
    public get width() {
        return this._width;
    }
    public set width(w: number | undefined) {
        if (w !== undefined &&
            w >= 16 && w <= 255) {
            this._width = w;
            this.ttCmd[1].then = this._setWidth(this._width);
        }
    }

    protected readonly ttCmd = [
        {
            if:     Buffer.from([27, 91, 99]),
            then:   "\x1B[?62;1c",
        }, 
        {
            if:     Buffer.from([27, 91, 50, 53, 53, 59, 50, 53, 53, 72]),
            then:   "\x1B[24;132R",
        },
    ];

    private _width = 132;
    private _setWidth = printLike`\x1B[24;${this._width}R`;

    constructor(timeout?: number, logFn?: LogFunction, tag?: string, width?: number) {
        super(timeout, logFn, tag);
        this.width = width;
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
                if (this.logFn) { 
                    this.logFn(LogType.debug, () => localize("debug.prompt", "vms parse: found prompt '{0}'", this.prompt)); 
                }
                this.setReady();
            }
            // speed up shell :)
            this.ttCmd.some((tt, idx) => {
                if (chunk.includes(tt.if)) {
                    if (this.logFn) { 
                        this.logFn(LogType.debug, () => localize("debug.tt", "vms parse: found tt {0}", idx)); 
                    }
                    this.push(tt.then);
                    return true;
                }
                return false;
            });
        }
    }
}
