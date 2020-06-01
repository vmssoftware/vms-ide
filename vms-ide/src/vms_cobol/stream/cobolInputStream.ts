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
import { CobolAnalisisHelper } from "../context/CobolAnalisisHelpers";
import { TaskDivider } from "../../common/task-divider";

const _rgxIsEmptyA = /^.(?: {4}| {0,3}\t)\s*(\S)/;
const _quotas = "\"'";

export interface ICopyManager {
    getLines(name: string): string[];
    getSourcePath(name: string): string | undefined;
    clear(fileName?: string): boolean;
    getRoot() : string;
}

/**
 * simply string replacing
 */
export interface IReplace {
    // each range is actual after all previous replacing performed
    start: number,
    removeLength: number,
    addLength: number,
    preceding?: IReplace[],
    // TODO: next lines must be a link to replacing source
    name?: string,
    path?: string;
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
    pseudoText,
}

interface ITestReplace {
    newState: EReplaceState,
    newReplacing?: IReplace,
}

interface IApplyReplace {
    newPos: number,
    newResult: string,
}

export interface IInsideReplacing {
    replacing: IReplace,
    row: number,
    col: number,
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
    syntaxError(file: string, line: number, charPositionInLine: number, msg: string): void;
}

export class CobolInputStream implements CharStream {

    //------------------------------------------------------------

    private input?: ANTLRInputStream;

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

    public deltaTest = 1000;

    //------------------------------------------------------------

    /**
     *
     * @param errorListener zero-based coordinates
     * @param source
     * @param conditionals
     */
    constructor(public file: string,
        public errorListener: IStreamErrorListener,
        private source: string,
        conditionals?: string,
        private copyManager?: ICopyManager,
        private cancelToken?: TaskDivider<number>) {

        if (conditionals) {
            this.conditionals = conditionals.toUpperCase();
        }
    }

    public async buildInput() {
        return this.preFilterSource().then((filtered: boolean) => {
            if (filtered) {
                this.input = new ANTLRInputStream(this.getFilteredSource());
                return true;
            }
            return false;
        }).catch(() => {
            return false;
        });
    }

    //------------------------------------------------------------

    public get index() {
        return this.input?this.input.index:0;
    }

    public get size() {
        return this.input?this.input.size:0;
    }

    public get sourceName() {
        return IntStream.UNKNOWN_SOURCE_NAME;
    }

    public reset() {
        if (this.input) {
            this.input.reset();
        }
    }

    public getText(interval: Interval): string {
        return this.input?this.input.getText(interval):"";
    }

    public consume(): void {
        if (this.input) {
            this.input.consume();
        }
    }

    public LA(i: number): number {
        return this.input?this.input.LA(i):0;
    }

    public mark(): number {
        return -1;
    }

    public release(marker: number): void {
        ;
    }

    public seek(index: number): void {
        if (this.input) {
            this.input.seek(index);
        }
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

    /**
     * Do not change position until target found (if exists)
     * @param replacings
     * @param pos
     * @param targetR
     */
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
            if (r.start > result.pos) {
                // after
                result.stop = true;
                break;
            } else if (r.start + r.removeLength < result.pos) {
                // before
                result.pos += r.addLength - r.removeLength;
            } else {
                // inside, do not find position
                result.inside.push({
                    row: 0,
                    col: 0,
                    replacing: r,
                });
                result.pos = r.start;
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
            if (r.start <= result.pos) {
                if (r.start + r.addLength > result.pos) {
                    result.inside.push(this.insideReplacing(r, result.pos - r.start));
                    result.pos = r.start;
                } else {
                    result.pos += r.removeLength - r.addLength;
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
        return {sourceRow, sourceCol, inside: result.inside};
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
        return {resultRow, resultCol, inside: result.inside};
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
            if (this.replacings[i].start >= replacing.start) {
                if (this.replacings[i].start + this.replacings[i].addLength <= replacing.start + replacing.removeLength) {
                    replacing.removeLength += this.replacings[i].removeLength - this.replacings[i].addLength;
                    let preceding = this.replacings[i].preceding;
                    if (preceding) {
                        replacing.preceding = replacing.preceding || [];
                        replacing.preceding.unshift(...preceding);
                    }
                } else {
                    replacing.preceding = replacing.preceding || [];
                    replacing.preceding.push(this.replacings[i]);
                }
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
                    start: pos,
                    removeLength: 1,
                    lines: [" ".repeat(this.tabSize)],
                    addLength: this.tabSize
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
            case "=": {
                if (pos > 0 && content[pos - 1] === "=") {
                    return {
                        newState: EReplaceState.pseudoText,
                    };
                }
            }
        }
        // test start of line
        if (this.testLineStarts(content, pos)) {
            // start new line
            switch (content[pos]) {
                case '*': {
                    // comment
                    let newReplacing: IReplace = {
                        start: pos,
                        removeLength: 0,
                        lines: [],
                        addLength: 0
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
                                start: pos,
                                removeLength: 0,
                                lines: [],
                                addLength: 0
                            };
                            return {
                                newState: EReplaceState.conditionalCompile,
                                newReplacing
                            };
                        } else {
                            // create and apply replacing for two symbols only
                            let newReplacing: IReplace = {
                                start: pos,
                                removeLength: 2,
                                lines: [],
                                addLength: 0
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
                        start: pos - 1,
                        removeLength: 0,
                        lines: [],
                        addLength: 0
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
        return content[pos] === "'";
    }

    private testStringQQEnds(content: string, pos: number) {
        return content[pos] === "\"";
    }

    private testPseudoTextEnds(content: string, pos: number) {
        return content[pos] === "=" && pos > 0 && content[pos - 1] === "=";
    }

    /**
     *
     * @param replacing current replacing
     * @param source source string
     * @returns resulting string after applying
     */
    private applyReplacing(replacing: IReplace, source: string): IApplyReplace {
        // apply, without preceding because they are already applied
        let retValue: IApplyReplace = {
            newResult:
                source.substr(0, replacing.start) +
                replacing.lines.join("\n") +
                source.substr(replacing.start + replacing.removeLength),
            newPos: replacing.start + replacing.addLength,
        };
        // add to array, adjust if required
        this.addReplacing(replacing);
        return retValue;
    }

    private lastNormalDotPosition = 0;
    private testCopyStatement(content: string, pos: number): ITestReplace | undefined {
        if (content[pos] === '.') {
            // ensure dot followed space or EOF
            if (pos + 1 >= content.length || " \t\r\n".includes(content[pos + 1])) {
                // find copy statement
                let tmpSource = content.substring(this.lastNormalDotPosition, pos + 1); // end at '.'
                let copyContext = this.parseCopyStatement(tmpSource);
                if (copyContext) {
                    let statement = copyContext.lastCopyStatement();
                    let row = statement.start.line - 1;
                    let innerPos = 0;
                    while (row !== 0) {
                        if (tmpSource[innerPos] === "\n") {
                            --row;
                        }
                        ++innerPos;
                    }
                    innerPos += statement.start.charPositionInLine;
                    let newReplacing: IReplace = {
                        start: this.lastNormalDotPosition + innerPos,
                        removeLength: tmpSource.length - innerPos,
                        lines: [],
                        addLength: 0
                    };
                    let textName = statement.text_name();
                    if (textName && !statement.library_name()) {
                        newReplacing.name = CobolAnalisisHelper.stringLiteralContent(textName.text);
                        if (newReplacing.name) {
                            if (this.copyManager) {
                                newReplacing.lines = this.copyManager.getLines(newReplacing.name);
                                newReplacing.path = this.copyManager.getSourcePath(newReplacing.name);
                            } else {
                                newReplacing.lines = ["* from: " + newReplacing.name];
                            }
                            newReplacing.lines.unshift(""); // add first empty string, required!!!
                            newReplacing.addLength = newReplacing.lines.join("\n").length;
                        }
                    }
                    // do not change lastNormalDotPosition
                    return {
                        newState: EReplaceState.normal,
                        newReplacing
                    };
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
    private async preFilterSource() {
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

        let delta = this.deltaTest;

        let tokenValue = this.cancelToken ? this.cancelToken.asyncValue : 0;

        while(pos < this.result.length && errors.length === 0) {
            if (this.cancelToken) {
                if (--delta <= 0) {
                    if (tokenValue != await this.cancelToken.testValue()) {
                        this.result = "";
                        return false;
                    }
                    delta = this.deltaTest;
                }
            }
            // remove stringContinuationChar if something else presents at the end of line after string ends
            if (stringTestLastLineChar) {
                if (this.testLineEnds(this.result, pos)) {
                    stringTestLastLineChar = undefined;
                } else {
                    stringContinuationChar = undefined;
                }
            }
            // always replace tab char
            // let testResult = this.testTab(this.result, pos);
            // if (testResult && testResult.newReplacing) {
            //      ({newResult: this.result, newPos: pos} = this.applyReplacing(testResult.newReplacing, this.result));
            //      continue;
            // }

            // test empty lines
            if (this.testLineStarts(this.result, pos)) {
                startEmptyLine = pos;
            }

            if (this.testLineEnds(this.result, pos)) {
                if (startEmptyLine !== undefined) {
                    let emptyLineReplacing: IReplace = {
                        start: startEmptyLine,
                        removeLength: pos + 1 - startEmptyLine,
                        lines: [],
                        addLength: 0,
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
                            // move pos to the last dot, reparse all again
                            pos = this.lastNormalDotPosition;
                            movePosition = 0;
                        }
                    }
                    break;
                case EReplaceState.pseudoText:
                    if (this.testPseudoTextEnds(this.result, pos)) {
                        replacing = undefined;
                        state = EReplaceState.normal;
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
                            } else if (this.result[posT] === '\t') {
                                posT -= 4;
                                break;
                            }
                            --posT;
                        }
                        if (pos - posT < 4) {
                            errors.push({
                                pos: pos,
                                msg: localize("string.continuation.improperly", "Continuation must start in the B area."),
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
                                    msg: localize("string.continuation.error", "Continuation error - string literal must begin with {0}.", stringContinuationChar),
                                });
                                replacing = undefined;
                            }
                            if (replacing) {
                                if (stringContinuationChar) {
                                    // remove starting quota only if equal
                                    if (this.result[pos] === stringContinuationChar) {
                                        replacing.removeLength = pos + 1 - replacing.start;
                                    } else {
                                        replacing.removeLength = pos - replacing.start;
                                    }
                                } else {
                                    // remove ending spaces
                                    while(replacing.start > 0 && "\t\r\n ".includes(this.result[replacing.start - 1])) {
                                        --replacing.start;
                                    }
                                    // keep starting char
                                    replacing.removeLength = pos - replacing.start;
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
                                        msg: localize("string.continuation.error.unpredictable", "Continuation unexpected error."),
                                    });
                                    break;
                            }
                        }
                    }
                    break;
                case EReplaceState.comment:
                        if (this.testCommentEnds(this.result, pos)) {
                            if (replacing) {
                                replacing.removeLength = pos + 1 - replacing.start;
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
                            replacing.removeLength = pos + 1 - replacing.start;
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
            for (let inside of sourcePos.inside) {
                if (inside.replacing.name) {
                    this.errorListener.syntaxError(inside.replacing.name, inside.row, inside.col, err.msg);
                }
            }
            this.errorListener.syntaxError(this.file, sorceRC.sourceRow, sorceRC.sourceCol, err.msg);
        }
        return errors.length === 0;
    }

    public insideReplacing(replacing: IReplace, pos: number) : IInsideReplacing {
        let row = 0;
        let col = pos;
        while (row < replacing.lines.length) {
            if (col <= replacing.lines[row].length) {
                break;
            }
            col -= replacing.lines[row].length + 1;
            ++row;
        }
        if (replacing.name) {
            --row;  // do not forget about first empty line added
        }
        return {
            row,
            col,
            replacing,
        };
    }

    /**
     * returns filtered content
     */
    public getFilteredSource() {
        return this.result;
    }
}