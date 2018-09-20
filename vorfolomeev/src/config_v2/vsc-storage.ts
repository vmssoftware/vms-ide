
import { CSA_Result, ConfigStorage, ConfigData, ValueData } from "./config_v2";
import { workspace } from "vscode";
import { WorkspaceConfiguration } from "vscode";

export let _log_this_file = console.log;
//_log_this_file = function() {};

/**
  * 
  * 
  * 
  */
export class VSC_ConfigStorage implements ConfigStorage {

    constructor(protected _section: string) {

    }

    fillStart(): Thenable<CSA_Result> {
        _log_this_file('fillStart =');
        return Promise.resolve(CSA_Result.ok);
    }     

    protected setCfgValue<T extends ValueData>(value: T, cfg_key: string, configuration: WorkspaceConfiguration) : T {
        let tmp = configuration.get<T>(cfg_key);
        if (tmp) {
            value = tmp;
        }
        return value;
    }

    fillData(section: string, data: ConfigData): Thenable<CSA_Result> {
        let configuration = workspace.getConfiguration(this._section);
        for(let key in data) {
            data[key] = this.setCfgValue(data[key], `${section}.${key}`, configuration);
        }
        _log_this_file('fillData => ok ' + section);
        return Promise.resolve(CSA_Result.ok);
    }

    fillEnd(): Thenable<CSA_Result> {
        _log_this_file('fillEnd');
        return Promise.resolve(CSA_Result.ok);
    }

    storeStart(): Thenable<CSA_Result> {
        _log_this_file('storeStart');
        return Promise.resolve(CSA_Result.ok);
    }

    storeData(section: string, data: ConfigData): Thenable<CSA_Result> {
        return new Promise(async (resolve, reject) => {
            let ret_code = CSA_Result.ok;
            let configuration = workspace.getConfiguration(this._section);
            for(let key in data) {
                let cfg_key = `${section}.${key}`;
                try {
                    await configuration.update(cfg_key, data[key]);
                } catch(err) {
                    _log_this_file('update failed: ' + cfg_key);
                    if (err instanceof Error) {
                        _log_this_file(err.message);
                    }
                    ret_code |= CSA_Result.some_data_failed;
                };
            }
            _log_this_file('storeData ' + section);
            resolve(ret_code);
        });
    }

    protected _storePromise: Thenable<CSA_Result> | undefined;
    storeEnd(): Thenable<CSA_Result> {
        _log_this_file('storeEnd =');
        return Promise.resolve(CSA_Result.ok);
    }

    isStoring(): boolean {
        return false;
    }

}
