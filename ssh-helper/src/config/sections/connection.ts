import { IConfigData, IConfigSection } from "../config";
import { IConnectionSection } from "../../api";

export class ConnectionSection implements IConnectionSection, IConfigSection {

    public static readonly section = "connection";

    public static is(candidate: any): candidate is IConnectionSection {
        return !!candidate &&
            typeof candidate.host === "string" &&
            typeof candidate.port === "number" &&
            typeof candidate.username === "string" &&
            (typeof candidate.keyFile === "string" || candidate.keyFile === undefined) &&
            (typeof candidate.password === "string" || candidate.password === undefined);
    }

    public host: string = "";
    public keyFile?: string;
    public password?: string;
    public port: number = 22;
    public username: string = "";

    public name(): string {
        return ConnectionSection.section;
    }

    public store(): IConfigData {
        // do not store password
        const storeMe = this.templateToFillFrom();
        delete storeMe.password;
        return storeMe;
    }

    public templateToFillFrom(): IConfigData {
        return {
            host: this.host,
            keyFile: this.keyFile || "",
            password: this.password || "",
            port: this.port,
            username: this.username,
        };
    }

    public fillFrom(data: IConfigData): boolean {
        if (ConnectionSection.is(data)) {
            this.host = data.host;
            this.keyFile = data.keyFile;
            this.password = data.password;
            this.port = data.port;
            this.username = data.username;
            return true;
        }
        return false;
    }
}
