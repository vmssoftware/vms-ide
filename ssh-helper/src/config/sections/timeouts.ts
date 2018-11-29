import { IConfigData, IConfigSection } from "../config";
import { ITimeoutsSection } from "../../api";

export class TimeoutSection implements ITimeoutsSection, IConfigSection {

    public static readonly section = "timeouts";

    public static is(candidate: any): candidate is ITimeoutsSection {
        return !!candidate &&
        typeof candidate.cmdTimeout === "number" &&
        typeof candidate.feedbackTimeout === "number" &&
        typeof candidate.welcomeTimeout === "number";
    }

    public cmdTimeout: number = 0; // in msec
    public feedbackTimeout: number = 0; // in msec
    public welcomeTimeout: number = 0; // in msec

    public name(): string {
        return TimeoutSection.section;
    }

    public store(): IConfigData {
        return this.templateToFillFrom();
    }

    public templateToFillFrom(): IConfigData {
        return {
            cmdTimeout: this.cmdTimeout,
            feedbackTimeout: this.feedbackTimeout,
            welcomeTimeout: this.welcomeTimeout,
        };
    }

    public fillFrom(data: IConfigData): boolean {
        if (TimeoutSection.is(data)) {
            this.cmdTimeout = data.cmdTimeout;
            this.feedbackTimeout = data.feedbackTimeout;
            this.welcomeTimeout = data.welcomeTimeout;
            return true;
        }
        return false;
    }
}
