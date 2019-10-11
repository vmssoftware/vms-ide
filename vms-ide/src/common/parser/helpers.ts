import { CharStream, Token, ParserRuleContext } from "antlr4ts";
import { ParseTree, TerminalNode } from "antlr4ts/tree";

import { EDiagnosticType, IDiagnosticEntry, IDefinition } from "./Facade";

/**
 * Returns the parse tree which covers the given position or undefined if none could be found.
 * @param root 
 * @param column zero-based
 * @param row zero-based
 */
export function parseTreeFromPosition(root: ParseTree, column: number, row: number): ParseTree | undefined {
    // assumed row 1-based, column 0-based
    ++row;
    // Does the root node actually contain the position? If not we don't need to look further.
    if (root instanceof TerminalNode) {
        let terminal = (root as TerminalNode);
        let token = terminal.symbol;
        if (token.line !== row) {
            return undefined;
        }

        let tokenStop = token.charPositionInLine + (token.stopIndex - token.startIndex + 1);
        if (token.charPositionInLine <= column && tokenStop >= column) {
            return terminal;
        }
        return undefined;
    } else {
        let context = (root as ParserRuleContext);
        if (!context.start || !context.stop) { // Invalid tree?
            return undefined;
        }

        if (context.start.line > row || (context.start.line === row && column < context.start.charPositionInLine)) {
            return undefined;
        }

        let tokenStop = context.stop.charPositionInLine + (context.stop.stopIndex - context.stop.startIndex + 1);
        if (context.stop.line < row || (context.stop.line === row && tokenStop < column)) {
            return undefined;
        }

        if (context.children) {
            for (let child of context.children) {
                let result = parseTreeFromPosition(child, column, row - 1);
                if (result) {
                    return result;
                }
            }
        }
        return context;
    }
}

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
 * Mark whole context
 * @param diagnostics 
 * @param ctx 
 * @param message 
 * @param type 
 */
export function markContext(diagnostics: IDiagnosticEntry[], ctx: ParserRuleContext, message: string, type = EDiagnosticType.Error) {
    let start = ctx.start;
    let stop = ctx.stop? ctx.stop : start;
    diagnostics.push({
        type,
        message,
        range:
        {
            start: { column: start.charPositionInLine, row: start.line },
            end: { column: stop.charPositionInLine + (stop.text?stop.text.length:0), row: stop.line },
        },
    });
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
export function testRange(diagnostics: IDiagnosticEntry[], value: number, minvalue: number, maxvalue: number, message: string, token: Token | ParserRuleContext, type = EDiagnosticType.Error) {
    if (value < minvalue || maxvalue < value) {
        if (token instanceof ParserRuleContext) {
            markContext(diagnostics, token, message, type);
        } else {
            markToken(diagnostics, token, message, type);
        }
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
    markTextInLine(diagnostics, message, token.charPositionInLine, token.line, (token.text ? token.text.length : 0), type);
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
export function markTextInLine(diagnostics: IDiagnosticEntry[], message: string, column: number, row: number, length: number, type = EDiagnosticType.Error) {
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

export function isNodeIncludes(node: ParseTree, testNode: ParseTree) : boolean {
    if (node === testNode) {
        return true;
    }
    let found = false;
    let idx = 0;
    while (!found && idx < node.childCount) {
        let tmp = node.getChild(idx);
        found = isNodeIncludes(tmp, testNode);
        ++idx;
    }
    return found;
}

/**
 * Range is zero-based
 * @param ctx 
 */
export function definitionForParserRuleContext(ctx: ParserRuleContext) : IDefinition {
    let stop = ctx.stop? ctx.stop : ctx.start;
    return {
        text: ctx.text,
        range: {
            start: { column: ctx.start.charPositionInLine, row: ctx.start.line - 1},
            end: { column: stop.charPositionInLine + (stop.text?stop.text.length:0), row: stop.line - 1},
        }
    };
}

/**
 * Range is zero-based
 * @param ctx 
 */
export function definitionForTerminalNode(ctx: TerminalNode) : IDefinition {
    return {
        text: ctx.text,
        range: {
            start: { column: ctx.symbol.charPositionInLine, row: ctx.symbol.line - 1},
            end: { column: ctx.symbol.charPositionInLine + ctx.text.length, row: ctx.symbol.line - 1},
        }
    };
}

/**
 * Range is zero-based
 * @param ctx 
 */
export function definitionForContext(ctx?: ParseTree): IDefinition | undefined {
    if (ctx instanceof ParserRuleContext) {
        return definitionForParserRuleContext(ctx);
    } else if (ctx instanceof TerminalNode) {
        return definitionForTerminalNode(ctx);
    }
    return undefined;
}
