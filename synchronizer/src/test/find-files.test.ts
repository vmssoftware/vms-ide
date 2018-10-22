import * as assert from "assert";

import { ConnectConfig } from "ssh2";
import { InputAttributes } from "ssh2-streams";
import { ContextPasswordFiller } from "../common/context-password-filler";
import { findFiles } from "../common/find-files";
import { LogType } from "../common/log-type";
import { IConnectConfigResolver } from "../config-resolve/connect-config-resolver";
import { ConnectConfigResolverImpl } from "../config-resolve/connect-config-resolver-impl";
import { SftpClient } from "../stream/sftp-client";
import { TestConfiguration } from "./config/config";

suite("SFTP directory tests", function(this: Mocha.Suite) {

    return;

    this.timeout(0);

    let debugLogFn: LogType | undefined;
    debugLogFn = undefined;
    // tslint:disable-next-line:no-console
    // debugLogFn = console.log;
    let configLocal: ConnectConfig;
    let configVms: ConnectConfig;
    let filler: ContextPasswordFiller;
    let resolver: IConnectConfigResolver;
    interface IFileTestData {
        file: string;
        fileDest: string;
        buffer: Buffer;
        expectPipe: boolean;
        expectCompare: boolean;
    }

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

    test(`set stat local`, async () => {
        const fileName = "current.txt";
        const src = new SftpClient(configLocal, resolver, debugLogFn, "*");
        const sec = Math.trunc((new Date()).valueOf() / 1000);
        const newTime: InputAttributes = {
            atime: sec,
            mtime: sec,
        };
        await src.setStat(fileName, newTime);
        const stat = await src.getStat(fileName);
        src.dispose();
        if (stat) {
            assert.equal(stat.mtime, newTime.mtime, "different mtime");
        }
        assert.ok(true, "ok");
    });

    test(`set stat vms`, async () => {
        const fileName = "current.txt";
        const src = new SftpClient(configVms, resolver, debugLogFn, "*");
        let stat = await src.getStat(fileName);
        if (stat) {
            const sec = Math.trunc((new Date()).valueOf() / 1000);
            stat.atime = sec;
            stat.mtime = sec;
            await src.setStat(fileName, stat);
            stat = await src.getStat(fileName);
            if (stat) {
                if (debugLogFn && stat.mtime !== sec) {
                    debugLogFn("different mtime");
                }
            }
        }
        src.dispose();
        assert.ok(true, "ok");
    });

    test(`get stat local`, async () => {
        const src = new SftpClient(configLocal, resolver, debugLogFn, "*");
        const stat = await src.getStat("DENIED.TXT");
        if (debugLogFn && stat) {
            debugLogFn(stat);
            debugLogFn(new Date(stat.mtime * 1000));
        }
        src.dispose();
        assert.ok(true, "ok");
    });

    test(`get stat VMS`, async () => {
        const src = new SftpClient(configVms, resolver, debugLogFn, "*");
        const stat = await src.getStat("DENIED.TXT");
        if (debugLogFn && stat) {
            debugLogFn(stat);
            debugLogFn(new Date(stat.mtime * 1000));
        }
        src.dispose();
        assert.ok(true, "ok");
    });

    test(`findFiles local`, async () => {
        const include = "**/*.{c,cpp,h},**/resource/**,**/*.mms";
        const exclude = "**/{out,bin},**/.vscode*";
        const src = new SftpClient(configLocal, resolver, debugLogFn, "*");
        const all = [];
        all.push(findFiles(src, "", include, exclude, debugLogFn).then((list) => {
            if (debugLogFn) {
                debugLogFn(list);
            }
        }));
        all.push(findFiles(src, "wrk", include, exclude, debugLogFn).then((list) => {
            if (debugLogFn) {
                debugLogFn(list);
            }
        }));
        all.push(findFiles(src, "invalid", include, exclude, debugLogFn).then((list) => {
            if (debugLogFn) {
                debugLogFn(list);
            }
        }));
        await Promise.all(all);
        src.dispose();
        assert.ok(true, "ok");
    });

    test(`findFiles vms`, async () => {
        const include = "**/*.{c,cpp,h},**/resource/**,**/*.mms";
        const exclude = "**/{out,bin},**/.vscode*";
        const src = new SftpClient(configVms, resolver, debugLogFn, "*");
        const all = [];
        all.push(findFiles(src, "", include, exclude, debugLogFn).then((list) => {
            if (debugLogFn) {
                debugLogFn(list);
            }
        }));
        all.push(findFiles(src, "wrk", include, exclude, debugLogFn).then((list) => {
            if (debugLogFn) {
                debugLogFn(list);
            }
        }));
        all.push(findFiles(src, "invalid", include, exclude, debugLogFn).then((list) => {
            if (debugLogFn) {
                debugLogFn(list);
            }
        }));
        await Promise.all(all);
        src.dispose();
        assert.ok(true, "ok");
    });

});
