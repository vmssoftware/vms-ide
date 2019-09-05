// Generated from src/vms_cobol/parser/cobol.g4 by ANTLR 4.7.3-SNAPSHOT


import { ParseTreeListener } from "antlr4ts/tree/ParseTreeListener";

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
 * This interface defines a complete listener for a parse tree produced by
 * `cobolParser`.
 */
export interface cobolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by `cobolParser.source`.
	 * @param ctx the parse tree
	 */
	enterSource?: (ctx: SourceContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.source`.
	 * @param ctx the parse tree
	 */
	exitSource?: (ctx: SourceContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.program`.
	 * @param ctx the parse tree
	 */
	enterProgram?: (ctx: ProgramContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.program`.
	 * @param ctx the parse tree
	 */
	exitProgram?: (ctx: ProgramContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.identification_division`.
	 * @param ctx the parse tree
	 */
	enterIdentification_division?: (ctx: Identification_divisionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.identification_division`.
	 * @param ctx the parse tree
	 */
	exitIdentification_division?: (ctx: Identification_divisionContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.identification_division_paragraph`.
	 * @param ctx the parse tree
	 */
	enterIdentification_division_paragraph?: (ctx: Identification_division_paragraphContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.identification_division_paragraph`.
	 * @param ctx the parse tree
	 */
	exitIdentification_division_paragraph?: (ctx: Identification_division_paragraphContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.program_id`.
	 * @param ctx the parse tree
	 */
	enterProgram_id?: (ctx: Program_idContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.program_id`.
	 * @param ctx the parse tree
	 */
	exitProgram_id?: (ctx: Program_idContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.program_name`.
	 * @param ctx the parse tree
	 */
	enterProgram_name?: (ctx: Program_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.program_name`.
	 * @param ctx the parse tree
	 */
	exitProgram_name?: (ctx: Program_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.is_program`.
	 * @param ctx the parse tree
	 */
	enterIs_program?: (ctx: Is_programContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.is_program`.
	 * @param ctx the parse tree
	 */
	exitIs_program?: (ctx: Is_programContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.with_ident`.
	 * @param ctx the parse tree
	 */
	enterWith_ident?: (ctx: With_identContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.with_ident`.
	 * @param ctx the parse tree
	 */
	exitWith_ident?: (ctx: With_identContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.ident_string`.
	 * @param ctx the parse tree
	 */
	enterIdent_string?: (ctx: Ident_stringContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.ident_string`.
	 * @param ctx the parse tree
	 */
	exitIdent_string?: (ctx: Ident_stringContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.author`.
	 * @param ctx the parse tree
	 */
	enterAuthor?: (ctx: AuthorContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.author`.
	 * @param ctx the parse tree
	 */
	exitAuthor?: (ctx: AuthorContext) => void;
}

