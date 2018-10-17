import { ClientChannel } from "ssh2";
import { Lock } from "../common/lock";

type LogType = (message?: any, ...optionalParams: any[]) => void;

export interface ICanParseWelcome {
    parseWelcome(channel: ClientChannel): Promise<string|undefined>;
}

export class ParseWelcomeBuru implements ICanParseWelcome {

    public static eol = "\r\n";

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
                        channel.write(ParseWelcomeBuru.eol);
                    } else {
                        const strData = data.toString("utf8");
                        welcome += strData;
                        const promptStart = welcome.lastIndexOf(ParseWelcomeBuru.eol);
                        if (promptStart >= 0 &&
                            promptStart + ParseWelcomeBuru.eol.length !== welcome.length) {
                            prompt = welcome.slice(promptStart + ParseWelcomeBuru.length);
                            if (this.log) { this.log(`parse: found prompt "${prompt}"`); }
                            waitParse.release();
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
