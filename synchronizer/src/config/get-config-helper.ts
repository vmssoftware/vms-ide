import { extensions } from "vscode";

import { ConfigHelper } from "../ext-api/config";

export async function GetConfigHelperFromApi() {
    const extension = extensions.getExtension("vmssoftware.config-helper");
    if (extension) {
        if (extension.isActive) {
            return extension.exports as typeof ConfigHelper;
        } else {
            return extension.activate() as Promise<typeof ConfigHelper | undefined>;
        }
    }
    return undefined;
}
