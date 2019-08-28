import * as nls from "vscode-nls";
import path from "path";
import { Builder } from "../synchronizer/build/builder";
import { ensureSettings, IEnsured } from '../synchronizer/ensure-settings';
import { ProjectState } from '../synchronizer/dep-tree/proj-state';
import { ProjectType } from '../synchronizer/config/sections/project';
import { IJvmDebugConfiguration } from './jvm-config';
import { JvmProject, IFieldInfo } from "./jvm-project";
import { LogFunction, ftpPathSeparator, LogType } from "../common/main";
import { workspace, Uri, commands } from "vscode";
import { Synchronizer } from "../synchronizer/sync/synchronizer";
import { ISource } from "../synchronizer/sync/source";
import { VmsPathConverter } from "../synchronizer/vms/vms-path-converter";

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

interface IScope {
    ensured: IEnsured;
    jvmProject: JvmProject;
    localSource: ISource;
};

export class JvmProjectHelper {

    public static logFn: LogFunction;

    private static scopes: Map<string, IScope> = new Map<string, IScope>();
    private static lastScope?: string;

    public static async chooseScope(scope?: string) {
        scope = scope || this.lastScope;
        if (!scope) {
            return undefined;
        }
        let scopedata = this.scopes.get(scope);
        if (!scopedata) {
            const ensured = await ensureSettings(scope, this.logFn);
            if (ensured) {
                const jvmProject = new JvmProject(scope, true, this.logFn);
                const [loaded, localSource] = await Promise.all([
                    jvmProject.load(),
                    Synchronizer.acquire().requestSource(ensured, "local")
                ]);
                if (localSource) {
                    scopedata = {
                        ensured,
                        jvmProject,
                        localSource
                    };
                    this.scopes.set(scope, scopedata);
                }
            }
        }
        this.lastScope = scope;
        return scopedata;
    }

    public static async getClassPath(scope?: string) {
        if (!scope) {
            scope = await commands.executeCommand("vmssoftware.synchronizer.getCurrentScope");
        }
        if (scope && typeof scope === "string") {
            const scopedata = await this.chooseScope(scope);
            if (scopedata) {
                const buildName = ProjectState.acquire().getDefBuildName();
                return Builder.acquire().getClassPath(scopedata.ensured, buildName);
            }
        }
        return "";
    }

    public static async getExecutableClassNames(scope?: string) {
        const classNames: string[] = [];
        if (!scope) {
            scope = await commands.executeCommand("vmssoftware.synchronizer.getCurrentScope");
        }
        if (scope && typeof scope === "string") {
            const scopedata = await this.chooseScope(scope);
            if (scopedata) {
                return scopedata.jvmProject.getExecutableClassNames();
            }
        }
        return classNames;
    }

    public static async getDefaultDebugConfiguration(scope?: string): Promise<IJvmDebugConfiguration | undefined> {
        if (!scope) {
            scope = await commands.executeCommand("vmssoftware.synchronizer.getCurrentScope");
        }
        if (scope && typeof scope === "string") {
            const scopedata = await this.chooseScope(scope);
            if (scopedata) {
                switch (scopedata.ensured.projectSection.projectType) {
                    case ProjectType[ProjectType.java]:
                    case ProjectType[ProjectType.kotlin]:
                    case ProjectType[ProjectType.scala]:
                        return {
                            type: "vms jvm debugger",
                            request: "launch",
                            name: "Launch JVM",
                            classpath: "${command:FillClassPath}",
                            class: "${command:FillClassName}",
                            port: "5005-5105",
                            arguments: "",
                            stopOnEntry: true,
                            scope: scope,
                        };
                }
            }
        }
        return undefined;
    }

    public static async localFile(remoteFile: string, scope?: string) {
        if (!scope) {
            scope = await commands.executeCommand("vmssoftware.synchronizer.getCurrentScope");
        }
        if (scope && typeof scope === "string") {
            const scopedata = await this.chooseScope(scope);
            if (scopedata) {
                const found = await scopedata.localSource.findFiles("**/" + remoteFile);
                if (found && found.length === 1) {
                    return path.join(scopedata.localSource.root!, found[0].filename);
                }
            }
        }
        if (workspace.workspaceFolders) {
            for (const wsFolder of workspace.workspaceFolders) {
                if (wsFolder.name !== scope) {
                    const scopedataT = await this.chooseScope(wsFolder.name);
                    if (scopedataT) {
                        const found = await scopedataT.localSource.findFiles("**/" + remoteFile);
                        if (found && found.length === 1) {
                            return path.join(scopedataT.localSource.root!, found[0].filename);
                        }
                    }
                }
            }
        }
        return undefined;
    }

    public static async localFileByPlace(stackPlace: string, scope?: string) {
        if (!scope) {
            scope = await commands.executeCommand("vmssoftware.synchronizer.getCurrentScope");
        }
        if (scope && typeof scope === "string") {
            const scopedata = await this.chooseScope(scope);
            if (scopedata) {
                const fileInfo = scopedata.jvmProject.findFileByPlace(stackPlace);
                if (fileInfo) {
                    const found = await scopedata.localSource.findFiles("**/" + fileInfo.name);
                    if (found && found.length === 1) {
                        return path.join(scopedata.localSource.root!, found[0].filename);
                    }
                }
            }
        }
        if (workspace.workspaceFolders) {
            for (const wsFolder of workspace.workspaceFolders) {
                if (wsFolder.name !== scope) {
                    const scopedataT = await this.chooseScope(wsFolder.name);
                    if (scopedataT) {
                        const fileInfo = scopedataT.jvmProject.findFileByPlace(stackPlace);
                        if (fileInfo) {
                            const found = await scopedataT.localSource.findFiles("**/" + fileInfo.name);
                            if (found && found.length === 1) {
                                return path.join(scopedataT.localSource.root!, found[0].filename);
                            }
                        }
                    }
                }
            }
        }
        return undefined;
    }

    public static async methodInfoByPlace(stackPlace: string, scope?: string) {
        if (!scope) {
            scope = await commands.executeCommand("vmssoftware.synchronizer.getCurrentScope");
        }
        if (scope && typeof scope === "string") {
            const scopedata = await this.chooseScope(scope);
            if (scopedata) {
                const methodInfo = scopedata.jvmProject.getFieldInfo(stackPlace);
                if (methodInfo) {
                    return methodInfo;
                }
            }
            if (workspace.workspaceFolders) {
                for (const wsFolder of workspace.workspaceFolders) {
                    if (wsFolder.name !== scope) {
                        const scopedataT = await this.chooseScope(wsFolder.name);
                        if (scopedataT) {
                            const methodInfo = scopedataT.jvmProject.getFieldInfo(stackPlace);
                            if (methodInfo) {
                                return methodInfo;
                            }
                        }
                    }
                }
            }
        }
        return undefined;
    }

    public static async findMethods(method: string, scope?: string) {
        const methodInfos: IFieldInfo[] = [];
        if (workspace.workspaceFolders) {
            for (const wsFolder of workspace.workspaceFolders) {
                if (!scope || wsFolder.name === scope) {
                    const scopedataT = await this.chooseScope(wsFolder.name);
                    if (scopedataT) {
                        methodInfos.push(...scopedataT.jvmProject.findMethods(method));
                    }
                }
            }
        }
        return methodInfos;
    }

    public static async cdRemoteRoot(scope?: string) {
        if (!scope) {
            scope = await commands.executeCommand("vmssoftware.synchronizer.getCurrentScope");
        }
        if (scope && typeof scope === "string") {
            const scopedata = await this.chooseScope(scope);
            if (scopedata) {
                const vmsPath = new VmsPathConverter(scopedata.ensured.projectSection.root + ftpPathSeparator);
                return `set def ${vmsPath.directory}`;
            }
        }
        return "";
    }

    public static async stopOnEntryClass(className: string, scope?: string) {
        if (!className.endsWith('$')) {
            if (!scope) {
                scope = await commands.executeCommand("vmssoftware.synchronizer.getCurrentScope");
            }
            if (scope && typeof scope === "string") {
                const scopedata = await this.chooseScope(scope);
                if (scopedata) {
                    if (scopedata.ensured.projectSection.projectType === ProjectType[ProjectType.scala]) {
                        return className + "$";
                    }
                }
            }
        }
        return className;
    }

    public static async getBreakPointByFileLine(fileName: string | undefined, line: number): Promise<[string?, number?]> {
        if (fileName) {
            const uri = Uri.file(fileName);
            const wsFolder = workspace.getWorkspaceFolder(uri);
            if (wsFolder) {
                const scopedata = await this.chooseScope(wsFolder.name);
                if (scopedata) {
                    const relativePath = path.basename(fileName);
                    const fileInfo = scopedata.jvmProject.getFileInfo(relativePath);
                    if (fileInfo) {
                        for (const [classname, classinfo] of fileInfo.classes) {
                            for(const methodInfo of classinfo.fields) {
                                if (methodInfo.lines.has(line)) {
                                    return [classname, line];
                                }
                            }
                        }
                        let nearestClass = "";
                        let nearestLine = Number.MAX_SAFE_INTEGER;
                        for (const [classname, classinfo] of fileInfo.classes) {
                            for(const methodInfo of classinfo.fields) {
                                for (const classLine of methodInfo.lines) {
                                    if (classLine > line && classLine < nearestLine) {
                                        nearestLine = classLine;
                                        nearestClass = classname;
                                        if (nearestLine === line + 1) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        if (nearestLine !== Number.MAX_SAFE_INTEGER) {
                            this.logFn(LogType.information, 
                                () => localize("breakpoint.no.line", "Cannot set breakpoint at {0}:{1} -> move to {2}", fileName, line, nearestLine));
                            return [nearestClass, nearestLine];
                        }
                        this.logFn(LogType.information, 
                            () => localize("breakpoint.no.line", "Cannot set breakpoint at {0}:{1} -> disabled", fileName, line));
                    }
                }    
            }
        }
        return [undefined, undefined];
    }

}