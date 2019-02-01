// Generated from src/msg.g4 by ANTLR 4.6-SNAPSHOT


import { ParseTreeVisitor } from "antlr4ts/tree/ParseTreeVisitor";

import { MainRuleContext } from "./msgParser";
import { TitleContext } from "./msgParser";
import { TitleNameContext } from "./msgParser";
import { TitleDescriptionContext } from "./msgParser";
import { EmptyContext } from "./msgParser";


/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by `msgParser`.
 *
 * @param <Result> The return type of the visit operation. Use `void` for
 * operations with no return type.
 */
export interface msgVisitor<Result> extends ParseTreeVisitor<Result> {
	/**
	 * Visit a parse tree produced by `msgParser.mainRule`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMainRule?: (ctx: MainRuleContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.title`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTitle?: (ctx: TitleContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.titleName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTitleName?: (ctx: TitleNameContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.titleDescription`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTitleDescription?: (ctx: TitleDescriptionContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.empty`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEmpty?: (ctx: EmptyContext) => Result;
}

