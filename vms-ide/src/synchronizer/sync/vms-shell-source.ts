
import { Lock, LogFunction } from "../../common/main";
import { LogType } from "../../common/main";
import { printLike } from "../../common/main";
import { ftpPathSeparator } from "../../common/main";

import { ISftpClient, ISshShell } from "../../ssh-helper/api";
import { VmsAbsoluteDateString } from "../vms/vms-absolute-date-string";
import { VmsPathConverter } from "../vms/vms-path-converter";
import { SftpSource } from "./sftp-source";

// const cmdGetTimeOffset = `WRITE SYS$OUTPUT F$TRNLNM("SYS$TIMEZONE_DIFFERENTIAL")`;
const setFileErrorResponse = `%SET-`;
// const setFileFormatSTM = "set file/attribute=RFM:STM ";
const setFileDates = printLike`set file ${"_file_"} /attributes=(mod="${"_date_"}",att="${"_date_"}")`;

export class VmsShellSource extends SftpSource {


    constructor(sftp: ISftpClient,
                protected shell: ISshShell,
                root?: string,
                debugLog?: LogFunction,
                attempts?: number) {
        super(sftp, root, debugLog, attempts);
    }

    public async setDate(filename: string, date: Date): Promise<boolean> {
        // try to set time
        const vmsFileName = this.root + ftpPathSeparator + filename;
        const converter = new VmsPathConverter(vmsFileName);
        // const dateTry = this.timeOffsetInSeconds ? new Date(date.valueOf() + this.timeOffsetInSeconds * 1000) : date;
        const dateString = VmsAbsoluteDateString(date);
        this.logFn(LogType.debug, () => `=== Try set time for "${filename}"`); // when offset is <${this.timeOffsetInSeconds}>`);
        const strCmd = setFileDates(converter.fullPath, dateString, dateString);
        const timeSet = await this.tryExec(strCmd, setFileErrorResponse);
        return timeSet;
    }

    private async tryExec(command: string, errorResponse: string) {
        let attempts = this.attempts || 3;
        do {
            const result = await this.shell.execCmd(command);
            if (result) {
                const error = result.some((s) => s.startsWith(errorResponse));
                if (error) {
                    this.logFn(LogType.debug, () => `ERROR: ${command} => ${result}`);
                } else {
                    return true;    // good return here
                }
            } else {
                break;
            }
        } while (--attempts);
        this.logFn(LogType.error, () => `ERROR: ${command} failed`);
        return false;
    }

}
