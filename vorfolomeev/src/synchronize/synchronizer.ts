import * as path from "path";
import { Uri } from "vscode";
import { FilterSection } from "../config/sections/filter";
import { IConfigHelper } from "./../ext-api/config";

export interface ISyncHelper {
    getSynchronizer(): ISynchronizer;
    getSyncWatcher(): ISyncWatcher;
}

export interface ISyncWatcher {
    watch(): boolean;
}

export interface ISynchronizer {
    synchronize(): Promise<boolean>;
}

export interface IStat {
    mod_time?: Date | null | undefined;
}

export interface IFSWrapper {

    /**
     * Read file
     * @param path
     */
    read(path: Uri): Promise<Buffer|undefined>;

    /**
     * Write file
     * @param path
     * @param buff
     */
    write(path: Uri, buff: Buffer): Promise<boolean>;

    /**
     * Get file stats
     * @param path
     * @param need
     */
    stat(path: Uri, need: IStat): Promise<IStat>;

    /**
     * Set appropriate file stats
     * @param path
     * @param stat
     */
    syncStat(path: Uri, stat: IStat): Promise<boolean>;

    /**
     * Get list of files
     * @param include
     * @param exclude
     */
    files(include: string, exclude: string): Promise<Uri[]>;
}

/**
 * Sync V2
 */
export class SyncV2 implements ISynchronizer {

    protected syncPromise: Promise<boolean> | undefined = undefined;
    protected filter: FilterSection = new FilterSection();

    constructor(protected cfg: IConfigHelper,
                protected primary: IFSWrapper,
                protected secondary: IFSWrapper) {
        cfg.getConfig().add(this.filter);
    }

    public synchronize(): Promise<boolean> {
        if (!this.syncPromise) {
            this.syncPromise = new Promise<boolean>(async (resolve) => {
                let retCode = false;
                try {
                    const uris = await this.primary.files(this.filter.include, this.filter.exclude);
                    for (const uri of uris) {
                        retCode = (await this.syncFile(uri)) && retCode;
                    }
                } catch (err) {
                    retCode = false;
                }
                resolve(retCode);
                this.syncPromise = undefined;
            });
        }
        return this.syncPromise;
    }

    public syncFile(filePath: Uri): Promise<boolean> {
        return new Promise<boolean>(async (resolve, reject) => {
            let result = true;
            if (await this.testFile(filePath)) {
                result = await this.sendFile(filePath);
            }
            resolve(result);
        });
    }

    /**
     * test modification timestamp. thing to override
     */
    protected testFile(filePath: Uri): Promise<boolean> {
        return new Promise<boolean>(async (resolve, reject) => {
            const stat: IStat = {mod_time: null};
            try {
                const primaryStat = await this.primary.stat(filePath, stat);
                const secondaryStat = await this.secondary.stat(filePath, stat);
                const doSend = !!primaryStat && (!secondaryStat || (primaryStat.mod_time !== secondaryStat.mod_time));
                resolve(doSend);
            } catch (err) {
                resolve(true);  // do send if getting stats is failed
            }
        });
    }

    protected sendFile(filePath: Uri): Promise<boolean> {
        return new Promise<boolean>(async (resolve, reject) => {
            try {
                const buff = await this.primary.read(filePath);
                const result = !buff || await this.secondary.write(filePath, buff);
                resolve(result);
            } catch (err) {
                resolve(false);
            }
        });
    }

}

/**
 * next block
 */
import * as fg from "fast-glob";
import { IPartialOptions } from "fast-glob/out/managers/options";
import * as fs from "fs";

/**
 * Primary
 * Uses full paths
 */
// tslint:disable-next-line:max-classes-per-file
export class FSFileSystem implements IFSWrapper {

    protected roots: Uri[] = [];

    constructor(rootsInitial: Uri[]) {
        for (const root of rootsInitial) {
            if (root.scheme === "file") {
                this.roots.push(root);
            }
        }
    }

    /**
     * Now only mpd_time is accepted
     * @param filePath
     * @param stat
     */
    public syncStat(filePath: Uri, stat: IStat): Promise<boolean> {
        if (!this.testInRoots(filePath) || !stat.mod_time) {
            return Promise.resolve(false);
        } else {
            return new Promise<boolean>((resolve) => {
                fs.utimes(filePath.fsPath, stat.mod_time!, stat.mod_time!, (err) => {
                    if (err) {
                        resolve(false);
                    } else {
                        resolve(true);
                    }
                });
            });
        }
    }

    public read(filePath: Uri): Promise<Buffer|undefined> {
        if (!this.testInRoots(filePath)) {
            return Promise.resolve(undefined);
        }
        return new Promise<Buffer|undefined>((resolve) => {
            fs.promises.readFile(filePath.fsPath);
            fs.readFile(filePath.fsPath, (err, data) => {
                if (err) {
                    resolve(undefined);
                } else {
                    resolve(data);
                }
            });
        });
    }

    public write(filePath: Uri, buff: Buffer): Promise<boolean> {
        if (!this.testInRoots(filePath)) {
            return Promise.resolve(false);
        }
        return new Promise<boolean>((resolve) => {
            fs.writeFile(filePath.fsPath, buff, (err) => {
                if (err) {
                    resolve(false);
                } else {
                    resolve(true);
                }
            });
        });
    }

    public stat(filePath: Uri, need: IStat): Promise<IStat> {
        if (!this.testInRoots(filePath)) {
            return Promise.resolve({});
        }
        return new Promise<IStat>((resolve) => {
            fs.stat(filePath.fsPath, (err, stats) => {
                if (err) {
                    resolve({});
                } else {
                    const retStats: IStat = {};
                    if (need.mod_time !== undefined) {
                        retStats.mod_time = stats.mtime;
                    }
                    resolve(retStats);
                }
            });
        });
    }

    public files(include: string, exclude: string): Promise<Uri[]> {
        return new Promise<Uri[]>((resolve) => {
            const promises: Array<Promise<void>> = [];
            const uris: Uri[] = [];
            let ignore = exclude.split(",");
            let patterns = include.split(",");
            ignore = ignore.map((v) => v.trim());
            patterns = patterns.map((v) => v.trim());
            for (const root of this.roots) {
                const opt: IPartialOptions = {};
                opt.cwd = root.fsPath;
                opt.ignore = ignore;
                opt.onlyFiles = true;
                promises.push(new Promise<void>((resolveInner) => {
                    fg.async(patterns, opt).catch(() => {
                        resolveInner();
                    }).then((result) => {
                        if (result) {
                            for (const item of result) {
                                if (typeof item === "string") {
                                    const resPath = path.join(root.fsPath, item);
                                    uris.push(Uri.file(resPath));
                                } else if (item.path) {
                                    const resPath = path.join(root.fsPath, item.path);
                                    uris.push(Uri.file(resPath));
                                }
                            }
                        }
                        resolveInner();
                    });
                }));
            }
            Promise.all(promises).then(() => {
                resolve(uris);
            });
        });
    }

    protected testInRoots(filePath: Uri): boolean {
        const ret = this.roots.some((root) => {
            return root.scheme === filePath.scheme &&
                   filePath.fsPath.startsWith(root.fsPath) ;
        });
        return ret;
    }

}
