'use strict';
//import * as nls from "vscode-nls";

import { Range, DiagnosticSeverity, env, ExtensionContext, window, 
    workspace, languages, TextDocument, TextDocumentChangeEvent,
    TextEditorSelectionChangeEvent, TextEditor, Diagnostic,
    StatusBarItem, StatusBarAlignment } from 'vscode';
import { Facade, DiagnosticType } from "./context/Facade";
import { BasicHoverProvider } from "./providers/HoverProvider";
import { BasicRenameProvider } from "./providers/RenameProvider";
import { BasicCompletionItemProvider } from "./providers/CompletionProvider";
import { BasicDefinitionProvider } from "./providers/DefinitionProvider";
import { BasicReferenceProvider } from "./providers/ReferenceProvider";
import { ConfigManager } from "./ext_api/config_manager";
import * as vscode from "vscode";

//const locale = env.language;
//const localize = nls.config({ locale, messageFormat: nls.MessageFormat.both })();

export const Basic = { language: 'vms-basic', scheme: 'file' };
const diagnosticCollection = languages.createDiagnosticCollection(Basic.language);
const DiagnosticTypeMap: Map<DiagnosticType, DiagnosticSeverity> = new Map();
let backend: Facade;


export async function activate(context: ExtensionContext) 
{
    context.subscriptions.push(vscode.commands.registerCommand('extension.vms-basic.reparse', () =>
	{
		reparseProject();
    }));

    DiagnosticTypeMap.set(DiagnosticType.Hint, DiagnosticSeverity.Hint);
    DiagnosticTypeMap.set(DiagnosticType.Info, DiagnosticSeverity.Information);
    DiagnosticTypeMap.set(DiagnosticType.Warning, DiagnosticSeverity.Warning);
    DiagnosticTypeMap.set(DiagnosticType.Error, DiagnosticSeverity.Error);

    await reparseProject();

    context.subscriptions.push(languages.registerHoverProvider(Basic, new BasicHoverProvider(backend)));
    context.subscriptions.push(languages.registerDefinitionProvider(Basic, new BasicDefinitionProvider(backend)));    
    context.subscriptions.push(languages.registerCompletionItemProvider(Basic, new BasicCompletionItemProvider(backend),
        ".", " ", "<", ">", "=", "("));
    context.subscriptions.push(languages.registerRenameProvider(Basic, new BasicRenameProvider(backend)));
    context.subscriptions.push(languages.registerReferenceProvider(Basic, new BasicReferenceProvider(backend)));

    //----- Events -----

    workspace.onDidOpenTextDocument((document: TextDocument) => 
    {
        if (document.languageId === Basic.language && document.uri.scheme === Basic.scheme) 
        {
            backend.attach(document.uri.fsPath, document.getText());
            processDiagnostic(document);
        }
    });

    workspace.onDidCloseTextDocument((document: TextDocument) => 
    {
        if (document.languageId === Basic.language && document.uri.scheme === Basic.scheme)
        {
            backend.detach(document.uri.fsPath);
            diagnosticCollection.set(document.uri, []);
        }
    });

    const changeTimers: Map<string, any> = new Map();   // Keyed by file name.

    workspace.onDidChangeTextDocument((event: TextDocumentChangeEvent) => 
    {
        if (event.contentChanges.length > 0
            && event.document.languageId === Basic.language
            && event.document.uri.scheme === Basic.scheme) 
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
        if (document.languageId === Basic.language && document.uri.scheme === Basic.scheme) 
        {
            // regenerateBackgroundData(document);
        }
    });

    window.onDidChangeTextEditorSelection((event: TextEditorSelectionChangeEvent) => 
    {
        if (event.textEditor.document.languageId === Basic.language && event.textEditor.document.uri.scheme === Basic.scheme) 
        {
            // actionsProvider.update(event.textEditor);
        }
    });

    window.onDidChangeActiveTextEditor((editor?: TextEditor) => 
    {
        // if(editor)
        // {
        //     if (editor.document.languageId === Basic.language && editor.document.uri.scheme === Basic.scheme) 
        //     {
        //         backend.setText(editor.document.fileName, editor.document.getText());
        //         backend.reparse(editor.document.fileName);
        //     }
        // }
    });
}

async function reparseProject() : Promise<void>
{
    let barMessage: StatusBarItem =  window.createStatusBarItem(StatusBarAlignment.Left);
    barMessage.text = `$(sync) ${"parsing ..."}`;
    barMessage.show();

    let sourcePaths: string[] = [];
    let rootFolderName: string = "";
    let rootFolderNames = new Array<string>();
    let configManager = new ConfigManager(rootFolderName);

    if(vscode.workspace.workspaceFolders)
    {
        let listFolders = await configManager.getDependencyList();

        if(listFolders)
        {
            for(let folder of listFolders)
            {
                let path = "";

                for(let item of vscode.workspace.workspaceFolders)
                {
                    if(item.name === folder)
                    {
                        path = item.uri.fsPath;
                        rootFolderNames.push(path);
                        break;
                    }
                }

                if(path !== "")
                {
                    let fileM = new ConfigManager(folder);
                    let sectionCur = await fileM.getProjectSection();

                    if (sectionCur)
                    {
                        let sources = await fileM.loadPathListFiles(sectionCur.source);
                        addPathToFiles(sourcePaths, path, sources);
                    }
                }
            }
        }
    }

    if(backend)
    {
        backend.setParameters(sourcePaths, rootFolderNames);
    }
    else
    {
        backend = new Facade(sourcePaths, rootFolderNames);
    }

    // Load interpreter + cache data for each open document, if there's any.
    for (let document of workspace.textDocuments) 
    {
        if (document.languageId === Basic.language) 
        {
            // parse file and show diagnostics
            backend.attach(document.uri.fsPath, document.getText());
            processDiagnostic(document);
        }
    }

    barMessage.hide();
}

function processDiagnostic(document: TextDocument) 
{
    let diagnostics = [];
    backend.setText(document.fileName, document.getText());
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

function addPathToFiles(sourcePaths : string[], path : string, fileNames : string[])
{
    for(let i = 0; i < fileNames.length; i++)
    {
        if(checkExtension(fileNames[i]))
        {
            fileNames[i] = path + "\\" + fileNames[i];
            sourcePaths.push(fileNames[i]);
        }
    }
}

function checkExtension(file: string) : boolean
{
    let result : boolean = false;

    let extPos = file.lastIndexOf(".");

    if(extPos !== -1)
    {
        let ext = file.substring(extPos).toLowerCase();

        if(ext === ".bas")
        {
            result = true;
        }
    }

    return result;
}

// this method is called when your extension is deactivated
export function deactivate() 
{
}