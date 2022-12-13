// Generated from src/vms_cobol/parser/cobolCopy.g4 by ANTLR 4.9.0-SNAPSHOT


import { ParseTreeVisitor } from "antlr4ts/tree/ParseTreeVisitor";

import { CopyStatementContext } from "./cobolCopyParser";
import { LastCopyStatementContext } from "./cobolCopyParser";
import { Text_nameContext } from "./cobolCopyParser";
import { Library_nameContext } from "./cobolCopyParser";
import { Record_nameContext } from "./cobolCopyParser";
import { Repl_fromContext } from "./cobolCopyParser";
import { Repl_toContext } from "./cobolCopyParser";


/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by `cobolCopyParser`.
 *
 * @param <Result> The return type of the visit operation. Use `void` for
 * operations with no return type.
 */
export interface cobolCopyVisitor<Result> extends ParseTreeVisitor<Result> {
	/**
	 * Visit a parse tree produced by `cobolCopyParser.copyStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCopyStatement?: (ctx: CopyStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolCopyParser.lastCopyStatement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLastCopyStatement?: (ctx: LastCopyStatementContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolCopyParser.text_name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitText_name?: (ctx: Text_nameContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolCopyParser.library_name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLibrary_name?: (ctx: Library_nameContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolCopyParser.record_name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRecord_name?: (ctx: Record_nameContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolCopyParser.repl_from`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRepl_from?: (ctx: Repl_fromContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolCopyParser.repl_to`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRepl_to?: (ctx: Repl_toContext) => Result;
}

