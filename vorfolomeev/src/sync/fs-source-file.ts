import * as fs from "fs";
import * as path from "path";
import { Uri } from "vscode";
import { FSSource } from "./fs-source";
import { ISourceFile } from "./sync";

// tslint:disable-next-line:no-console
export let logFn = console.log;
// tslint:disable-next-line:no-empty
logFn = () => {};

export class FSSourceFile implements ISourceFile {

    protected fullPath: string;
    constructor(protected source: FSSource, protected relPath: string) {
        this.fullPath = path.join(this.source.rootPath, this.relPath);
        logFn(`source created: ${this.fullPath}`);
    }

    get relativePath(): string {
        return this.relPath;
    }

    get content(): Promise<Buffer|undefined> {
        return new Promise<Buffer|undefined>( (resolve) => {
            fs.readFile(this.fullPath, (err, data) => {
                if (err) {
                    resolve(undefined);
                    logFn(`content of ${this.fullPath} failed: ${err}`);
                } else {
                    logFn(`content of ${this.fullPath} length: ${data.length}`);
                    resolve(data);
                }
            });
        });
    }

    get modTime(): Promise<Date|undefined> {
        return new Promise<Date|undefined>( (resolve) => {
            fs.stat(this.fullPath, (err, stats) => {
                if (err) {
                    resolve(undefined);
                    logFn(`date of ${this.fullPath} failed: ${err}`);
                } else {
                    resolve(stats.mtime);
                    logFn(`date of ${this.fullPath} ok: ${stats.mtime.toUTCString()}`);
                }
            });
        });
    }
}
