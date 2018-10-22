
import { ftpPathSeparator } from "../common/find-files";
import { Lock } from "../common/lock";
import { LogType } from "../common/log-type";
import { ParseWelcomeVms } from "../stream/parse-welcome-vms";
import { PromptCatcherVms } from "../stream/prompt-catcher-vms";
import { SftpClient } from "../stream/sftp-client";
import { SshShell } from "../stream/ssh-shell";
import { VmsAbsoluteDateString } from "../vms/vms-absolute-date-string";
import { VmsPathConverter } from "../vms/vms-path-converter";
import { SftpSource } from "./sftp-source";

const cmdGetTimeOffset = `WRITE SYS$OUTPUT F$TRNLNM("SYS$TIMEZONE_DIFFERENTIAL")`;

export class VmsSource extends SftpSource {

    private timeOffsetInSeconds?: number;
    private timeOffetLock = new Lock();

    constructor(sftp: SftpClient,
                protected shell: SshShell,
                root: string,
                debugLog?: LogType) {
        super(sftp, root, debugLog);
    }

    public async setDate(filename: string, date: Date): Promise<boolean> {
        if (this.timeOffsetInSeconds === undefined) {
            if (!await this.ensureTimeOffset()) {
                return false;
            }
        }
        if (this.timeOffsetInSeconds !== undefined) {
            filename = this.root + ftpPathSeparator + filename;
            const converter = new VmsPathConverter(filename);
            const siteFileDate = new Date(date.valueOf() + this.timeOffsetInSeconds * 1000);
            const dateString = VmsAbsoluteDateString(siteFileDate);
            const strCmd = `set file ${converter.fullPath} /attributes=(mod="${dateString}",att="${dateString}")`;
            const result = await this.shell.execCmd(strCmd);
            if (result) {
                return true;
            }
        }
        return false;
    }

    private async ensureTimeOffset() {
        await this.timeOffetLock.acquire();
        if (this.timeOffsetInSeconds !== undefined) {
            this.timeOffetLock.release();
            return true;
        }
        const result = await this.shell.execCmd(cmdGetTimeOffset);
        if (!result) {
            this.timeOffetLock.release();
            return false;
        }
        result.split("\n").some((line) => {
            const time = Number.parseInt(line, 10);
            if (typeof time === "number" &&
                Number.isInteger(time)) {
                this.timeOffsetInSeconds = time;
                return true;
            }
            return false;
        });
        this.timeOffetLock.release();
        return this.timeOffsetInSeconds !== undefined;
    }
}
