'use strict';
import * as nls from "vscode-nls";
import * as path from 'path';

import {
    Range, DiagnosticSeverity, env, ExtensionContext, window,
    workspace, languages, TextDocument, TextDocumentChangeEvent,
    TextEditorSelectionChangeEvent, TextEditor, Diagnostic,
    StatusBarItem, StatusBarAlignment, Uri
} from 'vscode';

import { EDiagnosticType, FacadeImpl } from "../common/parser/Facade";
import { CobolSourceContext } from "./context/CobolSourceContext";
import { GetConfigHelperFromApi } from "../ext-api/ext-api";
import { LogFunction } from "../common/main";
import { HoverProviderImpl } from "../common/parser/HoverProvider";
import { DefinitionProviderImpl } from "../common/parser/DefinitionProvider";
import { RenameProviderImpl } from "../common/parser/RenameProvider";
import { CompletionItemProviderImpl } from "../common/parser/CompletionProvider";
import { CopyManagerImpl } from "./stream/copymanager";
import { ICopyManager } from "./stream/cobolInputStream";
import { ReferenceProviderImpl } from "../common/parser/ReferenceProvider";

const locale = env.language;
const localize = nls.config({ locale, messageFormat: nls.MessageFormat.both })();

export const Cobol = { language: 'vms-cobol', scheme: 'file' };

const _copyManagers = new Map<string, ICopyManager>();

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

    const backend = new FacadeImpl((fileName: string, logFn?: LogFunction) => {
            let copyManager: ICopyManager | undefined;
            let wsFolder = workspace.getWorkspaceFolder(Uri.file(fileName));
            if (wsFolder) {
                copyManager = _copyManagers.get(wsFolder.name);
                if (!copyManager) {
                    copyManager = new CopyManagerImpl(wsFolder.uri.fsPath);
                    _copyManagers.set(wsFolder.name, copyManager);
                }
            }
            return new CobolSourceContext(fileName, logFn, copyManager);
        }, logFn);

    barMessage.hide();

    context.subscriptions.push(languages.registerHoverProvider(Cobol, new HoverProviderImpl(backend)));
    context.subscriptions.push(languages.registerDefinitionProvider(Cobol, new DefinitionProviderImpl(backend)));
    context.subscriptions.push(languages.registerRenameProvider(Cobol, new RenameProviderImpl(backend)));
    context.subscriptions.push(languages.registerCompletionItemProvider(Cobol, new CompletionItemProviderImpl(backend),
         ".", " ", "<", ">", "=", "("));
    context.subscriptions.push(languages.registerReferenceProvider(Cobol, new ReferenceProviderImpl(backend)));

    //----- Events -----

    workspace.onDidCloseTextDocument((document: TextDocument) => {
        if (document.languageId === Cobol.language && document.uri.scheme === Cobol.scheme) {
            backend.detach(document.uri.fsPath);
            diagnosticCollection.set(document.uri, []);
        }
    });

    const changeTimers: Map<string, NodeJS.Timer> = new Map();   // Keyed by file name.

    workspace.onDidChangeTextDocument((event: TextDocumentChangeEvent) => {
        if (event.contentChanges.length > 0) {
            // clean copy manager cache
            let fileName = event.document.fileName;
            let wsFolder = workspace.getWorkspaceFolder(Uri.file(fileName));
            if (wsFolder) {
                let copyManager = _copyManagers.get(wsFolder.name);
                if (copyManager instanceof CopyManagerImpl) {
                    if (copyManager.clearBySource(fileName)) {
                        diagnosticCollection.set(event.document.uri, []);
                        return;
                    }
                }
            }
            // post reparsing
            if (event.document.languageId === Cobol.language && event.document.uri.scheme === Cobol.scheme) {
                // with setting text
                postParse(fileName, event.document.getText());
            }
        }
    });

    workspace.onDidSaveTextDocument((document: TextDocument) => {
        // require reparse all on did save any document
        backend.setRequireReparse(true);
    });

    if (window.activeTextEditor) {
        if (window.activeTextEditor.document.languageId === Cobol.language && window.activeTextEditor.document.uri.scheme === Cobol.scheme) {
            postParse(window.activeTextEditor.document.fileName, window.activeTextEditor.document.getText());
        }
    }

    window.onDidChangeActiveTextEditor((editor?: TextEditor) => {
        if(editor) {
            if (editor.document.languageId === Cobol.language && editor.document.uri.scheme === Cobol.scheme) {
                // set text only if require reparsing
                if (backend.getContext(editor.document.fileName).requireReparse) {
                    postParse(editor.document.fileName, editor.document.getText());
                } else {
                    postParse(editor.document.fileName);
                }
            }
        }
    });

    function postParse(fileName: string, content?: string) {
        if (content) {
            backend.setText(fileName, content);
        }
        let existingTimer = changeTimers.get(fileName);
        if (existingTimer) {
            clearTimeout(existingTimer);
        }
        changeTimers.set(fileName, setTimeout(() => {
            changeTimers.delete(fileName);
            backend.parse(fileName).
                then((parsed: boolean) => {
                    if (parsed) {
                        processDiagnostic(fileName);
                    }
                }).
                catch(() => {
                    // nothing
                });
        }, 500));  // wait before reparse and process diagnostics
    }

    /**
     * All coordinates in diagnostic must be zero-based
     * @param document 
     */
    function processDiagnostic(fileName: string) {
        let diagnostics = new Map<string, Diagnostic[]>();
        diagnosticCollection.set(Uri.file(fileName), []);
        let entries = backend.getDiagnostics(fileName);

        for (let entry of entries) {
            let range = new Range(entry.range.start.row, entry.range.start.col, entry.range.end.row, entry.range.end.col);
            let diagnostic = new Diagnostic(range, entry.message, DiagnosticTypeMap.get(entry.type));
            let entryFileName = fileName;
            if (entry.source) {
                entryFileName = entry.source;
            }
            let fileDiagnostics = diagnostics.get(entryFileName);
            if (fileDiagnostics) {
                fileDiagnostics.push(diagnostic);
            } else {
                diagnostics.set(entryFileName, [diagnostic]);
            }
        }

        for (let [diagFileName, fileDiagnostics] of diagnostics) {
            diagnosticCollection.set(Uri.file(diagFileName), fileDiagnostics);
        }
    }

}

// this method is called when your extension is deactivated
export function deactivate() {
}