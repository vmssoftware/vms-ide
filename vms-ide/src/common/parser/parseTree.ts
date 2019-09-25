import { ParseTree, TerminalNode } from "antlr4ts/tree";
import { ParserRuleContext } from "antlr4ts";

/**
 * Returns the parse tree which covers the given position or undefined if none could be found.
 */
export function parseTreeFromPosition(root: ParseTree, column: number, row: number): ParseTree | undefined {
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
                let result = parseTreeFromPosition(child, column, row);
                if (result) {
                    return result;
                }
            }
        }
        return context;

    }
}
