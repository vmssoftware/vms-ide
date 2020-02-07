import { pascalListener } from '../parser/pascalListener';
import { TerminalNode } from "antlr4ts/tree/TerminalNode";

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
    TypeSymbol,
    TypeBlockDclSymbol,
    LabelBlockDclSymbol,
    ConstBlockDclSymbol,
    WithTypeScopedSymbol,
} from './ContextSymbolTable';

import { 
    ScopedSymbol,
    Symbol,
} from "antlr4-c3";

import { 
    ProgramContext,
    ProgramHeadingContext,
    IdentifierContext,
    AttributeDefContext,
    VariableContext,
    BlockDeclarationsContext,
    ProcedureAndFunctionDeclarationPartContext,
    ProcedureDeclarationContext,
    FunctionDeclarationContext,
    FunctionDesignatorContext,
    ProcedureStatementContext,
    TypeDefinitionContext,
    VariableDescriptionContext,
    FieldListContext,
    ConstantDefinitionPartContext,
    ConstantDefinitionContext,
} from '../parser/pascalParser';


export class DetailsListener implements pascalListener 
{
    private recordName: string = "";
    private recordBlock: Symbol | undefined;
    private currentSymbol: Symbol | undefined;

    constructor(private symbolTable: ContextSymbolTable, private imports: string[]) 
    {    }

    enterProgram(ctx: ProgramContext) 
    {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(SyntaxSymbol, undefined, ctx.programHeading().text);
        this.currentSymbol.context = ctx.programHeading();

        let block = ctx.block().blockDeclarations();
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

    enterIdentifier(ctx: IdentifierContext) 
    {
        let ident = getIdentifier(ctx);

        if(ident)
        {
            this.currentSymbol = this.symbolTable.addNewSymbolOfType(LabelSymbol, undefined, ident.text);
            this.currentSymbol.context = ident;
        }
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

    enterVariable(ctx: VariableContext)
    {
        let blocks = ctx.variableChildName();

        if(blocks.length > 0)
        {
            let ident = getIdentifier(ctx.variableName().identifier());
            this.currentSymbol = this.symbolTable.addNewSymbolOfType(LabelSymbol, undefined, ident!.text);
            this.currentSymbol.context = ident;

            let currentSymbol = this.currentSymbol;
            this.symbolTable.linkSymbolsVar(currentSymbol, this.currentSymbol);

            for(let item of blocks)
            {
                ident = getIdentifier(item.identifier());
                this.currentSymbol = this.symbolTable.addNewSymbolOfType(LabelSymbol, undefined, ident!.text);
                this.currentSymbol.context = ident;
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

    enterVariableDescription(ctx: VariableDescriptionContext) 
    {
        let list = ctx.identifierList().identifier(); 

        for(let item of list)
        {
            this.currentSymbol = this.symbolTable.addNewSymbolOfType(VariableDclSymbol, undefined, item.text);
            this.currentSymbol.context = item;

            if (this.currentSymbol instanceof WithTypeScopedSymbol) 
            {
                this.currentSymbol.symbolType = this.symbolTable.addNewSymbolOfType(TypeSymbol, undefined, ctx.type().text);
                this.currentSymbol.symbolType.context = ctx.type();
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

    enterFieldList(ctx: FieldListContext) 
    {
        if (ctx.fixedPart())
        {
            let listS = ctx.fixedPart()!.recordSection(); 

            for(let itemS of listS)
            {
                let list = itemS.variableDescription().identifierList().identifier(); 

                for(let item of list)
                {
                    this.currentSymbol = this.symbolTable.addNewSymbolOfType(VariableDclSymbol, undefined, item.text);
                    this.currentSymbol.context = item;

                    this.symbolTable.linkSymbolsType((this.recordName + "." + this.currentSymbol.name).toUpperCase(),  this.currentSymbol);

                    if (this.currentSymbol instanceof WithTypeScopedSymbol) 
                    {
                        this.currentSymbol.symbolType = this.symbolTable.addNewSymbolOfType(TypeSymbol, undefined, itemS.variableDescription().type().text);
                        this.currentSymbol.symbolType.context = itemS.variableDescription().type();
                        this.currentSymbol.symbolBlock = this.recordBlock;
                    }
                }
            }
        }
    }
    exitFieldList(ctx: FieldListContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterBlockDeclarations(ctx: BlockDeclarationsContext) 
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
    exitBlockDeclarations(ctx: BlockDeclarationsContext) 
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

    enterTypeDefinition(ctx: TypeDefinitionContext) 
    {
        if(ctx.typeName())
        {
            this.currentSymbol = this.symbolTable.addNewSymbolOfType(TypeDclSymbol, undefined, ctx.typeName()!.identifier().text);
            this.currentSymbol.context = ctx.typeName()!.identifier();

            if (this.currentSymbol instanceof WithTypeScopedSymbol)
            {
                this.recordBlock = this.symbolTable.addNewSymbolOfType(TypeBlockDclSymbol, undefined, ctx.text);
                this.recordBlock.context = ctx;
                this.currentSymbol.symbolBlock = this.recordBlock;
            }

            if(ctx.type())
            {
                this.recordName = ctx.typeName()!.text;
            }
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
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(ConstantDclSymbol, undefined, ctx.constantName().identifier().text);
        this.currentSymbol.context = ctx.constantName().identifier();
    }
    exitConstantDefinition(ctx: ConstantDefinitionContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }
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

function getIdentifier(ident: IdentifierContext | undefined): TerminalNode | undefined
{
    let item : TerminalNode | undefined;

    if(ident)
    {
        if(ident.IDENTIFIER())
        {
            item = ident.IDENTIFIER();
        }
        else if(ident.attribute())
        {
            if(ident.attribute()!.ALIGN())
            {
                item = ident.attribute()!.ALIGN();
            }
            else if(ident.attribute()!.ALIGNED())
            {
                item = ident.attribute()!.ALIGNED();
            }
            else if(ident.attribute()!.UNALIGNED())
            {
                item = ident.attribute()!.UNALIGNED();
            }
            else if(ident.attribute()!.AT())
            {
                item = ident.attribute()!.AT();
            }
            else if(ident.attribute()!.AUTOMATIC())
            {
                item = ident.attribute()!.AUTOMATIC();
            }
            else if(ident.attribute()!.COMMON())
            {
                item = ident.attribute()!.COMMON();
            }
            else if(ident.attribute()!.STATIC())
            {
                item = ident.attribute()!.STATIC();
            }
            else if(ident.attribute()!.PSECT())
            {
                item = ident.attribute()!.PSECT();
            }
            else if(ident.attribute()!.ASYNCHRONOUS())
            {
                item = ident.attribute()!.ASYNCHRONOUS();
            }
            else if(ident.attribute()!.CHECK())
            {
                item = ident.attribute()!.CHECK();
            }
            else if(ident.attribute()!.FLOAT())
            {
                item = ident.attribute()!.FLOAT();
            }
            else if(ident.attribute()!.ENUMERATION_SIZE())
            {
                item = ident.attribute()!.ENUMERATION_SIZE();
            }
            else if(ident.attribute()!.PEN_CHECKING_STYLE())
            {
                item = ident.attribute()!.PEN_CHECKING_STYLE();
            }
            else if(ident.attribute()!.HiDDEN())
            {
                item = ident.attribute()!.HiDDEN();
            }
            else if(ident.attribute()!.IDENT())
            {
                item = ident.attribute()!.IDENT();
            }
            else if(ident.attribute()!.INITIALIZE())
            {
                item = ident.attribute()!.INITIALIZE();
            }
            else if(ident.attribute()!.KEY())
            {
                item = ident.attribute()!.KEY();
            }
            else if(ident.attribute()!.LIST())
            {
                item = ident.attribute()!.LIST();
            }
            else if(ident.attribute()!.OPTIMIZE())
            {
                item = ident.attribute()!.OPTIMIZE();
            }
            else if(ident.attribute()!.NOOPTIMIZE())
            {
                item = ident.attribute()!.NOOPTIMIZE();
            }
            else if(ident.attribute()!.CLASS_A())
            {
                item = ident.attribute()!.CLASS_A();
            }
            else if(ident.attribute()!.CLASS_NCA())
            {
                item = ident.attribute()!.CLASS_NCA();
            }
            else if(ident.attribute()!.CLASS_S())
            {
                item = ident.attribute()!.CLASS_S();
            }
            else if(ident.attribute()!.IMMEDIATE())
            {
                item = ident.attribute()!.IMMEDIATE();
            }
            else if(ident.attribute()!.REFERENCE())
            {
                item = ident.attribute()!.REFERENCE();
            }
            else if(ident.attribute()!.POS())
            {
                item = ident.attribute()!.POS();
            }
            else if(ident.attribute()!.READONLY())
            {
                item = ident.attribute()!.READONLY();
            }
            else if(ident.attribute()!.BIT())
            {
                item = ident.attribute()!.BIT();
            }
            else if(ident.attribute()!.BYTE())
            {
                item = ident.attribute()!.BYTE();
            }
            else if(ident.attribute()!.WORD())
            {
                item = ident.attribute()!.WORD();
            }
            else if(ident.attribute()!.LONG())
            {
                item = ident.attribute()!.LONG();
            }
            else if(ident.attribute()!.QUAD())
            {
                item = ident.attribute()!.QUAD();
            }
            else if(ident.attribute()!.OCTA())
            {
                item = ident.attribute()!.OCTA();
            }
            else if(ident.attribute()!.TRUNCATE())
            {
                item = ident.attribute()!.TRUNCATE();
            }
            else if(ident.attribute()!.UNBOUND())
            {
                item = ident.attribute()!.UNBOUND();
            }
            else if(ident.attribute()!.UNSAFE())
            {
                item = ident.attribute()!.UNSAFE();
            }
            else if(ident.attribute()!.VALUE())
            {
                item = ident.attribute()!.VALUE();
            }
            else if(ident.attribute()!.LOCAL())
            {
                item = ident.attribute()!.LOCAL();
            }
            else if(ident.attribute()!.GLOBAL())
            {
                item = ident.attribute()!.GLOBAL();
            }
            else if(ident.attribute()!.EXTERNAL())
            {
                item = ident.attribute()!.EXTERNAL();
            }
            else if(ident.attribute()!.WEAK_GLOBAL())
            {
                item = ident.attribute()!.WEAK_GLOBAL();
            }
            else if(ident.attribute()!.WEAK_EXTERNAL())
            {
                item = ident.attribute()!.WEAK_EXTERNAL();
            }
            else if(ident.attribute()!.VOLATILE())
            {
                item = ident.attribute()!.VOLATILE();
            }
            else if(ident.attribute()!.WRITEONLY())
            {
                item = ident.attribute()!.WRITEONLY();
            }
        }
        else if(ident.preReservedWords())
        {
            if(ident.preReservedWords()!.AND_THEN())
            {
                item = ident.preReservedWords()!.AND_THEN();
            }
            else if(ident.preReservedWords()!.BREAK())
            {
                item = ident.preReservedWords()!.BREAK();
            }
            else if(ident.preReservedWords()!.CONTINUE())
            {
                item = ident.preReservedWords()!.CONTINUE();
            }
            else if(ident.preReservedWords()!.MODULE())
            {
                item = ident.preReservedWords()!.MODULE();
            }
            else if(ident.preReservedWords()!.OR_ELSE())
            {
                item = ident.preReservedWords()!.OR_ELSE();
            }
            else if(ident.preReservedWords()!.OTHERWISE())
            {
                item = ident.preReservedWords()!.OTHERWISE();
            }
            else if(ident.preReservedWords()!.REM())
            {
                item = ident.preReservedWords()!.REM();
            }
            else if(ident.preReservedWords()!.RETURN())
            {
                item = ident.preReservedWords()!.RETURN();
            }
            else if(ident.preReservedWords()!.VALUE())
            {
                item = ident.preReservedWords()!.VALUE();
            }
            else if(ident.preReservedWords()!.VARYING())
            {
                item = ident.preReservedWords()!.VARYING();
            }
            if(ident.preReservedWords()!.TEXT())
            {
                item = ident.preReservedWords()!.TEXT();
            }
            else if(ident.preReservedWords()!.STRING())
            {
                item = ident.preReservedWords()!.STRING();
            }
            else if(ident.preReservedWords()!.CHR())
            {
                item = ident.preReservedWords()!.CHR();
            }
            else if(ident.preReservedWords()!.CHAR())
            {
                item = ident.preReservedWords()!.CHAR();
            }
            else if(ident.preReservedWords()!.TRUE())
            {
                item = ident.preReservedWords()!.TRUE();
            }
            else if(ident.preReservedWords()!.FALSE())
            {
                item = ident.preReservedWords()!.FALSE();
            }
            else if(ident.preReservedWords()!.CONTINUE())
            {
                item = ident.preReservedWords()!.CONTINUE();
            }
            else if(ident.preReservedWords()!.ZERO())
            {
                item = ident.preReservedWords()!.ZERO();
            }
        }
    }

    return item;
}