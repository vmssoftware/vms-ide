import * as vscode from "vscode";
import { ProjDepTree } from "./proj-dep-tree";
import { ProjectState } from "./proj-state";
import { BuildType, ProjDescrProvider } from "./project-descr";

export interface IProjectElement {
    parent?: string;
    name: string;
}

export enum FolderContext {
    folder = "folder",
    depends = "depends",
}

export class ProjDepProvider implements vscode.TreeDataProvider<IProjectElement> {

    public static readonly cmdSelect = "vmssoftware.project-dep.projectDependencies.select";
    public static readonly cmdDescrSelect = "vmssoftware.project-dep.projectDescription.select";
    public static readonly cmdBuild = "vmssoftware.synchronizer.buildProject";
    public static readonly cmdReBuild = "vmssoftware.synchronizer.reBuildProject";
    public static readonly cmdBuildOnly = "vmssoftware.synchronizer.buildOnlyProject";
    public static readonly cmdReBuildOnly = "vmssoftware.synchronizer.reBuildOnlyProject";
    public static readonly cmdClean = "vmssoftware.synchronizer.cleanProject";

    public readonly onDidChangeTreeData: vscode.Event<IProjectElement | undefined>;

    private didChangeTreeEmitter: vscode.EventEmitter<IProjectElement | undefined> = new vscode.EventEmitter<IProjectElement | undefined>();
    private projects: ProjDepTree;
    private selected?: IProjectElement;

    constructor() {
        this.projects =  new ProjDepTree();
        this.onDidChangeTreeData = this.didChangeTreeEmitter.event;
    }

    public selectedProject(): string | undefined {
        if (this.selected) {
            return this.selected.name;
        }
        if (this.projects.root.children.size) {
            return this.projects.root.children.keys().next().value;
        }
        return undefined;
    }

    public getChildren(element?: IProjectElement | undefined): vscode.ProviderResult<IProjectElement[]> {
        const ret: IProjectElement[] = [];
        if (!element) {
            for (const childName of this.projects.root.children.keys()) {
                ret.push( {
                    name: childName,
                });
            }
        } else {
            const node = this.projects.root.children.get(element.name);
            if (node) {
                for (const childName of node.children.keys()) {
                    ret.push( {
                        name: childName,
                        parent: element.name,
                    });
                }
            }
        }
        return ret;
    }

    public getTreeItem(element: IProjectElement): vscode.TreeItem | Thenable<vscode.TreeItem> {
        const node = this.projects.root.children.get(element.name);
        if (node) {
            const item = new vscode.TreeItem(element.name, node.children.size > 0 ? vscode.TreeItemCollapsibleState.Collapsed : vscode.TreeItemCollapsibleState.None);
            item.contextValue = element.parent ? FolderContext.depends : FolderContext.folder;
            item.command = {
                arguments: [element],
                command: ProjDepProvider.cmdSelect,
                title: "",
            };
            item.tooltip = this.projects.getDepList(element.name).join("->");
            return item;
        } else {
            return new vscode.TreeItem("undefined", vscode.TreeItemCollapsibleState.None);
        }
    }

    public select(node: IProjectElement) {
        this.selected = node;
        vscode.commands.executeCommand(ProjDepProvider.cmdDescrSelect, node.name);
    }

    public add(node: IProjectElement) {
        if (this.selected && !this.selected.parent && this.selected !== node) {
            this.projects.add(node.name, this.selected.name);
            this.didChangeTreeEmitter.fire();
        }
    }

    public build(node: IProjectElement) {
        if (this.selected) {
            const buildType = ProjectState.acquire().getDefBuildType();
            vscode.commands.executeCommand(ProjDepProvider.cmdBuild, this.selected.name, buildType);
        }
    }

    public rebuild(node: IProjectElement) {
        if (this.selected) {
            const buildType = ProjectState.acquire().getDefBuildType();
            vscode.commands.executeCommand(ProjDepProvider.cmdReBuild, this.selected.name, buildType);
        }
    }

    public buildOnly(node: IProjectElement) {
        if (this.selected) {
            const buildType = ProjectState.acquire().getDefBuildType();
            vscode.commands.executeCommand(ProjDepProvider.cmdBuildOnly, this.selected.name, buildType);
        }
    }

    public rebuildOnly(node: IProjectElement) {
        if (this.selected) {
            const buildType = ProjectState.acquire().getDefBuildType();
            vscode.commands.executeCommand(ProjDepProvider.cmdReBuildOnly, this.selected.name, buildType);
        }
    }

    public clean(node: IProjectElement) {
        if (this.selected) {
            const buildType = ProjectState.acquire().getDefBuildType();
            vscode.commands.executeCommand(ProjDepProvider.cmdClean, this.selected.name, buildType);
        }
    }

    public remove(node: IProjectElement) {
        if (node.parent) {
            this.projects.remove(node.name, node.parent);
            this.didChangeTreeEmitter.fire();
        }
    }

    public refresh() {
        this.projects.create();
        this.didChangeTreeEmitter.fire();
    }

}
