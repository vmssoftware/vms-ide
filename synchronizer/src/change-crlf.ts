import { LogFunction, LogType } from "@vorfol/common";
import * as path from "path";
import { EndOfLine, Range, TextEdit, Uri, workspace, WorkspaceEdit } from "vscode";
import { ensureSettings, projectSection } from "./ensure-settings";
import { FsSource } from "./sync/fs-source";

export class ChangeCrLf {

    public logFn: LogFunction;
    constructor(log?: LogFunction) {
        // tslint:disable-next-line:no-empty
        this.logFn = log || (() => {});
    }

    public async perform() {
        if (!await ensureSettings()) {
            return false;
        }
        if (projectSection && workspace.workspaceFolders && workspace.workspaceFolders.length > 0) {
            const wsUri = workspace.workspaceFolders[0].uri;
            const filesCfg = workspace.getConfiguration("files");
            filesCfg.update("eol", "\n", false);
            const localSource = new FsSource(wsUri.fsPath, this.logFn);
            const fileNames = [projectSection.builders, projectSection.headers, projectSection.source].join(",");
            const fileEntries = await localSource.findFiles(fileNames, projectSection.exclude);
            for (const fileEntry of fileEntries) {
                try {
                    const uri = Uri.file(path.join(wsUri.fsPath, fileEntry.filename));
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
                    }
                } catch (err) {
                    this.logFn(LogType.error, () => `File ${fileEntry.filename}: ${err}`);
                }
            }
        }
        return true;
    }
}
