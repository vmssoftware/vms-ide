import { FortranParserListener } from '../parser/FortranParserListener';
import { TerminalNode } from "antlr4ts/tree/TerminalNode";

import {
    ContextSymbolTable,
    LabelSymbol,
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
    MainRangeContext,
    IdentifierContext,
    EntityDeclContext,
    ComponentDeclContext,
    DerivedTypeDefContext,
    InterfaceBlockContext,
    StructureBlockContext,
    RecordBlockContext,
    ModuleBlockContext,
    BlockDataSubprogramBlockContext,
    DeclarationConstructContext,
    SubroutineDeclarationContext,
    SubroutineSubprogramContext,
    FunctionDeclarationContext,
    FunctionSubprogramContext,
    FunctionReferenceContext,
    CallStatementContext,
    // TypeDefinitionContext,
    // ConstantDefinitionPartContext,
    // ConstantDefinitionContext,
    // TypeDefinitionPartContext,
} from '../parser/FortranParser';


export class DetailsListener implements FortranParserListener 
{
    constructor(private symbolTable: ContextSymbolTable, private imports: string[]) 
    {    }

    enterProgram(ctx: ProgramContext) 
    {
        let blocks = ctx.programUnit();

        for(let item of blocks)
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

    enterMainRange(ctx: MainRangeContext) 
    {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(VariableGlobalBlockDclSymbol, undefined, ctx.text);
        this.currentSymbol.context = ctx;
    }
    exitMainRange(ctx: MainRangeContext) 
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

    enterEntityDecl(ctx: EntityDeclContext) 
    {
        if(ctx.objectName())
        {
            let obj = ctx.objectName();

            if(obj)
            {
                let ident = getIdentifier(obj.identifier());

                if(ident)
                {
                    this.currentSymbol = this.symbolTable.addNewSymbolOfType(VariableDclSymbol, undefined, ident.text);
                    this.currentSymbol.context = ident;
                }
            }
        }
    }
    exitEntityDecl(ctx: EntityDeclContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterComponentDecl(ctx: ComponentDeclContext) 
    {
        if(ctx.componentName())
        {
            let obj = ctx.componentName();

            if(obj)
            {
                let ident = getIdentifier(obj.identifier());

                if(ident)
                {
                    this.currentSymbol = this.symbolTable.addNewSymbolOfType(VariableDclSymbol, undefined, ident.text);
                    this.currentSymbol.context = ident;
                }
            }
        }
        else if(ctx.pointerAssignmentItem())
        {
            let objs = ctx.pointerAssignmentItem()!.name();

            for(let obj of objs)
            {
                let ident = getIdentifier(obj.identifier());

                if(ident)
                {
                    this.currentSymbol = this.symbolTable.addNewSymbolOfType(VariableDclSymbol, undefined, ident.text);
                    this.currentSymbol.context = ident;
                }
            }
        }
    }
    exitComponentDecl(ctx: ComponentDeclContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterDerivedTypeDef(ctx: DerivedTypeDefContext) 
    {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(TypeBlockDclSymbol, undefined, ctx.text);
        this.currentSymbol.context = ctx;

        if(ctx.derivedTypeStatement())
        {
            let obj = ctx.derivedTypeStatement().typeName();

            if(obj)
            {
                let ident = getIdentifier(obj.identifier());

                if(ident)
                {
                    this.currentSymbol = this.symbolTable.addNewSymbolOfType(TypeDclSymbol, undefined, ident.text);
                    this.currentSymbol.context = ident;
                }
            }
        }
    }
    exitDerivedTypeDef(ctx: DerivedTypeDefContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterInterfaceBlock(ctx: InterfaceBlockContext) 
    {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(TypeBlockDclSymbol, undefined, ctx.text);
        this.currentSymbol.context = ctx;

        if(ctx.interfaceStatement().genericName())
        {
            let obj = ctx.interfaceStatement().genericName();

            if(obj)
            {
                let ident = getIdentifier(obj.identifier());

                if(ident)
                {
                    this.currentSymbol = this.symbolTable.addNewSymbolOfType(TypeDclSymbol, undefined, ident.text);
                    this.currentSymbol.context = ident;
                }
            }
        }
    }
    exitInterfaceBlock(ctx: InterfaceBlockContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterStructureBlock(ctx:StructureBlockContext) 
    {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(TypeBlockDclSymbol, undefined, ctx.text);
        this.currentSymbol.context = ctx;

        if(ctx.structureStatement().genericName())
        {
            let obj = ctx.structureStatement().genericName();

            if(obj)
            {
                let ident = getIdentifier(obj.identifier());

                if(ident)
                {
                    this.currentSymbol = this.symbolTable.addNewSymbolOfType(TypeDclSymbol, undefined, ident.text);
                    this.currentSymbol.context = ident;
                }
            }
        }

        let obj = ctx.structureStatement().typeStatementName();

        if(obj)
        {
            if(obj.identifier())
            {
                let ident = getIdentifier(obj.identifier());

                if(ident)
                {
                    this.currentSymbol = this.symbolTable.addNewSymbolOfType(VariableDclSymbol, undefined, ident.text);
                    this.currentSymbol.context = ident;
                }
            }
            else if(obj.arrayDeclarator())
            {
                let ident = getIdentifier(obj.arrayDeclarator()!.variableName().identifier());

                if(ident)
                {
                    this.currentSymbol = this.symbolTable.addNewSymbolOfType(VariableDclSymbol, undefined, ident.text);
                    this.currentSymbol.context = ident;
                }
            }
        }
    }
    exitStructureBlock(ctx: StructureBlockContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterRecordBlock(ctx: RecordBlockContext) 
    {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(TypeBlockDclSymbol, undefined, ctx.text);
        this.currentSymbol.context = ctx;

        if(ctx.recordStatement().genericName())
        {
            let obj = ctx.recordStatement().genericName();

            if(obj)
            {
                let ident = getIdentifier(obj.identifier());

                if(ident)
                {
                    this.currentSymbol = this.symbolTable.addNewSymbolOfType(TypeDclSymbol, undefined, ident.text);
                    this.currentSymbol.context = ident;
                }
            }
        }

        let objs = ctx.recordStatement().typeStatementName();

        for(let obj of objs)
        {
            if(obj.identifier())
            {
                let ident = getIdentifier(obj.identifier());

                if(ident)
                {
                    this.currentSymbol = this.symbolTable.addNewSymbolOfType(VariableDclSymbol, undefined, ident.text);
                    this.currentSymbol.context = ident;
                }
            }
            else if(obj.arrayDeclarator())
            {
                let ident = getIdentifier(obj.arrayDeclarator()!.variableName().identifier());

                if(ident)
                {
                    this.currentSymbol = this.symbolTable.addNewSymbolOfType(VariableDclSymbol, undefined, ident.text);
                    this.currentSymbol.context = ident;
                }
            }
        }
    }
    exitRecordBlock(ctx: RecordBlockContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterModuleBlock(ctx: ModuleBlockContext) 
    {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(TypeBlockDclSymbol, undefined, ctx.text);
        this.currentSymbol.context = ctx;

        if(ctx.moduleStatement().moduleName())
        {
            let obj = ctx.moduleStatement().moduleName();

            if(obj)
            {
                let ident = getIdentifier(obj.identifier());

                if(ident)
                {
                    this.currentSymbol = this.symbolTable.addNewSymbolOfType(TypeDclSymbol, undefined, ident.text);
                    this.currentSymbol.context = ident;
                }
            }
        }
    }
    exitModuleBlock(ctx: ModuleBlockContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterBlockDataSubprogramBlock(ctx: BlockDataSubprogramBlockContext) 
    {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(TypeBlockDclSymbol, undefined, ctx.text);
        this.currentSymbol.context = ctx;

        if(ctx.blockDataStatement().blockDataName())
        {
            let obj = ctx.blockDataStatement().blockDataName();

            if(obj)
            {
                let ident = getIdentifier(obj.identifier());

                if(ident)
                {
                    this.currentSymbol = this.symbolTable.addNewSymbolOfType(TypeDclSymbol, undefined, ident.text);
                    this.currentSymbol.context = ident;
                }
            }
        }
    }
    exitBlockDataSubprogramBlock(ctx: BlockDataSubprogramBlockContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterDeclarationConstruct(ctx: DeclarationConstructContext) 
    {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(VariableDclSymbol, undefined, ctx.text);//???symbol type
        this.currentSymbol.context = ctx;
    }
    exitDeclarationConstruct(ctx: DeclarationConstructContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterSubroutineSubprogram(ctx: SubroutineSubprogramContext) 
    {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(RoutineHeaderSymbol, undefined, ctx.subroutineDeclaration().text);
        this.currentSymbol.context = ctx.subroutineDeclaration();

        this.currentSymbol = this.symbolTable.addNewSymbolOfType(RoutineBlockDclSymbol, undefined, ctx.text);
        this.currentSymbol.context = ctx;
    }
    exitSubroutineSubprogram(ctx: SubroutineSubprogramContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterSubroutineDeclaration(ctx: SubroutineDeclarationContext) 
    {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(RoutineDclSymbol, undefined, ctx.subroutineName().text);
        this.currentSymbol.context = ctx.subroutineName();
    }
    exitSubroutineDeclaration(ctx: SubroutineDeclarationContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterFunctionSubprogram(ctx: FunctionSubprogramContext) 
    {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(RoutineHeaderSymbol, undefined, ctx.functionDeclaration().text);
        this.currentSymbol.context = ctx.functionDeclaration();

        this.currentSymbol = this.symbolTable.addNewSymbolOfType(RoutineBlockDclSymbol, undefined, ctx.text);
        this.currentSymbol.context = ctx;
    }
    exitFunctionSubprogram(ctx: FunctionSubprogramContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterFunctionDeclaration(ctx: FunctionDeclarationContext) 
    {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(RoutineDclSymbol, undefined, ctx.functionName().text);
        this.currentSymbol.context = ctx.functionName();
    }
    exitFunctionDeclaration(ctx: FunctionDeclarationContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterFunctionReference(ctx: FunctionReferenceContext) 
    {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(RoutineSymbol, undefined, ctx.name().text);
        this.currentSymbol.context = ctx.name();
    }
    exitFunctionReference(ctx: FunctionReferenceContext) 
    {
        if (this.currentSymbol) 
        {
            this.currentSymbol = this.currentSymbol.parent as ScopedSymbol;
        }
    }

    enterCallStatement(ctx: CallStatementContext) 
    {
        this.currentSymbol = this.symbolTable.addNewSymbolOfType(RoutineSymbol, undefined, ctx.subroutineNameUse().text);
        this.currentSymbol.context = ctx.subroutineNameUse();
    }
    exitCallStatement(ctx: CallStatementContext) 
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

function getIdentifier(ident: IdentifierContext | undefined): TerminalNode | undefined
{
    let item : TerminalNode | undefined;

    if(ident)
    {
        if(ident.IDENTIFIER())
        {
            item = ident.IDENTIFIER();
        }
        else if(ident.IN())
        {
            item = ident.IN();
        }
        else if(ident.OUT())
        {
            item = ident.OUT();
        }
        else if(ident.STAT())
        {
            item = ident.STAT();
        }
        else if(ident.LOGICAL())
        {
            item = ident.LOGICAL();
        }
        else if(ident.KIND())
        {
            item = ident.KIND();
        }
        else if(ident.KIND())
        {
            item = ident.KIND();
        }
        else if(ident.KIND())
        {
            item = ident.KIND();
        }
        else if(ident.LEN())
        {
            item = ident.LEN();
        }
        else if(ident.FMT())
        {
            item = ident.FMT();
        }
        else if(ident.NML())
        {
            item = ident.NML();
        }
        else if(ident.REC())
        {
            item = ident.REC();
        }
        else if(ident.ADVANCE())
        {
            item = ident.ADVANCE();
        }
        else if(ident.SIZE())
        {
            item = ident.SIZE();
        }
        else if(ident.EOR_S())
        {
            item = ident.EOR_S();
        }
        else if(ident.UNIT())
        {
            item = ident.UNIT();
        }
        else if(ident.ERR())
        {
            item = ident.ERR();
        }
        else if(ident.IOSTAT())
        {
            item = ident.IOSTAT();
        }
        else if(ident.LET())
        {
            item = ident.LET();
        }
        else if(ident.PRECISION())
        {
            item = ident.PRECISION();
        }
        else if(ident.IOSTART())
        {
            item = ident.IOSTART();
        }
        else if(ident.SEQUENTIAL())
        {
            item = ident.SEQUENTIAL();
        }
        else if(ident.SEQUENTIAL())
        {
            item = ident.SEQUENTIAL();
        }
        else if(ident.DIRECT())
        {
            item = ident.DIRECT();
        }
        else if(ident.FILE())
        {
            item = ident.FILE();
        }
        else if(ident.STATUS())
        {
            item = ident.STATUS();
        }
        else if(ident.ACCESS())
        {
            item = ident.ACCESS();
        }
        else if(ident.POSITION())
        {
            item = ident.POSITION();
        }
        else if(ident.ACTION())
        {
            item = ident.ACTION();
        }
        else if(ident.DELIM())
        {
            item = ident.DELIM();
        }
        else if(ident.DELIM())
        {
            item = ident.DELIM();
        }
        else if(ident.PAD())
        {
            item = ident.PAD();
        }
        else if(ident.FORM())
        {
            item = ident.FORM();
        }
        else if(ident.RECL())
        {
            item = ident.RECL();
        }
        else if(ident.BLANK())
        {
            item = ident.BLANK();
        }
        else if(ident.EXIST())
        {
            item = ident.EXIST();
        }
        else if(ident.OPENED())
        {
            item = ident.OPENED();
        }
        else if(ident.NUMBER())
        {
            item = ident.NUMBER();
        }
        else if(ident.NAMED())
        {
            item = ident.NAMED();
        }
        else if(ident.NAME())
        {
            item = ident.NAME();
        }
        else if(ident.FORMATTED())
        {
            item = ident.FORMATTED();
        }
        else if(ident.UNFORMATTED())
        {
            item = ident.UNFORMATTED();
        }
        else if(ident.NEXTREC())
        {
            item = ident.NEXTREC();
        }
        else if(ident.READWRITE())
        {
            item = ident.READWRITE();
        }
        else if(ident.IOLENGTH())
        {
            item = ident.IOLENGTH();
        }
        else if(ident.ASSOCIATEVARIABLE())
        {
            item = ident.ASSOCIATEVARIABLE();
        }
        else if(ident.BLOCKSIZE())
        {
            item = ident.BLOCKSIZE();
        }
        else if(ident.BUFFERCOUNT())
        {
            item = ident.BUFFERCOUNT();
        }
        else if(ident.BUFFERED())
        {
            item = ident.BUFFERED();
        }
        else if(ident.CARRIAGECONTROL())
        {
            item = ident.CARRIAGECONTROL();
        }
        else if(ident.CONVERT())
        {
            item = ident.CONVERT();
        }
        else if(ident.DEFAULTFILE())
        {
            item = ident.DEFAULTFILE();
        }
        else if(ident.DISPOSE())
        {
            item = ident.DISPOSE();
        }
        else if(ident.DISP())
        {
            item = ident.DISP();
        }
        else if(ident.EXTENDSIZE())
        {
            item = ident.EXTENDSIZE();
        }
        else if(ident.INITIALSIZE())
        {
            item = ident.INITIALSIZE();
        }
        else if(ident.KEY())
        {
            item = ident.KEY();
        }
        else if(ident.KEYED())
        {
            item = ident.KEYED();
        }
        else if(ident.MAXREC())
        {
            item = ident.MAXREC();
        }
        else if(ident.NOSPANBLOCKS())
        {
            item = ident.NOSPANBLOCKS();
        }
        else if(ident.ORGANIZATION())
        {
            item = ident.ORGANIZATION();
        }
        else if(ident.RECORDTYPE())
        {
            item = ident.RECORDTYPE();
        }
        else if(ident.SHARED())
        {
            item = ident.SHARED();
        }
        else if(ident.ONLY())
        {
            item = ident.ONLY();
        }
        else if(ident.ENTRY())
        {
            item = ident.ENTRY();
        }
        else if(ident.TYPE())
        {
            item = ident.TYPE();
        }
        else if(ident.PRIVATE())
        {
            item = ident.PRIVATE();
        }
        else if(ident.PUBLIC())
        {
            item = ident.PUBLIC();
        }
        else if(ident.SEQUENCE())
        {
            item = ident.SEQUENCE();
        }
        else if(ident.DIMENSION())
        {
            item = ident.DIMENSION();
        }
        else if(ident.REAL())
        {
            item = ident.REAL();
        }
        else if(ident.EQUIVALENCE())
        {
            item = ident.EQUIVALENCE();
        }
        else if(ident.OPERATOR())
        {
            item = ident.OPERATOR();
        }
        else if(ident.ASSIGNMENT())
        {
            item = ident.ASSIGNMENT();
        }
        else if(ident.ALLOCATE())
        {
            item = ident.ALLOCATE();
        }
        else if(ident.DEALLOCATE())
        {
            item = ident.DEALLOCATE();
        }
        else if(ident.NULLIFY())
        {
            item = ident.NULLIFY();
        }
        else if(ident.POINTER())
        {
            item = ident.POINTER();
        }
        else if(ident.IMPLICIT())
        {
            item = ident.IMPLICIT();
        }
        else if(ident.NONE())
        {
            item = ident.NONE();
        }
        else if(ident.NAMELIST())
        {
            item = ident.NAMELIST();
        }
        else if(ident.PARAMETER())
        {
            item = ident.PARAMETER();
        }
        else if(ident.ALLOCATABLE())
        {
            item = ident.ALLOCATABLE();
        }
        else if(ident.INTENT())
        {
            item = ident.INTENT();
        }
        else if(ident.OPTIONAL())
        {
            item = ident.OPTIONAL();
        }
        else if(ident.EXTERNAL())
        {
            item = ident.EXTERNAL();
        }
        else if(ident.INTRINSIC())
        {
            item = ident.INTRINSIC();
        }
        else if(ident.INTERFACE())
        {
            item = ident.INTERFACE();
        }
        else if(ident.SAVE())
        {
            item = ident.SAVE();
        }
        else if(ident.TARGET())
        {
            item = ident.TARGET();
        }
        else if(ident.DATA())
        {
            item = ident.DATA();
        }
        else if(ident.ASSIGN())
        {
            item = ident.ASSIGN();
        }
        else if(ident.CYCLE())
        {
            item = ident.CYCLE();
        }
        else if(ident.EXIT())
        {
            item = ident.EXIT();
        }
        else if(ident.FORMAT())
        {
            item = ident.FORMAT();
        }
        else if(ident.CONTAINS())
        {
            item = ident.CONTAINS();
        }
        else if(ident.RESULT())
        {
            item = ident.RESULT();
        }
        else if(ident.RECURSIVE())
        {
            item = ident.RECURSIVE();
        }
        else if(ident.INQUIRE())
        {
            item = ident.INQUIRE();
        }
        else if(ident.BACKSPACE())
        {
            item = ident.BACKSPACE();
        }
        else if(ident.ENDFILE())
        {
            item = ident.ENDFILE();
        }
        else if(ident.REWIND())
        {
            item = ident.REWIND();
        }
        else if(ident.DESCR())
        {
            item = ident.DESCR();
        }
        else if(ident.REF())
        {
            item = ident.REF();
        }
        else if(ident.VAL())
        {
            item = ident.VAL();
        }
        else if(ident.LOC())
        {
            item = ident.LOC();
        }
    }

    return item;
}