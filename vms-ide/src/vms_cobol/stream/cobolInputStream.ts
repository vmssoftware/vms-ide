import * as nls from "vscode-nls";
nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

import { CharStream, IntStream, ANTLRInputStream, CommonTokenStream, BailErrorStrategy, DefaultErrorStrategy } from "antlr4ts";
import { Interval, ParseCancellationException } from "antlr4ts/misc";
import { cobolCopyLexer } from "../parser/cobolCopyLexer";
import { cobolCopyParser, CopyStatementContext } from "../parser/cobolCopyParser";
import { PredictionMode } from "antlr4ts/atn/PredictionMode";
import { IDiagnosticEntry } from "../../common/parser/Facade";
import { LexerErrorListener } from "../../common/parser/ErrorListeners";
import { ParserErrorListener } from "../../common/parser/ErrorListeners";

const _rgxIsEmptyA = /^.(?: {4}| {0,3}\t)\s*(\S)/;
const _quotas = "\"'";

interface IRange {
    start: number, 
    length: number,
};

export interface ICopyManager {
    getLines(name: string): string[];
}

/**
 * simply string replacing
 */
interface IReplace {
    // each range is actual after all previous replacing performed
    range: IRange,
    preceding?: IReplace[],
    // TODO: next lines must be a link to replacing source
    name?: string,
    length: number,
    lines: string[],
}

enum EReplaceState {
    normal,
    comment,
    emptyLine,
    conditionalCompile,
    continuation,
    stringQ,
    stringQQ,
}

interface ITestReplace {
    newState: EReplaceState,
    newReplacing?: IReplace,
}

interface IApplyReplace {
    newPos: number,
    newResult: string,
}

interface IInsideReplacing {
    replacing: IReplace,
    position: number,
}

interface IShiftResult {
    pos: number,
    stop?: boolean,
    inside: IInsideReplacing[],
}

interface IStreamError {
    pos: number,
    msg: string,
}

export interface IStreamErrorListener {
    /**
     * Collects errors
     * @param line zero-based line number
     * @param charPositionInLine zero-based char position in line
     * @param msg message
     */
    syntaxError(line: number, charPositionInLine: number, msg: string): void;
}

export class CobolInputStream implements CharStream {

    //------------------------------------------------------------

    private input: ANTLRInputStream;

    private conditionals = "";

    /**
     * Sorted by range.start
     * Next replacing position is actual after applying all the previuos replacings
     */
    private replacings: IReplace[] = [];

    private sourceRowPositions: number[] = [];

    private result: string = "";
    private resultRowPositions: number[] = [];

    public tabSize = 4;

    //------------------------------------------------------------

    /**
     * 
     * @param errorListener zero-based coordinates
     * @param source 
     * @param conditionals 
     */
    constructor(public errorListener: IStreamErrorListener, private source: string, conditionals?: string, private copyManger?: ICopyManager) {
        if (conditionals) {
            this.conditionals = conditionals.toUpperCase();
        }
        //this.resolveCopyStatement();
        this.preFilterSource();
        this.input = new ANTLRInputStream(this.getFilteredSource());
    }

    //------------------------------------------------------------

    public get index() {
        return this.input.index;
    }

    public get size() {
        return this.input.size;
    }

    public get sourceName() {
        return IntStream.UNKNOWN_SOURCE_NAME;
    }
    
    public reset() {
        this.input.reset();
    }

    public getText(interval: Interval): string {
        return this.input.getText(interval);
    }    
    
    public consume(): void {
        this.input.consume();
    }
    
    public LA(i: number): number {
        return this.input.LA(i);
    }
    
    public mark(): number {
        return -1;
    }
    
    public release(marker: number): void {
        ;
    }
    
    public seek(index: number): void {
        this.input.seek(index);
    }

    //------------------------------------------------------------

    /**
     * Returns zero-based position in result after applying all preceding replacings
     * If source position points to replaced text then starting of the FIRST replacing will be returned
     * @param sourcePos 
     */
    public resultPosFromSourcePos(sourcePos: number): IShiftResult {
        let result = this.shiftResultPos(this.replacings, sourcePos);
        return result;
    }

    private shiftResultPos(replacings: IReplace[], pos: number): IShiftResult {
        let result: IShiftResult = {
            pos,
            inside: [],
        };
        for (let r of replacings) {
            if (r.preceding) {
                let resT = this.shiftResultPos(r.preceding, result.pos);
                result.pos = resT.pos;
                if (resT.inside.length) {
                    result.inside.push(...resT.inside);
                }
            }
            if (r.range.start > result.pos) {
                // after
                result.stop = true;
                break;
            } else if (r.range.start + r.range.length < result.pos) {
                // before
                result.pos += r.length - r.range.length;
            } else {
                // inside
                result.inside.push({
                    replacing: r,
                    position: result.pos - r.range.start, 
                });
                result.pos = r.range.start;
            }
        }
        return result;
    }

    /**
     * Returns zero-based position in source before replacing
     * If dest position points to replaced text then starting of the FISRT replacing will be returned
     * @param resultPos char position in result
     */
    public sourcePosFromResultPos(resultPos: number) {
        let result = this.shiftSourcePos(this.replacings, resultPos);
        return result;
    }

    private shiftSourcePos(replacings: IReplace[], pos: number): IShiftResult {
        let result: IShiftResult = {
            pos,
            inside: [],
        };
        let i = replacings.length - 1;
        while(i >= 0) {
            let r = replacings[i];
            if (r.range.start <= result.pos) {
                if (r.range.start + r.length > result.pos) {
                    result.inside!.push({
                        replacing: r,
                        position: result.pos - r.range.start,
                    });
                    result.pos = r.range.start;
                } else {
                    result.pos += r.range.length - r.length;
                }
                if (r.preceding) {
                    let resT = this.shiftSourcePos(r.preceding, result.pos);
                    result.pos = resT.pos;
                    if (resT.inside.length) {
                        result.inside.push(...resT.inside);
                    }
                }
            }
            --i;
        }
        return result;
    }

    /**
     * Convert row & col -> pos
     * @param resultRow 
     * @param resultCol 
     * @returns position in result content
     */
    public resultPosFromRowCol(resultRow: number, resultCol: number) {
        let resultPos = this.result.length;
        if (resultRow < this.resultRowPositions.length) {
            // init like in source
            resultPos = this.resultRowPositions[resultRow] + resultCol;
        }
        return resultPos;
    }

    /**
     * Convert pos -> row & col
     * @param resultPos 
     * @returns zero-based row & col in result
     */
    public resultRowColFromPos(resultPos: number) {
        let resultRow = this.resultRowPositions.length - 1;
        while(this.resultRowPositions[resultRow] > resultPos) {
            --resultRow;
        }
        let resultCol = resultPos - this.resultRowPositions[resultRow];
        return {resultRow, resultCol};
    }

    /**
     * Convert row & col -> pos
     * @param sourceRow 
     * @param sourceCol 
     * @returns position in source content
     */
    public sourcePosFromRowCol(sourceRow: number, sourceCol: number) {
        let sourcePos = this.source.length;
        if (sourceRow < this.sourceRowPositions.length) {
            // init like in source
            sourcePos = this.sourceRowPositions[sourceRow] + sourceCol;
        }
        return sourcePos;
    }

    /**
     * Convert pos -> row & col
     * @param sourcePos 
     * @returns zero-based row & col in source
     */
    public sourceRowColFromPos(sourcePos: number) {
        let sourceRow = this.sourceRowPositions.length - 1;
        while(this.sourceRowPositions[sourceRow] > sourcePos) {
            --sourceRow;
        }
        let sourceCol = sourcePos - this.sourceRowPositions[sourceRow];
        return {sourceRow, sourceCol};
    }

    /**
     * Returns zero-based position in source before replacing
     * If result position points to replaced text then starting of the FISRT replacing will be returned
     * @param resultRow zero-based line in dest
     * @param resultCol zero-based column in dest
     */
    public sourceRowColFromResultRowCol(resultRow: number, resultCol: number) {
        let result = this.sourcePosFromResultPos(this.resultPosFromRowCol(resultRow, resultCol));
        let {sourceRow, sourceCol} = this.sourceRowColFromPos(result.pos);
        return {sourceRow, sourceCol};
    }

    /**
     * Returns zero-based position in result after applying all preceding replacings
     * If source position points to replaced text then starting of the FIRST replacing will be returned
     * @param sourceRow 
     * @param sourceCol 
     */
    public resultRowColFromSourceRowCol(sourceRow: number, sourceCol: number) {
        let result = this.resultPosFromSourcePos(this.sourcePosFromRowCol(sourceRow, sourceCol));
        let {resultRow, resultCol} = this.resultRowColFromPos(result.pos);
        return {resultRow, resultCol};
    }

    //------------------------------------------------------------
    //------------------------------------------------------------
    //------------------------------------------------------------
    //------------------------------------------------------------
    //------------------------------------------------------------
    //------------------------------------------------------------

    /**
     * Note: add only in right order
     * @param replacing 
     */
    private addReplacing(replacing: IReplace) {
        let i = this.replacings.length - 1;
        while (i >= 0) {
            if (this.replacings[i].range.start >= replacing.range.start) {
                replacing.preceding = replacing.preceding || [];
                replacing.preceding.push(this.replacings[i]);
                this.replacings.pop();
            } else {
                break;
            }
            --i;
        }
        this.replacings.push(replacing);
    }

    private testTab(content: string, pos: number): ITestReplace | undefined {
        switch (content[pos]) {
            case '\t': {
                let replacing: IReplace = {
                    range: {
                        start: pos,
                        length: 1
                    },
                    lines: [" ".repeat(this.tabSize)],
                    length: this.tabSize
                };
                // does not change state
                return {
                    newState: EReplaceState.normal,
                    newReplacing: replacing,
                };
            }
        }
        return undefined;
    }

    /**
     * Test only from NORMAL state
     * @param content 
     * @param pos 
     */
    private testReplacingStart(content: string, pos: number): ITestReplace | undefined {
        // test any char
        switch (content[pos]) {
            case "'": {
                return {
                    newState: EReplaceState.stringQ,
                };
            }
            case "\"": {
                return {
                    newState: EReplaceState.stringQQ,
                };
            }
        }
        // test start of line
        if (this.testLineStarts(content, pos)) {
            // start new line
            switch (content[pos]) {
                case '*': {
                    // comment
                    let newReplacing: IReplace = {
                        range: {
                            start: pos,
                            length: 0
                        },
                        lines: [],
                        length: 0
                    };
                    return {
                        newState: EReplaceState.comment,
                        newReplacing
                    };
                }
                case '\\': {
                    // conditionalCompile
                    if (pos + 1 < content.length) {
                        if (!this.conditionals.includes(content[pos + 1].toUpperCase())) {
                            // start new replacing for whole line
                            let newReplacing: IReplace = {
                                range: {
                                    start: pos,
                                    length: 0
                                },
                                lines: [],
                                length: 0
                            };
                            return {
                                newState: EReplaceState.conditionalCompile,
                                newReplacing
                            };
                        } else {
                            // create and apply replacing for two symbols only
                            let newReplacing: IReplace = {
                                range: {
                                    start: pos,
                                    length: 2
                                },
                                lines: [],
                                length: 0
                            };
                            return {
                                newState: EReplaceState.normal, // do not change state, so apply immediately
                                newReplacing
                            };
                        }
                    }
                    break;
                }
                case '-': {
                    // continuation
                    let newReplacing: IReplace = {
                        range: {
                            start: pos - 1,
                            length: 0
                        },
                        lines: [],
                        length: 0
                    };
                    return {
                        newState: EReplaceState.continuation,
                        newReplacing
                    };
                }
            }
        }
        return undefined;
    }

    private testLineStarts(content: string, pos: number) {
        return pos === 0 || content[pos-1] === '\n';
    }

    private testSpaceChar(content: string, pos: number) {
        return " \t\r\n".includes(content[pos]);
    }

    private testLineEnds(content: string, pos: number) {
        return content[pos] === '\n' || pos + 1 >= content.length;
    }

    private testCommentEnds(content: string, pos: number) {
        return this.testLineEnds(content, pos);
    }

    private testConditionalCompileEnds(content: string, pos: number) {
        return this.testLineEnds(content, pos);
    }

    private testContinuationEnds(content: string, pos: number) {
        return !"\t ".includes(content[pos]);
    }

    private testStringQEnds(content: string, pos: number) {
        return content[pos] == "'";
    }

    private testStringQQEnds(content: string, pos: number) {
        return content[pos] == "\"";
    }

    /**
     * 
     * @param replacing current replacing
     * @param source source string
     * @returns resulting string after applying
     */
    private applyReplacing(replacing: IReplace, source: string): IApplyReplace {
        this.addReplacing(replacing);
        // apply, without preceding because they are already applied
        return {
            newResult:
                source.substr(0, replacing.range.start) +
                replacing.lines.join("\n") +
                source.substr(replacing.range.start + replacing.range.length),
            newPos: replacing.range.start + replacing.length,
        };
    }

    private lastNormalDotPosition = 0;
    private testCopyStatement(content: string, pos: number): ITestReplace | undefined {
        if (content[pos] === '.') {
            // ensure dot followed space or EOF
            if (pos + 1 >= content.length || " \t\r\n".includes(content[pos + 1])) {
                // find copy statement
                let tmp = content.substring(this.lastNormalDotPosition, pos + 1);
                let copyContext = this.parseCopyStatement(tmp);
                if (copyContext) {

                }
                this.lastNormalDotPosition = pos + 2;   // points after the space/new line
            }
        }
        return undefined;
    }

    private parseCopyStatement(source: string): CopyStatementContext | undefined {
        let input = new ANTLRInputStream(source + "\n");
        let lexer = new cobolCopyLexer(input);
        let tokenStream = new CommonTokenStream(lexer);
        tokenStream.seek(0);
        let parser = new cobolCopyParser(tokenStream);
        parser.errorHandler = new BailErrorStrategy();
        parser.interpreter.setPredictionMode(PredictionMode.SLL);
        let diagnostic: IDiagnosticEntry[] = [];
        lexer.removeErrorListeners();
        lexer.addErrorListener(new LexerErrorListener(diagnostic));
        parser.removeErrorListeners();
        parser.addErrorListener(new ParserErrorListener(diagnostic));
        let tree: CopyStatementContext | undefined;
        try {
            tree = parser.copyStatement();
        }
        catch (e) {
            if (e instanceof ParseCancellationException) {
                tokenStream.seek(0);
                parser.reset();
                parser.errorHandler = new DefaultErrorStrategy();
                parser.interpreter.setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);
                tree = parser.copyStatement();
            } else {
                throw e;
            }
        }
        if (diagnostic.length) {
            return undefined;
        }
        return tree;
    }

    /**
     * Create ranges for skip
     */
    private preFilterSource() {
        this.replacings = [];
        
        let lines = this.source.split("\n");
        this.sourceRowPositions = [0];
        let sourceLinePos = 0;
        for(let line of lines) {
            sourceLinePos += line.length + 1;
            this.sourceRowPositions.push(sourceLinePos);
        }

        let pos = 0;
        this.result = this.source;

        let replacing: IReplace | undefined;
        let state = EReplaceState.normal;

        let errors: IStreamError[] = [];

        let stringContinuationChar: string | undefined;
        let stringOpened: boolean | undefined;
        let stringTestLastLineChar: boolean | undefined;
        let startEmptyLine: number | undefined;

        this.lastNormalDotPosition = 0;
        
        while(pos < this.result.length && errors.length === 0) {
            // remove stringContinuationChar if something else presents at the end of line after string ends
            if (stringTestLastLineChar) {
                if (this.testLineEnds(this.result, pos)) {
                    stringTestLastLineChar = undefined;
                } else {
                    stringContinuationChar = undefined;
                }
            }
            // always replace tab char
            let testResult = this.testTab(this.result, pos);
            if (testResult && testResult.newReplacing) {
                 ({newResult: this.result, newPos: pos} = this.applyReplacing(testResult.newReplacing, this.result));
                 continue;
            }
            
            // test empty lines
            if (this.testLineStarts(this.result, pos)) {
                startEmptyLine = pos;
            }

            if (this.testLineEnds(this.result, pos)) {
                if (startEmptyLine !== undefined) {
                    let emptyLineReplacing: IReplace = {
                        range: {
                            start: startEmptyLine,
                            length: pos + 1 - startEmptyLine
                        },
                        lines: [],
                        length: 0,
                    };
                    ({newResult: this.result, newPos: pos} = this.applyReplacing(emptyLineReplacing, this.result));
                    continue;
                }
            }

            if (!this.testSpaceChar(this.result, pos)) {
                startEmptyLine = undefined;
            }

            let movePosition = 1;

            switch(state) {
                case EReplaceState.normal:
                    // test if some replacement starts
                    let testResult = this.testReplacingStart(this.result, pos);
                    if (testResult) {
                        if (testResult.newState === EReplaceState.normal && testResult.newReplacing) {
                            // apply imediately
                            ({newResult: this.result, newPos: pos} = this.applyReplacing(testResult.newReplacing, this.result));
                            movePosition = 0;
                            testResult.newReplacing = undefined;
                        }
                        replacing = testResult.newReplacing;
                        state = testResult.newState;
                    } else {
                        testResult = this.testCopyStatement(this.result, pos);
                        if (testResult && testResult.newReplacing) {
                            // parse copy statement and fill replacing
                            ({newResult: this.result, newPos: pos} = this.applyReplacing(testResult.newReplacing, this.result));
                            movePosition = 0;
                        }
                    }
                    break;
                case EReplaceState.stringQ:
                    if (this.testStringQEnds(this.result, pos) || this.testLineEnds(this.result, pos)) {
                        if (this.testLineEnds(this.result, pos)) {
                            stringOpened = true;
                        } else {
                            stringTestLastLineChar = true;
                        }
                        stringContinuationChar = "'";
                        replacing = undefined;
                        state = EReplaceState.normal;
                    }
                    break;
                case EReplaceState.stringQQ:
                    if (this.testStringQQEnds(this.result, pos) || this.testLineEnds(this.result, pos)) {
                        if (this.testLineEnds(this.result, pos)) {
                            stringOpened = true;
                        } else {
                            stringTestLastLineChar = true;
                        }
                        stringContinuationChar = "\"";
                        replacing = undefined;
                        state = EReplaceState.normal;
                    }
                    break;
                case EReplaceState.continuation:
                    if (this.testContinuationEnds(this.result, pos)) {
                        // test B area
                        let posT = pos - 1;
                        while(posT >= 0) {
                            if (this.result[posT] === '-') {
                                break;
                            }
                            --posT;
                        }
                        if (pos - posT < 4) {
                            errors.push({
                                pos: pos,
                                msg: localize("string.continuation.improperly", "Continuation must start at B"),
                            });
                            replacing = undefined;
                        }
                        if (replacing) {
                            // test if string literal properly continues
                            if ( stringContinuationChar &&
                                (
                                    (stringOpened && this.result[pos] !== stringContinuationChar) 
                                        ||
                                    (!stringOpened && _quotas.includes(this.result[pos]) && this.result[pos] !== stringContinuationChar)
                                )) {
                                errors.push({
                                    pos: pos,
                                    msg: localize("string.continuation.error", "Continuation error - string literal have to start with {0}", stringContinuationChar),
                                });
                                replacing = undefined;
                            }
                            if (replacing) {
                                if (stringContinuationChar) {
                                    // remove starting quota only if equal
                                    if (this.result[pos] === stringContinuationChar) {
                                        replacing.range.length = pos + 1 - replacing.range.start;
                                    } else {
                                        replacing.range.length = pos - replacing.range.start;
                                    }
                                } else {
                                    // remove ending spaces
                                    while(replacing.range.start > 0 && "\t\r\n ".includes(this.result[replacing.range.start - 1])) {
                                        --replacing.range.start;
                                    }
                                    // keep starting char
                                    replacing.range.length = pos - replacing.range.start;
                                }
                                ({newResult: this.result, newPos: pos} = this.applyReplacing(replacing, this.result));
                                movePosition = 0;
                            }
                        }
                        replacing = undefined;
                        state = EReplaceState.normal;
                        if (!stringOpened) {
                            stringContinuationChar = undefined;
                        } else {
                            stringOpened = undefined;
                            switch (stringContinuationChar) {
                                case "'":
                                    state = EReplaceState.stringQ;
                                    break;
                                case "\"":
                                    state = EReplaceState.stringQQ;
                                    break;
                                default:
                                    errors.push({
                                        pos: pos,
                                        msg: localize("string.continuation.error.unpredictable", "Continuation unpredictable error"),
                                    });
                                    break;
                            }
                        }
                    }
                    break;
                case EReplaceState.comment:
                        if (this.testCommentEnds(this.result, pos)) {
                            if (replacing) {
                                replacing.range.length = pos + 1 - replacing.range.start;
                                ({newResult: this.result, newPos: pos} = this.applyReplacing(replacing, this.result));
                                movePosition = 0;
                            }
                            replacing = undefined;
                            state = EReplaceState.normal;
                        }
                        break;
                case EReplaceState.conditionalCompile:
                    if (this.testConditionalCompileEnds(this.result, pos)) {
                        if (replacing) {
                            replacing.range.length = pos + 1 - replacing.range.start;
                            ({newResult: this.result, newPos: pos} = this.applyReplacing(replacing, this.result));
                            movePosition = 0;
                        }
                        replacing = undefined;
                        state = EReplaceState.normal;
                    }
                    break;
            }
            pos += movePosition;
        }

        let resultLines = this.result.split("\n");
        this.resultRowPositions = [0];
        let resultLinePos = 0;
        for(let resultLine of resultLines) {
            resultLinePos += resultLine.length + 1;
            this.resultRowPositions.push(resultLinePos);
        }

        for (let err of errors) {
            let sourcePos = this.sourcePosFromResultPos(err.pos);
            let sorceRC = this.sourceRowColFromPos(sourcePos.pos);
            this.errorListener.syntaxError(sorceRC.sourceRow, sorceRC.sourceCol, err.msg);
        }
    }

    /**
     * returns filtered content
     */
    public getFilteredSource() {
        return this.result;
    }
}