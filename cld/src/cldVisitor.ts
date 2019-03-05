// Generated from src/cld.g4 by ANTLR 4.7.3-SNAPSHOT


import { ParseTreeVisitor } from "antlr4ts/tree/ParseTreeVisitor";

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


/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by `cldParser`.
 *
 * @param <Result> The return type of the visit operation. Use `void` for
 * operations with no return type.
 */
export interface cldVisitor<Result> extends ParseTreeVisitor<Result> {
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
	 * Visit a parse tree produced by `cldParser.parameters`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParameters?: (ctx: ParametersContext) => Result;

	/**
	 * Visit a parse tree produced by `cldParser.parameterClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParameterClause?: (ctx: ParameterClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `cldParser.paramValueClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParamValueClause?: (ctx: ParamValueClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `cldParser.qualifiers`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitQualifiers?: (ctx: QualifiersContext) => Result;

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
}

