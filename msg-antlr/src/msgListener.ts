// Generated from src/msg.g4 by ANTLR 4.6-SNAPSHOT


import { ParseTreeListener } from "antlr4ts/tree/ParseTreeListener";

import { MainRuleContext } from "./msgParser";
import { TitleContext } from "./msgParser";
import { TitleNameContext } from "./msgParser";
import { TitleDescriptionContext } from "./msgParser";
import { EmptyContext } from "./msgParser";


/**
 * This interface defines a complete listener for a parse tree produced by
 * `msgParser`.
 */
export interface msgListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by `msgParser.mainRule`.
	 * @param ctx the parse tree
	 */
	enterMainRule?: (ctx: MainRuleContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.mainRule`.
	 * @param ctx the parse tree
	 */
	exitMainRule?: (ctx: MainRuleContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.title`.
	 * @param ctx the parse tree
	 */
	enterTitle?: (ctx: TitleContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.title`.
	 * @param ctx the parse tree
	 */
	exitTitle?: (ctx: TitleContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.titleName`.
	 * @param ctx the parse tree
	 */
	enterTitleName?: (ctx: TitleNameContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.titleName`.
	 * @param ctx the parse tree
	 */
	exitTitleName?: (ctx: TitleNameContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.titleDescription`.
	 * @param ctx the parse tree
	 */
	enterTitleDescription?: (ctx: TitleDescriptionContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.titleDescription`.
	 * @param ctx the parse tree
	 */
	exitTitleDescription?: (ctx: TitleDescriptionContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.empty`.
	 * @param ctx the parse tree
	 */
	enterEmpty?: (ctx: EmptyContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.empty`.
	 * @param ctx the parse tree
	 */
	exitEmpty?: (ctx: EmptyContext) => void;
}

