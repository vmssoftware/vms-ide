import fs from "fs";
import micromatch from "micromatch";
import path from "path";
import util from "util";
import { Diagnostic, DiagnosticCollection, DiagnosticSeverity, ExtensionContext, languages, Range, Uri, window, workspace } from "vscode";

import { LogType } from "@vorfol/common";
import { printLike } from "@vorfol/common";
import { ftpPathSeparator } from "@vorfol/common";

import { ProjectSection } from "../config/sections/project";
import { SynchronizeSection } from "../config/sections/synchronize";

import { ISshShell } from "../ext-api/api";

import { parseVmsOutput } from "../common/parse-output";
import { GetSshHelperFromApi } from "../config/get-ssh-helper";
import { EnsureSettings, synchronizerConfig } from "../ensure-settings";
import { ToOutputChannel } from "../output-channel";
import { FsSource } from "../sync/fs-source";
import { synchronizer } from "../synchronize";
import { VmsPathConverter, vmsPathRgx } from "../vms/vms-path-converter";

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

    private allLocalFiles?: string[];

    constructor(public context: ExtensionContext, public debugLog?: LogType) {

    }

    public dispose() {
        // TODO: dispose shell if we decide to keep it alive
    }

    public async getShellRoot(shell: ISshShell) {
        if (shell) {
            const answer = await shell.execCmd(`WRITE SYS$OUTPUT F$TRNLNM("SYS$LOGIN")`);
            if (answer) {
                const result = answer.split("\r\n").filter((s) => s.trim() !== "").map((s) => s.trim());
                if (result.length > 1) {
                    this.shellRootConverter = VmsPathConverter.fromVms(result[result.length - 1]);
                }
                if (this.debugLog) {
                    this.debugLog(this.shellRootConverter);
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

    public async parseProblems(output: string, shellWidth?: number) {
        let cwd = "";
        if (this.shellRootConverter && this.projectRoot) {
            cwd = this.shellRootConverter.initial + this.projectRoot + ftpPathSeparator;
            cwd = cwd.toUpperCase();
        }
        const result = parseVmsOutput(output, shellWidth);
        const errMap = new Map<string, Diagnostic[]>();
        for (const entry of result) {
            if (entry.message) {
                const diagnostic = new Diagnostic(Builder.defRange, entry.message);
                if (entry.line &&
                    entry.pos) {
                    diagnostic.range = new Range(entry.line - 1, entry.pos - 1, entry.line - 1, entry.pos);
                }
                switch (entry.severity) {
                    case "E":
                    case "F":
                        diagnostic.severity = DiagnosticSeverity.Error;
                        break;
                    case "W":
                        diagnostic.severity = DiagnosticSeverity.Warning;
                        break;
                    case "I":
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
                let localFile = file;
                // cut cwd
                if (cwd && file.toUpperCase().startsWith(cwd)) {
                    localFile = file.slice(cwd.length);
                }
                // find case-insensitive
                if (this.allLocalFiles) {
                    const found = micromatch(this.allLocalFiles, localFile, { nocase: true });
                    if (found.length === 1) {
                        localFile = found[0];
                    }
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
                    return this.parseProblems(output, shell.width)
                        .then((parseResults) => {
                            if (synchronizer) {
                                return synchronizer.downloadListings();
                            } else {
                                return parseResults;
                            }
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
                if (shell) {
                    shell.width = 32;
                }
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
            localSource.findFiles("*", project.exclude)
                .then((list) => {
                    if (list) {
                        this.allLocalFiles = list.map((f) => f.filename);
                    }
                });
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
