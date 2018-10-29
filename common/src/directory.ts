
export interface IFileEntry {
    filename: string;
    isFile: boolean;
    isDirectory: boolean;
    date: Date;         // modification date
}

export const ftpPathSeparator = "/";

export interface IReadDirectory {
    readDirectory(directory: string): Promise<IFileEntry[] | undefined>;
}
