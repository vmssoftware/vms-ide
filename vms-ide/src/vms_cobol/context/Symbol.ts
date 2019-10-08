import * as vscode from 'vscode';

import {
    ScopedSymbol,
    Symbol,
} from 'antlr4-c3';

export enum ECobolSymbolKind {
    Unknown,
    CobolSource,
    Program,
    CARD_READER,
    PAPER_TAPE_READER,
    CONSOLE,
    LINE_PRINTER,
    PAPER_TAPE_PUNCH,
    SYSIN,
    SYSOUT,
    SYSERR,
    C01,
    ARGUMENT_NUMBER,
    ARGUMENT_VALUE,
    ENVIRONMENT_NAME,
    ENVIRONMENT_VALUE,
    SWITCH,
    SWITCH_STATUS,
    ALPHABET,
    SYMBOLIC_CHARACTERS,
    CLASS,
    CURRENCY,
    File,
    Report,
    DataRecord,
    Section,
    Paragraph,
}

/**
 * Provides a textual expression for a native symbol kind.
 */
export function symbolDescriptionFromEnum(kind: ECobolSymbolKind): string {
    // Could be localized.
    switch (kind) {
        case ECobolSymbolKind.CobolSource:
            return "CobolSource";
        case ECobolSymbolKind.Program:
            return "Program";
        case ECobolSymbolKind.CARD_READER:
            return "CARD-READER";
        case ECobolSymbolKind.PAPER_TAPE_READER:
            return "PAPER-TAPE-READER";
        case ECobolSymbolKind.CONSOLE:
            return "CONSOLE";
        case ECobolSymbolKind.LINE_PRINTER:
            return "LINE-PRINTER";
        case ECobolSymbolKind.PAPER_TAPE_PUNCH:
            return "PAPER-TAPE-PUNCH";
        case ECobolSymbolKind.SYSIN:
            return "SYSIN";
        case ECobolSymbolKind.SYSOUT:
            return "SYSOUT";
        case ECobolSymbolKind.SYSERR:
            return "SYSERR";
        case ECobolSymbolKind.C01:
            return "C01";
        case ECobolSymbolKind.ARGUMENT_NUMBER:
            return "ARGUMENT-NUMBER";
        case ECobolSymbolKind.ARGUMENT_VALUE:
            return "ARGUMENT-VALUE";
        case ECobolSymbolKind.ENVIRONMENT_NAME:
            return "ENVIRONMENT-NAME";
        case ECobolSymbolKind.ENVIRONMENT_VALUE:
            return "ENVIRONMENT VALUE";
        case ECobolSymbolKind.SWITCH:
            return "SWITCH";
        case ECobolSymbolKind.SWITCH_STATUS:
            return "SWITCH STATUS";
        case ECobolSymbolKind.ALPHABET:
            return "ALPHABET";
        case ECobolSymbolKind.SYMBOLIC_CHARACTERS:
            return "SYMBOLIC-CHARACTERS";
        case ECobolSymbolKind.CLASS:
            return "Paragraph";
        case ECobolSymbolKind.CURRENCY:
            return "CURRENCY";
        case ECobolSymbolKind.File:
            return "File";
        case ECobolSymbolKind.Report:
            return "Report";
        case ECobolSymbolKind.DataRecord:
            return "DataRecord";
        case ECobolSymbolKind.Section:
            return "Section";
        case ECobolSymbolKind.Paragraph:
            return "Paragraph";
        case ECobolSymbolKind.Unknown:
        default:
            return "Unknown type";
    }
}

/**
 * Converts the native symbol kind to a vscode symbol kind.
 */
export function translateSymbolKind(kind: ECobolSymbolKind): vscode.SymbolKind {
    switch (kind) {
        case ECobolSymbolKind.CobolSource:
            return vscode.SymbolKind.File;
        case ECobolSymbolKind.Program:
            return vscode.SymbolKind.Module;
        case ECobolSymbolKind.CARD_READER:
        case ECobolSymbolKind.PAPER_TAPE_READER:
        case ECobolSymbolKind.CONSOLE:
        case ECobolSymbolKind.LINE_PRINTER:
        case ECobolSymbolKind.PAPER_TAPE_PUNCH:
        case ECobolSymbolKind.SYSIN:
        case ECobolSymbolKind.SYSOUT:
        case ECobolSymbolKind.SYSERR:
        case ECobolSymbolKind.C01:
        case ECobolSymbolKind.ARGUMENT_NUMBER:
        case ECobolSymbolKind.ARGUMENT_VALUE:
        case ECobolSymbolKind.ENVIRONMENT_NAME:
        case ECobolSymbolKind.ENVIRONMENT_VALUE:
        case ECobolSymbolKind.SWITCH:
        case ECobolSymbolKind.SWITCH_STATUS:
        case ECobolSymbolKind.ALPHABET:
        case ECobolSymbolKind.SYMBOLIC_CHARACTERS:
        case ECobolSymbolKind.CLASS:
        case ECobolSymbolKind.CURRENCY:
            return vscode.SymbolKind.Constant;
        case ECobolSymbolKind.File:
        case ECobolSymbolKind.Report:
        case ECobolSymbolKind.DataRecord:
            return vscode.SymbolKind.Struct;
        case ECobolSymbolKind.Section:
        case ECobolSymbolKind.Paragraph:
            return vscode.SymbolKind.Function;
        case ECobolSymbolKind.Unknown:
        default:
            return vscode.SymbolKind.Null;
    }
}

/**
 * Converts the native symbol kind to a vscode symbol kind.
 */
export function translateCompletionKind(kind: ECobolSymbolKind): vscode.CompletionItemKind {
    switch (kind) {
        case ECobolSymbolKind.CobolSource:
            return vscode.CompletionItemKind.File;
        case ECobolSymbolKind.Program:
            return vscode.CompletionItemKind.Module;
        case ECobolSymbolKind.CARD_READER:
        case ECobolSymbolKind.PAPER_TAPE_READER:
        case ECobolSymbolKind.CONSOLE:
        case ECobolSymbolKind.LINE_PRINTER:
        case ECobolSymbolKind.PAPER_TAPE_PUNCH:
        case ECobolSymbolKind.SYSIN:
        case ECobolSymbolKind.SYSOUT:
        case ECobolSymbolKind.SYSERR:
        case ECobolSymbolKind.C01:
        case ECobolSymbolKind.ARGUMENT_NUMBER:
        case ECobolSymbolKind.ARGUMENT_VALUE:
        case ECobolSymbolKind.ENVIRONMENT_NAME:
        case ECobolSymbolKind.ENVIRONMENT_VALUE:
        case ECobolSymbolKind.SWITCH:
        case ECobolSymbolKind.SWITCH_STATUS:
        case ECobolSymbolKind.ALPHABET:
        case ECobolSymbolKind.SYMBOLIC_CHARACTERS:
        case ECobolSymbolKind.CLASS:
        case ECobolSymbolKind.CURRENCY:
            return vscode.CompletionItemKind.Constant;
        case ECobolSymbolKind.File:
        case ECobolSymbolKind.Report:
        case ECobolSymbolKind.DataRecord:
            return vscode.CompletionItemKind.Struct;
        case ECobolSymbolKind.Section:
        case ECobolSymbolKind.Paragraph:
            return vscode.CompletionItemKind.Function;
        case ECobolSymbolKind.Unknown:
        case ECobolSymbolKind.Unknown:
        default:
            return vscode.CompletionItemKind.Text;
    }
}

/**
 * 
 * @param kind 
 */
export function getSymbolFromKind(kind: ECobolSymbolKind): typeof Symbol {
    switch (kind) {
        case ECobolSymbolKind.CobolSource:
            return CobolSourceSymbol;
        case ECobolSymbolKind.Program:
            return ProgramSymbol;
        case ECobolSymbolKind.CARD_READER:
            return CARD_READER_Symbol;
        case ECobolSymbolKind.PAPER_TAPE_READER:
            return PAPER_TAPE_READER_Symbol;
        case ECobolSymbolKind.CONSOLE:
            return CONSOLE_Symbol;
        case ECobolSymbolKind.LINE_PRINTER:
            return LINE_PRINTER_Symbol;
        case ECobolSymbolKind.PAPER_TAPE_PUNCH:
            return PAPER_TAPE_PUNCH_Symbol;
        case ECobolSymbolKind.SYSIN:
            return SYSIN_Symbol;
        case ECobolSymbolKind.SYSOUT:
            return SYSOUT_Symbol;
        case ECobolSymbolKind.SYSERR:
            return SYSERR_Symbol;
        case ECobolSymbolKind.C01:
            return C01_Symbol;
        case ECobolSymbolKind.ARGUMENT_NUMBER:
            return ARGUMENT_NUMBER_Symbol;
        case ECobolSymbolKind.ARGUMENT_VALUE:
            return ARGUMENT_VALUE_Symbol;
        case ECobolSymbolKind.ENVIRONMENT_NAME:
            return ENVIRONMENT_NAME_Symbol;
        case ECobolSymbolKind.ENVIRONMENT_VALUE:
            return ENVIRONMENT_VALUE_Symbol;
        case ECobolSymbolKind.SWITCH:
            return SWITCH_Symbol;
        case ECobolSymbolKind.SWITCH_STATUS:
            return SWITCH_STATUS_Symbol;
        case ECobolSymbolKind.ALPHABET:
            return ALPHABET_Symbol;
        case ECobolSymbolKind.SYMBOLIC_CHARACTERS:
            return SYMBOLIC_CHARACTERS_Symbol;
        case ECobolSymbolKind.CLASS:
            return CLASS_Symbol;
        case ECobolSymbolKind.CURRENCY:
            return CURRENCY_Symbol;
        case ECobolSymbolKind.File:
            return FileSymbol;
        case ECobolSymbolKind.Report:
            return ReportFileSymbol;
        case ECobolSymbolKind.DataRecord:
            return DataRecordSymbol;
        case ECobolSymbolKind.Section:
            return SectionSymbol;
        case ECobolSymbolKind.Paragraph:
            return ParagraphSymbol;
        case ECobolSymbolKind.Unknown:
        default:
            return Symbol;
    }
}

/**
 * 
 * @param symbol 
 */
export function getKindFromSymbol(symbol: Symbol): ECobolSymbolKind {
    if (symbol instanceof CobolSourceSymbol) {
        return ECobolSymbolKind.CobolSource;
    }
    if (symbol instanceof ProgramSymbol) {
        return ECobolSymbolKind.Program;
    }
    if (symbol instanceof CARD_READER_Symbol) {
        return ECobolSymbolKind.CARD_READER;
    }
    if (symbol instanceof PAPER_TAPE_READER_Symbol) {
        return ECobolSymbolKind.PAPER_TAPE_READER;
    }
    if (symbol instanceof CONSOLE_Symbol) {
        return ECobolSymbolKind.CONSOLE;
    }
    if (symbol instanceof LINE_PRINTER_Symbol) {
        return ECobolSymbolKind.LINE_PRINTER;
    }
    if (symbol instanceof PAPER_TAPE_PUNCH_Symbol) {
        return ECobolSymbolKind.PAPER_TAPE_PUNCH;
    }
    if (symbol instanceof SYSIN_Symbol) {
        return ECobolSymbolKind.SYSIN;
    }
    if (symbol instanceof SYSOUT_Symbol) {
        return ECobolSymbolKind.SYSOUT;
    }
    if (symbol instanceof SYSERR_Symbol) {
        return ECobolSymbolKind.SYSERR;
    }
    if (symbol instanceof C01_Symbol) {
        return ECobolSymbolKind.C01;
    }
    if (symbol instanceof ARGUMENT_NUMBER_Symbol) {
        return ECobolSymbolKind.ARGUMENT_NUMBER;
    }
    if (symbol instanceof ARGUMENT_VALUE_Symbol) {
        return ECobolSymbolKind.ARGUMENT_VALUE;
    }
    if (symbol instanceof ENVIRONMENT_NAME_Symbol) {
        return ECobolSymbolKind.ENVIRONMENT_NAME;
    }
    if (symbol instanceof ENVIRONMENT_VALUE_Symbol) {
        return ECobolSymbolKind.ENVIRONMENT_VALUE;
    }
    if (symbol instanceof SWITCH_Symbol) {
        return ECobolSymbolKind.SWITCH;
    }
    if (symbol instanceof SWITCH_STATUS_Symbol) {
        return ECobolSymbolKind.SWITCH_STATUS;
    }
    if (symbol instanceof ALPHABET_Symbol) {
        return ECobolSymbolKind.ALPHABET;
    }
    if (symbol instanceof SYMBOLIC_CHARACTERS_Symbol) {
        return ECobolSymbolKind.SYMBOLIC_CHARACTERS;
    }
    if (symbol instanceof CLASS_Symbol) {
        return ECobolSymbolKind.CLASS;
    }
    if (symbol instanceof CURRENCY_Symbol) {
        return ECobolSymbolKind.CURRENCY;
    }
    if (symbol instanceof FileSymbol) {
        return ECobolSymbolKind.File;
    }
    if (symbol instanceof ReportFileSymbol) {
        return ECobolSymbolKind.Report;
    }
    if (symbol instanceof DataRecordSymbol) {
        return ECobolSymbolKind.DataRecord;
    }
    if (symbol instanceof SectionSymbol) {
        return ECobolSymbolKind.Section;
    }
    if (symbol instanceof ParagraphSymbol) {
        return ECobolSymbolKind.Paragraph;
    }
    if (symbol instanceof Symbol) {
        return ECobolSymbolKind.Unknown;
    }
    return ECobolSymbolKind.Unknown;
}

export class CobolSourceSymbol extends ScopedSymbol { }
export class ProgramSymbol extends ScopedSymbol { }
export class CARD_READER_Symbol extends Symbol { }
export class PAPER_TAPE_READER_Symbol extends Symbol { }
export class CONSOLE_Symbol extends Symbol { }
export class LINE_PRINTER_Symbol extends Symbol { }
export class PAPER_TAPE_PUNCH_Symbol extends Symbol { }
export class SYSIN_Symbol extends Symbol { }
export class SYSOUT_Symbol extends Symbol { }
export class SYSERR_Symbol extends Symbol { }
export class C01_Symbol extends Symbol { }
export class ARGUMENT_NUMBER_Symbol extends Symbol { }
export class ARGUMENT_VALUE_Symbol extends Symbol { }
export class ENVIRONMENT_NAME_Symbol extends Symbol { }
export class ENVIRONMENT_VALUE_Symbol extends Symbol { }
export class SWITCH_Symbol extends Symbol { }
export class SWITCH_STATUS_Symbol extends Symbol { }
export class ALPHABET_Symbol extends Symbol {
    public usedInProgramCollating?: boolean;
}
export class SYMBOLIC_CHARACTERS_Symbol extends Symbol { }
export class CLASS_Symbol extends Symbol { }
export class CURRENCY_Symbol extends Symbol {
    public currency_str?: string;
}
export class FileSymbol extends ScopedSymbol {
    public isGlobal?: boolean;
}
export class SortMergeFileSymbol extends ScopedSymbol { }
export class ReportFileSymbol extends ScopedSymbol {
    public isGlobal?: boolean;
}
export class ReportGroupSymbol extends ScopedSymbol {
    public level?: number;
}
export class DataRecordSymbol extends ScopedSymbol {
    public level?: number;
    public isGlobal?: boolean;
}
export class SegKeySymbol extends Symbol { }
export class SectionSymbol extends ScopedSymbol {
    public segment?: number;
}
export class DeclarativesSectionSymbol extends SectionSymbol { }
export class ParagraphSymbol extends ScopedSymbol { }
export class IndexedBySymbol extends Symbol { }