import * as path from 'path';
import * as nls from "vscode-nls";

import { Symbol, CodeCompletionCore } from "antlr4-c3";
import { ParseCancellationException, IntervalSet, Interval } from 'antlr4ts/misc';
import { ParseTreeWalker, TerminalNode, ParseTree, ParseTreeListener } from 'antlr4ts/tree';
import { msgParser, MsgContentContext } from "./msgParser";
import { ANTLRInputStream, CommonTokenStream, BailErrorStrategy, DefaultErrorStrategy, ParserRuleContext, Token } from 'antlr4ts';
import { msgLexer } from './msgLexer';
import { DiagnosticEntry, SymbolKind, Definition, SymbolInfo } from './MsgFacade';
import { ContextErrorListener, ContextLexerErrorListener } from './ContextErrorListener';
import { PredictionMode } from 'antlr4ts/atn/PredictionMode';
import { ContextSymbolTable, OtherSymbol } from './ContextSymbolTable';
import { AnalysisListener } from './AnalysisListener';
import { LogFunction, LogType } from '@vorfol/common';

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export class SourceContext {

    public sourceId: string;
    public diagnostics: DiagnosticEntry[] = [];
    public symbolTable: ContextSymbolTable;

    // Grammar parsing infrastructure.
    private tokenStream?: CommonTokenStream;
    private parser?: msgParser;
    private errorListener: ContextErrorListener = new ContextErrorListener(this.diagnostics);
    private lexerErrorListener: ContextLexerErrorListener = new ContextLexerErrorListener(this.diagnostics);
    private analysisDone: boolean = false; // Includes determining reference counts.

    private tree?: MsgContentContext; // The root context from the last parse run.
    public logFn: LogFunction;

    constructor(public fileName: string, logFn?: LogFunction) {
        // tslint:disable-next-line:no-empty
        this.logFn = logFn || (() => {});
        this.sourceId = path.basename(fileName, path.extname(fileName));
        this.symbolTable =  new ContextSymbolTable(this.sourceId, { allowDuplicateSymbols: true }, this);
    }

    /**
     * Should be called on every change to keep the input stream up to date particularly for code completion.
     * This call doesn't do any expensive processing (parse() does).
     */
    public setText(source: string) {
        let input = new ANTLRInputStream(source.toUpperCase()+"\n");  // convert to upper case and add NEWLINE to force end of last line
        let lexer = new msgLexer(input);

        // There won't be lexer errors actually. They are silently bubbled up and will cause parser errors.
        lexer.removeErrorListeners();
        lexer.addErrorListener(this.lexerErrorListener);
        this.tokenStream = new CommonTokenStream(lexer);
    }

    public parse() {
        if (!this.tokenStream) {
            return;
        }
        // Rewind the input stream for a new parse run.
        // Might be unnecessary when we just created that via setText.
        this.tokenStream.seek(0);
        this.parser = new msgParser(this.tokenStream);
        this.parser.removeErrorListeners();
        this.parser.addErrorListener(this.errorListener);

        this.parser.errorHandler = new BailErrorStrategy();
        this.parser.interpreter.setPredictionMode(PredictionMode.SLL);

        this.tree = undefined;

        this.diagnostics.length = 0;
        this.analysisDone = false;

        try {
            this.tree = this.parser.msgContent();
        } catch (e) {
            if (e instanceof ParseCancellationException) {
                this.tokenStream.seek(0);
                this.parser.reset();
                this.parser.errorHandler = new DefaultErrorStrategy();
                this.parser.interpreter.setPredictionMode(PredictionMode.LL);
                this.tree = this.parser.msgContent();
            } else {
                throw e;
            }
        }

        this.runAnalysis();
    }

    public getDiagnostics(): DiagnosticEntry[] {
        this.runAnalysis();

        return this.diagnostics;
    }

    private runAnalysis() {
        if (!this.analysisDone) {
            this.analysisDone = true;
            this.logFn(LogType.debug, () => `----- runAnalysis() -----`);
            let listener = new AnalysisListener(this.diagnostics, this.logFn);
            ParseTreeWalker.DEFAULT.walk(listener as ParseTreeListener, this.tree!);
        }
    }

    public static getKindFromSymbol(symbol: Symbol): SymbolKind {
        if (symbol instanceof OtherSymbol) {
            return SymbolKind.Other;
        }
        return SymbolKind.Other;
    }
    /**
     * Returns the definition info for the given rule context. Public, as it is required by listeners.
     */
    public static definitionForContext(ctx: ParseTree | undefined, keepQuotes: boolean): Definition | undefined {
        if (!ctx) {
            return undefined;
        }

        var result: Definition = {
            text: "",
            range: {
                start: { column: 0, row: 0 },
                end: { column: 0, row: 0 }
            }
        };

        if (ctx instanceof ParserRuleContext) {
            let range = <Interval> { a: ctx.start.startIndex, b: ctx.stop!.stopIndex };

            result.range.start.column = ctx.start.charPositionInLine;
            result.range.start.row = ctx.start.line;
            result.range.end.column = ctx.stop!.charPositionInLine;
            result.range.end.row = ctx.stop!.line;

            let cs = ctx.start.tokenSource!.inputStream;
            result.text = cs!.getText(range);
        } else if (ctx instanceof TerminalNode) {
            result.text = ctx.text;

            result.range.start.column = ctx.symbol.charPositionInLine;
            result.range.start.row = ctx.symbol.line;
            result.range.end.column = ctx.symbol.charPositionInLine + result.text.length;
            result.range.end.row = ctx.symbol.line;
        }
        return result;
    }

    public getCodeCompletionCandidates(column: number, row: number): SymbolInfo[] {
        if (!this.parser || !this.tokenStream) {
            return [];
        }

        let core = new CodeCompletionCore(this.parser);
        core.showResult = false;
        core.ignoredTokens = new Set([
            //msgParser.VAR,
            //msgParser.IDENT,
            msgParser.WHITESPACE,
            msgParser.NEWLINE,
            //msgParser.NAME,
            msgParser.NUMBER,
            msgParser.ASSIGN,
            msgParser.ADD,
            msgParser.SUB,
            msgParser.MUL,
            msgParser.DIV,
            msgParser.SHIFT,
            msgParser.P_OPEN,
            msgParser.P_CLOS,
            //msgParser.HEXNUM,
            //msgParser.OCTNUM,
            //msgParser.DECNUM,
            msgParser.DOT,
            msgParser.COMMA,
            msgParser.EXCL,
            msgParser.ANY,
            msgParser.EOF,
            -2, // Erroneously inserted. Needs fix in antlr4-c3.
        ]);

        core.preferredRules = new Set([
            //msgParser.RULE_msgContent,
            //msgParser.RULE_var,
            //msgParser.RULE_varDefinition,
            //msgParser.RULE_varName,
            //msgParser.RULE_varValue,
            //msgParser.RULE_ident,
            //msgParser.RULE_identString,
            //msgParser.RULE_expression,
            msgParser.RULE_expressionVariable,
            //msgParser.RULE_number,
            //msgParser.RULE_sep,
            //msgParser.RULE_continuation,
            //msgParser.RULE_eolMayComment,
        ]);

        // Search the token index which covers our caret position.
        let index: number;
        this.tokenStream.fill();
        for (index = 0; ; ++index) {
            let token = this.tokenStream.get(index);
            if (token.type === msgLexer.WHITESPACE) {
                continue;
            }
            //console.log(token.toString());
            if (token.type === Token.EOF || token.line > row) {
                break;
            }
            if (token.line < row) {
                continue;
            }
            let length = token.text ? token.text.length : 0;
            if ((token.charPositionInLine + length) >= column) {
                break;
            }
        }

        //core.showDebugOutput = true;
        core.showResult = true;
        core.showRuleStack = true;
        //core.debugOutputWithTransitions = true;

        let candidates = core.collectCandidates(index);
        let result: SymbolInfo[] = [];

        let tokens: number[] = [];
        candidates.tokens.forEach((following: number[], type: number) => {
            tokens.push(type);
        });
        this.logFn(LogType.debug, () => `index: ${index}, candidates: ${tokens.join(',')}`);

        const vocabulary = this.parser.vocabulary;

        candidates.tokens.forEach((following: number[], type: number) => {
            const info: SymbolInfo = {
                kind: SymbolKind.Other,
                name: "",
                source: this.fileName,
            };

            switch (type) {
                case msgLexer.HEXNUM:
                    info.kind = SymbolKind.Other;
                    info.name = "^X";
                    info.description = localize("hexnum","Hexadecimal number");
                    break;

                case msgLexer.OCTNUM:
                    info.kind = SymbolKind.Other;
                    info.name = "^O";
                    info.description = localize("octnum","Octal number");
                    break;

                case msgLexer.DECNUM:
                    info.kind = SymbolKind.Other;
                    info.name = "^D";
                    info.description = localize("decnum","Decimal number");
                    break;

                default: {
                    let value = vocabulary.getLiteralName(type) || vocabulary.getDisplayName(type);
                    info.kind = SymbolKind.Keyword;
                    info.name = value[0] === "'" ? value.substr(1, value.length - 2) : value; // Remove quotes.
                    break;
                }
            }

            result.push(info);
        });

        candidates.rules.forEach((callStack, key) => {
            switch (key) {
                case msgParser.RULE_expressionVariable: {
                    // TODO: add all existing varible names
                    ["auto", "bus", "court", "divide"].forEach(symbol => {
                        result.push(
                            { 
                                kind: SymbolKind.Other, 
                                name: symbol, 
                                source: this.fileName, 
                                definition: undefined, 
                                description: undefined 
                            }
                        );
                    });
                    break;
                }

                // case ANTLRv4Parser.RULE_terminalRule: { // Lexer rules.
                //     this.symbolTable.getAllSymbols(BuiltInTokenSymbol).forEach(symbol => {
                //         if (symbol.name !== "EOF") {
                //             result.push({ kind: SymbolKind.BuiltInLexerToken, name: symbol.name, source: this.fileName, definition: undefined, description: undefined });
                //         }
                //     });
                //     this.symbolTable.getAllSymbols(VirtualTokenSymbol).forEach(symbol => {
                //         result.push({ kind: SymbolKind.VirtualLexerToken, name: symbol.name, source: this.fileName, definition: undefined, description: undefined });
                //     });

                //     // Include fragment rules only when referenced from a lexer rule.
                //     if (callStack[callStack.length - 1] === ANTLRv4Parser.RULE_lexerAtom) {
                //         this.symbolTable.getAllSymbols(FragmentTokenSymbol).forEach(symbol => {
                //             result.push({
                //                 kind: SymbolKind.FragmentLexerToken,
                //                 name: symbol.name,
                //                 source: this.fileName,
                //                 definition: undefined,
                //                 description: undefined
                //             });
                //         });
                //     }

                //     this.symbolTable.getAllSymbols(TokenSymbol).forEach(symbol => {
                //         result.push({
                //             kind: SymbolKind.LexerToken,
                //             name: symbol.name,
                //             source: this.fileName,
                //             definition: undefined,
                //             description: undefined
                //         });
                //     });

                //     break;
                // }

                // case ANTLRv4Parser.RULE_lexerCommandName: {
                //     ["channel", "skip", "more", "mode", "push", "pop"].forEach(symbol => {
                //         result.push({ kind: SymbolKind.Keyword, name: symbol, source: this.fileName, definition: undefined, description: undefined });
                //     });
                //     break;
                // }

            }
        });

        return result;
    }

}
