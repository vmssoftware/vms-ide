
import { Uri, window } from "vscode";

import { LogType } from "@vorfol/common";
import { IConfig, IConfigEditor } from "./config";

// import * as nls from "vscode-nls";
// const localize = nls.loadMessageBundle();

export class UriEditor implements IConfigEditor {

    constructor(protected uri: Uri, protected cfg: IConfig, public debugLog?: LogType) {

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
