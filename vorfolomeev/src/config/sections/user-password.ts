import { isNumber, isString } from "util";
import { IUserPasswordHostConfig } from "../../host-config";
import { IConfigData, IConfigSection } from "../config";

export class UserPasswordSection implements IConfigSection, IUserPasswordHostConfig {

    public static readonly section = "connection";

    public static is(candidate: any): candidate is IUserPasswordHostConfig {
        return !!candidate &&
            typeof candidate.host === "string" &&
            typeof candidate.port === "number" &&
            typeof candidate.username === "string" &&
            typeof candidate.password === "string";
    }

    public host: string = "";
    public port: number = 22;
    public username: string = "";
    public password: string = "";

    public name(): string {
        return UserPasswordSection.section;
    }

    public store(): IConfigData {
        // do not store password
        return { host: this.host,
                 port: this.port,
                 username: this.username,
            };
    }

    public templateToFillFrom(): IConfigData {
        return {
            host: "",
            password: "",
            port: 0,
            username: "",
        };
    }

    public fillFrom(data: IConfigData): boolean {
        if (typeof data.host === "string") {
            this.host = data.host;
        }
        if (typeof data.port === "number") {
            this.port = data.port;
        }
        if (typeof data.username === "string") {
            this.username = data.username;
        }
        if (typeof data.password === "string") {
            this.password = data.password;
        }
        return true;
    }

}
