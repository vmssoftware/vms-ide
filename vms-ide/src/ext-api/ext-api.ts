
import { IConfigApi } from "../config-helper/config/config";
import { SshHelper } from "../ssh-helper/ssh-helper";
import { SyncApi } from "../synchronizer/sync/sync-api";
import { ZipApi } from "../zip/zip-api";

let configApi: IConfigApi | undefined;
let sshHelperType: typeof SshHelper | undefined;
let syncApi: SyncApi | undefined;
let zipApi: typeof ZipApi | undefined;

export function SetConfigHelperApi(newConfigApi: IConfigApi| undefined) {
    configApi = newConfigApi;
}

export function GetConfigHelperFromApi() {
    return configApi;
}

export function SetSshHelper(newSshHelper: typeof SshHelper | undefined) {
    sshHelperType = newSshHelper;
}

export function GetSshHelperType() {
    return sshHelperType;
}

export function GetSyncApi() {
    return syncApi;
}

export function SetSyncApi(newSyncApi: SyncApi | undefined) {
    syncApi = newSyncApi;
}

export function GetZipApi() {
    return zipApi;
}

export function SetZipApi(newZipApi: typeof ZipApi | undefined) {
    zipApi = newZipApi;
}
