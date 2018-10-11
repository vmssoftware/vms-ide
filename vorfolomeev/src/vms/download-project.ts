import { AskPasswordWindow } from "../common/ask-password-window";
import { IConfigHelper } from "../config/config";
import { ProjectSection } from "../config/sections/project";
import { UserPasswordSection } from "../config/sections/user-password";
import { ToOutputChannel } from "../output-channel";
import { PasswordResolver } from "../ssh/password-checker-4";
import { ISftpSettings, SftpConnection } from "../ssh/sftp-connection";
import { VmsPathConverterRoot } from "./vms-path-converter-root";

// tslint:disable-next-line:no-console
export let logFn = console.log;
// tslint:disable-next-line:no-empty
logFn = () => {};

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
            sftpSettings.settingsResolver = new PasswordResolver(new AskPasswordWindow());
        }
        let projectSection = await configHelper.getConfig().get(ProjectSection.section);
        if (!projectSection) {
            configHelper.getConfig().add(new ProjectSection());
            projectSection = await configHelper.getConfig().get(ProjectSection.section);
        }
        if (ProjectSection.is(projectSection)) {
            sftpSettings.pathConverter = new VmsPathConverterRoot(projectSection.root);
        }
        const sftp = new SftpConnection(sftpSettings);
        const files: string[] = [];
        const retCode = await sftp.readDirectoryTree("", files);
        if (retCode) {
            for (const file of files) {
                ToOutputChannel(file);
            }
            return true;
        }
        return false;
    });
}
