import { Client, ConnectConfig } from "ssh2";

import { Lock } from "@vorfol/common";
import { LogType } from "@vorfol/common";
import { IUnSubscribe, Subscribe } from "@vorfol/common";

import { IConnectConfigResolver } from "../config-resolve/connect-config-resolver";

import * as nls from "vscode-nls";
nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export class SshClient {
    public lastClientError?: Error;
    public enabled: boolean;

    protected client?: Client;

    private clientReady?: IUnSubscribe;
    private clientError?: IUnSubscribe;
    private clientEnd?: IUnSubscribe;

    /**
     * No auto closing client anymore, use dispose()
     * @param config configuration
     * @param resolver config resolver
     * @param debugLog like console.log
     * @param tag for logging usage
     */
    constructor(public config: ConnectConfig,
                public resolver?: IConnectConfigResolver,
                public debugLog?: LogType,
                public tag?: string) {
        this.enabled = true;
    }

    public dispose() {
        if (this.client) {
            this.client.end();
        }
        this.cleanClient();
    }

    protected cleanClient() {
        if (this.clientReady) {
            this.clientReady.unsubscribe();
            delete this.clientReady;
        }
        if (this.clientError) {
            this.clientError.unsubscribe();
            delete this.clientError;
        }
        if (this.clientEnd) {
            this.clientEnd.unsubscribe();
            delete this.clientEnd;
        }
        delete this.client;
    }

    protected async ensureClient() {
        if (!this.enabled) {
            return false;
        }
        if (!this.client) {
            return await this.clientConnect();
        }
        return this.client !== undefined;
    }

    private async clientConnect() {
        const waitClient = new Lock(true, "waitClient");
        const client = new Client();
        this.clientReady = Subscribe(client, "ready", () => {
            if (this.debugLog) {
                this.debugLog(localize("debug.ready", "client{0} ready", this.tag ? " " + this.tag : ""));
            }
            waitClient.release();
            this.client = client;
            // subscribe "end" only here
            this.clientEnd = Subscribe(client, "end", () => {
                if (this.debugLog) {
                    this.debugLog(localize("debug.end", "client{0} end", this.tag ? " " + this.tag : ""));
                }
                this.cleanClient();
            });
        });
        this.clientError = Subscribe(client, "error", (err) => {
            this.lastClientError = err;
            if (this.debugLog) {
                this.debugLog(localize("debug.error", "client{1} error: {0}", err, this.tag ? " " + this.tag : ""));
            }
            if (!this.client) {
                waitClient.release();
            }
        });
        // resolve config now and there
        if (this.resolver) {
            const configResolved = await this.resolver.resolveConnectConfig(this.config);
            if (configResolved) {
                client.connect(configResolved);
            } else {
                if (this.debugLog) {
                    this.debugLog(localize("debug.resolver", "no config resolved {0}", this.tag ? " " + this.tag : ""));
                }
                waitClient.release();
            }
        } else {
            client.connect(this.config);
        }
        await waitClient.acquire();
        const connected = this.client !== undefined;
        if (this.resolver) {
            this.resolver.feedBack(this.config, connected);
        }
        return connected;
    }
}
