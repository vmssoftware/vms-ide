// just got from ssh2-streams

export interface IFileEntry {
    filename: string;
    longname: string;
    attrs: IAttributes;
}

export interface IAttributes {
    mode: number;
    uid: number;
    gid: number;
    size: number;
    atime: number;
    mtime: number;
}

export interface IReadDirectory {
    readDirectory(directory: string): Promise<IFileEntry[] | undefined>;
}
