import { IConfigData, IConfigSection } from "../config";

export type DownloadAction = "overwrite" | "skip" | "edit";

export interface IWorkspaceSection  {
    cmdTimeout: number;
    downloadNewFiles: DownloadAction;
    feedbackTimeout: number;
    welcomeTimeout: number;
}

export class WorkspaceSection implements IConfigSection {

    public static readonly section = "workspace";

    public static is(candidate: any): candidate is WorkspaceSection {
        return !!candidate &&
        typeof candidate.cmdTimeout === "number" &&
        typeof candidate.downloadNewFiles === "string" &&
        typeof candidate.feedbackTimeout === "number" &&
        typeof candidate.welcomeTimeout === "number";
    }

    public cmdTimeout: number = 0; // in msec
    public downloadNewFiles: DownloadAction = "edit";
    public feedbackTimeout: number = 0; // in msec
    public welcomeTimeout: number = 0; // in msec

    public name(): string {
        return WorkspaceSection.section;
    }

    public store(): IConfigData {
        return this.templateToFillFrom();
    }

    public templateToFillFrom(): IConfigData {
        return {
            cmdTimeout: this.cmdTimeout,
            downloadNewFiles: this.downloadNewFiles,
            feedbackTimeout: this.feedbackTimeout,
            welcomeTimeout: this.welcomeTimeout,
        };
    }

    public fillFrom(data: IConfigData): boolean {
        if (WorkspaceSection.is(data)) {
            this.cmdTimeout = data.cmdTimeout;
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
            this.feedbackTimeout = data.feedbackTimeout;
            this.welcomeTimeout = data.welcomeTimeout;
            return true;
        }
        return false;
    }
}
