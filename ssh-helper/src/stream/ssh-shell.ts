import { ClientChannel } from "ssh2";
import { Transform } from "stream";

import { Lock } from "@vorfol/common";
import { LogFunction, LogType } from "@vorfol/common";
import { IUnSubscribe, Subscribe } from "@vorfol/common";
import { WaitableOperation } from "@vorfol/common";

import { IConnectConfigResolver, IConnectConfig } from "../api";
import { SshClient } from "./ssh-client";
import { ParseWelcome } from "./parse-welcome";
import { PromptCatcher } from "./prompt-catcher";
import { IParseWelcome, IPromptCatcher, ISshShell } from "../api";

import * as nls from "vscode-nls";
nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export class SshShell extends SshClient implements ISshShell {

    public static eol = "\r\n";
    public lastError?: string;

    public get prompt() {
        return this.promptGiven;
    }

    public get width() {
        return this._width;
    }
    public set width(w: number) {
        if (w >= 16 && w <= 255) {
            this._width = w;
            if (this.welcomeParser) {
                this.welcomeParser.width = w;
            }
        }
    }

    private promptGiven?: string;             // given prompt from other side
    private channel?: ClientChannel;
    private shellClose?: IUnSubscribe;
    private shellExit?: IUnSubscribe;
    private waitOperation = new Lock(false, "waitOperation");
    private userStream?: Transform;
    private _width = 132;

    constructor(config: IConnectConfig,
                resolver?: IConnectConfigResolver<IConnectConfig>,
                private welcomeParser?: IParseWelcome,
                private promptCatcher?: IPromptCatcher,
                logFn?: LogFunction,
                tag?: string) {
        super(config, resolver, logFn, tag);
    }

    public setParsers(welcome?: IParseWelcome, prompter?: IPromptCatcher) {
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
                this.promptGiven) {  // just check if welcome banner parsed correctly
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
    public async execCmd(command: string, timeout?: number) {
        let contentRet: string[] | undefined;
        this.lastError = undefined;
        await this.waitOperation.acquire();
        if (await this.ensureChannel()) {
            if (this.channel &&
                this.promptGiven &&
                this.promptCatcher)
            {
                const prevTimeOut = this.promptCatcher.timeout;
                if (timeout) {
                    this.promptCatcher.timeout = timeout;
                }
                
                const waitReady = new Lock(true);
                const trimmedCommand = command.trim();
                const onReady = Subscribe(this.promptCatcher, this.promptCatcher.readyEvent, (content) => {
                    if (this.promptCatcher && this.promptCatcher.lastError) {
                        this.lastError = String(this.promptCatcher.lastError);
                        this.logFn(LogType.debug, () => localize("debug.cmd.error", "shell{1} command error: {0}", this.lastError, this.tag ? " " + this.tag : ""));
                        contentRet = typeof content === "string" 
                            ? [content] 
                            : this.promptCatcher 
                                ? [this.promptCatcher.content] 
                                : contentRet;
                        commandEnded.call(this);
                    } else {
                        if (typeof content === "string") {
                            this.logFn(LogType.debug, () => localize("debug.cmd.raw", "shell{1} command raw output: {0}", content, this.tag ? " " + this.tag : ""));
                            // try to skip garbage from previuos commands
                            const contentLines = content.split(/\r?\n|\r/);
                            let firstLine = "";
                            let pos = 0;
                            for (; pos < contentLines.length; ++pos) {
                                const line = contentLines[pos];
                                if (line !== "") {
                                    firstLine += line;
                                } else {
                                    break;
                                }
                            }
                            if (firstLine.startsWith(trimmedCommand)) {
                                this.logFn(LogType.debug, () => localize("debug.cmd.out", "shell{0} command output found", this.tag ? " " + this.tag : ""));
                                contentRet = contentLines.slice(pos + 1);
                                commandEnded.call(this);
                            } else {
                                this.logFn(LogType.debug, () => localize("debug.garbage", "shell{0} garbage output found", this.tag ? " " + this.tag : ""));
                            }
                        } else {
                            // undefined content => stream error or finished stream
                            commandEnded.call(this);
                        }
                    }
                });
                const onClose = Subscribe(this.channel, "close", () => {
                    contentRet = contentRet? contentRet : this.promptCatcher? [this.promptCatcher.content] : contentRet;
                    commandEnded.call(this);
                    this.logFn(LogType.debug, () => localize("debug.closed", "shell{0} channel suddenly closed", this.tag ? " " + this.tag : ""));
                });
                const onExit = Subscribe(this.channel, "exit", (exitCode) => {
                    contentRet = contentRet? contentRet : this.promptCatcher? [this.promptCatcher.content] : contentRet;
                    commandEnded.call(this);
                    this.logFn(LogType.debug, () => localize("debug.channel.exit", "shell{0} channel suddenly exited", this.tag ? " " + this.tag : ""));
                });
                this.promptCatcher.prepare();
                this.channel.write(trimmedCommand + SshShell.eol);
                this.logFn(LogType.debug, () => localize("debug.written", "shell{1} command written: {0}", trimmedCommand, this.tag ? " " + this.tag : ""));
                this.channel.pipe(this.promptCatcher);
                await waitReady.acquire();
                onReady.unsubscribe();
                onClose.unsubscribe();
                onExit.unsubscribe();

                this.promptCatcher.timeout = prevTimeOut;
                
                function commandEnded(this: SshShell) {
                    waitReady.release();
                    if (this.channel) {
                        this.logFn(LogType.debug, () => localize("debug.unpiped", "shell{0} prompt catcher unpiped", this.tag ? " " + this.tag : ""));
                        this.channel.unpipe(this.promptCatcher);
                    } else {
                        this.logFn(LogType.debug, () => localize("debug.undef", "shell{0} channel undefined when trying to unpipe", this.tag ? " " + this.tag : ""));
                    }
                    if (this.promptCatcher) {
                        this.promptCatcher.content = "";
                    }
                }
            }
        }
        this.waitOperation.release();
        return contentRet;

    }

    private async shellConnect() {
        if (this.client) {
            const opName = localize("operation.connect", "create shell{0}", this.tag ? " " + this.tag : "");
            await WaitableOperation(opName, this.client, "continue", this.client, "error", (complete) => {
                if (!this.client) {
                    return false;
                }
                return !this.client.shell((clientError, channelGot) => {
                    if (clientError) {
                        this.logFn(LogType.error, () => localize("debug.operation.error", "{0} error: {1}", opName, String(clientError)));
                    } else {
                        this.logFn(LogType.debug, () => localize("debug.ready", "shell{0} ready", this.tag ? " " + this.tag : ""));
                        this.channel = channelGot;
                        this.shellClose = Subscribe(this.channel, "close", () => {
                            this.logFn(LogType.debug, () => localize("debug.close", "shell{0} close", this.tag ? " " + this.tag : ""));
                            setImmediate(() => this.cleanChannel());
                        });
                        this.shellExit = Subscribe(this.channel, "exit", (exitCode) => {
                            this.logFn(LogType.debug, () => localize("debug.exit", "shell{1} exit {0}", exitCode, this.tag ? " " + this.tag : ""));
                            setImmediate(() => this.cleanChannel());
                        });
                    }
                    complete.release();
                });
            }, this.logFn);
        }
        return this.channel !== undefined;
    }

    private cleanChannel() {
        this.waitOperation.release();
        // check and clean userStream
        if (this.userStream) {
            this.userStream.emit("error", new Error(localize("debug.cleaned", "Shell{0} cleaned", this.tag ? " " + this.tag : "")));
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
        delete this.promptGiven;
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
        if (!await this.shellConnect()) {
            // cannot connect - not ok
            return false;
        }
        if (!this.channel) {
            // has no channel - not ok too
            return false;
        }
        // acquire prompt
        return await this.parseWelcome();
    }

    protected async parseWelcome() {
        this.promptGiven = undefined;
        if (!this.welcomeParser) {
            this.logFn(LogType.debug, () => localize("debug.welcome", "shell{0} create def welcome parser", this.tag ? " " + this.tag : ""));
            this.welcomeParser = new ParseWelcome(0, this.logFn, "welcome");
        } else {
            // clear prompt
            this.welcomeParser.prompt = undefined;
        }
        if (!this.channel) {
            return false;
        }
        const waitWelcomPrompt = new Lock(true);
        const unsubscribeWelcome = Subscribe(this.welcomeParser, this.welcomeParser.readyEvent, (content) => {
            waitWelcomPrompt.release();
        });
        this.channel.pipe(this.welcomeParser).pipe(this.channel);
        await waitWelcomPrompt.acquire();
        this.channel.unpipe(this.welcomeParser);
        this.welcomeParser.unpipe(this.channel);
        unsubscribeWelcome.unsubscribe();
        this.promptGiven = this.welcomeParser.prompt;
        if (this.promptGiven) {
            if (!this.promptCatcher) {
                this.logFn(LogType.debug, () => localize("debug.prompt", "shell{0} create def prompt catcher", this.tag ? " " + this.tag : ""));
                this.promptCatcher = new PromptCatcher(this.promptGiven, 0, this.logFn, "catcher");
            } else {
                this.logFn(LogType.debug, () => localize("debug.prompt.set", "shell{1} set prompt '{0}' to catcher", this.prompt, this.tag ? " " + this.tag : ""));
                this.promptCatcher.prompt = this.promptGiven;
                this.promptCatcher.content = "";
            }
            return true;
        }
        return false;
    }
}
