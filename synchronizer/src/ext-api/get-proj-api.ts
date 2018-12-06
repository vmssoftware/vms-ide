import { extensions } from "vscode";
import { ProjApi } from "./proj-api";

export async function GetProjectDepApi() {
    const extension = extensions.getExtension("vmssoftware.project-dep");
    if (extension) {
        if (extension.isActive) {
            return extension.exports as ProjApi;
        } else {
            return extension.activate() as Promise<ProjApi>;
        }
    }
    return undefined;
}
