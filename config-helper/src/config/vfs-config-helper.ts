import { FSConfigHelper } from "./fs-config-helper";
import { Uri } from "vscode";
import { VFSConfigStorage } from "./vfs-storage";

export let _log_ = console.log;
_log_ = function() {};

/**
 * 
 * ConfigHelper implementation
 * 
 * 
 */
export class VFSConfigHelper extends FSConfigHelper {

    protected createConcreteFS_Storage(uri: Uri) {
        //TODO: test URI and return appropriate FS
        return new VFSConfigStorage(uri);
    }
}

export class Q_W {
    
}