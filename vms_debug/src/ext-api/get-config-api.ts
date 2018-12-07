import { extensions } from "vscode";

import { IConfigApi } from "../ext-api/config";

export async function GetConfigApi() {
    const extension = extensions.getExtension("vmssoftware.config-helper");
    if (extension) {
        if (extension.isActive) {
            return extension.exports as IConfigApi;
        } else {
            return extension.activate() as Promise<IConfigApi>;
        }
    }
    return undefined;
}
