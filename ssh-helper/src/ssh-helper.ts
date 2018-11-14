import { Event } from "vscode";

import { SftpClient } from "./stream/sftp-client";
import { SshShell } from "./stream/ssh-shell";

import { LogType, IFileEntry, LogFunction } from "@vorfol/common";

import { IConfig, IConfigSection, IConfigHelper } from "./config/config";
import { GetConfigHelperFromApi } from "./config/get-config-helper";

import { ConnectionSection } from "./config/sections/connection";
import { TimeoutsSection } from "./config/sections/timeouts";
import { PasswordVscodeFiller } from "./config-resolve/password-vscode-filler";
import { ConnectConfigResolverImpl } from "./config-resolve/connect-config-resolver-impl";
import { ParseWelcomeVms } from "./stream/parse-welcome-vms";
import { PromptCatcherVms } from "./stream/prompt-catcher-vms";
import { ICanCreateReadStream, ICanCreateWriteStream, ISftpClient, ISshShell, IMemoryStreamCreator, IConnectionSection, ITimeoutsSection, IConnectConfigResolver } from "./api";
import { PipeFile } from "./stream/pipe";
import { MemoryStreamCreator } from "./stream/stream-creators";
import { ConstPasswordFiller } from "./config-resolve/password-filler";
import { KeyFiller } from "./config-resolve/key-filler";

import * as nls from "vscode-nls";
nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export class SshHelper {

    readonly section: string;
    
    private configHelper?: IConfigHelper;
    private config?: IConfig;

    public onDidLoadConfig?: Event<null>;
    public logFn: LogFunction;

    public connectionSection?: IConnectionSection;
    public timeoutSection?: ITimeoutsSection;
    public connectConfigResolver?: IConnectConfigResolver<IConnectionSection>;

    constructor(logFn?: LogFunction) {
        // tslint:disable-next-line:no-empty
        this.logFn = logFn || (() => {});
        this.section = "vmssoftware.ssh-helper";
    }

    public dispose() {
        //
    }

    public clearPasswordCashe() {
        ConnectConfigResolverImpl.clearCache();
    }

    public async pipeFile(
            source: ICanCreateReadStream,
            dest: ICanCreateWriteStream,
            file: string,
            destFile?: string,
            logFn?: LogFunction) {
        return PipeFile(source, dest, file, destFile, logFn);
    }

    public memStream(): IMemoryStreamCreator {
        return new MemoryStreamCreator();
    }

    public async editSettings() {
        if (!await this.ensureSettings() ||
            !this.configHelper) {
            return false;
        }
        const editor = this.configHelper.getEditor();
        return editor.invoke();
    }

    public async getDefaultSftp() {
        // get current config
        if (!await this.ensureSettings() ||
            !this.connectionSection ||
            !this.timeoutSection ||
            !this.connectConfigResolver) {
            return undefined;
        }
        const sftp = new SftpClient(this.connectionSection, this.connectConfigResolver, this.logFn);
        return sftp as ISftpClient;
    }

    public async getDefaultVmsShell() {
        // get current config
        if (!await this.ensureSettings() ||
            !this.connectionSection ||
            !this.timeoutSection ||
            !this.connectConfigResolver) {
            return undefined;
        }
        const welcome = new ParseWelcomeVms(this.timeoutSection.welcomeTimeout, this.logFn);
        const prompter = new PromptCatcherVms("", this.timeoutSection.cmdTimeout, this.logFn);
        const shell = new SshShell(this.connectionSection, this.connectConfigResolver, welcome, prompter, this.logFn);
        return shell as ISshShell;
    }

    public async ensureSettings() {
        if (this.connectionSection && 
            this.timeoutSection &&
            this.connectConfigResolver) {
            return true;
        }
        if (!this.config) {
            const api = await GetConfigHelperFromApi();
            if (api) {
                this.configHelper = api.getConfigHelper(this.section);
                this.config = this.configHelper.getConfig();
                this.onDidLoadConfig = this.config.onDidLoad;
            }
        }
        if (!this.config) {
            return false;
        }
        // first try
        let [connectionSection, timeoutSection] = 
            await Promise.all(
                [this.config.get(ConnectionSection.section),
                this.config.get(TimeoutsSection.section)]);
        // test and add if missed
        if (!connectionSection) {
            this.config.add(new ConnectionSection());
        }
        if (!timeoutSection) {
            this.config.add(new TimeoutsSection());
        }
        // senond try
        [connectionSection, timeoutSection] = 
            await Promise.all(
                [this.config.get(ConnectionSection.section),
                this.config.get(TimeoutsSection.section)]);
        // then ensure all are loaded
        if (ConnectionSection.is(connectionSection)) {
            this.connectionSection = connectionSection;
        }
        if (TimeoutsSection.is(timeoutSection)) {
            this.timeoutSection = timeoutSection;
        }
        if (!this.connectConfigResolver && this.timeoutSection) {
            const fillers = [new KeyFiller(this.logFn), new PasswordVscodeFiller()];
            this.connectConfigResolver = new ConnectConfigResolverImpl(fillers, this.timeoutSection.feedbackTimeout, this.logFn);
        }
        return this.connectionSection !== undefined && 
            this.timeoutSection !== undefined &&
            this.connectConfigResolver !== undefined;
    }
    
    public async getTestSftp(host: string, port: number, username: string, password: string) {
        const fillers = [new ConstPasswordFiller(password)];
        const resolver = new ConnectConfigResolverImpl(fillers, 0, this.logFn);
        const sftp = new SftpClient({host, port, username}, resolver, this.logFn);
        return sftp as ISftpClient;
    }

    public async getTestShell(host: string, port: number, username: string, password: string, isVms: boolean) {
        const fillers = [new ConstPasswordFiller(password)];
        const resolver = new ConnectConfigResolverImpl(fillers, 0, this.logFn);
        const welcome = isVms ? new ParseWelcomeVms(0, this.logFn) : undefined;
        const prompter = isVms ? new PromptCatcherVms("", 0, this.logFn) : undefined;
        const sftp = new SshShell({host, port, username}, resolver, welcome, prompter, this.logFn);
        return sftp as ISshShell;
    }

}
