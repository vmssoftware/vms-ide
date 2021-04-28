import { LogFunction, LogType } from "../../common/main";

import { IPromptCatcher } from "../api";
import { IConnectConfig, IConnectConfigResolver } from "../api";
import { IParseWelcome } from "../api";
import { ConnectConfigResolverImpl, settingsCache } from "../config-resolve/connect-config-resolver-impl";
import { ContextPasswordFiller } from "../config-resolve/context-password-filler";
import { KeyFiller } from "../config-resolve/key-filler";
import { ParseWelcome } from "../stream/parse-welcome";
import { ParseWelcomeVms } from "../stream/parse-welcome-vms";
import { PromptCatcher } from "../stream/prompt-catcher";
import { PromptCatcherVms } from "../stream/prompt-catcher-vms";
import { SshShell } from "../stream/ssh-shell";
import { TestConfiguration } from "./config/config";

suite("Shell tests", function(this: Mocha.Suite) {

    this.timeout(0);

    // const debugLogFn = undefined;
    let debugLogFn: LogFunction | undefined;
    debugLogFn = undefined;
    // tslint:disable-next-line:no-console
    // debugLogFn = console.log;
    let configLocal: IConnectConfig;
    let configVms: IConnectConfig;
    let keyFiller: KeyFiller;
    let filler: ContextPasswordFiller;
    let resolver: IConnectConfigResolver<IConnectConfig>;
    let parser: IParseWelcome;
    let parserVms: IParseWelcome;
    let promptCatcher: IPromptCatcher;
    let promptCatcherVms: IPromptCatcher;
    const defaultExitCommand = "exit";
    const defaultCommands = [
        "dir",
        "echo Hi",
    ];
    const vmsExitCommand = "logout";
    const vmsCommands = [
        "cd project",
        "mms/descr=project/ext",
    ];

    this.beforeAll(async () => {
        configLocal = await TestConfiguration(true);
        configVms = await TestConfiguration(false);

        filler = new ContextPasswordFiller([
            {
                host: configLocal.host,
                password: configLocal.password,
            },
        ], 0);

        keyFiller = new KeyFiller(debugLogFn);

        delete configLocal.password;
        delete configVms.password;
        resolver = new ConnectConfigResolverImpl([keyFiller, filler]);  // key first!
        parser = new ParseWelcome(0, debugLogFn, "wel");
        promptCatcher = new PromptCatcher("", 0, debugLogFn, "prom");
        parserVms = new ParseWelcomeVms(5000, debugLogFn, "wel vms");
        promptCatcherVms = new PromptCatcherVms("", 0, debugLogFn, "prom vms");
    });

    test("TestShell vms +quit welcome-vms vms-catch", async () => {
        settingsCache.clear();
        const logoutInserted = vmsCommands.concat([vmsExitCommand], vmsCommands);
        return await TestShell(logoutInserted, configVms, resolver, parserVms, promptCatcherVms, debugLogFn);
    });

    return;

    test("TestShell no password", async () => {
        settingsCache.clear();
        return await TestShell(defaultCommands, configLocal, undefined, parser, promptCatcher, debugLogFn);
    });

    test("TestShell local +quit welcome-prompt prompt-catch", async () => {
        settingsCache.clear();
        const logoutInserted = defaultCommands.concat([defaultExitCommand], defaultCommands);
        return await TestShell(logoutInserted, configLocal, resolver, parser, promptCatcher, debugLogFn);
    });

    test("TestShell vms +quit welcome-prompt prompt-catch", async () => {
        settingsCache.clear();
        const logoutInserted = vmsCommands.concat([vmsExitCommand], vmsCommands);
        return await TestShell(logoutInserted, configVms, resolver, parser, promptCatcher, debugLogFn);
    });

    test("TestShell local welcome-prompt prompt-catch", async () => {
        settingsCache.clear();
        return await TestShell(defaultCommands, configLocal, resolver, parser, promptCatcher, debugLogFn);
    });

    test("TestShell vms welcome-prompt prompt-catch", async () => {
        settingsCache.clear();
        return await TestShell(vmsCommands, configVms, resolver, parser, promptCatcher, debugLogFn);
    });

    test("TestShell vms welcome-vms vms-catch", async () => {
        settingsCache.clear();
        return await TestShell(vmsCommands, configVms, resolver, parserVms, promptCatcherVms, debugLogFn);
    });

    async function TestShell(commands: string[],
                             config: IConnectConfig,
                             configResolver?: IConnectConfigResolver<IConnectConfig>,
                             welcomeParser?: IParseWelcome,
                             catcher?: IPromptCatcher,
                             logFn?: LogFunction) {
        const shell = new SshShell(config, configResolver, welcomeParser, catcher, logFn, "*");
        shell.width = 16;
        for (const command of commands) {
            if (logFn) {
                logFn(LogType.debug, () => `start exec command: ${command}`);
            }
            const content = await shell.execCmd(command);
            if (logFn) {
                if (content) {
                    // const lines = "> " + content.split("\n").map((s) => s.trim()).filter((s) => s).join("\r\n> ");
                    logFn(LogType.debug, () => `end command: ${command}\r\ncontent:${content}`);
                } else {
                    logFn(LogType.debug, () => `end command: ${command}\r\n>=> content undefined`);
                }
            }
        }
        shell.dispose();
        return true;
    }

});
