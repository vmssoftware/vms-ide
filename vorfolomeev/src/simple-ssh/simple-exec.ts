import { ClientChannel } from "ssh2";
import { Lock } from "../common/lock";
import { LogType } from "../common/log-type";
import { SimpleSsh } from "./simple-ssh";
import { WaitableOperation } from "./waitable-operation";

export let logFn: LogType | undefined;

export class SimpleExecSsh extends SimpleSsh {
    public execCleaned: symbol = Symbol.for("execCleaned");

    protected lock = new Lock();
    protected channel?: ClientChannel;
    protected lastExecError?: Error;

    public async execCmd(cmd: string): Promise<ClientChannel|undefined> {

        const opName = `exec command "${cmd}" via ${this.keyString}`;

        await this.lock.acquire();
        this.lastExecError = undefined;

        const hasClient = await super.connect();
        if (hasClient && this.client) {

            await WaitableOperation(opName, this.client, "continue", this.emitter, this.clientCleaned, (complete) => {
                if (!this.client) {
                    complete.release();
                    return false;
                }
                return !this.client.exec(cmd, (err, channel) => {
                    if (err) {
                        // tslint:disable-next-line:no-unused-expression
                        logFn && logFn(`${opName} failed: ${err}`);
                        this.lastExecError = err;
                    } else {
                        channel.on("close", () => {
                            // tslint:disable-next-line:no-unused-expression
                            logFn && logFn(`${opName} channel closed`);
                            this.cleanExec();
                        });

                        channel.on("exit", () => {
                            // tslint:disable-next-line:no-unused-expression
                            logFn && logFn(`${opName} channel exit`);
                        });

                        // tslint:disable-next-line:no-unused-expression
                        logFn && logFn(`${opName} channel got`);
                        this.channel = channel; // channel set
                    }
                    complete.release();
                });
            });
        } else {
            // tslint:disable-next-line:no-unused-expression
            logFn && logFn(`${opName} cannot get client`);
            this.lock.release();
        }

        // tslint:disable-next-line:no-unused-expression
        logFn && logFn(`${opName}: returns channel`);
        return this.channel;
    }

    protected cleanExec() {
        // tslint:disable-next-line:no-unused-expression
        logFn && logFn(`clean exec ${this.keyString}`);
        if (this.channel) {
            // tslint:disable-next-line:no-unused-expression
            logFn && logFn(`clean exec: channel still exists ${this.keyString}`);
            this.channel = undefined;   // channel reset
            this.lock.release();
            const lasError = this.lastExecError;
            setImmediate(() => {
                this.emitter.emit(this.execCleaned, lasError);
            });
            this.lastExecError = undefined;
        }
    }

}
