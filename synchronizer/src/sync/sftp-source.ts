
import { ftpPathSeparator, LogFunction, LogType } from "@vorfol/common";
import { IFileEntry } from "@vorfol/common";

import { findFiles, leadingSepRg, middleSepRg, trailingSepRg } from "../common/find-files";
import { IInputAttributes, ISftpClient } from "../ext-api/api";
import { IProgress, ISource } from "./source";

export class SftpSource implements ISource {

    public get root() {
        return this.ftpLikeRoot;
    }

    public set root(anyRoot: string | undefined) {
        anyRoot = anyRoot || "";
        // this.ftpLikeRoot = anyRoot.replace(leadingSepRg, "").replace(trailingSepRg, "").replace(middleSepRg, ftpPathSeparator);
        this.ftpLikeRoot = anyRoot.replace(trailingSepRg, "").replace(middleSepRg, ftpPathSeparator);
    }

    public get enabled() {
        return this.sftp.enabled;
    }

    public set enabled(action: boolean) {
        this.sftp.enabled = action;
    }

    public logFn: LogFunction;

    private ftpLikeRoot = "";

    constructor(protected sftp: ISftpClient, root?: string, logFn?: LogFunction, public attempts?: number) {
        // tslint:disable-next-line:no-empty
        this.logFn = logFn || (() => {});
        this.root = root;
    }

    public dispose() {
        this.sftp.dispose();
    }

    public findFiles(include: string, exclude: string, progress?: IProgress): Promise<IFileEntry[]> {
        // we sure the root exists
        return findFiles(this.sftp, this.root!, include, exclude, this.logFn, progress).then((list) => {
            let pos = this.root!.length;
            if (pos > 0) {
                pos += ftpPathSeparator.length;
                for (const file of list) {
                    file.filename = file.filename.slice(pos);
                }
            }
            return list;
        });
    }

    public async getDate(filename: string): Promise<Date | undefined> {
        filename = this.root + ftpPathSeparator + filename;
        const stat = await this.sftp.getStat(filename);
        if ( stat ) {
            const date = new Date(stat.mtime * 1000);
            return date;
        }
        return undefined;
    }

    public async setDate(filename: string, date: Date): Promise<boolean> {
        const newDateValue = date.valueOf() / 1000;  // seconds
        const newTime: IInputAttributes = {
            atime: newDateValue,
            mtime: newDateValue,
        };
        filename = this.root + ftpPathSeparator + filename;
        return this.sftp.setStat(filename, newTime).then(() => true);
        // // test result and try again
        // const actualStat = await this.sftp.getStat(filename);
        // if (actualStat) {
        //     const diff = newDateValue - actualStat.mtime;
        //     if (Math.abs(diff) > 1) {
        //         const finalDateValue = newDateValue + diff;
        //         const finalTime: IInputAttributes = {
        //             atime: finalDateValue,
        //             mtime: finalDateValue,
        //         };
        //         await this.sftp.setStat(filename, finalTime);
        //     }
        //     return true;
        // }
        // return false;
    }

    public ensureDirectory(directory: string): Promise<boolean> {
        directory = this.root + ftpPathSeparator + directory;
        return this.sftp.ensureDirectory(directory);
    }

    /**
     * No holds, ho events attaches
     * @param filename file name
     */
    public createReadStream(filename: string) {
        filename = this.root + ftpPathSeparator + filename;
        return this.sftp.createReadStream(filename);
    }

    /**
     * No holds, no event attaches
     * @param filename file name
     */
    public createWriteStream(filename: string) {
        filename = this.root + ftpPathSeparator + filename;
        return this.sftp.createWriteStream(filename);
    }

}
