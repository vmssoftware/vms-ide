import * as path from "path";
import * as util from "util";
import { Disposable, FileSystemWatcher, Uri, workspace, WorkspaceFolder } from "vscode";

import { Debouncer, LogFunction, LogType } from "../../common/main";

import { IConfig, IConfigEditor, IConfigHelper, IConfigStorage } from "./config";
import { ConfigPool } from "./config-pool";
import { DummyEditor } from "./dummy-editor";
import { DummyStorage } from "./dummy-storage";
import { FSConfigStorage } from "./fs-storage";
import { UriEditor } from "./uri-editor";

// import * as nls from "vscode-nls";
// nls.config({messageFormat: nls.MessageFormat.both});
// const localize = nls.loadMessageBundle();

/**
 * ConfigHelper implementation
 */
export class FSConfigHelper implements IConfigHelper {

    protected static readonly folder = ".vscode";
    protected static readonly suffix = "-settings.json";

    protected logFn: LogFunction;

    protected config: ConfigPool;
    protected storage: IConfigStorage;
    protected relativeFileName: string;
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

    constructor(public workspaceFolder: WorkspaceFolder, extension: string, logFn?: LogFunction) {
        // tslint:disable-next-line:no-empty
        this.logFn = logFn || (() => {});
        this.relativeFileName = path.join(FSConfigHelper.folder, extension + FSConfigHelper.suffix);
        this.storage = new DummyStorage();
        this.config = new ConfigPool(this.storage, logFn);
        this.editor = new DummyEditor();
        this.disposables.push( workspace.onDidChangeWorkspaceFolders(() => {
            this.logFn(LogType.debug, () => "onDidChangeWorkspaceFolders");
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
        this.logFn(LogType.debug, () => "updateConfigStorage start: " + util.inspect(this.storage));
        if (this.storage instanceof DummyStorage) {
            if (workspace.workspaceFolders) {
                // allocate storage in first workspace
                this.createFS_Storage(this.workspaceFolder.uri);
                this.editor = new UriEditor(this.fileUri, this.config, this.logFn);
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
        this.logFn(LogType.debug, () => "updateConfigStorage end: " + util.inspect(this.storage));
    }

    /**
     * Doesn't real allocate storage file, just prepare to and watch after the changes
     */
    protected createFS_Storage(rootUri: Uri): void {
        this.logFn(LogType.debug, () => "createFS_Storage");
        this.fileUri = Uri.file(path.join(rootUri.fsPath, this.relativeFileName));

        this.storage = this.createConcreteFS_Storage(this.fileUri);

        this.watcher = workspace.createFileSystemWatcher(this.fileUri.fsPath);
        this.watcher.onDidCreate(async (uri) => {
            this.config.freeze();
            this.logFn(LogType.debug, () => "onDidCreate: " + uri.toString());
            this.debouncer.debounce().then(async () => {
                this.logFn(LogType.debug, () => "load on create");
                await this.config.load().then(result => this.config.lastResult |= result);
                this.config.unfreeze();
            });
        });
        this.watcher.onDidChange(async (uri) => {
            this.config.freeze();
            this.logFn(LogType.debug, () => "onDidChange: " + uri.toString());
            this.debouncer.debounce().then(async () => {
                this.logFn(LogType.debug, () => "load on change");
                await this.config.load().then(result => this.config.lastResult |= result);
                this.config.unfreeze();
            });
        });
    }

    protected createConcreteFS_Storage(uri: Uri): IConfigStorage {
        // TODO: test URI and return appropriate FS
        return new FSConfigStorage(uri.fsPath, this.logFn);
    }

}
