import { Transform } from "stream";

import { LogFunction, LogType } from "../../common/main";

import { IShellParser } from "../api";

import * as nls from "vscode-nls";
nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export class ShellParser extends Transform implements IShellParser {

    public lines: string[] = [];
    public lastLine = "";
    public readyEvent = Symbol("ready");
    public lineEvent = Symbol("line");
    public lastError?: Error;
    public logFn: LogFunction;

    protected timer?: NodeJS.Timer;

    constructor(public timeout?: number, logFn?: LogFunction, public tag?: string) {
        super();
        // tslint:disable-next-line:no-empty
        this.logFn = logFn || (() => {});
        this.on("close", () => {
            this.logFn(LogType.debug, () => localize("debug.closed", "ShellParser{0}: closed", this.tag ? " " + this.tag : ""));
            this.setReady();
        });
        this.on("error", (err) => {
            this.lastError = err;
            this.logFn(LogType.debug, () => localize("debug.error", "ShellParser{1}: error {0}", err.message, this.tag ? " " + this.tag : ""));
            this.setReady();
        });
        // this.setupTimer();
    }

    public prepare() {
        this.lines = [];
        this.lastLine = "";
        this.lastError = undefined;
    }

    /**
     * Collects content and call callback in any case
     * @param chunk buffer
     * @param encoding encoding
     * @param callback callback
     */
    public _transform(chunk: any, encoding: string, callback: () => any) {
        this.logFn(LogType.debug, () => localize("debug.chunk", "ShellParser{0}: got chunk", this.tag ? " " + this.tag : ""));
        if (Buffer.isBuffer(chunk)) {
            const strData = chunk.toString("utf8");
            this.logFn(LogType.debug, () => `${strData}`);
            this.lastLine += strData;
            let tLines = this.lastLine.split(/\r?\n/);
            this.lastLine = tLines.pop() || "";
            while(tLines.length) {
                let line = tLines.shift()?.replace(/[\r\n]/g, "");
                if (line) {
                    this.lines.push(line);
                    setImmediate(() => this.emit(this.lineEvent, line));
                }
            }
        } else {
            this.logFn(LogType.debug, () => localize("debug.nobuf", "ShellParser{0}: chunk is not Buffer", this.tag ? " " + this.tag : ""));
        }
        this.setupTimer();
        callback();
    }

    protected setReady() {
        if (this.lastLine) {
            let line = this.lastLine;
            this.lines.push(line);
            setImmediate(() => this.emit(this.lineEvent, line));
            this.lastLine = "";
        }
        const readyLines = this.lines;
        setImmediate(() => this.emit(this.readyEvent, readyLines));
        this.lines = [];
        if (this.timer) {
            clearTimeout(this.timer);
            this.timer = undefined;
        }
        this.logFn(LogType.debug, () => localize("debug.ready", "ShellParser{0}: set ready", this.tag ? " " + this.tag : ""));
    }

    protected setupTimer() {
        if (this.timer) {
            clearTimeout(this.timer);
            this.timer = undefined;
        }
        if (this.timeout) {
            this.timer = setTimeout(() => {
                this.logFn(LogType.debug, () => localize("debug.timeout", "ShellParser{0}: timeout", this.tag ? " " + this.tag : ""));
                this.timer = undefined;
                this.lastError = new Error("timeout");
                this.setReady();
            }, this.timeout);
        }
    }
}
