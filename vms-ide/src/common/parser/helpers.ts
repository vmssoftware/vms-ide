import { CharStream, Token } from "antlr4ts";
import { EDiagnosticType, IDiagnosticEntry } from "./Facade";
import { ParseTree, TerminalNode } from "antlr4ts/tree";

/**
 * Get char position in line based on tab size
 * @param stream char stream
 * @param index index in char stream of current token
 * @param tabSize desired tab size
 */
export function CalculateTabBasedCharPositionInLine(stream: CharStream | undefined, index: number, tabSize = 4) {
    let pos = 0;
    if (stream) {
        let idx = index - stream.index - 1;
        let nl = false;
        while (!nl && index > 0) {
            switch (stream.LA(idx)) {
                case ' '.charCodeAt(0):
                    ++pos;
                    break;
                case '\t'.charCodeAt(0):
                    pos += tabSize;
                    break;
                case '\n'.charCodeAt(0):
                    nl = true;
                    break;
                default:
                    ++pos;
                    break;
            }
            --index;
            --idx;
        }
    }
    return pos;
}

//------------------------------------------------------------

/**
 * Test if the line has a cobol string literal at the end
 * @param line 
 */
export function isLineEndsWithCobolSiringLiteral(line: string) {
    let inString = false;
    let lastQ = ' ';
    for (let i = 0; i < line.length; ++i) {
        if (inString) {
            if (line[i] === lastQ) {
                if (i + 1 < line.length && line[i + 1] === lastQ) {
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

/**
 * Test value range and create diagnostic entry about given value and push it into array if value is out of range
 * @param diagnostics 
 * @param value 
 * @param minvalue 
 * @param maxvalue 
 * @param message 
 * @param token 
 * @param type 
 */
export function testRange(diagnostics: IDiagnosticEntry[], value: number, minvalue: number, maxvalue: number, message: string, token: Token, type = EDiagnosticType.Error) {
    if (value < minvalue || maxvalue < value) {
        markToken(diagnostics, token, message, type);
    }
}

/**
 * Create diagnostic entry about given token and push it into array
 * @param diagnostics 
 * @param token 
 * @param message 
 * @param type 
 */
export function markToken(diagnostics: IDiagnosticEntry[], token: Token, message: string, type = EDiagnosticType.Error) {
    markText(diagnostics, message, token.charPositionInLine, token.line, (token.text ? token.text.length : 0), type);
}

/**
 * Create diagnostic entry about given text and push it into array
 * @param diagnostics array to add diagnostic entry
 * @param message 
 * @param column 
 * @param row 
 * @param length 
 * @param type 
 */
export function markText(diagnostics: IDiagnosticEntry[], message: string, column: number, row: number, length: number, type = EDiagnosticType.Error) {
    diagnostics.push({
        type,
        message,
        range:
        {
            start: { column, row },
            end: { column: column + length, row }
        }
    });
}

/**
 * Find first child in A area
 * @param tree 
 */
export function findChildInA(tree: ParseTree): Token | undefined {
    if (tree instanceof TerminalNode) {
        if (tree.symbol.charPositionInLine < 4) {
            return tree.symbol;
        }
    } else {
        let num = tree.childCount - 1;
        while (num >= 0) {
            let childInA = findChildInA(tree.getChild(num));
            if (childInA) {
                return childInA;
            }
            --num;
        }
    }
    return undefined;
}

/**
 * Get most containing context of type T
 * @param tree 
 * @param t 
 */
export function mostContainingContext<T extends ParseTree>(tree: ParseTree | undefined, t: new (...args: any[]) => T): T | undefined {
    let ret: T | undefined;
    while(tree !== undefined) {
        if (tree instanceof t) {
            ret = tree;
        }
        tree = tree.parent;
    }
    return ret;
}

/**
 * Get first containing context of type T
 * @param tree 
 * @param t 
 */
export function firstContainingContext<T extends ParseTree>(tree: ParseTree | undefined, t: new (...args: any[]) => T): T | undefined {
    while(tree !== undefined) {
        if (tree instanceof t) {
            return tree;
        }
        tree = tree.parent;
    }
    return undefined;
}
