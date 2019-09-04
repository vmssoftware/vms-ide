// Generated from src/vms_cobol/parser/cobol.g4 by ANTLR 4.7.3-SNAPSHOT


import { ParseTreeVisitor } from "antlr4ts/tree/ParseTreeVisitor";

import { SourceContext } from "./cobolParser";
import { ProgramContext } from "./cobolParser";
import { Identification_divisionContext } from "./cobolParser";
import { Identification_division_paragraphContext } from "./cobolParser";
import { Program_idContext } from "./cobolParser";
import { Program_nameContext } from "./cobolParser";
import { Is_programContext } from "./cobolParser";
import { With_identContext } from "./cobolParser";
import { Ident_stringContext } from "./cobolParser";
import { AuthorContext } from "./cobolParser";


/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by `cobolParser`.
 *
 * @param <Result> The return type of the visit operation. Use `void` for
 * operations with no return type.
 */
export interface cobolVisitor<Result> extends ParseTreeVisitor<Result> {
	/**
	 * Visit a parse tree produced by `cobolParser.source`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSource?: (ctx: SourceContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.program`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProgram?: (ctx: ProgramContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.identification_division`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIdentification_division?: (ctx: Identification_divisionContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.identification_division_paragraph`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIdentification_division_paragraph?: (ctx: Identification_division_paragraphContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.program_id`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProgram_id?: (ctx: Program_idContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.program_name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProgram_name?: (ctx: Program_nameContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.is_program`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIs_program?: (ctx: Is_programContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.with_ident`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitWith_ident?: (ctx: With_identContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.ident_string`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIdent_string?: (ctx: Ident_stringContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.author`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAuthor?: (ctx: AuthorContext) => Result;
}

