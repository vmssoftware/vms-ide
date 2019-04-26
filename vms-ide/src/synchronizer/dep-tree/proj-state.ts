import * as vscode from "vscode";
import { ProjDepTree } from "./proj-dep-tree";
import { BuildType } from "./project-descr";
import { LogFunction } from "../../common/main";
import { LogType } from "../../common/main";

export enum SourceState {
    unknown,
    synchronized,
    modified,
}

export interface IProjState {
    isBuilt: Map<string, boolean>;
    isSync: boolean;
    modifiedList: Map<string, boolean>;
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

    public logFn: LogFunction;

    private constructor() {
        this.logFn = (() => {});
        this.create();
    }

    public setLogFn(logFn: LogFunction) {
        this.logFn = logFn;
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
            isBuilt: new Map(),
            isSync: false,
            modifiedList: new Map(),
        });
    }

    public sourceState(projectName: string): SourceState {
        const state = this.states.get(projectName);
        if (state) {
            if (state.isSync === true) {
                if (state.modifiedList.size === 0) {
                    return SourceState.synchronized;
                }
                return SourceState.modified;
            }
            return SourceState.unknown;
        }
        return SourceState.unknown;
    }

    public addModified(projectName: string, file: string) {
        const state = this.states.get(projectName);
        if (state) {
            state.modifiedList.set(file, true);
            this.updateDescription();
        }
    }

    public removeModified(projectName: string, file: string) {
        const state = this.states.get(projectName);
        if (state) {
            state.modifiedList.delete(file);
            this.updateDescription();
        }
    }

    public clearModified(projectName: string) {
        const state = this.states.get(projectName);
        if (state) {
            state.modifiedList.clear();
            this.updateDescription();
        }
    }

    public getModifiedList(projectName: string) {
        const list: string[] = [];
        const state = this.states.get(projectName);
        if (state) {
            list.push(...state.modifiedList.keys());
        }
        return list;
    }

    /**
     * Actually set TRUE flag after 300 delay, set FALSE flag after 0 delay, but returns true immediatly
     * Is TRUE only after suxxessful UPLOAD or SYNCHRONIZE
     * Is FALSE only in initial state, or after ANY configuration is changed
     * @param projectName 
     * @param status 
     */
    public setSynchronized(projectName: string | undefined, status = true) {
        const timeOut = status? 300 : 0;
        setTimeout(() => {
            const projects: string[] = [];
            if (projectName) {
                projects.push(projectName);
            } else {
                projects.push(...this.states.keys());
            }
            for (const currentProject of projects) {
                const state = this.states.get(currentProject);
                if (state) {
                    if (status) {
                        state.isSync = true;
                        state.modifiedList.clear();
                    } else {
                        state.isSync = false;
                        state.isBuilt.clear();
                        const projDep = new ProjDepTree();
                        for (const dep of projDep.getMasterList(projectName)) {
                            const depState = this.states.get(dep);
                            if (depState) {
                                depState.isBuilt.clear();
                            }
                        }
                    }
                }
            }
            this.updateDescription();
        }, timeOut);
        return true;

    }

    public isBuilt(projectName: string, buildType: string) {
        const state = this.states.get(projectName);
        if (state) {
            const buildState = state.isBuilt.get(buildType.trim().toUpperCase());
            return !!buildState;
        }
        return false;    // always unbuilt
    }

    public setBuilt(projectName: string | undefined, buildType: string | undefined, status = true) {
        this.logFn(LogType.debug, () => `setBuilt: ${projectName} is ${status}` );
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
                state.isBuilt.set(buildType.trim().toUpperCase(), status);
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
        if (config.get<string>(ProjectState.configBuildTypeSection) === BuildType.release) {
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
