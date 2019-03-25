import { IConfigData, IConfigSection } from "../../ext-api/config";
import { DownloadAction, ISynchronizeSection } from "../../sync/sync-api";

export class SynchronizeSection implements ISynchronizeSection, IConfigSection {

    public static readonly section = "synchronize";

    public static is(candidate: any): candidate is ISynchronizeSection {
        return !!candidate &&
        typeof candidate.downloadNewFiles === "string" &&
        typeof candidate.keepAlive === "boolean" &&
        typeof candidate.setTimeAttempts === "number" &&
        typeof candidate.setTimeByShell === "boolean" &&
        typeof candidate.unzipCmd === "string" &&
        typeof candidate.preferZip === "boolean" &&
        typeof candidate.purge === "boolean";
    }

    public downloadNewFiles: DownloadAction = "edit";
    public keepAlive: boolean = false;
    public setTimeAttempts: number = 3;
    public setTimeByShell: boolean = true;
    public unzipCmd: string = "";
    public preferZip: boolean = false;
    public purge: boolean = false;

    public name(): string {
        return SynchronizeSection.section;
    }

    public store(): IConfigData {
        return this.templateToFillFrom();
    }

    public templateToFillFrom(): IConfigData {
        return {
            downloadNewFiles: this.downloadNewFiles,
            keepAlive: this.keepAlive,
            setTimeAttempts: this.setTimeAttempts,
            setTimeByShell: this.setTimeByShell,
            unzipCmd: this.unzipCmd,
            preferZip: this.preferZip,
            purge: this.purge,
        };
    }

    public fillFrom(data: IConfigData): boolean {
        if (SynchronizeSection.is(data)) {
            switch (data.downloadNewFiles) {
                case "overwrite":
                case "skip":
                case "edit":
                    this.downloadNewFiles = data.downloadNewFiles;
                    break;
                default:
                    this.downloadNewFiles = "edit";
                    break;
            }
            this.keepAlive = data.keepAlive;
            this.setTimeAttempts = data.setTimeAttempts;
            this.setTimeByShell = data.setTimeByShell;
            this.unzipCmd = data.unzipCmd;
            this.preferZip = data.preferZip;
            this.purge = data.purge;
            return true;
        }
        return false;
    }
}
