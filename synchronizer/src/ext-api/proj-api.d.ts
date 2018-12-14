export declare class ProjApi {
    getDepList(nodeName?: string): string[];
    getMasterList(nodeName?: string): string[];
    isSynchronized(projectName: string): boolean;
    isBuilt(projectName: string, buildType: string): boolean;
    setSynchronized(projectName: string, synchronized?: boolean): void;
    setBuilt(projectName: string, buildType: string, built?: boolean): void;
}
