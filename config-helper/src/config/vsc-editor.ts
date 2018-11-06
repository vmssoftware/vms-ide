
import { LogFunction, LogType } from "@vorfol/common";
import { commands } from "vscode";
import { IConfig, IConfigEditor } from "./config";

// import * as nls from "vscode-nls";
// nls.config({messageFormat: nls.MessageFormat.both});
// const localize = nls.loadMessageBundle();

export class VSCWorkspaceConfigEditor implements IConfigEditor {

    private readonly command = "workbench.action.openWorkspaceSettings";

    constructor(private cfg: IConfig, public logFn?: LogFunction) {

    }

    public invoke(): Promise<boolean> {
        return new Promise<boolean>((resolve) => {
            this.cfg.save().then(() => {
                // execute edit command in any case
                commands.executeCommand(this.command).then(() => {
                    resolve(true);
                }, () => {
                    resolve(false);
                });
            });
        });
    }

}
