import { ExtensionContext, window, workspace } from "vscode";

import { LogType } from "@vorfol/common";

import { Builder } from "./build/builder";
import { ToOutputChannel } from "./output-channel";

import * as nls from "vscode-nls";
nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

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
                        window.showInformationMessage(localize("message.build.ok", "Build: ok"));
                        ToOutputChannel(localize("output.build.done", "Build process is done"));
                    } else {
                        window.showErrorMessage(localize("message.build.wrong", "Build: something is wrong, see output"));
                        ToOutputChannel(localize("output.build.failed", "Build process failed"));
                        for (const err of builder!.messages) {
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
