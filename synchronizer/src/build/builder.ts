import fs from "fs";
import path from "path";
import util from "util";
import { Diagnostic, DiagnosticCollection, DiagnosticSeverity, ExtensionContext, languages, Range, Uri, window, workspace } from "vscode";

import { LogType } from "@vorfol/common";
import { printLike } from "@vorfol/common";
import { ftpPathSeparator } from "@vorfol/common";

import { ProjectSection } from "../config/sections/project";
import { SynchronizeSection } from "../config/sections/synchronize";

import { ISshShell } from "../ssh/api";

import { parseVmsOutput } from "../common/parse-output";
import { GetSshHelperFromApi } from "../config/get-ssh-helper";
import { EnsureSettings, synchronizerConfig } from "../ensure-settings";
import { ToOutputChannel } from "../output-channel";
import { FsSource } from "../sync/fs-source";
import { synchronizer } from "../synchronize";
import { VmsPathConverter } from "../vms/vms-path-converter";

const fsReadFile = util.promisify(fs.readFile);

import * as nls from "vscode-nls";
nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export class Builder {

    public static readonly createNewMmsString = localize("const.create_mms", "Create new MMS");
    public static readonly defMmsFileName = "res/default.mms";
    public static readonly mmsCmd = printLike`MMS/EXTENDED_SYNTAX/DESCR=${"default.mms"}`;
                        // + `/MACRO=(`
                        // + `"DEBUG=${"1 or empty"}",`
                        // + `"INCLUDES=${"include files comma-separated list"}",`
                        // + `"SOURCES=${"source files comma-separated list"}",`
                        // + `"OUT_NAME=${"executable name without extension"}")`;
    public static readonly mmsExt = ".mms";
    public static readonly comExt = ".com";
    public static readonly defRange = new Range(0, 0, 0, 0);

    public projectRoot?: string;
    public shellRootConverter?: VmsPathConverter;
    public collection?: DiagnosticCollection;

    public get lastErrors() {
        return [] as Error[];
    }

    constructor(public context: ExtensionContext, public debugLog?: LogType) {

    }

    public dispose() {
        // TODO: dispose shell if we decide to keep it alive
    }

    public async getShellRoot(shell: ISshShell) {
        if (shell) {
            const answer = await shell.execCmd(`WRITE SYS$OUTPUT F$TRNLNM("SYS$LOGIN")`);
            if (answer) {
                const converter = VmsPathConverter.fromVms(answer.split("\n")[1].trim());
                this.shellRootConverter = converter;
                if (this.debugLog) {
                    this.debugLog(this.shellRootConverter.initial);
                }
            }
        }
    }

    public async createDefMms() {
        const defMmsPath = this.context.asAbsolutePath(Builder.defMmsFileName);
        const content = await fsReadFile(defMmsPath)
            .then((buff) => buff.toString("utf8"))
            .catch(() => "! new MMS");
        return workspace.openTextDocument({language: "mms",  content})
            .then((doc) => {
                return window.showTextDocument(doc)
                    .then(() => true);
            });
    }

    public async parseProblems(output: string) {
        let cwd = "";
        if (this.shellRootConverter && this.projectRoot) {
            cwd = this.shellRootConverter.initial + this.projectRoot + ftpPathSeparator;
            cwd = cwd.toUpperCase();
        }
        const result = parseVmsOutput(output);
        const errMap = new Map<string, Diagnostic[]>();
        for (const entry of result) {
            if (entry.message) {
                const diagnostic = new Diagnostic(Builder.defRange, entry.message);
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
        if (!this.collection) {
            this.collection = languages.createDiagnosticCollection("open-vms.build");
        }
        this.collection.clear();
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
            this.collection.set(uri, arrDiag);
        }
        return true;
    }

    public async runRemoteBuild(file: string) {
        let command: string | undefined;
        let output: string | undefined;
        let shell: ISshShell | undefined;
        if (await prepare.call(this) && shell) {
            // get shell root
            await this.getShellRoot(shell);
            // set default directory
            const converter = new VmsPathConverter(this.projectRoot + ftpPathSeparator + file);
            const cd = `set def ${converter.directory}`;
            await shell.execCmd(cd);    // TODO: check response errors
            // decide how to run
            if (file.toLowerCase().endsWith(Builder.mmsExt)) {
                command = Builder.mmsCmd(file);
            } else if (file.toLowerCase().endsWith(Builder.comExt)) {
                command = "@" + converter.file;
            } else {
                command = converter.file;
            }
            // run if decided
            if (command) {
                output = await shell.execCmd(command);
                if (output) {
                    // parse
                    return this.parseProblems(output)
                        .then((parseResults) => {
                            // TODO: download listing
                            if (synchronizer) {
                                synchronizer.downloadListings();
                            }
                            return parseResults;
                        });
                } else {
                    ToOutputChannel(localize("output.cannot_exec", "Cannot execute > {0}", command));
                    return false;
                }
            }
        }
        return false;

        async function prepare(this: Builder) {
            // get current config
            if (!await EnsureSettings() ||
                !synchronizerConfig) {
                return false;
            }
            const sshHelperType = await GetSshHelperFromApi();
            if (!sshHelperType) {
                if (this.debugLog) {
                    this.debugLog(localize("debug.cannot_get_ssh_helper", "Cannot get ssh-helper api"));
                }
                ToOutputChannel(localize("output.install_ssh", "Please, install 'vmssoftware.ssh-helper' first"));
                return false;
            }
            const sshHelper = new sshHelperType(this.debugLog);
            const [projectSection,
                synchronizeSection] = await Promise.all(
                    [synchronizerConfig.get(ProjectSection.section),
                        synchronizerConfig.get(SynchronizeSection.section)]);
            // check if all are ready to create variables
            if (ProjectSection.is(projectSection) &&
                SynchronizeSection.is(synchronizeSection)) {
                this.projectRoot = projectSection.root;
                shell = await sshHelper.getDefaultVmsShell();
                return true;
            }
            return false;
        }
    }

    public async buildProject() {
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
            const localSource = new FsSource(workspace.workspaceFolders[0].uri.fsPath, this.debugLog);
            const items = await localSource.findFiles(project.builders, project.exclude);
            const selectItems = items.map((file) => file.filename);
            selectItems.push(Builder.createNewMmsString);
            // select one
            const buildSelection = await window.showQuickPick(selectItems, { ignoreFocusOut: true, canPickMany: false});
            // create one if selected
            if (buildSelection === Builder.createNewMmsString) {
                return this.createDefMms()
                    .catch((err) => {
                        if (this.debugLog) {
                            this.debugLog(err);
                        }
                        return false;
                    });
            }
            // run and parse output
            if (buildSelection) {
                return this.runRemoteBuild(buildSelection);
            } else {
                return false;
            }
        } else {
            ToOutputChannel(localize("output.not_resolved", "Cannot resolve configuration or current workspace folder"));
            return false;
        }
    }

}
