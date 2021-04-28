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

    public referencesVar: Map<Symbol, Set<Symbol>> = new Map<Symbol, Set<Symbol>>();
    public referencesType: Map<string, Symbol[]> = new Map<string, Symbol[]>();

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

        this.referencesVar.clear();
        this.referencesType.clear();
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

        //search fields in structures
        let blocks = this.getAllSymbols(VariableLocalBlockDclSymbol, true);
        let innerBlocks = this.getAllSymbols(VariableInnerBlockDclSymbol, true);
        let definition = this.definitionFromSymbol(symbol);

        let slaves = this.referencesVar.get(symbol);
        let array: Symbol[] = [];
        let result = false;

        if(!slaves)
        {
            for(let items of this.referencesVar)
            {
                for(let item of items[1])
                {
                    array.push(item);

                    if(item === symbol)
                    {
                        result = true;
                        break;
                    }
                }

                if(result)
                {
                    break;
                }
                else
                {
                    array = [];
                }
            }
        }

        if(result)
        {
            for (let block of blocks)//search block witch contain symbol
            {
                let index = 0;
                let item = this.findSimbolDedlarationInBlock(array[index], block, true);

                index++;

                if(item)
                {
                    if (item instanceof WithTypeScopedSymbol)
                    {
                        if(item.symbolType)
                        {
                            let slavesType: Symbol[] | undefined;
                            let nameVar = item.symbolType;

                            while (index < array.length)
                            {
                                nameVar += "." + array[index].name;
                                slavesType = this.referencesType.get(nameVar.toUpperCase());
                                
                                ++index;

                                if (index < array.length)
                                {
                                    if(slavesType)
                                    {
                                        let symbol = slavesType[0];

                                        if (symbol instanceof WithTypeScopedSymbol && symbol.symbolType)
                                        {
                                            nameVar = symbol.symbolType;
                                        }                                        
                                    }
                                }
                            }

                            if(slavesType)
                            {
                                let result = this.getSymbolInfo(slavesType[0]);

                                if(result)
                                {
                                    return result;
                                }
                            }
                        }
                    }
                    
                    break;
                }
            }
        }
        //end search fields in structures


        if(definition)
        {
            for (let block of innerBlocks)//search inner block witch contain symbol
            {
                let item = this.findSimbolDedlarationInBlock(symbol, block, true);

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

            for (let block of blocks)//search block witch contain symbol
            {
                let item = this.findSimbolDedlarationInBlock(symbol, block, true);

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

            //search in include files
            for (let block of blocks)
            {
                if(this.checkSymbolLocationBlock(symbol, block))
                {                            
                    let inclides = this.getAllSymbols(IncludeDclSymbol, true);
                    let VariableDcls = this.getAllSymbols(VariableLocalBlockDclSymbol, false);

                    for (let inclide of inclides)
                    {
                        if(this.checkSymbolLocationBlock(inclide, block))
                        {
                            //get file name from include
                            let includeFileName = "";
                            const matcherFilName = /^['"]\s*([a-zA-Z_0-9$%]*)\.?([a-zA-Z_0-9$%]*)\s*['"]/;
                            let matches : RegExpMatchArray | null;

                            matches = inclide.name.match(matcherFilName);

                            if(matches)
                            {
                                if(matches.length === 3)
                                {
                                    if(matches[2].toLowerCase() === "bas" || matches[2].toLowerCase() === "")
                                    {
                                        includeFileName = matches[1].toLowerCase();
                                    }
                                }
                            }

                            if(includeFileName !== "")
                            {
                                for (let variable of VariableDcls)
                                {
                                    let symbolOwner = (variable.symbolTable as ContextSymbolTable).owner;

                                    if(symbolOwner)
                                    {
                                        if(symbolOwner.fileName.includes(includeFileName) && variable.symbolTable)
                                        {
                                            //let symbolBlock : Symbol | undefined;
                                            //search symbol
                                            for(let item of variable.symbolTable.children)
                                            {
                                                if(ContextSymbolTable.getKindFromSymbol(item) === SymbolKind.VariableDcl)//check symbol type
                                                {
                                                    if(item.name.toLowerCase() === symbol.name.toLowerCase())
                                                    {
                                                        let result = this.getSymbolInfo(item);

                                                        if(result)
                                                        {
                                                            return result;
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
                    break;
                }
            }
        }

        let showRoutine = false;
        let defRoutines = this.getAllSymbols(RoutineDclSymbol, false);

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

            return this.findSimbolInfoDeсlaration(symbol, defRoutines, decRoutineBlocks);
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
                for(let item of types)
                {
                    //if(item === symbol)
                    if(item.name.toLowerCase() === symbol.name.toLowerCase())
                    {
                        if (item instanceof WithTypeScopedSymbol)
                        {
                            if(item.symbolBlock)
                            {
                                let result = this.getSymbolInfo(item.symbolBlock);

                                if(result)
                                {
                                    return result;
                                }
                                break;
                            }
                        }
                    }
                }

                let decTypeBlocks = this.getAllSymbols(TypeBlockDclSymbol, false);
 
                return this.findSimbolInfoDeсlaration(symbol, types, decTypeBlocks);
            }
            else
            {
                if(definition)
                {
                    let showConst = false;
                    let consts = this.getAllSymbols(ConstDclSymbol, false);
            
                    for(let item of consts)
                    {
                        if(item.name.toLowerCase() === symbol.name.toLowerCase())
                        {
                            if (item instanceof WithTypeScopedSymbol)
                            {
                                let result = this.getSymbolInfo(item);

                                if(result)
                                {
                                    return result;
                                }
                            }

                            showConst = true;
                            break;
                        }
                    }
            
                    if(showConst)
                    {
                        let decConsts = this.getAllSymbols(ConstDclSymbol, false);
                        let decConstBlocks = this.getAllSymbols(ConstBlockDclSymbol, false);
            
                        return this.findSimbolInfoDeсlaration(symbol, decConsts, decConstBlocks);
                    }
                    else
                    {
                        let showLabel = false;
                        let labels = this.getAllSymbols(LabelDclSymbol, true);
                
                        for(let item of labels)
                        {
                            if(item.name.toLowerCase() === symbol.name.toLowerCase())
                            {
                                showLabel = true;
                                break;
                            }
                        }
                
                        if(showLabel)
                        {
                            let decLabels = this.getAllSymbols(LabelDclSymbol, true);
                            let decLabelBlocks = this.getAllSymbols(LabelDclSymbol, true);
                
                            return this.findSimbolInfoDeсlaration(symbol, decLabels, decLabelBlocks);
                        }
                    }


                    let result = this.getSymbolInfo(symbol);

                    if(result)
                    {
                        return result;
                    }
                }
            }
        }

        return undefined;
    }

    private checkSymbolLocationBlock(symbol: Symbol, block: Symbol): boolean
    {
        let definition = this.definitionFromSymbol(symbol);

        if(definition && block.context instanceof ParserRuleContext)
        {
            if(block.context.stop)
            {
                let startLine = block.context.start.line;
                let stopLine = block.context.stop.line;

                if(definition.range.start.row >= startLine && definition.range.start.row <= stopLine)
                {
                    return true;
                }
            }
        }

        return false;
    }

    private findSimbolDedlarationInBlock(symbol: Symbol, block: Symbol, local: boolean): Symbol | undefined
    {
        let definition = this.definitionFromSymbol(symbol);

        if(definition && block.context instanceof ParserRuleContext)
        {
            if(block.context.stop)
            {
                let startLine = block.context.start.line;
                let stopLine = block.context.stop.line;
                let varDefs = this.getAllSymbols(VariableDclSymbol, local);

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

    private findSimbolInfoDeсlaration(symbol: Symbol, definitionSymbols: Set<Symbol>, blocks: Set<Symbol>): SymbolInfo | undefined
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
                                if(block.context.start && block.context.stop)
                                {
                                    if(definition.range.start.row >= block.context.start.line && definition.range.start.row <= block.context.stop.line)
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
            source: (symbol.context && symbolTable && symbolTable.owner) ? symbolTable.owner.fileName : "Basic runtime",
            definition: this.definitionFromSymbol(symbol),
        };

        if (definitionSymbol) 
        {
            result.description = symbolDescriptionFromEnum(ContextSymbolTable.getKindFromSymbol(definitionSymbol));
        }

        result.dataInfo = "";

        if (symbol instanceof WithTypeScopedSymbol)
        {
            if(symbol.symbolFull)
            {
                result.definitionBlock = this.definitionFromSymbol(symbol.symbolFull);

                if(result.definitionBlock)
                {
                    result.dataInfo = result.definitionBlock.text;
                }

                if(symbol.symbolType)
                {
                    result.dataInfo = symbol.symbolType + " " + result.dataInfo;
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
                result.dataInfo = symbol.functionDefinition.prototype;
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

    public linkSymbolsVar(master: Symbol, slave: Symbol) 
    {
        let slaves = this.referencesVar.get(master);

        if (!slaves) 
        {
            slaves = new Set<Symbol>();
            this.referencesVar.set(master, slaves);
        }

        slaves.add(slave);
    }

    public linkSymbolsType(master: string, slave: Symbol) 
    {
        let slaves = this.referencesType.get(master);

        if (!slaves) 
        {
            slaves = [];
            this.referencesType.set(master, slaves);
        }

        slaves.push(slave);
    }

    public getSymbolOccurences(symbol: Symbol, column: number, row: number, localOnly: boolean): SymbolInfo[] 
    { 
        let innerDecl = false;
        let result: SymbolInfo[] = [];
        let localBlock: Symbol | undefined;
        
        //search variables
        let blocks = this.getAllSymbols(VariableLocalBlockDclSymbol, true);
        let innerBlocks = this.getAllSymbols(VariableInnerBlockDclSymbol, true);

        for (let block of innerBlocks)//search inner block witch contain symbol
        {
            let item = this.findSimbolDedlarationInBlock(symbol, block, true);

            if(item)
            {
                innerDecl = true;
                break;
            }
        }

        if(innerDecl)
        {
            for (let block of innerBlocks)//search block witch contain symbol
            {
                if(this.checkSymbolLocationBlock(symbol, block))
                {
                    localBlock = block;
                    break;
                }
            }
        }
        else
        {
            if(!localBlock)
            {
                for (let block of blocks)//search block witch contain symbol
                {
                    if(this.checkSymbolLocationBlock(symbol, block))
                    {
                        localBlock = block;
                        break;
                    }
                }
            }
        }

        if(localBlock)
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
        
                        if (info && info.definition && info.kind === SymbolKind.Any) 
                        {
                            if(info.definition.range.start.row >= startLine && info.definition.range.start.row <= stopLine)
                            {
                                result.push(info);
                            }
                        }
                    }
                }
            }

            //search in include files
            if(this.checkSymbolLocationBlock(symbol, localBlock))
            {
                let inclides = this.getAllSymbols(IncludeDclSymbol, true);
                let VariableDcls = this.getAllSymbols(VariableLocalBlockDclSymbol, false);

                for (let inclide of inclides)
                {
                    if(this.checkSymbolLocationBlock(inclide, localBlock))
                    {
                        //get file name from include
                        let includeFileName = "";
                        const matcherFilName = /^['"]\s*([a-zA-Z_0-9$%]*)\.?([a-zA-Z_0-9$%]*)\s*['"]/;
                        let matches : RegExpMatchArray | null;

                        matches = inclide.name.match(matcherFilName);

                        if(matches)
                        {
                            if(matches.length === 3)
                            {
                                if(matches[2].toLowerCase() === "bas" || matches[2].toLowerCase() === "")
                                {
                                    includeFileName = matches[1].toLowerCase();
                                }
                            }
                        }

                        if(includeFileName !== "")
                        {
                            for (let variable of VariableDcls)
                            {
                                let symbolOwner = (variable.symbolTable as ContextSymbolTable).owner;
                                
                                if(symbolOwner)
                                {
                                    if(symbolOwner.fileName.includes(includeFileName) && variable.symbolTable)
                                    {
                                        //search symbol
                                        for(let item of variable.symbolTable.children)
                                        {
                                            if(ContextSymbolTable.getKindFromSymbol(item) === SymbolKind.Any)//check symbol type
                                            {
                                                if(item.name.toLowerCase() === symbol.name.toLowerCase())
                                                {
                                                    let info = this.getSymbolInfo(item);

                                                    if(info)
                                                    {
                                                        result.push(info);
                                                    }
                                                }
                                            }
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
        else
        {
            let searchRoutine = false;
            let defRoutines = this.getAllSymbols(RoutineDclSymbol, false);

            for(let item of defRoutines)
            {
                if(item.name.toLowerCase() === symbol.name.toLowerCase())
                {
                    searchRoutine = true;
                    break;
                }
            }
            
            if(searchRoutine)
            {
                let references = this.getAllSymbols(AnySymbol, false);

                for(let item of references)
                {
                    if(item.name.toLowerCase() === symbol.name.toLowerCase())
                    {
                        const info = this.getSymbolInfo(item);

                        if (info && info.kind === SymbolKind.Any) 
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
            case SymbolKind.BuiltInType:
                return BuiltInTypeSymbol;
            case SymbolKind.BuiltInFunc:
                return BuiltInFuncSymbol;
            case SymbolKind.TypeRef:
                return TypeRefSymbol;
            case SymbolKind.Label:
                return LabelSymbol;
            case SymbolKind.LabelDcl:
                return LabelDclSymbol;
            case SymbolKind.Any:
                return AnySymbol;
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
        if (symbol instanceof LabelSymbol) 
        {
            return SymbolKind.Label;
        }
        if (symbol instanceof AnySymbol) 
        {
            return SymbolKind.Any;
        }
        if (symbol instanceof EntitySymbol) 
        {
            return SymbolKind.Entity;
        }
        if (symbol instanceof BlockSymbol) 
        {
            return SymbolKind.Block;
        }
        if (symbol instanceof ImplicitBlockDclSymbol) 
        {
            return SymbolKind.ImplicitBlockDcl;
        }
        if (symbol instanceof IncludeDclSymbol) 
        {
            return SymbolKind.IncludeDcl;
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
        if (symbol instanceof VariableLocalBlockDclSymbol) 
        {
            return SymbolKind.VariableLocalBlockDcl;
        }
        if (symbol instanceof VariableInnerBlockDclSymbol) 
        {
            return SymbolKind.VariableInnerBlockDcl;
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

export class WithTypeScopedSymbol extends ScopedSymbol 
{ 
    public symbolType?: string;
    public symbolFull?: Symbol;
    public symbolBlock?: Symbol;
}

export class InFunctionSymbol extends Symbol 
{ 
    public functionDefinition?: IBuildInFunc;
}

export class SyntaxSymbol extends ScopedSymbol { }
export class BuiltInTypeSymbol extends Symbol{ }
export class BuiltInFuncSymbol extends InFunctionSymbol{ }
export class TypeRefSymbol extends Symbol { }
export class EntitySymbol extends Symbol { }
export class LabelSymbol extends Symbol { }
export class AnySymbol extends Symbol { }

export class CompoundSymbol extends ScopedSymbol { }
export class BlockSymbol extends ScopedSymbol { }
export class RoutineSymbol extends ScopedSymbol { }
export class RoutineHeaderSymbol extends ScopedSymbol { }
export class RoutineDclSymbol extends ScopedSymbol { }
export class RoutineBlockDclSymbol extends ScopedSymbol { }
export class VariableDclSymbol extends WithTypeScopedSymbol { }
export class VariableBlockDclSymbol extends ScopedSymbol { }
export class ImplicitBlockDclSymbol extends ScopedSymbol { }
export class IncludeDclSymbol extends ScopedSymbol { }
export class VariableGlobalBlockDclSymbol extends ScopedSymbol { }
export class VariableLocalBlockDclSymbol extends ScopedSymbol { }
export class VariableInnerBlockDclSymbol extends ScopedSymbol { }
export class TypeDclSymbol extends WithTypeScopedSymbol { }
export class TypeBlockDclSymbol extends ScopedSymbol { }
export class LabelDclSymbol extends ScopedSymbol { }
export class LabelBlockDclSymbol extends ScopedSymbol { }
export class ConstDclSymbol extends WithTypeScopedSymbol { }
export class ConstBlockDclSymbol extends ScopedSymbol { }
export class UnitDclSymbol extends ScopedSymbol { }
export class UnitBlockDclSymbol extends ScopedSymbol { }