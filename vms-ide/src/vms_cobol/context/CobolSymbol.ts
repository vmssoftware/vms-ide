import * as vscode from 'vscode';

import {
    ScopedSymbol,
    Symbol,
} from 'antlr4-c3';
import { ParseTree } from 'antlr4ts/tree';

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
    Report,
    DataRecord,
    Section,
    Paragraph,
    IndexedBy,
    SpecialRegister,
    FigurativeConstant,
    IntrinsicFunction,
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
        case ECobolSymbolKind.Report:
            return "report";
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
        case ECobolSymbolKind.IntrinsicFunction:
            return "Intrinsic function";
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
        case ECobolSymbolKind.IntrinsicFunction:
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
        case ECobolSymbolKind.IntrinsicFunction:
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
        case ECobolSymbolKind.Report:
            return ReportSymbol;
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
        case ECobolSymbolKind.IntrinsicFunction:
            return IntrinsicFunctionSymbol;
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
    if (symbol instanceof IntrinsicFunctionSymbol) {
        return ECobolSymbolKind.IntrinsicFunction;
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
    if (symbol instanceof ReportSymbol) {
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
export class IdentifierSymbol extends ScopedSymbol {
    public isGlobal?: boolean;
    public isExtern?: boolean;
}
export class SpecialNameSymbol extends IdentifierSymbol {
    constructor(...args: any[]) {
        super(...args);
        this.isGlobal = true;
    }
 }
export class DeviceSymbol extends SpecialNameSymbol { }
//**************************************************/
export class ProgramSymbol extends IdentifierSymbol { 
    isCommon?: boolean;
    endProgramCtx?: ParseTree;  // must be present only one
    programDefinition?: IProgram; 
}

export class IntrinsicFunctionSymbol extends IdentifierSymbol {
    functionDefinition?: IFunction; 
}

export class CARD_READER_Symbol extends DeviceSymbol { }
export class PAPER_TAPE_READER_Symbol extends DeviceSymbol { }
export class CONSOLE_Symbol extends DeviceSymbol { }
export class LINE_PRINTER_Symbol extends DeviceSymbol { }
export class PAPER_TAPE_PUNCH_Symbol extends DeviceSymbol { }
export class SYSIN_Symbol extends DeviceSymbol { }
export class SYSOUT_Symbol extends DeviceSymbol { }
export class SYSERR_Symbol extends DeviceSymbol { }
export class C01_Symbol extends SpecialNameSymbol { }
export class ARGUMENT_NUMBER_Symbol extends SpecialNameSymbol { }
export class ARGUMENT_VALUE_Symbol extends SpecialNameSymbol { }
export class ENVIRONMENT_NAME_Symbol extends SpecialNameSymbol { }
export class ENVIRONMENT_VALUE_Symbol extends SpecialNameSymbol { }
export class SWITCH_Symbol extends SpecialNameSymbol { }
export class SWITCH_STATUS_Symbol extends SpecialNameSymbol { }
export class ALPHABET_Symbol extends SpecialNameSymbol {
    public usedInProgramCollating?: boolean;
}
export class SYMBOLIC_CHARACTERS_Symbol extends SpecialNameSymbol { }
export class CLASS_Symbol extends SpecialNameSymbol { }
export class CURRENCY_Symbol extends SpecialNameSymbol {
    public currency_str?: string;
}
export class FileSymbol extends IdentifierSymbol { 
    public fileFormat = EFileFormat.Sequentional;
}
export class ReportSymbol extends IdentifierSymbol { 
    public fileSymbol?: FileSymbol;
}
export class DataRecordSymbol extends IdentifierSymbol {
    public level?: number;
    public picture?: string;
    public usage = EDataUsage.DISPLAY;
    public requireQualification?: boolean;
    public arrayLvl?: number;
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
export class SIGN_Symbol extends Symbol { }
export class BOOL_Symbol extends Symbol { }

//**************************************************/
//**************************************************/
//**************************************************/

export enum EFileFormat {
    Sequentional,
    Line,
    Relative,
    Indexed,
    Report
}

export function functionDetails(definition: IFunction): string | undefined {
    let details = " (";
    if (definition.arguments) {
        let sep = "";
        for (let arg of definition.arguments) {
            if (arg.optional) {
                details += " [";
            }
            details += sep;
            details += arg.name? arg.name + ": " : "";
            if (Array.isArray(arg.type)) {
                details += arg.type.map(argType => EValueType[argType]).join(" | ");
            } else {
                details += EValueType[arg.type];
            }
            if (arg.optional) {
                details += "]";
            }
            sep = ", ";
            if (arg.tail) {
                details += " ... ";
            }
        }
    }
    details += "): ";
    if (Array.isArray(definition.type)) {
        details += definition.type.map(argType => EValueType[argType]).join(" | ");
    } else {
        details += EValueType[definition.type];
    }
    return details;
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

export interface IProgramArgument {
    name: string,
    usage: EDataUsage,
};

export interface IProgram {
    name: string,
    usage: EDataUsage,
    arguments: IProgramArgument[]
};

export function programDetails(definition: IProgram): string | undefined {
    let details = " (";
    if (definition.arguments) {
        let sep = "";
        for (let arg of definition.arguments) {
            details += sep + arg.name;
            details += ": " + EDataUsage[arg.usage].replace(/_/g, "-");
            sep = ", ";
        }
    }
    details += "): ";
    details += EDataUsage[definition.usage].replace(/_/g, "-");
    return details;
}


export function ValueTypeFromDataUsage(usage?: EDataUsage): EValueType {
    switch(usage) {
        case EDataUsage.COMP_1:
        case EDataUsage.COMP_2:
        case EDataUsage.FLOAT_SHORT:
        case EDataUsage.FLOAT_LONG:
        case EDataUsage.FLOAT_EXTENDED:
        case EDataUsage.COMPUTATIONAL_1:
        case EDataUsage.COMPUTATIONAL_2:
            return EValueType.Numeric;
        case EDataUsage.BINARY:
        case EDataUsage.COMP:
        case EDataUsage.COMPUTATIONAL:
        case EDataUsage.COMPUTATIONAL_5:
        case EDataUsage.COMPUTATIONAL_X:
        case EDataUsage.COMP_5:
        case EDataUsage.COMP_X:
        case EDataUsage.BINARY_CHAR:
        case EDataUsage.BINARY_SHORT:
        case EDataUsage.BINARY_DOUBLE:
        case EDataUsage.INDEX:
        case EDataUsage.PACKED_DECIMAL:
        case EDataUsage.COMPUTATIONAL_3:
        case EDataUsage.COMP_3:
        case EDataUsage.POINTER:
        case EDataUsage.POINTER_64:
            return EValueType.Integer;
        case EDataUsage.DISPLAY:
            return EValueType.Alphanumeric;
    }
    return EValueType.Any;
}

export enum EValueType {
    Integer,
    Numeric,
    Alphanumeric,
    ArgType,
    Any,
};

export interface IValue {
    name?: string,
    type: EValueType[] | EValueType,
    optional?: boolean;
    tail?: boolean;
};

export interface IFunction extends IValue {
    arguments?: IValue[],
};

export const _IntrinsicFunctions: IFunction[] = [
    {   name: "ACOS",
        type: EValueType.Numeric,
        arguments: [
            {   name: "arg",
                type: EValueType.Numeric
            }
        ],
    },
    {   name: "ANNUITY",
        type: EValueType.Numeric,
        arguments: [
            {   name: "interest-rate",
                type: EValueType.Numeric,
            }, 
            {   name: "num-periods",
                type: EValueType.Integer,
            }
        ],
    },
    {   name: "ARGCOUNT",
        type: EValueType.Integer,
    },
    {   name: "ASIN",
        type: EValueType.Numeric,
        arguments: [
            {   name: "arg",
                type: EValueType.Numeric
            }
        ],
    },
    {   name: "ATAN",
        type: EValueType.Numeric,
        arguments: [
            {   name: "arg",
                type: EValueType.Numeric
            }
        ],
    },
    {   name: "CHAR",
        type: EValueType.Alphanumeric,
        arguments: [
            {   name: "position",
                type: EValueType.Integer
            }
        ],
    },
    {   name: "COS",
        type: EValueType.Numeric,
        arguments: [
            {   name: "angle",
                type: EValueType.Numeric
            }
        ],
    },
    {   name: "CURRENT-DATE",
        type: EValueType.Alphanumeric,
    },
    {   name: "DATE-OF-INTEGER",
        type: EValueType.Integer,
        arguments: [
            {   name: "num-days",
                type: EValueType.Integer
            }
        ],
    },
    {   name: "DATE-TO-YYYYMMDD",
        type: EValueType.Integer,
        arguments: [
            {   name: "date",
                type: EValueType.Integer
            },
            {   name: "year-add",
                type: EValueType.Integer,
                optional: true,
            }
        ],
    },
    {   name: "DAY-OF-INTEGER",
        type: EValueType.Integer,
        arguments: [
            {   name: "num-days",
                type: EValueType.Integer
            }
        ],
    },
    {   name: "DAY-TO-YYYYDDD",
        type: EValueType.Integer,
        arguments: [
            {   name: "day",
                type: EValueType.Integer
            },
            {   name: "year-add",
                type: EValueType.Integer,
                optional: true,
            }
        ],
    },
    {   name: "FACTORIAL",
        type: EValueType.Integer,
        arguments: [
            {   name: "num",
                type: EValueType.Integer
            }
        ],
    },
    {   name: "INTEGER",
        type: EValueType.Integer,
        arguments: [
            {   name: "num",
                type: EValueType.Numeric
            }
        ],
    },
    {   name: "INTEGER-OF-DATE",
        type: EValueType.Integer,
        arguments: [
            {   name: "date",
                type: EValueType.Integer
            }
        ],
    },
    {   name: "INTEGER-OF-DAY",
        type: EValueType.Integer,
        arguments: [
            {   name: "day",
                type: EValueType.Integer
            }
        ],
    },
    {   name: "INTEGER-PART",
        type: EValueType.Integer,
        arguments: [
            {   name: "num",
                type: EValueType.Numeric
            }
        ],
    },
    {   name: "LENGTH",
        type: EValueType.Integer,
        arguments: [
            {   name: "arg",
                type: EValueType.Any
            }
        ],
    },
    {   name: "LOG",
        type: EValueType.Numeric,
        arguments: [
            {   name: "num",
                type: EValueType.Numeric
            }
        ],
    },
    {   name: "LOG10",
        type: EValueType.Numeric,
        arguments: [
            {   name: "num",
                type: EValueType.Numeric
            }
        ],
    },
    {   name: "LOWER-CASE",
        type: EValueType.Alphanumeric,
        arguments: [
            {   name: "string",
                type: EValueType.Alphanumeric
            }
        ],
    },
    {   name: "MAX",
        type: EValueType.ArgType,
        arguments: [
            {   name: "arg",
                type: EValueType.Any,
                tail: true,
            }
        ],
    },
    {   name: "MEAN",
        type: EValueType.Numeric,
        arguments: [
            {   name: "arg",
                type: EValueType.Numeric,
                tail: true,
            }
        ],
    },
    {   name: "MEDIAN",
        type: EValueType.Numeric,
        arguments: [
            {   name: "arg",
                type: EValueType.Numeric,
                tail: true,
            }
        ],
    },
    {   name: "MIDRANGE",
        type: EValueType.Numeric,
        arguments: [
            {   name: "arg",
                type: EValueType.Numeric,
                tail: true,
            }
        ],
    },
    {   name: "MIN",
        type: EValueType.ArgType,
        arguments: [
            {   name: "arg",
                type: EValueType.Any,
                tail: true,
            }
        ],
    },
    {   name: "MOD",
        type: EValueType.Integer,
        arguments: [
            {   name: "int1",
                type: EValueType.Integer
            },
            {   name: "int2",
                type: EValueType.Integer
            }
        ],
    },
    {   name: "NUMVAL",
        type: EValueType.Numeric,
        arguments: [
            {   name: "string",
                type: EValueType.Alphanumeric
            }
        ],
    },
    {   name: "NUMVAL-C",
        type: EValueType.Numeric,
        arguments: [
            {   name: "string",
                type: EValueType.Alphanumeric
            },
            {   name: "currency",
                type: EValueType.Alphanumeric
            }
        ],
    },
    {   name: "ORD",
        type: EValueType.Integer,
        arguments: [
            {   name: "char",
                type: EValueType.Alphanumeric
            }
        ],
    },
    {   name: "ORD-MAX",
        type: EValueType.Integer,
        arguments: [
            {   name: "arg",
                type: EValueType.Any,
                tail: true,
            }
        ],
    },
    {   name: "ORD-MIN",
        type: EValueType.Integer,
        arguments: [
            {   name: "arg",
                type: EValueType.Any,
                tail: true,
            }
        ],
    },
    {   name: "PRESENT-VALUE",
        type: EValueType.Numeric,
        arguments: [
            {   name: "rate",
                type: EValueType.Numeric,
            },
            {   name: "amt",
                type: EValueType.Numeric,
                tail: true,
            }
        ],
    },
    {   name: "RANDOM",
        type: EValueType.Numeric,
        arguments: [
            {   name: "seed",
                type: EValueType.Integer,
                optional: true,
            }
        ],
    },
    {   name: "RANGE",
        type: [EValueType.Numeric, EValueType.Integer],
        arguments: [
            {   name: "num",
                type: [EValueType.Numeric, EValueType.Integer],
                tail: true,
            }
        ],
    },
    {   name: "REM",
        type: EValueType.Numeric,
        arguments: [
            {   name: "dividend",
                type: [EValueType.Numeric, EValueType.Integer],
            },
            {   name: "divider",
                type: [EValueType.Numeric, EValueType.Integer],
            }
        ],
    },
    {   name: "REVERSE",
        type: EValueType.Alphanumeric,
        arguments: [
            {   name: "string",
                type: EValueType.Alphanumeric,
            }
        ],
    },
    {   name: "SIN",
        type: EValueType.Numeric,
        arguments: [
            {   name: "angle",
                type: EValueType.Numeric,
            }
        ],
    },
    {   name: "SQRT",
        type: EValueType.Numeric,
        arguments: [
            {   name: "num",
                type: [EValueType.Numeric, EValueType.Integer],
            }
        ],
    },
    {   name: "STANDARD-DEVIATION",
        type: EValueType.Numeric,
        arguments: [
            {   name: "arg",
                type: [EValueType.Numeric, EValueType.Integer],
                tail: true,
            }
        ],
    },
    {   name: "SUM",
        type: [EValueType.Numeric, EValueType.Integer],
        arguments: [
            {   name: "arg",
                type: [EValueType.Numeric, EValueType.Integer],
                tail: true,
            }
        ],
    },
    {   name: "TAN",
        type: EValueType.Numeric,
        arguments: [
            {   name: "arg",
                type: [EValueType.Numeric, EValueType.Integer],
            }
        ],
    },
    {   name: "TEST-DATE-YYYYMMDD",
        type: EValueType.Integer,
        arguments: [
            {   name: "date",
                type: EValueType.Integer,
            }
        ],
    },
    {   name: "TEST-DAY-YYYYDDD",
        type: EValueType.Integer,
        arguments: [
            {   name: "day",
                type: EValueType.Integer,
            }
        ],
    },
    {   name: "UPPER-CASE",
        type: EValueType.Alphanumeric,
        arguments: [
            {   name: "string",
                type: EValueType.Alphanumeric,
            }
        ],
    },
    {   name: "VARIANCE",
        type: EValueType.Numeric,
        arguments: [
            {   name: "arg",
                type: [EValueType.Integer, EValueType.Numeric],
                tail: true,
            }
        ],
    },
    {   name: "WHEN-COMPILED",
        type: EValueType.Alphanumeric,
    },
    {   name: "YEAR-TO-YYYY",
        type: EValueType.Integer,
        arguments: [
            {   name: "date",
                type: EValueType.Integer,
            },
            {   name: "add-year",
                type: EValueType.Integer,
                optional: true,
            }
        ],
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
            {   name: "ALPHABETIC-LOWER",
                type: CLASS_Symbol,
            },
            {   name: "ALPHABETIC-UPPER",
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
