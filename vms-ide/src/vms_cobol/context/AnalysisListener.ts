import * as nls from "vscode-nls";

import {
    IDiagnosticEntry,
} from '../../common/parser/Facade';

import {
    cobolListener,
} from "../parser/cobolListener";

import {
    Configuration_sectionContext,
    Memory_size_amountContext,
    ProgramContext,
    Program_collatingContext,
    Program_idContext,
    Segment_limitContext,
    Special_namesContext,
    StatementContext,
    Switch_numContext,
    Symbol_charContext,
    Cursor_isContext,
    Identifier_resultContext,
    Qualified_data_itemContext,
    Crt_isContext,
    Symb_ch_def_in_alphabetContext,
    First_procContext,
    Src_stringContext,
    End_programContext,
    Data_description_entryContext,
} from "../parser/cobolParser";

import {
    findChildInA,
    firstContainingContext,
    markToken,
    testRange,
    markContext,
} from "../../common/parser/Helpers";

import {
    CobolSymbolTable,
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
} from "./Symbol";

import {
    Symbol, ScopedSymbol
} from "antlr4-c3";
import { ParseTree } from "antlr4ts/tree";
import { ParserRuleContext } from "antlr4ts";


nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export class CobolAnalysisListener implements cobolListener {

    public readonly rgxPositiveInt = /^([1-9][0-9]*|[0-9])$/;

    constructor(public diagnostics: IDiagnosticEntry[], public symbolTable: CobolSymbolTable) {
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
        this.testIdentifier(ctx.program_name(), true, ProgramSymbol);
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
        this.testIdentifier(ctx.alpha_name(), false, ALPHABET_Symbol);
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

    enterSymbol_char(ctx: Symbol_charContext) {
        let symbCharSymbol = this.symbolTable.symbolWithContext(ctx);
        if (symbCharSymbol instanceof SYMBOLIC_CHARACTERS_Symbol) {
            if (symbCharSymbol.resolve(symbCharSymbol.name) !== symbCharSymbol) {
                markContext(this.diagnostics, ctx, localize("isnt_unique", "Isn't unique"));
            }
        }
    }

    enterSymb_ch_def_in_alphabet(ctx: Symb_ch_def_in_alphabetContext) {
        this.testIdentifier(ctx.alpha_name(), false, ALPHABET_Symbol);
    }

    enterCursor_is(ctx: Cursor_isContext) {
        let symbol = this.testQualifiedIdentifier(ctx.qualified_data_item(), false, DataRecordSymbol);
        if (symbol instanceof DataRecordSymbol) {
            if (!this.testCursorData(symbol)) {
                markContext(this.diagnostics, ctx, localize("invalid_data", "Invalid data description"));
            }
        }
    }

    enterCrt_is(ctx: Crt_isContext) {
        let symbol = this.testQualifiedIdentifier(ctx.qualified_data_item(), false, DataRecordSymbol);
        if (symbol instanceof DataRecordSymbol) {
            if (!this.testCRTData(symbol)) {
                markContext(this.diagnostics, ctx, localize("invalid_data", "Invalid data description"));
            }
        }
    }

    enterSrc_string(ctx: Src_stringContext) {
        this.testQualifiedIdentifier(ctx.qualified_data_item(), false, DataRecordSymbol);
    }

    enterFirst_proc(ctx: First_procContext) {
        this.testQualifiedIdentifier(ctx.qualified_data_item(), true, ParagraphSymbol, SectionSymbol, DeclarativesSectionSymbol);
    }

    enterIdentifier_result(ctx: Identifier_resultContext) {
        this.testQualifiedIdentifier(ctx.qualified_data_item());
    }

    enterStatement(ctx: StatementContext) {
        let childInA = findChildInA(ctx);
        if (childInA) {
            markToken(this.diagnostics, childInA, localize("must_be_in_B", "This token must be in B area"));
        }
    }

    /****************************************************************************************************/

    private testQualifiedIdentifier<T extends Symbol>(
            identifierCtx?: Qualified_data_itemContext,
            localOnly?: boolean,
            ...allowedTypes: (new (...args: any[]) => T)[])
                : Symbol | undefined {
        if (identifierCtx) {
            return this.testNamePath(identifierCtx, identifierCtx.USER_DEFINED_WORD(), localOnly, ...allowedTypes);
        }
        return undefined;
    }

    private testIdentifier<T extends Symbol>(
            identifierCtx?: ParserRuleContext,
            localOnly?: boolean,
            ...allowedTypes: (new (...args: any[]) => T)[])
                : Symbol | undefined {
        if (identifierCtx) {
            return this.testNamePath(identifierCtx, [identifierCtx], localOnly, ...allowedTypes);
        }
        return undefined;
    }

    private testNamePath<T extends Symbol>(
            ctx: ParserRuleContext,
            namePath: ParseTree[],
            localOnly?: boolean,
            ...allowedTypes: (new (...args: any[]) => T)[])
                : Symbol | undefined {
        let symbols = this.symbolTable.resolveIdentifier(namePath.map(x => x.text), ctx, localOnly);
        if (symbols.length == 0) {
            markContext(this.diagnostics, ctx, localize("undefined_name", "Undefined name"));
            return undefined;
        } else if (symbols.length > 1) {
            markContext(this.diagnostics, ctx, localize("ambigous_name", "Ambigous name"));
            return undefined;
        }
        let symbol = symbols[0];
        this.symbolTable.addOccurance(namePath, symbol);
        if (allowedTypes.length > 0) {
            let allowed = false;
            for(let t of allowedTypes) {
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
            let expandedPicture = CobolAnalysisListener.expandPicture(cursorDataDecord.picture);
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
                    let expandedPicture = CobolAnalysisListener.expandPicture(field1.picture) + 
                                          CobolAnalysisListener.expandPicture(field2.picture);
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

    public static expandPicture(picture: string) {
        let retStr = picture.replace(/(.)\((\d+)\)/g, (match, symbol, count) => {
            return String(symbol).repeat(+count);
        });
        return retStr;
    }
}