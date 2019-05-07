import { commands, env, ExtensionContext, workspace } from "vscode";
import { CommandContext, setContext } from "./command-context";

import { ConfigApi } from "./config/config-api";
import { ConfigHelperSection } from "./config/config-hepler-section";
import { createLogFunction } from "./log";

const locale = env.language ;
import * as nls from "vscode-nls";
const localize = nls.config({ locale, messageFormat: nls.MessageFormat.both })();

const logFn = createLogFunction("VMS-IDE Config");

export function activate(context: ExtensionContext) {

    const configApi = new ConfigApi(logFn);

    // setContext(CommandContext.isTestEnabled, true); // to test command, also required "*" in "activationEvents" in package.json

    setContext(CommandContext.isSingleRoot, (workspace.workspaceFolders !== undefined && workspace.workspaceFolders.length === 1));
    context.subscriptions.push( workspace.onDidChangeWorkspaceFolders(() => {
        setContext(CommandContext.isSingleRoot, (workspace.workspaceFolders !== undefined && workspace.workspaceFolders.length === 1));
    }));

    // context.subscriptions.push( commands.registerCommand("vmssoftware.config-helper.test", async () => {
    //     //
    //     const configHelper = configApi.getConfigHelper("vmssoftware.config-helper");
    //     if (configHelper) {
    //         let test = await configHelper.getConfig().get(ConfigHelperSection.section);
    //         if (!ConfigHelperSection.is(test)) {
    //             configHelper.getConfig().add(new ConfigHelperSection());
    //             test = await configHelper.getConfig().get(ConfigHelperSection.section);
    //         }
    //         if (ConfigHelperSection.is(test)) {
    //             test.test = "passed";
    //             configHelper.getConfig().save();
    //         }
    //     }
    // }));

    return configApi;
}

export function deactivate() {
    //
}
