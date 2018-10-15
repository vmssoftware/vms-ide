import { EventEmitter } from "events";
import { Client, ConnectConfig } from "ssh2";
import { Lock } from "./../common/lock";
import { IConnectConfigResolver } from "./connect-config-resolver";

export type LogType = (message?: any, ...optionalParams: any[]) => void;
export let logFn: LogType | undefined;

export class SimpleSsh {

    protected emitter = new EventEmitter();

    protected client: Client | undefined;
    protected keyString: string;

    protected clientCleaned: symbol = Symbol.for("clientCleaned");

    constructor(protected config: ConnectConfig, protected resolver?: IConnectConfigResolver) {
        this.keyString = this.buildKeyString(this.config);
    }

    public subscribe(event: string | symbol, listener: () => void) {
        this.emitter.on(event, listener);
        return { dispose: () => {
            this.emitter.removeListener(event, listener);
        }};
    }

    public disconnect() {
        this.cleanClient();
    }

    // build key string
    protected buildKeyString(settings: ConnectConfig): string {
        return JSON.stringify(settings);
    }

    protected cleanClient() {
        // tslint:disable-next-line:no-unused-expression
        logFn && logFn(`client clean ${this.keyString}`);
        if (this.client) {
            // tslint:disable-next-line:no-unused-expression
            logFn && logFn(`client still exists ${this.keyString}`);
            this.client.end();
            this.client = undefined;    // reset client
            setImmediate(() => this.emitter.emit(this.clientCleaned));
        }
    }

    protected async connect(): Promise<boolean> {
        if (this.client) {
            // tslint:disable-next-line:no-unused-expression
            logFn && logFn(`client already connected ${this.keyString}`);
            return true;
        }
        const waitClient = new Lock(true);
        const client = new Client();

        client.on("ready", () => {
            // tslint:disable-next-line:no-unused-expression
            logFn && logFn(`client ready  ${this.keyString}`);
            waitClient.release();

            this.client = client;   // set client
        });

        client.on("error", (err) => {
            // tslint:disable-next-line:no-unused-expression
            logFn && logFn(`client error ${err} ${this.keyString}`);
            waitClient.release();
        });

        client.on("close", (hadError) => {
            // tslint:disable-next-line:no-unused-expression
            logFn && logFn(`client closed ${hadError ? hadError : ""} ${this.keyString}`);
            if (this.client) {
                this.client.emit("end");
            }
        });

        client.on("end", () => {
            // tslint:disable-next-line:no-unused-expression
            logFn && logFn(`client end ${this.keyString}`);
            this.cleanClient();
        });

        // resolve config now and there
        if (this.resolver) {
            const config = await this.resolver.resolveConnectConfig(this.config);
            if (config) {
                client.connect(config);
            } else {
                // tslint:disable-next-line:no-unused-expression
                logFn && logFn(`no config resolved ${this.keyString}`);
                waitClient.release();
            }
        } else {
            client.connect(this.config);
        }

        await waitClient.acquire();

        const accepted = this.client !== undefined;
        if (this.resolver) {
            this.resolver.feedBack(this.config, accepted);
        }
        return accepted;
    }

}
