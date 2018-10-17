import { Readable, Writable } from "stream";

export interface ICanCreateWriteStream {
    createWriteStream(filename: string): Promise<Writable|undefined> | Writable | undefined;
}

export interface ICanCreateReadStream {
    createReadStream(filename: string): Promise<Readable|undefined> | Readable | undefined;
}
