import { ITargetFile } from "./sync";

export class DummyTargetFile implements ITargetFile {

    constructor(public relPath: string) {

    }

    get needUpdate(): boolean {
        return false;
    }

    public updateContent(content: Buffer): Promise<boolean> {
        return Promise.resolve(false);
    }
}
