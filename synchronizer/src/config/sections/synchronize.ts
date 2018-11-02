import { IConfigData, IConfigSection } from "../../ext-api/config";

export type DownloadAction = "overwrite" | "skip" | "edit";

export interface ISynchronizeSection  {
    downloadNewFiles: DownloadAction;
    keepAlive: boolean;
    setTimeAttempts: number;
}

export class SynchronizeSection implements ISynchronizeSection, IConfigSection {

    public static readonly section = "synchronize";

    public static is(candidate: any): candidate is ISynchronizeSection {
        return !!candidate &&
        typeof candidate.downloadNewFiles === "string" &&
        typeof candidate.keepAlive === "boolean" &&
        typeof candidate.setTimeAttempts === "number";
    }

    public downloadNewFiles: DownloadAction = "edit";
    public keepAlive: boolean = false;
    public setTimeAttempts: number = 3;

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
            return true;
        }
        return false;
    }
}
