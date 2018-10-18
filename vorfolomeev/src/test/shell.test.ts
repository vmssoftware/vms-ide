import { ConnectConfig } from "ssh2";
import { ContextPasswordFiller } from "../common/context-password-filler";
import { LogType } from "../common/log-type";
import { IConnectConfigResolver } from "../config-resolve/connect-config-resolver";
import { ConnectConfigResolverImpl, settingsCache } from "../config-resolve/connect-config-resolver-impl";
import { ICanParseWelcome } from "../stream/can-parse-welcome";
import { ParseWelcome } from "../stream/parse-welcome";
import { ParseWelcomeVms } from "../stream/parse-welcome-vms";
import { IPromptCatcher } from "../stream/prompt-catcher";
import { PromptCatcherDefault } from "../stream/prompt-catcher-default";
import { PromptCatcherVms } from "../stream/prompt-catcher-vms";
import { SshShell } from "../stream/ssh-shell";
import { TestConfiguration } from "./config/config";

suite("Shell tests", function(this: Mocha.Suite) {

    this.timeout(0);

    return;

    // tslint:disable-next-line:no-console
    const logFn = console.log;
    // const logFn = undefined;
    let configLocal: ConnectConfig;
    let configVms: ConnectConfig;
    let filler: ContextPasswordFiller;
    let resolver: IConnectConfigResolver;
    let parser: ICanParseWelcome;
    let parserVms: ICanParseWelcome;
    let promptCatcher: IPromptCatcher;
    let promptCatcherVms: IPromptCatcher;
    const defaultExitCommand = "exit";
    const defaultCommands = [
        "dir",
        "echo Hi",
    ];
    const vmsExitCommand = "logout";
    const vmsCommands = [
        "dir",
        "sh time",
    ];

    this.beforeAll(async () => {
        configLocal = await TestConfiguration(true);
        configVms = await TestConfiguration(false);

        filler = new ContextPasswordFiller([
            {
                host: configLocal.host,
                password: configLocal.password,
            },
            {
                host: configVms.host,
                password: configVms.password,
            },
        ], 0);

        delete configLocal.password;
        delete configVms.password;
        resolver = new ConnectConfigResolverImpl([filler]);
        parser = new ParseWelcome(0, logFn);
        promptCatcher = new PromptCatcherDefault("", logFn);
        parserVms = new ParseWelcomeVms(5000, logFn);
        promptCatcherVms = new PromptCatcherVms("", logFn);
    });

    test("TestShell no password", async () => {
        settingsCache.clear();
        return await TestShell(defaultCommands, configLocal, undefined, parser, promptCatcher, logFn);
    });

    test("TestShell local +quit welcome-prompt prompt-catch", async () => {
        settingsCache.clear();
        const logoutInserted = defaultCommands.concat([defaultExitCommand], defaultCommands);
        return await TestShell(logoutInserted, configLocal, resolver, parser, promptCatcher, logFn);
    });

    test("TestShell vms +quit welcome-prompt prompt-catch", async () => {
        settingsCache.clear();
        const logoutInserted = vmsCommands.concat([vmsExitCommand], vmsCommands);
        return await TestShell(logoutInserted, configVms, resolver, parser, promptCatcher, logFn);
    });

    test("TestShell vms +quit welcome-vms vms-catch", async () => {
        settingsCache.clear();
        const logoutInserted = vmsCommands.concat([vmsExitCommand], vmsCommands);
        return await TestShell(logoutInserted, configVms, resolver, parserVms, promptCatcherVms, logFn);
    });

    test("TestShell local welcome-prompt prompt-catch", async () => {
        settingsCache.clear();
        return await TestShell(defaultCommands, configLocal, resolver, parser, promptCatcher, logFn);
    });

    test("TestShell vms welcome-prompt prompt-catch", async () => {
        settingsCache.clear();
        return await TestShell(vmsCommands, configVms, resolver, parser, promptCatcher, logFn);
    });

    test("TestShell vms welcome-vms vms-catch", async () => {
        settingsCache.clear();
        return await TestShell(vmsCommands, configVms, resolver, parserVms, promptCatcherVms, logFn);
    });

    async function TestShell(commands: string[],
                             config: ConnectConfig,
                             configResolver?: IConnectConfigResolver,
                             welcomeParser?: ICanParseWelcome,
                             catcher?: IPromptCatcher,
                             log?: LogType) {
        const shell = new SshShell(config, configResolver, welcomeParser, catcher, log);
        for (const command of commands) {
            const content = await shell.execCmd(command);
            if (log) {
                log(`command: ${command}\r\ncontent:\r\n${content}`);
            }
        }
        shell.dispose();
        return true;
    }

});
