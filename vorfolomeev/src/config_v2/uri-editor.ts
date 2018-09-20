
import { ConfigEditor } from "./config_v2";
import { Uri } from "vscode";
import { window } from "vscode";


export class UriEditor implements ConfigEditor {

    constructor(protected _uri: Uri) {

    }

    invoke(): Thenable<boolean> {
        return new Promise<boolean>((resolve, reject) => {
            window.showTextDocument(this._uri).then((text_editor) => {
                resolve(true);
            }, (error) => {
                resolve(false);
            });
        });
    }

}