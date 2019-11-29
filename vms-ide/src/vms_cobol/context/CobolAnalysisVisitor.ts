import * as nls from "vscode-nls";
import { cobolVisitor } from "../parser/cobolVisitor";
import { AbstractParseTreeVisitor, TerminalNode } from "antlr4ts/tree";
import {
    ArgumentContext,
    Bool_condition_nameContext,
    Call_givingContext,
    Call_statementContext,
    Call_usingContext,
    Class_condition_nameContext,
    Cobol_sourceContext,
    Configuration_sectionContext,
    Crt_isContext,
    Currency_charContext,
    Cursor_isContext,
    Data_description_clauseContext,
    Data_description_entryContext,
    Declaratives_headerContext,
    End_declarativesContext,
    End_programContext,
    End_program_headerContext,
    Fd_clauseContext,
    Figurative_constant_witout_all_zeroContext,
    Figurative_constant_witout_zeroContext,
    Figurative_constant_zeroContext,
    File_description_entryContext,
    File_nameContext,
    File_sectionContext,
    Function_nameContext,
    GivingContext,
    Identification_division_headerContext,
    IdentifierContext,
    Identifier_resultContext,
    Input_sourceContext,
    Memory_size_amountContext,
    OccursContext,
    ParagraphContext,
    PictureContext,
    Proc_nameContext,
    Prog_nameContext,
    ProgramContext,
    Program_collatingContext,
    Program_idContext,
    Qualified_data_itemContext,
    Rd_clauseContext,
    Reference_modificationContext,
    RenamesContext,
    Report_description_entryContext,
    Report_group_data_description_clauseContext,
    Report_group_data_description_entryContext,
    Report_nameContext,
    Screen_description_clauseContext,
    Screen_description_entryContext,
    Sd_clauseContext,
    Section_headerContext,
    Segment_limitContext,
    SelectContext,
    Select_clauseContext,
    Sign_condition_nameContext,
    Sort_merge_file_description_entryContext,
    Special_namesContext,
    StatementContext,
    SubscriptingContext,
    Switch_numContext,
    Symb_ch_def_in_alphabetContext,
    Symbol_charContext,
    User_alphaContext,
    UsingContext,
    Using_argContext,
    Value_is_literalContext,
    Working_storage_sectionContext,
    File_descriptionContext,
    Record_keyContext,
    Display_statementContext,
    Out_destContext,
    Arg_env_acceptContext,
    Alt_record_keyContext,
    Other_data_itemContext,
} from "../parser/cobolParser";

import { CobolAnalisisHelper } from "./CobolAnalisisHelpers";

import {
    firstContainingContext,
    findChildInA,
    unifyCobolName,
    mostContainingContext
} from "../../common/parser/Helpers";

import {
    ALPHABET_Symbol,
    BOOL_Symbol,
    CLASS_Symbol,
    CURRENCY_Symbol,
    DataRecordSymbol,
    DeclarativesSectionSymbol,
    DeviceSymbol,
    EDataUsage,
    FigurativeConstantSymbol,
    FileSymbol,
    IntrinsicFunctionSymbol,
    ParagraphSymbol,
    ProgramSymbol,
    SIGN_Symbol,
    SYMBOLIC_CHARACTERS_Symbol,
    SectionSymbol,
    EFileFormat,
    ReportSymbol,
    ENVIRONMENT_VALUE_Symbol,
    ARGUMENT_NUMBER_Symbol,
    ARGUMENT_VALUE_Symbol,
    ENVIRONMENT_NAME_Symbol,
    firstContainingSymbol,
    ReportRecordSymbol,
    EReportType,
    ScreenRecordSymbol,
    EScreenType,
} from "./CobolSymbol";

import {
    Symbol,
} from 'antlr4-c3';

import { ParserRuleContext } from "antlr4ts";

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export class CobolAnalysisVisitor extends AbstractParseTreeVisitor<void> implements cobolVisitor<void> {

    public callStatements: Call_statementContext[] = [];

    constructor(public helper: CobolAnalisisHelper) {
        super();
    }

    protected defaultResult(): void {
        // throw new Error("Method not implemented.");
    }

    visitChildren<T extends ParserRuleContext, F extends new (...args: any[]) => T>(node: ParserRuleContext, skipContexts?: F[]) {
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

    visitCobol_source(ctx: Cobol_sourceContext) {
        this.visitChildren(ctx);
        // analyze CALL after all PROGRAM is defined
        for(let callCtx of this.callStatements) {
            this.analizeCallStatement(callCtx);
        }
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
        let nameCtx = ctx.paragraph_name().USER_DEFINED_WORD_() || ctx.paragraph_name().INTEGER_LITERAL_();
        if (nameCtx && nameCtx.symbol.charPositionInLine >= 4) {
            this.helper.mark(ctx.paragraph_name(), localize("must_be_in_a", "Must start in A area"));
        }
        this.visitChildren(ctx);
    }

    visitSection_header(ctx: Section_headerContext) {
        let nameCtx = ctx.section_name().USER_DEFINED_WORD_() || ctx.section_name().INTEGER_LITERAL_();
        if (nameCtx && nameCtx.symbol.charPositionInLine >= 4) {
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
        let symbol = this.helper.verifyName(ctx.program_name(), true, [ProgramSymbol]);
        if (symbol instanceof ProgramSymbol) {
            if (!symbol.context) {
                this.helper.mark(ctx.program_name(), localize("must.link.here", "Must link into this source"));
            } else {
                // test if
                if (symbol.endProgramCtx) {
                    this.helper.mark(ctx.program_name(), localize("program.already.ended", "Program has already ended"));
                } else {
                    symbol.endProgramCtx = ctx.program_name();
                }
                let innerPrograms = symbol.getNestedSymbolsOfType(ProgramSymbol);
                for(let inner of innerPrograms) {
                    if (!inner.endProgramCtx) {
                        // end program now
                        inner.endProgramCtx = ctx.program_name();
                        if (inner.context instanceof ParserRuleContext) {
                            this.helper.mark(inner.context, localize("program.not.ended", "Program hasn't properly ended"));
                        }
                    }
                }
            }
        }
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

    //visitFil

    visitCursor_is(ctx: Cursor_isContext) {
        let symbol = this.helper.verifyQualifiedName(ctx.qualified_data_item(), false, undefined, [DataRecordSymbol]);
        if (symbol instanceof DataRecordSymbol) {
            if (!this.helper.testCursorData(symbol)) {
                this.helper.mark(ctx, localize("invalid_data", "Invalid data description"));
            }
        }
        //this.visitChildren(ctx);
    }

    visitCrt_is(ctx: Crt_isContext) {
        let symbol = this.helper.verifyQualifiedName(ctx.qualified_data_item(), false, undefined, [DataRecordSymbol]);
        if (symbol instanceof DataRecordSymbol) {
            if (!this.helper.testCRTData(symbol)) {
                this.helper.mark(ctx, localize("invalid_data", "Invalid data description"));
            }
        }
        //this.visitChildren(ctx);
    }

    visitProc_name(ctx: Proc_nameContext) {
        this.helper.verifyQualifiedName(ctx.qualified_data_item(), true, undefined, [ParagraphSymbol, SectionSymbol, DeclarativesSectionSymbol]);
        //this.visitChildren(ctx);
    }

    visitQualified_data_item(ctx: Qualified_data_itemContext) {
        this.helper.verifyQualifiedName(ctx, false, undefined, undefined, [IntrinsicFunctionSymbol, ProgramSymbol]);
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
    }

    visitArg_env_accept(ctx: Arg_env_acceptContext) {
        this.helper.verifyName(ctx, false, [ARGUMENT_NUMBER_Symbol, ARGUMENT_VALUE_Symbol, ENVIRONMENT_NAME_Symbol, ENVIRONMENT_VALUE_Symbol]);
    }

    visitDisplay_statement(ctx: Display_statementContext) {
        this.visitChildren(ctx);
    }

    visitOut_dest(ctx: Out_destContext) {
        this.helper.verifyName(ctx, false, [DeviceSymbol, ARGUMENT_NUMBER_Symbol, ARGUMENT_VALUE_Symbol, ENVIRONMENT_NAME_Symbol, ENVIRONMENT_VALUE_Symbol]);
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

    visitFile_description(ctx: File_descriptionContext) {
        this.visitChildren(ctx);
    }

    visitSelect(ctx: SelectContext) {
        this.visitChildren(ctx);
    }

    visitFile_description_entry(ctx: File_description_entryContext) {
        let fileSymbol = this.helper.verifyName(ctx.file_name());
        if (fileSymbol instanceof FileSymbol) {
            if (fileSymbol.fileFormat === EFileFormat.Sequentional) {
                for(let fd_clause of ctx.fd_clause()) {
                    if (fd_clause.report_is()) {
                        fileSymbol.fileFormat = EFileFormat.Report;
                        break;
                    }
                }
            }
            let selectClauses: Select_clauseContext[] = [];
            if (fileSymbol.context instanceof SelectContext) {
                selectClauses = fileSymbol.context.select_clause();
            }

            for(let fd_clause of ctx.fd_clause()) {
                if (fd_clause.linage() && fileSymbol.fileFormat !== EFileFormat.Sequentional) {
                    this.helper.mark(fd_clause, localize("must.be.sequentional", "File must be sequentional"));
                }
                if (fd_clause.code_set() && !(fileSymbol.fileFormat === EFileFormat.Sequentional || fileSymbol.fileFormat === EFileFormat.Report)) {
                    this.helper.mark(fd_clause, localize("must.be.seq.or.rep", "File must be sequentional or report"));
                }
                if (fd_clause.record_key() && fileSymbol.fileFormat !== EFileFormat.Indexed) {
                    this.helper.mark(fd_clause, localize("must.be.indexed", "File must be indexed"));
                }
                if (fd_clause.alt_record_key() && fileSymbol.fileFormat !== EFileFormat.Indexed) {
                    this.helper.mark(fd_clause, localize("must.be.indexed", "File must be indexed"));
                }
                if (fd_clause.block_contains()) {
                    if (selectClauses.some(x => x.block_contains())) {
                        this.helper.mark(fd_clause, localize("duplicated", "Duplicated in SELECT"));
                    }
                }
                if (fd_clause.code_set()) {
                    if (selectClauses.some(x => x.code_set())) {
                        this.helper.mark(fd_clause, localize("duplicated", "Duplicated in SELECT"));
                    }
                }
                if (fd_clause.access_mode()) {
                    if (selectClauses.some(x => x.access_mode())) {
                        this.helper.mark(fd_clause, localize("duplicated", "Duplicated in SELECT"));
                    }
                }
                if (fd_clause.record_key()) {
                    if (selectClauses.some(x => x.record_key())) {
                        this.helper.mark(fd_clause, localize("duplicated", "Duplicated in SELECT"));
                    }
                }
                if (fd_clause.alt_record_key()) {
                    if (selectClauses.some(x => x.alt_record_key())) {
                        this.helper.mark(fd_clause, localize("duplicated", "Duplicated in SELECT"));
                    }
                }
                if (fd_clause.file_status()) {
                    if (selectClauses.some(x => x.file_status())) {
                        this.helper.mark(fd_clause, localize("duplicated", "Duplicated in SELECT"));
                    }
                }
            }
        } else {
            this.helper.mark(ctx, localize("no.select", "There is no select clause for this file"));
        }
        this.visitChildren(ctx);
    }

    visitFd_clause(ctx: Fd_clauseContext) {
        let fileDescriptionCtx = firstContainingContext(ctx, File_description_entryContext);
        if (fileDescriptionCtx) {
            // allow multiple alternate record keys
            if (ctx.childCount > 0 && !(ctx.getChild(0) instanceof Alt_record_keyContext)) {
                this.helper.testDuplicates(fileDescriptionCtx, ctx);
            }
        }
        this.visitChildren(ctx);
    }

    visitSd_clause(ctx: Sd_clauseContext) {
        let sortDescriptionCtx = firstContainingContext(ctx, Sort_merge_file_description_entryContext);
        if (sortDescriptionCtx) {
            this.helper.testDuplicates(sortDescriptionCtx, ctx);
        }
        this.visitChildren(ctx);
    }

    visitRd_clause(ctx: Rd_clauseContext) {
        let reportDescriptionCtx = firstContainingContext(ctx, Report_description_entryContext);
        if (reportDescriptionCtx) {
            this.helper.testDuplicates(reportDescriptionCtx, ctx);
        }
        this.visitChildren(ctx);
    }

    visitReport_group_data_description_entry(ctx: Report_group_data_description_entryContext) {
        let reportRecordSymbol = this.helper.symbolTable.symbolWithContext(ctx);
        if (reportRecordSymbol instanceof ReportRecordSymbol) {
            if (reportRecordSymbol.level === undefined) {
                this.helper.mark(ctx, localize("invalid.datarecord.level", "Invalid data record level"));
                return;
            }
            if (reportRecordSymbol.isGroup) {
                // format 2
                if (reportRecordSymbol.level < 1 || reportRecordSymbol.level > 48) {
                    this.helper.mark(ctx, localize("invalid.datarecord.level", "Invalid data record level"));
                }
            } else {
                // format 3
                if (reportRecordSymbol.level < 2 || reportRecordSymbol.level > 49) {
                    this.helper.mark(ctx, localize("invalid.datarecord.level", "Invalid data record level"));
                }
            }
        }
        this.visitChildren(ctx);
    }

    visitReport_group_data_description_clause(ctx: Report_group_data_description_clauseContext) {
        let reportGroupDescriptionCtx = firstContainingContext(ctx, Report_group_data_description_entryContext);
        if (reportGroupDescriptionCtx) {
            this.helper.testDuplicates(reportGroupDescriptionCtx, ctx);
            let reportRecordSymbol = this.helper.symbolTable.symbolWithContext(reportGroupDescriptionCtx);
            if (reportRecordSymbol instanceof ReportRecordSymbol) {
                if (reportRecordSymbol.level === undefined) {
                    return;
                }
                if (reportRecordSymbol.level !== 1) {
                    // not a format 1
                    let ctx01 = ctx.rep_type() || ctx.rep_next_group();
                    if (ctx01) {
                        this.helper.mark(ctx01, localize("only.for.01", "Allowed only on level 01"));
                    }
                }
                if (reportRecordSymbol.isGroup) {
                    // not a format 3
                    let bannedCtx = ctx.black_when_zero() || 
                        ctx.rep_column() || 
                        ctx.rep_group_ind() ||
                        ctx.justified() ||
                        ctx.picture() ||
                        ctx.sign_is() ||
                        ctx.rep_source_sum_or_value();
                    if (bannedCtx) {
                        this.helper.mark(bannedCtx, localize("for.elementary.only", "Can appear only in elementary items"));
                    }
                }
                let repLineNum = ctx.rep_line_num();
                if (repLineNum) {
                    reportRecordSymbol.hasLineNumber = true;
                    let parent = reportRecordSymbol.parent;
                    while(parent !== undefined) {
                        if (parent instanceof ReportRecordSymbol) {
                            if (parent.hasLineNumber) {
                                this.helper.mark(repLineNum, localize("already.has.line.num", "Already has a LINE NUMBER clause"));
                            }
                        } else {
                            break;
                        }
                        parent = parent.parent;
                    }
                }
                let repColumn = ctx.rep_column();
                if (repColumn && !reportRecordSymbol.hasLineNumber) {
                    let foundLineNum = false;
                    let parent = reportRecordSymbol.parent;
                    while(parent !== undefined) {
                        if (parent instanceof ReportRecordSymbol) {
                            if (parent.hasLineNumber) {
                                foundLineNum = true;
                                break;
                            }
                        } else {
                            break;
                        }
                        parent = parent.parent;
                    }
                    if (!foundLineNum) {
                        this.helper.mark(repColumn, localize("must.have.line.num", "Must have corresponding LINE NUMBER clause"));
                    }
                }
                let sumOrValCtx = ctx.rep_source_sum_or_value();
                if (sumOrValCtx) {
                    let valCtx = sumOrValCtx.rep_value_is();
                    if (valCtx && ctx.parent instanceof Report_group_data_description_entryContext) {
                        let foundColumn = false;
                        for (let clause of ctx.parent.report_group_data_description_clause()) {
                            if (clause.rep_column()) {
                                foundColumn = true;
                                break;
                            }
                        }
                        if (!foundColumn) {
                            this.helper.mark(valCtx, localize("must.have.column", "Must also have COLUMN NUMBER clause"));
                        }
                    }
                }
                let beginGroupCtx = mostContainingContext(ctx, Report_group_data_description_clauseContext);
                if (beginGroupCtx) {
                    let beginGroupSymbol = this.helper.symbolTable.symbolWithContext(beginGroupCtx);
                    if (beginGroupSymbol instanceof ReportRecordSymbol) {
                        let groupIndicate = ctx.rep_group_ind();
                        if (groupIndicate && beginGroupSymbol.reportType !== EReportType.DE ) {
                            this.helper.mark(groupIndicate, localize("for.detail.only", "Can appear only in a DETAIL report group"));
                        }
                        if (sumOrValCtx && sumOrValCtx.rep_sum() && beginGroupSymbol.reportType !== EReportType.CF ) {
                            this.helper.mark(sumOrValCtx, localize("for.cf.only", "Can appear only in a CONTROL FOOTING report group"));
                        }
                    }
                }
            }
        }
        this.visitChildren(ctx);
    }

    visitScreen_description_entry(ctx: Screen_description_entryContext) {
        let screenSymbol = this.helper.symbolTable.symbolWithContext(ctx);
        if (screenSymbol instanceof ScreenRecordSymbol) {
            if (screenSymbol.level === 1 && !screenSymbol.name) {
                this.helper.mark(ctx, localize("mast.have.screen.name", "Each level 01 item must have a screen name"));
            }
        }
        this.visitChildren(ctx);
    }

    visitScreen_description_clause(ctx: Screen_description_clauseContext) {
        let screenDescriptionCtx = firstContainingContext(ctx, Screen_description_entryContext);
        if (screenDescriptionCtx) {
            this.helper.testDuplicates(screenDescriptionCtx, ctx);
            let screenSymbol = this.helper.symbolTable.symbolWithContext(ctx);
            if (screenSymbol instanceof ScreenRecordSymbol) {
                if (screenSymbol.screenType === EScreenType.group) {
                    let blank = ctx.scr_blank();
                    if (blank && blank.LINE()) {
                        this.helper.mark(ctx, localize("only.blank.screen", "Only BLANK SCREEN allowed in group"));
                    }
                }
                let bannedInVal = ctx.scr_auto() ||
                    ctx.scr_secure() ||
                    ctx.scr_required() ||
                    ctx.scr_full() ||
                    ctx.usage_display();
                if (bannedInVal && screenSymbol.screenType === EScreenType.value) {
                    this.helper.mark(bannedInVal, localize("does.not.allowed.here", "Does not allowed here"));
                }
                let bannedInGroup = ctx.scr_bell() ||
                    ctx.scr_blink() ||
                    ctx.scr_erase() ||
                    ctx.scr_light() ||
                    ctx.scr_reverse() ||
                    ctx.scr_underline() ||
                    ctx.scr_line() ||
                    ctx.scr_column();
                if (bannedInGroup && screenSymbol.screenType === EScreenType.group) {
                    this.helper.mark(bannedInGroup, localize("does.not.allowed.here", "Does not allowed here"));
                }
            }
        }
        this.visitChildren(ctx);
    }

    visitSelect_clause(ctx: Select_clauseContext) {
        let selectCtx = firstContainingContext(ctx, SelectContext);
        if (selectCtx) {
            // allow multiple alternate record keys
            if (ctx.childCount > 0 && !(ctx.getChild(0) instanceof Alt_record_keyContext)) {
                this.helper.testDuplicates(selectCtx, ctx);
            }
        }
        this.visitChildren(ctx);
    }

    visitFile_name(ctx: File_nameContext) {
        this.helper.verifyName(ctx, false, [FileSymbol]);
        //this.visitChildren(ctx);
    }

    visitReport_name(ctx: Report_nameContext) {
        this.helper.verifyName(ctx, false, [ReportSymbol]);
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
        if (!programSymbol.programDefinition) {
            this.helper.mark(ctx, localize("no.program.definition", "No definition in programSymbol"));
            return;
        }
        let items = ctx.qualified_data_item();
        for(let item of items) {
            let itemSymbol = this.helper.verifyQualifiedName(item, false, undefined, undefined, [IntrinsicFunctionSymbol, ProgramSymbol]);
            if (itemSymbol instanceof DataRecordSymbol) {
                // add as parameter
                programSymbol.programDefinition.arguments.push( {
                    name: itemSymbol.name, 
                    usage: itemSymbol.usage
                });
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
        if (!programSymbol.programDefinition) {
            this.helper.mark(ctx, localize("no.program.definition", "No definition in programSymbol"));
            return;
        }
        let item = ctx.qualified_data_item();
        let itemSymbol = this.helper.verifyQualifiedName(item, false, undefined, undefined, [IntrinsicFunctionSymbol, ProgramSymbol]);
        if (itemSymbol instanceof DataRecordSymbol) {
            // add as program type
            programSymbol.programDefinition.usage = itemSymbol.usage;
        }
        //this.visitChildren(ctx);
    }

    visitProg_name(ctx: Prog_nameContext) {
        let symbol = this.helper.verifyNamePath(ctx, [ctx], false, undefined, [ProgramSymbol]);
        if (symbol) {
            if (ctx.identifier_result()) {
                // symbol must not be a Program
                if (symbol instanceof ProgramSymbol) {
                    this.helper.mark(ctx, localize("must.be.literal", "Must be enclosed in quotas"));
                }
            }
        }
    }

    visitData_description_entry(ctx: Data_description_entryContext) {
        let dataRecordSymbol = this.helper.symbolTable.symbolWithContext(ctx);
        if (dataRecordSymbol instanceof DataRecordSymbol) {
            if (dataRecordSymbol.level != undefined) {
                switch (true) {
                    case dataRecordSymbol.level >= 1 && dataRecordSymbol.level <= 49:
                    case dataRecordSymbol.level === 66:
                    case dataRecordSymbol.level === 77:
                    case dataRecordSymbol.level === 88:
                        break;
                    default:
                        this.helper.mark(ctx, localize("invalid.datarecord.level", "Invalid data record level"));
                        break;
                }
                if (dataRecordSymbol.level === 66) {
                    if (dataRecordSymbol.parent instanceof DataRecordSymbol) {
                        if (dataRecordSymbol.parent.level === 66 || dataRecordSymbol.parent.level === 88) {
                            this.helper.mark(ctx, localize("conditional.cannot.assosiated.66.88", "A condition-name cannot be associated with a level 66 or 88 item"));
                        }
                        if (dataRecordSymbol.parent.usage === EDataUsage.INDEX) {
                            this.helper.mark(ctx, localize("conditional.cannot.assosiated.index", "A condition-name cannot be associated with an index data item"));
                        }
                    }
                }
            }
            if (!dataRecordSymbol.isGroup && !(dataRecordSymbol.level === 66 || dataRecordSymbol.level === 88)) {
                // check picture for elementary
                switch(dataRecordSymbol.usage) {
                    case EDataUsage.INDEX:
                    case EDataUsage.COMP_1:
                    case EDataUsage.COMP_2:
                    case EDataUsage.FLOAT_SHORT:
                    case EDataUsage.FLOAT_LONG:
                    case EDataUsage.FLOAT_EXTENDED:
                    case EDataUsage.COMPUTATIONAL_1:
                    case EDataUsage.COMPUTATIONAL_2:
                    case EDataUsage.POINTER:
                    case EDataUsage.POINTER_64:
                        // mast have no picture - checked in visitPicture to highlight appropriate text
                        break;
                    default:
                        if (!dataRecordSymbol.picture) {
                            this.helper.mark(ctx, localize("picture.must.be", "There must be a PICTURE clause"));
                        }
                }
            }
            let fileSymbol = firstContainingSymbol(dataRecordSymbol, FileSymbol);
            if (fileSymbol !== undefined) {
                if (fileSymbol.fileFormat === EFileFormat.Report) {
                    this.helper.mark(ctx, localize("no.records.allowed.in.report", "No record description entries may follow the file description entry for a report file."));
                }
            }
        }
        this.visitChildren(ctx);
    }

    visitPicture(ctx: PictureContext) {
        let dataRecordCtx = firstContainingContext(ctx, Data_description_entryContext);
        if (dataRecordCtx) {
            let dataRecordSymbol = this.helper.symbolTable.symbolWithContext(dataRecordCtx);
            if (dataRecordSymbol instanceof DataRecordSymbol) {
                // check picture
                switch(dataRecordSymbol.usage) {
                    case EDataUsage.INDEX:
                    case EDataUsage.COMP_1:
                    case EDataUsage.COMP_2:
                    case EDataUsage.FLOAT_SHORT:
                    case EDataUsage.FLOAT_LONG:
                    case EDataUsage.FLOAT_EXTENDED:
                    case EDataUsage.COMPUTATIONAL_1:
                    case EDataUsage.COMPUTATIONAL_2:
                    case EDataUsage.POINTER:
                    case EDataUsage.POINTER_64:
                        // mast have no picture
                        this.helper.mark(ctx, localize("no.picture.must.be", "There must be no PICTURE clause"));
                        break;
                }
            }
        }
    }

    visitOther_data_item(ctx: Other_data_itemContext) {
        this.helper.verifyName(ctx, true, undefined, [DataRecordSymbol]);
        //this.visitChildren(ctx);
    }

    visitData_description_clause(ctx: Data_description_clauseContext) {
        let dataRecordCtx = firstContainingContext(ctx, Data_description_entryContext);
        if (dataRecordCtx) {
            this.helper.testDuplicates(dataRecordCtx, ctx);
            let dataRecordSymbol = this.helper.symbolTable.symbolWithContext(dataRecordCtx);
            if (dataRecordSymbol instanceof DataRecordSymbol) {
                if (ctx.is_external()) {
                    // check level number
                    let workingStorageSection = firstContainingContext(ctx, Working_storage_sectionContext);
                    if (workingStorageSection) {
                        switch (dataRecordSymbol.level) {
                            case 1:
                            case 77:
                                break;
                            default:
                                this.helper.mark(ctx, localize("external.invalid.ws", "Only level numbers 01 and 77 can specify the EXTERNAL clause"));
                                break;
                        }
                    } else {
                        this.helper.mark(ctx, localize("external.invalid", "The EXTERNAL clause may appear only in WORKING-STORAGE SECTION"));
                    }
                    // check redefines
                    if (dataRecordCtx.REDEFINES()) {
                        this.helper.mark(ctx, localize("external.redefines", "The EXTERNAL and REDEFINES clauses cannot be in the same data description entry."));
                    }
                    // check name exists
                    if (!dataRecordCtx.data_name()) {
                        this.helper.mark(ctx, localize("external.dataname", "The data-name must appear"));
                    }
                }
                if (ctx.is_global()) {
                    // check level
                    let workingStorageSection = firstContainingContext(ctx, Working_storage_sectionContext);
                    if (workingStorageSection) {
                        switch (dataRecordSymbol.level) {
                            case 1:
                            case 77:
                                break;
                            default:
                                this.helper.mark(ctx, localize("global.invalid.ws", "Only level numbers 01 and 77 can specify the GLOBAL clause in WORKING-STORAGE SECTION"));
                                break;
                        }
                    } else {
                        let fileSection = firstContainingContext(ctx, File_sectionContext);
                        if (fileSection && dataRecordSymbol.level !== 1) {
                            this.helper.mark(ctx, localize("global.invalid.fs", "Only level numbers 01 can specify the GLOBAL clause in FILE SECTION"));
                        } else {
                            this.helper.mark(ctx, localize("global.invalid", "The GLOBAL clause may appear only in WORKING-STORAGE or FILE SECTIONs"));
                        }
                    }
                    // check name exists
                    if (!dataRecordCtx.data_name()) {
                        this.helper.mark(ctx, localize("global.dataname", "The data-name must appear"));
                    }
                }
                // test conditional
                if (dataRecordSymbol.level === 88 && !ctx.value_is()) {
                    this.helper.mark(ctx, localize("invalid.conditional", "Must not be in conditional"));
                }
                if (dataRecordSymbol.isGroup) {
                    let bannedCtx = ctx.synchronized_lr() ||
                        ctx.black_when_zero() ||
                        ctx.justified() ||
                        ctx.picture();
                    if (bannedCtx) {
                        this.helper.mark(bannedCtx, localize("for.elementary.only", "Can appear only in elementary items"));
                    }
                }
            }
        }
        this.visitChildren(ctx);
    }

    visitRenames(ctx: RenamesContext) {
        let dataRecordCtx = firstContainingContext(ctx, Data_description_entryContext);
        if (dataRecordCtx) {
            let dataRecordSymbol = this.helper.symbolTable.symbolWithContext(dataRecordCtx);
            if (dataRecordSymbol instanceof DataRecordSymbol) {
                if (dataRecordSymbol.level !== 66) {
                    this.helper.mark(ctx, localize("renames.invalid", "Only level numbers 66 can specify the RENAMES clause"));
                }
                if (dataRecordSymbol.picture) {
                    this.helper.mark(ctx, localize("no.picture.must.be", "There must be no PICTURE clause"));
                }
            }
        }
        this.visitChildren(ctx);
    }

    visitOccurs(ctx: OccursContext) {
        let dataRecordCtx = firstContainingContext(ctx, Data_description_entryContext);
        if (dataRecordCtx) {
            let dataRecordSymbol = this.helper.symbolTable.symbolWithContext(dataRecordCtx);
            if (dataRecordSymbol instanceof DataRecordSymbol) {
                switch(dataRecordSymbol.level) {
                    case 1:
                    case 66:
                    case 77:
                    case 88:
                        this.helper.mark(ctx, localize("occurs.invalid", "OCCURS clause cannot be used in a data description entry that has a level-number of 01, 66, 77 or 88"));
                        break;
                }
            }
        }
        this.visitChildren(ctx);
    }

    visitCall_statement(ctx: Call_statementContext) {
        // analize them later
        this.callStatements.push(ctx);
    }

    public testAllowedTypes(testType: EDataUsage | undefined, allowedType: EDataUsage) {
        if (testType === undefined || testType === allowedType) {
            return true;
        }
        switch(allowedType) {
            case EDataUsage.COMP:
            case EDataUsage.BINARY:
            case EDataUsage.COMPUTATIONAL:
            case EDataUsage.COMPUTATIONAL_5:
            case EDataUsage.COMPUTATIONAL_X:
                return testType === EDataUsage.COMP ||
                       testType === EDataUsage.BINARY || 
                       testType === EDataUsage.COMPUTATIONAL || 
                       testType === EDataUsage.COMPUTATIONAL_5 || 
                       testType === EDataUsage.COMPUTATIONAL_X;
            case EDataUsage.COMP_1:
            case EDataUsage.FLOAT_SHORT:
            case EDataUsage.COMPUTATIONAL_1:
                return testType === EDataUsage.FLOAT_SHORT ||
                       testType === EDataUsage.COMP_1 ||
                       testType === EDataUsage.COMPUTATIONAL_1;
            case EDataUsage.COMP_2:
            case EDataUsage.FLOAT_LONG:
            case EDataUsage.FLOAT_EXTENDED:
            case EDataUsage.COMPUTATIONAL_2:
                return testType === EDataUsage.COMP_2 ||
                       testType === EDataUsage.FLOAT_LONG ||
                       testType === EDataUsage.FLOAT_EXTENDED ||
                       testType === EDataUsage.COMPUTATIONAL_2;
            case EDataUsage.COMP_3:
            case EDataUsage.COMPUTATIONAL_3:
            case EDataUsage.PACKED_DECIMAL:
                return testType === EDataUsage.COMP_3 ||
                       testType === EDataUsage.PACKED_DECIMAL ||
                       testType === EDataUsage.COMPUTATIONAL_3;
        }
        return false;
    }

    public analizeCallStatement(ctx: Call_statementContext) {
        let callUsingCtx = ctx.call_using();
        let nameIdentifier = ctx.prog_name().identifier_result();
        if (nameIdentifier) {
            // analize name 
            let symbol = this.analyzeIdentifierResult(nameIdentifier);
            if (symbol instanceof ProgramSymbol) {
                this.helper.mark(nameIdentifier, localize("must.be.literal", "Must be enclosed in quotas"));
            }
            // and all other children
            this.visitChildren(ctx, [Prog_nameContext]);
        } else {
            let nameLiteral = ctx.prog_name().STRING_LITERAL_();
            if (nameLiteral) {
                // verify name
                let progSymbol = this.helper.verifyName(nameLiteral, false, undefined, [ProgramSymbol], undefined, true);
                if (progSymbol instanceof ProgramSymbol && progSymbol.programDefinition) {
                    // verify parameters
                    if (callUsingCtx) {
                        let types = this.analyzeCall_using(callUsingCtx);
                        // check types is corresponding to definition
                        if (progSymbol.programDefinition.arguments && progSymbol.programDefinition.arguments.length > 0) {
                            if (progSymbol.programDefinition.arguments.length !== types.length) {
                                this.helper.mark(ctx, localize("invalid.arg.count", "Invalid argument count"));
                            } else {
                                // make array of arrays
                                let argCtxs: ParserRuleContext[] = [];
                                for (let args of callUsingCtx.using_arg()) {
                                    if (args.OMITTED()) {
                                        argCtxs.push(args);
                                    } else {
                                        argCtxs.push(...args.argument());
                                    }
                                }
                                for(let idx = 0; idx < progSymbol.programDefinition.arguments.length; ++idx) {
                                    if (!this.testAllowedTypes(types[idx], progSymbol.programDefinition.arguments[idx].usage)) {
                                        if (argCtxs.length > idx) {
                                            this.helper.mark(argCtxs[idx], localize("type.mismatch", "Type mismatch"));
                                        } else {
                                            this.helper.mark(callUsingCtx, localize("type.mismatch", "Type mismatch"));
                                        }
                                    }
                                }
                            }
                        } else if (types.length > 0) {
                            this.helper.mark(ctx, localize("invalid.arg.count", "Invalid argument count"));
                        }
                    } else if (progSymbol.programDefinition.arguments && progSymbol.programDefinition.arguments.length > 0) {
                        this.helper.mark(ctx, localize("invalid.arg.count", "Invalid argument count"));
                    }
                    let callGivingCtx = ctx.call_giving();
                    if (callGivingCtx) {
                        let testType: EDataUsage | undefined;
                        let symbol = this.analyzeIdentifierResult(callGivingCtx.identifier_result());
                        if (symbol instanceof DataRecordSymbol) {
                            testType = symbol.usage;
                        }
                        // make array of arrays
                        if (!this.testAllowedTypes(testType, progSymbol.programDefinition.usage)) {
                            this.helper.mark(callGivingCtx, localize("type.mismatch", "Type mismatch"));
                        }
                    }
                    this.visitChildren(ctx, [Call_usingContext, Prog_nameContext, Call_givingContext]);
                } else {
                    // not a program symbol
                    this.visitChildren(ctx, [Prog_nameContext]);
                }
            } else {
                // has no name at all
                this.visitChildren(ctx);
            }
        }
    }

    visitCall_using(ctx: Call_usingContext) {
        this.analyzeCall_using(ctx);
    }

    analyzeCall_using(ctx: Call_usingContext): (EDataUsage | undefined)[] {
        let returnTypeArr: (EDataUsage | undefined)[] = [];
        let usingArgCtxArr = ctx.using_arg();
        for(let usingArgCtx of usingArgCtxArr) {
            if (usingArgCtx.OMITTED()) {
                returnTypeArr.push(undefined);
            } else {
                let argCtxArr = usingArgCtx.argument();
                for(let argCtx of argCtxArr) {
                    returnTypeArr.push(this.analyzeArgument(argCtx));
                }
            }
        }
        this.visitChildren(ctx, [Using_argContext]);
        return returnTypeArr;
    }

    visitArgument(ctx: ArgumentContext) {
        this.analyzeArgument(ctx);
    }

    analyzeArgument(ctx: ArgumentContext): (EDataUsage | undefined) {
        let returnType: (EDataUsage | undefined) = undefined;
        let identifierResultCtx = ctx.identifier_result();
        if (identifierResultCtx) {
            let symbol = this.analyzeIdentifierResult(identifierResultCtx);
            if (symbol instanceof DataRecordSymbol) {
                returnType = symbol.usage;
            }
        }
        if (ctx.INTEGER_LITERAL_()) {
            returnType = EDataUsage.COMP;
        }
        if (ctx.HEX_LITERAL_()) {
            returnType = EDataUsage.COMP;
        }
        if (ctx.STRING_LITERAL_()) {
            returnType = EDataUsage.DISPLAY;
        }
        return returnType;
    }

    visitIdentifier_result(ctx: Identifier_resultContext) {
        this.analyzeIdentifierResult(ctx);
    }

    visitIdentifier(ctx: IdentifierContext) {
        this.analyzeIdentifier(ctx);
    }

    public analyzeIdentifier(ctx: IdentifierContext): Symbol | undefined {
        let returnType: (EDataUsage | undefined) = undefined;
        let identifierCtx = ctx.identifier_result();
        if (identifierCtx) {
            return this.analyzeIdentifierResult(identifierCtx);
        }
        this.visitChildren(ctx);
        return returnType;
    }

    public analyzeIdentifierResult(identifierCtx: Identifier_resultContext): Symbol | undefined {
        let returnType: (EDataUsage | undefined);
        let identifierSymbol = this.helper.verifyQualifiedName(identifierCtx.qualified_data_item(), false, undefined, undefined, [IntrinsicFunctionSymbol, ProgramSymbol]);
        if (identifierSymbol instanceof DataRecordSymbol) {
            returnType = identifierSymbol.usage;
            let subscriptingCtx = identifierCtx.subscripting();
            if (subscriptingCtx) {
                // test if identifier is an array
                if (identifierSymbol.arrayLvl === undefined) {
                    this.helper.mark(subscriptingCtx, localize("not.an.array", "This is not an array"));
                } else {
                    if (identifierSymbol.arrayLvl !== subscriptingCtx.arithmetic_expression().length) {
                        this.helper.mark(subscriptingCtx, localize("doesnt.correspond.array", "Subscripting doesn't correspond array depth"));
                    }
                }
                this.visitChildren(subscriptingCtx);
            } else {
                // if (identifierSymbol.arrayLvl !== undefined) {
                //     this.helper.mark(identifierCtx, localize("must.have.subscription", "Must have subscription"));
                // }
            }
            let referenceCtx = identifierCtx.reference_modification();
            if (referenceCtx) {
                if (returnType !== EDataUsage.DISPLAY ) {
                    this.helper.mark(referenceCtx, localize("not.a.string", "It seems this is not a string"));
                }
                this.visitChildren(referenceCtx);
            }
            this.visitChildren(identifierCtx, [Qualified_data_itemContext, SubscriptingContext, Reference_modificationContext]);
        } else {
            this.visitChildren(identifierCtx, [Qualified_data_itemContext]);
        }
        return identifierSymbol;
    }

}