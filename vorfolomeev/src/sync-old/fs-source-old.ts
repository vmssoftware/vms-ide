import { Uri } from "vscode";
import { FSSourceFileOld } from "./fs-source-file-old";
import { ISourceFileOld, ISourceOld } from "./sync-old";

export type LogType = (message?: any, ...optionalParams: any[]) => void;
export let logFn: LogType | undefined;

export class FSSourceOld implements ISourceOld {

    protected fsPathRoot: string;
    constructor(protected root: Uri) {
        this.fsPathRoot = root.fsPath;
    }

    get rootPath(): string {
        return this.fsPathRoot;
    }

    public accept(uri: Uri): Promise<ISourceFileOld|undefined> {
        return Promise.resolve().then(() => {
            if (uri.scheme === this.root.scheme) {
                const fsPath = uri.fsPath;
                if (fsPath.startsWith(this.fsPathRoot)) {
                    const fsTail = fsPath.slice(this.fsPathRoot.length);
                    if (logFn) { logFn(`source ${this.root.toString()} accept: ${uri.toString()}`); }
                    return new FSSourceFileOld(this, fsTail);
                }
            }
            if (logFn) { logFn(`source ${this.root.toString()} doesn't accept: ${uri.toString()}`); }
            return undefined;
        });
    }
}
