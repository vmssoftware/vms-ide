
import { LogFunction } from '../main';

/**
 * A range within a text. Just like the range object in vscode the end position is not included in the range.
 * Hence when start and end position are equal the range is empty.
 */
export interface ILexicalRange {
    start: { row: number, col: number };
    end: { row: number, col: number };
}

// The definition of a single symbol (range and content it is made of).
export interface IDefinition {
    source: string,
    text?: string;
    range?: ILexicalRange;
    quotas?: string;    // starting text in source. it will be just `"` or `N"`. last symbol in text is the same as last symbol in quotas.
}

export interface ISymbolInfo {
    definition?: IDefinition;   // Place where symbol is defined, not where it is used
    kindString: string;         // Provides a small description for symbol kind
    description: string;        // Full path to the symbol (and type of arguments if it is a program or function)
}

export interface ICompletion {
    candidate: string;
    description?: string;
}

export enum EDiagnosticType {
    Hint,
    Info,
    Warning,
    Error
}

export interface IDiagnosticEntry {
    type: EDiagnosticType;
    message: string;
    range: ILexicalRange;
    source?: string;
}

export interface ISourceContext {
    /**
     * True if this context requires reparsing
     */
    requireReparse: boolean;
    /**
     * Zero-based
     * @param column 
     * @param row 
     */
    getCodeCompletionCandidates(column: number, row: number): ICompletion[];
    /**
     * Get diagnostics from last parsing
     */
    getDiagnostics(): IDiagnosticEntry[];
    /**
     * Zero-based
     * @param column 
     * @param row 
     */
    getOccurencesUnderCursor(column: number, row: number): IDefinition[];
    /**
     * Do background asynchronous parsing
     */
    parse(): Promise<boolean>;
    /**
     * Cancel background asynchronous parsing
     */
    cancelParsing(): void;
    /**
     * Also cancelling current parsing process
     * @param source 
     */
    setText(source: string): void;
    /**
     * Zero-based
     * @param column 
     * @param row 
     */
    symbolInfoAtPosition(column: number, row: number): ISymbolInfo | undefined;
}

export interface IContextEntry {
    context: ISourceContext;
}

export class FacadeImpl {
    // Mapping file names to SourceContext instances.
    private sourceContexts: Map<string, IContextEntry> = new Map<string, IContextEntry>();

    public logFn: LogFunction;

    constructor(private contextFactory: (fileName: string, logFn?: LogFunction) => ISourceContext, logFn?: LogFunction) {
        // tslint:disable-next-line:no-empty
        this.logFn = logFn || (() => { });
    }

    public detach(fileName: string) {
        // just remove
        this.sourceContexts.delete(fileName);
    }

    public getContext(fileName: string) {
        let contextEntry = this.sourceContexts.get(fileName);
        if (!contextEntry) {
            let context = this.contextFactory(fileName, this.logFn);
            contextEntry = { context: context };
            this.sourceContexts.set(fileName, contextEntry);
        }
        return contextEntry.context;
    }

    public setText(fileName: string, source: string) {
        let context = this.getContext(fileName);
        context.setText(source);
    }

    public setRequireReparse(isRequire: boolean, fileName?: string) {
        if (fileName) {
            let context = this.getContext(fileName);
            context.requireReparse = isRequire;
        }
        for (let [ , context] of this.sourceContexts) {
            context.context.requireReparse = isRequire;
        }
    }

    public async parse(fileName: string) {
        let context = this.getContext(fileName);
        return context.parse();
    }

    public getDiagnostics(fileName: string): IDiagnosticEntry[] {
        let context = this.getContext(fileName);
        return context.getDiagnostics();
    }

    /**
     * Zero-based
     * @param fileName 
     * @param column 
     * @param row 
     */
    public getCodeCompletionCandidates(fileName: string, column: number, row: number): ICompletion[] {
        let context = this.getContext(fileName);
        return context.getCodeCompletionCandidates(column, row);
    }

    /**
     * Zero-based
     * @param fileName 
     * @param column 
     * @param row 
     */
    public symbolInfoAtPosition(fileName: string, column: number, row: number): ISymbolInfo | undefined {
        let context = this.getContext(fileName);
        return context.symbolInfoAtPosition(column, row);
    }

    /**
     * Zero-based
     * @param fileName 
     * @param column 
     * @param row 
     */
    public getOccurencesUnderCursor(fileName: string, column: number, row: number): IDefinition[] {
        let context = this.getContext(fileName);
        return context.getOccurencesUnderCursor(column, row);
    }
}
