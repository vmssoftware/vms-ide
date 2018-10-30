import { Event } from "vscode";

import { SftpClient } from "./stream/sftp-client";
import { SshShell } from "./stream/ssh-shell";

import { LogType, IFileEntry } from "@vorfol/common";

import { IConfig, IConfigSection, IConfigHelper } from "./config/config";
import { GetConfigHelperFromApi } from "./config/get-config-helper";

import { ConnectionSection } from "./config/sections/connection";
import { TimeoutsSection } from "./config/sections/timeouts";
import { PasswordVscodeFiller } from "./config-resolve/password-vscode-filler";
import { ConnectConfigResolverImpl } from "./config-resolve/connect-config-resolver-impl";
import { ParseWelcomeVms } from "./stream/parse-welcome-vms";
import { PromptCatcherVms } from "./stream/prompt-catcher-vms";
import { ICanCreateReadStream, ICanCreateWriteStream, ISftpClient, ISshShell, IMemoryStreamCreator } from "./api";
import { PipeFile } from "./stream/pipe";
import { MemoryStreamCreator } from "./stream/stream-creators";
import { ConstPasswordFiller } from "./config-resolve/password-filler";

import * as nls from "vscode-nls";
const localize = nls.loadMessageBundle();

export class SshHelper {

    readonly section: string;
    
    private settingsEnsured?: boolean;
    private sections: IConfigSection[] = [];
    private configHelper?: IConfigHelper;
    private config?: IConfig;

    public onDidLoadConfig?: Event<null>;

    constructor(public debugLog?: LogType) {
        this.section = "vmssoftware.ssh-helper";
        this.sections.push(new ConnectionSection());
        this.sections.push(new TimeoutsSection());
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
            debugLog?: LogType) {
        return PipeFile(source, dest, file, destFile, debugLog);
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
            !this.config) {
            return undefined;
        }
        const [connectionSection,
               timeoutSection] = await Promise.all(
                [this.config.get(ConnectionSection.section),
                 this.config.get(TimeoutsSection.section)]);
        if (ConnectionSection.is(connectionSection) &&
            TimeoutsSection.is(timeoutSection)) {
            const fillers = [new PasswordVscodeFiller()];
            const resolver = new ConnectConfigResolverImpl(fillers, timeoutSection.feedbackTimeout, this.debugLog);
            const sftp = new SftpClient(connectionSection, resolver, this.debugLog);
            return sftp as ISftpClient;
        }
        return undefined;
    }

    public async getDefaultVmsShell() {
        // get current config
        if (!await this.ensureSettings() ||
            !this.config) {
            return undefined;
        }
        const [connectionSection,
               timeoutSection] = await Promise.all(
                [this.config.get(ConnectionSection.section),
                 this.config.get(TimeoutsSection.section)]);
        if (ConnectionSection.is(connectionSection) &&
            TimeoutsSection.is(timeoutSection)) {
            const fillers = [new PasswordVscodeFiller()];
            const resolver = new ConnectConfigResolverImpl(fillers, timeoutSection.feedbackTimeout, this.debugLog);
            const welcome = new ParseWelcomeVms(timeoutSection.welcomeTimeout, this.debugLog);
            const prompter = new PromptCatcherVms("", timeoutSection.cmdTimeout, this.debugLog);
            const shell = new SshShell(connectionSection, resolver, welcome, prompter, this.debugLog);
            return shell as ISshShell;
        }
        return undefined;
    }

    public async ensureSettings() {
        if (this.settingsEnsured !== undefined) {
            return this.settingsEnsured;
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
            this.settingsEnsured = false;
            return false;
        }
        for (const section of this.sections) {
            const testSection = await this.config.get(section.name());
            if (!testSection) {
                this.config.add(section);
            }
        }
        // then ensure all are loaded
        for (const section of this.sections) {
            const testSection = await this.config.get(section.name());
            if (this.debugLog && typeof section !== typeof testSection) {
                this.debugLog(localize("debug.diff", "Different types of sections {0}", section.name()));
                return false;
            }
        }
        this.settingsEnsured = true;
        return true;
    }
    
    public async getTestSftp(host: string, port: number, username: string, password: string) {
        const fillers = [new ConstPasswordFiller(password)];
        const resolver = new ConnectConfigResolverImpl(fillers, 0, this.debugLog);
        const sftp = new SftpClient({host, port, username}, resolver, this.debugLog);
        return sftp as ISftpClient;
    }

    public async getTestShell(host: string, port: number, username: string, password: string, isVms: boolean) {
        const fillers = [new ConstPasswordFiller(password)];
        const resolver = new ConnectConfigResolverImpl(fillers, 0, this.debugLog);
        const welcome = isVms ? new ParseWelcomeVms(0, this.debugLog) : undefined;
        const prompter = isVms ? new PromptCatcherVms("", 0, this.debugLog) : undefined;
        const sftp = new SshShell({host, port, username}, resolver, welcome, prompter, this.debugLog);
        return sftp as ISshShell;
    }

}
