
import { Uri, window, workspace, Range, WorkspaceEdit, Position } from "vscode";

import { LogFunction, LogType } from "../../common/main";
import { IConfig, IConfigEditor, CSAResult } from "./config";
import { ConfigStorageImpl } from "./storage-impl";

// import * as nls from "vscode-nls";
// nls.config({messageFormat: nls.MessageFormat.both});
// const localize = nls.loadMessageBundle();

export class UriEditor implements IConfigEditor {

    constructor(protected uri: Uri, protected cfg: IConfig, public logFn?: LogFunction) {

    }

    public invoke(): Promise<boolean> {
        return new Promise<boolean>((resolve) => {
            const buffer = new ConfigStorageImpl();
            this.cfg.save(buffer).then(async (result) => {
                if (result === CSAResult.ok && buffer.GetContent()) {
                    try {
                        let range: Range | undefined;
                        try {
                            const textDoc = await workspace.openTextDocument(this.uri);
                            range = textDoc.validateRange(new Range(0, 0, 32767, 32767));
                        } catch (err) {
                            range = undefined;
                        }
                        const we = new WorkspaceEdit();
                        const str = buffer.GetContent();
                        let uri = this.uri;
                        if (!range) {
                            uri = this.uri.with({ scheme: "untitled"});
                            we.insert(uri, new Position(0, 0), str!);
                        } else {
                            we.replace(uri, range, str!);
                        }
                        const doc = await workspace.openTextDocument(uri);
                        const applied = await workspace.applyEdit(we);
                        await window.showTextDocument(doc, { preview: false });
                        resolve(true);
                    } catch (err) {
                        resolve(false);
                    }
                } else {
                    resolve(false);
                }
            });
        });
    }

}
