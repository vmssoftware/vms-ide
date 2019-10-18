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
    ParseTreeListener
} from 'antlr4ts/tree';

import {
    CommonTokenStream,
    BailErrorStrategy,
    DefaultErrorStrategy,
    Token
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
    Cobol_sourceContext
} from '../parser/cobolParser';

import {
    ParserErrorListener,
    LexerErrorListener
} from '../../common/parser/ErrorListeners';

import {
    CobolInputStream
} from '../stream/cobolInputStream';

import {
    cobolLexer
} from '../parser/cobolLexer';

import {
    parseTreeFromPosition
} from '../../common/parser/Helpers';


import {
    ProgramSymbol, programDetails, _IntrincisFunctions, _PredefinedData, IFunction, IPredefinedNode, IntrincisFunctionSymbol, getSymbolFromKind, IPreDefinition, DataRecordSymbol, EDataUsage, IdentifierSymbol, EGlobalType,
} from './CobolSymbol';

import {
    CobolSymbolTable
} from './CobolSymbolTable';

import {
    CobolDetailsListener
} from './CobolDetailsListener';
import { CobolAnalisisHelper } from './CobolAnalisisHelpers';
import { CobolAnalysisVisitor } from './CobolAnalysisVisitor';
import { _RuleTokensMap } from './RuleCompletion';

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
        this.input = new CobolInputStream(streamErrorListener, source + "\n", this.compilerConditions);

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
            if (this.streamErrors.length ===0 && this.diagnostics.length === 0) {
                try {
                    let listener: CobolDetailsListener = new CobolDetailsListener(this.symbolTable, this.imports);
                    ParseTreeWalker.DEFAULT.walk(listener as ParseTreeListener, this.tree);
                    this.addPredefinitions(_IntrincisFunctions, _PredefinedData);
                    this.runAnalysis();
                } catch(e) {
                    this.logFn(LogType.debug, () => String(e));
                }
            } else {
                this.analysisDone = true;
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
            ({line: row, charPositionInLine: column} = this.input.getFilteredPosition(row, column));
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
            cobolLexer.USER_DEFINED_WORD_,
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
            // cobolParser.RULE_cobol_source,
            // cobolParser.RULE_program_id,
            // cobolParser.RULE_author,
            // cobolParser.RULE_end_program,
            // cobolParser.RULE_procedure_division,
            // cobolParser.RULE_procedure_division_header,
            // cobolParser.RULE_data_division,
            // cobolParser.RULE_environment_division,
            // cobolParser.RULE_identification_division,
            // cobolParser.RULE_program_id,
            // cobolParser.RULE_program_name,
            // cobolParser.RULE_common_initial,
            // cobolParser.RULE_with_ident,
            // cobolParser.RULE_ident_string,
            // cobolParser.RULE_installation,
            // cobolParser.RULE_date_written,
            // cobolParser.RULE_date_compiled,
            // cobolParser.RULE_security,
            // cobolParser.RULE_options_,
            // cobolParser.RULE_arithmetic,
            // cobolParser.RULE_configuration_section,
            // cobolParser.RULE_input_output_section,
            // cobolParser.RULE_source_computer,
            // cobolParser.RULE_computer_type,
            // cobolParser.RULE_with_debugging,
            // cobolParser.RULE_object_computer,
            // cobolParser.RULE_memory_size,
            // cobolParser.RULE_memory_size_amount,
            // cobolParser.RULE_memory_size_unit,
            // cobolParser.RULE_program_collating,
            // cobolParser.RULE_alpha_name,
            // cobolParser.RULE_segment_limit,
            // cobolParser.RULE_segment_number,
            // cobolParser.RULE_special_names,
            // cobolParser.RULE_special_names_content,
            // cobolParser.RULE_cursor_is,
            // cobolParser.RULE_crt_is,
            // cobolParser.RULE_predefined_name_relation,
            // cobolParser.RULE_predefined_name,
            // cobolParser.RULE_switch_definition,
            // cobolParser.RULE_switch_clause_on,
            // cobolParser.RULE_switch_clause_off,
            // cobolParser.RULE_cond_name,
            // cobolParser.RULE_switch_name,
            // cobolParser.RULE_switch_num,
            // cobolParser.RULE_qualified_data_item,
            // cobolParser.RULE_currency,
            // cobolParser.RULE_currency_definition,
            // cobolParser.RULE_currency_string,
            // cobolParser.RULE_currency_char,
            // cobolParser.RULE_class_,
            // cobolParser.RULE_class_name,
            // cobolParser.RULE_user_class,
            // cobolParser.RULE_symbolic_chars,
            // cobolParser.RULE_symb_ch_definition,
            // cobolParser.RULE_symb_ch_def_clause,
            // cobolParser.RULE_symb_ch_def_in_alphabet,
            // cobolParser.RULE_symbol_char,
            // cobolParser.RULE_char_val,
            // cobolParser.RULE_alphabet,
            // cobolParser.RULE_alpha_value,
            // cobolParser.RULE_user_alpha,
            // cobolParser.RULE_first_literal,
            // cobolParser.RULE_last_literal,
            // cobolParser.RULE_same_literal,
            // cobolParser.RULE_top_of_page_name,
            // cobolParser.RULE_program,
            // cobolParser.RULE_word_in_area_A,
            // cobolParser.RULE_word_in_area_B,
            // cobolParser.RULE_figurative_constant_witout_all_zero,
            // cobolParser.RULE_figurative_constant_zero,
            // cobolParser.RULE_figurative_constant_witout_all,
            // cobolParser.RULE_figurative_constant_witout_zero,
            // cobolParser.RULE_figurative_constant,
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
        let result: ICompletion[] = [];

        const vocabulary = this.parser.vocabulary;

        let addTokenType = new Set<number>();
        candidates.tokens.forEach((following: number[], type: number) => {
            addTokenType.add(type);
            following.forEach(type => addTokenType.add(type));
        });

        let addStringValue = new Set<string>();
        candidates.rules.forEach((callStack, key) => {
            let rule = _RuleTokensMap.get(key);
            if (rule) {
                rule.forEach(value => {
                    if (typeof value === "string") {
                        addStringValue.add(value);
                    } else {
                        addTokenType.add(value);
                    }
                })
            }
        });

        addTokenType.forEach(type => {
            let value = vocabulary.getLiteralName(type);
            if (!value) {
                value = vocabulary.getDisplayName(type);
                // only token wich doesn't end with underscore can be present as its name
                if (!value.endsWith("_")) {
                    value = value.replace(/_/g, "-");
                } else {
                    value = undefined;
                }
            } else if (value.length > 2){
                // remove quotas
                if ("'\"".includes(value[0])) {
                    value = value.substr(1, value.length - 2);
                }
            }
            if (value) {
                addStringValue.add(value);
            }
        });

        addStringValue.forEach(value => {
            let info: ICompletion = {
                candidate: value,
                // description: "token",
            };
            result.push(info);
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
    public symbolInfoAtPosition(column: number, row: number): ISymbolInfo | undefined {
        let info: ISymbolInfo | undefined;
        if (this.input) {
            ({line: row, charPositionInLine: column} = this.input.getFilteredPosition(row, column));
            let masterSymbol = this.masterSymbolAtPosition(column, row);
            info = this.symbolTable.getSymbolInfo(masterSymbol);
            if (info && info.definition) {
                ({line: info.definition.range.start.row, charPositionInLine: info.definition.range.start.column} = this.input.getRealPosition(info.definition.range.start.row, info.definition.range.start.column));
                ({line: info.definition.range.end.row, charPositionInLine: info.definition.range.end.column} = this.input.getRealPosition(info.definition.range.end.row, info.definition.range.end.column));
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
                ({line: d.range.start.row, charPositionInLine: d.range.start.column} = this.input.getRealPosition(d.range.start.row - 1, d.range.start.column));
                ({line: d.range.end.row, charPositionInLine: d.range.end.column} = this.input.getRealPosition(d.range.end.row - 1, d.range.end.column));
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
            let symbolToAdd = this.symbolTable.addNewSymbolOfType(IntrincisFunctionSymbol, this.symbolTable, intrincisFunction.name);
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
