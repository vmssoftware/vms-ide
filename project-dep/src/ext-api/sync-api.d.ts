import { ISource, sourceType } from "./source";
export interface IProjectSection {
    builders: string;
    exclude: string;
    headers: string;
    listing: string;
    outdir: string;
    projectName: string;
    resource: string;
    root: string;
    source: string;
}
export declare type DownloadAction = "overwrite" | "skip" | "edit";
export interface ISynchronizeSection {
    downloadNewFiles: DownloadAction;
    keepAlive: boolean;
    setTimeAttempts: number;
}
export interface ISyncScopeSettings {
    projectSection: IProjectSection;
    synchronizeSection: ISynchronizeSection;
}
export declare class SyncApi {
    getSource(scope: string, type: sourceType): Promise<ISource | undefined>;
    getSettings(scope: string): Promise<ISyncScopeSettings | undefined>;
}
//# sourceMappingURL=sync-api.d.ts.map