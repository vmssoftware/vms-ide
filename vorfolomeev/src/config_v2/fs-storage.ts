import * as fs from "fs";
import { CSA_Result, ConfigStorage, ConfigData } from "./config_v2";

export let _log_this_file = console.log;
//_log_this_file = function() {};

/**
  * 
  * 
  * 
  */
 export class FS_ConfigStorage implements ConfigStorage {

    constructor(protected _filename: string) {
    }

    protected _json_data: any = {};
    protected _fillStartPromise: Thenable<CSA_Result> | undefined;
    fillStart(): Thenable<CSA_Result> {
        _log_this_file('fillStart =');
        if (!this._fillStartPromise) {
            this._fillStartPromise = new Promise<CSA_Result>(async (resolve, reject) => {
                fs.readFile(this._filename, (err, data) => {
                    if (err) {
                        resolve(CSA_Result.prepare_failed);
                    } else {
                        let content = data.toString('utf8');
                        try {
                            this._json_data = JSON.parse(content);
                            resolve(CSA_Result.ok);
                            _log_this_file('fillStart => ok');
                        } catch (error) {
                            resolve(CSA_Result.prepare_failed);
                            _log_this_file('fillStart => fail');
                        }
                    }
                    this._fillStartPromise = undefined;
                    _log_this_file('fillStart => clear');
                });
            })
        } 
        return this._fillStartPromise;
    }     

    fillData(section: string, data: ConfigData): Thenable<CSA_Result> {
        if (this._json_data && this._json_data[section]) {
            let json_section = this._json_data[section];
            for(let key in data) {
                if (json_section[key] !== undefined) {
                    data[key] = json_section[key];
                }
            }
            _log_this_file('fillData => ok ' + section);
            return Promise.resolve(CSA_Result.ok);
        } else {
            _log_this_file('fillData => fail ' + section);
            return Promise.resolve(CSA_Result.some_data_failed);
        }
    }

    fillEnd(): Thenable<CSA_Result> {
        _log_this_file('fillEnd');
        this._json_data = {};
        return Promise.resolve(CSA_Result.ok);
    }

    storeStart(): Thenable<CSA_Result> {
        _log_this_file('storeStart');
        this._json_data = {};
        return Promise.resolve(CSA_Result.ok);
    }

    storeData(section: string, data: ConfigData): Thenable<CSA_Result> {
        //TODO: test if section was added before?
        _log_this_file('storeData ' + section);
        this._json_data[section] = data;
        return Promise.resolve(CSA_Result.ok);
    }

    protected _storePromise: Thenable<CSA_Result> | undefined;
    storeEnd(): Thenable<CSA_Result> {
        _log_this_file('storeEnd =');
        if (!this._storePromise) {
            this._storePromise = new Promise<CSA_Result>((resolve, reject) => {
                fs.writeFile(this._filename, JSON.stringify(this._json_data, null, 4), (err) => {
                    this._json_data = {};
                    if (err) {
                        _log_this_file('storeEnd => fail');
                        resolve(CSA_Result.end_failed);
                    } else {
                        _log_this_file('storeEnd => ok');
                        resolve(CSA_Result.ok);
                    }
                    this._storePromise = undefined;
                });
            })
        }
        return this._storePromise;
    }

    isStoring(): boolean {
        return !!this._storePromise;
    }

}
