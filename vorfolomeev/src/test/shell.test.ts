import * as assert from "assert";
import { ConnectConfig } from "ssh2";
import { Delay } from "../common/delay";
import { Lock } from "../common/lock";
import { IConnectConfigResolver } from "../config-resolve/connect-config-resolver";
import { ConnectConfigResolverImpl, settingsCache } from "../config-resolve/connect-config-resolver-impl";
import { ICanParseWelcome } from "../stream/can-parse-welcome";
import { FakeReadStream } from "../stream/fake-read-stream";
import { FakeWriteStream } from "../stream/fake-write-stream";
import { ParseWelcomeBuru } from "../stream/parse-welcome-buru";
import { ParseWelcomeVms } from "../stream/parse-welcome-vms";
import { SftpShell } from "../stream/sftp-shell";
import { VmsPromptFindStream } from "../stream/vms-prompt-find-stream";
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
        const parserBuru = new ParseWelcomeBuru(0, logFn);

        // hard reset
        settingsCache.clear();

        assert.equal(
            await TestCreateShell(configLocal, resolver, parserBuru, logFn),
            true,
            "TestCreateShell");

        if (logFn) { logFn(`${"-".repeat(30)}`); }

        const parserVms = new ParseWelcomeVms(5000, logFn);
        assert.equal(
            await TestCreateVmsShell(configVms, resolver, parserVms, logFn),
            true,
            "TestCreateVmsShell");
    });

    async function TestCreateShell(configSrc: ConnectConfig,
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

    async function TestCreateVmsShell(configSrc: ConnectConfig,
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
                // "dir /full\r\n",
                // Buffer.from([3]),
            ];
            const promptCatcher = new VmsPromptFindStream(shell.prompt!);
            const promptCatchStream = await promptCatcher.createWriteStream("");
            channel.pipe(promptCatchStream);
            const wait = new Lock(true);
            channel.on("close", () => {
                wait.release();
            });
            let cmdIdx = 0;
            channel.write(commands[cmdIdx++]);
            promptCatchStream.on("ready", () => {
                if (log) { log(`ready to the next command`); }
                const answer = Buffer.concat(promptCatcher.chunks).toString("utf8");
                if (log) { log(answer); }
                promptCatcher.chunks = [];
                if (cmdIdx >= commands.length) {
                    if (log) { log(`all commands passed`); }
                    wait.release();
                } else {
                    channel.write(commands[cmdIdx++]);
                }
            });
            await wait.acquire();
            channel.end();
        }
        shell.dispose();
        return true;
    }

});
