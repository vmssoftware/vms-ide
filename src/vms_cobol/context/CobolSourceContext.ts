import * as nls from "vscode-nls";

import {
    BaseSymbol,
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
    ICompletion,
    ILexicalRange,
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
    CobolInputStream,
    ICopyManager,
    IInsideReplacing,
} from '../stream/cobolInputStream';

import {
    cobolLexer
} from '../parser/cobolLexer';

import {
    parseTreeFromPosition, unifyCobolName, firstContainingContext
} from '../../common/parser/helpers';


import {
    CLASS_Symbol,
    DataRecordSymbol,
    DeviceSymbol,
    ECobolSymbolKind,
    EDataUsage,
    EGlobalType,
    IFunction,
    IPreDefinition,
    IPredefinedNode,
    IdentifierSymbol,
    IntrinsicFunctionSymbol,
    ParagraphSymbol,
    ProgramSymbol,
    SectionSymbol,
    SpecialNameSymbol,
    _IntrinsicFunctions,
    _PredefinedData,
    getKindFromSymbol,
    getSymbolFromKind,
    functionDetails,
    symbolDescriptionFromEnum,
    programDetails,
} from './CobolSymbol';

import {
    CobolSymbolTable
} from './CobolSymbolTable';

import {
    CobolDetailsListener
} from './CobolDetailsListener';
import { CobolAnalisisHelper } from './CobolAnalisisHelpers';
import { CobolAnalysisVisitor } from './CobolAnalysisVisitor';
import { TaskDivider } from '../../common/task-divider';
import { cobolParserImpl } from '../parser/cobolParserImpl';
import { CobolGlobals } from './CobolGlobals';

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export class CobolSourceContext implements ISourceContext {

    private sourceContent?: string;
    private isRequireReparse: boolean;
    //private sourceId: string;
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

    private cancellationToken = new TaskDivider(0);

    private tree?: Cobol_sourceContext;     // The root context from the last parse run.
    public logFn: LogFunction;

    constructor(public fileName: string, logFn?: LogFunction, public copyManager?: ICopyManager, public topCancellationToken?: TaskDivider<number>) {
        // tslint:disable-next-line:no-empty
        this.logFn = logFn || (() => {});
        this.isRequireReparse = true;
        //this.sourceId = path.basename(fileName, path.extname(fileName));
        this.symbolTable =  new CobolSymbolTable(this.fileName, { allowDuplicateSymbols: true }, this);
    }

    get requireReparse() {
        return this.isRequireReparse;
    }

    set requireReparse(value: boolean) {
        this.isRequireReparse = value;
    }

    public getSymbolTable() {
        return this.symbolTable;
    }

    /**
     * Should be called on every change to keep the input stream up to date particularly for code completion.
     * This call doesn't do any expensive processing (parse() does).
     */
    public setText(source: string) {
        this.cancelParsing();
        this.sourceContent = source + "\n";
        this.requireReparse = true;
    }

    public cancelParsing() {
        ++this.cancellationToken.asyncValue;
    }

    public async parse() {

        if (!this.sourceContent) {
            return false;
        }

        let streamErrorListener = {
            syntaxError: (file: string, line: number, charPositionInLine: number, message: string): void => {
                this.streamErrors.push({
                    source: file,
                    message,
                    type: EDiagnosticType.Error,
                    range: {
                        start: {
                            row: line,
                            col: charPositionInLine,
                        },
                        end: {
                            row: line,
                            col: charPositionInLine,
                        }
                    }
                });
            }
        }
        
        // increment only local token, do not touch top token, but pass it if it exists
        ++this.cancellationToken.asyncValue;
        
        this.streamErrors.length = 0;
        // EOL is OBLIGATORY for correct code completion
        this.input = new CobolInputStream(
                this.fileName,
                streamErrorListener,
                this.sourceContent,
                this.compilerConditions,
                this.copyManager,
                this.topCancellationToken ? this.topCancellationToken : this.cancellationToken);
        let built = await this.input.buildInput();
        if (!built) {
            return false;
        }

        if (this.streamErrors.length === 0) {
            let lexer = new cobolLexer(this.input);
            // There won't be lexer errors actually. They are silently bubbled up and will cause parser errors.
            lexer.removeErrorListeners();
            lexer.addErrorListener(this.lexerErrorListener);
            this.tokenStream = new CommonTokenStream(lexer);
        } else {
            this.tokenStream = undefined;
        }

        if (!this.tokenStream) {
            return false;
        }

        // Rewind the input stream for a new parse run.
        // Might be unnecessary when we just created that via setText.
        this.tokenStream.seek(0);
        let parserImpl = new cobolParserImpl(this.tokenStream, this.topCancellationToken ? this.topCancellationToken : this.cancellationToken);
        this.parser = parserImpl;
        this.parser.removeErrorListeners();
        this.parser.addErrorListener(this.parserErrorListener);

        this.parser.errorHandler = new BailErrorStrategy();
        this.parser.interpreter.setPredictionMode(PredictionMode.SLL);

        this.tree = undefined;

        this.diagnostics.length = 0;
        this.analysisDone = false;

        try {
            this.tree = await this.parser.cobol_source();
        } catch (e) {
            if (e instanceof ParseCancellationException) {
                this.diagnostics.length = 0;
                this.tokenStream.seek(0);
                this.parser.reset();
                this.parser.errorHandler = new DefaultErrorStrategy();
                this.parser.interpreter.setPredictionMode(PredictionMode.LL);
                this.tree = await this.parser.cobol_source();
            } else {
                return false;
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

        this.requireReparse = false;

        this.updateDiagnosticRanges();

        return true;
    }

    public getDiagnostics(): IDiagnosticEntry[] {
        let ret: IDiagnosticEntry[] = [];
        if (this.streamErrors.length > 0) {
            ret.push(...this.streamErrors);
        } else {
            try {
                //this.runAnalysis();
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
            let inside: IInsideReplacing[] = [];
            ({resultRow: row, resultCol: column, inside} = this.input.resultRowColFromSourceRowCol(row, column));
            if (inside.length > 0) {
                // no candidates inside replacing
                return [];
            }
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
            cobolParser.RULE_prog_name,
            cobolParser.RULE_program_name
        ]);

        // Search the token index which covers our caret position.
        let currentToken = this.getTokenByPosition(row, column);
        if (!currentToken) {
            return [];
        }
        let currentParseTree = parseTreeFromPosition(this.tree, column, row, this.tokenStream);
        if (!currentParseTree) {
            return [];
        }

        //core.showDebugOutput = true;
        //core.showResult = true;
        //core.showRuleStack = true;
        //core.debugOutputWithTransitions = true;

        let candidates = core.collectCandidates(currentToken.tokenIndex);
        let resultMap = new Map<string, Set<string>>();

        for(let [key, callStack] of candidates.rules) {
            switch(key) {
                case cobolParser.RULE_function_name:
                    _IntrinsicFunctions.forEach(x => {
                        if (x.name) {
                            resultMap.set(x.name, new Set([symbolDescriptionFromEnum(ECobolSymbolKind.IntrinsicFunction)]));
                        }
                    })
                    break;
                case cobolParser.RULE_proc_name:
                    let currentProgramSymbol = this.enclosingProgramSymbol(currentParseTree);
                    for(let [key, value] of this.symbolTable.occurence) {
                        for(let link of value) {
                            // only paragraph or section in the current program
                            if ((link.master instanceof ParagraphSymbol && 
                                    (link.master.parent === currentProgramSymbol || (link.master.parent && link.master.parent.parent === currentProgramSymbol))) ||
                                (link.master instanceof SectionSymbol && link.master.parent === currentProgramSymbol)) {
                                resultMap.set(key, new Set([symbolDescriptionFromEnum(getKindFromSymbol(link.master))]));
                                break;
                            }
                        };
                    }
                    break;
                case cobolParser.RULE_program_name:
                    if (callStack.ruleList.length > 0) {
                        switch (callStack.ruleList[callStack.ruleList.length - 1]) {
                            case cobolParser.RULE_end_program:
                                let currentProgramSymbol = this.enclosingProgramSymbol(currentParseTree);
                                if (currentProgramSymbol) {
                                    resultMap.set(currentProgramSymbol.name, new Set([symbolDescriptionFromEnum(getKindFromSymbol(currentProgramSymbol))]));
                                }
                                break;
                        }
                    }
                    break;
                case cobolParser.RULE_prog_name:
                    if (callStack.ruleList.length > 0) {
                        switch (callStack.ruleList[callStack.ruleList.length - 1]) {
                            case cobolParser.RULE_cancel_statement:
                            case cobolParser.RULE_call_statement:
                                let symbols = this.symbolTable.resolveIdentifier(["*"], currentParseTree);
                                symbols.filter(x => x instanceof ProgramSymbol).forEach((x) => {
                                    resultMap.set(`"${x.name}"`, new Set([symbolDescriptionFromEnum(getKindFromSymbol(x))]));
                                })
                                break;
                        }
                    }
                    break;
            }
        }

        if (resultMap.size === 0) {
            const vocabulary = this.parser.vocabulary;
            for (let [type, following] of  candidates.tokens) {
                switch(type) {
                    case cobolParser.USER_DEFINED_WORD_:
                        for (let [key, value] of this.symbolTable.occurence) {
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
                        }
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
            }
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
    public getOccurencesUnderCursor(column: number, row: number): IDefinition[] {
        let retDef: IDefinition[] = [];
        if (this.input) {
            let input = this.input;
            ({resultRow: row, resultCol: column} = input.resultRowColFromSourceRowCol(row, column));
            let master = this.masterSymbolAtPosition(column, row);
            if (master) {
                
                // add global master
                if (master.symbolTable !== this.symbolTable) {
                    let globalDef = CobolGlobals.definition(master);
                    if (globalDef) {
                        retDef.push(...globalDef);
                    }
                }

                // add globals links
                let globalUsing = CobolGlobals.links(master);
                for(let globalDef of globalUsing) {
                    if (globalDef.source !== this.fileName) {
                        retDef.push(globalDef);
                    }
                }

                // add globals externals
                let globalExterns = CobolGlobals.externals(master.name);
                for(let externDef of globalExterns) {
                    if (externDef.source !== this.fileName) {
                        retDef.push(externDef);
                    }
                }

                // add local occurences
                for (let occ of this.symbolTable.getSymbolOccurences(master)) {
                    if (occ.range) {
                        let srcPos = this.sourceRangeFromResult(occ.range);
                        retDef.push({
                            range: srcPos.range,
                            source: srcPos.source,
                            text: occ.text,
                            quotas: occ.quotas,
                        });
                    } else {
                        retDef.push(occ);
                    }
                }
            }
        }
        return retDef;
    }

    /**
     * Zero-based
     * @param column 
     * @param row 
     */
    public symbolInfoAtPosition(column: number, row: number): ISymbolInfo | undefined {
        let info: ISymbolInfo | undefined;
        if (this.input) {
            let inResult = this.input.resultRowColFromSourceRowCol(row, column);
            for (let insideResult of inResult.inside) {
                if (insideResult.replacing.name && insideResult.replacing.path) {
                    info = {
                        kindString: "COPY",
                        description: "include content",
                        definition: {
                            source: insideResult.replacing.path
                        }
                    };
                    return info;
                }
            }
            let masterSymbol = this.masterSymbolAtPosition(inResult.resultCol, inResult.resultRow);
            info = this.symbolTable.getSymbolInfo(masterSymbol);
            if (info) {
                if (info.definition && info.definition.range && info.definition.source === this.fileName) {
                    let sourceRange = this.sourceRangeFromResult(info.definition.range);
                    info.definition.range = sourceRange.range;
                    info.definition.source = sourceRange.source;
                }
            }
        }
        return info;
    }

    public sourceRangeFromResult(sourceRange: ILexicalRange): IDefinition {
        let result: IDefinition = {
            range: sourceRange,
            source: this.fileName,
        };
        if (this.input && result.range) {
            let srcStartPos = this.input.sourceRowColFromResultRowCol(sourceRange.start.row, sourceRange.start.col);
            let srcEndPos = this.input.sourceRowColFromResultRowCol(sourceRange.end.row, sourceRange.end.col);
            result.range.start.row = srcStartPos.sourceRow;
            result.range.start.col = srcStartPos.sourceCol;
            result.range.end.row = srcEndPos.sourceRow;
            result.range.end.col = srcEndPos.sourceCol;
            if (srcStartPos.inside.length > 0) {
                let idx = srcStartPos.inside.length - 1;
                while (idx >= 0) {
                    let srcStartInside = srcStartPos.inside[idx];
                    if (srcStartInside.replacing.name && srcStartInside.replacing.path) {
                        result.source = srcStartInside.replacing.path;
                        result.range.start.row = srcStartInside.row;
                        result.range.start.col = srcStartInside.col;
                        result.range.end.row = srcStartInside.row;
                        result.range.end.col = srcStartInside.col;
                        for(let srcEndInside of srcEndPos.inside) {
                            if (srcEndInside.replacing.name === srcStartInside.replacing.name) {
                                result.range.end.row = srcEndInside.row;
                                result.range.end.col = srcEndInside.col;
                                break;
                            }
                        }
                        break;
                    }
                    --idx;
                }
            }
        }
        return result;
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
    private getTokenByPosition(row: number, column: number) {
        let token: Token | undefined;
        if (!this.tokenStream) {
            return token;
        }
        // Search the token index which covers our caret position.
        let index: number;
        this.tokenStream.fill();
        for (index = 0; ; ++index) {
            token = this.tokenStream.get(index);
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
        return token;
    }

    /**
     * Zero-based
     * @param column 
     * @param row 
     */
    private masterSymbolAtPosition(column: number, row: number): BaseSymbol | undefined {
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
            for(const diag of this.diagnostics) {
                --diag.range.start.row;
                --diag.range.end.row;
                let sourceRange = this.sourceRangeFromResult(diag.range);
                diag.source = sourceRange.source;
                if (sourceRange.range) {
                    diag.range = sourceRange.range;
                }
            }
        }
    }

    private runAnalysis() {
        if (!this.analysisDone && this.tree) {
            let helper = new CobolAnalisisHelper(this.diagnostics, this.symbolTable);
            let visitor = new CobolAnalysisVisitor(helper);
            this.tree.accept(visitor);
            this.analysisDone = true;
        }
    }

    private addPredefinitions(intrincisFunctions: IFunction[], predefinedData: IPredefinedNode[]) {
        for (let intrincisFunction of intrincisFunctions) {
            let symbolToAdd = this.symbolTable.addNewSymbolOfType(IntrinsicFunctionSymbol, this.symbolTable, unifyCobolName(intrincisFunction.name));
            symbolToAdd.functionDefinition = intrincisFunction;
            symbolToAdd.isGlobal = true;
            this.symbolTable.createOccurence(symbolToAdd);
        }
        for (let predefinedNode of predefinedData) {
            // by default, add new symbols into symbolTable root
            let symbols: BaseSymbol[] = [this.symbolTable];
            if (predefinedNode.parentKind) {
                let symbolType = getSymbolFromKind(predefinedNode.parentKind);
                symbols = this.symbolTable.getNestedSymbolsOfTypeSync(symbolType);
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
            let symbolToAdd = symbolTable.addNewSymbolOfType(predefinition.type, parentSymbol, unifyCobolName(predefinition.name));
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
            symbolTable.createOccurence(symbolToAdd);
        }
    }

    /**
     * 
     * @param tree 
     */
    private enclosingProgramSymbol(tree: ParseTree): ProgramSymbol | undefined {
        let ctx = firstContainingContext(tree, ProgramContext);
        if (ctx) {
            let symbol = this.symbolTable.symbolWithContext(ctx);
            if (symbol instanceof ProgramSymbol) {
                return symbol;
            }
        }
        return undefined;
    }
}
