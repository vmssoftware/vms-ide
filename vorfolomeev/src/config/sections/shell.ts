import { IConfigData, IConfigSection } from "../../ext-api/config";

export class ShellSection implements IConfigSection {

    public static readonly section = "shell";

    public static is(candidate: IConfigSection): candidate is ShellSection {
        return candidate instanceof ShellSection;
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
