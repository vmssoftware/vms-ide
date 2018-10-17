import { IPathConverter } from "./path-converter";
import { ISshConnectionSettings } from "./ssh-connection-settings";

export interface ISftpSettings extends ISshConnectionSettings {
    pathConverter?: IPathConverter;
}
