import { workspace } from "vscode";

import { ftpPathSeparator } from "../common/find-files";
import { LogType } from "../common/log-type";
import { ConnectConfigResolverImpl } from "../config-resolve/connect-config-resolver-impl";
import { PasswordVscodeFiller } from "../config-resolve/password-vscode-filler";
import { IConfig, IConfigSection } from "../config/config";
import { ConnectionSection } from "../config/sections/connection";
import { ProjectSection } from "../config/sections/project";
import { DownloadAction, WorkspaceSection } from "../config/sections/workspace";
import { EnsureSettings } from "../ensure-settings";
import { ToOutputChannel } from "../output-channel";
import { ParseWelcomeVms } from "../stream/parse-welcome-vms";
import { PipeFile } from "../stream/pipe";
import { PromptCatcherVms } from "../stream/prompt-catcher-vms";
import { IFileEntry } from "../stream/read-directory";
import { SftpClient } from "../stream/sftp-client";
import { SshShell } from "../stream/ssh-shell";
import { FsSource } from "./fs-source";
import { ISource } from "./source";
import { VmsSource } from "./vms-source";

interface IDispose { dispose: () => void; }

export class Synchronizer {

    public get isInProgress(): boolean {
        return this.inProgress;
    }

    private inProgress = false;
    private remoteSource?: ISource;
    private localSource?: ISource;
    private include?: string;   // parsed
    private exclude?: string;
    private disposables: IDispose[] = [];
    private connectionSection?: IConfigSection;
    private projectSection?: IConfigSection;
    private workspaceSection?: IConfigSection;
    private downloadNewFiles: DownloadAction = "edit";

    constructor(public debugLog?: LogType) {
    }

    public CompareLists(localList: IFileEntry[], remoteList: IFileEntry[]) {
        const upload: IFileEntry[] = [];    // from local to remote
        const download: IFileEntry[] = [];  // from remote to local
        const remoteLeft = remoteList.slice(0);
        for (const localFile of localList) {
            const remoteFileIdx = remoteLeft.findIndex((tstRemoteFile) => {
                return tstRemoteFile.filename.toUpperCase() === localFile.filename.toLocaleUpperCase();
            });
            if (remoteFileIdx === -1) {
                upload.push(localFile);
            } else {
                const diff = (remoteLeft[remoteFileIdx].date.valueOf() - localFile.date.valueOf()) / 1000;
                if (diff < -1) {
                    upload.push(localFile);
                } else if (diff > 1) {
                    download.push(localFile);
                }
                remoteLeft.splice(remoteFileIdx, 1);
            }
        }
        download.push(...remoteLeft);
        return { upload, download };
    }

    public async SyncronizeProject(config: IConfig) {
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
        let retCode = await this.Prepare(config);
        if (retCode &&
            this.localSource &&
            this.remoteSource &&
            this.include &&
            this.exclude) {
            const [remoteList,
                   localList] = await Promise.all([this.remoteSource.findFiles(this.include, this.exclude),
                                                   this.localSource.findFiles(this.include, this.exclude)]);
            const compareResult = this.CompareLists(localList, remoteList);
            const waitAll = [];
            for (const uploadFile of compareResult.upload) {
                waitAll.push(
                    this.TransferFile(this.localSource, this.remoteSource, uploadFile.filename, uploadFile.date)
                        .then((ok) => {
                            ToOutputChannel(`${uploadFile.filename} if ${ok ? "uploaded" : "failed to upload"}`);
                            return ok;
                        }).catch(() => false));
            }
            if (this.downloadNewFiles === "overwrite") {
                for (const downloadFile of compareResult.download) {
                    waitAll.push(
                        this.TransferFile(this.remoteSource, this.localSource, downloadFile.filename, downloadFile.date)
                            .then((ok) => {
                                ToOutputChannel(`${downloadFile.filename} if ${ok ? "downloaded" : "failed to download"}`);
                                return ok;
                            }).catch(() => false));
                }
            } else if (this.downloadNewFiles === "edit") {
                // TODO: pipe to FakeStreams and create edits
            }
            await Promise.all(waitAll);
            this.dispose();
            retCode = true;
        } else {
            ToOutputChannel(`In first please edit settings`);
        }
        this.inProgress = false;
        return retCode;
    }

    public dispose() {
        for (const disposable of this.disposables) {
            disposable.dispose();
        }
        this.disposables = [];
    }

    private async Prepare(config: IConfig) {
        await EnsureSettings(config);
        const [connectionSection,
               projectSection,
               workspaceSection] = await Promise.all(
                   [config.get(ConnectionSection.section),
                    config.get(ProjectSection.section),
                    config.get(WorkspaceSection.section)]);
        this.connectionSection = connectionSection;
        this.projectSection = projectSection;
        this.workspaceSection = workspaceSection;
        ConnectConfigResolverImpl.clearCache();
        if (ConnectionSection.is(this.connectionSection) &&
            ProjectSection.is(this.projectSection) &&
            WorkspaceSection.is(this.workspaceSection) &&
            workspace.workspaceFolders &&
            workspace.workspaceFolders.length > 0) {
            const includes = [
                this.projectSection.source,
                this.projectSection.resource,
                this.projectSection.headers,
            ];
            this.include = includes.join(",");
            this.downloadNewFiles = this.workspaceSection.downloadNewFiles;
            this.exclude = this.projectSection.exclude;
            const fillers = [new PasswordVscodeFiller()];
            const resolver = new ConnectConfigResolverImpl(fillers, this.workspaceSection.feedbackTimeout, this.debugLog);
            const remoteSftp = new SftpClient(this.connectionSection, resolver, this.debugLog);
            this.disposables.push(remoteSftp);
            const remoteWelcome = new ParseWelcomeVms(this.workspaceSection.welcomeTimeout, this.debugLog);
            const remotePrompter = new PromptCatcherVms("", this.debugLog);
            const remoteShell = new SshShell(this.connectionSection, resolver, remoteWelcome, remotePrompter, this.debugLog);
            this.disposables.push(remoteShell);
            this.remoteSource = new VmsSource(remoteSftp, remoteShell, this.projectSection.root, this.debugLog);
            this.localSource = new FsSource(workspace.workspaceFolders[0].uri.fsPath, this.debugLog);
            return true;
        }
        return false;
    }

    private async TransferFile(from: ISource, to: ISource, file: string, date: Date) {
        const dirEnd = file.lastIndexOf(ftpPathSeparator);
        if (dirEnd !== -1) {
            const dir = file.slice(0, dirEnd);
            await to.ensureDirectory(dir);
        }
        return PipeFile(from, to, file, file, this.debugLog)
            .then((ok) => {
                if (ok) {
                    return to.setDate(file, date);
                }
                return false;
            });
    }
}
