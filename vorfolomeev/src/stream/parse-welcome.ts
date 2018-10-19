import os from "os";

import { ClientChannel } from "ssh2";
import { Lock } from "../common/lock";
import { LogType } from "../common/log-type";
import { ICanParseWelcome } from "./can-parse-welcome";

export class ParseWelcome implements ICanParseWelcome {

    public static eol = os.EOL;

    /**
     * Parses stream until the last line isn't the same as previous line. Writes EOL on each data received.
     * Caveat: may be the reason of garbage in output already after prompt is caught, so wait your command
     * before utilizing output.
     * @param timeout timeout prompt catching
     * @param log like console.log
     */
    constructor(public timeout = 0, public log?: LogType) {
    }

    /**
     * Just write some if esc-code found, else welcome!
     */
    public async parseWelcome(channel: ClientChannel) {

        let prompt: string | undefined;

        if (channel) {
            const waitParse = new Lock(true);
            let welcome = "";
            const onData = (data: Buffer) => {
                if (this.log) { this.log(`parse: on data`); }
                if (Buffer.isBuffer(data)) {
                    if (data.includes(27)) {
                        channel.write(ParseWelcome.eol);
                    } else {
                        const strData = data.toString("utf8");
                        welcome += strData;
                        const lines = welcome.split(ParseWelcome.eol);
                        if (lines.length > 1) {
                            if (lines[lines.length - 1] === lines[lines.length - 2]) {
                                prompt = lines[lines.length - 1];
                                if (this.log) { this.log(`parse: found prompt "${prompt}"`); }
                                waitParse.release();
                            }
                        }
                        if (prompt === undefined) {
                            channel.write(ParseWelcome.eol);
                        }
                    }
                } else {
                    if (this.log) { this.log(`parse: data is not Buffer`); }
                    waitParse.release();
                }
            };
            channel.on("data", onData);
            const onClose = () => {
                waitParse.release();
            };
            channel.on("close", onClose);
            let timer: NodeJS.Timer | undefined;
            if (this.timeout) {
                timer = setTimeout(() => {
                    if (this.log) { this.log(`parse: timeout`); }
                    waitParse.release();
                    timer = undefined;
                }, this.timeout);
            }
            await waitParse.acquire();
            channel.removeListener("data", onData);
            channel.removeListener("close", onClose);
            if (timer) {
                clearTimeout(timer);
            }
        }

        if (prompt === undefined) {
            if (this.log) { this.log(`parse: cannot find prompt`); }
        }

        return prompt;
    }
}
