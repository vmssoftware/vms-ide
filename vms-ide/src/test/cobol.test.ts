import * as assert from "assert";
import * as fs from "fs";
import { ANTLRInputStream, CommonTokenStream, BailErrorStrategy, DefaultErrorStrategy } from "antlr4ts";
import { cobolLexer } from "../vms_cobol/parser/cobolLexer";
import { cobolParser, Cobol_sourceContext } from "../vms_cobol/parser/cobolParser";
import { PredictionMode } from "antlr4ts/atn/PredictionMode";
import { ParseCancellationException } from "antlr4ts/misc";
import { getSyntaxTreeStrings } from "../common/print-syntax-tree";

suite("COBOL tests", function(this: Mocha.Suite) {

    this.timeout(0);


    this.beforeAll(async () => {
        // prepare
    });

    test("Test 1", async () => {
        let sourceBuf = fs.readFileSync("D:/vmssoftware.work/vms-ide/src/vms_cobol/test/test.cob");
        let source = sourceBuf.toString();
        let input = new ANTLRInputStream(source);
        let lexer = new cobolLexer(input);
        let tokenStream = new CommonTokenStream(lexer);
        tokenStream.seek(0);
        let parser = new cobolParser(tokenStream);

        parser.errorHandler = new BailErrorStrategy();
        parser.interpreter.setPredictionMode(PredictionMode.SLL);

        let tree: Cobol_sourceContext | undefined;

        try 
        {
            tree = parser.cobol_source();
        }
        catch (e) 
        {
            if (e instanceof ParseCancellationException) 
            {
                tokenStream.seek(0);
                parser.reset();
                parser.errorHandler = new DefaultErrorStrategy();
                parser.interpreter.setPredictionMode(PredictionMode.LL);
                tree = parser.cobol_source();
            } 
            else 
            {
                throw e;
            }
        }

        let str_tree = getSyntaxTreeStrings(parser, tree);
        for(let line of str_tree) {
            if (line) {
                console.log(line);
            }
        }

    });

});
