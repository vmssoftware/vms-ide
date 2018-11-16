import { IConfigData, IConfigSection } from "./config";

export class ConfigHelperSection implements IConfigSection {

    public static readonly section = "config-helper";

    public static is(candidate: any): candidate is ConfigHelperSection {
        return !!candidate &&
        typeof candidate.debug === "string" &&
        typeof candidate.test === "string" &&
        typeof candidate.using === "string";
    }

    public debug: string = "console";
    public test: string = "test";
    public using: "FS" | "VSC" | "VFS" = "FS";

    public name(): string {
        return ConfigHelperSection.section;
    }

    public store(): IConfigData {
        return {
            debug: this.debug,
            test: this.test,
            using: this.using,
        };
    }

    public templateToFillFrom(): IConfigData {
        return this.store();
    }

    public fillFrom(data: IConfigData): boolean {
        if (ConfigHelperSection.is(data)) {
            this.debug = data.debug;
            this.test = data.test;
            switch (data.using) {
                case "FS":
                case "VSC":
                case "VFS":
                    this.using = data.using;
                    break;
                default:
                    this.using = "FS";
                    break;
            }
            return true;
        }
        return false;
    }
}
