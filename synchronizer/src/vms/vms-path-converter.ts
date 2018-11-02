import { ftpPathSeparator } from "@vorfol/common";

export const splitter = new RegExp(ftpPathSeparator, "g");
export const vmsPathRgx = /((\w+):)?(\[((\.)?(\w+)(\.(\w+))*)\])?(((\w+)(\.(\w+)?)?)?(;(\d+))?)?/;
/**
 * Uses path.sep to determine directory.
 * Do not use other path functions because it incorrect parses path without file (directory only, ends with path.sep)
 */
export class VmsPathConverter {

    public get fullPath(): string {
        return this.vmsDir + this.vmsFile;
    }

    public get directory(): string {
        return this.vmsDir;
    }

    public get file(): string {
        return this.vmsFile;
    }

    public get initial(): string {
        return this.fsPath || "";
    }

    public static fromVms(relPath: string): VmsPathConverter {
        const converter = new VmsPathConverter();
        const match = relPath.match(vmsPathRgx);
        if (match) {
            converter.vmsDir = match[3] || "";
            converter.vmsFile = match[10] || "";
            if (match[4]) {
                if (!match[5]) {
                    converter.fsPath = ftpPathSeparator;
                }
                converter.fsPath += match[4].split(".").filter((s) => !!s).join(ftpPathSeparator);
                converter.fsPath += ftpPathSeparator + converter.vmsFile;
            }
        }
        return converter;
    }

    private vmsDir: string = "";
    private vmsFile: string = "";

    constructor(private fsPath?: string) {
        if (fsPath) {
            const dirEnd = fsPath.lastIndexOf(ftpPathSeparator);
            if (dirEnd === -1) {
                this.vmsFile = fsPath;
            } else {
                this.vmsFile = fsPath.slice(dirEnd + 1);
                this.vmsDir = fsPath.slice(0, dirEnd);
                this.vmsDir = this.vmsDir.replace(splitter, ".");
                this.vmsDir = "[." + this.vmsDir + "]";
            }
        } else {
            this.fsPath = "";
        }
    }
}
