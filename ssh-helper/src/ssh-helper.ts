// import * as nls from "vscode-nls";
// nls.config({messageFormat: nls.MessageFormat.both});
// const localize = nls.loadMessageBundle();

import { SftpClient } from "./stream/sftp-client";
import { SshShell } from "./stream/ssh-shell";
import { LogFunction } from "@vorfol/common";
import { IConfigHelper } from "./config/config";
import { ConnectionSection } from "./config/sections/connection";
import { TimeoutSection } from "./config/sections/timeouts";
import { PasswordVscodeFiller } from "./config-resolve/password-vscode-filler";
import { ConnectConfigResolverImpl } from "./config-resolve/connect-config-resolver-impl";
import { ParseWelcomeVms } from "./stream/parse-welcome-vms";
import { PromptCatcherVms } from "./stream/prompt-catcher-vms";
import { PipeFile } from "./stream/pipe";
import { MemoryStreamCreator } from "./stream/stream-creators";
import { ConstPasswordFiller } from "./config-resolve/password-filler";
import { KeyFiller } from "./config-resolve/key-filler";
import { HostsSection } from "./config/sections/hosts";
import { HostFiller } from "./config-resolve/host-filler";
import { configApi } from "./config-api";

import { ICanCreateReadStream, ICanCreateWriteStream, ISftpClient, ISshShell, IMemoryStreamCreator, ISshScopeSettings, IConnectConfig } from "./api";

interface IEnsured extends ISshScopeSettings {
    configHelper: IConfigHelper;
}

export interface IDispose {
    dispose(): any;
}

const extensionName = "vmssoftware.ssh-helper";

export class SshHelper {

    readonly extensionName: string;
    
    public logFn: LogFunction;

    constructor(logFn?: LogFunction) {
        // tslint:disable-next-line:no-empty
        this.logFn = logFn || (() => {});
        this.extensionName = extensionName;
    }

    public dispose() {
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

    public async editSettings(scope?: string) {
        const ensured = await ensureSettings(this.logFn, scope);
        if (!ensured) {
            return false;
        }
        const editor = ensured.configHelper.getEditor();
        return editor.invoke();
    }

    public async getDefaultSftp(scope?: string) {
        // get current config
        const ensured = await ensureSettings(this.logFn, scope);
        if (!ensured) {
            return undefined;
        }
        const sftp = new SftpClient(ensured.connectionSection, ensured.connectConfigResolver, this.logFn);
        return sftp as ISftpClient;
    }

    public async getSettings(scope?: string) {
        // get current config
        const ensured = await ensureSettings(this.logFn, scope);
        if (!ensured) {
            return undefined;
        }
        return ensured as ISshScopeSettings;
    }

    public async getDefaultVmsShell(scope?: string) {
        // get current config
        const ensured = await ensureSettings(this.logFn, scope);
        if (!ensured) {
            return undefined;
        }
        const welcome = new ParseWelcomeVms(ensured.timeoutSection.welcomeTimeout, this.logFn);
        const prompter = new PromptCatcherVms("", ensured.timeoutSection.cmdTimeout, this.logFn);
        const shell = new SshShell(ensured.connectionSection, ensured.connectConfigResolver, welcome, prompter, this.logFn);
        return shell as ISshShell;
    }

    public setConfigWatcher(scope: string, watcher: () => void): IDispose {
        if (!configApi) {
            return {
                dispose() {
                    //
                }
            };
        }
        const configHelper = configApi.getConfigHelper(this.extensionName, scope);
        return configHelper.getConfig().onDidLoad(watcher);
    }

    public async getTestSftp(settings: IConnectConfig) {
        const fillers = [new KeyFiller()];
        const resolver = new ConnectConfigResolverImpl(fillers, 0, this.logFn);
        const sftp = new SftpClient(settings, resolver, this.logFn);
        return sftp as ISftpClient;
    }

    public async getTestShell(settings: IConnectConfig, isVms: boolean) {
        const fillers = [new KeyFiller()];
        const resolver = new ConnectConfigResolverImpl(fillers, 0, this.logFn);
        const welcome = isVms ? new ParseWelcomeVms(0, this.logFn) : undefined;
        const prompter = isVms ? new PromptCatcherVms("", 0, this.logFn) : undefined;
        const sftp = new SshShell(settings, resolver, welcome, prompter, this.logFn);
        return sftp as ISshShell;
    }
}

/**
 * Every time returns new IEnsured
 * @param scope string, workspaceFolder.name
 */
async function ensureSettings(logFn: LogFunction, scope?: string): Promise<IEnsured | undefined> {
    if (!configApi) {
        return undefined;
    }
    const configHelper = configApi.getConfigHelper(extensionName, scope);
    const config = configHelper.getConfig();
    // first try
    let [connectionSection, hostsSection, timeoutSection] = 
        await Promise.all(
            [config.get(ConnectionSection.section),
                config.get(HostsSection.section),
                config.get(TimeoutSection.section)]);
    const wait = [];
    // test and add if missed
    if (!connectionSection) {
        config.add(new ConnectionSection());
        wait.push(config.get(ConnectionSection.section).then((section) => {
            connectionSection = section;
        }));
    }
    if (!hostsSection) {
        config.add(new HostsSection());
        wait.push(config.get(HostsSection.section).then((section) => {
            hostsSection = section;
        }));
    }
    if (!timeoutSection) {
        config.add(new TimeoutSection());
        wait.push(config.get(TimeoutSection.section).then((section) => {
            timeoutSection = section;
        }));
    }
    // wait
    if (wait.length > 0) {
        await Promise.all(wait);
    }
    // then ensure all are loaded
    if (ConnectionSection.is(connectionSection) &&
        HostsSection.is(hostsSection) &&
        TimeoutSection.is(timeoutSection)) {
        const fillers = [new HostFiller(hostsSection, logFn), new KeyFiller(logFn), new PasswordVscodeFiller()];
        const connectConfigResolver = new ConnectConfigResolverImpl(fillers, timeoutSection.feedbackTimeout, logFn);
        return {
            configHelper,
            connectionSection,
            hostsSection,
            timeoutSection,
            connectConfigResolver,
        };
    }
    return undefined;
}
    
