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

    // see vt100.net
    protected readonly ttCmd = [
        // 0
        {
            if:     Buffer.from("\x1B[c"),
            then:   "\x1B[?1;0c",       // terminal type vt101
        },
        // 1
        {
            if:     Buffer.from("\x1B[0c"),
            then:   "\x1B[?1;0c",
        },
        // 2
        {
            if:     Buffer.from("\x1B[>c"),
            then:   "\x1B[>1;1;0c",     // terminal type vt220
        },
        // 3
        {
            if:     Buffer.from("\x1B[>0c"),
            then:   "\x1B[>1;1;0c",
        },
        // 4
        {
            if:     Buffer.from("\x1B[5n"),
            then:   "\x1B[0n",      // no malfunctions
        },
        // 5
        {
            if:     Buffer.from("\x1B[6n"),
            then:   "\x1B[0;0R",    // cursor at 0;0
        },
        // 6
        {
            if:     Buffer.from("\x1B[15n"),
            then:   "\x1B[13n",     // no printer
        },
        // 7
        {
            if:     Buffer.from("\x1B[16n"),
            then:   "\x1B[20n",     // user-defined keys are unlocked
        },
        // 8
        {
            if:     Buffer.from("\x1B[26n"),
            then:   "\x1B[27;0n",     // user-defined keys are unlocked
        },
        // 9
        {
            if:     Buffer.from("\x1BZ"),
            then:   "\x1B/Z",       // ok
        },
        // 10
        {
            if:     Buffer.from("\x1B[x"),
            then:   "\x1B/Z",       // ?
        },
        // 11 - set dimensions
        {
            if:     Buffer.from("\x1B[255;255H"),
            then:   "\x1B[24;132R", // screen dimension H;W
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
            if (!this.prompt) {
                // prompt just after the zero-byte
                const promptIdx = chunk.lastIndexOf(0);
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
            }
            // speed up shell :)
            this.ttCmd.some((tt, idx) => {
                if (chunk.includes(tt.if)) {
                    this.logFn(LogType.debug, () => localize("debug.tt", "vms parse: found tt {0}", idx));
                    if (idx < 4 || idx == 11) {
                        this.typeSet = true;
                    }
                    this.push(tt.then);
                    // return true; - check all tt
                }
                return false;
            });
        }
    }
}
