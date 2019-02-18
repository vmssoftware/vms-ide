import { LogFunction } from "@vorfol/common";
import { ICanCreateReadStream, ICanCreateWriteStream, ISftpClient, ISshShell, IMemoryStreamCreator, ISshScopeSettings, IConnectConfig } from "./api";
export interface IDispose {
    dispose(): any;
}
export declare class SshHelper {
    readonly extensionName: string;
    logFn: LogFunction;
    constructor(logFn?: LogFunction);
    dispose(): void;
    clearPasswordCache(): void;
    pipeFile(source: ICanCreateReadStream, dest: ICanCreateWriteStream, file: string, destFile?: string, logFn?: LogFunction): Promise<boolean>;
    memStream(): IMemoryStreamCreator;
    editSettings(scope?: string): Promise<boolean>;
    getDefaultSftp(scope?: string): Promise<ISftpClient | undefined>;
    getSettings(scope?: string): Promise<ISshScopeSettings | undefined>;
    getDefaultVmsShell(scope?: string): Promise<ISshShell | undefined>;
    setConfigWatcher(scope: string, watcher: () => void): IDispose;
    getTestSftp(settings: IConnectConfig): Promise<ISftpClient>;
    getTestShell(settings: IConnectConfig, isVms: boolean): Promise<ISshShell>;
}
//# sourceMappingURL=ssh-helper.d.ts.map