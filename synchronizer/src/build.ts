import fs from "fs";
import path from "path";
import util from "util";
import { Diagnostic, DiagnosticCollection, DiagnosticSeverity, ExtensionContext, languages, Range, Uri, window, workspace } from "vscode";

import { IConfig } from "./config/config";

import { LogType } from "@vorfol/common";
import { printLike } from "@vorfol/common";
import { ftpPathSeparator } from "@vorfol/common";

import { ProjectSection } from "./config/sections/project";
import { SynchronizeSection } from "./config/sections/synchronize";

import { ISshShell } from "./ssh/api";

import { parseVmsOutput } from "./common/parse-output";
import { GetSshHelperFromApi } from "./config/get-ssh-helper";
import { EnsureSettings, synchronizerConfig } from "./ensure-settings";
import { ToOutputChannel } from "./output-channel";
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

export async function getShellRoot(shell: ISshShell, debugLog?: LogType) {
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
    const result = parseVmsOutput(output);
    const errMap = new Map<string, Diagnostic[]>();
    for (const entry of result) {
        if (entry.message) {
            const diagnostic = new Diagnostic(defRange, entry.message);
            if (entry.line &&
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
            let diagArr = errMap.get(String(entry.file));
            diagArr = diagArr || [];
            diagArr.push(diagnostic);
            errMap.set(String(entry.file), diagArr);
        }
    }
    if (!collection) {
        collection = languages.createDiagnosticCollection("open-vms.build");
    }
    collection.clear();
    for (const [file, arrDiag] of errMap) {
        let uri = Uri.file(file);
        if (file !== String(undefined) &&
            workspace.workspaceFolders) {
            const converter = VmsPathConverter.fromVms(file);
            let localFile = converter.initial;
            if (cwd && localFile.toUpperCase().startsWith(cwd)) {
                localFile = localFile.slice(cwd.length);
            }
            uri = Uri.file(path.join(workspace.workspaceFolders[0].uri.fsPath, localFile));
        }
        collection.set(uri, arrDiag);
    }
    return true;
}

export async function runRemoteBuild(file: string, debugLog?: LogType) {
    let command: string | undefined;
    let output: string | undefined;
    let shell: ISshShell | undefined;
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
        if (!await EnsureSettings() ||
            !synchronizerConfig) {
            return false;
        }
        const sshHelperType = await GetSshHelperFromApi();
        if (!sshHelperType) {
            if (debugLog) {
                debugLog(`Cannot get ssh-helper api`);
            }
            return false;
        }
        const sshHelper = new sshHelperType(debugLog);
        const [projectSection,
               synchronizeSection] = await Promise.all(
                   [synchronizerConfig.get(ProjectSection.section),
                    synchronizerConfig.get(SynchronizeSection.section)]);
        // check if all are ready to create variables
        if (ProjectSection.is(projectSection) &&
            SynchronizeSection.is(synchronizeSection)) {
            projectRoot = projectSection.root;
            shell = await sshHelper.getDefaultVmsShell();
            return true;
        }
        return false;
    }
}

export async function BuildProject(context: ExtensionContext, debugLog?: LogType) {
    // get current config
    if (!await EnsureSettings() || !synchronizerConfig) {
        return false;
    }
    const projectSection = await synchronizerConfig.get(ProjectSection.section);
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
            return runRemoteBuild(buildSelection, debugLog);
        } else {
            return false;
        }
    } else {
        ToOutputChannel(`Cannot resolve configuration or current workspace folder`);
        return false;
    }
}
