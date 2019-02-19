import { SymbolTable, Symbol, ScopedSymbol, SymbolTableOptions } from "antlr4-c3";
import { ParserRuleContext } from "antlr4ts";
import { SourceContext } from "./SourceContext";
import { SymbolKind, SymbolInfo } from "./MsgFacade";
import { ParseTree } from "antlr4ts/tree";

export class ContextSymbolTable extends SymbolTable {
    
    private symbolReferences: Map<string, number> = new Map();

    public tree?: ParserRuleContext; // Set by the owning source context after each parse run.

    constructor(name: string, options: SymbolTableOptions, public owner?: SourceContext) {
        super(name, options);
    }

    public clear() {
        this.symbolReferences.clear();
        super.clear();
    }

    public addNewSymbol(kind: SymbolKind, name: string, ctx: ParserRuleContext) {
        let symbol: Symbol;
        switch (kind) {
            default:
                symbol = this.addNewSymbolOfType(OtherSymbol, undefined, name);
                break;
        }
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

    public getSymbolInfo(symbol: string | Symbol): SymbolInfo | undefined {
        if (!(symbol instanceof Symbol)) {
            let temp = this.resolve(symbol);
            if (!temp) {
                return undefined;
            }
            symbol = temp;
        }

        let kind = SourceContext.getKindFromSymbol(symbol);
        let name = (symbol as Symbol).name;

        let symbolTable = symbol.symbolTable as ContextSymbolTable;
        return {
            kind: kind,
            name: name,
            source: (symbol.context && symbolTable && symbolTable.owner) ? symbolTable.owner.fileName : "runtime",
            definition: SourceContext.definitionForContext(symbol.context, true),
            description: undefined
        };

    }

    private symbolsOfType<T extends Symbol>(t: new (...args: any[]) => T, localOnly: boolean = false): SymbolInfo[] {
        var result: SymbolInfo[] = [];

        let symbols = this.getAllSymbols(t, localOnly);
        for (let symbol of symbols) {
            let root = symbol.root as ContextSymbolTable;
            result.push({
                kind: SourceContext.getKindFromSymbol(symbol),
                name: symbol.name,
                source: root.owner ? root.owner.fileName : "runtime",
                definition: SourceContext.definitionForContext(symbol.context, true),
                description: undefined
            });
        }
        return result;
    }

    public listTopLevelSymbols(localOnly: boolean): SymbolInfo[] {
        let result: SymbolInfo[] = [];

        // result.push(...this.symbolsOfType(FacilityNameSymbol, localOnly));
        // result.push(...this.symbolsOfType(LiteralSymbol, localOnly));
        // result.push(...this.symbolsOfType(VariableSymbol, localOnly));

        return result;
    }

    public getReferenceCount(symbolName: string): number {
        let reference = this.symbolReferences.get(symbolName);
        if (reference) {
            return reference;
        } else {
            return 0;
        }
    }

    public getUnreferencedSymbols(): string[] {
        let result: string[] = [];
        for (let entry of this.symbolReferences) {
            if (entry[1] === 0) {
                result.push(entry[0]);
            }
        }
        return result;
    }

    public incrementSymbolRefCount(symbolName: string) {
        let reference = this.symbolReferences.get(symbolName);
        if (reference) {
            this.symbolReferences.set(symbolName, reference + 1);
        } else {
            this.symbolReferences.set(symbolName, 1);
        }
    }

    public getSymbolOccurences(symbolName: string, localOnly: boolean): SymbolInfo[] {
        let result: SymbolInfo[] = [];

        let symbols = this.getAllSymbols(Symbol, localOnly);
        for (let symbol of symbols) {
            let owner = (symbol.root as ContextSymbolTable).owner;

            if (owner) {
                if (symbol.context && symbol.name === symbolName) {
                    let context = symbol.context;

                    result.push({
                        kind: SourceContext.getKindFromSymbol(symbol),
                        name: symbolName,
                        source: owner.fileName,
                        definition: SourceContext.definitionForContext(context, true),
                        description: undefined
                    });
                }

                if (symbol instanceof ScopedSymbol) {
                    let references = symbol.getAllNestedSymbols(symbolName);
                    for (let reference of references) {
                        result.push({
                            kind: SourceContext.getKindFromSymbol(reference),
                            name: symbolName,
                            source: owner.fileName,
                            definition: SourceContext.definitionForContext(reference.context, true),
                            description: undefined
                        });
                    }
                }
            }
        }

        return result;
    }

    private getSymbolOfType(name: string, kind: SymbolKind, localOnly: boolean): Symbol | undefined {
        switch (kind) {
            case SymbolKind.Other:
                return this.resolve(name, localOnly) as OtherSymbol;
        }
        return undefined;
    }

}

export class OperatorSymbol extends Symbol { }
export class OtherSymbol extends Symbol { }
export class VariableSymbol extends ScopedSymbol { }
