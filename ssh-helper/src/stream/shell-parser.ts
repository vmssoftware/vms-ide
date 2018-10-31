import { Transform } from "stream";
import { LogType } from "@vorfol/common";

import { IShellParser } from "../api";

import * as nls from "vscode-nls";
nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export class ShellParser extends Transform implements IShellParser {
    
    public content = "";
    public readyEvent = Symbol("ready");
    public lastError?: Error;

    protected timer?: NodeJS.Timer;
    
    constructor(public timeout?: number, public debugLog?: LogType, public tag?: string) {
        super();
        this.on("close", () => {
            if (this.debugLog) { 
                this.debugLog(localize("debug.closed", "ShellParser{0}: closed", this.tag ? " " + this.tag : ""));
            }
            this.setReady();
        });
        this.on("error", (err) => {
            this.lastError = err;
            if (this.debugLog) { 
                this.debugLog(localize("debug.error", "ShellParser{1}: error {0}", String(err), this.tag ? " " + this.tag : ""));
            }
            this.setReady();
        });
        // this.setupTimer();
    }

    public prepare() {
        this.content = "";
        this.lastError = undefined;
    }

    /**
     * Collects content and call callback in any case
     * @param chunk buffer
     * @param encoding encoding
     * @param callback callback
     */
    public _transform(chunk: any, encoding: string, callback: Function) {
        if (this.debugLog) { 
            this.debugLog(localize("debug.chunk", "ShellParser{0}: got chunk", this.tag ? " " + this.tag : ""));
        }
        if (Buffer.isBuffer(chunk)) {
            const strData = chunk.toString("utf8");
            if (this.debugLog) { 
                this.debugLog(`${strData}`); 
            }
            this.content += strData;
        } else {
            if (this.debugLog) { 
                this.debugLog(localize("debug.nobuf", "ShellParser{0}: chunk is not Buffer", this.tag ? " " + this.tag : ""));
            }
        }
        this.setupTimer();
        callback();
    }

    protected setReady() {
        const readyContent = this.content;
        setImmediate(() => this.emit(this.readyEvent, readyContent));
        this.content = "";
        if (this.timer) {
            clearTimeout(this.timer);
            this.timer = undefined;
        }
        if (this.debugLog) {
            this.debugLog(localize("debug.ready", "ShellParser{0}: set ready", this.tag ? " " + this.tag : ""));
        }
    }

    protected setupTimer() {
        if (this.timer) {
            clearTimeout(this.timer);
            this.timer = undefined;
        }
        if (this.timeout) {
            this.timer = setTimeout(() => {
                if (this.debugLog) { 
                    this.debugLog(localize("debug.timeout", "ShellParser{0}: timeout", this.tag ? " " + this.tag : ""));
                }
                this.timer = undefined;
                this.setReady();
            }, this.timeout);
        }
    }
}
