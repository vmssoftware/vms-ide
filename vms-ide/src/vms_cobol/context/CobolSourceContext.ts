import * as path from 'path';
import * as nls from "vscode-nls";

import {
    Symbol,
    CodeCompletionCore,
    ScopedSymbol
} from "antlr4-c3";

import {
    ParseCancellationException
} from 'antlr4ts/misc';

import {
    ParseTreeWalker,
    TerminalNode,
    ParseTreeListener,
    ParseTree
} from 'antlr4ts/tree';

import {
    CommonTokenStream,
    BailErrorStrategy,
    DefaultErrorStrategy,
    Token,
    ParserRuleContext,
    CommonToken
} from 'antlr4ts';

import {
    PredictionMode
} from 'antlr4ts/atn/PredictionMode';

import {
    LogFunction,
    LogType
} from '../../common/main';

import {
    IDiagnosticEntry,
    IDefinition,
    ISymbolInfo,
    ISourceContext,
    EDiagnosticType,
    ICompletion
} from '../../common/parser/Facade';

import {
    cobolParser,
    Cobol_sourceContext,
    Identification_divisionContext,
    AuthorContext,
    Word_in_area_BContext,
    ProgramContext,
    InstallationContext,
    Date_writtenContext,
    Date_compiledContext,
    SecurityContext
} from '../parser/cobolParser';

import {
    ParserErrorListener,
    LexerErrorListener
} from '../../common/parser/ErrorListeners';

import {
    CobolInputStream, ICopyManager
} from '../stream/cobolInputStream';

import {
    cobolLexer
} from '../parser/cobolLexer';

import {
    parseTreeFromPosition
} from '../../common/parser/Helpers';


import {
    ProgramSymbol, programDetails, _IntrinsicFunctions, _PredefinedData, IFunction, IPredefinedNode, IntrinsicFunctionSymbol, getSymbolFromKind, IPreDefinition, DataRecordSymbol, EDataUsage, IdentifierSymbol, EGlobalType, symbolDescriptionFromEnum, ECobolSymbolKind, ParagraphSymbol, SectionSymbol, getKindFromSymbol, BOOL_Symbol, SIGN_Symbol, CLASS_Symbol, SpecialNameSymbol, DeviceSymbol,
} from './CobolSymbol';

import {
    CobolSymbolTable
} from './CobolSymbolTable';

import {
    CobolDetailsListener
} from './CobolDetailsListener';
import { CobolAnalisisHelper } from './CobolAnalisisHelpers';
import { CobolAnalysisVisitor } from './CobolAnalysisVisitor';

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export class CobolSourceContext implements ISourceContext {

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

    constructor(public fileName: string, logFn?: LogFunction, public copyManager?: ICopyManager) {
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
        // EOL is OBLIGATORY for correct code completion
        this.input = new CobolInputStream(streamErrorListener, source + "\n", this.compilerConditions, this.copyManager);

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
            this.hideTokensWithPredicate();
            try {
                let listener: CobolDetailsListener = new CobolDetailsListener(this.symbolTable, this.imports);
                ParseTreeWalker.DEFAULT.walk(listener as ParseTreeListener, this.tree);
                this.addPredefinitions(_IntrinsicFunctions, _PredefinedData);
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
    public getCodeCompletionCandidates(column: number, row: number): ICompletion[] {
        if (!this.parser || !this.tokenStream) {
            return [];
        }

        if (this.input) {
            ({resultRow: row, resultCol: column} = this.input.resultRowColFromSourceRowCol(row, column));
        }
        
        let core = new CodeCompletionCore(this.parser);
        core.showResult = false;
        core.ignoredTokens = new Set([
            // add ignored tokens
            cobolLexer.STRING_LITERAL_,
            cobolLexer.SWITCH_N_,
            cobolLexer.PSEUDO_TEXT_,
            cobolLexer.EXCLAM_,
            cobolLexer.UNDER_,
            cobolLexer.PLUS_,
            cobolLexer.MINUS_,
            cobolLexer.STAR_,
            cobolLexer.SLASH_,
            cobolLexer.COLON_,
            cobolLexer.EQUAL_,
            cobolLexer.LT_,
            cobolLexer.LE_,
            cobolLexer.GE_,
            cobolLexer.GT_,
            cobolLexer.LPAREN_,
            cobolLexer.RPAREN_,
            cobolLexer.LBRACK_,
            cobolLexer.RBRACK_,
            cobolLexer.POINTER_,
            cobolLexer.ATP_,
            cobolLexer.DOT_,
            cobolLexer.LCURLY_,
            cobolLexer.RCURLY_,
            cobolLexer.NUMERIC_LITERAL_,
            cobolLexer.HEX_LITERAL_,
            // cobolLexer.USER_DEFINED_WORD_,
            cobolLexer.COMMA_,
            cobolLexer.SEMI_,
            cobolLexer.WHITESPACE_,
            cobolLexer.NEWLINE_,
            cobolLexer.ANY_CHAR_,
            cobolLexer.SYMBOL_IN_PICTURE_,
            cobolLexer.IS_IN_PICTURE_,
            cobolLexer.CHARACTER_STRING_,
            Token.EOF,
            -2, // Erroneously inserted. Needs fix in antlr4-c3.
        ]);

        core.preferredRules = new Set([
        //add preferred rules
            cobolParser.RULE_function_name,
            cobolParser.RULE_proc_name,
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
        let resultMap = new Map<string, Set<string>>();

        candidates.rules.forEach((callStack, key) => {
            switch(key) {
                case cobolParser.RULE_function_name:
                    _IntrinsicFunctions.forEach(x => {
                        if (x.name) {
                            resultMap.set(x.name, new Set([symbolDescriptionFromEnum(ECobolSymbolKind.IntrinsicFunction)]));
                        }
                    })
                    break;
                case cobolParser.RULE_proc_name:
                    this.symbolTable.occurance.forEach( (value, key) => {
                        for(let link of value) {
                            // only paragraph or section
                            if (link.master instanceof ParagraphSymbol ||
                                link.master instanceof SectionSymbol) {
                                resultMap.set(key, new Set([symbolDescriptionFromEnum(getKindFromSymbol(link.master))]));
                                break;
                            }
                        };
                    })
                    break;
            }
        });

        if (resultMap.size === 0) {
            const vocabulary = this.parser.vocabulary;
            candidates.tokens.forEach((following: number[], type: number) => {
                switch(type) {
                    case cobolParser.USER_DEFINED_WORD_:
                        this.symbolTable.occurance.forEach((value, key) => {
                            if (value.length > 0) {
                                let add = false;
                                for(let link of value) {
                                    if (link.master instanceof DataRecordSymbol ||
                                        (link.master instanceof SpecialNameSymbol && !(link.master instanceof CLASS_Symbol)) ||
                                        link.master instanceof DeviceSymbol ) {
                                        add = true;
                                        break;
                                    }
                                };
                                if (add) {
                                    let entry = resultMap.get(key);
                                    if (!entry) {
                                        entry = new Set();
                                        resultMap.set(key, entry);
                                    }
                                    value.forEach(link => entry!.add(symbolDescriptionFromEnum(getKindFromSymbol(link.master))));
                                }
                            }
                        })
                        break;
                    default:
                        let key = vocabulary.getLiteralName(type);
                        if (!key) {
                            key = vocabulary.getDisplayName(type);
                            // only token wich doesn't end with underscore can be present as its name
                            if (!key.endsWith("_")) {
                                key = key.replace(/_/g, "-");
                            } else {
                                key = undefined;
                            }
                        } else if (key.length > 2){
                            // remove quotas
                            if ("'\"".includes(key[0])) {
                                key = key.substr(1, key.length - 2);
                            }
                        }
                        if (key) {
                            let entry = resultMap.get(key);
                            if (!entry) {
                                entry = new Set();
                                resultMap.set(key, entry);
                            }
                            entry!.add("token");
                        }
                        break;
                }
            });
        }
        let result: ICompletion[] = [];
        for(let [key, set] of resultMap) {
            result.push({
                candidate: key,
                description: [...set].join(" | "),
            });
        }
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
            ({resultRow: row, resultCol: column} = input.resultRowColFromSourceRowCol(row, column));
            let master = this.masterSymbolAtPosition(column, row);
            if (master) {
                return this.symbolTable.getSymbolOccurences(master).map(x => {
                    ({sourceRow: x.range.start.row, sourceCol: x.range.start.column} = input.sourceRowColFromResultRowCol(x.range.start.row, x.range.start.column));
                    ({sourceRow: x.range.end.row, sourceCol: x.range.end.column} = input.sourceRowColFromResultRowCol(x.range.end.row, x.range.end.column));
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
    public symbolInfoAtPosition(column: number, row: number): ISymbolInfo | undefined {
        let info: ISymbolInfo | undefined;
        if (this.input) {
            ({resultRow: row, resultCol: column} = this.input.resultRowColFromSourceRowCol(row, column));
            let masterSymbol = this.masterSymbolAtPosition(column, row);
            info = this.symbolTable.getSymbolInfo(masterSymbol);
            if (info && info.definition) {
                ({sourceRow: info.definition.range.start.row, sourceCol: info.definition.range.start.column} = this.input.sourceRowColFromResultRowCol(info.definition.range.start.row, info.definition.range.start.column));
                ({sourceRow: info.definition.range.end.row, sourceCol: info.definition.range.end.column} = this.input.sourceRowColFromResultRowCol(info.definition.range.end.row, info.definition.range.end.column));
            }
            if (info && masterSymbol instanceof ProgramSymbol) {
                let details = programDetails(masterSymbol);
                if (details) {
                    info.description = details;
                }
            }
        }
        return info;
    }

    //________________________________________________________________________________

    private hideTokensWithPredicate() {
        if (!this.tree || !this.tokenStream) {
            return -1;
        }
        let nodes: ParseTree[] = [this.tree];
        while(nodes.length) {
            let node = nodes.pop();
            if (node instanceof ParserRuleContext && node.children) {
                if (node instanceof Cobol_sourceContext ||
                    node instanceof ProgramContext ||
                    node instanceof Identification_divisionContext ||
                    node instanceof InstallationContext ||
                    node instanceof Date_writtenContext ||
                    node instanceof Date_compiledContext ||
                    node instanceof SecurityContext ||
                    node instanceof AuthorContext) {
                    nodes.push(...node.children!);
                }
                if (node instanceof Word_in_area_BContext) {
                    for(let t of node.children!) {
                        if (t instanceof TerminalNode && t.symbol instanceof CommonToken) {
                            let symbol = t.symbol as CommonToken;
                            symbol.channel = 1;
                        }
                    }
                }
            }
        }
    }

    /**
     * Zero-based
     * @param row 
     * @param column 
     */
    private getTokenIndexByPosition(row: number, column: number) {
        if (!this.tokenStream) {
            return -1;
        }
        // Search the token index which covers our caret position.
        let index: number;
        this.tokenStream.fill();
        for (index = 0; ; ++index) {
            let token = this.tokenStream.get(index);
            if (token.type === Token.EOF || token.line > row + 1) {
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
                ({sourceRow: d.range.start.row, sourceCol: d.range.start.column} = this.input.sourceRowColFromResultRowCol(d.range.start.row - 1, d.range.start.column));
                ({sourceRow: d.range.end.row, sourceCol: d.range.end.column} = this.input.sourceRowColFromResultRowCol(d.range.end.row - 1, d.range.end.column));
            }
        }
    }

    private runAnalysis() {
        if (!this.analysisDone && this.tree) {
            let helper = new CobolAnalisisHelper(this.diagnostics, this.symbolTable);
            let visitor = new CobolAnalysisVisitor(helper);
            this.tree.accept(visitor);
            //let listener = new CobolAnalysisListener(helper);
            //ParseTreeWalker.DEFAULT.walk(listener as ParseTreeListener, this.tree!);
            this.analysisDone = true;
        }
    }

    private addPredefinitions(intrincisFunctions: IFunction[], predefinedData: IPredefinedNode[]) {
        for (let intrincisFunction of intrincisFunctions) {
            let symbolToAdd = this.symbolTable.addNewSymbolOfType(IntrinsicFunctionSymbol, this.symbolTable, intrincisFunction.name);
            symbolToAdd.functionDefinition = intrincisFunction;
            symbolToAdd.isGlobal = true;
            this.symbolTable.createOccurance(symbolToAdd);
        }
        for (let predefinedNode of predefinedData) {
            // by default, add new symbols into symbolTable root
            let symbols: Symbol[] = [this.symbolTable];
            if (predefinedNode.parentKind) {
                let symbolType = getSymbolFromKind(predefinedNode.parentKind);
                symbols = this.symbolTable.getNestedSymbolsOfType(symbolType);
            }
            for (let symbol of symbols) {
                if (symbol instanceof ScopedSymbol) {
                    for (let predefinition of predefinedNode.predefinitions) {
                        create(symbol, predefinition, this.symbolTable);
                    }
                }
            }
        }

        function create(parentSymbol: ScopedSymbol, predefinition: IPreDefinition, symbolTable: CobolSymbolTable, forceGlobal?: boolean) {
            let symbolToAdd = symbolTable.addNewSymbolOfType(predefinition.type, parentSymbol, predefinition.name);
            if (symbolToAdd instanceof DataRecordSymbol) {
                symbolToAdd.level = 1;
                symbolToAdd.picture = predefinition.picture?predefinition.picture:"X";
                symbolToAdd.usage = predefinition.usage? predefinition.usage : EDataUsage.DISPLAY;
                symbolToAdd.requireQualification = predefinition.requireQualification;
            }
            if (symbolToAdd instanceof IdentifierSymbol) {
                if (forceGlobal) {
                    symbolToAdd.isGlobal = true;
                } else {
                    switch(predefinition.global) {
                        case EGlobalType.alwaysTrue:
                            symbolToAdd.isGlobal = true;
                            break;
                        case EGlobalType.alwaysFalse:
                            symbolToAdd.isGlobal = false;
                            break;
                        case EGlobalType.fromParent:
                            if (parentSymbol instanceof IdentifierSymbol) {
                                symbolToAdd.isGlobal = parentSymbol.isGlobal;
                            }
                            break;
                        default:
                            symbolToAdd.isGlobal = true;
                    }
                }
            }
            symbolTable.createOccurance(symbolToAdd);
        }
    }

}
