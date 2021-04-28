import { IFileEntry } from "../../common/main";

import { Readable, Writable } from "stream";

export interface IProgress {
    /**
     * Show progress
     * @param token name
     * @param addvalue amount of progress
     * @returns true on cancel
     */
    addProgress(token: string, addvalue: number): boolean;

    /**
     * Set progress
     * @param token name
     * @param value current value
     * @param maxvalue max value
     */
    setProgress(token: string, value: number, maxvalue?: number): boolean;
}

export type sourceType = "local" | "remote";

export interface ISource {
    root?: string;
    attempts?: number;
    enabled: boolean;
    createReadStream(filename: string): Promise<Readable|undefined>;
    createWriteStream(filename: string): Promise<Writable|undefined>;
    dispose(): void;
    ensureDirectory(directory: string): Promise<boolean>;
    findFiles(include: string, exclude?: string, progress?: IProgress): Promise<IFileEntry[] | undefined>;
    getDate(filename: string): Promise<Date|undefined>;
    setDate(filename: string, date: Date): Promise<boolean>;
    accessFile(filename: string): Promise<boolean>;
    deleteFile(filename: string): Promise<boolean>;
}
