// Generated from src/vms_fortran/parser/FortranParser.g4 by ANTLR 4.7.3-SNAPSHOT


import { ParseTreeListener } from "antlr4ts/tree/ParseTreeListener";

import { ProgramContext } from "./FortranParser";
import { ProgramUnitContext } from "./FortranParser";
import { OptionsStatementContext } from "./FortranParser";
import { MainProgramContext } from "./FortranParser";
import { MainRangeContext } from "./FortranParser";
import { BodyConstructContext } from "./FortranParser";
import { BodyContext } from "./FortranParser";
import { SpecificationPartConstructContext } from "./FortranParser";
import { DeclarationConstructContext } from "./FortranParser";
import { ExecutionPartConstructContext } from "./FortranParser";
import { SpecificationStatementContext } from "./FortranParser";
import { InternalSubprogramContext } from "./FortranParser";
import { InternalSubprogramPartContext } from "./FortranParser";
import { ExecutableConstructContext } from "./FortranParser";
import { ActionStatementContext } from "./FortranParser";
import { DefinedOperatorContext } from "./FortranParser";
import { EosContext } from "./FortranParser";
import { IntConstContext } from "./FortranParser";
import { LabelContext } from "./FortranParser";
import { IdentifierContext } from "./FortranParser";
import { FormatStatementContext } from "./FortranParser";
import { FormatItemListContext } from "./FortranParser";
import { FormatItemContext } from "./FortranParser";
import { FormatEditContext } from "./FortranParser";
import { EditElementContext } from "./FortranParser";
import { MislexedFconContext } from "./FortranParser";
import { FormatsepContext } from "./FortranParser";
import { ProgramStatementContext } from "./FortranParser";
import { EndProgramStatementContext } from "./FortranParser";
import { ModuleBlockContext } from "./FortranParser";
import { ModuleBodyContext } from "./FortranParser";
import { ModuleStatementContext } from "./FortranParser";
import { NameContext } from "./FortranParser";
import { LetterNameContext } from "./FortranParser";
import { ArrayNameContext } from "./FortranParser";
import { ComponentNameContext } from "./FortranParser";
import { GenericNameContext } from "./FortranParser";
import { NamelistGroupNameContext } from "./FortranParser";
import { TypeNameContext } from "./FortranParser";
import { EndNameContext } from "./FortranParser";
import { CommonBlockNameContext } from "./FortranParser";
import { DummyArgNameContext } from "./FortranParser";
import { EntryNameContext } from "./FortranParser";
import { ExternalNameContext } from "./FortranParser";
import { FunctionNameContext } from "./FortranParser";
import { ImpliedDoVariableContext } from "./FortranParser";
import { IntrinsicProcedureNameContext } from "./FortranParser";
import { ObjectNameContext } from "./FortranParser";
import { ProgramNameContext } from "./FortranParser";
import { SFDummyArgNameContext } from "./FortranParser";
import { SubroutineNameContext } from "./FortranParser";
import { SubroutineNameUseContext } from "./FortranParser";
import { ProcedureNameContext } from "./FortranParser";
import { VariableNameContext } from "./FortranParser";
import { ModuleNameContext } from "./FortranParser";
import { UseNameContext } from "./FortranParser";
import { BlockDataNameContext } from "./FortranParser";
import { NamedConstantContext } from "./FortranParser";
import { NamedConstantUseContext } from "./FortranParser";
import { IfConstructNameContext } from "./FortranParser";
import { EndModuleStatementContext } from "./FortranParser";
import { IncludeStatementContext } from "./FortranParser";
import { DictionaryStatementContext } from "./FortranParser";
import { UseStatementContext } from "./FortranParser";
import { RenameListContext } from "./FortranParser";
import { OnlyListContext } from "./FortranParser";
import { RenameContext } from "./FortranParser";
import { OnlyContext } from "./FortranParser";
import { BlockDataSubprogramBlockContext } from "./FortranParser";
import { BlockDataBodyContext } from "./FortranParser";
import { BlockDataBodyConstructContext } from "./FortranParser";
import { BlockDataStatementContext } from "./FortranParser";
import { EndBlockDataStatementContext } from "./FortranParser";
import { InterfaceBlockContext } from "./FortranParser";
import { InterfaceBlockPartContext } from "./FortranParser";
import { InterfaceStatementContext } from "./FortranParser";
import { EndInterfaceStatementContext } from "./FortranParser";
import { InterfaceBodyContext } from "./FortranParser";
import { FunctionInterfaceRangeContext } from "./FortranParser";
import { SubroutineInterfaceRangeContext } from "./FortranParser";
import { SubprogramInterfaceBodyContext } from "./FortranParser";
import { StructureBlockContext } from "./FortranParser";
import { StructureBlockPartContext } from "./FortranParser";
import { StructureStatementContext } from "./FortranParser";
import { TypeStatementNameContext } from "./FortranParser";
import { EndStructureStatementContext } from "./FortranParser";
import { StructureBodyContext } from "./FortranParser";
import { RecordBlockContext } from "./FortranParser";
import { RecordStatementContext } from "./FortranParser";
import { UnionBlockContext } from "./FortranParser";
import { UnionStatementContext } from "./FortranParser";
import { UnionBlockPartContext } from "./FortranParser";
import { EndUnionStatementContext } from "./FortranParser";
import { MapBlockContext } from "./FortranParser";
import { MapStatementContext } from "./FortranParser";
import { MapBlockPartContext } from "./FortranParser";
import { EndMapStatementContext } from "./FortranParser";
import { ModuleProcedureStatementContext } from "./FortranParser";
import { ProcedureNameListContext } from "./FortranParser";
import { GenericSpecContext } from "./FortranParser";
import { ExternalStatementContext } from "./FortranParser";
import { IntrinsicStatementContext } from "./FortranParser";
import { FunctionReferenceContext } from "./FortranParser";
import { CallStatementContext } from "./FortranParser";
import { ActualArgContext } from "./FortranParser";
import { FunctionArgListContext } from "./FortranParser";
import { FunctionArgContext } from "./FortranParser";
import { FunctionSubprogramContext } from "./FortranParser";
import { FunctionDeclarationContext } from "./FortranParser";
import { FunctionBodyContext } from "./FortranParser";
import { FunctionPrefixContext } from "./FortranParser";
import { EndFunctionStatementContext } from "./FortranParser";
import { SubroutineSubprogramContext } from "./FortranParser";
import { SubroutineDeclarationContext } from "./FortranParser";
import { SubroutineBodyContext } from "./FortranParser";
import { SubroutineStatementContext } from "./FortranParser";
import { SubroutineParListContext } from "./FortranParser";
import { SubroutineParContext } from "./FortranParser";
import { FunctionParListContext } from "./FortranParser";
import { FunctionParContext } from "./FortranParser";
import { EndSubroutineStatementContext } from "./FortranParser";
import { EntryStatementContext } from "./FortranParser";
import { ReturnStatementContext } from "./FortranParser";
import { ContainsStatementContext } from "./FortranParser";
import { StmtFunctionStatementContext } from "./FortranParser";
import { SFDummyArgNameListContext } from "./FortranParser";
import { UnsignedArithmeticConstantContext } from "./FortranParser";
import { KindParamContext } from "./FortranParser";
import { ConstantContext } from "./FortranParser";
import { BozLiteralConstantContext } from "./FortranParser";
import { LogicalConstantContext } from "./FortranParser";
import { DerivedTypeDefContext } from "./FortranParser";
import { DerivedTypeBodyContext } from "./FortranParser";
import { PrivateSequenceStatementContext } from "./FortranParser";
import { DerivedTypeStatementContext } from "./FortranParser";
import { EndTypeStatementContext } from "./FortranParser";
import { ComponentDefStatementContext } from "./FortranParser";
import { ComponentAttrSpecListContext } from "./FortranParser";
import { ComponentAttrSpecContext } from "./FortranParser";
import { ComponentArraySpecContext } from "./FortranParser";
import { ComponentDeclContext } from "./FortranParser";
import { ComponentDeclListContext } from "./FortranParser";
import { StructureConstructorContext } from "./FortranParser";
import { ArrayConstructorContext } from "./FortranParser";
import { AcValueContext } from "./FortranParser";
import { AcValueListContext } from "./FortranParser";
import { AcImpliedDoContext } from "./FortranParser";
import { TypeDeclarationStatementContext } from "./FortranParser";
import { TypeSpecContext } from "./FortranParser";
import { AttrSpecContext } from "./FortranParser";
import { EntityDeclContext } from "./FortranParser";
import { KindSelectorContext } from "./FortranParser";
import { CharSelectorContext } from "./FortranParser";
import { LengthSelectorContext } from "./FortranParser";
import { CharLengthContext } from "./FortranParser";
import { TypeParamValueContext } from "./FortranParser";
import { AccessSpecContext } from "./FortranParser";
import { IntentSpecContext } from "./FortranParser";
import { ArraySpecContext } from "./FortranParser";
import { ExplicitShapeSpecListContext } from "./FortranParser";
import { ExplicitShapeSpecContext } from "./FortranParser";
import { LowerBoundContext } from "./FortranParser";
import { UpperBoundContext } from "./FortranParser";
import { AssumedShapeSpecContext } from "./FortranParser";
import { AssumedShapeSpecListContext } from "./FortranParser";
import { DeferredShapeSpecListContext } from "./FortranParser";
import { DeferredShapeSpecContext } from "./FortranParser";
import { AssumedSizeSpecContext } from "./FortranParser";
import { IntentStatementContext } from "./FortranParser";
import { IntentParListContext } from "./FortranParser";
import { IntentParContext } from "./FortranParser";
import { OptionalStatementContext } from "./FortranParser";
import { OptionalParListContext } from "./FortranParser";
import { OptionalParContext } from "./FortranParser";
import { AccessStatementContext } from "./FortranParser";
import { AccessIdListContext } from "./FortranParser";
import { AccessIdContext } from "./FortranParser";
import { SaveStatementContext } from "./FortranParser";
import { SavedEntityListContext } from "./FortranParser";
import { SavedEntityContext } from "./FortranParser";
import { DimensionStatementContext } from "./FortranParser";
import { ArrayDeclaratorListContext } from "./FortranParser";
import { ArrayDeclaratorContext } from "./FortranParser";
import { AllocatableStatementContext } from "./FortranParser";
import { ArrayAllocationListContext } from "./FortranParser";
import { ArrayAllocationContext } from "./FortranParser";
import { PointerStatementContext } from "./FortranParser";
import { PointerStatementObjectListContext } from "./FortranParser";
import { PointerStatementObjectContext } from "./FortranParser";
import { TargetStatementContext } from "./FortranParser";
import { TargetObjectListContext } from "./FortranParser";
import { TargetObjectContext } from "./FortranParser";
import { DataStatementContext } from "./FortranParser";
import { DatalistContext } from "./FortranParser";
import { DataStatementSetContext } from "./FortranParser";
import { DataStatementObjectListContext } from "./FortranParser";
import { DataStatementObjectContext } from "./FortranParser";
import { DataStatementValueListContext } from "./FortranParser";
import { DataStatementValueContext } from "./FortranParser";
import { DataImpliedDoContext } from "./FortranParser";
import { DataIDoObjectListContext } from "./FortranParser";
import { DataIDoObjectContext } from "./FortranParser";
import { ParameterStatementContext } from "./FortranParser";
import { NamedConstantDefListContext } from "./FortranParser";
import { NamedConstantDefContext } from "./FortranParser";
import { ImplicitStatementContext } from "./FortranParser";
import { ImplicitBodyContext } from "./FortranParser";
import { ImplicitSpecContext } from "./FortranParser";
import { LetterSpecContext } from "./FortranParser";
import { NamelistStatementContext } from "./FortranParser";
import { NamelistGroupContext } from "./FortranParser";
import { NamelistGroupObjectContext } from "./FortranParser";
import { EquivalenceStatementContext } from "./FortranParser";
import { EquivalenceSetListContext } from "./FortranParser";
import { EquivalenceSetContext } from "./FortranParser";
import { EquivalenceObjectContext } from "./FortranParser";
import { CommonStatementContext } from "./FortranParser";
import { ComblockContext } from "./FortranParser";
import { CommonBlockObjectContext } from "./FortranParser";
import { CommonBlockObjectListContext } from "./FortranParser";
import { ScalarVariableContext } from "./FortranParser";
import { VariableContext } from "./FortranParser";
import { SubscriptContext } from "./FortranParser";
import { DataRefContext } from "./FortranParser";
import { SectionSubscriptListContext } from "./FortranParser";
import { SectionSubscriptContext } from "./FortranParser";
import { SubstringRangeContext } from "./FortranParser";
import { StructureComponentContext } from "./FortranParser";
import { FieldSelectorContext } from "./FortranParser";
import { ArrayElementContext } from "./FortranParser";
import { SubscriptTripletContext } from "./FortranParser";
import { AllocateStatementContext } from "./FortranParser";
import { AllocationListContext } from "./FortranParser";
import { AllocationContext } from "./FortranParser";
import { AllocatedShapeContext } from "./FortranParser";
import { AllocateObjectListContext } from "./FortranParser";
import { AllocateObjectContext } from "./FortranParser";
import { AllocateShapeSpecContext } from "./FortranParser";
import { NullifyStatementContext } from "./FortranParser";
import { PointerObjectListContext } from "./FortranParser";
import { PointerObjectContext } from "./FortranParser";
import { PointerFieldContext } from "./FortranParser";
import { DeallocateStatementContext } from "./FortranParser";
import { UFExprContext } from "./FortranParser";
import { UFTermContext } from "./FortranParser";
import { UFFactorContext } from "./FortranParser";
import { UFPrimaryContext } from "./FortranParser";
import { CExprContext } from "./FortranParser";
import { CPrimaryContext } from "./FortranParser";
import { COperandContext } from "./FortranParser";
import { ComplexConstContext } from "./FortranParser";
import { PrimaryContext } from "./FortranParser";
import { Level1ExprContext } from "./FortranParser";
import { MultOperandContext } from "./FortranParser";
import { AddOperandContext } from "./FortranParser";
import { Level2ExprContext } from "./FortranParser";
import { PowerOpContext } from "./FortranParser";
import { MultOpContext } from "./FortranParser";
import { AddOpContext } from "./FortranParser";
import { SignContext } from "./FortranParser";
import { Level3ExprContext } from "./FortranParser";
import { ConcatOpContext } from "./FortranParser";
import { Level4ExprContext } from "./FortranParser";
import { RelOpContext } from "./FortranParser";
import { AndOperandContext } from "./FortranParser";
import { OrOperandContext } from "./FortranParser";
import { EquivOperandContext } from "./FortranParser";
import { Level5ExprContext } from "./FortranParser";
import { NotOpContext } from "./FortranParser";
import { AndOpContext } from "./FortranParser";
import { OrOpContext } from "./FortranParser";
import { EquivOpContext } from "./FortranParser";
import { ExprContext } from "./FortranParser";
import { SpecificationExprContext } from "./FortranParser";
import { AssignmentStatementContext } from "./FortranParser";
import { SFExprListContext } from "./FortranParser";
import { SFExprContext } from "./FortranParser";
import { SFTermContext } from "./FortranParser";
import { SFFactorContext } from "./FortranParser";
import { SFPrimaryContext } from "./FortranParser";
import { PointerAssignmentStatementContext } from "./FortranParser";
import { PointerAssignmentItemContext } from "./FortranParser";
import { TargetContext } from "./FortranParser";
import { WhereStatementContext } from "./FortranParser";
import { WhereConstructContext } from "./FortranParser";
import { WhereConstructStatementContext } from "./FortranParser";
import { MaskExprContext } from "./FortranParser";
import { ElsewhereStatementContext } from "./FortranParser";
import { EndWhereStatementContext } from "./FortranParser";
import { IfConstructContext } from "./FortranParser";
import { IfThenStatementContext } from "./FortranParser";
import { ElseIfStatementContext } from "./FortranParser";
import { ElseStatementContext } from "./FortranParser";
import { EndIfStatementContext } from "./FortranParser";
import { IfStatementContext } from "./FortranParser";
import { ScalarLogicalExprContext } from "./FortranParser";
import { CaseConstructContext } from "./FortranParser";
import { SelectCaseRangeContext } from "./FortranParser";
import { SelectCaseBodyContext } from "./FortranParser";
import { CaseBodyConstructContext } from "./FortranParser";
import { CaseStatementContext } from "./FortranParser";
import { EndSelectStatementContext } from "./FortranParser";
import { CaseSelectorContext } from "./FortranParser";
import { CaseValueRangeContext } from "./FortranParser";
import { DoConstructContext } from "./FortranParser";
import { BlockDoConstructContext } from "./FortranParser";
import { LabelDoStatementContext } from "./FortranParser";
import { LoopControlContext } from "./FortranParser";
import { Int_Real_Dp_ExpressionContext } from "./FortranParser";
import { EndDoStatementContext } from "./FortranParser";
import { ExecSqlStatementContext } from "./FortranParser";
import { CycleStatementContext } from "./FortranParser";
import { ExitStatementContext } from "./FortranParser";
import { GoToKwContext } from "./FortranParser";
import { GotoStatementContext } from "./FortranParser";
import { ComputedGotoStatementContext } from "./FortranParser";
import { LblRefContext } from "./FortranParser";
import { ScalarIntExprContext } from "./FortranParser";
import { AssignStatementContext } from "./FortranParser";
import { AssignedGotoStatementContext } from "./FortranParser";
import { ArithmeticIfStatementContext } from "./FortranParser";
import { ScalarNumericExprContext } from "./FortranParser";
import { ContinueStatementContext } from "./FortranParser";
import { StopStatementContext } from "./FortranParser";
import { PauseStatementContext } from "./FortranParser";
import { UnitIdentifierContext } from "./FortranParser";
import { OpenStatementContext } from "./FortranParser";
import { ConnectSpecListContext } from "./FortranParser";
import { ConnectSpecContext } from "./FortranParser";
import { CloseStatementContext } from "./FortranParser";
import { CloseSpecListContext } from "./FortranParser";
import { CloseSpecContext } from "./FortranParser";
import { ReadStatementContext } from "./FortranParser";
import { WriteStatementContext } from "./FortranParser";
import { PrintStatementContext } from "./FortranParser";
import { IoControlSpecContext } from "./FortranParser";
import { IoControlSpecListContext } from "./FortranParser";
import { RdCtlSpecContext } from "./FortranParser";
import { RdUnitIdContext } from "./FortranParser";
import { RdIoCtlSpecListContext } from "./FortranParser";
import { RdFmtIdContext } from "./FortranParser";
import { RdFmtIdExprContext } from "./FortranParser";
import { FormatIdentifierContext } from "./FortranParser";
import { InputItemContext } from "./FortranParser";
import { InputItemListContext } from "./FortranParser";
import { OutputItemContext } from "./FortranParser";
import { OutputItemListContext } from "./FortranParser";
import { InputImpliedDoContext } from "./FortranParser";
import { OutputImpliedDoContext } from "./FortranParser";
import { BackspaceStatementContext } from "./FortranParser";
import { EndfileStatementContext } from "./FortranParser";
import { RewindStatementContext } from "./FortranParser";
import { DeleteStatementContext } from "./FortranParser";
import { PositionSpecContext } from "./FortranParser";
import { DeleteSpecContext } from "./FortranParser";
import { InquireStatementContext } from "./FortranParser";
import { InquireSpecContext } from "./FortranParser";
import { InquireSpecListContext } from "./FortranParser";


/**
 * This interface defines a complete listener for a parse tree produced by
 * `FortranParser`.
 */
export interface FortranParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by `FortranParser.program`.
	 * @param ctx the parse tree
	 */
	enterProgram?: (ctx: ProgramContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.program`.
	 * @param ctx the parse tree
	 */
	exitProgram?: (ctx: ProgramContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.programUnit`.
	 * @param ctx the parse tree
	 */
	enterProgramUnit?: (ctx: ProgramUnitContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.programUnit`.
	 * @param ctx the parse tree
	 */
	exitProgramUnit?: (ctx: ProgramUnitContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.optionsStatement`.
	 * @param ctx the parse tree
	 */
	enterOptionsStatement?: (ctx: OptionsStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.optionsStatement`.
	 * @param ctx the parse tree
	 */
	exitOptionsStatement?: (ctx: OptionsStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.mainProgram`.
	 * @param ctx the parse tree
	 */
	enterMainProgram?: (ctx: MainProgramContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.mainProgram`.
	 * @param ctx the parse tree
	 */
	exitMainProgram?: (ctx: MainProgramContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.mainRange`.
	 * @param ctx the parse tree
	 */
	enterMainRange?: (ctx: MainRangeContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.mainRange`.
	 * @param ctx the parse tree
	 */
	exitMainRange?: (ctx: MainRangeContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.bodyConstruct`.
	 * @param ctx the parse tree
	 */
	enterBodyConstruct?: (ctx: BodyConstructContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.bodyConstruct`.
	 * @param ctx the parse tree
	 */
	exitBodyConstruct?: (ctx: BodyConstructContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.body`.
	 * @param ctx the parse tree
	 */
	enterBody?: (ctx: BodyContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.body`.
	 * @param ctx the parse tree
	 */
	exitBody?: (ctx: BodyContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.specificationPartConstruct`.
	 * @param ctx the parse tree
	 */
	enterSpecificationPartConstruct?: (ctx: SpecificationPartConstructContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.specificationPartConstruct`.
	 * @param ctx the parse tree
	 */
	exitSpecificationPartConstruct?: (ctx: SpecificationPartConstructContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.declarationConstruct`.
	 * @param ctx the parse tree
	 */
	enterDeclarationConstruct?: (ctx: DeclarationConstructContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.declarationConstruct`.
	 * @param ctx the parse tree
	 */
	exitDeclarationConstruct?: (ctx: DeclarationConstructContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.executionPartConstruct`.
	 * @param ctx the parse tree
	 */
	enterExecutionPartConstruct?: (ctx: ExecutionPartConstructContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.executionPartConstruct`.
	 * @param ctx the parse tree
	 */
	exitExecutionPartConstruct?: (ctx: ExecutionPartConstructContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.specificationStatement`.
	 * @param ctx the parse tree
	 */
	enterSpecificationStatement?: (ctx: SpecificationStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.specificationStatement`.
	 * @param ctx the parse tree
	 */
	exitSpecificationStatement?: (ctx: SpecificationStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.internalSubprogram`.
	 * @param ctx the parse tree
	 */
	enterInternalSubprogram?: (ctx: InternalSubprogramContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.internalSubprogram`.
	 * @param ctx the parse tree
	 */
	exitInternalSubprogram?: (ctx: InternalSubprogramContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.internalSubprogramPart`.
	 * @param ctx the parse tree
	 */
	enterInternalSubprogramPart?: (ctx: InternalSubprogramPartContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.internalSubprogramPart`.
	 * @param ctx the parse tree
	 */
	exitInternalSubprogramPart?: (ctx: InternalSubprogramPartContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.executableConstruct`.
	 * @param ctx the parse tree
	 */
	enterExecutableConstruct?: (ctx: ExecutableConstructContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.executableConstruct`.
	 * @param ctx the parse tree
	 */
	exitExecutableConstruct?: (ctx: ExecutableConstructContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.actionStatement`.
	 * @param ctx the parse tree
	 */
	enterActionStatement?: (ctx: ActionStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.actionStatement`.
	 * @param ctx the parse tree
	 */
	exitActionStatement?: (ctx: ActionStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.definedOperator`.
	 * @param ctx the parse tree
	 */
	enterDefinedOperator?: (ctx: DefinedOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.definedOperator`.
	 * @param ctx the parse tree
	 */
	exitDefinedOperator?: (ctx: DefinedOperatorContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.eos`.
	 * @param ctx the parse tree
	 */
	enterEos?: (ctx: EosContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.eos`.
	 * @param ctx the parse tree
	 */
	exitEos?: (ctx: EosContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.intConst`.
	 * @param ctx the parse tree
	 */
	enterIntConst?: (ctx: IntConstContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.intConst`.
	 * @param ctx the parse tree
	 */
	exitIntConst?: (ctx: IntConstContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.label`.
	 * @param ctx the parse tree
	 */
	enterLabel?: (ctx: LabelContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.label`.
	 * @param ctx the parse tree
	 */
	exitLabel?: (ctx: LabelContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.identifier`.
	 * @param ctx the parse tree
	 */
	enterIdentifier?: (ctx: IdentifierContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.identifier`.
	 * @param ctx the parse tree
	 */
	exitIdentifier?: (ctx: IdentifierContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.formatStatement`.
	 * @param ctx the parse tree
	 */
	enterFormatStatement?: (ctx: FormatStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.formatStatement`.
	 * @param ctx the parse tree
	 */
	exitFormatStatement?: (ctx: FormatStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.formatItemList`.
	 * @param ctx the parse tree
	 */
	enterFormatItemList?: (ctx: FormatItemListContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.formatItemList`.
	 * @param ctx the parse tree
	 */
	exitFormatItemList?: (ctx: FormatItemListContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.formatItem`.
	 * @param ctx the parse tree
	 */
	enterFormatItem?: (ctx: FormatItemContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.formatItem`.
	 * @param ctx the parse tree
	 */
	exitFormatItem?: (ctx: FormatItemContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.formatEdit`.
	 * @param ctx the parse tree
	 */
	enterFormatEdit?: (ctx: FormatEditContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.formatEdit`.
	 * @param ctx the parse tree
	 */
	exitFormatEdit?: (ctx: FormatEditContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.editElement`.
	 * @param ctx the parse tree
	 */
	enterEditElement?: (ctx: EditElementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.editElement`.
	 * @param ctx the parse tree
	 */
	exitEditElement?: (ctx: EditElementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.mislexedFcon`.
	 * @param ctx the parse tree
	 */
	enterMislexedFcon?: (ctx: MislexedFconContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.mislexedFcon`.
	 * @param ctx the parse tree
	 */
	exitMislexedFcon?: (ctx: MislexedFconContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.formatsep`.
	 * @param ctx the parse tree
	 */
	enterFormatsep?: (ctx: FormatsepContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.formatsep`.
	 * @param ctx the parse tree
	 */
	exitFormatsep?: (ctx: FormatsepContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.programStatement`.
	 * @param ctx the parse tree
	 */
	enterProgramStatement?: (ctx: ProgramStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.programStatement`.
	 * @param ctx the parse tree
	 */
	exitProgramStatement?: (ctx: ProgramStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.endProgramStatement`.
	 * @param ctx the parse tree
	 */
	enterEndProgramStatement?: (ctx: EndProgramStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.endProgramStatement`.
	 * @param ctx the parse tree
	 */
	exitEndProgramStatement?: (ctx: EndProgramStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.moduleBlock`.
	 * @param ctx the parse tree
	 */
	enterModuleBlock?: (ctx: ModuleBlockContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.moduleBlock`.
	 * @param ctx the parse tree
	 */
	exitModuleBlock?: (ctx: ModuleBlockContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.moduleBody`.
	 * @param ctx the parse tree
	 */
	enterModuleBody?: (ctx: ModuleBodyContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.moduleBody`.
	 * @param ctx the parse tree
	 */
	exitModuleBody?: (ctx: ModuleBodyContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.moduleStatement`.
	 * @param ctx the parse tree
	 */
	enterModuleStatement?: (ctx: ModuleStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.moduleStatement`.
	 * @param ctx the parse tree
	 */
	exitModuleStatement?: (ctx: ModuleStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.name`.
	 * @param ctx the parse tree
	 */
	enterName?: (ctx: NameContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.name`.
	 * @param ctx the parse tree
	 */
	exitName?: (ctx: NameContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.letterName`.
	 * @param ctx the parse tree
	 */
	enterLetterName?: (ctx: LetterNameContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.letterName`.
	 * @param ctx the parse tree
	 */
	exitLetterName?: (ctx: LetterNameContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.arrayName`.
	 * @param ctx the parse tree
	 */
	enterArrayName?: (ctx: ArrayNameContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.arrayName`.
	 * @param ctx the parse tree
	 */
	exitArrayName?: (ctx: ArrayNameContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.componentName`.
	 * @param ctx the parse tree
	 */
	enterComponentName?: (ctx: ComponentNameContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.componentName`.
	 * @param ctx the parse tree
	 */
	exitComponentName?: (ctx: ComponentNameContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.genericName`.
	 * @param ctx the parse tree
	 */
	enterGenericName?: (ctx: GenericNameContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.genericName`.
	 * @param ctx the parse tree
	 */
	exitGenericName?: (ctx: GenericNameContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.namelistGroupName`.
	 * @param ctx the parse tree
	 */
	enterNamelistGroupName?: (ctx: NamelistGroupNameContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.namelistGroupName`.
	 * @param ctx the parse tree
	 */
	exitNamelistGroupName?: (ctx: NamelistGroupNameContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.typeName`.
	 * @param ctx the parse tree
	 */
	enterTypeName?: (ctx: TypeNameContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.typeName`.
	 * @param ctx the parse tree
	 */
	exitTypeName?: (ctx: TypeNameContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.endName`.
	 * @param ctx the parse tree
	 */
	enterEndName?: (ctx: EndNameContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.endName`.
	 * @param ctx the parse tree
	 */
	exitEndName?: (ctx: EndNameContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.commonBlockName`.
	 * @param ctx the parse tree
	 */
	enterCommonBlockName?: (ctx: CommonBlockNameContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.commonBlockName`.
	 * @param ctx the parse tree
	 */
	exitCommonBlockName?: (ctx: CommonBlockNameContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.dummyArgName`.
	 * @param ctx the parse tree
	 */
	enterDummyArgName?: (ctx: DummyArgNameContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.dummyArgName`.
	 * @param ctx the parse tree
	 */
	exitDummyArgName?: (ctx: DummyArgNameContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.entryName`.
	 * @param ctx the parse tree
	 */
	enterEntryName?: (ctx: EntryNameContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.entryName`.
	 * @param ctx the parse tree
	 */
	exitEntryName?: (ctx: EntryNameContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.externalName`.
	 * @param ctx the parse tree
	 */
	enterExternalName?: (ctx: ExternalNameContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.externalName`.
	 * @param ctx the parse tree
	 */
	exitExternalName?: (ctx: ExternalNameContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.functionName`.
	 * @param ctx the parse tree
	 */
	enterFunctionName?: (ctx: FunctionNameContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.functionName`.
	 * @param ctx the parse tree
	 */
	exitFunctionName?: (ctx: FunctionNameContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.impliedDoVariable`.
	 * @param ctx the parse tree
	 */
	enterImpliedDoVariable?: (ctx: ImpliedDoVariableContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.impliedDoVariable`.
	 * @param ctx the parse tree
	 */
	exitImpliedDoVariable?: (ctx: ImpliedDoVariableContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.intrinsicProcedureName`.
	 * @param ctx the parse tree
	 */
	enterIntrinsicProcedureName?: (ctx: IntrinsicProcedureNameContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.intrinsicProcedureName`.
	 * @param ctx the parse tree
	 */
	exitIntrinsicProcedureName?: (ctx: IntrinsicProcedureNameContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.objectName`.
	 * @param ctx the parse tree
	 */
	enterObjectName?: (ctx: ObjectNameContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.objectName`.
	 * @param ctx the parse tree
	 */
	exitObjectName?: (ctx: ObjectNameContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.programName`.
	 * @param ctx the parse tree
	 */
	enterProgramName?: (ctx: ProgramNameContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.programName`.
	 * @param ctx the parse tree
	 */
	exitProgramName?: (ctx: ProgramNameContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.sFDummyArgName`.
	 * @param ctx the parse tree
	 */
	enterSFDummyArgName?: (ctx: SFDummyArgNameContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.sFDummyArgName`.
	 * @param ctx the parse tree
	 */
	exitSFDummyArgName?: (ctx: SFDummyArgNameContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.subroutineName`.
	 * @param ctx the parse tree
	 */
	enterSubroutineName?: (ctx: SubroutineNameContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.subroutineName`.
	 * @param ctx the parse tree
	 */
	exitSubroutineName?: (ctx: SubroutineNameContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.subroutineNameUse`.
	 * @param ctx the parse tree
	 */
	enterSubroutineNameUse?: (ctx: SubroutineNameUseContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.subroutineNameUse`.
	 * @param ctx the parse tree
	 */
	exitSubroutineNameUse?: (ctx: SubroutineNameUseContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.procedureName`.
	 * @param ctx the parse tree
	 */
	enterProcedureName?: (ctx: ProcedureNameContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.procedureName`.
	 * @param ctx the parse tree
	 */
	exitProcedureName?: (ctx: ProcedureNameContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.variableName`.
	 * @param ctx the parse tree
	 */
	enterVariableName?: (ctx: VariableNameContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.variableName`.
	 * @param ctx the parse tree
	 */
	exitVariableName?: (ctx: VariableNameContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.moduleName`.
	 * @param ctx the parse tree
	 */
	enterModuleName?: (ctx: ModuleNameContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.moduleName`.
	 * @param ctx the parse tree
	 */
	exitModuleName?: (ctx: ModuleNameContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.useName`.
	 * @param ctx the parse tree
	 */
	enterUseName?: (ctx: UseNameContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.useName`.
	 * @param ctx the parse tree
	 */
	exitUseName?: (ctx: UseNameContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.blockDataName`.
	 * @param ctx the parse tree
	 */
	enterBlockDataName?: (ctx: BlockDataNameContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.blockDataName`.
	 * @param ctx the parse tree
	 */
	exitBlockDataName?: (ctx: BlockDataNameContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.namedConstant`.
	 * @param ctx the parse tree
	 */
	enterNamedConstant?: (ctx: NamedConstantContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.namedConstant`.
	 * @param ctx the parse tree
	 */
	exitNamedConstant?: (ctx: NamedConstantContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.namedConstantUse`.
	 * @param ctx the parse tree
	 */
	enterNamedConstantUse?: (ctx: NamedConstantUseContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.namedConstantUse`.
	 * @param ctx the parse tree
	 */
	exitNamedConstantUse?: (ctx: NamedConstantUseContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.ifConstructName`.
	 * @param ctx the parse tree
	 */
	enterIfConstructName?: (ctx: IfConstructNameContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.ifConstructName`.
	 * @param ctx the parse tree
	 */
	exitIfConstructName?: (ctx: IfConstructNameContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.endModuleStatement`.
	 * @param ctx the parse tree
	 */
	enterEndModuleStatement?: (ctx: EndModuleStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.endModuleStatement`.
	 * @param ctx the parse tree
	 */
	exitEndModuleStatement?: (ctx: EndModuleStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.includeStatement`.
	 * @param ctx the parse tree
	 */
	enterIncludeStatement?: (ctx: IncludeStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.includeStatement`.
	 * @param ctx the parse tree
	 */
	exitIncludeStatement?: (ctx: IncludeStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.dictionaryStatement`.
	 * @param ctx the parse tree
	 */
	enterDictionaryStatement?: (ctx: DictionaryStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.dictionaryStatement`.
	 * @param ctx the parse tree
	 */
	exitDictionaryStatement?: (ctx: DictionaryStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.useStatement`.
	 * @param ctx the parse tree
	 */
	enterUseStatement?: (ctx: UseStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.useStatement`.
	 * @param ctx the parse tree
	 */
	exitUseStatement?: (ctx: UseStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.renameList`.
	 * @param ctx the parse tree
	 */
	enterRenameList?: (ctx: RenameListContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.renameList`.
	 * @param ctx the parse tree
	 */
	exitRenameList?: (ctx: RenameListContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.onlyList`.
	 * @param ctx the parse tree
	 */
	enterOnlyList?: (ctx: OnlyListContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.onlyList`.
	 * @param ctx the parse tree
	 */
	exitOnlyList?: (ctx: OnlyListContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.rename`.
	 * @param ctx the parse tree
	 */
	enterRename?: (ctx: RenameContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.rename`.
	 * @param ctx the parse tree
	 */
	exitRename?: (ctx: RenameContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.only`.
	 * @param ctx the parse tree
	 */
	enterOnly?: (ctx: OnlyContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.only`.
	 * @param ctx the parse tree
	 */
	exitOnly?: (ctx: OnlyContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.blockDataSubprogramBlock`.
	 * @param ctx the parse tree
	 */
	enterBlockDataSubprogramBlock?: (ctx: BlockDataSubprogramBlockContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.blockDataSubprogramBlock`.
	 * @param ctx the parse tree
	 */
	exitBlockDataSubprogramBlock?: (ctx: BlockDataSubprogramBlockContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.blockDataBody`.
	 * @param ctx the parse tree
	 */
	enterBlockDataBody?: (ctx: BlockDataBodyContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.blockDataBody`.
	 * @param ctx the parse tree
	 */
	exitBlockDataBody?: (ctx: BlockDataBodyContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.blockDataBodyConstruct`.
	 * @param ctx the parse tree
	 */
	enterBlockDataBodyConstruct?: (ctx: BlockDataBodyConstructContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.blockDataBodyConstruct`.
	 * @param ctx the parse tree
	 */
	exitBlockDataBodyConstruct?: (ctx: BlockDataBodyConstructContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.blockDataStatement`.
	 * @param ctx the parse tree
	 */
	enterBlockDataStatement?: (ctx: BlockDataStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.blockDataStatement`.
	 * @param ctx the parse tree
	 */
	exitBlockDataStatement?: (ctx: BlockDataStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.endBlockDataStatement`.
	 * @param ctx the parse tree
	 */
	enterEndBlockDataStatement?: (ctx: EndBlockDataStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.endBlockDataStatement`.
	 * @param ctx the parse tree
	 */
	exitEndBlockDataStatement?: (ctx: EndBlockDataStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.interfaceBlock`.
	 * @param ctx the parse tree
	 */
	enterInterfaceBlock?: (ctx: InterfaceBlockContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.interfaceBlock`.
	 * @param ctx the parse tree
	 */
	exitInterfaceBlock?: (ctx: InterfaceBlockContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.interfaceBlockPart`.
	 * @param ctx the parse tree
	 */
	enterInterfaceBlockPart?: (ctx: InterfaceBlockPartContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.interfaceBlockPart`.
	 * @param ctx the parse tree
	 */
	exitInterfaceBlockPart?: (ctx: InterfaceBlockPartContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.interfaceStatement`.
	 * @param ctx the parse tree
	 */
	enterInterfaceStatement?: (ctx: InterfaceStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.interfaceStatement`.
	 * @param ctx the parse tree
	 */
	exitInterfaceStatement?: (ctx: InterfaceStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.endInterfaceStatement`.
	 * @param ctx the parse tree
	 */
	enterEndInterfaceStatement?: (ctx: EndInterfaceStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.endInterfaceStatement`.
	 * @param ctx the parse tree
	 */
	exitEndInterfaceStatement?: (ctx: EndInterfaceStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.interfaceBody`.
	 * @param ctx the parse tree
	 */
	enterInterfaceBody?: (ctx: InterfaceBodyContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.interfaceBody`.
	 * @param ctx the parse tree
	 */
	exitInterfaceBody?: (ctx: InterfaceBodyContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.functionInterfaceRange`.
	 * @param ctx the parse tree
	 */
	enterFunctionInterfaceRange?: (ctx: FunctionInterfaceRangeContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.functionInterfaceRange`.
	 * @param ctx the parse tree
	 */
	exitFunctionInterfaceRange?: (ctx: FunctionInterfaceRangeContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.subroutineInterfaceRange`.
	 * @param ctx the parse tree
	 */
	enterSubroutineInterfaceRange?: (ctx: SubroutineInterfaceRangeContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.subroutineInterfaceRange`.
	 * @param ctx the parse tree
	 */
	exitSubroutineInterfaceRange?: (ctx: SubroutineInterfaceRangeContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.subprogramInterfaceBody`.
	 * @param ctx the parse tree
	 */
	enterSubprogramInterfaceBody?: (ctx: SubprogramInterfaceBodyContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.subprogramInterfaceBody`.
	 * @param ctx the parse tree
	 */
	exitSubprogramInterfaceBody?: (ctx: SubprogramInterfaceBodyContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.structureBlock`.
	 * @param ctx the parse tree
	 */
	enterStructureBlock?: (ctx: StructureBlockContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.structureBlock`.
	 * @param ctx the parse tree
	 */
	exitStructureBlock?: (ctx: StructureBlockContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.structureBlockPart`.
	 * @param ctx the parse tree
	 */
	enterStructureBlockPart?: (ctx: StructureBlockPartContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.structureBlockPart`.
	 * @param ctx the parse tree
	 */
	exitStructureBlockPart?: (ctx: StructureBlockPartContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.structureStatement`.
	 * @param ctx the parse tree
	 */
	enterStructureStatement?: (ctx: StructureStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.structureStatement`.
	 * @param ctx the parse tree
	 */
	exitStructureStatement?: (ctx: StructureStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.typeStatementName`.
	 * @param ctx the parse tree
	 */
	enterTypeStatementName?: (ctx: TypeStatementNameContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.typeStatementName`.
	 * @param ctx the parse tree
	 */
	exitTypeStatementName?: (ctx: TypeStatementNameContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.endStructureStatement`.
	 * @param ctx the parse tree
	 */
	enterEndStructureStatement?: (ctx: EndStructureStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.endStructureStatement`.
	 * @param ctx the parse tree
	 */
	exitEndStructureStatement?: (ctx: EndStructureStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.structureBody`.
	 * @param ctx the parse tree
	 */
	enterStructureBody?: (ctx: StructureBodyContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.structureBody`.
	 * @param ctx the parse tree
	 */
	exitStructureBody?: (ctx: StructureBodyContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.recordBlock`.
	 * @param ctx the parse tree
	 */
	enterRecordBlock?: (ctx: RecordBlockContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.recordBlock`.
	 * @param ctx the parse tree
	 */
	exitRecordBlock?: (ctx: RecordBlockContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.recordStatement`.
	 * @param ctx the parse tree
	 */
	enterRecordStatement?: (ctx: RecordStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.recordStatement`.
	 * @param ctx the parse tree
	 */
	exitRecordStatement?: (ctx: RecordStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.unionBlock`.
	 * @param ctx the parse tree
	 */
	enterUnionBlock?: (ctx: UnionBlockContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.unionBlock`.
	 * @param ctx the parse tree
	 */
	exitUnionBlock?: (ctx: UnionBlockContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.unionStatement`.
	 * @param ctx the parse tree
	 */
	enterUnionStatement?: (ctx: UnionStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.unionStatement`.
	 * @param ctx the parse tree
	 */
	exitUnionStatement?: (ctx: UnionStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.unionBlockPart`.
	 * @param ctx the parse tree
	 */
	enterUnionBlockPart?: (ctx: UnionBlockPartContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.unionBlockPart`.
	 * @param ctx the parse tree
	 */
	exitUnionBlockPart?: (ctx: UnionBlockPartContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.endUnionStatement`.
	 * @param ctx the parse tree
	 */
	enterEndUnionStatement?: (ctx: EndUnionStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.endUnionStatement`.
	 * @param ctx the parse tree
	 */
	exitEndUnionStatement?: (ctx: EndUnionStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.mapBlock`.
	 * @param ctx the parse tree
	 */
	enterMapBlock?: (ctx: MapBlockContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.mapBlock`.
	 * @param ctx the parse tree
	 */
	exitMapBlock?: (ctx: MapBlockContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.mapStatement`.
	 * @param ctx the parse tree
	 */
	enterMapStatement?: (ctx: MapStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.mapStatement`.
	 * @param ctx the parse tree
	 */
	exitMapStatement?: (ctx: MapStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.mapBlockPart`.
	 * @param ctx the parse tree
	 */
	enterMapBlockPart?: (ctx: MapBlockPartContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.mapBlockPart`.
	 * @param ctx the parse tree
	 */
	exitMapBlockPart?: (ctx: MapBlockPartContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.endMapStatement`.
	 * @param ctx the parse tree
	 */
	enterEndMapStatement?: (ctx: EndMapStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.endMapStatement`.
	 * @param ctx the parse tree
	 */
	exitEndMapStatement?: (ctx: EndMapStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.moduleProcedureStatement`.
	 * @param ctx the parse tree
	 */
	enterModuleProcedureStatement?: (ctx: ModuleProcedureStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.moduleProcedureStatement`.
	 * @param ctx the parse tree
	 */
	exitModuleProcedureStatement?: (ctx: ModuleProcedureStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.procedureNameList`.
	 * @param ctx the parse tree
	 */
	enterProcedureNameList?: (ctx: ProcedureNameListContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.procedureNameList`.
	 * @param ctx the parse tree
	 */
	exitProcedureNameList?: (ctx: ProcedureNameListContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.genericSpec`.
	 * @param ctx the parse tree
	 */
	enterGenericSpec?: (ctx: GenericSpecContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.genericSpec`.
	 * @param ctx the parse tree
	 */
	exitGenericSpec?: (ctx: GenericSpecContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.externalStatement`.
	 * @param ctx the parse tree
	 */
	enterExternalStatement?: (ctx: ExternalStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.externalStatement`.
	 * @param ctx the parse tree
	 */
	exitExternalStatement?: (ctx: ExternalStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.intrinsicStatement`.
	 * @param ctx the parse tree
	 */
	enterIntrinsicStatement?: (ctx: IntrinsicStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.intrinsicStatement`.
	 * @param ctx the parse tree
	 */
	exitIntrinsicStatement?: (ctx: IntrinsicStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.functionReference`.
	 * @param ctx the parse tree
	 */
	enterFunctionReference?: (ctx: FunctionReferenceContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.functionReference`.
	 * @param ctx the parse tree
	 */
	exitFunctionReference?: (ctx: FunctionReferenceContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.callStatement`.
	 * @param ctx the parse tree
	 */
	enterCallStatement?: (ctx: CallStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.callStatement`.
	 * @param ctx the parse tree
	 */
	exitCallStatement?: (ctx: CallStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.actualArg`.
	 * @param ctx the parse tree
	 */
	enterActualArg?: (ctx: ActualArgContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.actualArg`.
	 * @param ctx the parse tree
	 */
	exitActualArg?: (ctx: ActualArgContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.functionArgList`.
	 * @param ctx the parse tree
	 */
	enterFunctionArgList?: (ctx: FunctionArgListContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.functionArgList`.
	 * @param ctx the parse tree
	 */
	exitFunctionArgList?: (ctx: FunctionArgListContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.functionArg`.
	 * @param ctx the parse tree
	 */
	enterFunctionArg?: (ctx: FunctionArgContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.functionArg`.
	 * @param ctx the parse tree
	 */
	exitFunctionArg?: (ctx: FunctionArgContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.functionSubprogram`.
	 * @param ctx the parse tree
	 */
	enterFunctionSubprogram?: (ctx: FunctionSubprogramContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.functionSubprogram`.
	 * @param ctx the parse tree
	 */
	exitFunctionSubprogram?: (ctx: FunctionSubprogramContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.functionDeclaration`.
	 * @param ctx the parse tree
	 */
	enterFunctionDeclaration?: (ctx: FunctionDeclarationContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.functionDeclaration`.
	 * @param ctx the parse tree
	 */
	exitFunctionDeclaration?: (ctx: FunctionDeclarationContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.functionBody`.
	 * @param ctx the parse tree
	 */
	enterFunctionBody?: (ctx: FunctionBodyContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.functionBody`.
	 * @param ctx the parse tree
	 */
	exitFunctionBody?: (ctx: FunctionBodyContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.functionPrefix`.
	 * @param ctx the parse tree
	 */
	enterFunctionPrefix?: (ctx: FunctionPrefixContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.functionPrefix`.
	 * @param ctx the parse tree
	 */
	exitFunctionPrefix?: (ctx: FunctionPrefixContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.endFunctionStatement`.
	 * @param ctx the parse tree
	 */
	enterEndFunctionStatement?: (ctx: EndFunctionStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.endFunctionStatement`.
	 * @param ctx the parse tree
	 */
	exitEndFunctionStatement?: (ctx: EndFunctionStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.subroutineSubprogram`.
	 * @param ctx the parse tree
	 */
	enterSubroutineSubprogram?: (ctx: SubroutineSubprogramContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.subroutineSubprogram`.
	 * @param ctx the parse tree
	 */
	exitSubroutineSubprogram?: (ctx: SubroutineSubprogramContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.subroutineDeclaration`.
	 * @param ctx the parse tree
	 */
	enterSubroutineDeclaration?: (ctx: SubroutineDeclarationContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.subroutineDeclaration`.
	 * @param ctx the parse tree
	 */
	exitSubroutineDeclaration?: (ctx: SubroutineDeclarationContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.subroutineBody`.
	 * @param ctx the parse tree
	 */
	enterSubroutineBody?: (ctx: SubroutineBodyContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.subroutineBody`.
	 * @param ctx the parse tree
	 */
	exitSubroutineBody?: (ctx: SubroutineBodyContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.subroutineStatement`.
	 * @param ctx the parse tree
	 */
	enterSubroutineStatement?: (ctx: SubroutineStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.subroutineStatement`.
	 * @param ctx the parse tree
	 */
	exitSubroutineStatement?: (ctx: SubroutineStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.subroutineParList`.
	 * @param ctx the parse tree
	 */
	enterSubroutineParList?: (ctx: SubroutineParListContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.subroutineParList`.
	 * @param ctx the parse tree
	 */
	exitSubroutineParList?: (ctx: SubroutineParListContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.subroutinePar`.
	 * @param ctx the parse tree
	 */
	enterSubroutinePar?: (ctx: SubroutineParContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.subroutinePar`.
	 * @param ctx the parse tree
	 */
	exitSubroutinePar?: (ctx: SubroutineParContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.functionParList`.
	 * @param ctx the parse tree
	 */
	enterFunctionParList?: (ctx: FunctionParListContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.functionParList`.
	 * @param ctx the parse tree
	 */
	exitFunctionParList?: (ctx: FunctionParListContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.functionPar`.
	 * @param ctx the parse tree
	 */
	enterFunctionPar?: (ctx: FunctionParContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.functionPar`.
	 * @param ctx the parse tree
	 */
	exitFunctionPar?: (ctx: FunctionParContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.endSubroutineStatement`.
	 * @param ctx the parse tree
	 */
	enterEndSubroutineStatement?: (ctx: EndSubroutineStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.endSubroutineStatement`.
	 * @param ctx the parse tree
	 */
	exitEndSubroutineStatement?: (ctx: EndSubroutineStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.entryStatement`.
	 * @param ctx the parse tree
	 */
	enterEntryStatement?: (ctx: EntryStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.entryStatement`.
	 * @param ctx the parse tree
	 */
	exitEntryStatement?: (ctx: EntryStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.returnStatement`.
	 * @param ctx the parse tree
	 */
	enterReturnStatement?: (ctx: ReturnStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.returnStatement`.
	 * @param ctx the parse tree
	 */
	exitReturnStatement?: (ctx: ReturnStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.containsStatement`.
	 * @param ctx the parse tree
	 */
	enterContainsStatement?: (ctx: ContainsStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.containsStatement`.
	 * @param ctx the parse tree
	 */
	exitContainsStatement?: (ctx: ContainsStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.stmtFunctionStatement`.
	 * @param ctx the parse tree
	 */
	enterStmtFunctionStatement?: (ctx: StmtFunctionStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.stmtFunctionStatement`.
	 * @param ctx the parse tree
	 */
	exitStmtFunctionStatement?: (ctx: StmtFunctionStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.sFDummyArgNameList`.
	 * @param ctx the parse tree
	 */
	enterSFDummyArgNameList?: (ctx: SFDummyArgNameListContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.sFDummyArgNameList`.
	 * @param ctx the parse tree
	 */
	exitSFDummyArgNameList?: (ctx: SFDummyArgNameListContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.unsignedArithmeticConstant`.
	 * @param ctx the parse tree
	 */
	enterUnsignedArithmeticConstant?: (ctx: UnsignedArithmeticConstantContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.unsignedArithmeticConstant`.
	 * @param ctx the parse tree
	 */
	exitUnsignedArithmeticConstant?: (ctx: UnsignedArithmeticConstantContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.kindParam`.
	 * @param ctx the parse tree
	 */
	enterKindParam?: (ctx: KindParamContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.kindParam`.
	 * @param ctx the parse tree
	 */
	exitKindParam?: (ctx: KindParamContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.constant`.
	 * @param ctx the parse tree
	 */
	enterConstant?: (ctx: ConstantContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.constant`.
	 * @param ctx the parse tree
	 */
	exitConstant?: (ctx: ConstantContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.bozLiteralConstant`.
	 * @param ctx the parse tree
	 */
	enterBozLiteralConstant?: (ctx: BozLiteralConstantContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.bozLiteralConstant`.
	 * @param ctx the parse tree
	 */
	exitBozLiteralConstant?: (ctx: BozLiteralConstantContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.logicalConstant`.
	 * @param ctx the parse tree
	 */
	enterLogicalConstant?: (ctx: LogicalConstantContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.logicalConstant`.
	 * @param ctx the parse tree
	 */
	exitLogicalConstant?: (ctx: LogicalConstantContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.derivedTypeDef`.
	 * @param ctx the parse tree
	 */
	enterDerivedTypeDef?: (ctx: DerivedTypeDefContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.derivedTypeDef`.
	 * @param ctx the parse tree
	 */
	exitDerivedTypeDef?: (ctx: DerivedTypeDefContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.derivedTypeBody`.
	 * @param ctx the parse tree
	 */
	enterDerivedTypeBody?: (ctx: DerivedTypeBodyContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.derivedTypeBody`.
	 * @param ctx the parse tree
	 */
	exitDerivedTypeBody?: (ctx: DerivedTypeBodyContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.privateSequenceStatement`.
	 * @param ctx the parse tree
	 */
	enterPrivateSequenceStatement?: (ctx: PrivateSequenceStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.privateSequenceStatement`.
	 * @param ctx the parse tree
	 */
	exitPrivateSequenceStatement?: (ctx: PrivateSequenceStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.derivedTypeStatement`.
	 * @param ctx the parse tree
	 */
	enterDerivedTypeStatement?: (ctx: DerivedTypeStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.derivedTypeStatement`.
	 * @param ctx the parse tree
	 */
	exitDerivedTypeStatement?: (ctx: DerivedTypeStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.endTypeStatement`.
	 * @param ctx the parse tree
	 */
	enterEndTypeStatement?: (ctx: EndTypeStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.endTypeStatement`.
	 * @param ctx the parse tree
	 */
	exitEndTypeStatement?: (ctx: EndTypeStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.componentDefStatement`.
	 * @param ctx the parse tree
	 */
	enterComponentDefStatement?: (ctx: ComponentDefStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.componentDefStatement`.
	 * @param ctx the parse tree
	 */
	exitComponentDefStatement?: (ctx: ComponentDefStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.componentAttrSpecList`.
	 * @param ctx the parse tree
	 */
	enterComponentAttrSpecList?: (ctx: ComponentAttrSpecListContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.componentAttrSpecList`.
	 * @param ctx the parse tree
	 */
	exitComponentAttrSpecList?: (ctx: ComponentAttrSpecListContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.componentAttrSpec`.
	 * @param ctx the parse tree
	 */
	enterComponentAttrSpec?: (ctx: ComponentAttrSpecContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.componentAttrSpec`.
	 * @param ctx the parse tree
	 */
	exitComponentAttrSpec?: (ctx: ComponentAttrSpecContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.componentArraySpec`.
	 * @param ctx the parse tree
	 */
	enterComponentArraySpec?: (ctx: ComponentArraySpecContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.componentArraySpec`.
	 * @param ctx the parse tree
	 */
	exitComponentArraySpec?: (ctx: ComponentArraySpecContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.componentDecl`.
	 * @param ctx the parse tree
	 */
	enterComponentDecl?: (ctx: ComponentDeclContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.componentDecl`.
	 * @param ctx the parse tree
	 */
	exitComponentDecl?: (ctx: ComponentDeclContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.componentDeclList`.
	 * @param ctx the parse tree
	 */
	enterComponentDeclList?: (ctx: ComponentDeclListContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.componentDeclList`.
	 * @param ctx the parse tree
	 */
	exitComponentDeclList?: (ctx: ComponentDeclListContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.structureConstructor`.
	 * @param ctx the parse tree
	 */
	enterStructureConstructor?: (ctx: StructureConstructorContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.structureConstructor`.
	 * @param ctx the parse tree
	 */
	exitStructureConstructor?: (ctx: StructureConstructorContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.arrayConstructor`.
	 * @param ctx the parse tree
	 */
	enterArrayConstructor?: (ctx: ArrayConstructorContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.arrayConstructor`.
	 * @param ctx the parse tree
	 */
	exitArrayConstructor?: (ctx: ArrayConstructorContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.acValue`.
	 * @param ctx the parse tree
	 */
	enterAcValue?: (ctx: AcValueContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.acValue`.
	 * @param ctx the parse tree
	 */
	exitAcValue?: (ctx: AcValueContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.acValueList`.
	 * @param ctx the parse tree
	 */
	enterAcValueList?: (ctx: AcValueListContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.acValueList`.
	 * @param ctx the parse tree
	 */
	exitAcValueList?: (ctx: AcValueListContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.acImpliedDo`.
	 * @param ctx the parse tree
	 */
	enterAcImpliedDo?: (ctx: AcImpliedDoContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.acImpliedDo`.
	 * @param ctx the parse tree
	 */
	exitAcImpliedDo?: (ctx: AcImpliedDoContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.typeDeclarationStatement`.
	 * @param ctx the parse tree
	 */
	enterTypeDeclarationStatement?: (ctx: TypeDeclarationStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.typeDeclarationStatement`.
	 * @param ctx the parse tree
	 */
	exitTypeDeclarationStatement?: (ctx: TypeDeclarationStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.typeSpec`.
	 * @param ctx the parse tree
	 */
	enterTypeSpec?: (ctx: TypeSpecContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.typeSpec`.
	 * @param ctx the parse tree
	 */
	exitTypeSpec?: (ctx: TypeSpecContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.attrSpec`.
	 * @param ctx the parse tree
	 */
	enterAttrSpec?: (ctx: AttrSpecContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.attrSpec`.
	 * @param ctx the parse tree
	 */
	exitAttrSpec?: (ctx: AttrSpecContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.entityDecl`.
	 * @param ctx the parse tree
	 */
	enterEntityDecl?: (ctx: EntityDeclContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.entityDecl`.
	 * @param ctx the parse tree
	 */
	exitEntityDecl?: (ctx: EntityDeclContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.kindSelector`.
	 * @param ctx the parse tree
	 */
	enterKindSelector?: (ctx: KindSelectorContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.kindSelector`.
	 * @param ctx the parse tree
	 */
	exitKindSelector?: (ctx: KindSelectorContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.charSelector`.
	 * @param ctx the parse tree
	 */
	enterCharSelector?: (ctx: CharSelectorContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.charSelector`.
	 * @param ctx the parse tree
	 */
	exitCharSelector?: (ctx: CharSelectorContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.lengthSelector`.
	 * @param ctx the parse tree
	 */
	enterLengthSelector?: (ctx: LengthSelectorContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.lengthSelector`.
	 * @param ctx the parse tree
	 */
	exitLengthSelector?: (ctx: LengthSelectorContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.charLength`.
	 * @param ctx the parse tree
	 */
	enterCharLength?: (ctx: CharLengthContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.charLength`.
	 * @param ctx the parse tree
	 */
	exitCharLength?: (ctx: CharLengthContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.typeParamValue`.
	 * @param ctx the parse tree
	 */
	enterTypeParamValue?: (ctx: TypeParamValueContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.typeParamValue`.
	 * @param ctx the parse tree
	 */
	exitTypeParamValue?: (ctx: TypeParamValueContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.accessSpec`.
	 * @param ctx the parse tree
	 */
	enterAccessSpec?: (ctx: AccessSpecContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.accessSpec`.
	 * @param ctx the parse tree
	 */
	exitAccessSpec?: (ctx: AccessSpecContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.intentSpec`.
	 * @param ctx the parse tree
	 */
	enterIntentSpec?: (ctx: IntentSpecContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.intentSpec`.
	 * @param ctx the parse tree
	 */
	exitIntentSpec?: (ctx: IntentSpecContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.arraySpec`.
	 * @param ctx the parse tree
	 */
	enterArraySpec?: (ctx: ArraySpecContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.arraySpec`.
	 * @param ctx the parse tree
	 */
	exitArraySpec?: (ctx: ArraySpecContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.explicitShapeSpecList`.
	 * @param ctx the parse tree
	 */
	enterExplicitShapeSpecList?: (ctx: ExplicitShapeSpecListContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.explicitShapeSpecList`.
	 * @param ctx the parse tree
	 */
	exitExplicitShapeSpecList?: (ctx: ExplicitShapeSpecListContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.explicitShapeSpec`.
	 * @param ctx the parse tree
	 */
	enterExplicitShapeSpec?: (ctx: ExplicitShapeSpecContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.explicitShapeSpec`.
	 * @param ctx the parse tree
	 */
	exitExplicitShapeSpec?: (ctx: ExplicitShapeSpecContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.lowerBound`.
	 * @param ctx the parse tree
	 */
	enterLowerBound?: (ctx: LowerBoundContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.lowerBound`.
	 * @param ctx the parse tree
	 */
	exitLowerBound?: (ctx: LowerBoundContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.upperBound`.
	 * @param ctx the parse tree
	 */
	enterUpperBound?: (ctx: UpperBoundContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.upperBound`.
	 * @param ctx the parse tree
	 */
	exitUpperBound?: (ctx: UpperBoundContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.assumedShapeSpec`.
	 * @param ctx the parse tree
	 */
	enterAssumedShapeSpec?: (ctx: AssumedShapeSpecContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.assumedShapeSpec`.
	 * @param ctx the parse tree
	 */
	exitAssumedShapeSpec?: (ctx: AssumedShapeSpecContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.assumedShapeSpecList`.
	 * @param ctx the parse tree
	 */
	enterAssumedShapeSpecList?: (ctx: AssumedShapeSpecListContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.assumedShapeSpecList`.
	 * @param ctx the parse tree
	 */
	exitAssumedShapeSpecList?: (ctx: AssumedShapeSpecListContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.deferredShapeSpecList`.
	 * @param ctx the parse tree
	 */
	enterDeferredShapeSpecList?: (ctx: DeferredShapeSpecListContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.deferredShapeSpecList`.
	 * @param ctx the parse tree
	 */
	exitDeferredShapeSpecList?: (ctx: DeferredShapeSpecListContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.deferredShapeSpec`.
	 * @param ctx the parse tree
	 */
	enterDeferredShapeSpec?: (ctx: DeferredShapeSpecContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.deferredShapeSpec`.
	 * @param ctx the parse tree
	 */
	exitDeferredShapeSpec?: (ctx: DeferredShapeSpecContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.assumedSizeSpec`.
	 * @param ctx the parse tree
	 */
	enterAssumedSizeSpec?: (ctx: AssumedSizeSpecContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.assumedSizeSpec`.
	 * @param ctx the parse tree
	 */
	exitAssumedSizeSpec?: (ctx: AssumedSizeSpecContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.intentStatement`.
	 * @param ctx the parse tree
	 */
	enterIntentStatement?: (ctx: IntentStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.intentStatement`.
	 * @param ctx the parse tree
	 */
	exitIntentStatement?: (ctx: IntentStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.intentParList`.
	 * @param ctx the parse tree
	 */
	enterIntentParList?: (ctx: IntentParListContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.intentParList`.
	 * @param ctx the parse tree
	 */
	exitIntentParList?: (ctx: IntentParListContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.intentPar`.
	 * @param ctx the parse tree
	 */
	enterIntentPar?: (ctx: IntentParContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.intentPar`.
	 * @param ctx the parse tree
	 */
	exitIntentPar?: (ctx: IntentParContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.optionalStatement`.
	 * @param ctx the parse tree
	 */
	enterOptionalStatement?: (ctx: OptionalStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.optionalStatement`.
	 * @param ctx the parse tree
	 */
	exitOptionalStatement?: (ctx: OptionalStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.optionalParList`.
	 * @param ctx the parse tree
	 */
	enterOptionalParList?: (ctx: OptionalParListContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.optionalParList`.
	 * @param ctx the parse tree
	 */
	exitOptionalParList?: (ctx: OptionalParListContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.optionalPar`.
	 * @param ctx the parse tree
	 */
	enterOptionalPar?: (ctx: OptionalParContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.optionalPar`.
	 * @param ctx the parse tree
	 */
	exitOptionalPar?: (ctx: OptionalParContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.accessStatement`.
	 * @param ctx the parse tree
	 */
	enterAccessStatement?: (ctx: AccessStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.accessStatement`.
	 * @param ctx the parse tree
	 */
	exitAccessStatement?: (ctx: AccessStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.accessIdList`.
	 * @param ctx the parse tree
	 */
	enterAccessIdList?: (ctx: AccessIdListContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.accessIdList`.
	 * @param ctx the parse tree
	 */
	exitAccessIdList?: (ctx: AccessIdListContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.accessId`.
	 * @param ctx the parse tree
	 */
	enterAccessId?: (ctx: AccessIdContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.accessId`.
	 * @param ctx the parse tree
	 */
	exitAccessId?: (ctx: AccessIdContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.saveStatement`.
	 * @param ctx the parse tree
	 */
	enterSaveStatement?: (ctx: SaveStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.saveStatement`.
	 * @param ctx the parse tree
	 */
	exitSaveStatement?: (ctx: SaveStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.savedEntityList`.
	 * @param ctx the parse tree
	 */
	enterSavedEntityList?: (ctx: SavedEntityListContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.savedEntityList`.
	 * @param ctx the parse tree
	 */
	exitSavedEntityList?: (ctx: SavedEntityListContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.savedEntity`.
	 * @param ctx the parse tree
	 */
	enterSavedEntity?: (ctx: SavedEntityContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.savedEntity`.
	 * @param ctx the parse tree
	 */
	exitSavedEntity?: (ctx: SavedEntityContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.dimensionStatement`.
	 * @param ctx the parse tree
	 */
	enterDimensionStatement?: (ctx: DimensionStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.dimensionStatement`.
	 * @param ctx the parse tree
	 */
	exitDimensionStatement?: (ctx: DimensionStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.arrayDeclaratorList`.
	 * @param ctx the parse tree
	 */
	enterArrayDeclaratorList?: (ctx: ArrayDeclaratorListContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.arrayDeclaratorList`.
	 * @param ctx the parse tree
	 */
	exitArrayDeclaratorList?: (ctx: ArrayDeclaratorListContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.arrayDeclarator`.
	 * @param ctx the parse tree
	 */
	enterArrayDeclarator?: (ctx: ArrayDeclaratorContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.arrayDeclarator`.
	 * @param ctx the parse tree
	 */
	exitArrayDeclarator?: (ctx: ArrayDeclaratorContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.allocatableStatement`.
	 * @param ctx the parse tree
	 */
	enterAllocatableStatement?: (ctx: AllocatableStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.allocatableStatement`.
	 * @param ctx the parse tree
	 */
	exitAllocatableStatement?: (ctx: AllocatableStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.arrayAllocationList`.
	 * @param ctx the parse tree
	 */
	enterArrayAllocationList?: (ctx: ArrayAllocationListContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.arrayAllocationList`.
	 * @param ctx the parse tree
	 */
	exitArrayAllocationList?: (ctx: ArrayAllocationListContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.arrayAllocation`.
	 * @param ctx the parse tree
	 */
	enterArrayAllocation?: (ctx: ArrayAllocationContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.arrayAllocation`.
	 * @param ctx the parse tree
	 */
	exitArrayAllocation?: (ctx: ArrayAllocationContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.pointerStatement`.
	 * @param ctx the parse tree
	 */
	enterPointerStatement?: (ctx: PointerStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.pointerStatement`.
	 * @param ctx the parse tree
	 */
	exitPointerStatement?: (ctx: PointerStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.pointerStatementObjectList`.
	 * @param ctx the parse tree
	 */
	enterPointerStatementObjectList?: (ctx: PointerStatementObjectListContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.pointerStatementObjectList`.
	 * @param ctx the parse tree
	 */
	exitPointerStatementObjectList?: (ctx: PointerStatementObjectListContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.pointerStatementObject`.
	 * @param ctx the parse tree
	 */
	enterPointerStatementObject?: (ctx: PointerStatementObjectContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.pointerStatementObject`.
	 * @param ctx the parse tree
	 */
	exitPointerStatementObject?: (ctx: PointerStatementObjectContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.targetStatement`.
	 * @param ctx the parse tree
	 */
	enterTargetStatement?: (ctx: TargetStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.targetStatement`.
	 * @param ctx the parse tree
	 */
	exitTargetStatement?: (ctx: TargetStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.targetObjectList`.
	 * @param ctx the parse tree
	 */
	enterTargetObjectList?: (ctx: TargetObjectListContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.targetObjectList`.
	 * @param ctx the parse tree
	 */
	exitTargetObjectList?: (ctx: TargetObjectListContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.targetObject`.
	 * @param ctx the parse tree
	 */
	enterTargetObject?: (ctx: TargetObjectContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.targetObject`.
	 * @param ctx the parse tree
	 */
	exitTargetObject?: (ctx: TargetObjectContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.dataStatement`.
	 * @param ctx the parse tree
	 */
	enterDataStatement?: (ctx: DataStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.dataStatement`.
	 * @param ctx the parse tree
	 */
	exitDataStatement?: (ctx: DataStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.datalist`.
	 * @param ctx the parse tree
	 */
	enterDatalist?: (ctx: DatalistContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.datalist`.
	 * @param ctx the parse tree
	 */
	exitDatalist?: (ctx: DatalistContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.dataStatementSet`.
	 * @param ctx the parse tree
	 */
	enterDataStatementSet?: (ctx: DataStatementSetContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.dataStatementSet`.
	 * @param ctx the parse tree
	 */
	exitDataStatementSet?: (ctx: DataStatementSetContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.dataStatementObjectList`.
	 * @param ctx the parse tree
	 */
	enterDataStatementObjectList?: (ctx: DataStatementObjectListContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.dataStatementObjectList`.
	 * @param ctx the parse tree
	 */
	exitDataStatementObjectList?: (ctx: DataStatementObjectListContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.dataStatementObject`.
	 * @param ctx the parse tree
	 */
	enterDataStatementObject?: (ctx: DataStatementObjectContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.dataStatementObject`.
	 * @param ctx the parse tree
	 */
	exitDataStatementObject?: (ctx: DataStatementObjectContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.dataStatementValueList`.
	 * @param ctx the parse tree
	 */
	enterDataStatementValueList?: (ctx: DataStatementValueListContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.dataStatementValueList`.
	 * @param ctx the parse tree
	 */
	exitDataStatementValueList?: (ctx: DataStatementValueListContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.dataStatementValue`.
	 * @param ctx the parse tree
	 */
	enterDataStatementValue?: (ctx: DataStatementValueContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.dataStatementValue`.
	 * @param ctx the parse tree
	 */
	exitDataStatementValue?: (ctx: DataStatementValueContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.dataImpliedDo`.
	 * @param ctx the parse tree
	 */
	enterDataImpliedDo?: (ctx: DataImpliedDoContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.dataImpliedDo`.
	 * @param ctx the parse tree
	 */
	exitDataImpliedDo?: (ctx: DataImpliedDoContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.dataIDoObjectList`.
	 * @param ctx the parse tree
	 */
	enterDataIDoObjectList?: (ctx: DataIDoObjectListContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.dataIDoObjectList`.
	 * @param ctx the parse tree
	 */
	exitDataIDoObjectList?: (ctx: DataIDoObjectListContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.dataIDoObject`.
	 * @param ctx the parse tree
	 */
	enterDataIDoObject?: (ctx: DataIDoObjectContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.dataIDoObject`.
	 * @param ctx the parse tree
	 */
	exitDataIDoObject?: (ctx: DataIDoObjectContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.parameterStatement`.
	 * @param ctx the parse tree
	 */
	enterParameterStatement?: (ctx: ParameterStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.parameterStatement`.
	 * @param ctx the parse tree
	 */
	exitParameterStatement?: (ctx: ParameterStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.namedConstantDefList`.
	 * @param ctx the parse tree
	 */
	enterNamedConstantDefList?: (ctx: NamedConstantDefListContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.namedConstantDefList`.
	 * @param ctx the parse tree
	 */
	exitNamedConstantDefList?: (ctx: NamedConstantDefListContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.namedConstantDef`.
	 * @param ctx the parse tree
	 */
	enterNamedConstantDef?: (ctx: NamedConstantDefContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.namedConstantDef`.
	 * @param ctx the parse tree
	 */
	exitNamedConstantDef?: (ctx: NamedConstantDefContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.implicitStatement`.
	 * @param ctx the parse tree
	 */
	enterImplicitStatement?: (ctx: ImplicitStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.implicitStatement`.
	 * @param ctx the parse tree
	 */
	exitImplicitStatement?: (ctx: ImplicitStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.implicitBody`.
	 * @param ctx the parse tree
	 */
	enterImplicitBody?: (ctx: ImplicitBodyContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.implicitBody`.
	 * @param ctx the parse tree
	 */
	exitImplicitBody?: (ctx: ImplicitBodyContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.implicitSpec`.
	 * @param ctx the parse tree
	 */
	enterImplicitSpec?: (ctx: ImplicitSpecContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.implicitSpec`.
	 * @param ctx the parse tree
	 */
	exitImplicitSpec?: (ctx: ImplicitSpecContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.letterSpec`.
	 * @param ctx the parse tree
	 */
	enterLetterSpec?: (ctx: LetterSpecContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.letterSpec`.
	 * @param ctx the parse tree
	 */
	exitLetterSpec?: (ctx: LetterSpecContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.namelistStatement`.
	 * @param ctx the parse tree
	 */
	enterNamelistStatement?: (ctx: NamelistStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.namelistStatement`.
	 * @param ctx the parse tree
	 */
	exitNamelistStatement?: (ctx: NamelistStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.namelistGroup`.
	 * @param ctx the parse tree
	 */
	enterNamelistGroup?: (ctx: NamelistGroupContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.namelistGroup`.
	 * @param ctx the parse tree
	 */
	exitNamelistGroup?: (ctx: NamelistGroupContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.namelistGroupObject`.
	 * @param ctx the parse tree
	 */
	enterNamelistGroupObject?: (ctx: NamelistGroupObjectContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.namelistGroupObject`.
	 * @param ctx the parse tree
	 */
	exitNamelistGroupObject?: (ctx: NamelistGroupObjectContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.equivalenceStatement`.
	 * @param ctx the parse tree
	 */
	enterEquivalenceStatement?: (ctx: EquivalenceStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.equivalenceStatement`.
	 * @param ctx the parse tree
	 */
	exitEquivalenceStatement?: (ctx: EquivalenceStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.equivalenceSetList`.
	 * @param ctx the parse tree
	 */
	enterEquivalenceSetList?: (ctx: EquivalenceSetListContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.equivalenceSetList`.
	 * @param ctx the parse tree
	 */
	exitEquivalenceSetList?: (ctx: EquivalenceSetListContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.equivalenceSet`.
	 * @param ctx the parse tree
	 */
	enterEquivalenceSet?: (ctx: EquivalenceSetContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.equivalenceSet`.
	 * @param ctx the parse tree
	 */
	exitEquivalenceSet?: (ctx: EquivalenceSetContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.equivalenceObject`.
	 * @param ctx the parse tree
	 */
	enterEquivalenceObject?: (ctx: EquivalenceObjectContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.equivalenceObject`.
	 * @param ctx the parse tree
	 */
	exitEquivalenceObject?: (ctx: EquivalenceObjectContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.commonStatement`.
	 * @param ctx the parse tree
	 */
	enterCommonStatement?: (ctx: CommonStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.commonStatement`.
	 * @param ctx the parse tree
	 */
	exitCommonStatement?: (ctx: CommonStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.comblock`.
	 * @param ctx the parse tree
	 */
	enterComblock?: (ctx: ComblockContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.comblock`.
	 * @param ctx the parse tree
	 */
	exitComblock?: (ctx: ComblockContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.commonBlockObject`.
	 * @param ctx the parse tree
	 */
	enterCommonBlockObject?: (ctx: CommonBlockObjectContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.commonBlockObject`.
	 * @param ctx the parse tree
	 */
	exitCommonBlockObject?: (ctx: CommonBlockObjectContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.commonBlockObjectList`.
	 * @param ctx the parse tree
	 */
	enterCommonBlockObjectList?: (ctx: CommonBlockObjectListContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.commonBlockObjectList`.
	 * @param ctx the parse tree
	 */
	exitCommonBlockObjectList?: (ctx: CommonBlockObjectListContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.scalarVariable`.
	 * @param ctx the parse tree
	 */
	enterScalarVariable?: (ctx: ScalarVariableContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.scalarVariable`.
	 * @param ctx the parse tree
	 */
	exitScalarVariable?: (ctx: ScalarVariableContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.variable`.
	 * @param ctx the parse tree
	 */
	enterVariable?: (ctx: VariableContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.variable`.
	 * @param ctx the parse tree
	 */
	exitVariable?: (ctx: VariableContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.subscript`.
	 * @param ctx the parse tree
	 */
	enterSubscript?: (ctx: SubscriptContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.subscript`.
	 * @param ctx the parse tree
	 */
	exitSubscript?: (ctx: SubscriptContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.dataRef`.
	 * @param ctx the parse tree
	 */
	enterDataRef?: (ctx: DataRefContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.dataRef`.
	 * @param ctx the parse tree
	 */
	exitDataRef?: (ctx: DataRefContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.sectionSubscriptList`.
	 * @param ctx the parse tree
	 */
	enterSectionSubscriptList?: (ctx: SectionSubscriptListContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.sectionSubscriptList`.
	 * @param ctx the parse tree
	 */
	exitSectionSubscriptList?: (ctx: SectionSubscriptListContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.sectionSubscript`.
	 * @param ctx the parse tree
	 */
	enterSectionSubscript?: (ctx: SectionSubscriptContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.sectionSubscript`.
	 * @param ctx the parse tree
	 */
	exitSectionSubscript?: (ctx: SectionSubscriptContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.substringRange`.
	 * @param ctx the parse tree
	 */
	enterSubstringRange?: (ctx: SubstringRangeContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.substringRange`.
	 * @param ctx the parse tree
	 */
	exitSubstringRange?: (ctx: SubstringRangeContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.structureComponent`.
	 * @param ctx the parse tree
	 */
	enterStructureComponent?: (ctx: StructureComponentContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.structureComponent`.
	 * @param ctx the parse tree
	 */
	exitStructureComponent?: (ctx: StructureComponentContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.fieldSelector`.
	 * @param ctx the parse tree
	 */
	enterFieldSelector?: (ctx: FieldSelectorContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.fieldSelector`.
	 * @param ctx the parse tree
	 */
	exitFieldSelector?: (ctx: FieldSelectorContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.arrayElement`.
	 * @param ctx the parse tree
	 */
	enterArrayElement?: (ctx: ArrayElementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.arrayElement`.
	 * @param ctx the parse tree
	 */
	exitArrayElement?: (ctx: ArrayElementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.subscriptTriplet`.
	 * @param ctx the parse tree
	 */
	enterSubscriptTriplet?: (ctx: SubscriptTripletContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.subscriptTriplet`.
	 * @param ctx the parse tree
	 */
	exitSubscriptTriplet?: (ctx: SubscriptTripletContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.allocateStatement`.
	 * @param ctx the parse tree
	 */
	enterAllocateStatement?: (ctx: AllocateStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.allocateStatement`.
	 * @param ctx the parse tree
	 */
	exitAllocateStatement?: (ctx: AllocateStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.allocationList`.
	 * @param ctx the parse tree
	 */
	enterAllocationList?: (ctx: AllocationListContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.allocationList`.
	 * @param ctx the parse tree
	 */
	exitAllocationList?: (ctx: AllocationListContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.allocation`.
	 * @param ctx the parse tree
	 */
	enterAllocation?: (ctx: AllocationContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.allocation`.
	 * @param ctx the parse tree
	 */
	exitAllocation?: (ctx: AllocationContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.allocatedShape`.
	 * @param ctx the parse tree
	 */
	enterAllocatedShape?: (ctx: AllocatedShapeContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.allocatedShape`.
	 * @param ctx the parse tree
	 */
	exitAllocatedShape?: (ctx: AllocatedShapeContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.allocateObjectList`.
	 * @param ctx the parse tree
	 */
	enterAllocateObjectList?: (ctx: AllocateObjectListContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.allocateObjectList`.
	 * @param ctx the parse tree
	 */
	exitAllocateObjectList?: (ctx: AllocateObjectListContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.allocateObject`.
	 * @param ctx the parse tree
	 */
	enterAllocateObject?: (ctx: AllocateObjectContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.allocateObject`.
	 * @param ctx the parse tree
	 */
	exitAllocateObject?: (ctx: AllocateObjectContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.allocateShapeSpec`.
	 * @param ctx the parse tree
	 */
	enterAllocateShapeSpec?: (ctx: AllocateShapeSpecContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.allocateShapeSpec`.
	 * @param ctx the parse tree
	 */
	exitAllocateShapeSpec?: (ctx: AllocateShapeSpecContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.nullifyStatement`.
	 * @param ctx the parse tree
	 */
	enterNullifyStatement?: (ctx: NullifyStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.nullifyStatement`.
	 * @param ctx the parse tree
	 */
	exitNullifyStatement?: (ctx: NullifyStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.pointerObjectList`.
	 * @param ctx the parse tree
	 */
	enterPointerObjectList?: (ctx: PointerObjectListContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.pointerObjectList`.
	 * @param ctx the parse tree
	 */
	exitPointerObjectList?: (ctx: PointerObjectListContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.pointerObject`.
	 * @param ctx the parse tree
	 */
	enterPointerObject?: (ctx: PointerObjectContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.pointerObject`.
	 * @param ctx the parse tree
	 */
	exitPointerObject?: (ctx: PointerObjectContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.pointerField`.
	 * @param ctx the parse tree
	 */
	enterPointerField?: (ctx: PointerFieldContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.pointerField`.
	 * @param ctx the parse tree
	 */
	exitPointerField?: (ctx: PointerFieldContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.deallocateStatement`.
	 * @param ctx the parse tree
	 */
	enterDeallocateStatement?: (ctx: DeallocateStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.deallocateStatement`.
	 * @param ctx the parse tree
	 */
	exitDeallocateStatement?: (ctx: DeallocateStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.uFExpr`.
	 * @param ctx the parse tree
	 */
	enterUFExpr?: (ctx: UFExprContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.uFExpr`.
	 * @param ctx the parse tree
	 */
	exitUFExpr?: (ctx: UFExprContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.uFTerm`.
	 * @param ctx the parse tree
	 */
	enterUFTerm?: (ctx: UFTermContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.uFTerm`.
	 * @param ctx the parse tree
	 */
	exitUFTerm?: (ctx: UFTermContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.uFFactor`.
	 * @param ctx the parse tree
	 */
	enterUFFactor?: (ctx: UFFactorContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.uFFactor`.
	 * @param ctx the parse tree
	 */
	exitUFFactor?: (ctx: UFFactorContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.uFPrimary`.
	 * @param ctx the parse tree
	 */
	enterUFPrimary?: (ctx: UFPrimaryContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.uFPrimary`.
	 * @param ctx the parse tree
	 */
	exitUFPrimary?: (ctx: UFPrimaryContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.cExpr`.
	 * @param ctx the parse tree
	 */
	enterCExpr?: (ctx: CExprContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.cExpr`.
	 * @param ctx the parse tree
	 */
	exitCExpr?: (ctx: CExprContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.cPrimary`.
	 * @param ctx the parse tree
	 */
	enterCPrimary?: (ctx: CPrimaryContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.cPrimary`.
	 * @param ctx the parse tree
	 */
	exitCPrimary?: (ctx: CPrimaryContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.cOperand`.
	 * @param ctx the parse tree
	 */
	enterCOperand?: (ctx: COperandContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.cOperand`.
	 * @param ctx the parse tree
	 */
	exitCOperand?: (ctx: COperandContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.complexConst`.
	 * @param ctx the parse tree
	 */
	enterComplexConst?: (ctx: ComplexConstContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.complexConst`.
	 * @param ctx the parse tree
	 */
	exitComplexConst?: (ctx: ComplexConstContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.primary`.
	 * @param ctx the parse tree
	 */
	enterPrimary?: (ctx: PrimaryContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.primary`.
	 * @param ctx the parse tree
	 */
	exitPrimary?: (ctx: PrimaryContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.level1Expr`.
	 * @param ctx the parse tree
	 */
	enterLevel1Expr?: (ctx: Level1ExprContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.level1Expr`.
	 * @param ctx the parse tree
	 */
	exitLevel1Expr?: (ctx: Level1ExprContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.multOperand`.
	 * @param ctx the parse tree
	 */
	enterMultOperand?: (ctx: MultOperandContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.multOperand`.
	 * @param ctx the parse tree
	 */
	exitMultOperand?: (ctx: MultOperandContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.addOperand`.
	 * @param ctx the parse tree
	 */
	enterAddOperand?: (ctx: AddOperandContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.addOperand`.
	 * @param ctx the parse tree
	 */
	exitAddOperand?: (ctx: AddOperandContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.level2Expr`.
	 * @param ctx the parse tree
	 */
	enterLevel2Expr?: (ctx: Level2ExprContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.level2Expr`.
	 * @param ctx the parse tree
	 */
	exitLevel2Expr?: (ctx: Level2ExprContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.powerOp`.
	 * @param ctx the parse tree
	 */
	enterPowerOp?: (ctx: PowerOpContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.powerOp`.
	 * @param ctx the parse tree
	 */
	exitPowerOp?: (ctx: PowerOpContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.multOp`.
	 * @param ctx the parse tree
	 */
	enterMultOp?: (ctx: MultOpContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.multOp`.
	 * @param ctx the parse tree
	 */
	exitMultOp?: (ctx: MultOpContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.addOp`.
	 * @param ctx the parse tree
	 */
	enterAddOp?: (ctx: AddOpContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.addOp`.
	 * @param ctx the parse tree
	 */
	exitAddOp?: (ctx: AddOpContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.sign`.
	 * @param ctx the parse tree
	 */
	enterSign?: (ctx: SignContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.sign`.
	 * @param ctx the parse tree
	 */
	exitSign?: (ctx: SignContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.level3Expr`.
	 * @param ctx the parse tree
	 */
	enterLevel3Expr?: (ctx: Level3ExprContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.level3Expr`.
	 * @param ctx the parse tree
	 */
	exitLevel3Expr?: (ctx: Level3ExprContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.concatOp`.
	 * @param ctx the parse tree
	 */
	enterConcatOp?: (ctx: ConcatOpContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.concatOp`.
	 * @param ctx the parse tree
	 */
	exitConcatOp?: (ctx: ConcatOpContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.level4Expr`.
	 * @param ctx the parse tree
	 */
	enterLevel4Expr?: (ctx: Level4ExprContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.level4Expr`.
	 * @param ctx the parse tree
	 */
	exitLevel4Expr?: (ctx: Level4ExprContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.relOp`.
	 * @param ctx the parse tree
	 */
	enterRelOp?: (ctx: RelOpContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.relOp`.
	 * @param ctx the parse tree
	 */
	exitRelOp?: (ctx: RelOpContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.andOperand`.
	 * @param ctx the parse tree
	 */
	enterAndOperand?: (ctx: AndOperandContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.andOperand`.
	 * @param ctx the parse tree
	 */
	exitAndOperand?: (ctx: AndOperandContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.orOperand`.
	 * @param ctx the parse tree
	 */
	enterOrOperand?: (ctx: OrOperandContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.orOperand`.
	 * @param ctx the parse tree
	 */
	exitOrOperand?: (ctx: OrOperandContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.equivOperand`.
	 * @param ctx the parse tree
	 */
	enterEquivOperand?: (ctx: EquivOperandContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.equivOperand`.
	 * @param ctx the parse tree
	 */
	exitEquivOperand?: (ctx: EquivOperandContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.level5Expr`.
	 * @param ctx the parse tree
	 */
	enterLevel5Expr?: (ctx: Level5ExprContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.level5Expr`.
	 * @param ctx the parse tree
	 */
	exitLevel5Expr?: (ctx: Level5ExprContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.notOp`.
	 * @param ctx the parse tree
	 */
	enterNotOp?: (ctx: NotOpContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.notOp`.
	 * @param ctx the parse tree
	 */
	exitNotOp?: (ctx: NotOpContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.andOp`.
	 * @param ctx the parse tree
	 */
	enterAndOp?: (ctx: AndOpContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.andOp`.
	 * @param ctx the parse tree
	 */
	exitAndOp?: (ctx: AndOpContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.orOp`.
	 * @param ctx the parse tree
	 */
	enterOrOp?: (ctx: OrOpContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.orOp`.
	 * @param ctx the parse tree
	 */
	exitOrOp?: (ctx: OrOpContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.equivOp`.
	 * @param ctx the parse tree
	 */
	enterEquivOp?: (ctx: EquivOpContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.equivOp`.
	 * @param ctx the parse tree
	 */
	exitEquivOp?: (ctx: EquivOpContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.expr`.
	 * @param ctx the parse tree
	 */
	enterExpr?: (ctx: ExprContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.expr`.
	 * @param ctx the parse tree
	 */
	exitExpr?: (ctx: ExprContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.specificationExpr`.
	 * @param ctx the parse tree
	 */
	enterSpecificationExpr?: (ctx: SpecificationExprContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.specificationExpr`.
	 * @param ctx the parse tree
	 */
	exitSpecificationExpr?: (ctx: SpecificationExprContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.assignmentStatement`.
	 * @param ctx the parse tree
	 */
	enterAssignmentStatement?: (ctx: AssignmentStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.assignmentStatement`.
	 * @param ctx the parse tree
	 */
	exitAssignmentStatement?: (ctx: AssignmentStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.sFExprList`.
	 * @param ctx the parse tree
	 */
	enterSFExprList?: (ctx: SFExprListContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.sFExprList`.
	 * @param ctx the parse tree
	 */
	exitSFExprList?: (ctx: SFExprListContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.sFExpr`.
	 * @param ctx the parse tree
	 */
	enterSFExpr?: (ctx: SFExprContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.sFExpr`.
	 * @param ctx the parse tree
	 */
	exitSFExpr?: (ctx: SFExprContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.sFTerm`.
	 * @param ctx the parse tree
	 */
	enterSFTerm?: (ctx: SFTermContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.sFTerm`.
	 * @param ctx the parse tree
	 */
	exitSFTerm?: (ctx: SFTermContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.sFFactor`.
	 * @param ctx the parse tree
	 */
	enterSFFactor?: (ctx: SFFactorContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.sFFactor`.
	 * @param ctx the parse tree
	 */
	exitSFFactor?: (ctx: SFFactorContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.sFPrimary`.
	 * @param ctx the parse tree
	 */
	enterSFPrimary?: (ctx: SFPrimaryContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.sFPrimary`.
	 * @param ctx the parse tree
	 */
	exitSFPrimary?: (ctx: SFPrimaryContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.pointerAssignmentStatement`.
	 * @param ctx the parse tree
	 */
	enterPointerAssignmentStatement?: (ctx: PointerAssignmentStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.pointerAssignmentStatement`.
	 * @param ctx the parse tree
	 */
	exitPointerAssignmentStatement?: (ctx: PointerAssignmentStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.pointerAssignmentItem`.
	 * @param ctx the parse tree
	 */
	enterPointerAssignmentItem?: (ctx: PointerAssignmentItemContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.pointerAssignmentItem`.
	 * @param ctx the parse tree
	 */
	exitPointerAssignmentItem?: (ctx: PointerAssignmentItemContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.target`.
	 * @param ctx the parse tree
	 */
	enterTarget?: (ctx: TargetContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.target`.
	 * @param ctx the parse tree
	 */
	exitTarget?: (ctx: TargetContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.whereStatement`.
	 * @param ctx the parse tree
	 */
	enterWhereStatement?: (ctx: WhereStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.whereStatement`.
	 * @param ctx the parse tree
	 */
	exitWhereStatement?: (ctx: WhereStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.whereConstruct`.
	 * @param ctx the parse tree
	 */
	enterWhereConstruct?: (ctx: WhereConstructContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.whereConstruct`.
	 * @param ctx the parse tree
	 */
	exitWhereConstruct?: (ctx: WhereConstructContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.whereConstructStatement`.
	 * @param ctx the parse tree
	 */
	enterWhereConstructStatement?: (ctx: WhereConstructStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.whereConstructStatement`.
	 * @param ctx the parse tree
	 */
	exitWhereConstructStatement?: (ctx: WhereConstructStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.maskExpr`.
	 * @param ctx the parse tree
	 */
	enterMaskExpr?: (ctx: MaskExprContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.maskExpr`.
	 * @param ctx the parse tree
	 */
	exitMaskExpr?: (ctx: MaskExprContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.elsewhereStatement`.
	 * @param ctx the parse tree
	 */
	enterElsewhereStatement?: (ctx: ElsewhereStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.elsewhereStatement`.
	 * @param ctx the parse tree
	 */
	exitElsewhereStatement?: (ctx: ElsewhereStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.endWhereStatement`.
	 * @param ctx the parse tree
	 */
	enterEndWhereStatement?: (ctx: EndWhereStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.endWhereStatement`.
	 * @param ctx the parse tree
	 */
	exitEndWhereStatement?: (ctx: EndWhereStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.ifConstruct`.
	 * @param ctx the parse tree
	 */
	enterIfConstruct?: (ctx: IfConstructContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.ifConstruct`.
	 * @param ctx the parse tree
	 */
	exitIfConstruct?: (ctx: IfConstructContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.ifThenStatement`.
	 * @param ctx the parse tree
	 */
	enterIfThenStatement?: (ctx: IfThenStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.ifThenStatement`.
	 * @param ctx the parse tree
	 */
	exitIfThenStatement?: (ctx: IfThenStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.elseIfStatement`.
	 * @param ctx the parse tree
	 */
	enterElseIfStatement?: (ctx: ElseIfStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.elseIfStatement`.
	 * @param ctx the parse tree
	 */
	exitElseIfStatement?: (ctx: ElseIfStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.elseStatement`.
	 * @param ctx the parse tree
	 */
	enterElseStatement?: (ctx: ElseStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.elseStatement`.
	 * @param ctx the parse tree
	 */
	exitElseStatement?: (ctx: ElseStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.endIfStatement`.
	 * @param ctx the parse tree
	 */
	enterEndIfStatement?: (ctx: EndIfStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.endIfStatement`.
	 * @param ctx the parse tree
	 */
	exitEndIfStatement?: (ctx: EndIfStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.ifStatement`.
	 * @param ctx the parse tree
	 */
	enterIfStatement?: (ctx: IfStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.ifStatement`.
	 * @param ctx the parse tree
	 */
	exitIfStatement?: (ctx: IfStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.scalarLogicalExpr`.
	 * @param ctx the parse tree
	 */
	enterScalarLogicalExpr?: (ctx: ScalarLogicalExprContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.scalarLogicalExpr`.
	 * @param ctx the parse tree
	 */
	exitScalarLogicalExpr?: (ctx: ScalarLogicalExprContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.caseConstruct`.
	 * @param ctx the parse tree
	 */
	enterCaseConstruct?: (ctx: CaseConstructContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.caseConstruct`.
	 * @param ctx the parse tree
	 */
	exitCaseConstruct?: (ctx: CaseConstructContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.selectCaseRange`.
	 * @param ctx the parse tree
	 */
	enterSelectCaseRange?: (ctx: SelectCaseRangeContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.selectCaseRange`.
	 * @param ctx the parse tree
	 */
	exitSelectCaseRange?: (ctx: SelectCaseRangeContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.selectCaseBody`.
	 * @param ctx the parse tree
	 */
	enterSelectCaseBody?: (ctx: SelectCaseBodyContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.selectCaseBody`.
	 * @param ctx the parse tree
	 */
	exitSelectCaseBody?: (ctx: SelectCaseBodyContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.caseBodyConstruct`.
	 * @param ctx the parse tree
	 */
	enterCaseBodyConstruct?: (ctx: CaseBodyConstructContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.caseBodyConstruct`.
	 * @param ctx the parse tree
	 */
	exitCaseBodyConstruct?: (ctx: CaseBodyConstructContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.caseStatement`.
	 * @param ctx the parse tree
	 */
	enterCaseStatement?: (ctx: CaseStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.caseStatement`.
	 * @param ctx the parse tree
	 */
	exitCaseStatement?: (ctx: CaseStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.endSelectStatement`.
	 * @param ctx the parse tree
	 */
	enterEndSelectStatement?: (ctx: EndSelectStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.endSelectStatement`.
	 * @param ctx the parse tree
	 */
	exitEndSelectStatement?: (ctx: EndSelectStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.caseSelector`.
	 * @param ctx the parse tree
	 */
	enterCaseSelector?: (ctx: CaseSelectorContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.caseSelector`.
	 * @param ctx the parse tree
	 */
	exitCaseSelector?: (ctx: CaseSelectorContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.caseValueRange`.
	 * @param ctx the parse tree
	 */
	enterCaseValueRange?: (ctx: CaseValueRangeContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.caseValueRange`.
	 * @param ctx the parse tree
	 */
	exitCaseValueRange?: (ctx: CaseValueRangeContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.doConstruct`.
	 * @param ctx the parse tree
	 */
	enterDoConstruct?: (ctx: DoConstructContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.doConstruct`.
	 * @param ctx the parse tree
	 */
	exitDoConstruct?: (ctx: DoConstructContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.blockDoConstruct`.
	 * @param ctx the parse tree
	 */
	enterBlockDoConstruct?: (ctx: BlockDoConstructContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.blockDoConstruct`.
	 * @param ctx the parse tree
	 */
	exitBlockDoConstruct?: (ctx: BlockDoConstructContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.labelDoStatement`.
	 * @param ctx the parse tree
	 */
	enterLabelDoStatement?: (ctx: LabelDoStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.labelDoStatement`.
	 * @param ctx the parse tree
	 */
	exitLabelDoStatement?: (ctx: LabelDoStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.loopControl`.
	 * @param ctx the parse tree
	 */
	enterLoopControl?: (ctx: LoopControlContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.loopControl`.
	 * @param ctx the parse tree
	 */
	exitLoopControl?: (ctx: LoopControlContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.int_Real_Dp_Expression`.
	 * @param ctx the parse tree
	 */
	enterInt_Real_Dp_Expression?: (ctx: Int_Real_Dp_ExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.int_Real_Dp_Expression`.
	 * @param ctx the parse tree
	 */
	exitInt_Real_Dp_Expression?: (ctx: Int_Real_Dp_ExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.endDoStatement`.
	 * @param ctx the parse tree
	 */
	enterEndDoStatement?: (ctx: EndDoStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.endDoStatement`.
	 * @param ctx the parse tree
	 */
	exitEndDoStatement?: (ctx: EndDoStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.execSqlStatement`.
	 * @param ctx the parse tree
	 */
	enterExecSqlStatement?: (ctx: ExecSqlStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.execSqlStatement`.
	 * @param ctx the parse tree
	 */
	exitExecSqlStatement?: (ctx: ExecSqlStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.cycleStatement`.
	 * @param ctx the parse tree
	 */
	enterCycleStatement?: (ctx: CycleStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.cycleStatement`.
	 * @param ctx the parse tree
	 */
	exitCycleStatement?: (ctx: CycleStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.exitStatement`.
	 * @param ctx the parse tree
	 */
	enterExitStatement?: (ctx: ExitStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.exitStatement`.
	 * @param ctx the parse tree
	 */
	exitExitStatement?: (ctx: ExitStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.goToKw`.
	 * @param ctx the parse tree
	 */
	enterGoToKw?: (ctx: GoToKwContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.goToKw`.
	 * @param ctx the parse tree
	 */
	exitGoToKw?: (ctx: GoToKwContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.gotoStatement`.
	 * @param ctx the parse tree
	 */
	enterGotoStatement?: (ctx: GotoStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.gotoStatement`.
	 * @param ctx the parse tree
	 */
	exitGotoStatement?: (ctx: GotoStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.computedGotoStatement`.
	 * @param ctx the parse tree
	 */
	enterComputedGotoStatement?: (ctx: ComputedGotoStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.computedGotoStatement`.
	 * @param ctx the parse tree
	 */
	exitComputedGotoStatement?: (ctx: ComputedGotoStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.lblRef`.
	 * @param ctx the parse tree
	 */
	enterLblRef?: (ctx: LblRefContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.lblRef`.
	 * @param ctx the parse tree
	 */
	exitLblRef?: (ctx: LblRefContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.scalarIntExpr`.
	 * @param ctx the parse tree
	 */
	enterScalarIntExpr?: (ctx: ScalarIntExprContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.scalarIntExpr`.
	 * @param ctx the parse tree
	 */
	exitScalarIntExpr?: (ctx: ScalarIntExprContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.assignStatement`.
	 * @param ctx the parse tree
	 */
	enterAssignStatement?: (ctx: AssignStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.assignStatement`.
	 * @param ctx the parse tree
	 */
	exitAssignStatement?: (ctx: AssignStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.assignedGotoStatement`.
	 * @param ctx the parse tree
	 */
	enterAssignedGotoStatement?: (ctx: AssignedGotoStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.assignedGotoStatement`.
	 * @param ctx the parse tree
	 */
	exitAssignedGotoStatement?: (ctx: AssignedGotoStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.arithmeticIfStatement`.
	 * @param ctx the parse tree
	 */
	enterArithmeticIfStatement?: (ctx: ArithmeticIfStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.arithmeticIfStatement`.
	 * @param ctx the parse tree
	 */
	exitArithmeticIfStatement?: (ctx: ArithmeticIfStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.scalarNumericExpr`.
	 * @param ctx the parse tree
	 */
	enterScalarNumericExpr?: (ctx: ScalarNumericExprContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.scalarNumericExpr`.
	 * @param ctx the parse tree
	 */
	exitScalarNumericExpr?: (ctx: ScalarNumericExprContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.continueStatement`.
	 * @param ctx the parse tree
	 */
	enterContinueStatement?: (ctx: ContinueStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.continueStatement`.
	 * @param ctx the parse tree
	 */
	exitContinueStatement?: (ctx: ContinueStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.stopStatement`.
	 * @param ctx the parse tree
	 */
	enterStopStatement?: (ctx: StopStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.stopStatement`.
	 * @param ctx the parse tree
	 */
	exitStopStatement?: (ctx: StopStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.pauseStatement`.
	 * @param ctx the parse tree
	 */
	enterPauseStatement?: (ctx: PauseStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.pauseStatement`.
	 * @param ctx the parse tree
	 */
	exitPauseStatement?: (ctx: PauseStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.unitIdentifier`.
	 * @param ctx the parse tree
	 */
	enterUnitIdentifier?: (ctx: UnitIdentifierContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.unitIdentifier`.
	 * @param ctx the parse tree
	 */
	exitUnitIdentifier?: (ctx: UnitIdentifierContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.openStatement`.
	 * @param ctx the parse tree
	 */
	enterOpenStatement?: (ctx: OpenStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.openStatement`.
	 * @param ctx the parse tree
	 */
	exitOpenStatement?: (ctx: OpenStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.connectSpecList`.
	 * @param ctx the parse tree
	 */
	enterConnectSpecList?: (ctx: ConnectSpecListContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.connectSpecList`.
	 * @param ctx the parse tree
	 */
	exitConnectSpecList?: (ctx: ConnectSpecListContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.connectSpec`.
	 * @param ctx the parse tree
	 */
	enterConnectSpec?: (ctx: ConnectSpecContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.connectSpec`.
	 * @param ctx the parse tree
	 */
	exitConnectSpec?: (ctx: ConnectSpecContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.closeStatement`.
	 * @param ctx the parse tree
	 */
	enterCloseStatement?: (ctx: CloseStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.closeStatement`.
	 * @param ctx the parse tree
	 */
	exitCloseStatement?: (ctx: CloseStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.closeSpecList`.
	 * @param ctx the parse tree
	 */
	enterCloseSpecList?: (ctx: CloseSpecListContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.closeSpecList`.
	 * @param ctx the parse tree
	 */
	exitCloseSpecList?: (ctx: CloseSpecListContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.closeSpec`.
	 * @param ctx the parse tree
	 */
	enterCloseSpec?: (ctx: CloseSpecContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.closeSpec`.
	 * @param ctx the parse tree
	 */
	exitCloseSpec?: (ctx: CloseSpecContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.readStatement`.
	 * @param ctx the parse tree
	 */
	enterReadStatement?: (ctx: ReadStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.readStatement`.
	 * @param ctx the parse tree
	 */
	exitReadStatement?: (ctx: ReadStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.writeStatement`.
	 * @param ctx the parse tree
	 */
	enterWriteStatement?: (ctx: WriteStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.writeStatement`.
	 * @param ctx the parse tree
	 */
	exitWriteStatement?: (ctx: WriteStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.printStatement`.
	 * @param ctx the parse tree
	 */
	enterPrintStatement?: (ctx: PrintStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.printStatement`.
	 * @param ctx the parse tree
	 */
	exitPrintStatement?: (ctx: PrintStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.ioControlSpec`.
	 * @param ctx the parse tree
	 */
	enterIoControlSpec?: (ctx: IoControlSpecContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.ioControlSpec`.
	 * @param ctx the parse tree
	 */
	exitIoControlSpec?: (ctx: IoControlSpecContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.ioControlSpecList`.
	 * @param ctx the parse tree
	 */
	enterIoControlSpecList?: (ctx: IoControlSpecListContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.ioControlSpecList`.
	 * @param ctx the parse tree
	 */
	exitIoControlSpecList?: (ctx: IoControlSpecListContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.rdCtlSpec`.
	 * @param ctx the parse tree
	 */
	enterRdCtlSpec?: (ctx: RdCtlSpecContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.rdCtlSpec`.
	 * @param ctx the parse tree
	 */
	exitRdCtlSpec?: (ctx: RdCtlSpecContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.rdUnitId`.
	 * @param ctx the parse tree
	 */
	enterRdUnitId?: (ctx: RdUnitIdContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.rdUnitId`.
	 * @param ctx the parse tree
	 */
	exitRdUnitId?: (ctx: RdUnitIdContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.rdIoCtlSpecList`.
	 * @param ctx the parse tree
	 */
	enterRdIoCtlSpecList?: (ctx: RdIoCtlSpecListContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.rdIoCtlSpecList`.
	 * @param ctx the parse tree
	 */
	exitRdIoCtlSpecList?: (ctx: RdIoCtlSpecListContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.rdFmtId`.
	 * @param ctx the parse tree
	 */
	enterRdFmtId?: (ctx: RdFmtIdContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.rdFmtId`.
	 * @param ctx the parse tree
	 */
	exitRdFmtId?: (ctx: RdFmtIdContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.rdFmtIdExpr`.
	 * @param ctx the parse tree
	 */
	enterRdFmtIdExpr?: (ctx: RdFmtIdExprContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.rdFmtIdExpr`.
	 * @param ctx the parse tree
	 */
	exitRdFmtIdExpr?: (ctx: RdFmtIdExprContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.formatIdentifier`.
	 * @param ctx the parse tree
	 */
	enterFormatIdentifier?: (ctx: FormatIdentifierContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.formatIdentifier`.
	 * @param ctx the parse tree
	 */
	exitFormatIdentifier?: (ctx: FormatIdentifierContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.inputItem`.
	 * @param ctx the parse tree
	 */
	enterInputItem?: (ctx: InputItemContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.inputItem`.
	 * @param ctx the parse tree
	 */
	exitInputItem?: (ctx: InputItemContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.inputItemList`.
	 * @param ctx the parse tree
	 */
	enterInputItemList?: (ctx: InputItemListContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.inputItemList`.
	 * @param ctx the parse tree
	 */
	exitInputItemList?: (ctx: InputItemListContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.outputItem`.
	 * @param ctx the parse tree
	 */
	enterOutputItem?: (ctx: OutputItemContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.outputItem`.
	 * @param ctx the parse tree
	 */
	exitOutputItem?: (ctx: OutputItemContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.outputItemList`.
	 * @param ctx the parse tree
	 */
	enterOutputItemList?: (ctx: OutputItemListContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.outputItemList`.
	 * @param ctx the parse tree
	 */
	exitOutputItemList?: (ctx: OutputItemListContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.inputImpliedDo`.
	 * @param ctx the parse tree
	 */
	enterInputImpliedDo?: (ctx: InputImpliedDoContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.inputImpliedDo`.
	 * @param ctx the parse tree
	 */
	exitInputImpliedDo?: (ctx: InputImpliedDoContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.outputImpliedDo`.
	 * @param ctx the parse tree
	 */
	enterOutputImpliedDo?: (ctx: OutputImpliedDoContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.outputImpliedDo`.
	 * @param ctx the parse tree
	 */
	exitOutputImpliedDo?: (ctx: OutputImpliedDoContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.backspaceStatement`.
	 * @param ctx the parse tree
	 */
	enterBackspaceStatement?: (ctx: BackspaceStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.backspaceStatement`.
	 * @param ctx the parse tree
	 */
	exitBackspaceStatement?: (ctx: BackspaceStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.endfileStatement`.
	 * @param ctx the parse tree
	 */
	enterEndfileStatement?: (ctx: EndfileStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.endfileStatement`.
	 * @param ctx the parse tree
	 */
	exitEndfileStatement?: (ctx: EndfileStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.rewindStatement`.
	 * @param ctx the parse tree
	 */
	enterRewindStatement?: (ctx: RewindStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.rewindStatement`.
	 * @param ctx the parse tree
	 */
	exitRewindStatement?: (ctx: RewindStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.deleteStatement`.
	 * @param ctx the parse tree
	 */
	enterDeleteStatement?: (ctx: DeleteStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.deleteStatement`.
	 * @param ctx the parse tree
	 */
	exitDeleteStatement?: (ctx: DeleteStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.positionSpec`.
	 * @param ctx the parse tree
	 */
	enterPositionSpec?: (ctx: PositionSpecContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.positionSpec`.
	 * @param ctx the parse tree
	 */
	exitPositionSpec?: (ctx: PositionSpecContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.deleteSpec`.
	 * @param ctx the parse tree
	 */
	enterDeleteSpec?: (ctx: DeleteSpecContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.deleteSpec`.
	 * @param ctx the parse tree
	 */
	exitDeleteSpec?: (ctx: DeleteSpecContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.inquireStatement`.
	 * @param ctx the parse tree
	 */
	enterInquireStatement?: (ctx: InquireStatementContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.inquireStatement`.
	 * @param ctx the parse tree
	 */
	exitInquireStatement?: (ctx: InquireStatementContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.inquireSpec`.
	 * @param ctx the parse tree
	 */
	enterInquireSpec?: (ctx: InquireSpecContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.inquireSpec`.
	 * @param ctx the parse tree
	 */
	exitInquireSpec?: (ctx: InquireSpecContext) => void;

	/**
	 * Enter a parse tree produced by `FortranParser.inquireSpecList`.
	 * @param ctx the parse tree
	 */
	enterInquireSpecList?: (ctx: InquireSpecListContext) => void;
	/**
	 * Exit a parse tree produced by `FortranParser.inquireSpecList`.
	 * @param ctx the parse tree
	 */
	exitInquireSpecList?: (ctx: InquireSpecListContext) => void;
}

