// Generated from src/cld.g4 by ANTLR 4.7.3-SNAPSHOT


import { ParseTreeListener } from "antlr4ts/tree/ParseTreeListener";

import { ParameterDefaultContext } from "./cldParser";
import { ParameterLabelContext } from "./cldParser";
import { ParameterPromptContext } from "./cldParser";
import { ParameterValueContext } from "./cldParser";
import { KeywordValueClauseListContext } from "./cldParser";
import { KeywordValueClauseRequiredContext } from "./cldParser";
import { KeywordValueClauseDefaultContext } from "./cldParser";
import { KeywordValueClauseTypeContext } from "./cldParser";
import { QualifierValueClauseListContext } from "./cldParser";
import { QualifierValueClauseRequiredContext } from "./cldParser";
import { QualifierValueClauseDefaultContext } from "./cldParser";
import { QualifierValueClauseTypeContext } from "./cldParser";
import { KeywordDefaultContext } from "./cldParser";
import { KeywordLabelContext } from "./cldParser";
import { KeywordNegContext } from "./cldParser";
import { KeywordNonnegContext } from "./cldParser";
import { KeywordSyntaxContext } from "./cldParser";
import { KeywordValueContext } from "./cldParser";
import { ParameterValueClauseConcatenateContext } from "./cldParser";
import { ParameterValueClauseNonConcatenateContext } from "./cldParser";
import { ParameterValueClauseListContext } from "./cldParser";
import { ParameterValueClauseRequiredContext } from "./cldParser";
import { ParameterValueClauseDefaultContext } from "./cldParser";
import { ParameterValueClauseTypeContext } from "./cldParser";
import { DefineSyntaxContext } from "./cldParser";
import { DefineTypeContext } from "./cldParser";
import { DefineVerbContext } from "./cldParser";
import { QualifierDefaultContext } from "./cldParser";
import { QualifierBatchContext } from "./cldParser";
import { QualifierLabelContext } from "./cldParser";
import { QualifierNegContext } from "./cldParser";
import { QualifierNonnegContext } from "./cldParser";
import { QualifierPlaceContext } from "./cldParser";
import { QualifierSyntaxContext } from "./cldParser";
import { QualifierValueContext } from "./cldParser";
import { CldContentContext } from "./cldParser";
import { DefineContext } from "./cldParser";
import { AnyNameContext } from "./cldParser";
import { IdentContext } from "./cldParser";
import { ModuleContext } from "./cldParser";
import { VerbClauseForSyntaxContext } from "./cldParser";
import { DisallowsContext } from "./cldParser";
import { ImageContext } from "./cldParser";
import { ParameterContext } from "./cldParser";
import { ParameterClauseContext } from "./cldParser";
import { ParameterValueClauseContext } from "./cldParser";
import { QualifierContext } from "./cldParser";
import { QualifierClauseContext } from "./cldParser";
import { PlacementClauseContext } from "./cldParser";
import { QualifierValueClauseContext } from "./cldParser";
import { RoutineContext } from "./cldParser";
import { TypeClauseContext } from "./cldParser";
import { KeywordClauseContext } from "./cldParser";
import { KeywordValueClauseContext } from "./cldParser";
import { VerbClauseContext } from "./cldParser";
import { SynonymContext } from "./cldParser";
import { ExpressionContext } from "./cldParser";
import { EntityContext } from "./cldParser";


/**
 * This interface defines a complete listener for a parse tree produced by
 * `cldParser`.
 */
export interface cldListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the `parameterDefault`
	 * labeled alternative in `cldParser.parameterClause`.
	 * @param ctx the parse tree
	 */
	enterParameterDefault?: (ctx: ParameterDefaultContext) => void;
	/**
	 * Exit a parse tree produced by the `parameterDefault`
	 * labeled alternative in `cldParser.parameterClause`.
	 * @param ctx the parse tree
	 */
	exitParameterDefault?: (ctx: ParameterDefaultContext) => void;

	/**
	 * Enter a parse tree produced by the `parameterLabel`
	 * labeled alternative in `cldParser.parameterClause`.
	 * @param ctx the parse tree
	 */
	enterParameterLabel?: (ctx: ParameterLabelContext) => void;
	/**
	 * Exit a parse tree produced by the `parameterLabel`
	 * labeled alternative in `cldParser.parameterClause`.
	 * @param ctx the parse tree
	 */
	exitParameterLabel?: (ctx: ParameterLabelContext) => void;

	/**
	 * Enter a parse tree produced by the `parameterPrompt`
	 * labeled alternative in `cldParser.parameterClause`.
	 * @param ctx the parse tree
	 */
	enterParameterPrompt?: (ctx: ParameterPromptContext) => void;
	/**
	 * Exit a parse tree produced by the `parameterPrompt`
	 * labeled alternative in `cldParser.parameterClause`.
	 * @param ctx the parse tree
	 */
	exitParameterPrompt?: (ctx: ParameterPromptContext) => void;

	/**
	 * Enter a parse tree produced by the `parameterValue`
	 * labeled alternative in `cldParser.parameterClause`.
	 * @param ctx the parse tree
	 */
	enterParameterValue?: (ctx: ParameterValueContext) => void;
	/**
	 * Exit a parse tree produced by the `parameterValue`
	 * labeled alternative in `cldParser.parameterClause`.
	 * @param ctx the parse tree
	 */
	exitParameterValue?: (ctx: ParameterValueContext) => void;

	/**
	 * Enter a parse tree produced by the `keywordValueClauseList`
	 * labeled alternative in `cldParser.keywordValueClause`.
	 * @param ctx the parse tree
	 */
	enterKeywordValueClauseList?: (ctx: KeywordValueClauseListContext) => void;
	/**
	 * Exit a parse tree produced by the `keywordValueClauseList`
	 * labeled alternative in `cldParser.keywordValueClause`.
	 * @param ctx the parse tree
	 */
	exitKeywordValueClauseList?: (ctx: KeywordValueClauseListContext) => void;

	/**
	 * Enter a parse tree produced by the `keywordValueClauseRequired`
	 * labeled alternative in `cldParser.keywordValueClause`.
	 * @param ctx the parse tree
	 */
	enterKeywordValueClauseRequired?: (ctx: KeywordValueClauseRequiredContext) => void;
	/**
	 * Exit a parse tree produced by the `keywordValueClauseRequired`
	 * labeled alternative in `cldParser.keywordValueClause`.
	 * @param ctx the parse tree
	 */
	exitKeywordValueClauseRequired?: (ctx: KeywordValueClauseRequiredContext) => void;

	/**
	 * Enter a parse tree produced by the `keywordValueClauseDefault`
	 * labeled alternative in `cldParser.keywordValueClause`.
	 * @param ctx the parse tree
	 */
	enterKeywordValueClauseDefault?: (ctx: KeywordValueClauseDefaultContext) => void;
	/**
	 * Exit a parse tree produced by the `keywordValueClauseDefault`
	 * labeled alternative in `cldParser.keywordValueClause`.
	 * @param ctx the parse tree
	 */
	exitKeywordValueClauseDefault?: (ctx: KeywordValueClauseDefaultContext) => void;

	/**
	 * Enter a parse tree produced by the `keywordValueClauseType`
	 * labeled alternative in `cldParser.keywordValueClause`.
	 * @param ctx the parse tree
	 */
	enterKeywordValueClauseType?: (ctx: KeywordValueClauseTypeContext) => void;
	/**
	 * Exit a parse tree produced by the `keywordValueClauseType`
	 * labeled alternative in `cldParser.keywordValueClause`.
	 * @param ctx the parse tree
	 */
	exitKeywordValueClauseType?: (ctx: KeywordValueClauseTypeContext) => void;

	/**
	 * Enter a parse tree produced by the `qualifierValueClauseList`
	 * labeled alternative in `cldParser.qualifierValueClause`.
	 * @param ctx the parse tree
	 */
	enterQualifierValueClauseList?: (ctx: QualifierValueClauseListContext) => void;
	/**
	 * Exit a parse tree produced by the `qualifierValueClauseList`
	 * labeled alternative in `cldParser.qualifierValueClause`.
	 * @param ctx the parse tree
	 */
	exitQualifierValueClauseList?: (ctx: QualifierValueClauseListContext) => void;

	/**
	 * Enter a parse tree produced by the `qualifierValueClauseRequired`
	 * labeled alternative in `cldParser.qualifierValueClause`.
	 * @param ctx the parse tree
	 */
	enterQualifierValueClauseRequired?: (ctx: QualifierValueClauseRequiredContext) => void;
	/**
	 * Exit a parse tree produced by the `qualifierValueClauseRequired`
	 * labeled alternative in `cldParser.qualifierValueClause`.
	 * @param ctx the parse tree
	 */
	exitQualifierValueClauseRequired?: (ctx: QualifierValueClauseRequiredContext) => void;

	/**
	 * Enter a parse tree produced by the `qualifierValueClauseDefault`
	 * labeled alternative in `cldParser.qualifierValueClause`.
	 * @param ctx the parse tree
	 */
	enterQualifierValueClauseDefault?: (ctx: QualifierValueClauseDefaultContext) => void;
	/**
	 * Exit a parse tree produced by the `qualifierValueClauseDefault`
	 * labeled alternative in `cldParser.qualifierValueClause`.
	 * @param ctx the parse tree
	 */
	exitQualifierValueClauseDefault?: (ctx: QualifierValueClauseDefaultContext) => void;

	/**
	 * Enter a parse tree produced by the `qualifierValueClauseType`
	 * labeled alternative in `cldParser.qualifierValueClause`.
	 * @param ctx the parse tree
	 */
	enterQualifierValueClauseType?: (ctx: QualifierValueClauseTypeContext) => void;
	/**
	 * Exit a parse tree produced by the `qualifierValueClauseType`
	 * labeled alternative in `cldParser.qualifierValueClause`.
	 * @param ctx the parse tree
	 */
	exitQualifierValueClauseType?: (ctx: QualifierValueClauseTypeContext) => void;

	/**
	 * Enter a parse tree produced by the `keywordDefault`
	 * labeled alternative in `cldParser.keywordClause`.
	 * @param ctx the parse tree
	 */
	enterKeywordDefault?: (ctx: KeywordDefaultContext) => void;
	/**
	 * Exit a parse tree produced by the `keywordDefault`
	 * labeled alternative in `cldParser.keywordClause`.
	 * @param ctx the parse tree
	 */
	exitKeywordDefault?: (ctx: KeywordDefaultContext) => void;

	/**
	 * Enter a parse tree produced by the `keywordLabel`
	 * labeled alternative in `cldParser.keywordClause`.
	 * @param ctx the parse tree
	 */
	enterKeywordLabel?: (ctx: KeywordLabelContext) => void;
	/**
	 * Exit a parse tree produced by the `keywordLabel`
	 * labeled alternative in `cldParser.keywordClause`.
	 * @param ctx the parse tree
	 */
	exitKeywordLabel?: (ctx: KeywordLabelContext) => void;

	/**
	 * Enter a parse tree produced by the `keywordNeg`
	 * labeled alternative in `cldParser.keywordClause`.
	 * @param ctx the parse tree
	 */
	enterKeywordNeg?: (ctx: KeywordNegContext) => void;
	/**
	 * Exit a parse tree produced by the `keywordNeg`
	 * labeled alternative in `cldParser.keywordClause`.
	 * @param ctx the parse tree
	 */
	exitKeywordNeg?: (ctx: KeywordNegContext) => void;

	/**
	 * Enter a parse tree produced by the `keywordNonneg`
	 * labeled alternative in `cldParser.keywordClause`.
	 * @param ctx the parse tree
	 */
	enterKeywordNonneg?: (ctx: KeywordNonnegContext) => void;
	/**
	 * Exit a parse tree produced by the `keywordNonneg`
	 * labeled alternative in `cldParser.keywordClause`.
	 * @param ctx the parse tree
	 */
	exitKeywordNonneg?: (ctx: KeywordNonnegContext) => void;

	/**
	 * Enter a parse tree produced by the `keywordSyntax`
	 * labeled alternative in `cldParser.keywordClause`.
	 * @param ctx the parse tree
	 */
	enterKeywordSyntax?: (ctx: KeywordSyntaxContext) => void;
	/**
	 * Exit a parse tree produced by the `keywordSyntax`
	 * labeled alternative in `cldParser.keywordClause`.
	 * @param ctx the parse tree
	 */
	exitKeywordSyntax?: (ctx: KeywordSyntaxContext) => void;

	/**
	 * Enter a parse tree produced by the `keywordValue`
	 * labeled alternative in `cldParser.keywordClause`.
	 * @param ctx the parse tree
	 */
	enterKeywordValue?: (ctx: KeywordValueContext) => void;
	/**
	 * Exit a parse tree produced by the `keywordValue`
	 * labeled alternative in `cldParser.keywordClause`.
	 * @param ctx the parse tree
	 */
	exitKeywordValue?: (ctx: KeywordValueContext) => void;

	/**
	 * Enter a parse tree produced by the `parameterValueClauseConcatenate`
	 * labeled alternative in `cldParser.parameterValueClause`.
	 * @param ctx the parse tree
	 */
	enterParameterValueClauseConcatenate?: (ctx: ParameterValueClauseConcatenateContext) => void;
	/**
	 * Exit a parse tree produced by the `parameterValueClauseConcatenate`
	 * labeled alternative in `cldParser.parameterValueClause`.
	 * @param ctx the parse tree
	 */
	exitParameterValueClauseConcatenate?: (ctx: ParameterValueClauseConcatenateContext) => void;

	/**
	 * Enter a parse tree produced by the `parameterValueClauseNonConcatenate`
	 * labeled alternative in `cldParser.parameterValueClause`.
	 * @param ctx the parse tree
	 */
	enterParameterValueClauseNonConcatenate?: (ctx: ParameterValueClauseNonConcatenateContext) => void;
	/**
	 * Exit a parse tree produced by the `parameterValueClauseNonConcatenate`
	 * labeled alternative in `cldParser.parameterValueClause`.
	 * @param ctx the parse tree
	 */
	exitParameterValueClauseNonConcatenate?: (ctx: ParameterValueClauseNonConcatenateContext) => void;

	/**
	 * Enter a parse tree produced by the `parameterValueClauseList`
	 * labeled alternative in `cldParser.parameterValueClause`.
	 * @param ctx the parse tree
	 */
	enterParameterValueClauseList?: (ctx: ParameterValueClauseListContext) => void;
	/**
	 * Exit a parse tree produced by the `parameterValueClauseList`
	 * labeled alternative in `cldParser.parameterValueClause`.
	 * @param ctx the parse tree
	 */
	exitParameterValueClauseList?: (ctx: ParameterValueClauseListContext) => void;

	/**
	 * Enter a parse tree produced by the `parameterValueClauseRequired`
	 * labeled alternative in `cldParser.parameterValueClause`.
	 * @param ctx the parse tree
	 */
	enterParameterValueClauseRequired?: (ctx: ParameterValueClauseRequiredContext) => void;
	/**
	 * Exit a parse tree produced by the `parameterValueClauseRequired`
	 * labeled alternative in `cldParser.parameterValueClause`.
	 * @param ctx the parse tree
	 */
	exitParameterValueClauseRequired?: (ctx: ParameterValueClauseRequiredContext) => void;

	/**
	 * Enter a parse tree produced by the `parameterValueClauseDefault`
	 * labeled alternative in `cldParser.parameterValueClause`.
	 * @param ctx the parse tree
	 */
	enterParameterValueClauseDefault?: (ctx: ParameterValueClauseDefaultContext) => void;
	/**
	 * Exit a parse tree produced by the `parameterValueClauseDefault`
	 * labeled alternative in `cldParser.parameterValueClause`.
	 * @param ctx the parse tree
	 */
	exitParameterValueClauseDefault?: (ctx: ParameterValueClauseDefaultContext) => void;

	/**
	 * Enter a parse tree produced by the `parameterValueClauseType`
	 * labeled alternative in `cldParser.parameterValueClause`.
	 * @param ctx the parse tree
	 */
	enterParameterValueClauseType?: (ctx: ParameterValueClauseTypeContext) => void;
	/**
	 * Exit a parse tree produced by the `parameterValueClauseType`
	 * labeled alternative in `cldParser.parameterValueClause`.
	 * @param ctx the parse tree
	 */
	exitParameterValueClauseType?: (ctx: ParameterValueClauseTypeContext) => void;

	/**
	 * Enter a parse tree produced by the `defineSyntax`
	 * labeled alternative in `cldParser.define`.
	 * @param ctx the parse tree
	 */
	enterDefineSyntax?: (ctx: DefineSyntaxContext) => void;
	/**
	 * Exit a parse tree produced by the `defineSyntax`
	 * labeled alternative in `cldParser.define`.
	 * @param ctx the parse tree
	 */
	exitDefineSyntax?: (ctx: DefineSyntaxContext) => void;

	/**
	 * Enter a parse tree produced by the `defineType`
	 * labeled alternative in `cldParser.define`.
	 * @param ctx the parse tree
	 */
	enterDefineType?: (ctx: DefineTypeContext) => void;
	/**
	 * Exit a parse tree produced by the `defineType`
	 * labeled alternative in `cldParser.define`.
	 * @param ctx the parse tree
	 */
	exitDefineType?: (ctx: DefineTypeContext) => void;

	/**
	 * Enter a parse tree produced by the `defineVerb`
	 * labeled alternative in `cldParser.define`.
	 * @param ctx the parse tree
	 */
	enterDefineVerb?: (ctx: DefineVerbContext) => void;
	/**
	 * Exit a parse tree produced by the `defineVerb`
	 * labeled alternative in `cldParser.define`.
	 * @param ctx the parse tree
	 */
	exitDefineVerb?: (ctx: DefineVerbContext) => void;

	/**
	 * Enter a parse tree produced by the `qualifierDefault`
	 * labeled alternative in `cldParser.qualifierClause`.
	 * @param ctx the parse tree
	 */
	enterQualifierDefault?: (ctx: QualifierDefaultContext) => void;
	/**
	 * Exit a parse tree produced by the `qualifierDefault`
	 * labeled alternative in `cldParser.qualifierClause`.
	 * @param ctx the parse tree
	 */
	exitQualifierDefault?: (ctx: QualifierDefaultContext) => void;

	/**
	 * Enter a parse tree produced by the `qualifierBatch`
	 * labeled alternative in `cldParser.qualifierClause`.
	 * @param ctx the parse tree
	 */
	enterQualifierBatch?: (ctx: QualifierBatchContext) => void;
	/**
	 * Exit a parse tree produced by the `qualifierBatch`
	 * labeled alternative in `cldParser.qualifierClause`.
	 * @param ctx the parse tree
	 */
	exitQualifierBatch?: (ctx: QualifierBatchContext) => void;

	/**
	 * Enter a parse tree produced by the `qualifierLabel`
	 * labeled alternative in `cldParser.qualifierClause`.
	 * @param ctx the parse tree
	 */
	enterQualifierLabel?: (ctx: QualifierLabelContext) => void;
	/**
	 * Exit a parse tree produced by the `qualifierLabel`
	 * labeled alternative in `cldParser.qualifierClause`.
	 * @param ctx the parse tree
	 */
	exitQualifierLabel?: (ctx: QualifierLabelContext) => void;

	/**
	 * Enter a parse tree produced by the `qualifierNeg`
	 * labeled alternative in `cldParser.qualifierClause`.
	 * @param ctx the parse tree
	 */
	enterQualifierNeg?: (ctx: QualifierNegContext) => void;
	/**
	 * Exit a parse tree produced by the `qualifierNeg`
	 * labeled alternative in `cldParser.qualifierClause`.
	 * @param ctx the parse tree
	 */
	exitQualifierNeg?: (ctx: QualifierNegContext) => void;

	/**
	 * Enter a parse tree produced by the `qualifierNonneg`
	 * labeled alternative in `cldParser.qualifierClause`.
	 * @param ctx the parse tree
	 */
	enterQualifierNonneg?: (ctx: QualifierNonnegContext) => void;
	/**
	 * Exit a parse tree produced by the `qualifierNonneg`
	 * labeled alternative in `cldParser.qualifierClause`.
	 * @param ctx the parse tree
	 */
	exitQualifierNonneg?: (ctx: QualifierNonnegContext) => void;

	/**
	 * Enter a parse tree produced by the `qualifierPlace`
	 * labeled alternative in `cldParser.qualifierClause`.
	 * @param ctx the parse tree
	 */
	enterQualifierPlace?: (ctx: QualifierPlaceContext) => void;
	/**
	 * Exit a parse tree produced by the `qualifierPlace`
	 * labeled alternative in `cldParser.qualifierClause`.
	 * @param ctx the parse tree
	 */
	exitQualifierPlace?: (ctx: QualifierPlaceContext) => void;

	/**
	 * Enter a parse tree produced by the `qualifierSyntax`
	 * labeled alternative in `cldParser.qualifierClause`.
	 * @param ctx the parse tree
	 */
	enterQualifierSyntax?: (ctx: QualifierSyntaxContext) => void;
	/**
	 * Exit a parse tree produced by the `qualifierSyntax`
	 * labeled alternative in `cldParser.qualifierClause`.
	 * @param ctx the parse tree
	 */
	exitQualifierSyntax?: (ctx: QualifierSyntaxContext) => void;

	/**
	 * Enter a parse tree produced by the `qualifierValue`
	 * labeled alternative in `cldParser.qualifierClause`.
	 * @param ctx the parse tree
	 */
	enterQualifierValue?: (ctx: QualifierValueContext) => void;
	/**
	 * Exit a parse tree produced by the `qualifierValue`
	 * labeled alternative in `cldParser.qualifierClause`.
	 * @param ctx the parse tree
	 */
	exitQualifierValue?: (ctx: QualifierValueContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.cldContent`.
	 * @param ctx the parse tree
	 */
	enterCldContent?: (ctx: CldContentContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.cldContent`.
	 * @param ctx the parse tree
	 */
	exitCldContent?: (ctx: CldContentContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.define`.
	 * @param ctx the parse tree
	 */
	enterDefine?: (ctx: DefineContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.define`.
	 * @param ctx the parse tree
	 */
	exitDefine?: (ctx: DefineContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.anyName`.
	 * @param ctx the parse tree
	 */
	enterAnyName?: (ctx: AnyNameContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.anyName`.
	 * @param ctx the parse tree
	 */
	exitAnyName?: (ctx: AnyNameContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.ident`.
	 * @param ctx the parse tree
	 */
	enterIdent?: (ctx: IdentContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.ident`.
	 * @param ctx the parse tree
	 */
	exitIdent?: (ctx: IdentContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.module`.
	 * @param ctx the parse tree
	 */
	enterModule?: (ctx: ModuleContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.module`.
	 * @param ctx the parse tree
	 */
	exitModule?: (ctx: ModuleContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.verbClauseForSyntax`.
	 * @param ctx the parse tree
	 */
	enterVerbClauseForSyntax?: (ctx: VerbClauseForSyntaxContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.verbClauseForSyntax`.
	 * @param ctx the parse tree
	 */
	exitVerbClauseForSyntax?: (ctx: VerbClauseForSyntaxContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.disallows`.
	 * @param ctx the parse tree
	 */
	enterDisallows?: (ctx: DisallowsContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.disallows`.
	 * @param ctx the parse tree
	 */
	exitDisallows?: (ctx: DisallowsContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.image`.
	 * @param ctx the parse tree
	 */
	enterImage?: (ctx: ImageContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.image`.
	 * @param ctx the parse tree
	 */
	exitImage?: (ctx: ImageContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.parameter`.
	 * @param ctx the parse tree
	 */
	enterParameter?: (ctx: ParameterContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.parameter`.
	 * @param ctx the parse tree
	 */
	exitParameter?: (ctx: ParameterContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.parameterClause`.
	 * @param ctx the parse tree
	 */
	enterParameterClause?: (ctx: ParameterClauseContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.parameterClause`.
	 * @param ctx the parse tree
	 */
	exitParameterClause?: (ctx: ParameterClauseContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.parameterValueClause`.
	 * @param ctx the parse tree
	 */
	enterParameterValueClause?: (ctx: ParameterValueClauseContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.parameterValueClause`.
	 * @param ctx the parse tree
	 */
	exitParameterValueClause?: (ctx: ParameterValueClauseContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.qualifier`.
	 * @param ctx the parse tree
	 */
	enterQualifier?: (ctx: QualifierContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.qualifier`.
	 * @param ctx the parse tree
	 */
	exitQualifier?: (ctx: QualifierContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.qualifierClause`.
	 * @param ctx the parse tree
	 */
	enterQualifierClause?: (ctx: QualifierClauseContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.qualifierClause`.
	 * @param ctx the parse tree
	 */
	exitQualifierClause?: (ctx: QualifierClauseContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.placementClause`.
	 * @param ctx the parse tree
	 */
	enterPlacementClause?: (ctx: PlacementClauseContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.placementClause`.
	 * @param ctx the parse tree
	 */
	exitPlacementClause?: (ctx: PlacementClauseContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.qualifierValueClause`.
	 * @param ctx the parse tree
	 */
	enterQualifierValueClause?: (ctx: QualifierValueClauseContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.qualifierValueClause`.
	 * @param ctx the parse tree
	 */
	exitQualifierValueClause?: (ctx: QualifierValueClauseContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.routine`.
	 * @param ctx the parse tree
	 */
	enterRoutine?: (ctx: RoutineContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.routine`.
	 * @param ctx the parse tree
	 */
	exitRoutine?: (ctx: RoutineContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.typeClause`.
	 * @param ctx the parse tree
	 */
	enterTypeClause?: (ctx: TypeClauseContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.typeClause`.
	 * @param ctx the parse tree
	 */
	exitTypeClause?: (ctx: TypeClauseContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.keywordClause`.
	 * @param ctx the parse tree
	 */
	enterKeywordClause?: (ctx: KeywordClauseContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.keywordClause`.
	 * @param ctx the parse tree
	 */
	exitKeywordClause?: (ctx: KeywordClauseContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.keywordValueClause`.
	 * @param ctx the parse tree
	 */
	enterKeywordValueClause?: (ctx: KeywordValueClauseContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.keywordValueClause`.
	 * @param ctx the parse tree
	 */
	exitKeywordValueClause?: (ctx: KeywordValueClauseContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.verbClause`.
	 * @param ctx the parse tree
	 */
	enterVerbClause?: (ctx: VerbClauseContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.verbClause`.
	 * @param ctx the parse tree
	 */
	exitVerbClause?: (ctx: VerbClauseContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.synonym`.
	 * @param ctx the parse tree
	 */
	enterSynonym?: (ctx: SynonymContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.synonym`.
	 * @param ctx the parse tree
	 */
	exitSynonym?: (ctx: SynonymContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.expression`.
	 * @param ctx the parse tree
	 */
	enterExpression?: (ctx: ExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.expression`.
	 * @param ctx the parse tree
	 */
	exitExpression?: (ctx: ExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `cldParser.entity`.
	 * @param ctx the parse tree
	 */
	enterEntity?: (ctx: EntityContext) => void;
	/**
	 * Exit a parse tree produced by `cldParser.entity`.
	 * @param ctx the parse tree
	 */
	exitEntity?: (ctx: EntityContext) => void;
}

