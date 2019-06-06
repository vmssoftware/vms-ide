import { LogFunction, ftpPathSeparator } from "../common/main";
import { ensureSettings, IEnsured } from "../synchronizer/ensure-settings";
import { workspace } from "vscode";
import * as path from 'path';
import { VmsPathConverter } from "../synchronizer/vms/vms-path-converter";
import { ProjectType } from "../synchronizer/config/sections/project";

export class ScopeHelpers {

    private _ensured: IEnsured | undefined;

    constructor(private logFn?: LogFunction) {
        this.logFn = logFn || (() => {});    
    }

    public async populate(scope?: string) {
        this._ensured = await ensureSettings(scope, this.logFn);
    }

    public localFile(remoteFile: string) {
        if (this._ensured && this._ensured.scope && workspace.workspaceFolders) {
            for (const ws of workspace.workspaceFolders) {
                if (ws.name === this._ensured.scope) {
                    return path.join(ws.uri.fsPath, remoteFile);
                }
            }
        }
        return remoteFile;
    }

    public cdRemoteRoot() {
        if (this._ensured && this._ensured.scope && workspace.workspaceFolders) {
            const vmsPath = new VmsPathConverter(this._ensured.projectSection.root + ftpPathSeparator);
            return `set def ${vmsPath.directory}`;
        }
        return "";
    }

    public stopOnEntryClass(className: string) {
        if (this._ensured) {
            if (this._ensured.projectSection.projectType === ProjectType[ProjectType.scala]) {
                return className + "$";
            }
        }
        return className;
    }
}