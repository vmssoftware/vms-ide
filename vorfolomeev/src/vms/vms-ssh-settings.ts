import { ISftpSettings } from "../ssh/sftp-settings";
import { IShellSettings } from "../ssh/shell-settings";

export interface IVmsSShSettings extends ISftpSettings, IShellSettings {
    root?: string;
}
