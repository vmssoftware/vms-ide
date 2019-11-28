"use strict";
import { ParserRuleContext } from 'antlr4ts';
import { 
    SymbolTable,
    Symbol,
    ScopedSymbol,
    SymbolTableOptions
 } from "antlr4-c3";
import { ParseTree } from 'antlr4ts/tree';

import {
    ISymbolInfo,
    IDefinition
} from '../../common/parser/Facade';
import {
    definitionForContext,
    isNodeIncludes,
    unifyCobolName
} from '../../common/parser/Helpers';

import { CobolSourceContext } from './CobolSourceContext';

import {
    symbolDescriptionFromEnum,
    getKindFromSymbol,
    ProgramSymbol,
    IdentifierSymbol,
    DataRecordSymbol,
    EDataUsage,
    IntrinsicFunctionSymbol,
    functionDetails,
    programDetails,
    FileSymbol,
    EFileFormat,
} from './CobolSymbol';

import { CobolAnalisisHelper } from './CobolAnalisisHelpers';
import { CobolGlobals } from './CobolGlobals';
import micromatch from 'micromatch';

/**
 * First element in ParseTree[] is name definition context
 */
export interface ILink {
    master: Symbol;
    references: Set<ParseTree|undefined>;
}

interface ISplitSymbols {
    list: string[],
    exclude?: string[],
    matched: ISymbolChain[],
    unmatched: ISymbolChain[],
}

interface ISymbolChain {
    symbol: Symbol,
    child?: ISymbolChain,
}

export class CobolSymbolTable extends SymbolTable {
    public tree?: ParserRuleContext; // Set by the owning source context after each parse run.

    public occurence = new Map<string, ILink[]>();

    constructor(name: string, options: SymbolTableOptions, public owner?: CobolSourceContext) {
        super(name, options);
    }

    public clear() {
        // Before clearing the dependencies make sure the owners are updated.
        super.clear();
        this.occurence.clear();
    }

    public createOccurence(symbol: Symbol, ctx?: ParseTree) {
        let link: ILink = {
            master: symbol,
            references: new Set<ParseTree|undefined>(),
        };
        link.references.add(ctx);
        let entry = this.occurence.get(symbol.name);
        if (entry) {
            entry.push(link);
        } else {
            entry = [link];
            this.occurence.set(symbol.name, entry);
        }
        return entry;
    }

    /**
     * Add names to occurances of origin
     * @param namePath 
     * @param origin 
     */
    public addOccurence(namePath: ParseTree[], origin: Symbol): boolean {
        let retCode = false;
        if (namePath.length > 0) {
            let passSymbol: Symbol | undefined = origin;
            let idxName = 0;
            let unifiedName = unifyCobolName(CobolAnalisisHelper.stringLiteralContent(namePath[idxName].text));
            while (passSymbol) {
                if (passSymbol.name === unifiedName) {
                    let links = this.occurence.get(unifiedName);
                    if (!links) {
                        // for symbol given from globals
                        links = this.createOccurence(origin);
                    }
                    for (let link of links) {
                        if (link.master === passSymbol) {
                            link.references.add(namePath[idxName]);
                        }
                    }
                    ++idxName;
                    if (idxName < namePath.length) {
                        unifiedName = unifyCobolName(CobolAnalisisHelper.stringLiteralContent(namePath[idxName].text));
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
        let matched = this.matchCandidates(namePath).map(x => {
            while(x.child) {
                x = x.child;
            }
            return x.symbol;
        });
        let retSymbols: Symbol[] = [];
        if (matched.length > 0) {
            let retSymbolMap = new Map<string, Symbol[]>();
            let currentScopeSymbol = this.getEnclosingSymbolForContext(ctx);
            let requireGlobal = false;
            // in first try to add candidates from the nearest scope
            while (currentScopeSymbol) {
                // for each matched candidate find if they are in the same scope
                let levelSymbols = new Map<string, Symbol[]>();
                for (let candidate of matched) {
                    // most global candidates will be added later
                    if (!(candidate.parent instanceof SymbolTable)) {
                        let current: Symbol | undefined = candidate;
                        while(current) {
                            if (current === currentScopeSymbol) {
                                if (!requireGlobal || 
                                      (candidate instanceof IdentifierSymbol && candidate.isGlobal === true) ||
                                      (candidate instanceof ProgramSymbol && candidate.isCommon === true)) {
                                    // add all symbols on the same level
                                    let symbols = levelSymbols.get(candidate.name);
                                    if (symbols === undefined) {
                                        symbols = [];
                                        levelSymbols.set(candidate.name, symbols);
                                    }
                                    symbols.push(candidate);
                                }
                                break;
                            }
                            // do not pass through program while finding appropriate scope, 
                            // so upper program doesn't see symbols from lower program
                            // excluding case when candidate is ProgramSymbol too
                            if (current !== candidate && current instanceof ProgramSymbol) {
                                break;
                            }
                            current = current.parent;
                        }
                    }
                }
                // promote level symbols to retSymbols
                for(let [name, symbols] of levelSymbols) {
                    if (!retSymbolMap.has(name)) {
                        retSymbolMap.set(name, symbols);
                    }
                    matched = matched.filter(x => !symbols.includes(x));
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
            retSymbols = Array.from(retSymbolMap.values()).reduce((acc, x) => { 
                acc.push(...x);
                return acc;
             }, []);
            // add all matched persistent candidates at the end
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
     * @param namePath unified names
     */
    private collectCandidates(namePath: string[]): Symbol[] {
        let matched: Symbol[] = [];
        if (namePath.length > 0) {
            // 1. collect all candidates
            let name = namePath[0];
            let links = this.occurence.get(name);
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
                        if (idxName < namePath.length && current.name === namePath[idxName]) {
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
            // add from globals if no local names found, only ProgramSymbol
            if (matched.length == 0 && namePath.length === 1 && this.owner) {
                let globals = CobolGlobals.collectGlobalsForSource(this.owner.fileName);
                matched = globals.filter(x => x instanceof ProgramSymbol && x.name === namePath[0]);
            }
        }
        return matched;
    }
 
    public static splitSymbols(acc: ISplitSymbols, x: ISymbolChain) {
        if (acc.list.includes(x.symbol.name)) {
            if (!acc.exclude || !acc.exclude.includes(x.symbol.name)) {
                acc.matched.push(x);
            }
        } else {
            acc.unmatched.push(x);
        }
        return acc;
    }

    /**
     * Collect candidates by masks
     * @param namePath masks
     */
    public matchCandidates(namePath: string[]): ISymbolChain[] {
        let retSymbols: ISymbolChain[] = [];
        if (namePath.length > 0) {
            // 1. create initial chain
            retSymbols = Array.from(this.occurence.values()).reduce((chain: ISymbolChain[], links: ILink[]) => {
                    chain.push(...links.map(link => ({ symbol: link.master })));
                    return chain;
                }, []);
            let firstName = true;
            // 2. walk thru names and filter symbols
            for (let name of namePath) {
                if (!firstName) {
                    // go to parents
                    retSymbols = retSymbols.reduce((chain: ISymbolChain[], x: ISymbolChain) => {
                        if (x.symbol.parent && !(x.symbol.parent instanceof ProgramSymbol)) {
                            chain.push(({symbol: x.symbol.parent, child: x}));
                        }
                        return chain;
                    }, []);
                }
                // test if matched current name level
                let { matched, unmatched } = retSymbols.reduce(CobolSymbolTable.splitSymbols, {
                    list: micromatch.match(retSymbols.map(x => x.symbol.name), name),
                    matched: [],
                    unmatched: [],
                });
                if (!firstName) {
                    // test if one of parents is matched, until ProgramSymbol
                    while(unmatched.length) {
                        // go to parents for unmatched
                        unmatched = unmatched.reduce((chain: ISymbolChain[], x: ISymbolChain) => {
                            if (x.symbol.parent && !(x.symbol.parent instanceof ProgramSymbol)) {
                                chain.push(({symbol: x.symbol.parent, child: x}));
                            }
                            return chain;
                        }, []);
                        if (unmatched.length) {
                            let { matched: parentsMatched, unmatched: parentsUnmatched } = unmatched.reduce(CobolSymbolTable.splitSymbols, {
                                list: micromatch.match(unmatched.map(x => x.symbol.name), name),
                                matched: [],
                                unmatched: [],
                            });
                            matched.push(...parentsMatched);
                            unmatched = parentsUnmatched;
                        }
                    }
                }
                firstName = false;
                retSymbols = matched;
            }
            // 3. when all name levels passed, test if it must be qualified
            retSymbols.filter((candidate) => !(candidate instanceof DataRecordSymbol) || !candidate.requireQualification || namePath.length > 1);
            // 4. add from globals
            if (namePath.length === 1 && this.owner) {
                let globals = CobolGlobals.collectGlobalsForSource(this.owner.fileName).map(x => ({symbol: x}));
                let { matched } = globals.reduce(CobolSymbolTable.splitSymbols, {
                    list: micromatch.match(globals.map(x => x.symbol.name), namePath[0]),
                    exclude: retSymbols.map(x => x.symbol.name),
                    matched: [],
                    unmatched: [],
                });
                retSymbols.push(...matched);
            }
        }
        return retSymbols;
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
        let name = this.getSymbolPath(symbol, CobolSymbolTable);
        if (symbol instanceof DataRecordSymbol) {
            if (!symbol.isGroup) {
                name += ": " + EDataUsage[symbol.usage].replace(/_/g, "-");
            }
            if (symbol.arrayLvl !== undefined) {
                name += " [ i1";
                for (let i = 2; i <= symbol.arrayLvl; ++i) {
                    name += ", i" + i.toString();
                }
                name += " ]";
            }
        }
        if (symbol instanceof IntrinsicFunctionSymbol && symbol.functionDefinition) {
            name += functionDetails(symbol.functionDefinition);
        }
        if (symbol instanceof ProgramSymbol && symbol.programDefinition) {
            name += programDetails(symbol.programDefinition);
        }
        if (symbol instanceof FileSymbol) {
            name += ": " + EFileFormat[symbol.fileFormat];
        }

        const result: ISymbolInfo = {
            description: name,
            definition: this.getSymbolNameDefinition(symbol),
            kindString: symbolDescriptionFromEnum(kind),
        };
        if (result.definition && !result.definition.source) {
            result.definition.source = this.owner?this.owner.fileName:"";
        }
        return result;
    }

    public getSymbolPath<T extends Symbol>(symbolParam: string | Symbol | undefined, stopType?: new (...args: any[]) => T): string {
        let symbol = this.ensureSymbol(symbolParam);
        if (!symbol) {
            return "<anonymous>";
        }
        let retStr = "";
        while(symbol) {
            retStr = (symbol.name?symbol.name:"<anonymous>") + (retStr? "\\" + retStr: "") ;
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
        if (symbol.getParentOfType(CobolSymbolTable) !== this) {
            // from globals
            let globalDefs = CobolGlobals.definition(symbol);
            if (globalDefs && globalDefs.length > 0) {
                return globalDefs[0];
            }
        } else {
            let links = this.occurence.get(symbol.name);
            if (links) {
                for(let link of links) {
                    if (link.master === symbol) {
                        if (link.references.size > 0) {
                            let firstEntry = link.references.values().next().value;
                            return definitionForContext(firstEntry);
                        }
                        break;
                    }
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
        let links = this.occurence.get(symbol.name);
            if (links) {
            for(let link of links) {
                if (link.master === symbol) {
                    for (let node of link.references) {
                        let def = definitionForContext(node);
                        if (!def) {
                            // create empty definition for empty link node
                            def = {
                                source: "",
                                text: link.master.name
                            }
                        } else if (this.owner) {
                            def.source = this.owner.fileName;
                        }
                        result.push(def);
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
    public getMasterSymbol(ctx?: ParseTree) {
        if (ctx) {
            let links = this.occurence.get(unifyCobolName(CobolAnalisisHelper.stringLiteralContent(ctx.text)));
            if (links) {
                for(let link of links) {
                    for (let node of link.references) {
                        if (node && isNodeIncludes(node, ctx)) {
                            return link.master;
                        }
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
