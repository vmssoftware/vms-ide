import { ICanCreateReadStream, ICanCreateWriteStream } from "../stream/can-create-stream";

export interface ISource extends ICanCreateReadStream, ICanCreateWriteStream {
    findFiles(patterns: string[], ignore: string[]): Promise<string[]>;
    getDate(filename: string): Promise<Date|undefined>;
    setDate(filename: string, date: Date): Promise<boolean>;
    pipe(filename: string, dest: ICanCreateWriteStream): Promise<boolean>;
}
