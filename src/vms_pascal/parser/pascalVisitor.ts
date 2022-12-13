// Generated from src/vms_pascal/parser/pascal.g4 by ANTLR 4.9.0-SNAPSHOT


import { ParseTreeVisitor } from "antlr4ts/tree/ParseTreeVisitor";

import { ProgramContext } from "./pascalParser";
import { ProgramHeadingContext } from "./pascalParser";
import { IdentifierContext } from "./pascalParser";
import { AttributePartContext } from "./pascalParser";
import { AttributeProgramContext } from "./pascalParser";
import { AttributeModuleContext } from "./pascalParser";
import { AttributeTypeContext } from "./pascalParser";
import { AttributeVarContext } from "./pascalParser";
import { AttributeConstContext } from "./pascalParser";
import { AttributeDefContext } from "./pascalParser";
import { PreReservedWordsContext } from "./pascalParser";
import { AttributeContext } from "./pascalParser";
import { DirectivesContext } from "./pascalParser";
import { BlockDeclarationsContext } from "./pascalParser";
import { BlockContext } from "./pascalParser";
import { BlockInContext } from "./pascalParser";
import { LabelDeclarationPartContext } from "./pascalParser";
import { LabelContext } from "./pascalParser";
import { ConstantDefinitionPartContext } from "./pascalParser";
import { ConstantDefinitionContext } from "./pascalParser";
import { ConstantNameContext } from "./pascalParser";
import { ConstantChrContext } from "./pascalParser";
import { ConstantContext } from "./pascalParser";
import { UnsignedNumberContext } from "./pascalParser";
import { UnsignedIntegerContext } from "./pascalParser";
import { UnsignedRealContext } from "./pascalParser";
import { SignContext } from "./pascalParser";
import { BoolContext } from "./pascalParser";
import { StringContext } from "./pascalParser";
import { ValueDefinitionPartContext } from "./pascalParser";
import { VariableNameContext } from "./pascalParser";
import { VariableChildNameContext } from "./pascalParser";
import { TypeDefinitionPartContext } from "./pascalParser";
import { TypeDefinitionContext } from "./pascalParser";
import { FunctionTypeContext } from "./pascalParser";
import { ProcedureTypeContext } from "./pascalParser";
import { TypeContext } from "./pascalParser";
import { SimpleTypeContext } from "./pascalParser";
import { EnumTypeContext } from "./pascalParser";
import { SubrangeTypeContext } from "./pascalParser";
import { TypeIdentifierContext } from "./pascalParser";
import { VariableDescriptionContext } from "./pascalParser";
import { StructuredTypeContext } from "./pascalParser";
import { UnpackedStructuredTypeContext } from "./pascalParser";
import { StringtypeContext } from "./pascalParser";
import { VaryingTypeContext } from "./pascalParser";
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
import { TextTypeContext } from "./pascalParser";
import { PointerTypeContext } from "./pascalParser";
import { SchemaTypeContext } from "./pascalParser";
import { SchemaListContext } from "./pascalParser";
import { SchemaNameContext } from "./pascalParser";
import { PrototypeTypeContext } from "./pascalParser";
import { PrototypeListContext } from "./pascalParser";
import { ConstructorValueContext } from "./pascalParser";
import { ConstructorArrayContext } from "./pascalParser";
import { TypeNameContext } from "./pascalParser";
import { ComponentValueContext } from "./pascalParser";
import { ConstructorRecordContext } from "./pascalParser";
import { InitializerListContext } from "./pascalParser";
import { InitializerItemContext } from "./pascalParser";
import { TagValueContext } from "./pascalParser";
import { ConstructorSetContext } from "./pascalParser";
import { ConstructorNonStdArrayContext } from "./pascalParser";
import { ComponentValueNContext } from "./pascalParser";
import { ConstructorNonStdRecordContext } from "./pascalParser";
import { VariableDeclarationPartContext } from "./pascalParser";
import { VariableDeclarationContext } from "./pascalParser";
import { VariablePreDeclarationContext } from "./pascalParser";
import { VariablePreDeclarationValueContext } from "./pascalParser";
import { VariablePreDeclarationAssignContext } from "./pascalParser";
import { ToBeginEndDoDeclarationPartContext } from "./pascalParser";
import { ProcedureAndFunctionDeclarationPartContext } from "./pascalParser";
import { ProcedureOrFunctionDeclarationContext } from "./pascalParser";
import { ProcedureDeclarationContext } from "./pascalParser";
import { FormalParameterListContext } from "./pascalParser";
import { FormalParameterSectionContext } from "./pascalParser";
import { ParameterGroupContext } from "./pascalParser";
import { AssignExpressionContext } from "./pascalParser";
import { IdentifierListContext } from "./pascalParser";
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
import { AttibuteFuncParamContext } from "./pascalParser";
import { SetContext } from "./pascalParser";
import { ElementListContext } from "./pascalParser";
import { ElementContext } from "./pascalParser";
import { ProcedureStatementContext } from "./pascalParser";
import { ActualParameterContext } from "./pascalParser";
import { ParameterwidthContext } from "./pascalParser";
import { GotoStatementContext } from "./pascalParser";
import { BreakStatementContext } from "./pascalParser";
import { ContinueStatementContext } from "./pascalParser";
import { ReturnStatementContext } from "./pascalParser";
import { StringExpressionContext } from "./pascalParser";
import { EmptyStatementContext } from "./pascalParser";
import { ExecSqlStatementContext } from "./pascalParser";
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
import { IncludeDirectiveContext } from "./pascalParser";
import { DictionaryDirectiveContext } from "./pascalParser";
import { TitleDirectiveContext } from "./pascalParser";
import { PDefinedDirectiveContext } from "./pascalParser";
import { MessageDirectiveContext } from "./pascalParser";
import { InfoFuncDirectiveContext } from "./pascalParser";
import { PIfDirectiveContext } from "./pascalParser";
import { PIfTokenContext } from "./pascalParser";


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
	 * Visit a parse tree produced by `pascalParser.attributeProgram`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAttributeProgram?: (ctx: AttributeProgramContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.attributeModule`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAttributeModule?: (ctx: AttributeModuleContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.attributeType`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAttributeType?: (ctx: AttributeTypeContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.attributeVar`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAttributeVar?: (ctx: AttributeVarContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.attributeConst`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAttributeConst?: (ctx: AttributeConstContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.attributeDef`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAttributeDef?: (ctx: AttributeDefContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.preReservedWords`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPreReservedWords?: (ctx: PreReservedWordsContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.attribute`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAttribute?: (ctx: AttributeContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.directives`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDirectives?: (ctx: DirectivesContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.blockDeclarations`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitBlockDeclarations?: (ctx: BlockDeclarationsContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.block`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitBlock?: (ctx: BlockContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.blockIn`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitBlockIn?: (ctx: BlockInContext) => Result;

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
	 * Visit a parse tree produced by `pascalParser.constantName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitConstantName?: (ctx: ConstantNameContext) => Result;

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
	 * Visit a parse tree produced by `pascalParser.valueDefinitionPart`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitValueDefinitionPart?: (ctx: ValueDefinitionPartContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.variableName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitVariableName?: (ctx: VariableNameContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.variableChildName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitVariableChildName?: (ctx: VariableChildNameContext) => Result;

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
	 * Visit a parse tree produced by `pascalParser.enumType`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEnumType?: (ctx: EnumTypeContext) => Result;

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
	 * Visit a parse tree produced by `pascalParser.variableDescription`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitVariableDescription?: (ctx: VariableDescriptionContext) => Result;

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
	 * Visit a parse tree produced by `pascalParser.varyingType`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitVaryingType?: (ctx: VaryingTypeContext) => Result;

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
	 * Visit a parse tree produced by `pascalParser.textType`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTextType?: (ctx: TextTypeContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.pointerType`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPointerType?: (ctx: PointerTypeContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.schemaType`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSchemaType?: (ctx: SchemaTypeContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.schemaList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSchemaList?: (ctx: SchemaListContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.schemaName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSchemaName?: (ctx: SchemaNameContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.prototypeType`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPrototypeType?: (ctx: PrototypeTypeContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.prototypeList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPrototypeList?: (ctx: PrototypeListContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.constructorValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitConstructorValue?: (ctx: ConstructorValueContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.constructorArray`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitConstructorArray?: (ctx: ConstructorArrayContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.typeName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTypeName?: (ctx: TypeNameContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.componentValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitComponentValue?: (ctx: ComponentValueContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.constructorRecord`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitConstructorRecord?: (ctx: ConstructorRecordContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.initializerList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitInitializerList?: (ctx: InitializerListContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.initializerItem`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitInitializerItem?: (ctx: InitializerItemContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.tagValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTagValue?: (ctx: TagValueContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.constructorSet`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitConstructorSet?: (ctx: ConstructorSetContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.constructorNonStdArray`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitConstructorNonStdArray?: (ctx: ConstructorNonStdArrayContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.componentValueN`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitComponentValueN?: (ctx: ComponentValueNContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.constructorNonStdRecord`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitConstructorNonStdRecord?: (ctx: ConstructorNonStdRecordContext) => Result;

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
	 * Visit a parse tree produced by `pascalParser.variablePreDeclarationValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitVariablePreDeclarationValue?: (ctx: VariablePreDeclarationValueContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.variablePreDeclarationAssign`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitVariablePreDeclarationAssign?: (ctx: VariablePreDeclarationAssignContext) => Result;

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
	 * Visit a parse tree produced by `pascalParser.assignExpression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAssignExpression?: (ctx: AssignExpressionContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.identifierList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIdentifierList?: (ctx: IdentifierListContext) => Result;

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
	 * Visit a parse tree produced by `pascalParser.attibuteFuncParam`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAttibuteFuncParam?: (ctx: AttibuteFuncParamContext) => Result;

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
	 * Visit a parse tree produced by `pascalParser.breakStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitBreakStatement?: (ctx: BreakStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.continueStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitContinueStatement?: (ctx: ContinueStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.returnStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitReturnStatement?: (ctx: ReturnStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.stringExpression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStringExpression?: (ctx: StringExpressionContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.emptyStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEmptyStatement?: (ctx: EmptyStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.execSqlStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExecSqlStatement?: (ctx: ExecSqlStatementContext) => Result;

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

	/**
	 * Visit a parse tree produced by `pascalParser.includeDirective`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIncludeDirective?: (ctx: IncludeDirectiveContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.dictionaryDirective`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDictionaryDirective?: (ctx: DictionaryDirectiveContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.titleDirective`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTitleDirective?: (ctx: TitleDirectiveContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.pDefinedDirective`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPDefinedDirective?: (ctx: PDefinedDirectiveContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.messageDirective`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMessageDirective?: (ctx: MessageDirectiveContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.infoFuncDirective`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitInfoFuncDirective?: (ctx: InfoFuncDirectiveContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.pIfDirective`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPIfDirective?: (ctx: PIfDirectiveContext) => Result;

	/**
	 * Visit a parse tree produced by `pascalParser.pIfToken`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPIfToken?: (ctx: PIfTokenContext) => Result;
}

