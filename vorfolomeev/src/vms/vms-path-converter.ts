import * as path from "path";
import { IPathConverter } from "../ssh/path-converter";

export class VmsPathConverter implements IPathConverter {
    private vmsDir: string = "";
    private vmsFile: string = "";

    constructor(private fsPath?: string) {
        if (fsPath) {
            this.vmsDir = path.dirname(fsPath);
            this.vmsFile = path.basename(fsPath);
            this.vmsDir = this.vmsDir.split(/[\\.]/g).reduce((acc, cur) => {
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

    public from(relPath: string): IPathConverter {
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
}
