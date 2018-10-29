import { Transform } from "stream";
import { LogType } from "@vorfol/common";

export class ShellParser extends Transform {

    public lastError?: Error;

    public readyEvent = Symbol("ready");

    protected timer?: NodeJS.Timer;

	/**
	 * Create transform stream
	 * @param timeout timeout for input
	 * @param debugLog like console.log
	 * @param tag just tag to log out
	 */
	constructor(public dataCb?: (data: string) => void,
				public closeCb?: (code?: any, signal?: any) => void,
				public errorCb?: (err) => void,
				public debugLog?: LogType, public tag?: string) {
        super();
        this.on("close", () => {
			setImmediate(() => {
				if (closeCb) {
					closeCb();
				}
			});
            if (this.debugLog) {
                this.debugLog(`ShellParser${this.tag ? " " + this.tag : ""}: closed`);
            }
            this.setReady();
        });
        this.on("error", (err) => {
			setImmediate(() => {
				if (errorCb) {
					errorCb(err);
				}
			});
            this.lastError = err;
            if (this.debugLog) {
                this.debugLog(`ShellParser${this.tag ? " " + this.tag : ""}: error ${err}`);
            }
            this.setReady();
        });
    }

    public prepare() {
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
            setImmediate(() => {
                if (this.dataCb) {
                    this.dataCb(strData);
                }
            });
        } else {
            if (this.debugLog) {
                this.debugLog(`ShellParser${this.tag ? " " + this.tag : ""}: chunk is not Buffer`);
            }
        }
        callback();
    }

    protected setReady() {
        setImmediate(() => this.emit(this.readyEvent));
        if (this.debugLog) {
            this.debugLog(`ShellParser${this.tag ? " " + this.tag : ""}: set ready`);
        }
    }
}
