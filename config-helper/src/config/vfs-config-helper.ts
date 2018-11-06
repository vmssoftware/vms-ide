import { Uri } from "vscode";

import { LogFunction, LogType } from "@vorfol/common";
import { FSConfigHelper } from "./fs-config-helper";
import { VFSConfigStorage } from "./vfs-storage";

// import * as nls from "vscode-nls";
// nls.config({messageFormat: nls.MessageFormat.both});
// const localize = nls.loadMessageBundle();

/**
 * ConfigHelper implementation
 */
export class VFSConfigHelper extends FSConfigHelper {

    protected createConcreteFS_Storage(uri: Uri, logFn?: LogFunction) {
        // TODO: test URI and return appropriate FS
        return new VFSConfigStorage(uri, logFn);
    }
}
