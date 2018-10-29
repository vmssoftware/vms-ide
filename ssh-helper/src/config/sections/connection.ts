import { IConfigData, IConfigSection } from "../config";

export interface IConnectionSection {
    host: string;
    port: number;
    username: string;
    password?: string;
}

export class ConnectionSection implements IConnectionSection, IConfigSection {

    public static readonly section = "connection";

    public static is(candidate: any): candidate is IConnectionSection {
        return !!candidate &&
            typeof candidate.host === "string" &&
            typeof candidate.port === "number" &&
            typeof candidate.username === "string" &&
            (typeof candidate.password === "string" || candidate.password === undefined);
    }

    public host: string = "";
    public port: number = 22;
    public username: string = "";
    public password?: string = "";

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
            password: this.password,
            port: this.port,
            username: this.username,
        };
    }

    public fillFrom(data: IConfigData): boolean {
        if (ConnectionSection.is(data)) {
            this.host = data.host;
            this.port = data.port;
            this.username = data.username;
            this.password = data.password || "";
            return true;
        }
        return false;
    }
}
