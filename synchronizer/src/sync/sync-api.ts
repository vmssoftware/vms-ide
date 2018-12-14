
import { ensureSettings } from "../ensure-settings";
import { ISource, sourceType } from "./source";

export interface IProjectSection {
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
}
