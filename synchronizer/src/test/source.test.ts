import * as assert from "assert";

import { logConsoleFn, LogFunction, LogType, MemoryWriteStream } from "@vorfol/common";
import { GetSshHelperType } from "../config/get-ssh-helper";
import { SshHelper } from "../ext-api/ssh-helper";
import { FsSource } from "../sync/fs-source";
import { ISource } from "../sync/source";
import { VmsSource } from "../sync/vms-source";
import { Vms } from "./config/vms";

suite("Source tests", function(this: Mocha.Suite) {

    // return;

    this.timeout(0);

    let debugLogFn: LogFunction | undefined;
    debugLogFn = logConsoleFn;

    const include = "**/*.{c,cpp,h},**/resource/**,**/*.mms";
    const exclude = "**/{out,bin},**/.vscode*";

    let sshHelper: SshHelper;

    // prepare resolver
    this.beforeAll(async () => {
        const sshHelperType = await GetSshHelperType();
        assert.notEqual(sshHelperType, undefined, `Cannot get ssh-helper api`);
        sshHelper = new sshHelperType!(debugLogFn);
    });

    test("Walk files SFTP VMS", async () => {
        const sftp = await sshHelper.getTestSftp(Vms.host, Vms.port, Vms.username, Vms.password);
        assert.notEqual(sftp, undefined, `Cannot get sftp`);
        const shell = await sshHelper.getTestShell(Vms.host, Vms.port, Vms.username, Vms.password, true);
        assert.notEqual(shell, undefined, `Cannot get shell`);
        const source: ISource = new VmsSource(sftp!, shell!, "wrk", debugLogFn);
        await WalkFiles(source, debugLogFn);
        sftp!.dispose();
        shell!.dispose();
        assert.ok(true, "must be true");
    });

    test("Walk files FS", async () => {
        const source: ISource = new FsSource("c:/ftp_root/wrk", debugLogFn);
        await WalkFiles(source, debugLogFn);
        assert.ok(true, "must be true");
    });

    async function WalkFiles(source: ISource, debugLog?: LogFunction) {
        const list = await source.findFiles(include, exclude);
        const all = [];
        for (const file of list) {
            all.push(Promise.resolve().then(async () => {
                if (debugLogFn) {
                    debugLogFn(LogType.debug, () => `${file.filename} ${file.date}`);
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
                const memoryStream = sshHelper.memStream();
                const result = await sshHelper.pipeFile(source, memoryStream, file.filename, "", debugLogFn);
                assert.equal(result, true, "Must be pipeable");
            }));
        }
        await Promise.all(all);
    }

});
