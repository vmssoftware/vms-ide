import * as nls from "vscode-nls";
import { Client, ConnectConfig } from "ssh2";
import { Lock } from "../../common/main";
import { LogFunction, LogType } from "../../common/main";
import { IUnSubscribe, Subscribe } from "../../common/main";
import { IConnectConfig, IConnectConfigResolver, IAlgorithms } from "../api";
import { EventEmitter } from "events";
import { Algorithms } from "ssh2-streams";

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
        let   doWait = false;
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
                const defaultAlgorithms : IAlgorithms =
                    {
                        serverHostKey:
                            [
                                "ssh-rsa",
                                "ssh-dss",
                            ],
                        kex: 
                            [
                                "diffie-hellman-group1-sha1"
                            ]
                    };
                if (configResolved.algorithms) {
                    if (configResolved.algorithms.serverHostKey instanceof Array) {
                        for (const serverHostKey of defaultAlgorithms.serverHostKey!) {
                            if (!configResolved.algorithms.serverHostKey.includes(serverHostKey)) {
                                configResolved.algorithms.serverHostKey.push(serverHostKey);
                            }
                        }
                    } else {
                        configResolved.algorithms.serverHostKey = defaultAlgorithms.serverHostKey;
                    }
                    if (configResolved.algorithms.kex instanceof Array) {
                        for (const kex of defaultAlgorithms.kex!) {
                            if (!configResolved.algorithms.kex.includes(kex)) {
                                configResolved.algorithms.kex.push(kex);
                            }
                        }
                    } else {
                        configResolved.algorithms.kex = defaultAlgorithms.kex;
                    }
                } else {
                    configResolved.algorithms = defaultAlgorithms;
                }
                //(configResolved as ConnectConfig).debug = (s: string) => this.debugLine(s);
                try {
                    doWait = true;
                    client.connect(configResolved);
                } catch(e) {
                    doWait = false;
                    this.logFn(LogType.error, () => localize("connect.exception", "Exception: {0}", String(e)), true);
                }
            } else {
                this.logFn(LogType.debug, () => localize("debug.resolver", "no config resolved {0}", this.tag ? " " + this.tag : ""));
            }
        } else {
            try {
                doWait = true;
                client.connect(this.config);
            } catch(e) {
                doWait = false;
                this.logFn(LogType.error, () => localize("connect.exception", "Exception: {0}", String(e)), true);
            }
        }
        if (doWait) {
            await waitClient.acquire();
        }
        const connected = this.client !== undefined;
        if (this.resolver) {
            this.resolver.feedBack(this.config, connected);
        }
        return connected;
    }

    // TODO: parse debug output "DEBUG: Remote ident:"
    // and looking for required version
    // for example:
    // TAZAWA   'SSH-2.0-3.2.0 SSH OpenVMS V5.5 VMS_sftp_version 3'
    // BOSTON   'SSH-2.0-Process Software SSH 6.1.5.0 MultiNet'
    // REDSOX   'SSH-2.0-Process Software SSH 6.1.5.0 MultiNet'
    // BILBO    'SSH-2.0-3.2.0 SSH OpenVMS V5.5 VMS_sftp_version 3'
    // FRODO    'SSH-2.0-3.2.0 SSH OpenVMS V5.5 VMS_sftp_version 3'
    // SAREK    'SSH-2.0-3.2.0 SSH OpenVMS V5.5 VMS_sftp_version 3'
    private debugLine(s: string) {
        this.logFn(LogType.debug, () => s);
    }
}
