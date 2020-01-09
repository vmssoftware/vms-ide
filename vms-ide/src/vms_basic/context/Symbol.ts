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
    "string",
];
