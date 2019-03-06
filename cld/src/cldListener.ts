// Generated from src/cld.g4 by ANTLR 4.7.3-SNAPSHOT


import { ParseTreeListener } from "antlr4ts/tree/ParseTreeListener";

import { DefineSyntaxContext } from "./cldParser";
import { DefineTypeContext } from "./cldParser";
import { DefineVerbContext } from "./cldParser";
import { CldContentContext } from "./cldParser";
import { DefineContext } from "./cldParser";
import { AnyNameContext } from "./cldParser";
import { IdentContext } from "./cldParser";
import { ModuleContext } from "./cldParser";
import { VerbClauseForSyntaxContext } from "./cldParser";
import { DisallowsContext } from "./cldParser";
import { ImageContext } from "./cldParser";
import { ParametersContext } from "./cldParser";
import { ParameterClauseContext } from "./cldParser";
import { ParamValueClauseContext } from "./cldParser";
import { QualifiersContext } from "./cldParser";
import { QualifierClauseContext } from "./cldParser";
import { PlacementClauseContext } from "./cldParser";
import { QualifierValueClauseContext } from "./cldParser";
import { RoutineContext } from "./cldParser";
import { TypeClauseContext } from "./cldParser";
import { KeywordClauseContext } from "./cldParser";
import { KeywordValueClauseContext } from "./cldParser";
import { VerbClauseContext } from "./cldParser";
import { SynonymContext } from "./cldParser";
import { ExpressionContext } from "./cldParser";
import { EntityContext } from "./cldParser";


/**
 * This interface defines a complete listener for a parse tree produced by
 * `cldParser`.
 */
export interface cldListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the `defineSyntax`
	 * labeled alternative in `cldParser.define`.
	 * @param ctx the parse tree
	 */
	enterDefineSyntax?: (ctx: DefineSyntaxContext) => void;
	/**
	 * Exit a parse tree produced by the `defineSyntax`
	 * labeled alternative in `cldParser.define`.
	 * @param ctx the parse tree
	 */
	exitDefineSyntax?: (ctx: DefineSyntaxContext) => void;

	/**
	 * Enter a parse tree produced by the `defineType`
	 * labeled alternative in `cldParser.define`.
	 * @param ctx the parse tree
	 */
	enterDefineType?: (ctx: DefineTypeContext) => void;
	/**
	 * Exit a parse tree produced by the `defineType`
	 * labeled alternative in `cldParser.define`.
	 * @param ctx the parse tree
	 */
	exitDefineType?: (ctx: DefineTypeContext) => void;

	/**
	 * Enter a parse tree produced by the `defineVerb`
	 * labeled alternative in `cldParser.define`.
	 * @param ctx the parse tree
	 */
	enterDefineVerb?: (ctx: DefineVerbContext) => void;
	/**
	 * Exit a parse tree produced by the `defineVerb`
	 * labeled alternative in `cldParser.define`.
	 * @param ctx the parse tree
	 */
	exitDefineVerb?: (ctx: DefineVerbContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.cldContent`.
	 * @param ctx the parse tree
	 */
	enterCldContent?: (ctx: CldContentContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.cldContent`.
	 * @param ctx the parse tree
	 */
	exitCldContent?: (ctx: CldContentContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.define`.
	 * @param ctx the parse tree
	 */
	enterDefine?: (ctx: DefineContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.define`.
	 * @param ctx the parse tree
	 */
	exitDefine?: (ctx: DefineContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.anyName`.
	 * @param ctx the parse tree
	 */
	enterAnyName?: (ctx: AnyNameContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.anyName`.
	 * @param ctx the parse tree
	 */
	exitAnyName?: (ctx: AnyNameContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.ident`.
	 * @param ctx the parse tree
	 */
	enterIdent?: (ctx: IdentContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.ident`.
	 * @param ctx the parse tree
	 */
	exitIdent?: (ctx: IdentContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.module`.
	 * @param ctx the parse tree
	 */
	enterModule?: (ctx: ModuleContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.module`.
	 * @param ctx the parse tree
	 */
	exitModule?: (ctx: ModuleContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.verbClauseForSyntax`.
	 * @param ctx the parse tree
	 */
	enterVerbClauseForSyntax?: (ctx: VerbClauseForSyntaxContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.verbClauseForSyntax`.
	 * @param ctx the parse tree
	 */
	exitVerbClauseForSyntax?: (ctx: VerbClauseForSyntaxContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.disallows`.
	 * @param ctx the parse tree
	 */
	enterDisallows?: (ctx: DisallowsContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.disallows`.
	 * @param ctx the parse tree
	 */
	exitDisallows?: (ctx: DisallowsContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.image`.
	 * @param ctx the parse tree
	 */
	enterImage?: (ctx: ImageContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.image`.
	 * @param ctx the parse tree
	 */
	exitImage?: (ctx: ImageContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.parameters`.
	 * @param ctx the parse tree
	 */
	enterParameters?: (ctx: ParametersContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.parameters`.
	 * @param ctx the parse tree
	 */
	exitParameters?: (ctx: ParametersContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.parameterClause`.
	 * @param ctx the parse tree
	 */
	enterParameterClause?: (ctx: ParameterClauseContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.parameterClause`.
	 * @param ctx the parse tree
	 */
	exitParameterClause?: (ctx: ParameterClauseContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.paramValueClause`.
	 * @param ctx the parse tree
	 */
	enterParamValueClause?: (ctx: ParamValueClauseContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.paramValueClause`.
	 * @param ctx the parse tree
	 */
	exitParamValueClause?: (ctx: ParamValueClauseContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.qualifiers`.
	 * @param ctx the parse tree
	 */
	enterQualifiers?: (ctx: QualifiersContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.qualifiers`.
	 * @param ctx the parse tree
	 */
	exitQualifiers?: (ctx: QualifiersContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.qualifierClause`.
	 * @param ctx the parse tree
	 */
	enterQualifierClause?: (ctx: QualifierClauseContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.qualifierClause`.
	 * @param ctx the parse tree
	 */
	exitQualifierClause?: (ctx: QualifierClauseContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.placementClause`.
	 * @param ctx the parse tree
	 */
	enterPlacementClause?: (ctx: PlacementClauseContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.placementClause`.
	 * @param ctx the parse tree
	 */
	exitPlacementClause?: (ctx: PlacementClauseContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.qualifierValueClause`.
	 * @param ctx the parse tree
	 */
	enterQualifierValueClause?: (ctx: QualifierValueClauseContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.qualifierValueClause`.
	 * @param ctx the parse tree
	 */
	exitQualifierValueClause?: (ctx: QualifierValueClauseContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.routine`.
	 * @param ctx the parse tree
	 */
	enterRoutine?: (ctx: RoutineContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.routine`.
	 * @param ctx the parse tree
	 */
	exitRoutine?: (ctx: RoutineContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.typeClause`.
	 * @param ctx the parse tree
	 */
	enterTypeClause?: (ctx: TypeClauseContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.typeClause`.
	 * @param ctx the parse tree
	 */
	exitTypeClause?: (ctx: TypeClauseContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.keywordClause`.
	 * @param ctx the parse tree
	 */
	enterKeywordClause?: (ctx: KeywordClauseContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.keywordClause`.
	 * @param ctx the parse tree
	 */
	exitKeywordClause?: (ctx: KeywordClauseContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.keywordValueClause`.
	 * @param ctx the parse tree
	 */
	enterKeywordValueClause?: (ctx: KeywordValueClauseContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.keywordValueClause`.
	 * @param ctx the parse tree
	 */
	exitKeywordValueClause?: (ctx: KeywordValueClauseContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.verbClause`.
	 * @param ctx the parse tree
	 */
	enterVerbClause?: (ctx: VerbClauseContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.verbClause`.
	 * @param ctx the parse tree
	 */
	exitVerbClause?: (ctx: VerbClauseContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.synonym`.
	 * @param ctx the parse tree
	 */
	enterSynonym?: (ctx: SynonymContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.synonym`.
	 * @param ctx the parse tree
	 */
	exitSynonym?: (ctx: SynonymContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.expression`.
	 * @param ctx the parse tree
	 */
	enterExpression?: (ctx: ExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.expression`.
	 * @param ctx the parse tree
	 */
	exitExpression?: (ctx: ExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.entity`.
	 * @param ctx the parse tree
	 */
	enterEntity?: (ctx: EntityContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.entity`.
	 * @param ctx the parse tree
	 */
	exitEntity?: (ctx: EntityContext) => void;
}

