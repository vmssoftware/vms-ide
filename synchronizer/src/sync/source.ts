import { IFileEntry } from "@vorfol/common";
import { Readable, Writable } from "stream";

export interface ISource {
    root?: string;
    attempts?: number;
    findFiles(include: string, exclude?: string): Promise<IFileEntry[]>;
    getDate(filename: string): Promise<Date|undefined>;
    setDate(filename: string, date: Date): Promise<boolean>;
    ensureDirectory(directory: string): Promise<boolean>;
    createReadStream(filename: string): Promise<Readable|undefined>;
    createWriteStream(filename: string): Promise<Writable|undefined>;
}
