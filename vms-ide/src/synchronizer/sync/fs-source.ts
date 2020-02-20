import * as fs from "fs-extra";

import { ftpPathSeparator, IFileEntry, IReadDirectory } from "../../common/main";
import { LogFunction, LogType } from "../../common/main";

import { findFiles, leadingSepRg, middleSepRg, trailingSepRg } from "../common/find-files";
import { ISource } from "./source";

import * as nls from "vscode-nls";
nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export class FsSource implements ISource, IReadDirectory {

    private ftpLikeRoot = "";

    public get root() {
        return this.ftpLikeRoot;
    }

    public set root(anyRoot: string | undefined) {
        anyRoot = anyRoot || "";
        this.ftpLikeRoot = anyRoot.replace(trailingSepRg, "").replace(middleSepRg, ftpPathSeparator);
    }

    constructor(root?: string, public debugLog?: LogFunction, public attempts?: number) {
        this.root = root;
    }

    public dispose() {
        //
    }

    public get enabled() {
        return true;
    }

    public set enabled(action: boolean) {
        //
    }

    /**
     * Read directory adding root, member of IReadDirectory
     * @param directory directory
     */
    public async readDirectory(directory: string): Promise<IFileEntry[] | undefined> {
        directory = this.root + ftpPathSeparator + directory;
        const list = await fs.readdir(directory)
            .catch((err) => {
                if (this.debugLog) {
                    this.debugLog(LogType.debug, () => `${err}`);
                }
                return [];
            });
        const retList: IFileEntry[] = [];
        for (const file of list) {
            const stat = await fs.stat(directory + ftpPathSeparator + file)
                .catch((err) => {
                    if (this.debugLog) {
                        this.debugLog(LogType.debug, () => `${err}`);
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
                    this.debugLog(LogType.debug, () => localize("debug.no_date", "No date for {0}", file));
                }
            }
        }
        return retList;
    }

    public findFiles(include: string, exclude: string): Promise<IFileEntry[] | undefined> {
        // do not pass root, it will be done in readDirectory
        return findFiles(this, "", include, exclude, this.debugLog);
    }

    public async getDate(filename: string): Promise<Date | undefined> {
        filename = this.root + ftpPathSeparator + filename;
        const stat = await fs.stat(filename).catch((err) => {
            if (this.debugLog) {
                this.debugLog(LogType.debug, () => `${err}`);
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
        const result = await fs.utimes(filename, date, date).then(() => {
            return true;
        }).catch((err) => {
            // TODO: try this.attempts times
            if (this.debugLog) {
                this.debugLog(LogType.debug, () => `${err}`);
            }
            return false;
        });
        return result;
    }

    public ensureDirectory(directory: string): Promise<boolean> {
        directory = this.root + ftpPathSeparator + directory;
        return fs.ensureDir(directory).then(() => true)
            .catch(() => false);
    }

    /**
     * No holds, ho events attaches
     * @param filename file name
     */
    public async createReadStream(filename: string) {
        filename = this.root + ftpPathSeparator + filename;
        return fs.createReadStream(filename);
    }

    /**
     * No holds, no event attaches
     * @param filename file name
     */
    public async createWriteStream(filename: string) {
        filename = this.root + ftpPathSeparator + filename;
        return fs.createWriteStream(filename);
    }

    public async deleteFile(filename: string) {
        filename = this.root + ftpPathSeparator + filename;
        return fs.unlink(filename).then(() => true);
    }

    public async accessFile(filename: string) {
        filename = this.root + ftpPathSeparator + filename;
        return fs.access(filename).then(() => true).catch(() => false);
    }

}
