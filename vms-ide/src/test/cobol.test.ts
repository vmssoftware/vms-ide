import * as assert from "assert";
import * as fs from "fs";
import * as vscode from "vscode";
import { CommonTokenStream, BailErrorStrategy, DefaultErrorStrategy, ANTLRInputStream } from "antlr4ts";
import { cobolLexer } from "../vms_cobol/parser/cobolLexer";
import { cobolParser, Cobol_sourceContext } from "../vms_cobol/parser/cobolParser";
import { PredictionMode } from "antlr4ts/atn/PredictionMode";
import { ParseCancellationException } from "antlr4ts/misc";
import { getSyntaxTreeStrings } from "../common/print-syntax-tree";
import { CobolInputStream, ICopyManager } from "../vms_cobol/stream/cobolInputStream";
import { IDiagnosticEntry, EDiagnosticType } from "../common/parser/Facade";
import { cobolCopyLexer } from "../vms_cobol/parser/cobolCopyLexer";
import { cobolCopyParser, CopyStatementContext } from "../vms_cobol/parser/cobolCopyParser";
import { LexerErrorListener, ParserErrorListener } from "../common/parser/ErrorListeners";
import { CopyManagerImpl } from "../vms_cobol/stream/copymanager";

suite("COBOL tests", function(this: Mocha.Suite) {

    this.timeout(0);

    let errors: IDiagnosticEntry[] = [];
    let errorListener = {
        syntaxError: (file: string, line: number, charPositionInLine: number, message: string): void => {
            errors.push({
                source: file,
                message,
                type: EDiagnosticType.Error,
                range: {
                    start: {
                        row: line,
                        col: charPositionInLine,
                    },
                    end: {
                        row: line,
                        col: charPositionInLine,
                    }
                }
            });
        }
    }

    let parseStream = (input: CobolInputStream): Cobol_sourceContext | undefined => {
        let lexer = new cobolLexer(input);
        let tokenStream = new CommonTokenStream(lexer);
        tokenStream.seek(0);
        let parser = new cobolParser(tokenStream);

        parser.errorHandler = new BailErrorStrategy();
        parser.interpreter.setPredictionMode(PredictionMode.SLL);

        let lexerErrors = new LexerErrorListener(errors);
        lexer.removeErrorListeners();
        lexer.addErrorListener(lexerErrors);

        let parserErrors = new ParserErrorListener(errors);
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

        return tree;
    };

    let parseCopyStream = (source: string): CopyStatementContext | undefined => {
        let input = new ANTLRInputStream(source + "\n");
        let lexer = new cobolCopyLexer(input);
        let tokenStream = new CommonTokenStream(lexer);
        tokenStream.seek(0);
        let parser = new cobolCopyParser(tokenStream);

        parser.errorHandler = new BailErrorStrategy();
        parser.interpreter.setPredictionMode(PredictionMode.SLL);

        lexer.removeErrorListeners();
        lexer.addErrorListener(new LexerErrorListener(errors));

        parser.removeErrorListeners();
        parser.addErrorListener(new ParserErrorListener(errors));

        let tree: CopyStatementContext | undefined;

        try 
        {
            tree = parser.copyStatement();
        }
        catch (e) 
        {
            if (e instanceof ParseCancellationException) 
            {
                tokenStream.seek(0);
                parser.reset();
                parser.errorHandler = new DefaultErrorStrategy();
                parser.interpreter.setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);
                tree = parser.copyStatement();
            } 
            else 
            {
                throw e;
            }
        }

        return tree;
    };

    let testSrcToRst = (input: CobolInputStream, srcRow: number, srcCol: number, rstRow: number, rstCol: number) => {
        let resPos = input.resultRowColFromSourceRowCol(srcRow, srcCol);
        if (resPos.resultRow != rstRow || resPos.resultCol != rstCol) {
            assert.fail(`(${srcRow}:${srcCol}) must point to (${rstRow}:${rstCol}), but we see (${resPos.resultRow}:${resPos.resultCol})`);
        }
    };

    let testRstToSrc = (input: CobolInputStream, rstRow: number, rstCol: number, srcRow: number, srcCol: number) => {
        let resPos = input.sourceRowColFromResultRowCol(rstRow, rstCol);
        if (resPos.sourceRow != srcRow || resPos.sourceCol != srcCol) {
            assert.fail(`(${rstRow}:${rstCol}) must be pointed from (${srcRow}:${srcCol}), but we see (${resPos.sourceRow}:${resPos.sourceCol})`);
        }
    };

    this.beforeAll(async () => {
    });

    /***************************************************************************************/
    /***************************************************************************************/
    /***************************************************************************************/

    test("copy parser 1", async() => {
        let item_def = `    01 ITEM PIC XXXX.`
        let source = `
some "thing" 123.
copy "ITEM-DEF".`;

        errors = [];
        let tree = parseCopyStream(source);
        for(let error of errors) {
            assert.fail(error.message);
        }
        if (!tree) {
            assert.fail("tree = undefined")
        } else {
            if (tree.lastCopyStatement().text.trim() !== `copy"ITEM-DEF".`) {
                assert.fail("not the same");
            }
        }
    });

    /***************************************************************************************/
    test("copy parser 2", async() => {
        let item_def = `    01 ITEM PIC XXXX.`
        let source = `
copy AAA in BBB.
some "thing" 123.`;

        errors = [];
        let tree = parseCopyStream(source);
        if (errors.length === 0) {
            assert.fail("Must be error");
        }
    });

    /***************************************************************************************/
    test("copy parser 3", async() => {
        let item_def = `    01 ITEM PIC XXXX.`
        let source = `
        copy AAA.
        some "thing" 123.
        copy ITEM-DEF in ITEM-LIB.
        `;

        errors = [];
        let tree = parseCopyStream(source);
        if (!tree) {
            assert.fail("tree = undefined")
        } else {
            if (tree.lastCopyStatement().text.trim() !== `copyITEM-DEFinITEM-LIB.`) {
                assert.fail("not the same");
            }
        }
    });

    /***************************************************************************************/
    test("copy parser 4", async() => {
        let item_def = `    01 ITEM PIC XXXX.`
        let source = `
        some "thing" 123.
        copy AAA.
        copy ITEM-DEF in ITEM-LIB
replacing ==a== by ==b b b==
    "A A" by BBB.
`;

        errors = [];
        let tree = parseCopyStream(source);
        if (!tree) {
            assert.fail("tree = undefined")
        } else {
            if (tree.lastCopyStatement().text.trim() !== `copyITEM-DEFinITEM-LIBreplacing==a==by==b b b=="A A"byBBB.`) {
                assert.fail("not the same");
            }
        }
    });

    /***************************************************************************************/
    /***************************************************************************************/

    test("copy with mock manager", async() => {

        let item_def = `    01 ITEM PIC XXXX.`
        let source = `
IDENTIFICATION DIVISION.
PROGRAM-ID. id-1.
DATA DIVISION.
WORKING-STOR

-	AGE SECTION.
  cop
-	  y "ITEM-D
-		"EF".
    01 RSULT comp-2.
PROCEDURE DIVISION.
end PROGRAM id-1.`;

        let copyManager: ICopyManager = {
            getLines(name: string) {
                return [item_def];
            },
            getSourcePath(name: string): string | undefined {
                return undefined;
            }
        }

        errors = [];
        let input = new CobolInputStream("", errorListener, source + "\n", "a", copyManager);
        let result = input.getFilteredSource();
        parseStream(input);
        for(let error of errors) {
            assert.fail(error.message);
        }

        let target = `IDENTIFICATION DIVISION.
PROGRAM-ID. id-1.
DATA DIVISION.
WORKING-STORAGE SECTION.
    01 ITEM PIC XXXX.
    01 RSULT comp-2.
PROCEDURE DIVISION.
end PROGRAM id-1.`;

        if (result !== target + "\n") {
            assert.fail("invalid result");
        }

        let resPos = input.sourceRowColFromResultRowCol(4, 7);
        if (resPos.sourceRow !== 7 || resPos.sourceCol !== 2) {
            assert.fail("(4:7) isn't (7:2)");
        }
        if (resPos.inside.length !== 1) {
            assert.fail("(4:7) isn't inside");
        }
        if (resPos.inside[0].row !== 0 || resPos.inside[0].col !== 7) {
            assert.fail("(4:7) isn't (0:7) inside ITEM-DEF");
        }

    });

    /***************************************************************************************/

    test("copy with manager", async() => {

        let source = `
IDENTIFICATION DIVISION.
PROGRAM-ID. id-1.
DATA DIVISION.
WORKING-STOR

-	AGE SECTION.
  cop
-	  y "[.libs]item-
-		"def".
    01 RSULT comp-2.
PROCEDURE DIVISION.
end PROGRAM id-1.`;

        let copyManager: ICopyManager | undefined;
        if (vscode.workspace.workspaceFolders && vscode.workspace.workspaceFolders.length > 0) {
            copyManager = new CopyManagerImpl(vscode.workspace.workspaceFolders[0].uri.fsPath);
        }
        errors = [];
        let input = new CobolInputStream("", errorListener, source + "\n", "a", copyManager);
        let result = input.getFilteredSource();
        parseStream(input);
        for(let error of errors) {
            assert.fail(error.message);
        }

        let target = `IDENTIFICATION DIVISION.
PROGRAM-ID. id-1.
DATA DIVISION.
WORKING-STORAGE SECTION.
    01 ITEEM PIC XXXX.
    01 item-def usage comp-1.
    01 RSULT comp-2.
PROCEDURE DIVISION.
end PROGRAM id-1.`;

        if (result !== target + "\n") {
            assert.fail("invalid result");
        }

        let resPos = input.sourceRowColFromResultRowCol(4, 13);
        if (resPos.sourceRow !== 7 || resPos.sourceCol !== 2) {
            assert.fail("(4:12) isn't (7:2)");
        }
        if (resPos.inside.length !== 1) {
            assert.fail("(4:7) isn't inside");
        }
        if (resPos.inside[0].row !== 3 || resPos.inside[0].col !== 10) {
            assert.fail("(4:7) isn't (3:10) inside ITEM-DEF");
        }
    });

    /***************************************************************************************/
    /***************************************************************************************/
    /***************************************************************************************/

    test("complex test", async() => {
        let source = `
IDENTIFICATION DIVISION.
PROGRAM-ID. id-1.
DATA DIVISION.
WORKING-STORAGE SECTION.
    01 ITEM-SHOW-out PIC XXXX.
    01 RSULT comp-2.
PROCEDURE DIVISION.
para-1.
    dis    
**************
-        play 'level_out: copy 

* comment

-	'space' space ITEM-SHOW-out.
	move .85 to RSU                 
*    asadsasd
*
-      LT.
    COMPUTE RSULT = FUNCTION ACOS (RSULT).
end PROGRAM id-1.`;

        errors = [];
        let input = new CobolInputStream("", errorListener, source + "\n", "");
        let result = input.getFilteredSource();
        parseStream(input);
        for(let error of errors) {
            assert.fail(error.message);
        }

        let target = `IDENTIFICATION DIVISION.
PROGRAM-ID. id-1.
DATA DIVISION.
WORKING-STORAGE SECTION.
    01 ITEM-SHOW-out PIC XXXX.
    01 RSULT comp-2.
PROCEDURE DIVISION.
para-1.
    display 'level_out: copy space' space ITEM-SHOW-out.
    move .85 to RSULT.
    COMPUTE RSULT = FUNCTION ACOS (RSULT).
end PROGRAM id-1.`;

        if (result !== target + "\n") {
            assert.fail("invalid result");
        }

        // 17:10 => 9:19, from comment 'asads(*)asd' in source to RSU(*)LT in result
        testSrcToRst(input, 17, 10, 9, 19);

        // 8:30 <= 15:4, from s(*)pace in result to s(*)pace in source (in string literal)
        testRstToSrc(input, 8, 30, 15, 4);

        // 10:29 <= 20:29, from (*)ACOS in result to (*)ACOS in source
        testRstToSrc(input, 10, 29, 20, 29);

        // 8:29 <= 15:3, from (*)space in result to (*)space in source (in string literal)
        testRstToSrc(input, 8, 29, 15, 3);

    });

    /***************************************************************************************/

    test("condition compile", async() => {
        let source = `
IDENTIFICATION DIVISION.
PROGRAM-ID. id-1.
\\ADATA DIVISION.
WORKING-STORAGE SECTION.
\\B    01 ITEM-SHOW-out PIC XXXX.
\\a    01 RSULT comp-2.
PROCEDURE DIVISION.
end PROGRAM id-1.`;

        errors = [];
        let input = new CobolInputStream("", errorListener, source + "\n", "a");
        let result = input.getFilteredSource();
        parseStream(input);
        for(let error of errors) {
            assert.fail(error.message);
        }

        let target = `IDENTIFICATION DIVISION.
PROGRAM-ID. id-1.
DATA DIVISION.
WORKING-STORAGE SECTION.
    01 RSULT comp-2.
PROCEDURE DIVISION.
end PROGRAM id-1.`;

        if (result !== target + "\n") {
            assert.fail("invalid result");
        }
    });

    /***************************************************************************************/

    test("continuation opened string and no quota at the start of next line", async() => {
        let source = `
IDENTIFICATION DIVISION.
PROGRAM-ID. id-1.
PROCEDURE DIVISION.
para-1.
    DISPLAY "all
-    oha".
end PROGRAM id-1.`;

        errors = [];
        let input = new CobolInputStream("", errorListener, source + "\n", "");
        let result = input.getFilteredSource();
        if (errors.length !== 1) {
            assert.fail("Must be ONE continuation error");
        }
    });

    /***************************************************************************************/

    test("continuation opened string with quota at the start of next line", async() => {
        let source = `
IDENTIFICATION DIVISION.
PROGRAM-ID. id-1.
PROCEDURE DIVISION.
para-1.
    DISPLAY "all
-    "oha".
end PROGRAM id-1.`;

        errors = [];
        let input = new CobolInputStream("", errorListener, source + "\n", "");
        let result = input.getFilteredSource();
        parseStream(input);
        for(let error of errors) {
            assert.fail(error.message);
        }

        let target = `IDENTIFICATION DIVISION.
PROGRAM-ID. id-1.
PROCEDURE DIVISION.
para-1.
    DISPLAY "alloha".
end PROGRAM id-1.`;

        if (result !== target + "\n") {
            assert.fail("invalid result");
        }
    });

    /***************************************************************************************/

    test("continuation closed string with spaces at the end and quota at the start of next line", async() => {
        let source = `
IDENTIFICATION DIVISION.
PROGRAM-ID. id-1.
PROCEDURE DIVISION.
para-1.
    DISPLAY "all" 
-    "oha".
end PROGRAM id-1.`;

        errors = [];
        let input = new CobolInputStream("", errorListener, source + "\n", "");
        let result = input.getFilteredSource();
        parseStream(input);
        for(let error of errors) {
            assert.fail(error.message);
        }

        let target = `IDENTIFICATION DIVISION.
PROGRAM-ID. id-1.
PROCEDURE DIVISION.
para-1.
    DISPLAY "all""oha".
end PROGRAM id-1.`;
        if (result !== target + "\n") {
            assert.fail("invalid result");
        }
    });

    /***************************************************************************************/

    test("continuation closed string without spaces at the end and quota at the start of next line", async() => {
        let source = `
IDENTIFICATION DIVISION.
PROGRAM-ID. id-1.
PROCEDURE DIVISION.
para-1.
    DISPLAY "all"
-    " ITEM.
end PROGRAM id-1.`;

        errors = [];
        let input = new CobolInputStream("", errorListener, source + "\n", "");
        let result = input.getFilteredSource();
        parseStream(input);
        for(let error of errors) {
            assert.fail(error.message);
        }

        let target = `IDENTIFICATION DIVISION.
PROGRAM-ID. id-1.
PROCEDURE DIVISION.
para-1.
    DISPLAY "all" ITEM.
end PROGRAM id-1.`;

        if (result !== target + "\n") {
            assert.fail("invalid result");
        }
    });

    /***************************************************************************************/

    test("continuation closed string without spaces at the end and no quota at the start of next line", async() => {
        let source = `
IDENTIFICATION DIVISION.
PROGRAM-ID. id-1.
PROCEDURE DIVISION.
para-1.
    DISPLAY "all"
-    ITEM.
end PROGRAM id-1.`;

        errors = [];
        let input = new CobolInputStream("", errorListener, source + "\n", "");
        let result = input.getFilteredSource();
        parseStream(input);
        for(let error of errors) {
            assert.fail(error.message);
        }

        let target = `IDENTIFICATION DIVISION.
PROGRAM-ID. id-1.
PROCEDURE DIVISION.
para-1.
    DISPLAY "all"ITEM.
end PROGRAM id-1.`;

        if (result !== target + "\n") {
            assert.fail("invalid result");
        }
    });

    /***************************************************************************************/

    test("continuation closed string without spaces at the end and no quota at the start of next line + comment", async() => {
        let source = `
IDENTIFICATION DIVISION.
PROGRAM-ID. id-1.
PROCEDURE DIVISION.
para-1.
    DISPLAY "all"
* comment
-    ITEM.
end PROGRAM id-1.`;

        errors = [];
        let input = new CobolInputStream("", errorListener, source + "\n", "");
        let result = input.getFilteredSource();
        parseStream(input);
        for(let error of errors) {
            assert.fail(error.message);
        }

        let target = `IDENTIFICATION DIVISION.
PROGRAM-ID. id-1.
PROCEDURE DIVISION.
para-1.
    DISPLAY "all"ITEM.
end PROGRAM id-1.`;
        
        if (result !== target + "\n") {
            assert.fail("invalid result");
        }
    });

    /***************************************************************************************/

    test("continuation closed string without spaces at the end and no quota at the start of next line + comment + empty line", async() => {
        let source = `
IDENTIFICATION DIVISION.
PROGRAM-ID. id-1.
PROCEDURE DIVISION.
para-1.
    DISPLAY "all"
* comment

-    ITEM.
end PROGRAM id-1.`;

        errors = [];
        let input = new CobolInputStream("", errorListener, source + "\n", "");
        let result = input.getFilteredSource();
        parseStream(input);
        for(let error of errors) {
            assert.fail(error.message);
        }

        let target = `IDENTIFICATION DIVISION.
PROGRAM-ID. id-1.
PROCEDURE DIVISION.
para-1.
    DISPLAY "all"ITEM.
end PROGRAM id-1.`;

        if (result !== target + "\n") {
            assert.fail("invalid result");
        }
    });
    
    /***************************************************************************************/

    test("continuation closed string without spaces at the end and no quota at the start of next line + comments + empty lines", async() => {
        let source = `
IDENTIFICATION DIVISION.
PROGRAM-ID. id-1.
PROCEDURE DIVISION.
para-1.
    DISPLAY "all"

****
* comment 1

* comment 2
***

-    ITEM.
end PROGRAM id-1.`;

        errors = [];
        let input = new CobolInputStream("", errorListener, source + "\n", "");
        let result = input.getFilteredSource();
        parseStream(input);
        for(let error of errors) {
            assert.fail(error.message);
        }

        let target = `IDENTIFICATION DIVISION.
PROGRAM-ID. id-1.
PROCEDURE DIVISION.
para-1.
    DISPLAY "all"ITEM.
end PROGRAM id-1.`;
        
        if (result !== target + "\n") {
            assert.fail("invalid result");
        }
    });

    /***************************************************************************************/

    test("continuation closed string without spaces at the end and excess quota at the start of next line", async() => {
        let source = `
IDENTIFICATION DIVISION.
PROGRAM-ID. id-1.
PROCEDURE DIVISION.
para-1.
    DISPLAY "all"
-    "oha".
end PROGRAM id-1.`;

        errors = [];
        let input = new CobolInputStream("", errorListener, source + "\n", "");
        let result = input.getFilteredSource();
        parseStream(input);
        if (errors.length !== 1) {
            assert.fail("Must be ONE continuation error");
        }
    });

    /***************************************************************************************/
    /***************************************************************************************/
    /***************************************************************************************/

    return;

    /***************************************************************************************/
    /***************************************************************************************/
    /***************************************************************************************/

    test("Test 1", async () => {

        let streamError = false;
        let streamErrorListener = {
            syntaxError: (file: string, line: number, charPositionInLine: number, message: string): void => {
                assert.fail(`${line}:${charPositionInLine} ${message}`);
                streamError = true;
            }
        };
        let sourceBuf = fs.readFileSync("D:/vmssoftware.work/vms-ide/src/vms_cobol/test/test.cob");
        let source = sourceBuf.toString();
        let input = new CobolInputStream("", streamErrorListener, source, "ac");
        let lexer = new cobolLexer(input);
        let tokenStream = new CommonTokenStream(lexer);
        tokenStream.seek(0);
        let parser = new cobolParser(tokenStream);

        parser.errorHandler = new BailErrorStrategy();
        parser.interpreter.setPredictionMode(PredictionMode.SLL);

        let lexerErrors = new LexerErrorListener(errors);
        lexer.removeErrorListeners();
        lexer.addErrorListener(lexerErrors);

        let parserErrors = new ParserErrorListener(errors);
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

        for (let error of errors) {
            assert.fail(`${error.range.start.row}:${error.range.start.col} ${error.message}`);
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
