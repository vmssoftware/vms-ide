import { ftpPathSeparator, LogFunction, LogType, printLike } from "../common/main";

import * as path from "path";
import { GetSshHelperType } from "../ext-api/ext-api";
import { ProjectState } from "./dep-tree/proj-state";
import { IEnsured } from "./ensure-settings";
import { GetZipApi } from "../ext-api/ext-api";
import { FsSource } from "./sync/fs-source";
import { Synchronizer } from "./sync/synchronizer";
import { VmsPathConverter } from "./vms/vms-path-converter";

import * as nls from "vscode-nls";
nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export class UploadZip {

    private static readonly unzipCmd = printLike`unzip -oo "-D" ${"zipFileName"}`;
    private static readonly freeAllCmd = printLike`set security /prot=(o:rwed) ${"disk"}[${"directory"}...]*.*;*`;
    private static readonly delAllCmd = printLike`delete/tree ${"disk"}[${"directory"}...]*.*;*`;

    public logFn: LogFunction;
    constructor(log?: LogFunction) {
        // tslint:disable-next-line:no-empty
        this.logFn = log || (() => {});
    }

    public async perform(ensured: IEnsured, clear?: string) {
        if (ensured.scope &&
            ensured.configHelper.workspaceFolder) {
            const synchronizer = Synchronizer.acquire(this.logFn);
            const ZipApiType = await GetZipApi();
            if (!ZipApiType) {
                this.logFn(LogType.error, () => localize("zip.missed", "The extension vmssoftware.zip-helper isn't found."));
                return false;
            }
            const zipApi = new ZipApiType(this.logFn);
            const localPath = ensured.configHelper.workspaceFolder.uri.fsPath;
            const zipFileName = ensured.projectSection.projectName + ".zip";
            const zipFilePath = path.join(localPath, zipFileName);
            const zipFinished = zipApi.start(zipFilePath, ensured.synchronizeSection.forceLocalTime);
            if (!zipFinished) {
                this.logFn(LogType.error, () => localize("zip.cannot_start", "Cannot start Zip."));
                return false;
            }
            const localSource = new FsSource(localPath, this.logFn);
            const fileNames = [
                ensured.projectSection.builders,
                ensured.projectSection.headers,
                ensured.projectSection.resource,
                ensured.projectSection.source].join(",");
            const fileEntries = await localSource.findFiles(fileNames, ensured.projectSection.exclude);
            if (!fileEntries) {
                this.logFn(LogType.error, () => localize("zip.nothing", "Nothing to Zip."), true);
                return false;
            }
            for (const fileEntry of fileEntries) {
                const fileName = path.join(localPath, fileEntry.filename);
                zipApi.addFile(fileName, fileEntry.filename);
                if (synchronizer.stopIssued) {
                    this.logFn(LogType.error, () => localize("zip.ssh.stopped", "Stopped."));
                    return false;
                }
            }
            zipApi.stop();
            if (await zipFinished) {
                // clear
                const converter = new VmsPathConverter(ensured.projectSection.root + ftpPathSeparator);
                const sshHelperType = await GetSshHelperType();
                if (!sshHelperType) {
                    this.logFn(LogType.error, () => localize("zip.ssh.failed", "The extension vmssoftware.ssh-helper isn't found."));
                    return false;
                }
                const sshHelper = new sshHelperType(this.logFn);
                const shell = await sshHelper.getDefaultVmsShell(ensured.scope);
                if (!shell) {
                    this.logFn(LogType.error, () => localize("zip.shell.failed", "Cannot create remote shell."));
                    return false;
                }
                if (typeof clear === "string") {
                    switch (clear.toLowerCase()) {
                        case "yes":
                        case "true":
                        case "clear":
                            await shell.execCmd(UploadZip.freeAllCmd(converter.disk, converter.bareDirectory));
                            await shell.execCmd(UploadZip.delAllCmd(converter.disk, converter.bareDirectory));
                            break;
                    }
                }
                // 1. upload zipFileName
                if (await Synchronizer.acquire(this.logFn).uploadFiles(ensured, [zipFileName])) {
                    if (synchronizer.stopIssued) {
                        this.logFn(LogType.error, () => localize("zip.ssh.stopped", "Stopped."));
                        return false;
                    }
                        // 2. unzip
                    // set default directory for shell - project root
                    const cd = `set default ${converter.directory}`;
                    const answer = await shell.execCmd(cd);
                    if (!answer) {
                        this.logFn(LogType.error, () => localize("zip.cd.failed", "Cannot set default directory."));
                        shell.dispose();
                        return false;
                    }
                    // overwrite always, use current time for timestamping, wait 3sec before rejecting
                    let command = UploadZip.unzipCmd(zipFileName);
                    let unzipCmd = await synchronizer.getUnzipCmd(ensured.scope);
                    if (unzipCmd) {
                        command = unzipCmd + " " + zipFileName;
                    }
                    const unzipResult = await shell.execCmd(command, 3000);
                    let retCode = true;
                    if (!unzipResult || shell.lastError) {
                        this.logFn(LogType.error, () => localize("zip.unzip.failed", "Unzip command failed: {0}", shell.lastError || "unknown error" ));
                        if (unzipResult && unzipResult.length) {
                            unzipResult.unshift(command);
                            this.logFn(LogType.error, () => localize("zip.unzip.error_output", "Unzip command output:\n {0}", unzipResult.join("\n")));
                        }
                        retCode = false;
                    } else {
                        // parse unzip result
                        if (unzipResult && unzipResult.length) {
                            unzipResult.unshift(command);
                            if (unzipResult.some((s) => s.startsWith("%DCL-W-IVVERB"))) {
                                this.logFn(LogType.error, () => localize("zip.unzip.not.installed", "It seems 'unzip' isn't installed" ));
                                this.logFn(LogType.error, () => localize("zip.unzip.error_output", "Unzip command output:\n {0}", unzipResult.join("\n")));
                                retCode = false;
                            } else if (unzipResult.some((s) => s.startsWith("%DCL-"))) {
                                this.logFn(LogType.error, () => localize("zip.unzip.error_output", "Unzip command output:\n {0}", unzipResult.join("\n")));
                                retCode = false;
                            }
                        }
                    }
                    shell.dispose();
                    return retCode;
                }
            } else {
                this.logFn(LogType.error, () => localize("zip.cannot_finish", "Cannot finish Zip."));
            }
        }
        return false;
    }
}
