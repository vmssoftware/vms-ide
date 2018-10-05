import * as path from "path";
import { IPathConverter } from "../ssh/path-converter";

export class FsPathConverter implements IPathConverter {
    private dir: string = "";
    private fileName: string = "";

    constructor(private fsPath?: string) {
        if (fsPath) {
            this.dir = path.dirname(fsPath);
            this.fileName = path.basename(fsPath);
        }
    }

    public from(relPath: string): IPathConverter {
        return new FsPathConverter(relPath);
    }

    public get fullPath(): string {
        return path.join( this.dir, this.fileName);
    }

    public get directory(): string {
        return this.dir;
    }

    public get file(): string {
        return this.fileName;
    }
}
