import * as fs from "fs";
import * as path from "path";
import { Uri } from "vscode";
import { LogType } from "../common/log-type";
import { FSSourceOld } from "./fs-source-old";
import { ISourceFileOld } from "./sync-old";

export let logFn: LogType | undefined;

export class FSSourceFileOld implements ISourceFileOld {

    protected fullPath: string;
    constructor(protected source: FSSourceOld, protected relPath: string) {
        this.fullPath = path.join(this.source.rootPath, this.relPath);
        if (logFn) { logFn(`source created: ${this.fullPath}`); }
    }

    get relativePath(): string {
        return this.relPath;
    }

    get content(): Promise<Buffer|undefined> {
        return new Promise<Buffer|undefined>( (resolve) => {
            fs.readFile(this.fullPath, (err, data) => {
                if (err) {
                    resolve(undefined);
                    if (logFn) { logFn(`content of ${this.fullPath} failed: ${err}`); }
                } else {
                    if (logFn) { logFn(`content of ${this.fullPath} length: ${data.length}`); }
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
                    if (logFn) { logFn(`date of ${this.fullPath} failed: ${err}`); }
                } else {
                    resolve(stats.mtime);
                    if (logFn) { logFn(`date of ${this.fullPath} ok: ${stats.mtime.toUTCString()}`); }
                }
            });
        });
    }
}
