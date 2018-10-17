import { ConnectConfig } from "ssh2";
import { IConnectConfigResolver } from "../config-resolve/connect-config-resolver";

export interface ISshConnectionSettings  {
    connectConfig: ConnectConfig;
    settingsResolver?: IConnectConfigResolver;
}
