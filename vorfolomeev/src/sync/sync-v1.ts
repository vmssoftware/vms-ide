import { Disposable, Uri } from "vscode";
import { ISource, ISourceFile, ISync, ITarget } from "./sync";

// tslint:disable-next-line:no-console
export let logFn = console.log;
// tslint:disable-next-line:no-empty
logFn = () => {};

export class SyncV1 implements ISync {

    protected sources: ISource[] = [];

    constructor(protected target: ITarget) {

    }

    public addSource(source: ISource): Disposable {
        this.sources.push(source);
        return {
            dispose: () => {
                this.sources.some((value, index, arr) => {
                    if (value === source) {
                        arr.splice(index, 1);
                        logFn(`disposed: ${value} at ${index}`);
                        return true;
                    }
                    return false;
                });
            },
        };
    }

    public postFile(uri: Uri): Promise<boolean> {
        return new Promise<boolean>(async (resolve) => {
            let sourceFile: ISourceFile | undefined;
            let retCode = false;
            // find appropriate source
            for (const source of this.sources) {
                try {
                    sourceFile = await source.accept(uri);
                } catch (err) {
                    logFn(err);
                }
                if (sourceFile) {
                    break;
                }
            }
            if (sourceFile) {
                // update target if need
                try {
                    const modTime = await sourceFile.modTime;
                    if (modTime) {
                        const targetFile = await this.target.test(sourceFile.relativePath, modTime);
                        if (targetFile.needUpdate) {
                            const content = await sourceFile.content;
                            if (content) {
                                retCode = await targetFile.updateContent(content);
                            }
                        }
                    }
                } catch (err) {
                    logFn(err);
                }
            }
            resolve(retCode);
        });
    }
}
