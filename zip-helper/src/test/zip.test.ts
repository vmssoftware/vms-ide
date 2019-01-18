import { ZipApi } from "../zip-api";
import assert = require("assert");
import { logConsoleFn } from "@vorfol/common";

suite("ZIP tests", function(this: Mocha.Suite) {

    this.timeout(0);

    this.beforeAll(async () => {
    });

    test("ZIP one", async () => {
        const zip = new ZipApi();
        const zipPromise = zip.start("h:/test1.zip", logConsoleFn);
        assert.notEqual(zipPromise, undefined, "Start failed");
        if (zipPromise) {
            const addCode = zip.addFile("h:/work/decrement.c", "c/decrement.c");
            assert.notEqual(addCode, false, "Add 1 failed");
            const addCode1 = zip.addFile("h:/work/increment.c", "c/increment.c");
            assert.notEqual(addCode1, false, "Add 1 failed");
            const addCode2 = zip.addFile("h:/work/include/increment.h", "h/increment.h");
            assert.notEqual(addCode2, false, "Add 2 failed");
            const addCode3 = zip.addFile("h:/work/increment.cpp", "cpp/increment.cpp");
            assert.notEqual(addCode3, false, "Add 1 failed");
            const stopCode = zip.stop();
            assert.notEqual(stopCode, false, "Stop failed");
            const endCode = await zipPromise;
            assert.notEqual(endCode, false, "Zip failed");
        }
    });

});
