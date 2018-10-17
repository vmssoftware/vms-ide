import { IShellParser } from "./shell-parser";
import { ISshConnectionSettings } from "./ssh-connection-settings";

export interface IShellSettings extends ISshConnectionSettings {
    parser?: IShellParser;
}
