'use strict';
import {commands} from 'vscode';
import {ExtensionContext} from 'vscode';
 
import {RunBuildCommand} from './run-build-command';
import { Configuration, SerializeHelper } from './configuration/config';
import { WS_SerializeHelper } from './configuration/ws-config';
import { ProxyConfiguration } from './configuration/proxy-config';
//import { env } from 'vscode';

import * as nls from 'vscode-nls';
//import { FS_SerializeHelper } from './configuration/fs-config';
import { InitCfg as IntConnectionCfg } from './create-ssh-client';
import { InitCfg as IntFilterCfg } from './files-to-send';

//const _lang_opt = { locale: env.language };
//const _lang_opt = { locale: 'ru' };
let _localize = nls.config()();

const _section = 'open-vms';

import {Test} from './configuration/config_v2';

Test();

export async function activate(context: ExtensionContext) {

    console.log(_localize('extension.activated', 'OpenVMS extension is activated'));

    let _serialize_helper: SerializeHelper = new WS_SerializeHelper(_section);
    let _config: Configuration = new ProxyConfiguration(_serialize_helper);

    context.subscriptions.push(_serialize_helper);
    context.subscriptions.push(_config);

    IntConnectionCfg(_config).then(() => {
        console.log('IntConnectionCfg configured');
    });
    IntFilterCfg(_config).then(() => {
        console.log('IntFilterCfg configured');
    });

    context.subscriptions.push( commands.registerCommand('VMS.buildProject', async () => {
        console.log('build start');
        await RunBuildCommand();
        console.log('build end');
    }));

    context.subscriptions.push( commands.registerCommand('VMS.editProject', async () => {
        console.log('edit start');
        await _config.edit();
        console.log('edit end');
    }));

    console.log('activation end');
}

// this method is called when your extension is deactivated
export function deactivate() {

}