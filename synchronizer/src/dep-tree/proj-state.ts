import * as vscode from "vscode";
import { ProjDepTree } from "./proj-dep-tree";

export enum SourceState {
    modified,
    synchronized,
}

export interface IProjState {
    buildState: Map<string, boolean>;
    sourceState: SourceState;
}

export class ProjectState {

    public static acquire() {
        if (!ProjectState.instance) {
            this.instance = new ProjectState();
        }
        return this.instance!;
    }

    private static instance?: ProjectState;

    private states!: Map<string, IProjState>;

    private constructor() {
        this.create();
        vscode.workspace.onDidChangeTextDocument((event) => {
            const workspaceFolder = vscode.workspace.getWorkspaceFolder(event.document.uri);
            if (workspaceFolder) {
                this.setSynchronized(workspaceFolder.name, false);
            }
        });
        vscode.workspace.onDidChangeWorkspaceFolders((event) => {
            for (const folder of event.added) {
                this.addFolder(folder);
            }
            for (const folder of event.removed) {
                this.states.delete(folder.name);
            }
        });
    }

    public create() {
        this.states = new Map();
        if (vscode.workspace.workspaceFolders) {
            for (const folder of vscode.workspace.workspaceFolders) {
                this.addFolder(folder);
            }
        }
    }

    public addFolder(folder: vscode.WorkspaceFolder) {
        this.states.set(folder.name, {
            buildState: new Map(),
            sourceState: SourceState.modified,
        });
    }

    public isSynchronized(projectName: string) {
        const state = this.states.get(projectName);
        if (state) {
            return state.sourceState === SourceState.synchronized;
        }
        return false;    // always modified
    }

    public setSynchronized(projectName: string, status = true) {
        const state = this.states.get(projectName);
        if (state) {
            state.sourceState = status ? SourceState.synchronized : SourceState.modified;
            if (!status) {
                const projDep = new ProjDepTree();
                for (const dep of projDep.getMasterList(projectName)) {
                    const depState = this.states.get(dep);
                    if (depState) {
                        depState.buildState.clear();
                    }
                }
            }
            this.updateDescription();
            return true;
        }
        return false;
    }

    public isBuilt(projectName: string, buildType: string) {
        const state = this.states.get(projectName);
        if (state) {
            const buildState = state.buildState.get(buildType.trim().toUpperCase());
            return !!buildState;
        }
        return false;    // always unbuilt
    }

    public setBuilt(projectName: string, buildType: string, status = true) {
        const state = this.states.get(projectName);
        if (state) {
            state.buildState.set(buildType.trim().toUpperCase(), status);
            this.updateDescription();
            return true;
        }
        return false;
    }

    public updateDescription() {
        vscode.commands.executeCommand("vmssoftware.project-dep.projectDescription.refresh");
    }
}
