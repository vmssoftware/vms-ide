
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
    ReportGroupSymbol,
    ReportSymbol,
    SWITCH_STATUS_Symbol,
    SWITCH_Symbol,
    SYMBOLIC_CHARACTERS_Symbol,
    SYSERR_Symbol,
    SYSIN_Symbol,
    SYSOUT_Symbol,
    SectionSymbol,
    SegKeySymbol,
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
        let programSymbol = this.firstContainingSymbol(ProgramSymbol);
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
        let symb: DataRecordSymbol | undefined;
        let levelNum = Number.parseInt(ctx.level_number().text);
        let parentSymbol = this.currentSymbol;
        if (levelNum === 77) {
            parentSymbol = this.firstContainingSymbol(ProgramSymbol);
        } else {
            if (this.currentSymbol instanceof ScopedSymbol) {
                // go down to last DataRecordSymbol
                let lastChild = this.currentSymbol.lastChild;
                let dataRecord: DataRecordSymbol | undefined;
                while (lastChild instanceof DataRecordSymbol) {
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
                        if (dataRecord.parent instanceof DataRecordSymbol) {
                            dataRecord = dataRecord.parent;
                        } else {
                            break;
                        }
                    }
                }
            }
        }
        // note - two promotions
        this.promote(parentSymbol);
        symb = this.promoteNew(DataRecordSymbol, ctx, ctx.data_name());
        symb.level = levelNum;
        if (symb.parent instanceof IdentifierSymbol) {
            symb.isGlobal = symb.parent.isGlobal;
            symb.isExtern = symb.parent.isExtern;
        }
        if (symb.parent instanceof DataRecordSymbol) {
            symb.arrayLvl = symb.parent.arrayLvl;
        }
        symb.usage = EDataUsage.DISPLAY;
    }

    exitData_description_entry(ctx: Data_description_entryContext) {
        // back to parent
        this.back();
        // back to initial symbol
        this.back();
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
                let pictureStr = pictureCtx.character_string().text;
                let trimLeftPos = 0;
                while(trimLeftPos < pictureStr.length && CobolDetailsListener._separator.includes(pictureStr[trimLeftPos])) {
                    ++trimLeftPos;
                }
                let trimRightPos = pictureStr.length - 1;
                while(trimRightPos > 0 && CobolDetailsListener._separator.includes(pictureStr[trimRightPos])) {
                    --trimRightPos;
                }
                this.currentSymbol.picture = pictureStr.substring(trimLeftPos, trimRightPos + 1);
                return;
            } 
            // USAGE
            let usageCtx = ctx.usage();
            if (usageCtx) {
                let usageTypeNode = usageCtx.usage_definition().getChild(0);
                if (usageTypeNode instanceof TerminalNode) {
                    switch(usageTypeNode.symbol.type) {
                        case cobolParser.BINARY: this.currentSymbol.usage = EDataUsage.BINARY; break;
                        case cobolParser.BINARY_CHAR: this.currentSymbol.usage = EDataUsage.BINARY_CHAR; break;
                        case cobolParser.BINARY_SHORT: this.currentSymbol.usage = EDataUsage.BINARY_SHORT; break;
                        case cobolParser.BINARY_LONG: this.currentSymbol.usage = EDataUsage.BINARY_LONG; break;
                        case cobolParser.BINARY_DOUBLE: this.currentSymbol.usage = EDataUsage.BINARY_DOUBLE; break;
                        case cobolParser.COMPUTATIONAL: this.currentSymbol.usage = EDataUsage.COMPUTATIONAL; break;
                        case cobolParser.COMPUTATIONAL_1: this.currentSymbol.usage = EDataUsage.COMPUTATIONAL_1; break;
                        case cobolParser.COMPUTATIONAL_2: this.currentSymbol.usage = EDataUsage.COMPUTATIONAL_2; break;
                        case cobolParser.COMPUTATIONAL_3: this.currentSymbol.usage = EDataUsage.COMPUTATIONAL_3; break;
                        case cobolParser.COMPUTATIONAL_4: this.currentSymbol.usage = EDataUsage.COMPUTATIONAL_4; break;
                        case cobolParser.COMPUTATIONAL_5: this.currentSymbol.usage = EDataUsage.COMPUTATIONAL_5; break;
                        case cobolParser.COMPUTATIONAL_X: this.currentSymbol.usage = EDataUsage.COMPUTATIONAL_X; break;
                        case cobolParser.COMP: this.currentSymbol.usage = EDataUsage.COMP; break;
                        case cobolParser.COMP_1: this.currentSymbol.usage = EDataUsage.COMP_1; break;
                        case cobolParser.COMP_2: this.currentSymbol.usage = EDataUsage.COMP_2; break;
                        case cobolParser.COMP_3: this.currentSymbol.usage = EDataUsage.COMP_3; break;
                        case cobolParser.COMP_4: this.currentSymbol.usage = EDataUsage.COMP_4; break;
                        case cobolParser.COMP_5: this.currentSymbol.usage = EDataUsage.COMP_5; break;
                        case cobolParser.COMP_X: this.currentSymbol.usage = EDataUsage.COMP_X; break;
                        case cobolParser.DISPLAY: this.currentSymbol.usage = EDataUsage.DISPLAY; break;
                        case cobolParser.FLOAT_SHORT: this.currentSymbol.usage = EDataUsage.FLOAT_SHORT; break;
                        case cobolParser.FLOAT_LONG: this.currentSymbol.usage = EDataUsage.FLOAT_LONG; break;
                        case cobolParser.FLOAT_EXTENDED: this.currentSymbol.usage = EDataUsage.FLOAT_EXTENDED; break;
                        case cobolParser.INDEX: this.currentSymbol.usage = EDataUsage.INDEX; break;
                        case cobolParser.PACKED_DECIMAL: this.currentSymbol.usage = EDataUsage.PACKED_DECIMAL; break;
                        case cobolParser.POINTER: this.currentSymbol.usage = EDataUsage.POINTER; break;
                        case cobolParser.POINTER_64: this.currentSymbol.usage = EDataUsage.POINTER_64; break;
                    }
                }
                return;
            }
        }
    }

    enterReport_group_data_description_entry(ctx: Report_group_data_description_entryContext) {
        let symb = this.promoteNew(ReportGroupSymbol, ctx, ctx.data_name());
        symb.level = Number.parseInt(ctx.level_number().text);
    }

    exitReport_group_data_description_entry(ctx: Report_group_data_description_entryContext) {
        this.back();
    }

    enterScreen_description_entry(ctx: Screen_description_entryContext) {
        let symb = this.promoteNew(ReportGroupSymbol, ctx, ctx.screen_name());
        symb.level = Number.parseInt(ctx.level_number().text);
    }

    exitScreen_description_entry(ctx: Screen_description_entryContext) {
        this.back();
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

    private firstContainingSymbol<T extends Symbol>(t: new (...args: any[]) => T) {
        let retSymbol = this.currentSymbol;
        while(retSymbol !== undefined) {
            if (retSymbol instanceof t) {
                return retSymbol;
            }
        }
        return undefined;
    }
}
