import os from "os";

import { ClientChannel, ConnectConfig } from "ssh2";
import { Lock } from "../common/lock";
import { LogType } from "../common/log-type";
import { IUnSubscribe, Subscribe } from "../common/subscribe";
import { WaitableOperation } from "../common/waitable-operation";
import { IConnectConfigResolver } from "../config-resolve/connect-config-resolver";
import { ParseWelcome } from "./parse-welcome";
import { IPromptCatcher } from "./prompt-catcher";
import { PromptCatcherDefault } from "./prompt-catcher-default";
import { SshClient } from "./ssh-client";
import { IWelcomeParser } from "./welcome-parser";

export class SshShell extends SshClient {
    public lastShellError?: Error;

    private prompt?: string;             // given prompt from other side
    private channel?: ClientChannel;
    private shellClose?: IUnSubscribe;
    private shellExit?: IUnSubscribe;
    private waitOperation = new Lock(false, "waitOperation");

    constructor(config: ConnectConfig,
                resolver?: IConnectConfigResolver,
                private welcomeParser?: IWelcomeParser,
                private promptCatcher?: IPromptCatcher,
                debugLog?: LogType,
                tag?: string) {
        super(config, resolver, debugLog, tag);
    }

    public setParsers(welcome: IWelcomeParser, prompter: IPromptCatcher) {
        this.welcomeParser = welcome;
        this.promptCatcher = prompter;
    }

    public dispose() {
        this.waitOperation.release();
        super.dispose();
        this.cleanChannel();
    }

    /**
     * Exec one command and continue. No "\r" or "\n" allowed inside command.
     * @param command command to execute
     */
    public async execCmd(command: string) {
        let contentRet: string | undefined;
        await this.waitOperation.acquire();
        if (!this.welcomeParser) {
            this.welcomeParser = new ParseWelcome(0, this.debugLog);
        }
        if (await this.ensureChannel()) {
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
                    const trimmedCommand = command.trim();
                    const unsubscriber = Subscribe(promptCatchStream, readyEvent, (content) => {
                        // skip garbage from previuos commands
                        if (typeof content === "string") {
                            if (this.debugLog) {
                                this.debugLog(`shell${this.tag ? " " + this.tag : ""} command raw output: ${content}`);
                            }
                            const tstContent = content.replace(/\r?\n|\r/g, "").trim();
                            if (tstContent.startsWith(trimmedCommand)) {
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
                    this.channel.write(trimmedCommand + os.EOL);
                    if (this.debugLog) {
                        this.debugLog(`shell${this.tag ? " " + this.tag : ""} command written: ${trimmedCommand}`);
                    }
                    this.channel.pipe(promptCatchStream);
                    await waitReady.acquire();
                    unsubscriber.unsubscribe();
                    if (this.channel) {
                        this.channel.unpipe(promptCatchStream);
                    }
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
        if (!this.enabled) {
            return false;
        }
        if (this.channel !== undefined) {
            return true;
        }
        if (!await this.ensureClient()) {
            return false;
        }
        if (!this.client) {
            return false;
        }
        if (!await this.shellConnect()) {
            return false;
        }
        if (!this.channel) {
            return false;
        }
        if (this.prompt === undefined &&
            this.welcomeParser !== undefined) {
            this.prompt = await this.welcomeParser.parseWelcome(this.channel);
        }
        return !!this.prompt;
    }
}
