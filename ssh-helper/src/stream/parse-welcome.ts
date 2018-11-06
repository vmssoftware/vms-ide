import { LogFunction, LogType } from "@vorfol/common";
import { IParseWelcome } from "../api";
import { ShellParser } from "./shell-parser";
import { SshShell } from "./ssh-shell";

import * as nls from "vscode-nls";
nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export class ParseWelcome extends ShellParser implements IParseWelcome {

    public prompt?: string;

    /**
     * Parses stream until the last line isn't the same as previous line. Writes EOL on each data received.
     * Caveat: may be the reason of garbage in output already after prompt is caught, so wait your command
     * before utilizing output.
     * @param timeout timeout prompt catching
     * @param logFn like console.log
     */
    constructor(timeout?: number, logFn?: LogFunction, tag?: string) {
        super(timeout, logFn, tag);
    }

    /**
     * Just write some if esc-code found, else welcome!
     */
    public _transform(chunk: any, encoding: string, callback: Function) {
        super._transform(chunk, encoding, callback);
        if (Buffer.isBuffer(chunk)) {
            if (chunk.includes(27)) {
                this.push(SshShell.eol);
            } else {
                const lines = this.content.split(SshShell.eol);
                if (lines.length > 1) {
                    if (lines[lines.length - 1] === lines[lines.length - 2]) {
                        this.prompt = lines[lines.length - 1];
                        if (this.logFn) { 
                            this.logFn(LogType.debug, () => localize("debug.prompt", "parse: found prompt '{0}'", this.prompt)); 
                        }
                        this.setReady();
                    }
                }
                if (this.prompt === undefined) {
                    this.push(SshShell.eol);
                }
            }
        }
    }
}
