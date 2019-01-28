import { ftpPathSeparator, LogFunction, LogType } from "@vorfol/common";
import * as path from "path";
import { ProjectState } from "./dep-tree/proj-state";
import { IEnsured } from "./ensure-settings";
import { GetSshHelperType } from "./ext-api/get-ssh-helper";
import { GetZipHelperType } from "./ext-api/get-zip-helper";
import { FsSource } from "./sync/fs-source";
import { Synchronizer } from "./sync/synchronizer";
import { VmsPathConverter } from "./vms/vms-path-converter";

import * as nls from "vscode-nls";
nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export class UploadZip {

    public logFn: LogFunction;
    constructor(log?: LogFunction) {
        // tslint:disable-next-line:no-empty
        this.logFn = log || (() => {});
    }

    public async perform(ensured: IEnsured, clear?: string) {
        if (ensured.scope &&
            ensured.configHelper.workspaceFolder) {
            const ZipApiType = await GetZipHelperType();
            if (!ZipApiType) {
                this.logFn(LogType.error, () => localize("zip.missed", "The extension vmssoftware.zip-helper isn't found."));
                return false;
            }
            const zipApi = new ZipApiType(this.logFn);
            const localPath = ensured.configHelper.workspaceFolder.uri.fsPath;
            const zipFileName = ensured.projectSection.projectName + ".zip";
            const zipFilePath = path.join(localPath, zipFileName);
            const zipFinished = zipApi.start(zipFilePath);
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
            for (const fileEntry of fileEntries) {
                const fileName = path.join(localPath, fileEntry.filename);
                zipApi.addFile(fileName, fileEntry.filename);
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
                            await shell.execCmd("set sec /prot=(o:rwed) [" + converter.bareDirectory + "...]*.*;*");
                            await shell.execCmd("delete/tree [" + converter.bareDirectory + "...]*.*;*");
                            break;
                    }
                }
                // 1. upload zipFileName
                if (await Synchronizer.acquire(this.logFn).uploadFiles(ensured, [zipFileName])) {
                    // 2. unzip
                    // set default directory for shell - project root
                    const cd = `set def ${converter.directory}`;
                    const answer = await shell.execCmd(cd);
                    if (!answer || answer.length === 0) {
                        this.logFn(LogType.error, () => localize("zip.cd.failed", "Cannot set default directory."));
                        return false;
                    }
                    // overwrite always, use current time for timestamping, wait 3sec before rejecting
                    const unzipResult = await shell.execCmd(`unzip -oo "-D" ${zipFileName}`, 3000);
                    if (!unzipResult || unzipResult.length === 0 || shell.lastError) {
                        this.logFn(LogType.error, () => localize("zip.unzip.failed", "Unzip command failed: {0}", shell.lastError || "unknown error" ));
                        if (unzipResult && unzipResult.length) {
                            this.logFn(LogType.error, () => "Unzip command output:\n" + unzipResult.join("\n") );
                        }
                        return false;
                    } else {
                        // parse unzip result
                        if (unzipResult && unzipResult.length) {
                            if (unzipResult.some((s) => s.startsWith("%DCL-W-IVVERB"))) {
                                this.logFn(LogType.error, () => localize("zip.unzip.not.installed", "It seems 'unzip' isn't installed" ));
                                this.logFn(LogType.error, () => "Unzip command output:\n" + unzipResult.join("\n") );
                                return false;
                            }
                        }
                    }
                    // 3. force set synchronized
                    ProjectState.acquire().setSynchronized(ensured.scope, true);
                    return true;
                }
            } else {
                this.logFn(LogType.error, () => localize("zip.cannot_finish", "Cannot finish Zip."));
            }
        }
        return false;
    }
}
