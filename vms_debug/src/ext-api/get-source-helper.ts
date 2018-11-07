import { extensions } from "vscode";
import { SourceHelper } from "./get-source";

export async function GetSourceHelperFromApi() {
    const extension = extensions.getExtension("vmssoftware.synchronizer");
    if (extension) {
        if (extension.isActive) {
            return extension.exports as SourceHelper;
        } else {
            return extension.activate() as Promise<SourceHelper>;
        }
    }
    return undefined;
}
