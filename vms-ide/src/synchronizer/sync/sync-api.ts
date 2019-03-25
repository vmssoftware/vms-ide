
import { ProjDepTree } from "../dep-tree/proj-dep-tree";
import { ProjectState } from "../dep-tree/proj-state";
import { ensureSettings } from "../ensure-settings";
import { ISource, sourceType } from "./source";

export interface IProjectSection {
    break: string;
    builders: string;
    exclude: string;
    headers: string;
    listing: string;
    outdir: string;
    projectName: string;
    projectType: string;
    resource: string;
    root: string;
    source: string;
}

export type DownloadAction = "overwrite" | "skip" | "edit";

export interface ISynchronizeSection  {
    downloadNewFiles: DownloadAction;
    keepAlive: boolean;
    setTimeAttempts: number;
    setTimeByShell: boolean;
    unzipCmd: string;
    preferZip: boolean;
    purge: boolean;
}

export interface ISyncScopeSettings {
    projectSection: IProjectSection;
    synchronizeSection: ISynchronizeSection;
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
        return ProjectState.acquire().isSynchronized(projectName);
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
