
import { SshExec } from "../ssh/exec";
import { IPathConverter } from "../ssh/path-converter";
import { ISftpSettings, SftpConnection } from "../ssh/sftp-connection";
import { IExecutionResult, IShellSettings, ShellConnecttion } from "../ssh/shell-connection";
import { IShellParser } from "../ssh/shell-parser";
import { ISyncSiteHelper } from "../sync/sync-site-helper";
import { VmsAbsoluteDateString } from "./vms-absolute-date-string";
import { VmsPathConverterRoot } from "./vms-path-converter-root";

// tslint:disable-next-line:no-console
export let logFn = console.log;
// tslint:disable-next-line:no-empty
logFn = () => {};

export interface IVmsSShSettings extends ISftpSettings, IShellSettings {
    root?: string;
}

export class VmsSshHelper implements ISyncSiteHelper {

    public get lastError(): any {
        if (this.sftpConnection.lastError) {
            return this.sftpConnection.lastError;
        }
        if (this.shellConnection.lastError) {
            return this.shellConnection.lastError;
        }
        return undefined;
    }

    private sftpConnection: SftpConnection;
    private shellConnection: ShellConnecttion;
    private timeZoneOffsetPromise: Promise<number | undefined>;   // in seconds
    private pathConverter: IPathConverter;
    private settings: IVmsSShSettings;

    private readonly cmdGetTimeOffset = `WRITE SYS$OUTPUT F$TRNLNM("SYS$TIMEZONE_DIFFERENTIAL")`;

    constructor(settings: IVmsSShSettings) {
        this.pathConverter = new VmsPathConverterRoot(undefined, settings.root);
        settings.pathConverter = this.pathConverter;
        this.sftpConnection = new SftpConnection(settings);
        this.shellConnection = new ShellConnecttion(settings);
        this.settings = Object.assign({}, settings);
        this.timeZoneOffsetPromise = this.getTimeZoneOffset();   // just post task
    }

    public dispose(): Promise<boolean> {
        const arrDisp = [this.sftpConnection.dispose(), this.shellConnection.dispose()];
        return Promise.all(arrDisp).then((results) => {
            return results.reduce((acc, cur) => acc && cur);
        });
    }

    public waitComplete(): Promise<boolean> {
        const arrComplete = [this.sftpConnection.waitComplete(), this.shellConnection.waitComplete()];
        return Promise.all(arrComplete).then((results) => {
            return results.reduce((acc, cur) => acc && cur);
        });
    }

    // tslint:disable-next-line:max-line-length
    public executeShellCmd(cmd: string, parser?: IShellParser, asap: boolean = false): Promise<IExecutionResult | undefined> {
        return this.shellConnection.executeShellCmd(cmd, parser, asap);
    }

    /**
     * Slow, because create new connection. All errors will be discarded.
     * @param cmd command to execute
     */
    public executeCmd(cmd: string, asap: boolean = false): Promise<IExecutionResult | undefined> {
        return (new SshExec(this.settings)).executeCmd(cmd);
    }

    public getModifiedTime(relPath: string, asap: boolean = false): Promise<Date | undefined> {
        return this.sftpConnection.getModifiedTime(relPath, asap).then((date) => {
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
        return this.sftpConnection.updateContent(relPath, buffer, asap);
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
