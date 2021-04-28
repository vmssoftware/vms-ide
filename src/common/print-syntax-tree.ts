import { Parser, ParserRuleContext } from "antlr4ts";
import { ParseTree, Trees } from "antlr4ts/tree";

export function getSyntaxTreeStrings(parser: Parser, root: ParseTree) : string[] {
    return recursive(root, 0, parser);
}

function recursive(root: ParseTree, offset: number, parser: Parser): string[] {
    let buf = ["  ".repeat(offset) + Trees.getNodeText(root, parser.ruleNames)];
    if (root instanceof ParserRuleContext) {
        if (root.children != null) {
            for (let child of root.children) {
                buf.push(...recursive(child, offset + 1, parser));
            }
        }
    } 
    // else if (root instanceof TerminalNode) {
    //     let symbName = parser.vocabulary.getSymbolicName(root.symbol.type);
    //     if (symbName) {
    //         buf[buf.length-1] += ' <' + symbName + '>';
    //     }
    // }
    return buf;
}