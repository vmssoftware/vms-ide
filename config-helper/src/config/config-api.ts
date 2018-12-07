import { LogFunction, LogType } from "@vorfol/common";
import * as vscode from "vscode";
import { createLogFunction } from "../log";
import { IConfigApi, IConfigHelper } from "./config";
import { FSConfigHelper } from "./fs-config-helper";
import { VFSConfigHelper } from "./vfs-config-helper";
import { VSCConfigHelper } from "./vsc-config-helper";

import * as nls from "vscode-nls";
nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export class ConfigApi implements IConfigApi {

    private static instances: Map<string, IConfigHelper> = new Map<string, IConfigHelper>();

    constructor(protected logFn: LogFunction) {
    }

    public getConfigHelper(extension: string, scope?: string) {
        const workspaceFolder = this.getWorkspaceFolder(scope);
        const key = `${scope}:${extension}`;
        let retConfigHelper = ConfigApi.instances.get(key);
        if (retConfigHelper) {
            return retConfigHelper;
        }
        if (workspaceFolder === undefined) {
            retConfigHelper = new VSCConfigHelper(undefined, extension, this.logFn);
            this.logFn(LogType.information, () => localize("message.created", "{0} created", "VSC"));
        } else {
            // Note: each folder in workspace have to define "using" field in "vmssoftware.config-helper.settings" section of VS Code configuration
            const config = vscode.workspace.getConfiguration("vmssoftware.config-helper.settings", workspaceFolder.uri);
            const using = config.get<string>("using");
            switch (using) {
                case "FS":
                    retConfigHelper = new FSConfigHelper(workspaceFolder, extension, this.logFn);
                    this.logFn(LogType.information, () => localize("message.created", "{0} created", "FS"));
                    break;
                case "VFS":
                    retConfigHelper = new VFSConfigHelper(workspaceFolder, extension, this.logFn);
                    this.logFn(LogType.information, () => localize("message.created", "{0} created", "VFS"));
                    break;
                default:
                    retConfigHelper = new VSCConfigHelper(workspaceFolder, extension, this.logFn);
                    this.logFn(LogType.information, () => localize("message.created", "{0} created", "VSC"));
                    break;
            }
        }
        ConfigApi.instances.set(key, retConfigHelper!);
        return retConfigHelper;
    }

    public createLogFunction(channelName: string): LogFunction {
        return createLogFunction(channelName);
    }

    private getWorkspaceFolder(scope?: string) {
        if (scope !== undefined) {
            if (vscode.workspace.workspaceFolders) {
                for (const workspace of vscode.workspace.workspaceFolders) {
                    if (scope === workspace.name) {
                        this.logFn(LogType.debug, () => `Found workspace for scope "${scope}"`);
                        return  workspace;
                    }
                }
            }
        }
        if (vscode.workspace.workspaceFolders && vscode.workspace.workspaceFolders.length === 1) {
            this.logFn(LogType.debug, () => `Workspace not found, set just first`);
            return  vscode.workspace.workspaceFolders[0];
        }
        this.logFn(LogType.debug, () => `No workspace found`);
        return undefined;
    }
}
