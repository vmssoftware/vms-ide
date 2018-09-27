import { Target, TargetFile, SourceFile, Source, Sync } from "./sync";
import { Uri, workspace, Disposable } from "vscode";
import { Sync_v1 } from "./sync_v1";
import { FS_Source } from "./fs-source";

let _date_1 = new Date(Date.UTC(2018, 9, 20, 14, 25, 33, 123));

let _log_ = console.log;
_log_ = function() {};

class SourceFileTest_v1 implements SourceFile {
    constructor(public _relPath: string) {
    }
    get content(): Promise<Buffer> {
        return Promise.resolve().then(()=>{
            _log_('content loaded from: ' + this._relPath);
            return Buffer.alloc(50,'50');
        });
    }
    get relativePath(): string {
        _log_('relativePath from: ' + this._relPath);
        return this._relPath;
    }
    get modTime(): Promise<Date> {
        return Promise.resolve().then(()=>{
            _log_(`date from: ${this._relPath} is ${_date_1.toUTCString()}`);
            return _date_1;
        });
    }
}

class SourceTest_v1 implements Source {

    public _fsPathRoot: string;
    constructor(public _root: Uri) {
        this._fsPathRoot = _root.fsPath;
    }

    accept(uri: Uri): Promise<SourceFile|undefined> {
        return Promise.resolve().then(() => {
            if (uri.scheme == this._root.scheme) {
                let fsPath = uri.fsPath;
                if (fsPath.startsWith(this._fsPathRoot)) {
                    let fsTail = fsPath.slice(this._fsPathRoot.length);
                    _log_(`${this._fsPathRoot} accepted: ${uri.toString()} tail: ${fsTail}`);
                    return new SourceFileTest_v1(fsTail);
                }
            }
            _log_(`${this._fsPathRoot} not accepted: ${uri.toString()}`);
            return undefined;
        });
    }
}


class TargetFileTest_v1 implements TargetFile {

    constructor(public _relPath: string) {

    }
    
    get needUpdate(): boolean {
        _log_(`need update: ${this._relPath}`);
        return true;
    }

    updateContent(content: Buffer): Promise<boolean> {
        return Promise.resolve().then(()=>{
            _log_(`updated: ${this._relPath} buffer length: ${content.length}`);
            return true;
        });
    }


}

class TargetTest_v1 implements Target {
    test(relPath: string, modTime: Date): Promise<TargetFile> {
        return Promise.resolve().then(()=>{
            _log_(`tested: ${relPath}`);
            return new TargetFileTest_v1(relPath);
        });
    }
}

const _sources: string[] = [
    'src:/root_one',
    'src:/root_two',
    'file:/root_three/inner',
];

const _files: string[] = [
    'src:/root_one/file_one.c',
    'src:/root_two/file_two.c',
    'src:/root_3/file_3.c',
    'file:/root_three/inner/file_three.c',
    'file:/root_three/file_4.c',
    'src:/root_two/inner/file_inner_two.c',
];

export function TestTargetTest_v1() {
    let tt1 = new TargetTest_v1();
    let sync = new Sync_v1(tt1);

    for(let src of _sources) {
        sync.addSource(new SourceTest_v1(Uri.parse(src)));
    }

    let allFiles = _files.map(file => sync.postFile(Uri.parse(file)).then((result)=>{
            console.log(`${file} is processed: ${result}`);
        }));
    Promise.all(allFiles).then(()=>{
        console.log('All done');
    });
}

export function TestFSSource() {
    let tt1 = new TargetTest_v1();
    let sync = new Sync_v1(tt1);

    let disposables: Disposable[] = [];

    if (workspace.workspaceFolders) {
        for(let ws of workspace.workspaceFolders) {
            disposables.push(sync.addSource(new FS_Source(ws.uri)));
        }
    }

    workspace.findFiles('**/*.{c,cpp,h}').then(uris => {
        let allFiles = uris.map(uri => sync.postFile(uri).then((result)=>{
            console.log(`${uri} is processed: ${result}`);
        }));
        Promise.all(allFiles).then(()=>{
            console.log('All done');
            disposables.forEach(v => v.dispose());
            disposables = [];
        });
    });

    postFiles(sync, 0);
}

function postFiles(sync: Sync, i: number) {
    _log_(`in postFiles: ${i}`);
    if (i < _files.length) {
        let file = _files[i];
        _log_(`posted: ${file}`);
        sync.postFile(Uri.parse(file)).then((result)=>{
            console.log(`${file} is processed: ${result}`);
        });
        setTimeout((idx)=>{
            postFiles(sync, idx);
        }, Math.random()*300, i+1);
    }
}