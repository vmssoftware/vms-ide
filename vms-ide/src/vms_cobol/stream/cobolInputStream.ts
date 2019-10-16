import * as nls from "vscode-nls";
nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

import { CharStream, IntStream, ANTLRInputStream } from "antlr4ts";
import { Interval } from "antlr4ts/misc";
import { isLineEndsWithCobolSiringLiteral } from "../../common/parser/Helpers";

const _rgxIsEmptyA = /^.(?: {4}| {0,3}\t)\s*(\S)/;

interface IRange {
    start: number, 
    end: number,
};

interface IPos {
    position: number, 
    rangeIdx: number,
    range: IRange | undefined,
};

export interface IErrorListener {
    /**
     * Collects errors
     * @param line zero-based line number
     * @param charPositionInLine zero-based char position in line
     * @param msg message
     */
    syntaxError(line: number, charPositionInLine: number, msg: string): void;
}

export class CobolInputStream implements CharStream {

    private conditionals = "";
    private skipRanges: IRange[] = [];
    /**
     * real line number = filteredLineToRealLine[ filtered line number ]
     */
    private filteredLineToRealLine: number[] = [];
    /**
     * Source position for real lines
     */
    private realLinePos: number[] = [];
    private input: ANTLRInputStream;

    public tabSize = 4;

    public get index() {
        return this.input.index;
    }

    public get size() {
        return this.input.size;
    }

    public get sourceName() {
        return IntStream.UNKNOWN_SOURCE_NAME;
    }
    
    /**
     * 
     * @param errorListener zero-based coordinates
     * @param source 
     * @param conditionals 
     */
    constructor(public errorListener: IErrorListener, public source: string, conditionals?: string) {
        if (conditionals) {
            this.conditionals = conditionals.toLowerCase();
        }
        this.preFilterSource();
        this.input = new ANTLRInputStream(this.getFilteredSource());
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
     * Returns zero-based position in source after filtration
     * @param realLine zero-based line before filtration
     * @param realCharPositionInLine zero-based column before filtration
     */
    public getFilteredPosition(realLine: number, realCharPositionInLine: number) {
        let line = this.filteredLineToRealLine.length - 1;
        let charPositionInLine = 0;
        while(line > 0) {
            if (this.filteredLineToRealLine[line] <= realLine) {
                let stopPos = this.realLinePos[realLine] + realCharPositionInLine;
                let startPos = this.realLinePos[this.filteredLineToRealLine[line]];
                let pos: IPos = {
                    position: startPos,
                    rangeIdx: 0,
                } as IPos;
                this.updateRange(pos);
                this.gotoTheNextUnskippedChar(pos);
                while(pos.position < stopPos) {
                    if (pos.position < this.source.length) {
                        let char = this.source[pos.position];
                        if (char === '\t') {
                            charPositionInLine += this.tabSize - 1;
                        }
                    }
                    ++pos.position;
                    ++charPositionInLine;
                    this.gotoTheNextUnskippedChar(pos);
                }
                break;
            }
            --line;
        }
        return {line, charPositionInLine};
    }

    /**
     * Returns zero-based position in source file before filtration
     * @param line zero-based line after filtration
     * @param charPositionInLine zero-based column after filtration
     */
    public getRealPosition(line: number, charPositionInLine: number) {
        if (line >= 0 && line < this.filteredLineToRealLine.length) {
            let realLine = this.filteredLineToRealLine[line];
            let pos: IPos = {
                position: this.realLinePos[realLine],
                rangeIdx: 0,
            } as IPos;
            this.updateRange(pos);
            this.gotoTheNextUnskippedChar(pos);
            while(charPositionInLine > 0) {
                if (pos.position < this.source.length) {
                    let char = this.source[pos.position];
                    if (char === '\t') {
                        charPositionInLine -= this.tabSize - 1;
                    }
                }
                if (charPositionInLine > 0) {
                    ++pos.position;
                    this.gotoTheNextUnskippedChar(pos);
                    --charPositionInLine;
                }
            };
            line = this.realLinePos.length - 1;
            while(line >= 0) {
                charPositionInLine = pos.position - this.realLinePos[line];
                if (charPositionInLine >= 0) {
                    break;
                }
                --line;
            }
        }
        return {line, charPositionInLine};
    }

    //------------------------------------------------------------
    
    /**
     * Find first range which ends after this position
     * Updates given pos
     * @param pos 
     */
    private updateRange(pos: IPos) {
        pos.range = undefined;
        while (pos.rangeIdx < this.skipRanges.length) {
            if (this.skipRanges[pos.rangeIdx].end >= pos.position) {
                break;
            }
            ++pos.rangeIdx;
        }
        if (pos.rangeIdx < this.skipRanges.length) {
            pos.range = this.skipRanges[pos.rangeIdx];
        }
    }

    /**
     * Go to the next unskipped char
     * Updates given pos
     * @param pos 
     */
    private gotoTheNextUnskippedChar(pos: IPos) {
        while (pos.range !== undefined) {
            if (pos.position >= pos.range.start) {
                pos.position = pos.range.end + 1;
                this.updateRange(pos);
            } else {
                break;
            }
        }
    }

    /**
     * Create ranges for skip
     */
    private preFilterSource() {
        let lines = this.source.split("\n");
        this.skipRanges = [];
        let prevLine: string | undefined;
        let currentPosInFile = 0;
        let lastFilteredPos = 0;
        let lastFilteredEolLen = 0;
        for(let i = 0; i < lines.length; ++i) {
            let line = lines[i];
            let eolLen = 1;
            while (line.endsWith("\r")) {
                ++eolLen;
                line = line.substr(0, line.length - 1);
            }
            this.realLinePos.push(currentPosInFile);
            this.filteredLineToRealLine.push(i);
            let lineConsumed = false;
            if (line.trim()) {
                switch (line[0]) {
                    case '\\':
                        // conditional compilation
                        if (this.conditionals) {
                            let letter = line[1].toLowerCase();
                            if (this.conditionals.includes(letter)) {
                                // do not consume line, just skip first two letters
                                this.skipRanges.push({
                                    start: currentPosInFile,
                                    end: currentPosInFile + 1,
                                });
                                break;
                            }
                        }
                        // do not break - threat as comment
                    case '*':
                    case '/':
                        // skip whole line, but do not skip NL on previous line
                        lineConsumed = true;
                        this.skipRanges.push({
                            start: currentPosInFile,
                            end: currentPosInFile + line.length - 1,
                        });
                        break;
                    case '-':
                        let matched = line.match(_rgxIsEmptyA);
                        if (matched) {
                            if (prevLine) {
                                let {inString, lastQ} = isLineEndsWithCobolSiringLiteral(prevLine);
                                let interval: {start: number, end: number} | undefined;
                                if (!inString) {
                                    let lastSymbol = prevLine[prevLine.length-1];
                                    if (lastSymbol === '"' || lastSymbol === "'") {
                                        inString = true;
                                    }
                                }
                                if (inString) {
                                    if (matched[1] === lastQ) {
                                        interval = {
                                            start: lastFilteredPos - lastFilteredEolLen,
                                            end: currentPosInFile + matched[0].length - 1,
                                        };
                                        prevLine += line.substring(matched[0].length);
                                        lineConsumed = true;
                                    } else {
                                        this.errorListener.syntaxError(
                                            i,
                                            matched[0].length -1,
                                            localize("string.continuation.error", "Continuation error - string literal have to start with {0}", lastQ));
                                    }
                                } else {
                                    // previuos line doesn't end with quote - add whole line to the end of previous
                                    let spaceLen = prevLine.length;
                                    prevLine = prevLine.trimRight();
                                    spaceLen -= prevLine.length;
                                    interval = {
                                        start: lastFilteredPos - spaceLen - lastFilteredEolLen,
                                        end: currentPosInFile + matched[0].length - 2,
                                    };
                                    prevLine += line.substring(matched[0].length - 1);
                                    lineConsumed = true;
                                }
                                lastFilteredPos = currentPosInFile + line.length + eolLen;
                                lastFilteredEolLen = eolLen;
                                if (interval) {
                                    // test overlapped intervals
                                    let num = this.skipRanges.length - 1;
                                    while (num >= 0) {
                                        if (this.skipRanges[num].end + 1 < interval.start) {
                                            break;
                                        }
                                        interval.start = Math.min(this.skipRanges[num].start, interval.start);
                                        this.skipRanges.pop();
                                        --num;
                                    }
                                    this.skipRanges.push(interval);
                                    // remove skipped lines
                                    num = this.filteredLineToRealLine.length;
                                    while(num > 0) {
                                        let realLine = this.filteredLineToRealLine[--num];
                                        if (this.realLinePos[realLine] <= interval.start) {
                                            break;
                                        }
                                        this.filteredLineToRealLine.pop();
                                    }
                                }
                            }
                        } else {
                            this.errorListener.syntaxError(
                                i,
                                0,
                                localize("string.continuation.error", "Continuation error - area A must be empty"));
                        }
                }
                if (!lineConsumed) {
                    prevLine = line;
                    lastFilteredPos = currentPosInFile + line.length + eolLen;
                    lastFilteredEolLen = eolLen;
                }
            }
            currentPosInFile += line.length + eolLen;
        }
    }

    /**
     * returns filtered content
     */
    public getFilteredSource() {
        let testContent = "";
        let testPos: IPos = {
            position: 0,
            rangeIdx: 0,
        } as IPos;
        this.updateRange(testPos);
        let tabSpaces = ' '.repeat(this.tabSize);
        do {
            this.gotoTheNextUnskippedChar(testPos);
            if (testPos.position < this.source.length) {
                let char = this.source[testPos.position];
                if (char === '\t') {
                    testContent += tabSpaces;
                } else {
                    testContent += char;
                }
            }
            ++testPos.position;
        } while(testPos.position < this.source.length);
        return testContent;
    }
}