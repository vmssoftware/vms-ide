import { Position, Range, Uri, workspace, WorkspaceEdit } from "vscode";

import { CSAResult } from "./config";
import { FSConfigStorage } from "./fs-storage";

// tslint:disable-next-line:no-console
export let logFn = console.log;
// tslint:disable-next-line:no-empty
logFn = () => {};

/**
 * Such as FS_ConfigStorage, but using VS Code provided read/write functions
 */
export class VFSConfigStorage extends FSConfigStorage {

    constructor(protected fileUri: Uri) {
        super(fileUri.fsPath);
    }

    public fillStart(): Promise<CSAResult> {
        logFn("fillStart =");
        if (!this.fillStartPromise) {
            this.fillStartPromise = new Promise<CSAResult>(async (resolve) => {
                try {
                    const textDoc = await workspace.openTextDocument(this.fileUri);
                    const content = textDoc.getText();
                    this.jsonData = JSON.parse(content);
                    resolve(CSAResult.ok);
                    logFn("fillStart => ok");
                } catch (error) {
                    resolve(CSAResult.prepare_failed);
                    logFn("fillStart => fail");
                }
                this.fillStartPromise = undefined;
                logFn("fillStart => clear");
            });
        }
        return this.fillStartPromise;
    }

    public storeEnd(): Promise<CSAResult> {
        logFn("storeEnd =");
        if (!this.storePromise) {
            this.storePromise = new Promise<CSAResult>(async (resolve) => {
                try {
                    let range: Range | undefined;
                    try {
                        const textDoc = await workspace.openTextDocument(this.fileUri);
                        range = textDoc.validateRange(new Range(0, 0, 32767, 32767));
                    } catch (err) {
                        range = undefined;
                    }
                    const we = new WorkspaceEdit();
                    const str = JSON.stringify(this.jsonData, null, 4);
                    if (!range) {
                        we.createFile(this.fileUri);
                        we.insert(this.fileUri, new Position(0, 0), str);
                    } else {
                        we.replace(this.fileUri, range, str);
                    }
                    const status = await workspace.applyEdit(we);
                    if (status) {
                        const textDoc = await workspace.openTextDocument(this.fileUri);
                        const saved = await textDoc.save();
                        resolve(saved ? CSAResult.ok : CSAResult.end_failed);
                    } else {
                        resolve(CSAResult.end_failed);
                    }
                } catch (err) {
                    resolve(CSAResult.end_failed);
                }
                this.storePromise = undefined;
            });
        }
        return this.storePromise;
    }

}
