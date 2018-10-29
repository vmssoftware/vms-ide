import { IConfigData, IConfigSection } from "./config";

export class TestSection implements IConfigSection {

    public static readonly section = "config-helper";

    public static is(candidate: any): candidate is TestSection {
        return !!candidate &&
        typeof candidate.test === "string" &&
        typeof candidate.using === "string";
    }

    public test: string = "test";
    public using: "FS" | "VSC" | "VFS" = "FS";

    public name(): string {
        return TestSection.section;
    }

    public store(): IConfigData {
        return {
            test: this.test,
            using: this.using,
        };
    }

    public templateToFillFrom(): IConfigData {
        return this.store();
    }

    public fillFrom(data: IConfigData): boolean {
        if (TestSection.is(data)) {
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
