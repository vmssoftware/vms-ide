import path from "path";
import * as vscode from 'vscode';
import { Builder } from "../synchronizer/build/builder";
import { ensureSettings } from '../synchronizer/ensure-settings';
import { ProjectState } from '../synchronizer/dep-tree/proj-state';
import { ProjectType } from '../synchronizer/config/sections/project';
import { IJvmDebugConfiguration } from './jvm-config';
import { JvmProject } from "./jvm-project";
import { LogFunction } from "../common/main";

export class JvmProjectHelper {

    public static logFn: LogFunction;

    public static async getClassPath(scope?: string) {
        if (!scope) {
            scope = await vscode.commands.executeCommand("vmssoftware.synchronizer.getCurrentScope");
        }
        if (scope && typeof scope === "string") {
            const ensured = await ensureSettings(scope, JvmProjectHelper.logFn);
            if (ensured) {
                const buildName = ProjectState.acquire().getDefBuildName();
                return Builder.acquire().getClassPath(ensured, buildName);
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
            const jvmProject = new JvmProject(scope, JvmProjectHelper.logFn);
            if (await jvmProject.load()) {
                return jvmProject.getExecutableClassNames();
            }
        }
        return classNames;
    }

    public static async getDefaultDebugConfiguration(scope?: string): Promise<IJvmDebugConfiguration | undefined> {
        if (!scope) {
            scope = await vscode.commands.executeCommand("vmssoftware.synchronizer.getCurrentScope");
        }
        if (scope && typeof scope === "string") {
            const ensured = await ensureSettings(scope, JvmProjectHelper.logFn);
            if (ensured) {
                switch (ensured.projectSection.projectType) {
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

    // public static localFile(remoteFile: string) {
    //     if (this._ensured && this._ensured.scope && workspace.workspaceFolders) {
    //         for (const ws of workspace.workspaceFolders) {
    //             if (ws.name === this._ensured.scope) {
    //                 return path.join(ws.uri.fsPath, remoteFile);
    //             }
    //         }
    //     }
    //     return remoteFile;
    // }

}