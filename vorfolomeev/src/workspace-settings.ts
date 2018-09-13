import {workspace, window, commands} from 'vscode';

import * as nls from 'vscode-nls';
let _localize = nls.loadMessageBundle();

export class WorkspaceSettings {

    private static readonly _errorMessage = _localize('ws_set.error', `Please, configure "Extensions->OpenVMS settings"`);
    
    private static readonly _openSettingsCommand = 'workbench.action.openWorkspaceSettings';
    private static readonly _configurationSection = 'open-vms';

    public static GetConfigurationSection() {
        return this._configurationSection;
    }

    /** 
     * Get value from workspace settings only. Ignore default value.
     * 
     */
    public static GetValue<T>(section:string) : T | undefined {

        let configuration = workspace.getConfiguration(this._configurationSection);
        let config = configuration.inspect(section);
        if (!config || !config.workspaceValue) 
        {
            return undefined;
        }
        return configuration.get<T>(section);
    }

    /** 
     * Show error message and open workspace settings. Ignore all results.
     * 
     */
    public static WarnUser() {
        window.showErrorMessage(this._errorMessage)
            .then((value => {
                //ok
            }),
            (error) => {
                //not ok, ignore
            }
        );
        commands.executeCommand(this._openSettingsCommand)
            .then((value => {
                //ok
            }),
            (error) => {
                //not ok, ignore
            }
        );
}

}