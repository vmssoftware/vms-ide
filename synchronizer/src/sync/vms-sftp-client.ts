import { IFileEntry } from "@vorfol/common";
import { Readable, Writable } from "stream";
import { IInputAttributes, ISftpClient, IStats } from "../ext-api/api";

export class VmsSftpClient implements ISftpClient {

    /**
     * Adjust readDirectory: removes ".DIR;*" from directories and ";*" from files, also remains only latest version of file.
     * @param sftp SFTP
     */
    constructor(public sftp: ISftpClient) {

    }

    public get enabled(): boolean {
        return this.sftp.enabled;
    }

    public set enabled(value: boolean) {
        this.sftp.enabled = value;
    }

    public createReadStream(file: string): Promise<Readable | undefined> {
        return this.sftp.createReadStream(file);
    }

    public createWriteStream(file: string): Promise<Writable | undefined> {
        return this.sftp.createWriteStream(file);
    }

    public getStat(file: string): Promise<IStats | undefined> {
        return this.sftp.getStat(file);
    }

    public setStat(file: string, stat: IInputAttributes): Promise<void> {
        return this.sftp.setStat(file, stat);
    }

    public async readDirectory(directory: string): Promise<IFileEntry[] | undefined> {
        let list = await this.sftp.readDirectory(directory);
        if (list) {
            // remove VMS-specific suffixes
            list = list.map((entry) => {
                if (entry.isDirectory) {
                    const dirDot = entry.filename.toLowerCase().lastIndexOf(".dir;");
                    entry.filename = entry.filename.slice(0, dirDot);
                } else {
                    const verSemicolon = entry.filename.lastIndexOf(";");
                    if (verSemicolon >= 0) {
                        entry.filename = entry.filename.slice(0, verSemicolon);
                    }
                }
                return entry;
            });
            // remain only those entries, for which there are no entries with the same filename and newer date
            list = list.filter((value, idx, array) => !array.some((same) => same.filename === value.filename && same.date.valueOf() > value.date.valueOf()));
        }
        return list;
    }

    public ensureDirectory(directory: string): Promise<boolean> {
        return this.sftp.ensureDirectory(directory);
    }

    public dispose(): void {
        return this.sftp.dispose();
    }

}
