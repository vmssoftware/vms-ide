// Generated from src/msg.g4 by ANTLR 4.6-SNAPSHOT


import { ParseTreeListener } from "antlr4ts/tree/ParseTreeListener";

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
	 * Enter a parse tree produced by `msgParser.identValue`.
	 * @param ctx the parse tree
	 */
	enterIdentValue?: (ctx: IdentValueContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.identValue`.
	 * @param ctx the parse tree
	 */
	exitIdentValue?: (ctx: IdentValueContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.simpleString`.
	 * @param ctx the parse tree
	 */
	enterSimpleString?: (ctx: SimpleStringContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.simpleString`.
	 * @param ctx the parse tree
	 */
	exitSimpleString?: (ctx: SimpleStringContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.page`.
	 * @param ctx the parse tree
	 */
	enterPage?: (ctx: PageContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.page`.
	 * @param ctx the parse tree
	 */
	exitPage?: (ctx: PageContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.facility`.
	 * @param ctx the parse tree
	 */
	enterFacility?: (ctx: FacilityContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.facility`.
	 * @param ctx the parse tree
	 */
	exitFacility?: (ctx: FacilityContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.facilityQualifier`.
	 * @param ctx the parse tree
	 */
	enterFacilityQualifier?: (ctx: FacilityQualifierContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.facilityQualifier`.
	 * @param ctx the parse tree
	 */
	exitFacilityQualifier?: (ctx: FacilityQualifierContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.prefixQualifier`.
	 * @param ctx the parse tree
	 */
	enterPrefixQualifier?: (ctx: PrefixQualifierContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.prefixQualifier`.
	 * @param ctx the parse tree
	 */
	exitPrefixQualifier?: (ctx: PrefixQualifierContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.prefixQualifierValue`.
	 * @param ctx the parse tree
	 */
	enterPrefixQualifierValue?: (ctx: PrefixQualifierValueContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.prefixQualifierValue`.
	 * @param ctx the parse tree
	 */
	exitPrefixQualifierValue?: (ctx: PrefixQualifierValueContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.sharedQualifier`.
	 * @param ctx the parse tree
	 */
	enterSharedQualifier?: (ctx: SharedQualifierContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.sharedQualifier`.
	 * @param ctx the parse tree
	 */
	exitSharedQualifier?: (ctx: SharedQualifierContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.systemQualifier`.
	 * @param ctx the parse tree
	 */
	enterSystemQualifier?: (ctx: SystemQualifierContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.systemQualifier`.
	 * @param ctx the parse tree
	 */
	exitSystemQualifier?: (ctx: SystemQualifierContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.facilityName`.
	 * @param ctx the parse tree
	 */
	enterFacilityName?: (ctx: FacilityNameContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.facilityName`.
	 * @param ctx the parse tree
	 */
	exitFacilityName?: (ctx: FacilityNameContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.facilityNum`.
	 * @param ctx the parse tree
	 */
	enterFacilityNum?: (ctx: FacilityNumContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.facilityNum`.
	 * @param ctx the parse tree
	 */
	exitFacilityNum?: (ctx: FacilityNumContext) => void;

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
	 * Enter a parse tree produced by `msgParser.bracketOpen`.
	 * @param ctx the parse tree
	 */
	enterBracketOpen?: (ctx: BracketOpenContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.bracketOpen`.
	 * @param ctx the parse tree
	 */
	exitBracketOpen?: (ctx: BracketOpenContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.bracketClose`.
	 * @param ctx the parse tree
	 */
	enterBracketClose?: (ctx: BracketCloseContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.bracketClose`.
	 * @param ctx the parse tree
	 */
	exitBracketClose?: (ctx: BracketCloseContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.multiply`.
	 * @param ctx the parse tree
	 */
	enterMultiply?: (ctx: MultiplyContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.multiply`.
	 * @param ctx the parse tree
	 */
	exitMultiply?: (ctx: MultiplyContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.divide`.
	 * @param ctx the parse tree
	 */
	enterDivide?: (ctx: DivideContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.divide`.
	 * @param ctx the parse tree
	 */
	exitDivide?: (ctx: DivideContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.add`.
	 * @param ctx the parse tree
	 */
	enterAdd?: (ctx: AddContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.add`.
	 * @param ctx the parse tree
	 */
	exitAdd?: (ctx: AddContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.substract`.
	 * @param ctx the parse tree
	 */
	enterSubstract?: (ctx: SubstractContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.substract`.
	 * @param ctx the parse tree
	 */
	exitSubstract?: (ctx: SubstractContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.expressionAtom`.
	 * @param ctx the parse tree
	 */
	enterExpressionAtom?: (ctx: ExpressionAtomContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.expressionAtom`.
	 * @param ctx the parse tree
	 */
	exitExpressionAtom?: (ctx: ExpressionAtomContext) => void;

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

