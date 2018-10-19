import { FileEntry } from "ssh2-streams";
import { ICanCreateReadStream, ICanCreateWriteStream } from "../stream/can-create-stream";

export interface ISource extends ICanCreateReadStream, ICanCreateWriteStream {
    findFiles(include: string, exclude: string): Promise<FileEntry[]>;
    getDate(filename: string): Promise<Date|undefined>;
    setDate(filename: string, date: Date): Promise<boolean>;
    pipe(filename: string, dest: ICanCreateWriteStream): Promise<boolean>;
}
