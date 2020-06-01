'use strict';
import * as nls from "vscode-nls";

import {
    Range, DiagnosticSeverity, env, ExtensionContext, window,
    workspace, languages, TextDocument, TextDocumentChangeEvent,
    TextEditor, Diagnostic,
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
import { ICopyManager } from "./stream/cobolInputStream";
import { ReferenceProviderImpl } from "../common/parser/ReferenceProvider";
import { CobolBackground } from "./context/CobolBackground";
import { GetCopyManager } from "./stream/CopyManagers";
import { CobolGlobals } from "./context/CobolGlobals";

const locale = env.language;
const localize = nls.config({ locale, messageFormat: nls.MessageFormat.both })();

export const Cobol = { language: 'vms-cobol', scheme: 'file' };

export async function activate(context: ExtensionContext) {

    const diagnosticCollection = languages.createDiagnosticCollection(Cobol.language);

    let involveMap = new Map<string, Set<string>>();

    function clearDiagnostics(fileName: string) {
        let involved = involveMap.get(fileName);
        if (involved) {
            for(let involvedFile of involved) {
                diagnosticCollection.set(Uri.file(involvedFile), []);
            }
        } else {
            diagnosticCollection.set(Uri.file(fileName), []);
        }
    }


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
        window.showErrorMessage(localize("config.notfound", "Could not find vmssoftware.config-helper extension."));
        return;
    }

    const logFn = configApi.createLogFunction("VMS-IDE");

    const backend = new FacadeImpl((fileName: string, logFn?: LogFunction) => {
            let copyManager: ICopyManager | undefined;
            let wsFolder = workspace.getWorkspaceFolder(Uri.file(fileName));
            if (wsFolder) {
                copyManager = GetCopyManager(wsFolder.name, wsFolder.uri.fsPath);
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
            clearDiagnostics(document.uri.fsPath);
        }
    });

    const changeTimers: Map<string, NodeJS.Timer> = new Map();   // Keyed by file name.

    workspace.onDidChangeTextDocument((event: TextDocumentChangeEvent) => {
        if (event.contentChanges.length > 0) {
            let fileName = event.document.fileName;
            CobolGlobals.removeGlobals(fileName);
            // post reparsing
            if (event.document.languageId === Cobol.language && event.document.uri.scheme === Cobol.scheme) {
                // with setting text
                postParse(fileName, event.document.getText());
            }
        }
    });

    // post current document to full parsing
    if (window.activeTextEditor) {
        if (window.activeTextEditor.document.languageId === Cobol.language && window.activeTextEditor.document.uri.scheme === Cobol.scheme) {
            postParse(window.activeTextEditor.document.fileName, window.activeTextEditor.document.getText());
        }
    }

    window.onDidChangeActiveTextEditor((editor?: TextEditor) => {
        if(editor) {
            if (editor.document.languageId === Cobol.language && editor.document.uri.scheme === Cobol.scheme) {
                let content: string | undefined;
                let context = backend.getContext(editor.document.fileName);
                if (context.requireReparse) {
                    content = editor.document.getText();
                }
                postParse(editor.document.fileName, content);
            }
        }
    });

    let documentsInParsing = 0;

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
            ++documentsInParsing;
            backend.parse(fileName).
                then(async (parsed: boolean) => {
                    // now add to globals here
                    let context = backend.getContext(fileName);
                    if (context instanceof CobolSourceContext) {
                        await CobolGlobals.addGlobals(context);
                    }
                    // process diagnostic
                    if (parsed) {
                        processDiagnostic(fileName);
                    }
                }).finally(() => {
                    --documentsInParsing;
                    if (documentsInParsing == 0 &&
                        window.activeTextEditor &&
                        window.activeTextEditor.document.fileName !== fileName &&
                        window.activeTextEditor.document.languageId === Cobol.language &&
                        window.activeTextEditor.document.uri.scheme === Cobol.scheme) {
                            // reparse without altering text, just to resolve globals
                            postParse(window.activeTextEditor.document.fileName);
                    }
                });
        }, 500));  // wait before reparse and process diagnostics
    }

    /**
     * All coordinates in diagnostic must be zero-based
     * @param document
     */
    function processDiagnostic(fileName: string) {
        let localDiagnostics = new Map<string, Diagnostic[]>();
        clearDiagnostics(fileName);
        let entries = backend.getDiagnostics(fileName);

        for (let entry of entries) {
            let range = new Range(entry.range.start.row, entry.range.start.col, entry.range.end.row, entry.range.end.col);
            let diagnostic = new Diagnostic(range, entry.message, DiagnosticTypeMap.get(entry.type));
            let entryFileName = fileName;
            if (entry.source) {
                entryFileName = entry.source;
            }
            let fileDiagnostics = localDiagnostics.get(entryFileName);
            if (fileDiagnostics) {
                fileDiagnostics.push(diagnostic);
            } else {
                localDiagnostics.set(entryFileName, [diagnostic]);
            }
        }

        let involvedFiles = new Set<string>();
        involvedFiles.add(fileName);
        for (let [diagFileName, fileDiagnostics] of localDiagnostics) {
            involvedFiles.add(diagFileName);
            diagnosticCollection.set(Uri.file(diagFileName), fileDiagnostics);
        }
        involveMap.set(fileName, involvedFiles);
    }

    // start background parsing for all COBOL source
    CobolBackground.StartBackgroundParsing(logFn);
    CobolBackground.refreshed.event(() => {
        // post current document to full parsing AGAIN
        if (window.activeTextEditor) {
            if (window.activeTextEditor.document.languageId === Cobol.language && window.activeTextEditor.document.uri.scheme === Cobol.scheme) {
                postParse(window.activeTextEditor.document.fileName, window.activeTextEditor.document.getText());
            }
        }
    });
}

// this method is called when your extension is deactivated
export function deactivate() {
}