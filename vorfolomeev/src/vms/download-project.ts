import { ConnectConfigResolverImpl } from "../config-resolve/connect-config-resolver-impl";
import { PasswordVscodeFiller } from "../config-resolve/password-vscode-filler";
import { IConfigHelper } from "../config/config";
import { ProjectSection } from "../config/sections/project";
import { UserPasswordSection } from "../config/sections/user-password";
import { ToOutputChannel } from "../output-channel";
import { SftpConnection } from "../ssh/sftp-connection";
import { ISftpSettings } from "../ssh/sftp-settings";
import { VmsPathConverterRoot } from "./vms-path-converter-root";

export type LogType = (message?: any, ...optionalParams: any[]) => void;
export let logFn: LogType | undefined;

export function DownloadProject(configHelper: IConfigHelper): Promise<boolean> {
    return Promise.resolve().then(async () => {
        const sftpSettings: ISftpSettings = {connectConfig: {}};
        let userPasswordSection = await configHelper.getConfig().get(UserPasswordSection.section);
        if (!userPasswordSection) {
            configHelper.getConfig().add(new UserPasswordSection());
            userPasswordSection = await configHelper.getConfig().get(UserPasswordSection.section);
        }
        if (UserPasswordSection.is(userPasswordSection)) {
            sftpSettings.connectConfig = Object.assign({}, userPasswordSection);
            const resolver = new ConnectConfigResolverImpl([new PasswordVscodeFiller()]);
            sftpSettings.settingsResolver = resolver;
        }
        let projectSection = await configHelper.getConfig().get(ProjectSection.section);
        if (!projectSection) {
            configHelper.getConfig().add(new ProjectSection());
            projectSection = await configHelper.getConfig().get(ProjectSection.section);
        }
        if (ProjectSection.is(projectSection)) {
            sftpSettings.pathConverter = new VmsPathConverterRoot(projectSection.root);
        }
        ConnectConfigResolverImpl.clearCache();
        const sftp = new SftpConnection(sftpSettings);
        const files: string[] = [];
        const retCode = await sftp.readDirectoryTree("", files);
        if (retCode) {
            for (const file of files) {
                ToOutputChannel(file);
            }
            return true;
        }
        if (sftp.lastError) {
            ToOutputChannel(sftp.lastError);
        }
        return false;
    });
}
