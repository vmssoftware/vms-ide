
import { IConfigData, IConfigSection } from "../config";
import { UserPasswordSection } from "./user-password";

export class LabeledUserPasswordSection extends UserPasswordSection {

    public static is(candidate: any): candidate is LabeledUserPasswordSection {
        return typeof candidate.label === "string" && UserPasswordSection.is(candidate);
    }

    public label: string = "";

    public name(): string {
        return this.label;
    }

    public store(): IConfigData {
        const ret = super.store();
        ret.label = this.label;
        return ret;
    }

    public templateToFillFrom(): IConfigData {
        const ret = super.templateToFillFrom();
        ret.label = "";
        return ret;
    }

    public fillFrom(data: IConfigData): boolean {
        if (typeof data.label === "string") {
            this.label = data.label;
        }
        return super.fillFrom(data);
    }
}
