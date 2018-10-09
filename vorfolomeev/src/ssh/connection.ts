import { Client, ConnectConfig } from "ssh2";
import { inspect } from "util";
import { IConnectConfigResolver } from "./connect-config-resolver";

// tslint:disable-next-line:no-console
export let logFn = console.log;
// tslint:disable-next-line:no-empty
logFn = () => {};

export interface ISshConnectionSettings  {
    settingsResolver?: IConnectConfigResolver;
    connectConfig?: ConnectConfig;
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

    // public changeSettings(settings: ISshConnectionSettings): boolean {
    //     const {settingsResolver, ...connectConfig} = settings;    // remove our own settings
    //     if (settingsResolver) { // only if new resolver exists
    //         this.settingsResolver = settingsResolver;
    //     }
    //     // TODO: test new settings and disconnects if are different
    //     this.disconnect();
    //     Object.assign(this.connectConfig, connectConfig);
    //     return true;
    // }

    public disconnect() {
        if (this.client) {
            this.client.end();
        }
        this.client = undefined;
    }

    protected ensureConnection(): Promise<boolean> {
        if (this.client) {
            logFn(`ensureConnection: already exists`);
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
                logFn(`connect: after resolver: ${inspect(innerConfig)}`);
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
                logFn(`innerConnet: ready`);
                this.client = client;
                // OnClose now
                this.client.on("close", (hadError) => {
                    if ( hadError ) {
                        this.lastError = new Error("Closed with error");
                        logFn(`innerConnet: closed: ${this.lastError}`);
                    } else {
                        logFn(`innerConnet: closed`);
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
                logFn(`innerConnet: error: ${this.lastError}`);
                resolve(false);
            });
            // clientTmp.connect(Object.assign({debug: logFn}, config));
            client.connect( config );
            // logFn( config );
        });
    }
}
