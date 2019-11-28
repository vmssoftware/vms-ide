
import {
    cobolListener,
} from '../parser/cobolListener';

import {
    CobolSymbolTable
} from './CobolSymbolTable';

import {
    ScopedSymbol,
    Symbol,
} from "antlr4-c3";

import {
    AlphabetContext,
    Class_Context,
    Currency_definitionContext,
    Data_description_clauseContext,
    Data_description_entryContext,
    Declaratives_sectionContext,
    Fd_clauseContext,
    File_descriptionContext,
    Indexed_byContext,
    OrganizationContext,
    ParagraphContext,
    Predefined_name_relationContext,
    ProgramContext,
    Program_idContext,
    Rd_clauseContext,
    Record_key_definitionContext,
    Report_descriptionContext,
    Report_group_data_description_entryContext,
    Screen_description_entryContext,
    SectionContext,
    Section_headerContext,
    SelectContext,
    Switch_clause_offContext,
    Switch_clause_onContext,
    Switch_definitionContext,
    Symbol_charContext,
    cobolParser,
    Report_group_data_description_clauseContext,
    Report_description_entryContext,
    Usage_definitionContext,
    Screen_description_clauseContext,
    Type_is_definitionContext,
} from '../parser/cobolParser';

import {
    ALPHABET_Symbol,
    ARGUMENT_NUMBER_Symbol,
    ARGUMENT_VALUE_Symbol,
    C01_Symbol,
    CARD_READER_Symbol,
    CLASS_Symbol,
    CONSOLE_Symbol,
    CURRENCY_Symbol,
    DataRecordSymbol,
    DeclarativesSectionSymbol,
    EDataUsage,
    EFileFormat,
    ENVIRONMENT_NAME_Symbol,
    ENVIRONMENT_VALUE_Symbol,
    FileSymbol,
    IdentifierSymbol,
    IndexedBySymbol,
    LINE_PRINTER_Symbol,
    PAPER_TAPE_PUNCH_Symbol,
    PAPER_TAPE_READER_Symbol,
    ParagraphSymbol,
    ProgramSymbol,
    ReportRecordSymbol,
    ReportSymbol,
    SWITCH_STATUS_Symbol,
    SWITCH_Symbol,
    SYMBOLIC_CHARACTERS_Symbol,
    SYSERR_Symbol,
    SYSIN_Symbol,
    SYSOUT_Symbol,
    SectionSymbol,
    SegKeySymbol,
    firstContainingSymbol,
    ScreenRecordSymbol,
    EReportType,
    EScreenType,
} from './CobolSymbol';

import {
    ParserRuleContext,
} from 'antlr4ts';

import {
    TerminalNode,
} from 'antlr4ts/tree';

import {
    unifyCobolName
} from '../../common/parser/Helpers';

import {
    CobolAnalisisHelper
} from './CobolAnalisisHelpers';


export class CobolDetailsListener implements cobolListener {

    private symbolStack: (Symbol | undefined)[] = [];

    private currentSymbol: Symbol | undefined;

    public static readonly _separator = "\t\r\n ,;";

    constructor(private symbolTable: CobolSymbolTable, private imports: string[]) {
    }

    enterProgram(ctx: ProgramContext) {
        this.promoteNew(ProgramSymbol, ctx);
    }

    exitProgram(ctx: ProgramContext) {
        this.back();
    }

    enterProgram_id(ctx: Program_idContext) {
        if (this.currentSymbol instanceof ProgramSymbol) {
            this.currentSymbol.name = unifyCobolName(ctx.program_name().text);
            this.symbolTable.createOccurence(this.currentSymbol, ctx.program_name());
            let common_initial = ctx.common_initial();
            if (common_initial && common_initial.COMMON()) {
                this.currentSymbol.isCommon = true;
            }
            this.currentSymbol.programDefinition = {
                name: this.currentSymbol.name,
                usage: EDataUsage.COMP,
                arguments: []
            };
        }
    }

    enterPredefined_name_relation(ctx: Predefined_name_relationContext) {
        let symbolType: typeof Symbol | undefined;
        let device = ctx.predefined_name().getChild(0);
        if (device instanceof TerminalNode) {
            switch (device.symbol.type) {
                case cobolParser.CARD_READER:
                    symbolType = CARD_READER_Symbol;
                    break;
                case cobolParser.PAPER_TAPE_READER:
                    symbolType = PAPER_TAPE_READER_Symbol;
                    break;
                case cobolParser.CONSOLE:
                    symbolType = CONSOLE_Symbol;
                    break;
                case cobolParser.LINE_PRINTER:
                    symbolType = LINE_PRINTER_Symbol;
                    break;
                case cobolParser.PAPER_TAPE_PUNCH:
                    symbolType = PAPER_TAPE_PUNCH_Symbol;
                    break;
                case cobolParser.SYSIN:
                    symbolType = SYSIN_Symbol;
                    break;
                case cobolParser.SYSOUT:
                    symbolType = SYSOUT_Symbol;
                    break;
                case cobolParser.SYSERR:
                    symbolType = SYSERR_Symbol;
                    break;
                case cobolParser.C01:
                    symbolType = C01_Symbol;
                    break;
                case cobolParser.ARGUMENT_NUMBER:
                    symbolType = ARGUMENT_NUMBER_Symbol;
                    break;
                case cobolParser.ARGUMENT_VALUE:
                    symbolType = ARGUMENT_VALUE_Symbol;
                    break;
                case cobolParser.ENVIRONMENT_NAME:
                    symbolType = ENVIRONMENT_NAME_Symbol;
                    break;
                case cobolParser.ENVIRONMENT_VALUE:
                    symbolType = ENVIRONMENT_VALUE_Symbol;
                    break;
            }
        }
        if (symbolType !== undefined) {
            this.promoteNew(symbolType, ctx, ctx.user_name());
            this.back();
        }
    }

    enterSwitch_definition(ctx: Switch_definitionContext) {
        this.promoteNew(SWITCH_Symbol, ctx, ctx.switch_name());
    }

    exitSwitch_definition(ctx: Switch_definitionContext) {
        this.back();
    }

    enterSwitch_clause_on(ctx: Switch_clause_onContext) {
        this.promoteNew(SWITCH_STATUS_Symbol, ctx, ctx.cond_name());
    }

    exitSwitch_clause_on(ctx: Switch_clause_onContext) {
        this.back();
    }

    enterSwitch_clause_off(ctx: Switch_clause_offContext) {
        this.promoteNew(SWITCH_STATUS_Symbol, ctx, ctx.cond_name());
    }

    exitSwitch_clause_off(ctx: Switch_clause_offContext) {
        this.back();
    }

    enterAlphabet(ctx: AlphabetContext) {
        this.promoteNew(ALPHABET_Symbol, ctx, ctx.alpha_name());
    }

    exitAlphabet(ctx: AlphabetContext) {
        this.back();
    }

    enterSymbol_char(ctx: Symbol_charContext) {
        this.promoteNew(SYMBOLIC_CHARACTERS_Symbol, ctx, ctx);
    }

    exitSymbol_char(ctx: Symbol_charContext) {
        this.back();
    }

    enterClass_(ctx: Class_Context) {
        this.promoteNew(CLASS_Symbol, ctx, ctx.class_name());
    }

    exitClass_(ctx: Class_Context) {
        this.back();
    }

    enterCurrency_definition(ctx: Currency_definitionContext) {
        let symb = this.promoteNew(CURRENCY_Symbol, ctx, ctx.currency_char());
        let currency_str_ctx = ctx.currency_string();
        if (currency_str_ctx) {
            symb.currency_str = currency_str_ctx.text;
        }
    }

    exitCurrency_definition(ctx: Currency_definitionContext) {
        this.back();
    }

    enterFile_description(ctx: File_descriptionContext) {
        let programSymbol = firstContainingSymbol(this.currentSymbol, ProgramSymbol);
        if (programSymbol) {
            let name = unifyCobolName(ctx.file_description_entry().file_name().text);
            let fileSymbols = programSymbol.getSymbolsOfType(FileSymbol).filter(x => x.name === name);
            if (fileSymbols.length === 1) {
                this.promote(fileSymbols[0]);
                return;
            }
        }
        this.promote(undefined);
    }

    enterFd_clause(ctx: Fd_clauseContext) {
        if (this.currentSymbol instanceof IdentifierSymbol) {
            if (ctx.is_global()) {
                this.currentSymbol.isGlobal = true;
            }
            if (ctx.is_external()) {
                this.currentSymbol.isExtern = true;
            }
        }
    }

    exitFile_description(ctx: File_descriptionContext) {
        this.back();
    }

    enterSelect(ctx: SelectContext) {
        this.promoteNew(FileSymbol, ctx, ctx.file_name());
    }

    enterOrganization(ctx: OrganizationContext) {
        if (this.currentSymbol instanceof FileSymbol) {
            if (ctx.LINE()) {
                this.currentSymbol.fileFormat = EFileFormat.Line;
            }
            if (ctx.RELATIVE()) {
                this.currentSymbol.fileFormat = EFileFormat.Relative;
            }
            if (ctx.INDEXED()) {
                this.currentSymbol.fileFormat = EFileFormat.Indexed;
            }
        }
    }

    exitSelect(ctx: SelectContext) {
        this.back();
    }

    enterReport_description(ctx: Report_descriptionContext) {
        this.promoteNew(ReportSymbol, ctx, ctx.report_description_entry().report_name());
    }

    exitReport_description(ctx: Report_descriptionContext) {
        this.back();
    }

    enterRd_clause(ctx: Rd_clauseContext) {
        if (this.currentSymbol instanceof IdentifierSymbol) {
            if (ctx.is_global()) {
                this.currentSymbol.isGlobal = true;
            }
        }
    }

    enterData_description_entry(ctx: Data_description_entryContext) {
        this.promoteDataEntry(this.currentSymbol, ctx, DataRecordSymbol);
    }

    exitData_description_entry(ctx: Data_description_entryContext) {
        this.backDataEntry();
    }

    enterData_description_clause(ctx: Data_description_clauseContext) {
        if (this.currentSymbol instanceof DataRecordSymbol) {
            if (ctx.is_global()) {
                this.currentSymbol.isGlobal = true;
                return;
            }
            if (ctx.is_external()) {
                this.currentSymbol.isExtern = true;
                return;
            }
            if (ctx.occurs()) {
                this.currentSymbol.arrayLvl = this.currentSymbol.arrayLvl ? this.currentSymbol.arrayLvl + 1 : 1;
                return;
            }
            let pictureCtx = ctx.picture();
            if (pictureCtx) {
                this.currentSymbol.picture = this.finePicture(pictureCtx.character_string().text);
                return;
            } 
            // USAGE
            let usageCtx = ctx.usage();
            if (usageCtx) {
                this.currentSymbol.usage = this.usageFromCtx(usageCtx.usage_definition());
                return;
            }
        }
    }

    enterReport_group_data_description_clause(ctx: Report_group_data_description_clauseContext) {
        if (this.currentSymbol instanceof ReportRecordSymbol) {
            let pictureCtx = ctx.picture();
            if (pictureCtx) {
                this.currentSymbol.picture = this.finePicture(pictureCtx.character_string().text);
                return;
            }
            let typeCtx = ctx.rep_type();
            if (typeCtx) {
                this.currentSymbol.reportType = this.reportTypeFromCtx(typeCtx.type_is_definition());
            }
        }
    }

    enterReport_group_data_description_entry(ctx: Report_group_data_description_entryContext) {
        this.promoteDataEntry(this.currentSymbol, ctx, ReportRecordSymbol);
    }

    exitReport_group_data_description_entry(ctx: Report_group_data_description_entryContext) {
        this.backDataEntry();
    }

    enterScreen_description_entry(ctx: Screen_description_entryContext) {
        let screenSymbol = this.promoteDataEntry(this.currentSymbol, ctx, ScreenRecordSymbol);
        if (screenSymbol) {
            screenSymbol.screenType = EScreenType.group;
        }
    }

    exitScreen_description_entry(ctx: Screen_description_entryContext) {
        this.backDataEntry();
    }

    enterScreen_description_clause(ctx: Screen_description_clauseContext) {
        if (this.currentSymbol instanceof ScreenRecordSymbol) {
            let pictureCtx = ctx.scr_picture();
            if (pictureCtx) {
                this.currentSymbol.picture = this.finePicture(pictureCtx.picture().character_string().text);
                this.currentSymbol.screenType = EScreenType.picture;
                return;
            }
            if (ctx.scr_value()) {
                this.currentSymbol.screenType = EScreenType.value;
            }
        }
    }

    enterRecord_key_definition(ctx: Record_key_definitionContext) {
        let segKeyCtx = ctx.seg_key();
        if (segKeyCtx) {
            this.promoteNew(SegKeySymbol, ctx, segKeyCtx);
            this.back();
        }
    }

    enterSection(ctx: SectionContext) {
        this.promoteNew(SectionSymbol, ctx, ctx.section_header().section_name());
    }

    exitSection(ctx: SectionContext) {
        this.back();
    }

    enterSection_header(ctx: Section_headerContext) {
        let ctxNumber = ctx.segment_number();
        if (ctxNumber && this.currentSymbol instanceof SectionSymbol) {
            this.currentSymbol.segment = Number.parseInt(ctxNumber.text);
        }
    }

    enterDeclaratives_section(ctx: Declaratives_sectionContext) {
        this.promoteNew(DeclarativesSectionSymbol, ctx, ctx.section_header().section_name());
    }

    exitDeclaratives_section(ctx: Declaratives_sectionContext) {
        this.back();
    }

    enterParagraph(ctx: ParagraphContext) {
        this.promoteNew(ParagraphSymbol, ctx, ctx.paragraph_name());
    }

    exitParagraph(ctx: ParagraphContext) {
        this.back();
    }

    enterIndexed_by(ctx: Indexed_byContext) {
        let names = ctx.ind_name();
        for(let nameCtx of names) {
            this.promoteNew(IndexedBySymbol, nameCtx, nameCtx);
            this.back();
        }
    }

    //*****************************************************************************************************************************

    private promoteNew<T extends Symbol>(t: new (...args: any[]) => T, enclosingCtx: ParserRuleContext, nameCtx?: ParserRuleContext, ...args: any[]): T {
        let name = nameCtx ? unifyCobolName(CobolAnalisisHelper.stringLiteralContent(nameCtx.text)) : "";
        let symbol = this.create(this.currentSymbol, t, name, ...args);
        symbol.context = enclosingCtx;
        if (nameCtx) {
            this.symbolTable.createOccurence(symbol, nameCtx);
        }
        this.promote(symbol);
        return this.currentSymbol as T;
    }

    private promote(symbol?: Symbol) {
        this.symbolStack.push(this.currentSymbol);
        this.currentSymbol = symbol;
    }

    private create<T extends Symbol>(scope: Symbol | undefined, t: new (...args: any[]) => T, ...args: any[]) {
        while (scope != undefined) {
            if (scope instanceof ScopedSymbol) {
                return this.symbolTable.addNewSymbolOfType(t, scope, ...args);
            }
            scope = scope.parent;
        }
        return this.symbolTable.addNewSymbolOfType(t, undefined, ...args);
    }

    private back() {
        this.currentSymbol = this.symbolStack.pop();
    }

    private backDataEntry() {
        this.currentSymbol = this.symbolStack.pop();
        this.currentSymbol = this.symbolStack.pop();
    }

    private promoteDataEntry<SymbT extends DataRecordSymbol>(
            parentSymbol: Symbol | undefined,
            ctx: Data_description_entryContext | Report_group_data_description_entryContext | Screen_description_entryContext,
            symbType: new (...args: any[]) => SymbT,
            ): SymbT | undefined {
        let symb: SymbT | undefined;
        let levelNum = Number.parseInt(ctx.level_number().text);
        if (levelNum === 77) {
            parentSymbol = firstContainingSymbol(parentSymbol, ProgramSymbol);
        } else {
            if (parentSymbol instanceof ScopedSymbol) {
                // go down to last data entry
                let lastChild = parentSymbol.lastChild;
                let dataRecord: SymbT | undefined;
                while (lastChild instanceof symbType) {
                    dataRecord = lastChild;
                    lastChild = lastChild.lastChild;
                }
                // go up until level > levelNum
                while (dataRecord) {
                    if (dataRecord.level !== undefined) {
                        if (dataRecord.level === levelNum) {
                            parentSymbol = dataRecord.parent;
                            break;
                        }
                        if (dataRecord.level < levelNum) {
                            parentSymbol = dataRecord;
                            break;
                        }
                        if (dataRecord.parent instanceof symbType) {
                            dataRecord = dataRecord.parent;
                        } else {
                            break;
                        }
                    }
                }
            }
        }
        // define whether is group
        if (parentSymbol instanceof symbType) {
            switch(levelNum) {
                case 66:
                case 77:
                case 88:
                    break;
                default:
                    parentSymbol.isGroup = true;
                    break;
            }
        }
        // note - two promotions
        this.promote(parentSymbol);
        symb = this.promoteNew(symbType, ctx, ctx.data_name());
        symb.level = levelNum;
        if (symb.parent instanceof IdentifierSymbol) {
            symb.isGlobal = symb.parent.isGlobal;
            symb.isExtern = symb.parent.isExtern;
        }
        if (symb.parent instanceof symbType) {
            symb.arrayLvl = symb.parent.arrayLvl;
        }
        symb.usage = EDataUsage.DISPLAY;
        return symb;
    }

    private usageFromCtx(usageCtx: Usage_definitionContext): EDataUsage {
        let usageTypeNode = usageCtx.childCount > 0 ? usageCtx.getChild(0) : undefined;
        if (usageTypeNode instanceof TerminalNode) {
            switch(usageTypeNode.symbol.type) {
                case cobolParser.BINARY: return EDataUsage.BINARY;
                case cobolParser.BINARY_CHAR: return EDataUsage.BINARY_CHAR;
                case cobolParser.BINARY_SHORT: return EDataUsage.BINARY_SHORT;
                case cobolParser.BINARY_LONG: return EDataUsage.BINARY_LONG;
                case cobolParser.BINARY_DOUBLE: return EDataUsage.BINARY_DOUBLE;
                case cobolParser.COMPUTATIONAL: return EDataUsage.COMPUTATIONAL;
                case cobolParser.COMPUTATIONAL_1: return EDataUsage.COMPUTATIONAL_1;
                case cobolParser.COMPUTATIONAL_2: return EDataUsage.COMPUTATIONAL_2;
                case cobolParser.COMPUTATIONAL_3: return EDataUsage.COMPUTATIONAL_3;
                case cobolParser.COMPUTATIONAL_4: return EDataUsage.COMPUTATIONAL_4;
                case cobolParser.COMPUTATIONAL_5: return EDataUsage.COMPUTATIONAL_5;
                case cobolParser.COMPUTATIONAL_X: return EDataUsage.COMPUTATIONAL_X;
                case cobolParser.COMP: return EDataUsage.COMP;
                case cobolParser.COMP_1: return EDataUsage.COMP_1;
                case cobolParser.COMP_2: return EDataUsage.COMP_2;
                case cobolParser.COMP_3: return EDataUsage.COMP_3;
                case cobolParser.COMP_4: return EDataUsage.COMP_4;
                case cobolParser.COMP_5: return EDataUsage.COMP_5;
                case cobolParser.COMP_X: return EDataUsage.COMP_X;
                case cobolParser.DISPLAY: return EDataUsage.DISPLAY;
                case cobolParser.FLOAT_SHORT: return EDataUsage.FLOAT_SHORT;
                case cobolParser.FLOAT_LONG: return EDataUsage.FLOAT_LONG;
                case cobolParser.FLOAT_EXTENDED: return EDataUsage.FLOAT_EXTENDED;
                case cobolParser.INDEX: return EDataUsage.INDEX;
                case cobolParser.PACKED_DECIMAL: return EDataUsage.PACKED_DECIMAL;
                case cobolParser.POINTER: return EDataUsage.POINTER;
                case cobolParser.POINTER_64: return EDataUsage.POINTER_64;
            }
        }
        return EDataUsage.DISPLAY;
    }

    private reportTypeFromCtx(typeCtx: Type_is_definitionContext): EReportType {
        switch(true) {
            case typeCtx.rep_type_ph() !== undefined: return EReportType.PH;
            case typeCtx.rep_type_pf() !== undefined: return EReportType.PF;
            case typeCtx.rep_type_ch() !== undefined: return EReportType.CH;
            case typeCtx.rep_type_cf() !== undefined: return EReportType.CF;
            case typeCtx.rep_type_de() !== undefined: return EReportType.DE;
            case typeCtx.rep_type_rh() !== undefined: return EReportType.RH;
            case typeCtx.rep_type_rf() !== undefined: return EReportType.RF;
        }
        return EReportType.RH;
    }

    private finePicture(pictureStr: string): string {
        let trimLeftPos = 0;
        while(trimLeftPos < pictureStr.length && CobolDetailsListener._separator.includes(pictureStr[trimLeftPos])) {
            ++trimLeftPos;
        }
        let trimRightPos = pictureStr.length - 1;
        while(trimRightPos > 0 && CobolDetailsListener._separator.includes(pictureStr[trimRightPos])) {
            --trimRightPos;
        }
        return pictureStr.substring(trimLeftPos, trimRightPos + 1);
    }
}
