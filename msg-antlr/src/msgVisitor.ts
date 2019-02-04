// Generated from src/msg.g4 by ANTLR 4.6-SNAPSHOT


import { ParseTreeVisitor } from "antlr4ts/tree/ParseTreeVisitor";

import { MainRuleContext } from "./msgParser";
import { TitleContext } from "./msgParser";
import { TitleNameContext } from "./msgParser";
import { TitleDescriptionContext } from "./msgParser";
import { IdentContext } from "./msgParser";
import { IdentValueContext } from "./msgParser";
import { SimpleStringContext } from "./msgParser";
import { PageContext } from "./msgParser";
import { FacilityContext } from "./msgParser";
import { FacilityQualifierContext } from "./msgParser";
import { PrefixQualifierContext } from "./msgParser";
import { PrefixQualifierValueContext } from "./msgParser";
import { SharedQualifierContext } from "./msgParser";
import { SystemQualifierContext } from "./msgParser";
import { FacilityNameContext } from "./msgParser";
import { FacilityNumContext } from "./msgParser";
import { ExpressionContext } from "./msgParser";
import { BracketOpenContext } from "./msgParser";
import { BracketCloseContext } from "./msgParser";
import { MultiplyContext } from "./msgParser";
import { DivideContext } from "./msgParser";
import { AddContext } from "./msgParser";
import { SubstractContext } from "./msgParser";
import { ExpressionAtomContext } from "./msgParser";
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
	 * Visit a parse tree produced by `msgParser.ident`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIdent?: (ctx: IdentContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.identValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIdentValue?: (ctx: IdentValueContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.simpleString`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSimpleString?: (ctx: SimpleStringContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.page`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPage?: (ctx: PageContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.facility`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFacility?: (ctx: FacilityContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.facilityQualifier`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFacilityQualifier?: (ctx: FacilityQualifierContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.prefixQualifier`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPrefixQualifier?: (ctx: PrefixQualifierContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.prefixQualifierValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPrefixQualifierValue?: (ctx: PrefixQualifierValueContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.sharedQualifier`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSharedQualifier?: (ctx: SharedQualifierContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.systemQualifier`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSystemQualifier?: (ctx: SystemQualifierContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.facilityName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFacilityName?: (ctx: FacilityNameContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.facilityNum`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFacilityNum?: (ctx: FacilityNumContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.expression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExpression?: (ctx: ExpressionContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.bracketOpen`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitBracketOpen?: (ctx: BracketOpenContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.bracketClose`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitBracketClose?: (ctx: BracketCloseContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.multiply`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMultiply?: (ctx: MultiplyContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.divide`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDivide?: (ctx: DivideContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.add`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAdd?: (ctx: AddContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.substract`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSubstract?: (ctx: SubstractContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.expressionAtom`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExpressionAtom?: (ctx: ExpressionAtomContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.empty`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEmpty?: (ctx: EmptyContext) => Result;
}

