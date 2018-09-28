
import {commands} from 'vscode';
import {ExtensionContext} from 'vscode';
import { InitCfg as FilesToSendInitCfg } from './files-to-send';
import { InitCfg as ConnectionInitCfg } from './create-ssh-client';
import { HostCollection } from './config/sections/host-collection';
import { ConfigHelper } from '@vorfol/config-helper';
import { TestFSSource } from './sync/test';

import * as nls from 'vscode-nls';
import { testExtApi } from './test-ext-api';
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
        TestFSSource();
        //await RunBuildCommand();
        console.log('build end');
    }));

    context.subscriptions.push( commands.registerCommand('VMS.editProject', async () => {
        console.log('edit start');
        let _editor = _helper.getEditor();
        await _editor.invoke();
        console.log('edit end');
        testExtApi();
    }));

    context.subscriptions.push(_helper);

    console.log('activation end');
    
    testExtApi();
}

// this method is called when your extension is deactivated
export function deactivate() {

}
