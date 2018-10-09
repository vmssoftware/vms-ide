
import { ITargetFile } from "./sync";
import { ISyncSiteHelper } from "./sync-site-helper";

export class SyncSiteTargetFile implements ITargetFile {

    constructor(protected relPath: string, protected sshHelper: ISyncSiteHelper, protected date: Date) {
    }

    get needUpdate(): boolean {
        return true;
    }

    public updateContent(content: Buffer): Promise<boolean> {
        return this.sshHelper.updateContent(this.relPath, content).then((contentUpdated) => {
            return contentUpdated && this.sshHelper.setModifiedTime(this.relPath, this.date);
        });
    }
}
