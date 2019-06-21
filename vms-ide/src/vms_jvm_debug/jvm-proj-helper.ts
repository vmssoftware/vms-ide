import path from "path";
import * as vscode from 'vscode';
import { Builder } from "../synchronizer/build/builder";
import { ensureSettings, IEnsured } from '../synchronizer/ensure-settings';
import { ProjectState } from '../synchronizer/dep-tree/proj-state';
import { ProjectType } from '../synchronizer/config/sections/project';
import { IJvmDebugConfiguration } from './jvm-config';
import { JvmProject } from "./jvm-project";
import { LogFunction, ftpPathSeparator } from "../common/main";
import { workspace } from "vscode";
import { Synchronizer } from "../synchronizer/sync/synchronizer";
import { ISource } from "../synchronizer/sync/source";
import { VmsPathConverter } from "../synchronizer/vms/vms-path-converter";

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
                const jvmProject = new JvmProject(scope, this.logFn);
                const [loaded, localSource] = await Promise.all([
                    jvmProject.load(),
                    Synchronizer.acquire(this.logFn).requestSource(ensured, "local")
                ]);
                if (loaded && localSource) {
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
            scope = await vscode.commands.executeCommand("vmssoftware.synchronizer.getCurrentScope");
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
            scope = await vscode.commands.executeCommand("vmssoftware.synchronizer.getCurrentScope");
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
            scope = await vscode.commands.executeCommand("vmssoftware.synchronizer.getCurrentScope");
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
                            port: 5005,
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
            scope = await vscode.commands.executeCommand("vmssoftware.synchronizer.getCurrentScope");
        }
        if (scope && typeof scope === "string") {
            const scopedata = await this.chooseScope(scope);
            if (scopedata) {
                const found = await scopedata.localSource.findFiles("**/" + remoteFile);
                if (found.length === 1) {
                    return path.join(scopedata.localSource.root!, found[0].filename);
                }
            }
        }
        return undefined;
    }

    public static async cdRemoteRoot(scope?: string) {
        if (!scope) {
            scope = await vscode.commands.executeCommand("vmssoftware.synchronizer.getCurrentScope");
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
        if (!scope) {
            scope = await vscode.commands.executeCommand("vmssoftware.synchronizer.getCurrentScope");
        }
        if (scope && typeof scope === "string") {
            const scopedata = await this.chooseScope(scope);
            if (scopedata) {
                if (scopedata.ensured.projectSection.projectType === ProjectType[ProjectType.scala]) {
                    return className + "$";
                }
            }
        }
        return className;
    }

}