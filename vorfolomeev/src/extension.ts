
import {commands} from 'vscode';
import {ExtensionContext} from 'vscode';
import { InitCfg as FilesToSendInitCfg } from './files-to-send';
import { InitCfg as ConnectionInitCfg } from './create-ssh-client';
import { HostCollection } from './config/sections/host-collection';
import { IConfigHelper } from './ext-api/config';
import { TestFSSource } from './sync/test';

import * as nls from 'vscode-nls';

import { getConfigHelperFromApi } from './ext-api/get';

let _localize = nls.config()();

export async function activate(context: ExtensionContext) {

    console.log(_localize('extension.activated', 'OpenVMS extension is activated'));

    let helper: IConfigHelper | undefined = undefined;
    getConfigHelperFromApi().then((helperApi) => {
        if (helperApi) {
            
            helper = helperApi.getConfigHelper('open-vms');

            const config = helper.getConfig();
            config.add(new HostCollection());

            FilesToSendInitCfg(helper).then(() => {
                console.log('FilesToSendInitCfg configured');
            });
        
            //test full path to Config object
            ConnectionInitCfg(helper).then(() => {
                console.log('ConnectionInitCfg configured');
            });

            context.subscriptions.push(helper);        
        }
    });

    context.subscriptions.push( commands.registerCommand('VMS.buildProject', async () => {
        console.log('build start');
        TestFSSource();
        //await RunBuildCommand();
        console.log('build end');
    }));

    context.subscriptions.push( commands.registerCommand('VMS.editProject', async () => {
        console.log('edit start');
        if (helper) {
            let _editor = helper.getEditor();
            await _editor.invoke();
        }
        console.log('edit end');
    }));

    console.log('activation end');
}

// this method is called when your extension is deactivated
export function deactivate() {

}
