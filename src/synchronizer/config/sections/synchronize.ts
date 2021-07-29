import { IConfigData, IConfigSection } from "../../../config-helper/config/config";
import { DownloadAction, ISynchronizeSection } from "../../sync/sync-api";

export class SynchronizeSection implements ISynchronizeSection, IConfigSection {

    public static readonly section = "synchronize";

    public static is(candidate: any): candidate is ISynchronizeSection {
        return !!candidate &&
        typeof candidate.downloadNewFiles === "string" &&
        typeof candidate.keepAlive === "boolean" &&
        typeof candidate.setTimeAttempts === "number" &&
        typeof candidate.preferZip === "boolean" &&
        typeof candidate.forceLocalTime === "boolean" &&
        typeof candidate.purge === "boolean";
    }

    public downloadNewFiles: DownloadAction = "edit";
    public keepAlive: boolean = false;
    public setTimeAttempts: number = 3;
    public preferZip: boolean = false;
    public forceLocalTime: boolean = true;
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
            preferZip: this.preferZip,
            forceLocalTime: this.forceLocalTime,
            purge: this.purge,
            setTimeAttempts: this.setTimeAttempts,
        };
    }

    public fillFrom(data: IConfigData): boolean {
        if (SynchronizeSection.is(data)) {
            this.keepAlive = data.keepAlive;
            this.setTimeAttempts = data.setTimeAttempts;
            this.preferZip = data.preferZip;
            this.forceLocalTime = data.forceLocalTime;
            this.purge = data.purge;
            switch (data.downloadNewFiles) {
                case "overwrite":
                case "skip":
                case "edit":
                    this.downloadNewFiles = data.downloadNewFiles;
                    break;
                default:
                    throw "Unknown option (downloadNewFiles): " + data.downloadNewFiles;
                    break;
            }
            return true;
        }
        return false;
    }
}
