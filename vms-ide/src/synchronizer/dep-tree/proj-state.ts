import * as vscode from "vscode";
import { ProjDepTree } from "./proj-dep-tree";
import { BuildType } from "./project-descr";

export enum SourceState {
    modified,
    synchronized,
}

export interface IProjState {
    buildState: Map<string, boolean>;
    sourceState: SourceState;
}

export class ProjectState {

    public static readonly configBuildTypeSection = "buildType";

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
        const projects: string[] = [];
        if (projectName) {
            projects.push(projectName);
        } else {
            projects.push(...this.states.keys());
        }
        let retCode = true;
        for (const currentProject of projects) {
            const state = this.states.get(currentProject);
            if (state) {
                state.sourceState = status ? SourceState.synchronized : SourceState.modified;
                if (!status) {
                    state.buildState.clear();
                    const projDep = new ProjDepTree();
                    for (const dep of projDep.getMasterList(projectName)) {
                        const depState = this.states.get(dep);
                        if (depState) {
                            depState.buildState.clear();
                        }
                    }
                }
            } else {
                retCode = false;
            }
        }
        this.updateDescription();
        return retCode;

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
        const projects: string[] = [];
        if (projectName) {
            projects.push(projectName);
        } else {
            projects.push(...this.states.keys());
        }
        buildType = buildType || this.getDefBuildType();
        let retCode = true;
        for (const currentProject of projects) {
            const state = this.states.get(currentProject);
            if (state) {
                state.buildState.set(buildType.trim().toUpperCase(), status);
            } else {
                retCode = false;
            }
        }
        this.updateDescription();
        return retCode;
    }

    public updateDescription() {
        vscode.commands.executeCommand("vmssoftware.project-dep.projectDescription.refresh");
    }

    public getDefBuildType() {
        const config = vscode.workspace.getConfiguration(ProjDepTree.configName, null);
        if (config.get<string>(ProjectState.configBuildTypeSection) == BuildType.release) {
            return BuildType.release;
        }
        return BuildType.debug;
    }

    public setDefBuildType(buildType: BuildType) {
        const config = vscode.workspace.getConfiguration(ProjDepTree.configName, null);
        config.update(ProjectState.configBuildTypeSection, buildType, false);
        return true;
    }
}
