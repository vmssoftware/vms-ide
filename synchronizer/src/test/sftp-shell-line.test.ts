import { ConnectConfig } from "ssh2";
import { ContextPasswordFiller } from "../common/context-password-filler";
import { Lock } from "../common/lock";
import { LogType } from "../common/log-type";
import { IConnectConfigResolver } from "../config-resolve/connect-config-resolver";
import { ConnectConfigResolverImpl, settingsCache } from "../config-resolve/connect-config-resolver-impl";
import { ParseWelcome } from "../stream/parse-welcome";
import { ParseWelcomeVms } from "../stream/parse-welcome-vms";
import { IPromptCatcher } from "../stream/prompt-catcher";
import { PromptCatcherDefault } from "../stream/prompt-catcher-default";
import { PromptCatcherVms } from "../stream/prompt-catcher-vms";
import { SshShell } from "../stream/ssh-shell";
import { SshShellLine } from "../stream/ssh-shell-line";
import { IWelcomeParser } from "../stream/welcome-parser";
import { TestConfiguration } from "./config/config";

suite("Shell line tests", function(this: Mocha.Suite) {

    return;

    this.timeout(0);

    // const debugLogFn = undefined;
    let debugLogFn: LogType | undefined;
    debugLogFn = undefined;
    // tslint:disable-next-line:no-console
    debugLogFn = console.log;
    let configLocal: ConnectConfig;
    let configVms: ConnectConfig;
    let filler: ContextPasswordFiller;
    let resolver: IConnectConfigResolver;
    let parser: IWelcomeParser;
    let parserVms: IWelcomeParser;
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
        parser = new ParseWelcome(0, debugLogFn);
        promptCatcher = new PromptCatcherDefault("", debugLogFn);
        parserVms = new ParseWelcomeVms(5000, debugLogFn);
        promptCatcherVms = new PromptCatcherVms("", debugLogFn);
    });

    test("TestShellLine", async () => {
        settingsCache.clear();
        const shell = new SshShellLine(configVms, resolver, debugLogFn, "*");
        const rl = await shell.acquireReadLine();
        const done = new Lock(true);
        if (rl) {
            rl.on("line", (line) => {
                if (debugLogFn) {
                    debugLogFn(line);
                }
            });
            rl.on("close", () => {
                done.release();
            });
            if (shell.channel) {
                shell.channel.write("dir\r\n");
                shell.channel.write("exit\r\n");
            }
            await done.acquire();
        }
        shell.dispose();
    });

    async function TestShell(commands: string[],
                             config: ConnectConfig,
                             configResolver?: IConnectConfigResolver,
                             welcomeParser?: IWelcomeParser,
                             catcher?: IPromptCatcher,
                             debugLog?: LogType) {
        const shell = new SshShell(config, configResolver, welcomeParser, catcher, debugLog, "*");
        for (const command of commands) {
            if (debugLog) {
                debugLog(`start exec command: ${command}`);
            }
            const content = await shell.execCmd(command);
            if (debugLog) {
                debugLog(`end command: ${command}\r\ncontent:\r\n${content}`);
            }
        }
        shell.dispose();
        return true;
    }

});
