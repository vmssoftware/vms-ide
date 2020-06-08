import * as assert from "assert";

import { SshHelper } from "../../ssh-helper/ssh-helper";

import { logConsoleFn, LogFunction, LogType } from "../../common/main";
import { GetSshHelperType } from "../../ext-api/ext-api";

suite("Directory tests", function(this: Mocha.Suite) {

    return;

    this.timeout(0);

    let debugLogFn: LogFunction | undefined;
    debugLogFn = logConsoleFn;

    let sshHelper: SshHelper;

    this.beforeAll(async () => {
        const sshHelperType = await GetSshHelperType();
        assert.notEqual(sshHelperType, undefined, `Cannot get ssh-helper api`);
        sshHelper = new sshHelperType!(debugLogFn);
    });

    test(`Read local "" dirname`, async () => {
        const sftp = await sshHelper.getTestSftp({host: "localhost", port: 22, username: "user", password: "pass"});
        assert.notEqual(sftp, undefined, "sftp must be defined");
        const files = await sftp!.readDirectory("");
        sftp!.dispose();
        assert.notEqual(files, undefined, "files must be defined");
        if (files) {
            assert.notEqual(files.length, 0, "files must not be empty");
        }
    });

    test(`Read local "WRK" dirname`, async () => {
        const sftp = await sshHelper.getTestSftp({host: "localhost", port: 22, username: "user", password: "pass"});
        assert.notEqual(sftp, undefined, "sftp must be defined");
        const files = await sftp!.readDirectory("WRK");
        sftp!.dispose();
        assert.notEqual(files, undefined, "files must be defined");
        if (files) {
            assert.notEqual(files.length, 0, "files must not be empty");
        }
    });

    test(`Read local "unexist" dirname`, async () => {
        const sftp = await sshHelper.getTestSftp({host: "localhost", port: 22, username: "user", password: "pass"});
        assert.notEqual(sftp, undefined, "sftp must be defined");
        const files = await sftp!.readDirectory("unexist");
        sftp!.dispose();
        assert.equal(files, undefined, "files must be defined");
    });

});
