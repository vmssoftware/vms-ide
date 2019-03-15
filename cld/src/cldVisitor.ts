// Generated from src/cld.g4 by ANTLR 4.7.3-SNAPSHOT


import { ParseTreeVisitor } from "antlr4ts/tree/ParseTreeVisitor";

import { ParameterDefaultContext } from "./cldParser";
import { ParameterLabelContext } from "./cldParser";
import { ParameterPromptContext } from "./cldParser";
import { ParameterValueContext } from "./cldParser";
import { KeywordValueClauseListContext } from "./cldParser";
import { KeywordValueClauseRequiredContext } from "./cldParser";
import { KeywordValueClauseDefaultContext } from "./cldParser";
import { KeywordValueClauseTypeContext } from "./cldParser";
import { QualifierValueClauseListContext } from "./cldParser";
import { QualifierValueClauseRequiredContext } from "./cldParser";
import { QualifierValueClauseDefaultContext } from "./cldParser";
import { QualifierValueClauseTypeContext } from "./cldParser";
import { KeywordDefaultContext } from "./cldParser";
import { KeywordLabelContext } from "./cldParser";
import { KeywordNegContext } from "./cldParser";
import { KeywordNonnegContext } from "./cldParser";
import { KeywordSyntaxContext } from "./cldParser";
import { KeywordValueContext } from "./cldParser";
import { ParameterValueClauseConcatenateContext } from "./cldParser";
import { ParameterValueClauseNonConcatenateContext } from "./cldParser";
import { ParameterValueClauseListContext } from "./cldParser";
import { ParameterValueClauseRequiredContext } from "./cldParser";
import { ParameterValueClauseDefaultContext } from "./cldParser";
import { ParameterValueClauseTypeContext } from "./cldParser";
import { DefineSyntaxContext } from "./cldParser";
import { DefineTypeContext } from "./cldParser";
import { DefineVerbContext } from "./cldParser";
import { QualifierDefaultContext } from "./cldParser";
import { QualifierBatchContext } from "./cldParser";
import { QualifierLabelContext } from "./cldParser";
import { QualifierNegContext } from "./cldParser";
import { QualifierNonnegContext } from "./cldParser";
import { QualifierPlaceContext } from "./cldParser";
import { QualifierSyntaxContext } from "./cldParser";
import { QualifierValueContext } from "./cldParser";
import { CldContentContext } from "./cldParser";
import { DefineContext } from "./cldParser";
import { AnyNameContext } from "./cldParser";
import { IdentContext } from "./cldParser";
import { ModuleContext } from "./cldParser";
import { VerbClauseForSyntaxContext } from "./cldParser";
import { DisallowsContext } from "./cldParser";
import { ImageContext } from "./cldParser";
import { ParameterContext } from "./cldParser";
import { ParameterClauseContext } from "./cldParser";
import { ParameterValueClauseContext } from "./cldParser";
import { QualifierContext } from "./cldParser";
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
 * This interface defines a complete generic visitor for a parse tree produced
 * by `cldParser`.
 *
 * @param <Result> The return type of the visit operation. Use `void` for
 * operations with no return type.
 */
export interface cldVisitor<Result> extends ParseTreeVisitor<Result> {
	/**
	 * Visit a parse tree produced by the `parameterDefault`
	 * labeled alternative in `cldParser.parameterClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParameterDefault?: (ctx: ParameterDefaultContext) => Result;

	/**
	 * Visit a parse tree produced by the `parameterLabel`
	 * labeled alternative in `cldParser.parameterClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParameterLabel?: (ctx: ParameterLabelContext) => Result;

	/**
	 * Visit a parse tree produced by the `parameterPrompt`
	 * labeled alternative in `cldParser.parameterClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParameterPrompt?: (ctx: ParameterPromptContext) => Result;

	/**
	 * Visit a parse tree produced by the `parameterValue`
	 * labeled alternative in `cldParser.parameterClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParameterValue?: (ctx: ParameterValueContext) => Result;

	/**
	 * Visit a parse tree produced by the `keywordValueClauseList`
	 * labeled alternative in `cldParser.keywordValueClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitKeywordValueClauseList?: (ctx: KeywordValueClauseListContext) => Result;

	/**
	 * Visit a parse tree produced by the `keywordValueClauseRequired`
	 * labeled alternative in `cldParser.keywordValueClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitKeywordValueClauseRequired?: (ctx: KeywordValueClauseRequiredContext) => Result;

	/**
	 * Visit a parse tree produced by the `keywordValueClauseDefault`
	 * labeled alternative in `cldParser.keywordValueClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitKeywordValueClauseDefault?: (ctx: KeywordValueClauseDefaultContext) => Result;

	/**
	 * Visit a parse tree produced by the `keywordValueClauseType`
	 * labeled alternative in `cldParser.keywordValueClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitKeywordValueClauseType?: (ctx: KeywordValueClauseTypeContext) => Result;

	/**
	 * Visit a parse tree produced by the `qualifierValueClauseList`
	 * labeled alternative in `cldParser.qualifierValueClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitQualifierValueClauseList?: (ctx: QualifierValueClauseListContext) => Result;

	/**
	 * Visit a parse tree produced by the `qualifierValueClauseRequired`
	 * labeled alternative in `cldParser.qualifierValueClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitQualifierValueClauseRequired?: (ctx: QualifierValueClauseRequiredContext) => Result;

	/**
	 * Visit a parse tree produced by the `qualifierValueClauseDefault`
	 * labeled alternative in `cldParser.qualifierValueClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitQualifierValueClauseDefault?: (ctx: QualifierValueClauseDefaultContext) => Result;

	/**
	 * Visit a parse tree produced by the `qualifierValueClauseType`
	 * labeled alternative in `cldParser.qualifierValueClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitQualifierValueClauseType?: (ctx: QualifierValueClauseTypeContext) => Result;

	/**
	 * Visit a parse tree produced by the `keywordDefault`
	 * labeled alternative in `cldParser.keywordClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitKeywordDefault?: (ctx: KeywordDefaultContext) => Result;

	/**
	 * Visit a parse tree produced by the `keywordLabel`
	 * labeled alternative in `cldParser.keywordClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitKeywordLabel?: (ctx: KeywordLabelContext) => Result;

	/**
	 * Visit a parse tree produced by the `keywordNeg`
	 * labeled alternative in `cldParser.keywordClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitKeywordNeg?: (ctx: KeywordNegContext) => Result;

	/**
	 * Visit a parse tree produced by the `keywordNonneg`
	 * labeled alternative in `cldParser.keywordClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitKeywordNonneg?: (ctx: KeywordNonnegContext) => Result;

	/**
	 * Visit a parse tree produced by the `keywordSyntax`
	 * labeled alternative in `cldParser.keywordClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitKeywordSyntax?: (ctx: KeywordSyntaxContext) => Result;

	/**
	 * Visit a parse tree produced by the `keywordValue`
	 * labeled alternative in `cldParser.keywordClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitKeywordValue?: (ctx: KeywordValueContext) => Result;

	/**
	 * Visit a parse tree produced by the `parameterValueClauseConcatenate`
	 * labeled alternative in `cldParser.parameterValueClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParameterValueClauseConcatenate?: (ctx: ParameterValueClauseConcatenateContext) => Result;

	/**
	 * Visit a parse tree produced by the `parameterValueClauseNonConcatenate`
	 * labeled alternative in `cldParser.parameterValueClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParameterValueClauseNonConcatenate?: (ctx: ParameterValueClauseNonConcatenateContext) => Result;

	/**
	 * Visit a parse tree produced by the `parameterValueClauseList`
	 * labeled alternative in `cldParser.parameterValueClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParameterValueClauseList?: (ctx: ParameterValueClauseListContext) => Result;

	/**
	 * Visit a parse tree produced by the `parameterValueClauseRequired`
	 * labeled alternative in `cldParser.parameterValueClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParameterValueClauseRequired?: (ctx: ParameterValueClauseRequiredContext) => Result;

	/**
	 * Visit a parse tree produced by the `parameterValueClauseDefault`
	 * labeled alternative in `cldParser.parameterValueClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParameterValueClauseDefault?: (ctx: ParameterValueClauseDefaultContext) => Result;

	/**
	 * Visit a parse tree produced by the `parameterValueClauseType`
	 * labeled alternative in `cldParser.parameterValueClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParameterValueClauseType?: (ctx: ParameterValueClauseTypeContext) => Result;

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
	 * Visit a parse tree produced by the `qualifierDefault`
	 * labeled alternative in `cldParser.qualifierClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitQualifierDefault?: (ctx: QualifierDefaultContext) => Result;

	/**
	 * Visit a parse tree produced by the `qualifierBatch`
	 * labeled alternative in `cldParser.qualifierClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitQualifierBatch?: (ctx: QualifierBatchContext) => Result;

	/**
	 * Visit a parse tree produced by the `qualifierLabel`
	 * labeled alternative in `cldParser.qualifierClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitQualifierLabel?: (ctx: QualifierLabelContext) => Result;

	/**
	 * Visit a parse tree produced by the `qualifierNeg`
	 * labeled alternative in `cldParser.qualifierClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitQualifierNeg?: (ctx: QualifierNegContext) => Result;

	/**
	 * Visit a parse tree produced by the `qualifierNonneg`
	 * labeled alternative in `cldParser.qualifierClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitQualifierNonneg?: (ctx: QualifierNonnegContext) => Result;

	/**
	 * Visit a parse tree produced by the `qualifierPlace`
	 * labeled alternative in `cldParser.qualifierClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitQualifierPlace?: (ctx: QualifierPlaceContext) => Result;

	/**
	 * Visit a parse tree produced by the `qualifierSyntax`
	 * labeled alternative in `cldParser.qualifierClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitQualifierSyntax?: (ctx: QualifierSyntaxContext) => Result;

	/**
	 * Visit a parse tree produced by the `qualifierValue`
	 * labeled alternative in `cldParser.qualifierClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitQualifierValue?: (ctx: QualifierValueContext) => Result;

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
	 * Visit a parse tree produced by `cldParser.disallows`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDisallows?: (ctx: DisallowsContext) => Result;

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
	 * Visit a parse tree produced by `cldParser.parameterValueClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParameterValueClause?: (ctx: ParameterValueClauseContext) => Result;

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
	 * Visit a parse tree produced by `cldParser.keywordValueClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitKeywordValueClause?: (ctx: KeywordValueClauseContext) => Result;

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

