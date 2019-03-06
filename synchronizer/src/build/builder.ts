
import fs from "fs-extra";
import path from "path";
import { Diagnostic, DiagnosticCollection, DiagnosticSeverity, ExtensionContext, languages, QuickPickItem, Range, Uri, window, workspace } from "vscode";

import { IFileEntry, LogFunction, LogType } from "@vorfol/common";
import { ftpPathSeparator } from "@vorfol/common";
import { printLike } from "@vorfol/common";
import { parseVmsOutput } from "../common/parse-output";
import { ProjectType } from "../config/sections/project";
import { ProjDepTree } from "../dep-tree/proj-dep-tree";
import { ensureSettings, IEnsured } from "../ensure-settings";
import { ISshShell } from "../ext-api/api";
import { GetSshHelperType } from "../ext-api/get-ssh-helper";
import { IDispose, SshHelper } from "../ext-api/ssh-helper";
import { FsSource } from "../sync/fs-source";
import { ISource } from "../sync/source";
import { Synchronizer } from "../sync/synchronizer";
import { VmsPathConverter, VmsPathPart, vmsPathRgx } from "../vms/vms-path-converter";

import * as nls from "vscode-nls";
nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

type BuildType = "com" | "mms" | "debug" | "release" | "both" | "undefined";

enum MmsLineType {
    nothing,
    includes,
    sources,
}

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

    private static readonly defMmsFileName = "resource/default.mms";
    private static readonly mmsUserCmd = printLike`MMS/EXTENDED_SYNTAX/DESCR=${"_.mms"}`;
    private static readonly mmsCmd = printLike`MMS/EXTENDED_SYNTAX/DESCR=${"_.mms"}/MACRO=("DEBUG=${"_1_"}","OUTDIR=${"outdir"}","NAME=${"name"}")`;
    private static readonly mmsExt = ".mms";
    private static readonly optExt = ".opt";
    private static readonly comExt = ".com";
    private static readonly defRange = new Range(0, 0, 0, 0);
    private static readonly getShellRootCmd = `WRITE SYS$OUTPUT F$TRNLNM("SYS$LOGIN")`;
    private static readonly labelDebug = "DEBUG";
    private static readonly labelRelease = "RELEASE";
    private static readonly labelBoth = "BOTH";
    private static readonly rgFile = /^([-_$a-z][-_$a-z0-9]*)(\.[-_$a-z0-9]*)?/;
    private static readonly includesLine = "INCLUDES=";
    private static readonly sourcesLine = "SOURCES=";

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

    public async buildProject(ensured: IEnsured, params?: string) {
        // clear password cache
        if (this.sshHelper) {
            this.sshHelper.clearPasswordCache();
        }
        const scopeData = await this.prepareScopeData(ensured);
        if (!scopeData) {
            return false;
        }
        let buildSelection: IBuildQuickPickItem | undefined;
        if (params === undefined) {
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
                    label: Builder.labelRelease,
                    type: "release",
                });
            selectItems.unshift({
                description: localize("quick.build.debug", "Build debug version [{0}]", ensured.configHelper.workspaceFolder!.name),
                label: Builder.labelDebug,
                type: "debug",
            });
            // select one
            buildSelection = await window.showQuickPick(selectItems, { ignoreFocusOut: true, canPickMany: false});
        } else if (typeof params === "string") {
            buildSelection = {
                label: "",
                type: "undefined",
            };
            switch (params.trim().toUpperCase()) {
                case Builder.labelDebug.toUpperCase():
                    buildSelection.type = "debug";
                    break;
                case Builder.labelRelease.toUpperCase():
                    buildSelection.type = "release";
                    break;
            }
            if (buildSelection.type === "undefined") {
                const match = params.trim().toLowerCase().match(Builder.rgFile);
                if (match && match[1] && match[2]) {
                    if ( match[2] === Builder.mmsExt) {
                        buildSelection.type = "mms";
                        buildSelection.label = params.trim();
                    } else if ( match[2] === Builder.comExt) {
                        buildSelection.type = "com";
                        buildSelection.label = params.trim();
                    }
                }
            }
        }
        if (buildSelection !== undefined && buildSelection.type !== "undefined") {
            return this.ensureMmsCreated(scopeData, buildSelection)
                .then((ok) => {
                    if (ok) {
                        return this.runRemoteBuild(scopeData, buildSelection!)
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

    public async cleanProject(ensured: IEnsured, params?: string) {
        let cleanSelection: IBuildQuickPickItem | undefined;
        // clear password cache
        if (this.sshHelper) {
            this.sshHelper.clearPasswordCache();
        }
        if (params === undefined) {
            const selectItems: IBuildQuickPickItem[] = [
                {
                    description: localize("quick.clean.release", "Clean release version [{0}]", ensured.configHelper.workspaceFolder!.name),
                    label: Builder.labelRelease,
                    type: "release",
                },
                {
                    description: localize("quick.clean.debug", "Clean debug version [{0}]", ensured.configHelper.workspaceFolder!.name),
                    label: Builder.labelDebug,
                    type: "debug",
                },
                {
                    description: localize("quick.clean.both", "Clean all [{0}]", ensured.configHelper.workspaceFolder!.name),
                    label: Builder.labelBoth,
                    type: "both",
                },
            ];
            // select one
            cleanSelection = await window.showQuickPick(selectItems, { ignoreFocusOut: true, canPickMany: false});
        } else if (typeof params === "string") {
            cleanSelection = {
                label: "",
                type: "undefined",
            };
            switch (params.trim().toUpperCase()) {
                case Builder.labelDebug.toUpperCase():
                    cleanSelection.type = "debug";
                    break;
                case Builder.labelRelease.toLocaleUpperCase():
                    cleanSelection.type = "release";
                    break;
                case Builder.labelBoth.toLocaleUpperCase():
                    cleanSelection.type = "both";
                    break;
            }
        }
        if (cleanSelection !== undefined && cleanSelection.type !== "undefined") {
            return this.runRemoteClean(ensured, cleanSelection);
        } else {
            return false;
        }
    }

    // public async createMms(scopeData: IScopeBuildData) {
    //     const localMmsFile = scopeData.ensured.projectSection.projectName + Builder.mmsExt;
    //     const foundMms = await scopeData.localSource.findFiles(localMmsFile);
    //     if (foundMms.length === 0) {
    //         // TODO: check project type: [exe, olb, shareable]
    //         // TODO: add dependencies
    //         const defMmsPath = contextSaved!.asAbsolutePath(Builder.defMmsFileName);
    //         const [content, headres, sources] = await Promise.all([
    //             fs.readFile(defMmsPath, "utf8"),
    //             scopeData.localSource.findFiles(scopeData.ensured.projectSection.headers, scopeData.ensured.projectSection.exclude),
    //             scopeData.localSource.findFiles(scopeData.ensured.projectSection.source, scopeData.ensured.projectSection.exclude)]);
    //         // add files to the lists
    //         let newContent = `OUTDIR=${scopeData.ensured.projectSection.outdir}\n`
    //                         + `NAME=${scopeData.ensured.projectSection.projectName}\n`
    //                         + `INCLUDES=${headres.map(iFileEntryToVmsPath).join(" -\n\t")}\n`
    //                         + `SOURCES=${sources.map(iFileEntryToVmsPath).join(" -\n\t")}\n`
    //                         + content;
    //         // add "source -> obj" dependency for each source
    //         for (const source of sources) {
    //             const vms = new VmsPathConverter(source.filename);
    //             const sourceDependencyLine = "[$(OBJ_DIR)" + vms.bareDirectory + "]" + vms.fileName + ".obj : " + vms.fullPath + " $(INCLUDES)";
    //             newContent += sourceDependencyLine + "\n";
    //         }
    //         await fs.writeFile(scopeData.localSource.root + ftpPathSeparator + localMmsFile, newContent);
    //         return Synchronizer.acquire(this.logFn).uploadFiles(scopeData.ensured, [localMmsFile]);
    //     } else {
    //         return true;
    //     }
    // }

    public async createMmsFiles(ensured: IEnsured) {
        const content = await this.createMmsContent(ensured);
        if (content) {
            if (content.contentMMS) {
                const localMmsFile = ensured.projectSection.projectName + Builder.mmsExt;
                const localMmsPath = ensured.configHelper.workspaceFolder!.uri.fsPath + ftpPathSeparator + localMmsFile;
                if (await fs.pathExists(localMmsPath)) {
                    await fs.move(localMmsPath, localMmsPath + ".back", {overwrite: true});
                    this.logFn(LogType.warning, () => localize("mms_exist", "Previous MMS file is renamed to {0}", localMmsFile + ".back"));
                }
                await fs.writeFile(localMmsPath, content.contentMMS);
                if (content.contentOPT) {
                    const localOptFile = ensured.projectSection.projectName + Builder.optExt;
                    const localOptPath = ensured.configHelper.workspaceFolder!.uri.fsPath + ftpPathSeparator + localOptFile;
                    if (await fs.pathExists(localOptPath)) {
                        await fs.move(localOptPath, localOptPath + ".back", {overwrite: true});
                        this.logFn(LogType.warning, () => localize("opt_exist", "Previous OPT file is renamed to {0}", localOptFile + ".back"));
                    }
                    await fs.writeFile(localOptPath, content.contentOPT);
                }
                if (content.contentCOM) {
                    const localComFile = ensured.projectSection.projectName + Builder.comExt;
                    const localComPath = ensured.configHelper.workspaceFolder!.uri.fsPath + ftpPathSeparator + localComFile;
                    if (await fs.pathExists(localComPath)) {
                        await fs.move(localComPath, localComPath + ".back", {overwrite: true});
                        this.logFn(LogType.warning, () => localize("com_exist", "Previous COM file is renamed to {0}", localComFile + ".back"));
                    }
                    await fs.writeFile(localComPath, content.contentCOM);
                }
                return true;
            }
        }
        return false;
    }

    public async createMmsContent(ensured: IEnsured) {
        if (!ensured.configHelper.workspaceFolder) {
            return undefined;
        }
        const localSource = new FsSource(ensured.configHelper.workspaceFolder.uri.fsPath, this.logFn);
        // common part
        const [headers, sources] = await Promise.all([
            localSource.findFiles(ensured.projectSection.headers, ensured.projectSection.exclude),
            localSource.findFiles(ensured.projectSection.source, ensured.projectSection.exclude)]);

        const optLines: string[] = [];
        const comLines: string[] = [];

        const headerLines = [
            `! Do not modify this file. It may be overwritten automatically.`,
            `OUTDIR=${ensured.projectSection.outdir}`,
            `NAME=${ensured.projectSection.projectName}`,
        ];

        const includeLines = [Builder.includesLine];
        for (const inc of headers) {
            includeLines[includeLines.length - 1] = includeLines[includeLines.length - 1] + " -";    // continuation
            includeLines.push(iFileEntryToVmsPath(inc));
        }
        const sourceLines = [Builder.sourcesLine];
        for (const src of sources) {
            sourceLines[sourceLines.length - 1] = sourceLines[sourceLines.length - 1] + " -";        // continuation
            sourceLines.push(iFileEntryToVmsPath(src));
        }

        const objectDependenciesLines: string[] = [];
        for (const source of sources) {
            const vms = new VmsPathConverter(source.filename);
            const objectDependencyLine = "[$(OBJ_DIR)" + vms.bareDirectory + "]" + vms.fileName + ".obj : " + vms.fullPath + " $(INCLUDES)";
            objectDependenciesLines.push(objectDependencyLine);
        }

        // project dependecies
        const cxxIncludes: string[] = [];
        const contentFirst: string[] = [".FIRST"];
        let deps = new ProjDepTree().getDepList(ensured.scope);
        if (deps.length > 1) {  // first is this project
            deps = deps.splice(1);
            for (const depPrj of deps) {
                const depEnsured = await ensureSettings(depPrj, this.logFn);
                if (depEnsured) {
                    if (depEnsured.projectSection.projectType === ProjectType[ProjectType.library] ||
                        depEnsured.projectSection.projectType === ProjectType[ProjectType.shareable]) {
                        const vms = new VmsPathConverter(depEnsured.projectSection.root + ftpPathSeparator);
                        const projName = depEnsured.projectSection.projectName.toUpperCase();
                        const outDir = depEnsured.projectSection.outdir;
                        contentFirst.push(`    ${projName}_INC_SYMB = F$TRNLNM("SYS$LOGIN")-"]"+"${vms.bareDirectory}]"`);
                        contentFirst.push(`    DEFINE ${projName}_INC_DIR '${projName}_INC_SYMB'`);
                        contentFirst.push(`    ${projName}_LIB_SYMB = F$TRNLNM("SYS$LOGIN")-"]"+"${vms.bareDirectory}.${outDir}.$(TYPE_DIR)]"`);
                        contentFirst.push(`    DEFINE ${projName}_LIB_DIR '${projName}_LIB_SYMB'`);
                        cxxIncludes.push(`${projName}_INC_DIR`);
                        if (depEnsured.projectSection.projectType === ProjectType[ProjectType.library]) {
                            optLines.push(`${projName}_LIB_DIR:${projName}/LIBRARY`);
                        }
                        if (depEnsured.projectSection.projectType === ProjectType[ProjectType.shareable]) {
                            optLines.push(`${projName}_LIB_DIR:${projName}/SHAREABLE`);
                            // com file
                            comLines.push(`TYPE:=DEBUG`);
                            comLines.push(`if P1 .NES. "" THEN TYPE:='P1'`);
                            comLines.push(`${projName}_LIB_SYMB = F$TRNLNM("SYS$LOGIN")-"]"+"${vms.bareDirectory}.${outDir}.'TYPE']"`);
                            comLines.push(`DEFINE ${projName}_LIB_DIR '${projName}_LIB_SYMB'`);
                            comLines.push(`DEFINE ${projName} ${projName}_LIB_DIR:${projName}.exe`);
                        }
                    }
                }
            }
        }
        contentFirst.push("");

        if (ensured.projectSection.projectType === ProjectType[ProjectType.shareable]) {
            optLines.push(`GSMATCH=LEQUAL,1,1001    ! adjust vesrion`);
            optLines.push(`!SYMBOL_VECTOR=()        ! add universal symbols here`);
        }

        const includeDirCxx = cxxIncludes.length
            ? `/INCLUDE_DIRECTORY=(${cxxIncludes.join(",")})`
            : "";
        const cxxCommonFlags = `/OBJECT=$(MMS$TARGET)${includeDirCxx}`;
        const cxxDebugFlags = `/DEBUG/NOOP/LIST=$(MMS$TARGET_NAME)${cxxCommonFlags}`;
        const linkCommonFlags = ensured.projectSection.projectType === ProjectType[ProjectType.executable]
            ? `/EXECUTABLE=$(MMS$TARGET)`
            : ensured.projectSection.projectType === ProjectType[ProjectType.shareable]
            ? `/SHAREABLE=$(MMS$TARGET)`
            : ``;

        const flagLines = [
        `.IF DEBUG`,
        `TYPE_DIR=debug`,
        `CXXFLAGS = ${cxxDebugFlags}`,
        `CCFLAGS = ${cxxDebugFlags}`,
        `LINKFLAGS = /DEBUG/MAP=$(MMS$TARGET_NAME)${linkCommonFlags}`,
        `.ELSE`,
        `TYPE_DIR=release`,
        `CXXFLAGS = ${cxxCommonFlags}`,
        `CCFLAGS = ${cxxCommonFlags}`,
        `LINKFLAGS = ${linkCommonFlags}`,
        `.ENDIF`,
        ];

        const middleLines = [
            `.SILENT`,
            `OUT_DIR = .$(OUTDIR).$(TYPE_DIR)`,
            `OBJ_DIR = $(OUT_DIR).obj`,
            `.SUFFIXES`,
            `.SUFFIXES .OBJ .CPP .C .CLD .MSG`,
            `.CPP.OBJ`,
            `    pipe create/dir $(DIR $(MMS$TARGET)) | copy SYS$INPUT nl:`,
            `    $(CXX) $(CXXFLAGS) $(MMS$SOURCE)`,
            ``,
            `.C.OBJ`,
            `    pipe create/dir $(DIR $(MMS$TARGET)) | copy SYS$INPUT nl:`,
            `    $(CC) $(CCFLAGS) $(MMS$SOURCE)`,
            ``,
            ``,
            `.CLD.OBJ`,
            `    pipe create/dir $(DIR $(MMS$TARGET)) | copy SYS$INPUT nl:`,
            `    SET COMMAND/OBJECT=$(MMS$TARGET) $(MMS$SOURCE)`,
            ``,
            `.MSG.OBJ`,
            `    pipe create/dir $(DIR $(MMS$TARGET)) | copy SYS$INPUT nl:`,
            `    MESSAGE /OBJECT=$(MMS$TARGET) $(MMS$SOURCE)`,
            ``,
        ];

        const mainModuleLines: string[] = [];
        if (ensured.projectSection.projectType === ProjectType[ProjectType.executable] ||
            ensured.projectSection.projectType === ProjectType[ProjectType.shareable] ) {
            mainModuleLines.push(`[$(OUT_DIR)]$(NAME).EXE : `);
            for (const source of sources) {
                mainModuleLines[mainModuleLines.length - 1] = mainModuleLines[mainModuleLines.length - 1] + " -";
                const vms = new VmsPathConverter(source.filename);
                const objectLine = `[$(OBJ_DIR)${vms.bareDirectory}]${vms.fileName}.obj`;
                mainModuleLines.push(objectLine);
            }
            if (optLines.length) {
                mainModuleLines.push(`    LINK $(LINKFLAGS) $(MMS$SOURCE_LIST),[]$(NAME)/OPT`);
            } else {
                mainModuleLines.push(`    LINK $(LINKFLAGS) $(MMS$SOURCE_LIST)`);
            }
            mainModuleLines.push(``);
        }
        if (ensured.projectSection.projectType === ProjectType[ProjectType.library]) {
            for (const source of sources) {
                const vms = new VmsPathConverter(source.filename);
                mainModuleLines.push(`[$(OUT_DIR)]$(NAME).OLB :: [$(OBJ_DIR)${vms.bareDirectory}]${vms.fileName}.obj`);
                mainModuleLines.push(`   IF "''F$SEARCH("[$(OUT_DIR)]$(NAME).OLB")'" .EQS. "" THEN -`);
                mainModuleLines.push(`       LIBR/CREATE/OBJ [$(OUT_DIR)]$(NAME).OLB`);
                mainModuleLines.push(`   LIBR [$(OUT_DIR)]$(NAME).OLB [$(OBJ_DIR)${vms.bareDirectory}]${vms.fileName}.obj`);
                mainModuleLines.push(``);
            }
        }

        localSource.dispose();

        const allLines = [
            `! header`,
            ...headerLines,
            `! includes`,
            ...includeLines,
            `! sources`,
            ...sourceLines,
            `! dependencies`,
            ...contentFirst,
            `! compiler/linker options`,
            ...flagLines,
            `! directives`,
            ...middleLines,
            `! main target`,
            ...mainModuleLines,
            `! objects`,
            ...objectDependenciesLines,
            ``,
        ];
        let maxWidth = 0;
        for (const l of allLines) {
            maxWidth = Math.max(maxWidth, l.length);
        }
        const contentMMS = allLines.map((line) => line.padEnd(maxWidth)).join(" !auto\n");

        let contentOPT: string | undefined;
        if (optLines.length) {
            contentOPT = optLines.join("\n");
        }

        let contentCOM: string | undefined;
        if (comLines.length) {
            contentCOM = comLines.join("\n");
        }

        return { contentMMS, contentOPT, contentCOM};
    }

    /**
     * Test if we need to create new MMS
     * @param ensured settings
     * @param content old MMS content
     * @returns true if we need to create MMS
     */
    public async checkMmsContent(ensured: IEnsured, content: string) {
        if (!ensured.configHelper.workspaceFolder) {
            return false;
        }
        if (!content) {
            return true;
        }

        const foundIncludes: string[] = [];
        const foundSources: string[] = [];

        let lineType: MmsLineType = MmsLineType.nothing;
        let blocksFound = 0;
        for (const line of content.split("\n")) {
            if (lineType !== MmsLineType.nothing) {
                const matched = line.match(vmsPathRgx);
                if (matched && matched[VmsPathPart.fileName]) {
                    if (lineType === MmsLineType.includes) {
                        foundIncludes.push(VmsPathConverter.fromVms(matched[0]).initial);
                    } else if (lineType === MmsLineType.sources) {
                        foundSources.push(VmsPathConverter.fromVms(matched[0]).initial);
                    }
                } else {
                    lineType = MmsLineType.nothing;
                }
            } else if (line.startsWith(Builder.includesLine)) {
                lineType = MmsLineType.includes;
                blocksFound = blocksFound + 1;
            } else if (line.startsWith(Builder.sourcesLine)) {
                lineType = MmsLineType.sources;
                blocksFound = blocksFound + 1;
            } else if (blocksFound === 2) {
                // stop searching
                break;
            }
        }

        const localSource = new FsSource(ensured.configHelper.workspaceFolder.uri.fsPath, this.logFn);
        // common part
        const [localIncludes, localSources] = await Promise.all([
            localSource.findFiles(ensured.projectSection.headers, ensured.projectSection.exclude),
            localSource.findFiles(ensured.projectSection.source, ensured.projectSection.exclude)]);

        if (localIncludes.length !== foundIncludes.length) {
            return true;
        }

        if (localSources.length !== foundSources.length) {
            return true;
        }

        if (foundIncludes.length > 0) {
            const sortedFound = foundIncludes.sort();
            const sortedLocal = localIncludes.map((entry) => entry.filename).sort();
            for (let idx = 0; idx < sortedLocal.length; idx++) {
                if (sortedLocal[idx] !== sortedFound[idx]) {
                    return true;
                }
            }
        }

        if (foundSources.length > 0) {
            const sortedFound = foundSources.sort();
            const sortedLocal = localSources.map((entry) => entry.filename).sort();
            for (let idx = 0; idx < sortedLocal.length; idx++) {
                if (sortedLocal[idx] !== sortedFound[idx]) {
                    return true;
                }
            }
        }

        return false;
    }

    private async ensureMmsCreated(scopeData: IScopeBuildData, selection: IBuildQuickPickItem) {
        if (!(selection.type === "debug" || selection.type === "release" || selection.type === "both")) {
            return true;
        }

        const localMmsFile = scopeData.ensured.projectSection.projectName + Builder.mmsExt;
        const foundMms = await scopeData.localSource.findFiles(localMmsFile);
        let createMMS = true;
        if (foundMms.length === 1) {
            const localMmsPath = scopeData.localSource.root + ftpPathSeparator + localMmsFile;
            createMMS = await this.checkMmsContent(scopeData.ensured, (await fs.readFile(localMmsPath)).toString("utf8"));
        }
        if (createMMS) {
            return this.createMmsFiles(scopeData.ensured)
                .then(async (ok) => {
                    if (ok) {
                        const files = [localMmsFile];
                        const localOptFile = scopeData.ensured.projectSection.projectName + Builder.optExt;
                        const foundOpt = await scopeData.localSource.findFiles(localOptFile);
                        if (foundOpt.length !== 0) {
                            files.push(localOptFile);
                        }
                        const localComFile = scopeData.ensured.projectSection.projectName + Builder.comExt;
                        const foundCom = await scopeData.localSource.findFiles(localComFile);
                        if (foundCom.length !== 0) {
                            files.push(localComFile);
                        }
                        return Synchronizer.acquire(this.logFn).uploadFiles(scopeData.ensured, files);
                    }
                    return ok;
                });
        }
        return true;
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
                    // check MSG or CLD
                    if (entry.facility &&
                        (entry.facility.toUpperCase() === "MESSAGE" || entry.facility.toUpperCase() === "CDU") &&
                        (selection.type === "release" || selection.type === "debug")) {
                        // conver target to source
                        const outPathLength = scopeData.ensured.projectSection.outdir.length + selection.type.length + 6;   // 6 = length of "obj" and three separators
                        localFile = localFile.slice(outPathLength);
                        const dotPos = localFile.indexOf(".");
                        if (dotPos >= 0) {
                            localFile = localFile.slice(0, dotPos);
                            switch (entry.facility.toUpperCase()) {
                                case "MESSAGE":
                                    localFile += ".msg";  // we assume it is MSG
                                    break;
                                case "CDU":
                                    localFile += ".cld";  // we assume it is CLD
                                    break;
                                default:
                                    localFile += ".txt";  // so it might be TXT?
                            }
                        }
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
        let scopeData = Builder.buildScopes.get(scopeKey);
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
            scopeData = {
                ensured,
                isValid: true,
                localSource,
                shell,
                shellRootConverter,
                sshWatcher,
                watcher,
            } as IScopeBuildData;
            Builder.buildScopes.set(scopeKey, scopeData);
            return scopeData;

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
