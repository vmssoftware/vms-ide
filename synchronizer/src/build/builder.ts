import fs from "fs-extra";
import path from "path";

import { Diagnostic, DiagnosticCollection, DiagnosticSeverity, ExtensionContext, languages, QuickPickItem, Range, Uri, window, workspace } from "vscode";

import { IFileEntry, LogFunction, LogType } from "@vorfol/common";
import { printLike } from "@vorfol/common";
import { ftpPathSeparator } from "@vorfol/common";

import { parseVmsOutput } from "../common/parse-output";
import { GetSshHelperFromApi } from "../config/get-ssh-helper";
import { IProjectSection, ProjectSection } from "../config/sections/project";
import { EnsureSettings, synchronizerConfig } from "../ensure-settings";
import { ISshShell } from "../ext-api/api";
import { SshHelper } from "../ext-api/ssh-helper";
import { FsSource } from "../sync/fs-source";
import { ISource } from "../sync/source";
import { Synchronizer } from "../sync/synchronizer";
import { VmsPathConverter } from "../vms/vms-path-converter";
import { contextSaved } from "./../context";

import * as nls from "vscode-nls";
nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

type BuildType = "com" | "mms" | "debug" | "release" | "both";

interface IBuildQuickPickItem extends QuickPickItem {
    type: BuildType;
}

function iFileEntryToVmsPath(file: IFileEntry) {
    const conv = new VmsPathConverter(file.filename);
    return conv.fullPath;
}

export class Builder {

    public static acquire(debugLog?: LogFunction) {
        if (!Builder.instance) {
            Builder.instance = new Builder(debugLog);
        } else {
            if (debugLog !== undefined) {
                Builder.instance.logFn = debugLog;
            }
        }
        return Builder.instance;
    }

    private static readonly defMmsFileName = "res/default.mms";
    private static readonly mmsUserCmd = printLike`MMS/DESCR=${"_.mms"}`;
    private static readonly mmsCmd = printLike`MMS/EXTENDED_SYNTAX/DESCR=${"_.mms"}/MACRO=("DEBUG=${"_1_"}","OUTDIR=${"outdir"}","NAME=${"name"}")`;
    private static readonly mmsExt = ".mms";
    private static readonly defRange = new Range(0, 0, 0, 0);

    private static instance?: Builder;

    public logFn: LogFunction;

    private collection?: DiagnosticCollection;
    private projectSection?: IProjectSection;
    private workspaceUri?: Uri;
    private shellRootConverter?: VmsPathConverter;
    private shell?: ISshShell;
    private sshHelper?: SshHelper;
    private localSource?: ISource;

    /**
     * Execute build command on VMS
     * @param context vscode context
     * @param logFn log
     */
    private constructor(logFn?: LogFunction) {
        // tslint:disable-next-line:no-empty
        this.logFn = logFn || (() => {});
    }

    /**
     * Also save shell errors
     */
    public dispose() {
        // dispose shell if we don't decide to keep it alive
        if (this.shell) {
            this.shell.dispose();
            this.shell = undefined;
            this.shellRootConverter = undefined;
        }
    }

    public async buildProject() {
        // get current settings
        if (!await this.ensureSettings()) {
            return false;
        }
        if (this.projectSection && this.workspaceUri) {
            // create local source
            if (!this.localSource) {
                this.localSource = new FsSource(this.workspaceUri.fsPath, this.logFn);
            }
            // get list of builders
            const items = await this.localSource.findFiles(this.projectSection.builders, this.projectSection.exclude);
            // build selection list, excluding own mms
            const selectItems = items.filter((file) => file.filename.toUpperCase() !== (this.projectSection!.projectName + Builder.mmsExt).toUpperCase())
                .map((file) => {
                    let type: BuildType = "com";
                    const extPos = file.filename.lastIndexOf(".");
                    if (extPos > 0 && file.filename.slice(extPos).toLowerCase() === Builder.mmsExt) {
                        type = "mms";
                    }
                    const ret: IBuildQuickPickItem = {
                        description: localize("quick.build.file", "Build using {0}", file.filename),
                        label: file.filename,
                        type,
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
            this.logFn(LogType.error, () => localize("output.not_resolved", "Cannot resolve configuration or current workspace folder"));
            return false;
        }
    }

    public async cleanProject() {
        // get current settings
        if (!await this.ensureSettings()) {
            return false;
        }
        if (this.projectSection) {
            const selectItems: IBuildQuickPickItem[] = [
                {
                    description: localize("quick.clean.release", "Clean release version"),
                    label: "RELEASE",
                    type: "release",
                },
                {
                    description: localize("quick.clean.debug", "Clean debug version"),
                    label: "DEBUG",
                    type: "debug",
                },
                {
                    description: localize("quick.clean.both", "Clean all"),
                    label: "BOTH",
                    type: "both",
                },
            ];
            // select one
            const cleanSelection = await window.showQuickPick(selectItems, { ignoreFocusOut: true, canPickMany: false});
            if (cleanSelection !== undefined) {
                return this.runRemoteClean(cleanSelection)
                                .then((result) => {
                                    // TODO: deside if we want to keep it alive
                                    this.dispose();
                                    return result;
                                });
            } else {
                return false;
            }
        } else {
            this.logFn(LogType.error, () => localize("output.not_resolved", "Cannot resolve configuration or current workspace folder"));
            return false;
        }
    }

    private async ensureSettings() {
        if (!await EnsureSettings() || !synchronizerConfig) {
            this.logFn(LogType.error, () => localize("error.no_settings", "Cannot get settings"));
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
            this.logFn(LogType.error, () => localize("error.bad_settings", "Inconsistent settings or workspace is empty"));
            return false;
        }
    }

    private async ensureMmsCreated(selection: IBuildQuickPickItem) {
        if (!(selection.type === "debug" || selection.type === "release" || selection.type === "both")) {
            return true;
        }
        if (this.projectSection
            && this.localSource
            && this.workspaceUri) {
            const localMmsFile = this.projectSection.projectName + Builder.mmsExt;
            const foundMms = await this.localSource.findFiles(localMmsFile);
            if (foundMms.length === 0) {
                const defMmsPath = contextSaved!.asAbsolutePath(Builder.defMmsFileName);
                const [content, headres, sources] = await Promise.all([
                    fs.readFile(defMmsPath, "utf8"),
                    this.localSource.findFiles(this.projectSection.headers, this.projectSection.exclude),
                    this.localSource.findFiles(this.projectSection.source, this.projectSection.exclude)]);
                let newContent = `OUTDIR=${this.projectSection.outdir}\n`
                              + `NAME=${this.projectSection.projectName}\n`
                              + `INCLUDES=${headres.map(iFileEntryToVmsPath).join(" -\n\t")}\n`
                              + `SOURCES=${sources.map(iFileEntryToVmsPath).join(" -\n\t")}\n`
                              + content;
                for (const source of sources) {
                    const vms = new VmsPathConverter(source.filename);
                    const sourceDependencyLine = "[$(OBJ_DIR)" + vms.bareDirectory + "]" + vms.fileName + ".obj : " + vms.fullPath + " $(INCLUDES)";
                    newContent += sourceDependencyLine + "\n";
                }
                await fs.writeFile(this.workspaceUri.fsPath + ftpPathSeparator + localMmsFile, newContent);
                return Synchronizer.acquire(this.logFn).uploadFiles([localMmsFile]);
            } else {
                return true;
            }
        }
        return false;
    }

    private async runRemoteClean(selection: IBuildQuickPickItem) {
        let command: string | undefined;
        let output: string[] | undefined;
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
            // decide what to clean
            switch (selection.type) {
                case "both":
                    command = `del/tree [.${this.projectSection.outdir}...]*.*;*`;
                    break;
                case "debug":
                    command = `del/tree [.${this.projectSection.outdir}.DEBUG...]*.*;*`;
                    break;
                case "release":
                    command = `del/tree [.${this.projectSection.outdir}.RELEASE...]*.*;*`;
                    break;
            }
            // run if decided
            if (command) {
                output = await this.shell.execCmd(command);
                if (output) {
                    // parse?
                    return true;
                } else {
                    this.logFn(LogType.error, () => localize("output.cannot_exec", "Cannot execute > {0}", command));
                    return false;
                }
            }
        }
        return false;
    }

    private async runRemoteBuild(selection: IBuildQuickPickItem) {
        let command: string | undefined;
        let output: string[] | undefined;
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
                case "com":
                    command = "@" + selection.label;
                    break;
                case "mms":
                    command = Builder.mmsUserCmd(selection.label);
                    break;
                case "debug":
                    command = Builder.mmsCmd(this.projectSection.projectName + Builder.mmsExt, "1", this.projectSection.outdir, this.projectSection.projectName);
                    break;
                case "release":
                    command = Builder.mmsCmd(this.projectSection.projectName + Builder.mmsExt, "", this.projectSection.outdir, this.projectSection.projectName);
                    break;
            }
            // run if decided
            if (command) {
                output = await this.shell.execCmd(command);
                if (output) {
                    let retCode = true;
                    if (selection.type === "com" || selection.type === "mms") {
                        // just output as is
                        for (const line of output) {
                            this.logFn(LogType.information, () => line);
                        }
                    } else {
                        // parse
                        retCode = await this.parseProblems(output, selection);
                    }
                    if (retCode) {
                        // get listings
                        retCode = await Synchronizer.acquire(this.logFn).downloadListings();
                    }
                    return retCode;
                } else {
                    this.logFn(LogType.error, () => localize("output.cannot_exec", "Cannot execute > {0}", command));
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
                if (answer.length > 0) {
                    this.shellRootConverter = VmsPathConverter.fromVms(answer[0]);
                }
            }
        }
        if (this.shellRootConverter && this.shellRootConverter.fullPath) {
            const msg = this.shellRootConverter.fullPath;
            this.logFn(LogType.debug, () => `shell root: ${msg}`);
            return true;
         } else {
            this.logFn(LogType.debug, () => `shell root: unresolved`);
            this.shellRootConverter = undefined;
            return false;
        }
    }

    private async setShellProjectDirectory(directory: string) {
        if (this.shell) {
            const cd = `set def ${directory}`;
            const answer = await this.shell.execCmd(cd);    // TODO: check response errors, also check - is DIR working without errors?
            if (answer) {
                this.logFn(LogType.debug, () => answer.join("\r\n"));
                return true;
            }
        }
        return false;
    }

    private async parseProblems(output: string[], selection: IBuildQuickPickItem) {
        if (!this.shellRootConverter ||
            !this.projectSection ||
            !this.shell) {
            return false;
        }
        const result = parseVmsOutput(output, this.shell.width);
        for (const line of result.lines) {
            this.logFn(LogType.warning, () => line);
        }
        let cwd = "";
        cwd = this.shellRootConverter.initial + this.projectSection.root + ftpPathSeparator;
        cwd = cwd.toUpperCase();
        const errMap = new Map<string, Diagnostic[]>();
        for (const entry of result.problems) {
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
                if (!entry.file) {
                    if (entry.facility && entry.facility.toUpperCase() === "MMS") {
                        if (selection.type === "mms") {
                            entry.file = selection.label;
                        } else {
                            entry.file = this.projectSection.projectName + Builder.mmsExt;
                        }
                    }
                }
                const file = String(entry.file);
                let uri = Uri.file(file);
                if (entry.file !== undefined &&
                    workspace.workspaceFolders) {
                    let localFile = file;
                    // cut cwd
                    if (cwd && file.toUpperCase().startsWith(cwd)) {
                        localFile = file.slice(cwd.length);
                    }
                    // find case-insensitive
                    if (this.localSource) {
                        const found = await this.localSource.findFiles(localFile);
                        if (found.length === 1) {
                            localFile = found[0].filename;
                        }
                    }
                    uri = Uri.file(path.join(workspace.workspaceFolders[0].uri.fsPath, localFile));
                }
                let diagArr = errMap.get(uri.toString());
                diagArr = diagArr || [];
                diagArr.push(diagnostic);
                errMap.set(uri.toString(), diagArr);
            }
        }
        if (!this.collection) {
            this.collection = languages.createDiagnosticCollection("open-vms.build");
        }
        this.collection.clear();
        for (const [uriStr, arrDiag] of errMap) {
            this.collection.set(Uri.parse(uriStr), arrDiag);
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
                this.logFn(LogType.debug, () => localize("debug.cannot_get_ssh_helper", "Cannot get ssh-helper api"));
                this.logFn(LogType.error, () => localize("output.install_ssh", "Please, install 'vmssoftware.ssh-helper' first"));
                return false;
            }
            this.sshHelper = new sshHelperType(this.logFn);
        }
        if (this.sshHelper) {
            // clear password cache
            this.sshHelper.clearPasswordCashe();
            this.shell = await this.sshHelper.getDefaultVmsShell();
        }
        // if (this.shell) {
        //     this.shell.width = 32;  // DEBUG PURPOSE ONLY
        // }
        return true;
    }

}
