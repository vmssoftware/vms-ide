import os from "os";
import { Client, ClientChannel, ConnectConfig } from "ssh2";
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

    public static async makeChannel(client: Client, log?: LogType) {
        let channel: ClientChannel | undefined;
        await WaitableOperation("create shell", client, "continue", client, "error", (complete) => {
            return !client.shell((clientError, channelGot) => {
                if (clientError) {
                    if (log) { log(`${clientError}`); }
                } else {
                    if (log) { log(`channel ready`); }
                    channel = channelGot;
                }
                complete.release();
            });
        }, log);
        return channel;
    }

    private prompt?: string;             // given prompt from other side
    private channel?: ClientChannel;
    private disposeOnClose?: IUnSubscribe;
    private disposeOnExit?: IUnSubscribe;
    private waitOperation = new Lock(false, "waitOperation");

    constructor(config: ConnectConfig,
                resolver?: IConnectConfigResolver,
                private welcomeParser?: ICanParseWelcome,
                private promptCatcher?: IPromptCatcher,
                log?: LogType) {
        super(config, resolver, log);
    }

    public dispose() {
        this.waitOperation.release();
        this.cleanChannel();
        super.dispose();
    }

    public async execCmd(command: string) {
        let contentRet: string | undefined;
        await this.waitOperation.acquire();
        if (!this.welcomeParser) {
            this.welcomeParser = new ParseWelcome(0, this.log);
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
                            if (this.log) { this.log(`command output found`); }
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

    private cleanChannel() {
        if (this.disposeOnClose) {
            this.disposeOnClose.unsubscribe();
            delete this.disposeOnClose;
        }
        if (this.disposeOnExit) {
            this.disposeOnExit.unsubscribe();
            delete this.disposeOnExit;
        }
        delete this.channel;
        delete this.prompt;
    }

    private async ensureChannel() {
        if (!this.channel) {
            await this.ensureClient();
            if (this.client) {
                this.channel = await SshShell.makeChannel(this.client, this.log);
                if (this.channel) {
                    this.disposeOnClose = Subscribe(this.channel, "close", () => {
                        if (this.log) { this.log(`channel close`); }
                        this.cleanChannel();
                    });
                    const disposeOnExit = Subscribe(this.channel, "exit", (exitCode) => {
                        if (this.log) { this.log(`channel exit ${exitCode}`); }
                        this.cleanChannel();
                    });
                    if (this.prompt === undefined && this.welcomeParser !== undefined) {
                        this.prompt = await this.welcomeParser.parseWelcome(this.channel);
                    }
                }
            }
        }
    }
}
