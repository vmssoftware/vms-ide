import { DummyTargetFile } from "./dummy-target-file";
import { ITarget, ITargetFile } from "./sync";

export class SFTPTarget implements ITarget {
    public test(relativePath: string, modTime: Date): Promise<ITargetFile> {
        return new Promise<ITargetFile>((resolve) => {
            // get realtivePath modification date and test against given modTime
            resolve(new DummyTargetFile(relativePath));
        });
    }
}
