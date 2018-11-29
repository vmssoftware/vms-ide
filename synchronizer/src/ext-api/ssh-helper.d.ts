import { LogFunction } from "@vorfol/common";
import { ICanCreateReadStream, ICanCreateWriteStream, ISftpClient, ISshShell, IMemoryStreamCreator } from "./api";
export interface IDispose {
    dispose(): any;
}
export declare class SshHelper {
    readonly extensionName: string;
    logFn: LogFunction;
    constructor(logFn?: LogFunction);
    dispose(): void;
    clearPasswordCashe(): void;
    pipeFile(source: ICanCreateReadStream, dest: ICanCreateWriteStream, file: string, destFile?: string, logFn?: LogFunction): Promise<boolean>;
    memStream(): IMemoryStreamCreator;
    editSettings(scope?: string): Promise<boolean>;
    getDefaultSftp(scope?: string): Promise<ISftpClient | undefined>;
    getDefaultVmsShell(scope?: string): Promise<ISshShell | undefined>;
    setConfigWatcher(scope: string, watcher: () => void): IDispose;
    getTestSftp(host: string, port: number, username: string, password: string): Promise<ISftpClient>;
    getTestShell(host: string, port: number, username: string, password: string, isVms: boolean): Promise<ISshShell>;
}
//# sourceMappingURL=ssh-helper.d.ts.map