import * as assert from "assert";
import { ConnectConfig } from "ssh2";
import { Delay } from "../common/delay";
import { Lock } from "../common/lock";
import { IConnectConfigResolver } from "../config-resolve/connect-config-resolver";
import { ConnectConfigResolverImpl, settingsCache } from "../config-resolve/connect-config-resolver-impl";
import { ICanParseWelcome } from "../stream/can-parse-welcome";
import { FakeReadStream } from "../stream/fake-read-stream";
import { FakeWriteStream } from "../stream/fake-write-stream";
import { ParseWelcome } from "../stream/parse-welcome";
import { ParseWelcomeVms } from "../stream/parse-welcome-vms";
import { PromptedStreamCatcher } from "../stream/prompted-stream-catcher";
import { SftpShell } from "../stream/sftp-shell";
import { TestConfiguration } from "./config/config";
import { ContextPasswordFiller } from "./context-password-filler";

type LogType = (message?: any, ...optionalParams: any[]) => void;

suite("Shell tests", function(this: Mocha.Suite) {

    this.timeout(0);

    // tslint:disable-next-line:no-console
    const logFn = console.log;

    test("TestCreateShell with resolver with correct context filler", async () => {

        const configLocal = await TestConfiguration(true);
        const configVms = await TestConfiguration(false);

        const filler = new ContextPasswordFiller([
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

        const resolver = new ConnectConfigResolverImpl([filler]);
        const parser = new ParseWelcome(0, logFn);

        // hard reset
        settingsCache.clear();

        assert.equal(
            await TestCreateShellWithAutoPipe(configLocal, resolver, parser, logFn),
            true,
            "TestCreateShellWithAutoPipe local");

        if (logFn) { logFn(`${"-".repeat(30)}`); }

        assert.equal(
            await TestCreateShellWithPromptCatcher(configLocal, resolver, parser, logFn),
            true,
            "TestCreateShellWithPromptCatcher local prompt-catch");

        if (logFn) { logFn(`${"-".repeat(30)}`); }

        assert.equal(
                await TestCreateShellWithPromptCatcher(configVms, resolver, parser, logFn),
                true,
                "TestCreateShellWithPromptCatcher vms prompt-catch");

        if (logFn) { logFn(`${"-".repeat(30)}`); }

        const parserVms = new ParseWelcomeVms(5000, logFn);
        assert.equal(
                    await TestCreateShellWithPromptCatcher(configVms, resolver, parserVms, logFn),
                    true,
                    "TestCreateShellWithPromptCatcher vms vms-catch");
                });

    async function TestCreateShellWithAutoPipe(configSrc: ConnectConfig,
                                               resolver?: IConnectConfigResolver,
                                               parser?: ICanParseWelcome,
                                               log?: LogType) {
        const shell = new SftpShell(configSrc, resolver, parser, log);
        const channel = await shell.createClientChannel();
        if (channel) {
            const srcData = [
                "dir\r\n",
                "sh time\r\n",
            ];
            const src = new FakeReadStream(srcData, log);
            const dst = new FakeWriteStream(undefined, log);
            const sourceStream = await src.createReadStream("");
            const destStream = await dst.createWriteStream("");
            sourceStream.pipe(channel).pipe(destStream);
            const wait = new Lock(true);
            channel.on("close", () => {
                wait.release();
            });
            await wait.acquire();
            const answer = Buffer.concat(dst.chunks).toString("utf8");
            if (log) { log(answer); }
            channel.end();
        }
        shell.dispose();
        return true;
    }

    async function TestCreateShellWithPromptCatcher(configSrc: ConnectConfig,
                                                    resolver?: IConnectConfigResolver,
                                                    parser?: ICanParseWelcome,
                                                    log?: LogType) {
        const shell = new SftpShell(configSrc, resolver, parser, log);
        const channel = await shell.createClientChannel();
        if (channel) {
            assert.ok(shell.prompt, "No prompt found");
            const commands = [
                "dir\r\n",
                "sh time\r\n",
                "dir /full\r\n",
            ];
            const promptCatcher = new PromptedStreamCatcher(shell.prompt!);
            const promptCatchStream = await promptCatcher.createWriteStream("");
            channel.pipe(promptCatchStream);
            for (const command of commands) {
                channel.write(command);
                const waitReady = new Lock(true);
                const commandCatch = (content: string) => {
                    // skip garbage from previuos commands
                    if (content.startsWith(command)) {
                        if (log) { log(`ready to the next command`); }
                        if (typeof content === "string") {
                            if (log) {
                                log(`command: ${command}\r\ncontent:\r\n${content}`);
                            }
                        }
                        promptCatcher.content = "";
                        waitReady.release();
                        promptCatchStream.removeListener(promptCatcher.readyEvent, commandCatch);
                    }
                };
                promptCatchStream.on(promptCatcher.readyEvent, commandCatch);
                await waitReady.acquire();
            }
            channel.end();
        }
        shell.dispose();
        return true;
    }

});
