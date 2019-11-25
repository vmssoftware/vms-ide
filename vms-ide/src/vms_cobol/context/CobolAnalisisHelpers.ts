import * as nls from "vscode-nls";

import { Qualified_data_itemContext } from "../parser/cobolParser";
import { ParserRuleContext, Token } from "antlr4ts";
import { ParseTree, TerminalNode } from "antlr4ts/tree";
import { CobolSymbolTable } from "./CobolSymbolTable";
import { Symbol } from "antlr4-c3";
import { IDiagnosticEntry, EDiagnosticType } from "../../common/parser/Facade";
import { mark, unifyCobolName } from "../../common/parser/Helpers";
import { DataRecordSymbol, EDataUsage } from "./CobolSymbol";

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export class CobolAnalisisHelper {

    public readonly rgxPositiveInt = /^([1-9][0-9]*|[0-9])$/;
    public readonly rgxReservedPic = /[0-9]|[ABCDPRSVXZ]|[a-z]| |[-+*,.;"=/()]/;


    constructor(public diagnostics: IDiagnosticEntry[], public symbolTable: CobolSymbolTable) {
        //
    }

    /**
     * Mark source
     * @param source 
     * @param message 
     * @param type 
     */
    public mark(source: Token | ParserRuleContext | TerminalNode, message: string, type = EDiagnosticType.Error) {
        mark(this.diagnostics, source, message, type);
    }
    
    /**
     * Mark source if text isn't appropriate length
     * @param source 
     * @param min 
     * @param max 
     * @param isLiteral remove quotas
     */
    public verifyTextLengthRange(source: ParserRuleContext | TerminalNode | Token | undefined, min: number, max: number): string | undefined {
        let text: string | undefined;
        if (source) {
            text = CobolAnalisisHelper.stringLiteralContent(source.text);
            if ((min > 0 && !text) || (text && (text.length < min || text.length > max))) {
                mark(this.diagnostics, source, localize("text_length_range", "Must contain {0} to {1} characters", min, max));
            }
        }
        return text;
    }
    
    /**
     * Mark source if presented integer value isn't in range
     * @param source 
     * @param min 
     * @param max 
     * @param radix 
     */
    public verifyIntegerRange(source: ParserRuleContext | TerminalNode | Token | undefined, min: number, max: number, radix = 10) {
        if (source) {
            let notInt = true;
            let text = source.text;
            if (text) {
                if (text.match(this.rgxPositiveInt)) {
                    notInt = false;
                    let n = Number.parseInt(text, radix);
                    if (n < min || n > max) {
                        mark(this.diagnostics, source, localize("number_in_range", "Must be from {0} to {1}", min, max));
                    }
                }
            }
            if (notInt) {
                mark(this.diagnostics, source, localize("not_an_integer", "Not an integer"));
            }
        }
    }

    /**
     * Verify qualified name
     * @param identifierCtx 
     * @param localOnly 
     * @param allowTypes 
     * @param includeTypes 
     * @param excludeTypes 
     */
    public verifyQualifiedName(
            identifierCtx ?: Qualified_data_itemContext,
            localOnly ?: boolean,
            allowTypes ?: (new (...args: any[]) => Symbol)[],
            includeTypes ?: (new (...args: any[]) => Symbol)[],
            excludeTypes ?: (new (...args: any[]) => Symbol)[])
                : Symbol | undefined {
        if (identifierCtx) {
            return this.verifyNamePath(identifierCtx, identifierCtx.USER_DEFINED_WORD_(), localOnly, allowTypes, includeTypes, excludeTypes);
        }
        return undefined;
    }

    /**
     * Verify unqualified name
     * @param identifierCtx 
     * @param localOnly 
     * @param allowTypes 
     * @param includeTypes 
     * @param excludeTypes 
     */
    public verifyName(
        identifierCtx ?: ParserRuleContext | TerminalNode,
        localOnly ?: boolean,
        allowTypes ?: (new (...args: any[]) => Symbol)[],
        includeTypes ?: (new (...args: any[]) => Symbol)[],
        excludeTypes ?: (new (...args: any[]) => Symbol)[])
                : Symbol | undefined {
        if (identifierCtx) {
            return this.verifyNamePath(identifierCtx, [identifierCtx], localOnly, allowTypes, includeTypes, excludeTypes);
        }
        return undefined;
    }

    /**
     * Verify identifier by its path
     * @param ctx used in resolving and marking
     * @param namePath 
     * @param localOnly 
     * @param allowTypes 
     * @param includeTypes 
     * @param excludeTypes 
     */
    public verifyNamePath(
            ctx: ParserRuleContext | TerminalNode,
            namePath: ParseTree[],
            localOnly ?: boolean,
            allowTypes ?: (new (...args: any[]) => Symbol)[],
            includeTypes ?: (new (...args: any[]) => Symbol)[],
            excludeTypes ?: (new (...args: any[]) => Symbol)[])
                : Symbol | undefined {
        let symbols = this.symbolTable.resolveIdentifier(namePath.map(x => unifyCobolName(CobolAnalisisHelper.stringLiteralContent(x.text))), ctx, localOnly);
        if (includeTypes && includeTypes.length > 0) {
            let filteredSymbols: Symbol[] = [];
            for (let symbol of symbols) {
                for (let t of includeTypes) {
                    if (symbol instanceof t) {
                        filteredSymbols.push(symbol);
                        break;
                    }
                }
            }
            symbols = filteredSymbols;
        }
        if (excludeTypes && excludeTypes.length > 0) {
            let filteredSymbols: Symbol[] = [];
            for (let symbol of symbols) {
                if (!excludeTypes.reduce((exclude, t) => exclude || (symbol instanceof t), false)) {
                    filteredSymbols.push(symbol);
                }
            }
            symbols = filteredSymbols;
        }
        if (symbols.length == 0) {
            this.mark(ctx, localize("undefined_name", "Undefined name"));
            return undefined;
        } else if (symbols.length > 1) {
            this.mark(ctx, localize("ambigous_name", "Ambigous name"));
            return undefined;
        }
        let symbol = symbols[0];
        this.symbolTable.addOccurence(namePath, symbol);
        if (allowTypes && allowTypes.length > 0) {
            let allowed = false;
            for (let t of allowTypes) {
                if (symbol instanceof t) {
                    allowed = true;
                    break;
                }
            }
            if (!allowed) {
                this.mark(ctx, localize("illegal_type", "Illegal type"));
            }
        }
        return symbol;
    }

    /**
     * Test if data is appropriate for cursor
     * @param cursorDataDecord 
     */
    public testCursorData(cursorDataDecord: DataRecordSymbol) {
        return CobolAnalisisHelper.testCursorData(cursorDataDecord);
    }

    public static testCursorData(cursorDataDecord: DataRecordSymbol) {
        if (cursorDataDecord.usage !== EDataUsage.DISPLAY) {
            return false;
        }
        if (cursorDataDecord.picture) {
            let expandedPicture = this.expandPicture(cursorDataDecord.picture);
            if (expandedPicture === "9999" || expandedPicture === "999999") {
                return true;
            }
        } else {
            if (cursorDataDecord.children.length == 2) {
                let field1 = cursorDataDecord.children[0];
                let field2 = cursorDataDecord.children[1];
                if (field1 instanceof DataRecordSymbol &&
                    field2 instanceof DataRecordSymbol &&
                    field1.usage === EDataUsage.DISPLAY &&
                    field2.usage === EDataUsage.DISPLAY &&
                    field1.picture &&
                    field2.picture) {
                    let expandedPicture = this.expandPicture(field1.picture) +
                        this.expandPicture(field2.picture);
                    if (expandedPicture === "9999" || expandedPicture === "999999") {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * Test if data is appropriate for CRT
     * @param crtDataDecord 
     */
    public testCRTData(crtDataDecord: DataRecordSymbol) {
        return CobolAnalisisHelper.testCRTData(crtDataDecord);
    }

    public static testCRTData(crtDataDecord: DataRecordSymbol) {
        if (crtDataDecord.usage !== EDataUsage.DISPLAY) {
            return false;
        }
        if (crtDataDecord.children.length == 3) {
            let field1 = crtDataDecord.children[0];
            let field2 = crtDataDecord.children[1];
            return field1 instanceof DataRecordSymbol && field1.picture && "9X".includes(field1.picture) &&
                field2 instanceof DataRecordSymbol && field2.picture && "9X".includes(field2.picture);
        }
        return false;
    }

    /**
     * Expand picture string
     * @param picture 
     */
    public static expandPicture(picture: string) {
        let retStr = picture.replace(/(.)\((\d+)\)/g, (match, symbol, count) => {
            return String(symbol).repeat(+count);
        });
        return retStr;
    }

    /**
     * Remove quotas
     * @param literal 
     */
    public static stringLiteralContent(literal?: string) {
        if (literal && literal.length > 1) {
            switch (literal[0]) {
                case 'N':
                case 'n':
                    if (literal.length > 1) {
                        switch(literal[1]) {
                            case '"':
                            case "'":
                                if (literal[literal.length - 1] == literal[1]) {
                                    return literal.substring(2, literal.length - 1);
                                } else {
                                    return literal.substring(2, literal.length);
                                }
                        }
                    }
                    break;
                case '"':
                case "'":
                    if (literal[literal.length - 1] == literal[0]) {
                        return literal.substring(1, literal.length - 1);
                    } else {
                        return literal.substring(1, literal.length);
                    }
            }
        }
        return literal;
    }

    /**
     * test if ctxChild.firstChild is unique in parent
     * @param parentCtx parent of ctxChild
     * @param childCtxTest ctxChild
     */
    public testDuplicates(parentCtx: ParseTree | undefined, childCtxTest: ParseTree | TerminalNode | undefined) {
        if (parentCtx !== undefined && childCtxTest !== undefined && !(childCtxTest instanceof TerminalNode) && childCtxTest.childCount > 0) {
            let firstChild = childCtxTest.getChild(0) as ParserRuleContext | TerminalNode;
            if (firstChild instanceof TerminalNode) {
                return;
            }
            for (let idx = 0; idx < parentCtx.childCount; ++idx) {
                let childCtx = parentCtx.getChild(idx);
                if (childCtx instanceof TerminalNode) {
                    continue;
                }
                if (childCtx === childCtxTest) {
                    break;
                }
                if (childCtx.childCount > 0 && childCtx.getChild(0).constructor === firstChild.constructor) {
                    this.mark(firstChild, localize("duplicated.clause", "Duplicated clause"));
                }
            }
        }
    }
}