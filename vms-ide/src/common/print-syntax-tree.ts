import { Parser, ParserRuleContext } from "antlr4ts";
import { ParseTree, Trees } from "antlr4ts/tree";

export function getSyntaxTreeStrings(parser: Parser, root: ParseTree) : string[] {
    return recursive(root, 0, parser.ruleNames);
}

function recursive(root: ParseTree, offset: number, ruleNames: string[]): string[] {
    let buf = ["  ".repeat(offset) + Trees.getNodeText(root, ruleNames)];
    if (root instanceof ParserRuleContext) {
        if (root.children != null) {
            for (let child of root.children) {
                buf.push(...recursive(child, offset + 1, ruleNames));
            }
        }
    }
    return buf;
}