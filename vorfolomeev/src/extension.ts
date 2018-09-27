'use strict';
import {commands} from 'vscode';
import {ExtensionContext} from 'vscode';
 
//import {RunBuildCommand} from './run-build-command';

import * as nls from 'vscode-nls';

import { InitCfg as FilesToSendInitCfg } from './files-to-send';
import { InitCfg as ConnectionInitCfg } from './create-ssh-client';
import { HostCollection } from './config/sections/host-collection';
import { FS_FileSystem } from './synchronize/synchronizer';
import { workspace } from 'vscode';
import { Uri } from 'vscode';
import { FilterSection } from './config/sections/filter';

import { ConfigHelper } from '@vorfol/config-helper';

//const _lang_opt = { locale: env.language };
//const _lang_opt = { locale: 'ru' };
let _localize = nls.config()();

export async function activate(context: ExtensionContext) {

    console.log(_localize('extension.activated', 'OpenVMS extension is activated'));

    let _helper = ConfigHelper.getConfigHelper('open-vms');

    let _hosts = new HostCollection();
    _helper.getConfig().add(_hosts);
    
    FilesToSendInitCfg(_helper).then(() => {
        console.log('FilesToSendInitCfg configured');
    });

    //test full path to Config object
    ConnectionInitCfg(_helper).then(() => {
        console.log('ConnectionInitCfg configured');
    });

    context.subscriptions.push( commands.registerCommand('VMS.buildProject', async () => {
        console.log('build start');
        //await RunBuildCommand();
        if (workspace.workspaceFolders) {
            try {
                let ws_uris: Uri[] = [];
                for(let ws of workspace.workspaceFolders) {
                    ws_uris.push(ws.uri);
                }
                let fs = new FS_FileSystem(ws_uris);
                let filter = await _helper.getConfig().get(FilterSection._section);
                if (filter && FilterSection.is(filter)) {
                    let uris = await fs.files(filter.include, filter.exclude);
                    for(let uri of uris) {
                        console.log(uri.fsPath);
                    }
                }
            } catch(err) {
                console.log(err);
            }
        }
        console.log('build end');
    }));

    context.subscriptions.push( commands.registerCommand('VMS.editProject', async () => {
        console.log('edit start');
        let _editor = _helper.getEditor();
        await _editor.invoke();
        console.log('edit end');
    }));

    context.subscriptions.push(_helper);

    console.log('activation end');
}

// this method is called when your extension is deactivated
export function deactivate() {

}