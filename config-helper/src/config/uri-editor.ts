
import { ConfigEditor, Config } from "./config";
import { Uri } from "vscode";
import { window } from "vscode";


export class UriEditor implements ConfigEditor {

    constructor(protected _uri: Uri, protected _cfg: Config) {

    }

    invoke(): Promise<boolean> {
        return new Promise<boolean>((resolve) => {
            this._cfg.save().then(()=>{
                window.showTextDocument(this._uri).then(() => {
                    resolve(true);
                }, () => {
                    resolve(false);
                });
            });
        });
    }

}