import * as nls from "vscode-nls";
import * as vscode from 'vscode';
import { SymbolKind } from './Facade';

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

/**
 * Provides a textual expression for a native symbol kind.
 */
export function symbolDescriptionFromEnum(kind: SymbolKind): string {
  // Could be localized.
  switch (kind) {
    case SymbolKind.Keyword:
      return localize("keyword", "Keyword");
    case SymbolKind.Operator:
        return localize("operator", "Operator");
    case SymbolKind.Literal:
        return localize("literal", "Literal");
    case SymbolKind.Message:
        return localize("message", "Message");
    case SymbolKind.Variable:
        return localize("variable", "Variable");
    case SymbolKind.FacilityName:
        return localize("facility", "Facility name");
    case SymbolKind.FacilityPrefix:
        return localize("prefix", "Facility prefix");
    default:
      return "Unknown type";
  }
}

/**
 * Converts the native symbol kind to a vscode symbol kind.
 */
export function translateSymbolKind(kind: SymbolKind): vscode.SymbolKind {
  switch (kind) {

    default:
      return vscode.SymbolKind.Null;
  }
}

/**
 * Converts the native symbol kind to a vscode symbol kind.
 */
export function translateCompletionKind(kind: SymbolKind): vscode.CompletionItemKind {
  switch (kind) {
    case SymbolKind.Keyword:
      return vscode.CompletionItemKind.Keyword;

    default:
      return vscode.CompletionItemKind.Text;
  }
}
