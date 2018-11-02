import fs from "fs-extra";
import micromatch from "micromatch";
import path from "path";

import { Diagnostic, DiagnosticCollection, DiagnosticSeverity, ExtensionContext, languages, QuickPickItem, Range, Uri, window, workspace } from "vscode";

import { LogType } from "@vorfol/common";
import { printLike } from "@vorfol/common";
import { ftpPathSeparator } from "@vorfol/common";

import { IProjectSection, ProjectSection } from "../config/sections/project";

import { ISshShell } from "../ext-api/api";
import { SshHelper } from "../ext-api/ssh-helper";

import { parseVmsOutput } from "../common/parse-output";
import { GetSshHelperFromApi } from "../config/get-ssh-helper";
import { EnsureSettings, synchronizerConfig } from "../ensure-settings";
import { FsSource } from "../sync/fs-source";
import { synchronizer } from "../synchronize";
import { VmsPathConverter } from "../vms/vms-path-converter";

import * as nls from "vscode-nls";
nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

interface IBuildQuickPickItem extends QuickPickItem {
    type: "user" | "debug" | "release";
}

export class Builder {

    private static readonly createNewMmsString = localize("const.create_mms", "Create new MMS");
    private static readonly defMmsFileName = "res/default.mms";
    private static readonly mmsCmd = printLike`MMS/EXTENDED_SYNTAX/DESCR=${"default.mms"}`;
    // + `/MACRO=(`
    // + `"DEBUG=${"1 or empty"}",`
    // + `"INCLUDES=${"include files comma-separated list"}",`
    // + `"SOURCES=${"source files comma-separated list"}",`
    // + `"OUT_NAME=${"executable name without extension"}")`;
    private static readonly mmsExt = ".mms";
    private static readonly macroExt = ".mac";
    private static readonly defRange = new Range(0, 0, 0, 0);

    public messages: string[] = [];

    private collection?: DiagnosticCollection;
    private projectSection?: IProjectSection;
    private workspaceUri?: Uri;
    private shellRootConverter?: VmsPathConverter;
    private shell?: ISshShell;
    private sshHelper?: SshHelper;

    // all files in case-sensitive form (because Uri is case-sensitive, but we can get case-insensitive file name from build process)
    private allLocalFiles?: string[];

    constructor(public context: ExtensionContext, public debugLog?: LogType) {

    }

    /**
     * Also save shell errors
     */
    public dispose() {
        // dispose shell if we don't decide to keep it alive
        if (this.shell) {
            if (this.shell.lastClientError) {
                this.messages.push(this.shell.lastClientError.message);
            }
            if (this.shell.lastShellError) {
                this.messages.push(this.shell.lastShellError.message);
            }
            this.shell.dispose();
            this.shell = undefined;
            this.shellRootConverter = undefined;
        }
    }

    public async buildProject() {
        // clear errors
        this.messages = [];
        // get current settings
        if (!await this.ensureSettings()) {
            return false;
        }
        if (this.projectSection && this.workspaceUri) {
            // create local source
            const localSource = new FsSource(this.workspaceUri.fsPath, this.debugLog);
            // get full list of project files. do not wait, we will need it later
            localSource.findFiles("*", this.projectSection.exclude)
                .then((list) => {
                    if (list) {
                        this.allLocalFiles = list.map((f) => f.filename);
                    }
                });
            // get list of builders
            const items = await localSource.findFiles(this.projectSection.builders, this.projectSection.exclude);
            // build selection list, excluding own mms
            const selectItems = items.filter((file) => file.filename.toUpperCase() !== (this.projectSection!.projectName + Builder.mmsExt).toUpperCase())
                .map((file) => {
                    const ret: IBuildQuickPickItem = {
                        description: localize("quick.build.file", "Build using {0}", file.filename),
                        label: file.filename,
                        type: "user",
                    };
                    return ret;
                });
            selectItems.unshift({
                    description: localize("quick.build.release", "Build release version"),
                    label: "RELEASE",
                    type: "release",
                });
            selectItems.unshift({
                description: localize("quick.build.debug", "Build debug version"),
                label: "DEBUG",
                type: "debug",
            });
            // select one
            const buildSelection = await window.showQuickPick(selectItems, { ignoreFocusOut: true, canPickMany: false});
            if (buildSelection !== undefined) {
                return this.ensureMmsCreated(buildSelection)
                    .then((ok) => {
                        if (ok) {
                            return this.runRemoteBuild(buildSelection)
                                .then((result) => {
                                    // TODO: deside if we want to keep it alive
                                    this.dispose();
                                    return result;
                                });
                        }
                        return ok;
                    });
            } else {
                return false;
            }
        } else {
            this.messages.push(localize("output.not_resolved", "Cannot resolve configuration or current workspace folder"));
            return false;
        }
    }

    private async ensureSettings() {
        if (!await EnsureSettings() || !synchronizerConfig) {
            this.messages.push(localize("error.no_settings", "Cannot get settings"));
            return false;
        }
        const projectSection = await synchronizerConfig.get(ProjectSection.section);
        // get current values
        const project = projectSection ? projectSection.store() : undefined;
        if (ProjectSection.is(project) &&
            workspace.workspaceFolders &&
            workspace.workspaceFolders.length > 0) {
            // hold
            this.projectSection = project;
            this.workspaceUri = workspace.workspaceFolders[0].uri;
            return true;
        } else {
            this.messages.push(localize("error.bad_settings", "Inconsistent settings or workspace is empty"));
            return false;
        }
    }

    private async ensureMmsCreated(selection: IBuildQuickPickItem) {
        if (selection.type === "user") {
            return true;
        }
        if (this.projectSection
            && this.allLocalFiles
            && this.workspaceUri) {
            const all = [];
            const localMmsFile = this.projectSection.projectName + Builder.mmsExt;
            const foundMms = micromatch(this.allLocalFiles, localMmsFile, { nocase: true });
            if (foundMms.length === 0) {
                const defMmsPath = this.context.asAbsolutePath(Builder.defMmsFileName);
                all.push(fs.copy(defMmsPath, this.workspaceUri.fsPath + ftpPathSeparator + localMmsFile)
                            .then(() => {
                                return localMmsFile;
                            }).catch((err) => {
                                this.messages.push(err);
                                return undefined;
                            }));
            }
            const localMacroFile = this.projectSection.projectName + Builder.macroExt;
            const foundMacro = micromatch(this.allLocalFiles, localMacroFile, { nocase: true });
            if (foundMacro.length === 0) {
                // TODO: provide content of macros
                const content = "DEBUG=1";
                all.push(fs.writeFile(this.workspaceUri.fsPath + ftpPathSeparator + localMacroFile, content)
                            .then(() => {
                                return localMacroFile;
                            }).catch((err) => {
                                this.messages.push(err);
                                return undefined;
                            }));
            }
            const files = await Promise.all(all);
            if (synchronizer) {
                const filesToUpload: string[] = [];
                for (const file of files) {
                    if (file !== undefined) {
                        filesToUpload.push(file);
                    }
                }
                return synchronizer.uploadFiles(filesToUpload);
            }
        }
        return false;
    }

    private async runRemoteBuild(selection: IBuildQuickPickItem) {
        let command: string | undefined;
        let output: string | undefined;
        if (await this.prepareShell() && this.shell && this.projectSection) {
            // get shell root
            if (!await this.ensureShellRoot()) {
                this.dispose();
                return false;
            }
            // set default directory
            const converter = new VmsPathConverter(this.projectSection.root + ftpPathSeparator);
            if (!await this.setShellProjectDirectory(converter.directory)) {
                this.dispose();
                return false;
            }
            // decide how to run
            switch (selection.type) {
                case "user":
                    command = "@" + selection.label;
                    break;
                default:
                    command = Builder.mmsCmd(this.projectSection.projectName + Builder.mmsExt);
                    break;
            }
            // run if decided
            if (command) {
                output = await this.shell.execCmd(command);
                if (output) {
                    // parse
                    return this.parseProblems(output, selection)
                        .then((parseResults) => {
                            if (synchronizer) {
                                return synchronizer.downloadListings();
                            } else {
                                return parseResults;
                            }
                        });
                } else {
                    this.messages.push(localize("output.cannot_exec", "Cannot execute > {0}", command));
                    return false;
                }
            }
        }
        return false;
    }

    private async ensureShellRoot() {
        if (!this.shellRootConverter && this.shell) {
            const answer = await this.shell.execCmd(`WRITE SYS$OUTPUT F$TRNLNM("SYS$LOGIN")`);
            if (answer) {
                const result = answer.split("\r\n").filter((s) => s.trim() !== "").map((s) => s.trim());
                if (result.length > 1) {
                    this.shellRootConverter = VmsPathConverter.fromVms(result[result.length - 1]);
                }
            }
        }
        if (this.shellRootConverter && this.shellRootConverter.fullPath) {
            if (this.debugLog) {
                this.debugLog(`shell root: ${this.shellRootConverter.fullPath}`);
            }
            return true;
         } else {
            if (this.debugLog) {
                this.debugLog(`shell root: unresolved`);
            }
            this.shellRootConverter = undefined;
            return false;
        }
    }

    private async setShellProjectDirectory(directory: string) {
        if (this.shell) {
            const cd = `set def ${directory}`;
            const answer = await this.shell.execCmd(cd);    // TODO: check response errors, also check - is DIR working without errors?
            if (answer) {
                const result = answer.split("\r\n").filter((s) => s.trim() !== "").map((s) => s.trim());
                if (this.debugLog) {
                    this.debugLog(result);
                }
                return true;
            }
        }
        return false;
    }

    private async parseProblems(output: string, selection: IBuildQuickPickItem) {
        if (!this.shellRootConverter ||
            !this.projectSection ||
            !this.shell) {
            return false;
        }
        const result = parseVmsOutput(output, this.shell.width);
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
                if (!entry.file) {
                    if (entry.facility && entry.facility.toUpperCase() === "MMS") {
                        if (selection.type === "user") {
                            entry.file = selection.label;
                        } else {
                            entry.file = this.projectSection.projectName + Builder.mmsExt;
                        }
                    }
                }
                errMap.set(String(entry.file), diagArr);
            }
        }
        if (!this.collection) {
            this.collection = languages.createDiagnosticCollection("open-vms.build");
        }
        this.collection.clear();
        let cwd = "";
        cwd = this.shellRootConverter.initial + this.projectSection.root + ftpPathSeparator;
        cwd = cwd.toUpperCase();
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

    private async prepareShell() {
        if (this.shell) {
            this.dispose();
        }
        if (!this.sshHelper) {
            const sshHelperType = await GetSshHelperFromApi();
            if (!sshHelperType) {
                if (this.debugLog) {
                    this.debugLog(localize("debug.cannot_get_ssh_helper", "Cannot get ssh-helper api"));
                }
                this.messages.push(localize("output.install_ssh", "Please, install 'vmssoftware.ssh-helper' first"));
                return false;
            }
            this.sshHelper = new sshHelperType(this.debugLog);
        }
        if (this.sshHelper) {
            this.shell = await this.sshHelper.getDefaultVmsShell();
        }
        if (this.shell) {
            this.shell.width = 32;  // DEBUG PURPOSE ONLY
        }
        return true;
    }

}
