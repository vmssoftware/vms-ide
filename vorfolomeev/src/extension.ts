'use strict';
import {commands} from 'vscode';
import {ExtensionContext} from 'vscode';
 
//import {RunBuildCommand} from './run-build-command';

import * as nls from 'vscode-nls';

import { InitCfg as FilesToSendInitCfg } from './files-to-send';
import { InitCfg as ConnectionInitCfg } from './create-ssh-client';
import { ConfigHelper, Config } from './config_v2/config_v2';
import { HostCollection } from './config_v2/sections/host-collection';
import { VSC_Config_Helper } from './config_v2/vsc-config-helper';
import { FS_FileSystem } from './synchronize/synchronizer';
import { workspace } from 'vscode';
import { Uri } from 'vscode';
import { FilterSection } from './config_v2/sections/filter';

//const _lang_opt = { locale: env.language };
//const _lang_opt = { locale: 'ru' };
let _localize = nls.config()();

export async function activate(context: ExtensionContext) {

    console.log(_localize('extension.activated', 'OpenVMS extension is activated'));
    
    let _helper: ConfigHelper = VSC_Config_Helper.getConfigHelper();
    let _config: Config = _helper.getConfig();
    
    let _hosts = new HostCollection();
    _config.add(_hosts);
    
    FilesToSendInitCfg(_config).then(() => {
        console.log('FilesToSendInitCfg configured');
    });

    //test full path to Config object
    ConnectionInitCfg(_config).then(() => {
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
                let filter = await _config.get(FilterSection._section);
                if (filter && FilterSection.is(filter)) {
                    let uris = await fs.files(filter.include, filter.exclude);
                    console.log(uris);
                }
            } catch(err) {
                console.log(err);
            }
        }
        console.log('build end');
    }));

    context.subscriptions.push( commands.registerCommand('VMS.editProject', async () => {
        console.log('edit start');
        //we have to save current configuration before edit
        await _config.save();
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