import { extensions } from "vscode";

import { ZipApi } from "./zip-api";

export async function GetZipHelperType() {
    const extension = extensions.getExtension("vmssoftware.zip-helper");
    if (extension) {
        if (extension.isActive) {
            return extension.exports as typeof ZipApi;
        } else {
            return extension.activate() as Promise<typeof ZipApi | undefined>;
        }
    }
    return undefined;
}
