import * as path from "path";
import { Disposable, FileSystemWatcher, Uri, workspace } from "vscode";

import { Debouncer, LogType } from "@vorfol/common";

import { ConfigHelper, IConfig, IConfigEditor, IConfigStorage } from "./config";
import { ConfigPool } from "./config-pool";
import { DummyEditor } from "./dummy-editor";
import { DummyStorage } from "./dummy-storage";
import { FSConfigStorage } from "./fs-storage";
import { UriEditor } from "./uri-editor";

// import * as nls from "vscode-nls";
// const localize = nls.loadMessageBundle();

/**
 * ConfigHelper implementation
 */
export class FSConfigHelper implements ConfigHelper {

    public static getConfigHelper(section: string, debugLog?: LogType): FSConfigHelper {
        if (FSConfigHelper.instances.get(section) === undefined) {
            const relativeFileName = path.join(FSConfigHelper.folder, section + FSConfigHelper.suffix);
            FSConfigHelper.instances.set(section, new FSConfigHelper(relativeFileName, debugLog));
        }
        const retInstance = FSConfigHelper.instances.get(section)!;
        return retInstance;
    }

    private static readonly folder = ".vscode";
    private static readonly suffix = "-settings.json";
    private static instances: Map<string, FSConfigHelper> = new Map<string, FSConfigHelper>();

    protected config: ConfigPool;
    protected storage: IConfigStorage;
    protected editor: IConfigEditor;
    protected disposables: Disposable[] = [];
    /**
     * Uri to store configuration to
     */
    protected fileUri: Uri = Uri.parse("undefined:");
    /**
     * Wait for a second before do some real action
     */
    protected debouncer = new Debouncer(1000);
    protected watcher: FileSystemWatcher | undefined = undefined;

    protected constructor(protected relativeFileName: string, public debugLog?: LogType) {
        this.storage = new DummyStorage();
        this.config = new ConfigPool(this.storage, debugLog);
        this.editor = new DummyEditor();
        this.disposables.push( workspace.onDidChangeWorkspaceFolders(() => {
            if (this.debugLog) { this.debugLog("onDidChangeWorkspaceFolders"); }
            this.updateConfigStorage();
        }));
        this.updateConfigStorage();
    }

    public dispose() {
        for (const disp of this.disposables) {
            disp.dispose();
        }
        this.disposables = [];
        // dispose watcher, does it dispose all events inside?
        if (this.watcher) {
            this.watcher.dispose();
        }
        this.watcher = undefined;
    }

    public getConfig(): IConfig {
        return this.config;
    }

    public getEditor(): IConfigEditor {
        return this.editor;
    }

    /**
     * Test workspace folders and create appropriate _storage
     */
    protected updateConfigStorage() {
        if (this.debugLog) { this.debugLog("updateConfigStorage start: ", this.storage); }
        if (this.storage instanceof DummyStorage) {
            if (workspace.workspaceFolders) {
                // allocate storage in first workspace
                this.createFS_Storage(workspace.workspaceFolders[0].uri);
                this.editor = new UriEditor(this.fileUri, this.config, this.debugLog);
                this.config.setStorage(this.storage);
            }
        } else if (this.storage instanceof FSConfigStorage) {
            if (!workspace.getWorkspaceFolder(this.fileUri)) {
                // current workspace is deleted - allocate another one
                if (this.watcher) {
                    this.watcher.dispose();
                }
                this.watcher = undefined;
                this.storage = new DummyStorage();
                this.updateConfigStorage();
            }
        }
        if (this.debugLog) { this.debugLog("updateConfigStorage end: ", this.storage); }
    }

    /**
     * Doesn't real allocate storage file, just prepare to and watch after the changes
     */
    protected createFS_Storage(rootUri: Uri): void {
        if (this.debugLog) { this.debugLog("createFS_Storage"); }
        this.fileUri = Uri.file(path.join(rootUri.fsPath, this.relativeFileName));

        this.storage = this.createConcreteFS_Storage(this.fileUri);

        this.watcher = workspace.createFileSystemWatcher(this.fileUri.fsPath);
        this.watcher.onDidCreate(async (uri) => {
            this.config.freeze();
            if (this.debugLog) { this.debugLog("onDidCreate: " + uri); }
            this.debouncer.debounce().then(async () => {
                if (this.debugLog) { this.debugLog("load on create"); }
                await this.config.load();
                this.config.unfreeze();
            });
        });
        this.watcher.onDidChange(async (uri) => {
            this.config.freeze();
            if (this.debugLog) { this.debugLog("onDidChange: " + uri); }
            this.debouncer.debounce().then(async () => {
                if (this.debugLog) { this.debugLog("load on change"); }
                await this.config.load();
                this.config.unfreeze();
            });
        });
    }

    protected createConcreteFS_Storage(uri: Uri) {
        // TODO: test URI and return appropriate FS
        return new FSConfigStorage(uri.fsPath, this.debugLog);
    }

}
