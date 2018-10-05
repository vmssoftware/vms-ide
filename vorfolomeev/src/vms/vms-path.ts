import * as path from "path";

export class VmsPath {

    private vmsDir: string;
    private vmsFile: string;

    constructor(private fsPath: string) {

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
