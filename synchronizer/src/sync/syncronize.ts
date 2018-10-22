import { workspace } from "vscode";

import { ftpPathSeparator } from "../common/find-files";
import { LogType } from "../common/log-type";
import { ConnectConfigResolverImpl } from "../config-resolve/connect-config-resolver-impl";
import { PasswordVscodeFiller } from "../config-resolve/password-vscode-filler";
import { IConfig } from "../config/config";
import { ConnectionSection } from "../config/sections/connection";
import { ProjectSection } from "../config/sections/project";
import { WorkspaceSection } from "../config/sections/workspace";
import { EnsureSettings } from "../ensure-settings";
import { ToOutputChannel } from "../output-channel";
import { ParseWelcomeVms } from "../stream/parse-welcome-vms";
import { PipeFile } from "../stream/pipe";
import { PromptCatcherVms } from "../stream/prompt-catcher-vms";
import { IFileEntry } from "../stream/read-directory";
import { SftpClient } from "../stream/sftp-client";
import { SshShell } from "../stream/ssh-shell";
import { FsSource } from "./fs-source";
import { SftpSource } from "./sftp-source";
import { VmsSource } from "./vms-source";

export class Synchronizer {

    public get isInProgress(): boolean {
        return this.inProgress;
    }

    public static CompareLists(localList: IFileEntry[], remoteList: IFileEntry[], debugLog?: LogType) {
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

    private inProgress = false;

    constructor(public debugLog?: LogType) {
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
        let retCode = false;
        await EnsureSettings(config);
        const [connectionSection,
               projectSection,
               workspaceSection] = await Promise.all(
                   [config.get(ConnectionSection.section),
                    config.get(ProjectSection.section),
                    config.get(WorkspaceSection.section)]);
        ConnectConfigResolverImpl.clearCache();
        if (ConnectionSection.is(connectionSection) &&
            ProjectSection.is(projectSection) &&
            WorkspaceSection.is(workspaceSection)) {
            const includes = [
                projectSection.source,
                projectSection.resource,
                projectSection.headers,
            ];
            const include = includes.join(",");
            const fillers = [new PasswordVscodeFiller()];
            const resolver = new ConnectConfigResolverImpl(fillers, workspaceSection.feedbackTimeout, this.debugLog);
            const remoteSftp = new SftpClient(connectionSection, resolver, this.debugLog);
            const remoteWelcome = new ParseWelcomeVms(workspaceSection.welcomeTimeout, this.debugLog);
            const remotePrompter = new PromptCatcherVms("", this.debugLog);
            const remoteShell = new SshShell(connectionSection, resolver, remoteWelcome, remotePrompter, this.debugLog);
            const remoteSource = new VmsSource(remoteSftp, remoteShell, projectSection.root, this.debugLog);
            const localSource = new FsSource(workspace.workspaceFolders[0].uri.fsPath, this.debugLog);
            const [remoteList,
                   localList] = await Promise.all([remoteSource.findFiles(include, projectSection.exclude),
                                                   localSource.findFiles(include, projectSection.exclude)]);
            const compareResult = Synchronizer.CompareLists(localList, remoteList, this.debugLog);
            const waitAll = [];
            for (const uploadFile of compareResult.upload) {
                waitAll.push(Promise.resolve().then(async () => {
                    const dirEnd = uploadFile.filename.lastIndexOf(ftpPathSeparator);
                    if (dirEnd !== -1) {
                        const dir = uploadFile.filename.slice(0, dirEnd);
                        await remoteSource.ensureDirectory(dir);
                    }
                    return PipeFile(localSource,
                                    remoteSource,
                                    uploadFile.filename,
                                    uploadFile.filename,
                                    this.debugLog)
                        .then((ok) => {
                            if (ok) {
                                ToOutputChannel(`${uploadFile.filename} is uploaded`);
                                return remoteSource.setDate(uploadFile.filename, uploadFile.date);
                            } else {
                                ToOutputChannel(`${uploadFile.filename} is failed to upload`);
                            }
                            return false;
                        });
                }));
            }
            if (workspaceSection.downloadNewer === "overwrite") {
                for (const downloadFile of compareResult.download) {
                    waitAll.push(Promise.resolve().then(async () => {
                        const dirEnd = downloadFile.filename.lastIndexOf(ftpPathSeparator);
                        if (dirEnd !== -1) {
                            const dir = downloadFile.filename.slice(0, dirEnd);
                            await localSource.ensureDirectory(dir);
                        }
                        return PipeFile(remoteSource,
                                        localSource,
                                        downloadFile.filename,
                                        downloadFile.filename,
                                        this.debugLog)
                            .then((ok) => {
                                if (ok) {
                                    ToOutputChannel(`${downloadFile.filename} is downloaded`);
                                    return localSource.setDate(downloadFile.filename, downloadFile.date);
                                } else {
                                    ToOutputChannel(`${downloadFile.filename} is failed to download`);
                                }
                                return false;
                            });
                    }));
                }
            } else if (workspaceSection.downloadNewer === "edit") {
                // TODO: pipe to FakeStreams and create edits
            }
            await Promise.all(waitAll);
            remoteSftp.dispose();
            remoteShell.dispose();
            retCode = true;
        } else {
            ToOutputChannel(`In first please edit settings`);
        }
        this.inProgress = false;
        return retCode;
    }

}
