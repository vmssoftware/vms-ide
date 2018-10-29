import * as assert from "assert";

import { GetSshHelperFromApi } from "../config/get-ssh-helper";
import { SshHelper } from "../ssh/ssh-helper";

import { LogType } from "@vorfol/common";

suite("Directory tests", function(this: Mocha.Suite) {

    return;

    this.timeout(0);

    let debugLogFn: LogType | undefined;
    debugLogFn = undefined;
    // tslint:disable-next-line:no-console
    debugLogFn = console.log;

    let sshHelper: SshHelper;

    this.beforeAll(async () => {
        const sshHelperType = await GetSshHelperFromApi();
        assert.notEqual(sshHelperType, undefined, `Cannot get ssh-helper api`);
        sshHelper = new sshHelperType!(debugLogFn);
    });

    test(`Read local "" dirname`, async () => {
        const sftp = await sshHelper.getTestSftp("localhost", 22, "user", "pass");
        assert.notEqual(sftp, undefined, "sftp must be defined");
        const files = await sftp!.readDirectory("");
        sftp!.dispose();
        assert.notEqual(files, undefined, "files must be defined");
        if (files) {
            assert.notEqual(files.length, 0, "files must not be empty");
        }
    });

    test(`Read local "WRK" dirname`, async () => {
        const sftp = await sshHelper.getTestSftp("localhost", 22, "user", "pass");
        assert.notEqual(sftp, undefined, "sftp must be defined");
        const files = await sftp!.readDirectory("WRK");
        sftp!.dispose();
        assert.notEqual(files, undefined, "files must be defined");
        if (files) {
            assert.notEqual(files.length, 0, "files must not be empty");
        }
    });

    test(`Read local "unexist" dirname`, async () => {
        const sftp = await sshHelper.getTestSftp("localhost", 22, "user", "pass");
        assert.notEqual(sftp, undefined, "sftp must be defined");
        const files = await sftp!.readDirectory("unexist");
        sftp!.dispose();
        assert.equal(files, undefined, "files must be defined");
    });

});
