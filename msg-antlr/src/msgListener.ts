// Generated from src/msg.g4 by ANTLR 4.6-SNAPSHOT


import { ParseTreeListener } from "antlr4ts/tree/ParseTreeListener";

import { AddsubContext } from "./msgParser";
import { AtomContext } from "./msgParser";
import { MuldivContext } from "./msgParser";
import { BracketsContext } from "./msgParser";
import { MainRuleContext } from "./msgParser";
import { TitleContext } from "./msgParser";
import { TitleDescriptionContext } from "./msgParser";
import { SeparatorWithContinuationContext } from "./msgParser";
import { EndOfLineWithCommentContext } from "./msgParser";
import { IdentContext } from "./msgParser";
import { IdentValueContext } from "./msgParser";
import { SimpleStringContext } from "./msgParser";
import { PageContext } from "./msgParser";
import { FacilityContext } from "./msgParser";
import { FacilityDescriptionContext } from "./msgParser";
import { FacilityQualifierContext } from "./msgParser";
import { PrefixQualifierContext } from "./msgParser";
import { SharedQualifierContext } from "./msgParser";
import { SystemQualifierContext } from "./msgParser";
import { FacilityContentContext } from "./msgParser";
import { LiteralContext } from "./msgParser";
import { LiteralDefinitionContext } from "./msgParser";
import { SeverityContext } from "./msgParser";
import { SeverityValueContext } from "./msgParser";
import { BaseContext } from "./msgParser";
import { EndContext } from "./msgParser";
import { ExpressionContext } from "./msgParser";
import { EmptyContext } from "./msgParser";
import { CommentEOLContext } from "./msgParser";
import { CommentSignContext } from "./msgParser";
import { ContinuationContext } from "./msgParser";
import { ContinuationSignContext } from "./msgParser";
import { MessageContext } from "./msgParser";
import { MessageQualifierContext } from "./msgParser";
import { FaoCountContext } from "./msgParser";
import { IdentificationContext } from "./msgParser";
import { UserValueContext } from "./msgParser";
import { SuccessContext } from "./msgParser";
import { InformationalContext } from "./msgParser";
import { WarningContext } from "./msgParser";
import { ErrorContext } from "./msgParser";
import { SevereContext } from "./msgParser";
import { FatalContext } from "./msgParser";
import { MessageTextContext } from "./msgParser";
import { FaoContext } from "./msgParser";


/**
 * This interface defines a complete listener for a parse tree produced by
 * `msgParser`.
 */
export interface msgListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the `addsub`
	 * labeled alternative in `msgParser.expression`.
	 * @param ctx the parse tree
	 */
	enterAddsub?: (ctx: AddsubContext) => void;
	/**
	 * Exit a parse tree produced by the `addsub`
	 * labeled alternative in `msgParser.expression`.
	 * @param ctx the parse tree
	 */
	exitAddsub?: (ctx: AddsubContext) => void;

	/**
	 * Enter a parse tree produced by the `atom`
	 * labeled alternative in `msgParser.expression`.
	 * @param ctx the parse tree
	 */
	enterAtom?: (ctx: AtomContext) => void;
	/**
	 * Exit a parse tree produced by the `atom`
	 * labeled alternative in `msgParser.expression`.
	 * @param ctx the parse tree
	 */
	exitAtom?: (ctx: AtomContext) => void;

	/**
	 * Enter a parse tree produced by the `muldiv`
	 * labeled alternative in `msgParser.expression`.
	 * @param ctx the parse tree
	 */
	enterMuldiv?: (ctx: MuldivContext) => void;
	/**
	 * Exit a parse tree produced by the `muldiv`
	 * labeled alternative in `msgParser.expression`.
	 * @param ctx the parse tree
	 */
	exitMuldiv?: (ctx: MuldivContext) => void;

	/**
	 * Enter a parse tree produced by the `brackets`
	 * labeled alternative in `msgParser.expression`.
	 * @param ctx the parse tree
	 */
	enterBrackets?: (ctx: BracketsContext) => void;
	/**
	 * Exit a parse tree produced by the `brackets`
	 * labeled alternative in `msgParser.expression`.
	 * @param ctx the parse tree
	 */
	exitBrackets?: (ctx: BracketsContext) => void;

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
	 * Enter a parse tree produced by `msgParser.separatorWithContinuation`.
	 * @param ctx the parse tree
	 */
	enterSeparatorWithContinuation?: (ctx: SeparatorWithContinuationContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.separatorWithContinuation`.
	 * @param ctx the parse tree
	 */
	exitSeparatorWithContinuation?: (ctx: SeparatorWithContinuationContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.endOfLineWithComment`.
	 * @param ctx the parse tree
	 */
	enterEndOfLineWithComment?: (ctx: EndOfLineWithCommentContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.endOfLineWithComment`.
	 * @param ctx the parse tree
	 */
	exitEndOfLineWithComment?: (ctx: EndOfLineWithCommentContext) => void;

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
	 * Enter a parse tree produced by `msgParser.empty`.
	 * @param ctx the parse tree
	 */
	enterEmpty?: (ctx: EmptyContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.empty`.
	 * @param ctx the parse tree
	 */
	exitEmpty?: (ctx: EmptyContext) => void;

	/**
	 * Enter a parse tree produced by `msgParser.commentEOL`.
	 * @param ctx the parse tree
	 */
	enterCommentEOL?: (ctx: CommentEOLContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.commentEOL`.
	 * @param ctx the parse tree
	 */
	exitCommentEOL?: (ctx: CommentEOLContext) => void;

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

	/**
	 * Enter a parse tree produced by `msgParser.fao`.
	 * @param ctx the parse tree
	 */
	enterFao?: (ctx: FaoContext) => void;
	/**
	 * Exit a parse tree produced by `msgParser.fao`.
	 * @param ctx the parse tree
	 */
	exitFao?: (ctx: FaoContext) => void;
}

