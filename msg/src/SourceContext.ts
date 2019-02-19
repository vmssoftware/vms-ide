import * as path from 'path';
import * as nls from "vscode-nls";

import { Symbol, CodeCompletionCore } from "antlr4-c3";
import { ParseCancellationException, IntervalSet, Interval } from 'antlr4ts/misc';
import { ParseTreeWalker, TerminalNode, ParseTree, ParseTreeListener } from 'antlr4ts/tree';
import { msgParser, MsgContentContext } from "./msgParser";
import { ANTLRInputStream, CommonTokenStream, BailErrorStrategy, DefaultErrorStrategy, ParserRuleContext, Token, RuleContext } from 'antlr4ts';
import { msgLexer } from './msgLexer';
import { DiagnosticEntry, SymbolKind, Definition, SymbolInfo } from './MsgFacade';
import { ContextErrorListener, ContextLexerErrorListener } from './ContextErrorListener';
import { PredictionMode } from 'antlr4ts/atn/PredictionMode';
import { ContextSymbolTable, OtherSymbol } from './ContextSymbolTable';
import { AnalysisListener, VariableSource } from './AnalysisListener';
import { LogFunction, LogType } from '@vorfol/common';

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export class SourceContext {

    public sourceId: string;
    public diagnostics: DiagnosticEntry[] = [];
    public symbolTable: ContextSymbolTable;
    public symbolsForExpression?: Map<string, VariableSource>;     //symbol and token index after runAnalysis()

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
            this.symbolsForExpression = listener.symbols;
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
            msgParser.T__0,
            msgParser.T__1,
            msgParser.T__2,
            msgParser.T__3,
            msgParser.T__4,
            msgParser.T__5,
            msgParser.T__6,
            msgParser.T__7,
            msgParser.T__8,
            msgParser.T__9,
            msgParser.T__10,
            msgParser.T__11,
            msgParser.T__12,
            msgParser.T__13,
            msgParser.T__14,
            msgParser.T__15,
            msgParser.T__16,
            msgParser.T__17,
            msgParser.T__18,
            msgParser.T__19,
            msgParser.T__20,
            msgParser.T__21,
            msgParser.T__22,
            msgParser.T__23,
            msgParser.T__24,
            msgParser.T__25,
            msgParser.T__26,
            msgParser.T__27,
            msgParser.T__28,
            msgParser.T__29,
            msgParser.T__30,
            // msgParser.TITLE,
            // msgParser.IDENT,
            // msgParser.PAGE,
            // msgParser.LITERAL,
            // msgParser.FACILITY,
            // msgParser.SEVERITY,
            // msgParser.BASE,
            // msgParser.END,
            // msgParser.PREFIX,
            // msgParser.SHARED,
            // msgParser.SYSTEM,
            // msgParser.FAOCOUNT,
            // msgParser.IDENTIFICATION,
            // msgParser.USERVALUE,
            // msgParser.SUCCESS,
            // msgParser.INFORMATIONAL,
            // msgParser.WARNING,
            // msgParser.ERROR,
            // msgParser.SEVERE,
            // msgParser.FATAL,
            // msgParser.FAO,
            msgParser.WHITESPACE,
            msgParser.NEWLINE,
            msgParser.NAME,
            msgParser.NUMBER,
            msgParser.ASSIGN,
            msgParser.ADD,
            msgParser.SUB,
            msgParser.MUL,
            msgParser.DIV,
            msgParser.SHIFT,
            msgParser.P_OPEN,
            msgParser.P_CLOS,
            // msgParser.HEXNUM,
            // msgParser.OCTNUM,
            // msgParser.DECNUM,
            msgParser.DOT,
            msgParser.COMMA,
            msgParser.EXCL,
            msgParser.APOSTR,
            msgParser.QUOTA,
            msgParser.B_OPEN,
            msgParser.B_CLOSE,
            msgParser.ANY,
            msgParser.EOF,
            -2, // Erroneously inserted. Needs fix in antlr4-c3.
        ]);

        core.preferredRules = new Set([
            // msgParser.RULE_msgContent,
            // msgParser.RULE_title,
            // msgParser.RULE_titleName,
            // msgParser.RULE_titleDescription,
            // msgParser.RULE_ident,
            // msgParser.RULE_identValue,
            // msgParser.RULE_page,
            // msgParser.RULE_literal,
            // msgParser.RULE_literalDefinition,
            // msgParser.RULE_literalName,
            // msgParser.RULE_literalValue,
            // msgParser.RULE_facility,
            // msgParser.RULE_facilityDescription,
            // msgParser.RULE_facilityName,
            // msgParser.RULE_facilityNumber,
            // msgParser.RULE_facilityContent,
            // msgParser.RULE_facilityQualifier,
            // msgParser.RULE_prefixQualifier,
            // msgParser.RULE_prefixQualifierValue,
            // msgParser.RULE_sharedQualifier,
            // msgParser.RULE_systemQualifier,
            // msgParser.RULE_severity,
            // msgParser.RULE_severityValue,
            // msgParser.RULE_base,
            // msgParser.RULE_baseNumber,
            // msgParser.RULE_end,
            // msgParser.RULE_expression,
            msgParser.RULE_expressionVariable,
            // msgParser.RULE_number,
            // msgParser.RULE_sep,
            // msgParser.RULE_continuation,
            // msgParser.RULE_eolMayComment,
            // msgParser.RULE_message,
            // msgParser.RULE_messageName,
            // msgParser.RULE_messageQualifier,
            // msgParser.RULE_severityQualifier,
            // msgParser.RULE_faoCount,
            // msgParser.RULE_faoCountValue,
            // msgParser.RULE_identification,
            // msgParser.RULE_identificationValue,
            // msgParser.RULE_userValue,
            // msgParser.RULE_userValueValue,
            // msgParser.RULE_success,
            // msgParser.RULE_informational,
            // msgParser.RULE_warning,
            // msgParser.RULE_error,
            // msgParser.RULE_severe,
            // msgParser.RULE_fatal,
            // msgParser.RULE_messageText,
            msgParser.RULE_fao,
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
        //core.showResult = true;
        //core.showRuleStack = true;
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
                case msgParser.RULE_expressionVariable:
                    if (this.symbolsForExpression) {
                        this.symbolsForExpression.forEach((source, value) => {
                            if (source.visibleFrom < index) {
                                result.push(
                                    { 
                                        kind: SymbolKind.Other, 
                                        name: value, 
                                        source: this.fileName, 
                                        definition: undefined, 
                                        description: undefined 
                                    }
                                );
                            }
                        });
                    }
                    break;

                case msgParser.RULE_fao:
                    result = [];
                    // TODO: get all from fao definition
                    ["!!", "!_", "!^"].forEach(symbol => {
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
        });

        return result;
    }

    public symbolAtPosition(column: number, row: number, limitToChildren: boolean): SymbolInfo | undefined {
        let terminal = parseTreeFromPosition(this.tree!, column, row);
        if (!terminal || !(terminal instanceof TerminalNode) || terminal.symbol.type === msgParser.WHITESPACE) {
            return undefined;
        }

        let parent = (terminal.parent as RuleContext);
        switch (parent.ruleIndex) {
            case  msgParser.RULE_expressionVariable:
                let description = "In expression...";
                if (this.symbolsForExpression) {
                    const source = this.symbolsForExpression.get(terminal.text);
                    if (source) {
                        if (source.literal) {
                            description = "Defined in LITERAL";
                        } else if (source.message && source.prefix) {
                            description = `Constructed: ${source.prefix.text} + ${source.message.text}`;
                        }
                    }
                }
                return {
                    kind: SymbolKind.Variable,
                    name:  terminal.text,
                    source: this.fileName,
                    description,
                };
        }

        return undefined;

    }

}

/**
 * Returns the parse tree which covers the given position or undefined if none could be found.
 */
function parseTreeFromPosition(root: ParseTree, column: number, row: number): ParseTree | undefined {
    // Does the root node actually contain the position? If not we don't need to look further.
    if (root instanceof TerminalNode) {
        let terminal = (root as TerminalNode);
        let token = terminal.symbol;
        if (token.line !== row) {
            return undefined;
        }

        let tokenStop = token.charPositionInLine + (token.stopIndex - token.startIndex + 1);
        if (token.charPositionInLine <= column && tokenStop >= column) {
            return terminal;
        }
        return undefined;
    } else {
        let context = (root as ParserRuleContext);
        if (!context.start || !context.stop) { // Invalid tree?
            return undefined;
        }

        if (context.start.line > row || (context.start.line === row && column < context.start.charPositionInLine)) {
            return undefined;
        }

        let tokenStop = context.stop.charPositionInLine + (context.stop.stopIndex - context.stop.startIndex + 1);
        if (context.stop.line < row || (context.stop.line === row && tokenStop < column)) {
            return undefined;
        }

        if (context.children) {
            for (let child of context.children) {
                let result = parseTreeFromPosition(child, column, row);
                if (result) {
                    return result;
                }
            }
        }
        return context;

    }
}
