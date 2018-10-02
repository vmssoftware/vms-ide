import { Disposable, Uri, workspace } from "vscode";
import { FSSource } from "./fs-source";
import { ISource, ISourceFile, ISync, ITarget, ITargetFile } from "./sync";
import { SyncV1 } from "./sync-v1";

const date1 = new Date(Date.UTC(2018, 9, 20, 14, 25, 33, 123));

// tslint:disable-next-line:no-console
const logFn = console.log;
// tslint:disable-next-line:no-empty
// logFn = () => {};

class SourceFileTestV1 implements ISourceFile {
    constructor(public relPath: string) {
    }
    get content(): Promise<Buffer> {
        return Promise.resolve().then(() => {
            logFn("content loaded from: " + this.relPath);
            return Buffer.alloc(50, "50");
        });
    }
    get relativePath(): string {
        logFn("relativePath from: " + this.relPath);
        return this.relPath;
    }
    get modTime(): Promise<Date> {
        return Promise.resolve().then(() => {
            logFn(`date from: ${this.relPath} is ${date1.toUTCString()}`);
            return date1;
        });
    }
}

// tslint:disable-next-line:max-classes-per-file
class SourceTestV1 implements ISource {

    public fsPathRoot: string;
    constructor(public root: Uri) {
        this.fsPathRoot = root.fsPath;
    }

    public accept(uri: Uri): Promise<ISourceFile|undefined> {
        return Promise.resolve().then(() => {
            if (uri.scheme === this.root.scheme) {
                const fsPath = uri.fsPath;
                if (fsPath.startsWith(this.fsPathRoot)) {
                    const fsTail = fsPath.slice(this.fsPathRoot.length);
                    logFn(`${this.fsPathRoot} accepted: ${uri.toString()} tail: ${fsTail}`);
                    return new SourceFileTestV1(fsTail);
                }
            }
            logFn(`${this.fsPathRoot} not accepted: ${uri.toString()}`);
            return undefined;
        });
    }
}

// tslint:disable-next-line:max-classes-per-file
class TargetFileTestV1 implements ITargetFile {

    constructor(public relPath: string) {

    }

    get needUpdate(): boolean {
        logFn(`need update: ${this.relPath}`);
        return true;
    }

    public updateContent(content: Buffer): Promise<boolean> {
        return Promise.resolve().then(() => {
            logFn(`updated: ${this.relPath} buffer length: ${content.length}`);
            return true;
        });
    }
}

// tslint:disable-next-line:max-classes-per-file
class TargetTestV1 implements ITarget {
    public test(relPath: string, modTime: Date): Promise<ITargetFile> {
        return Promise.resolve().then(() => {
            logFn(`tested: ${relPath}`);
            return new TargetFileTestV1(relPath);
        });
    }
}

const sources: string[] = [
    "src:/root_one",
    "src:/root_two",
    "file:/root_three/inner",
];

const files: string[] = [
    "src:/root_one/file_one.c",
    "src:/root_two/file_two.c",
    "src:/root_3/file_3.c",
    "file:/root_three/inner/file_three.c",
    "file:/root_three/file_4.c",
    "src:/root_two/inner/file_inner_two.c",
];

export function TestTargetTestV1() {
    const tt1 = new TargetTestV1();
    const sync = new SyncV1(tt1);

    for (const src of sources) {
        sync.addSource(new SourceTestV1(Uri.parse(src)));
    }

    const allFiles = files.map((file) => sync.postFile(Uri.parse(file)).then((result) => {
            logFn(`${file} is processed: ${result}`);
        }));
    Promise.all(allFiles).then(() => {
        logFn("All done");
    });
}

export function TestFSSource() {
    const tt1 = new TargetTestV1();
    const sync = new SyncV1(tt1);

    let disposables: Disposable[] = [];

    if (workspace.workspaceFolders) {
        for (const ws of workspace.workspaceFolders) {
            disposables.push(sync.addSource(new FSSource(ws.uri)));
        }
    }

    workspace.findFiles("**/*.{c,cpp,h}").then((uris) => {
        const allFiles = uris.map((uri) => sync.postFile(uri).then((result) => {
            logFn(`${uri} is processed: ${result}`);
        }));
        Promise.all(allFiles).then(() => {
            logFn("All done");
            disposables.forEach((v) => v.dispose());
            disposables = [];
        });
    });

    postFiles(sync, 0);
}

function postFiles(sync: ISync, i: number) {
    logFn(`in postFiles: ${i}`);
    if (i < files.length) {
        const file = files[i];
        logFn(`posted: ${file}`);
        sync.postFile(Uri.parse(file)).then((result) => {
            logFn(`${file} is processed: ${result}`);
        });
        setTimeout((idx) => {
            postFiles(sync, idx);
        }, Math.random() * 300, i + 1);
    }
}
