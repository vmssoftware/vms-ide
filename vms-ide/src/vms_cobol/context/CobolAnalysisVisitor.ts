import * as nls from "vscode-nls";
import { cobolVisitor } from "../parser/cobolVisitor";
import { AbstractParseTreeVisitor } from "antlr4ts/tree";
import {
    Bool_condition_nameContext,
    Class_condition_nameContext,
    Configuration_sectionContext,
    Crt_isContext,
    Currency_charContext,
    Cursor_isContext,
    Declaratives_headerContext,
    End_declarativesContext,
    End_programContext,
    End_program_headerContext,
    Figurative_constant_witout_all_zeroContext,
    Figurative_constant_witout_zeroContext,
    Figurative_constant_zeroContext,
    File_nameContext,
    Function_nameContext,
    Identification_division_headerContext,
    Input_sourceContext,
    Memory_size_amountContext,
    ParagraphContext,
    Proc_nameContext,
    Prog_nameContext,
    ProgramContext,
    Program_collatingContext,
    Program_idContext,
    Qualified_data_itemContext,
    Report_nameContext,
    Section_headerContext,
    Segment_limitContext,
    Sign_condition_nameContext,
    Special_namesContext,
    StatementContext,
    Switch_numContext,
    Symb_ch_def_in_alphabetContext,
    Symbol_charContext,
    User_alphaContext,
    UsingContext,
    Value_is_literalContext,
    GivingContext,
    File_description_entryContext,
} from "../parser/cobolParser";

import { CobolAnalisisHelper } from "./CobolAnalisisHelpers";

import {
    firstContainingContext,
    findChildInA,
    unifyCobolName
} from "../../common/parser/Helpers";

import {
    ALPHABET_Symbol,
    BOOL_Symbol,
    CLASS_Symbol,
    CURRENCY_Symbol,
    DataRecordSymbol,
    DeclarativesSectionSymbol,
    DeviceSymbol,
    FigurativeConstantSymbol,
    FileSymbol,
    IntrinsicFunctionSymbol,
    ParagraphSymbol,
    ProgramSymbol,
    ReportFileSymbol,
    SIGN_Symbol,
    SYMBOLIC_CHARACTERS_Symbol,
    SectionSymbol,
    SortMergeFileSymbol,
    IValue,
    EValueType,
    ValueTypeFromDataUsage,
} from "./CobolSymbol";

import { ParserRuleContext } from "antlr4ts";

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export class CobolAnalysisVisitor extends AbstractParseTreeVisitor<void> implements cobolVisitor<void> {

    constructor(public helper: CobolAnalisisHelper) {
        super();
    }

    protected defaultResult(): void {
        // throw new Error("Method not implemented.");
    }

    visitChildren<T extends ParserRuleContext>(node: ParserRuleContext, skipContexts?: (new (...args: any[]) => T)[]) {
        let result = this.defaultResult();
        let n = node.childCount;
        for (let i = 0; i < n; i++) {
            if (!this.shouldVisitNextChild(node, result)) {
                break;
            }
            let c = node.getChild(i);
            let doSkip = false;
            if (skipContexts) {
                for(let skipType of skipContexts) {
                    if (c instanceof skipType) {
                        doSkip = true;
                        break;
                    }
                }
            }
            if (!doSkip) {
                let childResult = c.accept(this);
                result = this.aggregateResult(result, childResult);
            }
        }
        return result;
    }

    visitIdentification_division_header(ctx: Identification_division_headerContext) {
        if (ctx.IDENTIFICATION().symbol.charPositionInLine >= 4) {
            this.helper.mark(ctx.IDENTIFICATION(), localize("must_be_in_a", "Must start in A area"));
        }
        //this.visitChildren(ctx);
    }

    visitEnd_program_header(ctx: End_program_headerContext) {
        if (ctx.END().symbol.charPositionInLine >= 4) {
            this.helper.mark(ctx.END(), localize("must_be_in_a", "Must start in A area"));
        }
        //this.visitChildren(ctx);
    }

    visitDeclaratives_header(ctx: Declaratives_headerContext) {
        if (ctx.DECLARATIVES().symbol.charPositionInLine >= 4) {
            this.helper.mark(ctx.DECLARATIVES(), localize("must_be_in_a", "Must start in A area"));
        }
        //this.visitChildren(ctx);
    }

    visitEnd_declaratives(ctx: End_declarativesContext) {
        if (ctx.END().symbol.charPositionInLine >= 4) {
            this.helper.mark(ctx.END(), localize("must_be_in_a", "Must start in A area"));
        }
        //this.visitChildren(ctx);
    }

    visitParagraph(ctx: ParagraphContext) {
        if (ctx.paragraph_name().USER_DEFINED_WORD_().symbol.charPositionInLine >= 4) {
            this.helper.mark(ctx.paragraph_name(), localize("must_be_in_a", "Must start in A area"));
        }
        this.visitChildren(ctx);
    }

    visitSection_header(ctx: Section_headerContext) {
        if (ctx.section_name().USER_DEFINED_WORD_().symbol.charPositionInLine >= 4) {
            this.helper.mark(ctx.section_name(), localize("must_be_in_a", "Must start in A area"));
        }
        this.visitChildren(ctx);
    }

    visitProgram_id(ctx: Program_idContext) {
        this.helper.verifyTextLengthRange(ctx.program_name(), 1, 31);
        let with_ident_ctx = ctx.with_ident();
        if (with_ident_ctx !== undefined) {
            this.helper.verifyTextLengthRange(with_ident_ctx.ident_string(), 1, 31);
        }
        let programCtx = firstContainingContext(ctx, ProgramContext);
        if (programCtx !== undefined && programCtx.parent instanceof ProgramContext) {
            if (with_ident_ctx !== undefined) {
                this.helper.mark(with_ident_ctx, localize("not_in_contained_program", "Cannot be used in a contained program"));
            }
        } else {
            let common_initial = ctx.common_initial();
            if (common_initial !== undefined) {
                let common = common_initial.COMMON();
                if (common !== undefined) {
                    this.helper.mark(common, localize("must_in_contained_program", "May be used only in a contained program"));
                }
            }
        }
        //this.visitChildren(ctx);
    }

    visitEnd_program(ctx: End_programContext) {
        this.helper.verifyName(ctx.program_name(), true, [ProgramSymbol]);
        //this.visitChildren(ctx);
    }

    visitConfiguration_section(ctx: Configuration_sectionContext) {
        let programCtx = firstContainingContext(ctx, ProgramContext);
        if (programCtx && programCtx.parent instanceof ProgramContext) {
            this.helper.mark(ctx, localize("not_in_contained_program", "Cannot be used in a contained program"));
        }
        this.visitChildren(ctx);
    }

    visitMemory_size_amount(ctx: Memory_size_amountContext) {
        this.helper.verifyIntegerRange(ctx, Number.MIN_SAFE_INTEGER, Number.MAX_SAFE_INTEGER);
        //this.visitChildren(ctx);
    }

    visitProgram_collating(ctx: Program_collatingContext) {
        this.helper.verifyName(ctx.alpha_name(), false, [ALPHABET_Symbol]);
        //this.visitChildren(ctx);
    }

    visitSegment_limit(ctx: Segment_limitContext) {
        this.helper.verifyIntegerRange(ctx.segment_number(), 1, 49);
        //this.visitChildren(ctx);
    }

    visitSpecial_names(ctx: Special_namesContext) {
        let contentCtx = ctx.special_names_content();
        if ((contentCtx === undefined || contentCtx.text.length === 0) && ctx.DOT_().length > 1) {
            this.helper.mark(ctx.DOT_(1), localize("dot_must_end_some", "Must be at the end of nonempty content"))
        }
        this.visitChildren(ctx);
    }

    visitSwitch_num(ctx: Switch_numContext) {
        this.helper.verifyIntegerRange(ctx, 1, 16);
        //this.visitChildren(ctx);
    }

    visitUser_alpha(ctx: User_alphaContext) {
        this.helper.verifyTextLengthRange(ctx.first_literal().STRING_LITERAL_(), 1, 1);
        let lastLitCtx = ctx.last_literal();
        if (lastLitCtx) {
            this.helper.verifyTextLengthRange(lastLitCtx.STRING_LITERAL_(), 1, 1);
        }
        let sameLitCtxArr = ctx.same_literal();
        for (let sameLitCtx of sameLitCtxArr) {
            this.helper.verifyTextLengthRange(sameLitCtx.STRING_LITERAL_(), 1, 1);
        }
        //this.visitChildren(ctx);
    }

    visitSymbol_char(ctx: Symbol_charContext) {
        let symbCharSymbol = this.helper.symbolTable.symbolWithContext(ctx);
        if (symbCharSymbol instanceof SYMBOLIC_CHARACTERS_Symbol) {
            if (symbCharSymbol.resolve(symbCharSymbol.name) !== symbCharSymbol) {
                this.helper.mark(ctx, localize("isnt_unique", "Isn't unique"));
            }
        }
        //this.visitChildren(ctx);
    }

    visitSymb_ch_def_in_alphabet(ctx: Symb_ch_def_in_alphabetContext) {
        this.helper.verifyName(ctx.alpha_name(), false, [ALPHABET_Symbol]);
        //this.visitChildren(ctx);
    }

    visitCurrency_char(ctx: Currency_charContext) {
        let programCtx = firstContainingContext(ctx, ProgramContext);
        let symbols = this.helper.symbolTable.resolveIdentifier([unifyCobolName(ctx.text)], programCtx);
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
            this.helper.mark(theSame.context, localize("already_defined", "Already defined"));
        }
        let text = this.helper.verifyTextLengthRange(ctx.STRING_LITERAL_(), 1, 1);
        if (text && text.match(this.helper.rgxReservedPic)) {
            this.helper.mark(ctx, localize("invalid_currency", "Invalid currency char"));
        }
        //this.visitChildren(ctx);
    }

    visitCursor_is(ctx: Cursor_isContext) {
        let symbol = this.helper.verifyQualifiedName(ctx.qualified_data_item(), false, [DataRecordSymbol]);
        if (symbol instanceof DataRecordSymbol) {
            if (!this.helper.testCursorData(symbol)) {
                this.helper.mark(ctx, localize("invalid_data", "Invalid data description"));
            }
        }
        //this.visitChildren(ctx);
    }

    visitCrt_is(ctx: Crt_isContext) {
        let symbol = this.helper.verifyQualifiedName(ctx.qualified_data_item(), false, [DataRecordSymbol]);
        if (symbol instanceof DataRecordSymbol) {
            if (!this.helper.testCRTData(symbol)) {
                this.helper.mark(ctx, localize("invalid_data", "Invalid data description"));
            }
        }
        //this.visitChildren(ctx);
    }

    visitProc_name(ctx: Proc_nameContext) {
        this.helper.verifyQualifiedName(ctx.qualified_data_item(), true, [ParagraphSymbol, SectionSymbol, DeclarativesSectionSymbol]);
        //this.visitChildren(ctx);
    }

    visitQualified_data_item(ctx: Qualified_data_itemContext) {
        this.helper.verifyQualifiedName(ctx, false, undefined, undefined, [IntrinsicFunctionSymbol]);
        //this.visitChildren(ctx);
    }

    visitStatement(ctx: StatementContext) {
        let childInA = findChildInA(ctx);
        if (childInA) {
            this.helper.mark(childInA, localize("must_be_in_B", "Must start in B area"));
        }
        this.visitChildren(ctx);
    }

    visitInput_source(ctx: Input_sourceContext) {
        this.helper.verifyName(ctx, false, [DeviceSymbol]);
        //this.visitChildren(ctx);
    }

    visitFigurative_constant_witout_all_zero(ctx: Figurative_constant_witout_all_zeroContext) {
        this.helper.verifyName(ctx, false, undefined, [FigurativeConstantSymbol]);
        //this.visitChildren(ctx);
    }

    visitFigurative_constant_zero(ctx: Figurative_constant_zeroContext) {
        this.helper.verifyName(ctx, false, undefined, [FigurativeConstantSymbol]);
        //this.visitChildren(ctx);
    }

    visitFigurative_constant_witout_zero(ctx: Figurative_constant_witout_zeroContext) {
        if (ctx.ALL()) {
            this.helper.verifyName(ctx.ALL(), false, undefined, [FigurativeConstantSymbol]);
        } else {
            this.visitChildren(ctx);
        }
    }

    visitFile_description_entry(ctx: File_description_entryContext) {
        this.visitChildren(ctx, [File_nameContext]);
    }

    visitFile_name(ctx: File_nameContext) {
        this.helper.verifyName(ctx, false, [FileSymbol, SortMergeFileSymbol]);
        //this.visitChildren(ctx);
    }

    visitReport_name(ctx: Report_nameContext) {
        this.helper.verifyName(ctx, false, [ReportFileSymbol]);
        //this.visitChildren(ctx);
    }

    visitClass_condition_name(ctx: Class_condition_nameContext) {
        this.helper.verifyName(ctx, false, [CLASS_Symbol]);
        //this.visitChildren(ctx);
    }

    visitSign_condition_name(ctx: Sign_condition_nameContext) {
        this.helper.verifyName(ctx, false, undefined, [SIGN_Symbol]);
        //this.visitChildren(ctx);
    }

    visitBool_condition_name(ctx: Bool_condition_nameContext) {
        this.helper.verifyName(ctx, false, undefined, [BOOL_Symbol]);
        //this.visitChildren(ctx);
    }

    visitFunction_name(ctx: Function_nameContext) {
        this.helper.verifyName(ctx, false, undefined, [IntrinsicFunctionSymbol]);
        //this.visitChildren(ctx);
    }

    visitValue_is_literal(ctx: Value_is_literalContext) {
        let charSymbNode = ctx.USER_DEFINED_WORD_();
        if (charSymbNode) {
            this.helper.verifyName(charSymbNode, false, [SYMBOLIC_CHARACTERS_Symbol]);
        }
        this.visitChildren(ctx);
    }

    visitUsing(ctx: UsingContext) {
        let programCtx = firstContainingContext(ctx, ProgramContext);
        if (!programCtx) {
            this.helper.mark(ctx, localize("must.be.in.program", "Must be inside program"));
            return;
        }
        let programSymbol = this.helper.symbolTable.symbolWithContext(programCtx);
        if (!(programSymbol instanceof ProgramSymbol)) {
            this.helper.mark(ctx, localize("no.program.symbol", "No program symbol"));
            return;
        }
        if (!programSymbol.definition) {
            this.helper.mark(ctx, localize("no.program.definition", "No definition in programSymbol"));
            return;
        }
        let items = ctx.qualified_data_item();
        for(let item of items) {
            let itemSymbol = this.helper.verifyQualifiedName(item, false, undefined, undefined, [IntrinsicFunctionSymbol]);
            if (itemSymbol instanceof DataRecordSymbol) {
                // add as parameter
                programSymbol.definition.arguments = programSymbol.definition.arguments || [];
                let argument: IValue = {
                    name: itemSymbol.name,
                    type: ValueTypeFromDataUsage(itemSymbol.usage),   // TODO: get type from usage and picture
                };
                programSymbol.definition.arguments.push(argument);
            }
        }
        //this.visitChildren(ctx);
    }

    visitGiving(ctx: GivingContext) {
        let programCtx = firstContainingContext(ctx, ProgramContext);
        if (!programCtx) {
            this.helper.mark(ctx, localize("must.be.in.program", "Must be inside program"));
            return;
        }
        let programSymbol = this.helper.symbolTable.symbolWithContext(programCtx);
        if (!(programSymbol instanceof ProgramSymbol)) {
            this.helper.mark(ctx, localize("no.program.symbol", "No program symbol"));
            return;
        }
        if (!programSymbol.definition) {
            this.helper.mark(ctx, localize("no.program.definition", "No definition in programSymbol"));
            return;
        }
        let item = ctx.qualified_data_item();
        let itemSymbol = this.helper.verifyQualifiedName(item, false, undefined, undefined, [IntrinsicFunctionSymbol]);
        if (itemSymbol instanceof DataRecordSymbol) {
            // add as program type
            programSymbol.definition.type = ValueTypeFromDataUsage(itemSymbol.usage);   // TODO: get type from usage and picture
        }
        //this.visitChildren(ctx);
    }

    visitProg_name(ctx: Prog_nameContext) {
        let symbol = this.helper.verifyNamePath(ctx, [ctx], false, undefined, undefined, [IntrinsicFunctionSymbol]);
        if (symbol) {
            if (ctx.USER_DEFINED_WORD_()) {
                // symbol must not be a Program
                if (symbol instanceof ProgramSymbol) {
                    this.helper.mark(ctx, localize("must.be.literal", "Must be enclosed in quotas"));
                }
            }
        }
    }
}