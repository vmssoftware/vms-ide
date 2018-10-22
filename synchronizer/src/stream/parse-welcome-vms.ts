import { ClientChannel } from "ssh2";
import { Lock } from "../common/lock";
import { LogType } from "../common/log-type";
import { IWelcomeParser } from "./welcome-parser";

export class ParseWelcomeVms implements IWelcomeParser {

    public static eol = "\r\n";

    protected readonly ttCmd = [
        {
            if:     Buffer.from([27, 91, 99]),
            then:   "\x1B[?62;1c",
        }, {
            if:     Buffer.from([27, 91, 50, 53, 53, 59, 50, 53, 53, 72]),
            then:   "\x1B[24;80R",
        },
    ];

    constructor(public timeout?: number, public log?: LogType) {
    }

    /**
     * Just write some if esc-code found, else welcome!
     */
    public async parseWelcome(channel: ClientChannel) {

        let prompt: string | undefined;

        if (channel) {
            const waitParse = new Lock(true);
            const welcome = "";
            const onData = (data: Buffer) => {
                if (this.log) { this.log(`parse: on data`); }
                if (Buffer.isBuffer(data)) {
                    // prompt just after the zero-byte
                    const promptIdx = data.indexOf(0);
                    if (promptIdx >= 0) {
                        prompt = data.slice(promptIdx + 1).toString("utf8");
                        if (this.log) { this.log(`vms parse: found prompt "${prompt}"`); }
                        waitParse.release();
                    }
                    // speed up shell :)
                    this.ttCmd.some((tt, idx) => {
                        if (data.includes(tt.if)) {
                            if (this.log) { this.log(`vms parse: found tt ${idx}`); }
                            channel.write(tt.then);
                            return true;
                        }
                        return false;
                    });
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
