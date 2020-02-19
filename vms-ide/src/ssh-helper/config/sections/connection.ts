import { IConfigData, IConfigSection, ValueData } from "../../../config-helper/config/config";
import { IConnectionSection, IAlgorithms } from "../../api";
import { Algorithms } from "ssh2-streams";

export class ConnectionSection implements IConnectionSection, IConfigSection {

    public static readonly section = "connection";

    public static is(candidate: any): candidate is IConnectionSection {
        return !!candidate &&
            typeof candidate.host === "string" &&
            (typeof candidate.port === "number" || candidate.port === undefined) &&
            (typeof candidate.username === "string" || candidate.username === undefined) &&
            (typeof candidate.keyFile === "string" || candidate.keyFile === undefined) &&
            (typeof candidate.password === "string" || candidate.password === undefined) &&
            (typeof candidate.skipSignatureVerification === "boolean" || candidate.skipSignatureVerification === undefined) &&
            (typeof candidate.unzipCmd === "string" || candidate.unzipCmd === undefined) &&
            (typeof candidate.supportSetFileTime === "boolean" || candidate.supportSetFileTime === undefined);
    }

    public host: string = "";
    public keyFile?: string;
    public password?: string;
    public port?: number = 22;
    public username?: string = "";
    public skipSignatureVerification?: boolean = false;
    public algorithms?: IAlgorithms;
    public supportSetFileTime?: boolean = true;
    public unzipCmd?: string;

    public name(): string {
        return ConnectionSection.section;
    }

    public store(): IConfigData {
        // do not store password
        const storeMe = this.templateToFillFrom();
        // delete storeMe.password;
        return storeMe;
    }

    public templateToFillFrom(): IConfigData {
        return {
            host: this.host,
            keyFile: this.keyFile || "",
            password: this.password || "",
            port: this.port || 0,
            username: this.username || "",
            skipSignatureVerification: this.skipSignatureVerification || false,
            algorithms: this.algorithms as ValueData,
            supportSetFileTime: this.supportSetFileTime === undefined ? true : this.supportSetFileTime,
            unzipCmd: this.unzipCmd || "",
        };
    }

    public fillFrom(data: IConfigData): boolean {
        if (ConnectionSection.is(data)) {
            this.host = data.host;
            this.keyFile = data.keyFile;
            this.password = data.password;
            this.port = data.port;
            this.username = data.username;
            this.skipSignatureVerification = data.skipSignatureVerification;
            this.algorithms = data.algorithms;
            this.supportSetFileTime = data.supportSetFileTime;
            this.unzipCmd = data.unzipCmd;
            return true;
        }
        return false;
    }
}
