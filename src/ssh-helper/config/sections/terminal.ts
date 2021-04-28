import { IConfigData, IConfigSection } from "../../../config-helper/config/config";
import { ITerminalSection } from "../../api";

export class TerminalSection implements ITerminalSection, IConfigSection {

    public static readonly section = "terminal";

    public static is(candidate: any): candidate is ITerminalSection {
        return !!candidate &&
        typeof candidate.command === "string";
    }

    public command = "";

    public name(): string {
        return TerminalSection.section;
    }

    public store(): IConfigData {
        return this.templateToFillFrom();
    }

    public templateToFillFrom(): IConfigData {
        return {
            command: this.command,
        };
    }

    public fillFrom(data: IConfigData): boolean {
        if (TerminalSection.is(data)) {
            this.command = data.command;
            return true;
        }
        return false;
    }
}
