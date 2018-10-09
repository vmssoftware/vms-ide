import { IConfigData, IConfigSection } from "../config";

export class ShellSection implements IConfigSection {

    public static readonly section = "shell";

    public static is(candidate: any): candidate is ShellSection {
        return !!candidate &&
            typeof candidate.ending === "string";
    }

    public ending: string = "> ";

    public name(): string {
        return ShellSection.section;
    }

    public store(): IConfigData {
        return { include: this.ending,
            };
    }

    public templateToFillFrom(): IConfigData {
        return { ending: "",
            };
    }

    public fillFrom(data: IConfigData): boolean {
        if (typeof data.ending === "string") {
            this.ending = data.ending;
        }
        return true;
    }

}
