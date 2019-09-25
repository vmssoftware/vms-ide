import { CharStream, ANTLRInputStream, IntStream } from "antlr4ts";
import { Interval } from "antlr4ts/misc";
import { IMessage } from "./cobolErrorListener";

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

export class CobolInputStream implements CharStream {

    private pos: IPos;
    private skipRanges: IRange[] = [];
    private filteredLineToRealLine: number[] = [];
    private realLinePos: number[] = [];

    public  messages: IMessage[] = [];

    public get index() {
        return this.pos.position;
    }

    public get size() {
        return this.source.length;
    }

    public get sourceName() {
        return IntStream.UNKNOWN_SOURCE_NAME;
    }
    
    constructor(private source: string, private conditionals?: string) {
        if (conditionals) {
            this.conditionals = conditionals.toLowerCase();
        }
        this.pos = { 
            position: 0,
            rangeIdx: 0,
        } as IPos;
        this.preFilterSource();
        this.updateRange(this.pos);
    }

    public reset() {
        this.pos = { 
            position: 0,
            rangeIdx: 0,
        } as IPos;
        this.updateRange(this.pos);
    }

    public getText(interval: Interval): string {
        
        let pos: IPos = {
            position: Math.max(interval.a, 0),
            rangeIdx: 0
        } as IPos;
        this.updateRange(pos);

        let stop = Math.min(interval.b, this.source.length - 1);

        let retStr = "";

        while(pos.position <= stop) {
            this.gotoTheNextUnskippedChar(pos);
            if (pos.position <= stop) {
                retStr += this.source[pos.position];
            }
            ++pos.position;
        }

        return retStr;
    }    
    
    public consume(): void {
        if (this.pos.position >= this.source.length) {
            throw new Error("cannot consume EOF");
        }
        this.pos.position++;
        this.gotoTheNextUnskippedChar(this.pos);
    }
    
    public LA(i: number): number {
        if (i === 0) {
            return 0;                               // undefined
        }
        if (i < 0) {
            i++;                                    // e.g., translate LA(-1) to use offset i=0; then data[p+0-1]
            if ((this.pos.position + i - 1) < 0) {
                return IntStream.EOF;               // invalid; no char before first char
            }
        }
        if ((this.pos.position + i - 1) >= this.source.length) {
            return IntStream.EOF;                   // invalid; no char after last char
        }
        let pos = {
            position: this.pos.position + i - 1,
            rangeIdx: 0,
        } as IPos;
        this.updateRange(pos);
        this.gotoTheNextUnskippedChar(pos);
        return this.source.charCodeAt(pos.position);
    }
    
    public mark(): number {
        return -1;
    }
    
    public release(marker: number): void {
        ;
    }
    
    public seek(index: number): void {
        if (index < this.pos.position) {
            this.pos.position = index;
            this.pos.rangeIdx = 0;
            this.pos.range = undefined;
            this.updateRange(this.pos);
            this.gotoTheNextUnskippedChar(this.pos);
        } else if (index > this.pos.position) {
            // seek forward, consume until p hits index or n (whichever comes first)
            index = Math.min(index, this.source.length);
            while (this.pos.position < index) {
                this.consume();
            }
        }
    }

    //------------------------------------------------------------

    /**
     * Returns zero-based position in source file
     * @param line zero-based line number after filtration
     * @param charPositionInLine zero-based line number after filtration
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
            while(charPositionInLine-- > 0) {
                ++pos.position;
                this.gotoTheNextUnskippedChar(pos);
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
        for(let i = 0; i < lines.length; ++i) {
            let line = lines[i];
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
                                let {inString, lastQ} = CobolInputStream.isLineEndsWithCobolSiringLiteral(prevLine);
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
                                            start: lastFilteredPos - 1,
                                            end: currentPosInFile + matched[0].length - 1,
                                        };
                                        prevLine += line.substring(matched[0].length);
                                        lineConsumed = true;
                                    } else {
                                        let message : IMessage = {
                                            message: `Continuation error - string literal have to start with ${lastQ}`,
                                            size: 1,
                                            line: i + 1,
                                            charPositionInLine: matched[0].length,
                                        };
                                        this.messages.push(message);
                                    }
                                } else {
                                    // previuos line doesn't end with quote - add whole line to the end of previous
                                    let spaceLen = prevLine.length;
                                    prevLine = prevLine.trimRight();
                                    spaceLen -= prevLine.length;
                                    interval = {
                                        start: lastFilteredPos - spaceLen - 1,
                                        end: currentPosInFile + matched[0].length - 2,
                                    };
                                    prevLine += line.substring(matched[0].length - 1);
                                    lineConsumed = true;
                                }
                                lastFilteredPos = currentPosInFile + line.length + 1;
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
                            let message : IMessage = {
                                message: `Continuation error - area A must be empty`,
                                size: 1,
                                line: i + 1,
                                charPositionInLine: 1,
                            };
                            this.messages.push(message);
                        }
                }
                if (!lineConsumed) {
                    prevLine = line;
                    lastFilteredPos = currentPosInFile + line.length + 1;
                }
            }
            currentPosInFile += line.length + 1;
        }
    }

    public getFilteredSource() {
        let testContent = "";
        let testPos: IPos = {
            position: 0,
            rangeIdx: 0,
        } as IPos;
        this.updateRange(testPos);
        do {
            this.gotoTheNextUnskippedChar(testPos);
            if (testPos.position < this.source.length) {
                testContent += this.source[testPos.position];
            }
            ++testPos.position;
        } while(testPos.position < this.source.length);
        return testContent;
    }

    //------------------------------------------------------------

    public static isLineEndsWithCobolSiringLiteral(line: string) {
        let inString = false;
        let lastQ = ' ';
        for (let i = 0; i < line.length; ++i) {
            if (inString) {
                if (line[i] === lastQ) {
                    if (i + 1 < line.length && line[i+1] === lastQ) {
                        ++i;
                        continue;
                    }
                    inString = false;
                    continue;
                }
            } else {
                switch (line[i]) {
                    case "'":
                    case '"':
                        inString = true;
                        lastQ = line[i]
                        continue;
                }
            }
        }
        return { inString, lastQ };
    }
}