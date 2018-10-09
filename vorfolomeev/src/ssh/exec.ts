import { ISshConnectionSettings, SshConnection } from "./connection";
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

export class SshExec extends SshConnection {

    constructor(settings: ISshConnectionSettings) {
        super(settings);
    }

    /**
     * Execute command and close connection (no shell)
     * @param cmd command
     * @param asap as soon as posiible
     */
    public executeCmd(cmd: string): Promise<IExecutionResult|undefined> {
        return new Promise<IExecutionResult|undefined>(async (resolve) => {
            this.lastError = undefined;
            const retCode = await this.ensureConnection();
            if (!retCode || !this.client ) {
                logFn(`executeCmd: failed exec: ${cmd} => ${this.lastError}`);
                resolve(undefined);
            } else {
                const result = await this.cmdExec(cmd);
                logFn(`executeCmd: ok: ${cmd}`);
                resolve(result);
            }
        });
    }

    private cmdExecutor(resolve: Resolve<IExecutionResult|undefined>, cmd: string): void {
        if (!this.client) {
            this.lastError = new Error("No client");
            logFn(`cmdExec: failed: ${cmd} => ${this.lastError}`);
            resolve(undefined);
            return;
        }
        if (!this.client.exec(cmd, (err, channel) => {
            if (err) {
                this.lastError = err;
                logFn(`cmdExec: exec failed: ${cmd} => ${this.lastError}`);
                resolve(undefined);
            } else {
                const parser = new SimplyShellParser("> ");
                // send one command and this channel will be closed
                channel.on("close", () => {
                    resolve(parser);
                    logFn(`cmdExec: closed`);
                });
                channel.on("data", (data: any) => {
                    if (Buffer.isBuffer(data)) {
                        data = data.toString("utf8");
                    }
                    if (typeof data === "string") {
                        if (parser.onData(data)) {
                            logFn(`cmdExec: parsed ok`);
                            resolve(parser);
                        }
                    }
                });
                channel.stderr.on("data", (data: any) => {
                    if (Buffer.isBuffer(data)) {
                        data = data.toString("utf8");
                    }
                    if (typeof data === "string") {
                        if (parser.onData(data)) {
                            logFn(`cmdExec: parsed stderr ok`);
                            resolve(parser);
                        }
                    }
                });
            }
        })) {
            logFn(`cmdExec: wait`);
            this.client.once("continue", () => {
                this.cmdExecutor(resolve, cmd);
            });
        }
    }

    private cmdExec(cmd: string): Promise<IExecutionResult|undefined> {
        return new Promise<IExecutionResult|undefined>((resolve) => {
            this.cmdExecutor(resolve, cmd);
        });
    }

}
