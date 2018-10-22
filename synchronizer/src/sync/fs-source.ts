import { findFiles, ftpPathSeparator, leadingSepRg, middleSepRg, trailingSepRg } from "../common/find-files";
import { LogType } from "../common/log-type";
import { IFileEntry, IReadDirectory } from "../stream/read-directory";
import { ISource } from "./source";

import fs from "fs";
import util from "util";

const fsGetStat = util.promisify(fs.stat);
const fsSetDate = util.promisify(fs.utimes);
const fsReadDir = util.promisify(fs.readdir);
const fsMkDir = util.promisify(fs.mkdir);
const fsExist = util.promisify(fs.exists);

export class FsSource implements ISource, IReadDirectory {

    constructor(public root?: string, public debugLog?: LogType, public attempts?: number) {
        root = root || "";
        this.root = root.replace(leadingSepRg, "").replace(trailingSepRg, "").replace(middleSepRg, ftpPathSeparator);
    }

    /**
     * Read directory adding root, member of IReadDirectory
     * @param directory directory
     */
    public async readDirectory(directory: string): Promise<IFileEntry[] | undefined> {
        directory = this.root + ftpPathSeparator + directory;
        const list = await fsReadDir(directory).catch((err) => {
            if (this.debugLog) {
                this.debugLog(`${err}`);
            }
            return [];
        });
        const retList: IFileEntry[] = [];
        for (const file of list) {
            const stat = await fsGetStat(directory + ftpPathSeparator + file).catch((err) => {
                if (this.debugLog) {
                    this.debugLog(`${err}`);
                }
                return undefined;
            });
            if (stat) {
                const entry: IFileEntry = {
                    date: stat.mtime,
                    filename: file,
                    isDirectory: stat.isDirectory(),
                    isFile: stat.isFile(),
                };
                retList.push(entry);
            } else {
                if (this.debugLog) {
                    this.debugLog(`No date for ${file}`);
                }
            }
        }
        return retList;
    }

    public findFiles(include: string, exclude: string): Promise<IFileEntry[]> {
        // do not pass root, it will be done in readDirectory
        return findFiles(this, "", include, exclude, this.debugLog);
    }

    public async getDate(filename: string): Promise<Date | undefined> {
        filename = this.root + ftpPathSeparator + filename;
        const stat = await fsGetStat(filename).catch((err) => {
            if (this.debugLog) {
                this.debugLog(`${err}`);
            }
            return undefined;
        });
        if ( stat ) {
            const date = new Date(stat.mtimeMs);
            return date;
        }
        return undefined;
    }

    public async setDate(filename: string, date: Date): Promise<boolean> {
        filename = this.root + ftpPathSeparator + filename;
        const result = await fsSetDate(filename, date, date).then(() => {
            return true;
        }).catch((err) => {
            // TODO: try this.attempts times
            if (this.debugLog) {
                this.debugLog(`${err}`);
            }
            return false;
        });
        return result;
    }

    public ensureDirectory(directory: string): Promise<boolean> {
        directory = this.root + ftpPathSeparator + directory;
        return fsExist(directory).then((ok) => {
            if (!ok) {
                return fsMkDir(directory).then(() => {
                    return true;
                });
            }
            return true;
        }).catch(() => {
            return false;
        });
    }

    /**
     * No holds, ho events attaches
     * @param filename file name
     */
    public createReadStream(filename: string) {
        filename = this.root + ftpPathSeparator + filename;
        return fs.createReadStream(filename);
    }

    /**
     * No holds, no event attaches
     * @param filename file name
     */
    public createWriteStream(filename: string) {
        filename = this.root + ftpPathSeparator + filename;
        return fs.createWriteStream(filename);
    }

}
