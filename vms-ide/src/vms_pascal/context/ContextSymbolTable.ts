"use strict";
import { ParserRuleContext } from 'antlr4ts';
import { SymbolTable, Symbol, ScopedSymbol, SymbolTableOptions, NamespaceSymbol } from "antlr4-c3";
import { SymbolKind, SymbolInfo, Definition } from './Facade';
import { SourceContext } from './SourceContext';
import { Interval } from 'antlr4ts/misc';
import { ParseTree, TerminalNode } from 'antlr4ts/tree';
import { symbolDescriptionFromEnum, IBuildInFunc } from './Symbol';


export class ContextSymbolTable extends SymbolTable 
{
    public tree?: ParserRuleContext; // Set by the owning source context after each parse run.

    public references: Map<Symbol, Set<Symbol>> = new Map<Symbol, Set<Symbol>>();

    constructor(name: string, options: SymbolTableOptions, public owner?: SourceContext) 
    {
        super(name, options);
    }

    public clear() 
    {
        // Before clearing the dependencies make sure the owners are updated.
        if (this.owner) 
        {
            for (let dep of this.dependencies) 
            {
                if ((dep as ContextSymbolTable).owner) 
                {
                    this.owner.removeDependency((dep as ContextSymbolTable).owner!);
                }
            }
        }

        this.references.clear();
        super.clear();
    }

    public addNewSymbol(kind: SymbolKind, name: string, ctx: ParserRuleContext) 
    {
        const symbol = this.addNewSymbolOfType(ContextSymbolTable.getSymbolFromKind(kind), undefined, name);
        symbol.context = ctx;
    }

    public symbolExists(name: string, kind: SymbolKind, localOnly: boolean): boolean 
    {
        return this.getSymbolOfType(name, kind, localOnly) !== undefined;
    }

    public contextForSymbol(symbolName: string, kind: SymbolKind, localOnly: boolean): ParseTree | undefined 
    {
        let symbol = this.getSymbolOfType(symbolName, kind, localOnly);

        if (!symbol) 
        {
            return undefined;
        }

        return symbol.context;
    }

    public getSymbolDefinition(symbol: string | Symbol | undefined): SymbolInfo | undefined
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

        let showRoutine = false;
        let routines = this.getAllSymbols(RoutineSymbol, false);
        let defRoutines = this.getAllSymbols(RoutineDclSymbol, false);

        for(let item of routines)
        {
            if(item.name.toLowerCase() === symbol.name.toLowerCase())
            {
                showRoutine = true;
                break;
            }
        }
        for(let item of defRoutines)
        {
            if(item.name.toLowerCase() === symbol.name.toLowerCase())
            {
                showRoutine = true;
                break;
            }
        }
        
        if(showRoutine)
        {            
            let decRoutineBlocks = this.getAllSymbols(RoutineHeaderSymbol, false);

            return this.findSimbolInfoDedlaration(symbol, defRoutines, decRoutineBlocks);
        }
        else
        {
            let showType = false;
            let types = this.getAllSymbols(TypeDclSymbol, false);
    
            for(let item of types)
            {
                if(item.name.toLowerCase() === symbol.name.toLowerCase())
                {
                    showType = true;
                    break;
                }
            }

            if(showType)
            {
                let decTypes = this.getAllSymbols(TypeDclSymbol, false);
                let decTypeBlocks = this.getAllSymbols(TypeBlockDclSymbol, false);

                return this.findSimbolInfoDedlaration(symbol, decTypes, decTypeBlocks);
            }
            else
            {
                let blocks = this.getAllSymbols(RoutineBlockDclSymbol, false);
                let varDefs = this.getAllSymbols(VariableDclSymbol, false);
                let definition = this.definitionFromSymbol(symbol);

                if(definition)
                {
                    for (let block of blocks)//search block witch contain symbol
                    {
                        let item = this.findSimbolDedlarationInBlock(symbol, block);

                        if(item)
                        {
                            let result = this.getSymbolInfo(item);

                            if(result)
                            {
                                return result;
                            }
                            break;
                        }
                    }

                    //search in global symbols
                    let globalVarsBlocks = this.getAllSymbols(VariableGlobalBlockDclSymbol, false);
                    
                    for (let block of globalVarsBlocks)
                    {
                        if(block.context instanceof ParserRuleContext)
                        {
                            if(block.context.stop)
                            {
                                let startLine = block.context.start.line;
                                let stopLine = block.context.stop.line;

                                for(let item of varDefs)
                                {
                                    if(item.name.toLowerCase() === symbol.name.toLowerCase())
                                    {
                                        let definition = this.definitionFromSymbol(item);
                        
                                        if (definition) 
                                        {
                                            if(definition.range.start.row >= startLine && definition.range.start.row <= stopLine)
                                            {
                                                let result = this.getSymbolInfo(item);

                                                if(result)
                                                {
                                                    return result;
                                                }
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
        let showConst = false;
        let consts = this.getAllSymbols(ConstantDclSymbol, false);

        for(let item of consts)
        {
            if(item.name.toLowerCase() === symbol.name.toLowerCase())
            {
                showConst = true;
                break;
            }
        }

        if(showConst)
        {
            let decConsts = this.getAllSymbols(ConstantDclSymbol, false);
            let decConstBlocks = this.getAllSymbols(ConstBlockDclSymbol, false);

            return this.findSimbolInfoDedlaration(symbol, decConsts, decConstBlocks);
        }

        return undefined;
    }

    private findSimbolDedlarationInBlock(symbol: Symbol, block: Symbol): Symbol | undefined
    {
        let definition = this.definitionFromSymbol(symbol);

        if(definition && block.context instanceof ParserRuleContext)
        {
            if(block.context.stop)
            {
                let startLine = block.context.start.line;
                let stopLine = block.context.stop.line;
                let varDefs = this.getAllSymbols(VariableDclSymbol, false);

                if(definition.range.start.row >= startLine && definition.range.start.row <= stopLine)
                {
                    for(let item of varDefs)
                    {
                        if(item.name.toLowerCase() === symbol.name.toLowerCase())
                        {
                            let definition = this.definitionFromSymbol(item);
            
                            if (definition) 
                            {
                                if(definition.range.start.row >= startLine && definition.range.start.row <= stopLine)
                                {
                                     return item;
                                }
                            }
                        }
                    }                           
                }
            }
        }

        return undefined;
    }

    private findSimbolInfoDedlaration(symbol: Symbol, definitionSymbols: Set<Symbol>, blocks: Set<Symbol>): SymbolInfo | undefined
    {
        for(let item of definitionSymbols)
        {
            if(item.name.toLowerCase() === symbol.name.toLowerCase())
            {
                let definition = this.definitionFromSymbol(item);

                if(definition)
                {
                    for (let block of blocks)//search block witch contain symbol
                    {
                        if(block.name.includes(item.name))
                        {
                            if(block.context instanceof ParserRuleContext)
                            {
                                if(block.context.start)
                                {
                                    if(definition.range.start.row === block.context.start.line)
                                    {
                                        let result = this.getSymbolInfo(block);

                                        if(result)
                                        {
                                            return result;
                                        }
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }

                break;
            }
        }

        return undefined;
    }

    private findLocalSimbolDedlaration(symbol: Symbol): Symbol | undefined
    {
        let blocks = this.getAllSymbols(RoutineBlockDclSymbol, false);

        for (let block of blocks)//search block witch contain symbol
        {
            let local = this.findSimbolDedlarationInBlock(symbol, block);

            if(local)
            {
                return local;
            }
        }

        return undefined;
    }

    public getSymbolInfo(symbol: string | Symbol | undefined): SymbolInfo | undefined 
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

        let kind = ContextSymbolTable.getKindFromSymbol(symbol);
        let name = (symbol as Symbol).name;

        let definitionSymbol = this.definitionSymbolForContext(symbol.context);

        let symbolTable = symbol.symbolTable as ContextSymbolTable;
        const result: SymbolInfo = {
            kind: kind,
            name: name,
            source: (symbol.context && symbolTable && symbolTable.owner) ? symbolTable.owner.fileName : "Pascal runtime",
            definition: this.definitionFromSymbol(symbol),
        };

        if (definitionSymbol) 
        {
            result.description = symbolDescriptionFromEnum(ContextSymbolTable.getKindFromSymbol(definitionSymbol));
        }

        result.dataInfo = "";

        if (symbol instanceof WithTypeScopedSymbol)
        {
            if(symbol.symbolType)
            {
                result.definitionBlock = this.definitionFromSymbol(symbol.symbolType);

                if(result.definition)
                {
                    result.dataInfo = result.definition.text;
                }

                if(result.definitionBlock)
                {
                    result.dataInfo +=": " + result.definitionBlock.text + ";";
                }
            }
            else
            {
                if(result.definition)
                {
                    result.dataInfo = result.definition.text;
                }
            }
        }
        else
        {
            if(result.definition)
            {
                result.dataInfo = result.definition.text;
            }
        }

        if (symbol instanceof InFunctionSymbol)
        {
            if(symbol.functionDefinition)
            {
                result.dataInfo = "{\n\t@description: " + symbol.functionDefinition.description;

                if(symbol.functionDefinition.arguments !== "")
                {
                    result.dataInfo += "\n\t@arguments: " + symbol.functionDefinition.arguments;
                }                
                if(symbol.functionDefinition.result !== "")
                {
                    result.dataInfo += "\n\t@result: " + symbol.functionDefinition.result;
                }
                
                result.dataInfo += "\n}\n" + symbol.functionDefinition.prototype;
            }
        }

        return result;
    }
    
    /**
     * Returns the definition info for the given rule context.
     */
    public definitionForContext(ctx: ParseTree | undefined): Definition | undefined 
    {
        return this.definitionFromSymbol(this.definitionSymbolForContext(ctx));
    }

    public definitionFromSymbol(definition?: Symbol): Definition | undefined 
    {
        if (definition && definition.context && definition.context instanceof ParserRuleContext) 
        {
            const rule = definition.context;
            const result: Definition = {
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
            const result: Definition = {
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

    public getSymbolOccurences(symbol: Symbol, column: number, row: number, localOnly: boolean): SymbolInfo[] 
    {
        let result: SymbolInfo[] = [];
        let localSymbol: Symbol | undefined;
        let localBlock: Symbol | undefined;

        let blocks = this.getAllSymbols(RoutineBlockDclSymbol, localOnly);

        for (let block of blocks)//search block witch contain symbol
        {
            localSymbol = this.findSimbolDedlarationInBlock(symbol, block);

            if(localSymbol)
            {
                localBlock = block;
                break;
            }            
        }

        if(localSymbol && localBlock)
        {
            if(localBlock.context instanceof ParserRuleContext && localBlock.context.stop)
            {
                let startLine = localBlock.context.start.line;
                let stopLine = localBlock.context.stop.line;

                if (localBlock instanceof ScopedSymbol) 
                {
                    let references = this.getAllNestedSymbols(symbol.name);

                    for(let item of references)
                    {
                        const info = this.getSymbolInfo(item);
        
                        if (info && info.definition && info.kind === SymbolKind.Label) 
                        {
                            if(info.definition.range.start.row >= startLine && info.definition.range.start.row <= stopLine)
                            {
                                result.push(info);
                            }
                        }
                    }
                }
            }
        }
        else//global symbol search everywhere
        {            
            let references = this.getAllSymbols(LabelSymbol, localOnly);

            for(let item of references)
            {
                const info = this.getSymbolInfo(item);

                if (info && info.kind === SymbolKind.Label) 
                {
                    if(item.name.toLowerCase() === symbol.name.toLowerCase())
                    {
                        for (let block of blocks)//search block witch contain symbol
                        {
                            localSymbol = this.findSimbolDedlarationInBlock(item, block);
                
                            if(localSymbol)
                            {
                                break;
                            }            
                        }

                        if(!localSymbol)
                        {
                            result.push(info);
                        }
                    }
                }
            }
        }
        
        return result;
    }

    public getSymbolOfType(name: string, kind: SymbolKind, localOnly: boolean): Symbol | undefined 
    {
        const resolved = this.resolve(name, localOnly);

        if (resolved && ContextSymbolTable.getKindFromSymbol(resolved) === kind) 
        {
            return resolved;
        }

        return undefined;
    }

    public static getSymbolFromKind(kind: SymbolKind) 
    {
        switch (kind) 
        {
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
            case SymbolKind.RoutineHeader:
                return RoutineHeaderSymbol;    
            case SymbolKind.Block:
                return BlockSymbol;
            case SymbolKind.VariableDcl:
                return VariableDclSymbol;
            case SymbolKind.TypeDcl:
                return TypeDclSymbol;
            case SymbolKind.TypeBlockDcl:
                return TypeBlockDclSymbol;    
        }

        return Symbol;
    }

    public static getKindFromSymbol(symbol: Symbol): SymbolKind 
    {
        if (symbol instanceof SyntaxSymbol) 
        {
            return SymbolKind.Syntax;
        }
        if (symbol instanceof TypeSymbol) 
        {
            return SymbolKind.Type;
        }
        // test TypeRef before Entity
        if (symbol instanceof TypeRefSymbol) 
        {
            return SymbolKind.TypeRef;
        }
        if (symbol instanceof BuiltInTypeSymbol) 
        {
            return SymbolKind.BuiltInType;
        }
        if (symbol instanceof BuiltInFuncSymbol) 
        {
            return SymbolKind.BuiltInFunc;
        }
        if (symbol instanceof InFunctionSymbol) 
        {
            return SymbolKind.BuiltInFunc;
        }
        if (symbol instanceof ParameterSymbol) 
        {
            return SymbolKind.Parameter;
        }
        if (symbol instanceof QualifierSymbol) 
        {
            return SymbolKind.Qualifier;
        }
        if (symbol instanceof KeywordSymbol) 
        {
            return SymbolKind.Keyword;
        }
        if (symbol instanceof LabelSymbol) 
        {
            return SymbolKind.Label;
        }
        if (symbol instanceof EntitySymbol) 
        {
            return SymbolKind.Entity;
        }
        if (symbol instanceof BlockSymbol) 
        {
            return SymbolKind.Block;
        }
        if (symbol instanceof RoutineSymbol) 
        {
            return SymbolKind.Routine;
        }        
        if (symbol instanceof RoutineHeaderSymbol) 
        {
            return SymbolKind.RoutineHeader;
        }
        if (symbol instanceof RoutineDclSymbol) 
        {
            return SymbolKind.RoutineDcl;
        }
        if (symbol instanceof RoutineBlockDclSymbol) 
        {
            return SymbolKind.RoutineBlockDcl;
        }        
        if (symbol instanceof VariableDclSymbol) 
        {
            return SymbolKind.VariableDcl;
        }
        if (symbol instanceof VariableBlockDclSymbol) 
        {
            return SymbolKind.VariableBlockDcl;
        }
        if (symbol instanceof VariableGlobalBlockDclSymbol) 
        {
            return SymbolKind.VariableGlobalBlockDcl;
        }
        if (symbol instanceof TypeDclSymbol) 
        {
            return SymbolKind.TypeDcl;
        }
        if (symbol instanceof TypeBlockDclSymbol) 
        {
            return SymbolKind.TypeBlockDcl;
        }
        if (symbol instanceof LabelDclSymbol) 
        {
            return SymbolKind.LabelDcl;
        }
        if (symbol instanceof LabelBlockDclSymbol) 
        {
            return SymbolKind.LabelBlockDcl;
        }
        if (symbol instanceof ConstDclSymbol) 
        {
            return SymbolKind.ConstDcl;
        }
        if (symbol instanceof ConstBlockDclSymbol) 
        {
            return SymbolKind.ConstBlockDcl;
        }
        if (symbol instanceof UnitDclSymbol) 
        {
            return SymbolKind.UnitDcl;
        }
        if (symbol instanceof UnitBlockDclSymbol) 
        {
            return SymbolKind.UnitBlockDcl;
        }
        return SymbolKind.Unknown;
    }

}

export interface INestedEntity 
{ 
    entity: Symbol; 
    nestedLevel: number; 
}
export class EntityCollection extends NamespaceSymbol 
{ 
    public unambigousEntities?: Map<string, INestedEntity | undefined>;  // strings in upper case
}
export class WithTypeReference extends ScopedSymbol 
{ 
    public typeReference?: EntityCollection;
}

export class WithTypeScopedSymbol extends ScopedSymbol 
{ 
    public symbolType?: Symbol;
    public symbolBlock?: Symbol;
}

export class InFunctionSymbol extends Symbol 
{ 
    public functionDefinition?: IBuildInFunc;
}

export class SyntaxSymbol extends EntityCollection { }
export class TypeSymbol extends EntityCollection { }
export class BuiltInTypeSymbol extends Symbol { }
export class BuiltInFuncSymbol extends InFunctionSymbol{ }
export class TypeRefSymbol extends Symbol { }
export class EntitySymbol extends Symbol { }
export class ParameterSymbol extends WithTypeReference { }
export class QualifierSymbol extends WithTypeReference { }
export class KeywordSymbol extends WithTypeReference { }
export class LabelSymbol extends Symbol { }

export class CompoundSymbol extends EntityCollection { }
export class BlockSymbol extends EntityCollection { }
export class RoutineSymbol extends EntityCollection { }
export class RoutineHeaderSymbol extends EntityCollection { }
export class RoutineDclSymbol extends EntityCollection { }
export class RoutineBlockDclSymbol extends EntityCollection { }
export class VariableDclSymbol extends WithTypeScopedSymbol { }
export class VariableBlockDclSymbol extends EntityCollection { }
export class VariableGlobalBlockDclSymbol extends EntityCollection { }
export class TypeDclSymbol extends WithTypeScopedSymbol { }
export class ConstantDclSymbol extends EntityCollection { }
export class TypeBlockDclSymbol extends EntityCollection { }
export class LabelDclSymbol extends EntityCollection { }
export class LabelBlockDclSymbol extends EntityCollection { }
export class ConstDclSymbol extends WithTypeScopedSymbol { }
export class ConstBlockDclSymbol extends EntityCollection { }
export class UnitDclSymbol extends EntityCollection { }
export class UnitBlockDclSymbol extends EntityCollection { }