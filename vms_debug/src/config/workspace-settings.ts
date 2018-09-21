import {workspace, window, commands} from 'vscode';

export class WorkspaceSettings {

    private static _errorMessage = `You should configure "OpenVms settings" for current workspace`;
    private static _openSettingsCommand = 'workbench.action.openWorkspaceSettings';
    private static _configurationSection = 'open-vms';

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
        if (!config /*|| !config.workspaceValue*/)
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