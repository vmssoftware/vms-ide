import { Transform } from "stream";

import { Lock, LogFunction } from "@vorfol/common";
import { LogType } from "@vorfol/common";

import { IConnectConfigResolver, IConnectConfig } from "../api";
import { ConnectConfigResolverImpl, settingsCache } from "../config-resolve/connect-config-resolver-impl";
import { ContextPasswordFiller } from "../config-resolve/context-password-filler";
import { IParseWelcome } from "../api";
import { ParseWelcome } from "../stream/parse-welcome";
import { ParseWelcomeVms } from "../stream/parse-welcome-vms";
import { IPromptCatcher } from "../api";
import { PromptCatcher } from "../stream/prompt-catcher";
import { PromptCatcherVms } from "../stream/prompt-catcher-vms";
import { SshShell } from "../stream/ssh-shell";
import { TestConfiguration } from "./config/config";

suite("Shell transform tests", function(this: Mocha.Suite) {

    return;

    this.timeout(0);

    // const debugLogFn = undefined;
    let debugLogFn: LogFunction | undefined;
    debugLogFn = undefined;
    // tslint:disable-next-line:no-console
    debugLogFn = console.log;
    let configLocal: IConnectConfig;
    let configVms: IConnectConfig;
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
        "dir [...]",
        "sh time",
        "logout",
        "sh user /full",
        "sh sys",
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
        promptCatcher = new PromptCatcher("", 0, debugLogFn);
        parserVms = new ParseWelcomeVms(5000, debugLogFn);
        promptCatcherVms = new PromptCatcherVms("", 0, debugLogFn);
    });

    test("TestShell transform", async () => {
        const myExit = "my_own_exit";
        const done = new Lock(true);
        settingsCache.clear();
        const shell = new SshShell(configVms, resolver, parser, promptCatcher, debugLogFn, "*");
        const user = new Transform( {
            // tslint:disable-next-line:ban-types
            transform: (chunk: string | Buffer, encoding: string, callback: Function) => {
                let content = "";
                if (Buffer.isBuffer(chunk)) {
                    content = chunk.toString("utf8");
                } else if (typeof chunk === "string") {
                    content = chunk;
                }
                content = content.trim();
                if (content && debugLogFn) {
                    const lines = "> " + content.split("\n").map((s) => s.trim()).filter((s) => s).join("\r\n> ");
                    debugLogFn(LogType.debug, () => `${lines}`);
                }
                if (content.includes(myExit)) {
                    user.push("logout");
                    setImmediate(() => user.end());
                }
                callback();
            },
        } );
        user.on("end", () => {
            if (debugLogFn) {
                debugLogFn(LogType.debug, () => `end ok`);
            }
            done.release();
        });
        user.on("error", (err) => {
            if (debugLogFn) {
                debugLogFn(LogType.debug, () => `error: ${err}`);
            }
            done.release();
        });
        await shell.attachUser(user);
        for (const cmd of vmsCommands) {
            user.push(`${cmd}${SshShell.eol}`);
        }
        user.push(`${myExit}${SshShell.eol}`);
        await done.acquire();
        shell.detachUser();
        shell.dispose();
    });

});
