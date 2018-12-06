import { ProjDepTree } from "./proj-dep-tree";
import { ProjectState } from "./proj-state";

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
}
