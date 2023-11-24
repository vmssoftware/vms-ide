import { LogFunction, LogType } from "../common/main";

import * as path from "path";
import { commands, EndOfLine, Range, TextEdit, Uri, window, workspace, WorkspaceEdit } from "vscode";
import { IEnsured } from "./ensure-settings";
import { FsSource } from "./sync/fs-source";
import { Synchronizer } from "./sync/synchronizer";

export class ChangeCrLf {

    public logFn: LogFunction;
    constructor(log?: LogFunction) {
        // tslint:disable-next-line:no-empty
        this.logFn = log || (() => {});
    }

    public async perform(ensured: IEnsured) {
        if (ensured.configHelper.workspaceFolder) {
            const synchronizer = Synchronizer.acquire(this.logFn);
            const filesCfg = workspace.getConfiguration("files", ensured.configHelper.workspaceFolder.uri);
            filesCfg.update("eol", "\n", false);
            const localPath = ensured.configHelper.workspaceFolder.uri.fsPath;
            const localSource = new FsSource(localPath, this.logFn);
            const fileNames = [ensured.projectSection.builders, ensured.projectSection.headers, ensured.projectSection.source].join(",");
            const fileEntries = await localSource.findFiles(fileNames, ensured.projectSection.exclude);
            const openedDocs = workspace.textDocuments;
            if (fileEntries) {
                for (const fileEntry of fileEntries) {
                    if (synchronizer.stopIssued) {
                        this.logFn(LogType.information, () => `Stopped`);
                        return false;
                    }
                    try {
                        const uri = Uri.file(path.join(localPath, fileEntry.filename));
                        const doc = await workspace.openTextDocument(uri);
                        if (doc && doc.eol === EndOfLine.CRLF) {
                            this.logFn(LogType.information, () => `File ${fileEntry.filename} had CRLF => changed to LF`);
                            // we need empty TextEdit just to set newEol for all document
                            const range = new Range(0, 0, 0, 0);
                            const textEdit = new TextEdit(range, "");
                            textEdit.newEol = EndOfLine.LF;
                            const wsEdit = new WorkspaceEdit();
                            wsEdit.set(uri, [textEdit]);
                            await workspace.applyEdit(wsEdit);
                            await doc.save();
                            if (!openedDocs.includes(doc)) {
                                window.showTextDocument(doc, {preview: true, preserveFocus: false})
                                    .then(() => {
                                        return commands.executeCommand('workbench.action.closeActiveEditor');
                                });
                            }
                        }
                    } catch (err) {
                        this.logFn(LogType.error, () => `File ${fileEntry.filename}: ${err}`);
                    }
                }
            }
        }
        return true;
    }
}
