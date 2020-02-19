import { IFileEntry, LogFunction, MemoryReadStream, MemoryWriteStream } from "../common/main";

import { Readable, Transform, Writable } from "stream";
import { EventEmitter } from "events";

export interface ICanCreateReadStream {
    createReadStream(file: string): Promise<Readable | undefined>;
}

export interface ICanCreateWriteStream {
    createWriteStream(file: string): Promise<Writable | undefined>;
}

export interface IMemoryStreamCreator extends ICanCreateReadStream, ICanCreateWriteStream {
    chunks?: Array<Buffer | null> | undefined;
    emulateError?: boolean | undefined;
    logFn?: LogFunction | undefined;
    readStream?: MemoryReadStream;
    writeStream?: MemoryWriteStream;
    createReadStream(file: string): Promise<Readable>;
    createWriteStream(file: string): Promise<Writable>;
}

export interface IInputAttributes {
    mode?: number | string;
    uid?: number;
    gid?: number;
    size?: number;
    atime?: number | Date;
    mtime?: number | Date;
}

export interface IAttributes {
    mode: number;
    uid: number;
    gid: number;
    size: number;
    atime: number;
    mtime: number;
}

export interface IStats extends IAttributes {
    isDirectory(): boolean;
    isFile(): boolean;
    isBlockDevice(): boolean;
    isCharacterDevice(): boolean;
    isSymbolicLink(): boolean;
    isFIFO(): boolean;
    isSocket(): boolean;
}

export interface IShellParser extends Transform {
    content: string;
    readyEvent: symbol;
    lastError?: Error;
    timeout?: number;
    prepare(): void;
}

export interface IPromptCatcher extends IShellParser {
    prompt: string;
}

export interface IParseWelcome extends IShellParser {
    prompt?: string;
    width?: number;
}

export interface ISftpClient extends EventEmitter {
    enabled: boolean;
    createReadStream(file: string): Promise<Readable | undefined>;
    createWriteStream(file: string): Promise<Writable | undefined>;
    getStat(file: string): Promise<IStats | undefined>;
    setStat(file: string, stat: IInputAttributes): Promise<void>;
    readDirectory(directory: string): Promise<IFileEntry[] | undefined>;
    ensureDirectory(directory: string): Promise<boolean>;
    deleteFile(file: string): Promise<boolean>;
    dispose(): void;
}

export interface ISshShell extends EventEmitter {
    enabled: boolean;
    prompt?: string;
    width?: number;
    lastError?: string;
    setParsers(welcome?: IParseWelcome, prompter?: IPromptCatcher): void;
    dispose(): void;
    attachUser(user: Transform, stderr?: Transform): Promise<boolean>;
    detachUser(): Promise<void>;
    execCmd(command: string, timeout?: number): Promise<string[] | undefined>;
}


export interface IAlgorithms {
    kex?: string[];
    cipher?: string[];
    serverHostKey?: string[];
    hmac?: string[];
    compress?: string[];
}

export interface IConnectionSection {
    host: string;
    port?: number;
    username?: string;
    password?: string;
    keyFile?: string;
    skipSignatureVerification?: boolean;
    algorithms?: IAlgorithms;
    supportSetFileTime?: boolean;
    unzipCmd?: string;
}

export interface IHost extends IConnectionSection {
    label: string;
}

export interface IHostsSection {
    hosts: IHost[];
}

export interface ITimeoutsSection  {
    cmdTimeout: number;
    feedbackTimeout: number;
    welcomeTimeout: number;
}

export interface ITerminalSection  {
    command: string;
}

export enum ResolverState {
    absent,
    asked,
    accepted,
    rejected,
}

export interface IConnectConfigResolver<T extends any> {
    timeout?: number;
    resolveConnectConfig(settings: T): Promise<T | undefined>;
    testConnectConfig(settings: T): {settings?: T, state: ResolverState };
    feedBack(settings: T, accepted: boolean): void;
    clearCache(): boolean;
}

export interface IConnectConfig extends IConnectionSection {
    privateKey?: Buffer | string;
}

export interface ISshScopeSettings {
    connectionSection: IConnectionSection;
    hostsSection: IHostsSection;
    timeoutSection: ITimeoutsSection;
    terminalSection: ITerminalSection;
    connectConfigResolver: IConnectConfigResolver<IConnectConfig>;
}
