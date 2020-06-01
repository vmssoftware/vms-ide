import * as nls from "vscode-nls";
import * as vscode from 'vscode';
import fs from "fs-extra";
import path from "path";
import { LogFunction, LogType } from '../common/main';
import { removeTemplate } from "../common/rgx-from-str";

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export enum FieldAccess {
    'public',
    'protected',
    'private',
};

export function isFieldAccess(o: any): o is FieldAccess {
    return Object.values(FieldAccess).includes(o);
}

export interface IFieldInfo {
    name: string;
    type: string;
    access: FieldAccess;
    isStatic: boolean;
    isMethod: boolean;
    template: string;
    modifiers: string[];
    params: string,
    /** valid source lines */
    lines: Set<number>,
    class: IClassInfo,
};

export interface IClassInfo {
    name: string;
    hasMain: boolean,
    /** name => IFieldInfo */
    fields: IFieldInfo[],
    file: IFileInfo,
};

export interface IFileInfo {
    name: string,
    /** name => IClassInfo */
    classes: Map<string, IClassInfo>,
};

export class JvmProject {

    public static reLoadDelay = 300;

    /** name => IFileInfo */
    private collection = new Map<string, IFileInfo>();
    private watcher?: vscode.FileSystemWatcher;
    private timer?: NodeJS.Timer;

    public logFn: LogFunction;

    private mustBeLoaded = true;

    /**************************************************************************
     * Static methods
    **************************************************************************/

    public static splitPlace(place: string) {
        let className = "";
        place = place.replace(/\//g, ".");
        const initPos = place.indexOf(".<init>");
        if (initPos !== -1) {
            // replace ".<init>" by the name of the class
            place = place.substr(0, initPos);
        }
        const classNameEnd = place.lastIndexOf(".");
        if (classNameEnd !== -1) {
            className = place.substr(0, classNameEnd);
            place = place.substr(classNameEnd+1);
            if (initPos !== -1) {
                // replace ".<init>" by the name of the class, now fieldName === className
                className += "." + place;
            }
        }
        return { className, fieldName: place};
    }

    public static methodForBreakpoint(method: IFieldInfo) {
        let place = "";
        // test if method is a constructor
        let className = method.class.name;
        const classPos = className.lastIndexOf(".");
        if (classPos !== -1) {
            className = className.substr(classPos+1);
        }
        if (className === method.name) {
            place += "<init>";
        } else {
            place += method.name;
        }
        // test if some of params are kind of templates
        if (method.params && method.params !== "()") {
            // 1. remove content inside triangle squares
            // 2. change all occurances of T in params to real class
            const cleanedParams = removeTemplate(method.params);
            if (method.template) {
                const templArray = removeTemplate(method.template.substr(1)).split(",");
                const mapType = new Map<string, string>();
                for(const templType of templArray) {
                    const pair = templType.split(" extends ");
                    if (pair.length == 2) {
                        mapType.set(pair[0], pair[1]);
                    } else {
                        mapType.set(pair[0], "java.lang.Object");
                    }
                }
                const rgxWord = /\w+/g;
                let matched = rgxWord.exec(cleanedParams);
                let fixedParams = "";
                let lastIndex = 0;
                while (matched) {
                    const replaceTo = mapType.get(matched[0]);
                    fixedParams += cleanedParams.substring(lastIndex, matched.index);
                    lastIndex = matched.index + matched[0].length;
                    if (replaceTo) {
                        fixedParams += replaceTo;
                    } else {
                        fixedParams += matched[0];
                    }
                    matched = rgxWord.exec(cleanedParams);
                }
                if (lastIndex < cleanedParams.length) {
                    fixedParams += cleanedParams.substr(lastIndex);
                }
                place += fixedParams;
            } else {
                place += cleanedParams;
            }
        }
        return place;
    }

    /**************************************************************************
     * Public methods
    **************************************************************************/

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

    /**
     * Find and return file info
     * @param fileName relative file name
     * @param add do add when info doesn't exist yet
     */
    public getFileInfo(fileName: string, add?: boolean) : IFileInfo | undefined {
        let fileInfo = this.collection.get(fileName);
        if (!fileInfo && add) {
            fileInfo = {
                name: fileName,
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
        let {className, fieldName} = JvmProject.splitPlace(stackPlace);
        if (className) {
            for (const [filename, fileinfo] of this.collection) {
                const classInfo = fileinfo.classes.get(className);
                if (classInfo) {
                    if (classInfo.fields.find(field => field.name === fieldName)) {
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
                    name: className,
                    hasMain: false,
                    fields: [],
                    file: fileInfo,
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

    public findMethods(method: string) {
        const methodInfos: IFieldInfo[] = [];
        let {className, fieldName} = JvmProject.splitPlace(method);
        fieldName = fieldName.toLowerCase();
        for (const [, fileInfo] of this.collection) {
            for (const [, classInfo] of fileInfo.classes) {
                if (!className || classInfo.name.endsWith(className)) {
                    for (const methodInfo of classInfo.fields) {
                        if (methodInfo.isMethod === true &&
                            methodInfo.name.toLowerCase().includes(fieldName)) {
                            methodInfos.push(methodInfo);
                        }
                    }
                }
            }
        }
        return methodInfos;
    }

    public getFieldInfo(place: string, classInfo?: IClassInfo, params?: string) : IFieldInfo | undefined {
        let {className, fieldName} = JvmProject.splitPlace(place);
        if (classInfo) {
            let fieldInfo = classInfo.fields.find(field => field.name === fieldName && (params? field.params === params : true));
            if (!fieldInfo) {
                // some of this properties must be filled later
                fieldInfo = {
                    name: fieldName,
                    access: FieldAccess.public,
                    isStatic: false,
                    isMethod: params !== "",
                    type: "",
                    template: "",
                    params: params || "",
                    modifiers: [],
                    lines: new Set<number>(),
                    class: classInfo,
                };
                classInfo.fields.push(fieldInfo);
            }
            return fieldInfo;
        } else if (className) {
            for (const [fileName, fileInfo] of this.collection) {
                classInfo = fileInfo.classes.get(className);
                if (classInfo) {
                    return classInfo.fields.find(field => field.name === fieldName && (params? field.params === params : true));
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
                            const fields = [...classInfo.fields].map(info => {
                                return {
                                    name: info.name,
                                    type: info.type,
                                    access:  info.access,
                                    isStatic: info.isStatic,
                                    isMethod: info.isMethod,
                                    template: info.template,
                                    params: info.params,
                                    modifiers: info.modifiers,
                                    lines: [...info.lines],
                                }
                            });
                            return {
                                className: classInfo.name,
                                hasMain: classInfo.hasMain,
                                fields: fields,
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
                            !(classInfoData.fields instanceof Array)) {
                            continue;
                        }
                        const classInfo = this.getClassInfo(classInfoData.className, fileInfo);
                        if (classInfo === undefined) {
                            return false;
                        }
                        classInfo.hasMain = classInfoData.hasMain;  // 'hasMain' is useful only if class has source lines
                        for (const fieldInfoData of classInfoData.fields) {
                            if (fieldInfoData === undefined ||
                                typeof fieldInfoData.name !== "string" ||
                                !(fieldInfoData.lines instanceof Array)) {
                                    continue;
                            }
                            let params = "";
                            if (typeof fieldInfoData.params === "string") {
                                params = fieldInfoData.params;
                            }
                            const fieldInfo = this.getFieldInfo(fieldInfoData.name, classInfo, params);
                            if (!fieldInfo) {
                                continue;
                            }
                            if (isFieldAccess(fieldInfoData.access)) {
                                fieldInfo.access = fieldInfoData.access;
                            }
                            if (typeof fieldInfoData.isStatic === "boolean") {
                                fieldInfo.isStatic = fieldInfoData.isStatic;
                            }
                            if (typeof fieldInfoData.isMethod === "boolean") {
                                fieldInfo.isMethod = fieldInfoData.isMethod;
                            }
                            if (typeof fieldInfoData.type === "string") {
                                fieldInfo.type = fieldInfoData.type;
                            }
                            if (typeof fieldInfoData.template === "string") {
                                fieldInfo.template = fieldInfoData.template;
                            }
                            fieldInfo.params = params;
                            if (fieldInfoData.modifiers instanceof Array) {
                                fieldInfo.modifiers = fieldInfoData.modifiers;
                            }
                            for (const line of fieldInfoData.lines) {
                                if (line && typeof line === "number") {
                                    fieldInfo.lines.add(line);
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

    /**************************************************************************
     * Private methods
    **************************************************************************/

    private testIfLost() {
        if (this.mustBeLoaded && this.collection.size === 0) {
            this.mustBeLoaded = false;
            this.logFn(LogType.warning,
                () => localize("javainfo.lost", "Could not locate Java classes information for [{0}].", String(this.scope))
                , true);
        }
    }

}