import { ISshHelper } from "../ssh/ssh-helper";
import { ITargetFile } from "./sync";

export class SshTargetFile implements ITargetFile {

    constructor(protected relPath: string, protected sshHelper: ISshHelper, protected date: Date) {
    }

    get needUpdate(): boolean {
        return true;
    }

    public updateContent(content: Buffer): Promise<boolean> {
        // Note: awful code. In case of SshHelper relPath must be a directory
        // but in case of VmsSshHelper it is full path
        // Now it is full path...
        return this.sshHelper.ensurePath(this.relPath).then((pathExists) => {
            return pathExists && this.sshHelper.updateContent(this.relPath, content);
        }).then((contentUpdated) => {
            return contentUpdated && this.sshHelper.setModifiedTime(this.relPath, this.date);
        });
    }
}
