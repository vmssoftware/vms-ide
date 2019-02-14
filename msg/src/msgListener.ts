// Generated from src/msg.g4 by ANTLR 4.6-SNAPSHOT


import { ParseTreeListener } from "antlr4ts/tree/ParseTreeListener";

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
 * This interface defines a complete listener for a parse tree produced by
 * `msgParser`.
 */
export interface msgListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by `msgParser.msgContent`.
	 * @param ctx the parse tree
	 */
	enterMsgContent?: (ctx: MsgContentContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.msgContent`.
	 * @param ctx the parse tree
	 */
	exitMsgContent?: (ctx: MsgContentContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.var`.
	 * @param ctx the parse tree
	 */
	enterVar?: (ctx: VarContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.var`.
	 * @param ctx the parse tree
	 */
	exitVar?: (ctx: VarContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.varKeyword`.
	 * @param ctx the parse tree
	 */
	enterVarKeyword?: (ctx: VarKeywordContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.varKeyword`.
	 * @param ctx the parse tree
	 */
	exitVarKeyword?: (ctx: VarKeywordContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.varDefinition`.
	 * @param ctx the parse tree
	 */
	enterVarDefinition?: (ctx: VarDefinitionContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.varDefinition`.
	 * @param ctx the parse tree
	 */
	exitVarDefinition?: (ctx: VarDefinitionContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.varName`.
	 * @param ctx the parse tree
	 */
	enterVarName?: (ctx: VarNameContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.varName`.
	 * @param ctx the parse tree
	 */
	exitVarName?: (ctx: VarNameContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.varValue`.
	 * @param ctx the parse tree
	 */
	enterVarValue?: (ctx: VarValueContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.varValue`.
	 * @param ctx the parse tree
	 */
	exitVarValue?: (ctx: VarValueContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.ident`.
	 * @param ctx the parse tree
	 */
	enterIdent?: (ctx: IdentContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.ident`.
	 * @param ctx the parse tree
	 */
	exitIdent?: (ctx: IdentContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.identKeyword`.
	 * @param ctx the parse tree
	 */
	enterIdentKeyword?: (ctx: IdentKeywordContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.identKeyword`.
	 * @param ctx the parse tree
	 */
	exitIdentKeyword?: (ctx: IdentKeywordContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.identString`.
	 * @param ctx the parse tree
	 */
	enterIdentString?: (ctx: IdentStringContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.identString`.
	 * @param ctx the parse tree
	 */
	exitIdentString?: (ctx: IdentStringContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.expression`.
	 * @param ctx the parse tree
	 */
	enterExpression?: (ctx: ExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.expression`.
	 * @param ctx the parse tree
	 */
	exitExpression?: (ctx: ExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.expressionVariable`.
	 * @param ctx the parse tree
	 */
	enterExpressionVariable?: (ctx: ExpressionVariableContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.expressionVariable`.
	 * @param ctx the parse tree
	 */
	exitExpressionVariable?: (ctx: ExpressionVariableContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.number`.
	 * @param ctx the parse tree
	 */
	enterNumber?: (ctx: NumberContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.number`.
	 * @param ctx the parse tree
	 */
	exitNumber?: (ctx: NumberContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.sep`.
	 * @param ctx the parse tree
	 */
	enterSep?: (ctx: SepContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.sep`.
	 * @param ctx the parse tree
	 */
	exitSep?: (ctx: SepContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.continuation`.
	 * @param ctx the parse tree
	 */
	enterContinuation?: (ctx: ContinuationContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.continuation`.
	 * @param ctx the parse tree
	 */
	exitContinuation?: (ctx: ContinuationContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.continuationSign`.
	 * @param ctx the parse tree
	 */
	enterContinuationSign?: (ctx: ContinuationSignContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.continuationSign`.
	 * @param ctx the parse tree
	 */
	exitContinuationSign?: (ctx: ContinuationSignContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.eolMayComment`.
	 * @param ctx the parse tree
	 */
	enterEolMayComment?: (ctx: EolMayCommentContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.eolMayComment`.
	 * @param ctx the parse tree
	 */
	exitEolMayComment?: (ctx: EolMayCommentContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.commentSign`.
	 * @param ctx the parse tree
	 */
	enterCommentSign?: (ctx: CommentSignContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.commentSign`.
	 * @param ctx the parse tree
	 */
	exitCommentSign?: (ctx: CommentSignContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.emptyLine`.
	 * @param ctx the parse tree
	 */
	enterEmptyLine?: (ctx: EmptyLineContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.emptyLine`.
	 * @param ctx the parse tree
	 */
	exitEmptyLine?: (ctx: EmptyLineContext) => void;
}

