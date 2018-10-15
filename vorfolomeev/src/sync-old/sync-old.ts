import { Disposable, Uri } from "vscode";

export interface ISyncOld {
    addSource(source: ISourceOld): Disposable;
    postFile(uri: Uri): Promise<boolean>;
}

export interface ISourceOld {
    accept(uri: Uri): Promise<ISourceFileOld | undefined>;
}

export interface ISourceFileOld {
    relativePath: string;
    content: Promise<Buffer|undefined>;
    modTime: Promise<Date|undefined>;
}

export interface ITargetOld {
    test(relativePath: string, modTime: Date): Promise<ITargetFileOld>;
}

export interface ITargetFileOld {
    needUpdate: boolean;
    updateContent(content: Buffer): Promise<boolean>;
}
