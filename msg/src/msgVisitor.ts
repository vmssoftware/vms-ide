// Generated from src/msg.g4 by ANTLR 4.6-SNAPSHOT


import { ParseTreeVisitor } from "antlr4ts/tree/ParseTreeVisitor";

import { MsgContentContext } from "./msgParser";
import { TitleContext } from "./msgParser";
import { TitleNameContext } from "./msgParser";
import { TitleDescriptionContext } from "./msgParser";
import { IdentContext } from "./msgParser";
import { IdentValueContext } from "./msgParser";
import { PageContext } from "./msgParser";
import { LiteralContext } from "./msgParser";
import { LiteralDefinitionContext } from "./msgParser";
import { LiteralNameContext } from "./msgParser";
import { LiteralValueContext } from "./msgParser";
import { FacilityContext } from "./msgParser";
import { FacilityDescriptionContext } from "./msgParser";
import { FacilityNameContext } from "./msgParser";
import { FacilityNumberContext } from "./msgParser";
import { FacilityContentContext } from "./msgParser";
import { FacilityQualifierContext } from "./msgParser";
import { PrefixQualifierContext } from "./msgParser";
import { PrefixQualifierValueContext } from "./msgParser";
import { SharedQualifierContext } from "./msgParser";
import { SystemQualifierContext } from "./msgParser";
import { SeverityContext } from "./msgParser";
import { SeverityValueContext } from "./msgParser";
import { BaseContext } from "./msgParser";
import { BaseNumberContext } from "./msgParser";
import { EndContext } from "./msgParser";
import { ExpressionContext } from "./msgParser";
import { ExpressionVariableContext } from "./msgParser";
import { NumberContext } from "./msgParser";
import { SepContext } from "./msgParser";
import { ContinuationContext } from "./msgParser";
import { EolMayCommentContext } from "./msgParser";
import { MessageContext } from "./msgParser";
import { MessageNameContext } from "./msgParser";
import { MessageQualifierContext } from "./msgParser";
import { SeverityQualifierContext } from "./msgParser";
import { FaoCountContext } from "./msgParser";
import { FaoCountValueContext } from "./msgParser";
import { IdentificationContext } from "./msgParser";
import { IdentificationValueContext } from "./msgParser";
import { UserValueContext } from "./msgParser";
import { UserValueValueContext } from "./msgParser";
import { SuccessContext } from "./msgParser";
import { InformationalContext } from "./msgParser";
import { WarningContext } from "./msgParser";
import { ErrorContext } from "./msgParser";
import { SevereContext } from "./msgParser";
import { FatalContext } from "./msgParser";
import { MessageTextContext } from "./msgParser";


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
	 * Visit a parse tree produced by `msgParser.page`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPage?: (ctx: PageContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.literal`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLiteral?: (ctx: LiteralContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.literalDefinition`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLiteralDefinition?: (ctx: LiteralDefinitionContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.literalName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLiteralName?: (ctx: LiteralNameContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.literalValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLiteralValue?: (ctx: LiteralValueContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.facility`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFacility?: (ctx: FacilityContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.facilityDescription`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFacilityDescription?: (ctx: FacilityDescriptionContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.facilityName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFacilityName?: (ctx: FacilityNameContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.facilityNumber`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFacilityNumber?: (ctx: FacilityNumberContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.facilityContent`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFacilityContent?: (ctx: FacilityContentContext) => Result;

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
	 * Visit a parse tree produced by `msgParser.severity`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSeverity?: (ctx: SeverityContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.severityValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSeverityValue?: (ctx: SeverityValueContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.base`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitBase?: (ctx: BaseContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.baseNumber`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitBaseNumber?: (ctx: BaseNumberContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.end`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEnd?: (ctx: EndContext) => Result;

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
	 * Visit a parse tree produced by `msgParser.eolMayComment`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEolMayComment?: (ctx: EolMayCommentContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.message`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMessage?: (ctx: MessageContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.messageName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMessageName?: (ctx: MessageNameContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.messageQualifier`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMessageQualifier?: (ctx: MessageQualifierContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.severityQualifier`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSeverityQualifier?: (ctx: SeverityQualifierContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.faoCount`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFaoCount?: (ctx: FaoCountContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.faoCountValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFaoCountValue?: (ctx: FaoCountValueContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.identification`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIdentification?: (ctx: IdentificationContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.identificationValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIdentificationValue?: (ctx: IdentificationValueContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.userValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUserValue?: (ctx: UserValueContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.userValueValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUserValueValue?: (ctx: UserValueValueContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.success`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSuccess?: (ctx: SuccessContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.informational`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitInformational?: (ctx: InformationalContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.warning`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitWarning?: (ctx: WarningContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.error`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitError?: (ctx: ErrorContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.severe`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSevere?: (ctx: SevereContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.fatal`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFatal?: (ctx: FatalContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.messageText`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMessageText?: (ctx: MessageTextContext) => Result;
}

