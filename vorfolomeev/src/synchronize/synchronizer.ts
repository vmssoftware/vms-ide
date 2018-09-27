import { Uri } from "vscode";
import { ConfigHelper } from '@vorfol/config-helper';
import { FilterSection } from "../config/sections/filter";
import * as path from 'path';


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
    mod_time?: Date | null | undefined;
}

export interface FS_Wrapper {

    /**
     * Read file
     * @param path 
     */
    read(path: Uri) : Promise<Buffer|undefined>;

    /**
     * Write file
     * @param path 
     * @param buff 
     */
    write(path: Uri, buff: Buffer) : Promise<boolean>;

    /**
     * Get file stats
     * @param path 
     * @param need 
     */
    stat(path: Uri, need: Stat): Promise<Stat>;

    /**
     * Set appropriate file stats
     * @param path 
     * @param stat 
     */
    syncStat(path: Uri, stat: Stat): Promise<boolean>;

    /**
     * Get list of files
     * @param include 
     * @param exclude 
     */
    files(include: string, exclude: string): Promise<Uri[]>;
}

/**
 * 
 */

export class Sync_v1 implements Synchronizer {
    
    protected _filter: FilterSection = new FilterSection();
    
    constructor(protected _cfg: ConfigHelper, 
                protected _primary: FS_Wrapper, 
                protected _secondary: FS_Wrapper) {
        
        _cfg.getConfig().add(this._filter);
    }
    
    protected _syncPromise: Promise<boolean> | undefined = undefined;
    synchronize(): Promise<boolean> {
        if (!this._syncPromise) {
            this._syncPromise = new Promise<boolean>(async (resolve) => {
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

    syncFile(path: Uri) : Promise<boolean> {
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
                let doSend = !!primaryStat && (!secondaryStat || (primaryStat.mod_time != secondaryStat.mod_time));
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

/**
 * Primary
 * Uses full paths
 */
export class FS_FileSystem implements FS_Wrapper {

    /**
     * Now only mpd_time is accepted
     * @param path 
     * @param stat 
     */
    syncStat(path: Uri, stat: Stat): Promise<boolean> {
        if (!this.testInRoots(path) || !stat.mod_time) {
            return Promise.resolve(false);
        } else {
            return new Promise<boolean>((resolve)=> {
                fs.utimes(path.fsPath, stat.mod_time!, stat.mod_time!, (err)=>{
                    if (err) resolve(false);
                    else resolve(true);
                });
            });
        }
    }

    protected _roots: Uri[] = [];
    constructor(roots: Uri[]) {
        for(let root of roots) {
            if (root.scheme === 'file') {
                this._roots.push(root);
            }
        }
    }

    protected testInRoots(path:Uri) : boolean {
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

    stat(path: Uri, need: Stat): Promise<Stat> {
        if (!this.testInRoots(path)) {
            return Promise.resolve({});
        }
        return new Promise<Stat>((resolve)=>{
            fs.stat(path.fsPath, (err, stats) => {
                if (err) {
                    resolve({});
                } else {
                    let ret_stats: Stat = {};
                    if (need.mod_time !== undefined) {
                        ret_stats.mod_time = stats.mtime;
                    }
                    resolve(ret_stats);
                }
            });
        });
    }

    files(include: string, exclude: string): Promise<Uri[]> {
        return new Promise<Uri[]>((resolve)=>{
            let promises: Promise<void>[] = [];
            let uris: Uri[] = [];
            let ignore = exclude.split(',');
            let patterns = include.split(',');
            ignore = ignore.map(v => v.trim());
            patterns = patterns.map(v => v.trim());
            for(let root of this._roots) {
                let opt : IPartialOptions = {};
                opt.cwd = root.fsPath;
                opt.ignore = ignore;
                opt.onlyFiles = true;
                promises.push(new Promise<void>((resolve_inner)=>{
                    fg.async(patterns, opt).catch((err)=>{
                        resolve_inner();
                    }).then((result)=>{
                        if (result) {
                            for(let item of result) {
                                if (typeof item === 'string') {
                                    let res_path = path.join(root.fsPath, item);
                                    uris.push(Uri.file(res_path));
                                } else if (item.path) {
                                    let res_path = path.join(root.fsPath, item.path);
                                    uris.push(Uri.file(res_path));
                                }
                            }
                        }
                        resolve_inner();
                    });
                }));
            }
            Promise.all(promises).then(()=>{
                resolve(uris);
            });
        });
    }

}
