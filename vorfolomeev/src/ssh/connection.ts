import { Client, ConnectConfig } from "ssh2";
import { inspect } from "util";
import { isSimplyEq } from "../common/simply-compare";
import { IConnectConfigResolver } from "../config-resolve/connect-config-resolver";

export type LogType = (message?: any, ...optionalParams: any[]) => void;
export let logFn: LogType | undefined;

export interface ISshConnectionSettings  {
    connectConfig: ConnectConfig;
    settingsResolver?: IConnectConfigResolver;
}

export class SshConnection {

    public lastError: any;

    public get isConnected(): boolean {
        return this.client !== undefined;
    }

    protected client: Client | undefined;
    protected connectConfig: ConnectConfig;
    protected settingsResolver: IConnectConfigResolver | undefined;
    protected cancelOperation: (() => void) | undefined;

    constructor(settings: ISshConnectionSettings) {
        this.settingsResolver = settings.settingsResolver;
        this.connectConfig = Object.assign({}, settings.connectConfig);
    }

    /**
     * Returns true if client will be re-connected
     * @param settings
     */
    public settingsChanged(settings: ISshConnectionSettings) {
        this.settingsResolver = settings.settingsResolver;
        const reConnect = !isSimplyEq(settings.connectConfig, this.connectConfig);
        this.connectConfig = Object.assign({}, settings.connectConfig);
        if (reConnect) {
            if (this.client) {
                if (logFn) { logFn(`SshConnection: end current connection`); }
                this.client.end();
                this.client = undefined;
            }
        }
    }

    public disconnect() {
        if (this.client) {
            this.client.end();
        }
        this.client = undefined;
    }

    protected ensureConnection(): Promise<boolean> {
        if (this.client) {
            if (logFn) { logFn(`ensureConnection: already exists`); }
            return Promise.resolve(true);
        } else {
            return this.connect();
        }
    }

    /**
     * Using settings from config
     */
    private connect(): Promise<boolean> {
        return new Promise<boolean>(async (resolve) => {
            this.lastError = undefined;
            let innerConfig: ConnectConfig | undefined = this.connectConfig;
            let retCode = false;
            if (this.settingsResolver) {
                // we have to use resolver
                innerConfig = await this.settingsResolver.resolveConnectConfig(this.connectConfig);
                if (logFn) { logFn(`connect: after resolver: ${inspect(innerConfig)}`); }
            }
            if (!innerConfig) {
                // resolver was refusing configuration
                this.lastError = new Error("Settings is not resolved");
                resolve(false);
                return;
            }
            retCode = await this.innerConnect(innerConfig);
            if (this.settingsResolver) {
                this.settingsResolver.feedBack(innerConfig, retCode);
            }
            resolve(retCode);
        });
    }

    private innerConnect(config: ConnectConfig): Promise<boolean> {
        return new Promise<boolean>((resolve) => {
            const client = new Client();
            // OnReady - only once
            client.once("ready", () => {
                if (logFn) { logFn(`innerConnet: ready`); }
                this.client = client;
                // OnClose now
                this.client.on("close", (hadError) => {
                    if ( hadError ) {
                        this.lastError = new Error("Closed with error");
                        if (logFn) { logFn(`innerConnet: closed: ${this.lastError}`); }
                    } else {
                        if (logFn) { logFn(`innerConnet: closed`); }
                    }
                    this.client = undefined;
                    if (this.cancelOperation) {
                        this.cancelOperation();
                        this.cancelOperation = undefined;
                    }
                });
                resolve(true);
            });
            // OnError - only once
            client.once("error", (error) => {
                this.lastError = error;
                if (logFn) { logFn(`innerConnet: error: ${this.lastError}`); }
                resolve(false);
            });
            // clientTmp.connect(Object.assign({debug: logFn}, config));
            client.connect( config );
        });
    }
}
