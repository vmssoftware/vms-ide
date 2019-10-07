import * as path from 'path';
import * as nls from "vscode-nls";

import { Symbol, CodeCompletionCore } from "antlr4-c3";
import { ParseCancellationException, Interval } from 'antlr4ts/misc';
import { ParseTreeWalker, TerminalNode, ParseTree, ParseTreeListener } from 'antlr4ts/tree';
import { CommonTokenStream, BailErrorStrategy, DefaultErrorStrategy, ParserRuleContext, Token, RuleContext } from 'antlr4ts';
import { PredictionMode } from 'antlr4ts/atn/PredictionMode';
import { LogFunction, LogType } from '../../common/main';
import { IDiagnosticEntry, IDefinition, ISymbolInfo, ISourceContext, EDiagnosticType } from '../../common/parser/Facade';
import { cobolParser, Cobol_sourceContext } from '../parser/cobolParser';
import { ParserErrorListener, LexerErrorListener } from '../../common/parser/ErrorListeners';
import { CobolInputStream } from '../stream/cobolInputStream';
import { cobolLexer } from '../parser/cobolLexer';
import { parseTreeFromPosition } from '../../common/parser/parseTree';
import { CobolAnalysisListener } from './AnalysisListener';
import { ECobolSymbolKind } from './Symbol';
import { CobolSymbolTable } from './ContextSymbolTable';
import { CobolDetailsListener } from './DetailsListener';

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export class CobolSourceContext implements ISourceContext<ECobolSymbolKind> {

    private sourceId: string;
    private streamErrors: IDiagnosticEntry[] = [];
    private diagnostics: IDiagnosticEntry[] = [];
    private symbolTable: CobolSymbolTable;
    private imports: string[] = [];

    public compilerConditions: string = "";

    // Grammar parsing infrastructure.
    private input?: CobolInputStream;
    private tokenStream?: CommonTokenStream;
    private parser?: cobolParser;
    private parserErrorListener = new ParserErrorListener(this.diagnostics);
    private lexerErrorListener = new LexerErrorListener(this.diagnostics);
    private analysisDone: boolean = false; // Includes determining reference counts.

    private tree?: Cobol_sourceContext;     // The root context from the last parse run.
    public logFn: LogFunction;

    constructor(public fileName: string, logFn?: LogFunction) {
        // tslint:disable-next-line:no-empty
        this.logFn = logFn || (() => {});
        this.sourceId = path.basename(fileName, path.extname(fileName));

        this.symbolTable =  new CobolSymbolTable(this.sourceId, { allowDuplicateSymbols: true }, this);
    }

    /**
     * Should be called on every change to keep the input stream up to date particularly for code completion.
     * This call doesn't do any expensive processing (parse() does).
     */
    public setText(source: string) {
        
        let streamErrorListener = {
            syntaxError: (line: number, charPositionInLine: number, message: string): void => {
                this.streamErrors.push({
                    message,
                    type: EDiagnosticType.Error,
                    range: {
                        start: {
                            row: line,
                            column: charPositionInLine,
                        },
                        end: {
                            row: line,
                            column: charPositionInLine,
                        }
                    }
                });
            }
        }
        this.streamErrors.length = 0;
        this.input = new CobolInputStream(streamErrorListener, source, this.compilerConditions);

        if (this.streamErrors.length === 0) {
            let lexer = new cobolLexer(this.input);
            // There won't be lexer errors actually. They are silently bubbled up and will cause parser errors.
            lexer.removeErrorListeners();
            lexer.addErrorListener(this.lexerErrorListener);
            this.tokenStream = new CommonTokenStream(lexer);
        }
    }

    public parse() {
        if (!this.tokenStream) {
            return;
        }
        // Rewind the input stream for a new parse run.
        // Might be unnecessary when we just created that via setText.
        this.tokenStream.seek(0);
        this.parser = new cobolParser(this.tokenStream);
        this.parser.removeErrorListeners();
        this.parser.addErrorListener(this.parserErrorListener);

        this.parser.errorHandler = new BailErrorStrategy();
        this.parser.interpreter.setPredictionMode(PredictionMode.SLL);

        this.tree = undefined;

        this.diagnostics.length = 0;
        this.analysisDone = false;

        try {
            this.tree = this.parser.cobol_source();
        } catch (e) {
            if (e instanceof ParseCancellationException) {
                this.diagnostics.length = 0;
                this.tokenStream.seek(0);
                this.parser.reset();
                this.parser.errorHandler = new DefaultErrorStrategy();
                this.parser.interpreter.setPredictionMode(PredictionMode.LL);
                this.tree = this.parser.cobol_source();
            } else {
                throw e;
            }
        }

        if (this.tree) {
            this.symbolTable.tree = this.tree;
            this.symbolTable.clear();
            try {
                let listener: CobolDetailsListener = new CobolDetailsListener(this.symbolTable, this.imports);
                ParseTreeWalker.DEFAULT.walk(listener as ParseTreeListener, this.tree);
                this.runAnalysis();
            } catch(e) {
                this.logFn(LogType.error, () => String(e), true);
            }
        }

        this.updateDiagnosticRanges();
    }

    public getDiagnostics(): IDiagnosticEntry[] {
        let ret: IDiagnosticEntry[] = [];
        if (this.streamErrors.length > 0) {
            ret.push(...this.streamErrors);
        } else {
            try {
                this.runAnalysis();
                ret.push(...this.diagnostics);
            } catch(e) {
                this.logFn(LogType.error, () => String(e), true);
            }
        }
        return ret;
    }

    public getTokenIndexByPosition(row: number, column: number) {
        if (!this.parser || !this.tokenStream) {
            return -1;
        }
        // Search the token index which covers our caret position.
        let index: number;
        this.tokenStream.fill();
        for (index = 0; ; ++index) {
            let token = this.tokenStream.get(index);
            if (token.type === Token.EOF || token.line > row) {
                break;
            }
            if (token.line == row) {
                let length = token.text ? token.text.length : 0;
                if ((token.charPositionInLine + length) >= column) {
                    break;
                }
            }
        }
        return index;
    }

    public getCodeCompletionCandidates(column: number, row: number): ISymbolInfo<ECobolSymbolKind>[] {
        if (!this.parser || !this.tokenStream) {
            return [];
        }

        let core = new CodeCompletionCore(this.parser);
        core.showResult = false;
        core.ignoredTokens = new Set([
            //TODO: add ignored tokens
            Token.EOF,
            -2, // Erroneously inserted. Needs fix in antlr4-c3.
        ]);

        core.preferredRules = new Set([
            //TODO: add preferred rules
        ]);

        // Search the token index which covers our caret position.
        let index = this.getTokenIndexByPosition(row, column);
        if (index === -1) {
            return [];
        }

        //core.showDebugOutput = true;
        //core.showResult = true;
        //core.showRuleStack = true;
        //core.debugOutputWithTransitions = true;

        let candidates = core.collectCandidates(index);
        let result: ISymbolInfo<ECobolSymbolKind>[] = [];

        let tokens: number[] = [];
        candidates.tokens.forEach((following: number[], type: number) => {
            tokens.push(type);
        });

        const vocabulary = this.parser.vocabulary;

        candidates.tokens.forEach((following: number[], type: number) => {
            const info: ISymbolInfo<ECobolSymbolKind> = {
                kind: ECobolSymbolKind.Unknown,
                name: "",
                source: this.fileName,
            };

            switch (type) {

                //TODO: add known token types

                // case msgParser.HEXNUM:
                //     info.kind = ESymbolKind.Other;
                //     info.name = "^X";
                //     info.description = localize("hexnum","Hexadecimal number");
                //     break;

                default: {
                    let value = vocabulary.getLiteralName(type) || vocabulary.getDisplayName(type);
                    info.name = value[0] === "'" ? value.substr(1, value.length - 2) : value; // Remove quotes.
                    break;
                }
            }

            result.push(info);
        });

        candidates.rules.forEach((callStack, key) => {
            switch (key) {
                //TODO: add known rule types

                // case msgParser.RULE_expressionVariable:
                //     if (this.symbolsForExpression) {
                //         this.symbolsForExpression.forEach((source, value) => {
                //             if (source.visibleFrom < index) {
                //                 result.push(
                //                     { 
                //                         kind: ESymbolKind.Other, 
                //                         name: value, 
                //                         source: this.fileName, 
                //                         definition: undefined, 
                //                         description: undefined 
                //                     }
                //                 );
                //             }
                //         });
                //     }
                //     break;
            }
        });

        return result;
    }

    public getSymbolOccurences(column: number, row: number): ISymbolInfo<ECobolSymbolKind>[] {

        const occurances: ISymbolInfo<ECobolSymbolKind>[] = [];

        let terminal = parseTreeFromPosition(this.tree!, column, row);
        if (!terminal || !(terminal instanceof TerminalNode)) {
            return occurances;
        }

        let parent = (terminal.parent as RuleContext);
        switch (parent.ruleIndex) {
            // TODO: push occurances depending on rule

            // case msgParser.RULE_literalName: 
            // case msgParser.RULE_expressionVariable: {
            //     const source = this.symbolsForExpression.get(terminal.text.toUpperCase());
            //     if (source && source.literal) {
            //         occurances.push(this.symbolInfoFromToken(ESymbolKind.Literal, source.literal));
            //         for (const ref of source.refs) {
            //             occurances.push(this.symbolInfoFromToken(ESymbolKind.Literal, ref));
            //         }
            //     }
            //     break;
            // }
            // case msgParser.RULE_prefixQualifierValue:
            //     occurances.push(this.symbolInfoFromToken(ESymbolKind.FacilityPrefix, terminal.symbol));
            //     occurances.push(...this.getVariablesByPrefix(terminal.symbol));
            //     break;
            // case msgParser.RULE_facilityName:
            //     occurances.push(this.symbolInfoFromToken(ESymbolKind.FacilityName, terminal.symbol));
            //     occurances.push(...this.getVariablesByPrefix(terminal.symbol));
            //     break;
            // case msgParser.RULE_messageName:
            //     occurances.push(this.symbolInfoFromToken(ESymbolKind.Message, terminal.symbol));
            //     occurances.push(...this.getVariablesByMessage(terminal.symbol));
        }
        return occurances;
    }

    // public getVariablesByPrefix(token: Token) {
    //     const vars: ISymbolInfo[] = [];
        
    //     // find all variables that use this facility name or prefix
    //     for (const [name, source] of this.symbolsForExpression) {
    //         if (source.prefix && source.prefix.tokenIndex === token.tokenIndex) {
    //             for (const ref of source.refs) {
    //                 const info = this.symbolInfoFromToken(ESymbolKind.Variable, ref);
    //                 if (info.definition) {
    //                     // only facility name part of variable have to be changed
    //                     info.definition.range.end.column = info.definition.range.start.column + (token.text ? token.text.length : 0);
    //                 }
    //                 vars.push(info);
    //             }
    //         }
    //     }
    //     return vars;
    // }

    // public getVariablesByMessage(token: Token) {
    //     const vars: ISymbolInfo[] = [];
    //     if (!this.symbolsForExpression) {
    //         return vars;
    //     }
    //     // find all variables that use this facility name or prefix
    //     for (const [name, source] of this.symbolsForExpression) {
    //         if (source.message && source.message.tokenIndex === token.tokenIndex) {
    //             for (const ref of source.refs) {
    //                 const info = this.symbolInfoFromToken(ESymbolKind.Variable, ref);
    //                 if (info.definition) {
    //                     // only facility name part of variable have to be changed
    //                     info.definition.range.start.column = info.definition.range.end.column - (token.text ? token.text.length : 0);
    //                 }
    //                 vars.push(info);
    //             }
    //         }
    //     }
    //     return vars;
    // }

    public symbolAtPosition(column: number, row: number): Symbol | undefined {
        let node = parseTreeFromPosition(this.tree!, column, row);
        if (!node || !(node instanceof TerminalNode)) {
            return undefined;
        }
        return this.symbolTable.symbolWithContext(node);
    }

    public symbolInfoAtPosition(column: number, row: number): ISymbolInfo<ECobolSymbolKind> | undefined {
        return this.symbolTable.getSymbolInfo(this.symbolAtPosition(column, row));
    }

    //________________________________________________________________________________

    private updateDiagnosticRanges() {
        if (this.input) {
            for(const d of this.diagnostics) {
                ({line: d.range.start.row, charPositionInLine: d.range.start.column} = this.input.getRealPosition(d.range.start.row - 1, d.range.start.column));
                ({line: d.range.end.row, charPositionInLine: d.range.end.column} = this.input.getRealPosition(d.range.end.row - 1, d.range.end.column));
            }
        }
    }

    private runAnalysis() {
        if (!this.analysisDone) {
            let listener = new CobolAnalysisListener(this.diagnostics, this.symbolTable);
            ParseTreeWalker.DEFAULT.walk(listener as ParseTreeListener, this.tree!);
            this.analysisDone = true;
        }
    }

    private symbolInfoFromToken(kind: ECobolSymbolKind, token: Token) {
        const info: ISymbolInfo<ECobolSymbolKind> = {
            kind: kind,
            name:  token.text || "",
            source: this.fileName,
        };
        info.definition = {
            text: token.text || "",
            range: { 
                start:  { row: token.line, column: token.charPositionInLine},
                end:    { row: token.line, column: token.charPositionInLine + (token.text ? token.text.length : 0)}
            }
        };
        return info;
    }

    //________________________________________________________________________________

    public static getKindFromSymbol(symbol: Symbol): ECobolSymbolKind {
        // if (symbol instanceof OtherSymbol) {
        //     return ESymbolKind.Other;
        // }
        return ECobolSymbolKind.Unknown;
    }

    /**
     * Returns the definition info for the given rule context. Public, as it is required by listeners.
     */
    public static definitionForParserRuleContext(ctx: ParserRuleContext) : IDefinition {
        let stop = ctx.stop? ctx.stop : ctx.start;
        return {
            text: ctx.text,
            range: {
                start: { column: ctx.start.charPositionInLine, row: ctx.start.line},
                end: { column: stop.charPositionInLine, row: stop.line},
            }
        };
    }

    public static definitionForTerminalNode(ctx: TerminalNode) : IDefinition {
        return {
            text: ctx.text,
            range: {
                start: { column: ctx.symbol.charPositionInLine, row: ctx.symbol.line},
                end: { column: ctx.symbol.charPositionInLine + ctx.text.length, row: ctx.symbol.line},
            }
        };
    }

    public static definitionForContext(ctx: ParseTree | undefined, keepQuotes: boolean): IDefinition | undefined {
        if (ctx instanceof ParserRuleContext) {
            return CobolSourceContext.definitionForParserRuleContext(ctx);
        } else if (ctx instanceof TerminalNode) {
            return CobolSourceContext.definitionForTerminalNode(ctx);
        }
        return undefined;
    }

}
