import { LogFunction, LogType, printLike } from "../../common/main";

import { IParseWelcome } from "../api";
import { ShellParser } from "./shell-parser";

import * as nls from "vscode-nls";
import { SshShell } from "./ssh-shell";
nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export class ParseWelcomeVms extends ShellParser implements IParseWelcome {
    public get width() {
        return this.widthValue;
    }
    public set width(w: number | undefined) {
        if (w !== undefined &&
            w >= 16 && w <= 255) {
            this.widthValue = w;
            this.ttCmd[1].then = this.setWidth(this.widthValue);
        }
    }

    public static setType = printLike`SET TERM/DEV=VT100/WIDTH=${80}`;

    public prompt?: string;

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

    private widthValue = 132;
    private setWidth = printLike`\x1B[24;${80}R`;
    private typeSet = false;

    constructor(timeout?: number, logFn?: LogFunction, tag?: string, width?: number) {
        super(timeout, logFn, tag);
        this.width = width;
    }

    /**
     * Just write some if esc-code found, else welcome!
     */
    public _transform(chunk: any, encoding: string, callback: () => any) {
        super._transform(chunk, encoding, callback);
        if (Buffer.isBuffer(chunk)) {
            // prompt just after the zero-byte
            const promptIdx = chunk.indexOf(0);
            if (promptIdx >= 0) {
                this.prompt = chunk.slice(promptIdx + 1).toString("utf8");
                this.logFn(LogType.debug, () => localize("debug.prompt", "vms parse: found prompt '{0}'", this.prompt));
                if (!this.typeSet) {
                    this.push(ParseWelcomeVms.setType(this.widthValue) + SshShell.eol);
                    this.logFn(LogType.debug, () => localize("debug.terminal", "vms parse: setup terminal and wait next prompt"));
                    this.typeSet = true;
                } else {
                    this.setReady();
                }
            }
            // speed up shell :)
            this.ttCmd.some((tt, idx) => {
                if (chunk.includes(tt.if)) {
                    this.logFn(LogType.debug, () => localize("debug.tt", "vms parse: found tt {0}", idx));
                    this.typeSet = true;
                    this.push(tt.then);
                    return true;
                }
                return false;
            });
        }
    }
}
