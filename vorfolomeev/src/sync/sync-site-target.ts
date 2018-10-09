
import { DummyTargetFile } from "./dummy-target-file";
import { ITarget, ITargetFile } from "./sync";
import { ISyncSiteHelper } from "./sync-site-helper";
import { SyncSiteTargetFile } from "./sync-site-target-file";

export class SyncSiteTarget implements ITarget {

    public static threshold = 1000; // in msec

    constructor(private sshHelper: ISyncSiteHelper) {
    }

    public test(relativePath: string, modTime: Date): Promise<ITargetFile> {
        return new Promise<ITargetFile>(async (resolve) => {
            const date = await this.sshHelper.getModifiedTime(relativePath);
            if (!date || Math.abs(date.valueOf() - modTime.valueOf()) > SyncSiteTarget.threshold ) {
                // need to update
                resolve(new SyncSiteTargetFile(relativePath, this.sshHelper, modTime));
                return;
            }
            resolve(new DummyTargetFile(relativePath));
        });
    }
}
