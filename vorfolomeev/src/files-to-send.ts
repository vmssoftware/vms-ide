import {workspace} from 'vscode';

import { Config } from './config_v2/config_v2';
import { FilterSection } from './config_v2/sections/filter';

let _filter = new FilterSection();
let _cfg : Config| undefined = undefined;

export async function InitCfg(cfg: Config) {
    _cfg = cfg;
    _cfg.add(_filter);
    console.log('added ' + _filter.name());
}

/** Get list of files to send using current workspace settings
 * 
 * @return A thenable that resolves to an array of resource identifiers.
 */
export async function FilesToSend() {
    //ensure we are not in -=loading=-
    if (_cfg) {
        await _cfg.get(_filter.name());
    }
    let files = workspace.findFiles(_filter.include, _filter.exclude);
    return files;
}