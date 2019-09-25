import fs from 'fs';

import { LogFunction } from '../main';

export enum ESymbolKind {
    Unknown,
}

/**
 * A range within a text. Just like the range object in vscode the end position is not included in the range.
 * Hence when start and end position are equal the range is empty.
 */
export interface ILexicalRange {
    start: { column: number, row: number };
    end: { column: number, row: number };
}

// The definition of a single symbol (range and content it is made of).
export interface IDefinition {
    text: string;
    range: ILexicalRange;
}

export interface ISymbolInfo {
    kind: ESymbolKind;
    name: string;
    source: string;
    definition?: IDefinition;
    description?: string;  // Used for code completion. Provides a small description for certain symbols.
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
}

export interface ISourceContext {
    getCodeCompletionCandidates(column: number, row: number): ISymbolInfo[];
    getDiagnostics(): IDiagnosticEntry[];
    getSymbolOccurences(column: number, row: number): ISymbolInfo[];
    parse(): void;
    setText(source: string): void;
    symbolAtPosition(column: number, row: number): ISymbolInfo | undefined;
}

export interface IContextEntry {
    context: ISourceContext;
}

export class ContextFacade {
    // Mapping file names to SourceContext instances.
    private sourceContexts: Map<string, IContextEntry> = new Map<string, IContextEntry>();

    public logFn: LogFunction;

    constructor(private contextFactory: (fileName: string, logFn?: LogFunction) => ISourceContext, logFn?: LogFunction) {
        // tslint:disable-next-line:no-empty
        this.logFn = logFn || (() => { });
    }

    public attach(fileName: string, source?: string) {
        // that will be enought
        const context = this.getContext(fileName, source);
        return context;
    }

    public detach(fileName: string) {
        // just remove
        this.sourceContexts.delete(fileName);
    }

    public getContext(fileName: string, source?: string): ISourceContext {
        let contextEntry = this.sourceContexts.get(fileName);
        if (!contextEntry) {
            return this.loadSource(fileName, source);
        }
        return contextEntry.context;
    }

    public loadSource(fileName: string, source?: string): ISourceContext {
        let contextEntry = this.sourceContexts.get(fileName);
        if (!contextEntry) {
            if (!source) {
                try {
                    fs.statSync(fileName);
                    source = fs.readFileSync(fileName, 'utf8');
                } catch (e) {
                    source = "";
                }
            }

            let context = this.contextFactory(fileName, this.logFn);
            contextEntry = { context: context };
            this.sourceContexts.set(fileName, contextEntry);

            // Do an initial parse run and load all dependencies of this context
            // and pass their references to this context.
            context.setText(source);
            this.parse(contextEntry);
        }
        return contextEntry.context;
    }

    private parse(contextEntry: IContextEntry) {
        contextEntry.context.parse();
    }

    public setText(fileName: string, source: string) {
        let contextEntry = this.sourceContexts.get(fileName);
        if (contextEntry) {
            contextEntry.context.setText(source);
        }
    }

    /**
     * Triggers a parse run for the given file name. This grammar must have been loaded before.
     */
    public reparse(fileName: string) {
        let contextEntry = this.sourceContexts.get(fileName);
        if (contextEntry) {
            this.parse(contextEntry);
        }
    }

    public getDiagnostics(fileName: string): IDiagnosticEntry[] {
        let context = this.getContext(fileName);
        return context.getDiagnostics();
    }

    public getCodeCompletionCandidates(fileName: string, column: number, row: number): ISymbolInfo[] {
        let context = this.getContext(fileName);
        return context.getCodeCompletionCandidates(column, row);
    }

    public symbolInfoAtPosition(fileName: string, column: number, row: number): ISymbolInfo | undefined {
        let context = this.getContext(fileName);
        return context.symbolAtPosition(column, row);
    }

    public getSymbolOccurences(fileName: string, column: number, row: number): ISymbolInfo[] {
        let context = this.getContext(fileName);
        return context.getSymbolOccurences(column, row);
    }
}
