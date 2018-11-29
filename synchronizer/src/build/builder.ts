
import fs from "fs-extra";
import path from "path";
import { Diagnostic, DiagnosticCollection, DiagnosticSeverity, ExtensionContext, languages, QuickPickItem, Range, Uri, window, workspace } from "vscode";

import { IFileEntry, LogFunction, LogType } from "@vorfol/common";
import { ftpPathSeparator } from "@vorfol/common";
import { printLike } from "@vorfol/common";
import { parseVmsOutput } from "../common/parse-output";
import { GetSshHelperType } from "../config/get-ssh-helper";
import { IEnsured } from "../ensure-settings";
import { ISshShell } from "../ext-api/api";
import { IDispose, SshHelper } from "../ext-api/ssh-helper";
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

interface IScopeBuildData {
    ensured: IEnsured;      // saved settings
    isValid: boolean;
    localSource: ISource;
    shell: ISshShell;
    shellRootConverter: VmsPathConverter;
    watcher: IDispose;
    sshWatcher: IDispose;
}

export class Builder {

    /**
     * Keep sources for each scope
     */
    public static buildScopes: Map<string, IScopeBuildData> = new Map<string, IScopeBuildData>();

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
    private static readonly getShellRootCmd = `WRITE SYS$OUTPUT F$TRNLNM("SYS$LOGIN")`;

    private static instance?: Builder;

    public logFn: LogFunction;

    private collection?: DiagnosticCollection;
    private sshHelper?: SshHelper;

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
     * Dispose all sources and watchers
     */
    public dispose() {
        this.logFn(LogType.debug, () => localize("debug.disposing", "Disposing sources"));
        for (const scopeData of Builder.buildScopes.values()) {
            this.disposeScopeData(scopeData);
        }
        Builder.buildScopes.clear();
    }

    public disposeScopeData(scopeData: IScopeBuildData, remove?: boolean): void {
        scopeData.localSource.dispose();
        scopeData.shell.dispose();
        scopeData.watcher.dispose();
        scopeData.sshWatcher.dispose();
        if (remove) {
            const scopeKey = scopeData.ensured.configHelper.workspaceFolder ? scopeData.ensured.configHelper.workspaceFolder.name : "";
            Builder.buildScopes.delete(scopeKey);
        }
    }

    public async buildProject(ensured: IEnsured) {
        const scopeData = await this.prepareScopeData(ensured);
        if (!scopeData) {
            return false;
        }
        // clear password cache
        this.sshHelper!.clearPasswordCashe();
        // get list of builders
        const items = await scopeData.localSource.findFiles(ensured.projectSection.builders, ensured.projectSection.exclude);
        // build selection list, excluding own mms
        const selectItems = items.filter((file) => file.filename.toUpperCase() !== (ensured.projectSection.projectName + Builder.mmsExt).toUpperCase())
            .map((file) => {
                let type: BuildType = "com";
                const extPos = file.filename.lastIndexOf(".");
                if (extPos > 0 && file.filename.slice(extPos).toLowerCase() === Builder.mmsExt) {
                    type = "mms";
                }
                const ret: IBuildQuickPickItem = {
                    description: localize("quick.build.file", "Build using {0} [{1}]", file.filename, ensured.configHelper.workspaceFolder!.name),
                    label: file.filename,
                    type,
                };
                return ret;
            });
        selectItems.unshift({
                description: localize("quick.build.release", "Build release version [{0}]", ensured.configHelper.workspaceFolder!.name),
                label: "RELEASE",
                type: "release",
            });
        selectItems.unshift({
            description: localize("quick.build.debug", "Build debug version [{0}]", ensured.configHelper.workspaceFolder!.name),
            label: "DEBUG",
            type: "debug",
        });
        // select one
        const buildSelection = await window.showQuickPick(selectItems, { ignoreFocusOut: true, canPickMany: false});
        if (buildSelection !== undefined) {
            return this.ensureMmsCreated(scopeData, buildSelection)
                .then((ok) => {
                    if (ok) {
                        return this.runRemoteBuild(scopeData, buildSelection)
                            .then((result) => {
                                // TODO: deside if we want to keep it alive
                                this.decideDispose(scopeData);
                                return result;
                            });
                    }
                    return ok;
                });
        } else {
            return false;
        }
    }

    public async cleanProject(ensured: IEnsured) {
        const selectItems: IBuildQuickPickItem[] = [
            {
                description: localize("quick.clean.release", "Clean release version [{0}]", ensured.configHelper.workspaceFolder!.name),
                label: "RELEASE",
                type: "release",
            },
            {
                description: localize("quick.clean.debug", "Clean debug version [{0}]", ensured.configHelper.workspaceFolder!.name),
                label: "DEBUG",
                type: "debug",
            },
            {
                description: localize("quick.clean.both", "Clean all [{0}]", ensured.configHelper.workspaceFolder!.name),
                label: "BOTH",
                type: "both",
            },
        ];
        // select one
        const cleanSelection = await window.showQuickPick(selectItems, { ignoreFocusOut: true, canPickMany: false});
        if (cleanSelection !== undefined) {
            return this.runRemoteClean(ensured, cleanSelection);
        } else {
            return false;
        }
    }

    private async ensureMmsCreated(scopeData: IScopeBuildData, selection: IBuildQuickPickItem) {
        if (!(selection.type === "debug" || selection.type === "release" || selection.type === "both")) {
            return true;
        }
        const localMmsFile = scopeData.ensured.projectSection.projectName + Builder.mmsExt;
        const foundMms = await scopeData.localSource.findFiles(localMmsFile);
        if (foundMms.length === 0) {
            const defMmsPath = contextSaved!.asAbsolutePath(Builder.defMmsFileName);
            const [content, headres, sources] = await Promise.all([
                fs.readFile(defMmsPath, "utf8"),
                scopeData.localSource.findFiles(scopeData.ensured.projectSection.headers, scopeData.ensured.projectSection.exclude),
                scopeData.localSource.findFiles(scopeData.ensured.projectSection.source, scopeData.ensured.projectSection.exclude)]);
            let newContent = `OUTDIR=${scopeData.ensured.projectSection.outdir}\n`
                            + `NAME=${scopeData.ensured.projectSection.projectName}\n`
                            + `INCLUDES=${headres.map(iFileEntryToVmsPath).join(" -\n\t")}\n`
                            + `SOURCES=${sources.map(iFileEntryToVmsPath).join(" -\n\t")}\n`
                            + content;
            for (const source of sources) {
                const vms = new VmsPathConverter(source.filename);
                const sourceDependencyLine = "[$(OBJ_DIR)" + vms.bareDirectory + "]" + vms.fileName + ".obj : " + vms.fullPath + " $(INCLUDES)";
                newContent += sourceDependencyLine + "\n";
            }
            await fs.writeFile(scopeData.localSource.root + ftpPathSeparator + localMmsFile, newContent);
            return Synchronizer.acquire(this.logFn).uploadFiles(scopeData.ensured, [localMmsFile]);
        } else {
            return true;
        }
    }

    private async runRemoteClean(ensured: IEnsured, selection: IBuildQuickPickItem) {
        const scopeData = await this.prepareScopeData(ensured);
        if (!scopeData) {
            return false;
        }
        // decide what to clean
        let command = `del/tree [.${ensured.projectSection.outdir}...]*.*;*`;
        switch (selection.type) {
            case "debug":
                command = `del/tree [.${ensured.projectSection.outdir}.DEBUG...]*.*;*`;
                break;
            case "release":
                command = `del/tree [.${ensured.projectSection.outdir}.RELEASE...]*.*;*`;
                break;
        }
        // run if decided
        const output = await scopeData.shell.execCmd(command);
        if (output) {
            // parse?
            this.decideDispose(scopeData);
            return true;
        } else {
            this.logFn(LogType.error, () => localize("output.cannot_exec", "Cannot execute > {0}", command));
            this.disposeScopeData(scopeData, true);
            return false;
        }
    }

    private async runRemoteBuild(scopeData: IScopeBuildData, selection: IBuildQuickPickItem) {
        // decide how to run
        let command = "@" + selection.label;    // COM
        switch (selection.type) {
            case "mms":
                command = Builder.mmsUserCmd(selection.label);
                break;
            case "debug":
                command = Builder.mmsCmd(scopeData.ensured.projectSection.projectName + Builder.mmsExt,
                                        "1",
                                        scopeData.ensured.projectSection.outdir,
                                        scopeData.ensured.projectSection.projectName);
                break;
            case "release":
                command = Builder.mmsCmd(scopeData.ensured.projectSection.projectName + Builder.mmsExt,
                                        "",
                                        scopeData.ensured.projectSection.outdir,
                                        scopeData.ensured.projectSection.projectName);
                break;
        }
        // run if decided
        const output = await scopeData.shell.execCmd(command);
        if (output) {
            let retCode = true;
            if (selection.type === "com" || selection.type === "mms") {
                // just output as is
                for (const line of output) {
                    this.logFn(LogType.information, () => line);
                }
            } else {
                // parse
                retCode = await this.parseProblems(scopeData, output, selection);
            }
            if (retCode) {
                // get listings
                retCode = await Synchronizer.acquire(this.logFn).downloadListings(scopeData.ensured);
            }
            return retCode;
        } else {
            this.logFn(LogType.error, () => localize("output.cannot_exec", "Cannot execute > {0}", command));
            return false;
        }
    }

    private async parseProblems(scopeData: IScopeBuildData, output: string[], selection: IBuildQuickPickItem) {
        const result = parseVmsOutput(output, scopeData.shell.width);
        for (const line of result.lines) {
            this.logFn(LogType.warning, () => line);
        }
        let cwd = "";
        cwd = scopeData.shellRootConverter.initial + scopeData.ensured.projectSection.root + ftpPathSeparator;
        cwd = cwd.toUpperCase();
        const errMap = new Map<string, Diagnostic[]>();
        let hasError = false;
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
                        hasError = true;
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
                            entry.file = scopeData.ensured.projectSection.projectName + Builder.mmsExt;
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
                    const found = await scopeData.localSource.findFiles(localFile);
                    if (found.length === 1) {
                        localFile = found[0].filename;
                    }
                    uri = Uri.file(path.join(scopeData.ensured.configHelper.workspaceFolder!.uri.fsPath, localFile));
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
        // this.collection.clear();
        this.collection.forEach((uri, diagnostics, collection) => {
            if (scopeData.ensured.configHelper.workspaceFolder === workspace.getWorkspaceFolder(uri)) {
                collection.delete(uri);
            }
        });
        for (const [uriStr, arrDiag] of errMap) {
            this.collection.set(Uri.parse(uriStr), arrDiag);
        }
        return !hasError;
    }

    /**
     * Prepare sources if missed, also get settings
     */
    private async prepareScopeData(ensured: IEnsured) {
        const scopeKey = ensured.configHelper.workspaceFolder ? ensured.configHelper.workspaceFolder.name : "";
        const scopeData = Builder.buildScopes.get(scopeKey);
        if (scopeData && scopeData.isValid) {
            return scopeData;
        }
        if (scopeData) {
            this.disposeScopeData(scopeData, true);
        }
        // get ssh helper
        if (!this.sshHelper) {
            const sshHelperType = await GetSshHelperType();
            if (!sshHelperType) {
                this.logFn(LogType.debug, () => localize("debug.cannot_get_ssh_helper", "Cannot get ssh-helper api"));
                this.logFn(LogType.error, () => localize("output.install_ssh", "Please, install 'vmssoftware.ssh-helper' first"));
                return false;
            }
            this.sshHelper = new sshHelperType(this.logFn);
        }
        // check if all are ready to create sources
        if (ensured.configHelper.workspaceFolder) {
            const scope = ensured.configHelper.workspaceFolder.name;
            this.logFn(LogType.debug, () => localize("debug.create_shell", "Creating builder shell"));
            const shell = await this.sshHelper.getDefaultVmsShell(scope);
            if (!shell) {
                return undefined;
            }
            // get root of shell (home folder)
            let answer = await shell.execCmd(Builder.getShellRootCmd);
            if (!answer || answer.length === 0) {
                return undefined;
            }
            const shellRootConverter = VmsPathConverter.fromVms(answer[0]);
            // set default directory for shell - project root
            const converter = new VmsPathConverter(ensured.projectSection.root + ftpPathSeparator);
            const cd = `set def ${converter.directory}`;
            answer = await shell.execCmd(cd);
            if (!answer || answer.length === 0) {
                return undefined;
            }
            // create local source and watchers
            const localSource = new FsSource(ensured.configHelper.workspaceFolder.uri.fsPath, this.logFn);
            const watcher = ensured.configHelper.getConfig().onDidLoad(markInvalid);
            const sshWatcher = this.sshHelper.setConfigWatcher(scope, markInvalid);
            return {
                ensured,
                isValid: true,
                localSource,
                shell,
                shellRootConverter,
                sshWatcher,
                watcher,
            } as IScopeBuildData;

            function markInvalid() {
                // mark as invalid by scopeKey
                const delData = Builder.buildScopes.get(scopeKey);
                if (delData) {
                    delData.isValid = false;
                }
            }
        }
        return undefined;
    }

    /**
     * Dispose or setup watchers besides on "keep alive" flag
     */
    private decideDispose(scopeData: IScopeBuildData) {
        if (!scopeData.ensured.synchronizeSection.keepAlive) {
            this.disposeScopeData(scopeData, true);
        }
    }
}
