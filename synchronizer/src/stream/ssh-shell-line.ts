import readline from "readline";

import { ClientChannel, ConnectConfig } from "ssh2";
import { Lock } from "../common/lock";
import { LogType } from "../common/log-type";
import { IUnSubscribe, Subscribe } from "../common/subscribe";
import { WaitableOperation } from "../common/waitable-operation";
import { IConnectConfigResolver } from "../config-resolve/connect-config-resolver";
import { StreamTTYHold } from "./sream-tty-hold";
import { SshClient } from "./ssh-client";

export class SshShellLine extends SshClient {
    public lastShellError?: Error;
    public stream?: StreamTTYHold;

    public channel?: ClientChannel;
    public shellClose?: IUnSubscribe;
    public shellExit?: IUnSubscribe;
    public waitOperation = new Lock();

    constructor(config: ConnectConfig,
                resolver?: IConnectConfigResolver,
                debugLog?: LogType,
                tag?: string) {
        super(config, resolver, debugLog, tag);
    }

    public dispose() {
        super.dispose();
        this.cleanChannel();
    }

    public async acquireReadLine() {
        if (await this.ensureChannel()) {
            if (this.channel) {
                this.stream = new StreamTTYHold(this.debugLog);
                const readLine = readline.createInterface(this.channel.stdout, this.stream, undefined, true);
                return readLine;
            }
        }
        return undefined;
    }

    private async shellConnect() {
        if (this.client) {
            const opName = `create shell${this.tag ? " " + this.tag : ""}`;
            await WaitableOperation(opName, this.client, "continue", this.client, "error", (complete) => {
                if (!this.client) {
                    return false;
                }
                return !this.client.shell((clientError, channelGot) => {
                    if (clientError) {
                        if (this.debugLog) {
                            this.debugLog(`${opName} error: ${clientError}`);
                        }
                        this.lastShellError = clientError;
                    } else {
                        if (this.debugLog) {
                            this.debugLog(`shell${this.tag ? " " + this.tag : ""} ready`);
                        }
                        this.channel = channelGot;
                        this.shellClose = Subscribe(this.channel, "close", () => {
                            if (this.debugLog) {
                                this.debugLog(`shell${this.tag ? " " + this.tag : ""} close`);
                            }
                            this.cleanChannel();
                        });
                        this.shellExit = Subscribe(this.channel, "exit", (exitCode) => {
                            if (this.debugLog) {
                                this.debugLog(`shell${this.tag ? " " + this.tag : ""} exit ${exitCode}`);
                            }
                            this.cleanChannel();
                        });
                    }
                    complete.release();
                });
            }, this.debugLog);
        }
        return this.channel !== undefined;
    }

    private cleanChannel() {
        this.waitOperation.release();
        // check and clean userStream
        if (this.shellClose) {
            this.shellClose.unsubscribe();
            delete this.shellClose;
        }
        if (this.shellExit) {
            this.shellExit.unsubscribe();
            delete this.shellExit;
        }
        delete this.channel;
    }

    private async ensureChannel() {
        if (!this.enabled) {
            // disabled - not ok
            return false;
        }
        if (this.channel !== undefined) {
            // channel exists - ok
            return true;
        }
        if (!await this.ensureClient()) {
            // cannot ensure client - not ok
            return false;
        }
        if (!this.client) {
            // has no client - not ok too
            return false;
        }
        if (!await this.shellConnect()) {
            // cannot connect - not ok
            return false;
        }
        if (!this.channel) {
            // has no channel - not ok too
            return false;
        }
        return true;
    }
}
