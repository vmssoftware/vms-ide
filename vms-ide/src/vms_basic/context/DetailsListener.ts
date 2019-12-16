import { BasicParserListener } from '../parser/BasicParserListener';
import { TerminalNode } from "antlr4ts/tree/TerminalNode";

import {
    ContextSymbolTable,
    AnySymbol,
    ImplicitBlockDclSymbol,
    IncludeDclSymbol,
    RoutineSymbol,
    RoutineDclSymbol,
    RoutineBlockDclSymbol,
    RoutineHeaderSymbol,
    VariableDclSymbol,
    VariableBlockDclSymbol,
    VariableGlobalBlockDclSymbol,
    VariableLocalBlockDclSymbol,
    VariableInnerBlockDclSymbol,
    TypeDclSymbol,
    ConstantDclSymbol,
    TypeBlockDclSymbol,
    ConstBlockDclSymbol,
    LabelSymbol,
    LabelDclSymbol,
    WithTypeScopedSymbol,
} from './ContextSymbolTable';

import { 
    ScopedSymbol,
    Symbol,
} from "antlr4-c3";

import { 
    ProgramContext,
    // MainRangeContext,
    // IncludeStatementContext,
    IdentifierContext,
    LabelContext,
    TargetNameContext,
    ConstantDeclarationContext,
    VariableContext,
    VariableDeclarationContext,
    VariableDescriptionSecondPartContext,
    DimensionDeclarationContext,
    RecordDeclarationContext,
    GroupClauseContext,
    DeclarationContext,
    SubroutineDeclarationContext,
    SubroutineHeaderContext,
    FunctionDeclarationContext,
    FunctionHeaderContext,
    RoutineNameContext,
    DefFunctionSingleDeclarationContext,
    DefFunctionHeaderContext,
    DefFunctionMultyDeclarationContext,
    RecComponentContext,
} from '../parser/BasicParser';


export class DetailsListener implements BasicParserListener 
{
    private typeSymbol: String = "";    
    private currentSymbol: Symbol | undefined;
    private symbolStack: (Symbol | undefined)[] = [];

    constructor(private symbolTable: ContextSymbolTable, private imports: string[]) 
    {    }

    enterProgram(ctx: ProgramContext) 
    {
        let blocks = ctx.programUnit();

        for(let item of blocks)
        {
            this.currentSymbol = this.symbolTable.addNewSymbolOfType(VariableLocalBlockDclSymbol, undefined, item.text);
            this.currentSymbol.context = item;

            this.currentSymbol = this.symbolTable.addNewSymbolOfType(VariableGlobalBlockDclSymbol, undefined, item.text);
            this.currentSymbol.context = item;
        }
    }
    exitProgram(ctx: ProgramContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    // enterMainRange(ctx: MainRangeContext) 
    // {
    //     this.currentSymbol = this.symbolTable.addNewSymbolOfType(VariableGlobalBlockDclSymbol, undefined, ctx.text);
    //     this.currentSymbol.context = ctx;
    // }
    // exitMainRange(ctx: MainRangeContext) 
    // {
    //     if (this.currentSymbol) 
    //     {
    //         this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
    //     }
    // }

    // enterIncludeStatement(ctx: IncludeStatementContext) 
    // {
    //     this.currentSymbol = this.symbolTable.addNewSymbolOfType(IncludeDclSymbol, undefined, ctx.S_CONST().text);
    //     this.currentSymbol.context = ctx.S_CONST();
    // }
    // exitIncludeStatement(ctx: IncludeStatementContext) 
    // {
    //     if (this.currentSymbol) 
    //     {
    //         this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
    //     }
    // }

    enterIdentifier(ctx: IdentifierContext) 
    {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(AnySymbol, undefined, ctx.IDENTIFIER().text);
        this.currentSymbol.context = ctx.IDENTIFIER();
    }
    exitIdentifier(ctx: IdentifierContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterLabel(ctx: LabelContext) 
    {
        if(ctx.identifier())
        {
            this.currentSymbol = this.symbolTable.addNewSymbolOfType(LabelDclSymbol, undefined, ctx.identifier()!.text);
            this.currentSymbol.context = ctx.identifier();
        }
        else
        {
            if(ctx.NUMBER())
            {
                this.currentSymbol = this.symbolTable.addNewSymbolOfType(LabelDclSymbol, undefined, ctx.NUMBER()!.text);
                this.currentSymbol.context = ctx.NUMBER();
            }
        }
    }
    exitLabel(ctx: LabelContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterTargetName(ctx: TargetNameContext) 
    {
        if(ctx.identifier())
        {
            this.currentSymbol = this.symbolTable.addNewSymbolOfType(LabelSymbol, undefined, ctx.identifier()!.text);
            this.currentSymbol.context = ctx.identifier();
        }
        else
        {
            if(ctx.NUMBER())
            {
                this.currentSymbol = this.symbolTable.addNewSymbolOfType(LabelSymbol, undefined, ctx.NUMBER()!.text);
                this.currentSymbol.context = ctx.NUMBER();
            }
        }
    }
    exitTargetName(ctx: TargetNameContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterConstantDeclaration(ctx: ConstantDeclarationContext) 
    {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(ConstBlockDclSymbol, undefined, ctx.text);
        this.currentSymbol.context = ctx;

        let blocks = ctx.constantDescription();

        for(let item of blocks)
        {
            this.currentSymbol = this.symbolTable.addNewSymbolOfType(ConstantDclSymbol, undefined, item.constName().identifier().IDENTIFIER().text);
            this.currentSymbol.context = item.constName().identifier().IDENTIFIER();
        }
    }
    exitConstantDeclaration(ctx: ConstantDeclarationContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterVariable(ctx: VariableContext)
    {
        let blocks = ctx.variableChildName();

        if(blocks.length > 0)
        {
            this.currentSymbol = this.symbolTable.addNewSymbolOfType(VariableDclSymbol, undefined, ctx.variableName().identifier().IDENTIFIER().text);
            this.currentSymbol.context = ctx.variableName().identifier().IDENTIFIER();
            //this.symbolStack.push(this.currentSymbol);

            let currentSymbol = this.currentSymbol;
            this.symbolTable.linkSymbolsVar(currentSymbol, this.currentSymbol);

            for(let item of blocks)
            {
                this.currentSymbol = this.symbolTable.addNewSymbolOfType(VariableDclSymbol, undefined, item.identifier().IDENTIFIER().text);
                this.currentSymbol.context = item.identifier().IDENTIFIER();
                //this.symbolStack.push(this.currentSymbol);
                let entitySymbol = this.currentSymbol;

                this.symbolTable.linkSymbolsVar(currentSymbol, entitySymbol);
            }
        }
    }
    exitVariable(ctx: VariableContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterVariableDeclaration(ctx: VariableDeclarationContext) 
    {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(VariableBlockDclSymbol, undefined, ctx.text);
        this.currentSymbol.context = ctx;
    }
    exitvariableDescription(ctx: VariableDeclarationContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterVariableDescriptionSecondPart(ctx: VariableDescriptionSecondPartContext) 
    {
        let type = ctx.dataType();

        if(type)
        {
            this.typeSymbol = type.text;
        }

        let obj = ctx.variableDescription().singleVarDescription();

        if(obj)
        {
            this.currentSymbol = this.symbolTable.addNewSymbolOfType(VariableDclSymbol, undefined, obj.variableName().identifier().IDENTIFIER().text);
            this.currentSymbol.context = obj.variableName().identifier().IDENTIFIER();

            if (this.currentSymbol instanceof WithTypeScopedSymbol) 
            {
                this.currentSymbol.symbolType = this.typeSymbol.toUpperCase();
            }
            
        }
        else
        {
            let obj = ctx.variableDescription().arrayDescription();

            if(obj)
            {
                this.currentSymbol = this.symbolTable.addNewSymbolOfType(VariableDclSymbol, undefined, obj.arrayVariableName().identifier().IDENTIFIER().text);
                this.currentSymbol.context = obj.arrayVariableName().identifier().IDENTIFIER();

                if (this.currentSymbol instanceof WithTypeScopedSymbol) 
                {
                    this.currentSymbol.symbolType = this.typeSymbol.toUpperCase();
                }
            }
        }
    }
    exitVariableDescriptionSecondPart(ctx: VariableDescriptionSecondPartContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterDimensionDeclaration(ctx: DimensionDeclarationContext) 
    {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(VariableBlockDclSymbol, undefined, ctx.text);
        this.currentSymbol.context = ctx;

        let dimItemType: String = "";
        let blocks = ctx.dimensionItem();

        for(let item of blocks)
        {
            if(item.dataType())
            {
                dimItemType = item.dataType()!.text;
            }

            this.currentSymbol = this.symbolTable.addNewSymbolOfType(VariableDclSymbol, undefined, item.arrayVariableName().identifier().IDENTIFIER().text);
            this.currentSymbol.context = item.arrayVariableName().identifier().IDENTIFIER();

            if (this.currentSymbol instanceof WithTypeScopedSymbol) 
            {
                this.currentSymbol.symbolType = dimItemType.toUpperCase();
            }
        }
    }
    exitDimensionDeclaration(ctx: DimensionDeclarationContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterRecordDeclaration(ctx: RecordDeclarationContext) 
    {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(TypeBlockDclSymbol, undefined, ctx.text);
        this.currentSymbol.context = ctx;
        
        let typeBlock = this.currentSymbol;
        let recName = ctx.recName();

        this.currentSymbol = this.symbolTable.addNewSymbolOfType(TypeDclSymbol, undefined, recName.identifier().IDENTIFIER().text);
        this.currentSymbol.context = recName.identifier().IDENTIFIER();

        this.recordComponentIterate(this.currentSymbol.name, typeBlock, ctx.recComponent());
    }
    exitRecordDeclaration(ctx: RecordDeclarationContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    recordComponentIterate(key: String, masterSymbol: Symbol, recComponent: RecComponentContext[])
    {
        let blocks = recComponent;

        //this.symbolTable.linkSymbols(key, masterSymbol);

        for(let item of blocks)
        {
            let recItemType: String = "";

            if(item.dataType())
            {
                recItemType = item.dataType()!.text;
            }

            let recItemBlocks = item.recItem();

            for(let recItem of recItemBlocks)
            {
                let varDescr = recItem.variableDescription();

                if(varDescr)
                {
                    let obj = varDescr.singleVarDescription();

                    if(obj)
                    {
                        this.currentSymbol = this.symbolTable.addNewSymbolOfType(VariableDclSymbol, undefined, obj.variableName().identifier().IDENTIFIER().text);
                        this.currentSymbol.context = obj.variableName().identifier().IDENTIFIER();

                        if (this.currentSymbol instanceof WithTypeScopedSymbol) 
                        {
                            this.currentSymbol.symbolType = recItemType.toUpperCase();
                        }

                        this.symbolTable.linkSymbolsType((key + "." + this.currentSymbol.name).toUpperCase(),  this.currentSymbol);
                    }
                    else
                    {
                        let obj = varDescr.arrayDescription();

                        if(obj)
                        {
                            this.currentSymbol = this.symbolTable.addNewSymbolOfType(VariableDclSymbol, undefined, obj.arrayVariableName().identifier().IDENTIFIER().text);
                            this.currentSymbol.context = obj.arrayVariableName().identifier().IDENTIFIER();

                            if (this.currentSymbol instanceof WithTypeScopedSymbol) 
                            {
                                this.currentSymbol.symbolType = recItemType.toUpperCase();
                            }

                            this.symbolTable.linkSymbolsType((key + "." + this.currentSymbol.name).toUpperCase(),  this.currentSymbol);
                        }
                    }
                }
            }

            let groupBlock = item.groupClause();

            if(groupBlock)
            {
                let recName = groupBlock.groupName();

                this.currentSymbol = this.symbolTable.addNewSymbolOfType(TypeDclSymbol, undefined, recName.identifier().IDENTIFIER().text);
                this.currentSymbol.context = recName.identifier().IDENTIFIER();

                let newKey = (key + "." + this.currentSymbol.name).toUpperCase();

                this.currentSymbol = this.symbolTable.addNewSymbolOfType(TypeBlockDclSymbol, undefined, groupBlock.text);
                this.currentSymbol.context = groupBlock;
                
                let typeBlock = this.currentSymbol;
                this.symbolTable.linkSymbolsType(newKey,  typeBlock);

                this.recordComponentIterate(newKey, typeBlock, groupBlock.recComponent());
            }
            else
            {
                let variantBlock = item.variantClause();

                if(variantBlock)
                {
                    let caseBlocks = variantBlock.caseClause();

                    for(let item of caseBlocks)
                    {
                        this.recordComponentIterate(key.toUpperCase(), masterSymbol, item.recComponent());
                    }
                }
            }
        }
    }

    enterGroupClause(ctx: GroupClauseContext) 
    {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(TypeBlockDclSymbol, undefined, ctx.text);
        this.currentSymbol.context = ctx;

        this.currentSymbol = this.symbolTable.addNewSymbolOfType(TypeDclSymbol, undefined, ctx.groupName().identifier().IDENTIFIER().text);
        this.currentSymbol.context = ctx.groupName().identifier().IDENTIFIER();
    }
    exitGroupClause(ctx: GroupClauseContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterDeclaration(ctx: DeclarationContext) 
    {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(VariableBlockDclSymbol, undefined, ctx.text);
        this.currentSymbol.context = ctx;
    }
    exitDeclaration(ctx: DeclarationContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterSubroutineDeclaration(ctx: SubroutineDeclarationContext) 
    {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(RoutineHeaderSymbol, undefined, ctx.subroutineHeader().text);
        this.currentSymbol.context = ctx.subroutineHeader();

        this.currentSymbol = this.symbolTable.addNewSymbolOfType(RoutineBlockDclSymbol, undefined, ctx.text);
        this.currentSymbol.context = ctx;
    }
    exitSubroutineDeclaration(ctx: SubroutineDeclarationContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterSubroutineHeader(ctx: SubroutineHeaderContext) 
    {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(RoutineDclSymbol, undefined, ctx.routineName().text);
        this.currentSymbol.context = ctx.routineName();
    }
    exitSubroutineHeader(ctx: SubroutineHeaderContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterFunctionDeclaration(ctx: FunctionDeclarationContext) 
    {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(RoutineHeaderSymbol, undefined, ctx.functionHeader().text);
        this.currentSymbol.context = ctx.functionHeader();

        this.currentSymbol = this.symbolTable.addNewSymbolOfType(RoutineBlockDclSymbol, undefined, ctx.text);
        this.currentSymbol.context = ctx;
    }
    exitFunctionDeclaration(ctx: FunctionDeclarationContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterFunctionHeader(ctx: FunctionHeaderContext) 
    {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(RoutineDclSymbol, undefined, ctx.routineName().text);
        this.currentSymbol.context = ctx.routineName();
    }
    exitFunctionHeader(ctx: FunctionHeaderContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterDefFunctionSingleDeclaration(ctx: DefFunctionSingleDeclarationContext) 
    {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(RoutineHeaderSymbol, undefined, ctx.defFunctionHeader().text);
        this.currentSymbol.context = ctx.defFunctionHeader();

        this.currentSymbol = this.symbolTable.addNewSymbolOfType(RoutineBlockDclSymbol, undefined, ctx.text);
        this.currentSymbol.context = ctx;

        this.currentSymbol = this.symbolTable.addNewSymbolOfType(VariableInnerBlockDclSymbol, undefined, ctx.text);
        this.currentSymbol.context = ctx;
    }
    exitDefFunctionSingleDeclaration(ctx: DefFunctionSingleDeclarationContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterDefFunctionMultyDeclaration(ctx: DefFunctionMultyDeclarationContext) 
    {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(RoutineHeaderSymbol, undefined, ctx.defFunctionHeader().text);
        this.currentSymbol.context = ctx.defFunctionHeader();

        this.currentSymbol = this.symbolTable.addNewSymbolOfType(RoutineBlockDclSymbol, undefined, ctx.text);
        this.currentSymbol.context = ctx;

        this.currentSymbol = this.symbolTable.addNewSymbolOfType(VariableInnerBlockDclSymbol, undefined, ctx.text);
        this.currentSymbol.context = ctx;
    }
    exitDefDefFunctionMultyDeclaration(ctx: DefFunctionMultyDeclarationContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterDefFunctionHeader(ctx: DefFunctionHeaderContext) 
    {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(RoutineDclSymbol, undefined, ctx.routineName().text);
        this.currentSymbol.context = ctx.routineName();
    }
    exitDefFunctionHeader(ctx: DefFunctionHeaderContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    // enterRoutineName(ctx: RoutineNameContext) 
    // {
    //     this.currentSymbol = this.symbolTable.addNewSymbolOfType(RoutineSymbol, undefined, ctx.identifier().IDENTIFIER().text);
    //     this.currentSymbol.context = ctx.identifier().IDENTIFIER();
    // }
    // exitRoutineName(ctx: RoutineNameContext) 
    // {
    //     if (this.currentSymbol) 
    //     {
    //         this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
    //     }
    // }
}

function unquote(input: string, quoteChar?: string) 
{
    quoteChar = quoteChar || '\"';

    if (input[0] === quoteChar && input[input.length - 1] === quoteChar) 
    {
        return input.slice(1, input.length - 1);
    }

    return input;
}