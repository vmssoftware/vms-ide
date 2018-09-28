import {workspace} from 'vscode';

import { IConfigHelper } from "./ext-api/config";
import { FilterSection } from './config/sections/filter';

let _filter = new FilterSection();
let _cfg : IConfigHelper | undefined = undefined;

export async function InitCfg(cfg: IConfigHelper) {
    _cfg = cfg;
    _cfg.getConfig().add(_filter);
    console.log('added ' + _filter.name());
}

/** Get list of files to send using current workspace settings
 * 
 * @return A thenable that resolves to an array of resource identifiers.
 */
export async function FilesToSend() {
    //ensure we are not in -=loading=-
    if (_cfg) {
        await _cfg.getConfig().get(_filter.name());
    }
    let files = workspace.findFiles(_filter.include, _filter.exclude);
    return files;
}