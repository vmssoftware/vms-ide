import path from "path";
import vscode from "vscode";

import { GetSshHelperFromApi } from "../config/get-ssh-helper";
import { IProjectSection, ProjectSection } from "../config/sections/project";
import { ISynchronizeSection, SynchronizeSection } from "../config/sections/synchronize";

import { Barrier, Delay } from "@vorfol/common";
import { LogFunction, LogType } from "@vorfol/common";
import { ftpPathSeparator } from "@vorfol/common";
import { IFileEntry } from "@vorfol/common";

import { SshHelper } from "../ext-api/ssh-helper";

import { createFile } from "../common/create-file";
import { ensureSettings, projectSection, synchronizerConfig, synchronizeSection } from "../ensure-settings";
import { FsSource } from "./fs-source";
import { ISource } from "./source";
import { VmsSource } from "./vms-source";

import * as nls from "vscode-nls";
nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export class Synchronizer {

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

    private sshHelper?: SshHelper;
    private remoteSource?: ISource;
    private localSource?: ISource;
    private transferBarrier = new Barrier(10);
    // private acquires = 0;

    private workspaceUri?: vscode.Uri;

    private onDidLoadConfig?: vscode.Disposable;  // dispose listener
    private onDidLoadSSHConfig?: vscode.Disposable;  // dispose listener

    private constructor(logFn?: LogFunction) {
        // tslint:disable-next-line:no-empty
        this.logFn = logFn || (() => {});
    }

    public enableRemote() {
        if (this.remoteSource) {
            this.remoteSource.enabled = true;
        }
    }

    public disableRemote() {
        this.logFn(LogType.debug, () => localize("debug.dissblig", "Disabling SFTP and SHELL"));
        if (this.remoteSource) {
            this.remoteSource.enabled = false;
        }
    }

    /**
     * User have to dispose the source
     */
    public async requestSource(type: "local" | "remote"): Promise<ISource | undefined> {
        // get current config
        if (!await this.ensureSettings()) {
            return undefined;
        }
        if (type === "local") {
            if (this.workspaceUri) {
                return new FsSource(this.workspaceUri.fsPath, this.logFn);
            }
            return undefined;
        }
        // get ssh helper
        if (!await this.ensureSshHelper()) {
            return undefined;
        }
        // check if all are ready to create sources
        if (projectSection
            && synchronizeSection
            && this.sshHelper) {
            // clear password cache
            this.sshHelper.clearPasswordCashe();
            const [sftp, shell] = await Promise.all([
                    this.sshHelper.getDefaultSftp(),
                    this.sshHelper.getDefaultVmsShell(),
                ]);
            if (sftp && shell) {
                return new VmsSource(sftp, shell, projectSection.root, this.logFn, synchronizeSection.setTimeAttempts);
            }
        }
        return undefined;
    }

    public async syncronizeProject() {
        if (!await this.prepareSources()) {
            return false;
        }
        if (this.localSource
            && this.remoteSource
            && projectSection
            && synchronizeSection
            && this.sshHelper) {
            // enable
            this.enableRemote();
            // clear password cache
            this.sshHelper.clearPasswordCashe();
            // get full list
            const includes = [
                projectSection.source,
                projectSection.resource,
                // projectSection.listing,
                projectSection.headers,
                projectSection.builders,
            ];
            const include = includes.join(",");
            const [remoteList,
                   localList] = await Promise.all([this.remoteSource.findFiles(include, projectSection.exclude),
                                                   this.localSource.findFiles(include, projectSection.exclude)]);
            // compare them
            const compareResult = this.compareLists(localList, remoteList);
            const waitAll = [];
            // upload
            waitAll.push(this.executeAction(compareResult.upload, "upload"));
            switch (synchronizeSection.downloadNewFiles) {
                case "overwrite":
                    waitAll.push(this.executeAction(compareResult.download, "download"));
                    break;
                case "skip":
                    for (const downloadFile of compareResult.download) {
                        this.logFn(LogType.information, () => localize("output.download_manually", "Remote {0} is newer, please check and download it manually", downloadFile.filename));
                    }
                    break;
                case "edit":
                    for (const downloadFile of compareResult.download) {
                        waitAll.push(this.editFile(this.remoteSource, downloadFile.filename));
                    }
                    if (compareResult.download.length > 0) {
                        this.logFn(LogType.information, () => localize("output.edit_count", "Please edit and save {0} files manually", compareResult.download.length));
                    }
                    break;
            }
            // wait all operations are done
            const results = await Promise.all(waitAll);
            // end
            this.decideDispose();
            const retCode = results.reduce((acc, result) => {
                    acc = acc && result;
                    return acc;
                }, true);
            this.logFn(LogType.debug, () => localize("debug.retcode", "Synchronize retCode: {0}", retCode));
            return retCode;
        } else {
            this.logFn(LogType.error, () => localize("output.edit_settings", "In first please edit settings"));
        }
        return false;
    }

    public async uploadSource() {
        if (!await this.prepareSources()) {
            return false;
        }
        if (this.localSource
            && this.remoteSource
            && projectSection
            && synchronizeSection
            && this.sshHelper) {
            // enable
            this.enableRemote();
            // clear password cache
            this.sshHelper.clearPasswordCashe();
            // get full list
            const includes = [
                projectSection.source,
                projectSection.resource,
                // projectSection.listing,
                projectSection.headers,
                projectSection.builders,
            ];
            const include = includes.join(",");
            const [remoteList,
                   localList] = await Promise.all([this.remoteSource.findFiles(include, projectSection.exclude),
                                                   this.localSource.findFiles(include, projectSection.exclude)]);
            // compare them
            const compareResult = this.compareLists(localList, remoteList);
            const retCode = await this.executeAction(compareResult.upload, "upload");
            // end
            this.decideDispose();
            this.logFn(LogType.debug, () => localize("debug.upload.retcode", "Upload source retCode: {0}", retCode));
            return retCode;
        } else {
            this.logFn(LogType.error, () => localize("output.edit_settings", "In first please edit settings"));
        }
        return false;
    }

    /**
     * Download listing files, all (without "exculde")
     */
    public async downloadListings() {
        if (!await this.prepareSources()) {
            return false;
        }
        if (this.remoteSource
            && this.localSource
            && projectSection) {
                const outdir = projectSection.outdir;
                this.remoteSource.root += ftpPathSeparator + outdir;    // find only in output directory
                const localRoot = this.localSource.root;
                this.localSource.root += ftpPathSeparator + outdir;     // download exactly in output directory
                const [remoteList, localList] =
                    await Promise.all([this.remoteSource.findFiles(projectSection.listing),
                                       this.localSource.findFiles(projectSection.listing)]);
                // compare them
                const compareResult = this.compareLists(localList, remoteList);
                 // do not add outdir to the files in list! because remoteSource already has root pointed to outdir
                return this.executeAction(compareResult.download, "download")
                    .catch((err) => {
                        this.logFn(LogType.debug, () => localize("debug.download_listing.error", "Error while download listings {0}", String(err)));
                        return false;
                    })
                    .then((done) => {
                        if (this.remoteSource
                            && this.localSource
                            && projectSection) {
                                this.localSource.root = localRoot;
                                this.remoteSource.root = projectSection.root;
                            }
                        this.decideDispose();
                        return done;
                    });
        }
        return false;
    }

    /**
     * Download files without comparing
     * @param files files
     */
    public async downloadFiles(files: string[] | IFileEntry[]) {
        if (!await this.prepareSources()) {
            return false;
        }
        return this.executeAction(files, "download")
            .catch((err) => {
                this.logFn(LogType.debug, () => localize("debug.download.error", "Error while download {0}", String(err)));
                return false;
            })
            .then((done) => {
                this.decideDispose();
                return done;
            });
    }

    /**
     * Upload files, without comparing
     * @param files files
     */
    public async uploadFiles(files: string[] | IFileEntry[]) {
        if (!await this.prepareSources()) {
            return false;
        }
        return this.executeAction(files, "upload")
            .catch((err) => {
                this.logFn(LogType.debug, () => localize("debug.upload.error", "Error while upload {0}", String(err)));
                return false;
            })
            .then((done) => {
                this.decideDispose();
                return done;
            });
}

    /**
     * Dispose all sources and watchers
     */
    public dispose() {
        this.logFn(LogType.debug, () => localize("debug.disposing", "Disposing sources"));
        // sources
        if (this.remoteSource) {
            this.remoteSource.dispose();
            this.remoteSource = undefined;
        }
        if (this.localSource) {
            this.localSource.dispose();
            this.localSource = undefined;
        }
        // watchers
        if (this.onDidLoadConfig) {
            this.onDidLoadConfig.dispose();
            this.onDidLoadConfig = undefined;
        }
        if (this.onDidLoadSSHConfig) {
            this.onDidLoadSSHConfig.dispose();
            this.onDidLoadSSHConfig = undefined;
        }
    }

    /**
     * Dispose or setup watchers besides on "keep alive" flag
     */
    private decideDispose() {
        // this.acquires--;
        // if (this.acquires > 0) {
        //     return;
        // }
        // this.acquires = 0;  // to prevent under zero values
        if (synchronizerConfig
            && synchronizeSection
            && synchronizeSection.keepAlive) {
            // test configuration watcher and create if need
            if (this.onDidLoadConfig === undefined) {
                this.onDidLoadConfig = synchronizerConfig.onDidLoad( async () => {
                    // test if "keep alive" changed
                    if (synchronizerConfig) {
                        const tst = await synchronizerConfig.get(SynchronizeSection.section);
                        if (!SynchronizeSection.is(tst)
                            || tst.keepAlive === false) {
                            this.dispose();
                        }
                    } else {
                        // nothing to keep
                        this.dispose();
                    }
                });
            }
            // attach watcher to the sshHelper (always do dispose)
            if (this.onDidLoadSSHConfig === undefined
                && this.sshHelper
                && this.sshHelper.onDidLoadConfig !== undefined) {
                this.onDidLoadSSHConfig = this.sshHelper.onDidLoadConfig(() => {
                    this.dispose();
                });
            }
        } else {
            this.dispose();
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
    private async prepareSources() {
        if (this.remoteSource && this.localSource) {
            // this.acquires++;
            return true;
        }
        // get current config
        if (!await this.ensureSettings()) {
            return false;
        }
        // get ssh helper
        if (!await this.ensureSshHelper()) {
            return false;
        }
        // check if all are ready to create sources
        if (projectSection
            && synchronizeSection
            && this.workspaceUri
            && this.sshHelper) {
            // this.acquires ++;
            if (!this.remoteSource) {
                this.logFn(LogType.debug, () => localize("debug.create_remote", "Creating remote source"));
                const [sftp, shell] = await Promise.all([
                        this.sshHelper.getDefaultSftp(),
                        this.sshHelper.getDefaultVmsShell(),
                    ]);
                if (sftp && shell) {
                    this.remoteSource = new VmsSource(sftp, shell, projectSection.root, this.logFn, synchronizeSection.setTimeAttempts);
                }
            }
            if (!this.localSource) {
                this.logFn(LogType.debug, () => localize("debug.create_local", "Creating local source"));
                this.localSource = new FsSource(this.workspaceUri.fsPath, this.logFn);
            }
            return true;
        }
        return false;
    }

    /**
     * Get and copy settings to this
     */
    private async ensureSettings() {
        if (!await ensureSettings(this.logFn) || !synchronizerConfig) {
            this.logFn(LogType.error, () => localize("error.no_settings", "Cannot get settings"));
            return false;
        }
        if (!vscode.workspace.workspaceFolders || vscode.workspace.workspaceFolders.length === 0) {
            this.logFn(LogType.error, () => localize("error.no_workspace", "Workspace is empty"));
            return false;
        }
        this.workspaceUri = vscode.workspace.workspaceFolders[0].uri;
        return true;
}

    /**
     * Ensure that ssh-helper loaded
     */
    private async ensureSshHelper() {
        if (!this.sshHelper) {
            const sshHelperType = await GetSshHelperFromApi();
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
    private async executeAction(files: string[] | IFileEntry[], action: "download" | "upload" ) {
        if (!this.localSource || !this.remoteSource) {
            return false;
        }
        const waitAll = [];
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
            const from = action === "download" ? this.remoteSource : this.localSource;
            const to = action === "download" ? this.localSource : this.remoteSource;
            waitAll.push(this.transferFile(from, to, filename, filedate)
                                .then((ok) => {
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
                    return to.setDate(file, date);
                }
                return false;
            })
            .then((done) => {
                this.transferBarrier.release();
                return done;
            });
    }

}
