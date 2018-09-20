import { Config, ConfigStorage, ConfigObject, ConfigSection, CSA_Result } from "./config_v2";

import * as nls from 'vscode-nls';
import { EventEmitter } from "vscode";
import { Event } from "vscode";
let _localize = nls.loadMessageBundle();

export let _log_this_file = console.log;
//_log_this_file = function() {};

/**
 * ConfigPool
 * 
 * 
 * 
 * 
 * 
 */

export class ConfigPool implements Config {


    private _changeEmitter = new EventEmitter<null>();
    
    onDidChange: Event<null> = this._changeEmitter.event;

    private _fireImmediate: any = undefined;
    private fireChangeSoon(): void {
        if (this._fireImmediate) {
            clearImmediate(this._fireImmediate);
        }
        this._fireImmediate = setImmediate(() => {
            this._fireImmediate = undefined;
            this._changeEmitter.fire();
        });
    }

    protected _storage: ConfigStorage;

    constructor(storage: ConfigStorage) {
        this._storage = storage;
    }

    setStorage(storage: ConfigStorage) {
        _log_this_file('setStorage');
        this._storage = storage;
        this.load();
    }

    // getStorage() : ConfigStorage {
    //     _log_this_file('getStorage');
    //     return this._storage;
    // }

    protected _pool : ConfigObject = {};

    /**
     * Add ConfigSection to pool. ConfigPool will keep it up to date.
     */
    add(cfg: ConfigSection) : boolean {
        _log_this_file('add ' + cfg.name());
        this._pool[cfg.name()] = cfg;
        this.load();
        return true;
    }
    
    /**
     * Get kept ConfigSection.
     */
    get(section: string) : Thenable<ConfigSection|undefined> {
        _log_this_file('get = ' + section);
        return new Promise<ConfigSection>(async (resolve,reject) => {
            if (this._loadPromise) {
                await this._loadPromise;
            }
            resolve(this._pool[section]);
            _log_this_file('get => ok ' + section);
        });
    }

    protected _loadPromise : Thenable<CSA_Result> | undefined = undefined;
    load() : Thenable<CSA_Result> {
        _log_this_file('load =');
        if (!this._loadPromise) {
            this._loadPromise = new Promise<CSA_Result>(async (resolve,reject) => {
                //do load
                let changed = false;
                this._storage.fillStart().then(async (started) => {
                    if (started === CSA_Result.ok) {
                        let ret_code = CSA_Result.ok;
                        for(let section_name in this._pool) {
                            let cfg = this._pool[section_name];
                            if (cfg.name() === section_name) {
                                let data = cfg.templateToFillFrom();
                                try {
                                    let r = await this._storage.fillData(section_name, data);
                                    if (r === CSA_Result.ok) {
                                        changed = cfg.fillFrom(data) || changed;
                                    } else {
                                        ret_code |= r;
                                    }
                                } catch (err) {
                                    _log_this_file( _localize('config_v2.filldata.failed', 'filling data("{0}") failed', section_name ));
                                    _log_this_file(err);
                                    ret_code |= CSA_Result.some_data_failed;
                                }
                            }
                        }
                        if (changed) {
                            this.fireChangeSoon();
                        }
                        this._storage.fillEnd().then((ended) => {
                            ret_code |= ended;
                            resolve(ret_code);
                            _log_this_file('load => ' + (ret_code?'fail':'ok'));
                        });
                    } else {
                        resolve(started); //didn't start
                        _log_this_file('load => fail');
                    }
                    this._loadPromise = undefined;
                    _log_this_file('load => clear');
                });
            });
        }
        return this._loadPromise;
    }

    protected _savePromise : Thenable<CSA_Result> | undefined = undefined;
    save() : Thenable<CSA_Result> {
        _log_this_file('save =');
        if (!this._savePromise) {
            this._savePromise = new Promise<CSA_Result>(async (resolve,reject) => {
                //do save
                this._storage.storeStart().then( async (started) => {
                    if (started === CSA_Result.ok) {
                        let ret_code = CSA_Result.ok;
                        for(let section_name in this._pool) {
                            let cfg = this._pool[section_name];
                            if (cfg.name() === section_name) {
                                let data = cfg.store();
                                try {
                                    ret_code |= await this._storage.storeData(section_name, data);
                                } catch(err) {
                                    _log_this_file( _localize('config_v2.storedata.failed', 'storing data("{0}") failed', section_name ));
                                    _log_this_file(err);
                                    ret_code |= CSA_Result.some_data_failed;
                                }
                            }
                        }
                        this._storage.storeEnd().then((ended) => {
                            ret_code |= ended;
                            resolve(ret_code);
                            this._savePromise = undefined;
                            _log_this_file('save => ' + (ret_code?'fail':'ok'));
                        });
                    } else {
                        resolve(started); //didn't start
                        this._savePromise = undefined;
                        _log_this_file('save => fail');
                    }
                });
            });
        }
        return this._savePromise;
    }
}

