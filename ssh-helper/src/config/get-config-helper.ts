import { extensions } from "vscode";

import { IConfigApi } from "./config";

export async function GetConfigHelperFromApi() {
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
