// Generated from src/vms_pascal/parser/pascal.g4 by ANTLR 4.7.3-SNAPSHOT


import { ParseTreeListener } from "antlr4ts/tree/ParseTreeListener";

import { ProgramContext } from "./pascalParser";
import { ProgramHeadingContext } from "./pascalParser";
import { InheritAttrContext } from "./pascalParser";
import { InheritContext } from "./pascalParser";
import { InvironmentAttrContext } from "./pascalParser";
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
 * This interface defines a complete listener for a parse tree produced by
 * `pascalParser`.
 */
export interface pascalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by `pascalParser.program`.
	 * @param ctx the parse tree
	 */
	enterProgram?: (ctx: ProgramContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.program`.
	 * @param ctx the parse tree
	 */
	exitProgram?: (ctx: ProgramContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.programHeading`.
	 * @param ctx the parse tree
	 */
	enterProgramHeading?: (ctx: ProgramHeadingContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.programHeading`.
	 * @param ctx the parse tree
	 */
	exitProgramHeading?: (ctx: ProgramHeadingContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.inheritAttr`.
	 * @param ctx the parse tree
	 */
	enterInheritAttr?: (ctx: InheritAttrContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.inheritAttr`.
	 * @param ctx the parse tree
	 */
	exitInheritAttr?: (ctx: InheritAttrContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.inherit`.
	 * @param ctx the parse tree
	 */
	enterInherit?: (ctx: InheritContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.inherit`.
	 * @param ctx the parse tree
	 */
	exitInherit?: (ctx: InheritContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.invironmentAttr`.
	 * @param ctx the parse tree
	 */
	enterInvironmentAttr?: (ctx: InvironmentAttrContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.invironmentAttr`.
	 * @param ctx the parse tree
	 */
	exitInvironmentAttr?: (ctx: InvironmentAttrContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.identifier`.
	 * @param ctx the parse tree
	 */
	enterIdentifier?: (ctx: IdentifierContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.identifier`.
	 * @param ctx the parse tree
	 */
	exitIdentifier?: (ctx: IdentifierContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.attributePart`.
	 * @param ctx the parse tree
	 */
	enterAttributePart?: (ctx: AttributePartContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.attributePart`.
	 * @param ctx the parse tree
	 */
	exitAttributePart?: (ctx: AttributePartContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.attributeDef`.
	 * @param ctx the parse tree
	 */
	enterAttributeDef?: (ctx: AttributeDefContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.attributeDef`.
	 * @param ctx the parse tree
	 */
	exitAttributeDef?: (ctx: AttributeDefContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.attribute`.
	 * @param ctx the parse tree
	 */
	enterAttribute?: (ctx: AttributeContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.attribute`.
	 * @param ctx the parse tree
	 */
	exitAttribute?: (ctx: AttributeContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.block`.
	 * @param ctx the parse tree
	 */
	enterBlock?: (ctx: BlockContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.block`.
	 * @param ctx the parse tree
	 */
	exitBlock?: (ctx: BlockContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.usesUnitsPart`.
	 * @param ctx the parse tree
	 */
	enterUsesUnitsPart?: (ctx: UsesUnitsPartContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.usesUnitsPart`.
	 * @param ctx the parse tree
	 */
	exitUsesUnitsPart?: (ctx: UsesUnitsPartContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.labelDeclarationPart`.
	 * @param ctx the parse tree
	 */
	enterLabelDeclarationPart?: (ctx: LabelDeclarationPartContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.labelDeclarationPart`.
	 * @param ctx the parse tree
	 */
	exitLabelDeclarationPart?: (ctx: LabelDeclarationPartContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.label`.
	 * @param ctx the parse tree
	 */
	enterLabel?: (ctx: LabelContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.label`.
	 * @param ctx the parse tree
	 */
	exitLabel?: (ctx: LabelContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.constantDefinitionPart`.
	 * @param ctx the parse tree
	 */
	enterConstantDefinitionPart?: (ctx: ConstantDefinitionPartContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.constantDefinitionPart`.
	 * @param ctx the parse tree
	 */
	exitConstantDefinitionPart?: (ctx: ConstantDefinitionPartContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.constantDefinition`.
	 * @param ctx the parse tree
	 */
	enterConstantDefinition?: (ctx: ConstantDefinitionContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.constantDefinition`.
	 * @param ctx the parse tree
	 */
	exitConstantDefinition?: (ctx: ConstantDefinitionContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.constantChr`.
	 * @param ctx the parse tree
	 */
	enterConstantChr?: (ctx: ConstantChrContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.constantChr`.
	 * @param ctx the parse tree
	 */
	exitConstantChr?: (ctx: ConstantChrContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.constant`.
	 * @param ctx the parse tree
	 */
	enterConstant?: (ctx: ConstantContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.constant`.
	 * @param ctx the parse tree
	 */
	exitConstant?: (ctx: ConstantContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.unsignedNumber`.
	 * @param ctx the parse tree
	 */
	enterUnsignedNumber?: (ctx: UnsignedNumberContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.unsignedNumber`.
	 * @param ctx the parse tree
	 */
	exitUnsignedNumber?: (ctx: UnsignedNumberContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.unsignedInteger`.
	 * @param ctx the parse tree
	 */
	enterUnsignedInteger?: (ctx: UnsignedIntegerContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.unsignedInteger`.
	 * @param ctx the parse tree
	 */
	exitUnsignedInteger?: (ctx: UnsignedIntegerContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.unsignedReal`.
	 * @param ctx the parse tree
	 */
	enterUnsignedReal?: (ctx: UnsignedRealContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.unsignedReal`.
	 * @param ctx the parse tree
	 */
	exitUnsignedReal?: (ctx: UnsignedRealContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.sign`.
	 * @param ctx the parse tree
	 */
	enterSign?: (ctx: SignContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.sign`.
	 * @param ctx the parse tree
	 */
	exitSign?: (ctx: SignContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.bool`.
	 * @param ctx the parse tree
	 */
	enterBool?: (ctx: BoolContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.bool`.
	 * @param ctx the parse tree
	 */
	exitBool?: (ctx: BoolContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.string`.
	 * @param ctx the parse tree
	 */
	enterString?: (ctx: StringContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.string`.
	 * @param ctx the parse tree
	 */
	exitString?: (ctx: StringContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.typeDefinitionPart`.
	 * @param ctx the parse tree
	 */
	enterTypeDefinitionPart?: (ctx: TypeDefinitionPartContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.typeDefinitionPart`.
	 * @param ctx the parse tree
	 */
	exitTypeDefinitionPart?: (ctx: TypeDefinitionPartContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.typeDefinition`.
	 * @param ctx the parse tree
	 */
	enterTypeDefinition?: (ctx: TypeDefinitionContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.typeDefinition`.
	 * @param ctx the parse tree
	 */
	exitTypeDefinition?: (ctx: TypeDefinitionContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.functionType`.
	 * @param ctx the parse tree
	 */
	enterFunctionType?: (ctx: FunctionTypeContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.functionType`.
	 * @param ctx the parse tree
	 */
	exitFunctionType?: (ctx: FunctionTypeContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.procedureType`.
	 * @param ctx the parse tree
	 */
	enterProcedureType?: (ctx: ProcedureTypeContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.procedureType`.
	 * @param ctx the parse tree
	 */
	exitProcedureType?: (ctx: ProcedureTypeContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.type`.
	 * @param ctx the parse tree
	 */
	enterType?: (ctx: TypeContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.type`.
	 * @param ctx the parse tree
	 */
	exitType?: (ctx: TypeContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.simpleType`.
	 * @param ctx the parse tree
	 */
	enterSimpleType?: (ctx: SimpleTypeContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.simpleType`.
	 * @param ctx the parse tree
	 */
	exitSimpleType?: (ctx: SimpleTypeContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.scalarType`.
	 * @param ctx the parse tree
	 */
	enterScalarType?: (ctx: ScalarTypeContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.scalarType`.
	 * @param ctx the parse tree
	 */
	exitScalarType?: (ctx: ScalarTypeContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.subrangeType`.
	 * @param ctx the parse tree
	 */
	enterSubrangeType?: (ctx: SubrangeTypeContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.subrangeType`.
	 * @param ctx the parse tree
	 */
	exitSubrangeType?: (ctx: SubrangeTypeContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.typeIdentifier`.
	 * @param ctx the parse tree
	 */
	enterTypeIdentifier?: (ctx: TypeIdentifierContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.typeIdentifier`.
	 * @param ctx the parse tree
	 */
	exitTypeIdentifier?: (ctx: TypeIdentifierContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.structuredType`.
	 * @param ctx the parse tree
	 */
	enterStructuredType?: (ctx: StructuredTypeContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.structuredType`.
	 * @param ctx the parse tree
	 */
	exitStructuredType?: (ctx: StructuredTypeContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.unpackedStructuredType`.
	 * @param ctx the parse tree
	 */
	enterUnpackedStructuredType?: (ctx: UnpackedStructuredTypeContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.unpackedStructuredType`.
	 * @param ctx the parse tree
	 */
	exitUnpackedStructuredType?: (ctx: UnpackedStructuredTypeContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.stringtype`.
	 * @param ctx the parse tree
	 */
	enterStringtype?: (ctx: StringtypeContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.stringtype`.
	 * @param ctx the parse tree
	 */
	exitStringtype?: (ctx: StringtypeContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.arrayType`.
	 * @param ctx the parse tree
	 */
	enterArrayType?: (ctx: ArrayTypeContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.arrayType`.
	 * @param ctx the parse tree
	 */
	exitArrayType?: (ctx: ArrayTypeContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.typeList`.
	 * @param ctx the parse tree
	 */
	enterTypeList?: (ctx: TypeListContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.typeList`.
	 * @param ctx the parse tree
	 */
	exitTypeList?: (ctx: TypeListContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.indexType`.
	 * @param ctx the parse tree
	 */
	enterIndexType?: (ctx: IndexTypeContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.indexType`.
	 * @param ctx the parse tree
	 */
	exitIndexType?: (ctx: IndexTypeContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.componentType`.
	 * @param ctx the parse tree
	 */
	enterComponentType?: (ctx: ComponentTypeContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.componentType`.
	 * @param ctx the parse tree
	 */
	exitComponentType?: (ctx: ComponentTypeContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.recordType`.
	 * @param ctx the parse tree
	 */
	enterRecordType?: (ctx: RecordTypeContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.recordType`.
	 * @param ctx the parse tree
	 */
	exitRecordType?: (ctx: RecordTypeContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.fieldList`.
	 * @param ctx the parse tree
	 */
	enterFieldList?: (ctx: FieldListContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.fieldList`.
	 * @param ctx the parse tree
	 */
	exitFieldList?: (ctx: FieldListContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.fixedPart`.
	 * @param ctx the parse tree
	 */
	enterFixedPart?: (ctx: FixedPartContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.fixedPart`.
	 * @param ctx the parse tree
	 */
	exitFixedPart?: (ctx: FixedPartContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.recordSection`.
	 * @param ctx the parse tree
	 */
	enterRecordSection?: (ctx: RecordSectionContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.recordSection`.
	 * @param ctx the parse tree
	 */
	exitRecordSection?: (ctx: RecordSectionContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.variantPart`.
	 * @param ctx the parse tree
	 */
	enterVariantPart?: (ctx: VariantPartContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.variantPart`.
	 * @param ctx the parse tree
	 */
	exitVariantPart?: (ctx: VariantPartContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.tag`.
	 * @param ctx the parse tree
	 */
	enterTag?: (ctx: TagContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.tag`.
	 * @param ctx the parse tree
	 */
	exitTag?: (ctx: TagContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.variant`.
	 * @param ctx the parse tree
	 */
	enterVariant?: (ctx: VariantContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.variant`.
	 * @param ctx the parse tree
	 */
	exitVariant?: (ctx: VariantContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.setType`.
	 * @param ctx the parse tree
	 */
	enterSetType?: (ctx: SetTypeContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.setType`.
	 * @param ctx the parse tree
	 */
	exitSetType?: (ctx: SetTypeContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.baseType`.
	 * @param ctx the parse tree
	 */
	enterBaseType?: (ctx: BaseTypeContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.baseType`.
	 * @param ctx the parse tree
	 */
	exitBaseType?: (ctx: BaseTypeContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.fileType`.
	 * @param ctx the parse tree
	 */
	enterFileType?: (ctx: FileTypeContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.fileType`.
	 * @param ctx the parse tree
	 */
	exitFileType?: (ctx: FileTypeContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.pointerType`.
	 * @param ctx the parse tree
	 */
	enterPointerType?: (ctx: PointerTypeContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.pointerType`.
	 * @param ctx the parse tree
	 */
	exitPointerType?: (ctx: PointerTypeContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.variableDeclarationPart`.
	 * @param ctx the parse tree
	 */
	enterVariableDeclarationPart?: (ctx: VariableDeclarationPartContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.variableDeclarationPart`.
	 * @param ctx the parse tree
	 */
	exitVariableDeclarationPart?: (ctx: VariableDeclarationPartContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.variableDeclaration`.
	 * @param ctx the parse tree
	 */
	enterVariableDeclaration?: (ctx: VariableDeclarationContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.variableDeclaration`.
	 * @param ctx the parse tree
	 */
	exitVariableDeclaration?: (ctx: VariableDeclarationContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.variablePreDeclaration`.
	 * @param ctx the parse tree
	 */
	enterVariablePreDeclaration?: (ctx: VariablePreDeclarationContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.variablePreDeclaration`.
	 * @param ctx the parse tree
	 */
	exitVariablePreDeclaration?: (ctx: VariablePreDeclarationContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.toBeginEndDoDeclarationPart`.
	 * @param ctx the parse tree
	 */
	enterToBeginEndDoDeclarationPart?: (ctx: ToBeginEndDoDeclarationPartContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.toBeginEndDoDeclarationPart`.
	 * @param ctx the parse tree
	 */
	exitToBeginEndDoDeclarationPart?: (ctx: ToBeginEndDoDeclarationPartContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.procedureAndFunctionDeclarationPart`.
	 * @param ctx the parse tree
	 */
	enterProcedureAndFunctionDeclarationPart?: (ctx: ProcedureAndFunctionDeclarationPartContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.procedureAndFunctionDeclarationPart`.
	 * @param ctx the parse tree
	 */
	exitProcedureAndFunctionDeclarationPart?: (ctx: ProcedureAndFunctionDeclarationPartContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.procedureOrFunctionDeclaration`.
	 * @param ctx the parse tree
	 */
	enterProcedureOrFunctionDeclaration?: (ctx: ProcedureOrFunctionDeclarationContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.procedureOrFunctionDeclaration`.
	 * @param ctx the parse tree
	 */
	exitProcedureOrFunctionDeclaration?: (ctx: ProcedureOrFunctionDeclarationContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.procedureDeclaration`.
	 * @param ctx the parse tree
	 */
	enterProcedureDeclaration?: (ctx: ProcedureDeclarationContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.procedureDeclaration`.
	 * @param ctx the parse tree
	 */
	exitProcedureDeclaration?: (ctx: ProcedureDeclarationContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.formalParameterList`.
	 * @param ctx the parse tree
	 */
	enterFormalParameterList?: (ctx: FormalParameterListContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.formalParameterList`.
	 * @param ctx the parse tree
	 */
	exitFormalParameterList?: (ctx: FormalParameterListContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.formalParameterSection`.
	 * @param ctx the parse tree
	 */
	enterFormalParameterSection?: (ctx: FormalParameterSectionContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.formalParameterSection`.
	 * @param ctx the parse tree
	 */
	exitFormalParameterSection?: (ctx: FormalParameterSectionContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.parameterGroup`.
	 * @param ctx the parse tree
	 */
	enterParameterGroup?: (ctx: ParameterGroupContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.parameterGroup`.
	 * @param ctx the parse tree
	 */
	exitParameterGroup?: (ctx: ParameterGroupContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.identifierList`.
	 * @param ctx the parse tree
	 */
	enterIdentifierList?: (ctx: IdentifierListContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.identifierList`.
	 * @param ctx the parse tree
	 */
	exitIdentifierList?: (ctx: IdentifierListContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.initializerList`.
	 * @param ctx the parse tree
	 */
	enterInitializerList?: (ctx: InitializerListContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.initializerList`.
	 * @param ctx the parse tree
	 */
	exitInitializerList?: (ctx: InitializerListContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.constList`.
	 * @param ctx the parse tree
	 */
	enterConstList?: (ctx: ConstListContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.constList`.
	 * @param ctx the parse tree
	 */
	exitConstList?: (ctx: ConstListContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.functionDeclaration`.
	 * @param ctx the parse tree
	 */
	enterFunctionDeclaration?: (ctx: FunctionDeclarationContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.functionDeclaration`.
	 * @param ctx the parse tree
	 */
	exitFunctionDeclaration?: (ctx: FunctionDeclarationContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.resultType`.
	 * @param ctx the parse tree
	 */
	enterResultType?: (ctx: ResultTypeContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.resultType`.
	 * @param ctx the parse tree
	 */
	exitResultType?: (ctx: ResultTypeContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.statement`.
	 * @param ctx the parse tree
	 */
	enterStatement?: (ctx: StatementContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.statement`.
	 * @param ctx the parse tree
	 */
	exitStatement?: (ctx: StatementContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.unlabelledStatement`.
	 * @param ctx the parse tree
	 */
	enterUnlabelledStatement?: (ctx: UnlabelledStatementContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.unlabelledStatement`.
	 * @param ctx the parse tree
	 */
	exitUnlabelledStatement?: (ctx: UnlabelledStatementContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.simpleStatement`.
	 * @param ctx the parse tree
	 */
	enterSimpleStatement?: (ctx: SimpleStatementContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.simpleStatement`.
	 * @param ctx the parse tree
	 */
	exitSimpleStatement?: (ctx: SimpleStatementContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.assignmentStatement`.
	 * @param ctx the parse tree
	 */
	enterAssignmentStatement?: (ctx: AssignmentStatementContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.assignmentStatement`.
	 * @param ctx the parse tree
	 */
	exitAssignmentStatement?: (ctx: AssignmentStatementContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.variable`.
	 * @param ctx the parse tree
	 */
	enterVariable?: (ctx: VariableContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.variable`.
	 * @param ctx the parse tree
	 */
	exitVariable?: (ctx: VariableContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.expression`.
	 * @param ctx the parse tree
	 */
	enterExpression?: (ctx: ExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.expression`.
	 * @param ctx the parse tree
	 */
	exitExpression?: (ctx: ExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.relationaloperator`.
	 * @param ctx the parse tree
	 */
	enterRelationaloperator?: (ctx: RelationaloperatorContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.relationaloperator`.
	 * @param ctx the parse tree
	 */
	exitRelationaloperator?: (ctx: RelationaloperatorContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.simpleExpression`.
	 * @param ctx the parse tree
	 */
	enterSimpleExpression?: (ctx: SimpleExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.simpleExpression`.
	 * @param ctx the parse tree
	 */
	exitSimpleExpression?: (ctx: SimpleExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.additiveoperator`.
	 * @param ctx the parse tree
	 */
	enterAdditiveoperator?: (ctx: AdditiveoperatorContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.additiveoperator`.
	 * @param ctx the parse tree
	 */
	exitAdditiveoperator?: (ctx: AdditiveoperatorContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.term`.
	 * @param ctx the parse tree
	 */
	enterTerm?: (ctx: TermContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.term`.
	 * @param ctx the parse tree
	 */
	exitTerm?: (ctx: TermContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.multiplicativeoperator`.
	 * @param ctx the parse tree
	 */
	enterMultiplicativeoperator?: (ctx: MultiplicativeoperatorContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.multiplicativeoperator`.
	 * @param ctx the parse tree
	 */
	exitMultiplicativeoperator?: (ctx: MultiplicativeoperatorContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.signedFactor`.
	 * @param ctx the parse tree
	 */
	enterSignedFactor?: (ctx: SignedFactorContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.signedFactor`.
	 * @param ctx the parse tree
	 */
	exitSignedFactor?: (ctx: SignedFactorContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.factor`.
	 * @param ctx the parse tree
	 */
	enterFactor?: (ctx: FactorContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.factor`.
	 * @param ctx the parse tree
	 */
	exitFactor?: (ctx: FactorContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.unsignedConstant`.
	 * @param ctx the parse tree
	 */
	enterUnsignedConstant?: (ctx: UnsignedConstantContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.unsignedConstant`.
	 * @param ctx the parse tree
	 */
	exitUnsignedConstant?: (ctx: UnsignedConstantContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.functionDesignator`.
	 * @param ctx the parse tree
	 */
	enterFunctionDesignator?: (ctx: FunctionDesignatorContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.functionDesignator`.
	 * @param ctx the parse tree
	 */
	exitFunctionDesignator?: (ctx: FunctionDesignatorContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.parameterList`.
	 * @param ctx the parse tree
	 */
	enterParameterList?: (ctx: ParameterListContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.parameterList`.
	 * @param ctx the parse tree
	 */
	exitParameterList?: (ctx: ParameterListContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.set`.
	 * @param ctx the parse tree
	 */
	enterSet?: (ctx: SetContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.set`.
	 * @param ctx the parse tree
	 */
	exitSet?: (ctx: SetContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.elementList`.
	 * @param ctx the parse tree
	 */
	enterElementList?: (ctx: ElementListContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.elementList`.
	 * @param ctx the parse tree
	 */
	exitElementList?: (ctx: ElementListContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.element`.
	 * @param ctx the parse tree
	 */
	enterElement?: (ctx: ElementContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.element`.
	 * @param ctx the parse tree
	 */
	exitElement?: (ctx: ElementContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.procedureStatement`.
	 * @param ctx the parse tree
	 */
	enterProcedureStatement?: (ctx: ProcedureStatementContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.procedureStatement`.
	 * @param ctx the parse tree
	 */
	exitProcedureStatement?: (ctx: ProcedureStatementContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.actualParameter`.
	 * @param ctx the parse tree
	 */
	enterActualParameter?: (ctx: ActualParameterContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.actualParameter`.
	 * @param ctx the parse tree
	 */
	exitActualParameter?: (ctx: ActualParameterContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.parameterwidth`.
	 * @param ctx the parse tree
	 */
	enterParameterwidth?: (ctx: ParameterwidthContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.parameterwidth`.
	 * @param ctx the parse tree
	 */
	exitParameterwidth?: (ctx: ParameterwidthContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.gotoStatement`.
	 * @param ctx the parse tree
	 */
	enterGotoStatement?: (ctx: GotoStatementContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.gotoStatement`.
	 * @param ctx the parse tree
	 */
	exitGotoStatement?: (ctx: GotoStatementContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.emptyStatement`.
	 * @param ctx the parse tree
	 */
	enterEmptyStatement?: (ctx: EmptyStatementContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.emptyStatement`.
	 * @param ctx the parse tree
	 */
	exitEmptyStatement?: (ctx: EmptyStatementContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.empty`.
	 * @param ctx the parse tree
	 */
	enterEmpty?: (ctx: EmptyContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.empty`.
	 * @param ctx the parse tree
	 */
	exitEmpty?: (ctx: EmptyContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.structuredStatement`.
	 * @param ctx the parse tree
	 */
	enterStructuredStatement?: (ctx: StructuredStatementContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.structuredStatement`.
	 * @param ctx the parse tree
	 */
	exitStructuredStatement?: (ctx: StructuredStatementContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.compoundStatement`.
	 * @param ctx the parse tree
	 */
	enterCompoundStatement?: (ctx: CompoundStatementContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.compoundStatement`.
	 * @param ctx the parse tree
	 */
	exitCompoundStatement?: (ctx: CompoundStatementContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.openCompoundStatement`.
	 * @param ctx the parse tree
	 */
	enterOpenCompoundStatement?: (ctx: OpenCompoundStatementContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.openCompoundStatement`.
	 * @param ctx the parse tree
	 */
	exitOpenCompoundStatement?: (ctx: OpenCompoundStatementContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.statements`.
	 * @param ctx the parse tree
	 */
	enterStatements?: (ctx: StatementsContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.statements`.
	 * @param ctx the parse tree
	 */
	exitStatements?: (ctx: StatementsContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.conditionalStatement`.
	 * @param ctx the parse tree
	 */
	enterConditionalStatement?: (ctx: ConditionalStatementContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.conditionalStatement`.
	 * @param ctx the parse tree
	 */
	exitConditionalStatement?: (ctx: ConditionalStatementContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.ifStatement`.
	 * @param ctx the parse tree
	 */
	enterIfStatement?: (ctx: IfStatementContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.ifStatement`.
	 * @param ctx the parse tree
	 */
	exitIfStatement?: (ctx: IfStatementContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.caseStatement`.
	 * @param ctx the parse tree
	 */
	enterCaseStatement?: (ctx: CaseStatementContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.caseStatement`.
	 * @param ctx the parse tree
	 */
	exitCaseStatement?: (ctx: CaseStatementContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.caseListElement`.
	 * @param ctx the parse tree
	 */
	enterCaseListElement?: (ctx: CaseListElementContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.caseListElement`.
	 * @param ctx the parse tree
	 */
	exitCaseListElement?: (ctx: CaseListElementContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.repetetiveStatement`.
	 * @param ctx the parse tree
	 */
	enterRepetetiveStatement?: (ctx: RepetetiveStatementContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.repetetiveStatement`.
	 * @param ctx the parse tree
	 */
	exitRepetetiveStatement?: (ctx: RepetetiveStatementContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.whileStatement`.
	 * @param ctx the parse tree
	 */
	enterWhileStatement?: (ctx: WhileStatementContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.whileStatement`.
	 * @param ctx the parse tree
	 */
	exitWhileStatement?: (ctx: WhileStatementContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.repeatStatement`.
	 * @param ctx the parse tree
	 */
	enterRepeatStatement?: (ctx: RepeatStatementContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.repeatStatement`.
	 * @param ctx the parse tree
	 */
	exitRepeatStatement?: (ctx: RepeatStatementContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.forStatement`.
	 * @param ctx the parse tree
	 */
	enterForStatement?: (ctx: ForStatementContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.forStatement`.
	 * @param ctx the parse tree
	 */
	exitForStatement?: (ctx: ForStatementContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.forList`.
	 * @param ctx the parse tree
	 */
	enterForList?: (ctx: ForListContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.forList`.
	 * @param ctx the parse tree
	 */
	exitForList?: (ctx: ForListContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.initialValue`.
	 * @param ctx the parse tree
	 */
	enterInitialValue?: (ctx: InitialValueContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.initialValue`.
	 * @param ctx the parse tree
	 */
	exitInitialValue?: (ctx: InitialValueContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.finalValue`.
	 * @param ctx the parse tree
	 */
	enterFinalValue?: (ctx: FinalValueContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.finalValue`.
	 * @param ctx the parse tree
	 */
	exitFinalValue?: (ctx: FinalValueContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.withStatement`.
	 * @param ctx the parse tree
	 */
	enterWithStatement?: (ctx: WithStatementContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.withStatement`.
	 * @param ctx the parse tree
	 */
	exitWithStatement?: (ctx: WithStatementContext) => void;

	/**
	 * Enter a parse tree produced by `pascalParser.recordVariableList`.
	 * @param ctx the parse tree
	 */
	enterRecordVariableList?: (ctx: RecordVariableListContext) => void;
	/**
	 * Exit a parse tree produced by `pascalParser.recordVariableList`.
	 * @param ctx the parse tree
	 */
	exitRecordVariableList?: (ctx: RecordVariableListContext) => void;
}

