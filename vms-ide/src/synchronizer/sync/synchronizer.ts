import path from "path";
import * as vscode from "vscode";
import * as nls from "vscode-nls";

import { GetSshHelperType } from "../../ext-api/ext-api";
import { Barrier, Delay, printLike } from "../../common/main";
import { LogFunction, LogType } from "../../common/main";
import { ftpPathSeparator } from "../../common/main";
import { IFileEntry } from "../../common/main";
import { IDispose, SshHelper } from "../../ssh-helper/ssh-helper";
import { Progress } from "../common/progress";
import { IEnsured } from "../ensure-settings";
import { FsSource } from "./fs-source";
import { SftpSource } from "./sftp-source";
import { IProgress, ISource } from "./source";
import { VmsSftpClient } from "./vms-sftp-client";
import { VmsShellSource } from "./vms-shell-source";
import { ProjectState } from "../dep-tree/proj-state";
import { VmsPathConverter } from "../vms/vms-path-converter";

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

interface IScopeSyncData {
    ensured: IEnsured;      // saved settings
    isValid: boolean;
    localSource: ISource;
    remoteSource: ISource;
    watcher: IDispose;
    sshWatcher: IDispose;
}

const purgeCmd = printLike`purge ${"disk"}[${"directory"}...]`;

export class Synchronizer {

    /**
     * Keep sources for each scope
     */
    public static syncScopes: Map<string, IScopeSyncData> = new Map<string, IScopeSyncData>();

    public static acquire(logFn?: LogFunction) {
        if (!Synchronizer.instance) {
            Synchronizer.instance = new Synchronizer(logFn);
        } else if (logFn !== undefined) {
            Synchronizer.instance.logFn = logFn;
        }
        return Synchronizer.instance;
    }

    private static instance?: Synchronizer;

    public logFn: LogFunction;
    public stopIssued = false;

    private sshHelper?: SshHelper;
    private transferBarrier = new Barrier(10);

    private constructor(logFn?: LogFunction) {
        // tslint:disable-next-line:no-empty
        this.logFn = logFn || (() => {});
    }

    public enableRemote() {
        this.stopIssued = false;
        for (const synchScopeData of Synchronizer.syncScopes.values()) {
            synchScopeData.remoteSource.enabled = true;
        }
    }

    public disableRemote() {
        this.stopIssued = true;
        for (const synchScopeData of Synchronizer.syncScopes.values()) {
            synchScopeData.remoteSource.enabled = false;
        }
    }

    /**
     * Dispose all sources and watchers
     */
    public dispose() {
        this.logFn(LogType.debug, () => localize("debug.disposing", "Disposing sources"));
        for (const scopeData of Synchronizer.syncScopes.values()) {
            this.disposeScopeData(scopeData);
        }
        Synchronizer.syncScopes.clear();
    }

    public disposeScopeData(scopeData: IScopeSyncData, remove?: boolean): void {
        scopeData.localSource.dispose();
        scopeData.remoteSource.dispose();
        scopeData.watcher.dispose();
        scopeData.sshWatcher.dispose();
        if (remove) {
            const scopeKey = scopeData.ensured.configHelper.workspaceFolder ? scopeData.ensured.configHelper.workspaceFolder.name : "";
            Synchronizer.syncScopes.delete(scopeKey);
        }
    }

    /**
     * User have to dispose the source
     */
    public async requestSource(ensured: IEnsured, type: "local" | "remote"): Promise<ISource | undefined> {
        if (type === "local" && ensured.configHelper && ensured.configHelper.workspaceFolder) {
            return new FsSource(ensured.configHelper.workspaceFolder.uri.fsPath, this.logFn);
        }
        // clear password cache
        if (this.sshHelper) {
            this.sshHelper.clearPasswordCache();
        }
        // get ssh helper
        if (!await this.ensureSshHelper() || !this.sshHelper) {
            return undefined;
        }
        const scope = ensured.configHelper.workspaceFolder ? ensured.configHelper.workspaceFolder.name : undefined;
        const [sftp, shell] = await Promise.all([
                this.sshHelper.getDefaultSftp(scope),
                this.sshHelper.getDefaultVmsShell(scope),
            ]);
        if (sftp && shell) {
            return await this.isSupportSetFileTime() // ensured.synchronizeSection.setTimeByShell
            ? new SftpSource(new VmsSftpClient(sftp), ensured.projectSection.root, this.logFn, ensured.synchronizeSection.setTimeAttempts)
            : new VmsShellSource(new VmsSftpClient(sftp), shell, ensured.projectSection.root, this.logFn, ensured.synchronizeSection.setTimeAttempts);
        }
        return undefined;
    }

    public async syncronizeProject(ensured: IEnsured) {
        // clear password cache
        if (this.sshHelper) {
            this.sshHelper.clearPasswordCache();
        }
        const scopeData = await this.prepareScopeData(ensured);
        if (!scopeData) {
            return false;
        }
        // enable
        this.enableRemote();
        // get full list
        const includes = [
            ensured.projectSection.source,
            ensured.projectSection.resource,
            // projectSection.listing,
            ensured.projectSection.headers,
            ensured.projectSection.builders,
        ];
        const include = includes.join(",");
        const progressRemote = new Progress();
        const [remoteList, localList] = await Promise.all(
            [scopeData.remoteSource.findFiles(include, ensured.projectSection.exclude, progressRemote),
             scopeData.localSource.findFiles(include, ensured.projectSection.exclude)]);
        progressRemote.dispose();

        let retCode = false;

        if (localList && remoteList) {
            // compare them
            const compareResult = this.compareLists(localList, remoteList);
            const waitAll = [];

            const progressProcess = new Progress();
            // upload
            waitAll.push(this.executeAction(scopeData, compareResult.upload, "upload", progressProcess));
            switch (ensured.synchronizeSection.downloadNewFiles) {
                case "overwrite":
                    waitAll.push(this.executeAction(scopeData, compareResult.download, "download", progressProcess));
                    break;
                case "skip":
                    for (const downloadFile of compareResult.download) {
                        this.logFn(LogType.information, () => localize("output.download_manually", "Remote {0} is newer, please check and download it manually", downloadFile.filename));
                    }
                    break;
                case "edit":
                    for (const downloadFile of compareResult.download) {
                        waitAll.push(this.editFile(scopeData, downloadFile.filename));
                    }
                    if (compareResult.download.length > 0) {
                        this.logFn(LogType.information, () => localize("output.edit_count", "Please edit and save {0} files manually", compareResult.download.length));
                    }
                    break;
            }
            // wait all operations are done
            const results = await Promise.all(waitAll);

            progressProcess.dispose();
            retCode = results.reduce((acc, result) => {
                acc = acc && result;
                return acc;
            }, true);
        } else {
            if (!remoteList) {
                this.logFn(LogType.error, () => localize("cannot.find.remote", "Cannot find files on remote source"), true);
            }
            if (!localList) {
                this.logFn(LogType.error, () => localize("cannot.find.local", "Cannot find files on local source"), true);
            }
        }
        // end
        this.decideDispose(scopeData);
        this.logFn(LogType.debug, () => localize("debug.retcode", "Synchronize retCode: {0}", retCode));
        return retCode;
    }

    public async quickSync(ensured: IEnsured) {
        // clear password cache
        if (this.sshHelper) {
            this.sshHelper.clearPasswordCache();
        }
        const scopeData = await this.prepareScopeData(ensured);
        if (!scopeData) {
            return false;
        }
        // enable
        this.enableRemote();

        let retCode = true;
        
        if (ensured.scope) {
        
            // delete deleted files
            const deletedList = ProjectState.acquire().getDeletedList(ensured.scope);
            for (let fileToDelete of deletedList) {
                fileToDelete = fileToDelete.replace(/[/\\]/g, ftpPathSeparator);
                if (!(await scopeData.remoteSource.deleteFile(fileToDelete))) {
                    this.logFn(LogType.error, () => localize("debug.quick.delete", "Delete remote file failed: {0}", fileToDelete));
                    retCode = false;
                } else {
                    this.logFn(LogType.information, () => localize("debug.quick.delete.ok", "Remote file deleted: {0}", fileToDelete));
                }
            }

            // send modified files
            const uploadList: string[] = [];
            const modifiedList = ProjectState.acquire().getModifiedList(ensured.scope);
            for (let fileToUpload of modifiedList) {
                fileToUpload = fileToUpload.replace(/[/\\]/g, ftpPathSeparator);
                if (await scopeData.localSource.accessFile(fileToUpload)) {
                    uploadList.push(fileToUpload);
                }
            }
            if (!(await this.uploadFiles(ensured, uploadList))) {
                retCode = false;
            }

            // this part is optional so do not return error if it occurs
            if (ensured.synchronizeSection.purge && this.sshHelper) {
                const converter = new VmsPathConverter(ensured.projectSection.root + ftpPathSeparator);
                const shell = await this.sshHelper.getDefaultVmsShell(ensured.scope);
                if (shell) {
                    await shell.execCmd(purgeCmd(converter.disk, converter.bareDirectory));
                    shell.dispose();
                }
            }

            // clean list in any case
            ProjectState.acquire().clearList(ensured.scope);
        }

        if (!retCode) {
            this.logFn(LogType.error, () => localize("quick.failed", "Quick uploading failed. Please execute full synchronization or uploading."));
        }

        // end
        this.decideDispose(scopeData);
        this.logFn(LogType.debug, () => localize("debug.quick.retcode", "Quick uploading:  {0}", String(retCode)));
     
        return retCode;
    }


    public async uploadSource(ensured: IEnsured) {
        // clear password cache
        if (this.sshHelper) {
            this.sshHelper.clearPasswordCache();
        }
        const scopeData = await this.prepareScopeData(ensured);
        if (!scopeData) {
            return false;
        }
        // enable
        this.enableRemote();
        // get full list
        const includes = [
            ensured.projectSection.source,
            ensured.projectSection.resource,
            // projectSection.listing,
            ensured.projectSection.headers,
            ensured.projectSection.builders,
        ];
        const include = includes.join(",");
        const progressRemote = new Progress();
        const [remoteList, localList] = await Promise.all(
            [scopeData.remoteSource.findFiles(include, ensured.projectSection.exclude, progressRemote),
             scopeData.localSource.findFiles(include, ensured.projectSection.exclude)]);
        let retCode = false;
        // compare them
        if (remoteList && localList) {
            const compareResult = this.compareLists(localList, remoteList);
            const progressProcess = new Progress();
            retCode = await this.executeAction(scopeData, compareResult.upload, "upload", progressProcess)
                .catch((err) => {
                    this.logFn(LogType.debug, () => localize("debug.upload.error", "Error while uploading {0}", String(err)));
                    return false;
                });
        } else {
            if (!remoteList) {
                this.logFn(LogType.error, () => localize("cannot.find.remote", "Cannot find files on remote source"), true);
            }
            if (!localList) {
                this.logFn(LogType.error, () => localize("cannot.find.local", "Cannot find files on local source"), true);
            }
        }
        // end
        this.decideDispose(scopeData);
        this.logFn(LogType.debug, () => localize("debug.upload.retcode", "Upload source retCode: {0}", retCode));
        return retCode;
    }

    /**
     * Download listing files, all (without "exculde")
     */
    public async downloadListings(ensured: IEnsured) {
        const scopeData = await this.prepareScopeData(ensured);
        if (!scopeData) {
            return false;
        }
        const outdir = ensured.projectSection.outdir;
        scopeData.remoteSource.root += ftpPathSeparator + outdir;    // find only in output directory
        const localRoot = scopeData.localSource.root;
        scopeData.localSource.root += ftpPathSeparator + outdir;     // download exactly in output directory
        const progressRemote = new Progress();
        const [remoteList, localList] = await Promise.all(
                [scopeData.remoteSource.findFiles(ensured.projectSection.listing, undefined, progressRemote),
                scopeData.localSource.findFiles(ensured.projectSection.listing)]);
        // compare them
        let retCode = false;
        if (remoteList && localList) {
            const compareResult = this.compareLists(localList, remoteList);
            // do not add outdir to the files in list! because remoteSource already has root pointed to outdir
            retCode = await this.executeAction(scopeData, compareResult.download, "download")
                .catch((err) => {
                    this.logFn(LogType.debug, () => localize("debug.download_listing.error", "Error while download listings {0}", String(err)));
                    return false;
                });
        } else {
            if (!remoteList) {
                this.logFn(LogType.error, () => localize("cannot.find.remote", "Cannot find files on remote source"), true);
            }
            if (!localList) {
                this.logFn(LogType.error, () => localize("cannot.find.local", "Cannot find files on local source"), true);
            }
        }
        scopeData.localSource.root = localRoot;
        scopeData.remoteSource.root = ensured.projectSection.root;
        this.decideDispose(scopeData);
        return retCode;
    }

    /**
     * Download files without comparing
     * @param files files
     */
    public async downloadFiles(ensured: IEnsured, files: string[] | IFileEntry[]) {
        const scopeData = await this.prepareScopeData(ensured);
        if (!scopeData) {
            return false;
        }
        return this.executeAction(scopeData, files, "download")
            .catch((err) => {
                this.logFn(LogType.debug, () => localize("debug.download.error", "Error while download {0}", String(err)));
                return false;
            })
            .then((done) => {
                this.decideDispose(scopeData);
                return done;
            });
    }

    /**
     * Upload files, without comparing
     * @param files files IFileEntry or strings in unix format
     */
    public async uploadFiles(ensured: IEnsured, files: string[] | IFileEntry[]) {
        const scopeData = await this.prepareScopeData(ensured);
        if (!scopeData) {
            return false;
        }
        return this.executeAction(scopeData, files, "upload")
            .catch((err) => {
                this.logFn(LogType.debug, () => localize("debug.upload.error", "Error while upload {0}", String(err)));
                return false;
            })
            .then((done) => {
                this.decideDispose(scopeData);
                return done;
            });
    }

    /**
     * Dispose or setup watchers besides on "keep alive" flag
     */
    private decideDispose(scopeData: IScopeSyncData) {
        if (!scopeData.ensured.synchronizeSection.keepAlive) {
            this.disposeScopeData(scopeData, true);
        }
    }

    /**
     * Edit file in compare view
     * @param scopeData scope data. uses remoteSource
     * @param file file name
     */
    private async editFile(scopeData: IScopeSyncData, file: string) {
        if (!this.sshHelper || !scopeData.localSource.root) {
            return false;
        }
        const memoryStream = this.sshHelper.memStream();
        let content: string | undefined;
        let localUri: vscode.Uri | undefined;
        let piped = false;
        try {
            piped = await this.sshHelper.pipeFile(scopeData.remoteSource, memoryStream, file, "", this.logFn);
        } catch(err) {
            this.logFn(LogType.error, () => err);
        }
        if (piped && memoryStream.writeStream) {
            const buffer = Buffer.concat(memoryStream.writeStream.chunks);
            content = buffer.toString("utf8");
            const reBuffer = Buffer.from(content, "utf8");
            if (buffer.compare(reBuffer) !== 0) {
                this.logFn(LogType.error, () => localize("file-like-bin", "The file seems like binary: {0}", file));
                return false;
            }
            localUri = vscode.Uri.file(path.join(scopeData.localSource.root, file));
            const found = await vscode.workspace.findFiles(new vscode.RelativePattern(scopeData.localSource.root, file));
            if (found.length === 0) {
                localUri = localUri.with({scheme: "untitled"});
            }
            try {
                const localDoc = await vscode.workspace.openTextDocument(localUri);
                const remoteDoc = await vscode.workspace.openTextDocument({content});
                const title = localize("title.rem_loc", "Remote {0} <-> Local", file);
                const result = await vscode.commands.executeCommand("vscode.diff", remoteDoc.uri, localDoc.uri, title, { preview: false });
                return true;
            } catch (err) {
                this.logFn(LogType.error, () => err);
            }
        } 
        return false;

    }

    /**
     * Compare lists by date
     * @param localList local
     * @param remoteList remote
     */
    private compareLists(localList: IFileEntry[], remoteList: IFileEntry[]) {
        const upload: IFileEntry[] = [];    // from local to remote
        const download: IFileEntry[] = [];  // from remote to local
        const remoteLeft = remoteList.slice(0);
        for (const localFile of localList) {
            const remoteFileIdx = remoteLeft.findIndex((tstRemoteFile) => {
                return tstRemoteFile.filename.toUpperCase() === localFile.filename.toLocaleUpperCase();
            });
            if (remoteFileIdx === -1) {
                this.logFn(LogType.debug, () => localize("debug.no_remote", "No remote {0} => upload", localFile.filename));
                upload.push(localFile);
            } else {
                const diff = (remoteLeft[remoteFileIdx].date.valueOf() - localFile.date.valueOf()) / 1000;
                if (diff < -1) {
                    this.logFn(LogType.debug, () => localize("debug.local_is_newer", "Local {0} is newer by {1} => upload", localFile.filename, diff));
                    upload.push(localFile);
                } else if (diff > 1) {
                    this.logFn(LogType.debug, () => localize("debug.remote_is_newer", "Remote {0} is newer by {1} => download", localFile.filename, diff));
                    download.push(remoteLeft[remoteFileIdx]);
                } else {
                    this.logFn(LogType.debug, () => localize("debug.the_same", "{0} are the same", localFile.filename));
                }
                remoteLeft.splice(remoteFileIdx, 1);
            }
        }
        for (const file of remoteLeft) {
            this.logFn(LogType.debug, () => localize("debug.no_local", "No local {0} => download", file.filename));
        }
        download.push(...remoteLeft);
        return { upload, download };
    }

    /**
     * Ensure that ssh-helper loaded
     */
    private async ensureSshHelper() {
        if (!this.sshHelper) {
            const sshHelperType = await GetSshHelperType();
            if (!sshHelperType) {
                if (this.logFn) {
                    this.logFn(LogType.debug, () => localize("debug.cannot_get_ssh_helper", "Cannot get ssh-helper api"));
                    this.logFn(LogType.error, () => localize("output.install_ssh", "Please, install 'vmssoftware.ssh-helper' first"));
                }
                return false;
            }
            this.sshHelper = new sshHelperType(this.logFn);
        }
        return true;
    }

    /**
     * Execute file action, returns reduces by AND results
     * @param files files
     * @param action action
     */
    private async executeAction(scopeData: IScopeSyncData, files: string[] | IFileEntry[], action: "download" | "upload", progress?: IProgress ) {
        const waitAll = [];
        if (progress) {
            progress.setProgress(action, 0, files.length);
        }
        for (const file of files) {
            let filename: string;
            let filedate: Date;
            const from = action === "download" ? scopeData.remoteSource : scopeData.localSource;
            const to = action === "download" ? scopeData.localSource : scopeData.remoteSource;
            if (typeof file === "string") {
                filename = file;
                filedate = (await from.getDate(file)) || new Date();
            } else {
                filename = file.filename;
                filedate = file.date;
            }
            waitAll.push(this.transferFile(from, to, filename, filedate)
                .then((ok) => {
                    if (progress) {
                        progress.addProgress(action, 1);
                    }
                    if (ok) {
                        this.logFn(LogType.information, () => localize("message.action_success", "{0} success: {1}", action, filename));
                    } else {
                        this.logFn(LogType.error, () => localize("message.action_failed", "{0} is failed: {1}", action, filename));
                    }
                    return ok;
                })
                .catch((err) => {
                    this.logFn(LogType.error, () => err.message);
                    return false;
                }));
        }
        return Promise.all(waitAll)
            .then((arrAll) => {
                return arrAll.reduce((acc, item) => {
                    acc = acc && item;
                    return acc;
                }, true);
            });
    }

    public static async pipeFileAndSetDate(sshHelper: SshHelper | undefined, from: ISource, to: ISource, file: string, date: Date, logFn: LogFunction) {
        if (sshHelper === undefined) {
            return false;
        }
        return sshHelper.pipeFile(from, to, file, file, logFn)
            .then(async (ok) => {
                if (ok) {
                    // TODO: test anyhow that file is completely written before setting date
                    await Delay(500);
                    if (await to.setDate(file, date)) {
                        // give a time to other side to set timestamp
                        await Delay(500);
                        const actualDate = await to.getDate(file);
                        if (actualDate !== undefined) {
                            const diff = date.valueOf() - actualDate.valueOf();
                            if (Math.abs(diff) > 1000) {
                                const diffMinutes = Math.round(diff / 60000);
                                const newDate = new Date(date.valueOf() + diffMinutes * 60000);
                                const retCode = await to.setDate(file, newDate);
                                // give a time to other side to set timestamp
                                await Delay(500);
                                const lastDate = await to.getDate(file);
                                if (lastDate !== undefined) {
                                    const lastDiff = date.valueOf() - lastDate.valueOf();
                                    if (Math.abs(lastDiff) > 1000) {
                                        logFn(LogType.warning, () => `set time for ${file} missed by ${lastDiff}, must be ${date.toISOString()}, but set as ${lastDate.toISOString()} `);
                                    }
                                }
                                return retCode;
                            } else {
                                return true;
                            }
                        }
                    }
                }
                return false;
            });
    }

    /**
     * Transfer file and set date
     * @param from from
     * @param to to
     * @param file file in unix format
     * @param date date
     */
    private async transferFile(from: ISource, to: ISource, file: string, date: Date) {
        await this.transferBarrier.acquire();
        let dir = "";
        const dirInFileEnd = file.lastIndexOf(ftpPathSeparator);
        if (dirInFileEnd !== -1) {
            dir = file.slice(0, dirInFileEnd);
        }
        await to.ensureDirectory(dir);
        return Synchronizer.pipeFileAndSetDate(this.sshHelper, from, to, file, date, this.logFn)
            .then((done) => {
                this.transferBarrier.release();
                return done;
            }).catch((reason) => {
                this.transferBarrier.release();
                return false;
            })
    }

    public async isSupportSetFileTime() {
        const settings = await this.sshHelper?.getSettings();
        if (settings) {
            let connection = settings.connectConfigResolver.testConnectConfig(settings.connectionSection).settings;
            return !!connection?.supportSetFileTime;
        }
        return true;
    }

    public async getUnzipCmd() {
        const settings = await this.sshHelper?.getSettings();
        if (settings) {
            let connection = settings.connectConfigResolver.testConnectConfig(settings.connectionSection).settings;
            return connection?.unzipCmd;
        }
        return undefined;
    }

    /**
     * Prepare sources if missed, also get settings
     */
    private async prepareScopeData(ensured: IEnsured) {
        const scopeKey = ensured.configHelper.workspaceFolder ? ensured.configHelper.workspaceFolder.name : "";
        let   scopeData = Synchronizer.syncScopes.get(scopeKey);
        if (scopeData && scopeData.isValid) {
            return scopeData;
        }
        if (scopeData) {
            this.disposeScopeData(scopeData, true);
        }
        // get ssh helper
        if (!await this.ensureSshHelper() || !this.sshHelper) {
            return undefined;
        }
        // check if all are ready to create sources
        if (ensured.configHelper.workspaceFolder) {
            const scope = ensured.configHelper.workspaceFolder.name;
            this.logFn(LogType.debug, () => localize("debug.create_remote", "Creating remote source"));
            const sftp = await this.sshHelper.getDefaultSftp(scope);
            if (!sftp) {
                return undefined;
            }
            sftp.on("cleanSftp", () => {
                markInvalid();
            });
            const remoteSource = await (async (sshHelper)=> {
                if (await this.isSupportSetFileTime()) {
                    return new SftpSource(new VmsSftpClient(sftp), ensured.projectSection.root, this.logFn, ensured.synchronizeSection.setTimeAttempts);
                } else {
                    const shell = await sshHelper.getDefaultVmsShell(scope);
                    if (!shell) {
                        return undefined;
                    }
                    shell.on("cleanClient", () => {
                        markInvalid();
                    });
                    shell.on("cleanChannel", () => {
                        markInvalid();
                    });
                    return new VmsShellSource(new VmsSftpClient(sftp), shell, ensured.projectSection.root, this.logFn, ensured.synchronizeSection.setTimeAttempts);
                }
            })(this.sshHelper);
            if (!remoteSource) {
                return undefined;
            }

            this.logFn(LogType.debug, () => localize("debug.create_local", "Creating local source"));
            const localSource = new FsSource(ensured.configHelper.workspaceFolder.uri.fsPath, this.logFn);

            const watcher = ensured.configHelper.getConfig().onDidLoad(markInvalid);
            const sshWatcher = this.sshHelper.setConfigWatcher(scope, markInvalid);
            scopeData = {
                ensured,
                isValid: true,
                localSource,
                remoteSource,
                sshWatcher,
                watcher,
            } as IScopeSyncData;
            Synchronizer.syncScopes.set(scopeKey, scopeData);
            return scopeData;

            function markInvalid() {
                // mark as invalid by scopeKey
                const delData = Synchronizer.syncScopes.get(scopeKey);
                if (delData) {
                    delData.isValid = false;
                }
            }

        }
        return undefined;
    }

}
