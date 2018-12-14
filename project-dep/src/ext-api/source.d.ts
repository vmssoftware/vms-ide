/// <reference types="node" />
import { IFileEntry } from "@vorfol/common";
import { Readable, Writable } from "stream";
export declare type sourceType = "local" | "remote";
export interface ISource {
    root?: string;
    attempts?: number;
    enabled: boolean;
    createReadStream(filename: string): Promise<Readable | undefined>;
    createWriteStream(filename: string): Promise<Writable | undefined>;
    dispose(): void;
    ensureDirectory(directory: string): Promise<boolean>;
    findFiles(include: string, exclude?: string): Promise<IFileEntry[]>;
    getDate(filename: string): Promise<Date | undefined>;
    setDate(filename: string, date: Date): Promise<boolean>;
}
