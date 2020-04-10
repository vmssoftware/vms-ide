
import { ProjDepTree } from "../dep-tree/proj-dep-tree";
import { ProjectState, SourceState } from "../dep-tree/proj-state";
import { ensureSettings } from "../ensure-settings";
import { ISource, sourceType } from "./source";

export interface IProjectSection {
    break: string;
    /**
     * builders mask:
     * blob in UNIX format
     */
    builders: string;
    /**
     * exclude mask:
     * blob in UNIX format
     */
    exclude: string;
    /**
     * headers mask:
     * blob in UNIX format
     */
    headers: string;
    /**
     * listings mask, will be uploaded after compilation:
     * blob in UNIX format
     */
    listing: string;
    /**
     * temporary output folder:
     * one word, no inner folders
     */
    outdir: string;
    projectName: string;
    /**
     * type of project:
     * executable, shareable, library, java, scala, kotlin
     */
    projectType: string;
    /**
     * resource mask:
     * blob in UNIX format
     */
    resource: string;
    /**
     * root folder:
     * in UNIX format
     */
    root: string;
    /**
     * source mask, files to compile:
     * blob in UNIX format
     */
    source: string;
    /**
     * comma-separated libraries (or classes for jvm) list:
     * (java,scala,kotin): in UNIX format,
     * (executable,shareable,library): in VMS format
     */
    addLibraries: string;
    /**
     * comma-separated include folders list:
     * (java,scala,kotin): not applicable,
     * (executable,shareable,library): in VMS format
     */
    addIncludes: string;
}

export type DownloadAction = "overwrite" | "skip" | "edit";

export interface ISynchronizeSection  {
    downloadNewFiles: DownloadAction;
    keepAlive: boolean;
    setTimeAttempts: number;
    preferZip: boolean;
    forceLocalTime: boolean;
    purge: boolean;
}

export interface IBuildConfigSection {
    /**
     * name of configuration, one simple unique word
     */
    label: string;
    /**
     * description of configuration
     */
    description: string;
    /**
     * "default" or user defined command in VMS format
     */
    command: string;
    /**
     * will be added to the end of the command
     */
    parameter: string;
}

export interface IBuildsSection  {
    configurations: IBuildConfigSection[];
}

export interface ISyncScopeSettings {
    projectSection: IProjectSection;
    synchronizeSection: ISynchronizeSection;
    buildsSection: IBuildsSection;
}

export class SyncApi {
    public async getSource(scope: string, type: sourceType): Promise<ISource | undefined> {
        const sync = require("./synchronizer").Synchronizer.acquire();
        const ensured = await ensureSettings(scope);
        if (sync && ensured) {
            return sync.requestSource(ensured, type);
        }
        return undefined;
    }
    public async getSettings(scope: string) {
        const ensured = await ensureSettings(scope);
        if (ensured) {
            return ensured as ISyncScopeSettings;
        }
        return undefined;
    }

    public getDepList(nodeName?: string) {
        const projDepTree = new ProjDepTree();
        return projDepTree.getDepList(nodeName);
    }

    public getMasterList(nodeName?: string) {
        const projDepTree = new ProjDepTree();
        return projDepTree.getMasterList(nodeName);
    }

    public isSynchronized(projectName: string) {
        return ProjectState.acquire().sourceState(projectName) === SourceState.synchronized;
    }

    public isBuilt(projectName: string, buildType: string) {
        return ProjectState.acquire().isBuilt(projectName, buildType);
    }

    public setSynchronized(projectName: string, synchronized = true) {
        return ProjectState.acquire().setSynchronized(projectName, synchronized);
    }

    public setBuilt(projectName: string, buildType: string, built = true) {
        return ProjectState.acquire().setBuilt(projectName, buildType, built);
    }

}
