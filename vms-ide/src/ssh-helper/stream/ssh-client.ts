import * as nls from "vscode-nls";
import { Client } from "ssh2";
import { Lock } from "../../common/main";
import { LogFunction, LogType } from "../../common/main";
import { IUnSubscribe, Subscribe } from "../../common/main";
import { IConnectConfig, IConnectConfigResolver } from "../api";
import { EventEmitter } from "events";

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export class SshClient extends EventEmitter {
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
        super();
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
        this.emit("cleanClient");
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
            } else {
                this.cleanClient();
            }
        });
        // resolve config now and there
        if (this.resolver) {
            let configResolved = await this.resolver.resolveConnectConfig(this.config);
            if (configResolved) {
                configResolved = Object.assign(
                    {
                        algorithms:
                        {
                            serverHostKey:
                                [
                                    "ssh-rsa",
                                    "ssh-dss",
                                ],
                        },
                        // TODO: parse debug output "DEBUG: Remote ident:"
                        // and looking for required version
                        // for example:
                        // TAZAWA   'SSH-2.0-3.2.0 SSH OpenVMS V5.5 VMS_sftp_version 3'
                        // BOSTON   'SSH-2.0-Process Software SSH 6.1.5.0 MultiNet'
                        // REDSOX   'SSH-2.0-Process Software SSH 6.1.5.0 MultiNet'
                        // BILBO    'SSH-2.0-3.2.0 SSH OpenVMS V5.5 VMS_sftp_version 3'
                        // FRODO    'SSH-2.0-3.2.0 SSH OpenVMS V5.5 VMS_sftp_version 3'
                        // SAREK    'SSH-2.0-3.2.0 SSH OpenVMS V5.5 VMS_sftp_version 3'
                        // debug: (s: string) => this.logFn(LogType.debug, () => s)
                    }, configResolved,
                );
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
