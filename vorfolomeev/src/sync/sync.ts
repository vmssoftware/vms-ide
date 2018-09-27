import { Uri } from "vscode";


export interface Sync {
    postFile(uri: Uri): Promise<boolean>
}

export interface Source {
    accept(uri: Uri) : Promise<SourceFile | undefined>;
}

export interface SourceFile {
    relativePath: string;
    content: Promise<Buffer|undefined>;
    modTime: Promise<Date|undefined>;
}

export interface Target {
    test(relativePath: string, modTime: Date): Promise<TargetFile>;
}

export interface TargetFile {
    needUpdate: boolean;
    updateContent(content: Buffer): Promise<boolean>;
}
