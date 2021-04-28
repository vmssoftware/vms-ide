import * as nls from "vscode-nls";
import * as vscode from "vscode";
import { GetSshHelperType } from "../../ext-api/ext-api";
import { ISshScopeSettings } from "../../ssh-helper/api";
import { ensureSettings } from "../ensure-settings";
import { ISyncScopeSettings } from "../sync/sync-api";
import { ProjDepTree } from "./proj-dep-tree";
import { ProjectState, SourceState } from "./proj-state";
import { QuickPickOptions } from "vscode";

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

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
    buildName,
    sourceState,
    buildState,
    masters,
}

export enum KnownBuildType {
    debug = "DEBUG",
    release = "RELEASE",
}

export class ProjDescrProvider implements vscode.TreeDataProvider<string> {

    public static readonly cmdChangeBuildName = "vmssoftware.project-dep.projectDescription.changeBuildName";
    public static readonly cmdEditSync = "vmssoftware.synchronizer.editProject";
    public static readonly cmdEditSsh = "vmssoftware.ssh-helper.editSettings";

    public readonly onDidChangeTreeData: vscode.Event<string | undefined>;
    public selectedProject?: string;
    public syncScopeSettings?: ISyncScopeSettings;
    public sshScopeSettings?: ISshScopeSettings;

    private didChangeTreeEmitter: vscode.EventEmitter<string | undefined> = new vscode.EventEmitter<string | undefined>();

    constructor() {
        this.onDidChangeTreeData = this.didChangeTreeEmitter.event;
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
            return new vscode.TreeItem(localize("SSH", "SSH"), vscode.TreeItemCollapsibleState.Expanded);
        }
        if (element === Fields[Fields.ProjectFields] && this.syncScopeSettings) {
            return new vscode.TreeItem(localize("Project", "Project"), vscode.TreeItemCollapsibleState.Expanded);
        }
        if (element === Fields[Fields.CommonFields]) {
            return new vscode.TreeItem(localize("Local", "Local"), vscode.TreeItemCollapsibleState.Expanded);
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
            case CommonFields[CommonFields.buildName]:
                data = ProjectState.acquire().getDefBuildName();
                break;
            case CommonFields[CommonFields.sourceState]:
                data = localize("unknown", "Unknown");
                switch (ProjectState.acquire().sourceState(this.selectedProject)) {
                    case SourceState.modified:
                        data = localize("modified", "Modified");
                        break;
                    case SourceState.synchronized:
                        data = localize("synchronized", "Synchronized");
                        break;
                }
                break;
            case CommonFields[CommonFields.buildState]:
                data = ProjectState.acquire().isBuilt(this.selectedProject, ProjectState.acquire().getDefBuildName()) 
                    ? localize("built", "Built")
                    : localize("not.built", "Not built");
                break;
            case CommonFields[CommonFields.masters]:
                data = new ProjDepTree().getMasterList(this.selectedProject).join(" => ");
                break;
        }
        const item = new vscode.TreeItem(`${element}: ${data}`, vscode.TreeItemCollapsibleState.None);
        if (editable) {
            item.contextValue = "editable";
        }
        if (element === CommonFields[CommonFields.buildName]) {
            item.contextValue = "buildName";
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

    /**
     * Collect build labels which are present in each workspace folder
     * Select one of them
     */
    public async changeBuildName() {
        if (!vscode.workspace.workspaceFolders || 
             vscode.workspace.workspaceFolders.length === 0 ||
             !this.syncScopeSettings) {
            return;
        }
        let buildNames = new Set<string>(this.syncScopeSettings.buildsSection.configurations.map(cfg => cfg.label));
        for (const ws of vscode.workspace.workspaceFolders) {
            const ws_settings = await ensureSettings(ws.name);
            if (ws_settings) {
                let intersection = new Set<string>();
                for (const cfg of ws_settings.buildsSection.configurations) {
                    if (buildNames.has(cfg.label)) {
                        intersection.add(cfg.label);
                    }
                }
                buildNames = intersection;
            }
        }
        if (buildNames.size) {
            const opt: QuickPickOptions = {
                canPickMany: false,
                placeHolder: localize("select.buildName", "Select build configuration"),
                ignoreFocusOut: true,
            };
            const newBuildName = await vscode.window.showQuickPick([...buildNames], opt);
            if (newBuildName) {
                ProjectState.acquire().setDefBuildName(newBuildName).then(() => {
                    this.didChangeTreeEmitter.fire();
                });
            }
        }
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
