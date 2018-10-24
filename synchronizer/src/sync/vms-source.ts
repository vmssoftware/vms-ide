
import { ftpPathSeparator } from "../common/find-files";
import { Lock } from "../common/lock";
import { LogType } from "../common/log-type";
import { printLike } from "../common/print-like";
import { ParseWelcomeVms } from "../stream/parse-welcome-vms";
import { PromptCatcherVms } from "../stream/prompt-catcher-vms";
import { SftpClient } from "../stream/sftp-client";
import { SshShell } from "../stream/ssh-shell";
import { VmsAbsoluteDateString } from "../vms/vms-absolute-date-string";
import { VmsPathConverter } from "../vms/vms-path-converter";
import { SftpSource } from "./sftp-source";

const cmdGetTimeOffset = `WRITE SYS$OUTPUT F$TRNLNM("SYS$TIMEZONE_DIFFERENTIAL")`;
const setFileErrorResponse = `%SET-`;
const setFileFormatSTM = "set file/attribute=RFM:STM ";
const setFileDates = printLike`set file ${"_"} /attributes=(mod="${"_"}",att="${"_"}")`;

export class VmsSource extends SftpSource {

    private timeOffsetInSeconds?: number;
    private timeOffetLock = new Lock();

    constructor(sftp: SftpClient,
                protected shell: SshShell,
                root?: string,
                debugLog?: LogType,
                attempts?: number) {
        super(sftp, root, debugLog, attempts);
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
            const strCmd = setFileDates(converter.fullPath, dateString, dateString);
            return this.tryExec(strCmd, setFileErrorResponse);
        }
        return false;
    }

    /**
     * Also change file record format when finished
     * @param filename file
     */
    public createWriteStream(filename: string) {
        const streamPromise = super.createWriteStream(filename);
        streamPromise.then((stream) => {
            if (stream) {
                stream.once("finish", () => {
                    const converter = new VmsPathConverter(this.root + ftpPathSeparator + filename);
                    this.tryExec(setFileFormatSTM + converter.fullPath, setFileErrorResponse);
                });
            }
        });
        return streamPromise;
    }

    private async tryExec(command: string, errorResponse: string) {
        let attempts = this.attempts || 3;
        do {
            const result = await this.shell.execCmd(command);
            if (result) {
                const error = result.split("\n").map((s) => s.trim()).some((s) => s.startsWith(errorResponse));
                if (error && this.debugLog) {
                    this.debugLog(`ERROR: ${command} => ${result}`);
                } else {
                    return true;    // good return here
                }
            } else {
                break;
            }
        } while (--attempts);
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
