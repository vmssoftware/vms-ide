
export interface IFileEntry {
    filename: string;
    isFile: boolean;
    isDirectory: boolean;
    date: Date;         // modification date
    vers: number;       // version
}

export const ftpPathSeparator = "/";

export interface IReadDirectory {
    readDirectory(directory: string): Promise<IFileEntry[] | undefined>;
}
