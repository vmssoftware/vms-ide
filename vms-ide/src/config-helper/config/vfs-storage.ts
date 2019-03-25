import { Position, Range, Uri, workspace, WorkspaceEdit } from "vscode";

import { LogFunction, LogType } from "../../common/main";
import { CSAResult } from "./config";
import { FSConfigStorage } from "./fs-storage";

// import * as nls from "vscode-nls";
// nls.config({messageFormat: nls.MessageFormat.both});
// const localize = nls.loadMessageBundle();

/**
 * Such as FS_ConfigStorage, but using VS Code provided read/write functions
 */
export class VFSConfigStorage extends FSConfigStorage {

    constructor(protected fileUri: Uri, logFn?: LogFunction) {
        super(fileUri.fsPath, logFn);
    }

    public fillStart(): Promise<CSAResult> {
        this.logFn(LogType.debug, () => "fillStart =");
        if (!this.fillStartPromise) {
            this.fillStartPromise = new Promise<CSAResult>(async (resolve) => {
                try {
                    const textDoc = await workspace.openTextDocument(this.fileUri);
                    const content = textDoc.getText();
                    this.jsonData = JSON.parse(content);
                    resolve(CSAResult.ok);
                    this.logFn(LogType.debug, () => "fillStart => ok");
                } catch (error) {
                    resolve(CSAResult.prepare_failed);
                    this.logFn(LogType.debug, () => "fillStart => fail");
                }
                this.fillStartPromise = undefined;
                this.logFn(LogType.debug, () => "fillStart => clear");
            });
        }
        return this.fillStartPromise;
    }

    public storeEnd(): Promise<CSAResult> {
        this.logFn(LogType.debug, () => "storeEnd =");
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
