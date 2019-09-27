import * as nls from "vscode-nls";

import { IDiagnosticEntry, EDiagnosticType } from '../../common/parser/Facade';
import { cobolListener } from "../parser/cobolListener";
import { StatementContext } from "../parser/cobolParser";
import { ParseTree, TerminalNode } from "antlr4ts/tree";
import { Token, ParserRuleContext } from "antlr4ts";
import { markToken } from "../../common/parser/helpers";
import { CobolSymbolTable } from "./ContextSymbolTable";


nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export class CobolAnalysisListener implements cobolListener 
{
    constructor(public diagnostics: IDiagnosticEntry[], public symbolTable: CobolSymbolTable) {
    }
    
    enterStatement(ctx: StatementContext)
    {
        let childInA = CobolAnalysisListener.findChildInA(ctx);
        if (childInA) {
            this.diagnostics.push(markToken(childInA, localize("must_be_in_B", "This token must be in B area")));
        }
    }

    public static findChildInA(tree: ParseTree): Token | undefined {
        if (tree instanceof TerminalNode) {
            if (tree.symbol.charPositionInLine < 4) {
                return tree.symbol;
            }
        } else {
            let num = tree.childCount - 1;
            while (num >= 0) {
                let childInA = this.findChildInA(tree.getChild(num));
                if (childInA) {
                    return childInA;
                }
                --num;
            }
        }
        return undefined;
    }
}