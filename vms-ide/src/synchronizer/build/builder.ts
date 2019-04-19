
import micromatch from "micromatch";
import fs from "fs-extra";
import path from "path";
import { Diagnostic, DiagnosticCollection, DiagnosticSeverity, languages, Range, Uri, workspace } from "vscode";

import { IFileEntry, LogFunction, LogType } from "../../common/main";
import { printLike } from "../../common/main";
import { ftpPathSeparator } from "../../common/main";
import { GetSshHelperType, GetZipApi } from "../../ext-api/ext-api";
import { ISshShell } from "../../ssh-helper/api";
import { IDispose, SshHelper } from "../../ssh-helper/ssh-helper";
import { parseVmsOutput } from "../common/parse-output";
import { ProjectType } from "../config/sections/project";
import { ProjDepTree } from "../dep-tree/proj-dep-tree";
import { ensureSettings, IEnsured } from "../ensure-settings";
import { FsSource } from "../sync/fs-source";
import { ISource } from "../sync/source";
import { Synchronizer } from "../sync/synchronizer";
import { VmsPathConverter, VmsPathPart, vmsPathRgx } from "../vms/vms-path-converter";
import { ProjectState } from "../dep-tree/proj-state";
import * as nls from "vscode-nls";

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

enum BuildConfiguration {
    unknown,
    debug,
    release,
    mms,
    com,
}

enum MmsLineType {
    nothing,
    includes,
    sources,
}

function convertIFileEntryToVmsPath(file: IFileEntry) {
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

    private static readonly mmsUserCmd = printLike`MMS/EXTENDED_SYNTAX/DESCR=${"_.mms"}`;
    private static readonly mmsCmd = printLike`MMS/EXTENDED_SYNTAX/DESCR=${"_.mms"}/MACRO=("DEBUG=${"_1_"}","OUTDIR=${"outdir"}","NAME=${"name"}")`;

    private static readonly cleanDEBUG = printLike`del/tree [.${"outdir"}.DEBUG...]*.*;*`;
    private static readonly cleanRELEASE = printLike`del/tree [.${"outdir"}.RELEASE...]*.*;*`;

    private static readonly cleanSuffix = " CLEAN";

    private static readonly mmsExt = ".mms";
    private static readonly optExt = ".opt";
    private static readonly comExt = ".com";

    private static readonly zipName = "lists";
    private static readonly zipExt = ".zip";
    private static readonly zipCmd = printLike`zip "-r" ${"zipName"} *.* -i ${"zipList"}`;

    private static readonly defRange = new Range(0, 0, 0, 0);

    private static readonly getShellRootCmd = `WRITE SYS$OUTPUT F$TRNLNM("SYS$LOGIN")`;
    private static readonly rgFile = /^([-_$a-z][-_$a-z0-9]*)(\.[-_$a-z0-9]*)?/;
    private static readonly includesLine = "INCLUDES=";
    private static readonly sourcesLine = "SOURCES=";

    private static instance?: Builder;

    public logFn: LogFunction;

    private collection?: DiagnosticCollection;
    private sshHelper?: SshHelper;

    public  stopIssued = false;

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

    /**
     * Parse parameter and returns BuildConfiguration
     * @param params 
     */
    private parseParams(params?: string): [BuildConfiguration, string] {
        params = params || ProjectState.acquire().getDefBuildType();
        switch(params.toLowerCase()) {
            case BuildConfiguration[BuildConfiguration.debug].toLowerCase():
                return [BuildConfiguration.debug, ""];
            case BuildConfiguration[BuildConfiguration.release].toLowerCase():
                return [BuildConfiguration.release, ""];
        }
        const match = params.trim().toLowerCase().match(Builder.rgFile);
        if (match && match[1] && match[2]) {
            if ( match[2] === Builder.mmsExt) {
                return [BuildConfiguration.mms, params.trim()];
            } else if ( match[2] === Builder.comExt) {
                return [BuildConfiguration.com, params.trim()];
            }
        }
        return [BuildConfiguration.unknown, ""];
    }

    /**
     * Fast build, 
     * @param ensured scope settings
     * @param params build type or user defined MMS or COM
     */
    public async buildProject(ensured: IEnsured, params?: string) {
        // clear password cache
        if (this.sshHelper) {
            this.sshHelper.clearPasswordCache();
        }
        const scopeData = await this.prepareScopeData(ensured);
        if (!scopeData) {
            return false;
        }
        this.enableRemote();
        const [cfg, cmd] = this.parseParams(params);
        return this.ensureMmsCreated(scopeData, cfg)
            .then(async (result) => {
                if (result) {
                    if (ensured.configHelper.workspaceFolder) {
                        // upload modified only list
                        const projectName = ensured.configHelper.workspaceFolder.name;
                        const modifiedList = ProjectState.acquire().getModifiedList(projectName);
                        if (modifiedList.length > 0) {
                            this.smartClean(scopeData, modifiedList, cfg);
                            if (this.stopIssued) {
                                Synchronizer.acquire().disableRemote();
                            } else {
                                Synchronizer.acquire().enableRemote();
                            }
                            if (await Synchronizer.acquire().uploadFiles(ensured, modifiedList)) {
                                ProjectState.acquire().clearModified(projectName);
                            }
                            if (scopeData.ensured.synchronizeSection.purge) {
                                await scopeData.shell.execCmd("purge [...]");
                            }                    
                        }
                    }
                    return this.runRemoteBuild(scopeData, cfg, cmd);
                } else {
                    this.logFn(LogType.error, () => localize("create.mms.first", "Please first (re)create MMS."));
                }
                return result;
            })
            .then((result) => {
                this.decideDispose(scopeData);
                return result;
            });
    }

    protected async smartClean(scopeData: IScopeBuildData, files: string[], cfg: BuildConfiguration) {
        if (cfg !== BuildConfiguration.debug && cfg !== BuildConfiguration.release) {
            return;
        }
        for (const file of files) {
            const vms = new VmsPathConverter(file);
            const objDir = scopeData.ensured.projectSection.outdir + "." + BuildConfiguration[cfg] + ".obj";
            const command = "del [." + objDir + vms.bareDirectory + "]" + vms.fileName + ".*;*";
            const out = await scopeData.shell.execCmd(command);
            if (!out) {
                this.logFn(LogType.error, () => localize("output.cannot_exec", "Cannot execute > {0}", command));
            }
        }
    }

    public enableRemote() {
        this.stopIssued = false;
        for (const buildScopeData of Builder.buildScopes.values()) {
            buildScopeData.shell.enabled = true;
        }
    }

    public disableRemote() {
        this.stopIssued = true;
        for (const buildScopeData of Builder.buildScopes.values()) {
            buildScopeData.shell.enabled = false;
        }
    }

    public async cleanProject(ensured: IEnsured, params?: string) {
        // clear password cache
        if (this.sshHelper) {
            this.sshHelper.clearPasswordCache();
        }
        const scopeData = await this.prepareScopeData(ensured);
        if (!scopeData) {
            return false;
        }
        this.enableRemote();
        const [cfg, cmd] = this.parseParams(params);
        return this.runRemoteClean(scopeData, cfg, cmd)
            .then((result) => {
                this.decideDispose(scopeData);
                return result;
        });
    }

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
            includeLines.push(convertIFileEntryToVmsPath(inc));
        }
        const sourceLines = [Builder.sourcesLine];
        for (const src of sources) {
            sourceLines[sourceLines.length - 1] = sourceLines[sourceLines.length - 1] + " -";        // continuation
            sourceLines.push(convertIFileEntryToVmsPath(src));
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
        `BLISSFLAGS = ${cxxDebugFlags}`,
        `LINKFLAGS = /DEBUG/MAP=$(MMS$TARGET_NAME)${linkCommonFlags}`,
        `.ELSE`,
        `TYPE_DIR=release`,
        `CXXFLAGS = ${cxxCommonFlags}`,
        `CCFLAGS = ${cxxCommonFlags}`,
        `BLISSFLAGS = ${cxxCommonFlags}`,
        `LINKFLAGS = ${linkCommonFlags}`,
        `.ENDIF`,
        ];

        const middleLines = [
            `.SILENT`,
            `OUT_DIR = .$(OUTDIR).$(TYPE_DIR)`,
            `OBJ_DIR = $(OUT_DIR).obj`,
            `.SUFFIXES`,
            `.SUFFIXES .OBJ .CPP .C .CLD .MSG .BLI`,
            `.CPP.OBJ`,
            `    pipe create/dir $(DIR $(MMS$TARGET)) | copy SYS$INPUT nl:`,
            `    $(CXX) $(CXXFLAGS) $(MMS$SOURCE)`,
            ``,
            `.C.OBJ`,
            `    pipe create/dir $(DIR $(MMS$TARGET)) | copy SYS$INPUT nl:`,
            `    $(CC) $(CCFLAGS) $(MMS$SOURCE)`,
            ``,
            `.CLD.OBJ`,
            `    pipe create/dir $(DIR $(MMS$TARGET)) | copy SYS$INPUT nl:`,
            `    SET COMMAND/OBJECT=$(MMS$TARGET) $(MMS$SOURCE)`,
            ``,
            `.MSG.OBJ`,
            `    pipe create/dir $(DIR $(MMS$TARGET)) | copy SYS$INPUT nl:`,
            `    MESSAGE /OBJECT=$(MMS$TARGET) $(MMS$SOURCE)`,
            ``,
            `.BLI.OBJ`,
            `    pipe create/dir $(DIR $(MMS$TARGET)) | copy SYS$INPUT nl:`,
            `    BLISS $(BLISSFLAGS) $(MMS$SOURCE)`,
            ``,
            `.DEFAULT`,
            `    ! Source $(MMS$TARGET) not yet added`,
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
                mainModuleLines.push(`    CXXLINK $(LINKFLAGS) $(MMS$SOURCE_LIST),[]$(NAME)/OPT`);
            } else {
                mainModuleLines.push(`    CXXLINK $(LINKFLAGS) $(MMS$SOURCE_LIST)`);
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

    private async ensureMmsCreated(scopeData: IScopeBuildData, cfg: BuildConfiguration, autoCreate = false) {
        if (!(cfg === BuildConfiguration.debug || cfg === BuildConfiguration.release)) {
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
            if (autoCreate) {
                return this.createMmsFiles(scopeData.ensured);
            }
            return false;
        }
        return true;
    }

    private async runRemoteClean(scopeData: IScopeBuildData, cfg: BuildConfiguration, cmd: string) {
        // decide what to clean
        let command = "";
        switch (cfg) {
            case BuildConfiguration.unknown:
                return false;
            case BuildConfiguration.debug:
                command = Builder.cleanDEBUG(scopeData.ensured.projectSection.outdir);
                break;
            case BuildConfiguration.release:
                command = Builder.cleanRELEASE(scopeData.ensured.projectSection.outdir);
                break;
            case BuildConfiguration.com:
                command = '@' + cmd + Builder.cleanSuffix;
                break;
            case BuildConfiguration.mms:
                command = Builder.mmsUserCmd(cmd) + Builder.cleanSuffix;
                break;
        }
        // run if decided
        const output = await scopeData.shell.execCmd(command);
        if (output) {
            switch (cfg) {
                case BuildConfiguration.com:
                case BuildConfiguration.mms:
                    this.logFn(LogType.information, () => output.join("\n"));
                    break;
            }
            return true;
        } else {
            this.logFn(LogType.error, () => localize("output.cannot_exec", "Cannot execute > {0}", command));
            return false;
        }
    }

    private async runRemoteBuild(scopeData: IScopeBuildData, cfg: BuildConfiguration, cmd: string) {
        let command = "";
        let debugDefine = "";
        switch (cfg) {
            case BuildConfiguration.unknown:
                return false;
            case BuildConfiguration.debug:
                debugDefine = "1";
            case BuildConfiguration.release:
                command = 
                    Builder.mmsCmd(scopeData.ensured.projectSection.projectName + Builder.mmsExt,
                        debugDefine,
                        scopeData.ensured.projectSection.outdir,
                        scopeData.ensured.projectSection.projectName);
                break;
            case BuildConfiguration.com:
                command = '@' + cmd;
                break;
            case BuildConfiguration.mms:
                command = Builder.mmsUserCmd(cmd);
                break;
        }
        // run if decided
        const output = await scopeData.shell.execCmd(command);
        if (output) {
            let retCode = true;
            switch (cfg) {
                case BuildConfiguration.com:
                case BuildConfiguration.mms:
                    this.logFn(LogType.information, () => output.join("\n"));
                    break;
                default:
                    retCode = await this.parseProblems(scopeData, output, cfg, cmd);
                    break;
            }
            // always try to download listing, for all configurations
            let downloadedByZip = false;
            if (scopeData.ensured.synchronizeSection.preferZip) {
                // get and save current folder
                let currentPath: VmsPathConverter | undefined;
                let answer = await scopeData.shell.execCmd('show default');
                if (answer && answer.length !== 0) {
                    currentPath = VmsPathConverter.fromVms(answer[0].trim());
                }
                // go to folder for zipping files
                const zipFolder = 
                    scopeData.shellRootConverter.initial
                    + scopeData.ensured.projectSection.root
                    + ftpPathSeparator
                    + scopeData.ensured.projectSection.outdir
                    + ftpPathSeparator
                    + "debug"
                    + ftpPathSeparator;
                const zipFolderConverter = new VmsPathConverter(zipFolder);
                let cd = `set def ${zipFolderConverter.directory}`;
                answer = await scopeData.shell.execCmd(cd);
                // create zip file 
                let lists = scopeData.ensured.projectSection.listing;
                lists = lists || "*.lis";
                const unbracedList = micromatch.braces(lists).join(" ");
                const zipCmd = Builder.zipCmd(Builder.zipName, unbracedList);
                answer = await scopeData.shell.execCmd(zipCmd);
                // download zip file
                const relZipName = scopeData.ensured.projectSection.outdir + "/debug/" + Builder.zipName + Builder.zipExt;
                const downloaded = await Synchronizer.acquire(this.logFn).downloadFiles(scopeData.ensured, [relZipName]);
                if (downloaded) {
                    // unzip it
                    const zipApi = GetZipApi();
                    if (zipApi && scopeData.ensured.configHelper.workspaceFolder) {
                        const fullZipName = path.join(scopeData.ensured.configHelper.workspaceFolder.uri.fsPath, relZipName);
                        downloadedByZip = await new zipApi(this.logFn).unzip(fullZipName);
                    }
                }
                // delete zip file on OpenVMS side
                answer = await scopeData.shell.execCmd(`del ${Builder.zipName + Builder.zipExt};*`);
                // go back to saved current folder
                if (currentPath) {
                    cd = `set def ${currentPath.directory}`;
                    answer = await scopeData.shell.execCmd(cd);
                }
            }
            if (!downloadedByZip) {
                await Synchronizer.acquire(this.logFn).downloadListings(scopeData.ensured);
            }
            return retCode;
        } else {
            this.logFn(LogType.error, () => localize("output.cannot_exec", "Cannot execute > {0}", command));
            return false;
        }
    }

    private async parseProblems(scopeData: IScopeBuildData, output: string[], cfg: BuildConfiguration, cmd: string) {
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
                        if (cfg === BuildConfiguration.mms) {
                            entry.file = cmd;
                        } else {
                            entry.file = scopeData.ensured.projectSection.projectName + Builder.mmsExt;
                        }
                    }
                }
                const file = String(entry.file);
                let uri = Uri.file(file);
                if (!entry.external &&
                    entry.file !== undefined &&
                    workspace.workspaceFolders) {
                    let localFile = file;
                    // cut cwd
                    if (cwd && file.toUpperCase().startsWith(cwd)) {
                        localFile = file.slice(cwd.length);
                    }
                    // check MSG or CLD
                    if (entry.facility &&
                        (entry.facility.toUpperCase() === "MESSAGE" || entry.facility.toUpperCase() === "CDU") &&
                        (cfg === BuildConfiguration.release || cfg === BuildConfiguration.debug)) {
                        // conver target to source
                        const outPathLength = scopeData.ensured.projectSection.outdir.length + BuildConfiguration[cfg].length + 6;   // 6 = length of "obj" and three separators
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
            shell.on("cleanClient", () => {
                markInvalid();
            });
            shell.on("cleanChannel", () => {
                markInvalid();
            });
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
