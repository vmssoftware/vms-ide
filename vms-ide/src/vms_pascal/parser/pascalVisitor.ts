// Generated from src/parser/pascal.g4 by ANTLR 4.7.3-SNAPSHOT


import { ParseTreeVisitor } from "antlr4ts/tree/ParseTreeVisitor";

import { ProgramContext } from "./pascalParser";
import { ProgramHeadingContext } from "./pascalParser";
import { InheritBrackContext } from "./pascalParser";
import { InheritContext } from "./pascalParser";
import { InvironmentContext } from "./pascalParser";
import { IdentifierContext } from "./pascalParser";
import { AttributePartContext } from "./pascalParser";
import { AttributeDefContext } from "./pascalParser";
import { AttributeContext } from "./pascalParser";
import { BlockContext } from "./pascalParser";
import { UsesUnitsPartContext } from "./pascalParser";
import { LabelDeclarationPartContext } from "./pascalParser";
import { LabelContext } from "./pascalParser";
import { ConstantDefinitionPartContext } from "./pascalParser";
import { ConstantDefinitionContext } from "./pascalParser";
import { ConstantChrContext } from "./pascalParser";
import { ConstantContext } from "./pascalParser";
import { UnsignedNumberContext } from "./pascalParser";
import { UnsignedIntegerContext } from "./pascalParser";
import { UnsignedRealContext } from "./pascalParser";
import { SignContext } from "./pascalParser";
import { BoolContext } from "./pascalParser";
import { StringContext } from "./pascalParser";
import { TypeDefinitionPartContext } from "./pascalParser";
import { TypeDefinitionContext } from "./pascalParser";
import { FunctionTypeContext } from "./pascalParser";
import { ProcedureTypeContext } from "./pascalParser";
import { TypeContext } from "./pascalParser";
import { SimpleTypeContext } from "./pascalParser";
import { ScalarTypeContext } from "./pascalParser";
import { SubrangeTypeContext } from "./pascalParser";
import { TypeIdentifierContext } from "./pascalParser";
import { StructuredTypeContext } from "./pascalParser";
import { UnpackedStructuredTypeContext } from "./pascalParser";
import { StringtypeContext } from "./pascalParser";
import { ArrayTypeContext } from "./pascalParser";
import { TypeListContext } from "./pascalParser";
import { IndexTypeContext } from "./pascalParser";
import { ComponentTypeContext } from "./pascalParser";
import { RecordTypeContext } from "./pascalParser";
import { FieldListContext } from "./pascalParser";
import { FixedPartContext } from "./pascalParser";
import { RecordSectionContext } from "./pascalParser";
import { VariantPartContext } from "./pascalParser";
import { TagContext } from "./pascalParser";
import { VariantContext } from "./pascalParser";
import { SetTypeContext } from "./pascalParser";
import { BaseTypeContext } from "./pascalParser";
import { FileTypeContext } from "./pascalParser";
import { PointerTypeContext } from "./pascalParser";
import { VariableDeclarationPartContext } from "./pascalParser";
import { VariableDeclarationContext } from "./pascalParser";
import { VariablePreDeclarationContext } from "./pascalParser";
import { ToBeginEndDoDeclarationPartContext } from "./pascalParser";
import { ProcedureAndFunctionDeclarationPartContext } from "./pascalParser";
import { ProcedureOrFunctionDeclarationContext } from "./pascalParser";
import { ProcedureDeclarationContext } from "./pascalParser";
import { FormalParameterListContext } from "./pascalParser";
import { FormalParameterSectionContext } from "./pascalParser";
import { ParameterGroupContext } from "./pascalParser";
import { IdentifierListContext } from "./pascalParser";
import { InitializerListContext } from "./pascalParser";
import { ConstListContext } from "./pascalParser";
import { FunctionDeclarationContext } from "./pascalParser";
import { ResultTypeContext } from "./pascalParser";
import { StatementContext } from "./pascalParser";
import { UnlabelledStatementContext } from "./pascalParser";
import { SimpleStatementContext } from "./pascalParser";
import { AssignmentStatementContext } from "./pascalParser";
import { VariableContext } from "./pascalParser";
import { ExpressionContext } from "./pascalParser";
import { RelationaloperatorContext } from "./pascalParser";
import { SimpleExpressionContext } from "./pascalParser";
import { AdditiveoperatorContext } from "./pascalParser";
import { TermContext } from "./pascalParser";
import { MultiplicativeoperatorContext } from "./pascalParser";
import { SignedFactorContext } from "./pascalParser";
import { FactorContext } from "./pascalParser";
import { UnsignedConstantContext } from "./pascalParser";
import { FunctionDesignatorContext } from "./pascalParser";
import { ParameterListContext } from "./pascalParser";
import { SetContext } from "./pascalParser";
import { ElementListContext } from "./pascalParser";
import { ElementContext } from "./pascalParser";
import { ProcedureStatementContext } from "./pascalParser";
import { ActualParameterContext } from "./pascalParser";
import { ParameterwidthContext } from "./pascalParser";
import { GotoStatementContext } from "./pascalParser";
import { EmptyStatementContext } from "./pascalParser";
import { EmptyContext } from "./pascalParser";
import { StructuredStatementContext } from "./pascalParser";
import { CompoundStatementContext } from "./pascalParser";
import { OpenCompoundStatementContext } from "./pascalParser";
import { StatementsContext } from "./pascalParser";
import { ConditionalStatementContext } from "./pascalParser";
import { IfStatementContext } from "./pascalParser";
import { CaseStatementContext } from "./pascalParser";
import { CaseListElementContext } from "./pascalParser";
import { RepetetiveStatementContext } from "./pascalParser";
import { WhileStatementContext } from "./pascalParser";
import { RepeatStatementContext } from "./pascalParser";
import { ForStatementContext } from "./pascalParser";
import { ForListContext } from "./pascalParser";
import { InitialValueContext } from "./pascalParser";
import { FinalValueContext } from "./pascalParser";
import { WithStatementContext } from "./pascalParser";
import { RecordVariableListContext } from "./pascalParser";


/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by `pascalParser`.
 *
 * @param <Result> The return type of the visit operation. Use `void` for
 * operations with no return type.
 */
export interface pascalVisitor<Result> extends ParseTreeVisitor<Result> {
	/**
	 * Visit a parse tree produced by `pascalParser.program`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProgram?: (ctx: ProgramContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.programHeading`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProgramHeading?: (ctx: ProgramHeadingContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.inheritBrack`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitInheritBrack?: (ctx: InheritBrackContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.inherit`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitInherit?: (ctx: InheritContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.invironment`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitInvironment?: (ctx: InvironmentContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.identifier`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIdentifier?: (ctx: IdentifierContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.attributePart`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAttributePart?: (ctx: AttributePartContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.attributeDef`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAttributeDef?: (ctx: AttributeDefContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.attribute`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAttribute?: (ctx: AttributeContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.block`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitBlock?: (ctx: BlockContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.usesUnitsPart`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUsesUnitsPart?: (ctx: UsesUnitsPartContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.labelDeclarationPart`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLabelDeclarationPart?: (ctx: LabelDeclarationPartContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.label`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLabel?: (ctx: LabelContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.constantDefinitionPart`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitConstantDefinitionPart?: (ctx: ConstantDefinitionPartContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.constantDefinition`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitConstantDefinition?: (ctx: ConstantDefinitionContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.constantChr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitConstantChr?: (ctx: ConstantChrContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.constant`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitConstant?: (ctx: ConstantContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.unsignedNumber`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUnsignedNumber?: (ctx: UnsignedNumberContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.unsignedInteger`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUnsignedInteger?: (ctx: UnsignedIntegerContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.unsignedReal`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUnsignedReal?: (ctx: UnsignedRealContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.sign`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSign?: (ctx: SignContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.bool`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitBool?: (ctx: BoolContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.string`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitString?: (ctx: StringContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.typeDefinitionPart`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTypeDefinitionPart?: (ctx: TypeDefinitionPartContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.typeDefinition`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTypeDefinition?: (ctx: TypeDefinitionContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.functionType`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFunctionType?: (ctx: FunctionTypeContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.procedureType`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProcedureType?: (ctx: ProcedureTypeContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.type`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitType?: (ctx: TypeContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.simpleType`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSimpleType?: (ctx: SimpleTypeContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.scalarType`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitScalarType?: (ctx: ScalarTypeContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.subrangeType`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSubrangeType?: (ctx: SubrangeTypeContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.typeIdentifier`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTypeIdentifier?: (ctx: TypeIdentifierContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.structuredType`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStructuredType?: (ctx: StructuredTypeContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.unpackedStructuredType`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUnpackedStructuredType?: (ctx: UnpackedStructuredTypeContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.stringtype`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStringtype?: (ctx: StringtypeContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.arrayType`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitArrayType?: (ctx: ArrayTypeContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.typeList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTypeList?: (ctx: TypeListContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.indexType`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIndexType?: (ctx: IndexTypeContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.componentType`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitComponentType?: (ctx: ComponentTypeContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.recordType`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRecordType?: (ctx: RecordTypeContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.fieldList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFieldList?: (ctx: FieldListContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.fixedPart`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFixedPart?: (ctx: FixedPartContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.recordSection`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRecordSection?: (ctx: RecordSectionContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.variantPart`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitVariantPart?: (ctx: VariantPartContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.tag`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTag?: (ctx: TagContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.variant`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitVariant?: (ctx: VariantContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.setType`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSetType?: (ctx: SetTypeContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.baseType`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitBaseType?: (ctx: BaseTypeContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.fileType`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFileType?: (ctx: FileTypeContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.pointerType`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPointerType?: (ctx: PointerTypeContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.variableDeclarationPart`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitVariableDeclarationPart?: (ctx: VariableDeclarationPartContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.variableDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitVariableDeclaration?: (ctx: VariableDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.variablePreDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitVariablePreDeclaration?: (ctx: VariablePreDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.toBeginEndDoDeclarationPart`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitToBeginEndDoDeclarationPart?: (ctx: ToBeginEndDoDeclarationPartContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.procedureAndFunctionDeclarationPart`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProcedureAndFunctionDeclarationPart?: (ctx: ProcedureAndFunctionDeclarationPartContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.procedureOrFunctionDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProcedureOrFunctionDeclaration?: (ctx: ProcedureOrFunctionDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.procedureDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProcedureDeclaration?: (ctx: ProcedureDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.formalParameterList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFormalParameterList?: (ctx: FormalParameterListContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.formalParameterSection`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFormalParameterSection?: (ctx: FormalParameterSectionContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.parameterGroup`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParameterGroup?: (ctx: ParameterGroupContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.identifierList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIdentifierList?: (ctx: IdentifierListContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.initializerList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitInitializerList?: (ctx: InitializerListContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.constList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitConstList?: (ctx: ConstListContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.functionDeclaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFunctionDeclaration?: (ctx: FunctionDeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.resultType`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitResultType?: (ctx: ResultTypeContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStatement?: (ctx: StatementContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.unlabelledStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUnlabelledStatement?: (ctx: UnlabelledStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.simpleStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSimpleStatement?: (ctx: SimpleStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.assignmentStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAssignmentStatement?: (ctx: AssignmentStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.variable`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitVariable?: (ctx: VariableContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.expression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExpression?: (ctx: ExpressionContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.relationaloperator`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRelationaloperator?: (ctx: RelationaloperatorContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.simpleExpression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSimpleExpression?: (ctx: SimpleExpressionContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.additiveoperator`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAdditiveoperator?: (ctx: AdditiveoperatorContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.term`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTerm?: (ctx: TermContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.multiplicativeoperator`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMultiplicativeoperator?: (ctx: MultiplicativeoperatorContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.signedFactor`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSignedFactor?: (ctx: SignedFactorContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.factor`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFactor?: (ctx: FactorContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.unsignedConstant`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUnsignedConstant?: (ctx: UnsignedConstantContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.functionDesignator`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFunctionDesignator?: (ctx: FunctionDesignatorContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.parameterList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParameterList?: (ctx: ParameterListContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.set`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSet?: (ctx: SetContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.elementList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitElementList?: (ctx: ElementListContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.element`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitElement?: (ctx: ElementContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.procedureStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProcedureStatement?: (ctx: ProcedureStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.actualParameter`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitActualParameter?: (ctx: ActualParameterContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.parameterwidth`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParameterwidth?: (ctx: ParameterwidthContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.gotoStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitGotoStatement?: (ctx: GotoStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.emptyStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEmptyStatement?: (ctx: EmptyStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.empty`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEmpty?: (ctx: EmptyContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.structuredStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStructuredStatement?: (ctx: StructuredStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.compoundStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCompoundStatement?: (ctx: CompoundStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.openCompoundStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOpenCompoundStatement?: (ctx: OpenCompoundStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.statements`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStatements?: (ctx: StatementsContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.conditionalStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitConditionalStatement?: (ctx: ConditionalStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.ifStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIfStatement?: (ctx: IfStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.caseStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCaseStatement?: (ctx: CaseStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.caseListElement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCaseListElement?: (ctx: CaseListElementContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.repetetiveStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRepetetiveStatement?: (ctx: RepetetiveStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.whileStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitWhileStatement?: (ctx: WhileStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.repeatStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRepeatStatement?: (ctx: RepeatStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.forStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitForStatement?: (ctx: ForStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.forList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitForList?: (ctx: ForListContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.initialValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitInitialValue?: (ctx: InitialValueContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.finalValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFinalValue?: (ctx: FinalValueContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.withStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitWithStatement?: (ctx: WithStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.recordVariableList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRecordVariableList?: (ctx: RecordVariableListContext) => Result;
}

