
import {
    cobolListener,
} from '../parser/cobolListener';

import {
    CobolSymbolTable,
} from './ContextSymbolTable';

import {
    ScopedSymbol,
    Symbol,
} from "antlr4-c3";

import {
    AlphabetContext,
    Class_Context,
    Cobol_sourceContext,
    Currency_definitionContext,
    Data_description_clauseContext,
    Data_description_entryContext,
    Declaratives_sectionContext,
    Fd_clauseContext,
    File_descriptionContext,
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
    Sort_merge_file_descriptionContext,
    Switch_clause_offContext,
    Switch_clause_onContext,
    Switch_definitionContext,
    Symbol_charContext,
    cobolParser,
    Working_storage_sectionContext,
    Indexed_byContext,
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
    CobolSourceSymbol,
    DataRecordSymbol,
    DeclarativesSectionSymbol,
    ENVIRONMENT_NAME_Symbol,
    ENVIRONMENT_VALUE_Symbol,
    FileSymbol,
    LINE_PRINTER_Symbol,
    PAPER_TAPE_PUNCH_Symbol,
    PAPER_TAPE_READER_Symbol,
    ParagraphSymbol,
    ProgramSymbol,
    ReportFileSymbol,
    ReportGroupSymbol,
    SWITCH_STATUS_Symbol,
    SWITCH_Symbol,
    SYMBOLIC_CHARACTERS_Symbol,
    SYSERR_Symbol,
    SYSIN_Symbol,
    SYSOUT_Symbol,
    SectionSymbol,
    SegKeySymbol,
    SortMergeFileSymbol,
    IndexedBySymbol,
} from './Symbol';

import {
    ParserRuleContext,
} from 'antlr4ts';

import {
    firstContainingContext,
} from '../../common/parser/helpers';

import {
    TerminalNode,
} from 'antlr4ts/tree';


export class CobolDetailsListener implements cobolListener {

    private currentSymbol: Symbol | undefined;

    constructor(private symbolTable: CobolSymbolTable, private imports: string[]) {
    }

    enterCobol_source(ctx: Cobol_sourceContext) {
        this.promoteCurrentSymbol(CobolSourceSymbol, ctx);
    }

    exitCobol_source(ctx: Cobol_sourceContext) {
        this.backToParent(ctx);
    }

    enterProgram(ctx: ProgramContext) {
        this.promoteCurrentSymbol(ProgramSymbol, ctx);
    }

    exitProgram(ctx: ProgramContext) {
        this.backToParent(ctx);
    }

    enterProgram_id(ctx: Program_idContext) {
        // let programSymbol = this.symbolTable.getEnclosingSymbolForContext(ctx);
        if (this.currentSymbol instanceof ProgramSymbol) {
            this.currentSymbol.name = ctx.program_name().text.toUpperCase();
            this.symbolTable.occurance.set(this.currentSymbol, [ctx.program_name()]);
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
            this.promoteCurrentSymbol(symbolType, ctx, ctx.user_name());
        }
    }

    exitPredefined_name_relation(ctx: Predefined_name_relationContext) {
        this.backToParent(ctx);
    }

    enterSwitch_definition(ctx: Switch_definitionContext) {
        let symb = this.promoteCurrentSymbol(SWITCH_Symbol, ctx, ctx.switch_name());
        // let numCtx = ctx.switch_num();
        // if (numCtx) {
        //     symb.switchNum = Number.parseInt(numCtx.text);
        // } else {
        //     let numNode = ctx.SWITCH_N();
        //     if (numNode) {
        //         let dashPos = numNode.text.indexOf('-');
        //         symb.switchNum = Number.parseInt(numNode.text.substr(dashPos + 1));
        //     }
        // }
    }

    exitSwitch_definition(ctx: Switch_definitionContext) {
        this.backToParent(ctx);
    }

    enterSwitch_clause_on(ctx: Switch_clause_onContext) {
        this.promoteCurrentSymbol(SWITCH_STATUS_Symbol, ctx, ctx.cond_name());
    }

    exitSwitch_clause_on(ctx: Switch_clause_onContext) {
        this.backToParent(ctx);
    }

    enterSwitch_clause_off(ctx: Switch_clause_offContext) {
        this.promoteCurrentSymbol(SWITCH_STATUS_Symbol, ctx, ctx.cond_name());
    }

    exitSwitch_clause_off(ctx: Switch_clause_offContext) {
        this.backToParent(ctx);
    }

    enterAlphabet(ctx: AlphabetContext) {
        this.promoteCurrentSymbol(ALPHABET_Symbol, ctx, ctx.alpha_name());
    }

    exitAlphabet(ctx: AlphabetContext) {
        this.backToParent(ctx);
    }

    enterSymbol_char(ctx: Symbol_charContext) {
        this.promoteCurrentSymbol(SYMBOLIC_CHARACTERS_Symbol, ctx, ctx);
    }

    exitSymbol_char(ctx: Symbol_charContext) {
        this.backToParent(ctx);
    }

    enterClass_(ctx: Class_Context) {
        this.promoteCurrentSymbol(CLASS_Symbol, ctx, ctx.class_name());
    }

    exitClass_(ctx: Class_Context) {
        this.backToParent(ctx);
    }

    enterCurrency_definition(ctx: Currency_definitionContext) {
        let symb = this.promoteCurrentSymbol(CURRENCY_Symbol, ctx, ctx.currency_char());
        let currency_str_ctx = ctx.currency_string();
        if (currency_str_ctx) {
            symb.currency_str = currency_str_ctx.text;
        }
    }

    exitCurrency_definition(ctx: Currency_definitionContext) {
        this.backToParent(ctx);
    }

    enterFile_description(ctx: File_descriptionContext) {
        this.promoteCurrentSymbol(FileSymbol, ctx, ctx.file_description_entry().file_name());
    }

    enterFd_clause(ctx: Fd_clauseContext) {
        if (ctx.GLOBAL() && this.currentSymbol instanceof FileSymbol) {
            this.currentSymbol.isGlobal = true;
        }
    }

    exitFile_description(ctx: File_descriptionContext) {
        this.backToParent(ctx);
    }

    enterSort_merge_file_description(ctx: Sort_merge_file_descriptionContext) {
        this.promoteCurrentSymbol(SortMergeFileSymbol, ctx, ctx.sort_merge_file_description_entry().file_name());
    }

    exitSort_merge_file_description(ctx: Sort_merge_file_descriptionContext) {
        this.backToParent(ctx);
    }

    enterReport_description(ctx: Report_descriptionContext) {
        this.promoteCurrentSymbol(ReportFileSymbol, ctx, ctx.report_description_entry().report_name());
    }

    exitReport_description(ctx: Report_descriptionContext) {
        this.backToParent(ctx);
    }

    enterRd_clause(ctx: Rd_clauseContext) {
        if (ctx.GLOBAL() && this.currentSymbol instanceof ReportFileSymbol) {
            this.currentSymbol.isGlobal = true;
        }
    }

    enterWorking_storage_section(ctx: Working_storage_sectionContext) {
        
    }

    enterData_description_entry(ctx: Data_description_entryContext) {
        let symb: DataRecordSymbol | undefined;
        let levelNum = Number.parseInt(ctx.level_number().text);
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
                        this.currentSymbol = dataRecord.parent;
                        break;
                    }
                    if (dataRecord.level < levelNum) {
                        this.currentSymbol = dataRecord;
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
        symb = this.promoteCurrentSymbol(DataRecordSymbol, ctx, ctx.data_name());
        symb.level = levelNum;
    }

    exitData_description_entry(ctx: Data_description_entryContext) {
        // go to first non-datarecord parent
        while (this.currentSymbol instanceof DataRecordSymbol) {
            this.currentSymbol = this.currentSymbol.parent;
        }
    }

    enterData_description_clause(ctx: Data_description_clauseContext) {
        if (ctx.GLOBAL() && this.currentSymbol instanceof DataRecordSymbol) {
            this.currentSymbol.isGlobal = true;
        }
    }

    enterReport_group_data_description_entry(ctx: Report_group_data_description_entryContext) {
        let symb = this.promoteCurrentSymbol(ReportGroupSymbol, ctx, ctx.data_name());
        symb.level = Number.parseInt(ctx.level_number().text);
    }

    exitReport_group_data_description_entry(ctx: Report_group_data_description_entryContext) {
        this.backToParent(ctx);
    }

    enterScreen_description_entry(ctx: Screen_description_entryContext) {
        let symb = this.promoteCurrentSymbol(ReportGroupSymbol, ctx, ctx.screen_name());
        symb.level = Number.parseInt(ctx.level_number().text);
    }

    exitScreen_description_entry(ctx: Screen_description_entryContext) {
        this.backToParent(ctx);
    }

    enterRecord_key_definition(ctx: Record_key_definitionContext) {
        let segKeyCtx = ctx.seg_key();
        if (segKeyCtx) {
            this.promoteCurrentSymbol(SegKeySymbol, ctx, segKeyCtx);
            this.backToParent(ctx);
        }
    }

    enterSection(ctx: SectionContext) {
        this.promoteCurrentSymbol(SectionSymbol, ctx, ctx.section_header().section_name());
    }

    exitSection(ctx: SectionContext) {
        this.backToParent(ctx);
    }

    enterSection_header(ctx: Section_headerContext) {
        let ctxNumber = ctx.segment_number();
        if (ctxNumber && this.currentSymbol instanceof SectionSymbol) {
            this.currentSymbol.segment = Number.parseInt(ctxNumber.text);
        }
    }

    enterDeclaratives_section(ctx: Declaratives_sectionContext) {
        this.promoteCurrentSymbol(DeclarativesSectionSymbol, ctx, ctx.section_header().section_name());
    }

    exitDeclaratives_section(ctx: Declaratives_sectionContext) {
        this.backToParent(ctx);
    }

    enterParagraph(ctx: ParagraphContext) {
        this.promoteCurrentSymbol(ParagraphSymbol, ctx, ctx.paragraph_name());
    }

    exitParagraph(ctx: ParagraphContext) {
        this.backToParent(ctx);
    }

    enterIndexed_by(ctx: Indexed_byContext) {
        let names = ctx.ind_name();
        for(let nameCtx of names) {
            this.promoteCurrentSymbol(IndexedBySymbol, nameCtx, nameCtx);
            this.backToParent(nameCtx);
        }
    }

    //*****************************************************************************************************************************

    private promoteCurrentSymbol<T extends Symbol>(t: new (...args: any[]) => T, enclosingCtx: ParserRuleContext, nameCtx?: ParserRuleContext, ...args: any[]): T {
        let name = nameCtx ? nameCtx.text.toUpperCase() : "";
        this.currentSymbol = this.createAndTryAddSymbolTo(this.currentSymbol, t, name, ...args);
        this.currentSymbol.context = enclosingCtx;
        if (nameCtx) {
            this.symbolTable.occurance.set(this.currentSymbol, [nameCtx]);
        }
        return this.currentSymbol as T;
    }

    private createAndTryAddSymbolTo<T extends Symbol>(scope: Symbol | undefined, t: new (...args: any[]) => T, ...args: any[]) {
        while (scope != undefined) {
            if (scope instanceof ScopedSymbol) {
                return this.symbolTable.addNewSymbolOfType(t, scope, ...args);
            }
            scope = scope.parent;
        }
        return this.symbolTable.addNewSymbolOfType(t, undefined, ...args);
    }

    private backToParent(ctx: ParserRuleContext) {
        if (this.currentSymbol && this.currentSymbol.context === ctx) {
            this.currentSymbol = this.currentSymbol.parent;
        }
    }
}
