import * as vscode from "vscode";
import { DepTree, IDepNode } from "./dep-tree";

export class ProjDepTree implements DepTree {

    public static readonly configName = "vmssoftware.project-dep";
    public static readonly configSection = "dependencies";

    public get root(): IDepNode {
        return this.projects.root;
    }

    private projects!: DepTree;

    constructor() {
        this.create();
    }

    public create() {
        this.projects = new DepTree();
        if (vscode.workspace.workspaceFolders) {
            for (const folder of vscode.workspace.workspaceFolders) {
                this.projects.add(folder.name);
            }
        }
        this.load();
    }

    public testChild(parentName: string, childName: string): boolean {
        return this.projects.testChild(parentName, childName);
    }

    public add(nodeName: string, parentName?: string) {
        this.projects.add(nodeName, parentName);
        this.save();
    }

    public remove(nodeName: string, parentName: string) {
        this.projects.remove(nodeName, parentName);
        this.save();
    }

    public load() {
        const config = vscode.workspace.getConfiguration(ProjDepTree.configName, null);
        const dependencies = config.get(ProjDepTree.configSection);
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
        const config = vscode.workspace.getConfiguration(ProjDepTree.configName, null);
        config.update(ProjDepTree.configSection, dependencies, false);
    }

    public getDepList(nodeName?: string) {
        const chain: string[] = [];
        let node = this.root;
        if (nodeName) {
            const nodeT = node.children.get(nodeName);
            if (nodeT) {
                node = nodeT;
                chain.push(nodeName);
            }
        }
        chain.push(...node.children.keys());
        // tslint:disable-next-line:prefer-for-of
        for (let idx = 0; idx < chain.length; ++idx) {
            const nodeT = this.root.children.get(chain[idx]);
            if (nodeT) {
                for (const testChild of nodeT.children.keys()) {
                    if (!chain.some((childInChain) => childInChain === testChild)) {
                        chain.splice(idx + 1, 0, testChild);
                    }
                }
            }
        }
        return chain;
    }

    public getMasterList(nodeName?: string) {
        const chain: string[] = [];
        if (nodeName) {
            let added;
            chain.push(nodeName);
            do {
                added = false;
                for (const [name, node] of this.root.children) {
                    if (chain.some((master) => node.children.has(master))) {
                        if (!chain.includes(name)) {
                            chain.push(name);
                            added = true;
                        }
                    }
                }
            } while (added);
        }
        return chain;
    }
}
