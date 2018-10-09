import { IExecutionResult } from "../ssh/exec";
import { IShellParser } from "../ssh/shell-parser";

export interface ISyncSiteHelper {
    lastError: any;
    dispose(): Promise<boolean>;
    waitComplete(): Promise<boolean>;
    // tslint:disable-next-line:max-line-length
    executeShellCmd(cmd: string, parser?: IShellParser | undefined, asap?: boolean): Promise<IExecutionResult | undefined>;
    executeCmd(cmd: string, asap?: boolean): Promise<IExecutionResult | undefined>;
    getModifiedTime(relPath: string, asap?: boolean): Promise<Date | undefined>;
    setModifiedTime(relPath: string, date: Date, asap?: boolean): Promise<boolean>;
    updateContent(relPath: string, buffer: Buffer, asap?: boolean): Promise<boolean>;
}
