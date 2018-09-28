import { IConfigData, IConfigSection } from "@vorfol/config-helper";
import { UserPasswordSection } from "./user-password";
import { isString } from "util";

export class LabeledUserPasswordSection extends UserPasswordSection {

    label: string = '';

    static is(candidate: any): candidate is LabeledUserPasswordSection {
        return isString(candidate.label) && UserPasswordSection.is(candidate);
    }

    name(): string {
        return this.label;
    }

    store(): IConfigData {
        let ret = super.store();
        ret['label'] = this.label;
        return ret;
    }

    templateToFillFrom(): IConfigData {
        let ret = super.templateToFillFrom();
        ret['label'] = '';
        return ret;
    }

    fillFrom(data: IConfigData): boolean {
        if (typeof data.label === 'string') {
            this.label = data.label;
        }
        return super.fillFrom(data);
    }
}

export class HostCollection implements IConfigSection {

    default: string = '';
    hosts: LabeledUserPasswordSection[] = [];

    static readonly _section = 'host_collection';
    name(): string {
        return HostCollection._section;
    }    
    store(): IConfigData {
        let ret : IConfigData = {};
        ret.default = this.default;
        ret.hosts = [];
        for(let tmp of this.hosts) {
            ret.hosts.push(tmp.store());
        }
        return ret;
    }
    fillFrom(data: IConfigData): boolean {
        this.default = '';
        this.hosts = [];

        if (typeof data.default === 'string') {
            this.default = data.default;
        }
        if (data.hosts instanceof Array) {
            for(let host of data.hosts) {
                let tmp : LabeledUserPasswordSection = new LabeledUserPasswordSection();
                if (tmp.fillFrom(host)) {
                    this.hosts.push(tmp);
                }
            }
        }
        return true;
    }
    templateToFillFrom(): IConfigData {
        let ret : IConfigData = {   
            default: '',
            hosts: [ new LabeledUserPasswordSection().templateToFillFrom() ]
        };
        return ret;
    }
}
