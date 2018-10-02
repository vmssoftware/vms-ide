import { isString } from "util";
import { IConfigData, IConfigSection } from "./../../ext-api/config";
import { LabeledUserPasswordSection } from "./labeled-user-password";
import { UserPasswordSection } from "./user-password";

export class HostCollection implements IConfigSection {

    public static readonly section = "host_collection";

    public default: string = "";
    public hosts: LabeledUserPasswordSection[] = [];

    public name(): string {
        return HostCollection.section;
    }

    public store(): IConfigData {
        const ret: IConfigData = {};
        ret.default = this.default;
        ret.hosts = [];
        for (const tmp of this.hosts) {
            ret.hosts.push(tmp.store());
        }
        return ret;
    }

    public fillFrom(data: IConfigData): boolean {
        this.default = "";
        this.hosts = [];

        if (typeof data.default === "string") {
            this.default = data.default;
        }
        if (data.hosts instanceof Array) {
            for (const host of data.hosts) {
                const tmp: LabeledUserPasswordSection = new LabeledUserPasswordSection();
                if (tmp.fillFrom(host)) {
                    this.hosts.push(tmp);
                }
            }
        }
        return true;
    }

    public templateToFillFrom(): IConfigData {
        const ret: IConfigData = {
            default: "",
            hosts: [ new LabeledUserPasswordSection().templateToFillFrom() ],
        };
        return ret;
    }
}
