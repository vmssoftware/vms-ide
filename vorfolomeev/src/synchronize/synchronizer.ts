import { Uri } from "vscode";
import { Config } from "../config_v2/config_v2";
import { FilterSection } from "../config_v2/sections/filter";


export interface SyncHelper {
    getSynchronizer() : Synchronizer;
    getSyncWatcher() : SyncWatcher;
}

export interface SyncWatcher {
    watch() : boolean;
}


export interface Synchronizer {
    synchronize() : Promise<boolean>;
}

export interface Stat {
    size_in_bytes?: number;
    mod_time?: Date|null;
    crc32?: number;
}

export interface FS_Wrapper {

    read(path: Uri) : Promise<Buffer|undefined>;
    write(path: Uri, buff: Buffer) : Promise<boolean>;
    stat(path: Uri, need: Stat): Promise<Stat|undefined>;
    files(include: string, exclude: string): Promise<Uri[]>;
}

/**
 * 
 */

export class Sync_v1 implements Synchronizer {
    
    protected _filter: FilterSection = new FilterSection();
    
    constructor(protected _cfg: Config, 
                protected _primary: FS_Wrapper, 
                protected _secondary: FS_Wrapper) {
        
        _cfg.add(this._filter);
    }
    
    protected _syncPromise: Promise<boolean> | undefined = undefined;
    synchronize(): Promise<boolean> {
        if (!this._syncPromise) {
            this._syncPromise = new Promise<boolean>(async (resolve, reject) => {
                let ret_code = false;
                try {
                    let uris = await this._primary.files(this._filter.include, this._filter.exclude);
                    for(let uri of uris) {
                        ret_code = (await this.syncFile(uri)) && ret_code;
                    }
                } catch(err) {
                    ret_code = false;
                }
                resolve(ret_code);
                this._syncPromise = undefined;
            });
        }
        return this._syncPromise;
    }

    protected syncFile(path: Uri) : Promise<boolean> {
        return new Promise<boolean>(async (resolve, reject) => {
            let result = true;
            if (await this.testFile(path)) {
                result = await this.sendFile(path);
            }
            resolve(result);
        });
    }

    /**
     * test modification timestamp. thing to override
     */
    protected testFile(path: Uri) : Promise<boolean> {
        return new Promise<boolean>(async (resolve, reject) => {
            let stat : Stat = {mod_time: null};
            try {
                let primaryStat = await this._primary.stat(path, stat);
                let secondaryStat = await this._secondary.stat(path, stat);
                let doSend = primaryStat && (!secondaryStat || (primaryStat.mod_time != secondaryStat.mod_time));
                resolve(doSend);
            } catch(err) {
                resolve(true);  //do send if getting stats is failed
            }
        });
    }

    protected sendFile(path: Uri) : Promise<boolean> {
        return new Promise<boolean>(async (resolve, reject) => {
            try {
                let buff = await this._primary.read(path);
                let result = !buff || await this._secondary.write(path, buff);
                resolve(result);
            } catch(err) {
                resolve(false);
            }
        });
    }

}

/**
 * 
 */

import * as fs from 'fs';
import * as fg from 'fast-glob';
import { IPartialOptions } from "fast-glob/out/managers/options";


export class FS_FileSystem implements FS_Wrapper {

    protected _roots: Uri[] = [];
    constructor(roots: Uri[]) {
        for(let root of roots) {
            if (root.scheme === 'file') {
                this._roots.push(root);
            }
        }
    }

    testInRoots(path:Uri) : boolean {
        let ret = this._roots.some((root, idx)=>{
            return root.scheme === path.scheme &&
                   path.fsPath.startsWith(root.fsPath) ;
        });
        return ret;
    }

    read(path: Uri): Promise<Buffer|undefined> {
        if (!this.testInRoots(path)) {
            return Promise.resolve(undefined);
        }
        return new Promise<Buffer|undefined>((resolve, reject)=>{
            fs.promises.readFile(path.fsPath);
            fs.readFile(path.fsPath, (err, data)=>{
                if (err) {
                    resolve(undefined);
                } else {
                    resolve(data);
                }
            });
        });
    }

    write(path: Uri, buff: Buffer): Promise<boolean> {
        if (!this.testInRoots(path)) {
            return Promise.resolve(false);
        }
        return new Promise<boolean>((resolve, reject)=>{
            fs.writeFile(path.fsPath, buff, (err)=>{
                if (err) {
                    resolve(false);
                } else {
                    resolve(true);
                }
            });
        });
    }

    stat(path: Uri, need: Stat): Promise<Stat|undefined> {
        if (need.mod_time !== undefined || need.size_in_bytes !== undefined) {
            if (!this.testInRoots(path)) {
                return Promise.resolve(undefined);
            }
            return new Promise<Stat>((resolve, reject)=>{
                fs.stat(path.fsPath, (err, stats) => {
                    if (err) {
                        resolve(undefined);
                    } else {
                        let ret_stats: Stat = {};
                        if (need.mod_time !== undefined) {
                            ret_stats.mod_time = stats.mtime;
                        }
                        if (need.size_in_bytes !== undefined) {
                            ret_stats.size_in_bytes = stats.size;
                        }
                        resolve(ret_stats);
                    }
                });
            });
        } else {
            //throw new Error("Function unsupported.");
            return Promise.resolve(undefined);
        }
    }

    files(include: string, exclude: string): Promise<Uri[]> {
        return new Promise<Uri[]>((resolve,reject)=>{
            let opt : IPartialOptions = {};
            //opt.ignore = exclude.split(',');
            opt.cwd = this._roots[0].fsPath;
            fg.async(include, opt).catch((err)=>{
            //fg.async(include).catch((err)=>{
                resolve([]);
            }).then((result)=>{
                if (!result) {
                    resolve([]);
                } else {
                    let uris: Uri[] = [];
                    for(let item of result) {
                        if (typeof item === 'string') {
                            uris.push(Uri.file(item));
                        } else if (item.path) {
                            uris.push(Uri.file(item.path));
                        }
                    }
                    resolve(uris);
                }
            });
        });
    }

}
