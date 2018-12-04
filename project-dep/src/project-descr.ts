import * as vscode from "vscode";
import { ISshScopeSettings } from "./ext-api/api";
import { GetSshHelperType } from "./ext-api/get-ssh-helper";
import { GetSyncApi } from "./ext-api/get-sync-api";
import { ISyncScopeSettings } from "./ext-api/sync-api";

export class ProjDescrProvider implements vscode.TreeDataProvider<string> {

    public readonly onDidChangeTreeData: vscode.Event<string | undefined>;
    public selectedProject?: string;
    public syncScopeSettings?: ISyncScopeSettings;
    public sshScopeSettings?: ISshScopeSettings;
    public buildType = "DEBUG";

    private didChangeTreeEmitter: vscode.EventEmitter<string | undefined> = new vscode.EventEmitter<string | undefined>();

    constructor() {
        this.onDidChangeTreeData = this.didChangeTreeEmitter.event;
    }

    public async getChildren(element?: string | undefined) {
        if (element || !this.selectedProject) {
            return [];
        }
        const scope = this.selectedProject;
        const [syncApi, sshHelperType] = await Promise.all(
            [   GetSyncApi(),
                GetSshHelperType(),
            ]);
        if (!syncApi || !sshHelperType) {
            return [];
        }
        this.syncScopeSettings = await syncApi.getSettings(scope);
        const sshHelper = new sshHelperType();
        this.sshScopeSettings = await sshHelper.getSettings(scope);
        return [
            "folder",
            "projectName",
            "host",
            "root",
            "buildType",
        ];
    }

    public getTreeItem(element: string): vscode.TreeItem | Thenable<vscode.TreeItem> {
        if (!this.selectedProject || !this.syncScopeSettings || !this.sshScopeSettings) {
            return new vscode.TreeItem(element, vscode.TreeItemCollapsibleState.None);
        }
        let data = "";
        switch (element) {
            case "folder":
                data = this.selectedProject;
                break;
            case "projectName":
                data = this.syncScopeSettings.projectSection.projectName;
                break;
            case "host":
                data = this.sshScopeSettings.connectionSection.host;
                break;
            case "root":
                data = this.syncScopeSettings.projectSection.root;
                break;
            case "buildType":
                data = this.buildType;
                break;
        }
        const item = new vscode.TreeItem(`${element}: ${data}`, vscode.TreeItemCollapsibleState.None);
        if (element === "buildType") {
            item.command = {
                arguments: [],
                command: "vmssoftware.project-dep.projectDescription.changeBuildType",
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

    public edit() {
        this.didChangeTreeEmitter.fire();
    }

    public changeBuildType() {
        if (this.buildType === "DEBUG") {
            this.buildType = "RELEASE";
        } else {
            this.buildType = "DEBUG";
        }
        this.didChangeTreeEmitter.fire();
    }
}
