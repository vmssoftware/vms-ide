import { ICanCreateReadStream, ICanCreateWriteStream } from "../stream/can-create-stream";
import { IFileEntry } from "../stream/read-directory";

export interface ISource extends ICanCreateReadStream, ICanCreateWriteStream {
    findFiles(include: string, exclude: string): Promise<IFileEntry[]>;
    getDate(filename: string): Promise<Date|undefined>;
    setDate(filename: string, date: Date): Promise<boolean>;
    ensureDirectory(directory: string): Promise<boolean>;
}
