import { ConfigHelper, ConfigStorage, ConfigEditor, Config } from "./config_v2";
import { ConfigPool } from "./config-pool";
import { Disposable } from "vscode";
import { VSC_ConfigStorage } from "./vsc-storage";
import { workspace } from "vscode";
import { Debouncer } from "../common/debounce";
import { VSC_WorkspaceConfigEditor } from "./vsc-editor";

export let _log_this_file = console.log;
//_log_this_file = function() {};

/**
 * 
 * ConfigHelper implementation
 * 
 * 
 */
export class VSC_Config_Helper implements ConfigHelper {

    dispose() {
        for(let disp of this._dispose) {
            disp.dispose();
        }
        this._dispose = [];
    }

    protected _config : ConfigPool;
    protected _storage : ConfigStorage;
    protected _editor : ConfigEditor;

    protected readonly _section = 'open-vms';

    protected _dispose : Disposable[] = [];

    /**
     * Wait for a second before do some real action
     */
    protected _debouncer = new Debouncer(1000);

    protected constructor() {
        this._storage = new VSC_ConfigStorage(this._section);
        this._config = new ConfigPool(this._storage);
        this._editor = new VSC_WorkspaceConfigEditor();
        this._dispose.push( workspace.onDidChangeConfiguration((e) => {
            if (e.affectsConfiguration(this._section)) {
                _log_this_file('onDidChangeConfiguration');
                this._debouncer.debounce().then(() => {
                    this._config.load();
                });
            }
        }));
    }

    private static _instance : VSC_Config_Helper | undefined = undefined;
    static getConfigHelper() : VSC_Config_Helper {
        if (VSC_Config_Helper._instance === undefined) {
            VSC_Config_Helper._instance = new VSC_Config_Helper();
        }
        return VSC_Config_Helper._instance;
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
}
