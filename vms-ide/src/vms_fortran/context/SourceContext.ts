import * as path from 'path';
import * as nls from "vscode-nls";

import { Symbol, CodeCompletionCore, ScopedSymbol } from "antlr4-c3";
import { ParseCancellationException, IntervalSet, Interval } from 'antlr4ts/misc';
import { ParseTreeWalker, TerminalNode, ParseTree, ParseTreeListener } from 'antlr4ts/tree';
import { FortranParser, ProgramContext } from "../parser/FortranParser";
import { FortranLexer } from "../parser/FortranLexer";
import { ANTLRInputStream, CommonTokenStream, BailErrorStrategy, DefaultErrorStrategy, ParserRuleContext, Token, RuleContext } from 'antlr4ts';
import { DiagnosticEntry, SymbolKind, SymbolInfo } from './Facade';
import { ContextErrorListener, ContextLexerErrorListener } from './ContextErrorListener';
import { PredictionMode } from 'antlr4ts/atn/PredictionMode';
import { AnalysisListener} from './AnalysisListener';
import { SyntaxSymbol, BuiltInTypeSymbol, ContextSymbolTable } from './ContextSymbolTable';
import { BuiltInValueTypes, symbolDescriptionFromEnum } from './Symbol';
import { DetailsListener } from './DetailsListener';

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export class SourceContext 
{
    public sourceId: string;
    public diagnostics: DiagnosticEntry[] = [];
    private references: SourceContext[] = []; // Contexts referencing us.
    private imports: string[] = []; // Updated on each parse run.

    // Grammar parsing infrastructure.
    private tokenStream?: CommonTokenStream;
    private parser?: FortranParser;
    private errorListener: ContextErrorListener = new ContextErrorListener(this.diagnostics);
    private lexerErrorListener: ContextLexerErrorListener = new ContextLexerErrorListener(this.diagnostics);
    private analysisDone: boolean = false; // Includes determining reference counts.

    private tree?: ProgramContext; // The root context from the last parse run.

    public symbolTable: ContextSymbolTable;
    public static globalSymbols = new ContextSymbolTable("Global Symbols", { allowDuplicateSymbols: false });

    constructor(public fileName: string) 
    {
        // tslint:disable-next-line:no-empty
        this.sourceId = path.basename(fileName, path.extname(fileName));
        this.symbolTable =  new ContextSymbolTable(this.sourceId, { allowDuplicateSymbols: true }, this);

        if (!SourceContext.globalSymbols.resolve("EOF")) 
        {
            SourceContext.globalSymbols.addNewSymbolOfType(Symbol, undefined, "EOF");

            for (const builtintype of BuiltInValueTypes) 
            {
                SourceContext.globalSymbols.addNewSymbolOfType(BuiltInTypeSymbol, undefined, builtintype);
            }
        }
    }

    /**
     * Should be called on every change to keep the input stream up to date particularly for code completion.
     * This call doesn't do any expensive processing (parse() does).
     */
    public setText(source: string) 
    {
        // let input = new ANTLRInputStream(source.toUpperCase()+"\n");  // convert to upper case and add NEWLINE to force end of last line
        let input = new ANTLRInputStream("\r" + source + "\n");  // just add NEWLINE to force end of last line
        let lexer = new FortranLexer(input);

        // There won't be lexer errors actually. They are silently bubbled up and will cause parser errors.
        lexer.removeErrorListeners();
        lexer.addErrorListener(this.lexerErrorListener);
        this.tokenStream = new CommonTokenStream(lexer);
    }

    public parse(): string[]
    {
        if (!this.tokenStream) 
        {
            return [];
        }
        // Rewind the input stream for a new parse run.
        // Might be unnecessary when we just created that via setText.
        this.tokenStream.seek(0);
        this.parser = new FortranParser(this.tokenStream);
        this.parser.removeErrorListeners();
        this.parser.addErrorListener(this.errorListener);

        this.parser.errorHandler = new BailErrorStrategy();
        this.parser.interpreter.setPredictionMode(PredictionMode.SLL);

        this.tree = undefined;

        this.imports.length = 0;
        this.diagnostics.length = 0;
        this.analysisDone = false;
        this.symbolTable.clear();
        this.symbolTable.addDependencies(SourceContext.globalSymbols);

        try 
        {
            this.tree = this.parser.program();
        }
        catch (e) 
        {
            if (e instanceof ParseCancellationException) 
            {
                this.tokenStream.seek(0);
                this.parser.reset();
                this.parser.errorHandler = new DefaultErrorStrategy();
                this.parser.interpreter.setPredictionMode(PredictionMode.LL);
                this.tree = this.parser.program();
            } 
            else 
            {
                throw e;
            }
        }

        try
        {
            if(this.tree)
            {
                this.symbolTable.tree = this.tree;
                let listener: DetailsListener = new DetailsListener(this.symbolTable, this.imports);
                ParseTreeWalker.DEFAULT.walk(listener as ParseTreeListener, this.tree);
            }
        }
        catch(e)
        {}

        this.runAnalysis();

        return this.imports;
    }

    public getDiagnostics(): DiagnosticEntry[] 
    {
        this.runAnalysis();

        return this.diagnostics;
    }

    private runAnalysis() 
    {
        if (!this.analysisDone) 
        {
            try
            {
                if(this.tree)
                {                    
                    let listener = new AnalysisListener(this.diagnostics, this.symbolTable);
                    ParseTreeWalker.DEFAULT.walk(listener as ParseTreeListener, this.tree!);
                    this.analysisDone = true;
                }
            }
            catch(e)
            {}
        }
    }
    
    /**
     * Add this context to the list of referencing contexts in the given context.
     */
    public addAsReferenceTo(context: SourceContext) 
    {
        // Check for mutual inclusion. References are organized like a mesh.
        let pipeline: SourceContext[] = [context];

        while (pipeline.length > 0) 
        {
            let current = pipeline.shift();
            
            if (!current) 
            {
                continue;
            }

            if (current.references.indexOf(this) > -1) 
            {
                return; // Already in the list.
            }

            pipeline.push(...current.references);
        }

        context.references.push(this);
        this.symbolTable.addDependencies(context.symbolTable);
    }
    
    /**
     * Remove the given context from our list of dependencies.
     */
    public removeDependency(context: SourceContext) 
    {
        let index = context.references.indexOf(this);

        if (index > -1) 
        {
            context.references.splice(index, 1);
        }

        this.symbolTable.removeDependency(context.symbolTable);
    }

    public getReferenceCount(symbol: Symbol): number 
    {
        let result = this.symbolTable.getReferenceCount(symbol);

        for (let reference of this.references) 
        {
            result += reference.getReferenceCount(symbol);
        }

        return result;
    }

    public getAllSymbols(recursive: boolean): Set<Symbol> 
    {
        // The symbol table returns symbols of itself and those it depends on (if recursive is true).
        let result = this.symbolTable.getAllSymbols(Symbol, !recursive);

        // Add also symbols from contexts referencing us, this time not recursive
        // as we have added our content already.
        for (let reference of this.references) 
        {
            reference.symbolTable.getAllSymbols(Symbol, true).forEach(result.add, result);
        }

        return result;
    }

    public getTokenIndexByPosition(row: number, column: number) 
    {
        if (!this.parser || !this.tokenStream) 
        {
            return -1;
        }
        // Search the token index which covers our caret position.
        let index: number;
        this.tokenStream.fill();

        for (index = 0; ; ++index) 
        {
            let token = this.tokenStream.get(index);
            if (token.type === FortranParser.WS) 
            {
                continue;
            }
            if (token.type === Token.EOF || token.line > row) 
            {
                break;
            }
            if (token.line < row) 
            {
                continue;
            }

            let length = token.text ? token.text.length : 0;

            if ((token.charPositionInLine + length) >= column) 
            {
                break;
            }
        }

        return index;
    }

    public getCodeCompletionCandidates(column: number, row: number): SymbolInfo[] 
    {
        if (!this.parser || !this.tokenStream) 
        {
            return [];
        }

        let core = new CodeCompletionCore(this.parser);
        core.showResult = false;
        core.ignoredTokens = new Set([
            // FortranParser.PLUS,
            // FortranParser.MINUS,
            // FortranParser.STAR,
            // FortranParser.SLASH,
            // FortranParser.ASSIGN,
            // FortranParser.COMMA,
            // FortranParser.SEMI,
            // FortranParser.COLON,
            // FortranParser.EQUAL,
            // FortranParser.NOT_EQUAL,
            // FortranParser.LT,
            // FortranParser.LE,
            // FortranParser.GE,
            // FortranParser.GT,
            // FortranParser.LPAREN,
            // FortranParser.RPAREN,
            // FortranParser.LBRACK,
            // FortranParser.LBRACK2,
            // FortranParser.RBRACK,
            // FortranParser.RBRACK2,
            // FortranParser.POINTER,
            // FortranParser.AT,
            // FortranParser.DOT,
            // FortranParser.DOTDOT,
            // FortranParser.LCURLY,
            // FortranParser.RCURLY,
            // FortranParser.WS,
            // FortranParser.COMMENT_1,
            // FortranParser.COMMENT_2,
            // FortranParser.IDENT,
            // FortranParser.STRING_LITERAL,
            // FortranParser.IDENTIFIER,
            // FortranParser.NUM_INT,
            // FortranParser.NUM_REAL,
            FortranParser.EOF,
            -2, // Erroneously inserted. Needs fix in antlr4-c3.
        ]);

        core.preferredRules = new Set([
            // FortranParser.RULE_block,
            //FortranParser.RULE_procedureAndFunctionDeclarationPart
        ]);

        // Search the token index which covers our caret position.
        let index = this.getTokenIndexByPosition(row, column);
        if (index === -1) 
        {
            return [];
        }

        let candidates = core.collectCandidates(index);
        let result: SymbolInfo[] = [];

        let tokens: number[] = [];
        candidates.tokens.forEach((following: number[], type: number) => {
            tokens.push(type);
        });

        const vocabulary = this.parser.vocabulary;

        candidates.tokens.forEach((following: number[], type: number) => {
            const info: SymbolInfo = {
                kind: SymbolKind.Unknown,
                name: "",
                source: this.fileName,
            };

            switch (type) 
            {
                default: 
                {
                    let value = vocabulary.getLiteralName(type) || vocabulary.getDisplayName(type);
                    info.kind = SymbolKind.Unknown;
                    info.name = value[0] === "'" ? value.substr(1, value.length - 2) : value; // Remove quotes.
                    break;
                }
            }

            result.push(info);
        });

        // let functionNames: string[] = [];
        // let variableNames: string[] = [];
        candidates.rules.forEach((callStack, key) => {
            switch (key) 
            {
                // case FortranParser.RULE_procedureAndFunctionDeclarationPart: 
                //     let functions = this.symbolTable.getSymbolsOfType(SyntaxSymbol);
                //     for (let func of functions)
                //     {
                //         functionNames.push(func.name);
                //     }                        
                //     break;
                // case FortranParser.RULE_identifier: 
                //     let vars = this.symbolTable.getSymbolsOfType(SyntaxSymbol);
                //     for (let vari of vars)
                //     {
                //         variableNames.push(vari.name);
                //     }
                //     let symbols: Symbol[] = [];
                //     for(const symbol of symbols) 
                //     {
                //         const info: SymbolInfo = {
                //             kind: ContextSymbolTable.getKindFromSymbol(symbol),
                //             name: symbol.name,
                //             source: this.fileName,
                //         };

                //         result.push(info);
                //     }
                //     break;
            }
        });

        return result;
    }

    public getSymbolOccurences(column: number, row: number): SymbolInfo[] 
    {
        const symbol = this.symbolAtPosition(column, row);

        if (symbol) 
        {
            return this.symbolTable.getSymbolOccurences(symbol, column, row, false);
        }

        return [];
    }

    public symbolInfoAtPosition(column: number, row: number): SymbolInfo | undefined 
    {
        return this.symbolTable.getSymbolDefinition(this.symbolAtPosition(column, row));
    }

    public symbolAtPosition(column: number, row: number): Symbol | undefined 
    {
        if (this.tree) 
        {
            const context = parseTreeFromPosition(this.tree, column, row);
            // we found a terminal rule, so get its parent to find symbol (because context of symbols is always ParserRule not TerminalNode)
            if (context && context.parent) 
            {
                return this.symbolTable.symbolWithContext(context);
            }
        }

        return undefined;
    }

    private symbolInfoFromToken(kind: SymbolKind, token: Token) 
    {
        const info: SymbolInfo = {
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
}

/**
 * Returns the parse tree which covers the given position or undefined if none could be found.
 */
function parseTreeFromPosition(root: ParseTree, column: number, row: number): ParseTree | undefined 
{
    // Does the root node actually contain the position? If not we don't need to look further.
    if (root instanceof TerminalNode) 
    {
        let terminal = (root as TerminalNode);
        let token = terminal.symbol;

        if (token.line !== row) 
        {
            return undefined;
        }

        let tokenStop = token.charPositionInLine + (token.stopIndex - token.startIndex + 1);

        if (token.charPositionInLine <= column && tokenStop >= column) 
        {
            return terminal;
        }

        return undefined;
    } 
    else 
    {
        let context = (root as ParserRuleContext);

        if (!context.start || !context.stop) 
        { // Invalid tree?
            return undefined;
        }

        if (context.start.line > row || (context.start.line === row && column < context.start.charPositionInLine)) 
        {
            return undefined;
        }

        let tokenStop = context.stop.charPositionInLine + (context.stop.stopIndex - context.stop.startIndex + 1);

        if (context.stop.line < row || (context.stop.line === row && tokenStop < column)) 
        {
            return undefined;
        }

        if (context.children) 
        {
            for (let child of context.children) 
            {
                let result = parseTreeFromPosition(child, column, row);

                if (result) 
                {
                    return result;
                }
            }
        }

        return context;
    }
}
