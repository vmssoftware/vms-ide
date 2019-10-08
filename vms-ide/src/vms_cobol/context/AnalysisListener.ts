import * as nls from "vscode-nls";

import {
    IDiagnosticEntry,
} from '../../common/parser/Facade';

import {
    cobolListener,
} from "../parser/cobolListener";

import {
    Configuration_sectionContext,
    Identification_divisionContext,
    Memory_size_amountContext,
    ProgramContext,
    Program_collatingContext,
    Program_idContext,
    Segment_limitContext,
    Special_namesContext,
    StatementContext,
    Fd_clauseContext,
    Switch_definitionContext,
    Switch_numContext,
    Symbol_charContext,
    Cursor_isContext,
} from "../parser/cobolParser";

import {
    findChildInA,
    firstContainingContext,
    markToken,
    mostContainingContext,
    testRange,
} from "../../common/parser/helpers";

import {
    CobolSymbolTable,
} from "./ContextSymbolTable";

import {
    ALPHABET_Symbol,
    ProgramSymbol,
    SWITCH_Symbol,
    SYMBOLIC_CHARACTERS_Symbol,
} from "./Symbol";

import {
    Symbol, ScopedSymbol
} from "antlr4-c3";


nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export class CobolAnalysisListener implements cobolListener {
    private programNames = new Set<string>();

    public readonly rgxPositiveInt = /^([1-9][0-9]*|[0-9])$/;

    constructor(public diagnostics: IDiagnosticEntry[], public symbolTable: CobolSymbolTable) {
    }

    enterProgram_id(ctx: Program_idContext) {
        testRange(this.diagnostics, ctx.program_name().text.length, 1, 31,
            localize("text_length_1_31", "Must contain 1 to 31 characters"), ctx.program_name().start);
        if (this.programNames.has(ctx.program_name().text.toUpperCase())) {
            markToken(this.diagnostics, ctx.program_name().start, localize("isnt_unique", "Isn't unique"));
        } else {
            this.programNames.add(ctx.program_name().text.toUpperCase());
        }
        let with_ident_ctx = ctx.with_ident();
        // compiler doesn't test ident length must be in range 1-31
        // if (with_ident_ctx !== undefined) {
        //     testRange(this.diagnostics, with_ident_ctx.ident_string().text.length, 1, 31,
        //         localize("text_length_1_31", "Must contain 1 to 31 characters"), with_ident_ctx.ident_string().start);
        // }
        let programCtx = firstContainingContext(ctx, ProgramContext);
        if (programCtx !== undefined && programCtx.parent instanceof ProgramContext) {
            // this is contained program
            if (with_ident_ctx !== undefined) {
                markToken(this.diagnostics, with_ident_ctx.start, localize("not_in_contained_program", "Cannot be used in a contained program"));
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

    enterConfiguration_section(ctx: Configuration_sectionContext) {
        let programCtx = firstContainingContext(ctx, ProgramContext);
        if (programCtx && programCtx.parent instanceof ProgramContext) {
            // this is the program inside the other program
            markToken(this.diagnostics, ctx.start, localize("not_in_contained_program", "Cannot be used in a contained program"));
        }
    }

    enterMemory_size_amount(ctx: Memory_size_amountContext) {
        if (!ctx.text.match(this.rgxPositiveInt)) {
            markToken(this.diagnostics, ctx.start, localize("must_be_integer", "Must be integer"));
        }
    }

    enterProgram_collating(ctx: Program_collatingContext) {
        let alpha_name = ctx.alpha_name().text.toUpperCase();
        let alphabet_defined = false;
        let alphabet_name_count = 0;
        let programCtx = mostContainingContext(ctx, ProgramContext);
        if (programCtx) {
            let programSymbol = this.symbolTable.symbolWithContext(programCtx);
            if (programSymbol instanceof ProgramSymbol) {
                for (let alphabet of programSymbol.children) {
                    if (alphabet.name === alpha_name) {
                        ++alphabet_name_count;
                        if (alphabet instanceof ALPHABET_Symbol) {
                            alphabet.usedInProgramCollating = true;
                            alphabet_defined = true;
                            let nameCtxs = this.symbolTable.occurance.get(alphabet);
                            if (nameCtxs) {
                                nameCtxs.push(ctx.alpha_name());
                            }
                        }
                    }
                }
            }
        }
        if (!alphabet_defined) {
            if (alphabet_name_count === 0) {
                markToken(this.diagnostics, ctx.alpha_name().start, localize("undefined_name", "Undefined name"));
            } else {
                markToken(this.diagnostics, ctx.alpha_name().start, localize("illegal_type", "Illegal type"));
            }
        }
        if (alphabet_name_count > 1) {
            markToken(this.diagnostics, ctx.alpha_name().start, localize("ambigous_name", "Ambigous name"));
        }
    }

    enterSegment_limit(ctx: Segment_limitContext) {
        let txt = ctx.segment_number().text;
        if (!txt.match(this.rgxPositiveInt)) {
            markToken(this.diagnostics, ctx.segment_number().start, localize("must_be_integer", "Must be integer"));
        }
        let n = Number.parseInt(txt);
        testRange(this.diagnostics, n, 1, 49, localize("number_in_range", "Must be from {0} to {1}", 1, 49), ctx.segment_number().start);
    }

    enterSpecial_names(ctx: Special_namesContext) {
        let contentCtx = ctx.special_names_content();
        if (contentCtx === undefined || contentCtx.text.length === 0) {
            let last_dot = ctx.DOT_(1);
            if (last_dot !== undefined) {
                markToken(this.diagnostics, last_dot.symbol, localize("dot_must_end_some", "Must be at the end of nonempty content"))
            }
        }
    }

    enterSwitch_num(ctx: Switch_numContext) {
        if (!ctx.text.match(this.rgxPositiveInt)) {
            markToken(this.diagnostics, ctx.start, localize("must_be_integer", "Must be integer"));
        }
        let switchNum = Number.parseInt(ctx.text);
        if (switchNum <= 0 || switchNum > 16) {
            markToken(this.diagnostics, ctx.start, localize("invalid_switch_num", "Invalid switch number (must be from 1 to 16)"));
        }
    }

    enterSymbol_char(ctx: Symbol_charContext) {
        let symbCharSymbol = this.symbolTable.symbolWithContext(ctx);
        if (symbCharSymbol instanceof SYMBOLIC_CHARACTERS_Symbol) {
            if (symbCharSymbol.resolve(symbCharSymbol.name) !== symbCharSymbol) {
                markToken(this.diagnostics, ctx.start, localize("isnt_unique", "Isn't unique"));
            }
        }
    }

    enterCursor_is(ctx: Cursor_isContext) {
        let identifierCtx = ctx.qualified_data_item();
        let nodes = identifierCtx.USER_DEFINED_WORD();
        for(let node of nodes) {
            // try get unambigous reference
        }
    }

    enterStatement(ctx: StatementContext) {
        let childInA = findChildInA(ctx);
        if (childInA) {
            markToken(this.diagnostics, childInA, localize("must_be_in_B", "This token must be in B area"));
        }
    }

}