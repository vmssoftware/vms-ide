import { Position, Range, Uri, workspace, WorkspaceEdit } from "vscode";

import { LogFunction, LogType } from "../../common/main";
import { CSAResult } from "./config";
import { ConfigStorageImpl } from "./storage-impl";

/**
 * Such as FS_ConfigStorage, but using VS Code provided read/write functions
 */
export class VFSConfigStorage extends ConfigStorageImpl {

    constructor(protected fileUri: Uri, logFn?: LogFunction) {
        super(logFn);
    }

    public fillStart(): Promise<CSAResult> {
        return new Promise(async (resolve) => {
            try {
                const textDoc = await workspace.openTextDocument(this.fileUri);
                this.content = textDoc.getText();
                resolve(await super.fillStart());
            } catch (error) {
                resolve(CSAResult.prepare_failed);
            }
        });
    }

    public storeEnd(): Promise<CSAResult> {
        return super.storeEnd()
            .then(async (result) => {
                if (result === CSAResult.ok && this.content) {
                    try {
                        let range: Range | undefined;
                        try {
                            const textDoc = await workspace.openTextDocument(this.fileUri);
                            range = textDoc.validateRange(new Range(0, 0, 32767, 32767));
                        } catch (err) {
                            range = undefined;
                        }
                        const we = new WorkspaceEdit();
                        if (!range) {
                            we.createFile(this.fileUri);
                            we.insert(this.fileUri, new Position(0, 0), this.content);
                        } else {
                            we.replace(this.fileUri, range, this.content);
                        }
                        const status = await workspace.applyEdit(we);
                        if (status) {
                            const textDoc = await workspace.openTextDocument(this.fileUri);
                            const saved = await textDoc.save();
                            return saved ? CSAResult.ok : CSAResult.end_failed;
                        } else {
                            return CSAResult.end_failed;
                        }
                    } catch (err) {
                        return CSAResult.end_failed;
                    }
                }
                return result;
        });
    }
}
