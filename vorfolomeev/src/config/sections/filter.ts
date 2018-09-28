import { IConfigData, IConfigSection } from "@vorfol/config-helper";

export class FilterSection implements IConfigSection {

    static is(candidate: IConfigSection): candidate is FilterSection {
        return candidate instanceof FilterSection;
    }

    include: string = '';
    exclude: string = '';

    static readonly _section = 'filter';

    name(): string {
        return FilterSection._section;
    }

    store(): IConfigData {
        return { include: this.include, 
                 exclude: this.exclude
            };
    }

    templateToFillFrom(): IConfigData {
        return { include: '', 
                 exclude: ''
            };
    }

    fillFrom(data: IConfigData): boolean {
        if (typeof data.include === 'string') {
            this.include = data.include;
        }
        if (typeof data.exclude === 'string') {
            this.exclude = data.exclude;
        }
        return true;
    }

}
