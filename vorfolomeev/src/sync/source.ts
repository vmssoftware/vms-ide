import { Readable, Writable } from "stream";

export interface ICanCreateWriteStream {
    createWriteStream(file: string): Writable | Promise<Writable|undefined>;
}

export interface ICanCreateReadStream {
    createReadStream(file: string): Readable | Promise<Readable|undefined>;
}

export interface ISource extends ICanCreateReadStream, ICanCreateWriteStream {
    findFiles(patterns: string[], ignore: string[]): Promise<string[]>;
    getDate(filename: string): Promise<Date|undefined>;
    setDate(filename: string, date: Date): Promise<boolean>;
    pipe(filename: string, dest: ICanCreateWriteStream): Promise<boolean>;
}
