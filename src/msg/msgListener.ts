// Generated from src/msg/msg.g4 by ANTLR 4.9.0-SNAPSHOT


import { ParseTreeListener } from "antlr4ts/tree/ParseTreeListener";

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
	 * Enter a parse tree produced by `msgParser.literal`.
	 * @param ctx the parse tree
	 */
	enterLiteral?: (ctx: LiteralContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.literal`.
	 * @param ctx the parse tree
	 */
	exitLiteral?: (ctx: LiteralContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.literalDefinition`.
	 * @param ctx the parse tree
	 */
	enterLiteralDefinition?: (ctx: LiteralDefinitionContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.literalDefinition`.
	 * @param ctx the parse tree
	 */
	exitLiteralDefinition?: (ctx: LiteralDefinitionContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.literalName`.
	 * @param ctx the parse tree
	 */
	enterLiteralName?: (ctx: LiteralNameContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.literalName`.
	 * @param ctx the parse tree
	 */
	exitLiteralName?: (ctx: LiteralNameContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.literalValue`.
	 * @param ctx the parse tree
	 */
	enterLiteralValue?: (ctx: LiteralValueContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.literalValue`.
	 * @param ctx the parse tree
	 */
	exitLiteralValue?: (ctx: LiteralValueContext) => void;

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
	 * Enter a parse tree produced by `msgParser.facilityDescription`.
	 * @param ctx the parse tree
	 */
	enterFacilityDescription?: (ctx: FacilityDescriptionContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.facilityDescription`.
	 * @param ctx the parse tree
	 */
	exitFacilityDescription?: (ctx: FacilityDescriptionContext) => void;

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
	 * Enter a parse tree produced by `msgParser.facilityNumber`.
	 * @param ctx the parse tree
	 */
	enterFacilityNumber?: (ctx: FacilityNumberContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.facilityNumber`.
	 * @param ctx the parse tree
	 */
	exitFacilityNumber?: (ctx: FacilityNumberContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.facilityContent`.
	 * @param ctx the parse tree
	 */
	enterFacilityContent?: (ctx: FacilityContentContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.facilityContent`.
	 * @param ctx the parse tree
	 */
	exitFacilityContent?: (ctx: FacilityContentContext) => void;

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
	 * Enter a parse tree produced by `msgParser.severity`.
	 * @param ctx the parse tree
	 */
	enterSeverity?: (ctx: SeverityContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.severity`.
	 * @param ctx the parse tree
	 */
	exitSeverity?: (ctx: SeverityContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.severityValue`.
	 * @param ctx the parse tree
	 */
	enterSeverityValue?: (ctx: SeverityValueContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.severityValue`.
	 * @param ctx the parse tree
	 */
	exitSeverityValue?: (ctx: SeverityValueContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.base`.
	 * @param ctx the parse tree
	 */
	enterBase?: (ctx: BaseContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.base`.
	 * @param ctx the parse tree
	 */
	exitBase?: (ctx: BaseContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.baseNumber`.
	 * @param ctx the parse tree
	 */
	enterBaseNumber?: (ctx: BaseNumberContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.baseNumber`.
	 * @param ctx the parse tree
	 */
	exitBaseNumber?: (ctx: BaseNumberContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.end`.
	 * @param ctx the parse tree
	 */
	enterEnd?: (ctx: EndContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.end`.
	 * @param ctx the parse tree
	 */
	exitEnd?: (ctx: EndContext) => void;

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
	 * Enter a parse tree produced by `msgParser.message`.
	 * @param ctx the parse tree
	 */
	enterMessage?: (ctx: MessageContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.message`.
	 * @param ctx the parse tree
	 */
	exitMessage?: (ctx: MessageContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.messageName`.
	 * @param ctx the parse tree
	 */
	enterMessageName?: (ctx: MessageNameContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.messageName`.
	 * @param ctx the parse tree
	 */
	exitMessageName?: (ctx: MessageNameContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.messageQualifier`.
	 * @param ctx the parse tree
	 */
	enterMessageQualifier?: (ctx: MessageQualifierContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.messageQualifier`.
	 * @param ctx the parse tree
	 */
	exitMessageQualifier?: (ctx: MessageQualifierContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.severityQualifier`.
	 * @param ctx the parse tree
	 */
	enterSeverityQualifier?: (ctx: SeverityQualifierContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.severityQualifier`.
	 * @param ctx the parse tree
	 */
	exitSeverityQualifier?: (ctx: SeverityQualifierContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.faoCount`.
	 * @param ctx the parse tree
	 */
	enterFaoCount?: (ctx: FaoCountContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.faoCount`.
	 * @param ctx the parse tree
	 */
	exitFaoCount?: (ctx: FaoCountContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.faoCountValue`.
	 * @param ctx the parse tree
	 */
	enterFaoCountValue?: (ctx: FaoCountValueContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.faoCountValue`.
	 * @param ctx the parse tree
	 */
	exitFaoCountValue?: (ctx: FaoCountValueContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.identification`.
	 * @param ctx the parse tree
	 */
	enterIdentification?: (ctx: IdentificationContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.identification`.
	 * @param ctx the parse tree
	 */
	exitIdentification?: (ctx: IdentificationContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.identificationValue`.
	 * @param ctx the parse tree
	 */
	enterIdentificationValue?: (ctx: IdentificationValueContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.identificationValue`.
	 * @param ctx the parse tree
	 */
	exitIdentificationValue?: (ctx: IdentificationValueContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.userValue`.
	 * @param ctx the parse tree
	 */
	enterUserValue?: (ctx: UserValueContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.userValue`.
	 * @param ctx the parse tree
	 */
	exitUserValue?: (ctx: UserValueContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.userValueValue`.
	 * @param ctx the parse tree
	 */
	enterUserValueValue?: (ctx: UserValueValueContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.userValueValue`.
	 * @param ctx the parse tree
	 */
	exitUserValueValue?: (ctx: UserValueValueContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.success`.
	 * @param ctx the parse tree
	 */
	enterSuccess?: (ctx: SuccessContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.success`.
	 * @param ctx the parse tree
	 */
	exitSuccess?: (ctx: SuccessContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.informational`.
	 * @param ctx the parse tree
	 */
	enterInformational?: (ctx: InformationalContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.informational`.
	 * @param ctx the parse tree
	 */
	exitInformational?: (ctx: InformationalContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.warning`.
	 * @param ctx the parse tree
	 */
	enterWarning?: (ctx: WarningContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.warning`.
	 * @param ctx the parse tree
	 */
	exitWarning?: (ctx: WarningContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.error`.
	 * @param ctx the parse tree
	 */
	enterError?: (ctx: ErrorContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.error`.
	 * @param ctx the parse tree
	 */
	exitError?: (ctx: ErrorContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.severe`.
	 * @param ctx the parse tree
	 */
	enterSevere?: (ctx: SevereContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.severe`.
	 * @param ctx the parse tree
	 */
	exitSevere?: (ctx: SevereContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.fatal`.
	 * @param ctx the parse tree
	 */
	enterFatal?: (ctx: FatalContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.fatal`.
	 * @param ctx the parse tree
	 */
	exitFatal?: (ctx: FatalContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.messageText`.
	 * @param ctx the parse tree
	 */
	enterMessageText?: (ctx: MessageTextContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.messageText`.
	 * @param ctx the parse tree
	 */
	exitMessageText?: (ctx: MessageTextContext) => void;
}

