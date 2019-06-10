import { IFileEntry, ftpPathSeparator } from "../../common/main";

import { Readable, Writable } from "stream";
import { IInputAttributes, ISftpClient, IStats } from "../../ssh-helper/api";
import { EventEmitter } from "events";

export class VmsSftpClient extends EventEmitter implements ISftpClient {

    public static rgCaret = /\^/g;

    /**
     * Adjust readDirectory: removes ".DIR;*" from directories and ";*" from files, also remains only latest version of file.
     * Also add/remove "." for files without extension
     * @param sftp SFTP
     */
    constructor(public sftp: ISftpClient) {
        super();
        sftp.on("cleanSftp", () => {
            this.emit("cleanSftp");
        });
    }

    /**
     * Add a dot if extension is empty
     * @param name 
     */
    public fixLocalName(name: string) {
        if (name) {
            const dirP = name.lastIndexOf(ftpPathSeparator);
            const extP = name.lastIndexOf(".");
            if (extP === -1 || extP < dirP) {
                name += ".";
            }
        }
        return name;
    }

    /**
     * 1. Remove last dot
     * 2. Remove any "^" symbols.
     * @param name 
     */
    public fixremoteName(name: string) {
        if (name) {
            const l = name.length;
            if (l > 0 && name[l - 1] === ".") {
                name = name.slice(0, l - 1);
            }
            name = name.replace(VmsSftpClient.rgCaret, "");
        }
        return name;
    }

    public get enabled(): boolean {
        return this.sftp.enabled;
    }

    public set enabled(value: boolean) {
        this.sftp.enabled = value;
    }

    public createReadStream(file: string): Promise<Readable | undefined> {
        return this.sftp.createReadStream(this.fixLocalName(file));
    }

    public createWriteStream(file: string): Promise<Writable | undefined> {
        return this.sftp.createWriteStream(this.fixLocalName(file));
    }

    public getStat(file: string): Promise<IStats | undefined> {
        return this.sftp.getStat(this.fixLocalName(file));
    }

    public setStat(file: string, stat: IInputAttributes): Promise<void> {
        return this.sftp.setStat(this.fixLocalName(file), stat);
    }

    public deleteFile(file: string): Promise<boolean> {
        return this.sftp.deleteFile(this.fixLocalName(file));
    }

    public async readDirectory(directory: string): Promise<IFileEntry[] | undefined> {
        let list = await this.sftp.readDirectory(directory);
        if (list) {
            // remove VMS-specific suffixes
            list = list.map((entry) => {
                if (entry.isDirectory) {
                    const dirDot = entry.filename.toLowerCase().lastIndexOf(".dir;");
                    if (dirDot >= 0) {
                        entry.filename = entry.filename.slice(0, dirDot);
                    }
                } else {
                    const verSemicolon = entry.filename.lastIndexOf(";");
                    if (verSemicolon >= 0) {
                        entry.filename = entry.filename.slice(0, verSemicolon);
                    }
                }
                entry.filename = this.fixremoteName(entry.filename);
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
