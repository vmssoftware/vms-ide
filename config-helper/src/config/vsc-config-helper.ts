import { ConfigHelper, ConfigStorage, ConfigEditor, Config } from "./config";
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

    protected _dispose : Disposable[] = [];

    /**
     * Wait for three seconds before do some real action
     */
    protected _debouncer = new Debouncer(3000);

    protected constructor(protected _section: string) {
        this._storage = new VSC_ConfigStorage(this._section);
        this._config = new ConfigPool(this._storage);
        this._editor = new VSC_WorkspaceConfigEditor(this._config);
        this._dispose.push( workspace.onDidChangeConfiguration((e) => {
            if (e.affectsConfiguration(this._section)) {
                this._config.freeze();
                _log_this_file('onDidChangeConfiguration');
                this._debouncer.debounce().then(async () => {
                    await this._config.load();
                    this._config.unfreeze();
                });
            }
        }));
    }

    private static _instances : { [key:string] : VSC_Config_Helper} = {};
    static getConfigHelper(section: string) : VSC_Config_Helper {
        if (VSC_Config_Helper._instances[section] === undefined) {
            VSC_Config_Helper._instances[section] = new VSC_Config_Helper(section);
        }
        return VSC_Config_Helper._instances[section];
    }
    
    getConfig(): Config {
        return this._config;
    }

    getEditor(): ConfigEditor {
        return this._editor;
    }
}
