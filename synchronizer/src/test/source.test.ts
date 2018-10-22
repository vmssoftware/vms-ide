import * as assert from "assert";
import { ConnectConfig } from "ssh2";
import { ContextPasswordFiller } from "../common/context-password-filler";
import { LogType } from "../common/log-type";
import { IConnectConfigResolver } from "../config-resolve/connect-config-resolver";
import { ConnectConfigResolverImpl, settingsCache } from "../config-resolve/connect-config-resolver-impl";
import { FakeWriteStream } from "../stream/fake-write-stream";
import { ParseWelcomeVms } from "../stream/parse-welcome-vms";
import { PipeFile } from "../stream/pipe";
import { PromptCatcherDefault } from "../stream/prompt-catcher-default";
import { PromptCatcherVms } from "../stream/prompt-catcher-vms";
import { SftpClient } from "../stream/sftp-client";
import { SshShell } from "../stream/ssh-shell";
import { FsSource } from "../sync/fs-source";
import { SftpSource } from "../sync/sftp-source";
import { ISource } from "../sync/source";
import { VmsSource } from "../sync/vms-source";
import { TestConfiguration } from "./config/config";

suite("Source tests", function(this: Mocha.Suite) {

    this.timeout(0);

    let debugLogFn: LogType | undefined;
    debugLogFn = undefined;
    // tslint:disable-next-line:no-console
    debugLogFn = console.log;
    let configLocal: ConnectConfig;
    let configVms: ConnectConfig;
    let filler: ContextPasswordFiller;
    let resolver: IConnectConfigResolver;
    const include = "**/*.{c,cpp,h},**/resource/**,**/*.mms";
    const exclude = "**/{out,bin},**/.vscode*";

    // prepare resolver
    this.beforeAll(async () => {
        // get configs with passwords
        configLocal = await TestConfiguration(true);
        configVms = await TestConfiguration(false);
        // prepare filler based on passwords from configs
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
        // remove passwords
        delete configLocal.password;
        delete configVms.password;
        resolver = new ConnectConfigResolverImpl([filler]);
    });

    test("Walk files SFTP VMS", async () => {
        const sftp = new SftpClient(configVms, resolver, debugLogFn, "*src*");
        const promptCatcher = new PromptCatcherVms("", debugLogFn);
        const parserVms = new ParseWelcomeVms(undefined, debugLogFn);
        const shell = new SshShell(configVms, resolver, parserVms, promptCatcher, debugLogFn, "*src*");
        const source: ISource = new VmsSource(sftp, shell, "wrk", debugLogFn);
        await WalkFiles(source, debugLogFn);
        sftp.dispose();
        shell.dispose();
        assert.ok(true, "must be true");
    });

    test("Walk files FS", async () => {
        const source: ISource = new FsSource("c:/ftp_root/wrk", debugLogFn);
        await WalkFiles(source, debugLogFn);
        assert.ok(true, "must be true");
    });

    test("Walk files SFTP local", async () => {
        const sftp = new SftpClient(configLocal, resolver, debugLogFn, "*src*");
        const source: ISource = new SftpSource(sftp, "wrk", debugLogFn);
        await WalkFiles(source, debugLogFn);
        sftp.dispose();
        assert.ok(true, "must be true");
    });

    async function WalkFiles(source: ISource, debugLog?: LogType) {
        const list = await source.findFiles(include, exclude);
        const all = [];
        for (const file of list) {
            all.push(Promise.resolve().then(async () => {
                if (debugLogFn) {
                    debugLogFn(`${file.filename} ${file.date}`);
                }
                assert.equal(file.isDirectory, false, `No directories allowed ${file.filename}`);
                const date = await source.getDate(file.filename);
                assert.notEqual(date, undefined, `Date must be given ${file.filename}`);
                if (date) {
                    let diff = Math.abs(date.valueOf() - file.date.valueOf());
                    assert.equal(diff < 1000, true, `Dates must be almost equal ${date} <> ${file.date}`);
                    const newDate = new Date(date.valueOf() - 60000);
                    const setted = await source.setDate(file.filename, newDate);
                    assert.equal(setted, true, `Date must be setted ${file.filename}`);
                    const newGotDate = await source.getDate(file.filename);
                    assert.notEqual(newGotDate, undefined, `Date must be given ${file.filename}`);
                    if (newGotDate) {
                        diff = Math.abs(newGotDate.valueOf() - newDate.valueOf());
                        assert.equal(diff < 1000, true,
                            `New date must be almost equal previous ${newGotDate} <> ${newDate} ${file.filename}`);
                    }
                }
                const fake = new FakeWriteStream(false, debugLogFn);
                const result = await PipeFile(source, fake, file.filename, "*", debugLogFn);
                assert.equal(result, true, "Must be pipeable");
            }));
        }
        await Promise.all(all);
    }

});
