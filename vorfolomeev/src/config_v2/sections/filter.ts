import { ConfigData, ConfigSection } from "../config_v2";

export class FilterSection implements ConfigSection {

    static is(candidate: ConfigSection): candidate is FilterSection {
        return candidate instanceof FilterSection;
    }

    include: string = '';
    exclude: string = '';

    static readonly _section = 'filter';

    name(): string {
        return FilterSection._section;
    }

    store(): ConfigData {
        return { include: this.include, 
                 exclude: this.exclude
            };
    }

    templateToFillFrom(): ConfigData {
        return { include: '', 
                 exclude: ''
            };
    }

    fillFrom(data: ConfigData): boolean {
        if (typeof data.include === 'string') {
            this.include = data.include;
        }
        if (typeof data.exclude === 'string') {
            this.exclude = data.exclude;
        }
        return true;
    }

}
