import os from "os";

import { ClientChannel, ConnectConfig } from "ssh2";
import { Lock } from "../common/lock";
import { LogType } from "../common/log-type";
import { IUnSubscribe, Subscribe } from "../common/subscribe";
import { IConnectConfigResolver } from "../config-resolve/connect-config-resolver";
import { WaitableOperation } from "../simple-ssh/waitable-operation";
import { ICanParseWelcome } from "./can-parse-welcome";
import { ParseWelcome } from "./parse-welcome";
import { IPromptCatcher } from "./prompt-catcher";
import { PromptCatcherDefault } from "./prompt-catcher-default";
import { SshClient } from "./ssh-client";

export class SshShell extends SshClient {

    private prompt?: string;             // given prompt from other side
    private channel?: ClientChannel;
    private shellClose?: IUnSubscribe;
    private shellExit?: IUnSubscribe;
    private waitOperation = new Lock(false, "waitOperation");

    constructor(config: ConnectConfig,
                resolver?: IConnectConfigResolver,
                private welcomeParser?: ICanParseWelcome,
                private promptCatcher?: IPromptCatcher,
                debugLog?: LogType,
                tag?: string) {
        super(config, resolver, debugLog, tag);
    }

    public dispose() {
        this.waitOperation.release();
        super.dispose();
        this.cleanChannel();
    }

    public async execCmd(command: string) {
        let contentRet: string | undefined;
        await this.waitOperation.acquire();
        if (!this.welcomeParser) {
            this.welcomeParser = new ParseWelcome(0, this.debugLog);
        }
        await this.ensureChannel();
        if (this.channel && this.prompt) {
            if (!this.promptCatcher) {
                this.promptCatcher = new PromptCatcherDefault(this.prompt);
            } else {
                this.promptCatcher.prompt = this.prompt;
            }
            const readyEvent = this.promptCatcher.readyEvent;
            const promptCatchStream = await this.promptCatcher.createWriteStream();
            if (promptCatchStream) {
                const waitReady = new Lock(true);
                const unsubscriber = Subscribe(promptCatchStream, readyEvent, (content) => {
                    // skip garbage from previuos commands
                    if (typeof content === "string") {
                        if (content.startsWith(command)) {
                            if (this.debugLog) {
                                this.debugLog(`shell${this.tag ? " " + this.tag : ""} command output found`);
                            }
                            contentRet = content;
                            waitReady.release();
                        }
                    } else {
                        waitReady.release();
                    }
                });
                command = command.trim() + os.EOL;
                this.channel.write(command);
                this.channel.pipe(promptCatchStream);
                await waitReady.acquire();
                unsubscriber.unsubscribe();
                if (this.channel) {
                    this.channel.unpipe(promptCatchStream);
                }
            }
        }
        this.waitOperation.release();
        return contentRet;
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
        if (this.shellClose) {
            this.shellClose.unsubscribe();
            delete this.shellClose;
        }
        if (this.shellExit) {
            this.shellExit.unsubscribe();
            delete this.shellExit;
        }
        delete this.channel;
        delete this.prompt;
    }

    private async ensureChannel() {
        if (!this.channel) {
            await this.ensureClient();
            if (this.client) {
                await this.shellConnect();
                if (this.channel) {
                    if (this.prompt === undefined &&
                        this.welcomeParser !== undefined) {
                        this.prompt = await this.welcomeParser.parseWelcome(this.channel);
                    }
                }
            }
        }
    }
}
