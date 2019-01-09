import * as vscode from "vscode";
import { ensureSettings } from "../ensure-settings";
import { ISshScopeSettings } from "../ext-api/api";
import { GetSshHelperType } from "../ext-api/get-ssh-helper";
import { ISyncScopeSettings } from "../sync/sync-api";
import { ProjDepTree } from "./proj-dep-tree";
import { ProjectState } from "./proj-state";

export enum ContextType {
    sync = "sync",
    ssh = "ssh",
    none = "none",
}

export enum Fields {
    CommonFields,
    SshFields,
    ProjectFields,
}

export enum SshFields {
    host,
}

export enum ProjectFields {
    projectName,
    projectType,
    root,
}

export enum CommonFields {
    folder,
    buildType,
    sourceState,
    bildState,
    masters,
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
        const retArray: string[] = [];
        if (!element && this.selectedProject) {
            const scope = this.selectedProject;
            const sshHelperType = await GetSshHelperType();
            this.syncScopeSettings = await ensureSettings(scope);
            if (sshHelperType) {
                const sshHelper = new sshHelperType();
                this.sshScopeSettings = await sshHelper.getSettings(scope);
            }
            for (const val in Fields) {
                if (typeof Fields[val] === "string") {
                    retArray.push(Fields[val]);
                }
            }
        }
        if (element === Fields[Fields.SshFields] && this.sshScopeSettings) {
            for (const val in SshFields) {
                if (typeof SshFields[val] === "string") {
                    retArray.push(SshFields[val]);
                }
            }
        }
        if (element === Fields[Fields.ProjectFields] && this.syncScopeSettings) {
            for (const val in ProjectFields) {
                if (typeof ProjectFields[val] === "string") {
                    retArray.push(ProjectFields[val]);
                }
            }
        }
        if (element === Fields[Fields.CommonFields]) {
            for (const val in CommonFields) {
                if (typeof CommonFields[val] === "string") {
                    retArray.push(CommonFields[val]);
                }
            }
        }
        return retArray;
    }

    public getTreeItem(element: string): vscode.TreeItem | Thenable<vscode.TreeItem> {
        if (!this.selectedProject) {
            return new vscode.TreeItem(element, vscode.TreeItemCollapsibleState.None);
        }
        if (element === Fields[Fields.SshFields] && this.sshScopeSettings) {
            return new vscode.TreeItem(`SSH`, vscode.TreeItemCollapsibleState.Expanded);
        }
        if (element === Fields[Fields.ProjectFields] && this.syncScopeSettings) {
            return new vscode.TreeItem(`Project`, vscode.TreeItemCollapsibleState.Expanded);
        }
        if (element === Fields[Fields.CommonFields]) {
            return new vscode.TreeItem(`Local`, vscode.TreeItemCollapsibleState.Expanded);
        }
        let data = "";
        let editable = false;
        switch (element) {
            case SshFields[SshFields.host]:
                if (this.sshScopeSettings) {
                    data = this.resolveHost(this.sshScopeSettings.connectionSection.host);
                    editable = true;
                }
                break;
            case ProjectFields[ProjectFields.projectName]:
                if (this.syncScopeSettings) {
                    data = this.syncScopeSettings.projectSection.projectName;
                    editable = true;
                }
                break;
            case ProjectFields[ProjectFields.projectType]:
                if (this.syncScopeSettings) {
                    data = this.syncScopeSettings.projectSection.projectType;
                    editable = true;
                }
                break;
            case ProjectFields[ProjectFields.root]:
                if (this.syncScopeSettings) {
                    data = this.syncScopeSettings.projectSection.root;
                    editable = true;
                }
                break;
            case CommonFields[CommonFields.folder]:
                data = this.selectedProject;
                break;
            case CommonFields[CommonFields.buildType]:
                data = this.buildType;
                break;
            case CommonFields[CommonFields.sourceState]:
                // TODO: i18n
                data = ProjectState.acquire().isSynchronized(this.selectedProject) ? "synchronized" : "modified";
                break;
            case CommonFields[CommonFields.bildState]:
                // TODO: i18n
                data = ProjectState.acquire().isBuilt(this.selectedProject, this.buildType) ? "built" : "not built";
                break;
            case CommonFields[CommonFields.masters]:
                data = new ProjDepTree().getMasterList(this.selectedProject).join(" => ");
                break;
        }
        const item = new vscode.TreeItem(`${element}: ${data}`, vscode.TreeItemCollapsibleState.None);
        if (editable) {
            item.contextValue = "editable";
        }
        if (element === CommonFields[CommonFields.buildType]) {
            item.tooltip = "Click to change build type";
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
        if (element in SshFields) {
            vscode.commands.executeCommand(ProjDescrProvider.cmdEditSsh, this.selectedProject);
        } else if (element in ProjectFields) {
            vscode.commands.executeCommand(ProjDescrProvider.cmdEditSync, this.selectedProject);
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
