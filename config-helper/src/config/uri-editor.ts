
import { Uri, window } from "vscode";
import { IConfig, IConfigEditor } from "./config";

export class UriEditor implements IConfigEditor {

    constructor(protected uri: Uri, protected cfg: IConfig) {

    }

    public invoke(): Promise<boolean> {
        return new Promise<boolean>((resolve) => {
            this.cfg.save().then(() => {
                window.showTextDocument(this.uri).then(() => {
                    resolve(true);
                }, () => {
                    resolve(false);
                });
            });
        });
    }

}
