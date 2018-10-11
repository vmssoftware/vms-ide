import * as path from "path";
import { IPathConverter } from "../ssh/path-converter";

/**
 * Uses path.sep to determine directory.
 * Do not use other path functions because it incorrect parses path without file (directory only, ends with path.sep)
 */
export class VmsPathConverter implements IPathConverter {
    private vmsDir: string = "";
    private vmsFile: string = "";
    private readonly splitter = new RegExp("[\\" + path.sep + ".]", "g");

    constructor(private fsPath?: string) {
        if (fsPath) {
            const dirEnd = fsPath.lastIndexOf(path.sep);
            if (dirEnd === -1) {
                this.vmsFile = fsPath;
            } else {
                this.vmsFile = fsPath.slice(dirEnd + 1);
                this.vmsDir = fsPath.slice(0, dirEnd);
                this.vmsDir = this.vmsDir.split(this.splitter).reduce((acc, cur) => {
                    if (cur) {
                        acc.push(cur);
                    }
                    return acc;
                }, [] as string[]).join(".");

                if (this.vmsDir) {
                    this.vmsDir = "[." + this.vmsDir + "]";
                }
            }
        }
    }

    public from(relPath: string): VmsPathConverter {
        return new VmsPathConverter(relPath);
    }

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
}
