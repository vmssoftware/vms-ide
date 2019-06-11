import * as vscode from "vscode";
import { ProjDepTree } from "./proj-dep-tree";
import { LogFunction } from "../../common/main";
import { LogType } from "../../common/main";
import { KnownBuildType } from "./project-descr";

export enum SourceState {
    unknown,
    synchronized,
    modified,
}

enum EFileState {
    modified,
    deleted,
};

export interface IProjState {
    isBuilt: Map<string, boolean>;
    isSync: boolean;
    modifiedList: Map<string, EFileState>;
}

export class ProjectState {

    public static readonly configBuildNameSection = "buildName";

    public static acquire() {
        if (!ProjectState.instance) {
            this.instance = new ProjectState();
        }
        return this.instance!;
    }

    private static instance?: ProjectState;

    private projStates!: Map<string, IProjState>;

    public logFn: LogFunction;

    private constructor() {
        this.logFn = (() => {});
        this.create();
    }

    public setLogFn(logFn: LogFunction) {
        this.logFn = logFn;
    }

    public create() {
        this.projStates = new Map();
        if (vscode.workspace.workspaceFolders) {
            for (const folder of vscode.workspace.workspaceFolders) {
                this.addFolder(folder);
            }
        }
    }

    public addFolder(folder: vscode.WorkspaceFolder) {
        this.projStates.set(folder.name, {
            isBuilt: new Map(),
            isSync: false,
            modifiedList: new Map(),
        });
    }

    public sourceState(projectName: string): SourceState {
        const projState = this.projStates.get(projectName);
        if (projState) {
            if (projState.isSync === true) {
                if (projState.modifiedList.size === 0) {
                    return SourceState.synchronized;
                }
                return SourceState.modified;
            }
            return SourceState.unknown;
        }
        return SourceState.unknown;
    }

    public setModified(projectName: string, file: string) {
        const projState = this.projStates.get(projectName);
        if (projState) {
            projState.modifiedList.set(file, EFileState.modified);
            projState.isBuilt.clear();
            this.updateDescription();
        }
    }

    public setDeleted(projectName: string, file: string) {
        const projState = this.projStates.get(projectName);
        if (projState) {
            projState.modifiedList.set(file, EFileState.deleted);
            projState.isBuilt.clear();
            this.updateDescription();
        }
    }

    public clearList(projectName: string) {
        const projState = this.projStates.get(projectName);
        if (projState) {
            projState.modifiedList.clear();
            this.updateDescription();
        }
    }

    public getList(projectName: string) {
        const list: string[] = [];
        const projState = this.projStates.get(projectName);
        if (projState) {
            list.push(...projState.modifiedList.keys());
        }
        return list;
    }

    public getModifiedList(projectName: string) {
        const list: string[] = [];
        const projState = this.projStates.get(projectName);
        if (projState) {
            for (const [file, fileState] of projState.modifiedList) {
                if (fileState === EFileState.modified) {
                    list.push(file);
                }
            }
        }
        return list;
    }

    public getDeletedList(projectName: string) {
        const list: string[] = [];
        const projState = this.projStates.get(projectName);
        if (projState) {
            for (const [file, fileState] of projState.modifiedList) {
                if (fileState === EFileState.deleted) {
                    list.push(file);
                }
            }
        }
        return list;
    }

    /**
     * Actually set TRUE flag after 300 delay, set FALSE flag after 0 delay, but returns true immediatly
     * Must be TRUE only after successful UPLOAD or SYNCHRONIZE
     * Must be FALSE only in initial state, or after ANY configuration is changed
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
                projects.push(...this.projStates.keys());
            }
            for (const currentProject of projects) {
                const state = this.projStates.get(currentProject);
                if (state) {
                    state.modifiedList.clear(); // clear list because it may be invalid (after configuration changes)
                    if (status) {
                        state.isSync = true;
                    } else {
                        state.isSync = false;
                        state.isBuilt.clear();
                        const projDep = new ProjDepTree();
                        for (const dep of projDep.getMasterList(projectName)) {
                            const depState = this.projStates.get(dep);
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

    public isBuilt(projectName: string, buildName: string) {
        const state = this.projStates.get(projectName);
        if (state) {
            const buildState = state.isBuilt.get(buildName.trim().toUpperCase());
            return !!buildState;
        }
        return false;    // always unbuilt
    }

    public setBuilt(projectName: string | undefined, buildName: string, status = true) {
        this.logFn(LogType.debug, () => `setBuilt: ${projectName} is ${status}` );
        const projects: string[] = [];
        if (projectName) {
            projects.push(projectName);
        } else {
            projects.push(...this.projStates.keys());
        }
        let retCode = true;
        for (const currentProject of projects) {
            const state = this.projStates.get(currentProject);
            if (state) {
                state.isBuilt.set(buildName.trim().toUpperCase(), status);
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

    public getDefBuildName(): string {
        const config = vscode.workspace.getConfiguration(ProjDepTree.configName, null);
        let value = config.get<string>(ProjectState.configBuildNameSection);
        if (!value) {
            value = KnownBuildType.debug;
            this.setDefBuildName(value);
        }
        return value;
    }

    public setDefBuildName(buildName: string) {
        const config = vscode.workspace.getConfiguration(ProjDepTree.configName, null);
        config.update(ProjectState.configBuildNameSection, buildName, false);
        return true;
    }
}
