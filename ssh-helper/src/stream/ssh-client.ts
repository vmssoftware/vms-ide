import { Client } from "ssh2";

import { Lock } from "@vorfol/common";
import { LogFunction, LogType } from "@vorfol/common";
import { IUnSubscribe, Subscribe } from "@vorfol/common";

import { IConnectConfigResolver, IConnectConfig } from "../api";

import * as nls from "vscode-nls";
nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export class SshClient {
    public enabled: boolean;
    public logFn: LogFunction;

    protected client?: Client;

    private clientReady?: IUnSubscribe;
    private clientError?: IUnSubscribe;
    private clientEnd?: IUnSubscribe;

    /**
     * No auto closing client anymore, use dispose()
     * @param config configuration
     * @param resolver config resolver
     * @param logFn like console.log
     * @param tag for logging usage
     */
    constructor(public config: IConnectConfig,
                public resolver?: IConnectConfigResolver<IConnectConfig>,
                logFn?: LogFunction,
                public tag?: string) {
        // tslint:disable-next-line:no-empty
        this.logFn = logFn || (() => {});
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
            this.logFn(LogType.debug, () => localize("debug.ready", "client{0} ready", this.tag ? " " + this.tag : ""));
            waitClient.release();
            this.client = client;
            // subscribe "end" only here
            this.clientEnd = Subscribe(client, "end", () => {
                this.logFn(LogType.debug, () => localize("debug.end", "client{0} end", this.tag ? " " + this.tag : ""));
                this.cleanClient();
            });
        });
        this.clientError = Subscribe(client, "error", (err) => {
            this.logFn(LogType.error, () => localize("debug.error", "client{1} error: {0}", String(err), this.tag ? " " + this.tag : ""));
            if (!this.client) {
                waitClient.release();
            }
        });
        // resolve config now and there
        if (this.resolver) {
            let configResolved = await this.resolver.resolveConnectConfig(this.config);
            if (configResolved) {
                //configResolved = Object.assign({ debug: (s: string) => console.log(s) }, configResolved);
                configResolved = Object.assign({ algorithms: { serverHostKey: ['ssh-rsa', 'ssh-dss'] } }, configResolved);
                client.connect(configResolved);
            } else {
                this.logFn(LogType.debug, () => localize("debug.resolver", "no config resolved {0}", this.tag ? " " + this.tag : ""));
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
