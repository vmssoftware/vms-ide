import * as vscode from 'vscode';
import * as nls from "vscode-nls";

import { LogFunction, LogType } from "../common/main";
import { GetConfigHelperFromApi } from '../ext-api/ext-api';
import { languages, window, workspace, TextDocument, TextDocumentChangeEvent, Range, Diagnostic, DiagnosticSeverity, TextEditorSelectionChangeEvent, TextEditor } from 'vscode';
import { MsgFacade, DiagnosticType } from './Facade';
import { MsgCompletionItemProvider } from './CompletionProvider';
import { MsgHoverProvider } from './HoverProvider';
import { MsgDefinitionProvider } from './DefinitionProvider';
import { MsgRenameProvider } from './RenameProvider';

const locale = vscode.env.language;
const localize = nls.config({ locale, messageFormat: nls.MessageFormat.both })();

const MSG = { language: 'msg', scheme: 'file' };

//public _(\w+): (\w+);
//public _$1?: $2;

export async function activate(context: vscode.ExtensionContext) {

    const configApi = await GetConfigHelperFromApi();
    if (!configApi) {
        window.showErrorMessage(localize("config.notfound", "Could not find vmssoftware.config-helper extension."));
        return;
    }

    const logFn = configApi.createLogFunction("VMS-IDE");

    const backend = new MsgFacade(logFn);
    const diagnosticCollection = languages.createDiagnosticCollection(MSG.language);

    const DiagnosticTypeMap: Map<DiagnosticType, DiagnosticSeverity> = new Map();
    DiagnosticTypeMap.set(DiagnosticType.Hint, DiagnosticSeverity.Hint);
    DiagnosticTypeMap.set(DiagnosticType.Info, DiagnosticSeverity.Information);
    DiagnosticTypeMap.set(DiagnosticType.Warning, DiagnosticSeverity.Warning);
    DiagnosticTypeMap.set(DiagnosticType.Error, DiagnosticSeverity.Error);

    // Load interpreter + cache data for each open document, if there's any.
    for (let document of workspace.textDocuments) {
        if (document.languageId === MSG.language) {
            // parse file and show diagnostics
            backend.attach(document.uri.fsPath, document.getText());
            processDiagnostic(document);
        }
    }

    context.subscriptions.push(languages.registerHoverProvider(MSG, new MsgHoverProvider(backend)));
    context.subscriptions.push(languages.registerDefinitionProvider(MSG, new MsgDefinitionProvider(backend)));

    // context.subscriptions.push(languages.registerDocumentSymbolProvider(MSG, new MsgSymbolProvider(backend)));
    // const codeLensProvider = new MsgCodeLensProvider(backend);
    // context.subscriptions.push(languages.registerCodeLensProvider(MSG, codeLensProvider));
    context.subscriptions.push(languages.registerCompletionItemProvider(MSG, new MsgCompletionItemProvider(backend),
        ".", " "));
    // context.subscriptions.push(languages.registerDocumentRangeFormattingEditProvider(MSG, new MsgFormattingProvider(backend)));
    context.subscriptions.push(languages.registerRenameProvider(MSG, new MsgRenameProvider(backend)));

    //----- Events -----

    workspace.onDidOpenTextDocument((document: TextDocument) => {
        if (document.languageId === MSG.language && document.uri.scheme === MSG.scheme) {
            backend.attach(document.uri.fsPath, document.getText());
        }
    });

    workspace.onDidCloseTextDocument((document: TextDocument) => {
        if (document.languageId === MSG.language && document.uri.scheme === MSG.scheme) {
            backend.detach(document.uri.fsPath);
            diagnosticCollection.set(document.uri, []);
        }
    });

    const changeTimers: Map<string, any> = new Map();   // Keyed by file name.

    workspace.onDidChangeTextDocument((event: TextDocumentChangeEvent) => {
        if (event.contentChanges.length > 0
            && event.document.languageId === MSG.language
            && event.document.uri.scheme === MSG.scheme) {

            let fileName = event.document.fileName;
            backend.setText(fileName, event.document.getText());
            if (changeTimers.has(fileName)) {
                clearTimeout(changeTimers.get(fileName));
            }
            changeTimers.set(fileName, setTimeout(() => {
                changeTimers.delete(fileName);
                backend.reparse(fileName);

                processDiagnostic(event.document);
                //codeLensProvider.refresh();
            }, 200));  // wait before reparse and process diagnostics
        }
    });

    workspace.onDidSaveTextDocument((document: TextDocument) => {
        if (document.languageId === MSG.language && document.uri.scheme === MSG.scheme) {
            // regenerateBackgroundData(document);
        }
    });

    window.onDidChangeTextEditorSelection((event: TextEditorSelectionChangeEvent) => {
        if (event.textEditor.document.languageId === MSG.language && event.textEditor.document.uri.scheme === MSG.scheme) {
            // diagramProvider.update(event.textEditor);
            // atnGraphProvider.update(event.textEditor, false);
            // actionsProvider.update(event.textEditor);
        }
    });

    window.onDidChangeActiveTextEditor((editor?: TextEditor) => {
        // updateTreeProviders(editor.document);
    });

    function processDiagnostic(document: TextDocument) {
        let diagnostics = [];
        let entries = backend.getDiagnostics(document.fileName);
        for (let entry of entries) {
            let startRow = entry.range.start.row === 0 ? 0 : entry.range.start.row - 1;
            let endRow = entry.range.end.row === 0 ? 0 : entry.range.end.row - 1;
            let range = new Range(startRow, entry.range.start.column, endRow, entry.range.end.column);
            let diagnostic = new Diagnostic(range, entry.message, DiagnosticTypeMap.get(entry.type));
            diagnostics.push(diagnostic);
        }
        diagnosticCollection.set(document.uri, diagnostics);
    }
}

export function deactivate() {
    // do nothing
}