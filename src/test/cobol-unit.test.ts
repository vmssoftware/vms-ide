import * as assert from "assert";
import * as vscode from "vscode";
import { CobolAnalisisHelper } from "../vms_cobol/context/CobolAnalisisHelpers";

suite("COBOL UNIT tests", function(this: Mocha.Suite) {

    this.timeout(0);

    this.beforeAll(async () => {
    });

    /***************************************************************************************/
    /***************************************************************************************/
    /***************************************************************************************/

    test("literal", async() => {

        assert.equal("", CobolAnalisisHelper.stringLiteralContent(""));
        assert.equal("abc", CobolAnalisisHelper.stringLiteralContent("abc"));
        assert.equal("nabc", CobolAnalisisHelper.stringLiteralContent("nabc"));
        assert.equal("Nabc", CobolAnalisisHelper.stringLiteralContent("Nabc"));
        assert.equal("abc", CobolAnalisisHelper.stringLiteralContent("\"abc\""));
        assert.equal("abc", CobolAnalisisHelper.stringLiteralContent("'abc'"));
        assert.equal("abc", CobolAnalisisHelper.stringLiteralContent("n'abc'"));
        assert.equal("abc", CobolAnalisisHelper.stringLiteralContent("N'abc'"));
        assert.equal("abc", CobolAnalisisHelper.stringLiteralContent("N\"abc\""));
        assert.equal("abc", CobolAnalisisHelper.stringLiteralContent("\"abc"));
        assert.equal("abc'", CobolAnalisisHelper.stringLiteralContent("\"abc'"));
        assert.equal("abc", CobolAnalisisHelper.stringLiteralContent("'abc"));
        assert.equal("abc\"", CobolAnalisisHelper.stringLiteralContent("N'abc\""));
        assert.equal("abc", CobolAnalisisHelper.stringLiteralContent("N\"abc"));
        assert.equal("abc'", CobolAnalisisHelper.stringLiteralContent("\"abc'"));
        assert.equal("abc", CobolAnalisisHelper.stringLiteralContent("n'abc"));
        assert.equal("abc\"", CobolAnalisisHelper.stringLiteralContent("n'abc\""));
    });

});
