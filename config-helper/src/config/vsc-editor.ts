
import { ConfigEditor, Config } from "./config";
import { commands } from "vscode";

export class VSC_WorkspaceConfigEditor implements ConfigEditor {

    constructor(private _cfg: Config) {

    }

    private readonly _command = 'workbench.action.openWorkspaceSettings';
    invoke(): Promise<boolean> {
        return new Promise<boolean>((resolve) => {
            this._cfg.save().then(()=>{
                //execute edit command in any case
                commands.executeCommand(this._command).then(() => {
                    resolve(true);
                }, () => {
                    resolve(false);
                });
            });
        });
    }

}