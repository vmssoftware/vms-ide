import { IConfigData, IConfigSection } from "./config";

export class ConfigHelperSection implements IConfigSection {

    public static readonly section = "settings";

    public static is(candidate: any): candidate is ConfigHelperSection {
        return !!candidate &&
        typeof candidate.addCalleeInfo === "boolean" &&
        typeof candidate.debug === "string" &&
        typeof candidate.test === "string" &&
        typeof candidate.using === "string";
    }

    public addCalleeInfo: boolean = false;
    public debug: string = "";
    public test: string = "test";
    public using: "FS" | "VSC" | "VFS" = "FS";

    public name(): string {
        return ConfigHelperSection.section;
    }

    public store(): IConfigData {
        return {
            addCalleeInfo: this.addCalleeInfo,
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
            this.addCalleeInfo = data.addCalleeInfo;
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
