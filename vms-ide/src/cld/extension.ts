import * as nls from "vscode-nls";

import { GetConfigHelperFromApi } from '../ext-api/ext-api';
import { Range, DiagnosticSeverity, env, ExtensionContext, window, workspace, languages, TextDocument, TextDocumentChangeEvent, TextEditorSelectionChangeEvent, TextEditor, Diagnostic } from 'vscode';
import { CldFacade, DiagnosticType } from "./Facade";
import { CldHoverProvider } from "./HoverProvider";
import { CldRenameProvider } from "./RenameProvider";
import { CldCompletionItemProvider } from "./CompletionProvider";
import { CldDefinitionProvider } from "./DefinitionProvider";
import { CldReferenceProvider } from "./ReferenceProvider";

const locale = env.language;
const localize = nls.config({ locale, messageFormat: nls.MessageFormat.both })();

const CLD = { language: 'cld', scheme: 'file' };

export async function activate(context: ExtensionContext) {

    const configApi = await GetConfigHelperFromApi();
    if (!configApi) {
        window.showErrorMessage(localize("config.notfound", "Cannot find vmssoftware.config-helper extension"));
        return;
    }

    const logFn = configApi.createLogFunction("VMS-IDE CLD");

    const backend = new CldFacade(logFn);
    const diagnosticCollection = languages.createDiagnosticCollection(CLD.language);

    const DiagnosticTypeMap: Map<DiagnosticType, DiagnosticSeverity> = new Map();
    DiagnosticTypeMap.set(DiagnosticType.Hint, DiagnosticSeverity.Hint);
    DiagnosticTypeMap.set(DiagnosticType.Info, DiagnosticSeverity.Information);
    DiagnosticTypeMap.set(DiagnosticType.Warning, DiagnosticSeverity.Warning);
    DiagnosticTypeMap.set(DiagnosticType.Error, DiagnosticSeverity.Error);

    // Load interpreter + cache data for each open document, if there's any.
    for (let document of workspace.textDocuments) {
        if (document.languageId === CLD.language) {
            // parse file and show diagnostics
            backend.attach(document.uri.fsPath, document.getText());
            processDiagnostic(document);
        }
    }

    context.subscriptions.push(languages.registerHoverProvider(CLD, new CldHoverProvider(backend)));
    context.subscriptions.push(languages.registerDefinitionProvider(CLD, new CldDefinitionProvider(backend)));
    
    context.subscriptions.push(languages.registerCompletionItemProvider(CLD, new CldCompletionItemProvider(backend),
        ".", " ", "<", ">", "=", "("));
    context.subscriptions.push(languages.registerRenameProvider(CLD, new CldRenameProvider(backend)));
    context.subscriptions.push(languages.registerReferenceProvider(CLD, new CldReferenceProvider(backend)));

    //----- Events -----

    workspace.onDidOpenTextDocument((document: TextDocument) => {
        if (document.languageId === CLD.language && document.uri.scheme === CLD.scheme) {
            backend.attach(document.uri.fsPath, document.getText());
        }
    });

    workspace.onDidCloseTextDocument((document: TextDocument) => {
        if (document.languageId === CLD.language && document.uri.scheme === CLD.scheme) {
            backend.detach(document.uri.fsPath);
            diagnosticCollection.set(document.uri, []);
        }
    });

    const changeTimers: Map<string, any> = new Map();   // Keyed by file name.

    workspace.onDidChangeTextDocument((event: TextDocumentChangeEvent) => {
        if (event.contentChanges.length > 0
            && event.document.languageId === CLD.language
            && event.document.uri.scheme === CLD.scheme) {

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
        if (document.languageId === CLD.language && document.uri.scheme === CLD.scheme) {
            // regenerateBackgroundData(document);
        }
    });

    window.onDidChangeTextEditorSelection((event: TextEditorSelectionChangeEvent) => {
        if (event.textEditor.document.languageId === CLD.language && event.textEditor.document.uri.scheme === CLD.scheme) {
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
