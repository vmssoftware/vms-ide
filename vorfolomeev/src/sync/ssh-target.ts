import { IConfigHelper } from "../ext-api/config";
import { ISshHelper } from "../ssh/ssh-helper";
import { VmsSshHelper } from "../vms/vms-ssh-helper";
import { DummyTargetFile } from "./dummy-target-file";
import { SshTargetFile } from "./ssh-target-file";
import { ITarget, ITargetFile } from "./sync";

export class SshTarget implements ITarget {

    public static threshold = 1000; // in msec

    constructor(private sshHelper: ISshHelper) {
    }

    public test(relativePath: string, modTime: Date): Promise<ITargetFile> {
        return new Promise<ITargetFile>(async (resolve) => {
            const date = await this.sshHelper.getModifiedTime(relativePath);
            if (!date || Math.abs(date.valueOf() - modTime.valueOf()) > SshTarget.threshold ) {
                // need to update
                resolve(new SshTargetFile(relativePath, this.sshHelper, modTime));
                return;
            }
            resolve(new DummyTargetFile(relativePath));
        });
    }
}
