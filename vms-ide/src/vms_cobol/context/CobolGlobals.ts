import { Uri, workspace } from 'vscode';
import { CobolSymbolTable } from "./CobolSymbolTable";
import { ProjDepTree } from "../../synchronizer/dep-tree/proj-dep-tree";
import {
    Symbol,
} from 'antlr4-c3';
import { IdentifierSymbol, DataRecordSymbol, ProgramSymbol, IntrinsicFunctionSymbol, getKindFromSymbol, getSymbolFromKind } from './CobolSymbol';
import { CobolSourceContext } from './CobolSourceContext';
import { IDefinition } from '../../common/parser/Facade';

interface IGlobalEntry {
    symbolTable: CobolSymbolTable,
    definitions: Map<Symbol, IDefinition[]>,
    using: Map<Symbol, IDefinition[]>,
}

export class CobolGlobals {

    /**
     * key = filePath, value = array of global symbols (wthout contexts!)
     */
    static globalMap = new Map<string, IGlobalEntry>();

    /**
     * Save globals from given file
     * @param fileName full name
     * @param globals 
     */
    public static async addGlobals(context: CobolSourceContext): Promise<boolean> {
        let symbolTable = context.getSymbolTable();
        let localSymbolTable = new CobolSymbolTable(context.fileName, { allowDuplicateSymbols: true } );
        // collect only first-level programs defined here (with context)
        let identifiers = symbolTable.getNestedSymbolsOfType(IdentifierSymbol);
        let globalDefinitions = new Map<Symbol, IDefinition[]>();
        for(let identifier of identifiers) {
            if (identifier.context &&
                identifier.parent === symbolTable &&
                identifier instanceof ProgramSymbol && !(identifier instanceof IntrinsicFunctionSymbol )) {
                let identifierKind = getKindFromSymbol(identifier);
                let identifierSymbol = getSymbolFromKind(identifierKind);
                let localCopy = localSymbolTable.addNewSymbolOfType(identifierSymbol, localSymbolTable, identifier.name);
                if (localCopy instanceof ProgramSymbol) {
                    localCopy.definition = identifier.definition;
                    let localCopyDefinitions: IDefinition[] = [];
                    for(let occ of symbolTable.getSymbolOccurences(identifier)) {
                        if (occ.range) {
                            let srcPos = context.sourceRangeFromResult(occ.range);
                            localCopyDefinitions.push({
                                range: srcPos.range,
                                source: srcPos.source,
                                text: occ.text,
                                quotas: occ.quotas
                            });
                        }
                    }
                    globalDefinitions.set(localCopy, localCopyDefinitions);
                }
            }
        }
        // collect symbols having master in other source
        let globalUsing = new Map<Symbol, IDefinition[]>();
        for (let [name, links] of symbolTable.occurence) {
            for(let link of links) {
                if (link.master.symbolTable !== symbolTable) {
                    let masterDefinitions: IDefinition[] = [];
                    for(let occ of symbolTable.getSymbolOccurences(link.master)) {
                        if (occ.range) {
                            let srcPos = context.sourceRangeFromResult(occ.range);
                            masterDefinitions.push({
                                range: srcPos.range,
                                source: srcPos.source,
                                text: occ.text,
                                quotas: occ.quotas,
                            });
                        }
                    }
                    globalUsing.set(link.master, masterDefinitions);
                }
            }
        }
        this.globalMap.set(context.fileName, {
            symbolTable: localSymbolTable,
            definitions: globalDefinitions,
            using: globalUsing,
        });
        return true;
    }

    /**
     * Return globals from given file
     * @param fileName 
     */
    public static getGlobals(fileName: string): IGlobalEntry | undefined {
        return this.globalMap.get(fileName);
    }

    /**
     * Just remove
     * @param fileName 
     */
    public static async removeGlobals(fileName?: string) {
        if (fileName) {
            this.globalMap.delete(fileName);
        } else {
            this.globalMap.clear();
        }
    }
    /**
     * Collect all reachable globals for given file
     * @param fileName full name
     */
    public static collectGlobalsForSource(fileName: string): Symbol[] {
        let retSymbols: Symbol[] = [];
        // 1. build source list, which is reachable from this source (using Proj)
        let wsFolder =  workspace.getWorkspaceFolder(Uri.file(fileName));
        if (wsFolder) {
            let deps = new ProjDepTree().getDepList(wsFolder.name);
            // TODO: filter by deps
            for(let [filePath, entry] of this.globalMap) {
                retSymbols.push(...entry.symbolTable.getAllNestedSymbols());
            }
        }
        return retSymbols;
    }

    /**
     * Find global symbols by name
     * @param fileName 
     * @param identifier 
     */
    public static findGlobalForSource(fileName: string, identifier: string): Symbol[] {
        let retSymbols: Symbol[] = [];
        // 1. build source list, which is reachable from this source (using Proj)
        let wsFolder =  workspace.getWorkspaceFolder(Uri.file(fileName));
        if (wsFolder) {
            let deps = new ProjDepTree().getDepList(wsFolder.name);
            // TODO: filter by deps
            for(let [filePath, entry] of this.globalMap) {
                retSymbols.push(...entry.symbolTable.getAllNestedSymbols(identifier));
            }
        }
        return retSymbols;
    }

    /**
     * Get definition by symbol
     * @param identifier 
     * @param fileName 
     */
    public static definition(identifier: Symbol, fileName?: string): IDefinition[] | undefined {
        if (fileName) {
            let entry = this.globalMap.get(fileName);
            if (entry) {
                return entry.definitions.get(identifier);
            }
        } else {
            for(let [file, entry] of this.globalMap) {
                let definition = entry.definitions.get(identifier);
                if (definition) {
                    return definition;
                }
            }
        }
        return undefined;
    }

    /**
     * Returns links to that symbol from other sources
     * @param identifier 
     */
    public static links(identifier: Symbol) {
        let usedDefinitions: IDefinition[] = [];
        for(let [file, entry] of this.globalMap) {
            for(let [usedSymbol, definitions] of entry.using) {
                if (usedSymbol.name === identifier.name &&
                    usedSymbol.symbolTable && identifier.symbolTable &&
                    usedSymbol.symbolTable.name == identifier.symbolTable.name) {
                    usedDefinitions.push(...definitions);
                }
            }
        }
        return usedDefinitions;
    }
}