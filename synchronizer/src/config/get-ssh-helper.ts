import { extensions } from "vscode";

import { SshHelper } from "../ext-api/ssh-helper";

export async function GetSshHelperType() {
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
