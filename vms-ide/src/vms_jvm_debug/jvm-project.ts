import * as vscode from 'vscode';
import fs from "fs-extra";
import path from "path";
import { LogFunction, LogType } from '../common/main';

export interface IClassInfo {
    className: string;
    /** If has main() */
    hasMain: boolean,
    /** valid source lines */
    lines: Set<number>,
}

export interface IFileInfo {
    fileName: string,
    /** class => IClassInfo */
    classes: Map<string, IClassInfo>,
}

export class JvmProject {

    /** file => IFileInfo */
    private collection = new Map<string, IFileInfo>();

    public logFn: LogFunction;

    constructor(private scope: string | undefined, logFn?: LogFunction) {
        // tslint:disable-next-line:no-empty
        this.logFn = logFn || (() => {});
    }

    /**
     * Find and return file info
     * @param fileName relative file name
     * @param add do add when info doesn't exist yet
     */
    public getFileInfo(fileName: string, add?: boolean) : IFileInfo | undefined {
        let fileInfo = this.collection.get(fileName);
        if (!fileInfo && add) {
            fileInfo = {
                fileName,
                classes: new Map<string, IClassInfo>(),
            };
            this.collection.set(fileName, fileInfo);
        }
        return fileInfo;
    }

    /**
     * Find and return class info
     * @param className full class name
     * @param fileInfo file info to search in and add to if class info doesn't exist yet
     */
    public getClassInfo(className: string, fileInfo?: IFileInfo) : IClassInfo | undefined {
        className = className.replace(/\//g, ".");
        if (fileInfo) {
            let classInfo = fileInfo.classes.get(className);
            if (!classInfo) {
                classInfo = {
                    className,
                    hasMain: false,
                    lines: new Set<number>(),
                };
                fileInfo.classes.set(className, classInfo);
            }
            return classInfo;
        } else {
            for (const [fileName, fileInfo] of this.collection) {
                if (fileInfo.classes.has(className)) {
                    return fileInfo.classes.get(className);
                }
            }
        }
        return undefined;
    }

    public getExecutableClassNames() {
        const names: string[] = [];
        for(const [fileName, fileInfo] of this.collection) {
            for (const [className, classInfo] of fileInfo.classes) {
                if (classInfo.hasMain) {
                    names.push(className);
                }
            }
        }
        return names;
    }

    public async save() {
        try {
            if (this.scope && vscode.workspace.workspaceFolders) {
                const workspaceFolder = vscode.workspace.workspaceFolders.find(ws => ws.name === this.scope);
                if (workspaceFolder) {
                    // convert
                    const jvmInfo: any[] = [];
                    for(const [fileName, fileInfo] of this.collection) {
                        const data = [...fileInfo.classes.values()].
                            map(classInfo => {
                                return {
                                    className: classInfo.className,
                                    hasMain: classInfo.hasMain,
                                    lines: [...classInfo.lines],
                                }
                            });
                        jvmInfo.push({
                            fileName,
                            classes: data,
                        });
                    }
                    const content = JSON.stringify(jvmInfo, null, 2);
                    const fileName = path.join(workspaceFolder.uri.fsPath, `.vscode`, `javaInfo.json`);
                    await fs.writeFile(fileName, content);    
                    return true;
                }
            }
        }
        catch(ex) {
            this.logFn(LogType.error, () => String(ex));
        }
        return false;
    }

    public async load() {
        try {
            this.collection = new Map<string, IFileInfo>();
            if (this.scope && vscode.workspace.workspaceFolders) {
                const workspaceFolder = vscode.workspace.workspaceFolders.find(ws => ws.name === this.scope);
                if (workspaceFolder) {
                    const fileName = path.join(workspaceFolder.uri.fsPath, `.vscode`, `javaInfo.json`);
                    const contentBuffer = await fs.readFile(fileName);
                    const content = contentBuffer.toString("utf8");
                    const jvmInfo = JSON.parse(content);
                    if (jvmInfo instanceof Array) {
                        for (const fileInfoData of jvmInfo) {
                            if (fileInfoData && typeof fileInfoData.fileName === "string") {
                                const fileInfo = this.getFileInfo(fileInfoData.fileName, true);
                                if (fileInfoData.classes instanceof Array) {
                                    for (const classInfoData of fileInfoData.classes) {
                                        if (classInfoData && typeof classInfoData.className === "string" && typeof classInfoData.hasMain === "boolean") {
                                            const classInfo = this.getClassInfo(classInfoData.className, fileInfo);
                                            if (classInfo && classInfoData.lines instanceof Array) {
                                                classInfo.hasMain = classInfoData.hasMain;  // 'hasMain' is useful only if class has source lines
                                                for (const line of classInfoData.lines) {
                                                    if (line && typeof line === "number") {
                                                        classInfo.lines.add(line);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        catch(ex) {
            this.logFn(LogType.error, () => String(ex));
        }
        return false;
    }

}