
export interface IFileEntry {
    filename: string;
    isFile: boolean;
    isDirectory: boolean;
    date: Date;         // modification date
}

export interface IReadDirectory {
    readDirectory(directory: string): Promise<IFileEntry[] | undefined>;
}
