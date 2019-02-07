import * as path from 'path';

import { ParseCancellationException, IntervalSet, Interval } from 'antlr4ts/misc';
import { ParseTreeWalker, TerminalNode, ParseTree, ParseTreeListener } from 'antlr4ts/tree';
import { msgParser, MainRuleContext } from "./msgParser";
import { ANTLRInputStream, CommonTokenStream, BailErrorStrategy, DefaultErrorStrategy } from 'antlr4ts';
import { msgLexer } from './msgLexer';
import { DiagnosticEntry } from './msg-facade';
import { ContextErrorListener, ContextLexerErrorListener } from './ContextErrorListener';
import { PredictionMode } from 'antlr4ts/atn/PredictionMode';

export class MsgSourceContext {

    public sourceId: string;
    public diagnostics: DiagnosticEntry[] = [];

    // Grammar parsing infrastructure.
    private tokenStream?: CommonTokenStream;
    private parser?: msgParser;
    private errorListener: ContextErrorListener = new ContextErrorListener(this.diagnostics);
    private lexerErrorListener: ContextLexerErrorListener = new ContextLexerErrorListener(this.diagnostics);
    private semanticAnalysisDone: boolean = false; // Includes determining reference counts.

    private tree?: MainRuleContext; // The root context from the last parse run.

    constructor(public fileName: string) {
        this.sourceId = path.basename(fileName, path.extname(fileName));
    }

    /**
     * Should be called on every change to keep the input stream up to date particularly for code completion.
     * This call doesn't do any expensive processing (parse() does).
     */
    public setText(source: string) {
        let input = new ANTLRInputStream(source);
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

        try {
            this.tree = this.parser.mainRule();
        } catch (e) {
            if (e instanceof ParseCancellationException) {
                this.tokenStream.seek(0);
                this.parser.reset();
                this.parser.errorHandler = new DefaultErrorStrategy();
                this.parser.interpreter.setPredictionMode(PredictionMode.LL);
                this.tree = this.parser.mainRule();
            } else {
                throw e;
            }
        }

        //let listener: DetailsListener = new DetailsListener(this.symbolTable, this.imports);
        //ParseTreeWalker.DEFAULT.walk(listener as ParseTreeListener, this.tree);
    }

    public getDiagnostics(): DiagnosticEntry[] {
        this.runSemanticAnalysisIfNeeded();

        return this.diagnostics;
    }

    private runSemanticAnalysisIfNeeded() {
        if (!this.semanticAnalysisDone) {
            this.semanticAnalysisDone = true;

            // let semanticListener = new SemanticListener(this.diagnostics, this.symbolTable);
            // ParseTreeWalker.DEFAULT.walk(semanticListener as ParseTreeListener, this.tree!);

            // let visitor = new RuleVisitor(this.rrdScripts);
            // visitor.visit(this.tree!);
        }
    }

}
