/*
 * This file is released under the MIT license.
 * Copyright (c) 2016, 2018, Mike Lischke
 *
 * See LICENSE file for more info.
 */

"use strict";

import { ParserRuleContext } from 'antlr4ts';
import { SymbolTable, Symbol, ScopedSymbol, SymbolTableOptions, NamespaceSymbol } from "antlr4-c3";

import { SymbolKind, SymbolInfo, Definition } from './Facade';
import { SourceContext } from './SourceContext';
import { ParseTree } from 'antlr4ts/tree';
import { symbolDescriptionFromEnum } from './Symbol';

export class ContextSymbolTable extends SymbolTable {

    public tree?: ParserRuleContext; // Set by the owning source context after each parse run.

    public references: Map<Symbol, Set<Symbol>> = new Map<Symbol, Set<Symbol>>();

    constructor(name: string, options: SymbolTableOptions, public owner?: SourceContext) {
        super(name, options);
    }

    public clear() {
        this.references.clear();
        super.clear();
    }

    public addNewSymbol(kind: SymbolKind, name: string, ctx: ParserRuleContext) {
        const symbol = this.addNewSymbolOfType(ContextSymbolTable.getSymbolFromKind(kind), undefined, name);
        symbol.context = ctx;
    }

    public symbolExists(name: string, kind: SymbolKind, localOnly: boolean): boolean {
        return this.getSymbolOfType(name, kind, localOnly) !== undefined;
    }

    public contextForSymbol(symbolName: string, kind: SymbolKind, localOnly: boolean): ParseTree | undefined {
        let symbol = this.getSymbolOfType(symbolName, kind, localOnly);
        if (!symbol) {
            return undefined;
        }
        return symbol.context;
    }

    public getSymbolInfo(symbol: string | Symbol | undefined): SymbolInfo | undefined {
        if (!symbol) {
            return undefined;
        }
        if (!(symbol instanceof Symbol)) {
            let temp = this.resolve(symbol);
            if (!temp) {
                return undefined;
            }
            symbol = temp;
        }

        let kind = ContextSymbolTable.getKindFromSymbol(symbol);
        let name = (symbol as Symbol).name;

        let definitionSymbol = this.definitionSymbolForContext(symbol.context);

        let symbolTable = symbol.symbolTable as ContextSymbolTable;
        const result: SymbolInfo = {
            kind: kind,
            name: name,
            source: (symbol.context && symbolTable && symbolTable.owner) ? symbolTable.owner.fileName : "CLD runtime",
            definition: this.definitionFromSymbol(symbol),
            masterDefinition: this.definitionFromSymbol(definitionSymbol),
        };
        if (definitionSymbol) {
            result.description = symbolDescriptionFromEnum(ContextSymbolTable.getKindFromSymbol(definitionSymbol));
        }
        return result;
    }
    
    /**
     * Returns the definition info for the given rule context.
     */
    public definitionForContext(ctx: ParseTree | undefined): Definition | undefined {
        return this.definitionFromSymbol(this.definitionSymbolForContext(ctx));
    }

    public definitionFromSymbol(definition?: Symbol): Definition | undefined {
        if (definition && definition.context && definition.context instanceof ParserRuleContext) {
            const rule = definition.context;
            const result: Definition = {
                text: rule.text,
                range: {
                    start: { column: rule.start.charPositionInLine, row: rule.start.line },
                    end: { column: rule.start.charPositionInLine + rule.text.length, row: rule.start.line }
                }
            };
            return result;
        }
        return undefined;
    }

    /**
     * Returns the definition info for the given rule context.
     */
    public definitionSymbolForContext(ctx: ParseTree | undefined): Symbol | undefined {
        if (!ctx) {
            return undefined;
        }

        const symbol = this.symbolWithContext(ctx);
        if (symbol && symbol instanceof EntitySymbol) {
            return symbol.definitionSymbol;
        }

        return undefined;
    }

    public linkSymbols(master: Symbol, slave: EntitySymbol) {
        let slaves = this.references.get(master);
        if (!slaves) {
            slaves = new Set<Symbol>();
            this.references.set(master, slaves);
        }
        slaves.add(slave);
        slave.definitionSymbol = master;
    }

    /**
     * Only for master definition
     * @param master 
     */
    public getReferenceCount(master: Symbol): number {
        let slaves = this.references.get(master);
        if (slaves) {
            return slaves.size;
        }
        return 0;
    }

    /**
     * 
     * @param symbol 
     * @param localOnly 
     */
    public getSymbolOccurences(symbol: Symbol, localOnly: boolean): SymbolInfo[] {
        let result: SymbolInfo[] = [];
        let master = symbol;
        
        if (symbol instanceof EntitySymbol && symbol.definitionSymbol) {
            master = symbol.definitionSymbol;
        }

        let slaves = this.references.get(master);
        if (slaves) {
            // add to result
            slaves.forEach(slave => {
                const info = this.getSymbolInfo(slave);
                if (info) {
                    result.push(info);
                }
            });
        }
        // add master (or this)
        const info = this.getSymbolInfo(master);
        if (info) {
            result.push(info);
        }
        return result;
    }

    public getSymbolOfType(name: string, kind: SymbolKind, localOnly: boolean): Symbol | undefined {
        const resolved = this.resolve(name, localOnly);
        if (resolved && ContextSymbolTable.getKindFromSymbol(resolved) === kind) {
            return resolved;
        }
        return undefined;
    }

    public static getSymbolFromKind(kind: SymbolKind) {
        switch (kind) {
            case SymbolKind.Verb:
                return VerbSymbol;
            case SymbolKind.Syntax:
                return SyntaxSymbol;
            case SymbolKind.Type:
                return TypeSymbol;
            case SymbolKind.BuiltInType:
                return BuiltInTypeSymbol;
            case SymbolKind.TypeRef:
                return TypeRefSymbol;
            case SymbolKind.Parameter:
                return ParameterSymbol;
            case SymbolKind.Qualifier:
                return QualifierSymbol;
            case SymbolKind.Keyword:
                return KeywordSymbol;
            case SymbolKind.Label:
                return LabelSymbol;
            case SymbolKind.Entity:
                return EntitySymbol;
            case SymbolKind.Routine:
                return RoutineSymbol;
        }
        return Symbol;
    }

    public static getKindFromSymbol(symbol: Symbol): SymbolKind {
        if (symbol instanceof VerbSymbol) {
            return SymbolKind.Verb;
        }
        if (symbol instanceof SyntaxSymbol) {
            return SymbolKind.Syntax;
        }
        if (symbol instanceof TypeSymbol) {
            return SymbolKind.Type;
        }
        // test TypeRef before Entity
        if (symbol instanceof TypeRefSymbol) {
            return SymbolKind.TypeRef;
        }
        if (symbol instanceof BuiltInTypeSymbol) {
            return SymbolKind.BuiltInType;
        }
        if (symbol instanceof ParameterSymbol) {
            return SymbolKind.Parameter;
        }
        if (symbol instanceof QualifierSymbol) {
            return SymbolKind.Qualifier;
        }
        if (symbol instanceof KeywordSymbol) {
            return SymbolKind.Keyword;
        }
        if (symbol instanceof LabelSymbol) {
            return SymbolKind.Label;
        }
        if (symbol instanceof EntitySymbol) {
            return SymbolKind.Entity;
        }
        if (symbol instanceof RoutineSymbol) {
            return SymbolKind.Routine;
        }
        return SymbolKind.Unknown;
    }

}

export interface INestedEntity { 
    entity: Symbol; 
    nested: number; 
}
export class EntityCollection extends NamespaceSymbol { 
    public unambigousEntities?: Map<string, INestedEntity | undefined>;  // strings in upper case
}
export class WithTypeReference extends ScopedSymbol { 
    public typeReference?: EntityCollection;
}
export class EntitySymbol extends Symbol { 
    public definitionSymbol?: Symbol;
}
export class VerbSymbol extends EntityCollection { }
export class SyntaxSymbol extends EntityCollection { }
export class TypeSymbol extends EntityCollection { }
export class BuiltInTypeSymbol extends Symbol { }
export class TypeRefSymbol extends EntitySymbol { }
export class ParameterSymbol extends WithTypeReference { }
export class QualifierSymbol extends WithTypeReference { }
export class KeywordSymbol extends WithTypeReference { }
export class LabelSymbol extends Symbol { }
export class RoutineSymbol extends Symbol { }
