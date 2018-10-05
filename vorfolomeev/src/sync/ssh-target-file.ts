import { ISshHelper } from "../ssh/ssh-helper";
import { ITargetFile } from "./sync";

export class SshTargetFile implements ITargetFile {

    constructor(protected relPath: string, protected sshHelper: ISshHelper, protected date: Date) {
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
