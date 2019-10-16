import * as vscode from 'vscode';

import {
    ScopedSymbol,
    Symbol,
} from 'antlr4-c3';

export enum ECobolSymbolKind {
    Unknown,
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
    SIGN_Condition,
    BOOL_Condition,
    CURRENCY,
    File,
    SortMergeFile,
    Report,
    DataRecord,
    Section,
    Paragraph,
    IndexedBy,
    SpecialRegister,
    FigurativeConstant,
    IntrincisFunction,
}

/**
 * Provides a textual expression for a native symbol kind.
 */
export function symbolDescriptionFromEnum(kind: ECobolSymbolKind): string {
    // Could be localized.
    switch (kind) {
        case ECobolSymbolKind.Program:
            return "Program";
        case ECobolSymbolKind.CARD_READER:
            return "Card reader device";
        case ECobolSymbolKind.PAPER_TAPE_READER:
            return "Paper tape reader device";
        case ECobolSymbolKind.CONSOLE:
            return "Console device";
        case ECobolSymbolKind.LINE_PRINTER:
            return "Line printer device";
        case ECobolSymbolKind.PAPER_TAPE_PUNCH:
            return "Paper tape punch device";
        case ECobolSymbolKind.SYSIN:
            return "Sysin device";
        case ECobolSymbolKind.SYSOUT:
            return "Sysout device";
        case ECobolSymbolKind.SYSERR:
            return "Syserr device";
        case ECobolSymbolKind.C01:
            return "Top of the page";
        case ECobolSymbolKind.ARGUMENT_NUMBER:
            return "Argument number";
        case ECobolSymbolKind.ARGUMENT_VALUE:
            return "Argument value";
        case ECobolSymbolKind.ENVIRONMENT_NAME:
            return "Environment name";
        case ECobolSymbolKind.ENVIRONMENT_VALUE:
            return "Environment value";
        case ECobolSymbolKind.SWITCH:
            return "Switch";
        case ECobolSymbolKind.SWITCH_STATUS:
            return "Switch status";
        case ECobolSymbolKind.ALPHABET:
            return "Alphabet";
        case ECobolSymbolKind.SYMBOLIC_CHARACTERS:
            return "Symbolic characters";
        case ECobolSymbolKind.CLASS:
            return "Class";
        case ECobolSymbolKind.SIGN_Condition:
            return "Sign condition";
        case ECobolSymbolKind.BOOL_Condition:
            return "Bool condition";
        case ECobolSymbolKind.CURRENCY:
            return "Currency";
        case ECobolSymbolKind.File:
            return "File";
        case ECobolSymbolKind.SortMergeFile:
            return "Sort-merge file";
        case ECobolSymbolKind.Report:
            return "Report";
        case ECobolSymbolKind.DataRecord:
            return "Data record";
        case ECobolSymbolKind.Section:
            return "Section";
        case ECobolSymbolKind.Paragraph:
            return "Paragraph";
        case ECobolSymbolKind.IndexedBy:
            return "Indexed by";
        case ECobolSymbolKind.SpecialRegister:
            return "Special register";
        case ECobolSymbolKind.FigurativeConstant:
            return "Figurative constant";
        case ECobolSymbolKind.IntrincisFunction:
            return "Intrincis function";
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
        case ECobolSymbolKind.SIGN_Condition:
        case ECobolSymbolKind.BOOL_Condition:
        case ECobolSymbolKind.CURRENCY:
        case ECobolSymbolKind.SpecialRegister:
        case ECobolSymbolKind.FigurativeConstant:
            return vscode.SymbolKind.Constant;
        case ECobolSymbolKind.File:
        case ECobolSymbolKind.Report:
        case ECobolSymbolKind.DataRecord:
            return vscode.SymbolKind.Struct;
        case ECobolSymbolKind.Section:
        case ECobolSymbolKind.Paragraph:
        case ECobolSymbolKind.IntrincisFunction:
            return vscode.SymbolKind.Function;
        case ECobolSymbolKind.IndexedBy:
            return vscode.SymbolKind.Variable;
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
        case ECobolSymbolKind.SIGN_Condition:
        case ECobolSymbolKind.BOOL_Condition:
        case ECobolSymbolKind.CURRENCY:
        case ECobolSymbolKind.SpecialRegister:
        case ECobolSymbolKind.FigurativeConstant:
            return vscode.CompletionItemKind.Constant;
        case ECobolSymbolKind.File:
        case ECobolSymbolKind.Report:
        case ECobolSymbolKind.DataRecord:
            return vscode.CompletionItemKind.Struct;
        case ECobolSymbolKind.Section:
        case ECobolSymbolKind.Paragraph:
        case ECobolSymbolKind.IntrincisFunction:
            return vscode.CompletionItemKind.Function;
        case ECobolSymbolKind.IndexedBy:
                return vscode.CompletionItemKind.Variable;
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
        case ECobolSymbolKind.SIGN_Condition:
            return SIGN_Symbol;
        case ECobolSymbolKind.BOOL_Condition:
            return BOOL_Symbol;
        case ECobolSymbolKind.CURRENCY:
            return CURRENCY_Symbol;
        case ECobolSymbolKind.File:
            return FileSymbol;
        case ECobolSymbolKind.SortMergeFile:
            return SortMergeFileSymbol;
        case ECobolSymbolKind.Report:
            return ReportFileSymbol;
        case ECobolSymbolKind.DataRecord:
            return DataRecordSymbol;
        case ECobolSymbolKind.Section:
            return SectionSymbol;
        case ECobolSymbolKind.Paragraph:
            return ParagraphSymbol;
        case ECobolSymbolKind.IndexedBy:
            return IndexedBySymbol;
        case ECobolSymbolKind.SpecialRegister:
            return SpecialRegisterSymbol;
        case ECobolSymbolKind.FigurativeConstant:
            return FigurativeConstantSymbol;
        case ECobolSymbolKind.IntrincisFunction:
            return IntrincisFunctionSymbol;
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
    if (symbol instanceof IntrincisFunctionSymbol) {
        return ECobolSymbolKind.IntrincisFunction;
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
    if (symbol instanceof SIGN_Symbol) {
        return ECobolSymbolKind.SIGN_Condition;
    }
    if (symbol instanceof BOOL_Symbol) {
        return ECobolSymbolKind.BOOL_Condition;
    }
    if (symbol instanceof CURRENCY_Symbol) {
        return ECobolSymbolKind.CURRENCY;
    }
    if (symbol instanceof FileSymbol) {
        return ECobolSymbolKind.File;
    }
    if (symbol instanceof SortMergeFileSymbol) {
        return ECobolSymbolKind.SortMergeFile;
    }
    if (symbol instanceof ReportFileSymbol) {
        return ECobolSymbolKind.Report;
    }
    if (symbol instanceof SpecialRegisterSymbol) {
        return ECobolSymbolKind.SpecialRegister;
    }
    if (symbol instanceof FigurativeConstantSymbol) {
        return ECobolSymbolKind.FigurativeConstant;
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
    if (symbol instanceof IndexedBySymbol) {
        return ECobolSymbolKind.IndexedBy;
    }
    if (symbol instanceof Symbol) {
        return ECobolSymbolKind.Unknown;
    }
    return ECobolSymbolKind.Unknown;
}
//**************************************************/
export enum EDataUsage {
    BINARY,
    BINARY_CHAR,
    BINARY_SHORT,
    BINARY_LONG,
    BINARY_DOUBLE,
    COMPUTATIONAL,
    COMPUTATIONAL_1,
    COMPUTATIONAL_2,
    COMPUTATIONAL_3,
    COMPUTATIONAL_4,
    COMPUTATIONAL_5,
    COMPUTATIONAL_X,
    COMP,
    COMP_1,
    COMP_2,
    COMP_3,
    COMP_4,
    COMP_5,
    COMP_X,
    DISPLAY,
    FLOAT_SHORT,
    FLOAT_LONG,
    FLOAT_EXTENDED,
    INDEX,
    PACKED_DECIMAL,
    POINTER,
    POINTER_64,
}
//**************************************************/
export class IdentifierSymbol extends ScopedSymbol {
    public isGlobal?: boolean;
}
export class DEVICE_Symbol extends Symbol { }
//**************************************************/
export class ProgramSymbol extends IdentifierSymbol { 
    // TODO: using, giving types
}
export class CARD_READER_Symbol extends DEVICE_Symbol { }
export class PAPER_TAPE_READER_Symbol extends DEVICE_Symbol { }
export class CONSOLE_Symbol extends DEVICE_Symbol { }
export class LINE_PRINTER_Symbol extends DEVICE_Symbol { }
export class PAPER_TAPE_PUNCH_Symbol extends DEVICE_Symbol { }
export class SYSIN_Symbol extends DEVICE_Symbol { }
export class SYSOUT_Symbol extends DEVICE_Symbol { }
export class SYSERR_Symbol extends DEVICE_Symbol { }
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
export class SIGN_Symbol extends Symbol { }
export class BOOL_Symbol extends Symbol { }
export class CURRENCY_Symbol extends Symbol {
    public currency_str?: string;
}
export class FileSymbol extends IdentifierSymbol { }
export class SortMergeFileSymbol extends IdentifierSymbol { }
export class ReportFileSymbol extends IdentifierSymbol { }
export class DataRecordSymbol extends IdentifierSymbol {
    public level?: number;
    public picture?: string;
    public usage?: EDataUsage;
    public requireQualification?: boolean;
}
export class ReportGroupSymbol extends DataRecordSymbol { }
export class SegKeySymbol extends Symbol { }
export class SectionSymbol extends IdentifierSymbol {
    public segment?: number;
}
export class DeclarativesSectionSymbol extends SectionSymbol { }
export class ParagraphSymbol extends IdentifierSymbol { }
export class IndexedBySymbol extends IdentifierSymbol { }
export class SpecialRegisterSymbol extends DataRecordSymbol { }
export class FigurativeConstantSymbol extends DataRecordSymbol { }
export class IntrincisFunctionSymbol extends ProgramSymbol {
    functionDefinition?: IFunction;
}

//**************************************************/
//**************************************************/
//**************************************************/

export function programDetails(programSymbol: ProgramSymbol): string | undefined {
    if (programSymbol instanceof IntrincisFunctionSymbol) {
        if (programSymbol.functionDefinition) {
            return `${programSymbol.name} ( ) : ${EFunctionType[programSymbol.functionDefinition.resultType]}`;
        }
    }
    return undefined;
}

export enum EFunctionType {
    Integer,
    Numeric,
    Alphanumeric,
    ArgType,
};

export interface IFunction {
    name: string,
    resultType: EFunctionType,
    argTypes: EFunctionType[][],
};

export const _IntrincisFunctions: IFunction[] = [
    {   name: "ACOS",
        resultType: EFunctionType.Numeric,
        argTypes: [[EFunctionType.Numeric]],
    },
    {   name: "ANNUITY",
        resultType: EFunctionType.Numeric,
        argTypes: [[EFunctionType.Numeric], [EFunctionType.Integer]],
    },
];

//**************************************************/
//**************************************************/
//**************************************************/

export enum EGlobalType {
    alwaysTrue,
    alwaysFalse,
    fromParent,
}

export interface IPreDefinition {
    name: string;
    picture?: string;
    usage?: EDataUsage;
    global?: EGlobalType;
    type: new (...args: any[]) => Symbol;
    requireQualification?: boolean;
}

export interface IPredefinedNode {
    parentKind?: ECobolSymbolKind;
    predefinitions: IPreDefinition[];
}

export const _PredefinedData: IPredefinedNode[] = [
    {   // parentKind: ECobolSymbolKind.Program,
        predefinitions: [
            {   name: "SUCCESS",
                type: BOOL_Symbol,
            },
            {   name: "FAILURE",
                type: BOOL_Symbol,
            },
            {   name: "POSITIVE",
                type: SIGN_Symbol,
            },
            {   name: "NEGATIVE",
                type: SIGN_Symbol,
            },
            {   name: "ZERO",
                type: SIGN_Symbol,
            },
            {   name: "NUMERIC",
                type: CLASS_Symbol,
            },
            {   name: "ALPHABETIC",
                type: CLASS_Symbol,
            },
            {   name: "ALPHABETIC_LOWER",
                type: CLASS_Symbol,
            },
            {   name: "ALPHABETIC_UPPER",
                type: CLASS_Symbol,
            },
            {   name: "ALL",
                picture: "X",
                usage: EDataUsage.DISPLAY,
                global: EGlobalType.alwaysTrue,
                type: FigurativeConstantSymbol,
            },
            {   name: "QUOTES",
                picture: "X",
                usage: EDataUsage.DISPLAY,
                global: EGlobalType.alwaysTrue,
                type: FigurativeConstantSymbol,
            },
            {   name: "QUOTE",
                picture: "X",
                usage: EDataUsage.DISPLAY,
                global: EGlobalType.alwaysTrue,
                type: FigurativeConstantSymbol,
            },
            {   name: "LOW-VALUES",
                picture: "X",
                usage: EDataUsage.DISPLAY,
                global: EGlobalType.alwaysTrue,
                type: FigurativeConstantSymbol,
            },
            {   name: "LOW-VALUE",
                picture: "X",
                usage: EDataUsage.DISPLAY,
                global: EGlobalType.alwaysTrue,
                type: FigurativeConstantSymbol,
            },
            {   name: "HIGH-VALUES",
                picture: "X",
                usage: EDataUsage.DISPLAY,
                global: EGlobalType.alwaysTrue,
                type: FigurativeConstantSymbol,
            },
            {   name: "HIGH-VALUE",
                picture: "X",
                usage: EDataUsage.DISPLAY,
                global: EGlobalType.alwaysTrue,
                type: FigurativeConstantSymbol,
            },
            {   name: "SPACE",
                picture: "X",
                usage: EDataUsage.DISPLAY,
                global: EGlobalType.alwaysTrue,
                type: FigurativeConstantSymbol,
            },
            {   name: "SPACES",
                picture: "X",
                usage: EDataUsage.DISPLAY,
                global: EGlobalType.alwaysTrue,
                type: FigurativeConstantSymbol,
            },
            {   name: "ZERO",
                picture: "9",
                usage: EDataUsage.COMP,
                global: EGlobalType.alwaysTrue,
                type: FigurativeConstantSymbol,
            },
            {   name: "ZEROS",
                picture: "9",
                usage: EDataUsage.COMP,
                global: EGlobalType.alwaysTrue,
                type: FigurativeConstantSymbol,
            },
            {   name: "ZEROES",
                picture: "9",
                usage: EDataUsage.COMP,
                global: EGlobalType.alwaysTrue,
                type: FigurativeConstantSymbol,
            },
            {   name: "RETURN-CODE",
                picture: "S9(9)",
                usage: EDataUsage.COMP,
                global: EGlobalType.alwaysTrue,
                type: SpecialRegisterSymbol,
            },
            {   name: "RMS-CURRENT-STS",
                picture: "S9(9)",
                usage: EDataUsage.COMP,
                global: EGlobalType.alwaysTrue,
                type: SpecialRegisterSymbol,
            },
            {   name: "RMS-CURRENT-STV",
                picture: "S9(9)",
                usage: EDataUsage.COMP,
                global: EGlobalType.alwaysTrue,
                type: SpecialRegisterSymbol,
            },
            {   name: "RMS-CURRENT-FILENAME",
                picture: "X(255)",
                usage: EDataUsage.DISPLAY,
                global: EGlobalType.alwaysTrue,
                type: SpecialRegisterSymbol,
            },
        ]
    },
    {   parentKind: ECobolSymbolKind.File,
        predefinitions: [
            {   name: "LINAGE-COUNTER",
                picture: "S9(9)",
                usage: EDataUsage.COMP,
                global: EGlobalType.fromParent,
                type: SpecialRegisterSymbol,
            },
            {   name: "RMS-STS",
                picture: "S9(9)",
                usage: EDataUsage.COMP,
                global: EGlobalType.fromParent,
                type: SpecialRegisterSymbol,
                requireQualification: true,
            },
            {   name: "RMS-STV",
                picture: "S9(9)",
                usage: EDataUsage.COMP,
                global: EGlobalType.fromParent,
                type: SpecialRegisterSymbol,
                requireQualification: true,
            },
            {   name: "RMS-FILENAME",
                picture: "X(255)",
                usage: EDataUsage.DISPLAY,
                global: EGlobalType.fromParent,
                type: SpecialRegisterSymbol,
                requireQualification: true,
            },
        ]
    },
    {   parentKind: ECobolSymbolKind.Report,
        predefinitions: [
            {   name: "PAGE-COUNTER",
                picture: "9(6)",
                usage: EDataUsage.COMP,
                global: EGlobalType.alwaysFalse,
                type: SpecialRegisterSymbol,
            },
            {   name: "LINE-COUNTER",
                picture: "9(6)",
                usage: EDataUsage.COMP,
                global: EGlobalType.alwaysFalse,
                type: SpecialRegisterSymbol,
            },
        ]
    },
];

//**************************************************/
//**************************************************/
//**************************************************/
