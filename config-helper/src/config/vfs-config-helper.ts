import { FS_Config_Helper } from "./fs-config-helper";
import { Uri } from "vscode";
import { VFS_ConfigStorage } from "./vfs-storage";

export let _log_this_file = console.log;
//_log_this_file = function() {};

/**
 * 
 * ConfigHelper implementation
 * 
 * 
 */
export class VFS_Config_Helper extends FS_Config_Helper {

    protected createConcreteFS_Storage(uri: Uri) {
        //TODO: test URI and return appropriate FS
        return new VFS_ConfigStorage(uri);
    }

}
