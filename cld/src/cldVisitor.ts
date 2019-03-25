// Generated from src/cld.g4 by ANTLR 4.7.3-SNAPSHOT


import { ParseTreeVisitor } from "antlr4ts/tree/ParseTreeVisitor";

import { DefineSyntaxContext } from "./cldParser";
import { DefineTypeContext } from "./cldParser";
import { DefineVerbContext } from "./cldParser";
import { CldContentContext } from "./cldParser";
import { DefineContext } from "./cldParser";
import { AnyNameContext } from "./cldParser";
import { IdentContext } from "./cldParser";
import { ModuleContext } from "./cldParser";
import { VerbClauseForSyntaxContext } from "./cldParser";
import { DisallowContext } from "./cldParser";
import { ImageContext } from "./cldParser";
import { ParameterContext } from "./cldParser";
import { ParameterClauseContext } from "./cldParser";
import { ParameterValueContext } from "./cldParser";
import { ParameterLabelContext } from "./cldParser";
import { ParameterPromptContext } from "./cldParser";
import { ParameterValueClauseContext } from "./cldParser";
import { ParameterValueClauseTypeContext } from "./cldParser";
import { QualifierContext } from "./cldParser";
import { QualifierClauseContext } from "./cldParser";
import { QualifierValueContext } from "./cldParser";
import { QualifierLabelContext } from "./cldParser";
import { QualifierSyntaxContext } from "./cldParser";
import { PlacementClauseContext } from "./cldParser";
import { QualifierValueClauseContext } from "./cldParser";
import { QualifierValueClauseTypeContext } from "./cldParser";
import { RoutineContext } from "./cldParser";
import { TypeClauseContext } from "./cldParser";
import { KeywordClauseContext } from "./cldParser";
import { KeywordValueContext } from "./cldParser";
import { KeywordLabelContext } from "./cldParser";
import { KeywordSyntaxContext } from "./cldParser";
import { KeywordValueClauseContext } from "./cldParser";
import { KeywordValueClauseTypeContext } from "./cldParser";
import { VerbClauseContext } from "./cldParser";
import { SynonymContext } from "./cldParser";
import { ExpressionContext } from "./cldParser";
import { EntityContext } from "./cldParser";


/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by `cldParser`.
 *
 * @param <Result> The return type of the visit operation. Use `void` for
 * operations with no return type.
 */
export interface cldVisitor<Result> extends ParseTreeVisitor<Result> {
	/**
	 * Visit a parse tree produced by the `defineSyntax`
	 * labeled alternative in `cldParser.define`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDefineSyntax?: (ctx: DefineSyntaxContext) => Result;

	/**
	 * Visit a parse tree produced by the `defineType`
	 * labeled alternative in `cldParser.define`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDefineType?: (ctx: DefineTypeContext) => Result;

	/**
	 * Visit a parse tree produced by the `defineVerb`
	 * labeled alternative in `cldParser.define`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDefineVerb?: (ctx: DefineVerbContext) => Result;

	/**
	 * Visit a parse tree produced by `cldParser.cldContent`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCldContent?: (ctx: CldContentContext) => Result;

	/**
	 * Visit a parse tree produced by `cldParser.define`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDefine?: (ctx: DefineContext) => Result;

	/**
	 * Visit a parse tree produced by `cldParser.anyName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAnyName?: (ctx: AnyNameContext) => Result;

	/**
	 * Visit a parse tree produced by `cldParser.ident`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIdent?: (ctx: IdentContext) => Result;

	/**
	 * Visit a parse tree produced by `cldParser.module`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitModule?: (ctx: ModuleContext) => Result;

	/**
	 * Visit a parse tree produced by `cldParser.verbClauseForSyntax`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitVerbClauseForSyntax?: (ctx: VerbClauseForSyntaxContext) => Result;

	/**
	 * Visit a parse tree produced by `cldParser.disallow`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDisallow?: (ctx: DisallowContext) => Result;

	/**
	 * Visit a parse tree produced by `cldParser.image`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitImage?: (ctx: ImageContext) => Result;

	/**
	 * Visit a parse tree produced by `cldParser.parameter`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParameter?: (ctx: ParameterContext) => Result;

	/**
	 * Visit a parse tree produced by `cldParser.parameterClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParameterClause?: (ctx: ParameterClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `cldParser.parameterValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParameterValue?: (ctx: ParameterValueContext) => Result;

	/**
	 * Visit a parse tree produced by `cldParser.parameterLabel`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParameterLabel?: (ctx: ParameterLabelContext) => Result;

	/**
	 * Visit a parse tree produced by `cldParser.parameterPrompt`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParameterPrompt?: (ctx: ParameterPromptContext) => Result;

	/**
	 * Visit a parse tree produced by `cldParser.parameterValueClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParameterValueClause?: (ctx: ParameterValueClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `cldParser.parameterValueClauseType`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParameterValueClauseType?: (ctx: ParameterValueClauseTypeContext) => Result;

	/**
	 * Visit a parse tree produced by `cldParser.qualifier`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitQualifier?: (ctx: QualifierContext) => Result;

	/**
	 * Visit a parse tree produced by `cldParser.qualifierClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitQualifierClause?: (ctx: QualifierClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `cldParser.qualifierValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitQualifierValue?: (ctx: QualifierValueContext) => Result;

	/**
	 * Visit a parse tree produced by `cldParser.qualifierLabel`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitQualifierLabel?: (ctx: QualifierLabelContext) => Result;

	/**
	 * Visit a parse tree produced by `cldParser.qualifierSyntax`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitQualifierSyntax?: (ctx: QualifierSyntaxContext) => Result;

	/**
	 * Visit a parse tree produced by `cldParser.placementClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPlacementClause?: (ctx: PlacementClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `cldParser.qualifierValueClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitQualifierValueClause?: (ctx: QualifierValueClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `cldParser.qualifierValueClauseType`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitQualifierValueClauseType?: (ctx: QualifierValueClauseTypeContext) => Result;

	/**
	 * Visit a parse tree produced by `cldParser.routine`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRoutine?: (ctx: RoutineContext) => Result;

	/**
	 * Visit a parse tree produced by `cldParser.typeClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTypeClause?: (ctx: TypeClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `cldParser.keywordClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitKeywordClause?: (ctx: KeywordClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `cldParser.keywordValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitKeywordValue?: (ctx: KeywordValueContext) => Result;

	/**
	 * Visit a parse tree produced by `cldParser.keywordLabel`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitKeywordLabel?: (ctx: KeywordLabelContext) => Result;

	/**
	 * Visit a parse tree produced by `cldParser.keywordSyntax`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitKeywordSyntax?: (ctx: KeywordSyntaxContext) => Result;

	/**
	 * Visit a parse tree produced by `cldParser.keywordValueClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitKeywordValueClause?: (ctx: KeywordValueClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `cldParser.keywordValueClauseType`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitKeywordValueClauseType?: (ctx: KeywordValueClauseTypeContext) => Result;

	/**
	 * Visit a parse tree produced by `cldParser.verbClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitVerbClause?: (ctx: VerbClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `cldParser.synonym`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSynonym?: (ctx: SynonymContext) => Result;

	/**
	 * Visit a parse tree produced by `cldParser.expression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExpression?: (ctx: ExpressionContext) => Result;

	/**
	 * Visit a parse tree produced by `cldParser.entity`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEntity?: (ctx: EntityContext) => Result;
}

