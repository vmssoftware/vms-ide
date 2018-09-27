import * as fs from 'fs';
import * as path from 'path';
import { SourceFile, Source } from "./sync";
import { Uri } from 'vscode';

let _log_ = console.log;
//comment next line to allow debug output
_log_ = function() {};

export class FS_SourceFile implements SourceFile {

    protected _fullPath: string;
    constructor(protected _source: FS_Source, protected _relPath: string) {
        this._fullPath = path.join(this._source.rootPath, this._relPath);
        _log_(`source created: ${this._fullPath}`);
    }

    get relativePath(): string {
        return this._relPath;
    }

    get content(): Promise<Buffer|undefined> {
        return new Promise<Buffer|undefined>(resolve => {
            fs.readFile(this._fullPath, (err, data) => {
                if (err) {
                    resolve(undefined);
                    _log_(`content of ${this._fullPath} failed: ${err}`);
                } else {
                    _log_(`content of ${this._fullPath} length: ${data.length}`);
                    resolve(data);
                }
            });
        });
    }

    get modTime(): Promise<Date|undefined> {
        return new Promise<Date|undefined>( resolve => {
            fs.stat(this._fullPath, (err, stats) => {
                if (err) {
                    resolve(undefined);
                    _log_(`date of ${this._fullPath} failed: ${err}`);
                } else {
                    resolve(stats.mtime);
                    _log_(`date of ${this._fullPath} ok: ${stats.mtime.toUTCString()}`);
                }
            });
        });
    }
}

export class FS_Source implements Source {

    protected _fsPathRoot: string;
    constructor(protected _root: Uri) {
        this._fsPathRoot = _root.fsPath;
    }

    get rootPath() : string {
        return this._fsPathRoot;
    }

    accept(uri: Uri): Promise<SourceFile|undefined> {
        return Promise.resolve().then(() => {
            if (uri.scheme == this._root.scheme) {
                let fsPath = uri.fsPath;
                if (fsPath.startsWith(this._fsPathRoot)) {
                    let fsTail = fsPath.slice(this._fsPathRoot.length);
                    _log_(`source ${this._root.toString()} accept: ${uri.toString()}`);
                    return new FS_SourceFile(this, fsTail);
                }
            }
            _log_(`source ${this._root.toString()} doesn't accept: ${uri.toString()}`);
            return undefined;
        });
    }
}
