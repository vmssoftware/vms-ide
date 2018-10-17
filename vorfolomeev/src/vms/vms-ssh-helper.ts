
import { SshExec } from "../ssh/exec";
import { IExecutionResult } from "../ssh/execution-result";
import { IPathConverter } from "../ssh/path-converter";
import { SftpConnection } from "../ssh/sftp-connection";
import { ShellConnecttion } from "../ssh/shell-connection";
import { IShellParser } from "../ssh/shell-parser";
import { ISyncSiteHelper } from "../sync-old/sync-site-helper";
import { VmsAbsoluteDateString } from "./vms-absolute-date-string";
import { VmsPathConverterRoot } from "./vms-path-converter-root";
import { IVmsSShSettings } from "./vms-ssh-settings";

export type LogType = (message?: any, ...optionalParams: any[]) => void;
export let logFn: LogType | undefined;

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
    private timeZoneOffsetPromise: Promise<number | undefined> | undefined;   // in seconds
    private pathConverter: IPathConverter;
    private settings: IVmsSShSettings;

    private readonly cmdGetTimeOffset = `WRITE SYS$OUTPUT F$TRNLNM("SYS$TIMEZONE_DIFFERENTIAL")`;

    constructor(settings: IVmsSShSettings) {
        this.pathConverter = new VmsPathConverterRoot(settings.root);
        settings.pathConverter = this.pathConverter;
        this.sftpConnection = new SftpConnection(settings);
        this.shellConnection = new ShellConnecttion(settings);
        this.settings = Object.assign({}, settings);
    }

    public settingsChanged(settings: IVmsSShSettings) {
        if (this.settings.root !== settings.root) {
            // create new pathConverter
            this.pathConverter = new VmsPathConverterRoot(settings.root);
        }
        settings.pathConverter = this.pathConverter;
        this.sftpConnection.settingsChanged(settings);
        this.shellConnection.settingsChanged(settings);
        this.settings = Object.assign({}, settings);
        this.timeZoneOffsetPromise = undefined;
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
                if (logFn) { logFn(`VMS date of ${relPath} is ${date}`); }
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
            if (!this.timeZoneOffsetPromise) {
                this.timeZoneOffsetPromise = this.getTimeZoneOffset();
            }
            const timeOffset = await this.timeZoneOffsetPromise;
            if (typeof timeOffset === "number") {
                siteDate += timeOffset * 1000; // date.valueOf() in milliseconds
            }
            const dateString = VmsAbsoluteDateString(new Date(siteDate));
            // we have to set both mod and att times
            const strCmd = `set file ${fileName} /attributes=(mod="${dateString}",att="${dateString}")`;
            const result = await this.executeShellCmd(strCmd, undefined, asap);
            if (result) {
                // it doesn't matter what exactly returns. it may fail on VMS site. we sould parse result
                resolve(true);
            } else {
                resolve(false);
            }
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
            if (logFn) { logFn(`getTimeOffset after executeCmd: ${offsetInMinutes}`); }
            resolve(offsetInMinutes);
        });
    }

}
