// Generated from src/vms_cobol/parser/cobolCopy.g4 by ANTLR 4.7.3-SNAPSHOT


import { ParseTreeListener } from "antlr4ts/tree/ParseTreeListener";

import { CopyStatementContext } from "./cobolCopyParser";
import { LastCopyStatementContext } from "./cobolCopyParser";
import { Text_nameContext } from "./cobolCopyParser";
import { Library_nameContext } from "./cobolCopyParser";
import { Record_nameContext } from "./cobolCopyParser";
import { Repl_fromContext } from "./cobolCopyParser";
import { Repl_toContext } from "./cobolCopyParser";


/**
 * This interface defines a complete listener for a parse tree produced by
 * `cobolCopyParser`.
 */
export interface cobolCopyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by `cobolCopyParser.copyStatement`.
	 * @param ctx the parse tree
	 */
	enterCopyStatement?: (ctx: CopyStatementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolCopyParser.copyStatement`.
	 * @param ctx the parse tree
	 */
	exitCopyStatement?: (ctx: CopyStatementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolCopyParser.lastCopyStatement`.
	 * @param ctx the parse tree
	 */
	enterLastCopyStatement?: (ctx: LastCopyStatementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolCopyParser.lastCopyStatement`.
	 * @param ctx the parse tree
	 */
	exitLastCopyStatement?: (ctx: LastCopyStatementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolCopyParser.text_name`.
	 * @param ctx the parse tree
	 */
	enterText_name?: (ctx: Text_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolCopyParser.text_name`.
	 * @param ctx the parse tree
	 */
	exitText_name?: (ctx: Text_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolCopyParser.library_name`.
	 * @param ctx the parse tree
	 */
	enterLibrary_name?: (ctx: Library_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolCopyParser.library_name`.
	 * @param ctx the parse tree
	 */
	exitLibrary_name?: (ctx: Library_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolCopyParser.record_name`.
	 * @param ctx the parse tree
	 */
	enterRecord_name?: (ctx: Record_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolCopyParser.record_name`.
	 * @param ctx the parse tree
	 */
	exitRecord_name?: (ctx: Record_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolCopyParser.repl_from`.
	 * @param ctx the parse tree
	 */
	enterRepl_from?: (ctx: Repl_fromContext) => void;
	/**
	 * Exit a parse tree produced by `cobolCopyParser.repl_from`.
	 * @param ctx the parse tree
	 */
	exitRepl_from?: (ctx: Repl_fromContext) => void;

	/**
	 * Enter a parse tree produced by `cobolCopyParser.repl_to`.
	 * @param ctx the parse tree
	 */
	enterRepl_to?: (ctx: Repl_toContext) => void;
	/**
	 * Exit a parse tree produced by `cobolCopyParser.repl_to`.
	 * @param ctx the parse tree
	 */
	exitRepl_to?: (ctx: Repl_toContext) => void;
}

