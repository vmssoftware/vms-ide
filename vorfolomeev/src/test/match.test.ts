import * as assert from "assert";

import { ConnectConfig } from "ssh2";
import { ContextPasswordFiller } from "../common/context-password-filler";
import { LogType } from "../common/log-type";
import { IConnectConfigResolver } from "../config-resolve/connect-config-resolver";
import { ConnectConfigResolverImpl } from "../config-resolve/connect-config-resolver-impl";
import { matchDir } from "../stream/find-files";
import { SftpClient } from "../stream/sftp-client";
import { TestConfiguration } from "./config/config";

suite("SFTP directory tests", function(this: Mocha.Suite) {

    this.timeout(0);

    let debugLogFn: LogType | undefined;
    debugLogFn = undefined;
    // tslint:disable-next-line:no-console
    debugLogFn = console.log;
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

    test(`matchDir local`, async () => {
        const include = "**/*.{c,cpp,h},**/resource/**,**/*.mms";
        const exclude = "**/{out,bin},**/.vscode*";
        const src = new SftpClient(configLocal, resolver, debugLogFn, "*");
        const all = [];
        all.push(matchDir(src, "", include, exclude, debugLogFn).then((list) => {
            if (debugLogFn) {
                debugLogFn(list);
            }
        }));
        all.push(matchDir(src, "wrk", include, exclude, debugLogFn).then((list) => {
            if (debugLogFn) {
                debugLogFn(list);
            }
        }));
        all.push(matchDir(src, "invalid", include, exclude, debugLogFn).then((list) => {
            if (debugLogFn) {
                debugLogFn(list);
            }
        }));
        await Promise.all(all);
        src.dispose();
        assert.ok(true, "ok");
    });

    test(`matchDir vms`, async () => {
        const include = "**/*.{c,cpp,h},**/resource/**,**/*.mms";
        const exclude = "**/{out,bin},**/.vscode*";
        const src = new SftpClient(configVms, resolver, debugLogFn, "*");
        const all = [];
        all.push(matchDir(src, "", include, exclude, debugLogFn).then((list) => {
            if (debugLogFn) {
                debugLogFn(list);
            }
        }));
        all.push(matchDir(src, "wrk", include, exclude, debugLogFn).then((list) => {
            if (debugLogFn) {
                debugLogFn(list);
            }
        }));
        all.push(matchDir(src, "invalid", include, exclude, debugLogFn).then((list) => {
            if (debugLogFn) {
                debugLogFn(list);
            }
        }));
        await Promise.all(all);
        src.dispose();
        assert.ok(true, "ok");
    });

});
