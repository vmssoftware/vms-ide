// Generated from src/msg.g4 by ANTLR 4.6-SNAPSHOT


import { ParseTreeVisitor } from "antlr4ts/tree/ParseTreeVisitor";

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
import { SeverityQualifierContext } from "./msgParser";
import { FaoCountContext } from "./msgParser";
import { FaoCountValueContext } from "./msgParser";
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
 * This interface defines a complete generic visitor for a parse tree produced
 * by `msgParser`.
 *
 * @param <Result> The return type of the visit operation. Use `void` for
 * operations with no return type.
 */
export interface msgVisitor<Result> extends ParseTreeVisitor<Result> {
	/**
	 * Visit a parse tree produced by the `addsub`
	 * labeled alternative in `msgParser.expression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAddsub?: (ctx: AddsubContext) => Result;

	/**
	 * Visit a parse tree produced by the `atom`
	 * labeled alternative in `msgParser.expression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAtom?: (ctx: AtomContext) => Result;

	/**
	 * Visit a parse tree produced by the `muldiv`
	 * labeled alternative in `msgParser.expression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMuldiv?: (ctx: MuldivContext) => Result;

	/**
	 * Visit a parse tree produced by the `brackets`
	 * labeled alternative in `msgParser.expression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitBrackets?: (ctx: BracketsContext) => Result;

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
	 * Visit a parse tree produced by `msgParser.titleDescription`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTitleDescription?: (ctx: TitleDescriptionContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.separatorWithContinuation`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSeparatorWithContinuation?: (ctx: SeparatorWithContinuationContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.endOfLineWithComment`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEndOfLineWithComment?: (ctx: EndOfLineWithCommentContext) => Result;

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
	 * Visit a parse tree produced by `msgParser.facilityDescription`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFacilityDescription?: (ctx: FacilityDescriptionContext) => Result;

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
	 * Visit a parse tree produced by `msgParser.facilityContent`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFacilityContent?: (ctx: FacilityContentContext) => Result;

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
	 * Visit a parse tree produced by `msgParser.empty`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEmpty?: (ctx: EmptyContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.commentEOL`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCommentEOL?: (ctx: CommentEOLContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.commentSign`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCommentSign?: (ctx: CommentSignContext) => Result;

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
	 * Visit a parse tree produced by `msgParser.message`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMessage?: (ctx: MessageContext) => Result;

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
	 * Visit a parse tree produced by `msgParser.userValue`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUserValue?: (ctx: UserValueContext) => Result;

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

	/**
	 * Visit a parse tree produced by `msgParser.fao`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFao?: (ctx: FaoContext) => Result;
}

