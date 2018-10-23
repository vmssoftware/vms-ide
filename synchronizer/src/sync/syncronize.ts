import { Disposable, workspace } from "vscode";

import { Delay } from "../common/delay";
import { ftpPathSeparator } from "../common/find-files";
import { LogType } from "../common/log-type";
import { isSimplyEq } from "../common/simply-compare";
import { IConnectConfigResolver } from "../config-resolve/connect-config-resolver";
import { ConnectConfigResolverImpl } from "../config-resolve/connect-config-resolver-impl";
import { PasswordVscodeFiller } from "../config-resolve/password-vscode-filler";
import { IConfig, IConfigData, IConfigSection } from "../config/config";
import { ConnectionSection } from "../config/sections/connection";
import { ProjectSection } from "../config/sections/project";
import { DownloadAction, WorkspaceSection } from "../config/sections/workspace";
import { EnsureSettings } from "../ensure-settings";
import { ToOutputChannel } from "../output-channel";
import { ParseWelcomeVms } from "../stream/parse-welcome-vms";
import { PipeFile } from "../stream/pipe";
import { IPromptCatcher } from "../stream/prompt-catcher";
import { PromptCatcherVms } from "../stream/prompt-catcher-vms";
import { IFileEntry } from "../stream/read-directory";
import { SftpClient } from "../stream/sftp-client";
import { SshShell } from "../stream/ssh-shell";
import { IWelcomeParser } from "../stream/welcome-parser";
import { FsSource } from "./fs-source";
import { ISource } from "./source";
import { VmsSource } from "./vms-source";

interface IDispose { dispose: () => void; }

export class Synchronizer {

    public get isInProgress(): boolean {
        return this.inProgress;
    }

    private inProgress = false;
    private resolver?: IConnectConfigResolver;
    private welcome?: IWelcomeParser;
    private prompter?: IPromptCatcher;
    private remoteSftp?: SftpClient;
    private remoteShell?: SshShell;
    private remoteSource?: ISource;
    private localSource?: ISource;
    private include?: string;
    private exclude?: string;
    private connectionSection?: IConfigData;
    private projectSection?: IConfigData;
    private workspaceSection?: IConfigData;
    private downloadNewFiles: DownloadAction = "edit";
    private onDidLoadDisposable?: Disposable;

    constructor(public debugLog?: LogType) {
    }

    public compareLists(localList: IFileEntry[], remoteList: IFileEntry[]) {
        const upload: IFileEntry[] = [];    // from local to remote
        const download: IFileEntry[] = [];  // from remote to local
        const remoteLeft = remoteList.slice(0);
        for (const localFile of localList) {
            const remoteFileIdx = remoteLeft.findIndex((tstRemoteFile) => {
                return tstRemoteFile.filename.toUpperCase() === localFile.filename.toLocaleUpperCase();
            });
            if (remoteFileIdx === -1) {
                if (this.debugLog) {
                    this.debugLog(`No remote ${localFile.filename} => upload`);
                }
                upload.push(localFile);
            } else {
                const diff = (remoteLeft[remoteFileIdx].date.valueOf() - localFile.date.valueOf()) / 1000;
                if (diff < -1) {
                    if (this.debugLog) {
                        this.debugLog(`Local ${localFile.filename} is newer by ${diff} => upload`);
                    }
                    upload.push(localFile);
                } else if (diff > 1) {
                    if (this.debugLog) {
                        this.debugLog(`Remote ${localFile.filename} is newer by ${diff} => download`);
                    }
                    download.push(remoteLeft[remoteFileIdx]);
                } else if (this.debugLog) {
                    this.debugLog(`${localFile.filename} are the same`);
                }
                remoteLeft.splice(remoteFileIdx, 1);
            }
        }
        if (this.debugLog) {
            for (const file of remoteLeft) {
                this.debugLog(`No local ${file.filename} => download`);
            }
        }
        download.push(...remoteLeft);
        return { upload, download };
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
        if (this.debugLog) {
            this.debugLog(`Disabling SFTP and SHELL`);
        }
        if (this.remoteSftp) {
            this.remoteSftp.enabled = false;
        }
        if (this.remoteShell) {
            this.remoteShell.enabled = false;
        }
    }

    public async syncronizeProject(config: IConfig) {
        if (this.inProgress) {
            ToOutputChannel(`Synchronization is in progress`);
            return false;
        }
        if (!workspace.workspaceFolders ||
            workspace.workspaceFolders.length < 1) {
            ToOutputChannel(`There is no workspace to synchronize`);
            return false;
        }
        this.inProgress = true;
        let retCode = await this.prepare(config);
        if (retCode &&
            this.localSource &&
            this.remoteSource &&
            this.include &&
            this.exclude) {
            // clear password cache
            ConnectConfigResolverImpl.clearCache();
            // get lists
            this.enableRemote();
            const [remoteList,
                   localList] = await Promise.all([this.remoteSource.findFiles(this.include, this.exclude),
                                                   this.localSource.findFiles(this.include, this.exclude)]);
            // compare them
            const compareResult = this.compareLists(localList, remoteList);
            const waitAll = [];
            // upload
            for (const uploadFile of compareResult.upload) {
                waitAll.push(
                    this.transferFile(this.localSource, this.remoteSource, uploadFile.filename, uploadFile.date)
                        .then((ok) => {
                            ToOutputChannel(`${uploadFile.filename} is ${ok ? "uploaded" : "failed to upload"}`);
                            return ok;
                        }).catch(() => false));
            }
            // download
            if (this.downloadNewFiles === "overwrite") {
                for (const downloadFile of compareResult.download) {
                    waitAll.push(
                        this.transferFile(this.remoteSource, this.localSource, downloadFile.filename, downloadFile.date)
                            .then((ok) => {
                                ToOutputChannel(`${downloadFile.filename} is ${ok ? "downloaded" : "failed to download"}`);
                                return ok;
                            }).catch(() => false));
                }
            } else if (this.downloadNewFiles === "edit") {
                // TODO: pipe to FakeStreams and create edits
            }
            // wait all operations are done
            const results = await Promise.all(waitAll);
            // end
            if (WorkspaceSection.is(this.workspaceSection) &&
                this.workspaceSection.keepAlive) {
                // test configuration watcher and create if need
                if (!this.onDidLoadDisposable) {
                    this.onDidLoadDisposable = config.onDidLoad(() => this.prepare(config));
                }
            } else {
                this.dispose();
            }
            retCode = results.reduce((acc, result) => {
                acc = acc && result;
                return acc;
            }, true);
            if (this.debugLog) {
                this.debugLog(`Synchronize retCode: ${retCode}`);
            }
        } else {
            ToOutputChannel(`In first please edit settings`);
        }
        this.inProgress = false;
        return retCode;
    }

    public dispose() {
        if (this.debugLog) {
            this.debugLog(`Disposing sources`);
        }
        if (this.remoteSftp) {
            this.remoteSftp.dispose();
        }
        if (this.remoteShell) {
            this.remoteShell.dispose();
        }
        this.remoteSource = undefined;
        this.localSource = undefined;
    }

    /**
     * Check whether the saved variables are suitable for the current configuration.
     * If not - dispose them and create another ones.
     * Note: no real connections are creating in constructors
     * @param config config
     */
    private async prepare(config: IConfig) {
        // get current config
        await EnsureSettings(config);
        const [connectionSection,
               projectSection,
               workspaceSection] = await Promise.all(
                   [config.get(ConnectionSection.section),
                    config.get(ProjectSection.section),
                    config.get(WorkspaceSection.section)]);
        // get current values
        const connectionSectionData = connectionSection ? connectionSection.store() : undefined;
        const projectSectionData = projectSection ? projectSection.store() : undefined;
        const workspaceSectionData = workspaceSection ? workspaceSection.store() : undefined;
        // test if different connection configuraion
        let recreateRemote = !isSimplyEq(this.connectionSection, connectionSectionData);
        // test if the user won't keep them alive
        if (WorkspaceSection.is(workspaceSectionData)) {
            if (!workspaceSectionData.keepAlive) {
                recreateRemote = true;
                // test configuration watchers and delete if exist
                if (this.onDidLoadDisposable) {
                    this.onDidLoadDisposable.dispose();
                }
            }
        }
        if (recreateRemote) {
            this.dispose();
        }
        // store current values
        this.connectionSection = connectionSectionData;
        this.projectSection = projectSectionData;
        this.workspaceSection = workspaceSectionData;
        // check if all are ready to create variables
        if (ConnectionSection.is(this.connectionSection) &&
            ProjectSection.is(this.projectSection) &&
            WorkspaceSection.is(this.workspaceSection) &&
            workspace.workspaceFolders &&
            workspace.workspaceFolders.length > 0) {
            // reparse includes
            const includes = [
                this.projectSection.source,
                this.projectSection.resource,
                this.projectSection.headers,
            ];
            this.include = includes.join(",");
            this.downloadNewFiles = this.workspaceSection.downloadNewFiles;
            this.exclude = this.projectSection.exclude;
            if (!this.resolver) {
                if (this.debugLog) {
                    this.debugLog(`Create password filler`);
                }
                const fillers = [new PasswordVscodeFiller()];
                this.resolver = new ConnectConfigResolverImpl(fillers, this.workspaceSection.feedbackTimeout, this.debugLog);
            } else {
                if (this.debugLog) {
                    this.debugLog(`Update password filler`);
                }
                this.resolver.timeout = this.workspaceSection.feedbackTimeout;
            }
            if (!this.welcome) {
                if (this.debugLog) {
                    this.debugLog(`Create welcome parser`);
                }
                this.welcome = new ParseWelcomeVms(this.workspaceSection.welcomeTimeout, this.debugLog);
            } else {
                if (this.debugLog) {
                    this.debugLog(`Update welcome parser`);
                }
                this.welcome.timeout = this.workspaceSection.welcomeTimeout;
            }
            if (!this.prompter) {
                if (this.debugLog) {
                    this.debugLog(`Create VMS prompt catcher`);
                }
                this.prompter = new PromptCatcherVms("", this.debugLog);
            }
            if (!this.remoteSource) {
                if (this.debugLog) {
                    this.debugLog(`Create remote source`);
                }
                this.remoteSftp = new SftpClient(this.connectionSection, this.resolver, this.debugLog);
                this.remoteShell = new SshShell(this.connectionSection, this.resolver, this.welcome, this.prompter, this.debugLog);
                this.remoteSource = new VmsSource(this.remoteSftp, this.remoteShell, this.projectSection.root, this.debugLog, this.workspaceSection.setTimeAttempts);
            } else {
                if (this.debugLog) {
                    this.debugLog(`Update remote source`);
                }
                this.remoteSource.root = this.projectSection.root;
                this.remoteSource.attempts = this.workspaceSection.setTimeAttempts;
            }
            if (!this.localSource) {
                if (this.debugLog) {
                    this.debugLog(`Create local source`);
                }
                this.localSource = new FsSource(workspace.workspaceFolders[0].uri.fsPath, this.debugLog);
            } else {
                if (this.debugLog) {
                    this.debugLog(`Update local source`);
                }
                this.localSource.root = workspace.workspaceFolders[0].uri.fsPath;
            }
            return true;
        }
        return false;
    }

    private async transferFile(from: ISource, to: ISource, file: string, date: Date) {
        const dirEnd = file.lastIndexOf(ftpPathSeparator);
        if (dirEnd !== -1) {
            const dir = file.slice(0, dirEnd);
            await to.ensureDirectory(dir);
        }
        return PipeFile(from, to, file, file, this.debugLog)
            .then(async (ok) => {
                if (ok) {
                    // TODO: test anyhow that file is completely written before setting date
                    await Delay(500);
                    return to.setDate(file, date);
                }
                return false;
            }).catch(() => {
                return false;
            });
    }
}
