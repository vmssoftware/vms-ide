// Generated from src/msg.g4 by ANTLR 4.6-SNAPSHOT


import { ParseTreeVisitor } from "antlr4ts/tree/ParseTreeVisitor";

import { MainRuleContext } from "./msgParser";
import { TitleContext } from "./msgParser";
import { TitleKeywordContext } from "./msgParser";
import { TitleNameContext } from "./msgParser";
import { TitleDescriptionContext } from "./msgParser";
import { IdentContext } from "./msgParser";
import { IdentKeywordContext } from "./msgParser";
import { IdentValueContext } from "./msgParser";
import { SimpleStringContext } from "./msgParser";
import { PageContext } from "./msgParser";
import { PageKeywordContext } from "./msgParser";
import { FacilityContext } from "./msgParser";
import { FacilityKeywordContext } from "./msgParser";
import { FacilityDescriptionContext } from "./msgParser";
import { FacilityNameSeparatorContext } from "./msgParser";
import { FacilityContentContext } from "./msgParser";
import { LiteralContext } from "./msgParser";
import { LiteralKeywordContext } from "./msgParser";
import { LiteralDefinitionContext } from "./msgParser";
import { LiteralNameContext } from "./msgParser";
import { LiteralValueContext } from "./msgParser";
import { SeverityContext } from "./msgParser";
import { SeverityKeywordContext } from "./msgParser";
import { SeverityValueContext } from "./msgParser";
import { BaseContext } from "./msgParser";
import { BaseKeywordContext } from "./msgParser";
import { BaseNumberContext } from "./msgParser";
import { EndContext } from "./msgParser";
import { EndKeywordContext } from "./msgParser";
import { FacilityQualifierContext } from "./msgParser";
import { PrefixQualifierContext } from "./msgParser";
import { PrefixQualifierKeywordContext } from "./msgParser";
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
import { CommentEOLContext } from "./msgParser";
import { CommentSignContext } from "./msgParser";
import { ContinuationContext } from "./msgParser";
import { ContinuationSignContext } from "./msgParser";
import { MessageContext } from "./msgParser";
import { MessageNameContext } from "./msgParser";
import { MessageQualifierContext } from "./msgParser";
import { FaoCountContext } from "./msgParser";
import { FaoCountKeywordContext } from "./msgParser";
import { FaoCountValueContext } from "./msgParser";
import { IdentificationContext } from "./msgParser";
import { IdentificationKeywordContext } from "./msgParser";
import { IdentificationValueContext } from "./msgParser";
import { UserValueContext } from "./msgParser";
import { UserValueKeywordContext } from "./msgParser";
import { UserValueValueContext } from "./msgParser";
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
	 * Visit a parse tree produced by `msgParser.titleKeyword`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTitleKeyword?: (ctx: TitleKeywordContext) => Result;

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
	 * Visit a parse tree produced by `msgParser.identKeyword`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIdentKeyword?: (ctx: IdentKeywordContext) => Result;

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
	 * Visit a parse tree produced by `msgParser.pageKeyword`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPageKeyword?: (ctx: PageKeywordContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.facility`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFacility?: (ctx: FacilityContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.facilityKeyword`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFacilityKeyword?: (ctx: FacilityKeywordContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.facilityDescription`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFacilityDescription?: (ctx: FacilityDescriptionContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.facilityNameSeparator`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFacilityNameSeparator?: (ctx: FacilityNameSeparatorContext) => Result;

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
	 * Visit a parse tree produced by `msgParser.literalKeyword`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLiteralKeyword?: (ctx: LiteralKeywordContext) => Result;

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
	 * Visit a parse tree produced by `msgParser.severity`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSeverity?: (ctx: SeverityContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.severityKeyword`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSeverityKeyword?: (ctx: SeverityKeywordContext) => Result;

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
	 * Visit a parse tree produced by `msgParser.baseKeyword`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitBaseKeyword?: (ctx: BaseKeywordContext) => Result;

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
	 * Visit a parse tree produced by `msgParser.endKeyword`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEndKeyword?: (ctx: EndKeywordContext) => Result;

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
	 * Visit a parse tree produced by `msgParser.prefixQualifierKeyword`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPrefixQualifierKeyword?: (ctx: PrefixQualifierKeywordContext) => Result;

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
	 * Visit a parse tree produced by `msgParser.faoCount`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFaoCount?: (ctx: FaoCountContext) => Result;

	/**
	 * Visit a parse tree produced by `msgParser.faoCountKeyword`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFaoCountKeyword?: (ctx: FaoCountKeywordContext) => Result;

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
	 * Visit a parse tree produced by `msgParser.identificationKeyword`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIdentificationKeyword?: (ctx: IdentificationKeywordContext) => Result;

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
	 * Visit a parse tree produced by `msgParser.userValueKeyword`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUserValueKeyword?: (ctx: UserValueKeywordContext) => Result;

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

	/**
	 * Visit a parse tree produced by `msgParser.fao`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFao?: (ctx: FaoContext) => Result;
}

