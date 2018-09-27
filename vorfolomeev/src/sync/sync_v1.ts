import { Sync, Source, Target, SourceFile } from "./sync";
import { Uri, Disposable } from "vscode";

let _log_ = console.log;
//_log_ = function() {};

export class Sync_v1 implements Sync {

    protected _sources: Source[] = [];

    constructor(protected _target: Target) {

    }

    addSource(source: Source): Disposable {
        this._sources.push(source);
        return {
            dispose: () => {
                this._sources.some((value, index, arr)=>{
                    if (value === source) {
                        arr.splice(index, 1);
                        _log_(`disposed: ${value} at ${index}`);
                        return true;
                    }
                    return false;
                })
            }
        };
    }

    postFile(uri: Uri): Promise<boolean> {
        return new Promise<boolean>(async (resolve)=>{
            let sourceFile: SourceFile | undefined;
            let ret_code = false;
            //find appropriate source
            for (let source of this._sources) {
                try {
                    sourceFile = await source.accept(uri);
                } catch(err) {
                    _log_(err);
                }
                if (sourceFile) {
                    break;
                }
            }
            if (sourceFile) {
                //update target if need
                try {
                    let modTime = await sourceFile.modTime;
                    if (modTime) {
                        let targetFile = await this._target.test(sourceFile.relativePath, modTime);
                        if (targetFile.needUpdate) {
                            let content = await sourceFile.content;
                            if (content) {
                                ret_code = await targetFile.updateContent(content);
                            }
                        }
                    }
                } catch(err) {
                    _log_(err);
                }
            }
            resolve(ret_code);
        });
    }
}

