'use strict';
//import * as nls from "vscode-nls";

import { Range, DiagnosticSeverity, env, ExtensionContext, window, 
    workspace, languages, TextDocument, TextDocumentChangeEvent,
    TextEditorSelectionChangeEvent, TextEditor, Diagnostic } from 'vscode';
import { Facade, DiagnosticType } from "./context/Facade";
import { PascalHoverProvider } from "./providers/HoverProvider";
import { PascalRenameProvider } from "./providers/RenameProvider";
import { PascalCompletionItemProvider } from "./providers/CompletionProvider";
import { PascalDefinitionProvider } from "./providers/DefinitionProvider";
import { PascalReferenceProvider } from "./providers/ReferenceProvider";

//const locale = env.language;
//const localize = nls.config({ locale, messageFormat: nls.MessageFormat.both })();

export const Pascal = { language: 'vms-pascal', scheme: 'file' };


export async function activate(context: ExtensionContext) 
{
    const backend = new Facade();
    const diagnosticCollection = languages.createDiagnosticCollection(Pascal.language);

    const DiagnosticTypeMap: Map<DiagnosticType, DiagnosticSeverity> = new Map();
    DiagnosticTypeMap.set(DiagnosticType.Hint, DiagnosticSeverity.Hint);
    DiagnosticTypeMap.set(DiagnosticType.Info, DiagnosticSeverity.Information);
    DiagnosticTypeMap.set(DiagnosticType.Warning, DiagnosticSeverity.Warning);
    DiagnosticTypeMap.set(DiagnosticType.Error, DiagnosticSeverity.Error);

    // Load interpreter + cache data for each open document, if there's any.
    for (let document of workspace.textDocuments) 
    {
        if (document.languageId === Pascal.language) 
        {
            // parse file and show diagnostics
            backend.attach(document.uri.fsPath, document.getText());
            processDiagnostic(document);
        }
    }

    context.subscriptions.push(languages.registerHoverProvider(Pascal, new PascalHoverProvider(backend)));
    context.subscriptions.push(languages.registerDefinitionProvider(Pascal, new PascalDefinitionProvider(backend)));    
    context.subscriptions.push(languages.registerCompletionItemProvider(Pascal, new PascalCompletionItemProvider(backend),
        ".", " ", "<", ">", "=", "("));
    context.subscriptions.push(languages.registerRenameProvider(Pascal, new PascalRenameProvider(backend)));
    context.subscriptions.push(languages.registerReferenceProvider(Pascal, new PascalReferenceProvider(backend)));

    //----- Events -----

    workspace.onDidOpenTextDocument((document: TextDocument) => 
    {
        if (document.languageId === Pascal.language && document.uri.scheme === Pascal.scheme) 
        {
            backend.attach(document.uri.fsPath, document.getText());
        }
    });

    workspace.onDidCloseTextDocument((document: TextDocument) => 
    {
        if (document.languageId === Pascal.language && document.uri.scheme === Pascal.scheme)
        {
            backend.detach(document.uri.fsPath);
            diagnosticCollection.set(document.uri, []);
        }
    });

    const changeTimers: Map<string, any> = new Map();   // Keyed by file name.

    workspace.onDidChangeTextDocument((event: TextDocumentChangeEvent) => 
    {
        if (event.contentChanges.length > 0
            && event.document.languageId === Pascal.language
            && event.document.uri.scheme === Pascal.scheme) 
        {
            let fileName = event.document.fileName;
            backend.setText(fileName, event.document.getText());

            if (changeTimers.has(fileName)) 
            {
                clearTimeout(changeTimers.get(fileName));
            }

            changeTimers.set(fileName, setTimeout(() => 
            {
                changeTimers.delete(fileName);
                backend.reparse(fileName);
                processDiagnostic(event.document);
            }, 300));  // wait before reparse and process diagnostics
        }
    });

    workspace.onDidSaveTextDocument((document: TextDocument) => 
    {
        if (document.languageId === Pascal.language && document.uri.scheme === Pascal.scheme) 
        {
            // regenerateBackgroundData(document);
        }
    });

    window.onDidChangeTextEditorSelection((event: TextEditorSelectionChangeEvent) => 
    {
        if (event.textEditor.document.languageId === Pascal.language && event.textEditor.document.uri.scheme === Pascal.scheme) 
        {
            // actionsProvider.update(event.textEditor);
        }
    });

    window.onDidChangeActiveTextEditor((editor?: TextEditor) => 
    {
        // updateTreeProviders(editor.document);
    });

    function processDiagnostic(document: TextDocument) 
    {
        let diagnostics = [];
        let entries = backend.getDiagnostics(document.fileName);

        for (let entry of entries) 
        {
            let startRow = entry.range.start.row === 0 ? 0 : entry.range.start.row - 1;
            let endRow = entry.range.end.row === 0 ? 0 : entry.range.end.row - 1;
            let range = new Range(startRow, entry.range.start.column, endRow, entry.range.end.column);
            let diagnostic = new Diagnostic(range, entry.message, DiagnosticTypeMap.get(entry.type));
            diagnostics.push(diagnostic);
        }

        diagnosticCollection.set(document.uri, diagnostics);
    }
}

// this method is called when your extension is deactivated
export function deactivate() 
{
}