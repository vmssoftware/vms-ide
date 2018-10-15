import { Disposable, Uri } from "vscode";
import { ISourceFileOld, ISourceOld, ISyncOld, ITargetOld } from "./sync-old";

export type LogType = (message?: any, ...optionalParams: any[]) => void;
export let logFn: LogType | undefined;

export class SyncImplement implements ISyncOld {

    protected sources: ISourceOld[] = [];

    constructor(protected target: ITargetOld) {

    }

    public addSource(source: ISourceOld): Disposable {
        this.sources.push(source);
        return {
            dispose: () => {
                this.sources.some((value, index, arr) => {
                    if (value === source) {
                        arr.splice(index, 1);
                        // tslint:disable-next-line:no-unused-expression
                        logFn && logFn(`disposed: ${value} at ${index}`);
                        return true;
                    }
                    return false;
                });
            },
        };
    }

    public postFile(uri: Uri): Promise<boolean> {
        return new Promise<boolean>(async (resolve) => {
            let sourceFile: ISourceFileOld | undefined;
            let retCode = false;
            // find appropriate source
            for (const source of this.sources) {
                try {
                    sourceFile = await source.accept(uri);
                } catch (err) {
                    // tslint:disable-next-line:no-unused-expression
                    logFn && logFn(err);
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
                                // tslint:disable-next-line:no-unused-expression
                                logFn && logFn(`Updated: ${sourceFile.relativePath}`);
                            }
                        } else {
                            // tslint:disable-next-line:no-unused-expression
                            logFn && logFn(`Do not need to update (or cannot): ${sourceFile.relativePath}`);
                        }
                    }
                } catch (err) {
                    // tslint:disable-next-line:no-unused-expression
                    logFn && logFn(err);
                }
            }
            resolve(retCode);
        });
    }
}
