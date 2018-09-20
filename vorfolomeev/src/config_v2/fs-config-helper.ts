import { workspace } from "vscode";
import { FS_ConfigStorage } from "./fs-storage";
import { Uri } from "vscode";
import { FileSystemWatcher } from "vscode";
import { Debouncer } from "../common/debounce";
import { ConfigEditor, ConfigStorage, Config, ConfigHelper } from "./config_v2";
import { ConfigPool } from "./config-pool";
import * as path from 'path';
import { DummyStorage, DummyEditor } from "./dummy";
import { Disposable } from "vscode";
import { UriEditor } from "./uri-editor";

export let _log_this_file = console.log;
//_log_this_file = function() {};

/**
 * 
 * ConfigHelper implementation
 * 
 * 
 */
export class FS_Config_Helper implements ConfigHelper {

    dispose() {
        for(let disp of this._dispose) {
            disp.dispose();
        }
        this._dispose = [];
        //dispose watcher, does it dispose all events inside?
        this._watcher && this._watcher.dispose();
        this._watcher = undefined;
    }

    protected _config : ConfigPool;
    protected _storage : ConfigStorage;
    protected _editor : ConfigEditor;

    protected readonly _relative_file_name = '.vscode/openvms-settings.json';

    protected _dispose : Disposable[] = [];

    protected constructor() {
        this._storage = new DummyStorage();
        this._config = new ConfigPool(this._storage);
        this._editor = new DummyEditor();
        this._dispose.push( workspace.onDidChangeWorkspaceFolders((e) => {
            _log_this_file('onDidChangeWorkspaceFolders');
            this.updateConfigStorage();
        }));
        this.updateConfigStorage();
    }

    private static _instance : FS_Config_Helper | undefined = undefined;
    static getConfigHelper() : FS_Config_Helper {
        if (FS_Config_Helper._instance === undefined) {
            FS_Config_Helper._instance = new FS_Config_Helper();
        }
        return FS_Config_Helper._instance;
    }
    
    getConfig(): Config {
        return this._config;
    }

    // getStorage(): ConfigStorage {
    //     return this._storage;
    // }

    getEditor(): ConfigEditor {
        return this._editor;
    }

    /**
     * Uri to store configuration to
     */
    protected _file_uri: Uri = Uri.parse('undefined:');

    /**
     * Test workspace folders and create appropriate _storage
     */
    protected updateConfigStorage() {
        _log_this_file('updateConfigStorage start: ', this._storage);
        if (this._storage instanceof DummyStorage) {
            if (workspace.workspaceFolders) {
                //allocate storage in first workspace
                this.createFS_Storage(workspace.workspaceFolders[0].uri);
                this._editor = new UriEditor(this._file_uri);
                if (this._config) {
                    this._config.setStorage(this._storage);
                }
            }
        } else if (this._storage instanceof FS_ConfigStorage) {
            if (!workspace.getWorkspaceFolder(this._file_uri)) {
                //current workspace is deleted - allocate another one
                this._watcher && this._watcher.dispose();
                this._watcher = undefined;
                this._storage = new DummyStorage();
                this.updateConfigStorage();
            }
        }
        _log_this_file('updateConfigStorage end: ', this._storage);
    }

    /**
     * Wait for a second before do some real action
     */
    protected _debouncer = new Debouncer(1000);

    protected _watcher: FileSystemWatcher | undefined = undefined;
    /**
     * Doesn't real allocate storage file, just prepare to and watch after the changes
     */
    protected createFS_Storage(rootUri: Uri) : void {
        _log_this_file('createFS_Storage');
        this._file_uri = Uri.file(path.join(rootUri.fsPath, this._relative_file_name));

        this._storage = this.createConcreteFS_Storage(this._file_uri);

        this._watcher = workspace.createFileSystemWatcher(this._file_uri.fsPath);
        this._watcher.onDidCreate(async (uri) => {
            _log_this_file('onDidCreate: ' + uri);
            this._debouncer.debounce().then(() => {
                _log_this_file('load on create');
                this._config.load();
            })
        });
        this._watcher.onDidChange(async (uri) => {
            _log_this_file('onDidChange: ' + uri);
            this._debouncer.debounce().then(() => {
                _log_this_file('load on change');
                this._config.load();
            })
        });
    }

    protected createConcreteFS_Storage(uri: Uri) {
        //TODO: test URI and return appropriate FS
        return new FS_ConfigStorage(uri.fsPath);
    }

}
