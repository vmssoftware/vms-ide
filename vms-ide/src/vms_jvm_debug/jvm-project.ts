import * as nls from "vscode-nls";
import * as vscode from 'vscode';
import fs from "fs-extra";
import path from "path";
import { LogFunction, LogType } from '../common/main';

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export enum MethodAccess {
    'public',
    'protected',
    'private',
};

export function isMethodAccess(o: any): o is MethodAccess {
    return Object.values(MethodAccess).includes(o);
}

export interface IMethodInfo {
    methodName: string;
    methodType: string;
    methodAccess: MethodAccess;
    methodStatic: boolean;
    methodModifiers: string[];
    /** valid source lines */
    lines: Set<number>,
};

export interface IClassInfo {
    className: string;
    hasMain: boolean,
    /** method => IMethodInfo */
    methods: Map<string, IMethodInfo>,
};

export interface IFileInfo {
    fileName: string,
    /** class => IClassInfo */
    classes: Map<string, IClassInfo>,
};

export class JvmProject {

    public static reLoadDelay = 300;

    /** file => IFileInfo */
    private collection = new Map<string, IFileInfo>();
    private watcher?: vscode.FileSystemWatcher;
    private timer?: NodeJS.Timer;

    public logFn: LogFunction;

    private mustBeLoaded = true;

    constructor(private scope: string | undefined, doWatch: boolean, logFn?: LogFunction) {
        // tslint:disable-next-line:no-empty
        this.logFn = logFn || (() => {});
        if (doWatch) {
            const storeFileName = this.storeFileName();
            if (storeFileName !== undefined) {
                this.watcher = vscode.workspace.createFileSystemWatcher(storeFileName, false, false, false);
                const reLoad = () => {
                    if (this.timer) {
                        clearTimeout(this.timer);
                    }
                    this.timer = setTimeout(() => this.load(), JvmProject.reLoadDelay);
                }
                this.watcher.onDidChange(reLoad);
                this.watcher.onDidCreate(reLoad);
                this.watcher.onDidDelete(() => {
                    this.collection = new Map<string, IFileInfo>();
                });
            }
        }
    }

    public dispose() {
        if (this.watcher) {
            this.watcher.dispose();
            this.watcher = undefined;
        }
    }

    private testIfLost() {
        if (this.mustBeLoaded && this.collection.size === 0) {
            this.mustBeLoaded = false;
            this.logFn(LogType.warning, 
                () => localize("javainfo.lost", "Java classes information is lost for [{0}]", String(this.scope))
                , true);
        }
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
        this.testIfLost();
        return fileInfo;
    }

    /**
     * Find file info by place = <class>.<method>
     * @param stackPlace 
     */
    public findFileByPlace(stackPlace: string) : IFileInfo | undefined {
        const methodPos = stackPlace.lastIndexOf(".");
        if (methodPos !== -1) {
            const methodName = stackPlace.substr(methodPos+1);
            const className = stackPlace.substr(0, methodPos);
            for (const [filename, fileinfo] of this.collection) {
                const classInfo = fileinfo.classes.get(className);
                if (classInfo) {
                    if (classInfo.methods.has(methodName)) {
                        return fileinfo;
                    }
                }
            }
        }
        this.testIfLost();
        return undefined;
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
                    methods: new Map<string, IMethodInfo>(),
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
        this.testIfLost();
        return undefined;
    }

    public getMethodInfo(methodName: string, classInfo?: IClassInfo) : IMethodInfo | undefined {
        let className = "";
        methodName = methodName.replace(/\//g, ".");
        const classNameEnd = methodName.lastIndexOf(".");
        if (classNameEnd !== -1) {
            className = methodName.substr(0, classNameEnd);
            methodName = methodName.substr(classNameEnd+1);
        }
        if (classInfo) {
            let methodInfo = classInfo.methods.get(methodName);
            if (!methodInfo) {
                methodInfo = {
                    methodName: methodName,
                    methodAccess: MethodAccess.public,
                    methodStatic: false,
                    methodType: "",
                    methodModifiers: [],
                    lines: new Set<number>(),
                };
                classInfo.methods.set(methodName, methodInfo);
            }
            return methodInfo;
        } else if (className) {
            for (const [fileName, fileInfo] of this.collection) {
                classInfo = fileInfo.classes.get(className);
                if (classInfo) {
                    return classInfo.methods.get(methodName);
                }
            }
        }
        this.testIfLost();
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
        this.testIfLost();
        return names;
    }

    public storeFileName() : string | undefined {
        if (this.scope && vscode.workspace.workspaceFolders) {
            const workspaceFolder = vscode.workspace.workspaceFolders.find(ws => ws.name === this.scope);
            if (workspaceFolder) {
                const fileName = path.join(workspaceFolder.uri.fsPath, `.vscode`, `javaInfo.json`);
                return fileName;
            }
        }
        this.testIfLost();
        return undefined;
    }

    public async save() {
        try {
            const storeFileName = this.storeFileName();
            if (storeFileName !== undefined) {
                // convert
                const jvmInfo: any[] = [];
                for(const [fileName, fileInfo] of this.collection) {
                    const data = [...fileInfo.classes.values()].
                        map(classInfo => {
                            const methods = [...classInfo.methods].map(([methodName, methodInfo]) => {
                                return {
                                    methodName,
                                    methodType: methodInfo.methodType,
                                    methodAccess:  methodInfo.methodAccess,
                                    methodStatic: methodInfo.methodStatic,
                                    methodModifiers: methodInfo.methodModifiers,
                                    lines: [...methodInfo.lines],
                                }
                            });
                            return {
                                className: classInfo.className,
                                hasMain: classInfo.hasMain,
                                methods: methods,
                            }
                        });
                    jvmInfo.push({
                        fileName,
                        classes: data,
                    });
                }
                const content = JSON.stringify(jvmInfo, null, 2);
                await fs.writeFile(storeFileName, content);    
                return true;
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
            const storeFileName = this.storeFileName();
            if (storeFileName !== undefined) {
                const contentBuffer = await fs.readFile(storeFileName);
                const content = contentBuffer.toString("utf8");
                const jvmInfo = JSON.parse(content);
                if (!(jvmInfo instanceof Array)) {
                    return false;
                }
                for (const fileInfoData of jvmInfo) {
                    if (fileInfoData === undefined || typeof fileInfoData.fileName !== "string") {
                        return false;
                    }
                    const fileInfo = this.getFileInfo(fileInfoData.fileName, true);
                    if (!(fileInfoData.classes instanceof Array)) {
                        continue;
                    }
                    for (const classInfoData of fileInfoData.classes) {
                        if (classInfoData === undefined || 
                            typeof classInfoData.className !== "string" ||
                            typeof classInfoData.hasMain !== "boolean" ||
                            !(classInfoData.methods instanceof Array)) {
                            continue;
                        }
                        const classInfo = this.getClassInfo(classInfoData.className, fileInfo);
                        if (classInfo === undefined) {
                            return false;
                        }
                        classInfo.hasMain = classInfoData.hasMain;  // 'hasMain' is useful only if class has source lines
                        for (const methodInfoData of classInfoData.methods) {
                            if (methodInfoData === undefined || 
                                typeof methodInfoData.methodName !== "string" ||
                                !(methodInfoData.lines instanceof Array)) {
                                    continue;
                            }
                            const methodInfo = this.getMethodInfo(methodInfoData.methodName, classInfo);
                            if (!methodInfo) {
                                continue;
                            }
                            if (isMethodAccess(methodInfoData.methodAccess)) {
                                methodInfo.methodAccess = methodInfoData.methodAccess;
                            }
                            if (typeof methodInfoData.methodStatic === "boolean") {
                                methodInfo.methodStatic = methodInfoData.methodStatic;
                            }
                            if (typeof methodInfoData.methodType === "string") {
                                methodInfo.methodType = methodInfoData.methodType;
                            }
                            if (methodInfoData.methodModifiers instanceof Array) {
                                methodInfo.methodModifiers = methodInfoData.methodModifiers;
                            }
                            for (const line of methodInfoData.lines) {
                                if (line && typeof line === "number") {
                                    methodInfo.lines.add(line);
                                }
                            }
                        }
                    }
                }
                this.mustBeLoaded = true;
                return true;
            }
        }
        catch(ex) {
            this.logFn(LogType.error, () => String(ex));
        }
        return false;
    }

}