import { ftpPathSeparator, LogFunction, LogType, printLike } from "../common/main";

import * as path from "path";
import * as fs from 'fs';
import { GetSshHelperType } from "../ext-api/ext-api";
import { ProjectState } from "./dep-tree/proj-state";
import { IEnsured } from "./ensure-settings";
import { GetZipApi } from "../ext-api/ext-api";
import { FsSource } from "./sync/fs-source";
import { Synchronizer } from "./sync/synchronizer";
import { VmsPathConverter } from "./vms/vms-path-converter";

import * as nls from "vscode-nls";
import { fstat } from "fs";
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

    private async cleanup(zipFilePath: string) {
        fs.unlink(zipFilePath, err => {
            if (err) {
                this.logFn(LogType.error, () => localize("zip.cannot_clean", "Could not delete local zip file."));
            }
        });
    }

    public async perform(ensured: IEnsured, clear?: string) {
        if (ensured.scope &&
            ensured.configHelper.workspaceFolder) {
            // clear password cache
            const sshHelperType = GetSshHelperType();
            if (!sshHelperType) {
                this.logFn(LogType.error, () => localize("ssh-helper.failed", "Could not find vmssoftware.ssh-helper extension."));
                return false;
            }
            const sshHelper = new sshHelperType(this.logFn);
            if (sshHelper) {
                sshHelper.clearPasswordCache();
            }
            // enable
            const synchronizer = Synchronizer.acquire(this.logFn);
            synchronizer.enableRemote();
            const ZipApiType = GetZipApi();
            if (!ZipApiType) {
                this.logFn(LogType.error, () => localize("zip.missed", "Could not find vmssoftware.zip-helper extension."));
                return false;
            }
            const zipApi = new ZipApiType(this.logFn);
            const localPath = ensured.configHelper.workspaceFolder.uri.fsPath;
            let   zipFileName = 'kill_me.zip';
            let   zipFilePath = path.join(localPath, zipFileName);
            let   tries = 100;
            do {
                zipFileName = "_" + String(Math.floor(Math.random()*10000)) + ".zip";
                zipFilePath = path.join(localPath, zipFileName);
            } while(--tries && fs.existsSync(zipFilePath));
            const zipFinished = zipApi.start(zipFilePath, ensured.synchronizeSection.forceLocalTime);
            if (!zipFinished) {
                this.logFn(LogType.error, () => localize("zip.cannot_start", "Could not start Zip."));
                this.cleanup(zipFilePath);
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
                this.cleanup(zipFilePath);
                return false;
            }
            for (const fileEntry of fileEntries) {
                if (fileEntry.filename.toLowerCase() == zipFileName.toLowerCase()) {
                    continue;
                }
                const fileName = path.join(localPath, fileEntry.filename);
                zipApi.addFile(fileName, fileEntry.filename);
                if (synchronizer.stopIssued) {
                    this.logFn(LogType.error, () => localize("zip.ssh.stopped", "Stopped."));
                    this.cleanup(zipFilePath);
                    return false;
                }
            }
            zipApi.stop();
            if (await zipFinished) {
                // clear
                const converter = new VmsPathConverter(ensured.projectSection.root + ftpPathSeparator);
                const sshHelperType = GetSshHelperType();
                if (!sshHelperType) {
                    this.logFn(LogType.error, () => localize("zip.ssh.failed", "Could not find vmssoftware.ssh-helper extension."));
                    this.cleanup(zipFilePath);
                    return false;
                }
                const sshHelper = new sshHelperType(this.logFn);
                const shell = await sshHelper.getDefaultVmsShell(ensured.scope);
                if (!shell) {
                    this.logFn(LogType.error, () => localize("zip.shell.failed", "Could not create remote shell."));
                    this.cleanup(zipFilePath);
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
                const uploaded = await Synchronizer.acquire(this.logFn).uploadFiles(ensured, [zipFileName]);
                // upload is finished - delete local file in any case
                this.cleanup(zipFilePath);
                if (uploaded) {
                    if (synchronizer.stopIssued) {
                        this.logFn(LogType.error, () => localize("zip.ssh.stopped", "Stopped."));
                        return false;
                    }
                    // 2. unzip
                    // set default directory for shell - project root
                    const cd = `set default ${converter.directory}`;
                    let answer = await shell.execCmd(cd);
                    if (!answer) {
                        this.logFn(LogType.error, () => localize("zip.cd.failed", "Could not set default directory."));
                        shell.dispose();
                        return false;
                    }
                    // overwrite always, use current time for timestamping, wait 3sec before rejecting
                    let unzipCmd = await synchronizer.getUnzipCmd(ensured.scope, zipFileName);
                    if (!unzipCmd) {
                        unzipCmd = UploadZip.unzipCmd(zipFileName);
                    }
                    const unzipResult = await shell.execCmd(unzipCmd, undefined, 3000);
                    let retCode = true;
                    if (!unzipResult || shell.lastError) {
                        this.logFn(LogType.error, () => localize("zip.unzip.failed", "Unzip command failed: {0}", shell.lastError || "unknown error" ));
                        if (unzipResult && unzipResult.length) {
                            unzipResult.unshift(unzipCmd);
                            this.logFn(LogType.error, () => localize("zip.unzip.error_output", "Unzip command output:\n {0}", unzipResult.join("\n")));
                        }
                        retCode = false;
                    } else {
                        // parse unzip result
                        if (unzipResult && unzipResult.length) {
                            unzipResult.unshift(unzipCmd);
                            if (unzipResult.some((s) => s.startsWith("%DCL-W-IVVERB"))) {
                                this.logFn(LogType.error, () => localize("zip.unzip.not.installed", "Could not find 'unzip' utility." ));
                                this.logFn(LogType.error, () => localize("zip.unzip.error_output", "Unzip command output:\n {0}", unzipResult.join("\n")));
                                retCode = false;
                            } else if (unzipResult.some((s) => s.startsWith("%DCL-"))) {
                                this.logFn(LogType.error, () => localize("zip.unzip.error_output", "Unzip command output:\n {0}", unzipResult.join("\n")));
                                retCode = false;
                            }
                        }
                    }
                    answer = await shell.execCmd('DELETE ' + zipFileName + ";*", undefined, 3000);
                    shell.dispose();
                    return retCode;
                }
            } else {
                this.logFn(LogType.error, () => localize("zip.cannot_finish", "Could not finish Zip."));
                this.cleanup(zipFilePath);
            }
        }
        return false;
    }
}
