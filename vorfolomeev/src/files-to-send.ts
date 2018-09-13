import {workspace} from 'vscode';

import { Configuration } from './configuration/config';
import { CPP_FilterConfig } from './filter-config';

let _filter = new CPP_FilterConfig();

export async function InitCfg(config: Configuration) {
    if (!await config.get('filter')) {
        config.add('filter', _filter);
        await config.load();
        console.log('files-to-send InitCfg loaded');
    }
}

/** Get list of files to send using current workspace settings
 * 
 * @return A thenable that resolves to an array of resource identifiers.
 */
export async function FilesToSend() {

    let files = workspace.findFiles(_filter.include, _filter.exclude);
    return files;
}