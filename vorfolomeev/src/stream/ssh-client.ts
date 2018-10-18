import { Client, ConnectConfig } from "ssh2";
import { Lock } from "../common/lock";
import { LogType } from "../common/log-type";
import { IUnSubscribe, Subscribe } from "../common/subscribe";
import { IConnectConfigResolver } from "../config-resolve/connect-config-resolver";

export class SshClient {

    public static async makeClient(config: ConnectConfig, resolver?: IConnectConfigResolver, log?: LogType) {
        const waitClient = new Lock(true, "waitClient");
        let client: Client | undefined;
        client = new Client();
        const ready = Subscribe(client, "ready", () => {
            if (log) {
                log(`client ready`);
            }
            waitClient.release();
        });
        const error = Subscribe(client, "error", (err) => {
            if (log) {
                log(`client error ${err}`);
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
        ready.unsubscribe();
        error.unsubscribe();
        return client;
    }

    protected client?: Client;
    private unsubscribeError?: IUnSubscribe;
    private unsubscribeEnd?: IUnSubscribe;
    private unsubscribeClose?: IUnSubscribe;

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
        this.cleanClient();
    }

    protected cleanClient() {
        if (this.unsubscribeError) {
            this.unsubscribeError.unsubscribe();
            delete this.unsubscribeError;
        }
        if (this.unsubscribeEnd) {
            this.unsubscribeEnd.unsubscribe();
            delete this.unsubscribeEnd;
        }
        if (this.unsubscribeClose) {
            this.unsubscribeClose.unsubscribe();
            delete this.unsubscribeClose;
        }
        delete this.client;
    }

    protected async ensureClient() {
        if (!this.client) {
            this.client = await SshClient.makeClient(this.config, this.resolver, this.log);
            if (this.client) {
                this.unsubscribeError = Subscribe(this.client, "error", (err) => {
                    if (this.log) {
                        this.log(`this client error ${err}`);
                    }
                    this.cleanClient();
                });
                this.unsubscribeEnd = Subscribe(this.client, "end", () => {
                    if (this.log) {
                        this.log(`this client end`);
                    }
                    this.cleanClient();
                });
                this.unsubscribeClose = Subscribe(this.client, "close", (hadError) => {
                    if (this.log) {
                        this.log(`this client closed${hadError ? " with error" : ""}`);
                    }
                    this.cleanClient();
                });
            }
        }
    }
}
