import * as assert from "assert";
import { inspect } from "util";

import { logConsoleFn, LogFunction, LogType } from "../../common/main";

import { GetSshHelperType } from "../../ext-api/ext-api";
import { IInputAttributes } from "../../ssh-helper/api";
import { SshHelper } from "../../ssh-helper/ssh-helper";
import { findFiles } from "../common/find-files";
import { VmsSftpClient } from "../sync/vms-sftp-client";
import { Vms } from "./config/vms";

suite("SFTP directory tests", function(this: Mocha.Suite) {

    return;

    this.timeout(0);

    let debugLogFn: LogFunction | undefined;
    debugLogFn = logConsoleFn;

    interface IFileTestData {
        file: string;
        fileDest: string;
        buffer: Buffer;
        expectPipe: boolean;
        expectCompare: boolean;
    }
    let sshHelper: SshHelper;

    this.beforeAll(async () => {
        const sshHelperType = await GetSshHelperType();
        assert.notEqual(sshHelperType, undefined, `Cannot get ssh-helper api`);
        sshHelper = new sshHelperType!(debugLogFn);
    });

    test(`findFiles vms`, async () => {
        const include = "**/*.{c,cpp,h},**/resource/**,**/*.mms";
        const exclude = "**/out";
        const src = new VmsSftpClient(await sshHelper.getTestSftp(Vms));
        assert.notEqual(src, undefined, `Cannot get sftp`);
        const all = [];
        // all.push(findFiles(src!, "", include, exclude, debugLogFn).then((list) => {
        //     if (debugLogFn) {
        //         debugLogFn(LogType.debug, () => inspect(list));
        //     }
        // }));
        all.push(findFiles(src!, "test/shareable", include, exclude, debugLogFn).then((list) => {
            if (debugLogFn) {
                debugLogFn(LogType.debug, () => inspect(list));
            }
        }));
        // all.push(findFiles(src!, "invalid", include, exclude, debugLogFn).then((list) => {
        //     if (debugLogFn) {
        //         debugLogFn(LogType.debug, () => inspect(list));
        //     }
        // }));
        await Promise.all(all);
        src!.dispose();
        assert.ok(true, "ok");
    });

    return;

    test(`set stat local`, async () => {
        const fileName = "current.txt";
        const src = await sshHelper.getTestSftp({host: "localhost", port: 22, username: "user", password: "pass"});
        assert.notEqual(src, undefined, `Cannot get sftp`);
        const sec = Math.trunc((new Date()).valueOf() / 1000);
        const newTime: IInputAttributes = {
            atime: sec,
            mtime: sec,
        };
        await src!.setStat(fileName, newTime);
        const stat = await src!.getStat(fileName);
        src!.dispose();
        if (stat) {
            assert.equal(stat.mtime, newTime.mtime, "different mtime");
        }
        assert.ok(true, "ok");
    });

    test(`get stat local`, async () => {
        const src = await sshHelper.getTestSftp({host: "localhost", port: 22, username: "user", password: "pass"});
        assert.notEqual(src, undefined, `Cannot get sftp`);
        const stat = await src!.getStat("DENIED.TXT");
        if (debugLogFn && stat) {
            debugLogFn(LogType.debug, () => inspect(stat));
            debugLogFn(LogType.debug, () => String(new Date(stat.mtime * 1000)));
        }
        src!.dispose();
        assert.ok(true, "ok");
    });

    test(`findFiles local`, async () => {
        const include = "**/*.{c,cpp,h},**/resource/**,**/*.mms";
        const exclude = "**/{out,bin},**/.vscode*";
        const src = await sshHelper.getTestSftp({host: "localhost", port: 22, username: "user", password: "pass"});
        assert.notEqual(src, undefined, `Cannot get sftp`);
        const all = [];
        all.push(findFiles(src!, "", include, exclude, debugLogFn).then((list) => {
            if (debugLogFn) {
                debugLogFn(LogType.debug, () => inspect(list));
            }
        }));
        all.push(findFiles(src!, "wrk", include, exclude, debugLogFn).then((list) => {
            if (debugLogFn) {
                debugLogFn(LogType.debug, () => inspect(list));
            }
        }));
        all.push(findFiles(src!, "invalid", include, exclude, debugLogFn).then((list) => {
            if (debugLogFn) {
                debugLogFn(LogType.debug, () => inspect(list));
            }
        }));
        await Promise.all(all);
        src!.dispose();
        assert.ok(true, "ok");
    });

    test(`set stat vms`, async () => {
        const fileName = "current.txt";
        const src = await sshHelper.getTestSftp(Vms);
        assert.notEqual(src, undefined, `Cannot get sftp`);
        const sec = Math.trunc((new Date()).valueOf() / 1000);
        const newTime: IInputAttributes = {
            atime: sec,
            mtime: sec,
        };
        await src!.setStat(fileName, newTime);
        const stat = await src!.getStat(fileName);
        src!.dispose();
        if (stat) {
            assert.equal(stat.mtime, newTime.mtime, "different mtime");
        }
        assert.ok(true, "ok");
    });

    test(`get stat vms`, async () => {
        const src = await sshHelper.getTestSftp(Vms);
        assert.notEqual(src, undefined, `Cannot get sftp`);
        const stat = await src!.getStat("DENIED.TXT");
        if (debugLogFn && stat) {
            debugLogFn(LogType.debug, () => inspect(stat));
            debugLogFn(LogType.debug, () => String(new Date(stat.mtime * 1000)));
        }
        src!.dispose();
        assert.ok(true, "ok");
    });

});
