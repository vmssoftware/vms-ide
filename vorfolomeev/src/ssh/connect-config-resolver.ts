
import { ConnectConfig } from "ssh2";
import { IAskPassword } from "../common/ask-password";

export interface IConnectConfigResolver {
    resolveConnectConfig(settings: ConnectConfig): Promise<ConnectConfig|undefined>;
    feedBack(settings: ConnectConfig, accepted: boolean): void;
    clearCache(): boolean;
}
