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
    VariableDeclarationContext,
    VariableDescriptionContext,
    // ComponentDeclContext,
    // StructureBlockContext,
    // RecordBlockContext,
    DeclarationContext,
    SubroutineDeclarationContext,
    SubroutineHeaderContext,
    FunctionDeclarationContext,
    FunctionHeaderContext,
    RoutineNameContext,
    DefFunctionSingleDeclarationContext,
    DefFunctionHeaderContext,
    DefFunctionMultyDeclarationContext,
} from '../parser/BasicParser';


export class DetailsListener implements BasicParserListener 
{
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

    enterVariableDeclaration(ctx: VariableDeclarationContext) 
    {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(VariableBlockDclSymbol, undefined, ctx.text);
        this.currentSymbol.context = ctx;

        let blocks = ctx.variableDescription();

        for(let item of blocks)
        {
            let obj = item.singleVarDescription();

            if(obj)
            {
                this.currentSymbol = this.symbolTable.addNewSymbolOfType(VariableDclSymbol, undefined, obj.variableName().identifier().IDENTIFIER().text);
                this.currentSymbol.context = obj.variableName().identifier().IDENTIFIER();
            }
            else
            {
                let obj = item.arrayDescription();

                if(obj)
                {
                    this.currentSymbol = this.symbolTable.addNewSymbolOfType(VariableDclSymbol, undefined, obj.arrayVariableName().identifier().IDENTIFIER().text);
                    this.currentSymbol.context = obj.arrayVariableName().identifier().IDENTIFIER();
                }
            }
        }
    }
    exitvariableDescription(ctx: VariableDeclarationContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterVariableDescription(ctx: VariableDescriptionContext) 
    {
        let obj = ctx.singleVarDescription();

        if(obj)
        {
            this.currentSymbol = this.symbolTable.addNewSymbolOfType(VariableDclSymbol, undefined, obj.variableName().identifier().IDENTIFIER().text);
            this.currentSymbol.context = obj.variableName().identifier().IDENTIFIER();
        }        
        else
        {
            let obj = ctx.arrayDescription();

            if(obj)
            {
                this.currentSymbol = this.symbolTable.addNewSymbolOfType(VariableDclSymbol, undefined, obj.arrayVariableName().identifier().IDENTIFIER().text);
                this.currentSymbol.context = obj.arrayVariableName().identifier().IDENTIFIER();
            }
        }
    }
    exitVariableDescription(ctx: VariableDescriptionContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    // enterComponentDecl(ctx: ComponentDeclContext) 
    // {
    //     if(ctx.componentName())
    //     {
    //         let obj = ctx.componentName();

    //         if(obj)
    //         {
    //             let ident = getIdentifier(obj.identifier());

    //             if(ident)
    //             {
    //                 this.currentSymbol = this.symbolTable.addNewSymbolOfType(VariableDclSymbol, undefined, ident.text);
    //                 this.currentSymbol.context = ident;
    //             }
    //         }
    //     }
    //     else if(ctx.pointerAssignmentItem())
    //     {
    //         let objs = ctx.pointerAssignmentItem()!.name();

    //         for(let obj of objs)
    //         {
    //             let ident = getIdentifier(obj.identifier());

    //             if(ident)
    //             {
    //                 this.currentSymbol = this.symbolTable.addNewSymbolOfType(VariableDclSymbol, undefined, ident.text);
    //                 this.currentSymbol.context = ident;
    //             }
    //         }
    //     }
    // }
    // exitComponentDecl(ctx: ComponentDeclContext) 
    // {
    //     if (this.currentSymbol) 
    //     {
    //         this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
    //     }
    // }

    // enterRecordBlock(ctx: RecordBlockContext) 
    // {
    //     this.currentSymbol = this.symbolTable.addNewSymbolOfType(TypeBlockDclSymbol, undefined, ctx.text);
    //     this.currentSymbol.context = ctx;

    //     if(ctx.recordStatement().genericName())
    //     {
    //         let obj = ctx.recordStatement().genericName();

    //         if(obj)
    //         {
    //             let ident = getIdentifier(obj.identifier());

    //             if(ident)
    //             {
    //                 this.currentSymbol = this.symbolTable.addNewSymbolOfType(TypeDclSymbol, undefined, ident.text);
    //                 this.currentSymbol.context = ident;
    //             }
    //         }
    //     }

    //     let objs = ctx.recordStatement().typeStatementName();

    //     for(let obj of objs)
    //     {
    //         if(obj.identifier())
    //         {
    //             let ident = getIdentifier(obj.identifier());

    //             if(ident)
    //             {
    //                 this.currentSymbol = this.symbolTable.addNewSymbolOfType(VariableDclSymbol, undefined, ident.text);
    //                 this.currentSymbol.context = ident;
    //             }
    //         }
    //         else if(obj.arrayDeclarator())
    //         {
    //             let ident = getIdentifier(obj.arrayDeclarator()!.variableName().identifier());

    //             if(ident)
    //             {
    //                 this.currentSymbol = this.symbolTable.addNewSymbolOfType(VariableDclSymbol, undefined, ident.text);
    //                 this.currentSymbol.context = ident;
    //             }
    //         }
    //     }
    // }
    // exitRecordBlock(ctx: RecordBlockContext) 
    // {
    //     if (this.currentSymbol) 
    //     {
    //         this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
    //     }
    // }

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

    private currentSymbol: Symbol | undefined;
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