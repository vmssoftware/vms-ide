import * as path from 'path';
import * as nls from "vscode-nls";

import { Symbol, CodeCompletionCore, ScopedSymbol } from "antlr4-c3";
import { ParseCancellationException, IntervalSet, Interval } from 'antlr4ts/misc';
import { ParseTreeWalker, TerminalNode, ParseTree, ParseTreeListener } from 'antlr4ts/tree';
import { cldParser, CldContentContext } from "./cldParser";
import { cldLexer } from "./cldLexer";
import { ANTLRInputStream, CommonTokenStream, BailErrorStrategy, DefaultErrorStrategy, ParserRuleContext, Token, RuleContext } from 'antlr4ts';
import { DiagnosticEntry, SymbolKind, Definition, SymbolInfo } from './Facade';
import { ContextErrorListener, ContextLexerErrorListener } from './ContextErrorListener';
import { PredictionMode } from 'antlr4ts/atn/PredictionMode';
import { AnalysisListener, findDefineNameForContext} from './AnalysisListener';
import { LogFunction, LogType } from '../common/main';
import { VerbSymbol, TypeSymbol, TypeRefSymbol, SyntaxSymbol, BuiltInTypeSymbol, ParameterSymbol, QualifierSymbol, KeywordSymbol, ContextSymbolTable, LabelSymbol, EntitySymbol, EntityCollection, WithTypeReference } from './ContextSymbolTable';
import { BuiltInValueTypes, symbolDescriptionFromEnum } from './Symbol';
import { DetailsListener } from './DetailsListener';
import { parseTreeFromPosition } from '../common/parser/Helpers';

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export class SourceContext {

    public sourceId: string;
    public diagnostics: DiagnosticEntry[] = [];

    // Grammar parsing infrastructure.
    private tokenStream?: CommonTokenStream;
    private parser?: cldParser;
    private errorListener: ContextErrorListener = new ContextErrorListener(this.diagnostics);
    private lexerErrorListener: ContextLexerErrorListener = new ContextLexerErrorListener(this.diagnostics);
    private analysisDone: boolean = false; // Includes determining reference counts.

    private tree?: CldContentContext; // The root context from the last parse run.
    public logFn: LogFunction;

    public symbolTable: ContextSymbolTable;
    public static globalSymbols = new ContextSymbolTable("Global Symbols", { allowDuplicateSymbols: false });

    constructor(public fileName: string, logFn?: LogFunction) {
        // tslint:disable-next-line:no-empty
        this.logFn = logFn || (() => {});
        this.sourceId = path.basename(fileName, path.extname(fileName));
        this.symbolTable =  new ContextSymbolTable(this.sourceId, { allowDuplicateSymbols: true }, this);

        if (!SourceContext.globalSymbols.resolve("EOF")) {
            SourceContext.globalSymbols.addNewSymbolOfType(Symbol, undefined, "EOF");
            for (const builtintype of BuiltInValueTypes) {
                SourceContext.globalSymbols.addNewSymbolOfType(BuiltInTypeSymbol, undefined, builtintype);
            }
        }
    }

    /**
     * Should be called on every change to keep the input stream up to date particularly for code completion.
     * This call doesn't do any expensive processing (parse() does).
     */
    public setText(source: string) {
        // let input = new ANTLRInputStream(source.toUpperCase()+"\n");  // convert to upper case and add NEWLINE to force end of last line
        let input = new ANTLRInputStream(source + "\n");  // just add NEWLINE to force end of last line
        let lexer = new cldLexer(input);

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
        this.parser = new cldParser(this.tokenStream);
        this.parser.removeErrorListeners();
        this.parser.addErrorListener(this.errorListener);

        this.parser.errorHandler = new BailErrorStrategy();
        this.parser.interpreter.setPredictionMode(PredictionMode.SLL);

        this.tree = undefined;

        this.diagnostics.length = 0;
        this.analysisDone = false;
        this.symbolTable.clear();
        this.symbolTable.addDependencies(SourceContext.globalSymbols);

        try {
            this.tree = this.parser.cldContent();
        } catch (e) {
            if (e instanceof ParseCancellationException) {
                this.tokenStream.seek(0);
                this.parser.reset();
                this.parser.errorHandler = new DefaultErrorStrategy();
                this.parser.interpreter.setPredictionMode(PredictionMode.LL);
                this.tree = this.parser.cldContent();
            } else {
                throw e;
            }
        }

        this.symbolTable.tree = this.tree;
        let listener: DetailsListener = new DetailsListener(this.symbolTable);
        ParseTreeWalker.DEFAULT.walk(listener as ParseTreeListener, this.tree);

        this.runAnalysis();
    }

    public getDiagnostics(): DiagnosticEntry[] {
        this.runAnalysis();

        return this.diagnostics;
    }

    private runAnalysis() {
        if (!this.analysisDone) {
            this.analysisDone = true;
            let listener = new AnalysisListener(this.diagnostics, this.symbolTable, this.logFn);
            ParseTreeWalker.DEFAULT.walk(listener as ParseTreeListener, this.tree!);

            // let index: number;
            // this.logFn(LogType.debug, () => `----- TOKENS -----`);
            // this.tokenStream!.fill();
            // for (index = 0; ; ++index) {
            //     let token = this.tokenStream!.get(index);
            //     if (token.type === Token.EOF) {
            //         break;
            //     }    
            //     this.logFn(LogType.debug, () => `"${String(token.text)}": row=${token.line} col=${token.charPositionInLine} type=${token.type}`);
            // }
    
        }
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
            if (token.type === cldParser.WHITESPACE) {
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
        return index;
    }

    public getCodeCompletionCandidates(column: number, row: number): SymbolInfo[] {
        if (!this.parser || !this.tokenStream) {
            return [];
        }

        let core = new CodeCompletionCore(this.parser);
        core.showResult = false;
        core.ignoredTokens = new Set([
            // cldParser.DEFINE,
            // cldParser.IDENT,
            // cldParser.MODULE,
            // cldParser.SYNTAX,
            // cldParser.TYPE,
            // cldParser.VERB,
            // cldParser.NODISALLOWS,
            // cldParser.DISALLOW,
            // cldParser.IMAGE,
            // cldParser.NOPARAMETERS,
            // cldParser.PARAMETER,
            // cldParser.DEFAULT,
            // cldParser.LABEL,
            // cldParser.PROMPT,
            // cldParser.VALUE,
            // cldParser.NOCONCATENATE,
            // cldParser.CONCATENATE,
            // cldParser.LIST,
            // cldParser.REQUIRED,
            // cldParser.NOQUALIFIERS,
            // cldParser.QUALIFIER,
            // cldParser.BATCH,
            // cldParser.NONNEGATABLE,
            // cldParser.NEGATABLE,
            // cldParser.PLACEMENT,
            // cldParser.GLOBAL,
            // cldParser.LOCAL,
            // cldParser.POSITIONAL,
            // cldParser.ROUTINE,
            // cldParser.KEYWORD,
            // cldParser.SYNONYM,
            // cldParser.ANY2,
            // cldParser.NEG,
            // cldParser.NOT,
            // cldParser.AND,
            // cldParser.OR,
            cldParser.NAME,
            cldParser.COMMA,
            cldParser.EQUAL,
            cldParser.P_OPEN,
            cldParser.P_CLOSE,
            cldParser.A_OPEN,
            cldParser.A_CLOSE,
            cldParser.DOT,
            cldParser.STRING,
            cldParser.WHITESPACE,
            cldParser.NEWLINE,
            cldParser.COMMENT,
            cldParser.EOF,
            -2, // Erroneously inserted. Needs fix in antlr4-c3.
        ]);

        core.preferredRules = new Set([
            cldParser.RULE_anyName
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
        let result: SymbolInfo[] = [];

        let tokens: number[] = [];
        candidates.tokens.forEach((following: number[], type: number) => {
            tokens.push(type);
        });

        // this.logFn(LogType.debug, () => `index: ${index}, candidates: ${tokens.join(',')}`);

        const vocabulary = this.parser.vocabulary;

        candidates.tokens.forEach((following: number[], type: number) => {
            const info: SymbolInfo = {
                kind: SymbolKind.Unknown,
                name: "",
                source: this.fileName,
            };

            switch (type) {
                default: {
                    let value = vocabulary.getLiteralName(type) || vocabulary.getDisplayName(type);
                    info.kind = SymbolKind.Unknown;
                    info.name = value[0] === "'" ? value.substr(1, value.length - 2) : value; // Remove quotes.
                    break;
                }
            }

            result.push(info);
        });

        candidates.rules.forEach((callStack, key) => {
            switch (key) {
                case cldParser.RULE_anyName: {
                    let rule = cldParser.RULE_cldContent;
                    if (callStack.length > 0) {
                        rule = callStack[callStack.length-1];
                    }
                    let symbols: Symbol[] = [];
                    if (rule === cldParser.RULE_keywordSyntax ||
                        rule === cldParser.RULE_qualifierSyntax) {
                        // offer a syntaxes list
                        symbols = this.symbolTable.getSymbolsOfType(SyntaxSymbol);
                        result.length = 0;
                    } else if (rule === cldParser.RULE_keywordValueClauseType ||
                               rule === cldParser.RULE_parameterValueClauseType || 
                               rule === cldParser.RULE_qualifierValueClauseType ) {
                        // offer a types list
                        symbols = this.symbolTable.getSymbolsOfType(TypeSymbol);
                        symbols.push(...this.symbolTable.getAllSymbols(BuiltInTypeSymbol, false));
                        result.length = 0;
                    } else if (rule === cldParser.RULE_entity) {
                        // else find required scope symbols
                        if (this.findTokenScopeSymbols(index, column, symbols)) {
                            result.length = 0;
                        }
                    }
                    for(const symbol of symbols) {
                        const info: SymbolInfo = {
                            kind: ContextSymbolTable.getKindFromSymbol(symbol),
                            name: symbol.name,
                            source: this.fileName,
                        };
                        result.push(info);
                    }
                }
            }
        });

        return result;
    }

    /**
     * Fill symbols and return true, if we need to clear previous results
     * @param index 
     * @param column 
     * @param symbols 
     */
    public findTokenScopeSymbols(index: number, column: number, result: Symbol[]) {
        if (!this.tokenStream) {
            return false;
        }
        let     token = this.tokenStream.get(index);
        let     startColumn = column;
        if (token.type === cldParser.DOT) {
            // in this case we couldn't find DEFINE, so shift left by one symbol
            --startColumn;
        }
        const   line = token.line;
        let     name = "";
        const   nameStack: string[] = [];
        let     definition = "";
        let     stop = false;
        let     retCode = false;
        while (!stop && index > 0 && token.line === line) {
            switch(token.type) {
                case cldParser.A_OPEN:
                    // we only can catch this if we exactly inside the angle brackets
                    result.push(...this.symbolTable.getSymbolsOfType(SyntaxSymbol));
                    result.push(...this.symbolTable.getSymbolsOfType(VerbSymbol));
                    result.push(...this.symbolTable.getSymbolsOfType(TypeSymbol));
                    // and we need to clear any previous predictions
                    return true;
                case cldParser.P_OPEN:
                case cldParser.COMMA:
                case cldParser.WHITESPACE:
                    // save current name
                    if (name.trim()) {
                        nameStack.push(name.toUpperCase());
                    }
                    name = "";
                    // we should start finding in current definition
                    stop = true;
                    break;
                case cldParser.DOT:
                    // always push current name to the stack and continue backward move, despite it is empty
                    nameStack.push(name.toUpperCase());
                    // and we need to clear any previous predictions
                    retCode = true;
                    name = "";
                    break;
                case cldParser.A_CLOSE:
                    // save current name
                    if (name.trim()) {
                        nameStack.push(name.toUpperCase());
                    }
                    name = "";
                    // and we need to clear any previous predictions
                    retCode = true;
                    // find definition scope, no spaces allowed inside entity
                    if (index > 1) {
                        const definitionToken = this.tokenStream.get(index-1);
                        definition = (definitionToken.text?definitionToken.text:"").toUpperCase();
                    }
                    stop = true;
                    break;
                default:
                    name = token.text?token.text:"";
                    break;
            }
            --index;
            token = this.tokenStream.get(index);
        }

        // we have defintion inside angle brackets - use it
        let defSymbol: EntityCollection | undefined = undefined;
        if (definition) {
            defSymbol = this.symbolTable.getSymbolOfType(definition, SymbolKind.Syntax, false) as EntityCollection;
            defSymbol = defSymbol || this.symbolTable.getSymbolOfType(definition, SymbolKind.Verb, false) as EntityCollection;
            defSymbol = defSymbol || this.symbolTable.getSymbolOfType(definition, SymbolKind.Type, false) as EntityCollection;
        }

        if (!defSymbol) {
            // get symbol under cursor
            const context = parseTreeFromPosition(this.tree!, startColumn, line - 1);
            if (context && context.parent) {
                // get its define context name
                const defineCtx: ParserRuleContext | undefined = findDefineNameForContext(context.parent as ParserRuleContext);
                if (defineCtx) {
                    // get define symbol as EntityCollection
                    defSymbol = this.symbolTable.symbolWithContext(defineCtx) as EntityCollection;
                }
            }
        }

        let nameIdx = nameStack.length;
        let allowNestedEntities = true;
        // skip last name, we try to find completion for it
        while (defSymbol && defSymbol.unambigousEntities && nameIdx > 1) {
            --nameIdx;
            let nextDefSymbol: EntityCollection | undefined = undefined;
            const nameTest = nameStack[nameIdx];
            for (const [name, value] of defSymbol.unambigousEntities) {
                if (value && (allowNestedEntities || value.nestedLevel === 0)) {
                    if (name === nameTest) {
                        if (value.entity instanceof EntityCollection) {
                            nextDefSymbol = value.entity;
                        } else if (value.entity instanceof WithTypeReference) {
                            // in case of QUALIFIER, KEYWORD or PARAMETER
                            nextDefSymbol = value.entity.typeReference;
                        } else if (value.entity.parent instanceof WithTypeReference) {
                            // in case of LABEL
                            nextDefSymbol = value.entity.parent.typeReference;
                        }
                        break;
                    }
                }
            }
            allowNestedEntities = false;
            defSymbol = nextDefSymbol;
        }

        if (defSymbol && defSymbol.unambigousEntities) {
            for (const [name, value] of defSymbol.unambigousEntities) {
                if (value && (allowNestedEntities || value.nestedLevel === 0)) {
                    result.push(value.entity);
                }
            }
        }

        return retCode;
    }

    public getSymbolOccurences(column: number, row: number): SymbolInfo[] {
        const symbol = this.symbolAtPosition(column, row);
        if (symbol) {
            return this.symbolTable.getSymbolOccurences(symbol, false);
        }
        return [];
    }

    public symbolInfoAtPosition(column: number, row: number): SymbolInfo | undefined {
        return this.symbolTable.getSymbolInfo(this.symbolAtPosition(column, row));
    }

    public symbolAtPosition(column: number, row: number): Symbol | undefined {
        if (this.tree) {
            const context = parseTreeFromPosition(this.tree, column, row - 1);
            // we found a terminal rule, so get its parent to find symbol (because context of symbols is always ParserRule not TerminalNode)
            if (context && context.parent) {
                return this.symbolTable.symbolWithContext(context.parent);
            }
        }
        return undefined;
    }

    private symbolInfoFromToken(kind: SymbolKind, token: Token) {
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
