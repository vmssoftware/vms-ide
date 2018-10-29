import { Event } from "vscode";
import { LogType } from "@vorfol/common";
import { ICanCreateReadStream, ICanCreateWriteStream, ISftpClient, ISshShell, IMemoryStreamCreator } from "./api";
export declare class SshHelper {
    debugLog?: LogType | undefined;
    readonly section = "vmssoftware.ssh-helper";
    private settingsEnsured?;
    private sections;
    private configHelper?;
    private config?;
    onDidLoadConfig?: Event<null>;
    constructor(debugLog?: LogType | undefined);
    dispose(): void;
    clearPasswordCashe(): void;
    pipeFile(source: ICanCreateReadStream, dest: ICanCreateWriteStream, file: string, destFile?: string, debugLog?: LogType): Promise<boolean>;
    memStream(): IMemoryStreamCreator;
    editSettings(): Promise<boolean>;
    getDefaultSftp(): Promise<ISftpClient | undefined>;
    getDefaultVmsShell(): Promise<ISshShell | undefined>;
    ensureSettings(): Promise<boolean>;
    getTestSftp(host: string, port: number, username: string, password: string): Promise<ISftpClient>;
    getTestShell(host: string, port: number, username: string, password: string, isVms: boolean): Promise<ISshShell>;
}
