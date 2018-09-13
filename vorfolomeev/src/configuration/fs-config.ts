import { Editor, Serializer, SerializeHelper } from "./config";
import { Uri } from 'vscode';
import { Disposable } from "vscode";
import { Event } from "vscode";
import * as path from "path";
import { EventEmitter } from "vscode";

import * as nls from 'vscode-nls';
import { workspace } from "vscode";
import { window } from "vscode";
import * as fs from "fs";
let _localize = nls.loadMessageBundle();

const _fs_scheme = 'file';

export class FS_SerializeHelper implements SerializeHelper {

    private readonly _log_disposed = _localize('common.disposed_msg', '{0} disposed', 'FS_SerializeHelper');
    
    protected _rel_file_name = '.vscode/openvms-settings.json';

    _serializer: Serializer;

    _editor: Editor;

    private updateSerializer() {
        try {
            if (!this._serializer || this._serializer instanceof Dummy_FS_Serializer) {
                //check if some workspace appears
                if (workspace.workspaceFolders && workspace.workspaceFolders.length) {
                    let ws_Uri = workspace.workspaceFolders[0].uri;
                    if (ws_Uri.scheme == _fs_scheme) {
                        let ws_path = ws_Uri.fsPath;
                        let file_path = path.join(ws_path, this._rel_file_name);
                        let file_uri = Uri.file(file_path);
                        this._serializer.dispose();
                        this._serializer = new FS_Serializer(file_uri);
                    }
                }
            } else if (this._serializer instanceof FS_Serializer) {
                //check if current workspace exists
                if (!workspace.getWorkspaceFolder(this._serializer.getUri())) {
                    this._serializer.dispose();
                    this._serializer = new Dummy_FS_Serializer();
                }
            }
        } catch(err) {
            ;
        }
    }

    /**
     * @param _filename relative file name (in first workspace)
     */
    constructor(filename?: string) {
        this._serializer = new Dummy_FS_Serializer();
        if (filename) {
            this._rel_file_name = filename;
        }
        this._dispose.push(workspace.onDidChangeWorkspaceFolders((e) => {
            this.updateSerializer();
        }));
        this.updateSerializer();
        this._editor = new FS_Editor();
    }

    getSerializer(): Serializer {
        return this._serializer;
    }    
    
    getEditor(): Editor {
        return this._editor;
    }

    private _dispose: Disposable[] = [];
    dispose(): void {
        if (this._dispose) {
            for(let disp of this._dispose) {
                disp.dispose();
            }
        }
        this._dispose = [];
        this._serializer.dispose();
        this._editor.dispose();
        console.log(this._log_disposed);
    } 

}

export class FS_Editor implements Editor {
    
    private readonly _log_disposed = _localize('common.disposed_msg', '{0} disposed', 'FS_Editor');

    dispose(): void {
        console.log(this._log_disposed);
    }

    invoke(uri?: Uri): Thenable<boolean> {
        if (uri && uri.scheme === _fs_scheme) {
            return new Promise<boolean>((resolve, reject) => {
                window.showTextDocument(uri).then((text_editor) => {
                    resolve(true);
                }, (err) => {
                    //TODO: generate log? message?
                    resolve(false);
                });
            });
        } else {
            return Promise.resolve(false);
        }
    }

}

export class Dummy_FS_Serializer implements Serializer {

    private readonly _log_disposed = _localize('common.disposed_msg', '{0} disposed', 'Dummy_FS_Serializer');

    constructor() {
        this._dispose.push( this._emitter );
    }

    load(obj: any): Thenable<any> {
        return Promise.resolve({});
    }    
    
    save(obj: any): Thenable<boolean> {
        return Promise.resolve(false);
    }

    getUri(): Uri {
        return Uri.parse('undefined:');
    }
    
    private _emitter = new EventEmitter<null>();
    onDidChangeOutside: Event<null> = this._emitter.event;

    private _dispose: Disposable[] = [];
    dispose() {
        if (this._dispose) {
            for(let disp of this._dispose) {
                disp.dispose();
            }
        }
        this._dispose = [];
        console.log(this._log_disposed);
    }

}

export class FS_Serializer implements Serializer {

    private readonly _log_disposed = _localize('common.disposed_msg', '{0} disposed', 'FS_Serializer');

    private _emitter = new EventEmitter<null>(); //fire immediate

    onDidChangeOutside: Event<null> = this._emitter.event;

    private _dispose: Disposable[] = [];

    dispose(): void {
        if (this._dispose) {
            for(let disp of this._dispose) {
                disp.dispose();
            }
        }
        this._dispose = [];
        console.log(this._log_disposed);
    }
    
    constructor(private _file_name: Uri) {
        this._dispose.push( this._emitter );
        let fs_watcher = workspace.createFileSystemWatcher(this._file_name.fsPath);
        this._dispose.push( fs_watcher.onDidChange((e) => {
            this._emitter.fire(null);
        }));
        this._dispose.push( fs_watcher );
    }

    load(obj: any): Thenable<any> {
        return new Promise<any>(async (resolve, reject) => {
            let ret: any = {};
            try {
                let buff = fs.readFileSync(this._file_name.fsPath);
                let content = buff.toString('utf8');
                let json = JSON.parse(content);
                //for each section in given configuration object
                for(let section in obj) {
                    let j_section = json[section];
                    if (j_section) {    //if loaded json has such section
                        let sect_obj = obj[section];
                        let sect_ret: any = {};
                        //for each value in section of given configuration object
                        for(let val_key in sect_obj ) {
                            let sect_val = j_section[val_key];
                            //update only if defined
                            if (sect_val !== undefined) {
                                sect_ret[val_key] = sect_val;
                            }
                        }
                        ret[section] = sect_ret;
                    }
                }
            } catch (err) {
                ret = {};
            }
            resolve(ret);
        });
    }    

    save(obj: any): Thenable<boolean> {
        return new Promise<boolean>(async (resolve, reject) => {
            try {
                let content = JSON.stringify(obj, null, 4);
                fs.writeFileSync(this._file_name.fsPath, content);
                resolve(true);
            } catch (err) {
                ;
            }
            resolve(false);
        });
    }

    getUri(): Uri {
        return this._file_name;
    }

}