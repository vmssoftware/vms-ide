import { Uri } from "vscode";

export interface ISync {
    postFile(uri: Uri): Promise<boolean>;
}

export interface ISource {
    accept(uri: Uri): Promise<ISourceFile | undefined>;
}

export interface ISourceFile {
    relativePath: string;
    content: Promise<Buffer|undefined>;
    modTime: Promise<Date|undefined>;
}

export interface ITarget {
    test(relativePath: string, modTime: Date): Promise<ITargetFile>;
}

export interface ITargetFile {
    needUpdate: boolean;
    updateContent(content: Buffer): Promise<boolean>;
}
