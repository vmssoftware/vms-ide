"use strict";
import { ParserRuleContext } from 'antlr4ts';
import { SymbolTable, Symbol, ScopedSymbol, SymbolTableOptions, NamespaceSymbol } from "antlr4-c3";
import { ISymbolInfo, IDefinition } from '../../common/parser/Facade';
import { CobolSourceContext } from './SourceContext';
import { Interval } from 'antlr4ts/misc';
import { ParseTree, TerminalNode } from 'antlr4ts/tree';
import { symbolDescriptionFromEnum, ECobolSymbolKind } from './Symbol';

export class CobolSymbolTable extends SymbolTable 
{
    public tree?: ParserRuleContext; // Set by the owning source context after each parse run.

    public references: Map<Symbol, Set<Symbol>> = new Map<Symbol, Set<Symbol>>();

    constructor(name: string, options: SymbolTableOptions, public owner?: CobolSourceContext) 
    {
        super(name, options);
    }

    public clear() 
    {
        // Before clearing the dependencies make sure the owners are updated.
        this.references.clear();
        super.clear();
    }

    public addNewSymbol(kind: ECobolSymbolKind, name: string, ctx: ParserRuleContext) 
    {
        const symbol = this.addNewSymbolOfType(CobolSymbolTable.getSymbolFromKind(kind), undefined, name);
        symbol.context = ctx;
    }

    public symbolExists(name: string, kind: ECobolSymbolKind, localOnly: boolean): boolean 
    {
        return this.getSymbolOfType(name, kind, localOnly) !== undefined;
    }

    public contextForSymbol(symbolName: string, kind: ECobolSymbolKind, localOnly: boolean): ParseTree | undefined 
    {
        let symbol = this.getSymbolOfType(symbolName, kind, localOnly);

        if (!symbol) 
        {
            return undefined;
        }

        return symbol.context;
    }

    public getSymbolDefinition(symbol: string | Symbol | undefined): ECobolSymbolKind | undefined
    {
        if (!symbol) 
        {
            return undefined;
        }

        if (!(symbol instanceof Symbol)) 
        {
            let temp = this.resolve(symbol);

            if (!temp) 
            {
                return undefined;
            }

            symbol = temp;
        }

        return undefined;
    }


    public getSymbolInfo(symbol: string | Symbol | undefined): ISymbolInfo<ECobolSymbolKind> | undefined 
    {
        if (!symbol) 
        {
            return undefined;
        }

        if (!(symbol instanceof Symbol)) 
        {
            let temp = this.resolve(symbol);

            if (!temp) 
            {
                return undefined;
            }

            symbol = temp;
        }

        let kind = CobolSymbolTable.getKindFromSymbol(symbol);
        let name = (symbol as Symbol).name;

        let definitionSymbol = this.definitionSymbolForContext(symbol.context);

        let symbolTable = symbol.symbolTable as CobolSymbolTable;
        const result: ISymbolInfo<ECobolSymbolKind> = {
            kind: kind,
            name: name,
            source: (symbol.context && symbolTable && symbolTable.owner) ? symbolTable.owner.fileName : "Cobol runtime",
            definition: this.definitionFromSymbol(symbol),
        };

        if (definitionSymbol) 
        {
            result.description = symbolDescriptionFromEnum(CobolSymbolTable.getKindFromSymbol(definitionSymbol));
        }

        return result;
    }
    
    /**
     * Returns the definition info for the given rule context.
     */
    public definitionForContext(ctx: ParseTree | undefined): IDefinition | undefined 
    {
        return this.definitionFromSymbol(this.definitionSymbolForContext(ctx));
    }

    public definitionFromSymbol(definition?: Symbol): IDefinition | undefined 
    {
        if (definition && definition.context && definition.context instanceof ParserRuleContext) 
        {
            const rule = definition.context;
            const result: IDefinition = {
                text: rule.text,
                range: 
                {
                    start: { column: rule.start.charPositionInLine, row: rule.start.line },
                    end: { column: rule.start.charPositionInLine + rule.text.length, row: rule.stop ? rule.stop.line : rule.start.line }
                }
            };

            let range = <Interval> { a: definition.context.start.startIndex, b: definition.context.stop!.stopIndex };
            let cs = definition.context.start.tokenSource!.inputStream;
            result.text = cs!.getText(range);

            return result;
        }
        else if (definition && definition.context && definition.context instanceof TerminalNode) 
        {
            const result: IDefinition = {
                text: definition.context.text,
                range: 
                {
                    start: { column: definition.context.symbol.charPositionInLine, row: definition.context.symbol.line },
                    end: { column: definition.context.symbol.charPositionInLine + definition.context.text.length, row: definition.context.symbol.line }
                }
            };

            return result;
        }

        return undefined;
    }

    /**
     * Returns the definition info for the given rule context.
     */
    public definitionSymbolForContext(ctx: ParseTree | undefined): Symbol | undefined 
    {
        if (!ctx) 
        {
            return undefined;
        }

        const symbol = this.symbolWithContext(ctx);

        if (symbol) 
        {
            return symbol;
        }

        return undefined;
    }

    public linkSymbols(master: Symbol, slave: Symbol) 
    {
        let slaves = this.references.get(master);

        if (!slaves) 
        {
            slaves = new Set<Symbol>();
            this.references.set(master, slaves);
        }
    }

    /**
     * Only for master definition
     * @param master 
     */
    public getReferenceCount(master: Symbol): number 
    {
        let slaves = this.references.get(master);

        if (slaves) 
        {
            return slaves.size;
        }

        return 0;
    }

    public getSymbolOccurences(symbol: Symbol, column: number, row: number, localOnly: boolean): ISymbolInfo<ECobolSymbolKind>[] 
    {
        let result: ISymbolInfo<ECobolSymbolKind>[] = [];
        let localSymbol: Symbol | undefined;
        let localBlock: Symbol | undefined;

        return result;
    }

    public getSymbolOfType(name: string, kind: ECobolSymbolKind, localOnly: boolean): Symbol | undefined 
    {
        const resolved = this.resolve(name, localOnly);

        if (resolved && CobolSymbolTable.getKindFromSymbol(resolved) === kind) 
        {
            return resolved;
        }

        return undefined;
    }

    //*****************************************************************
    //                              Static
    //*****************************************************************

    public static getSymbolFromKind(kind: ECobolSymbolKind) : typeof Symbol
    {
        switch (kind) 
        {
            case ECobolSymbolKind.Unknown:
            default:
                return Symbol;
        }
    }

    public static getKindFromSymbol(symbol: Symbol): ECobolSymbolKind 
    {
        if (symbol instanceof Symbol) 
        {
            return ECobolSymbolKind.Unknown;
        }
        return ECobolSymbolKind.Unknown;
    }

}
