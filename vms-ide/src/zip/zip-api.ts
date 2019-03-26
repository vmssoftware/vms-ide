import * as fs from "fs";
import * as arch from "archiver";

import { LogFunction }      from "../common/main";
import { LogType }          from "../common/main";

export type Resolve<T> = ((value?: T | PromiseLike<T> | undefined) => void);

export class ZipApi {

    private output: fs.WriteStream | undefined;
    private archive: arch.Archiver | undefined;
    private entries = 0;
    private stopped = false;
    private archiveResolver: Resolve<boolean> | undefined;
    private logFn: LogFunction;

    constructor(logFn?: LogFunction) {
        this.logFn = logFn || (() => {});
    }

    public start(file: string, logFn?: LogFunction): Promise<boolean> | undefined {
        if (this.output) {
            return undefined;
        }

        this.logFn = logFn || this.logFn || (() => {});

        this.stopped = false;
        this.logFn(LogType.debug, () => "zip started");

        this.output = fs.createWriteStream(file);

        // 'close' event is fired only when a file descriptor is involved
        this.output.on('error', (err) => {
            // log error
            this.logFn(LogType.error, () => String(err));
            this.clear(false);
        });

        // 'close' event is fired only when a file descriptor is involved
        this.output.on('close', () => {
            // log closing
            this.logFn(LogType.debug, () => "zip output closed");
            this.clear(true);
        });

        // This event is fired when the data source is drained no matter what was the data source.
        this.output.on('end', () => {
            // log ending
            this.logFn(LogType.debug, () => "zip output ended");
            this.clear(true);
        });

        this.archive = arch.create("zip", {
            zlib: { level: 9 }
        });
        
        // good practice to catch warnings (ie stat failures and other non-blocking errors)
        this.archive.on('warning', (err: any) => {
            if (err.code === 'ENOENT') {
                // log warning
                this.logFn(LogType.warning, () => err.message);
                this.entries--;
            } else {
                // log error
                this.logFn(LogType.error, () => err.message);
                this.clear(false);
            }
        });

        // good practice to catch this error explicitly
        this.archive.on('error', (err: any) => {
            // log err
            this.logFn(LogType.error, () => err.message);
            this.clear(false);
        });

        this.archive.on('entry', (entryData: arch.EntryData) => {
            this.logFn(LogType.information, () => "Compressed: " + (entryData.name ? entryData.name : ""));
            this.entries--;
            this.testFinish();
        });

        // pipe archive data to the file
        this.archive.pipe(this.output);

        return new Promise<boolean>((resolve) => {
            this.archiveResolver = resolve;
        });
    }

    public addFile(filePath: string, name: string, stats?: fs.Stats): boolean {
        if (this.archive) {
            this.entries++;
            this.archive.file(filePath, {
                name,
                stats,
            });
            return true;
        }
        return false;
    }

    public stop(): boolean {
        this.stopped = true;
        this.testFinish();
        return true;
    }

    private testFinish() {
        if (this.stopped && this.entries === 0) {
            if (this.archive) {
                this.archive.finalize();
            }
        }
    }

    private clear(resolveCode: boolean) {
        this.archive = undefined;
        this.output = undefined;
        if (this.archiveResolver) {
            this.archiveResolver(resolveCode);
            this.archiveResolver = undefined;
        }
    }
}
