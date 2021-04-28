import * as fs from "fs";

import { LogFunction, LogType } from "../common/main";
import { SourceContext } from "./SourceContext";

export enum SymbolKind {
    Keyword,
    Operator,
    Variable,
    Literal,
    Message,
    FacilityPrefix,
    FacilityName,
    Other,
}

/**
 * A range within a text. Just like the range object in vscode the end position is not included in the range.
 * Hence when start and end position are equal the range is empty.
 */
export interface LexicalRange {
    start: { column: number, row: number };
    end: { column: number, row: number };
}

// The definition of a single symbol (range and content it is made of).
export interface Definition {
    text: string;
    range: LexicalRange;
}

export interface SymbolInfo {
    kind: SymbolKind;
    name: string;
    source: string;
    definition?: Definition;
    description?: string;  // Used for code completion. Provides a small description for certain symbols.
}

export enum DiagnosticType {
    Hint,
    Info,
    Warning,
    Error
}

export interface DiagnosticEntry {
    type: DiagnosticType;
    message: string;
    range: LexicalRange;
}

export interface ContextEntry {
    context: SourceContext;
}

export class MsgFacade {
    // Mapping file names to SourceContext instances.
    private sourceContexts: Map<string, ContextEntry> = new Map<string, ContextEntry>();

    public logFn: LogFunction;

    constructor(logFn?: LogFunction) {
        // tslint:disable-next-line:no-empty
        this.logFn = logFn || (() => {});
    }

    public attach(fileName: string, source?: string ) {
        // that will be enought
        const context = this.getContext(fileName, source);
        return context;
    }

    public detach(fileName: string ) {
        // just remove
        this.sourceContexts.delete(fileName);
    }

    public getContext(fileName: string, source?: string): SourceContext {
        let contextEntry = this.sourceContexts.get(fileName);
        if (!contextEntry) {
            return this.loadMsg(fileName, source);
        }
        return contextEntry.context;
    }

    public loadMsg(fileName: string, source?: string): SourceContext {
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

            let context = new SourceContext(fileName, this.logFn);
            contextEntry = { context: context };
            this.sourceContexts.set(fileName, contextEntry);

            // Do an initial parse run and load all dependencies of this context
            // and pass their references to this context.
            context.setText(source);
            this.parseMsg(contextEntry);
        }
        return contextEntry.context;
    }

    private parseMsg(contextEntry: ContextEntry) {
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
            this.parseMsg(contextEntry);
        }
    }

    public getDiagnostics(fileName: string): DiagnosticEntry[] {
        let context = this.getContext(fileName);
        return context.getDiagnostics();
    }

    public getCodeCompletionCandidates(fileName: string, column: number, row: number): SymbolInfo[] {
        let context = this.getContext(fileName);
        return context.getCodeCompletionCandidates(column, row);
    }

    public symbolInfoAtPosition(fileName: string, column: number, row: number): SymbolInfo | undefined {
        let context = this.getContext(fileName);
        return context.symbolAtPosition(column, row);
    }

    public getSymbolOccurences(fileName: string, column: number, row: number): SymbolInfo[] {
        let context = this.getContext(fileName);
        return context.getSymbolOccurences(column, row);
    }
}
