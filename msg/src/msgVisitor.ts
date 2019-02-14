// Generated from src/msg.g4 by ANTLR 4.6-SNAPSHOT


import { ParseTreeVisitor } from "antlr4ts/tree/ParseTreeVisitor";

import { MsgContentContext } from "./msgParser";
import { VarContext } from "./msgParser";
import { VarKeywordContext } from "./msgParser";
import { VarDefinitionContext } from "./msgParser";
import { VarNameContext } from "./msgParser";
import { VarValueContext } from "./msgParser";
import { IdentContext } from "./msgParser";
import { IdentKeywordContext } from "./msgParser";
import { IdentStringContext } from "./msgParser";
import { ExpressionContext } from "./msgParser";
import { ExpressionVariableContext } from "./msgParser";
import { NumberContext } from "./msgParser";
import { SepContext } from "./msgParser";
import { ContinuationContext } from "./msgParser";
import { ContinuationSignContext } from "./msgParser";
import { EolMayCommentContext } from "./msgParser";
import { CommentSignContext } from "./msgParser";
import { EmptyLineContext } from "./msgParser";


/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by `msgParser`.
 *
 * @param <Result> The return type of the visit operation. Use `void` for
 * operations with no return type.
 */
export interface msgVisitor<Result> extends ParseTreeVisitor<Result> {
	/**
	 * Visit a parse tree produced by `msgParser.msgContent`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMsgContent?: (ctx: MsgContentContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.var`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitVar?: (ctx: VarContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.varKeyword`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitVarKeyword?: (ctx: VarKeywordContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.varDefinition`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitVarDefinition?: (ctx: VarDefinitionContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.varName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitVarName?: (ctx: VarNameContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.varValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitVarValue?: (ctx: VarValueContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.ident`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIdent?: (ctx: IdentContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.identKeyword`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIdentKeyword?: (ctx: IdentKeywordContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.identString`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIdentString?: (ctx: IdentStringContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.expression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExpression?: (ctx: ExpressionContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.expressionVariable`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExpressionVariable?: (ctx: ExpressionVariableContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.number`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitNumber?: (ctx: NumberContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.sep`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSep?: (ctx: SepContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.continuation`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitContinuation?: (ctx: ContinuationContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.continuationSign`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitContinuationSign?: (ctx: ContinuationSignContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.eolMayComment`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEolMayComment?: (ctx: EolMayCommentContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.commentSign`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCommentSign?: (ctx: CommentSignContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.emptyLine`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEmptyLine?: (ctx: EmptyLineContext) => Result;
}

