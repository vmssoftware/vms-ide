import { IConfigHelper } from "../ext-api/config";
import { IShellParser } from "../ssh/shell-parser";
import { IExecutionResult, ISshHelper, SshHelper } from "../ssh/ssh-helper";
import { Date2VmsAbsDateStr } from "./date-2-string";

// tslint:disable-next-line:no-console
export let logFn = console.log;
// tslint:disable-next-line:no-empty
logFn = () => {};

export class VmsSshHelper implements ISshHelper {

    private sshHelper: SshHelper;
    private timeOffset: number | undefined;   // in seconds
    private readonly cmdGetTimeOffset = `WRITE SYS$OUTPUT F$TRNLNM("SYS$TIMEZONE_DIFFERENTIAL")`;

    constructor(private configHelper: IConfigHelper) {
        this.sshHelper = new SshHelper(configHelper);
        this.getTimeOffset();   // just post task
    }

    public get lastError(): any {
        return this.sshHelper.lastError;
    }

    public dispose(): Promise<boolean> {
        return this.sshHelper.dispose();
    }

    public waitComplete(): Promise<boolean> {
        return this.sshHelper.waitComplete();
    }

    public executeShellCmd(cmd: string, parser?: IShellParser): Promise<IExecutionResult | undefined> {
        return this.sshHelper.executeShellCmd(cmd, parser);
    }

    public executeCmd(cmd: string): Promise<IExecutionResult | undefined> {
        return this.sshHelper.executeCmd(cmd);
    }

    public getModifiedTime(relPath: string): Promise<Date | undefined> {
        // TODO: convert relPath to RMS path
        return this.sshHelper.getModifiedTime(relPath);
    }

    public setModifiedTime(relPath: string, date: Date): Promise<boolean> {
        return new Promise<boolean>(async (resolve) => {
            // TODO: convert relPath to RMS path
            const fileName = relPath;
            const utcDate = date.valueOf();
            let siteDate = utcDate;
            await this.getTimeOffset();
            if (typeof this.timeOffset === "number") {
                siteDate += this.timeOffset * 1000; // date.valueOf() in milliseconds
            }
            const dateString = Date2VmsAbsDateStr(new Date(siteDate));
            // we have to set both mod and att times
            const strCmd = `set file ${fileName} /attributes=(mod="${dateString}",att="${dateString}")`;
            this.sshHelper.executeCmd(strCmd).then((result) => {
                if (result) {
                    resolve(true);
                } else {
                    resolve(false);
                }
            });
        });
    }

    public updateContent(relPath: string, buffer: Buffer): Promise<boolean> {
        // TODO: convert relPath to RMS path
        return this.sshHelper.updateContent(relPath, buffer);
    }

    private getTimeOffset(): Promise<number> {
        if (typeof this.timeOffset === "number") {
            return Promise.resolve<number>(this.timeOffset);
        }
        return new Promise<number>(async (resolve) => {
            logFn(`getTimeOffset before executeCmd ${this.timeOffset}`);
            const result = await this.sshHelper.executeCmd(this.cmdGetTimeOffset, true);
            if (result && result.stdout) {
                this.timeOffset = Number.parseInt(result.stdout, 10);
            }
            logFn(`getTimeOffset after executeCmd ${this.timeOffset}`);
            resolve(this.timeOffset);
        });
    }
}
