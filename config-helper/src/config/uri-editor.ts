
import { Uri, window } from "vscode";

import { LogFunction, LogType } from "@vorfol/common";
import { IConfig, IConfigEditor } from "./config";

// import * as nls from "vscode-nls";
// nls.config({messageFormat: nls.MessageFormat.both});
// const localize = nls.loadMessageBundle();

export class UriEditor implements IConfigEditor {

    constructor(protected uri: Uri, protected cfg: IConfig, public logFn?: LogFunction) {

    }

    public invoke(): Promise<boolean> {
        return new Promise<boolean>((resolve) => {
            this.cfg.save().then(() => {
                window.showTextDocument(this.uri, { preview: false }).then(() => {
                    resolve(true);
                }, () => {
                    resolve(false);
                });
            });
        });
    }

}
