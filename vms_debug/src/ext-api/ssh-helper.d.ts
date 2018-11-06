import { Event } from "vscode";
import { LogFunction } from "@vorfol/common";
import { ICanCreateReadStream, ICanCreateWriteStream, ISftpClient, ISshShell, IMemoryStreamCreator } from "./api";
export declare class SshHelper {
    logFn?: LogFunction | undefined;
    readonly section: string;
    private settingsEnsured?;
    private sections;
    private configHelper?;
    private config?;
    onDidLoadConfig?: Event<null>;
    constructor(logFn?: LogFunction | undefined);
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