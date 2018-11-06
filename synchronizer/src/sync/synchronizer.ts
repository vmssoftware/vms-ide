import path from "path";
import vscode from "vscode";

import { GetSshHelperFromApi } from "../config/get-ssh-helper";
import { IProjectSection, ProjectSection } from "../config/sections/project";
import { ISynchronizeSection, SynchronizeSection } from "../config/sections/synchronize";

import { Delay } from "@vorfol/common";
import { LogFunction, LogType } from "@vorfol/common";
import { ftpPathSeparator } from "@vorfol/common";
import { IFileEntry } from "@vorfol/common";

import { ISftpClient } from "../ext-api/api";
import { ISshShell } from "../ext-api/api";
import { SshHelper } from "../ext-api/ssh-helper";

import { EnsureSettings, synchronizerConfig } from "../ensure-settings";
import { FsSource } from "./fs-source";
import { ISource } from "./source";
import { VmsSource } from "./vms-source";

import * as nls from "vscode-nls";
import { createFile } from "../common/create-file";
nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export class Synchronizer {

    public static acquire(debugLog?: LogFunction) {
        if (!Synchronizer.instance) {
            Synchronizer.instance = new Synchronizer(debugLog);
        } else if (debugLog !== undefined) {
            Synchronizer.instance.logFn = debugLog;
        }
        return Synchronizer.instance;
    }

    private static instance?: Synchronizer;

    public messages: string[] = [];
    public inProgress = false;

    private sshHelper?: SshHelper;
    private remoteSftp?: ISftpClient;
    private remoteShell?: ISshShell;

    private remoteSource?: ISource;
    private localSource?: ISource;

    private projectSection?: IProjectSection;
    private synchronizeSection?: ISynchronizeSection;
    private workspaceUri?: vscode.Uri;

    private onDidLoadConfig?: vscode.Disposable;  // dispose listener
    private onDidLoadSSHConfig?: vscode.Disposable;  // dispose listener

    private constructor(public logFn?: LogFunction) {
    }

    public enableRemote() {
        if (this.remoteSftp) {
            this.remoteSftp.enabled = true;
        }
        if (this.remoteShell) {
            this.remoteShell.enabled = true;
        }
    }

    public disableRemote() {
        if (this.logFn) {
            this.logFn(LogType.debug, () => localize("debug.dissblig", "Disabling SFTP and SHELL"));
        }
        if (this.remoteSftp) {
            this.remoteSftp.enabled = false;
        }
        if (this.remoteShell) {
            this.remoteShell.enabled = false;
        }
    }

    public async syncronizeProject() {
        this.messages = [];
        if (!await this.prepareSources()) {
            return false;
        }
        if (this.localSource
            && this.remoteSource
            && this.projectSection
            && this.synchronizeSection
            && this.sshHelper) {
            // enable
            this.enableRemote();
            // clear password cache
            this.sshHelper.clearPasswordCashe();
            // get full list
            const includes = [
                this.projectSection.source,
                this.projectSection.resource,
                this.projectSection.listing,
                this.projectSection.headers,
                this.projectSection.builders,
            ];
            const include = includes.join(",");
            const [remoteList,
                   localList] = await Promise.all([this.remoteSource.findFiles(include, this.projectSection.exclude),
                                                   this.localSource.findFiles(include, this.projectSection.exclude)]);
            // compare them
            const compareResult = this.compareLists(localList, remoteList);
            const waitAll = [];
            // upload
            waitAll.push(this.executeAction(compareResult.upload, "upload"));
            switch (this.synchronizeSection.downloadNewFiles) {
                case "overwrite":
                    waitAll.push(this.executeAction(compareResult.download, "download"));
                    break;
                case "skip":
                    for (const downloadFile of compareResult.download) {
                        this.messages.push(localize("output.download_manually", "Remote {0} is newer, please check and download it manually", downloadFile.filename));
                    }
                    break;
                case "edit":
                    for (const downloadFile of compareResult.download) {
                        waitAll.push(this.editFile(this.remoteSource, downloadFile.filename));
                    }
                    if (compareResult.download.length > 0) {
                        this.messages.push(localize("output.edit_count", "Please edit and save {0} files manually", compareResult.download.length));
                    }
                    break;
            }
            // wait all operations are done
            const results = await Promise.all(waitAll);
            // end
            this.collectSourceErrors();
            this.decideDispose();
            const retCode = results.reduce((acc, result) => {
                    acc = acc && result;
                    return acc;
                }, true);
            if (this.logFn) {
                this.logFn(LogType.debug, () => localize("debug.retcode", "Synchronize retCode: {0}", retCode));
            }
            return retCode;
        } else {
            this.messages.push(localize("output.edit_settings", "In first please edit settings"));
        }
        return false;
    }

    /**
     * Download listing files, all (without "exculde")
     */
    public async downloadListings() {
        this.messages = [];
        if (!this.prepareSources()) {
            return false;
        }
        if (this.remoteSource &&
            this.projectSection) {
            const list = await this.remoteSource.findFiles(this.projectSection.listing);
            return this.executeAction(list, "download")
                .then((done) => {
                    this.collectSourceErrors();
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
        this.messages = [];
        if (!this.prepareSources()) {
            return false;
        }
        return this.executeAction(files, "download")
            .then((done) => {
                this.collectSourceErrors();
                this.decideDispose();
                return done;
            });
    }

    /**
     * Upload files, without comparing
     * @param files files
     */
    public async uploadFiles(files: string[] | IFileEntry[]) {
        this.messages = [];
        if (!this.prepareSources()) {
            return false;
        }
        return this.executeAction(files, "upload")
            .then((done) => {
                this.collectSourceErrors();
                this.decideDispose();
                return done;
            });
    }

    /**
     * Dispose all sources and watchers
     */
    public dispose() {
        if (this.logFn) {
            this.logFn(LogType.debug, () => localize("debug.disposing", "Disposing sources"));
        }
        // sources
        if (this.remoteSftp) {
            this.remoteSftp.dispose();
            this.remoteSftp = undefined;
        }
        if (this.remoteShell) {
            this.remoteShell.dispose();
            this.remoteShell = undefined;
        }
        this.remoteSource = undefined;
        this.localSource = undefined;
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
     * Just keep in messages
     */
    private collectSourceErrors() {
        // if (this.remoteSftp) {
        //     if (this.remoteSftp.lastSftpError) {
        //         this.messages.push(this.remoteSftp.lastSftpError.message);
        //     }
        //     if (this.remoteSftp.lastClientError) {
        //         this.messages.push(this.remoteSftp.lastClientError.message);
        //     }
        // }
        // if (this.remoteShell) {
        //     if (this.remoteShell.lastShellError) {
        //         this.messages.push(this.remoteShell.lastShellError.message);
        //     }
        //     if (this.remoteShell.lastClientError) {
        //         this.messages.push(this.remoteShell.lastClientError.message);
        //     }
        // }
    }

    /**
     * Dispose or setup watchers besides on "keep alive" flag
     */
    private decideDispose() {
        if (synchronizerConfig
            && this.synchronizeSection
            && this.synchronizeSection.keepAlive) {
            // test configuration watcher and create if need
            if (this.onDidLoadConfig === undefined) {
                this.onDidLoadConfig = synchronizerConfig.onDidLoad( async () => {
                    // test if "keep alive" changed
                    if (synchronizerConfig) {
                        const tst = await synchronizerConfig.get(SynchronizeSection.name);
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
                if (this.logFn) {
                    this.logFn(LogType.debug, () => errPipeOrAfter);
                }
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
                            if (this.logFn) {
                                this.logFn(LogType.debug, () => errCreateOrShow);
                            }
                            return false;
                        });
                } else {
                    if (this.logFn) {
                        this.logFn(LogType.debug, () => localize("debug.nothing", "Nothing to show"));
                    }
                    return false;
                }
            }).catch((errLast) => {
                if (this.logFn) {
                    this.logFn(LogType.debug, () => errLast);
                }
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
                if (this.logFn) {
                    this.logFn(LogType.debug, () => localize("debug.no_remote", "No remote {0} => upload", localFile.filename));
                }
                upload.push(localFile);
            } else {
                const diff = (remoteLeft[remoteFileIdx].date.valueOf() - localFile.date.valueOf()) / 1000;
                if (diff < -1) {
                    if (this.logFn) {
                        this.logFn(LogType.debug, () => localize("debug.local_is_newer", "Local {0} is newer by {1} => upload", localFile.filename, diff));
                    }
                    upload.push(localFile);
                } else if (diff > 1) {
                    if (this.logFn) {
                        this.logFn(LogType.debug, () => localize("debug.remote_is_newer", "Remote {0} is newer by {1} => download", localFile.filename, diff));
                    }
                    download.push(remoteLeft[remoteFileIdx]);
                } else if (this.logFn) {
                    this.logFn(LogType.debug, () => localize("debug.the_same", "{0} are the same", localFile.filename));
                }
                remoteLeft.splice(remoteFileIdx, 1);
            }
        }
        if (this.logFn) {
            for (const file of remoteLeft) {
                this.logFn(LogType.debug, () => localize("debug.no_local", "No local {0} => download", file.filename));
            }
        }
        download.push(...remoteLeft);
        return { upload, download };
    }

    /**
     * Prepare sources if missed, also get settings
     */
    private async prepareSources() {
        if (this.remoteSource && this.localSource) {
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
        if (this.projectSection
            && this.synchronizeSection
            && this.workspaceUri
            && this.sshHelper) {
            if (!this.remoteSource) {
                if (this.logFn) {
                    this.logFn(LogType.debug, () => localize("debug.create_remote", "Creating remote source"));
                }
                const [sftp, shell] = await Promise.all([
                        this.sshHelper.getDefaultSftp(),
                        this.sshHelper.getDefaultVmsShell(),
                    ]);
                if (sftp && shell) {
                    this.remoteSftp = sftp;
                    this.remoteShell = shell;
                    this.remoteSource = new VmsSource(sftp, shell, this.projectSection.root, this.logFn, this.synchronizeSection.setTimeAttempts);
                }
            }
            if (!this.localSource) {
                if (this.logFn) {
                    this.logFn(LogType.debug, () => localize("debug.create_local", "Creating local source"));
                }
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
        if (!await EnsureSettings() || !synchronizerConfig) {
            this.messages.push(localize("error.no_settings", "Cannot get settings"));
            return false;
        }
        const [projectSection, synchronizeSection] = await Promise.all([
                    synchronizerConfig.get(ProjectSection.section),
                    synchronizerConfig.get(SynchronizeSection.section)]);
        // get current values
        const project = projectSection ? projectSection.store() : undefined;
        const synch = synchronizeSection ? synchronizeSection.store() : undefined;
        if (ProjectSection.is(project)
            && SynchronizeSection.is(synch)
            && vscode.workspace.workspaceFolders
            && vscode.workspace.workspaceFolders.length > 0) {
            // hold
            this.projectSection = project;
            this.synchronizeSection = synch;
            this.workspaceUri = vscode.workspace.workspaceFolders[0].uri;
            return true;
        } else {
            this.messages.push(localize("error.bad_settings", "Inconsistent settings or workspace is empty"));
            return false;
        }
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
                }
                this.messages.push(localize("output.install_ssh", "Please, install 'vmssoftware.ssh-helper' first"));
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
                                        this.messages.push(localize("message.action_success", "{0} success: {1}", action, filename));
                                    } else {
                                        this.messages.push(localize("message.action_failed", "{0} is failed: {1}", action, filename));
                                    }
                                    return ok;
                                })
                                .catch((err) => {
                                    this.messages.push(err.message);
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
        const dirEnd = file.lastIndexOf(ftpPathSeparator);
        if (dirEnd !== -1) {
            const dir = file.slice(0, dirEnd);
            await to.ensureDirectory(dir);
        }
        return this.sshHelper!.pipeFile(from, to, file, file, this.logFn)
            .then(async (ok) => {
                if (ok) {
                    // TODO: test anyhow that file is completely written before setting date
                    await Delay(500);
                    return to.setDate(file, date);
                }
                return false;
            });
    }

}
