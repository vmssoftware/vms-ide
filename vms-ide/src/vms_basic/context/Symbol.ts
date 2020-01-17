import * as nls from "vscode-nls";
import * as vscode from 'vscode';
import { SymbolKind } from './Facade';

 nls.config({ messageFormat: nls.MessageFormat.both });
// const localize = nls.loadMessageBundle();

/**
 * Provides a textual expression for a native symbol kind.
 */
export function symbolDescriptionFromEnum(kind: SymbolKind): string
{
    // Could be localized.
    switch (kind) 
    {
        case SymbolKind.Syntax:
            return "Syntax";
        case SymbolKind.Type:
            return "Type";
        case SymbolKind.TypeRef:
            return "Type reference";
        case SymbolKind.BuiltInType:
            return "Built-In Type";
        case SymbolKind.BuiltInFunc:
            return "Built-In Function";    
        case SymbolKind.Parameter:
            return "Parameter";
        case SymbolKind.Qualifier:
            return "Qualifier";
        case SymbolKind.Keyword:
            return "Keyword";
        case SymbolKind.Label:
            return "Label";
        case SymbolKind.Entity:
            return "Entity";
        case SymbolKind.Routine:
            return "Routine";
        case SymbolKind.RoutineDcl:
            return "Routine";
        case SymbolKind.RoutineHeader:
            return "Routine";    
        case SymbolKind.VariableDcl:
            return "Variable";
        case SymbolKind.TypeDcl:
            return "Type";
        case SymbolKind.TypeBlockDcl:
            return "Type";
        case SymbolKind.ConstDcl:
            return "Constant";
        case SymbolKind.ConstBlockDcl:
            return "Constant";
        case SymbolKind.LabelDcl:
            return "Label";
        case SymbolKind.LabelBlockDcl:
            return "Label";
        default:
            return "Unknown type";
    }
}

/**
 * Converts the native symbol kind to a vscode symbol kind.
 */
export function translateSymbolKind(kind: SymbolKind): vscode.SymbolKind 
{
    switch (kind) 
    {
        case SymbolKind.Syntax:
            return vscode.SymbolKind.Class;
        case SymbolKind.Type:
            return vscode.SymbolKind.Class;
        case SymbolKind.BuiltInType:
            return vscode.SymbolKind.Class;
        case SymbolKind.BuiltInFunc:
            return vscode.SymbolKind.Function;
        case SymbolKind.TypeRef:
            return vscode.SymbolKind.Variable;
        case SymbolKind.Parameter:
            return vscode.SymbolKind.Method;
        case SymbolKind.Qualifier:
            return vscode.SymbolKind.Method;
        case SymbolKind.Keyword:
            return vscode.SymbolKind.Method;
        case SymbolKind.Label:
            return vscode.SymbolKind.Method;
        case SymbolKind.Entity:
            return vscode.SymbolKind.Variable;
        case SymbolKind.Routine:
            return vscode.SymbolKind.Variable;
        default:
            return vscode.SymbolKind.Null;
    }
}

/**
 * Converts the native symbol kind to a vscode symbol kind.
 */
export function translateCompletionKind(kind: SymbolKind): vscode.CompletionItemKind 
{
    switch (kind) 
    {
        case SymbolKind.Syntax:
            return vscode.CompletionItemKind.Class;
        case SymbolKind.Type:
            return vscode.CompletionItemKind.Class;
        case SymbolKind.BuiltInType:
            return vscode.CompletionItemKind.Class;
        case SymbolKind.BuiltInFunc:
            return vscode.CompletionItemKind.Function;
        case SymbolKind.TypeRef:
            return vscode.CompletionItemKind.Variable;
        case SymbolKind.Parameter:
            return vscode.CompletionItemKind.Method;
        case SymbolKind.Qualifier:
            return vscode.CompletionItemKind.Method;
        case SymbolKind.Keyword:
            return vscode.CompletionItemKind.Method;
        case SymbolKind.Label:
            return vscode.CompletionItemKind.Method;
        case SymbolKind.Entity:
            return vscode.CompletionItemKind.Variable;
        case SymbolKind.Routine:
            return vscode.CompletionItemKind.Variable;
        default:
            return vscode.CompletionItemKind.Text;
    }
}

export const BuiltInValueTypes: string[] = 
[
    "integer",
    "real",
    "char",
    "boolean",
    "STRINGing",
];

export interface IBuildInFunc 
{
    name: string;
    prototype: string;
}

export const BuiltInFunctions: IBuildInFunc[] = 
[
    {   
        name: "ABS",
        prototype: "REAL = ABS (REAL)"
    },
    {   
        name: "ABS%",
        prototype: "INTEGER = ABS% (INTEGER)"
    },    
    {   
        name: "ASC",
        prototype: "INTEGER = ASC (STRING)"
    },
    {   
        name: "ASCII",
        prototype: "INTEGER = ASCII (STRING)"
    },
    {   
        name: "ATN",
        prototype: "REAL = ATN (REAL)"
    },
    {   
        name: "BUFSIZ",
        prototype: "INTEGER = BUFSIZ (chanal)"
    },
    {   
        name: "CCPOS",
        prototype: "INTEGER = CCPOS (chanal)"
    },
    {   
        name: "CHR$",
        prototype: "STRING = CHR$ (INTEGER)"
    },
    {   
        name: "COMP%",
        prototype: "INTEGER = COMP% (STRING, STRING)"
    },
    {   
        name: "COS",
        prototype: "REAL = COS (REAL)"
    },
    {   
        name: "CTRLC",
        prototype: "INTEGER = CTRLC"
    },
    {   
        name: "CVT$$",
        prototype: "STRING = CVT$$ (STRING, INTEGER)"
    },
    {   
        name: "CVT$%",
        prototype: "INTEGER = CVT$% (STRING)"
    },
    {   
        name: "CVT$F",
        prototype: "REAL = CVT$F (STRING)"
    },
    {   
        name: "CVT%$",
        prototype: "STRING = CVT%$ (INTEGER)"
    },
    {   
        name: "CVTF$",
        prototype: "STRING = CVTF$ (REAL)"
    },
    {   
        name: "DATE$",
        prototype: "STRING = DATE$ (INTEGER)"
    },
    {   
        name: "DATE4$",
        prototype: "STRING = DATE4$ (INTEGER)"
    },
    {   
        name: "DECIMAL",
        prototype: "DECIMAL = DECIMAL (exp [, INTEGER-const1, INTEGER-const2 ] )"
    },
    {   
        name: "DET",
        prototype: "REAL = DET"
    },
    {   
        name: "DIF$",
        prototype: "STRING = DIF$ (STRING, STRING)"
    },
    {   
        name: "ECHO",
        prototype: "INTEGER = ECHO (chanal)"
    },
    {   
        name: "EDIT$",
        prototype: "STRING = EDIT$ (STRING, INTEGER)"
    },
    {   
        name: "ERL",
        prototype: "INTEGER = ERL"
    },
    {   
        name: "ERN$",
        prototype: "STRING = ERN$"
    },
    {   
        name: "ERR",
        prototype: "INTEGER = ERR"
    },
    {   
        name: "ERT$",
        prototype: "STRING = ERT$ (INTEGER)"
    },
    {   
        name: "EXP",
        prototype: "REAL = EXP (REAL)"
    },
    {   
        name: "FIX",
        prototype: "REAL = FIX (REAL)"
    },
    {   
        name: "FORMAT$",
        prototype: "STRING = FORMAT$ (exp, STRING)"
    },
    {   
        name: "FSP$",
        prototype: "STRING = FSP$ (chanal)"
    },
    {   
        name: "GETRFA",
        prototype: "rfa = GETRFA (chanal)"
    },
    {   
        name:" INKEY$",
        prototype: "STRING = INKEY$ (chanal [ ,WAIT [ INTEGER ] ] )"
    },
    {   
        name: "INSTR",
        prototype: "INTEGER = INSTRING (INTEGER , STRING, STRING)"
    },
    {   
        name: "INT",
        prototype: "REAL = INTEGER (REAL)"
    },
    {   
        name: "INTEGER",
        prototype: "INTEGER = INTEGEREGER (exp [, BYTE | , WORD | , LONG | , QUAD])"
    },
    {   
        name: "LBOUND",
        prototype: "number = LBOUND (array-name [ , INTEGER ])"
    },
    {   
        name: "LEFT",
        prototype: "STRING = LEFT (STRING, INTEGER)"
    },
    {   
        name: "LEFT$",
        prototype: "STRING = LEFT$ (STRING, INTEGER)"
    },
    {   
        name: "LEN",
        prototype: "INTEGER = LEN (STRING)"
    },
    {   
        name: "LOC",
        prototype: "INTEGER = LOC (variable | routine)"
    },
    {   
        name: "LOG",
        prototype: "REAL = LOG (REAL)"
    },
    {   
        name: "LOG10",
        prototype: "REAL = LOG10 (REAL)"
    },
    {   
        name: "MAG",
        prototype: "variable = MAG (exp)"
    },
    {   
        name: "MAGTAPE",
        prototype: "INTEGER = MAGTAPE (func-code, INTEGER, chanal)"
    },
    {   
        name: "MAR",
        prototype: "INTEGER = MAR (chanal)"
    },
    {   
        name: "MAR%",
        prototype: "INTEGER = MAR% (chanal)"
    },
    {   
        name: "MAX",
        prototype: "number = MAX ( number , number [ , num3 ,... ] )"
    },
    {   
        name: "MID",
        prototype: "STRING = MID (STRING, INTEGER, INTEGER)"
    },
    {   
        name: "MID$",
        prototype: "STRING = MID$ (STRING, INTEGER, INTEGER)"
    },
    {   
        name: "MIN",
        prototype: "number = MIN ( number, number [ , num3 ,... ] )"
    },
    {   
        name: "MOD",
        prototype: "number = MOD ( number, number )"
    },
    {   
        name: "NOECHO",
        prototype: "INTEGER = NOECHO (chanal)"
    },
    {   
        name: "NUM",
        prototype: "INTEGER = NUM"
    },
    {   
        name: "NUM2",
        prototype: "INTEGER = NUM2"
    },
    {   
        name: "NUM$",
        prototype: "STRING = NUM$ (number)"
    },
    {   
        name: "NUM1$",
        prototype: "STRING = NUM1$ (number)"
    },
    {   
        name: "PLACE$",
        prototype: "STRING = PLACE$ (STRING, INTEGER)"
    },
    {   
        name: "POS",
        prototype: "INTEGER = POS (STRING, STRING, INTEGER)"
    },
    {   
        name: "PROD$",
        prototype: "STRING = PROD$ (STRING, STRING, INTEGER)"
    },
    {   
        name: "QUO$",
        prototype: "STRING = QUO$ (STRING, STRING, INTEGER)"
    },
    {   
        name: "RAD$",
        prototype: "STRING = RAD$ (INTEGER)"
    },
    {   
        name: "RCTRLC",
        prototype: "INTEGER = RCTRLC"
    },
    {   
        name: "RCTRLO",
        prototype: "INTEGER = RCTRLO (chanal)"
    },
    {   
        name: "REAL",
        prototype: "REAL = REAL (exp [, SINGLE | , DOUBLE | , GFLOAT | , SFLOAT | , TFLOAT | , XFLOAT | , HFLOAT])"
    },
    {   
        name: "RECOUNT",
        prototype: "INTEGER = RECOUNT"
    },
    {   
        name: "RIGHT",
        prototype: "STRING = RIGHT (STRING, INTEGER)"
    },
    {   
        name: "RIGHT$",
        prototype: "STRING = RIGHT$ (STRING, INTEGER)"
    },
    {   
        name: "RMSSTATUS",
        prototype: "LONG = RMSSTATUS ( chanal  {, STATUS | , VALUE})"
    },
    {   
        name: "RND",
        prototype: "REAL = RND"
    },
    {   
        name: "SEG$",
        prototype: "STRING = SEG$ (STRING, INTEGER, INTEGER)"
    },
    {   
        name: "SGN",
        prototype: "INTEGER = SGN (REAL)"
    },
    {   
        name: "SIN",
        prototype: "REAL = SIN (REAL)"
    },
    {   
        name: "SPACE$",
        prototype: "STRING = SPACE$ (INTEGER)"
    },
    {   
        name: "SQRT",
        prototype: "REAL = SQRT (REAL)"
    },
    {   
        name: "SQR",
        prototype: "REAL = SQR (REAL)"
    },
    {   
        name: "STATUS",
        prototype: "INTEGER = STATUS"
    },
    {   
        name: "STR$",
        prototype: "STRING = STR$ (number)"
    },
    {   
        name: "STRING$",
        prototype: "STRING = STRING$ (INTEGER, INTEGER)"
    },
    {   
        name: "SUM$",
        prototype: "STRING = SUM$ (STRING, STRING)"
    },
    {   
        name: "SWAP%",
        prototype: "INTEGER = SWAP% (INTEGER)"
    },
    {   
        name: "TAB",
        prototype: "STRING = TAB (INTEGER)"
    },
    {   
        name: "TAN",
        prototype: "REAL = TAN (REAL)"
    },
    {   
        name: "TIME",
        prototype: "REAL = TIME (INTEGER)"
    },
    {   
        name: "TIME$",
        prototype: "STRING = TIME$ (INTEGER)"
    },
    {   
        name: "TRM$",
        prototype: "STRING = TRM$ (STRING)"
    },
    {   
        name: "UBOUND",
        prototype: "number = UBOUND (array-name [ , INTEGER ] )"
    },
    {   
        name: "VAL",
        prototype: "REAL = VAL (STRING)"
    },
    {   
        name: "VAL% ",
        prototype: "INTEGER = VAL% (STRING)"
    },
    {   
        name: "VMSSTATUS",
        prototype: "INTEGER = VMSSTATUS"
    },
    {   
        name: "XLATE",
        prototype: "STRING = XLATE (STRING, STRING)"
    },
    {   
        name: "XLATE$",
        prototype: "STRING = XLATE$ (STRING, STRING)"
    }
];
