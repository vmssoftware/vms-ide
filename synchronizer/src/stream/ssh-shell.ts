import os from "os";

import { ClientChannel, ConnectConfig } from "ssh2";
import { Transform } from "stream";
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
    private userStream?: Transform;

    constructor(config: ConnectConfig,
                resolver?: IConnectConfigResolver,
                private welcomeParser?: IWelcomeParser,
                private promptCatcher?: IPromptCatcher,
                debugLog?: LogType,
                tag?: string) {
        super(config, resolver, debugLog, tag);
    }

    public setParsers(welcome?: IWelcomeParser, prompter?: IPromptCatcher) {
        this.welcomeParser = welcome || this.welcomeParser;
        this.promptCatcher = prompter || this.promptCatcher;
    }

    public dispose() {
        this.waitOperation.release();
        super.dispose();
        this.cleanChannel();
    }

    public async attachUser(user: Transform) {
        await this.waitOperation.acquire();
        if (await this.ensureChannel()) {
            if (this.channel &&
                this.prompt) {  // just check if welcome banner parsed correctly
                // no check prompt-catcher, it's user's issue now
                this.userStream = user;
                this.userStream.pipe(this.channel).pipe(this.userStream);
                return true;
            }
        }
        return false;
    }

    public async detachUser() {
        if (this.userStream && this.channel) {
            this.userStream.unpipe(this.channel);
            this.channel.unpipe(this.userStream);
        }
        delete this.userStream;
        this.waitOperation.release();
    }

    /**
     * Exec one command and continue. No "\r" or "\n" allowed inside command.
     * @param command command to execute
     */
    public async execCmd(command: string) {
        let contentRet: string | undefined;
        await this.waitOperation.acquire();
        if (await this.ensureChannel()) {
            if (this.channel &&
                this.prompt &&
                this.promptCatcher) {
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
                            // undefined content => stream error or finished stream
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
        this.waitOperation.release();
        // check and clean userStream
        if (this.userStream) {
            this.userStream.emit("error", new Error("Shell cleaned"));
        }
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
        delete this.userStream;
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
        // prepare to shell connect
        this.prompt = undefined;
        if (!this.welcomeParser) {
            this.welcomeParser = new ParseWelcome(0, this.debugLog);
        }
        if (!await this.shellConnect()) {
            // cannot connect - not ok
            return false;
        }
        if (!this.channel) {
            // has no channel - not ok too
            return false;
        }
        // parse prompt
        this.prompt = await this.welcomeParser.parseWelcome(this.channel);
        if (this.prompt) {
            if (!this.promptCatcher) {
                if (this.debugLog) {
                    this.debugLog(`shell${this.tag ? " " + this.tag : ""} create def prompt catcher`);
                }
                this.promptCatcher = new PromptCatcherDefault(this.prompt);
            } else {
                if (this.debugLog) {
                    this.debugLog(`shell${this.tag ? " " + this.tag : ""} set prompt to catcher`);
                }
                this.promptCatcher.prompt = this.prompt;
            }
            return true;
        }
        return false;   // no parsed prompt - no executed commands
    }
}
