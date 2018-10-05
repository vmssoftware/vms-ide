import { Uri } from "vscode";
import { FSSourceFile } from "./fs-source-file";
import { ISource, ISourceFile } from "./sync";

// tslint:disable-next-line:no-console
export let logFn = console.log;
// tslint:disable-next-line:no-empty
logFn = () => {};

export class FSSource implements ISource {

    protected fsPathRoot: string;
    constructor(protected root: Uri) {
        this.fsPathRoot = root.fsPath;
    }

    get rootPath(): string {
        return this.fsPathRoot;
    }

    public accept(uri: Uri): Promise<ISourceFile|undefined> {
        return Promise.resolve().then(() => {
            if (uri.scheme === this.root.scheme) {
                const fsPath = uri.fsPath;
                if (fsPath.startsWith(this.fsPathRoot)) {
                    const fsTail = fsPath.slice(this.fsPathRoot.length);
                    logFn(`source ${this.root.toString()} accept: ${uri.toString()}`);
                    return new FSSourceFile(this, fsTail);
                }
            }
            logFn(`source ${this.root.toString()} doesn't accept: ${uri.toString()}`);
            return undefined;
        });
    }
}
