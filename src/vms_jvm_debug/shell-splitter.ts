import { Transform } from "stream";
import { EventEmitter } from "events";
import { ICmdClient } from "./communication";
import { LogFunction, LogType } from "../common/main";

//const _rgxNL = /(?:\r)?\n/g;
const _rgxNL = /\n/g;

export class ShellSplitter extends Transform {

    public _lastError: string | undefined;

	constructor(private _client: ICmdClient, private _timeout = 100, private logFn?: LogFunction) {
		super();

        this.on('close', () => {
            this._client.lineReceived(undefined);
        });

        this.on('error', (err) => {
            this._lastError = String(err);
            this._client.lineReceived(undefined);
        });

        this._client.onCommand((line: string) => {
            this.push(line.trim() + '\r');
        })

        this._client.onData((data: string) => {
            this.push(data);
        })
    }

    private _buffer = "";
    public _transform(chunk: any, encoding: string, callback: Function) {
        let content = "";
        if (Buffer.isBuffer(chunk)) {
            content = chunk.toString("utf8");
        } else if (typeof chunk === "string") {
            content = chunk;
        }
        if (this.logFn) {
            this.logFn(LogType.debug, () => '===' + content);
        }
        this._buffer += content;
        let matchNL = _rgxNL.exec(this._buffer);
        let start = 0;
        while (matchNL) {
            this.sendLine(this._buffer.slice(start, _rgxNL.lastIndex)); //  `- matchNL[0].length` is removed, let client know about new line
            start = _rgxNL.lastIndex;
            matchNL = _rgxNL.exec(this._buffer);
        }
        this._buffer = this._buffer.slice(start);
        // for a prompt we will never receive new line, so wait a timeout and send buffer to the client
        setTimeout(() => {            
            if (this._buffer) {
                this.sendLine(this._buffer);
                this._buffer = "";
            }
        }, this._timeout);
        callback();
    }

    private sendLine(line: string) {
        setImmediate(() => {
            this._client.lineReceived(line);
        });
    }
}
