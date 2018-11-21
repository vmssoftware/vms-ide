import { ConnectionSection } from "./connection";
import { IConfigData } from "../config";

export class LabeledConnection extends ConnectionSection {

    public static is(candidate: any): candidate is LabeledConnection {
        return typeof candidate.label === "string" && ConnectionSection.is(candidate);
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