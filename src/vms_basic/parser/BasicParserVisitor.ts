// Generated from src/vms_basic/parser/BasicParser.g4 by ANTLR 4.9.0-SNAPSHOT


import { ParseTreeVisitor } from "antlr4ts/tree/ParseTreeVisitor";

import { IdentifierContext } from "./BasicParser";
import { NumberContext } from "./BasicParser";
import { NewlineContext } from "./BasicParser";
import { ComNameContext } from "./BasicParser";
import { FileSpecContext } from "./BasicParser";
import { TargetNameContext } from "./BasicParser";
import { VariableNameContext } from "./BasicParser";
import { VariableChildNameContext } from "./BasicParser";
import { HandlerNameContext } from "./BasicParser";
import { MapNameContext } from "./BasicParser";
import { RoutineNameContext } from "./BasicParser";
import { PictureNameContext } from "./BasicParser";
import { RecNameContext } from "./BasicParser";
import { RecNameEndContext } from "./BasicParser";
import { GroupNameContext } from "./BasicParser";
import { GroupNameEndContext } from "./BasicParser";
import { StringVariableNameContext } from "./BasicParser";
import { UnqStrContext } from "./BasicParser";
import { NumericVariableNameContext } from "./BasicParser";
import { ArrayVariableNameContext } from "./BasicParser";
import { ConstNameContext } from "./BasicParser";
import { ConstExpContext } from "./BasicParser";
import { RecExpContext } from "./BasicParser";
import { RfaExpContext } from "./BasicParser";
import { IntConstContext } from "./BasicParser";
import { StrConstContext } from "./BasicParser";
import { RepCntContext } from "./BasicParser";
import { IntExpContext } from "./BasicParser";
import { RealExpContext } from "./BasicParser";
import { NumExpContext } from "./BasicParser";
import { StrExpContext } from "./BasicParser";
import { ChnlExpContext } from "./BasicParser";
import { CondExpContext } from "./BasicParser";
import { LexVarContext } from "./BasicParser";
import { LexExpContext } from "./BasicParser";
import { EolContext } from "./BasicParser";
import { EqualsExpnContext } from "./BasicParser";
import { LabelContext } from "./BasicParser";
import { ProgramContext } from "./BasicParser";
import { ProgramUnitContext } from "./BasicParser";
import { MainProgramContext } from "./BasicParser";
import { ProgramStatementContext } from "./BasicParser";
import { EndProgramStatementContext } from "./BasicParser";
import { DeclarationOrStatementContext } from "./BasicParser";
import { DirectiveContext } from "./BasicParser";
import { TitleDirectiveContext } from "./BasicParser";
import { IncludeDirectiveContext } from "./BasicParser";
import { AllDirectiveContext } from "./BasicParser";
import { PIfDirectiveContext } from "./BasicParser";
import { DeclarationContext } from "./BasicParser";
import { RecordDeclarationContext } from "./BasicParser";
import { RecComponentContext } from "./BasicParser";
import { RecItemContext } from "./BasicParser";
import { GroupClauseContext } from "./BasicParser";
import { GroupExpnContext } from "./BasicParser";
import { VariantClauseContext } from "./BasicParser";
import { CaseClauseContext } from "./BasicParser";
import { DataTypeContext } from "./BasicParser";
import { VariableDeclarationContext } from "./BasicParser";
import { VariableDescriptionPartContext } from "./BasicParser";
import { VariableDescriptionContext } from "./BasicParser";
import { SingleVarDescriptionContext } from "./BasicParser";
import { InitialValueContext } from "./BasicParser";
import { ArrayDescriptionContext } from "./BasicParser";
import { SubscriptExpnContext } from "./BasicParser";
import { ConstantDeclarationContext } from "./BasicParser";
import { ConstantDescriptionContext } from "./BasicParser";
import { DeclareSubprogramDeclarationContext } from "./BasicParser";
import { DeclareArgumentDescriptionContext } from "./BasicParser";
import { SubprogramDeclarationContext } from "./BasicParser";
import { FunctionDeclarationContext } from "./BasicParser";
import { FunctionHeaderContext } from "./BasicParser";
import { FunctionEndContext } from "./BasicParser";
import { SubroutineDeclarationContext } from "./BasicParser";
import { SubroutineHeaderContext } from "./BasicParser";
import { SubroutineEndContext } from "./BasicParser";
import { SubScopeContext } from "./BasicParser";
import { SubprogramArgumentDescriptionContext } from "./BasicParser";
import { SubprogramArgumentContext } from "./BasicParser";
import { ByrefOrByvalContext } from "./BasicParser";
import { ExternVarConstDeclarationContext } from "./BasicParser";
import { ExternSubprogramDeclarationContext } from "./BasicParser";
import { ExternSubprogramDescriptContext } from "./BasicParser";
import { ExternSubprogramArgumentDescriptionContext } from "./BasicParser";
import { ExternSubprogramArgumentContext } from "./BasicParser";
import { ExternPictureDeclarationContext } from "./BasicParser";
import { DefFunctionSingleDeclarationContext } from "./BasicParser";
import { DefFunctionMultyDeclarationContext } from "./BasicParser";
import { DefFunctionHeaderContext } from "./BasicParser";
import { MapDeclarationContext } from "./BasicParser";
import { MapItemContext } from "./BasicParser";
import { MapDynDeclarationContext } from "./BasicParser";
import { MapDescriptionPartContext } from "./BasicParser";
import { MapVariableItemContext } from "./BasicParser";
import { CommonDeclarationContext } from "./BasicParser";
import { DimensionDeclarationContext } from "./BasicParser";
import { DimensionItemContext } from "./BasicParser";
import { DimensionArrayContext } from "./BasicParser";
import { DimensionExpnContext } from "./BasicParser";
import { MatDeclarationContext } from "./BasicParser";
import { MatClauseContext } from "./BasicParser";
import { MatArithmeticDeclarationContext } from "./BasicParser";
import { MatOpContext } from "./BasicParser";
import { VariableContext } from "./BasicParser";
import { ExpressionContext } from "./BasicParser";
import { RelationaloperatorContext } from "./BasicParser";
import { SimpleExpressionContext } from "./BasicParser";
import { AdditiveoperatorContext } from "./BasicParser";
import { TermContext } from "./BasicParser";
import { MultiplicativeoperatorContext } from "./BasicParser";
import { SignedFactorContext } from "./BasicParser";
import { FactorContext } from "./BasicParser";
import { UnsignedConstantContext } from "./BasicParser";
import { VariableIntContext } from "./BasicParser";
import { ExpressionIntContext } from "./BasicParser";
import { SimpleExpressionIntContext } from "./BasicParser";
import { TermIntContext } from "./BasicParser";
import { SignedFactorIntContext } from "./BasicParser";
import { FactorIntContext } from "./BasicParser";
import { UnsignedConstantIntContext } from "./BasicParser";
import { VariableStrContext } from "./BasicParser";
import { ExpressionStrContext } from "./BasicParser";
import { SimpleExpressionStrContext } from "./BasicParser";
import { TermStrContext } from "./BasicParser";
import { SignedFactorStrContext } from "./BasicParser";
import { FactorStrContext } from "./BasicParser";
import { UnsignedConstantStrContext } from "./BasicParser";
import { FunctionDesignatorRealContext } from "./BasicParser";
import { FunctionDesignatorIntContext } from "./BasicParser";
import { FunctionDesignatorSrtContext } from "./BasicParser";
import { ParameterListContext } from "./BasicParser";
import { SetContext } from "./BasicParser";
import { ElementListContext } from "./BasicParser";
import { ElementContext } from "./BasicParser";
import { ActualParameterContext } from "./BasicParser";
import { VariableLexContext } from "./BasicParser";
import { ExpressionLexContext } from "./BasicParser";
import { SimpleExpressionLexContext } from "./BasicParser";
import { TermLexContext } from "./BasicParser";
import { SignedFactorLexContext } from "./BasicParser";
import { FactorLexContext } from "./BasicParser";
import { UnsignedConstantLexContext } from "./BasicParser";
import { SetLexContext } from "./BasicParser";
import { ElementListLexContext } from "./BasicParser";
import { ElementLexContext } from "./BasicParser";
import { StatementContext } from "./BasicParser";
import { RemapStatementContext } from "./BasicParser";
import { RemapItemContext } from "./BasicParser";
import { AssignmentStatementContext } from "./BasicParser";
import { CallStatementContext } from "./BasicParser";
import { SubroutineParamsContext } from "./BasicParser";
import { CauseErrorStatementContext } from "./BasicParser";
import { ChainStatementContext } from "./BasicParser";
import { ChangeStatementContext } from "./BasicParser";
import { CloseStatementContext } from "./BasicParser";
import { ContinueStatementContext } from "./BasicParser";
import { DataStatementContext } from "./BasicParser";
import { DeleteStatementContext } from "./BasicParser";
import { ExitStatementContext } from "./BasicParser";
import { FieldStatementContext } from "./BasicParser";
import { FindStatementContext } from "./BasicParser";
import { PositionClauseContext } from "./BasicParser";
import { LockClauseContext } from "./BasicParser";
import { AllowClauseContext } from "./BasicParser";
import { KeyClauseContext } from "./BasicParser";
import { RelOpContext } from "./BasicParser";
import { FreeStatementContext } from "./BasicParser";
import { GoSubStatementContext } from "./BasicParser";
import { GotoStatementContext } from "./BasicParser";
import { InputStatementContext } from "./BasicParser";
import { InputLineStatementContext } from "./BasicParser";
import { InputArgsContext } from "./BasicParser";
import { IterateStatementContext } from "./BasicParser";
import { KillStatementContext } from "./BasicParser";
import { LsetStatementContext } from "./BasicParser";
import { MarginStatementContext } from "./BasicParser";
import { MatInputStatementContext } from "./BasicParser";
import { MatInputArrayContext } from "./BasicParser";
import { MatPrintStatementContext } from "./BasicParser";
import { MatReadStatementContext } from "./BasicParser";
import { MidStatementContext } from "./BasicParser";
import { MoveStatementContext } from "./BasicParser";
import { MoveItemContext } from "./BasicParser";
import { VariableDescriptionStatementContext } from "./BasicParser";
import { NameAsStatementContext } from "./BasicParser";
import { NomarginStatementContext } from "./BasicParser";
import { OnErrorGoBackStatementContext } from "./BasicParser";
import { OnErrorGoToBackStatementContext } from "./BasicParser";
import { OnGoSubToBackStatementContext } from "./BasicParser";
import { OpenStatementContext } from "./BasicParser";
import { OpenClauseContext } from "./BasicParser";
import { AccessSpecContext } from "./BasicParser";
import { AccessModeContext } from "./BasicParser";
import { AllowSpecContext } from "./BasicParser";
import { AllowModeContext } from "./BasicParser";
import { OrgSpecContext } from "./BasicParser";
import { OrgModeContext } from "./BasicParser";
import { OrgMode2Context } from "./BasicParser";
import { RecSpecContext } from "./BasicParser";
import { RecModeContext } from "./BasicParser";
import { KeyOpenClauseContext } from "./BasicParser";
import { OptionStatementContext } from "./BasicParser";
import { OptionClauseContext } from "./BasicParser";
import { AngleClauseContext } from "./BasicParser";
import { HandleClauseContext } from "./BasicParser";
import { ConstTypeClauseContext } from "./BasicParser";
import { TypeClauseContext } from "./BasicParser";
import { SizeClauseContext } from "./BasicParser";
import { SizItemContext } from "./BasicParser";
import { IntClauseContext } from "./BasicParser";
import { RealClauseContext } from "./BasicParser";
import { ActiveClauseContext } from "./BasicParser";
import { ActiveItemContext } from "./BasicParser";
import { PrintStatementContext } from "./BasicParser";
import { PutStatementContext } from "./BasicParser";
import { RandomStatementContext } from "./BasicParser";
import { ReadStatementContext } from "./BasicParser";
import { ResetStatementContext } from "./BasicParser";
import { RestoreStatementContext } from "./BasicParser";
import { ResumeStatementContext } from "./BasicParser";
import { RetryStatementContext } from "./BasicParser";
import { ReturnStatementContext } from "./BasicParser";
import { RsetStatementContext } from "./BasicParser";
import { ScratchStatementContext } from "./BasicParser";
import { SetPromptStatementContext } from "./BasicParser";
import { SleepStatementContext } from "./BasicParser";
import { StopStatementContext } from "./BasicParser";
import { UnlockStatementContext } from "./BasicParser";
import { UpdateStatementContext } from "./BasicParser";
import { WaitStatementContext } from "./BasicParser";
import { WhenErrorInStatementContext } from "./BasicParser";
import { WhenErrorUseStatementContext } from "./BasicParser";
import { HandlerUseStatementContext } from "./BasicParser";
import { IfStatementContext } from "./BasicParser";
import { IfConditionContext } from "./BasicParser";
import { IfStatementModifierContext } from "./BasicParser";
import { ElsifClauseContext } from "./BasicParser";
import { ElseClauseContext } from "./BasicParser";
import { ForUnconditionalStatementContext } from "./BasicParser";
import { ForConditionalStatementContext } from "./BasicParser";
import { ForUnconditionalHeaderContext } from "./BasicParser";
import { ForConditionalStatementHeaderContext } from "./BasicParser";
import { StepClauseContext } from "./BasicParser";
import { SelectCaseStatementContext } from "./BasicParser";
import { CaseAlternativeContext } from "./BasicParser";
import { CaseExpnContext } from "./BasicParser";
import { ToExpnContext } from "./BasicParser";
import { LastCaseAlternativeContext } from "./BasicParser";
import { UntilStatementContext } from "./BasicParser";
import { WhileStatementContext } from "./BasicParser";


/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by `BasicParser`.
 *
 * @param <Result> The return type of the visit operation. Use `void` for
 * operations with no return type.
 */
export interface BasicParserVisitor<Result> extends ParseTreeVisitor<Result> {
	/**
	 * Visit a parse tree produced by `BasicParser.identifier`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIdentifier?: (ctx: IdentifierContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.number`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitNumber?: (ctx: NumberContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.newline`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitNewline?: (ctx: NewlineContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.comName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitComName?: (ctx: ComNameContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.fileSpec`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFileSpec?: (ctx: FileSpecContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.targetName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTargetName?: (ctx: TargetNameContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.variableName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitVariableName?: (ctx: VariableNameContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.variableChildName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitVariableChildName?: (ctx: VariableChildNameContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.handlerName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitHandlerName?: (ctx: HandlerNameContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.mapName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMapName?: (ctx: MapNameContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.routineName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRoutineName?: (ctx: RoutineNameContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.pictureName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPictureName?: (ctx: PictureNameContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.recName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRecName?: (ctx: RecNameContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.recNameEnd`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRecNameEnd?: (ctx: RecNameEndContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.groupName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitGroupName?: (ctx: GroupNameContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.groupNameEnd`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitGroupNameEnd?: (ctx: GroupNameEndContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.stringVariableName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStringVariableName?: (ctx: StringVariableNameContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.unqStr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUnqStr?: (ctx: UnqStrContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.numericVariableName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitNumericVariableName?: (ctx: NumericVariableNameContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.arrayVariableName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitArrayVariableName?: (ctx: ArrayVariableNameContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.constName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitConstName?: (ctx: ConstNameContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.constExp`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitConstExp?: (ctx: ConstExpContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.recExp`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRecExp?: (ctx: RecExpContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.rfaExp`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRfaExp?: (ctx: RfaExpContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.intConst`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIntConst?: (ctx: IntConstContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.strConst`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStrConst?: (ctx: StrConstContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.repCnt`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRepCnt?: (ctx: RepCntContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.intExp`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIntExp?: (ctx: IntExpContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.realExp`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRealExp?: (ctx: RealExpContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.numExp`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitNumExp?: (ctx: NumExpContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.strExp`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStrExp?: (ctx: StrExpContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.chnlExp`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitChnlExp?: (ctx: ChnlExpContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.condExp`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCondExp?: (ctx: CondExpContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.lexVar`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLexVar?: (ctx: LexVarContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.lexExp`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLexExp?: (ctx: LexExpContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.eol`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEol?: (ctx: EolContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.equalsExpn`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEqualsExpn?: (ctx: EqualsExpnContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.label`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLabel?: (ctx: LabelContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.program`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProgram?: (ctx: ProgramContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.programUnit`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProgramUnit?: (ctx: ProgramUnitContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.mainProgram`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMainProgram?: (ctx: MainProgramContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.programStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProgramStatement?: (ctx: ProgramStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.endProgramStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEndProgramStatement?: (ctx: EndProgramStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.declarationOrStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDeclarationOrStatement?: (ctx: DeclarationOrStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.directive`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDirective?: (ctx: DirectiveContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.titleDirective`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTitleDirective?: (ctx: TitleDirectiveContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.includeDirective`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIncludeDirective?: (ctx: IncludeDirectiveContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.allDirective`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAllDirective?: (ctx: AllDirectiveContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.pIfDirective`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPIfDirective?: (ctx: PIfDirectiveContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.declaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDeclaration?: (ctx: DeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.recordDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRecordDeclaration?: (ctx: RecordDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.recComponent`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRecComponent?: (ctx: RecComponentContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.recItem`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRecItem?: (ctx: RecItemContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.groupClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitGroupClause?: (ctx: GroupClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.groupExpn`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitGroupExpn?: (ctx: GroupExpnContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.variantClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitVariantClause?: (ctx: VariantClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.caseClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCaseClause?: (ctx: CaseClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.dataType`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDataType?: (ctx: DataTypeContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.variableDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitVariableDeclaration?: (ctx: VariableDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.variableDescriptionPart`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitVariableDescriptionPart?: (ctx: VariableDescriptionPartContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.variableDescription`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitVariableDescription?: (ctx: VariableDescriptionContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.singleVarDescription`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSingleVarDescription?: (ctx: SingleVarDescriptionContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.initialValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitInitialValue?: (ctx: InitialValueContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.arrayDescription`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitArrayDescription?: (ctx: ArrayDescriptionContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.subscriptExpn`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSubscriptExpn?: (ctx: SubscriptExpnContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.constantDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitConstantDeclaration?: (ctx: ConstantDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.constantDescription`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitConstantDescription?: (ctx: ConstantDescriptionContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.declareSubprogramDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDeclareSubprogramDeclaration?: (ctx: DeclareSubprogramDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.declareArgumentDescription`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDeclareArgumentDescription?: (ctx: DeclareArgumentDescriptionContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.subprogramDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSubprogramDeclaration?: (ctx: SubprogramDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.functionDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFunctionDeclaration?: (ctx: FunctionDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.functionHeader`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFunctionHeader?: (ctx: FunctionHeaderContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.functionEnd`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFunctionEnd?: (ctx: FunctionEndContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.subroutineDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSubroutineDeclaration?: (ctx: SubroutineDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.subroutineHeader`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSubroutineHeader?: (ctx: SubroutineHeaderContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.subroutineEnd`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSubroutineEnd?: (ctx: SubroutineEndContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.subScope`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSubScope?: (ctx: SubScopeContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.subprogramArgumentDescription`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSubprogramArgumentDescription?: (ctx: SubprogramArgumentDescriptionContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.subprogramArgument`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSubprogramArgument?: (ctx: SubprogramArgumentContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.byrefOrByval`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitByrefOrByval?: (ctx: ByrefOrByvalContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.externVarConstDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExternVarConstDeclaration?: (ctx: ExternVarConstDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.externSubprogramDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExternSubprogramDeclaration?: (ctx: ExternSubprogramDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.externSubprogramDescript`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExternSubprogramDescript?: (ctx: ExternSubprogramDescriptContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.externSubprogramArgumentDescription`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExternSubprogramArgumentDescription?: (ctx: ExternSubprogramArgumentDescriptionContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.externSubprogramArgument`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExternSubprogramArgument?: (ctx: ExternSubprogramArgumentContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.externPictureDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExternPictureDeclaration?: (ctx: ExternPictureDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.defFunctionSingleDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDefFunctionSingleDeclaration?: (ctx: DefFunctionSingleDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.defFunctionMultyDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDefFunctionMultyDeclaration?: (ctx: DefFunctionMultyDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.defFunctionHeader`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDefFunctionHeader?: (ctx: DefFunctionHeaderContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.mapDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMapDeclaration?: (ctx: MapDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.mapItem`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMapItem?: (ctx: MapItemContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.mapDynDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMapDynDeclaration?: (ctx: MapDynDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.mapDescriptionPart`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMapDescriptionPart?: (ctx: MapDescriptionPartContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.mapVariableItem`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMapVariableItem?: (ctx: MapVariableItemContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.commonDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCommonDeclaration?: (ctx: CommonDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.dimensionDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDimensionDeclaration?: (ctx: DimensionDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.dimensionItem`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDimensionItem?: (ctx: DimensionItemContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.dimensionArray`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDimensionArray?: (ctx: DimensionArrayContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.dimensionExpn`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDimensionExpn?: (ctx: DimensionExpnContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.matDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMatDeclaration?: (ctx: MatDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.matClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMatClause?: (ctx: MatClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.matArithmeticDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMatArithmeticDeclaration?: (ctx: MatArithmeticDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.matOp`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMatOp?: (ctx: MatOpContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.variable`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitVariable?: (ctx: VariableContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.expression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExpression?: (ctx: ExpressionContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.relationaloperator`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRelationaloperator?: (ctx: RelationaloperatorContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.simpleExpression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSimpleExpression?: (ctx: SimpleExpressionContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.additiveoperator`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAdditiveoperator?: (ctx: AdditiveoperatorContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.term`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTerm?: (ctx: TermContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.multiplicativeoperator`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMultiplicativeoperator?: (ctx: MultiplicativeoperatorContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.signedFactor`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSignedFactor?: (ctx: SignedFactorContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.factor`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFactor?: (ctx: FactorContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.unsignedConstant`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUnsignedConstant?: (ctx: UnsignedConstantContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.variableInt`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitVariableInt?: (ctx: VariableIntContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.expressionInt`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExpressionInt?: (ctx: ExpressionIntContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.simpleExpressionInt`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSimpleExpressionInt?: (ctx: SimpleExpressionIntContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.termInt`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTermInt?: (ctx: TermIntContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.signedFactorInt`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSignedFactorInt?: (ctx: SignedFactorIntContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.factorInt`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFactorInt?: (ctx: FactorIntContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.unsignedConstantInt`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUnsignedConstantInt?: (ctx: UnsignedConstantIntContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.variableStr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitVariableStr?: (ctx: VariableStrContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.expressionStr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExpressionStr?: (ctx: ExpressionStrContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.simpleExpressionStr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSimpleExpressionStr?: (ctx: SimpleExpressionStrContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.termStr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTermStr?: (ctx: TermStrContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.signedFactorStr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSignedFactorStr?: (ctx: SignedFactorStrContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.factorStr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFactorStr?: (ctx: FactorStrContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.unsignedConstantStr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUnsignedConstantStr?: (ctx: UnsignedConstantStrContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.functionDesignatorReal`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFunctionDesignatorReal?: (ctx: FunctionDesignatorRealContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.functionDesignatorInt`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFunctionDesignatorInt?: (ctx: FunctionDesignatorIntContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.functionDesignatorSrt`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFunctionDesignatorSrt?: (ctx: FunctionDesignatorSrtContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.parameterList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParameterList?: (ctx: ParameterListContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.set`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSet?: (ctx: SetContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.elementList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitElementList?: (ctx: ElementListContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.element`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitElement?: (ctx: ElementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.actualParameter`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitActualParameter?: (ctx: ActualParameterContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.variableLex`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitVariableLex?: (ctx: VariableLexContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.expressionLex`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExpressionLex?: (ctx: ExpressionLexContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.simpleExpressionLex`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSimpleExpressionLex?: (ctx: SimpleExpressionLexContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.termLex`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTermLex?: (ctx: TermLexContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.signedFactorLex`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSignedFactorLex?: (ctx: SignedFactorLexContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.factorLex`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFactorLex?: (ctx: FactorLexContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.unsignedConstantLex`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUnsignedConstantLex?: (ctx: UnsignedConstantLexContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.setLex`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSetLex?: (ctx: SetLexContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.elementListLex`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitElementListLex?: (ctx: ElementListLexContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.elementLex`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitElementLex?: (ctx: ElementLexContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStatement?: (ctx: StatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.remapStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRemapStatement?: (ctx: RemapStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.remapItem`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRemapItem?: (ctx: RemapItemContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.assignmentStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAssignmentStatement?: (ctx: AssignmentStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.callStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCallStatement?: (ctx: CallStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.subroutineParams`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSubroutineParams?: (ctx: SubroutineParamsContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.causeErrorStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCauseErrorStatement?: (ctx: CauseErrorStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.chainStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitChainStatement?: (ctx: ChainStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.changeStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitChangeStatement?: (ctx: ChangeStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.closeStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCloseStatement?: (ctx: CloseStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.continueStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitContinueStatement?: (ctx: ContinueStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.dataStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDataStatement?: (ctx: DataStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.deleteStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDeleteStatement?: (ctx: DeleteStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.exitStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExitStatement?: (ctx: ExitStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.fieldStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFieldStatement?: (ctx: FieldStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.findStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFindStatement?: (ctx: FindStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.positionClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPositionClause?: (ctx: PositionClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.lockClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLockClause?: (ctx: LockClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.allowClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAllowClause?: (ctx: AllowClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.keyClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitKeyClause?: (ctx: KeyClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.relOp`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRelOp?: (ctx: RelOpContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.freeStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFreeStatement?: (ctx: FreeStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.goSubStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitGoSubStatement?: (ctx: GoSubStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.gotoStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitGotoStatement?: (ctx: GotoStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.inputStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitInputStatement?: (ctx: InputStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.inputLineStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitInputLineStatement?: (ctx: InputLineStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.inputArgs`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitInputArgs?: (ctx: InputArgsContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.iterateStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIterateStatement?: (ctx: IterateStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.killStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitKillStatement?: (ctx: KillStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.lsetStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLsetStatement?: (ctx: LsetStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.marginStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMarginStatement?: (ctx: MarginStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.matInputStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMatInputStatement?: (ctx: MatInputStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.matInputArray`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMatInputArray?: (ctx: MatInputArrayContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.matPrintStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMatPrintStatement?: (ctx: MatPrintStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.matReadStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMatReadStatement?: (ctx: MatReadStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.midStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMidStatement?: (ctx: MidStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.moveStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMoveStatement?: (ctx: MoveStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.moveItem`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMoveItem?: (ctx: MoveItemContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.variableDescriptionStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitVariableDescriptionStatement?: (ctx: VariableDescriptionStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.nameAsStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitNameAsStatement?: (ctx: NameAsStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.nomarginStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitNomarginStatement?: (ctx: NomarginStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.onErrorGoBackStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOnErrorGoBackStatement?: (ctx: OnErrorGoBackStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.onErrorGoToBackStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOnErrorGoToBackStatement?: (ctx: OnErrorGoToBackStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.onGoSubToBackStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOnGoSubToBackStatement?: (ctx: OnGoSubToBackStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.openStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOpenStatement?: (ctx: OpenStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.openClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOpenClause?: (ctx: OpenClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.accessSpec`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAccessSpec?: (ctx: AccessSpecContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.accessMode`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAccessMode?: (ctx: AccessModeContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.allowSpec`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAllowSpec?: (ctx: AllowSpecContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.allowMode`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAllowMode?: (ctx: AllowModeContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.orgSpec`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOrgSpec?: (ctx: OrgSpecContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.orgMode`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOrgMode?: (ctx: OrgModeContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.orgMode2`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOrgMode2?: (ctx: OrgMode2Context) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.recSpec`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRecSpec?: (ctx: RecSpecContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.recMode`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRecMode?: (ctx: RecModeContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.keyOpenClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitKeyOpenClause?: (ctx: KeyOpenClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.optionStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOptionStatement?: (ctx: OptionStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.optionClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOptionClause?: (ctx: OptionClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.angleClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAngleClause?: (ctx: AngleClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.handleClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitHandleClause?: (ctx: HandleClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.constTypeClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitConstTypeClause?: (ctx: ConstTypeClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.typeClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTypeClause?: (ctx: TypeClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.sizeClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSizeClause?: (ctx: SizeClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.sizItem`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSizItem?: (ctx: SizItemContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.intClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIntClause?: (ctx: IntClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.realClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRealClause?: (ctx: RealClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.activeClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitActiveClause?: (ctx: ActiveClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.activeItem`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitActiveItem?: (ctx: ActiveItemContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.printStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPrintStatement?: (ctx: PrintStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.putStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPutStatement?: (ctx: PutStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.randomStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRandomStatement?: (ctx: RandomStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.readStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitReadStatement?: (ctx: ReadStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.resetStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitResetStatement?: (ctx: ResetStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.restoreStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRestoreStatement?: (ctx: RestoreStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.resumeStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitResumeStatement?: (ctx: ResumeStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.retryStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRetryStatement?: (ctx: RetryStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.returnStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitReturnStatement?: (ctx: ReturnStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.rsetStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRsetStatement?: (ctx: RsetStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.scratchStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitScratchStatement?: (ctx: ScratchStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.setPromptStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSetPromptStatement?: (ctx: SetPromptStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.sleepStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSleepStatement?: (ctx: SleepStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.stopStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStopStatement?: (ctx: StopStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.unlockStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUnlockStatement?: (ctx: UnlockStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.updateStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUpdateStatement?: (ctx: UpdateStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.waitStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitWaitStatement?: (ctx: WaitStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.whenErrorInStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitWhenErrorInStatement?: (ctx: WhenErrorInStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.whenErrorUseStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitWhenErrorUseStatement?: (ctx: WhenErrorUseStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.handlerUseStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitHandlerUseStatement?: (ctx: HandlerUseStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.ifStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIfStatement?: (ctx: IfStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.ifCondition`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIfCondition?: (ctx: IfConditionContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.ifStatementModifier`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIfStatementModifier?: (ctx: IfStatementModifierContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.elsifClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitElsifClause?: (ctx: ElsifClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.elseClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitElseClause?: (ctx: ElseClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.forUnconditionalStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitForUnconditionalStatement?: (ctx: ForUnconditionalStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.forConditionalStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitForConditionalStatement?: (ctx: ForConditionalStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.forUnconditionalHeader`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitForUnconditionalHeader?: (ctx: ForUnconditionalHeaderContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.forConditionalStatementHeader`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitForConditionalStatementHeader?: (ctx: ForConditionalStatementHeaderContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.stepClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStepClause?: (ctx: StepClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.selectCaseStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSelectCaseStatement?: (ctx: SelectCaseStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.caseAlternative`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCaseAlternative?: (ctx: CaseAlternativeContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.caseExpn`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCaseExpn?: (ctx: CaseExpnContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.toExpn`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitToExpn?: (ctx: ToExpnContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.lastCaseAlternative`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLastCaseAlternative?: (ctx: LastCaseAlternativeContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.untilStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUntilStatement?: (ctx: UntilStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `BasicParser.whileStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitWhileStatement?: (ctx: WhileStatementContext) => Result;
}

