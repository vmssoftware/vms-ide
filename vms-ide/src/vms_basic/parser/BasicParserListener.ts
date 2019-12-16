// Generated from src/vms_basic/parser/BasicParser.g4 by ANTLR 4.7.3-SNAPSHOT


import { ParseTreeListener } from "antlr4ts/tree/ParseTreeListener";

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
import { VariableDescriptionSecondPartContext } from "./BasicParser";
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
import { MapDynItemContext } from "./BasicParser";
import { CommonDeclarationContext } from "./BasicParser";
import { DimensionDeclarationContext } from "./BasicParser";
import { DimensionItemContext } from "./BasicParser";
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
import { FunctionDesignatorContext } from "./BasicParser";
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
 * This interface defines a complete listener for a parse tree produced by
 * `BasicParser`.
 */
export interface BasicParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by `BasicParser.identifier`.
	 * @param ctx the parse tree
	 */
	enterIdentifier?: (ctx: IdentifierContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.identifier`.
	 * @param ctx the parse tree
	 */
	exitIdentifier?: (ctx: IdentifierContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.number`.
	 * @param ctx the parse tree
	 */
	enterNumber?: (ctx: NumberContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.number`.
	 * @param ctx the parse tree
	 */
	exitNumber?: (ctx: NumberContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.newline`.
	 * @param ctx the parse tree
	 */
	enterNewline?: (ctx: NewlineContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.newline`.
	 * @param ctx the parse tree
	 */
	exitNewline?: (ctx: NewlineContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.comName`.
	 * @param ctx the parse tree
	 */
	enterComName?: (ctx: ComNameContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.comName`.
	 * @param ctx the parse tree
	 */
	exitComName?: (ctx: ComNameContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.fileSpec`.
	 * @param ctx the parse tree
	 */
	enterFileSpec?: (ctx: FileSpecContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.fileSpec`.
	 * @param ctx the parse tree
	 */
	exitFileSpec?: (ctx: FileSpecContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.targetName`.
	 * @param ctx the parse tree
	 */
	enterTargetName?: (ctx: TargetNameContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.targetName`.
	 * @param ctx the parse tree
	 */
	exitTargetName?: (ctx: TargetNameContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.variableName`.
	 * @param ctx the parse tree
	 */
	enterVariableName?: (ctx: VariableNameContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.variableName`.
	 * @param ctx the parse tree
	 */
	exitVariableName?: (ctx: VariableNameContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.variableChildName`.
	 * @param ctx the parse tree
	 */
	enterVariableChildName?: (ctx: VariableChildNameContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.variableChildName`.
	 * @param ctx the parse tree
	 */
	exitVariableChildName?: (ctx: VariableChildNameContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.handlerName`.
	 * @param ctx the parse tree
	 */
	enterHandlerName?: (ctx: HandlerNameContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.handlerName`.
	 * @param ctx the parse tree
	 */
	exitHandlerName?: (ctx: HandlerNameContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.mapName`.
	 * @param ctx the parse tree
	 */
	enterMapName?: (ctx: MapNameContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.mapName`.
	 * @param ctx the parse tree
	 */
	exitMapName?: (ctx: MapNameContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.routineName`.
	 * @param ctx the parse tree
	 */
	enterRoutineName?: (ctx: RoutineNameContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.routineName`.
	 * @param ctx the parse tree
	 */
	exitRoutineName?: (ctx: RoutineNameContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.pictureName`.
	 * @param ctx the parse tree
	 */
	enterPictureName?: (ctx: PictureNameContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.pictureName`.
	 * @param ctx the parse tree
	 */
	exitPictureName?: (ctx: PictureNameContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.recName`.
	 * @param ctx the parse tree
	 */
	enterRecName?: (ctx: RecNameContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.recName`.
	 * @param ctx the parse tree
	 */
	exitRecName?: (ctx: RecNameContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.recNameEnd`.
	 * @param ctx the parse tree
	 */
	enterRecNameEnd?: (ctx: RecNameEndContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.recNameEnd`.
	 * @param ctx the parse tree
	 */
	exitRecNameEnd?: (ctx: RecNameEndContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.groupName`.
	 * @param ctx the parse tree
	 */
	enterGroupName?: (ctx: GroupNameContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.groupName`.
	 * @param ctx the parse tree
	 */
	exitGroupName?: (ctx: GroupNameContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.groupNameEnd`.
	 * @param ctx the parse tree
	 */
	enterGroupNameEnd?: (ctx: GroupNameEndContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.groupNameEnd`.
	 * @param ctx the parse tree
	 */
	exitGroupNameEnd?: (ctx: GroupNameEndContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.stringVariableName`.
	 * @param ctx the parse tree
	 */
	enterStringVariableName?: (ctx: StringVariableNameContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.stringVariableName`.
	 * @param ctx the parse tree
	 */
	exitStringVariableName?: (ctx: StringVariableNameContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.unqStr`.
	 * @param ctx the parse tree
	 */
	enterUnqStr?: (ctx: UnqStrContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.unqStr`.
	 * @param ctx the parse tree
	 */
	exitUnqStr?: (ctx: UnqStrContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.numericVariableName`.
	 * @param ctx the parse tree
	 */
	enterNumericVariableName?: (ctx: NumericVariableNameContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.numericVariableName`.
	 * @param ctx the parse tree
	 */
	exitNumericVariableName?: (ctx: NumericVariableNameContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.arrayVariableName`.
	 * @param ctx the parse tree
	 */
	enterArrayVariableName?: (ctx: ArrayVariableNameContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.arrayVariableName`.
	 * @param ctx the parse tree
	 */
	exitArrayVariableName?: (ctx: ArrayVariableNameContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.constName`.
	 * @param ctx the parse tree
	 */
	enterConstName?: (ctx: ConstNameContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.constName`.
	 * @param ctx the parse tree
	 */
	exitConstName?: (ctx: ConstNameContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.constExp`.
	 * @param ctx the parse tree
	 */
	enterConstExp?: (ctx: ConstExpContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.constExp`.
	 * @param ctx the parse tree
	 */
	exitConstExp?: (ctx: ConstExpContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.recExp`.
	 * @param ctx the parse tree
	 */
	enterRecExp?: (ctx: RecExpContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.recExp`.
	 * @param ctx the parse tree
	 */
	exitRecExp?: (ctx: RecExpContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.rfaExp`.
	 * @param ctx the parse tree
	 */
	enterRfaExp?: (ctx: RfaExpContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.rfaExp`.
	 * @param ctx the parse tree
	 */
	exitRfaExp?: (ctx: RfaExpContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.intConst`.
	 * @param ctx the parse tree
	 */
	enterIntConst?: (ctx: IntConstContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.intConst`.
	 * @param ctx the parse tree
	 */
	exitIntConst?: (ctx: IntConstContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.strConst`.
	 * @param ctx the parse tree
	 */
	enterStrConst?: (ctx: StrConstContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.strConst`.
	 * @param ctx the parse tree
	 */
	exitStrConst?: (ctx: StrConstContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.repCnt`.
	 * @param ctx the parse tree
	 */
	enterRepCnt?: (ctx: RepCntContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.repCnt`.
	 * @param ctx the parse tree
	 */
	exitRepCnt?: (ctx: RepCntContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.intExp`.
	 * @param ctx the parse tree
	 */
	enterIntExp?: (ctx: IntExpContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.intExp`.
	 * @param ctx the parse tree
	 */
	exitIntExp?: (ctx: IntExpContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.realExp`.
	 * @param ctx the parse tree
	 */
	enterRealExp?: (ctx: RealExpContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.realExp`.
	 * @param ctx the parse tree
	 */
	exitRealExp?: (ctx: RealExpContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.numExp`.
	 * @param ctx the parse tree
	 */
	enterNumExp?: (ctx: NumExpContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.numExp`.
	 * @param ctx the parse tree
	 */
	exitNumExp?: (ctx: NumExpContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.strExp`.
	 * @param ctx the parse tree
	 */
	enterStrExp?: (ctx: StrExpContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.strExp`.
	 * @param ctx the parse tree
	 */
	exitStrExp?: (ctx: StrExpContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.chnlExp`.
	 * @param ctx the parse tree
	 */
	enterChnlExp?: (ctx: ChnlExpContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.chnlExp`.
	 * @param ctx the parse tree
	 */
	exitChnlExp?: (ctx: ChnlExpContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.condExp`.
	 * @param ctx the parse tree
	 */
	enterCondExp?: (ctx: CondExpContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.condExp`.
	 * @param ctx the parse tree
	 */
	exitCondExp?: (ctx: CondExpContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.lexVar`.
	 * @param ctx the parse tree
	 */
	enterLexVar?: (ctx: LexVarContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.lexVar`.
	 * @param ctx the parse tree
	 */
	exitLexVar?: (ctx: LexVarContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.lexExp`.
	 * @param ctx the parse tree
	 */
	enterLexExp?: (ctx: LexExpContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.lexExp`.
	 * @param ctx the parse tree
	 */
	exitLexExp?: (ctx: LexExpContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.eol`.
	 * @param ctx the parse tree
	 */
	enterEol?: (ctx: EolContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.eol`.
	 * @param ctx the parse tree
	 */
	exitEol?: (ctx: EolContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.equalsExpn`.
	 * @param ctx the parse tree
	 */
	enterEqualsExpn?: (ctx: EqualsExpnContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.equalsExpn`.
	 * @param ctx the parse tree
	 */
	exitEqualsExpn?: (ctx: EqualsExpnContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.label`.
	 * @param ctx the parse tree
	 */
	enterLabel?: (ctx: LabelContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.label`.
	 * @param ctx the parse tree
	 */
	exitLabel?: (ctx: LabelContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.program`.
	 * @param ctx the parse tree
	 */
	enterProgram?: (ctx: ProgramContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.program`.
	 * @param ctx the parse tree
	 */
	exitProgram?: (ctx: ProgramContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.programUnit`.
	 * @param ctx the parse tree
	 */
	enterProgramUnit?: (ctx: ProgramUnitContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.programUnit`.
	 * @param ctx the parse tree
	 */
	exitProgramUnit?: (ctx: ProgramUnitContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.mainProgram`.
	 * @param ctx the parse tree
	 */
	enterMainProgram?: (ctx: MainProgramContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.mainProgram`.
	 * @param ctx the parse tree
	 */
	exitMainProgram?: (ctx: MainProgramContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.programStatement`.
	 * @param ctx the parse tree
	 */
	enterProgramStatement?: (ctx: ProgramStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.programStatement`.
	 * @param ctx the parse tree
	 */
	exitProgramStatement?: (ctx: ProgramStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.endProgramStatement`.
	 * @param ctx the parse tree
	 */
	enterEndProgramStatement?: (ctx: EndProgramStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.endProgramStatement`.
	 * @param ctx the parse tree
	 */
	exitEndProgramStatement?: (ctx: EndProgramStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.declarationOrStatement`.
	 * @param ctx the parse tree
	 */
	enterDeclarationOrStatement?: (ctx: DeclarationOrStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.declarationOrStatement`.
	 * @param ctx the parse tree
	 */
	exitDeclarationOrStatement?: (ctx: DeclarationOrStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.directive`.
	 * @param ctx the parse tree
	 */
	enterDirective?: (ctx: DirectiveContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.directive`.
	 * @param ctx the parse tree
	 */
	exitDirective?: (ctx: DirectiveContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.titleDirective`.
	 * @param ctx the parse tree
	 */
	enterTitleDirective?: (ctx: TitleDirectiveContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.titleDirective`.
	 * @param ctx the parse tree
	 */
	exitTitleDirective?: (ctx: TitleDirectiveContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.includeDirective`.
	 * @param ctx the parse tree
	 */
	enterIncludeDirective?: (ctx: IncludeDirectiveContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.includeDirective`.
	 * @param ctx the parse tree
	 */
	exitIncludeDirective?: (ctx: IncludeDirectiveContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.allDirective`.
	 * @param ctx the parse tree
	 */
	enterAllDirective?: (ctx: AllDirectiveContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.allDirective`.
	 * @param ctx the parse tree
	 */
	exitAllDirective?: (ctx: AllDirectiveContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.pIfDirective`.
	 * @param ctx the parse tree
	 */
	enterPIfDirective?: (ctx: PIfDirectiveContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.pIfDirective`.
	 * @param ctx the parse tree
	 */
	exitPIfDirective?: (ctx: PIfDirectiveContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.declaration`.
	 * @param ctx the parse tree
	 */
	enterDeclaration?: (ctx: DeclarationContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.declaration`.
	 * @param ctx the parse tree
	 */
	exitDeclaration?: (ctx: DeclarationContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.recordDeclaration`.
	 * @param ctx the parse tree
	 */
	enterRecordDeclaration?: (ctx: RecordDeclarationContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.recordDeclaration`.
	 * @param ctx the parse tree
	 */
	exitRecordDeclaration?: (ctx: RecordDeclarationContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.recComponent`.
	 * @param ctx the parse tree
	 */
	enterRecComponent?: (ctx: RecComponentContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.recComponent`.
	 * @param ctx the parse tree
	 */
	exitRecComponent?: (ctx: RecComponentContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.recItem`.
	 * @param ctx the parse tree
	 */
	enterRecItem?: (ctx: RecItemContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.recItem`.
	 * @param ctx the parse tree
	 */
	exitRecItem?: (ctx: RecItemContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.groupClause`.
	 * @param ctx the parse tree
	 */
	enterGroupClause?: (ctx: GroupClauseContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.groupClause`.
	 * @param ctx the parse tree
	 */
	exitGroupClause?: (ctx: GroupClauseContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.groupExpn`.
	 * @param ctx the parse tree
	 */
	enterGroupExpn?: (ctx: GroupExpnContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.groupExpn`.
	 * @param ctx the parse tree
	 */
	exitGroupExpn?: (ctx: GroupExpnContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.variantClause`.
	 * @param ctx the parse tree
	 */
	enterVariantClause?: (ctx: VariantClauseContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.variantClause`.
	 * @param ctx the parse tree
	 */
	exitVariantClause?: (ctx: VariantClauseContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.caseClause`.
	 * @param ctx the parse tree
	 */
	enterCaseClause?: (ctx: CaseClauseContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.caseClause`.
	 * @param ctx the parse tree
	 */
	exitCaseClause?: (ctx: CaseClauseContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.dataType`.
	 * @param ctx the parse tree
	 */
	enterDataType?: (ctx: DataTypeContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.dataType`.
	 * @param ctx the parse tree
	 */
	exitDataType?: (ctx: DataTypeContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.variableDeclaration`.
	 * @param ctx the parse tree
	 */
	enterVariableDeclaration?: (ctx: VariableDeclarationContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.variableDeclaration`.
	 * @param ctx the parse tree
	 */
	exitVariableDeclaration?: (ctx: VariableDeclarationContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.variableDescriptionSecondPart`.
	 * @param ctx the parse tree
	 */
	enterVariableDescriptionSecondPart?: (ctx: VariableDescriptionSecondPartContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.variableDescriptionSecondPart`.
	 * @param ctx the parse tree
	 */
	exitVariableDescriptionSecondPart?: (ctx: VariableDescriptionSecondPartContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.variableDescription`.
	 * @param ctx the parse tree
	 */
	enterVariableDescription?: (ctx: VariableDescriptionContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.variableDescription`.
	 * @param ctx the parse tree
	 */
	exitVariableDescription?: (ctx: VariableDescriptionContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.singleVarDescription`.
	 * @param ctx the parse tree
	 */
	enterSingleVarDescription?: (ctx: SingleVarDescriptionContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.singleVarDescription`.
	 * @param ctx the parse tree
	 */
	exitSingleVarDescription?: (ctx: SingleVarDescriptionContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.initialValue`.
	 * @param ctx the parse tree
	 */
	enterInitialValue?: (ctx: InitialValueContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.initialValue`.
	 * @param ctx the parse tree
	 */
	exitInitialValue?: (ctx: InitialValueContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.arrayDescription`.
	 * @param ctx the parse tree
	 */
	enterArrayDescription?: (ctx: ArrayDescriptionContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.arrayDescription`.
	 * @param ctx the parse tree
	 */
	exitArrayDescription?: (ctx: ArrayDescriptionContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.subscriptExpn`.
	 * @param ctx the parse tree
	 */
	enterSubscriptExpn?: (ctx: SubscriptExpnContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.subscriptExpn`.
	 * @param ctx the parse tree
	 */
	exitSubscriptExpn?: (ctx: SubscriptExpnContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.constantDeclaration`.
	 * @param ctx the parse tree
	 */
	enterConstantDeclaration?: (ctx: ConstantDeclarationContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.constantDeclaration`.
	 * @param ctx the parse tree
	 */
	exitConstantDeclaration?: (ctx: ConstantDeclarationContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.constantDescription`.
	 * @param ctx the parse tree
	 */
	enterConstantDescription?: (ctx: ConstantDescriptionContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.constantDescription`.
	 * @param ctx the parse tree
	 */
	exitConstantDescription?: (ctx: ConstantDescriptionContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.declareSubprogramDeclaration`.
	 * @param ctx the parse tree
	 */
	enterDeclareSubprogramDeclaration?: (ctx: DeclareSubprogramDeclarationContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.declareSubprogramDeclaration`.
	 * @param ctx the parse tree
	 */
	exitDeclareSubprogramDeclaration?: (ctx: DeclareSubprogramDeclarationContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.declareArgumentDescription`.
	 * @param ctx the parse tree
	 */
	enterDeclareArgumentDescription?: (ctx: DeclareArgumentDescriptionContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.declareArgumentDescription`.
	 * @param ctx the parse tree
	 */
	exitDeclareArgumentDescription?: (ctx: DeclareArgumentDescriptionContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.subprogramDeclaration`.
	 * @param ctx the parse tree
	 */
	enterSubprogramDeclaration?: (ctx: SubprogramDeclarationContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.subprogramDeclaration`.
	 * @param ctx the parse tree
	 */
	exitSubprogramDeclaration?: (ctx: SubprogramDeclarationContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.functionDeclaration`.
	 * @param ctx the parse tree
	 */
	enterFunctionDeclaration?: (ctx: FunctionDeclarationContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.functionDeclaration`.
	 * @param ctx the parse tree
	 */
	exitFunctionDeclaration?: (ctx: FunctionDeclarationContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.functionHeader`.
	 * @param ctx the parse tree
	 */
	enterFunctionHeader?: (ctx: FunctionHeaderContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.functionHeader`.
	 * @param ctx the parse tree
	 */
	exitFunctionHeader?: (ctx: FunctionHeaderContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.functionEnd`.
	 * @param ctx the parse tree
	 */
	enterFunctionEnd?: (ctx: FunctionEndContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.functionEnd`.
	 * @param ctx the parse tree
	 */
	exitFunctionEnd?: (ctx: FunctionEndContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.subroutineDeclaration`.
	 * @param ctx the parse tree
	 */
	enterSubroutineDeclaration?: (ctx: SubroutineDeclarationContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.subroutineDeclaration`.
	 * @param ctx the parse tree
	 */
	exitSubroutineDeclaration?: (ctx: SubroutineDeclarationContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.subroutineHeader`.
	 * @param ctx the parse tree
	 */
	enterSubroutineHeader?: (ctx: SubroutineHeaderContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.subroutineHeader`.
	 * @param ctx the parse tree
	 */
	exitSubroutineHeader?: (ctx: SubroutineHeaderContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.subroutineEnd`.
	 * @param ctx the parse tree
	 */
	enterSubroutineEnd?: (ctx: SubroutineEndContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.subroutineEnd`.
	 * @param ctx the parse tree
	 */
	exitSubroutineEnd?: (ctx: SubroutineEndContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.subScope`.
	 * @param ctx the parse tree
	 */
	enterSubScope?: (ctx: SubScopeContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.subScope`.
	 * @param ctx the parse tree
	 */
	exitSubScope?: (ctx: SubScopeContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.subprogramArgumentDescription`.
	 * @param ctx the parse tree
	 */
	enterSubprogramArgumentDescription?: (ctx: SubprogramArgumentDescriptionContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.subprogramArgumentDescription`.
	 * @param ctx the parse tree
	 */
	exitSubprogramArgumentDescription?: (ctx: SubprogramArgumentDescriptionContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.subprogramArgument`.
	 * @param ctx the parse tree
	 */
	enterSubprogramArgument?: (ctx: SubprogramArgumentContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.subprogramArgument`.
	 * @param ctx the parse tree
	 */
	exitSubprogramArgument?: (ctx: SubprogramArgumentContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.byrefOrByval`.
	 * @param ctx the parse tree
	 */
	enterByrefOrByval?: (ctx: ByrefOrByvalContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.byrefOrByval`.
	 * @param ctx the parse tree
	 */
	exitByrefOrByval?: (ctx: ByrefOrByvalContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.externVarConstDeclaration`.
	 * @param ctx the parse tree
	 */
	enterExternVarConstDeclaration?: (ctx: ExternVarConstDeclarationContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.externVarConstDeclaration`.
	 * @param ctx the parse tree
	 */
	exitExternVarConstDeclaration?: (ctx: ExternVarConstDeclarationContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.externSubprogramDeclaration`.
	 * @param ctx the parse tree
	 */
	enterExternSubprogramDeclaration?: (ctx: ExternSubprogramDeclarationContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.externSubprogramDeclaration`.
	 * @param ctx the parse tree
	 */
	exitExternSubprogramDeclaration?: (ctx: ExternSubprogramDeclarationContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.externSubprogramDescript`.
	 * @param ctx the parse tree
	 */
	enterExternSubprogramDescript?: (ctx: ExternSubprogramDescriptContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.externSubprogramDescript`.
	 * @param ctx the parse tree
	 */
	exitExternSubprogramDescript?: (ctx: ExternSubprogramDescriptContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.externSubprogramArgumentDescription`.
	 * @param ctx the parse tree
	 */
	enterExternSubprogramArgumentDescription?: (ctx: ExternSubprogramArgumentDescriptionContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.externSubprogramArgumentDescription`.
	 * @param ctx the parse tree
	 */
	exitExternSubprogramArgumentDescription?: (ctx: ExternSubprogramArgumentDescriptionContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.externSubprogramArgument`.
	 * @param ctx the parse tree
	 */
	enterExternSubprogramArgument?: (ctx: ExternSubprogramArgumentContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.externSubprogramArgument`.
	 * @param ctx the parse tree
	 */
	exitExternSubprogramArgument?: (ctx: ExternSubprogramArgumentContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.externPictureDeclaration`.
	 * @param ctx the parse tree
	 */
	enterExternPictureDeclaration?: (ctx: ExternPictureDeclarationContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.externPictureDeclaration`.
	 * @param ctx the parse tree
	 */
	exitExternPictureDeclaration?: (ctx: ExternPictureDeclarationContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.defFunctionSingleDeclaration`.
	 * @param ctx the parse tree
	 */
	enterDefFunctionSingleDeclaration?: (ctx: DefFunctionSingleDeclarationContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.defFunctionSingleDeclaration`.
	 * @param ctx the parse tree
	 */
	exitDefFunctionSingleDeclaration?: (ctx: DefFunctionSingleDeclarationContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.defFunctionMultyDeclaration`.
	 * @param ctx the parse tree
	 */
	enterDefFunctionMultyDeclaration?: (ctx: DefFunctionMultyDeclarationContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.defFunctionMultyDeclaration`.
	 * @param ctx the parse tree
	 */
	exitDefFunctionMultyDeclaration?: (ctx: DefFunctionMultyDeclarationContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.defFunctionHeader`.
	 * @param ctx the parse tree
	 */
	enterDefFunctionHeader?: (ctx: DefFunctionHeaderContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.defFunctionHeader`.
	 * @param ctx the parse tree
	 */
	exitDefFunctionHeader?: (ctx: DefFunctionHeaderContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.mapDeclaration`.
	 * @param ctx the parse tree
	 */
	enterMapDeclaration?: (ctx: MapDeclarationContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.mapDeclaration`.
	 * @param ctx the parse tree
	 */
	exitMapDeclaration?: (ctx: MapDeclarationContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.mapItem`.
	 * @param ctx the parse tree
	 */
	enterMapItem?: (ctx: MapItemContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.mapItem`.
	 * @param ctx the parse tree
	 */
	exitMapItem?: (ctx: MapItemContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.mapDynDeclaration`.
	 * @param ctx the parse tree
	 */
	enterMapDynDeclaration?: (ctx: MapDynDeclarationContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.mapDynDeclaration`.
	 * @param ctx the parse tree
	 */
	exitMapDynDeclaration?: (ctx: MapDynDeclarationContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.mapDynItem`.
	 * @param ctx the parse tree
	 */
	enterMapDynItem?: (ctx: MapDynItemContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.mapDynItem`.
	 * @param ctx the parse tree
	 */
	exitMapDynItem?: (ctx: MapDynItemContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.commonDeclaration`.
	 * @param ctx the parse tree
	 */
	enterCommonDeclaration?: (ctx: CommonDeclarationContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.commonDeclaration`.
	 * @param ctx the parse tree
	 */
	exitCommonDeclaration?: (ctx: CommonDeclarationContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.dimensionDeclaration`.
	 * @param ctx the parse tree
	 */
	enterDimensionDeclaration?: (ctx: DimensionDeclarationContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.dimensionDeclaration`.
	 * @param ctx the parse tree
	 */
	exitDimensionDeclaration?: (ctx: DimensionDeclarationContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.dimensionItem`.
	 * @param ctx the parse tree
	 */
	enterDimensionItem?: (ctx: DimensionItemContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.dimensionItem`.
	 * @param ctx the parse tree
	 */
	exitDimensionItem?: (ctx: DimensionItemContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.dimensionExpn`.
	 * @param ctx the parse tree
	 */
	enterDimensionExpn?: (ctx: DimensionExpnContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.dimensionExpn`.
	 * @param ctx the parse tree
	 */
	exitDimensionExpn?: (ctx: DimensionExpnContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.matDeclaration`.
	 * @param ctx the parse tree
	 */
	enterMatDeclaration?: (ctx: MatDeclarationContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.matDeclaration`.
	 * @param ctx the parse tree
	 */
	exitMatDeclaration?: (ctx: MatDeclarationContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.matClause`.
	 * @param ctx the parse tree
	 */
	enterMatClause?: (ctx: MatClauseContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.matClause`.
	 * @param ctx the parse tree
	 */
	exitMatClause?: (ctx: MatClauseContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.matArithmeticDeclaration`.
	 * @param ctx the parse tree
	 */
	enterMatArithmeticDeclaration?: (ctx: MatArithmeticDeclarationContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.matArithmeticDeclaration`.
	 * @param ctx the parse tree
	 */
	exitMatArithmeticDeclaration?: (ctx: MatArithmeticDeclarationContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.matOp`.
	 * @param ctx the parse tree
	 */
	enterMatOp?: (ctx: MatOpContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.matOp`.
	 * @param ctx the parse tree
	 */
	exitMatOp?: (ctx: MatOpContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.variable`.
	 * @param ctx the parse tree
	 */
	enterVariable?: (ctx: VariableContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.variable`.
	 * @param ctx the parse tree
	 */
	exitVariable?: (ctx: VariableContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.expression`.
	 * @param ctx the parse tree
	 */
	enterExpression?: (ctx: ExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.expression`.
	 * @param ctx the parse tree
	 */
	exitExpression?: (ctx: ExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.relationaloperator`.
	 * @param ctx the parse tree
	 */
	enterRelationaloperator?: (ctx: RelationaloperatorContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.relationaloperator`.
	 * @param ctx the parse tree
	 */
	exitRelationaloperator?: (ctx: RelationaloperatorContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.simpleExpression`.
	 * @param ctx the parse tree
	 */
	enterSimpleExpression?: (ctx: SimpleExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.simpleExpression`.
	 * @param ctx the parse tree
	 */
	exitSimpleExpression?: (ctx: SimpleExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.additiveoperator`.
	 * @param ctx the parse tree
	 */
	enterAdditiveoperator?: (ctx: AdditiveoperatorContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.additiveoperator`.
	 * @param ctx the parse tree
	 */
	exitAdditiveoperator?: (ctx: AdditiveoperatorContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.term`.
	 * @param ctx the parse tree
	 */
	enterTerm?: (ctx: TermContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.term`.
	 * @param ctx the parse tree
	 */
	exitTerm?: (ctx: TermContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.multiplicativeoperator`.
	 * @param ctx the parse tree
	 */
	enterMultiplicativeoperator?: (ctx: MultiplicativeoperatorContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.multiplicativeoperator`.
	 * @param ctx the parse tree
	 */
	exitMultiplicativeoperator?: (ctx: MultiplicativeoperatorContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.signedFactor`.
	 * @param ctx the parse tree
	 */
	enterSignedFactor?: (ctx: SignedFactorContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.signedFactor`.
	 * @param ctx the parse tree
	 */
	exitSignedFactor?: (ctx: SignedFactorContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.factor`.
	 * @param ctx the parse tree
	 */
	enterFactor?: (ctx: FactorContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.factor`.
	 * @param ctx the parse tree
	 */
	exitFactor?: (ctx: FactorContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.unsignedConstant`.
	 * @param ctx the parse tree
	 */
	enterUnsignedConstant?: (ctx: UnsignedConstantContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.unsignedConstant`.
	 * @param ctx the parse tree
	 */
	exitUnsignedConstant?: (ctx: UnsignedConstantContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.functionDesignator`.
	 * @param ctx the parse tree
	 */
	enterFunctionDesignator?: (ctx: FunctionDesignatorContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.functionDesignator`.
	 * @param ctx the parse tree
	 */
	exitFunctionDesignator?: (ctx: FunctionDesignatorContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.parameterList`.
	 * @param ctx the parse tree
	 */
	enterParameterList?: (ctx: ParameterListContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.parameterList`.
	 * @param ctx the parse tree
	 */
	exitParameterList?: (ctx: ParameterListContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.set`.
	 * @param ctx the parse tree
	 */
	enterSet?: (ctx: SetContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.set`.
	 * @param ctx the parse tree
	 */
	exitSet?: (ctx: SetContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.elementList`.
	 * @param ctx the parse tree
	 */
	enterElementList?: (ctx: ElementListContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.elementList`.
	 * @param ctx the parse tree
	 */
	exitElementList?: (ctx: ElementListContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.element`.
	 * @param ctx the parse tree
	 */
	enterElement?: (ctx: ElementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.element`.
	 * @param ctx the parse tree
	 */
	exitElement?: (ctx: ElementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.actualParameter`.
	 * @param ctx the parse tree
	 */
	enterActualParameter?: (ctx: ActualParameterContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.actualParameter`.
	 * @param ctx the parse tree
	 */
	exitActualParameter?: (ctx: ActualParameterContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.variableLex`.
	 * @param ctx the parse tree
	 */
	enterVariableLex?: (ctx: VariableLexContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.variableLex`.
	 * @param ctx the parse tree
	 */
	exitVariableLex?: (ctx: VariableLexContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.expressionLex`.
	 * @param ctx the parse tree
	 */
	enterExpressionLex?: (ctx: ExpressionLexContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.expressionLex`.
	 * @param ctx the parse tree
	 */
	exitExpressionLex?: (ctx: ExpressionLexContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.simpleExpressionLex`.
	 * @param ctx the parse tree
	 */
	enterSimpleExpressionLex?: (ctx: SimpleExpressionLexContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.simpleExpressionLex`.
	 * @param ctx the parse tree
	 */
	exitSimpleExpressionLex?: (ctx: SimpleExpressionLexContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.termLex`.
	 * @param ctx the parse tree
	 */
	enterTermLex?: (ctx: TermLexContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.termLex`.
	 * @param ctx the parse tree
	 */
	exitTermLex?: (ctx: TermLexContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.signedFactorLex`.
	 * @param ctx the parse tree
	 */
	enterSignedFactorLex?: (ctx: SignedFactorLexContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.signedFactorLex`.
	 * @param ctx the parse tree
	 */
	exitSignedFactorLex?: (ctx: SignedFactorLexContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.factorLex`.
	 * @param ctx the parse tree
	 */
	enterFactorLex?: (ctx: FactorLexContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.factorLex`.
	 * @param ctx the parse tree
	 */
	exitFactorLex?: (ctx: FactorLexContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.unsignedConstantLex`.
	 * @param ctx the parse tree
	 */
	enterUnsignedConstantLex?: (ctx: UnsignedConstantLexContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.unsignedConstantLex`.
	 * @param ctx the parse tree
	 */
	exitUnsignedConstantLex?: (ctx: UnsignedConstantLexContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.setLex`.
	 * @param ctx the parse tree
	 */
	enterSetLex?: (ctx: SetLexContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.setLex`.
	 * @param ctx the parse tree
	 */
	exitSetLex?: (ctx: SetLexContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.elementListLex`.
	 * @param ctx the parse tree
	 */
	enterElementListLex?: (ctx: ElementListLexContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.elementListLex`.
	 * @param ctx the parse tree
	 */
	exitElementListLex?: (ctx: ElementListLexContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.elementLex`.
	 * @param ctx the parse tree
	 */
	enterElementLex?: (ctx: ElementLexContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.elementLex`.
	 * @param ctx the parse tree
	 */
	exitElementLex?: (ctx: ElementLexContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.statement`.
	 * @param ctx the parse tree
	 */
	enterStatement?: (ctx: StatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.statement`.
	 * @param ctx the parse tree
	 */
	exitStatement?: (ctx: StatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.remapStatement`.
	 * @param ctx the parse tree
	 */
	enterRemapStatement?: (ctx: RemapStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.remapStatement`.
	 * @param ctx the parse tree
	 */
	exitRemapStatement?: (ctx: RemapStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.remapItem`.
	 * @param ctx the parse tree
	 */
	enterRemapItem?: (ctx: RemapItemContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.remapItem`.
	 * @param ctx the parse tree
	 */
	exitRemapItem?: (ctx: RemapItemContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.assignmentStatement`.
	 * @param ctx the parse tree
	 */
	enterAssignmentStatement?: (ctx: AssignmentStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.assignmentStatement`.
	 * @param ctx the parse tree
	 */
	exitAssignmentStatement?: (ctx: AssignmentStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.callStatement`.
	 * @param ctx the parse tree
	 */
	enterCallStatement?: (ctx: CallStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.callStatement`.
	 * @param ctx the parse tree
	 */
	exitCallStatement?: (ctx: CallStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.subroutineParams`.
	 * @param ctx the parse tree
	 */
	enterSubroutineParams?: (ctx: SubroutineParamsContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.subroutineParams`.
	 * @param ctx the parse tree
	 */
	exitSubroutineParams?: (ctx: SubroutineParamsContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.causeErrorStatement`.
	 * @param ctx the parse tree
	 */
	enterCauseErrorStatement?: (ctx: CauseErrorStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.causeErrorStatement`.
	 * @param ctx the parse tree
	 */
	exitCauseErrorStatement?: (ctx: CauseErrorStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.chainStatement`.
	 * @param ctx the parse tree
	 */
	enterChainStatement?: (ctx: ChainStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.chainStatement`.
	 * @param ctx the parse tree
	 */
	exitChainStatement?: (ctx: ChainStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.changeStatement`.
	 * @param ctx the parse tree
	 */
	enterChangeStatement?: (ctx: ChangeStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.changeStatement`.
	 * @param ctx the parse tree
	 */
	exitChangeStatement?: (ctx: ChangeStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.closeStatement`.
	 * @param ctx the parse tree
	 */
	enterCloseStatement?: (ctx: CloseStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.closeStatement`.
	 * @param ctx the parse tree
	 */
	exitCloseStatement?: (ctx: CloseStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.continueStatement`.
	 * @param ctx the parse tree
	 */
	enterContinueStatement?: (ctx: ContinueStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.continueStatement`.
	 * @param ctx the parse tree
	 */
	exitContinueStatement?: (ctx: ContinueStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.dataStatement`.
	 * @param ctx the parse tree
	 */
	enterDataStatement?: (ctx: DataStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.dataStatement`.
	 * @param ctx the parse tree
	 */
	exitDataStatement?: (ctx: DataStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.deleteStatement`.
	 * @param ctx the parse tree
	 */
	enterDeleteStatement?: (ctx: DeleteStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.deleteStatement`.
	 * @param ctx the parse tree
	 */
	exitDeleteStatement?: (ctx: DeleteStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.exitStatement`.
	 * @param ctx the parse tree
	 */
	enterExitStatement?: (ctx: ExitStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.exitStatement`.
	 * @param ctx the parse tree
	 */
	exitExitStatement?: (ctx: ExitStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.fieldStatement`.
	 * @param ctx the parse tree
	 */
	enterFieldStatement?: (ctx: FieldStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.fieldStatement`.
	 * @param ctx the parse tree
	 */
	exitFieldStatement?: (ctx: FieldStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.findStatement`.
	 * @param ctx the parse tree
	 */
	enterFindStatement?: (ctx: FindStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.findStatement`.
	 * @param ctx the parse tree
	 */
	exitFindStatement?: (ctx: FindStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.positionClause`.
	 * @param ctx the parse tree
	 */
	enterPositionClause?: (ctx: PositionClauseContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.positionClause`.
	 * @param ctx the parse tree
	 */
	exitPositionClause?: (ctx: PositionClauseContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.lockClause`.
	 * @param ctx the parse tree
	 */
	enterLockClause?: (ctx: LockClauseContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.lockClause`.
	 * @param ctx the parse tree
	 */
	exitLockClause?: (ctx: LockClauseContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.allowClause`.
	 * @param ctx the parse tree
	 */
	enterAllowClause?: (ctx: AllowClauseContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.allowClause`.
	 * @param ctx the parse tree
	 */
	exitAllowClause?: (ctx: AllowClauseContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.keyClause`.
	 * @param ctx the parse tree
	 */
	enterKeyClause?: (ctx: KeyClauseContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.keyClause`.
	 * @param ctx the parse tree
	 */
	exitKeyClause?: (ctx: KeyClauseContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.relOp`.
	 * @param ctx the parse tree
	 */
	enterRelOp?: (ctx: RelOpContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.relOp`.
	 * @param ctx the parse tree
	 */
	exitRelOp?: (ctx: RelOpContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.freeStatement`.
	 * @param ctx the parse tree
	 */
	enterFreeStatement?: (ctx: FreeStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.freeStatement`.
	 * @param ctx the parse tree
	 */
	exitFreeStatement?: (ctx: FreeStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.goSubStatement`.
	 * @param ctx the parse tree
	 */
	enterGoSubStatement?: (ctx: GoSubStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.goSubStatement`.
	 * @param ctx the parse tree
	 */
	exitGoSubStatement?: (ctx: GoSubStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.gotoStatement`.
	 * @param ctx the parse tree
	 */
	enterGotoStatement?: (ctx: GotoStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.gotoStatement`.
	 * @param ctx the parse tree
	 */
	exitGotoStatement?: (ctx: GotoStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.inputStatement`.
	 * @param ctx the parse tree
	 */
	enterInputStatement?: (ctx: InputStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.inputStatement`.
	 * @param ctx the parse tree
	 */
	exitInputStatement?: (ctx: InputStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.inputLineStatement`.
	 * @param ctx the parse tree
	 */
	enterInputLineStatement?: (ctx: InputLineStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.inputLineStatement`.
	 * @param ctx the parse tree
	 */
	exitInputLineStatement?: (ctx: InputLineStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.inputArgs`.
	 * @param ctx the parse tree
	 */
	enterInputArgs?: (ctx: InputArgsContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.inputArgs`.
	 * @param ctx the parse tree
	 */
	exitInputArgs?: (ctx: InputArgsContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.iterateStatement`.
	 * @param ctx the parse tree
	 */
	enterIterateStatement?: (ctx: IterateStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.iterateStatement`.
	 * @param ctx the parse tree
	 */
	exitIterateStatement?: (ctx: IterateStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.killStatement`.
	 * @param ctx the parse tree
	 */
	enterKillStatement?: (ctx: KillStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.killStatement`.
	 * @param ctx the parse tree
	 */
	exitKillStatement?: (ctx: KillStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.lsetStatement`.
	 * @param ctx the parse tree
	 */
	enterLsetStatement?: (ctx: LsetStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.lsetStatement`.
	 * @param ctx the parse tree
	 */
	exitLsetStatement?: (ctx: LsetStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.marginStatement`.
	 * @param ctx the parse tree
	 */
	enterMarginStatement?: (ctx: MarginStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.marginStatement`.
	 * @param ctx the parse tree
	 */
	exitMarginStatement?: (ctx: MarginStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.matInputStatement`.
	 * @param ctx the parse tree
	 */
	enterMatInputStatement?: (ctx: MatInputStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.matInputStatement`.
	 * @param ctx the parse tree
	 */
	exitMatInputStatement?: (ctx: MatInputStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.matInputArray`.
	 * @param ctx the parse tree
	 */
	enterMatInputArray?: (ctx: MatInputArrayContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.matInputArray`.
	 * @param ctx the parse tree
	 */
	exitMatInputArray?: (ctx: MatInputArrayContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.matPrintStatement`.
	 * @param ctx the parse tree
	 */
	enterMatPrintStatement?: (ctx: MatPrintStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.matPrintStatement`.
	 * @param ctx the parse tree
	 */
	exitMatPrintStatement?: (ctx: MatPrintStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.matReadStatement`.
	 * @param ctx the parse tree
	 */
	enterMatReadStatement?: (ctx: MatReadStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.matReadStatement`.
	 * @param ctx the parse tree
	 */
	exitMatReadStatement?: (ctx: MatReadStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.midStatement`.
	 * @param ctx the parse tree
	 */
	enterMidStatement?: (ctx: MidStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.midStatement`.
	 * @param ctx the parse tree
	 */
	exitMidStatement?: (ctx: MidStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.moveStatement`.
	 * @param ctx the parse tree
	 */
	enterMoveStatement?: (ctx: MoveStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.moveStatement`.
	 * @param ctx the parse tree
	 */
	exitMoveStatement?: (ctx: MoveStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.moveItem`.
	 * @param ctx the parse tree
	 */
	enterMoveItem?: (ctx: MoveItemContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.moveItem`.
	 * @param ctx the parse tree
	 */
	exitMoveItem?: (ctx: MoveItemContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.variableDescriptionStatement`.
	 * @param ctx the parse tree
	 */
	enterVariableDescriptionStatement?: (ctx: VariableDescriptionStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.variableDescriptionStatement`.
	 * @param ctx the parse tree
	 */
	exitVariableDescriptionStatement?: (ctx: VariableDescriptionStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.nameAsStatement`.
	 * @param ctx the parse tree
	 */
	enterNameAsStatement?: (ctx: NameAsStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.nameAsStatement`.
	 * @param ctx the parse tree
	 */
	exitNameAsStatement?: (ctx: NameAsStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.nomarginStatement`.
	 * @param ctx the parse tree
	 */
	enterNomarginStatement?: (ctx: NomarginStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.nomarginStatement`.
	 * @param ctx the parse tree
	 */
	exitNomarginStatement?: (ctx: NomarginStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.onErrorGoBackStatement`.
	 * @param ctx the parse tree
	 */
	enterOnErrorGoBackStatement?: (ctx: OnErrorGoBackStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.onErrorGoBackStatement`.
	 * @param ctx the parse tree
	 */
	exitOnErrorGoBackStatement?: (ctx: OnErrorGoBackStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.onErrorGoToBackStatement`.
	 * @param ctx the parse tree
	 */
	enterOnErrorGoToBackStatement?: (ctx: OnErrorGoToBackStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.onErrorGoToBackStatement`.
	 * @param ctx the parse tree
	 */
	exitOnErrorGoToBackStatement?: (ctx: OnErrorGoToBackStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.onGoSubToBackStatement`.
	 * @param ctx the parse tree
	 */
	enterOnGoSubToBackStatement?: (ctx: OnGoSubToBackStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.onGoSubToBackStatement`.
	 * @param ctx the parse tree
	 */
	exitOnGoSubToBackStatement?: (ctx: OnGoSubToBackStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.openStatement`.
	 * @param ctx the parse tree
	 */
	enterOpenStatement?: (ctx: OpenStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.openStatement`.
	 * @param ctx the parse tree
	 */
	exitOpenStatement?: (ctx: OpenStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.openClause`.
	 * @param ctx the parse tree
	 */
	enterOpenClause?: (ctx: OpenClauseContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.openClause`.
	 * @param ctx the parse tree
	 */
	exitOpenClause?: (ctx: OpenClauseContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.accessSpec`.
	 * @param ctx the parse tree
	 */
	enterAccessSpec?: (ctx: AccessSpecContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.accessSpec`.
	 * @param ctx the parse tree
	 */
	exitAccessSpec?: (ctx: AccessSpecContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.accessMode`.
	 * @param ctx the parse tree
	 */
	enterAccessMode?: (ctx: AccessModeContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.accessMode`.
	 * @param ctx the parse tree
	 */
	exitAccessMode?: (ctx: AccessModeContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.allowSpec`.
	 * @param ctx the parse tree
	 */
	enterAllowSpec?: (ctx: AllowSpecContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.allowSpec`.
	 * @param ctx the parse tree
	 */
	exitAllowSpec?: (ctx: AllowSpecContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.allowMode`.
	 * @param ctx the parse tree
	 */
	enterAllowMode?: (ctx: AllowModeContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.allowMode`.
	 * @param ctx the parse tree
	 */
	exitAllowMode?: (ctx: AllowModeContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.orgSpec`.
	 * @param ctx the parse tree
	 */
	enterOrgSpec?: (ctx: OrgSpecContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.orgSpec`.
	 * @param ctx the parse tree
	 */
	exitOrgSpec?: (ctx: OrgSpecContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.orgMode`.
	 * @param ctx the parse tree
	 */
	enterOrgMode?: (ctx: OrgModeContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.orgMode`.
	 * @param ctx the parse tree
	 */
	exitOrgMode?: (ctx: OrgModeContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.orgMode2`.
	 * @param ctx the parse tree
	 */
	enterOrgMode2?: (ctx: OrgMode2Context) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.orgMode2`.
	 * @param ctx the parse tree
	 */
	exitOrgMode2?: (ctx: OrgMode2Context) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.recSpec`.
	 * @param ctx the parse tree
	 */
	enterRecSpec?: (ctx: RecSpecContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.recSpec`.
	 * @param ctx the parse tree
	 */
	exitRecSpec?: (ctx: RecSpecContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.recMode`.
	 * @param ctx the parse tree
	 */
	enterRecMode?: (ctx: RecModeContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.recMode`.
	 * @param ctx the parse tree
	 */
	exitRecMode?: (ctx: RecModeContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.keyOpenClause`.
	 * @param ctx the parse tree
	 */
	enterKeyOpenClause?: (ctx: KeyOpenClauseContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.keyOpenClause`.
	 * @param ctx the parse tree
	 */
	exitKeyOpenClause?: (ctx: KeyOpenClauseContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.optionStatement`.
	 * @param ctx the parse tree
	 */
	enterOptionStatement?: (ctx: OptionStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.optionStatement`.
	 * @param ctx the parse tree
	 */
	exitOptionStatement?: (ctx: OptionStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.optionClause`.
	 * @param ctx the parse tree
	 */
	enterOptionClause?: (ctx: OptionClauseContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.optionClause`.
	 * @param ctx the parse tree
	 */
	exitOptionClause?: (ctx: OptionClauseContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.angleClause`.
	 * @param ctx the parse tree
	 */
	enterAngleClause?: (ctx: AngleClauseContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.angleClause`.
	 * @param ctx the parse tree
	 */
	exitAngleClause?: (ctx: AngleClauseContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.handleClause`.
	 * @param ctx the parse tree
	 */
	enterHandleClause?: (ctx: HandleClauseContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.handleClause`.
	 * @param ctx the parse tree
	 */
	exitHandleClause?: (ctx: HandleClauseContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.constTypeClause`.
	 * @param ctx the parse tree
	 */
	enterConstTypeClause?: (ctx: ConstTypeClauseContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.constTypeClause`.
	 * @param ctx the parse tree
	 */
	exitConstTypeClause?: (ctx: ConstTypeClauseContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.typeClause`.
	 * @param ctx the parse tree
	 */
	enterTypeClause?: (ctx: TypeClauseContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.typeClause`.
	 * @param ctx the parse tree
	 */
	exitTypeClause?: (ctx: TypeClauseContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.sizeClause`.
	 * @param ctx the parse tree
	 */
	enterSizeClause?: (ctx: SizeClauseContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.sizeClause`.
	 * @param ctx the parse tree
	 */
	exitSizeClause?: (ctx: SizeClauseContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.sizItem`.
	 * @param ctx the parse tree
	 */
	enterSizItem?: (ctx: SizItemContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.sizItem`.
	 * @param ctx the parse tree
	 */
	exitSizItem?: (ctx: SizItemContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.intClause`.
	 * @param ctx the parse tree
	 */
	enterIntClause?: (ctx: IntClauseContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.intClause`.
	 * @param ctx the parse tree
	 */
	exitIntClause?: (ctx: IntClauseContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.realClause`.
	 * @param ctx the parse tree
	 */
	enterRealClause?: (ctx: RealClauseContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.realClause`.
	 * @param ctx the parse tree
	 */
	exitRealClause?: (ctx: RealClauseContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.activeClause`.
	 * @param ctx the parse tree
	 */
	enterActiveClause?: (ctx: ActiveClauseContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.activeClause`.
	 * @param ctx the parse tree
	 */
	exitActiveClause?: (ctx: ActiveClauseContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.activeItem`.
	 * @param ctx the parse tree
	 */
	enterActiveItem?: (ctx: ActiveItemContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.activeItem`.
	 * @param ctx the parse tree
	 */
	exitActiveItem?: (ctx: ActiveItemContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.printStatement`.
	 * @param ctx the parse tree
	 */
	enterPrintStatement?: (ctx: PrintStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.printStatement`.
	 * @param ctx the parse tree
	 */
	exitPrintStatement?: (ctx: PrintStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.putStatement`.
	 * @param ctx the parse tree
	 */
	enterPutStatement?: (ctx: PutStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.putStatement`.
	 * @param ctx the parse tree
	 */
	exitPutStatement?: (ctx: PutStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.randomStatement`.
	 * @param ctx the parse tree
	 */
	enterRandomStatement?: (ctx: RandomStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.randomStatement`.
	 * @param ctx the parse tree
	 */
	exitRandomStatement?: (ctx: RandomStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.readStatement`.
	 * @param ctx the parse tree
	 */
	enterReadStatement?: (ctx: ReadStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.readStatement`.
	 * @param ctx the parse tree
	 */
	exitReadStatement?: (ctx: ReadStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.resetStatement`.
	 * @param ctx the parse tree
	 */
	enterResetStatement?: (ctx: ResetStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.resetStatement`.
	 * @param ctx the parse tree
	 */
	exitResetStatement?: (ctx: ResetStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.restoreStatement`.
	 * @param ctx the parse tree
	 */
	enterRestoreStatement?: (ctx: RestoreStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.restoreStatement`.
	 * @param ctx the parse tree
	 */
	exitRestoreStatement?: (ctx: RestoreStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.resumeStatement`.
	 * @param ctx the parse tree
	 */
	enterResumeStatement?: (ctx: ResumeStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.resumeStatement`.
	 * @param ctx the parse tree
	 */
	exitResumeStatement?: (ctx: ResumeStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.retryStatement`.
	 * @param ctx the parse tree
	 */
	enterRetryStatement?: (ctx: RetryStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.retryStatement`.
	 * @param ctx the parse tree
	 */
	exitRetryStatement?: (ctx: RetryStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.returnStatement`.
	 * @param ctx the parse tree
	 */
	enterReturnStatement?: (ctx: ReturnStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.returnStatement`.
	 * @param ctx the parse tree
	 */
	exitReturnStatement?: (ctx: ReturnStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.rsetStatement`.
	 * @param ctx the parse tree
	 */
	enterRsetStatement?: (ctx: RsetStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.rsetStatement`.
	 * @param ctx the parse tree
	 */
	exitRsetStatement?: (ctx: RsetStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.scratchStatement`.
	 * @param ctx the parse tree
	 */
	enterScratchStatement?: (ctx: ScratchStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.scratchStatement`.
	 * @param ctx the parse tree
	 */
	exitScratchStatement?: (ctx: ScratchStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.setPromptStatement`.
	 * @param ctx the parse tree
	 */
	enterSetPromptStatement?: (ctx: SetPromptStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.setPromptStatement`.
	 * @param ctx the parse tree
	 */
	exitSetPromptStatement?: (ctx: SetPromptStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.sleepStatement`.
	 * @param ctx the parse tree
	 */
	enterSleepStatement?: (ctx: SleepStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.sleepStatement`.
	 * @param ctx the parse tree
	 */
	exitSleepStatement?: (ctx: SleepStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.stopStatement`.
	 * @param ctx the parse tree
	 */
	enterStopStatement?: (ctx: StopStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.stopStatement`.
	 * @param ctx the parse tree
	 */
	exitStopStatement?: (ctx: StopStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.unlockStatement`.
	 * @param ctx the parse tree
	 */
	enterUnlockStatement?: (ctx: UnlockStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.unlockStatement`.
	 * @param ctx the parse tree
	 */
	exitUnlockStatement?: (ctx: UnlockStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.updateStatement`.
	 * @param ctx the parse tree
	 */
	enterUpdateStatement?: (ctx: UpdateStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.updateStatement`.
	 * @param ctx the parse tree
	 */
	exitUpdateStatement?: (ctx: UpdateStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.waitStatement`.
	 * @param ctx the parse tree
	 */
	enterWaitStatement?: (ctx: WaitStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.waitStatement`.
	 * @param ctx the parse tree
	 */
	exitWaitStatement?: (ctx: WaitStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.whenErrorInStatement`.
	 * @param ctx the parse tree
	 */
	enterWhenErrorInStatement?: (ctx: WhenErrorInStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.whenErrorInStatement`.
	 * @param ctx the parse tree
	 */
	exitWhenErrorInStatement?: (ctx: WhenErrorInStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.whenErrorUseStatement`.
	 * @param ctx the parse tree
	 */
	enterWhenErrorUseStatement?: (ctx: WhenErrorUseStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.whenErrorUseStatement`.
	 * @param ctx the parse tree
	 */
	exitWhenErrorUseStatement?: (ctx: WhenErrorUseStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.handlerUseStatement`.
	 * @param ctx the parse tree
	 */
	enterHandlerUseStatement?: (ctx: HandlerUseStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.handlerUseStatement`.
	 * @param ctx the parse tree
	 */
	exitHandlerUseStatement?: (ctx: HandlerUseStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.ifStatement`.
	 * @param ctx the parse tree
	 */
	enterIfStatement?: (ctx: IfStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.ifStatement`.
	 * @param ctx the parse tree
	 */
	exitIfStatement?: (ctx: IfStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.ifCondition`.
	 * @param ctx the parse tree
	 */
	enterIfCondition?: (ctx: IfConditionContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.ifCondition`.
	 * @param ctx the parse tree
	 */
	exitIfCondition?: (ctx: IfConditionContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.ifStatementModifier`.
	 * @param ctx the parse tree
	 */
	enterIfStatementModifier?: (ctx: IfStatementModifierContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.ifStatementModifier`.
	 * @param ctx the parse tree
	 */
	exitIfStatementModifier?: (ctx: IfStatementModifierContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.elsifClause`.
	 * @param ctx the parse tree
	 */
	enterElsifClause?: (ctx: ElsifClauseContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.elsifClause`.
	 * @param ctx the parse tree
	 */
	exitElsifClause?: (ctx: ElsifClauseContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.elseClause`.
	 * @param ctx the parse tree
	 */
	enterElseClause?: (ctx: ElseClauseContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.elseClause`.
	 * @param ctx the parse tree
	 */
	exitElseClause?: (ctx: ElseClauseContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.forUnconditionalStatement`.
	 * @param ctx the parse tree
	 */
	enterForUnconditionalStatement?: (ctx: ForUnconditionalStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.forUnconditionalStatement`.
	 * @param ctx the parse tree
	 */
	exitForUnconditionalStatement?: (ctx: ForUnconditionalStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.forConditionalStatement`.
	 * @param ctx the parse tree
	 */
	enterForConditionalStatement?: (ctx: ForConditionalStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.forConditionalStatement`.
	 * @param ctx the parse tree
	 */
	exitForConditionalStatement?: (ctx: ForConditionalStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.forUnconditionalHeader`.
	 * @param ctx the parse tree
	 */
	enterForUnconditionalHeader?: (ctx: ForUnconditionalHeaderContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.forUnconditionalHeader`.
	 * @param ctx the parse tree
	 */
	exitForUnconditionalHeader?: (ctx: ForUnconditionalHeaderContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.forConditionalStatementHeader`.
	 * @param ctx the parse tree
	 */
	enterForConditionalStatementHeader?: (ctx: ForConditionalStatementHeaderContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.forConditionalStatementHeader`.
	 * @param ctx the parse tree
	 */
	exitForConditionalStatementHeader?: (ctx: ForConditionalStatementHeaderContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.stepClause`.
	 * @param ctx the parse tree
	 */
	enterStepClause?: (ctx: StepClauseContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.stepClause`.
	 * @param ctx the parse tree
	 */
	exitStepClause?: (ctx: StepClauseContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.selectCaseStatement`.
	 * @param ctx the parse tree
	 */
	enterSelectCaseStatement?: (ctx: SelectCaseStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.selectCaseStatement`.
	 * @param ctx the parse tree
	 */
	exitSelectCaseStatement?: (ctx: SelectCaseStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.caseAlternative`.
	 * @param ctx the parse tree
	 */
	enterCaseAlternative?: (ctx: CaseAlternativeContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.caseAlternative`.
	 * @param ctx the parse tree
	 */
	exitCaseAlternative?: (ctx: CaseAlternativeContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.caseExpn`.
	 * @param ctx the parse tree
	 */
	enterCaseExpn?: (ctx: CaseExpnContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.caseExpn`.
	 * @param ctx the parse tree
	 */
	exitCaseExpn?: (ctx: CaseExpnContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.toExpn`.
	 * @param ctx the parse tree
	 */
	enterToExpn?: (ctx: ToExpnContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.toExpn`.
	 * @param ctx the parse tree
	 */
	exitToExpn?: (ctx: ToExpnContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.lastCaseAlternative`.
	 * @param ctx the parse tree
	 */
	enterLastCaseAlternative?: (ctx: LastCaseAlternativeContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.lastCaseAlternative`.
	 * @param ctx the parse tree
	 */
	exitLastCaseAlternative?: (ctx: LastCaseAlternativeContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.untilStatement`.
	 * @param ctx the parse tree
	 */
	enterUntilStatement?: (ctx: UntilStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.untilStatement`.
	 * @param ctx the parse tree
	 */
	exitUntilStatement?: (ctx: UntilStatementContext) => void;

	/**
	 * Enter a parse tree produced by `BasicParser.whileStatement`.
	 * @param ctx the parse tree
	 */
	enterWhileStatement?: (ctx: WhileStatementContext) => void;
	/**
	 * Exit a parse tree produced by `BasicParser.whileStatement`.
	 * @param ctx the parse tree
	 */
	exitWhileStatement?: (ctx: WhileStatementContext) => void;
}

