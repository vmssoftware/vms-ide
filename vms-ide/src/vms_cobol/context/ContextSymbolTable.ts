"use strict";
import { ParserRuleContext } from 'antlr4ts';
import { SymbolTable, Symbol, ScopedSymbol, SymbolTableOptions, NamespaceSymbol } from "antlr4-c3";
import { ISymbolInfo, IDefinition } from '../../common/parser/Facade';
import { CobolSourceContext } from './SourceContext';
import { Interval } from 'antlr4ts/misc';
import { ParseTree, TerminalNode } from 'antlr4ts/tree';
import { symbolDescriptionFromEnum, ECobolSymbolKind, getKindFromSymbol } from './Symbol';

export class CobolSymbolTable extends SymbolTable {
    public tree?: ParserRuleContext; // Set by the owning source context after each parse run.

    /**
     * First element in ParseTree[] is name definition context
     */
    public occurance = new Map<Symbol, ParseTree[]>();

    constructor(name: string, options: SymbolTableOptions, public owner?: CobolSourceContext) {
        super(name, options);
    }

    public clear() {
        // Before clearing the dependencies make sure the owners are updated.
        super.clear();
        this.occurance.clear();
    }

    public getEnclosingSymbolForContext(ctx: ParseTree | undefined) : Symbol | undefined {
        if (ctx) {
            return this.getEnclosingSymbolForContextReccurent(this, ctx);
        }
        return undefined;
    }

    private getEnclosingSymbolForContextReccurent(root: ScopedSymbol, ctx: ParseTree) : Symbol {
        let ctxInterval = ctx.sourceInterval;
        for (let child of root.children) {
            if (child.context) {
                let childInterval = child.context.sourceInterval;
                if (childInterval.a <= ctxInterval.a && ctxInterval.b <= childInterval.b) {
                    if (child instanceof ScopedSymbol) {
                        return this.getEnclosingSymbolForContextReccurent(child, ctx);
                    }
                    return child;
                }
            }
        }
        return root;
    }

    public getSymbolInfo(symbol: string | Symbol | undefined): ISymbolInfo<ECobolSymbolKind> | undefined {
        symbol = this.ensureSymbol(symbol);
        if (!symbol) {
            return undefined;
        }

        let kind = getKindFromSymbol(symbol);
        let name = (symbol as Symbol).name;

        let definitionSymbol = this.definitionSymbolForContext(symbol.context);

        let symbolTable = symbol.symbolTable as CobolSymbolTable;
        const result: ISymbolInfo<ECobolSymbolKind> = {
            kind: kind,
            name: name,
            source: (symbol.context && symbolTable && symbolTable.owner) ? symbolTable.owner.fileName : "Cobol runtime",
            definition: this.definitionFromSymbol(symbol),
        };

        if (definitionSymbol) {
            result.description = symbolDescriptionFromEnum(getKindFromSymbol(definitionSymbol));
        }

        return result;
    }

    /**
     * Returns the definition info for the given rule context.
     */
    public definitionForContext(ctx: ParseTree | undefined): IDefinition | undefined {
        return this.definitionFromSymbol(this.definitionSymbolForContext(ctx));
    }

    public definitionFromSymbol(definition?: Symbol): IDefinition | undefined {
        if (definition && definition.context && definition.context instanceof ParserRuleContext) {
            const rule = definition.context;
            const result: IDefinition = {
                text: rule.text,
                range:
                {
                    start: { column: rule.start.charPositionInLine, row: rule.start.line },
                    end: { column: rule.start.charPositionInLine + rule.text.length, row: rule.stop ? rule.stop.line : rule.start.line }
                }
            };

            let range = <Interval>{ a: definition.context.start.startIndex, b: definition.context.stop!.stopIndex };
            let cs = definition.context.start.tokenSource!.inputStream;
            result.text = cs!.getText(range);

            return result;
        }
        else if (definition && definition.context && definition.context instanceof TerminalNode) {
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
    public definitionSymbolForContext(ctx: ParseTree | undefined): Symbol | undefined {
        if (!ctx) {
            return undefined;
        }

        const symbol = this.symbolWithContext(ctx);

        if (symbol) {
            return symbol;
        }

        return undefined;
    }

    public getSymbolOccurences(symbol: Symbol, column: number, row: number, localOnly: boolean): ISymbolInfo<ECobolSymbolKind>[] {
        let result: ISymbolInfo<ECobolSymbolKind>[] = [];

        return result;
    }

    public getFirstSymbolOfType<T extends Symbol>(t: new (...args: any[]) => T, name: string): T | undefined {
        for (let symbol of super.getNestedSymbolsOfType(t)) {
            if (symbol.name === name) {
                return symbol;
            }
        }
        return undefined;
    }

    /**
     * If symbol is Symbol, returns it. If symbol is string, resolves it.
     * @param symbol 
     * @returns Symbol or undefined
     */
    public ensureSymbol(symbol: string | Symbol | undefined): Symbol | undefined {
        if (typeof symbol === "string") {
            return this.resolve(symbol);
        }
        return symbol;
    }
}
