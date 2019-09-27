import { cobolListener } from '../parser/cobolListener';

import {
    CobolSymbolTable,
} from './ContextSymbolTable';

import {
    ScopedSymbol,
    Symbol,
} from "antlr4-c3";

import {
    Cobol_sourceContext, ProgramContext, Identification_divisionContext,
} from '../parser/cobolParser';

import {
    SyntaxSymbol,
    ProgramSymbol
} from './Symbol';


export class CobolDetailsListener implements cobolListener {
    private currentSymbol: Symbol | undefined;

    constructor(private symbolTable: CobolSymbolTable, private imports: string[]) {

    }

    enterProgram(ctx: ProgramContext) {
        // name of the program may be defined in the program_id rule
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(ProgramSymbol, undefined);
        this.currentSymbol.context = ctx;
    }

    exitProgram(ctx: ProgramContext) {
        this.backToParent();
    }

    enterIdentification_division(ctx: Identification_divisionContext) {
        // has no name, must be present only once in the program
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(ProgramSymbol, this.currentSymbol as ScopedSymbol);
        this.currentSymbol.context = ctx;
    }

    exitIdentification_division(ctx: Identification_divisionContext) {
        this.backToParent();
    }


    //********************************************************************
    private backToParent() {
        if (this.currentSymbol) {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }
}
