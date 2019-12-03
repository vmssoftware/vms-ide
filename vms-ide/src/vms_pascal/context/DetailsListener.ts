import { pascalListener } from '../parser/pascalListener';

import {
    ContextSymbolTable,
    LabelSymbol,
    SyntaxSymbol,
    RoutineSymbol,
    RoutineDclSymbol,
    RoutineBlockDclSymbol,
    RoutineHeaderSymbol,
    VariableDclSymbol,
    VariableBlockDclSymbol,
    VariableGlobalBlockDclSymbol,
    TypeDclSymbol,
    ConstantDclSymbol,
    TypeBlockDclSymbol,
    LabelBlockDclSymbol,
    ConstBlockDclSymbol,
    UnitBlockDclSymbol,
} from './ContextSymbolTable';

import { 
    ScopedSymbol,
    Symbol,
} from "antlr4-c3";

import { 
    ProgramContext,
    ProgramHeadingContext,
    InheritContext,
    IdentifierContext,
    AttributeDefContext,
    IdentifierListContext,
    BlockContext,
    ProcedureAndFunctionDeclarationPartContext,
    ProcedureDeclarationContext,
    FunctionDeclarationContext,
    FunctionDesignatorContext,
    ProcedureStatementContext,
    TypeDefinitionContext,
    ConstantDefinitionPartContext,
    ConstantDefinitionContext,
    TypeDefinitionPartContext,
} from '../parser/pascalParser';


export class DetailsListener implements pascalListener 
{
    constructor(private symbolTable: ContextSymbolTable, private imports: string[]) 
    {    }

    enterProgram(ctx: ProgramContext) 
    {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(SyntaxSymbol, undefined, ctx.programHeading().text);
        this.currentSymbol.context = ctx.programHeading();

        let block = ctx.block();
        let listVariable = block.variableDeclarationPart();

        for(let item of listVariable)
        {
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

    enterProgramHeading(ctx: ProgramHeadingContext) 
    {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(SyntaxSymbol, undefined, ctx.identifier().text);
        this.currentSymbol.context = ctx.identifier();
    }

    exitProgramHeading(ctx: ProgramHeadingContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterInherit(ctx: InheritContext) 
    {
        let list = ctx.string(); 

        for(let item of list)
        {
            this.currentSymbol = this.symbolTable.addNewSymbolOfType(SyntaxSymbol, undefined, item.text);
            this.currentSymbol.context = item;

            let refName = unquote(item.STRING_LITERAL().text, "'");
            this.imports.push(refName);
        }
    }

    exitInherit(ctx: InheritContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterIdentifier(ctx: IdentifierContext) 
    {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(LabelSymbol, undefined, ctx.IDENTIFIER().text);
        this.currentSymbol.context = ctx.IDENTIFIER();
    }

    exitIdentifier(ctx: IdentifierContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterAttributeDef(ctx: AttributeDefContext)
    {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(LabelSymbol, undefined, ctx.attribute().text);
        this.currentSymbol.context = ctx.attribute();
    }

    exitAttributeDef(ctx: AttributeDefContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterIdentifierList(ctx: IdentifierListContext) 
    {
        let list = ctx.identifier(); 

        for(let item of list)
        {
            this.currentSymbol = this.symbolTable.addNewSymbolOfType(VariableDclSymbol, undefined, item.text);
            this.currentSymbol.context = item;
        }
    }

    exitIdentifierList(ctx: IdentifierListContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterBlock(ctx: BlockContext) 
    {
        // this.currentSymbol = this.symbolTable.addNewSymbolOfType(CompoundSymbol, undefined, ctx.compoundStatement().text);
        // this.currentSymbol.context = ctx.compoundStatement();

        let listLabel = ctx.labelDeclarationPart();

        for(let item of listLabel)
        {
            this.currentSymbol = this.symbolTable.addNewSymbolOfType(LabelBlockDclSymbol, undefined, item.text);
            this.currentSymbol.context = item;
        }

        // let listConstant = ctx.constantDefinitionPart();

        // for(let item of listConstant)
        // {
        //     this.currentSymbol = this.symbolTable.addNewSymbolOfType(ConstBlockDclSymbol, undefined, item.text);
        //     this.currentSymbol.context = item;
        // }

        let listType = ctx.typeDefinitionPart();

        for(let item of listType)
        {
            this.currentSymbol = this.symbolTable.addNewSymbolOfType(TypeBlockDclSymbol, undefined, item.text);
            this.currentSymbol.context = item;
        }

        let listUnits = ctx.usesUnitsPart();

        for(let item of listUnits)
        {
            this.currentSymbol = this.symbolTable.addNewSymbolOfType(UnitBlockDclSymbol, undefined, item.text);
            this.currentSymbol.context = item;
        }

        let listVariable = ctx.variableDeclarationPart();

        for(let item of listVariable)
        {
            this.currentSymbol = this.symbolTable.addNewSymbolOfType(VariableBlockDclSymbol, undefined, item.text);
            this.currentSymbol.context = item;
        }

        let listRoutine = ctx.procedureAndFunctionDeclarationPart();        

        for(let item of listRoutine)
        {
            this.currentSymbol = this.symbolTable.addNewSymbolOfType(RoutineBlockDclSymbol, undefined, item.text);
            this.currentSymbol.context = item;
        }
    }

    exitBlock(ctx: BlockContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterProcedureAndFunctionDeclarationPart(ctx: ProcedureAndFunctionDeclarationPartContext) 
    {
        // this.currentSymbol = this.symbolTable.addNewSymbolOfType(RoutineBlockDclSymbol, undefined, ctx.text);
        // this.currentSymbol.context = ctx;

        this.currentSymbol = this.symbolTable.addNewSymbolOfType(RoutineHeaderSymbol, undefined, ctx.procedureOrFunctionDeclaration().text);
        this.currentSymbol.context = ctx.procedureOrFunctionDeclaration();

        // this.currentSymbol = this.symbolTable.addNewSymbolOfType(BlockSymbol, undefined, ctx.block().text);
        // this.currentSymbol.context = ctx.block();
    }

    exitProcedureAndFunctionDeclarationPart(ctx: ProcedureAndFunctionDeclarationPartContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterProcedureDeclaration(ctx: ProcedureDeclarationContext) 
    {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(RoutineDclSymbol, undefined, ctx.identifier().text);
        this.currentSymbol.context = ctx.identifier();
    }

    exitProcedureDeclaration(ctx: ProcedureDeclarationContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterFunctionDeclaration(ctx: FunctionDeclarationContext) 
    {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(RoutineDclSymbol, undefined, ctx.identifier().text);
        this.currentSymbol.context = ctx.identifier();
    }

    exitFunctionDeclaration(ctx: FunctionDeclarationContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterFunctionDesignator(ctx: FunctionDesignatorContext) 
    {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(RoutineSymbol, undefined, ctx.identifier().text);
        this.currentSymbol.context = ctx.identifier();
    }

    exitFunctionDesignator(ctx: FunctionDesignatorContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterProcedureStatement(ctx: ProcedureStatementContext) 
    {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(RoutineSymbol, undefined, ctx.identifier().text);
        this.currentSymbol.context = ctx.identifier();
    }

    exitProcedureStatement(ctx: ProcedureStatementContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterTypeDefinitionPart(ctx: TypeDefinitionPartContext) 
    {
        let list = ctx.typeDefinition(); 

        for(let item of list)
        {
            this.currentSymbol = this.symbolTable.addNewSymbolOfType(TypeBlockDclSymbol, undefined, item.text);
            this.currentSymbol.context = item;
        }
    }

    exitTypeDefinitionPart(ctx: TypeDefinitionPartContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterTypeDefinition(ctx: TypeDefinitionContext) 
    {
        if(ctx.identifier())
        {
            this.currentSymbol = this.symbolTable.addNewSymbolOfType(TypeDclSymbol, undefined, ctx.identifier()!.text);
            this.currentSymbol.context = ctx.identifier();
        }
        else if(ctx.schemaType())
        {
            this.currentSymbol = this.symbolTable.addNewSymbolOfType(TypeDclSymbol, undefined, ctx.schemaType()!.schemaName().text);
            this.currentSymbol.context = ctx.schemaType()!.schemaName();
        }
    }

    exitTypeDefinition(ctx: TypeDefinitionContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterConstantDefinitionPart(ctx: ConstantDefinitionPartContext) 
    {
        let list = ctx.constantDefinition(); 

        for(let item of list)
        {
            this.currentSymbol = this.symbolTable.addNewSymbolOfType(ConstBlockDclSymbol, undefined, item.text);
            this.currentSymbol.context = item;
        }
    }

    exitConstantDefinitionPart(ctx: ConstantDefinitionPartContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterConstantDefinition(ctx: ConstantDefinitionContext) 
    {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(ConstantDclSymbol, undefined, ctx.identifier().text);
        this.currentSymbol.context = ctx.identifier();
    }

    exitConstantDefinition(ctx: ConstantDefinitionContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

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
