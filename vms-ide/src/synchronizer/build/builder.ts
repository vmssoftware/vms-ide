
import * as nls from "vscode-nls";
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
import { ensureSettings, IEnsured, ensureConfigSection } from "../ensure-settings";
import { FsSource } from "../sync/fs-source";
import { ISource } from "../sync/source";
import { Synchronizer } from "../sync/synchronizer";
import { VmsPathConverter, VmsPathPart, vmsPathRgx } from "../vms/vms-path-converter";
import { ProjectState } from "../dep-tree/proj-state";
import { IBuildConfigSection } from "../../synchronizer/sync/sync-api";
import { ParseExecResult } from "../../synchronizer/common/TestExecResult";
import { JvmProject, IClassInfo, IFieldInfo, isFieldAccess } from "../../vms_jvm_debug/jvm-project";
import { maskSpacesInTemplate } from "../../common/rgx-from-str";
import { expandMask } from "../../synchronizer/common/find-files";

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

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

function isCommandDefault(command: string | undefined) {
    return !command || command.toUpperCase() === "DEFAULT";
}

function isCommandMMS(command: string | undefined) {
    return command && command.toUpperCase().endsWith("MMS");
}

function isCommandCOM(command: string | undefined) {
    return command && command.toUpperCase().endsWith("COM");
}

function isParameterDebug(parameter: string | undefined) {
    return !parameter || parameter.toUpperCase() === "DEBUG";
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
    private static readonly mmsCmd = printLike`MMS/EXTENDED_SYNTAX/DESCR=${"_.mms"}/MACRO=("DEBUG=${"_1_"}","OUTDIR=${"outdir"}","NAME=${"name"}","CONFIG=${"buildName"}")`;

    private static readonly cleanCmd = printLike`delete /tree [.${"outdir"}.${"buildName"}...]*.*;*`;

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

    // for DEBUG only
    public async getClassPath(ensured: IEnsured, buildName: string) {

        if (ensured.projectSection.projectType === ProjectType[ProjectType.java] ||
            ensured.projectSection.projectType === ProjectType[ProjectType.scala] ||
            ensured.projectSection.projectType === ProjectType[ProjectType.kotlin] ) {

            // TODO: bring out into editable constants?
            const kotlinRuntime = "/kotlin$root/lib/kotlin-runtime.jar";
            const scalaRuntime = "/scala$root/lib/scala-library.jar";
            let hasKotlin = false;
            let hasScala = false;

            // project dependecies
            let depClassPath = ensured.projectSection.addLibraries.split(",").join(":");
            let deps = new ProjDepTree().getDepList(ensured.scope);
            if (deps.length > 0) {
                // first is this project
                for (const depPrj of deps) {
                    const depEnsured = await ensureSettings(depPrj, this.logFn);
                    if (depEnsured) {
                        switch (depEnsured.projectSection.projectType) {
                            case ProjectType[ProjectType.java]:
                                break;
                            case ProjectType[ProjectType.scala]:
                                hasScala = true;
                                break;
                            case ProjectType[ProjectType.kotlin]:
                                hasKotlin = true;
                                break;
                            default:
                                continue;   // go to next dependency
                        }
                        if (depClassPath) {
                            depClassPath += ":";
                        }
                        const projName = depEnsured.projectSection.projectName;
                        if (ensured.scope == depEnsured.scope) {
                            depClassPath += `${ensured.projectSection.outdir}/DEBUG/${projName}.jar`;
                        } else {
                            depClassPath += `/${projName.toUpperCase()}_LIB_DIR/${projName}.jar`;
                        }
                    }
                }
            }
            if (hasKotlin) {
                depClassPath += ":" + kotlinRuntime;
            }
            if (hasScala) {
                depClassPath += ":" + scalaRuntime;
            }

            return depClassPath;
        }

        return undefined;
    }

    /**
     * 
     * @param ensured 
     * @param buildName label of build configuration
     */
    public async collectJavaClasses(ensured: IEnsured, buildName: string) {

        switch(ensured.projectSection.projectType) {
            case ProjectType[ProjectType.java]:
            case ProjectType[ProjectType.scala]:
            case ProjectType[ProjectType.kotlin]:
                break;
            default:
                return false;
        }
    
        const startTime = Date.now();

        const jarFile = `${ensured.projectSection.outdir}/${buildName}/${ensured.projectSection.projectName}.jar`;
        const cmdJarClasses = `jar -tf ${jarFile}`;
        const cmdJavaClassLines = `javap -cp ${jarFile} -l -p `;
        const rgxJavaClassName = /^(\S*).class/;
        const rgFile = /Compiled from "(\w+\.\w+)"/;
        const rgLine = /line (\d+): (\d+)/;
        const rgMain = /public\s+static\s+(final\s+)?void\s+main\(/;
        const rgField = /^(\s*)((?:public|private|protected)\s+)?((?:(?:static|abstract|synchronized|transient|volatile|final|native|strictfp|default)\s+)*)(<\S+\s+)?([^\s(;]+\s+)?([^\s(;]+)\s*(\(.*\))?\s*(?:throws .*)?;/;

        if (this.sshHelper) {
            this.sshHelper.clearPasswordCache();
        }
        const scopeData = await this.prepareScopeData(ensured);
        if (!scopeData) {
            return false;
        }
        this.enableRemote();
            
        const resultLines = await scopeData.shell.execCmd(cmdJarClasses);
        if (!resultLines) {
            return false;
        }

        let   classNames: string[] = [];
        let   javapCmd = "";
        const maxCmdLength = 1024;

        const jvmProject = new JvmProject(ensured.scope, false);
        
        // combine command until its length is more than maxCmdLength
        for (const line of resultLines) {
            const matched = line.match(rgxJavaClassName);
            if (matched) {
                const className = matched[1];
                if (javapCmd === "") {
                    javapCmd = cmdJavaClassLines;
                }
                if (javapCmd.length + className.length + 1 < maxCmdLength ) {
                    javapCmd += " " + className;
                    classNames.push(className);
                } else {
                    // execute command and collect information
                    await updateJvmProject(this.logFn);
                }
            }
        }
        // execute command and collect information if it isn't empty
        await updateJvmProject(this.logFn);

        async function updateJvmProject(logFn: LogFunction) {
            if (!javapCmd) {
                return;
            }
            const result = await scopeData!.shell.execCmd(javapCmd);
            if (result && result.length > 0) {
                let classInfo: IClassInfo | undefined;
                let fieldInfo: IFieldInfo | undefined;
                for (const line of result) {
                    if (!line) {
                        continue;
                    }
                    const fileMatch = line.match(rgFile);
                    if (fileMatch) {
                        // found next class
                        let fileInfo = jvmProject.getFileInfo(fileMatch[1], true);
                        const className = classNames.shift();
                        if (className) {                                   
                            classInfo = jvmProject.getClassInfo(className, fileInfo);
                            fieldInfo = undefined;
                        } else {
                            logFn(LogType.error, () => localize("collect.no_class_for_file", "No class for this file match: {0}", line));
                            break;
                        }
                        continue;
                    }
                    const lineMatch = line.match(rgLine);
                    if (lineMatch) {
                        if (fieldInfo && fieldInfo.isMethod) {
                            fieldInfo.lines.add(+lineMatch[1]);
                        } else {
                            logFn(LogType.error, () => localize("collect.no_method_for_line", "No method for this line match: {0}", line));
                        }
                        continue;
                    }
                    const mainMatch = line.match(rgMain);
                    if (mainMatch) {
                        if (classInfo) {
                            classInfo.hasMain = true;
                        } else {
                            logFn(LogType.error, () => localize("collect.no_class_for_main", "No class for this main function match: {0}", line));
                        }
                    }
                    const maskedTemplates = maskSpacesInTemplate(line, "*");
                    const fieldMatch = maskedTemplates.match(rgField);
                    if (fieldMatch) {
                        if (classInfo) {
                            const spacesLength = fieldMatch[1] ? fieldMatch[1].length : 0;
                            const accessLength = fieldMatch[2] ? fieldMatch[2].length : 0;
                            const modifiersLength = fieldMatch[3] ? fieldMatch[3].length : 0;
                            const templateLength = fieldMatch[4] ? fieldMatch[4].length : 0;
                            const typeLength = fieldMatch[5] ? fieldMatch[5].length : 0;
                            const nameLength = fieldMatch[6] ? fieldMatch[6].length : 0;
                            const paramsLength = fieldMatch[7] ? fieldMatch[7].length : 0;
                            const access = line.substr(spacesLength, accessLength).trim();
                            const modifiers = line.substr(spacesLength + accessLength, modifiersLength).trim();
                            const template = line.substr(spacesLength + accessLength + modifiersLength, templateLength).trim();
                            const type = line.substr(spacesLength + accessLength + modifiersLength + templateLength, typeLength).trim();
                            const name = line.substr(spacesLength + accessLength + modifiersLength + templateLength + typeLength, nameLength).trim();
                            const params = line.substr(spacesLength + accessLength + modifiersLength + templateLength + typeLength + nameLength, paramsLength).trim();
                            fieldInfo = jvmProject.getFieldInfo(name, classInfo, params);
                            if (fieldInfo) {
                                fieldInfo.isMethod = (params !== "") || (name === "{}");  // special case for static initialization
                                fieldInfo.isStatic = modifiers.includes('static');
                                if (isFieldAccess(access)) {
                                    fieldInfo.access = access;
                                }
                                fieldInfo.type = type;
                                fieldInfo.template = template;
                                fieldInfo.params = params;
                                if (fieldMatch[3]) {
                                    const modifiers_masked = fieldMatch[3].split(" ");
                                    let start = 0;
                                    for (const modifier of modifiers_masked) {
                                        if (modifier) {
                                            const mod_unmasked = modifiers.substr(start, start + modifier.length);
                                            fieldInfo.modifiers.push(mod_unmasked);
                                            start += modifier.length;
                                        }
                                        ++start;
                                    }
                                }
                            }
                        } else {
                            logFn(LogType.error, () => localize("collect.no_class_for_method", "No class for method: {0}", line));
                        }
                        continue;
                    }
                }
            }
            if (classNames.length > 0) {
                logFn(LogType.error, () => localize("collect.no_info", "No info for classes: {0}", classNames.join(", ")));
            }
            javapCmd = "";
            classNames = [];
        }

        await jvmProject.save();

        const seconds = Math.floor((Date.now() - startTime) / 1000);
        this.logFn(LogType.information, () => `Elapsed ${seconds} sec.`);

        return true;
    }

    /**
     * Fast build, 
     * @param ensured scope settings
     * @param buildName name of predefined build settings
     */
    public async buildProject(ensured: IEnsured, buildName: string) {

        const buildCfg = ensured.buildsSection.configurations.find((cfg) => cfg.label === buildName);
        if (!buildCfg) {
            this.logFn(LogType.error, () => localize("build.cfg", "There is no build configuration named {0}.", buildName));
            return false;
        }

        // clear password cache
        if (this.sshHelper) {
            this.sshHelper.clearPasswordCache();
        }

        // scope data
        const scopeData = await this.prepareScopeData(ensured);
        if (!scopeData) {
            return false;
        }
        this.enableRemote();

        if (isCommandDefault(buildCfg.command)) {
            // test MMS is created for "default"
            if (!(await this.ensureMmsCreated(scopeData))) {
                this.logFn(LogType.error, () => localize("create.mms.first", "Please first (re)create MMS."));
                return false;
            }
            // smart clean
            if (ensured.scope) {
                const list = ProjectState.acquire().getList(ensured.scope);
                await this.smartClean(scopeData, list, buildName);
            }
        }

        let result = await Synchronizer.acquire().quickSync(ensured);

        if (result && scopeData.ensured.synchronizeSection.purge) {
            await scopeData.shell.execCmd("purge [...]");
        }                    

        result = await this.runRemoteBuild(scopeData, buildCfg);

        if (result) {
            switch(ensured.projectSection.projectType) {
                case ProjectType[ProjectType.java]:
                case ProjectType[ProjectType.scala]:
                case ProjectType[ProjectType.kotlin]:
                    // delete java classes info
                    if (ensured.configHelper.workspaceFolder) {
                        const fileName = path.join(ensured.configHelper.workspaceFolder.uri.fsPath, `.vscode`, `javaInfo.json`);
                        fs.unlink(fileName).catch(() => false);
                    }
                    break;
            }
        }

        this.decideDispose(scopeData);

        return result;
    }

    protected async smartClean(scopeData: IScopeBuildData, files: string[], buildName: string) {
        for (const file of files) {
            const vms = new VmsPathConverter(file);
            const objDir = scopeData.ensured.projectSection.outdir + "." + buildName + ".obj";
            const command = "delete [." + objDir + vms.bareDirectory + "]" + vms.fileName + ".*;*";
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

    public async cleanProject(ensured: IEnsured, buildName: string) {

        const buildCfg = ensured.buildsSection.configurations.find((cfg) => cfg.label === buildName);
        if (!buildCfg) {
            this.logFn(LogType.error, () => localize("build.cfg", "There is no build configuration named {0}.", buildName));
            return false;
        }

        // clear password cache
        if (this.sshHelper) {
            this.sshHelper.clearPasswordCache();
        }
        const scopeData = await this.prepareScopeData(ensured);
        if (!scopeData) {
            return false;
        }
        this.enableRemote();

        const result = await this.runRemoteClean(scopeData, buildCfg)
        this.decideDispose(scopeData);
        return result;
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

        if (!sources) {
            return undefined;
        }
        const optLines: string[] = [];
        const comLines: string[] = [];

        const headerLines = [
            `! Do not modify this file. It may be overwritten automatically.`,
            // `OUTDIR=${ensured.projectSection.outdir}`,
            // `NAME=${ensured.projectSection.projectName}`,
        ];

        const includeLines = [Builder.includesLine];
        if (headers) {
            for (const inc of headers) {
                includeLines[includeLines.length - 1] = includeLines[includeLines.length - 1] + " -";    // continuation
                includeLines.push(convertIFileEntryToVmsPath(inc));
            }
        }
        const sourceLines = [Builder.sourcesLine];
        for (const src of sources) {
            sourceLines[sourceLines.length - 1] = sourceLines[sourceLines.length - 1] + " -";        // continuation
            sourceLines.push(convertIFileEntryToVmsPath(src));
        }

        const cxxIncludes: string[] = [];
        const contentFirst: string[] = [".FIRST"];
        const contentLast: string[] = [".LAST"];
        const mainModuleLines: string[] = [];
        const flagLines : string[] = [];
        const middleLines : string[] = [];
        const objectDependenciesLines: string[] = [];

        if (ensured.projectSection.projectType === ProjectType[ProjectType.executable] ||
            ensured.projectSection.projectType === ProjectType[ProjectType.shareable] ||
            ensured.projectSection.projectType === ProjectType[ProjectType.library] ) {

            if (ensured.projectSection.addIncludes) {
                cxxIncludes.push(...ensured.projectSection.addIncludes.split(","));
            }
            if (ensured.projectSection.addLibraries) {
                optLines.push(...ensured.projectSection.addLibraries.split(",").map(lib => lib + "/LIBRARY"));
            }

            for (const source of sources) {
                const vms = new VmsPathConverter(source.filename);
                const objectDependencyLine = "[$(OBJ_DIR)" + vms.bareDirectory + "]" + vms.fileName + ".obj : " + vms.fullPath + " $(INCLUDES)";
                objectDependenciesLines.push(objectDependencyLine);
            }

            // project dependecies
            let deps = new ProjDepTree().getDepList(ensured.scope);
            if (deps.length > 1) {  // first is this project
                deps = deps.splice(1);
                for (const depPrj of deps) {
                    const depEnsured = await ensureSettings(depPrj, this.logFn);
                    if (depEnsured) {
                        if (depEnsured.projectSection.projectType === ProjectType[ProjectType.library] ||
                            depEnsured.projectSection.projectType === ProjectType[ProjectType.shareable]) {
                            const vmsRoot = new VmsPathConverter(depEnsured.projectSection.root + ftpPathSeparator);
                            const projName = depEnsured.projectSection.projectName.toUpperCase();
                            const outDir = depEnsured.projectSection.outdir;
                            if (vmsRoot.disk) {
                                contentFirst.push(`    ${projName}_INC_SYMB = "${vmsRoot.directory}"`);
                                contentFirst.push(`    DEFINE ${projName}_INC_DIR '${projName}_INC_SYMB'`);
                                contentFirst.push(`    ${projName}_LIB_SYMB = "${vmsRoot.directory}"-"]"+".${outDir}.$(CONFIG)]"`);
                                contentFirst.push(`    DEFINE ${projName}_LIB_DIR '${projName}_LIB_SYMB'`);
                            } else {
                                contentFirst.push(`    ${projName}_INC_SYMB = F$TRNLNM("SYS$LOGIN")-"]"+"${vmsRoot.bareDirectory}]"`);
                                contentFirst.push(`    DEFINE ${projName}_INC_DIR '${projName}_INC_SYMB'`);
                                contentFirst.push(`    ${projName}_LIB_SYMB = F$TRNLNM("SYS$LOGIN")-"]"+"${vmsRoot.bareDirectory}.${outDir}.$(CONFIG)]"`);
                                contentFirst.push(`    DEFINE ${projName}_LIB_DIR '${projName}_LIB_SYMB'`);
                            }
                            cxxIncludes.push(`${projName}_INC_DIR`);
                            if (depEnsured.projectSection.projectType === ProjectType[ProjectType.library]) {
                                optLines.push(`${projName}_LIB_DIR:${projName}/LIBRARY`);
                            }
                            if (depEnsured.projectSection.projectType === ProjectType[ProjectType.shareable]) {
                                optLines.push(`${projName}_LIB_DIR:${projName}/SHAREABLE`);
                                // com file
                                if (comLines.length === 0) {
                                    comLines.push(`CONFIG:=DEBUG`);
                                    comLines.push(`if P1 .NES. "" THEN CONFIG:='P1'`);
                                }
                                if (vmsRoot.disk) {
                                    comLines.push(`${projName}_LIB_SYMB = "${vmsRoot.directory}"-"]"+".${outDir}.'CONFIG']"`);
                                } else {
                                    comLines.push(`${projName}_LIB_SYMB = F$TRNLNM("SYS$LOGIN")-"]"+"${vmsRoot.bareDirectory}.${outDir}.'CONFIG']"`);
                                }
                                comLines.push(`DEFINE ${projName}_LIB_DIR '${projName}_LIB_SYMB'`);
                                comLines.push(`DEFINE ${projName} ${projName}_LIB_DIR:${projName}.exe`);
                            }
                        }
                    }
                }
            }

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

            flagLines.push(...[
            `.IF DEBUG .AND $(DEBUG) .EQ 1`,
            `COMPILEFLAGS = ${cxxDebugFlags}`,
            `LINKFLAGS = /DEBUG/MAP=$(MMS$TARGET_NAME)${linkCommonFlags}`,
            `.ELSE`,
            `COMPILEFLAGS = ${cxxCommonFlags}`,
            `LINKFLAGS = ${linkCommonFlags}`,
            `.ENDIF`,
            ]);

            middleLines.push(...[
                `.SILENT`,
                `OUT_DIR = .$(OUTDIR).$(CONFIG)`,
                `OBJ_DIR = $(OUT_DIR).obj`,
                `.SUFFIXES`,
                `.SUFFIXES .OBJ .CPP .C .CLD .MSG .BLI .COB .PAS .BAS .F77 .F90 .FOR .B32 .CBL`,
                `.CPP.OBJ`,
                `    pipe create/dir $(DIR $(MMS$TARGET)) | copy SYS$INPUT nl:`,
                `    $(CXX) $(COMPILEFLAGS) $(MMS$SOURCE)`,
                ``,
                `.C.OBJ`,
                `    pipe create/dir $(DIR $(MMS$TARGET)) | copy SYS$INPUT nl:`,
                `    $(CC) $(COMPILEFLAGS) $(MMS$SOURCE)`,
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
                `    BLISS $(COMPILEFLAGS) $(MMS$SOURCE)`,
                ``,
                `.B32.OBJ`,
                `    pipe create/dir $(DIR $(MMS$TARGET)) | copy SYS$INPUT nl:`,
                `    BLISS $(COMPILEFLAGS) $(MMS$SOURCE)`,
                ``,
                `.COB.OBJ`,
                `    pipe create/dir $(DIR $(MMS$TARGET)) | copy SYS$INPUT nl:`,
                `    COBOL $(COMPILEFLAGS) $(MMS$SOURCE)`,
                ``,
                `.CBL.OBJ`,
                `    pipe create/dir $(DIR $(MMS$TARGET)) | copy SYS$INPUT nl:`,
                `    COBOL $(COMPILEFLAGS) $(MMS$SOURCE)`,
                ``,
                `.PAS.OBJ`,
                `    pipe create/dir $(DIR $(MMS$TARGET)) | copy SYS$INPUT nl:`,
                `    PASCAL $(COMPILEFLAGS) $(MMS$SOURCE)`,
                ``,
                `.BAS.OBJ`,
                `    pipe create/dir $(DIR $(MMS$TARGET)) | copy SYS$INPUT nl:`,
                `    BASIC $(COMPILEFLAGS) $(MMS$SOURCE)`,
                ``,
                `.F77.OBJ`,
                `    pipe create/dir $(DIR $(MMS$TARGET)) | copy SYS$INPUT nl:`,
                `    FORTRAN $(COMPILEFLAGS) $(MMS$SOURCE)`,
                ``,
                `.F90.OBJ`,
                `    pipe create/dir $(DIR $(MMS$TARGET)) | copy SYS$INPUT nl:`,
                `    FORTRAN $(COMPILEFLAGS) $(MMS$SOURCE)`,
                ``,
                `.FOR.OBJ`,
                `    pipe create/dir $(DIR $(MMS$TARGET)) | copy SYS$INPUT nl:`,
                `    FORTRAN $(COMPILEFLAGS) $(MMS$SOURCE)`,
                ``,
                `.DEFAULT`,
                `    ! Source $(MMS$TARGET) not yet added`,
                ``,
            ]);

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
        } else if (ensured.projectSection.projectType === ProjectType[ProjectType.java] ||
                   ensured.projectSection.projectType === ProjectType[ProjectType.scala] ||
                   ensured.projectSection.projectType === ProjectType[ProjectType.kotlin] ) {
            // TODO: distinguish DEBUG and RELEASE
            
            let extension = ".java";
            let compiler = "javac";
            switch(ensured.projectSection.projectType) {
                case ProjectType[ProjectType.scala]:
                    extension = ".sc";
                    compiler = "scalac";
                    break;
                case ProjectType[ProjectType.kotlin]:
                    extension = ".kt";
                    compiler = "kotlinc";
                    break;
            }

            // delete all previous hard links before the process
            contentFirst.push(`    pipe del/tree [.$(OUTDIR).src]*.*;* | copy SYS$INPUT nl:`);
            contentFirst.push(`    pipe create/dir [.$(OUTDIR).src] | copy SYS$INPUT nl:`);
            contentFirst.push(`    pipe create/dir [.$(OUTDIR).$(CONFIG)] | copy SYS$INPUT nl:`);
            if (ensured.projectSection.projectType === ProjectType[ProjectType.java]) {
                contentFirst.push(`    pipe create/dir [.$(OUTDIR).tmp] | copy SYS$INPUT nl:`);
            }
            // delete all current hard link after the process
            contentLast.push(`    pipe del/tree [.$(OUTDIR).src]*.*;* | copy SYS$INPUT nl:`);
            if (ensured.projectSection.projectType === ProjectType[ProjectType.java]) {
                contentLast.push(`    pipe del/tree [.$(OUTDIR).tmp...]*.*;* | copy SYS$INPUT nl:`);
            }
                    
            middleLines.push(...[
                `.SILENT`,
            ]);

            // project dependecies
            let depClassPath = ensured.projectSection.addLibraries.split(",").join(":");
            let deps = new ProjDepTree().getDepList(ensured.scope);
            if (deps.length > 1) {  // first is this project
                deps = deps.splice(1);
                for (const depPrj of deps) {
                    const depEnsured = await ensureSettings(depPrj, this.logFn);
                    if (depEnsured) {
                        switch (depEnsured.projectSection.projectType) {
                            case ProjectType[ProjectType.java]:
                            case ProjectType[ProjectType.scala]:
                            case ProjectType[ProjectType.kotlin]: {
                                    const vmsRoot = new VmsPathConverter(depEnsured.projectSection.root + ftpPathSeparator);
                                    const projName = depEnsured.projectSection.projectName;
                                    const projNameUpper = projName.toUpperCase();
                                    const outDir = depEnsured.projectSection.outdir;
                                    // com file
                                    if (comLines.length === 0) {
                                        comLines.push(`CONFIG:=DEBUG`);
                                        comLines.push(`if P1 .NES. "" THEN CONFIG:='P1'`);
                                    }
                                    if (vmsRoot.disk) {
                                        contentFirst.push(`    ${projNameUpper}_LIB_SYMB = "${vmsRoot.directory}"-"]"+".${outDir}.$(CONFIG)]"`);
                                        contentFirst.push(`    DEFINE ${projNameUpper}_LIB_DIR '${projNameUpper}_LIB_SYMB'`);
                                        comLines.push(`${projNameUpper}_LIB_SYMB = "${vmsRoot.directory}"-"]"+".${outDir}.'CONFIG']"`);
                                    } else {
                                        contentFirst.push(`    ${projNameUpper}_LIB_SYMB = F$TRNLNM("SYS$LOGIN")-"]"+"${vmsRoot.bareDirectory}.${outDir}.$(CONFIG)]"`);
                                        contentFirst.push(`    DEFINE ${projNameUpper}_LIB_DIR '${projNameUpper}_LIB_SYMB'`);
                                        comLines.push(`${projNameUpper}_LIB_SYMB = F$TRNLNM("SYS$LOGIN")-"]"+"${vmsRoot.bareDirectory}.${outDir}.'CONFIG']"`);
                                    }
                                    comLines.push(`DEFINE ${projNameUpper}_LIB_DIR '${projNameUpper}_LIB_SYMB'`);
                                    if (depClassPath) {
                                        depClassPath += ":";
                                    }
                                    depClassPath += `/${projNameUpper}_LIB_DIR/${projName}.jar`;
                                }
                                break;
                        }
                    }
                }
            }

            //main
            mainModuleLines.push(`[.$(OUTDIR).$(CONFIG)]$(NAME).jar : `);
            for (const source of sources) {
                mainModuleLines[mainModuleLines.length - 1] = mainModuleLines[mainModuleLines.length - 1] + " -";
                const vms = new VmsPathConverter(source.filename);
                mainModuleLines.push(`[.$(OUTDIR).src]${vms.fileName}${extension}`);
            }
            if (depClassPath) {
                depClassPath = "-cp " + depClassPath;
            }
            if (ensured.projectSection.projectType === ProjectType[ProjectType.java]) {
                mainModuleLines.push(`    ${compiler} ${depClassPath} -g -d $(OUTDIR)/tmp $(OUTDIR)/src/*${extension}`);
                mainModuleLines.push(`    jar cf $(OUTDIR)/$(CONFIG)/$(NAME).jar -C $(OUTDIR)/tmp .`);
            } else {
                mainModuleLines.push(`    ${compiler} ${depClassPath} -d $(OUTDIR)/$(CONFIG)/$(NAME).jar $(OUTDIR)/src/*${extension}`);
            }
            mainModuleLines.push(``);

            // source dependencies
            for (const source of sources) {
                const vms = new VmsPathConverter(source.filename);
                const objectDependencyLine = `[.$(OUTDIR).src]${vms.fileName}${extension} : ${vms.fullPath}`;
                objectDependenciesLines.push(objectDependencyLine);
                objectDependenciesLines.push(`    set file ${vms.fullPath}/enter=[.$(OUTDIR).src]${vms.fileName}${extension}`);
            }
        }

        localSource.dispose();

        contentFirst.push("");
        contentLast.push("");

        const allLines = [
            `! header`,
            ...headerLines,
            `! includes`,
            ...includeLines,
            `! sources`,
            ...sourceLines,
            `! dependencies`,
            ...contentFirst,
            ...contentLast,
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
     * @param content old MMS content (INCLUDE and SOURCE must have only one file per line!)
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
            if (line.startsWith(Builder.includesLine)) {
                lineType = MmsLineType.includes;
                blocksFound = blocksFound + 1;
                continue;
            } else if (line.startsWith(Builder.sourcesLine)) {
                lineType = MmsLineType.sources;
                blocksFound = blocksFound + 1;
                continue;
            } 
            if (lineType !== MmsLineType.nothing) {
                const matched = line.match(vmsPathRgx);
                if (matched && matched[VmsPathPart.fileName]) {
                    if (lineType === MmsLineType.includes) {
                        foundIncludes.push(VmsPathConverter.fromVms(matched[0]).initial);
                    } else if (lineType === MmsLineType.sources) {
                        foundSources.push(VmsPathConverter.fromVms(matched[0]).initial);
                    }
                    continue;
                } else {
                    lineType = MmsLineType.nothing;
                }    
            } 
            if (blocksFound === 2) {
                // stop searching
                break;
            } 
        }

        const localSource = new FsSource(ensured.configHelper.workspaceFolder.uri.fsPath, this.logFn);
        // common part
        const [localIncludes, localSources] = await Promise.all([
            localSource.findFiles(ensured.projectSection.headers, ensured.projectSection.exclude),
            localSource.findFiles(ensured.projectSection.source, ensured.projectSection.exclude)]);

        if (!localIncludes || localIncludes.length !== foundIncludes.length) {
            return true;
        }

        if (!localSources || localSources.length !== foundSources.length) {
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

    private async ensureMmsCreated(scopeData: IScopeBuildData, autoCreate = false) {

        const localMmsFile = scopeData.ensured.projectSection.projectName + Builder.mmsExt;
        const foundMms = await scopeData.localSource.findFiles(localMmsFile, scopeData.ensured.projectSection.exclude);
        let createMMS = true;
        if (foundMms && foundMms.length === 1) {
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

    private async runRemoteClean(scopeData: IScopeBuildData, buildCfg: IBuildConfigSection) {
        // decide what to clean
        let command = buildCfg.command;
        if (isCommandDefault(command)) {
            command = Builder.cleanCmd(scopeData.ensured.projectSection.outdir, buildCfg.label);
        } else if (isCommandCOM(command)) {
            command = '@' + command + Builder.cleanSuffix;
        } else if (isCommandMMS(command)) {
            command = Builder.mmsUserCmd(command) + " " + buildCfg.parameter + " " + Builder.cleanSuffix;
        } else {
            this.logFn(LogType.error, () => localize("cannot.clean", "Have no idea how to clean configuration: {0}", buildCfg.label));
            return false;
        }
        // run if decided
        const errors = ParseExecResult(await scopeData.shell.execCmd(command));
        if (errors.length === 0) {
            return true;
        } 
        this.logFn(LogType.error, () => errors.join("\n"));
        return false;
    }

    private async runRemoteBuild(scopeData: IScopeBuildData, buildCfg: IBuildConfigSection) {
        let command = buildCfg.command;
        if (isCommandDefault(command)) {
            if (isParameterDebug(buildCfg.parameter)) {
                command = Builder.mmsCmd(scopeData.ensured.projectSection.projectName + Builder.mmsExt,
                    "1",
                    scopeData.ensured.projectSection.outdir,
                    scopeData.ensured.projectSection.projectName,
                    buildCfg.label);
            } else {
                command = Builder.mmsCmd(scopeData.ensured.projectSection.projectName + Builder.mmsExt,
                    "0",
                    scopeData.ensured.projectSection.outdir,
                    scopeData.ensured.projectSection.projectName,
                    buildCfg.label);
            }
        } else if (isCommandCOM(command)) {
            command = '@' + command + " " + buildCfg.parameter;
        } else if (isCommandMMS(command)) {
            command = Builder.mmsUserCmd(command) + " " + buildCfg.parameter;
        } else {
            this.logFn(LogType.error, () => localize("cannot.build", "Have no idea how to build configuration: {0}", buildCfg.label));
            return false;
        }
        // run if decided
        const output = await scopeData.shell.execCmd(command);
        if (output) {
            const retCode = await this.parseProblems(scopeData, output, buildCfg);
            if (scopeData.ensured.projectSection.listing) {
                const synchronizer = Synchronizer.acquire(this.logFn);
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
                    let zipFolderChain: string[] = [
                        scopeData.ensured.projectSection.root,
                        scopeData.ensured.projectSection.outdir,
                        buildCfg.label
                    ];
                    let zipFolder = zipFolderChain.join(ftpPathSeparator) + ftpPathSeparator;   // must be a folder
                    if (!scopeData.ensured.projectSection.root.startsWith(ftpPathSeparator)) {
                        // relative path, add CWD
                        zipFolder = scopeData.shellRootConverter.initial + zipFolder;
                    }
                    const zipFolderConverter = new VmsPathConverter(zipFolder);
                    let cd = `set default ${zipFolderConverter.directory}`;
                    answer = await scopeData.shell.execCmd(cd);
                    // create zip file 
                    let {expandedMask: expandedList, missed_curly_bracket} = expandMask(scopeData.ensured.projectSection.listing);
                    if (missed_curly_bracket) {
                        this.logFn(LogType.warning, () => localize("check.inc.mask", "Please check listing file masks for correct curly brackets"), true);
                    }
                    // delete zip file on OpenVMS side if it exists
                    answer = await scopeData.shell.execCmd(`delete ${Builder.zipName + Builder.zipExt};*`);
                    // add files to zip by entry
                    for(let kind of expandedList) {
                        // zip already must have an option to do recursive search
                        if (kind.startsWith("**/")) {
                            kind = kind.substr(3);
                        }
                        let zipCmd: string | undefined;
                        if (scopeData.ensured.scope) {
                            zipCmd = await synchronizer.getZipCmd(scopeData.ensured.scope, Builder.zipName, kind);
                        }
                        if (!zipCmd) {
                            zipCmd = Builder.zipCmd(Builder.zipName, kind);
                        }
                        answer = await scopeData.shell.execCmd(zipCmd);
                    }
                    // download zip file
                    const relZipName = [
                            scopeData.ensured.projectSection.outdir,
                            buildCfg.label,
                            Builder.zipName + Builder.zipExt].join(ftpPathSeparator);
                    const downloaded = await synchronizer.downloadFiles(scopeData.ensured, [relZipName]);
                    if (downloaded) {
                        // unzip it
                        const zipApi = GetZipApi();
                        if (zipApi && scopeData.ensured.configHelper.workspaceFolder) {
                            const fullZipName = path.join(scopeData.ensured.configHelper.workspaceFolder.uri.fsPath, relZipName);
                            downloadedByZip = await new zipApi(this.logFn).unzip(fullZipName);
                        }
                    }
                    // delete zip file on OpenVMS side
                    answer = await scopeData.shell.execCmd(`delete ${Builder.zipName + Builder.zipExt};*`);
                    // go back to saved current folder
                    if (currentPath) {
                        cd = `set default ${currentPath.directory}`;
                        answer = await scopeData.shell.execCmd(cd);
                    }
                }
                if (!downloadedByZip) {
                    await synchronizer.downloadListings(scopeData.ensured);
                }
            }
            return retCode;
        } else {
            this.logFn(LogType.error, () => localize("output.cannot_exec", "Cannot execute: {0}", command));
            return false;
        }
    }

    private async parseProblems(scopeData: IScopeBuildData, output: string[], buildCfg: IBuildConfigSection) {
        const result = parseVmsOutput(output, scopeData.shell.width);
        for (const line of result.lines) {
            this.logFn(LogType.warning, () => line);
        }
        let cwd = "";
        if (scopeData.ensured.projectSection.root.startsWith(ftpPathSeparator)) {
            // absolute path
            cwd = scopeData.ensured.projectSection.root + ftpPathSeparator;
        } else {
            // relative to home folder
            cwd = scopeData.shellRootConverter.initial + scopeData.ensured.projectSection.root + ftpPathSeparator;
        }
        cwd = cwd.toUpperCase();
        let hardlinkFolder = "";
        switch (scopeData.ensured.projectSection.projectType) {
            case ProjectType[ProjectType.java]:
            case ProjectType[ProjectType.scala]:
            case ProjectType[ProjectType.kotlin]:
                // cut out/src
                hardlinkFolder = scopeData.ensured.projectSection.outdir + ftpPathSeparator + "src" + ftpPathSeparator;
                break;
        }
        const errMap = new Map<string, Diagnostic[]>();
        let hasError = false;
        const fileNameCache = new Map<string, string>();
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
                        if (isCommandDefault(buildCfg.command)) {
                            entry.file = scopeData.ensured.projectSection.projectName + Builder.mmsExt;
                        } else if (isCommandMMS(buildCfg.command)) {
                            entry.file = buildCfg.command;
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
                        isCommandDefault(buildCfg.command)) {
                        // conver target to source
                        const outPathLength = scopeData.ensured.projectSection.outdir.length + buildCfg.label.length + 6;   // 6 is length of "OBJ" and three separators
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
                    if (hardlinkFolder && localFile.startsWith(hardlinkFolder)) {
                        localFile = "**" + ftpPathSeparator + localFile.slice(hardlinkFolder.length);
                    }
                    // find case-insensitive
                    let cachedFile = fileNameCache.get(localFile);
                    if (cachedFile) {
                        localFile = cachedFile;
                    } else {
                        const found = await scopeData.localSource.findFiles(localFile, scopeData.ensured.projectSection.exclude);
                        if (found && found.length === 1) {
                            fileNameCache.set(localFile, found[0].filename);
                            localFile = found[0].filename;
                        } else if (found && found.length > 1) {
                            fileNameCache.set(localFile, found[0].filename);
                            localFile = found[0].filename;
                            this.logFn(LogType.warning, () => localize("too_many_files", "There are more than one file named {0}", localFile));
                        } else {
                            fileNameCache.set(localFile, localFile);
                            this.logFn(LogType.warning, () => localize("no_file", "Cannot find the file named {0}", localFile));
                        }
                    }
                    uri = Uri.file(path.join(scopeData.ensured.configHelper.workspaceFolder!.uri.fsPath, localFile));
                } else {
                    if (entry.file === undefined && scopeData.ensured.configHelper.workspaceFolder) {
                        uri = scopeData.ensured.configHelper.workspaceFolder.uri;
                    }
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
                return undefined;
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
            if (!answer) {
                return undefined;
            }
            const shellRootConverter = VmsPathConverter.fromVms(answer[0]);
            // set default directory for shell - project root
            const projectRootFolder = new VmsPathConverter(ensured.projectSection.root + ftpPathSeparator);
            const cd = `set default ${projectRootFolder.directory}`;
            answer = await shell.execCmd(cd);
            if (!answer) {
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
