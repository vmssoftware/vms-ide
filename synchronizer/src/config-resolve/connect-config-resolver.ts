
import { ConnectConfig } from "ssh2";

export interface IConnectConfigResolver {
    timeout?: number;
    resolveConnectConfig(settings: ConnectConfig): Promise<ConnectConfig|undefined>;
    feedBack(settings: ConnectConfig, accepted: boolean): void;
    clearCache(): boolean;
}
