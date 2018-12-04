import * as vscode from "vscode";
import { DepTree } from "./dep-tree";

export interface IProjectElement {
    parent?: string;
    name: string;
}

export class ProjDepProvider implements vscode.TreeDataProvider<IProjectElement> {

    public readonly onDidChangeTreeData: vscode.Event<IProjectElement | undefined>;

    private didChangeTreeEmitter: vscode.EventEmitter<IProjectElement | undefined> = new vscode.EventEmitter<IProjectElement | undefined>();

    private projects: DepTree = new DepTree();

    private selected?: IProjectElement;

    constructor() {
        this.onDidChangeTreeData = this.didChangeTreeEmitter.event;
        if (vscode.workspace.workspaceFolders) {
            for (const folder of vscode.workspace.workspaceFolders) {
                this.projects.add(folder.name);
            }
        }
        this.load();
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
            item.contextValue = element.parent ? "depends" : "folder";
            item.command = {
                arguments: [element],
                command: "vmssoftware.project-dep.projectDependencies.select",
                title: "",
            };
            return item;
        } else {
            return new vscode.TreeItem("undefined", vscode.TreeItemCollapsibleState.None);
        }
    }

    public select(node: IProjectElement) {
        this.selected = node;
    }

    public add(node: IProjectElement) {
        if (this.selected && !this.selected.parent && this.selected !== node) {
            this.projects.add(node.name, this.selected.name);
            this.didChangeTreeEmitter.fire();
            this.save();
        }
    }

    public remove(node: IProjectElement) {
        if (node.parent) {
            const parentNode = this.projects.root.children.get(node.parent);
            if (parentNode) {
                parentNode.children.delete(node.name);
            }
            this.didChangeTreeEmitter.fire();
            this.save();
        }
    }

    public refresh() {
        this.didChangeTreeEmitter.fire();
    }

    public load() {
        const config = vscode.workspace.getConfiguration("vmssoftware.project-dep", null);
        const dependencies = config.get("dependencies");
        if (Array.isArray(dependencies)) {
            for (const folder of dependencies) {
                if (typeof folder.folder === "string" && Array.isArray(folder.depends)) {
                    for (const depend of folder.depends) {
                        this.projects.add(depend, folder.folder);
                    }
                }
            }
        }
    }

    public save() {
        const dependencies = [];
        for (const [name, node] of this.projects.root.children) {
            if (node.children.size > 0) {
                dependencies.push({
                    depends: new Array(...node.children.keys()),
                    folder: name,
                });
            }
        }
        const config = vscode.workspace.getConfiguration("vmssoftware.project-dep", null);
        config.update("dependencies", dependencies, false);
    }
}
