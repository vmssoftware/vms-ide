import { Writable } from "stream";
import { LogType } from "../common/log-type";

export class StreamTTYHold extends Writable {

    public content: string = "";

    public columns = 80;

    constructor(debugLog?: LogType) {
        super();
    }

    public _write(chunk: any, encoding: string, callback: (err?: Error) => void) {
        if (Buffer.isBuffer(chunk)) {
            const content = chunk.toString("utf8");
            this.content += content;
        }
        callback();
    }
}
