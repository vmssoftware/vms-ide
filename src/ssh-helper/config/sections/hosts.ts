import { IConfigData, IConfigSection, ValueData } from "../../../config-helper/config/config";
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
        ret.hosts = [] as IConfigData[];
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
        let retcode = true;
        this.hosts = [];
        if (data.hosts instanceof Array) {
            for (const host of data.hosts) {
                const tmp =  new LabeledConnection();
                if (tmp.fillFrom(host as IConfigData)) {
                    this.hosts.push(tmp);
                } else {
                    retcode = false;
                }
            }
        }
        return retcode;
    }
}
