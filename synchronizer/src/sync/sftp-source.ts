
import { ftpPathSeparator, LogType } from "@vorfol/common";
import { IFileEntry } from "@vorfol/common";

import { findFiles, leadingSepRg, middleSepRg, trailingSepRg } from "../common/find-files";
import { IInputAttributes, ISftpClient } from "./../ext-api/api";
import { ISource } from "./source";

export class SftpSource implements ISource {

    private ftpLikeRoot = "";

    public get root() {
        return this.ftpLikeRoot;
    }

    public set root(anyRoot: string | undefined) {
        anyRoot = anyRoot || "";
        this.ftpLikeRoot = anyRoot.replace(leadingSepRg, "").replace(trailingSepRg, "").replace(middleSepRg, ftpPathSeparator);
    }

    constructor(protected sftp: ISftpClient, root?: string, public debugLog?: LogType, public attempts?: number) {
        this.root = root;
    }

    public findFiles(include: string, exclude: string): Promise<IFileEntry[]> {
        // we sure the root exists
        return findFiles(this.sftp, this.root!, include, exclude, this.debugLog).then((list) => {
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
        const newTime: IInputAttributes = {
            atime: date,
            mtime: date,
        };
        filename = this.root + ftpPathSeparator + filename;
        await this.sftp.setStat(filename, newTime);
        // TODO: test result and try this.attempts times again
        return true;
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
