
import { Lock, LogFunction } from "@vorfol/common";
import { LogType } from "@vorfol/common";
import { printLike } from "@vorfol/common";
import { ftpPathSeparator } from "@vorfol/common";

import { ISftpClient, ISshShell } from "../ext-api/api";
import { VmsAbsoluteDateString } from "../vms/vms-absolute-date-string";
import { VmsPathConverter } from "../vms/vms-path-converter";
import { SftpSource } from "./sftp-source";

// const cmdGetTimeOffset = `WRITE SYS$OUTPUT F$TRNLNM("SYS$TIMEZONE_DIFFERENTIAL")`;
const setFileErrorResponse = `%SET-`;
// const setFileFormatSTM = "set file/attribute=RFM:STM ";
const setFileDates = printLike`set file ${"_file_"} /attributes=(mod="${"_date_"}",att="${"_date_"}")`;

export class VmsSource extends SftpSource {

    private timeOffsetInSeconds?: number;   // between local local_time and remote local_time in dependency of actual file date
    // private timeOffetLock = new Lock();

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
        const dateTry = this.timeOffsetInSeconds ? new Date(date.valueOf() + this.timeOffsetInSeconds * 1000) : date;
        let   dateString = VmsAbsoluteDateString(dateTry);
        let   strCmd = setFileDates(converter.fullPath, dateString, dateString);
        const timeSet = await this.tryExec(strCmd, setFileErrorResponse);
        if (timeSet) {
            const dateActual = await this.getDate(filename);
            if (dateActual !== undefined) {
                // if they still are not the same, do correct offset
                let diff = (date.valueOf() - dateActual.valueOf()) / 1000;
                if (Math.abs(diff) > 1) {
                    diff = Math.round(diff);
                    if (this.timeOffsetInSeconds === undefined) {
                        this.timeOffsetInSeconds = diff;
                    }
                    const dateFinal = new Date(date.valueOf() + diff * 1000);
                    dateString = VmsAbsoluteDateString(dateFinal);
                    strCmd = setFileDates(converter.fullPath, dateString, dateString);
                    return this.tryExec(strCmd, setFileErrorResponse);
                }
                return true;
            }
        }
        return false;
    }

    /**
     * Also change file record format when finished
     * @param filename file
     */
    public createWriteStream(filename: string) {
        const streamPromise = super.createWriteStream(filename);
        // streamPromise.then((stream) => {
        //     if (stream) {
        //         stream.once("finish", () => {
        //             const converter = new VmsPathConverter(this.root + ftpPathSeparator + filename);
        //             this.tryExec(setFileFormatSTM + converter.fullPath, setFileErrorResponse);
        //         });
        //     }
        // });
        return streamPromise;
    }

    private async tryExec(command: string, errorResponse: string) {
        let attempts = this.attempts || 3;
        do {
            const result = await this.shell.execCmd(command);
            if (result) {
                const error = result.some((s) => s.startsWith(errorResponse));
                if (error && this.debugLog) {
                    this.debugLog(LogType.debug, () => `ERROR: ${command} => ${result}`);
                } else {
                    return true;    // good return here
                }
            } else {
                break;
            }
        } while (--attempts);
        return false;
    }

    // private async ensureTimeOffset() {
    //     await this.timeOffetLock.acquire();
    //     if (this.timeOffsetInSeconds !== undefined) {
    //         this.timeOffetLock.release();
    //         return true;
    //     }
    //     const result = await this.shell.execCmd(cmdGetTimeOffset);
    //     if (!result) {
    //         this.timeOffetLock.release();
    //         return false;
    //     }
    //     result.some((line) => {
    //         const time = Number.parseInt(line, 10);
    //         if (typeof time === "number" &&
    //             Number.isInteger(time)) {
    //             this.timeOffsetInSeconds = time;
    //             return true;
    //         }
    //         return false;
    //     });
    //     this.timeOffetLock.release();
    //     return this.timeOffsetInSeconds !== undefined;
    // }
}
