import { IConfigData, IConfigSection } from "../config";

// Add this to PACKAGE.JSON
// "open-vms.filter.include": {
//     "type": "string",
//     "default": "**/*.*",
//     "description": "%properties.filter.include.description%"
// },
// "open-vms.filter.exclude": {
//     "type": "string",
//     "default": "**/{.vscode,node-modules}/*.*",
//     "description": "%properties.filter.exclude.description%"
// },

/**
 * deprecated
 */
export class FilterSection implements IConfigSection {

    public static readonly section = "filter";

    public static is(candidate: IConfigSection): candidate is FilterSection {
        return candidate instanceof FilterSection;
    }

    public include: string = "";
    public exclude: string = "";

    public name(): string {
        return FilterSection.section;
    }

    public store(): IConfigData {
        return { include: this.include,
                 // tslint:disable-next-line:object-literal-sort-keys
                 exclude: this.exclude,
            };
    }

    public templateToFillFrom(): IConfigData {
        return { include: "",
                 // tslint:disable-next-line:object-literal-sort-keys
                 exclude: "",
            };
    }

    public fillFrom(data: IConfigData): boolean {
        if (typeof data.include === "string") {
            this.include = data.include;
        }
        if (typeof data.exclude === "string") {
            this.exclude = data.exclude;
        }
        return true;
    }

}
