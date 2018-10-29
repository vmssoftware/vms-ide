import { extensions } from "vscode";

import { SshHelper } from "./ssh-helper";

export async function GetSshHelperFromApi() {
    const extension = extensions.getExtension("vmssoftware.ssh-helper");
    if (extension) {
        if (extension.isActive) {
            return extension.exports as typeof SshHelper;
        } else {
            return extension.activate() as Promise<typeof SshHelper | undefined>;
        }
    }
    return undefined;
}
