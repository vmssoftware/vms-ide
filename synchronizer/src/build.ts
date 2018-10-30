import { ExtensionContext, window, workspace } from "vscode";

import { LogType } from "@vorfol/common";

import { Builder } from "./build/builder";
import { ToOutputChannel } from "./output-channel";

export let builder: Builder | undefined;

export async function BuildProject(context: ExtensionContext, debugLog?: LogType) {
    return workspace.saveAll(false).then((ok) => {
        if (ok) {
            if (!builder) {
                builder = new Builder(context, debugLog);
                context.subscriptions.push(builder);
            }
            return builder.buildProject()
                .then((result) => {
                    if (result) {
                        window.showInformationMessage(`Build: ok`);
                        ToOutputChannel(`Build process is done.`);
                    } else {
                        window.showErrorMessage(`Build: something is wrong, see output`);
                        ToOutputChannel(`Build process failed.`);
                        for (const err of builder!.lastErrors) {
                            ToOutputChannel(`${err}`);
                        }
                        return result;
                    }
                }).catch((err) => {
                    if (debugLog) {
                        debugLog(err);
                    }
                    return false;
                });
            }
    });
}
