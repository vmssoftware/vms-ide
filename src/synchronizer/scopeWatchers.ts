import * as nls from "vscode-nls";
import micromatch from "micromatch";
import path from 'path';
import fs from 'fs';
import { Disposable, workspace, WorkspaceFolder, RelativePattern, commands } from "vscode";
import { EventEmitter } from "events";

import { GetSshHelperType } from "../ext-api/ext-api";
import { SshHelper } from "../ssh-helper/ssh-helper";
import { ensureSettings } from "./ensure-settings";
import { LogFunction, LogType } from "../common/main";
import { expandMask } from "./common/find-files";
import { ProjectState } from "./dep-tree/proj-state";

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

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
            basename: false,
            dot: true,
            nocase: true,
            nodupes: true,
            unixify: false,
        };
        let {expandedMask: source , missed_curly_bracket: errSrc} = expandMask(ensured.projectSection.source);
        let {expandedMask: headers , missed_curly_bracket: errHdr} = expandMask(ensured.projectSection.headers);
        let {expandedMask: builders , missed_curly_bracket: errBld} = expandMask(ensured.projectSection.builders);
        let {expandedMask: resource , missed_curly_bracket: errRsc} = expandMask(ensured.projectSection.resource);
        if (errBld || errHdr || errRsc || errSrc) {
            logFn(LogType.warning, () => localize("check.inc.mask", "Check include file masks for correct curly brackets."), true);
        }
        if (ensured.projectSection.exclude) {
            let {expandedMask: exclude , missed_curly_bracket: errExc} = expandMask(ensured.projectSection.exclude);
            if (errExc) {
                logFn(LogType.warning, () => localize("check.exc.mask", "Check exclude file masks for correct curly brackets."), true);
            }
            options.ignore = exclude;
        }
        const getFileType = (relativeFilePath: string) => {
            if (!path.extname(relativeFilePath)) {
                relativeFilePath += ".";
            }
            if (micromatch([relativeFilePath], source, options).length > 0) return EFileType.source;
            if (micromatch([relativeFilePath], headers, options).length > 0) return EFileType.header;
            if (micromatch([relativeFilePath], builders, options).length > 0) return EFileType.builder;
            if (micromatch([relativeFilePath], resource, options).length > 0) return EFileType.resource;
            return EFileType.unknown;
        }
        const relativePattern = new RelativePattern(folder, "**/*");
        const fsWatcher = workspace.createFileSystemWatcher(relativePattern, false, false, false);
        const rootLength = folder.uri.fsPath.length + 1;
        fsWatcher.onDidCreate((uri) => {
            if (fs.statSync(uri.fsPath).isFile()) {
                const fileType = getFileType(uri.fsPath.slice(rootLength));
                if (fileType !== EFileType.unknown) {
                    ProjectFilesWatchEmitter.emitCreated(folder.name, uri.fsPath.slice(rootLength), fileType);
                }
            }
        });
        fsWatcher.onDidDelete((uri) => {
            const fileType = getFileType(uri.fsPath.slice(rootLength));
            if (fileType !== EFileType.unknown) {
                ProjectFilesWatchEmitter.emitDeleted(folder.name, uri.fsPath.slice(rootLength), fileType);
            }
        });
        fsWatcher.onDidChange((uri) => {
            if (fs.statSync(uri.fsPath).isFile()) {
                const fileType = getFileType(uri.fsPath.slice(rootLength));
                if (fileType !== EFileType.unknown) {
                    ProjectFilesWatchEmitter.emitChanged(folder.name, uri.fsPath.slice(rootLength), fileType);
                }
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
