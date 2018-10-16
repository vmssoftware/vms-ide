import { ClientChannel } from "ssh2";
import { Lock } from "./../common/lock";
import { SimpleSsh } from "./simple-ssh";
import { WaitableOperation } from "./waitable-operation";

export type LogType = (message?: any, ...optionalParams: any[]) => void;
export let logFn: LogType | undefined;

export class SimpleShellSsh extends SimpleSsh {

    public get shellPrompt(): string | undefined {
        return this.prompt;
    }

    public set shellPrompt(prompt: string | undefined) {
        this.prompt = prompt;
    }

    public get parseTimeOut(): number {
        return this.timeOut;
    }

    public set parseTimeOut(timeOut: number) {
        this.timeOut = timeOut;
    }

    public shellCleaned: symbol = Symbol.for("shellCleaned");

    protected lock = new Lock();

    protected channel?: ClientChannel;
    protected prompt?: string;  // found prompt
    protected lastShellError?: Error;

    protected timeOut = 20000;
    protected readonly eol = "\r\n";

    public async execCmd(cmd: string): Promise<ClientChannel|undefined> {

        await this.lock.acquire();
        this.lastShellError = undefined;

        const hasShell = await this.connect();

        if (hasShell && this.channel) {

            if (this.prompt === undefined) {
                await this.parseWelcome();
            }

            const waitWriteLock = new Lock(true);

            cmd = cmd.trim() + this.eol;

            // TODO: investigate should it waitable or not
            this.channel.write(cmd, (err) => {
                if (err) {
                    // tslint:disable-next-line:no-unused-expression
                    logFn && logFn(`shell exec failed: "${cmd.trim()}", ${err}`);
                    this.lastShellError = err;
                } else {
                    // tslint:disable-next-line:no-unused-expression
                    logFn && logFn(`shell exec: has written "${cmd.trim()}"`);
                }
                waitWriteLock.release();
            });

            await waitWriteLock.acquire();
            waitWriteLock.release();
        } else {
            this.lock.release();
        }

        // tslint:disable-next-line:no-unused-expression
        logFn && logFn(`shell exec: return "${cmd.trim()}"`);
        return this.channel;
    }

    public releaseShell() {
        this.lock.release();
    }

    protected cleanShellExec() {
        // tslint:disable-next-line:no-unused-expression
        logFn && logFn(`shell clean: "${this.keyString}"`);
        if (this.channel) {
            // tslint:disable-next-line:no-unused-expression
            logFn && logFn(`shell channel still exists: for ${this.keyString}`);
        }
        this.channel = undefined;   // channel reset
        delete this.prompt;         // no more welcome
        const lastError = this.lastShellError;
        setImmediate(() => {
            this.emitter.emit(this.shellCleaned, lastError);
        });
        this.lock.release();        // next, if exists
        this.lastShellError = undefined;
    }

    protected async connect(): Promise<boolean> {
        const opName = `shell connection ${this.keyString}`;
        if (this.channel) {
            // tslint:disable-next-line:no-unused-expression
            logFn && logFn(`${opName} already in action`);
            return true;
        }
        this.lastShellError = undefined;
        const hasClient = await super.connect();
        if (hasClient && this.client) {

            await WaitableOperation(opName, this.client, "continue", this.emitter, this.clientCleaned, (complete) => {
                if (!this.client) {
                    complete.release();
                    return false;
                }
                return this.client.shell((err, channel) => {
                    if (err) {
                        // tslint:disable-next-line:no-unused-expression
                        logFn && logFn(`${opName} failed: ${err}`);
                        this.lastShellError = err;
                    } else {
                        channel.on("close", () => {
                            // tslint:disable-next-line:no-unused-expression
                            logFn && logFn(`${opName} closed`);
                            this.cleanShellExec();
                        });

                        channel.on("exit", () => {
                            // tslint:disable-next-line:no-unused-expression
                            logFn && logFn(`${opName} exit`);
                        });

                        // tslint:disable-next-line:no-unused-expression
                        logFn && logFn(`${opName} channel got`);
                        this.channel = channel; // set channel
                    }
                    complete.release();
                });
            });

        } else {
            // tslint:disable-next-line:no-unused-expression
            logFn && logFn(`${opName} cannot get client`);
        }
        return this.channel !== undefined;
    }

    /**
     * Just write some if esc-code found, else welcome!
     */
    protected async parseWelcome() {

        if (this.channel && this.prompt === undefined) {

            const waitParse = new Lock(true);

            const channel = this.channel;

            let welcome = "";

            const onData = (data: Buffer) => {
                // tslint:disable-next-line:no-unused-expression
                logFn && logFn(`parse: on data`);
                if (Buffer.isBuffer(data)) {
                    if (data.includes(27)) {
                        channel.write(this.eol);
                    } else {
                        const strData = data.toString("utf8");
                        welcome += strData;
                        const promptStart = welcome.lastIndexOf(this.eol);
                        if (promptStart >= 0 &&
                            promptStart + this.eol.length !== welcome.length) {
                            this.prompt = welcome.slice(promptStart + this.eol.length);
                            // tslint:disable-next-line:no-unused-expression
                            logFn && logFn(`parse: found prompt "${this.prompt}"`);
                            waitParse.release();
                        }
                    }
                } else {
                    // tslint:disable-next-line:no-unused-expression
                    logFn && logFn(`parse: data is not Buffer`);
                    waitParse.release();
                }
            };
            channel.on("data", onData);

            const onClose = () => {
                waitParse.release();
            };
            channel.on("close", onClose);

            // just in case
            const timer = setTimeout(() => {
                // tslint:disable-next-line:no-unused-expression
                logFn && logFn(`parse: timeout`);
                waitParse.release();
            }, this.timeOut);

            await waitParse.acquire();

            channel.removeListener("data", onData);
            channel.removeListener("close", onClose);
            clearTimeout(timer);
        }

        if (this.prompt === undefined) {
            // tslint:disable-next-line:no-unused-expression
            logFn && logFn(`parse: cannot find prompt`);
            this.prompt = " ";
        }

        return;
    }
}
