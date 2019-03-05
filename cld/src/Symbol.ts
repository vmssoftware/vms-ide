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
    default:
      return vscode.CompletionItemKind.Text;
  }
}
