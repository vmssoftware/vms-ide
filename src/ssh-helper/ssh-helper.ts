import * as nls from "vscode-nls";
nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

import { LogFunction, LogType } from "../common/main";
import { CSAResult, IConfigHelper } from "../config-helper/config/config";
import { configApi } from "./config-api";
import { ConnectConfigResolverImpl } from "./config-resolve/connect-config-resolver-impl";
import { HostFiller } from "./config-resolve/host-filler";
import { KeyFiller } from "./config-resolve/key-filler";
import { PasswordVscodeFiller } from "./config-resolve/password-vscode-filler";
import { ConnectionSection } from "./config/sections/connection";
import { HostsSection } from "./config/sections/hosts";
import { TimeoutSection } from "./config/sections/timeouts";
import { ParseWelcomeVms } from "./stream/parse-welcome-vms";
import { PipeFile } from "./stream/pipe";
import { PromptCatcherVms } from "./stream/prompt-catcher-vms";
import { SftpClient } from "./stream/sftp-client";
import { SshShell } from "./stream/ssh-shell";
import { MemoryStreamCreator } from "./stream/stream-creators";

import { ICanCreateReadStream, ICanCreateWriteStream, IConnectConfig, IMemoryStreamCreator, ISftpClient, ISshScopeSettings, ISshShell } from "./api";
import { TerminalSection } from "./config/sections/terminal";

interface IEnsured extends ISshScopeSettings {
    configHelper: IConfigHelper;
}

export interface IDispose {
    dispose(): any;
}

const extensionName = "vmssoftware.ssh-helper";

export class SshHelper {

    public readonly extensionName: string;

    public logFn: LogFunction;

    constructor(logFn?: LogFunction) {
        // tslint:disable-next-line:no-empty
        this.logFn = logFn || (() => {});
        this.extensionName = extensionName;
    }

    public dispose() {
        //
    }

    public clearPasswordCache() {
        ConnectConfigResolverImpl.clearCache(this.logFn);
    }

    public killPasswordCache() {
        ConnectConfigResolverImpl.killCache(this.logFn);
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
        return new MemoryStreamCreator([], undefined, this.logFn);
    }

    public async editSettings(scope?: string) {
        const ensured = await ensureSettings(this.logFn, scope);
        if (!ensured) {
            return false;
        }
        const editor = ensured.configHelper.getEditor();
        return editor.invoke();
    }

    public async testSettings(scope?: string) {
        const ensured = await ensureSettings(this.logFn, scope);
        if (!ensured) {
            this.logFn(LogType.error, () => "no settings");
            return false;
        }
        const matched = ensured.connectionSection.host.match(HostFiller.rg);
        if (!matched) {
            // the host is not a label in hosts
            return true;
        }
        let host_to_find = matched[1];
        for (const host of ensured.hostsSection.hosts) {
            if (host.label === host_to_find) {
                return true;
            }
        }
        host_to_find = host_to_find.toLowerCase()
        for (const host of ensured.hostsSection.hosts) {
            if (host.label.toLowerCase() === host_to_find) {
                this.logFn(LogType.error, () => localize("ssh_helper.case_host", "Cannot find a host in list: {0}, did you mean {1}?", matched[1], host.label), true);
                return false;
            }
        }
        this.logFn(LogType.error, () => localize("ssh_helper.no_host", "Cannot find a host in list: {0}", matched[1]), true);
        return false;
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
                },
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
    config.lastResult = CSAResult.ok;
    // first try
    let [connectionSection, hostsSection, timeoutSection, terminalSection] =
        await Promise.all(
            [config.get(ConnectionSection.section),
             config.get(HostsSection.section),
             config.get(TimeoutSection.section),
             config.get(TerminalSection.section),
            ]);
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
    if (!terminalSection) {
        config.add(new TerminalSection());
        wait.push(config.get(TerminalSection.section).then((section) => {
            terminalSection = section;
        }));
    }
    // wait
    if (wait.length > 0) {
        await Promise.all(wait);
    }
    if (config.lastResult !== CSAResult.ok) {
        if (config.lastResult & CSAResult.fail) {
            logFn(LogType.error, () => localize("config.logResult.fail", "Settings: load operation failed"), true);
        }
        if (config.lastResult & CSAResult.prepare_failed) {
            logFn(LogType.error, () => localize("config.logResult.prepare_failed", "Settings: cannot load data from storage"), true);
        }
        if (config.lastResult & CSAResult.some_data_failed) {
            logFn(LogType.warning, () => localize("config.logResult.some_data_failed", "Settings: failed to fill some data while loading"), true);
        }
    }
    // then ensure all are loaded
    if (ConnectionSection.is(connectionSection) &&
        HostsSection.is(hostsSection) &&
        TimeoutSection.is(timeoutSection) &&
        TerminalSection.is(terminalSection) ) {
        const fillers = [new HostFiller(hostsSection, logFn), new KeyFiller(logFn), new PasswordVscodeFiller()];
        const connectConfigResolver = new ConnectConfigResolverImpl(fillers, timeoutSection.feedbackTimeout, logFn);
        return {
            configHelper,
            connectConfigResolver,
            connectionSection,
            hostsSection,
            timeoutSection,
            terminalSection,
        };
    }
    return undefined;
}
