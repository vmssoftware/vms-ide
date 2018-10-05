
import { IConfigHelper } from "../config/config";
import { IPathConverter } from "../ssh/path-converter";
import { IShellParser } from "../ssh/shell-parser";
import { IExecutionResult, ISshHelper, SshHelper } from "../ssh/ssh-helper";
import { VmsAbsoluteDateString } from "./vms-absolute-date-string";
import { VmsPathConverter } from "./vms-path-converter";

// tslint:disable-next-line:no-console
export let logFn = console.log;
// tslint:disable-next-line:no-empty
logFn = () => {};

export class VmsSshHelper implements ISshHelper {

    public get lastError(): any {
        if (this.sshHelperSFTP.lastError) {
            return this.sshHelperSFTP.lastError;
        }
        return this.sshHelperShell.lastError;
    }
    private sshHelperSFTP: SshHelper;
    private sshHelperShell: SshHelper;
    private timeZoneOffsetPromise: Promise<number | undefined>;   // in seconds
    private pathConverter: IPathConverter = new VmsPathConverter();

    private readonly cmdGetTimeOffset = `WRITE SYS$OUTPUT F$TRNLNM("SYS$TIMEZONE_DIFFERENTIAL")`;

    constructor(private configHelper: IConfigHelper) {
        this.sshHelperSFTP = new SshHelper(configHelper, this.pathConverter);
        this.sshHelperShell = new SshHelper(configHelper, this.pathConverter);
        this.timeZoneOffsetPromise = this.getTimeZoneOffset();   // just post task
    }

    public dispose(): Promise<boolean> {
        const arrDisp = [this.sshHelperSFTP.dispose(), this.sshHelperShell.dispose()];
        return Promise.all(arrDisp).then((results) => {
            return results.reduce((acc, cur) => acc && cur);
        });
    }

    public waitComplete(): Promise<boolean> {
        const arrComplete = [this.sshHelperSFTP.waitComplete(), this.sshHelperShell.waitComplete()];
        return Promise.all(arrComplete).then((results) => {
            return results.reduce((acc, cur) => acc && cur);
        });
    }

    // tslint:disable-next-line:max-line-length
    public executeShellCmd(cmd: string, parser?: IShellParser, asap: boolean = false): Promise<IExecutionResult | undefined> {
        return this.sshHelperShell.executeShellCmd(cmd, parser, asap);
    }

    /**
     * Slow, because create new connection. All errors will be discarded.
     * @param cmd command to execute
     */
    public executeCmd(cmd: string, asap: boolean = false): Promise<IExecutionResult | undefined> {
        return (new SshHelper(this.configHelper)).executeCmd(cmd, asap);
    }

    public getModifiedTime(relPath: string, asap: boolean = false): Promise<Date | undefined> {
        return this.sshHelperSFTP.getModifiedTime(relPath, asap).then((date) => {
            if (date) {
                // vms sftp returns mtime in seconds
                date = new Date( date.valueOf() * 1000 );
                logFn(`VMS date of ${relPath} is ${date}`);
            }
            return date;
        });
    }

    public setModifiedTime(relPath: string, date: Date, asap: boolean = false): Promise<boolean> {
        return new Promise<boolean>(async (resolve) => {
            const converted = this.pathConverter.from(relPath);
            const fileName = converted.fullPath;
            const utcDate = date.valueOf();
            let siteDate = utcDate;
            const timeOffset = await this.timeZoneOffsetPromise;
            if (typeof timeOffset === "number") {
                siteDate += timeOffset * 1000; // date.valueOf() in milliseconds
            }
            const dateString = VmsAbsoluteDateString(new Date(siteDate));
            // we have to set both mod and att times
            const strCmd = `set file ${fileName} /attributes=(mod="${dateString}",att="${dateString}")`;
            this.executeShellCmd(strCmd, undefined, asap).then((result) => {
                if (result) {
                    resolve(true);
                } else {
                    resolve(false);
                }
            });
        });
    }

    public updateContent(relPath: string, buffer: Buffer, asap: boolean = false): Promise<boolean> {
        return this.sshHelperSFTP.updateContent(relPath, buffer, asap);
    }

    private getTimeZoneOffset(): Promise<number> {
        return new Promise<number>(async (resolve) => {
            const result = await this.executeShellCmd(this.cmdGetTimeOffset, undefined, true);
            let offsetInMinutes = 0;
            if (result && result.stdout) {
                result.stdout.split("\n").some((line) => {
                    offsetInMinutes = Number.parseInt(line, 10);
                    if (typeof offsetInMinutes === "number" &&
                        Number.isInteger(offsetInMinutes)) {
                        return true;
                    }
                    return false;
                });
            }
            logFn(`getTimeOffset after executeCmd: ${offsetInMinutes}`);
            resolve(offsetInMinutes);
        });
    }

}
