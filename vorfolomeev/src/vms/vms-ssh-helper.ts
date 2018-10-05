import * as readline from "readline";
import { IConfigHelper } from "../ext-api/config";
import { IShellParser } from "../ssh/shell-parser";
import { IExecutionResult, ISshHelper, SshHelper } from "../ssh/ssh-helper";
import { Date2VmsAbsDateStr } from "./date-2-string";
import { VmsPath } from "./vms-path";

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
    private timeOffsetPromise: Promise<number | undefined>;   // in seconds
    private readonly cmdGetTimeOffset = `WRITE SYS$OUTPUT F$TRNLNM("SYS$TIMEZONE_DIFFERENTIAL")`;

    constructor(private configHelper: IConfigHelper) {
        this.sshHelperSFTP = new SshHelper(configHelper);
        this.sshHelperShell = new SshHelper(configHelper);
        this.timeOffsetPromise = this.getTimeOffset();   // just post task
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

    public executeShellCmd(cmd: string, parser?: IShellParser, next?: boolean): Promise<IExecutionResult | undefined> {
        return this.sshHelperShell.executeShellCmd(cmd, parser, next);
    }

    /**
     * Slow, because create new connection. All errors will be discarded.
     * @param cmd command to execute
     */
    public executeCmd(cmd: string, next: boolean = false): Promise<IExecutionResult | undefined> {
        return (new SshHelper(this.configHelper)).executeCmd(cmd, next);
    }

    public getModifiedTime(relPath: string): Promise<Date | undefined> {
        const vmsPath = new VmsPath(relPath);
        return this.sshHelperSFTP.getModifiedTime(vmsPath.fullPath);
    }

    public setModifiedTime(relPath: string, date: Date): Promise<boolean> {
        return new Promise<boolean>(async (resolve) => {
            const vmsPath = new VmsPath(relPath);
            const fileName = vmsPath.fullPath;
            const utcDate = date.valueOf();
            let siteDate = utcDate;
            const timeOffset = await this.timeOffsetPromise;   // bevare deadlock
            if (typeof timeOffset === "number") {
                siteDate += timeOffset * 1000; // date.valueOf() in milliseconds
            }
            const dateString = Date2VmsAbsDateStr(new Date(siteDate));
            // we have to set both mod and att times
            const strCmd = `set file ${fileName} /attributes=(mod="${dateString}",att="${dateString}")`;
            this.executeShellCmd(strCmd).then((result) => {
                if (result) {
                    resolve(true);
                } else {
                    resolve(false);
                }
            });
        });
    }

    public updateContent(relPath: string, buffer: Buffer): Promise<boolean> {
        const vmsPath = new VmsPath(relPath);
        return this.sshHelperSFTP.updateContent(vmsPath.fullPath, buffer);
    }

    /**
     * Converts full path to vms dir and ensure dir exists
     * @param relPath full path name
     */
    public ensurePath(relPath: string): Promise<boolean> {
        const vmsPath = new VmsPath(relPath);
        return this.sshHelperSFTP.ensurePath(vmsPath.directory);
    }

    private getTimeOffset(): Promise<number> {
        return new Promise<number>(async (resolve) => {
            const result = await this.executeShellCmd(this.cmdGetTimeOffset, undefined, true);
            let timeOffset = 0;
            if (result && result.stdout) {
                result.stdout.split("\n").some((line) => {
                    timeOffset = Number.parseInt(line, 10);
                    if (typeof timeOffset === "number" &&
                        Number.isInteger(timeOffset)) {
                        return true;
                    }
                    return false;
                });
            }
            logFn(`getTimeOffset after executeCmd ${timeOffset}`);
            resolve(timeOffset);
        });
    }

}
