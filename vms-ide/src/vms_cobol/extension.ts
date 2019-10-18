'use strict';
import * as nls from "vscode-nls";

import {
    Range, DiagnosticSeverity, env, ExtensionContext, window,
    workspace, languages, TextDocument, TextDocumentChangeEvent,
    TextEditorSelectionChangeEvent, TextEditor, Diagnostic,
    StatusBarItem, StatusBarAlignment
} from 'vscode';

import { EDiagnosticType, FacadeImpl } from "../common/parser/Facade";
import { CobolSourceContext } from "./context/CobolSourceContext";
import { GetConfigHelperFromApi } from "../ext-api/ext-api";
import { LogFunction } from "../common/main";
import { HoverProviderImpl } from "../common/parser/HoverProvider";
import { DefinitionProviderImpl } from "../common/parser/DefinitionProvider";
import { RenameProviderImpl } from "../common/parser/RenameProvider";
import { CompletionItemProviderImpl } from "../common/parser/CompletionProvider";

const locale = env.language;
const localize = nls.config({ locale, messageFormat: nls.MessageFormat.both })();

export const Cobol = { language: 'vms-cobol', scheme: 'file' };

export async function activate(context: ExtensionContext) {
    const diagnosticCollection = languages.createDiagnosticCollection(Cobol.language);

    const DiagnosticTypeMap: Map<EDiagnosticType, DiagnosticSeverity> = new Map();
    DiagnosticTypeMap.set(EDiagnosticType.Hint, DiagnosticSeverity.Hint);
    DiagnosticTypeMap.set(EDiagnosticType.Info, DiagnosticSeverity.Information);
    DiagnosticTypeMap.set(EDiagnosticType.Warning, DiagnosticSeverity.Warning);
    DiagnosticTypeMap.set(EDiagnosticType.Error, DiagnosticSeverity.Error);

    let barMessage: StatusBarItem = window.createStatusBarItem(StatusBarAlignment.Left);
    barMessage.text = `$(bug) ${"Loading ..."}`;
    barMessage.show();

    const configApi = GetConfigHelperFromApi();
    if (!configApi) {
        window.showErrorMessage(localize("config.notfound", "Cannot find vmssoftware.config-helper extension"));
        return;
    }

    const logFn = configApi.createLogFunction("VMS-IDE");

    const backend = new FacadeImpl((fileName: string, logFn?: LogFunction) => new CobolSourceContext(fileName, logFn), logFn);

    // Load interpreter + cache data for each open document, if there's any.
    for (let document of workspace.textDocuments) {
        if (document.languageId === Cobol.language) {
            // parse file and show diagnostics
            backend.attach(document.uri.fsPath, document.getText());
            processDiagnostic(document);
        }
    }

    barMessage.hide();

    context.subscriptions.push(languages.registerHoverProvider(Cobol, new HoverProviderImpl(backend)));
    context.subscriptions.push(languages.registerDefinitionProvider(Cobol, new DefinitionProviderImpl(backend)));
    context.subscriptions.push(languages.registerRenameProvider(Cobol, new RenameProviderImpl(backend)));
    context.subscriptions.push(languages.registerCompletionItemProvider(Cobol, new CompletionItemProviderImpl(backend),
         ".", " ", "<", ">", "=", "("));
    // context.subscriptions.push(languages.registerReferenceProvider(Cobol, new ReferenceProviderImpl(backend)));

    //----- Events -----

    // workspace.onDidOpenTextDocument((document: TextDocument) => {
    //     if (document.languageId === Cobol.language && document.uri.scheme === Cobol.scheme) {
    //         backend.attach(document.uri.fsPath, document.getText());
    //         processDiagnostic(document);
    //     }
    // });

    workspace.onDidCloseTextDocument((document: TextDocument) => {
        if (document.languageId === Cobol.language && document.uri.scheme === Cobol.scheme) {
            backend.detach(document.uri.fsPath);
            diagnosticCollection.set(document.uri, []);
        }
    });

    const changeTimers: Map<string, any> = new Map();   // Keyed by file name.

    workspace.onDidChangeTextDocument((event: TextDocumentChangeEvent) => {
        if (event.contentChanges.length > 0
            && event.document.languageId === Cobol.language
            && event.document.uri.scheme === Cobol.scheme) {
            let fileName = event.document.fileName;
            backend.setText(fileName, event.document.getText());

            if (changeTimers.has(fileName)) {
                clearTimeout(changeTimers.get(fileName));
            }

            changeTimers.set(fileName, setTimeout(() => {
                changeTimers.delete(fileName);
                backend.reparse(fileName);
                processDiagnostic(event.document);
            }, 300));  // wait before reparse and process diagnostics
        }
    });

    workspace.onDidSaveTextDocument((document: TextDocument) => {
        if (document.languageId === Cobol.language && document.uri.scheme === Cobol.scheme) {
            // regenerateBackgroundData(document);
        }
    });

    window.onDidChangeTextEditorSelection((event: TextEditorSelectionChangeEvent) => {
        if (event.textEditor.document.languageId === Cobol.language && event.textEditor.document.uri.scheme === Cobol.scheme) {
            // actionsProvider.update(event.textEditor);
        }
    });

    window.onDidChangeActiveTextEditor((editor?: TextEditor) => {
        if(editor)
        {
            if (editor.document.languageId === Cobol.language && editor.document.uri.scheme === Cobol.scheme) 
            {
                backend.setText(editor.document.fileName, editor.document.getText());
                backend.reparse(editor.document.fileName);
                processDiagnostic(editor.document);
            }
        }
    });

    /**
     * All coordinates in diagnostic must be zero-based
     * @param document 
     */
    function processDiagnostic(document: TextDocument) {
        let diagnostics = [];
        backend.setText(document.fileName, document.getText());
        let entries = backend.getDiagnostics(document.fileName);

        for (let entry of entries) {
            let range = new Range(entry.range.start.row, entry.range.start.column, entry.range.end.row, entry.range.end.column);
            let diagnostic = new Diagnostic(range, entry.message, DiagnosticTypeMap.get(entry.type));
            diagnostics.push(diagnostic);
        }

        diagnosticCollection.set(document.uri, diagnostics);
    }
}

// this method is called when your extension is deactivated
export function deactivate() {
}