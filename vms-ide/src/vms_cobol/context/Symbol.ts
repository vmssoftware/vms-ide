import * as vscode from 'vscode';
import { NamespaceSymbol, ScopedSymbol, Symbol } from 'antlr4-c3';

export enum ECobolSymbolKind {
    Unknown,
}

/**
 * Provides a textual expression for a native symbol kind.
 */
export function symbolDescriptionFromEnum(kind: ECobolSymbolKind): string 
{
    // Could be localized.
    switch (kind) 
    {
        case ECobolSymbolKind.Unknown:
        default:
            return "Unknown type";
    }
}

/**
 * Converts the native symbol kind to a vscode symbol kind.
 */
export function translateSymbolKind(kind: ECobolSymbolKind): vscode.SymbolKind 
{
    switch (kind) 
    {
        case ECobolSymbolKind.Unknown:
        default:
            return vscode.SymbolKind.Null;
    }
}

/**
 * Converts the native symbol kind to a vscode symbol kind.
 */
export function translateCompletionKind(kind: ECobolSymbolKind): vscode.CompletionItemKind 
{
    switch (kind) 
    {
        case ECobolSymbolKind.Unknown:
        default:
            return vscode.CompletionItemKind.Text;
    }
}

/**
 * 
 * @param kind 
 */
export function getSymbolFromKind(kind: ECobolSymbolKind) : typeof Symbol
{
    switch (kind) 
    {
        case ECobolSymbolKind.Unknown:
        default:
            return Symbol;
    }
}

/**
 * 
 * @param symbol 
 */
export function getKindFromSymbol(symbol: Symbol): ECobolSymbolKind 
{
    if (symbol instanceof Symbol) 
    {
        return ECobolSymbolKind.Unknown;
    }
    return ECobolSymbolKind.Unknown;
}

export interface INestedEntity 
{ 
    entity: Symbol; 
    nestedLevel: number; 
}

export class EntityCollection extends NamespaceSymbol 
{ 
    public unambigousEntities?: Map<string, INestedEntity | undefined>;  // strings in upper case
}

export class WithTypeReference extends ScopedSymbol 
{ 
    public typeReference?: EntityCollection;
}

export class SyntaxSymbol extends EntityCollection { }
export class TypeSymbol extends EntityCollection { }
export class BuiltInTypeSymbol extends Symbol { }
export class TypeRefSymbol extends Symbol { }
export class EntitySymbol extends Symbol { }
export class ParameterSymbol extends WithTypeReference { }
export class QualifierSymbol extends WithTypeReference { }
export class KeywordSymbol extends WithTypeReference { }
export class LabelSymbol extends Symbol { }

export class ProgramSymbol extends EntityCollection { }
export class IdentificationDivisionSymbol extends EntityCollection { }
