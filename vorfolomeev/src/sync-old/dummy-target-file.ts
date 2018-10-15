import { ITargetFileOld } from "./sync-old";

export class DummyTargetFile implements ITargetFileOld {

    constructor(public relPath: string) {

    }

    get needUpdate(): boolean {
        return false;
    }

    public updateContent(content: Buffer): Promise<boolean> {
        return Promise.resolve(false);
    }
}
