import { Disposable, workspace, WorkspaceFolder, RelativePattern, commands } from "vscode";
import { GetSshHelperType } from "../ext-api/ext-api";
import { SshHelper } from "../ssh-helper/ssh-helper";
import { ensureSettings } from "./ensure-settings";
import { LogFunction } from "../common/main";
import micromatch from "micromatch";
import { collectSplittedByCommas } from "./common/find-files";
import { ProjectState } from "./dep-tree/proj-state";
import { EventEmitter } from "events";

let watchers: Map<string, Disposable[]> = new Map<string, Disposable[]>();

export enum EFileType {
    source,
    header,
    builder,
    resource,
    unknown,
}

export class FileWatchEmitter extends EventEmitter {
    on(event: 'created', listener: (scope: string, filePath: string, fileType: EFileType) => void): this;
    on(event: 'deleted', listener: (scope: string, filePath: string, fileType: EFileType) => void): this;
    on(event: 'changed', listener: (scope: string, filePath: string, fileType: EFileType) => void): this;
    on(event: string, listener: (...args: any[]) => void): this {
        super.on(event, listener);
        return this;
    }
    emitCreated(scope: string, filePath: string, fileType: EFileType) {
        this.emit('created', scope, filePath, fileType);
    }
    emitDeleted(scope: string, filePath: string, fileType: EFileType) {
        this.emit('deleted', scope, filePath, fileType);
    }
    emitChanged(scope: string, filePath: string, fileType: EFileType) {
        this.emit('changed', scope, filePath, fileType);
    }
}

export const ProjectFilesWatchEmitter = new FileWatchEmitter();

export function disposeFsWatchers() {
    for (const [scope, scopeWatchers] of  watchers) {
        scopeWatchers.forEach(w => w.dispose());
    }
    watchers.clear();
}

export function createFsWatchers(logFn: LogFunction) {
    for (const [scope, scopeWatchers] of  watchers) {
        scopeWatchers.forEach(w => w.dispose());
    }
    watchers.clear();
    if (workspace.workspaceFolders) {
        const SshHelperType = GetSshHelperType();
        if (!SshHelperType) {
            return;
        }
        let sshHelper = new SshHelperType();
        for (const folder of workspace.workspaceFolders) {
            createScopeFsWatchers(folder, sshHelper, logFn);
        }
    }
}

async function createScopeFsWatchers(folder: WorkspaceFolder, sshHelper: SshHelper, logFn: LogFunction) {
    const scopeWatchers: Disposable[] = [];
    const ensured = await ensureSettings(folder.name, logFn);
    if (ensured) {
        // 1. Setup source file watcher 
        // prepare micromatch
        const options: micromatch.Options = {
            basename: true,
            nocase: true,
            nodupes: true,
            unixify: false,
        };
        const source = micromatch.braces(ensured.projectSection.source).map(mask => mask.replace(/[{}]/g, ""));   // after unbracing no breace allowed
        const headers = micromatch.braces(ensured.projectSection.headers).map(mask => mask.replace(/[{}]/g, ""));   // after unbracing no breace allowed
        const builders = micromatch.braces(ensured.projectSection.builders).map(mask => mask.replace(/[{}]/g, ""));   // after unbracing no breace allowed
        const resource = micromatch.braces(ensured.projectSection.resource).map(mask => mask.replace(/[{}]/g, ""));   // after unbracing no breace allowed
        const splittedSource = source.reduce(collectSplittedByCommas, []);
        const splittedHeaders = headers.reduce(collectSplittedByCommas, []);
        const splittedBuilders = builders.reduce(collectSplittedByCommas, []);
        const splittedResource = resource.reduce(collectSplittedByCommas, []);
        if (ensured.projectSection.exclude) {
            const unbraceExclude = micromatch.braces(ensured.projectSection.exclude).map(mask => mask.replace(/[{}]/g, ""));   // after unbracing no breace allowed
            const splitExclude = unbraceExclude.reduce(collectSplittedByCommas, []);
            options.ignore = splitExclude;
        }
        const getFileType = (relativeFilePath: string) => {
            if (micromatch([relativeFilePath], splittedSource, options).length > 0) return EFileType.source;
            if (micromatch([relativeFilePath], splittedHeaders, options).length > 0) return EFileType.header;
            if (micromatch([relativeFilePath], splittedBuilders, options).length > 0) return EFileType.builder;
            if (micromatch([relativeFilePath], splittedResource, options).length > 0) return EFileType.resource;
            return EFileType.unknown;
        }
        const relativePattern = new RelativePattern(folder, "**/*.*");
        const fsWatcher = workspace.createFileSystemWatcher(relativePattern, false, false, false);
        const rootLength = folder.uri.fsPath.length + 1;
        fsWatcher.onDidCreate((uri) => {
            const fileType = getFileType(uri.fsPath.slice(rootLength));
            if (fileType !== EFileType.unknown) {
                ProjectFilesWatchEmitter.emitCreated(folder.name, uri.fsPath.slice(rootLength), fileType);
            }
        });
        fsWatcher.onDidDelete((uri) => {
            const fileType = getFileType(uri.fsPath.slice(rootLength));
            if (fileType !== EFileType.unknown) {
                ProjectFilesWatchEmitter.emitDeleted(folder.name, uri.fsPath.slice(rootLength), fileType);
            }
        });
        fsWatcher.onDidChange((uri) => {
            const fileType = getFileType(uri.fsPath.slice(rootLength));
            if (fileType !== EFileType.unknown) {
                ProjectFilesWatchEmitter.emitChanged(folder.name, uri.fsPath.slice(rootLength), fileType);
            }
        });
        scopeWatchers.push(fsWatcher);

        // 2. Setup SSH settings watcher 
        if (sshHelper) {
            scopeWatchers.push(sshHelper.setConfigWatcher(folder.name, () => {
                commands.executeCommand("vmssoftware.project-dep.projectDescription.refresh");
                ProjectState.acquire().setSynchronized(folder.name, false);
            }));
        }

        // 3. Setup Project settings watcher 
        scopeWatchers.push(ensured.configHelper.getConfig().onDidLoad(() => {
            ProjectState.acquire().setSynchronized(folder.name, false);
            // recreate watchers for this folder
            createScopeFsWatchers(folder, sshHelper, logFn);
        }));
    }
    const prevWatchers = watchers.get(folder.name);
    if (prevWatchers) {
        prevWatchers.forEach(w => w.dispose());
    }
    watchers.set(folder.name, scopeWatchers);
}
