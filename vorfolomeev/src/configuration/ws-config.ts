import { Editor, Serializer, SerializeHelper } from "./config";
import { commands } from "vscode";
import { Uri } from 'vscode';
import { workspace } from "vscode";
import { Disposable } from "vscode";
import { Event } from "vscode";
import { WaitFireEventEmitter } from "../wait-fire-event-emitter";
//import { EventEmitter } from "vscode";

import * as nls from 'vscode-nls';
let _localize = nls.loadMessageBundle();

export class WS_SerializeHelper implements SerializeHelper {

    private readonly _log_disposed = _localize('common.disposed_msg', '{0} disposed', 'WS_SerializeHelper');

    _serializer: Serializer;

    _editor: Editor;

    constructor(section: string) {
        this._serializer = new WS_Serializer(section);
        this._editor = new WS_Editor();
    }

    getSerializer(): Serializer {
        return this._serializer;
    }    
    
    getEditor(): Editor {
        return this._editor;
    }

    dispose(): void {
        this._serializer.dispose();
        //this._editor.dispose(); TODO?
        console.log(this._log_disposed);
    } 

}

const _ws_scheme = 'vscode-command';

export class WS_Editor implements Editor {
    
    private readonly _log_disposed = _localize('common.disposed_msg', '{0} disposed', 'WS_Editor');

    dispose(): void {
        console.log(this._log_disposed);
    }

    invoke(uri: Uri): Thenable<boolean> {
        if (uri.scheme === _ws_scheme) {
            return new Promise<boolean>((resolve, reject) => {
                commands.executeCommand(uri.path).then(() => {
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

export class WS_Serializer implements Serializer {

    private readonly _log_disposed = _localize('common.disposed_msg', '{0} disposed', 'WS_Serializer');

    private readonly _timeout = 1000;

    private _emitter = new WaitFireEventEmitter<null>(this._timeout);
    //private _emitter = new EventEmitter<null>(); //fire immediate

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
    
    private readonly _command = 'workbench.action.openWorkspaceSettings';

    constructor(private _section: string) {
        this._dispose.push( this._emitter );
        this._dispose.push( workspace.onDidChangeConfiguration((e) => {
            if (e.affectsConfiguration(_section)) {
                this._emitter.fire(null);
            }
        }));
    }

    load(obj: any): Thenable<any> {
        return new Promise<any>(async (resolve, reject) => {
            let configuration = workspace.getConfiguration(this._section);
            let ret: any = {};
            for(let section in obj) {
                let sect_obj = obj[section];
                let sect_ret: any = {};
                for(let val_key in sect_obj ) {
                    let sect_val = configuration.get(`${section}.${val_key}`);
                    if (sect_val !== undefined) {
                        sect_ret[val_key] = sect_val;
                    }
                }
                ret[section] = sect_ret;
            }
            resolve(ret);
        });
    }    

    save(obj: any): Thenable<boolean> {
        return new Promise<boolean>(async (resolve, reject) => {
            let configuration = workspace.getConfiguration(this._section);
            for(let section in obj) {
                let sect_obj = obj[section];
                for(let val_key in sect_obj ) {
                    let sect_val = sect_obj[val_key];
                    await configuration.update(`${section}.${val_key}`, sect_val);
                }
            }
            resolve(true);
        });
    }

    getUri(): Uri {
        return Uri.parse(_ws_scheme + ':' + this._command);
    }

}