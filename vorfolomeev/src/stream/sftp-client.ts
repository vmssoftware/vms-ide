import { Client, ConnectConfig } from "ssh2";
import { Lock } from "../common/lock";
import { IConnectConfigResolver } from "../config-resolve/connect-config-resolver";

type LogType = (message?: any, ...optionalParams: any[]) => void;

export class SftpClient {

    public static async makeClient(config: ConnectConfig, resolver?: IConnectConfigResolver, log?: LogType) {
        const waitClient = new Lock(true, "waitClient");
        let client: Client | undefined;
        client = new Client();
        client.on("ready", () => {
            if (log) {
                log(`client ready`);
            }
            waitClient.release();
        });
        client.on("error", (err) => {
            if (log) {
                log(`client error ${err}`);
            }
            waitClient.release();
            client = undefined;
        });
        client.on("close", (hadError) => {
            if (log) {
                log(`client close: ${hadError ? "with error" : ""}`);
            }
            waitClient.release();
            client = undefined;
        });
        client.on("end", () => {
            if (log) {
                log(`client end`);
            }
            waitClient.release();
            client = undefined;
        });
        // resolve config now and there
        if (resolver) {
            const configResolved = await resolver.resolveConnectConfig(config);
            if (configResolved) {
                client.connect(configResolved);
            } else {
                if (log) {
                    log(`no config resolved`);
                }
                waitClient.release();
            }
        } else {
            client.connect(config);
        }
        await waitClient.acquire();
        if (resolver) {
            resolver.feedBack(config, client !== undefined);
        }
        return client;
    }

    protected client?: Client;

    /**
     * No auto closing client anymore, use dispose()
     * @param config configuration
     * @param log like console.log
     */
    constructor(public config: ConnectConfig, public resolver?: IConnectConfigResolver, public log?: LogType) {
    }

    public dispose() {
        if (this.client) {
            this.client.end();
        }
        delete this.client;
    }

    protected async ensureClient() {
        if (!this.client) {
            this.client = await SftpClient.makeClient(this.config, this.resolver, this.log);
        }
    }
}
