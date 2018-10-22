import { IConfigData, IConfigSection } from "../config";

export interface IWorkspaceSection  {
    cmdTimeout: number;
    downloadNewer: "overwrite" | "skip" | "edit";
    feedbackTimeout: number;
    welcomeTimeout: number;
}

export class WorkspaceSection implements IConfigSection {

    public static readonly section = "workspace";

    public static is(candidate: any): candidate is WorkspaceSection {
        return !!candidate &&
        typeof candidate.cmdTimeout === "number" &&
        typeof candidate.downloadNewer === "string" &&
        typeof candidate.feedbackTimeout === "number" &&
        typeof candidate.welcomeTimeout === "number";
    }

    public cmdTimeout: number = 0; // in msec
    public downloadNewer: "overwrite" | "skip" | "edit" = "edit";
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
            downloadNewer: this.downloadNewer,
            feedbackTimeout: this.feedbackTimeout,
            welcomeTimeout: this.welcomeTimeout,
        };
    }

    public fillFrom(data: IConfigData): boolean {
        if (WorkspaceSection.is(data)) {
            this.cmdTimeout = data.cmdTimeout;
            switch (data.downloadNewer) {
                case "overwrite":
                case "skip":
                case "edit":
                    this.downloadNewer = data.downloadNewer;
                    break;
                default:
                    this.downloadNewer = "edit";
                    break;
            }
            this.feedbackTimeout = data.feedbackTimeout;
            this.welcomeTimeout = data.welcomeTimeout;
            return true;
        }
        return false;
    }
}
