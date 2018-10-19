import * as assert from "assert";

import { ConnectConfig } from "ssh2";
import { ContextPasswordFiller } from "../common/context-password-filler";
import { LogType } from "../common/log-type";
import { IConnectConfigResolver } from "../config-resolve/connect-config-resolver";
import { ConnectConfigResolverImpl, settingsCache } from "../config-resolve/connect-config-resolver-impl";
import { SftpClient } from "../stream/sftp-client";
import { TestConfiguration } from "./config/config";

suite("Read directory tests", function(this: Mocha.Suite) {

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

    test(`Read Local "" dirname`, async () => {
        const sftp = new SftpClient(configLocal, resolver, debugLogFn, "*local*");
        assert.notEqual(sftp, undefined, "sftp must be defined");
        const files = await sftp.readDirectory("");
        sftp.dispose();
        assert.notEqual(files, undefined, "files must be defined");
        if (files) {
            assert.notEqual(files.length, 0, "files must not be empty");
        }
    });

    test(`Read Local "WRK" dirname`, async () => {
        const sftp = new SftpClient(configLocal, resolver, debugLogFn, "*local*");
        assert.notEqual(sftp, undefined, "sftp must be defined");
        const files = await sftp.readDirectory("WRK");
        sftp.dispose();
        assert.notEqual(files, undefined, "files must be defined");
        if (files) {
            assert.notEqual(files.length, 0, "files must not be empty");
        }
    });

    test(`Read Local "unexist" dirname`, async () => {
        const sftp = new SftpClient(configLocal, resolver, debugLogFn, "*local*");
        assert.notEqual(sftp, undefined, "sftp must be defined");
        const files = await sftp.readDirectory("unexist");
        sftp.dispose();
        assert.equal(files, undefined, "files must be defined");
    });

    test(`Read VMS "" dirname`, async () => {
        const sftp = new SftpClient(configVms, resolver, debugLogFn, "*vms*");
        assert.notEqual(sftp, undefined, "sftp must be defined");
        const files = await sftp.readDirectory("");
        sftp.dispose();
        assert.notEqual(files, undefined, "files must be defined");
        if (files) {
            assert.notEqual(files.length, 0, "files must not be empty");
        }
    });

    test(`Read VMS "WRK" dirname`, async () => {
        const sftp = new SftpClient(configVms, resolver, debugLogFn, "*local*");
        assert.notEqual(sftp, undefined, "sftp must be defined");
        const files = await sftp.readDirectory("WRK");
        sftp.dispose();
        assert.notEqual(files, undefined, "files must be defined");
        if (files) {
            assert.notEqual(files.length, 0, "files must not be empty");
        }
    });

    test(`Read VMS "unexist" dirname`, async () => {
        const sftp = new SftpClient(configVms, resolver, debugLogFn, "*local*");
        assert.notEqual(sftp, undefined, "sftp must be defined");
        const files = await sftp.readDirectory("unexist");
        sftp.dispose();
        assert.equal(files, undefined, "files must be defined");
    });

});
