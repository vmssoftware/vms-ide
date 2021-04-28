import * as assert from "assert";

import { logConsoleFn, LogFunction, LogType } from "../../common/main";

import { inspect } from "util";
import { parseVmsOutput } from "../common/parse-output";
import { VmsPathConverter } from "../vms/vms-path-converter";

suite("Source tests", function(this: Mocha.Suite) {

    return;

    this.timeout(0);

    let debugLogFn: LogFunction | undefined;
    debugLogFn = logConsoleFn;

    const output =
`
    for (int i = 0; i < 10; ++j) {
..............................^
%CXX-E-UNDECLARED, identifier "j" is undefined
at line number 9 in file WORK:[VORFOLOMEEV.WORK]main.cpp;6

%CXX-I-MESSAGE, 1 error detected in the compilation of "WORK:[VORFOLOMEEV.WORK]main.cpp;6".
%MMS-F-ABORT, For target [.OUT.DEBUG.OBJ]MAIN.OBJ, CLI returned abort status: %X15F61262.

`;
    test("Test p1", async () => {
        const c1 = VmsPathConverter.fromVms("[.a.b]c.d");
        const c2 = VmsPathConverter.fromVms("[a.b]c.d");
        const result = parseVmsOutput(output.split(/[\r?|\r\n]/));
        if (debugLogFn) {
            debugLogFn(LogType.debug, () => inspect(result));
        }
        assert.ok(true, "ok");
    });

});
