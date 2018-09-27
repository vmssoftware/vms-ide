import { Sync, Source, Target, SourceFile } from "./sync";
import { Uri } from "vscode";

let _log_ = console.log;
//_log_ = function() {};

export class Sync_v1 implements Sync {

    protected _sources: Map<string, Source> = new Map<string, Source>();

    constructor(protected _target: Target) {

    }

    addSource(name: string, source: Source) {
        this._sources.set(name, source);
    }

    postFile(uri: Uri): Promise<boolean> {
        return new Promise<boolean>(async (resolve)=>{
            let sourceFile: SourceFile | undefined;
            for (let source of this._sources.values()) {
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
                let modTime = sourceFile.modTime;
                try {
                    let date = await modTime;
                    if (date) {
                        let targetFile = await this._target.test(sourceFile.relativePath, date);
                        if (targetFile.needUpdate) {
                            let content = await sourceFile.content;
                            if (content) {
                                let result = await targetFile.updateContent(content);
                                resolve(result);
                            }
                        }
                    }
                } catch(err) {
                    _log_(err);
                    resolve(false);
                }
            } else {
                resolve(false);
            }
        });
    }
}

