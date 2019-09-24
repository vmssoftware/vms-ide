// Generated from src/vms_fortran/parser/FortranParser.g4 by ANTLR 4.7.3-SNAPSHOT


import { ParseTreeVisitor } from "antlr4ts/tree/ParseTreeVisitor";

import { ProgramContext } from "./FortranParser";
import { ProgramUnitContext } from "./FortranParser";
import { MainProgramContext } from "./FortranParser";
import { MainRangeContext } from "./FortranParser";
import { BodyConstructContext } from "./FortranParser";
import { BodyContext } from "./FortranParser";
import { SpecificationPartConstructContext } from "./FortranParser";
import { DeclarationConstructContext } from "./FortranParser";
import { ExecutionPartConstructContext } from "./FortranParser";
import { SpecificationStatementContext } from "./FortranParser";
import { InternalSubProgPartContext } from "./FortranParser";
import { InternalSubprogramContext } from "./FortranParser";
import { ModuleSubprogramPartConstructContext } from "./FortranParser";
import { ModuleSubprogramContext } from "./FortranParser";
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
import { PositionSpecContext } from "./FortranParser";
import { InquireStatementContext } from "./FortranParser";
import { InquireSpecContext } from "./FortranParser";
import { InquireSpecListContext } from "./FortranParser";


/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by `FortranParser`.
 *
 * @param <Result> The return type of the visit operation. Use `void` for
 * operations with no return type.
 */
export interface FortranParserVisitor<Result> extends ParseTreeVisitor<Result> {
	/**
	 * Visit a parse tree produced by `FortranParser.program`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProgram?: (ctx: ProgramContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.programUnit`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProgramUnit?: (ctx: ProgramUnitContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.mainProgram`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMainProgram?: (ctx: MainProgramContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.mainRange`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMainRange?: (ctx: MainRangeContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.bodyConstruct`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitBodyConstruct?: (ctx: BodyConstructContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.body`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitBody?: (ctx: BodyContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.specificationPartConstruct`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSpecificationPartConstruct?: (ctx: SpecificationPartConstructContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.declarationConstruct`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDeclarationConstruct?: (ctx: DeclarationConstructContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.executionPartConstruct`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExecutionPartConstruct?: (ctx: ExecutionPartConstructContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.specificationStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSpecificationStatement?: (ctx: SpecificationStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.internalSubProgPart`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitInternalSubProgPart?: (ctx: InternalSubProgPartContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.internalSubprogram`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitInternalSubprogram?: (ctx: InternalSubprogramContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.moduleSubprogramPartConstruct`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitModuleSubprogramPartConstruct?: (ctx: ModuleSubprogramPartConstructContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.moduleSubprogram`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitModuleSubprogram?: (ctx: ModuleSubprogramContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.executableConstruct`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExecutableConstruct?: (ctx: ExecutableConstructContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.actionStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitActionStatement?: (ctx: ActionStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.definedOperator`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDefinedOperator?: (ctx: DefinedOperatorContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.eos`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEos?: (ctx: EosContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.intConst`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIntConst?: (ctx: IntConstContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.label`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLabel?: (ctx: LabelContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.identifier`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIdentifier?: (ctx: IdentifierContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.formatStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFormatStatement?: (ctx: FormatStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.formatItemList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFormatItemList?: (ctx: FormatItemListContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.formatItem`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFormatItem?: (ctx: FormatItemContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.formatEdit`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFormatEdit?: (ctx: FormatEditContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.editElement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEditElement?: (ctx: EditElementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.mislexedFcon`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMislexedFcon?: (ctx: MislexedFconContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.formatsep`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFormatsep?: (ctx: FormatsepContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.programStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProgramStatement?: (ctx: ProgramStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.endProgramStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEndProgramStatement?: (ctx: EndProgramStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.moduleBlock`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitModuleBlock?: (ctx: ModuleBlockContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.moduleBody`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitModuleBody?: (ctx: ModuleBodyContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.moduleStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitModuleStatement?: (ctx: ModuleStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitName?: (ctx: NameContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.letterName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLetterName?: (ctx: LetterNameContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.arrayName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitArrayName?: (ctx: ArrayNameContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.componentName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitComponentName?: (ctx: ComponentNameContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.genericName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitGenericName?: (ctx: GenericNameContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.namelistGroupName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitNamelistGroupName?: (ctx: NamelistGroupNameContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.typeName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTypeName?: (ctx: TypeNameContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.endName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEndName?: (ctx: EndNameContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.commonBlockName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCommonBlockName?: (ctx: CommonBlockNameContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.dummyArgName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDummyArgName?: (ctx: DummyArgNameContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.entryName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEntryName?: (ctx: EntryNameContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.externalName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExternalName?: (ctx: ExternalNameContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.functionName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFunctionName?: (ctx: FunctionNameContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.impliedDoVariable`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitImpliedDoVariable?: (ctx: ImpliedDoVariableContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.intrinsicProcedureName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIntrinsicProcedureName?: (ctx: IntrinsicProcedureNameContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.objectName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitObjectName?: (ctx: ObjectNameContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.programName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProgramName?: (ctx: ProgramNameContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.sFDummyArgName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSFDummyArgName?: (ctx: SFDummyArgNameContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.subroutineName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSubroutineName?: (ctx: SubroutineNameContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.subroutineNameUse`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSubroutineNameUse?: (ctx: SubroutineNameUseContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.procedureName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProcedureName?: (ctx: ProcedureNameContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.variableName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitVariableName?: (ctx: VariableNameContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.moduleName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitModuleName?: (ctx: ModuleNameContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.useName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUseName?: (ctx: UseNameContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.blockDataName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitBlockDataName?: (ctx: BlockDataNameContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.namedConstant`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitNamedConstant?: (ctx: NamedConstantContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.namedConstantUse`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitNamedConstantUse?: (ctx: NamedConstantUseContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.ifConstructName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIfConstructName?: (ctx: IfConstructNameContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.endModuleStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEndModuleStatement?: (ctx: EndModuleStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.includeStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIncludeStatement?: (ctx: IncludeStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.useStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUseStatement?: (ctx: UseStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.renameList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRenameList?: (ctx: RenameListContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.onlyList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOnlyList?: (ctx: OnlyListContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.rename`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRename?: (ctx: RenameContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.only`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOnly?: (ctx: OnlyContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.blockDataSubprogramBlock`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitBlockDataSubprogramBlock?: (ctx: BlockDataSubprogramBlockContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.blockDataBody`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitBlockDataBody?: (ctx: BlockDataBodyContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.blockDataBodyConstruct`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitBlockDataBodyConstruct?: (ctx: BlockDataBodyConstructContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.blockDataStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitBlockDataStatement?: (ctx: BlockDataStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.endBlockDataStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEndBlockDataStatement?: (ctx: EndBlockDataStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.interfaceBlock`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitInterfaceBlock?: (ctx: InterfaceBlockContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.interfaceBlockPart`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitInterfaceBlockPart?: (ctx: InterfaceBlockPartContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.interfaceStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitInterfaceStatement?: (ctx: InterfaceStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.endInterfaceStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEndInterfaceStatement?: (ctx: EndInterfaceStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.interfaceBody`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitInterfaceBody?: (ctx: InterfaceBodyContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.functionInterfaceRange`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFunctionInterfaceRange?: (ctx: FunctionInterfaceRangeContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.subroutineInterfaceRange`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSubroutineInterfaceRange?: (ctx: SubroutineInterfaceRangeContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.subprogramInterfaceBody`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSubprogramInterfaceBody?: (ctx: SubprogramInterfaceBodyContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.structureBlock`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStructureBlock?: (ctx: StructureBlockContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.structureBlockPart`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStructureBlockPart?: (ctx: StructureBlockPartContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.structureStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStructureStatement?: (ctx: StructureStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.typeStatementName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTypeStatementName?: (ctx: TypeStatementNameContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.endStructureStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEndStructureStatement?: (ctx: EndStructureStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.structureBody`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStructureBody?: (ctx: StructureBodyContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.recordBlock`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRecordBlock?: (ctx: RecordBlockContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.recordStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRecordStatement?: (ctx: RecordStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.moduleProcedureStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitModuleProcedureStatement?: (ctx: ModuleProcedureStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.procedureNameList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProcedureNameList?: (ctx: ProcedureNameListContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.genericSpec`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitGenericSpec?: (ctx: GenericSpecContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.externalStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExternalStatement?: (ctx: ExternalStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.intrinsicStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIntrinsicStatement?: (ctx: IntrinsicStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.functionReference`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFunctionReference?: (ctx: FunctionReferenceContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.callStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCallStatement?: (ctx: CallStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.actualArg`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitActualArg?: (ctx: ActualArgContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.functionArgList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFunctionArgList?: (ctx: FunctionArgListContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.functionArg`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFunctionArg?: (ctx: FunctionArgContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.functionSubprogram`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFunctionSubprogram?: (ctx: FunctionSubprogramContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.functionDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFunctionDeclaration?: (ctx: FunctionDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.functionBody`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFunctionBody?: (ctx: FunctionBodyContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.functionPrefix`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFunctionPrefix?: (ctx: FunctionPrefixContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.endFunctionStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEndFunctionStatement?: (ctx: EndFunctionStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.subroutineSubprogram`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSubroutineSubprogram?: (ctx: SubroutineSubprogramContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.subroutineDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSubroutineDeclaration?: (ctx: SubroutineDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.subroutineBody`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSubroutineBody?: (ctx: SubroutineBodyContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.subroutineStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSubroutineStatement?: (ctx: SubroutineStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.subroutineParList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSubroutineParList?: (ctx: SubroutineParListContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.subroutinePar`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSubroutinePar?: (ctx: SubroutineParContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.functionParList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFunctionParList?: (ctx: FunctionParListContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.functionPar`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFunctionPar?: (ctx: FunctionParContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.endSubroutineStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEndSubroutineStatement?: (ctx: EndSubroutineStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.entryStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEntryStatement?: (ctx: EntryStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.returnStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitReturnStatement?: (ctx: ReturnStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.containsStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitContainsStatement?: (ctx: ContainsStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.stmtFunctionStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStmtFunctionStatement?: (ctx: StmtFunctionStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.sFDummyArgNameList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSFDummyArgNameList?: (ctx: SFDummyArgNameListContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.unsignedArithmeticConstant`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUnsignedArithmeticConstant?: (ctx: UnsignedArithmeticConstantContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.kindParam`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitKindParam?: (ctx: KindParamContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.constant`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitConstant?: (ctx: ConstantContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.bozLiteralConstant`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitBozLiteralConstant?: (ctx: BozLiteralConstantContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.logicalConstant`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLogicalConstant?: (ctx: LogicalConstantContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.derivedTypeDef`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDerivedTypeDef?: (ctx: DerivedTypeDefContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.derivedTypeBody`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDerivedTypeBody?: (ctx: DerivedTypeBodyContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.privateSequenceStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPrivateSequenceStatement?: (ctx: PrivateSequenceStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.derivedTypeStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDerivedTypeStatement?: (ctx: DerivedTypeStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.endTypeStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEndTypeStatement?: (ctx: EndTypeStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.componentDefStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitComponentDefStatement?: (ctx: ComponentDefStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.componentAttrSpecList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitComponentAttrSpecList?: (ctx: ComponentAttrSpecListContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.componentAttrSpec`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitComponentAttrSpec?: (ctx: ComponentAttrSpecContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.componentArraySpec`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitComponentArraySpec?: (ctx: ComponentArraySpecContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.componentDecl`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitComponentDecl?: (ctx: ComponentDeclContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.componentDeclList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitComponentDeclList?: (ctx: ComponentDeclListContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.structureConstructor`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStructureConstructor?: (ctx: StructureConstructorContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.arrayConstructor`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitArrayConstructor?: (ctx: ArrayConstructorContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.acValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAcValue?: (ctx: AcValueContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.acValueList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAcValueList?: (ctx: AcValueListContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.acImpliedDo`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAcImpliedDo?: (ctx: AcImpliedDoContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.typeDeclarationStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTypeDeclarationStatement?: (ctx: TypeDeclarationStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.typeSpec`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTypeSpec?: (ctx: TypeSpecContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.attrSpec`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAttrSpec?: (ctx: AttrSpecContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.entityDecl`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEntityDecl?: (ctx: EntityDeclContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.kindSelector`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitKindSelector?: (ctx: KindSelectorContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.charSelector`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCharSelector?: (ctx: CharSelectorContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.lengthSelector`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLengthSelector?: (ctx: LengthSelectorContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.charLength`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCharLength?: (ctx: CharLengthContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.typeParamValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTypeParamValue?: (ctx: TypeParamValueContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.accessSpec`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAccessSpec?: (ctx: AccessSpecContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.intentSpec`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIntentSpec?: (ctx: IntentSpecContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.arraySpec`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitArraySpec?: (ctx: ArraySpecContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.explicitShapeSpecList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExplicitShapeSpecList?: (ctx: ExplicitShapeSpecListContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.explicitShapeSpec`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExplicitShapeSpec?: (ctx: ExplicitShapeSpecContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.lowerBound`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLowerBound?: (ctx: LowerBoundContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.upperBound`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUpperBound?: (ctx: UpperBoundContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.assumedShapeSpec`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAssumedShapeSpec?: (ctx: AssumedShapeSpecContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.assumedShapeSpecList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAssumedShapeSpecList?: (ctx: AssumedShapeSpecListContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.deferredShapeSpecList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDeferredShapeSpecList?: (ctx: DeferredShapeSpecListContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.deferredShapeSpec`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDeferredShapeSpec?: (ctx: DeferredShapeSpecContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.assumedSizeSpec`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAssumedSizeSpec?: (ctx: AssumedSizeSpecContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.intentStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIntentStatement?: (ctx: IntentStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.intentParList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIntentParList?: (ctx: IntentParListContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.intentPar`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIntentPar?: (ctx: IntentParContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.optionalStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOptionalStatement?: (ctx: OptionalStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.optionalParList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOptionalParList?: (ctx: OptionalParListContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.optionalPar`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOptionalPar?: (ctx: OptionalParContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.accessStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAccessStatement?: (ctx: AccessStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.accessIdList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAccessIdList?: (ctx: AccessIdListContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.accessId`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAccessId?: (ctx: AccessIdContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.saveStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSaveStatement?: (ctx: SaveStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.savedEntityList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSavedEntityList?: (ctx: SavedEntityListContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.savedEntity`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSavedEntity?: (ctx: SavedEntityContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.dimensionStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDimensionStatement?: (ctx: DimensionStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.arrayDeclaratorList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitArrayDeclaratorList?: (ctx: ArrayDeclaratorListContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.arrayDeclarator`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitArrayDeclarator?: (ctx: ArrayDeclaratorContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.allocatableStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAllocatableStatement?: (ctx: AllocatableStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.arrayAllocationList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitArrayAllocationList?: (ctx: ArrayAllocationListContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.arrayAllocation`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitArrayAllocation?: (ctx: ArrayAllocationContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.pointerStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPointerStatement?: (ctx: PointerStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.pointerStatementObjectList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPointerStatementObjectList?: (ctx: PointerStatementObjectListContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.pointerStatementObject`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPointerStatementObject?: (ctx: PointerStatementObjectContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.targetStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTargetStatement?: (ctx: TargetStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.targetObjectList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTargetObjectList?: (ctx: TargetObjectListContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.targetObject`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTargetObject?: (ctx: TargetObjectContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.dataStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDataStatement?: (ctx: DataStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.datalist`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDatalist?: (ctx: DatalistContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.dataStatementSet`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDataStatementSet?: (ctx: DataStatementSetContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.dataStatementObjectList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDataStatementObjectList?: (ctx: DataStatementObjectListContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.dataStatementObject`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDataStatementObject?: (ctx: DataStatementObjectContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.dataStatementValueList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDataStatementValueList?: (ctx: DataStatementValueListContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.dataStatementValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDataStatementValue?: (ctx: DataStatementValueContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.dataImpliedDo`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDataImpliedDo?: (ctx: DataImpliedDoContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.dataIDoObjectList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDataIDoObjectList?: (ctx: DataIDoObjectListContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.dataIDoObject`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDataIDoObject?: (ctx: DataIDoObjectContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.parameterStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParameterStatement?: (ctx: ParameterStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.namedConstantDefList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitNamedConstantDefList?: (ctx: NamedConstantDefListContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.namedConstantDef`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitNamedConstantDef?: (ctx: NamedConstantDefContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.implicitStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitImplicitStatement?: (ctx: ImplicitStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.implicitSpec`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitImplicitSpec?: (ctx: ImplicitSpecContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.letterSpec`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLetterSpec?: (ctx: LetterSpecContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.namelistStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitNamelistStatement?: (ctx: NamelistStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.namelistGroup`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitNamelistGroup?: (ctx: NamelistGroupContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.namelistGroupObject`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitNamelistGroupObject?: (ctx: NamelistGroupObjectContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.equivalenceStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEquivalenceStatement?: (ctx: EquivalenceStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.equivalenceSetList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEquivalenceSetList?: (ctx: EquivalenceSetListContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.equivalenceSet`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEquivalenceSet?: (ctx: EquivalenceSetContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.equivalenceObject`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEquivalenceObject?: (ctx: EquivalenceObjectContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.commonStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCommonStatement?: (ctx: CommonStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.comblock`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitComblock?: (ctx: ComblockContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.commonBlockObject`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCommonBlockObject?: (ctx: CommonBlockObjectContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.commonBlockObjectList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCommonBlockObjectList?: (ctx: CommonBlockObjectListContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.scalarVariable`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitScalarVariable?: (ctx: ScalarVariableContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.variable`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitVariable?: (ctx: VariableContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.subscript`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSubscript?: (ctx: SubscriptContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.dataRef`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDataRef?: (ctx: DataRefContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.sectionSubscriptList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSectionSubscriptList?: (ctx: SectionSubscriptListContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.sectionSubscript`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSectionSubscript?: (ctx: SectionSubscriptContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.substringRange`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSubstringRange?: (ctx: SubstringRangeContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.structureComponent`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStructureComponent?: (ctx: StructureComponentContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.fieldSelector`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFieldSelector?: (ctx: FieldSelectorContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.arrayElement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitArrayElement?: (ctx: ArrayElementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.subscriptTriplet`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSubscriptTriplet?: (ctx: SubscriptTripletContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.allocateStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAllocateStatement?: (ctx: AllocateStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.allocationList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAllocationList?: (ctx: AllocationListContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.allocation`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAllocation?: (ctx: AllocationContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.allocatedShape`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAllocatedShape?: (ctx: AllocatedShapeContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.allocateObjectList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAllocateObjectList?: (ctx: AllocateObjectListContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.allocateObject`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAllocateObject?: (ctx: AllocateObjectContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.allocateShapeSpec`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAllocateShapeSpec?: (ctx: AllocateShapeSpecContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.nullifyStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitNullifyStatement?: (ctx: NullifyStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.pointerObjectList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPointerObjectList?: (ctx: PointerObjectListContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.pointerObject`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPointerObject?: (ctx: PointerObjectContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.pointerField`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPointerField?: (ctx: PointerFieldContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.deallocateStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDeallocateStatement?: (ctx: DeallocateStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.uFExpr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUFExpr?: (ctx: UFExprContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.uFTerm`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUFTerm?: (ctx: UFTermContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.uFFactor`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUFFactor?: (ctx: UFFactorContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.uFPrimary`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUFPrimary?: (ctx: UFPrimaryContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.cExpr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCExpr?: (ctx: CExprContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.cPrimary`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCPrimary?: (ctx: CPrimaryContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.cOperand`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCOperand?: (ctx: COperandContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.complexConst`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitComplexConst?: (ctx: ComplexConstContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.primary`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPrimary?: (ctx: PrimaryContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.level1Expr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLevel1Expr?: (ctx: Level1ExprContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.multOperand`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMultOperand?: (ctx: MultOperandContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.addOperand`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAddOperand?: (ctx: AddOperandContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.level2Expr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLevel2Expr?: (ctx: Level2ExprContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.powerOp`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPowerOp?: (ctx: PowerOpContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.multOp`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMultOp?: (ctx: MultOpContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.addOp`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAddOp?: (ctx: AddOpContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.sign`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSign?: (ctx: SignContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.level3Expr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLevel3Expr?: (ctx: Level3ExprContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.concatOp`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitConcatOp?: (ctx: ConcatOpContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.level4Expr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLevel4Expr?: (ctx: Level4ExprContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.relOp`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRelOp?: (ctx: RelOpContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.andOperand`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAndOperand?: (ctx: AndOperandContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.orOperand`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOrOperand?: (ctx: OrOperandContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.equivOperand`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEquivOperand?: (ctx: EquivOperandContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.level5Expr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLevel5Expr?: (ctx: Level5ExprContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.notOp`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitNotOp?: (ctx: NotOpContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.andOp`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAndOp?: (ctx: AndOpContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.orOp`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOrOp?: (ctx: OrOpContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.equivOp`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEquivOp?: (ctx: EquivOpContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.expr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExpr?: (ctx: ExprContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.specificationExpr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSpecificationExpr?: (ctx: SpecificationExprContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.assignmentStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAssignmentStatement?: (ctx: AssignmentStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.sFExprList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSFExprList?: (ctx: SFExprListContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.sFExpr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSFExpr?: (ctx: SFExprContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.sFTerm`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSFTerm?: (ctx: SFTermContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.sFFactor`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSFFactor?: (ctx: SFFactorContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.sFPrimary`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSFPrimary?: (ctx: SFPrimaryContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.pointerAssignmentStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPointerAssignmentStatement?: (ctx: PointerAssignmentStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.pointerAssignmentItem`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPointerAssignmentItem?: (ctx: PointerAssignmentItemContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.target`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTarget?: (ctx: TargetContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.whereStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitWhereStatement?: (ctx: WhereStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.whereConstruct`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitWhereConstruct?: (ctx: WhereConstructContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.whereConstructStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitWhereConstructStatement?: (ctx: WhereConstructStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.maskExpr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMaskExpr?: (ctx: MaskExprContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.elsewhereStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitElsewhereStatement?: (ctx: ElsewhereStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.endWhereStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEndWhereStatement?: (ctx: EndWhereStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.ifConstruct`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIfConstruct?: (ctx: IfConstructContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.ifThenStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIfThenStatement?: (ctx: IfThenStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.elseIfStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitElseIfStatement?: (ctx: ElseIfStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.elseStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitElseStatement?: (ctx: ElseStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.endIfStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEndIfStatement?: (ctx: EndIfStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.ifStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIfStatement?: (ctx: IfStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.scalarLogicalExpr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitScalarLogicalExpr?: (ctx: ScalarLogicalExprContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.caseConstruct`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCaseConstruct?: (ctx: CaseConstructContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.selectCaseRange`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSelectCaseRange?: (ctx: SelectCaseRangeContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.selectCaseBody`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSelectCaseBody?: (ctx: SelectCaseBodyContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.caseBodyConstruct`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCaseBodyConstruct?: (ctx: CaseBodyConstructContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.caseStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCaseStatement?: (ctx: CaseStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.endSelectStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEndSelectStatement?: (ctx: EndSelectStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.caseSelector`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCaseSelector?: (ctx: CaseSelectorContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.caseValueRange`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCaseValueRange?: (ctx: CaseValueRangeContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.doConstruct`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDoConstruct?: (ctx: DoConstructContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.blockDoConstruct`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitBlockDoConstruct?: (ctx: BlockDoConstructContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.labelDoStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLabelDoStatement?: (ctx: LabelDoStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.loopControl`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLoopControl?: (ctx: LoopControlContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.int_Real_Dp_Expression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitInt_Real_Dp_Expression?: (ctx: Int_Real_Dp_ExpressionContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.endDoStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEndDoStatement?: (ctx: EndDoStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.cycleStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCycleStatement?: (ctx: CycleStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.exitStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExitStatement?: (ctx: ExitStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.goToKw`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitGoToKw?: (ctx: GoToKwContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.gotoStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitGotoStatement?: (ctx: GotoStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.computedGotoStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitComputedGotoStatement?: (ctx: ComputedGotoStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.lblRef`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLblRef?: (ctx: LblRefContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.scalarIntExpr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitScalarIntExpr?: (ctx: ScalarIntExprContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.assignStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAssignStatement?: (ctx: AssignStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.assignedGotoStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAssignedGotoStatement?: (ctx: AssignedGotoStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.arithmeticIfStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitArithmeticIfStatement?: (ctx: ArithmeticIfStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.scalarNumericExpr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitScalarNumericExpr?: (ctx: ScalarNumericExprContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.continueStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitContinueStatement?: (ctx: ContinueStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.stopStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStopStatement?: (ctx: StopStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.pauseStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPauseStatement?: (ctx: PauseStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.unitIdentifier`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUnitIdentifier?: (ctx: UnitIdentifierContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.openStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOpenStatement?: (ctx: OpenStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.connectSpecList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitConnectSpecList?: (ctx: ConnectSpecListContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.connectSpec`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitConnectSpec?: (ctx: ConnectSpecContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.closeStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCloseStatement?: (ctx: CloseStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.closeSpecList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCloseSpecList?: (ctx: CloseSpecListContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.closeSpec`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCloseSpec?: (ctx: CloseSpecContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.readStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitReadStatement?: (ctx: ReadStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.writeStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitWriteStatement?: (ctx: WriteStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.printStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPrintStatement?: (ctx: PrintStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.ioControlSpec`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIoControlSpec?: (ctx: IoControlSpecContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.ioControlSpecList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIoControlSpecList?: (ctx: IoControlSpecListContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.rdCtlSpec`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRdCtlSpec?: (ctx: RdCtlSpecContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.rdUnitId`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRdUnitId?: (ctx: RdUnitIdContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.rdIoCtlSpecList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRdIoCtlSpecList?: (ctx: RdIoCtlSpecListContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.rdFmtId`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRdFmtId?: (ctx: RdFmtIdContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.rdFmtIdExpr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRdFmtIdExpr?: (ctx: RdFmtIdExprContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.formatIdentifier`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFormatIdentifier?: (ctx: FormatIdentifierContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.inputItem`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitInputItem?: (ctx: InputItemContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.inputItemList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitInputItemList?: (ctx: InputItemListContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.outputItem`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOutputItem?: (ctx: OutputItemContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.outputItemList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOutputItemList?: (ctx: OutputItemListContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.inputImpliedDo`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitInputImpliedDo?: (ctx: InputImpliedDoContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.outputImpliedDo`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOutputImpliedDo?: (ctx: OutputImpliedDoContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.backspaceStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitBackspaceStatement?: (ctx: BackspaceStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.endfileStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEndfileStatement?: (ctx: EndfileStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.rewindStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRewindStatement?: (ctx: RewindStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.positionSpec`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPositionSpec?: (ctx: PositionSpecContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.inquireStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitInquireStatement?: (ctx: InquireStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.inquireSpec`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitInquireSpec?: (ctx: InquireSpecContext) => Result;

	/**
	 * Visit a parse tree produced by `FortranParser.inquireSpecList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitInquireSpecList?: (ctx: InquireSpecListContext) => Result;
}

