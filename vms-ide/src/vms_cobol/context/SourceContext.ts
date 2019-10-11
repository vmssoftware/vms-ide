import * as path from 'path';
import * as nls from "vscode-nls";

import { Symbol, CodeCompletionCore } from "antlr4-c3";
import { ParseCancellationException } from 'antlr4ts/misc';
import { ParseTreeWalker, TerminalNode, ParseTreeListener } from 'antlr4ts/tree';
import { CommonTokenStream, BailErrorStrategy, DefaultErrorStrategy, Token } from 'antlr4ts';
import { PredictionMode } from 'antlr4ts/atn/PredictionMode';
import { LogFunction, LogType } from '../../common/main';
import { IDiagnosticEntry, IDefinition, ISymbolInfo, ISourceContext, EDiagnosticType } from '../../common/parser/Facade';
import { cobolParser, Cobol_sourceContext } from '../parser/cobolParser';
import { ParserErrorListener, LexerErrorListener } from '../../common/parser/ErrorListeners';
import { CobolInputStream } from '../stream/cobolInputStream';
import { cobolLexer } from '../parser/cobolLexer';
import { parseTreeFromPosition } from '../../common/parser/Helpers';
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
                this.logFn(LogType.debug, () => String(e));
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
                this.logFn(LogType.debug, () => String(e));
            }
        }
        return ret;
    }

    /**
     * Zero-based
     * @param column 
     * @param row 
     */
    public getCodeCompletionCandidates(column: number, row: number): string[] {
        if (!this.parser || !this.tokenStream) {
            return [];
        }

        if (this.input) {
            ({line: row, charPositionInLine: column} = this.input.getFilteredPosition(row, column));
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
        let result: string[] = [];

        const vocabulary = this.parser.vocabulary;

        candidates.tokens.forEach((following: number[], type: number) => {
            let value = vocabulary.getLiteralName(type) || vocabulary.getDisplayName(type);
            result.push( "'\"".includes(value[0]) ? value.substr(1, value.length - 2) : value); // Remove quotes.
        });

        candidates.rules.forEach((callStack, key) => {
            switch (key) {
                //TODO: add known rule types
            }
        });

        return result;
    }

    /**
     * Zer-based
     * @param column 
     * @param row 
     */
    public getSymbolOccurences(column: number, row: number): IDefinition[] {
        if (this.input) {
            let input = this.input;
            ({line: row, charPositionInLine: column} = input.getFilteredPosition(row, column));
            let master = this.masterSymbolAtPosition(column, row);
            if (master) {
                return this.symbolTable.getSymbolOccurences(master).map(x => {
                    ({line: x.range.start.row, charPositionInLine: x.range.start.column} = input.getRealPosition(x.range.start.row, x.range.start.column));
                    ({line: x.range.end.row, charPositionInLine: x.range.end.column} = input.getRealPosition(x.range.end.row, x.range.end.column));
                    return x;
                });
            }
        }
        return [];
    }

    /**
     * Zero-based
     * @param column 
     * @param row 
     */
    public symbolInfoAtPosition(column: number, row: number): ISymbolInfo<ECobolSymbolKind> | undefined {
        let info: ISymbolInfo<ECobolSymbolKind> | undefined;
        if (this.input) {
            ({line: row, charPositionInLine: column} = this.input.getFilteredPosition(row, column));
            info = this.symbolTable.getSymbolInfo(this.masterSymbolAtPosition(column, row));
            if (info && info.definition) {
                ({line: info.definition.range.start.row, charPositionInLine: info.definition.range.start.column} = this.input.getRealPosition(info.definition.range.start.row, info.definition.range.start.column));
                ({line: info.definition.range.end.row, charPositionInLine: info.definition.range.end.column} = this.input.getRealPosition(info.definition.range.end.row, info.definition.range.end.column));
            }
        }
        return info;
    }

    //________________________________________________________________________________

    /**
     * Zero-based
     * @param row 
     * @param column 
     */
    private getTokenIndexByPosition(row: number, column: number) {
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
            if (token.line == row + 1) {
                let length = token.text ? token.text.length : 0;
                if ((token.charPositionInLine + length) >= column) {
                    break;
                }
            }
        }
        return index;
    }

    /**
     * Zero-based
     * @param column 
     * @param row 
     */
    private masterSymbolAtPosition(column: number, row: number): Symbol | undefined {
        if (this.tree) {
            let node = parseTreeFromPosition(this.tree, column, row);
            if (node instanceof TerminalNode) {
                return this.symbolTable.getMasterSymbol(node);
            }
        }
        return undefined;
    }

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
}
