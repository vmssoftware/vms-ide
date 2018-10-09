import { ClientChannel } from "ssh2";
import { ISshConnectionSettings } from "./connection";
import { QueuedConnection } from "./queued-connection";
import { IShellParser } from "./shell-parser";
import { SimplyShellParser } from "./simply-shell-parser";

// tslint:disable-next-line:no-console
export let logFn = console.log;
// tslint:disable-next-line:no-empty
logFn = () => {};

type Resolve<T> = ((value?: T | PromiseLike<T> | undefined) => void);

export interface IExecutionResult {
    stdout?: string;
    stderr?: string;
}

export interface IShellSettings extends ISshConnectionSettings {
    parser?: IShellParser;
}

export class ShellConnecttion extends QueuedConnection {

    public get isConnected(): boolean {
        return this.channel !== undefined;
    }

    protected channel: ClientChannel | undefined;
    protected parser: IShellParser | undefined;

    constructor(settings: IShellSettings) {
        super(settings);
        this.parser = settings.parser;
    }

    /**
     * Execute cmd in shell
     * @param cmd command to execute
     * @param parser custom pareser
     * @param asap as soon as possible
     */
    public executeShellCmd(cmd: string, parser?: IShellParser, asap: boolean = false)
        : Promise<IExecutionResult|undefined> {
        return new Promise<IExecutionResult|undefined>(async (resolve) => {
            this.taskQueue.enqueue( async () => {
                this.lastError = undefined;
                const retCode = await this.ensureShell();
                if (!retCode || !this.channel ) {
                    logFn(`executeShellCmd: failed shell: ${cmd} => ${this.lastError}`);
                    resolve(undefined);
                } else {
                    const result = await this.shellExec(cmd, parser);
                    logFn(`executeShellCmd: ok : ${cmd}`);
                    resolve(result);
                }
            }, asap);
        });
    }

    private ensureShell(): Promise<boolean> {
        if (this.channel) {
            logFn(`ensureShell: already exists`);
            return Promise.resolve(true);
        }
        return this.createShell();
    }

    private createShell(): Promise<boolean> {
        return new Promise<boolean>(async (resolve) => {
            const retCode = await this.ensureConnection();
            if (!retCode || !this.client) {
                logFn(`createShell: failed connect: ${this.lastError}`);
                resolve(false);
                return;
            }
            this.client.shell( async (err, channelRet) => {
                if (err) {
                    this.lastError = err;
                    resolve(false);
                    logFn(`createShell: failed shell: ${this.lastError}`);
                } else {
                    this.cancelOperation = () => {
                        this.channel = undefined;
                        logFn(`shell: cancelled on creation`);
                        resolve(false);
                    };
                    channelRet.on("close", () => {
                        this.channel = undefined;
                        logFn(`shell: closed`);
                        resolve(false);
                    });
                    // initail shell parser => must parse output and resolve promise when prompt appears
                    const parser = this.parser || new SimplyShellParser("> ");
                    channelRet.on("data", (data: any) => {
                        if (Buffer.isBuffer(data)) {
                            data = data.toString("utf8");
                        }
                        if (typeof data === "string") {
                            if (parser.onData(data)) {
                                logFn(`createShell: ok`);
                                this.channel = channelRet;
                                channelRet.removeAllListeners("data");
                                channelRet.stderr.removeAllListeners("data");
                                resolve(true);
                            }
                        }
                    });
                    channelRet.stderr.on("data", (data) => {
                        if (Buffer.isBuffer(data)) {
                            data = data.toString("utf8");
                        }
                        if (typeof data === "string") {
                            logFn(`ERR: ${data}`);
                            if (parser.onDataErr(data)) {
                                logFn(`createShell: failed => ${data}`);
                                channelRet.removeAllListeners("data");
                                channelRet.stderr.removeAllListeners("data");
                                resolve(false);
                            }
                        }
                    });
                }
            });
        });
    }

    private shellExec(cmd: string, parser?: IShellParser): Promise<IExecutionResult|undefined> {
        return new Promise<IExecutionResult|undefined>((resolve) => {
            if (!this.channel) {
                resolve(undefined);
                this.lastError = new Error("No channel");
                logFn(`shellExec: failed: ${cmd} => ${this.lastError}`);
                return;
            }
            const channel = this.channel;
            const retCode = this.channel.write(cmd + "\r\n", async (err) => {
                logFn(`write cmd: flushed`);
                if (err) {
                    this.lastError = err;
                    resolve(undefined);
                } else {
                    let result: IExecutionResult = {};
                    const finalize: () => void = () => {
                        channel.removeAllListeners("data");
                        channel.stderr.removeAllListeners("data");
                        resolve(result);
                    };
                    this.cancelOperation = () => {
                        this.channel = undefined;
                        logFn(`shell: cancelled on execution`);
                        finalize();
                    };
                    const shellParser: IShellParser = parser || new SimplyShellParser("> ");
                    if (shellParser instanceof SimplyShellParser) {
                        result = shellParser;
                    }
                    channel.on("data", (data: any) => {
                        if (Buffer.isBuffer(data)) {
                            data = data.toString("utf8");
                        }
                        if (typeof data === "string") {
                            if (shellParser.onData(data)) {
                                logFn(`shellExec: parsed ok`);
                                finalize();
                            }
                        }
                    });
                    channel.stderr.on("data", (data: any) => {
                        if (Buffer.isBuffer(data)) {
                            data = data.toString("utf8");
                        }
                        if (typeof data === "string") {
                            if (shellParser.onData(data)) {
                                logFn(`shellExec: parsed stderr ok`);
                                finalize();
                            }
                        }
                    });
                }
            });
            logFn(`write cmd: ${retCode}`);
        });
    }
}
