import { ClientChannel } from "ssh2";
import { IExecutionResult } from "./execution-result";
import { QueuedConnection } from "./queued-connection";
import { IShellParser } from "./shell-parser";
import { IShellSettings } from "./shell-settings";
import { SimplyShellParser } from "./simply-shell-parser";

export type LogType = (message?: any, ...optionalParams: any[]) => void;
export let logFn: LogType | undefined;

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

    public settingsChanged(settings: IShellSettings) {
        this.taskQueue.enqueue(async () => {
            this.parser = settings.parser;
            super.settingsChanged(settings);
        });
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
                    if (logFn) { logFn(`executeShellCmd: failed shell: ${cmd} => ${this.lastError}`); }
                    resolve(undefined);
                } else {
                    const result = await this.shellExec(cmd, parser);
                    if (logFn) { logFn(`executeShellCmd: ok : ${cmd}`); }
                    resolve(result);
                }
            }, asap);
        });
    }

    private ensureShell(): Promise<boolean> {
        if (this.channel) {
            if (logFn) { logFn(`ensureShell: already exists`); }
            return Promise.resolve(true);
        }
        return this.createShell();
    }

    private createShell(): Promise<boolean> {
        return new Promise<boolean>(async (resolve) => {
            const retCode = await this.ensureConnection();
            if (!retCode || !this.client) {
                if (logFn) { logFn(`createShell: failed connect: ${this.lastError}`); }
                resolve(false);
                return;
            }
            this.client.shell( async (err, channelRet) => {
                if (err) {
                    this.lastError = err;
                    resolve(false);
                    if (logFn) { logFn(`createShell: failed shell: ${this.lastError}`); }
                } else {
                    this.cancelOperation = () => {
                        this.channel = undefined;
                        if (logFn) { logFn(`shell: cancelled on creation`); }
                        resolve(false);
                    };
                    channelRet.on("close", () => {
                        this.channel = undefined;
                        if (logFn) { logFn(`shell: closed`); }
                        resolve(false);
                    });
                    // initail shell parser => must parse output and resolve promise when prompt appears
                    const parser = this.parser || new SimplyShellParser("> ");
                    parser.initialize();
                    channelRet.on("data", (data: any) => {
                        if (Buffer.isBuffer(data)) {
                            data = data.toString("utf8");
                        }
                        if (typeof data === "string") {
                            if (parser.onData(data)) {
                                if (logFn) { logFn(`createShell: ok`); }
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
                            if (logFn) { logFn(`ERR: ${data}`); }
                            if (parser.onDataErr(data)) {
                                if (logFn) { logFn(`createShell: failed => ${data}`); }
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
                if (logFn) { logFn(`shellExec: failed: ${cmd} => ${this.lastError}`); }
                return;
            }
            const channel = this.channel;
            const retCode = this.channel.write(cmd + "\r\n", async (err) => {
                if (logFn) { logFn(`write cmd: flushed`); }
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
                        if (logFn) { logFn(`shell: cancelled on execution`); }
                        finalize();
                    };

                    const shellParser: IShellParser = parser || new SimplyShellParser("> ");
                    shellParser.initialize();

                    if (shellParser instanceof SimplyShellParser) {
                        result = shellParser;
                    }
                    channel.on("data", (data: any) => {
                        if (Buffer.isBuffer(data)) {
                            data = data.toString("utf8");
                        }
                        if (typeof data === "string") {
                            if (shellParser.onData(data)) {
                                if (logFn) { logFn(`shellExec: parsed ok`); }
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
                                if (logFn) { logFn(`shellExec: parsed stderr ok`); }
                                finalize();
                            }
                        }
                    });
                }
            });
            if (logFn) { logFn(`write cmd: ${retCode}`); }
        });
    }
}
