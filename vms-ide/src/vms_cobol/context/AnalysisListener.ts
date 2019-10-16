import * as nls from "vscode-nls";

import {
    IDiagnosticEntry,
} from '../../common/parser/Facade';

import {
    cobolListener,
} from "../parser/cobolListener";

import {
    Configuration_sectionContext,
    Crt_isContext,
    Currency_charContext,
    Cursor_isContext,
    End_programContext,
    Memory_size_amountContext,
    ProgramContext,
    Program_collatingContext,
    Program_idContext,
    Qualified_data_itemContext,
    Segment_limitContext,
    Special_namesContext,
    StatementContext,
    Switch_numContext,
    Symb_ch_def_in_alphabetContext,
    Symbol_charContext,
    User_alphaContext,
    Input_sourceContext,
    Figurative_constant_witout_all_zeroContext,
    Figurative_constant_zeroContext,
    Figurative_constant_witout_zeroContext,
    Proc_nameContext,
    File_nameContext,
    Report_nameContext,
    Function_nameContext,
    Class_condition_nameContext,
    Sign_condition_nameContext,
    Bool_condition_nameContext,
} from "../parser/cobolParser";

import {
    findChildInA,
    firstContainingContext,
    markToken,
    testRange,
    markContext,
} from "../../common/parser/Helpers";

import {
    CobolSymbolTable, ILink,
} from "./ContextSymbolTable";

import {
    ALPHABET_Symbol,
    SYMBOLIC_CHARACTERS_Symbol,
    DataRecordSymbol,
    ParagraphSymbol,
    SectionSymbol,
    DeclarativesSectionSymbol,
    ProgramSymbol,
    EDataUsage,
    CURRENCY_Symbol,
    DEVICE_Symbol,
    FigurativeConstantSymbol,
    FileSymbol,
    SortMergeFileSymbol,
    ReportFileSymbol,
    getSymbolFromKind,
    IdentifierSymbol,
    CLASS_Symbol,
    SIGN_Symbol,
    BOOL_Symbol,
    _IntrincisFunctions,
    _PredefinedData,
    EGlobalType,
    IntrincisFunctionSymbol,
    IPreDefinition,
} from "./Symbol";

import {
    Symbol, ScopedSymbol
} from "antlr4-c3";
import { ParseTree, TerminalNode } from "antlr4ts/tree";
import { ParserRuleContext } from "antlr4ts";


nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export class CobolAnalysisListener implements cobolListener {

    public readonly rgxPositiveInt = /^([1-9][0-9]*|[0-9])$/;

    constructor(public diagnostics: IDiagnosticEntry[], public symbolTable: CobolSymbolTable) {
        this.addPredefinitions();
    }

    enterProgram_id(ctx: Program_idContext) {
        testRange(this.diagnostics, ctx.program_name().text.length, 1, 31,
            localize("text_length_1_31", "Must contain 1 to 31 characters"), ctx.program_name().start);

        let with_ident_ctx = ctx.with_ident();
        if (with_ident_ctx !== undefined) {
            testRange(this.diagnostics, with_ident_ctx.ident_string().text.length, 1, 31,
                localize("text_length_1_31", "Must contain 1 to 31 characters"), with_ident_ctx.ident_string().start);
        }

        let programCtx = firstContainingContext(ctx, ProgramContext);
        if (programCtx !== undefined && programCtx.parent instanceof ProgramContext) {
            // this is contained program
            if (with_ident_ctx !== undefined) {
                markContext(this.diagnostics, with_ident_ctx, localize("not_in_contained_program", "Cannot be used in a contained program"));
            }
        } else {
            let common_initial = ctx.common_initial();
            if (common_initial !== undefined) {
                let common = common_initial.COMMON();
                if (common !== undefined) {
                    markToken(this.diagnostics, common.symbol, localize("must_in_contained_program", "May be used only in a contained program"));
                }
            }
        }
    }

    enterEnd_program(ctx: End_programContext) {
        this.verifyName(ctx.program_name(), true, [ProgramSymbol]);
    }

    enterConfiguration_section(ctx: Configuration_sectionContext) {
        let programCtx = firstContainingContext(ctx, ProgramContext);
        if (programCtx && programCtx.parent instanceof ProgramContext) {
            // this is the program inside the other program
            markContext(this.diagnostics, ctx, localize("not_in_contained_program", "Cannot be used in a contained program"));
        }
    }

    enterMemory_size_amount(ctx: Memory_size_amountContext) {
        if (!ctx.text.match(this.rgxPositiveInt)) {
            markContext(this.diagnostics, ctx, localize("must_be_integer", "Must be integer"));
        }
    }

    enterProgram_collating(ctx: Program_collatingContext) {
        this.verifyName(ctx.alpha_name(), false, [ALPHABET_Symbol]);
    }

    enterSegment_limit(ctx: Segment_limitContext) {
        let txt = ctx.segment_number().text;
        if (!txt.match(this.rgxPositiveInt)) {
            markContext(this.diagnostics, ctx.segment_number(), localize("must_be_integer", "Must be integer"));
        }
        let n = Number.parseInt(txt);
        testRange(this.diagnostics, n, 1, 49, localize("number_in_range", "Must be from {0} to {1}", 1, 49), ctx.segment_number());
    }

    enterSpecial_names(ctx: Special_namesContext) {
        let contentCtx = ctx.special_names_content();
        if ((contentCtx === undefined || contentCtx.text.length === 0) && ctx.DOT_().length > 1) {
            markToken(this.diagnostics, ctx.DOT_(1).symbol, localize("dot_must_end_some", "Must be at the end of nonempty content"))
        }
    }

    enterSwitch_num(ctx: Switch_numContext) {
        if (!ctx.text.match(this.rgxPositiveInt)) {
            markContext(this.diagnostics, ctx, localize("must_be_integer", "Must be integer"));
        }
        let switchNum = Number.parseInt(ctx.text);
        if (switchNum <= 0 || switchNum > 16) {
            markContext(this.diagnostics, ctx, localize("invalid_switch_num", "Invalid switch number (must be from 1 to 16)"));
        }
    }

    enterUser_alpha(ctx: User_alphaContext) {
        if (ctx.THROUGH() || ctx.THRU() || ctx.ALSO().length > 0) {
            this.testTerminalNodeStringLength(ctx.first_literal().STRING_LITERAL(), 1);
            let lastLitCtx = ctx.last_literal();
            if (lastLitCtx) {
                this.testTerminalNodeStringLength(lastLitCtx.STRING_LITERAL(), 1);
            }
            let sameLitCtxArr = ctx.same_literal();
            for (let sameLitCtx of sameLitCtxArr) {
                this.testTerminalNodeStringLength(sameLitCtx.STRING_LITERAL(), 1);
            }
        }
    }

    enterSymbol_char(ctx: Symbol_charContext) {
        let symbCharSymbol = this.symbolTable.symbolWithContext(ctx);
        if (symbCharSymbol instanceof SYMBOLIC_CHARACTERS_Symbol) {
            if (symbCharSymbol.resolve(symbCharSymbol.name) !== symbCharSymbol) {
                markContext(this.diagnostics, ctx, localize("isnt_unique", "Isn't unique"));
            }
        }
    }

    enterSymb_ch_def_in_alphabet(ctx: Symb_ch_def_in_alphabetContext) {
        this.verifyName(ctx.alpha_name(), false, [ALPHABET_Symbol]);
    }

    enterCurrency_char(ctx: Currency_charContext) {
        let programCtx = firstContainingContext(ctx, ProgramContext);
        let symbols = this.symbolTable.resolveIdentifier([ctx.text], programCtx);
        let theSame: CURRENCY_Symbol | undefined;
        for (let symbol of symbols) {
            if (symbol instanceof CURRENCY_Symbol) {
                // CURRENCY_Symbol holds Currency_definitionContext
                if (symbol.context === ctx.parent) {
                    // clear all occurances before this symbol
                    theSame = undefined;
                } else {
                    theSame = symbol;
                }
            }
        }
        if (theSame && theSame.context instanceof ParserRuleContext) {
            markContext(this.diagnostics, theSame.context, localize("already_defined", "Already defined"));
        }
        let content = this.stringLiteralContent(ctx.STRING_LITERAL().text);
        if (content.length !== 1) {
            markContext(this.diagnostics, ctx, localize("must_be_N_char", "Must be {0} character(s)", 1));
        } else {
            let _rgx = /[0-9]|[ABCDPRSVXZ]|[a-z]| |[-+*,.;"=/()]/;
            if (content.match(_rgx)) {
                markContext(this.diagnostics, ctx, localize("invalid_currency", "Invalid currency char"));
            }
        }
    }

    enterCursor_is(ctx: Cursor_isContext) {
        let symbol = this.verifyQualifiedName(ctx.qualified_data_item(), false, [DataRecordSymbol]);
        if (symbol instanceof DataRecordSymbol) {
            if (!this.testCursorData(symbol)) {
                markContext(this.diagnostics, ctx, localize("invalid_data", "Invalid data description"));
            }
        }
    }

    enterCrt_is(ctx: Crt_isContext) {
        let symbol = this.verifyQualifiedName(ctx.qualified_data_item(), false, [DataRecordSymbol]);
        if (symbol instanceof DataRecordSymbol) {
            if (!this.testCRTData(symbol)) {
                markContext(this.diagnostics, ctx, localize("invalid_data", "Invalid data description"));
            }
        }
    }

    enterProc_name(ctx: Proc_nameContext) {
        this.verifyQualifiedName(ctx.qualified_data_item(), true, [ParagraphSymbol, SectionSymbol, DeclarativesSectionSymbol]);
    }

    enterQualified_data_item(ctx: Qualified_data_itemContext) {
        this.verifyQualifiedName(ctx);
    }

    enterStatement(ctx: StatementContext) {
        let childInA = findChildInA(ctx);
        if (childInA) {
            markToken(this.diagnostics, childInA, localize("must_be_in_B", "This token must be in B area"));
        }
    }

    enterInput_source(ctx: Input_sourceContext) {
        this.verifyName(ctx, false, [DEVICE_Symbol]);
    }

    enterFigurative_constant_witout_all_zero(ctx: Figurative_constant_witout_all_zeroContext) {
        this.verifyName(ctx, false, undefined, [FigurativeConstantSymbol]);
    }

    enterFigurative_constant_zero(ctx: Figurative_constant_zeroContext) {
        this.verifyName(ctx, false, undefined, [FigurativeConstantSymbol]);
    }

    enterFigurative_constant_witout_zero(ctx: Figurative_constant_witout_zeroContext) {
        if (ctx.ALL()) {
            this.verifyName(ctx, false, undefined, [FigurativeConstantSymbol]);
        }
    }

    enterFile_name(ctx: File_nameContext) {
        this.verifyName(ctx, false, [FileSymbol, SortMergeFileSymbol]);
    }

    enterReport_name(ctx: Report_nameContext) {
        this.verifyName(ctx, false, [ReportFileSymbol]);
    }

    enterClass_condition_name(ctx: Class_condition_nameContext) {
        this.verifyName(ctx, false, [CLASS_Symbol]);
    }

    enterSign_condition_name(ctx: Sign_condition_nameContext) {
        this.verifyName(ctx, false, undefined, [SIGN_Symbol]);
    }

    enterBool_condition_name(ctx: Bool_condition_nameContext) {
        this.verifyName(ctx, false, undefined, [BOOL_Symbol]);
    }

    enterFunction_name(ctx: Function_nameContext) {
        this.verifyName(ctx, false, [IntrincisFunctionSymbol]);
    }

    /****************************************************************************************************/
    /****************************************************************************************************/
    /****************************************************************************************************/
    /****************************************************************************************************/

    /**
     * Side effect - add to occurances
     * @param identifierCtx 
     * @param localOnly 
     * @param allowTypes 
     */
    private verifyQualifiedName(
            identifierCtx?: Qualified_data_itemContext,
            localOnly?: boolean,
            allowTypes?: (new (...args: any[]) => Symbol)[],
            filterTypes?: (new (...args: any[]) => Symbol)[])
                : Symbol | undefined {
        if (identifierCtx) {
            return this.verifyNamePath(identifierCtx, identifierCtx.USER_DEFINED_WORD(), localOnly, allowTypes, filterTypes);
        }
        return undefined;
    }

    /**
     * Side effect - add to occurances
     * @param identifierCtx 
     * @param localOnly 
     * @param allowTypes 
     */
    private verifyName(
            identifierCtx?: ParserRuleContext,
            localOnly?: boolean,
            allowTypes?: (new (...args: any[]) => Symbol)[],
            filterTypes?: (new (...args: any[]) => Symbol)[])
                : Symbol | undefined {
        if (identifierCtx) {
            return this.verifyNamePath(identifierCtx, [identifierCtx], localOnly, allowTypes, filterTypes);
        }
        return undefined;
    }

    /**
     * Side effect - add to occurances
     * @param ctx 
     * @param namePath 
     * @param localOnly 
     * @param allowTypes 
     */
    private verifyNamePath(
            ctx: ParserRuleContext,
            namePath: ParseTree[],
            localOnly?: boolean,
            allowTypes?: (new (...args: any[]) => Symbol)[],
            filterTypes?: (new (...args: any[]) => Symbol)[])
                : Symbol | undefined {
        let symbols = this.symbolTable.resolveIdentifier(namePath.map(x => x.text), ctx, localOnly);
        if (filterTypes && filterTypes.length > 0) {
            let filteredSymbols: Symbol[] = [];
            for (let symbol of symbols) {
                for(let t of filterTypes) {
                    if (symbol instanceof t) {
                        filteredSymbols.push(symbol);
                        break;
                    }
                }
            }
            symbols = filteredSymbols;
        }
        if (symbols.length == 0) {
            markContext(this.diagnostics, ctx, localize("undefined_name", "Undefined name"));
            return undefined;
        } else if (symbols.length > 1) {
            markContext(this.diagnostics, ctx, localize("ambigous_name", "Ambigous name"));
            return undefined;
        }
        let symbol = symbols[0];
        this.symbolTable.addOccurance(namePath, symbol);
        if (allowTypes && allowTypes.length > 0) {
            let allowed = false;
            for(let t of allowTypes) {
                if (symbol instanceof t) {
                    allowed = true;
                    break;
                }
            }
            if (!allowed) {
                markContext(this.diagnostics, ctx, localize("illegal_type", "Illegal type"));
            }
        }
        return symbol;
    }

    private testCursorData(cursorDataDecord: DataRecordSymbol) {
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

    private testCRTData(crtDataDecord: DataRecordSymbol) {
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

    private testTerminalNodeStringLength(node: TerminalNode | undefined, length: number) {
        if (!node) {
            return false;
        }
        if (this.stringLiteralContent(node.text).length === length) {
            return true;
        }
        markToken(this.diagnostics, node.symbol, localize("must_be_N_char", "Must be {0} character(s)", length));
        return false;
    }

    private expandPicture(picture: string) {
        let retStr = picture.replace(/(.)\((\d+)\)/g, (match, symbol, count) => {
            return String(symbol).repeat(+count);
        });
        return retStr;
    }

    private stringLiteralContent(literal: string) {
        if (literal.length > 0) {
            switch (literal[0]) {
                case 'N':
                case 'n':
                    return literal.substr(2, literal.length - 3);
            }
            return literal.substr(1, literal.length - 2);
        }
        return "";
    }

    /**
     * Add pre-defined special registers and figurative constants to real data
     */
    private addPredefinitions() {
        for (let intrincisFunction of _IntrincisFunctions) {
            let symbolToAdd = this.symbolTable.addNewSymbolOfType(IntrincisFunctionSymbol, this.symbolTable, intrincisFunction.name);
            symbolToAdd.functionDefinition = intrincisFunction;
            symbolToAdd.isGlobal = true;
            this.symbolTable.createOccurance(symbolToAdd);
        }
        for (let predefinedNode of _PredefinedData) {
            // by default, add new symbols into symbolTable root
            let symbols: Symbol[] = [this.symbolTable];
            if (predefinedNode.parentKind) {
                let symbolType = getSymbolFromKind(predefinedNode.parentKind);
                symbols = this.symbolTable.getNestedSymbolsOfType(symbolType);
            }
            for (let symbol of symbols) {
                if (symbol instanceof ScopedSymbol) {
                    for (let predefinition of predefinedNode.predefinitions) {
                        create(symbol, predefinition, this.symbolTable);
                    }
                }
            }
        }

        function create(parentSymbol: ScopedSymbol, predefinition: IPreDefinition, symbolTable: CobolSymbolTable, forceGlobal?: boolean) {
            let symbolToAdd = symbolTable.addNewSymbolOfType(predefinition.type, parentSymbol, predefinition.name);
            if (symbolToAdd instanceof DataRecordSymbol) {
                symbolToAdd.level = 1;
                symbolToAdd.picture = predefinition.picture?predefinition.picture:"X";
                symbolToAdd.usage = predefinition.usage?predefinition.usage:EDataUsage.DISPLAY;
                symbolToAdd.requireQualification = predefinition.requireQualification;
            }
            if (symbolToAdd instanceof IdentifierSymbol) {
                if (forceGlobal) {
                    symbolToAdd.isGlobal = true;
                } else {
                    switch(predefinition.global) {
                        case EGlobalType.alwaysTrue:
                            symbolToAdd.isGlobal = true;
                            break;
                        case EGlobalType.alwaysFalse:
                            symbolToAdd.isGlobal = false;
                            break;
                        case EGlobalType.fromParent:
                            if (parentSymbol instanceof IdentifierSymbol) {
                                symbolToAdd.isGlobal = parentSymbol.isGlobal;
                            }
                            break;
                        default:
                            symbolToAdd.isGlobal = true;
                    }
                }
            }
            symbolTable.createOccurance(symbolToAdd);
        }
    }

}