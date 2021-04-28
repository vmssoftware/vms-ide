import * as assert from "assert";
import { test_enclosing_quotes } from "../common/quotes";

suite("Quotes tests", function(this: Mocha.Suite) {

    this.timeout(0);

    this.beforeAll(async () => {
        // prepare
    });

    test("Quotes test", async () => {
        let test_strs = [
            { str: '"abcd"', enclosed: true },
            { str: '"abcd', enclosed: false },
            { str: '"ab\\"cd', enclosed: false },
            { str: '"ab\\"cd"', enclosed: true },
            { str: '"ab\\"', enclosed: false },
            { str: '"ab\\\\"', enclosed: true },
        ];
        for(let test_str of test_strs) {
            assert.equal(test_enclosing_quotes(test_str.str).enclosed, test_str.enclosed, test_str.str);
        }
    });

});
