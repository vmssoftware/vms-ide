import { IConfigData, IConfigSection } from "../config";
import { IHostsSection } from "../../api";
import { LabeledConnection } from "./labeled-connection";

export class HostsSection implements IConfigSection {

    public static readonly section = "host-collection";

    public static is(candidate: any): candidate is IHostsSection {
        return !!candidate &&
            candidate.hosts instanceof Array;
    }
    public hosts: LabeledConnection[] = [];

    public name(): string {
        return HostsSection.section;
    }

    public store(): IConfigData {
        const ret: IConfigData = {};
        ret.hosts = [];
        for (const tmp of this.hosts) {
            ret.hosts.push(tmp.store());
        }
        return ret;
    }

    public templateToFillFrom(): IConfigData {
        const ret: IConfigData = {
            hosts: [ new LabeledConnection().templateToFillFrom() ],
        };
        return ret;
    }

    public fillFrom(data: IConfigData): boolean {
        this.hosts = [];
        if (data.hosts instanceof Array) {
            for (const host of data.hosts) {
                const tmp =  new LabeledConnection();
                if (tmp.fillFrom(host)) {
                    this.hosts.push(tmp);
                }
            }
        }
        return true;
    }
}
