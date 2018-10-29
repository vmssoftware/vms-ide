import { Readable, Writable, Transform } from "stream";
import { IFileEntry, LogType, MemoryReadStream, MemoryWriteStream } from "@vorfol/common";

export interface ICanCreateReadStream {
    createReadStream(file: string): Promise<Readable | undefined>;
}

export interface ICanCreateWriteStream {
    createWriteStream(file: string): Promise<Writable | undefined>;
}

export interface IMemoryStreamCreator extends ICanCreateReadStream, ICanCreateWriteStream {
    chunks?: (Buffer | null)[] | undefined;
    emulateError?: boolean | undefined;
    debugLog?: LogType | undefined;
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
    lastError?: Error | undefined;
    prepare(): void;
}

export interface IPromptCatcher extends IShellParser {
    prompt: string;
}

export interface IParseWelcome extends IShellParser {
    prompt?: string;
}

export interface ISftpClient {
    lastSftpError?: Error | undefined;    
    lastClientError?: Error | undefined;
    enabled: boolean;
    createReadStream(file: string): Promise<Readable | undefined>;
    createWriteStream(file: string): Promise<Writable | undefined>;
    getStat(file: string): Promise<IStats | undefined>;
    setStat(file: string, stat: IInputAttributes): Promise<void>;
    readDirectory(directory: string): Promise<IFileEntry[] | undefined>;
    ensureDirectory(directory: string): Promise<boolean>;
    dispose(): void;
}

export interface ISshShell {
    lastShellError?: Error;    
    lastClientError?: Error;
    enabled: boolean;
    prompt?: string;
    setParsers(welcome?: IParseWelcome, prompter?: IPromptCatcher): void;
    dispose(): void;
    attachUser(user: Transform): Promise<boolean>;
    detachUser(): Promise<void>;
    execCmd(command: string): Promise<string | undefined>;
}

