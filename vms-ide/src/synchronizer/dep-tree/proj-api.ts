import { ProjDepTree } from "./proj-dep-tree";
import { ProjectState } from "./proj-state";

// import { GetSyncApi } from "./ext-api/get-sync-api";

// export interface IShareDefs {
//     shareName: string;
//     sharePath: string;
// }

export class ProjApi {

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
        ProjectState.acquire().setSynchronized(projectName, synchronized);
    }

    public setBuilt(projectName: string, buildType: string, built = true) {
        ProjectState.acquire().setBuilt(projectName, buildType, built);
    }

    // public async getShareableDepDefines(scope: string, buildType: string) {
    //     const shareDefs: IShareDefs[] = [];
    //     const syncApi = await GetSyncApi();
    //     if (!syncApi) {
    //         return shareDefs;
    //     }
    //     const depList = this.getDepList(scope);
    //     if (depList.length > 1) {
    //         for (let i = 1; i < depList.length; i++) {
    //             const defSets = await syncApi.getSettings(depList[i]);
    //             if (defSets) {
    //                 if (defSets.projectSection.projectType === "shareable") {

    //                 }
    //             }
    //         }
    //     }
    //     return shareDefs;
    // }
}
