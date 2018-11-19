import { Event } from "vscode";
import { LogFunction } from "@vorfol/common";
import { ICanCreateReadStream, ICanCreateWriteStream, ISftpClient, ISshShell, IMemoryStreamCreator, IConnectionSection, ITimeoutsSection, IConnectConfigResolver } from "./api";
export declare class SshHelper {
    readonly section: string;
    private configHelper?;
    private config?;
    private configIsInvalid;
    private didLoadDispose?;
    onDidLoadConfig?: Event<null>;
    logFn: LogFunction;
    connectionSection?: IConnectionSection;
    timeoutSection?: ITimeoutsSection;
    connectConfigResolver?: IConnectConfigResolver<IConnectionSection>;
    constructor(logFn?: LogFunction);
    dispose(): void;
    clearPasswordCashe(): void;
    pipeFile(source: ICanCreateReadStream, dest: ICanCreateWriteStream, file: string, destFile?: string, logFn?: LogFunction): Promise<boolean>;
    memStream(): IMemoryStreamCreator;
    editSettings(): Promise<boolean>;
    getDefaultSftp(): Promise<ISftpClient | undefined>;
    getDefaultVmsShell(): Promise<ISshShell | undefined>;
    ensureSettings(): Promise<boolean>;
    getTestSftp(host: string, port: number, username: string, password: string): Promise<ISftpClient>;
    getTestShell(host: string, port: number, username: string, password: string, isVms: boolean): Promise<ISshShell>;
}
//# sourceMappingURL=ssh-helper.d.ts.map