import { Transform } from "stream";
import { LogType } from "@vorfol/common";

import { IShellParser } from "../api";

export class ShellParser extends Transform implements IShellParser {
    
    public content = "";
    public readyEvent = Symbol("ready");
    public lastError?: Error;

    protected timer?: NodeJS.Timer;
    
    constructor(public timeout?: number, public debugLog?: LogType, public tag?: string) {
        super();
        this.on("close", () => {
            if (this.debugLog) { 
                this.debugLog(`ShellParser${this.tag ? " " + this.tag : ""}: closed`); 
            }
            this.setReady();
        });
        this.on("error", (err) => {
            this.lastError = err;
            if (this.debugLog) { 
                this.debugLog(`ShellParser${this.tag ? " " + this.tag : ""}: error ${err}`); 
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
            this.debugLog(`ShellParser${this.tag ? " " + this.tag : ""}: got chunk`); 
        }
        if (Buffer.isBuffer(chunk)) {
            const strData = chunk.toString("utf8");
            if (this.debugLog) { 
                this.debugLog(`${strData}`); 
            }
            this.content += strData;
        } else {
            if (this.debugLog) { 
                this.debugLog(`ShellParser${this.tag ? " " + this.tag : ""}: chunk is not Buffer`); 
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
            this.debugLog(`ShellParser${this.tag ? " " + this.tag : ""}: set ready`);
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
                    this.debugLog(`ShellParser${this.tag ? " " + this.tag : ""}: timeout`); 
                }
                this.timer = undefined;
                this.setReady();
            }, this.timeout);
        }
    }
}
