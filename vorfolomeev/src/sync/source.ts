import { Readable, Writable } from "stream";

export interface IHasCreateWriteStream {
    createWriteStream(file: string): Writable | Promise<Writable|undefined>;
}

export interface ISource {
    findFiles(patterns: string[], ignore: string[]): Promise<string[]>;
    getDate(filename: string): Promise<Date|undefined>;
    setDate(filename: string, date: Date): Promise<boolean>;
    createReadStream(filename: string): Promise<Readable|undefined>;
    createWriteStream(filename: string): Promise<Writable|undefined>;
    pipe(filename: string, dest: IHasCreateWriteStream): Promise<boolean>;
}
