import { extensions } from "vscode";
import { SyncApi } from "./sync-api";

export async function GetSyncApi() {
    const extension = extensions.getExtension("vmssoftware.synchronizer");
    if (extension) {
        if (extension.isActive) {
            return extension.exports as SyncApi;
        } else {
            return extension.activate() as Promise<SyncApi>;
        }
    }
    return undefined;
}
