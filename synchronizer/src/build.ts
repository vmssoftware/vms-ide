import fs from "fs";
import path from "path";
import util from "util";
import { Diagnostic, DiagnosticCollection, DiagnosticSeverity, ExtensionContext, languages, Range, Uri, window, workspace } from "vscode";

import { ftpPathSeparator } from "./common/find-files";
import { LogType } from "./common/log-type";
import { parseCxxOutput } from "./common/parse-output";
import { printLike } from "./common/print-like";
import { ConnectConfigResolverImpl } from "./config-resolve/connect-config-resolver-impl";
import { PasswordVscodeFiller } from "./config-resolve/password-vscode-filler";
import { IConfig } from "./config/config";
import { ConnectionSection } from "./config/sections/connection";
import { ProjectSection } from "./config/sections/project";
import { WorkspaceSection } from "./config/sections/workspace";
import { EnsureSettings } from "./ensure-settings";
import { ToOutputChannel } from "./output-channel";
import { ParseWelcomeVms } from "./stream/parse-welcome-vms";
import { PromptCatcherVms } from "./stream/prompt-catcher-vms";
import { SshShell } from "./stream/ssh-shell";
import { FsSource } from "./sync/fs-source";
import { VmsPathConverter } from "./vms/vms-path-converter";

const createNewMmsString = "Create new MMS";  // TODO: localize
const fsReadFile = util.promisify(fs.readFile);
const defMmsFileName = "res/default.mms";
const mmsCmd = printLike`MMS/EXTENDED_SYNTAX/DESCR=${"default.mms"}` +
                        `/MACRO=(` +
                        `"DEBUG=${"1 or empty"}",` +
                        `"INCLUDES=${"include files comma-separated list"}",` +
                        `"SOURCES=${"source files comma-separated list"}",` +
                        `"OUT_NAME=${"executable name without extension"}")`;
const mmsExt = ".mms";
const comExt = ".com";
const defRange = new Range(0, 0, 0, 0);

let projectRoot: string | undefined;
let shellRootConverter: VmsPathConverter | undefined;
let collection: DiagnosticCollection | undefined;

export async function getShellRoot(shell: SshShell, debugLog?: LogType) {
    if (shell) {
        const answer = await shell.execCmd(`WRITE SYS$OUTPUT F$TRNLNM("SYS$LOGIN")`);
        if (answer) {
            const converter = VmsPathConverter.fromVms(answer.split("\n")[1].trim());
            shellRootConverter = converter;
            if (debugLog) {
                debugLog(shellRootConverter.initial);
            }
        }
    }
}

export async function createDefMms(context: ExtensionContext, debugLog?: LogType) {
    const defMmsPath = context.asAbsolutePath(defMmsFileName);
    const content = await fsReadFile(defMmsPath).then((buff) => buff.toString("utf8")).catch(() => "! new MMS");
    return workspace.openTextDocument({language: "mms",  content})
        .then((doc) => {
            return window.showTextDocument(doc)
                .then(() => true);
        });
}

export async function parseProblems(output: string) {
    let cwd = "";
    if (shellRootConverter && projectRoot) {
        cwd = shellRootConverter.initial + projectRoot + ftpPathSeparator;
        cwd = cwd.toUpperCase();
    }
    const result = parseCxxOutput(output);
    if (!collection) {
        collection = languages.createDiagnosticCollection("open-vms.build");
    }
    collection.clear();
    for (const entry of result) {
        if (entry.message) {
            const diagnostic = new Diagnostic(defRange, entry.message);
            if (entry.file &&
                entry.line &&
                entry.pos) {
                diagnostic.range = new Range(entry.line - 1, entry.pos - 1, entry.line - 1, entry.pos);
            }
            switch (entry.severity) {
                case "error":
                    diagnostic.severity = DiagnosticSeverity.Error;
                    break;
                case "information":
                default:
                    diagnostic.severity = DiagnosticSeverity.Information;
                    break;
            }
            let uri = workspace.workspaceFolders![0].uri;
            if (entry.file) {
                if (cwd && entry.file.toUpperCase().startsWith(cwd)) {
                    entry.file = entry.file.slice(cwd.length);
                }
                uri = Uri.file(path.join(workspace.workspaceFolders![0].uri.fsPath, entry.file));
            }
            let diagArr = collection.get(uri);
            diagArr = diagArr || [] as Diagnostic[];
            diagArr.push(diagnostic);
            collection.set(uri, diagArr);
        }
    }
    return true;
}

export async function runRemoteBuild(config: IConfig, file: string, debugLog?: LogType) {
    let command: string | undefined;
    let output: string | undefined;
    let shell: SshShell | undefined;
    if (await prepare() && shell) {
        // get shell root
        await getShellRoot(shell, debugLog);
        // set default directory
        const converter = new VmsPathConverter(projectRoot + ftpPathSeparator + file);
        const cd = `set def ${converter.directory}`;
        await shell.execCmd(cd);    // TODO: check response errors
        // decide how to run
        if (file.toLowerCase().endsWith(mmsExt)) {
            // command = mmsCmd(converter.file, "1", );  // debug = 1
        } else if (file.toLowerCase().endsWith(comExt)) {
            command = "@" + converter.file;
        } else {
            command = converter.file;
        }
        // run if decided
        if (command) {
            output = await shell.execCmd(command);
            if (output) {
                // parse
                return parseProblems(output);
            } else {
                ToOutputChannel(`Cannot execute > ${command}`);
                return false;
            }
        }
    }
    return false;

    async function prepare() {
        // get current config
        if (!await EnsureSettings(config)) {
            return false;
        }
        const [connectionSection,
               projectSection,
               workspaceSection] = await Promise.all(
                   [config.get(ConnectionSection.section),
                    config.get(ProjectSection.section),
                    config.get(WorkspaceSection.section)]);
        // check if all are ready to create variables
        if (ConnectionSection.is(connectionSection) &&
            ProjectSection.is(projectSection) &&
            WorkspaceSection.is(workspaceSection)) {
            projectRoot = projectSection.root;
            const fillers = [new PasswordVscodeFiller()];
            const resolver = new ConnectConfigResolverImpl(fillers, workspaceSection.feedbackTimeout, debugLog);
            const welcome = new ParseWelcomeVms(workspaceSection.welcomeTimeout, debugLog);
            const prompter = new PromptCatcherVms("", debugLog);
            shell = new SshShell(connectionSection, resolver, welcome, prompter, debugLog);
            return true;
        }
        return false;
    }
}

export async function BuildProject(context: ExtensionContext, config: IConfig, debugLog?: LogType) {
    // get current config
    if (!await EnsureSettings(config)) {
        return false;
    }
    const projectSection = await config.get(ProjectSection.section);
    // get current values
    const project = projectSection ? projectSection.store() : undefined;
    if (ProjectSection.is(project) &&
        workspace.workspaceFolders &&
        workspace.workspaceFolders.length > 0) {
        // get list of builders
        const localSource = new FsSource(workspace.workspaceFolders[0].uri.fsPath, debugLog);
        const items = await localSource.findFiles(project.builders, project.exclude);
        const selectItems = items.map((file) => file.filename);
        selectItems.push(createNewMmsString);
        // select one
        const buildSelection = await window.showQuickPick(selectItems, { ignoreFocusOut: true, canPickMany: false});
        // create one if selected
        if (buildSelection === createNewMmsString) {
            return createDefMms(context)
                .catch((err) => {
                    if (debugLog) {
                        debugLog(err);
                    }
                    return false;
                });
        }
        // run and parse output
        if (buildSelection) {
            return runRemoteBuild(config, buildSelection, debugLog);
        } else {
            return false;
        }
    } else {
        ToOutputChannel(`Cannot resolve configuration or current workspace folder`);
        return false;
    }
}
