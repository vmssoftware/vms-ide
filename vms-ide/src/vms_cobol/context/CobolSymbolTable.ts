"use strict";
import { ParserRuleContext } from 'antlr4ts';
import { SymbolTable, Symbol, ScopedSymbol, SymbolTableOptions, NamespaceSymbol } from "antlr4-c3";
import { ParseTree } from 'antlr4ts/tree';

import { ISymbolInfo, IDefinition } from '../../common/parser/Facade';
import { definitionForContext, isNodeIncludes } from '../../common/parser/Helpers';

import { CobolSourceContext } from './CobolSourceContext';
import { symbolDescriptionFromEnum, getKindFromSymbol, ProgramSymbol, IdentifierSymbol, DataRecordSymbol } from './CobolSymbol';

/**
 * First element in ParseTree[] is name definition context
 */
export interface ILink {
    master: Symbol;
    references: (ParseTree | undefined) [];
}

export class CobolSymbolTable extends SymbolTable {
    public tree?: ParserRuleContext; // Set by the owning source context after each parse run.

    public occurance = new Map<string, ILink[]>();

    constructor(name: string, options: SymbolTableOptions, public owner?: CobolSourceContext) {
        super(name, options);
    }

    public clear() {
        // Before clearing the dependencies make sure the owners are updated.
        super.clear();
        this.occurance.clear();
    }

    public createOccurance(symbol: Symbol, ctx?: ParseTree) {
        let link: ILink = {
            master: symbol,
            references: [ctx],
        };
        let entry = this.occurance.get(symbol.name);
        if (entry) {
            entry.push(link);
        } else {
            this.occurance.set(symbol.name, [link]);
        }
    }

    /**
     * Add names to occurances of origin
     * @param namePath 
     * @param origin 
     */
    public addOccurance(namePath: ParseTree[], origin: Symbol): boolean {
        let retCode = false;
        if (namePath.length > 0) {
            let passSymbol: Symbol | undefined = origin;
            let idxName = 0;
            let upperName = namePath[idxName].text.toUpperCase();
            while (passSymbol) {
                if (passSymbol.name.toUpperCase() === upperName) {
                    let links = this.occurance.get(upperName);
                    if (links) {
                        for (let link of links) {
                            if (link.master === passSymbol) {
                                link.references.push(namePath[idxName]);
                            }
                        }
                    }
                    ++idxName;
                    if (idxName < namePath.length) {
                        upperName = namePath[idxName].text.toUpperCase();
                    } else {
                        retCode = true;
                        break;
                    }
                }
                if (passSymbol instanceof ProgramSymbol) {
                    break;
                }
                passSymbol = passSymbol.parent;
            }
        }
        return retCode;
    }

    /**
     * Resolve data items, sections and paragraphs
     * @param namePath 
     * @param ctx if undefined, the current scope is symbolTable root
     * @param localOnly please, set to true for sections & paragraphs
     */
    public resolveIdentifier(namePath: string[], ctx?: ParseTree, localOnly?: boolean): Symbol[] {
        let matched = this.collectCandidates(namePath);
        let retSymbols: Symbol[] = [];
        if (matched.length > 0) {
            let currentScopeSymbol = this.getEnclosingSymbolForContext(ctx);
            let requireGlobal = false;
            // in first try to add candidates from the nearest scope
            while (currentScopeSymbol) {
                // for each matched candidate find if they are in the same scope
                for (let candidate of matched) {
                    // most global candidates will be added later
                    if (!(candidate.parent instanceof SymbolTable)) {
                        let current: Symbol | undefined = candidate;
                        while(current) {
                            if (current === currentScopeSymbol) {
                                if (!requireGlobal || (!(candidate instanceof IdentifierSymbol) || candidate.isGlobal)) {
                                    retSymbols.push(candidate);
                                }
                                break;
                            }
                            // do not pass through program while finding appropriate scope, 
                            // so upper program doesn't see symbols from lower program
                            if (current instanceof ProgramSymbol) {
                                break;
                            }
                            current = current.parent;
                        }
                    }
                }
                if (retSymbols.length > 0) {
                    break;
                }
                // when passing through program, global flag will be required
                // so lower program will see symbols from upper program only if they are global
                if (currentScopeSymbol instanceof ProgramSymbol) {
                    if (localOnly) {
                        break;
                    }
                    requireGlobal = true;
                }
                // go to enclosing scope and test again
                currentScopeSymbol = currentScopeSymbol.parent;
            }
            // add most global candidates at the end
            for (let candidate of matched) {
                if (candidate.parent instanceof SymbolTable) {
                    retSymbols.push(candidate);
                }
            }
        }
        return retSymbols;
    }

    /**
     * collect all matched candidates
     * @param namePath 
     */
    private collectCandidates(namePath: string[]): Symbol[] {
        let matched: Symbol[] = [];
        if (namePath.length > 0) {
            // 1. collect all candidates
            namePath = namePath.map(x => x.toUpperCase());
            let name = namePath[0];
            let links = this.occurance.get(name);
            if (links) {
                // for each candidate
                for (let candidate of links.map(x => x.master)) {
                    let idxName = 1;
                    // go through from origin to program and collect info
                    let current: Symbol | undefined = candidate;
                    while (current) {
                        // only data symbols may occur in path
                        if (current instanceof ProgramSymbol) {
                            break;
                        }
                        if (idxName < namePath.length && current.name.toUpperCase() === namePath[idxName]) {
                            ++idxName;
                        }
                        current = current.parent;
                    }
                    // if all names passed
                    if (idxName === namePath.length) {
                        if (!(candidate instanceof DataRecordSymbol) || !candidate.requireQualification || namePath.length > 1) {
                            matched.push(candidate);
                        }
                    }
                }
            }
        }
        return matched;
    }

    /**
     * Get first enclosing symbol for given context
     * @param ctx 
     */
    public getEnclosingSymbolForContext(ctx: ParseTree | undefined) : Symbol | undefined {
        if (ctx) {
            return this.getEnclosingSymbolForContextReccurent(this, ctx);
        }
        return this;
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

    /**
     * Get information of given symbol (symbol is the place where it is defined)
     * @param symbol 
     */
    public getSymbolInfo(symbol: string | Symbol | undefined): ISymbolInfo | undefined {
        symbol = this.ensureSymbol(symbol);
        if (!symbol) {
            return undefined;
        }

        let kind = getKindFromSymbol(symbol);
        let name = this.getSymbolPath(symbol);

        const result: ISymbolInfo = {
            description: name,
            source: this.owner?this.owner.fileName:"",
            definition: this.getSymbolNameDefinition(symbol),
            kindString: symbolDescriptionFromEnum(kind),
        };

        return result;
    }

    public getSymbolPath<T extends Symbol>(symbolParam: string | Symbol | undefined, stopType?: new (...args: any[]) => T): string {
        let symbol = this.ensureSymbol(symbolParam);
        if (!symbol) {
            return "<anonymous>";
        }
        let retStr = "";
        while(symbol) {
            retStr = (retStr? retStr + "\\" : "") + (symbol.name?symbol.name:"<anonymous>");
            symbol = symbol.parent;
            if (symbol === this || stopType && symbol instanceof stopType) {
                break;
            }
        }
        return retStr;
    }

    /**
     * Get where this symbol appears
     * @param symbol 
     */
    public getSymbolNameDefinition(symbol: Symbol): IDefinition | undefined {
        let links = this.occurance.get(symbol.name.toUpperCase());
            if (links) {
            for(let link of links) {
                if (link.master === symbol) {
                    if (link.references.length > 0) {
                        return definitionForContext(link.references[0]);
                    }
                    break;
                }
            }
        }
        return undefined;
    }

    /**
     * Get where this symbol appears
     * @param symbol 
     */
    public getSymbolOccurences(symbol: Symbol): IDefinition[] {
        let result: IDefinition[] = [];
        let links = this.occurance.get(symbol.name.toUpperCase());
            if (links) {
            for(let link of links) {
                if (link.master === symbol) {
                    for (let node of link.references) {
                        let def = definitionForContext(node);
                        if (def) {
                            result.push(def);
                        }
                    }
                    break;
                }
            }
        }
        return result;
    }

    /**
     * Get master symbol for current context (if it was added before of course)
     * @param ctx 
     */
    public getMasterSymbol(ctx: ParseTree) {
        let links = this.occurance.get(ctx.text.toUpperCase());
        if (links) {
            for(let link of links) {
                for (let node of link.references) {
                    if (node && isNodeIncludes(node, ctx)) {
                        return link.master;
                    }
                }
            }
        }
        return undefined;
    }

    /**
     * If symbol is Symbol, returns it. If symbol is string, resolves it.
     * @param symbol 
     * @returns Symbol or undefined
     */
    private ensureSymbol(symbol: string | Symbol | undefined): Symbol | undefined {
        if (typeof symbol === "string") {
            return this.resolve(symbol);
        }
        return symbol;
    }
}
