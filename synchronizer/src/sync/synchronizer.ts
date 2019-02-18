import path from "path";
import * as vscode from "vscode";

import * as nls from "vscode-nls";
nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

import { GetSshHelperType } from "../ext-api/get-ssh-helper";

import { Barrier, Delay } from "@vorfol/common";
import { LogFunction, LogType } from "@vorfol/common";
import { ftpPathSeparator } from "@vorfol/common";
import { IFileEntry } from "@vorfol/common";

import { IDispose, SshHelper } from "../ext-api/ssh-helper";

import { createFile } from "../common/create-file";
import { AcceptedToken } from "../common/find-files";
import { Progress } from "../common/progress";
import { IEnsured } from "../ensure-settings";
import { FsSource } from "./fs-source";
import { SftpSource } from "./sftp-source";
import { IProgress, ISource } from "./source";
import { VmsSftpClient } from "./vms-sftp-client";
import { VmsShellSource } from "./vms-shell-source";

interface IScopeSyncData {
    ensured: IEnsured;      // saved settings
    isValid: boolean;
    localSource: ISource;
    remoteSource: ISource;
    watcher: IDispose;
    sshWatcher: IDispose;
}

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
        for (const scopeData of Synchronizer.syncScopes.values()) {
            scopeData.remoteSource.enabled = true;
        }
    }

    public disableRemote() {
        this.stopIssued = true;
        this.logFn(LogType.debug, () => localize("debug.disablig", "Disabling all SFTP and SHELL"));
        for (const scopeData of Synchronizer.syncScopes.values()) {
            scopeData.remoteSource.enabled = false;
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
        // get ssh helper
        if (!await this.ensureSshHelper() || !this.sshHelper) {
            return undefined;
        }
        // clear password cache
        this.sshHelper.clearPasswordCache();
        const scope = ensured.configHelper.workspaceFolder ? ensured.configHelper.workspaceFolder.name : undefined;
        const [sftp, shell] = await Promise.all([
                this.sshHelper.getDefaultSftp(scope),
                this.sshHelper.getDefaultVmsShell(scope),
            ]);
        if (sftp && shell) {
            return ensured.synchronizeSection.setTimeByShell
            ? new VmsShellSource(new VmsSftpClient(sftp), shell, ensured.projectSection.root, this.logFn, ensured.synchronizeSection.setTimeAttempts)
            : new SftpSource(new VmsSftpClient(sftp), ensured.projectSection.root, this.logFn, ensured.synchronizeSection.setTimeAttempts);
        }
        return undefined;
    }

    public async syncronizeProject(ensured: IEnsured) {
        const scopeData = await this.prepareScopeData(ensured);
        if (!scopeData) {
            return false;
        }
        // enable
        this.enableRemote();
        // clear password cache
        this.sshHelper!.clearPasswordCache();
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
                    waitAll.push(this.editFile(scopeData.remoteSource!, downloadFile.filename));
                }
                if (compareResult.download.length > 0) {
                    this.logFn(LogType.information, () => localize("output.edit_count", "Please edit and save {0} files manually", compareResult.download.length));
                }
                break;
        }
        // wait all operations are done
        const results = await Promise.all(waitAll);

        progressProcess.dispose();

        // end
        this.decideDispose(scopeData);
        const retCode = results.reduce((acc, result) => {
                acc = acc && result;
                return acc;
            }, true);
        this.logFn(LogType.debug, () => localize("debug.retcode", "Synchronize retCode: {0}", retCode));
        return retCode;
    }

    public async uploadSource(ensured: IEnsured) {
        const scopeData = await this.prepareScopeData(ensured);
        if (!scopeData) {
            return false;
        }
        // enable
        this.enableRemote();
        // clear password cache
        this.sshHelper!.clearPasswordCache();
        // get full list
        const includes = [
            ensured.projectSection.source,
            ensured.projectSection.resource,
            // projectSection.listing,
            ensured.projectSection.headers,
            ensured.projectSection.builders,
        ];
        const include = includes.join(",");
        const [remoteList, localList] = await Promise.all(
            [scopeData.remoteSource.findFiles(include, ensured.projectSection.exclude),
             scopeData.localSource.findFiles(include, ensured.projectSection.exclude)]);
        // compare them
        const compareResult = this.compareLists(localList, remoteList);
        const retCode = await this.executeAction(scopeData, compareResult.upload, "upload");
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
        const [remoteList, localList] = await Promise.all(
            [scopeData.remoteSource.findFiles(ensured.projectSection.listing),
                scopeData.localSource.findFiles(ensured.projectSection.listing)]);
        // compare them
        const compareResult = this.compareLists(localList, remoteList);
            // do not add outdir to the files in list! because remoteSource already has root pointed to outdir
        return this.executeAction(scopeData, compareResult.download, "download")
            .catch((err) => {
                this.logFn(LogType.debug, () => localize("debug.download_listing.error", "Error while download listings {0}", String(err)));
                return false;
            })
            .then((done) => {
                scopeData.localSource.root = localRoot;
                scopeData.remoteSource.root = ensured.projectSection.root;
                this.decideDispose(scopeData);
                return done;
            });
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
     * @param files files
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
     * @param source source to get file from
     * @param file file name
     */
    private async editFile(source: ISource, file: string) {
        const memoryStream = this.sshHelper!.memStream();
        let content: string | undefined;
        let localUri: vscode.Uri | undefined;
        return this.sshHelper!.pipeFile(source, memoryStream, file, "", this.logFn)
            .then(async (ok) => {
                if (ok && memoryStream.writeStream && vscode.workspace.workspaceFolders && vscode.workspace.workspaceFolders.length > 0) {
                    content = Buffer.concat(memoryStream.writeStream.chunks).toString("utf8");
                    const workspaceUri = vscode.workspace.workspaceFolders[0].uri;
                    localUri = vscode.Uri.file(path.join(workspaceUri.fsPath, file));
                    return vscode.workspace.openTextDocument(localUri)
                        .then(async (localDoc) => {
                            return [localDoc, await vscode.workspace.openTextDocument({content, language: "mms"})];
                        }).then(([localDoc, remoteDoc]) => {
                            const title = localize("title.rem_loc", "Remote {0} <-> Local", file);
                            return vscode.commands.executeCommand("vscode.diff", remoteDoc.uri, localDoc.uri, title, { preview: false });
                        }).then(() => true);
                } else {
                    return false;
                }
            }).catch((errPipeOrAfter) => {
                this.logFn(LogType.debug, () => errPipeOrAfter);
                if (localUri && content) {
                    return createFile(localUri, content)
                        .then((ok) => {
                            if (ok) {
                                return vscode.window.showTextDocument(localUri!, { preview: false })
                                    .then(() => true);
                            } else {
                                return false;
                            }
                        }).catch((errCreateOrShow) => {
                            this.logFn(LogType.debug, () => errCreateOrShow);
                            return false;
                        });
                } else {
                    this.logFn(LogType.debug, () => localize("debug.nothing", "Nothing to show"));
                    return false;
                }
            }).catch((errLast) => {
                this.logFn(LogType.error, () => errLast);
                return false;
            });
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
            const remoteSource = await (async (sshHelper) => {
                if (ensured.synchronizeSection.setTimeByShell) {
                    const shell = await sshHelper.getDefaultVmsShell(scope);
                    if (!shell) {
                        return undefined;
                    }
                    return new VmsShellSource(new VmsSftpClient(sftp), shell, ensured.projectSection.root, this.logFn, ensured.synchronizeSection.setTimeAttempts);
                } else {
                    return new SftpSource(new VmsSftpClient(sftp), ensured.projectSection.root, this.logFn, ensured.synchronizeSection.setTimeAttempts);
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
            if (typeof file === "string") {
                filename = file;
                filedate = new Date();
            } else {
                filename = file.filename;
                filedate = file.date;
            }
            const from = action === "download" ? scopeData.remoteSource : scopeData.localSource;
            const to = action === "download" ? scopeData.localSource : scopeData.remoteSource;
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

    /**
     * Transfer file and set date
     * @param from from
     * @param to to
     * @param file file
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
        return this.sshHelper!.pipeFile(from, to, file, file, this.logFn)
            .then(async (ok) => {
                if (ok) {
                    // TODO: test anyhow that file is completely written before setting date
                    await Delay(500);
                    if (await to.setDate(file, date)) {
                        const actualDate = await to.getDate(file);
                        if (actualDate) {
                            const diff = date.valueOf() - actualDate.valueOf();
                            if (Math.abs(diff) > 1000) {
                                return to.setDate(file, new Date(date.valueOf() + diff));
                            } else {
                                return true;
                            }
                        }
                    }
                }
                return false;
            })
            .then((done) => {
                this.transferBarrier.release();
                return done;
            });
    }

}
