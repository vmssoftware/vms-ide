import * as nls from "vscode-nls";
import { cobolVisitor } from "../parser/cobolVisitor";
import { AbstractParseTreeVisitor } from "antlr4ts/tree";
import { Program_idContext, ProgramContext, End_programContext, Configuration_sectionContext, Memory_size_amountContext, Program_collatingContext, Segment_limitContext, Special_namesContext, Switch_numContext, User_alphaContext, Symbol_charContext, Symb_ch_def_in_alphabetContext, Currency_charContext, Cursor_isContext, Crt_isContext, Proc_nameContext, Qualified_data_itemContext, StatementContext, Input_sourceContext, Figurative_constant_witout_all_zeroContext, Figurative_constant_zeroContext, Figurative_constant_witout_zeroContext, File_nameContext, Report_nameContext, Class_condition_nameContext, Sign_condition_nameContext, Bool_condition_nameContext, Function_nameContext, Value_is_literalContext } from "../parser/cobolParser";
import { CobolAnalisisHelper } from "./CobolAnalisisHelpers";
import { firstContainingContext, findChildInA } from "../../common/parser/Helpers";
import { ProgramSymbol, ALPHABET_Symbol, SYMBOLIC_CHARACTERS_Symbol, CURRENCY_Symbol, DataRecordSymbol, ParagraphSymbol, SectionSymbol, DeclarativesSectionSymbol, IntrincisFunctionSymbol, DeviceSymbol, FigurativeConstantSymbol, FileSymbol, SortMergeFileSymbol, ReportFileSymbol, CLASS_Symbol, SIGN_Symbol, BOOL_Symbol } from "./CobolSymbol";
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

    visitProgram_id(ctx: Program_idContext) {
        this.helper.verifyTextLengthRange(ctx.program_name(), 1, 31);
        let with_ident_ctx = ctx.with_ident();
        if (with_ident_ctx !== undefined) {
            this.helper.verifyTextLengthRange(with_ident_ctx.ident_string(), 1, 31, true);
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
        this.helper.verifyTextLengthRange(ctx.first_literal().STRING_LITERAL_(), 1, 1, true);
        let lastLitCtx = ctx.last_literal();
        if (lastLitCtx) {
            this.helper.verifyTextLengthRange(lastLitCtx.STRING_LITERAL_(), 1, 1, true);
        }
        let sameLitCtxArr = ctx.same_literal();
        for (let sameLitCtx of sameLitCtxArr) {
            this.helper.verifyTextLengthRange(sameLitCtx.STRING_LITERAL_(), 1, 1, true);
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
        let symbols = this.helper.symbolTable.resolveIdentifier([ctx.text], programCtx);
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
        let text = this.helper.verifyTextLengthRange(ctx.STRING_LITERAL_(), 1, 1, true);
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
        this.helper.verifyQualifiedName(ctx, false, undefined, undefined, [IntrincisFunctionSymbol]);
        //this.visitChildren(ctx);
    }

    visitStatement(ctx: StatementContext) {
        let childInA = findChildInA(ctx);
        if (childInA) {
            this.helper.mark(childInA, localize("must_be_in_B", "This token must be in B area"));
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
        this.helper.verifyName(ctx, false, undefined, [IntrincisFunctionSymbol]);
        //this.visitChildren(ctx);
    }

    visitValue_is_literal(ctx: Value_is_literalContext) {
        let charSymbNode = ctx.USER_DEFINED_WORD_();
        if (charSymbNode) {
            this.helper.verifyName(charSymbNode, false, [SYMBOLIC_CHARACTERS_Symbol]);
        }
        this.visitChildren(ctx);
    }
}