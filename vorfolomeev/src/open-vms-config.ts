
import { Range, workspace, Uri, WorkspaceEdit, Position} from 'vscode';
import * as fs from 'fs';
import * as path from 'path';
import { UserPasswordHostConfig, HostConfig } from './user-password-config';
import { FilterConfig, CPP_FilterConfig } from './filter-config';

export type ConnectMethod = 'user_password' | 'keys';

export interface ConfigSerializer {
    
    Load() : Thenable<any>;

    Save(obj: any) : Thenable<boolean>;

    Uri() : Uri;
}

export class ConfigProvider {

    protected _loaded = false;

    constructor(protected _cfg_serializer: ConfigSerializer) {
    }

    /** Hold configurations as ANY
     */
    protected _config_holder : any = {};

    get host_configuration() : HostConfig {
        //create default
        let ret : HostConfig = new UserPasswordHostConfig();
        //test if cfg exist in holder
        let cfg = this._config_holder['HostConfig'];
        if (cfg) {
            //update known properties only
            ret.method = cfg.method || ret.method;
            ret.host = cfg.host || ret.host;
            ret.port = cfg.port || ret.port;
            ret.username = cfg.username || ret.username;
            ret.password = cfg.password || ret.password;
        }
        return ret;
    }

    set host_configuration(cfg : HostConfig) {
        this._config_holder['HostConfig'] = cfg;
    }
    get filter_configuration() : FilterConfig {
        //create default
        let ret : FilterConfig = new CPP_FilterConfig();
        //test if cfg exist in holder
        let cfg = this._config_holder['FilterConfig'];
        if (cfg) {
            //update known properties only
            ret.include = cfg.include || ret.include;
        }
        return ret;
    }

    set filter_configuration(cfg : FilterConfig) {
        this._config_holder['FilterConfig'] = cfg;
    }

    Defaults() : boolean {
        this.host_configuration = new UserPasswordHostConfig();
        return true;
    }

    Load() : Thenable<boolean> {
        this._config_holder = {};
        this._loaded = false;
        return new Promise<boolean>( async (resolve, _reject) => {
            let loaded = await this._cfg_serializer.Load();
            if (loaded) {
                this._config_holder = loaded;
                this._loaded = true;
                resolve(true);
            } else {
                resolve(false);
            }
        });
    }    

    Save() : Thenable<boolean> {
        return this._cfg_serializer.Save(this._config_holder);
    }    

    GetConfigurationUri() : Uri {
        return this._cfg_serializer.Uri();
    }
}

/** Serializer based on VSCode workspace configuration */
export class WS_ConfigSerializer implements ConfigSerializer {

    private static readonly _openSettingsCommand = 'workbench.action.openWorkspaceSettings';
    private static readonly _configurationSection = 'open-vms';

    Load(): Thenable<any> {
        let configuration = workspace.getConfiguration(WS_ConfigSerializer._configurationSection);
        let ret = { 
            HostConfig: {
                method: 'user_password',
                host: configuration.get<string>('host'),
                port: configuration.get<number>('port'),
                username: configuration.get<string>('username'),
                password: configuration.get<string>('password')
            }
        };
        return Promise.resolve(ret);
    }    
    Save(obj: any): Thenable<boolean> {
        let configuration = workspace.getConfiguration(WS_ConfigSerializer._configurationSection);
        return new Promise<boolean>(async (resolve, reject) => {
            await configuration.update('host', obj.host);
            await configuration.update('port', obj.port);
            await configuration.update('username', obj.port);
            //do not save password!
            resolve(true);
        });
    }
    Uri(): Uri {
        return Uri.parse('vscode-command:'+ WS_ConfigSerializer._openSettingsCommand);
    }

}


/** Serializer based on file system provided Save/Load */
export class FS_ConfigSerializer implements ConfigSerializer {

    constructor(protected readonly _file_name : string) {

    }

    Uri(): Uri {
        return Uri.file(this._file_name);
    }

    Load(): Thenable<any> {
        return new Promise<any>((resolve, _reject) => {
            fs.readFile(this._file_name, (err, data) =>{
                if (err) {
                    resolve(undefined);
                } else {
                    try {
                        let str = data.toString('utf8');
                        let obj = JSON.parse(str);
                        resolve(obj);
                    } catch(err) {
                        resolve(undefined);
                    }
                }
            });
        })
    }    

    Save(obj: any): Thenable<boolean> {
        if (obj) {
            return new Promise<boolean>((resolve, _reject) => {
                //do save obj
                fs.writeFile(this._file_name, JSON.stringify(obj, null, 4), (err) => {
                    if (err) {
                        resolve(false);
                    } else {
                        resolve(true);
                    }
                })
            });
        }
        return Promise.resolve(false);
    }
}

/** Configuration based on Visual Studio Code provided Save/Load */
export class VSC_ConfigSerializer implements ConfigSerializer {

    protected readonly _folders : string[] = ['.vscode'];
    protected readonly _file_name = 'openvms-config';
    protected readonly _file_ext = '.json';

    Uri(): Uri {
        if (workspace.workspaceFolders && workspace.workspaceFolders.length) {
            let ws_Uri = workspace.workspaceFolders[0].uri;
            let ws_path = ws_Uri.fsPath;
            let format : path.FormatInputPathObject = {
                dir: path.join(ws_path, ...this._folders),
                name: this._file_name,
                ext: this._file_ext
            };
            let file_path = path.format(format);
            let file_Uri = ws_Uri.with({ path: file_path });
            return file_Uri;
        }
        return Uri.parse('empty:');
    }

    Load(): Thenable<any> {
        let _uri = this.Uri();
        if (_uri.scheme === 'untitled') {
            return Promise.resolve(undefined);
        } else {
            return new Promise<any>( async (resolve, reject) => {
                try {
                    let text_doc = await workspace.openTextDocument(_uri);
                    let all_text = text_doc.getText();
                    let obj = JSON.parse(all_text);
                    resolve(obj);
                } catch(err) {
                    resolve(undefined);
                }
            });
        }
    }    

    Save(obj: any): Thenable<boolean> {
        let _uri = this.Uri();
        if (_uri.scheme === 'untitled' || !obj) {
            return Promise.resolve(false);
        } else {
            return new Promise<boolean>( async (resolve, reject) => {
                try {
                    let range : Range | undefined = undefined;
                    try {
                        let text_doc = await workspace.openTextDocument(_uri);
                        range = text_doc.validateRange(new Range(0,0,32767,32767));
                    } catch (err) {
                        range = undefined;
                    }
                    let we = new WorkspaceEdit();
                    let str = JSON.stringify(obj, null, 4);
                    if (!range) {
                        we.createFile(_uri);
                        we.insert(_uri, new Position(0, 0), str);
                    } else {
                        we.replace(_uri, range, str);
                    }
                    let status = await workspace.applyEdit(we);
                    if (status) {
                        let text_doc = await workspace.openTextDocument(_uri);
                        let saved = await text_doc.save();
                        resolve(saved);
                    } else {
                        resolve(false);
                    }
                } catch(err) {
                    resolve(false);
                }
            });
        }
    }

}