import {workspace} from "vscode";

import { FilterSection } from "./config/sections/filter";
import { IConfigHelper } from "./ext-api/config";

const filter = new FilterSection();
let cfg: IConfigHelper | undefined;

// tslint:disable-next-line:no-console
let logFn = console.log;
// tslint:disable-next-line:no-empty
logFn = () => {};

export async function InitCfg(cfgInit: IConfigHelper) {
    cfg = cfgInit;
    cfg.getConfig().add(filter);
    logFn("added " + filter.name());
}

/** Get list of files to send using current workspace settings
 *
 * @return A thenable that resolves to an array of resource identifiers.
 */
export async function FilesToSend() {
    // ensure we are not in -=loading=-
    if (cfg) {
        await cfg.getConfig().get(filter.name());
    }
    const files = workspace.findFiles(filter.include, filter.exclude);
    return files;
}
