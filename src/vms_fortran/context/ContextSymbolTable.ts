"use strict";
import { ParserRuleContext } from 'antlr4ts';
import { SymbolTable, BaseSymbol, ScopedSymbol, SymbolTableOptions, NamespaceSymbol } from "antlr4-c3";
import { SymbolKind, SymbolInfo, Definition } from './Facade';
import { SourceContext } from './SourceContext';
import { Interval } from 'antlr4ts/misc';
import { ParseTree, TerminalNode } from 'antlr4ts/tree';
import { symbolDescriptionFromEnum } from './Symbol';


export class ContextSymbolTable extends SymbolTable 
{
    public tree?: ParserRuleContext; // Set by the owning source context after each parse run.

    public references: Map<BaseSymbol, Set<BaseSymbol>> = new Map<BaseSymbol, Set<BaseSymbol>>();

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

    public getSymbolDefinition(symbol: string | BaseSymbol | undefined): SymbolInfo | undefined
    {
        if (!symbol) 
        {
            return undefined;
        }

        if (!(symbol instanceof BaseSymbol)) 
        {
            let temp = this.resolveSync(symbol);

            if (!temp) 
            {
                return undefined;
            }

            symbol = temp;
        }

        //search variables in current file + include 
        let blocks = this.getAllSymbolsSync(VariableLocalBlockDclSymbol, true);
        let innerBlocks = this.getAllSymbolsSync(VariableInnerBlockDclSymbol, true);
        let definition = this.definitionFromSymbol(symbol);

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
                        // let symbolBlock = this.findSimbolBlockDedlaration(item);
                        // result.info = this.getSymbolInfo(symbolBlock);

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
                        // let symbolBlock = this.findSimbolBlockDedlaration(item);
                        // result.info = this.getSymbolInfo(symbolBlock);

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
                    let inclides = this.getAllSymbolsSync(IncludeDclSymbol, true);
                    let VariableDcls = this.getAllSymbolsSync(VariableLocalBlockDclSymbol, false);

                    for (let inclide of inclides)
                    {
                        if(this.checkSymbolLocationBlock(inclide, block))
                        {
                            // INCLUDE ’file-name [/[NO]LIST]’
                            // INCLUDE ’[text-lib] (module-name) [/[NO]LIST]’
                            //get file name from include
                            let includeFileName = "";
                            const matcherIncModuleName = /^\'\s*\S*\s*\(\s*(\S+)\s*\)/;
                            const matcherFilName = /^\'\s*(\S+)\s*(\'|\/)/;
                            let matches : RegExpMatchArray | null;

                            if(inclide.name.includes("("))
                            {
                                matches = inclide.name.match(matcherIncModuleName);
                            }
                            else
                            {
                                matches = inclide.name.match(matcherFilName);
                            }

                            if(matches && matches.length > 1)
                            {
                               includeFileName = matches[1];
                            }

                            for (let variable of VariableDcls)
                            {
                                let symbolOwner = (variable.symbolTable as ContextSymbolTable).owner;

                                if(symbolOwner)
                                {
                                    if(symbolOwner.fileName.includes(includeFileName) && variable.symbolTable)
                                    {
                                        //let symbolBlock : BaseSymbol | undefined;
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
                                                        // result.info = this.getSymbolInfo(symbolBlock);

                                                        return result;
                                                    }
                                                }
                                            }
                                            // else if(ContextSymbolTable.getKindFromSymbol(item) === SymbolKind.VariableBlockDcl)//check symbol type
                                            // {
                                            //     let name = item.name.toLowerCase();

                                            //     if(name.includes(symbol.name.toLowerCase()))
                                            //     {
                                            //         symbolBlock = item;
                                            //     }
                                            // }
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
        let defRoutines = this.getAllSymbolsSync(RoutineDclSymbol, false);

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
            let decRoutineBlocks = this.getAllSymbolsSync(RoutineHeaderSymbol, false);

            return this.findSimbolInfoDedlaration(symbol, defRoutines, decRoutineBlocks);
        }
        else
        {
            let showType = false;
            let types = this.getAllSymbolsSync(TypeDclSymbol, false);
    
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
                let decTypes = this.getAllSymbolsSync(TypeDclSymbol, false);
                let decTypeBlocks = this.getAllSymbolsSync(TypeBlockDclSymbol, false);

                return this.findSimbolInfoDedlaration(symbol, decTypes, decTypeBlocks);
            }
            else
            {
                if(definition)
                {
                    let findSymbolBlock = false;
                    let findImplisit = false;

                    for (let block of innerBlocks)//search block witch contains symbol
                    {
                        if(this.checkSymbolLocationBlock(symbol, block))
                        {
                            findSymbolBlock = true;
                            let item = this.findSymbolImplicitBlock(symbol, block, true);

                            if(item)
                            {
                                findImplisit = true;

                                if(!item.name.toLowerCase().includes("implicitnone"))
                                {
                                    let result = this.getSymbolInfo(symbol);

                                    if(result)
                                    {
                                        result.info = this.getSymbolInfo(item);

                                        return result;
                                    }
                                }
                            }
                            break;
                        }
                    }

                    if(!findSymbolBlock)
                    {
                        for (let block of blocks)//search block witch contains symbol
                        {
                            if(this.checkSymbolLocationBlock(symbol, block))
                            {
                                let item = this.findSymbolImplicitBlock(symbol, block, true);

                                if(item)
                                {
                                    findImplisit = true;

                                    if(!item.name.toLowerCase().includes("implicitnone"))
                                    {
                                        let result = this.getSymbolInfo(symbol);

                                        if(result)
                                        {
                                            result.info = this.getSymbolInfo(item);

                                            return result;
                                        }
                                    }
                                }
                                break;
                            }
                        }
                    }

                    if(!findImplisit)
                    {
                        let result = this.getSymbolInfo(symbol);

                        if(result)
                        {
                            const info: SymbolInfo = {
                                kind: SymbolKind.ImplicitBlockDcl,
                                name: "implicit integer(i-n), real(a-h,o-z)",
                                source: "",
                            };
                            result.info = info;

                            return result;
                        }
                    }
                }
            }
        }
        
        let showConst = false;
        let consts = this.getAllSymbolsSync(ConstantDclSymbol, false);

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
            let decConsts = this.getAllSymbolsSync(ConstantDclSymbol, false);
            let decConstBlocks = this.getAllSymbolsSync(ConstBlockDclSymbol, false);

            return this.findSimbolInfoDedlaration(symbol, decConsts, decConstBlocks);
        }

        return undefined;
    }

    private findSymbolImplicitBlock(symbol: BaseSymbol, block: BaseSymbol, local: boolean): BaseSymbol | undefined
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
                    let implicitBlocks = this.getAllSymbolsSync(ImplicitBlockDclSymbol, local);

                    for(let item of implicitBlocks)
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

        return undefined;
    }

    private checkSymbolLocationBlock(symbol: BaseSymbol, block: BaseSymbol): boolean
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

    private findSimbolDedlarationInBlock(symbol: BaseSymbol, block: BaseSymbol, local: boolean): BaseSymbol | undefined
    {
        let definition = this.definitionFromSymbol(symbol);

        if(definition && block.context instanceof ParserRuleContext)
        {
            if(block.context.stop)
            {
                let startLine = block.context.start.line;
                let stopLine = block.context.stop.line;
                let varDefs = this.getAllSymbolsSync(VariableDclSymbol, local);

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

    private findSimbolBlockDedlaration(symbol: BaseSymbol): BaseSymbol | undefined
    {
        let definition = this.definitionFromSymbol(symbol);
        let symbolBlock : BaseSymbol | undefined;
                
        if (definition) 
        {
            let position = definition.range.start.row;
            let blockDefs = this.getAllSymbolsSync(VariableBlockDclSymbol, true);

            for(let item of blockDefs)
            {
                let definitionBlock = this.definitionFromSymbol(item);

                if (definitionBlock) 
                {
                    if(position >= definitionBlock.range.start.row && position <= definitionBlock.range.end.row)
                    {
                        //return item;
                        symbolBlock = item;
                    }
                }
            }
        }

        //return undefined;
        return symbolBlock;
    }

    private findSimbolInfoDedlaration(symbol: BaseSymbol, definitionSymbols: BaseSymbol[], blocks: BaseSymbol[]): SymbolInfo | undefined
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

    public getSymbolInfo(symbol: string | BaseSymbol | undefined): SymbolInfo | undefined 
    {
        if (!symbol) 
        {
            return undefined;
        }

        if (!(symbol instanceof BaseSymbol)) 
        {
            let temp = this.resolveSync(symbol);

            if (!temp) 
            {
                return undefined;
            }

            symbol = temp;
        }

        let kind = ContextSymbolTable.getKindFromSymbol(symbol);
        let name = (symbol as BaseSymbol).name;

        let definitionSymbol = this.definitionSymbolForContext(symbol.context);

        let symbolTable = symbol.symbolTable as ContextSymbolTable;
        const result: SymbolInfo = {
            kind: kind,
            name: name,
            source: (symbol.context && symbolTable && symbolTable.owner) ? symbolTable.owner.fileName : "Fortran runtime",
            definition: this.definitionFromSymbol(symbol),
        };

        if (definitionSymbol) 
        {
            result.description = symbolDescriptionFromEnum(ContextSymbolTable.getKindFromSymbol(definitionSymbol));
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

    public definitionFromSymbol(definition?: BaseSymbol): Definition | undefined 
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
    public definitionSymbolForContext(ctx: ParseTree | undefined): BaseSymbol | undefined 
    {
        if (!ctx) 
        {
            return undefined;
        }

        const symbol = this.symbolWithContextSync(ctx);

        if (symbol) 
        {
            return symbol;
        }

        return undefined;
    }

    public linkSymbols(master: BaseSymbol, slave: BaseSymbol) 
    {
        let slaves = this.references.get(master);

        if (!slaves) 
        {
            slaves = new Set<BaseSymbol>();
            this.references.set(master, slaves);
        }
    }

    /**
     * Only for master definition
     * @param master 
     */
    public getReferenceCount(master: BaseSymbol): number 
    {
        let slaves = this.references.get(master);

        if (slaves) 
        {
            return slaves.size;
        }

        return 0;
    }

    public getSymbolOccurences(symbol: BaseSymbol, column: number, row: number, localOnly: boolean): SymbolInfo[] 
    {
        let result: SymbolInfo[] = [];
        let localBlock: BaseSymbol | undefined;
        
        //search variables
        let blocks = this.getAllSymbolsSync(VariableLocalBlockDclSymbol, true);
        let innerBlocks = this.getAllSymbolsSync(VariableInnerBlockDclSymbol, true);

        for (let block of innerBlocks)//search block witch contain symbol
        {
            if(this.checkSymbolLocationBlock(symbol, block))
            {
                localBlock = block;
                break;
            }
        }

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

        if(localBlock)
        {
            if(localBlock.context instanceof ParserRuleContext && localBlock.context.stop)
            {
                let startLine = localBlock.context.start.line;
                let stopLine = localBlock.context.stop.line;

                if (localBlock instanceof ScopedSymbol) 
                {
                    let references = this.getAllNestedSymbolsSync(symbol.name);

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

            //search in include files
            if(this.checkSymbolLocationBlock(symbol, localBlock))
            {                            
                let inclides = this.getAllSymbolsSync(IncludeDclSymbol, true);
                let VariableDcls = this.getAllSymbolsSync(VariableLocalBlockDclSymbol, false);

                for (let inclide of inclides)
                {
                    if(this.checkSymbolLocationBlock(inclide, localBlock))
                    {
                        // INCLUDE ’file-name [/[NO]LIST]’
                        // INCLUDE ’[text-lib] (module-name) [/[NO]LIST]’
                        //get file name from include
                        let includeFileName = "";
                        const matcherIncModuleName = /^\'\s*\S*\s*\(\s*(\S+)\s*\)/;
                        const matcherFilName = /^\'\s*(\S+)\s*(\'|\/)/;
                        let matches : RegExpMatchArray | null;

                        if(inclide.name.includes("("))
                        {
                            matches = inclide.name.match(matcherIncModuleName);
                        }
                        else
                        {
                            matches = inclide.name.match(matcherFilName);
                        }

                        if(matches && matches.length > 1)
                        {
                            includeFileName = matches[1];
                        }

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
                                        if(ContextSymbolTable.getKindFromSymbol(item) === SymbolKind.Label)//check symbol type
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
            let defRoutines = this.getAllSymbolsSync(RoutineDclSymbol, false);

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
                let references = this.getAllSymbolsSync(LabelSymbol, false);

                for(let item of references)
                {
                    if(item.name.toLowerCase() === symbol.name.toLowerCase())
                    {
                        const info = this.getSymbolInfo(item);

                        if (info && info.kind === SymbolKind.Label) 
                        {
                            result.push(info);
                        }
                    }
                }
            }
        }

        return result;
    }

    public getSymbolOfType(name: string, kind: SymbolKind, localOnly: boolean): BaseSymbol | undefined 
    {
        const resolved = this.resolveSync(name, localOnly);

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

        return BaseSymbol;
    }

    public static getKindFromSymbol(symbol: BaseSymbol): SymbolKind 
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

export interface INestedEntity 
{ 
    entity: BaseSymbol; 
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

export class SyntaxSymbol extends EntityCollection { }
export class TypeSymbol extends EntityCollection { }
export class BuiltInTypeSymbol extends BaseSymbol { }
export class TypeRefSymbol extends BaseSymbol { }
export class EntitySymbol extends BaseSymbol { }
export class ParameterSymbol extends WithTypeReference { }
export class QualifierSymbol extends WithTypeReference { }
export class KeywordSymbol extends WithTypeReference { }
export class LabelSymbol extends BaseSymbol { }

export class CompoundSymbol extends EntityCollection { }
export class BlockSymbol extends EntityCollection { }
export class RoutineSymbol extends EntityCollection { }
export class RoutineHeaderSymbol extends EntityCollection { }
export class RoutineDclSymbol extends EntityCollection { }
export class RoutineBlockDclSymbol extends EntityCollection { }
export class VariableDclSymbol extends EntityCollection { }
export class VariableBlockDclSymbol extends EntityCollection { }
export class ImplicitBlockDclSymbol extends EntityCollection { }
export class IncludeDclSymbol extends EntityCollection { }
export class VariableGlobalBlockDclSymbol extends EntityCollection { }
export class VariableLocalBlockDclSymbol extends EntityCollection { }
export class VariableInnerBlockDclSymbol extends EntityCollection { }
export class TypeDclSymbol extends EntityCollection { }
export class ConstantDclSymbol extends EntityCollection { }
export class TypeBlockDclSymbol extends EntityCollection { }
export class LabelDclSymbol extends EntityCollection { }
export class LabelBlockDclSymbol extends EntityCollection { }
export class ConstDclSymbol extends EntityCollection { }
export class ConstBlockDclSymbol extends EntityCollection { }
export class UnitDclSymbol extends EntityCollection { }
export class UnitBlockDclSymbol extends EntityCollection { }