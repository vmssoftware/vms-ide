import * as vscode from "vscode";
import { ISshScopeSettings } from "./ext-api/api";
import { GetSshHelperType } from "./ext-api/get-ssh-helper";
import { GetSyncApi } from "./ext-api/get-sync-api";
import { ISyncScopeSettings } from "./ext-api/sync-api";
import { ProjDepTree } from "./proj-dep-tree";
import { ProjectState } from "./proj-state";

export enum ContextType {
    sync = "sync",
    ssh = "ssh",
    none = "none",
}

export enum Fields {
    folder = "folder",
    projectName = "projectName",
    host = "host",
    root = "root",
    buildType = "buildType",
    sourceState = "sourceState",
    bildState = "buildState",
    masters = "masters",
}

export enum BuildType {
    debug = "DEBUG",
    release = "RELEASE",
}

export class ProjDescrProvider implements vscode.TreeDataProvider<string> {

    public static readonly cmdChangeBuildType = "vmssoftware.project-dep.projectDescription.changeBuildType";
    public static readonly cmdEditSync = "vmssoftware.synchronizer.editProject";
    public static readonly cmdEditSsh = "vmssoftware.ssh-helper.editSettings";
    public static readonly configBuildTypeSection = "buildType";

    public readonly onDidChangeTreeData: vscode.Event<string | undefined>;
    public selectedProject?: string;
    public syncScopeSettings?: ISyncScopeSettings;
    public sshScopeSettings?: ISshScopeSettings;
    public buildType: BuildType = BuildType.debug;

    private didChangeTreeEmitter: vscode.EventEmitter<string | undefined> = new vscode.EventEmitter<string | undefined>();

    constructor() {
        this.onDidChangeTreeData = this.didChangeTreeEmitter.event;
        const config = vscode.workspace.getConfiguration(ProjDepTree.configName, null);
        switch (config.get(ProjDescrProvider.configBuildTypeSection)) {
            case BuildType.release:
                this.buildType = BuildType.release;
                break;
            default:
                this.buildType = BuildType.debug;
                break;
        }
    }

    public async getChildren(element?: string | undefined): Promise<string[]> {
        if (element || !this.selectedProject) {
            return [];
        }
        const scope = this.selectedProject;
        const [syncApi, sshHelperType] = await Promise.all(
            [   GetSyncApi(),
                GetSshHelperType(),
            ]);
        if (syncApi) {
            this.syncScopeSettings = await syncApi.getSettings(scope);
        }
        if (sshHelperType) {
            const sshHelper = new sshHelperType();
            this.sshScopeSettings = await sshHelper.getSettings(scope);
        }
        const retArray: string[] = [Fields.folder];
        if (this.sshScopeSettings) {
            retArray.push(Fields.host);
        }
        if (this.syncScopeSettings) {
            retArray.push(Fields.projectName);
            retArray.push(Fields.root);
        }
        retArray.push(Fields.buildType);
        retArray.push(Fields.sourceState);
        retArray.push(Fields.bildState);
        retArray.push(Fields.masters);
        return retArray;
    }

    public getTreeItem(element: string): vscode.TreeItem | Thenable<vscode.TreeItem> {
        if (!this.selectedProject) {
            return new vscode.TreeItem(element, vscode.TreeItemCollapsibleState.None);
        }
        let data = "";
        switch (element) {
            case Fields.folder:
                data = this.selectedProject;
                break;
            case Fields.projectName:
                if (this.syncScopeSettings) {
                    data = this.syncScopeSettings.projectSection.projectName;
                }
                break;
            case Fields.host:
                if (this.sshScopeSettings) {
                    data = this.resolveHost(this.sshScopeSettings.connectionSection.host);
                }
                break;
            case Fields.root:
                if (this.syncScopeSettings) {
                    data = this.syncScopeSettings.projectSection.root;
                }
                break;
            case Fields.buildType:
                data = this.buildType;
                break;
            case Fields.sourceState:
                // TODO: i18n
                data = ProjectState.acquire().isSynchronized(this.selectedProject) ? "synchronized" : "modified";
                break;
            case Fields.bildState:
                // TODO: i18n
                data = ProjectState.acquire().isBuilt(this.selectedProject, this.buildType) ? "built" : "not built";
                break;
            case Fields.masters:
                data = new ProjDepTree().getMasterList(this.selectedProject).join(" : ");
                break;
        }
        const item = new vscode.TreeItem(`${element}: ${data}`, vscode.TreeItemCollapsibleState.None);
        if (element === Fields.buildType) {
            item.command = {
                arguments: [],
                command: ProjDescrProvider.cmdChangeBuildType,
                title: "",
            };
        }
        return item;
    }

    public select(project: string) {
        this.selectedProject = project;
        this.didChangeTreeEmitter.fire();
    }

    public refresh() {
        this.didChangeTreeEmitter.fire();
    }

    public edit(element: string) {
        switch (element) {
            case Fields.folder:
            case Fields.projectName:
            case Fields.root:
                vscode.commands.executeCommand(ProjDescrProvider.cmdEditSync, this.selectedProject);
                break;
            case Fields.host:
                vscode.commands.executeCommand(ProjDescrProvider.cmdEditSsh, this.selectedProject);
                break;
        }
    }

    public changeBuildType() {
        if (this.buildType === BuildType.debug) {
            this.buildType = BuildType.release;
        } else {
            this.buildType = BuildType.debug;
        }
        const config = vscode.workspace.getConfiguration(ProjDepTree.configName, null);
        config.update(ProjDescrProvider.configBuildTypeSection, this.buildType, false);
        this.didChangeTreeEmitter.fire();
    }

    public resolveHost(host: string) {
        if (this.sshScopeSettings) {
            const result = this.sshScopeSettings.connectConfigResolver.testConnectConfig(this.sshScopeSettings.connectionSection);
            if (result.settings) {
                return result.settings.host;
            }
        }
        return host;
    }
}
