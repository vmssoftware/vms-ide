
import * as fs from "fs";
import { ANTLRInputStream, CommonTokenStream, BailErrorStrategy, DefaultErrorStrategy } from "antlr4ts";
import { cobolLexer } from "../vms_cobol/parser/cobolLexer";
import { cobolParser, Cobol_sourceContext } from "../vms_cobol/parser/cobolParser";
import { PredictionMode } from "antlr4ts/atn/PredictionMode";
import { ParseCancellationException } from "antlr4ts/misc";
import { getSyntaxTreeStrings } from "../common/print-syntax-tree";
import { CobolInputStream } from "../vms_cobol/parser/cobolInputStream";
import { CobolLexerErrorListener, CobolErrorListener } from "../vms_cobol/parser/CobolErrorListener";

suite("COBOL tests", function(this: Mocha.Suite) {

    this.timeout(0);


    this.beforeAll(async () => {
        // prepare
    });

    test("Test 1", async () => {

        let streamError = false;
        let streamErrorListener = {
            syntaxError: (line: number, charPositionInLine: number, message: string): void => {
                console.error(`${line}:${charPositionInLine} ${message}`);
                streamError = true;
            }
        };
        let sourceBuf = fs.readFileSync("D:/vmssoftware.work/vms-ide/src/vms_cobol/test/test.cob");
        let source = sourceBuf.toString();
        let input = new CobolInputStream(streamErrorListener, source, "ac");
        let lexer = new cobolLexer(input);
        let tokenStream = new CommonTokenStream(lexer);
        tokenStream.seek(0);
        let parser = new cobolParser(tokenStream);

        parser.errorHandler = new BailErrorStrategy();
        parser.interpreter.setPredictionMode(PredictionMode.SLL);

        let lexerErrors = new CobolLexerErrorListener(input);
        lexer.removeErrorListeners();
        lexer.addErrorListener(lexerErrors);

        let parserErrors = new CobolErrorListener(input);
        parser.removeErrorListeners();
        parser.addErrorListener(parserErrors);

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
                parser.interpreter.setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);
                tree = parser.cobol_source();
            } 
            else 
            {
                throw e;
            }
        }

        for (let error of lexerErrors.messages) {
            console.error(`${error.line}:${error.charPositionInLine} ${error.message}`);
        }

        for (let error of parserErrors.messages) {
            console.error(`${error.line}:${error.charPositionInLine}(${error.size}) ${error.message}`);
        }

        console.log(input.getFilteredSource());

        let str_tree = getSyntaxTreeStrings(parser, tree);
        for(let line of str_tree) {
            if (line && line.trim() && line.trim() !== "separator") {
                console.log(line);
            }
        }

    });

});
