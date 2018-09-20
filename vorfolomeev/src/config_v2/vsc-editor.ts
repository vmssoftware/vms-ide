
import { ConfigEditor } from "./config_v2";
import { commands } from "vscode";

export class VSC_WorkspaceConfigEditor implements ConfigEditor {
    private readonly _command = 'workbench.action.openWorkspaceSettings';
    invoke(): Thenable<boolean> {
        return new Promise<boolean>((resolve, reject) => {
            commands.executeCommand(this._command).then(() => {
                resolve(true);
            }, (err) => {
                resolve(false);
            });
        });
    }

}