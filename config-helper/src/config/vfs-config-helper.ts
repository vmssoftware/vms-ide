import { Uri } from "vscode";

import { FSConfigHelper } from "./fs-config-helper";
import { VFSConfigStorage } from "./vfs-storage";

// tslint:disable-next-line:no-console
export let logFn = console.log;
// tslint:disable-next-line:no-empty
logFn = () => {};

/**
 * ConfigHelper implementation
 */
export class VFSConfigHelper extends FSConfigHelper {

    protected createConcreteFS_Storage(uri: Uri) {
        // TODO: test URI and return appropriate FS
        return new VFSConfigStorage(uri);
    }
}
