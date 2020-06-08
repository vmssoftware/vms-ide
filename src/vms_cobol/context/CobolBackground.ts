import vscode, { EventEmitter, workspace, WorkspaceFolder} from 'vscode';
import path from 'path';
import { TaskDivider } from '../../common/task-divider';
import { ensureSettings } from '../../synchronizer/ensure-settings';
import { ProjectFilesWatchEmitter, EFileType } from '../../synchronizer/scopeWatchers';
import { Synchronizer } from '../../synchronizer/sync/synchronizer';
import { LogFunction } from '../../common/main';
import { CobolSourceContext } from './CobolSourceContext';
import { GetCopyManager } from '../stream/CopyManagers';
import { readWholeStream } from '../../common/read_all_stream';
import { CobolGlobals } from './CobolGlobals';
import { ProjDepTree } from '../../synchronizer/dep-tree/proj-dep-tree';
import { projectDependenciesChanged } from '../../synchronizer/projectDepend';

export class CobolBackground {

    public static refreshed = new EventEmitter();

    public static cancellationToken = new TaskDivider(0);

    public static async StartBackgroundParsing(logFn: LogFunction) {

        let projectDependenciesChangedEvent = projectDependenciesChanged();
        if (projectDependenciesChangedEvent) {
            projectDependenciesChangedEvent(() => {
                CobolGlobals.removeGlobals();
                this.Refresh(logFn);
            });
        }

        let processFile = (scope: string, filePath: string, fileType: EFileType) => {
            if (fileType === EFileType.header) {
                let copyManager = GetCopyManager(scope);
                if (copyManager) {
                    copyManager.clear(path.join(copyManager.getRoot(), filePath));
                }
            }
            if (fileType === EFileType.header || fileType === EFileType.source) {
                if (fileType === EFileType.source) {
                    CobolGlobals.removeGlobals(filePath);
                } else {
                    CobolGlobals.removeGlobals();
                }
                this.Refresh(logFn);
            }
        }

        // register watcher
        ProjectFilesWatchEmitter.on('changed', processFile);
        ProjectFilesWatchEmitter.on('created', processFile);
        ProjectFilesWatchEmitter.on('deleted', processFile);

        // do initial refresh
        return this.Refresh(logFn);
    }

    private static async Refresh(logFn: LogFunction) {
        let wsFolders = vscode.workspace.workspaceFolders;
        if (wsFolders && wsFolders.length > 0) {
            // if new Refresh was executed, drop current task
            let myTask = ++this.cancellationToken.asyncValue;
            let sortedWsFolders: WorkspaceFolder[] = [];
            for(let wsFolder of wsFolders) {
                let dependants = new ProjDepTree().getDepList(wsFolder.name);
                let pos = sortedWsFolders.length;
                for (let i = 0; i < sortedWsFolders.length; ++i) {
                    if (dependants.includes(sortedWsFolders[i].name)) {
                        pos = i;
                        break;
                    }
                }
                sortedWsFolders.splice(pos, 0, wsFolder);
            }
            sortedWsFolders = sortedWsFolders.reverse();
            for(let wsFolder of sortedWsFolders) {
                let ensured = await ensureSettings(wsFolder.name);
                if (myTask != this.cancellationToken.asyncValue) {
                    return;
                }
                if (ensured) {
                    let localSource = await Synchronizer.acquire(logFn).requestSource(ensured, "local");
                    if (myTask != this.cancellationToken.asyncValue) {
                        return;
                    }
                    if (localSource) {
                        let localFiles = await localSource.findFiles(ensured.projectSection.source, ensured.projectSection.exclude);
                        if (myTask != this.cancellationToken.asyncValue) {
                            return;
                        }
                        if (localFiles) {
                            for (let localFile of localFiles) {
                                let fullPath = path.join(wsFolder.uri.fsPath, localFile.filename);
                                if (!CobolGlobals.getGlobals(fullPath)) {
                                    // get latest document text
                                    let docContent: string | undefined;
                                    for (let doc of workspace.textDocuments) {
                                        if (doc.fileName === fullPath) {
                                            docContent = doc.getText();
                                            break;
                                        }
                                    }
                                    if (docContent === undefined) {
                                        let stream = await localSource.createReadStream(localFile.filename);
                                        if (myTask != this.cancellationToken.asyncValue) {
                                            return;
                                        }
                                        if (stream) {
                                            docContent = await readWholeStream(stream);
                                            if (myTask != this.cancellationToken.asyncValue) {
                                                return;
                                            }
                                        }
                                    }
                                    // parse and save
                                    if (docContent !== undefined) {
                                        let context = new CobolSourceContext(fullPath, logFn, GetCopyManager(wsFolder.name, wsFolder.uri.fsPath), this.cancellationToken);
                                        context.setText(docContent);
                                        await context.parse();
                                        if (myTask != this.cancellationToken.asyncValue) {
                                            return;
                                        }
                                        await CobolGlobals.addGlobals(context);
                                        if (myTask != this.cancellationToken.asyncValue) {
                                            return;
                                        }
                                    }
                                }
                            }
                            if (myTask != await this.cancellationToken.testValue()) {
                                return;
                            }
                        }
                    }
                }
            }
            this.refreshed.fire();
        }
    }
}