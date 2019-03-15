/*
 * This file is released under the MIT license.
 * Copyright (c) 2016, 2018, Mike Lischke
 *
 * See LICENSE file for more info.
 */

import { cldListener } from './cldListener';

import {
    ContextSymbolTable,
    KeywordSymbol,
    LabelSymbol,
    ParameterSymbol,
    QualifierSymbol,
    SyntaxSymbol,
    TypeRefSymbol,
    TypeSymbol,
    VerbSymbol,
    EntitySymbol,
    RoutineSymbol,
} from './ContextSymbolTable';

import { SourceContext } from './SourceContext';

import { 
    ScopedSymbol,
    Symbol,
} from "antlr4-c3";

import { 
    DefineSyntaxContext, 
    DefineTypeContext,
    DefineVerbContext,
    KeywordLabelContext,
    KeywordValueClauseTypeContext,
    ParameterContext,
    ParameterLabelContext,
    ParameterValueClauseTypeContext,
    QualifierContext,
    QualifierLabelContext,
    QualifierValueClauseTypeContext,
    TypeClauseContext,
    EntityContext,
    QualifierSyntaxContext,
    KeywordSyntaxContext,
    RoutineContext,
} from './cldParser';

export class DetailsListener implements cldListener {
    constructor(private symbolTable: ContextSymbolTable) { }

    enterDefineSyntax(ctx: DefineSyntaxContext) {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(SyntaxSymbol, undefined, ctx.anyName().text.toUpperCase());
        this.currentSymbol.context = ctx.anyName();
    }


    exitDefineSyntax(ctx: DefineSyntaxContext) {
        if (this.currentSymbol) {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterDefineVerb(ctx: DefineVerbContext) {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(VerbSymbol, undefined, ctx.anyName().text.toUpperCase());
        this.currentSymbol.context = ctx.anyName();
    }

    exitDefineVerb(ctx: DefineVerbContext) {
        if (this.currentSymbol) {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterDefineType(ctx: DefineTypeContext) {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(TypeSymbol, undefined, ctx.anyName().text.toUpperCase());
        this.currentSymbol.context = ctx.anyName();
    }

    exitDefineType(ctx: DefineTypeContext) {
        if (this.currentSymbol) {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterParameter(ctx: ParameterContext) {
        const nameCtx = ctx.anyName();
        if (ctx.PARAMETER() && nameCtx) {
            this.currentSymbol = this.symbolTable.addNewSymbolOfType(ParameterSymbol, this.currentSymbol as ScopedSymbol, nameCtx.text.toUpperCase());
            this.currentSymbol.context = ctx.anyName();
        }
    }

    exitParameter(ctx: ParameterContext) {
        if (ctx.PARAMETER()) {
            if (this.currentSymbol) {
                this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
            }
        }
    }

    enterParameterLabel(ctx: ParameterLabelContext) {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(LabelSymbol, this.currentSymbol as ScopedSymbol, ctx.anyName().text.toUpperCase());
        this.currentSymbol.context = ctx.anyName();
    }

    exitParameterLabel(ctx: ParameterLabelContext) {
        if (this.currentSymbol) {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterQualifier(ctx: QualifierContext) {
        const nameCtx = ctx.anyName();
        if (ctx.QUALIFIER() && nameCtx) {
            this.currentSymbol = this.symbolTable.addNewSymbolOfType(QualifierSymbol, this.currentSymbol as ScopedSymbol, nameCtx.text.toUpperCase());
            this.currentSymbol.context = nameCtx;
        }
    }

    exitQualifier(ctx: QualifierContext) {
        if (ctx.QUALIFIER()) {
            if (this.currentSymbol) {
                this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
            }
        }
    }

    enterQualifierLabel(ctx: QualifierLabelContext) {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(LabelSymbol, this.currentSymbol as ScopedSymbol, ctx.anyName().text.toUpperCase());
        this.currentSymbol.context = ctx.anyName();
    }

    exitQualifierLabel(ctx: QualifierLabelContext) {
        if (this.currentSymbol) {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterQualifierValueClauseType(ctx: QualifierValueClauseTypeContext) {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(TypeRefSymbol, this.currentSymbol as ScopedSymbol, ctx.anyName().text.toUpperCase());
        this.currentSymbol.context = ctx.anyName();
    }

    exitQualifierValueClauseType(ctx: QualifierValueClauseTypeContext) {
        if (this.currentSymbol) {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterParameterValueClauseType(ctx: ParameterValueClauseTypeContext) {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(TypeRefSymbol, this.currentSymbol as ScopedSymbol, ctx.anyName().text.toUpperCase());
        this.currentSymbol.context = ctx.anyName();
    }

    exitParameterValueClauseType(ctx: ParameterValueClauseTypeContext) {
        if (this.currentSymbol) {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterTypeClause(ctx: TypeClauseContext) {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(KeywordSymbol, this.currentSymbol as ScopedSymbol, ctx.anyName().text.toUpperCase());
        this.currentSymbol.context = ctx.anyName();
    }

    exitTypeClause(ctx: TypeClauseContext) {
        if (this.currentSymbol) {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterKeywordLabel(ctx: KeywordLabelContext) {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(LabelSymbol, this.currentSymbol as ScopedSymbol, ctx.anyName().text.toUpperCase());
        this.currentSymbol.context = ctx.anyName();
    }

    exitKeywordLabel(ctx: KeywordLabelContext) {
        if (this.currentSymbol) {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterKeywordValueClauseType(ctx: KeywordValueClauseTypeContext) {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(TypeRefSymbol, this.currentSymbol as ScopedSymbol, ctx.anyName().text.toUpperCase());
        this.currentSymbol.context = ctx.anyName();
    }

    exitKeywordValueClauseType(ctx: KeywordValueClauseTypeContext) {
        if (this.currentSymbol) {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterEntity(ctx: EntityContext) {
        ctx.anyName().forEach(nameCtx => {
            const symbol = this.symbolTable.addNewSymbolOfType(EntitySymbol, this.currentSymbol as ScopedSymbol, nameCtx.text.toUpperCase());
            symbol.context = nameCtx;
        });
    }

    enterQualifierSyntax(ctx: QualifierSyntaxContext) {
        const symbol = this.symbolTable.addNewSymbolOfType(EntitySymbol, this.currentSymbol as ScopedSymbol, ctx.anyName().text.toUpperCase());
        symbol.context = ctx.anyName();
    }

    enterKeywordSyntax(ctx: KeywordSyntaxContext) {
        const symbol = this.symbolTable.addNewSymbolOfType(EntitySymbol, this.currentSymbol as ScopedSymbol, ctx.anyName().text.toUpperCase());
        symbol.context = ctx.anyName();
    }

    enterRoutine(ctx: RoutineContext) {
        const symbol = this.symbolTable.addNewSymbolOfType(RoutineSymbol, this.currentSymbol as ScopedSymbol, ctx.anyName().text.toUpperCase());
        symbol.context = ctx.anyName();
    }

    private currentSymbol: Symbol | undefined;
}

function unquote(input: string, quoteChar?: string) {
    quoteChar = quoteChar || '\"';
    if (input[0] === quoteChar && input[input.length - 1] === quoteChar) {
      return input.slice(1, input.length - 1);
    }
    return input;
}
