import * as vscode from "vscode";

import { ConfigApi } from "./config/config-api";
import { ConfigHelperSection } from "./config/config-hepler-section";
import { createLogFunction } from "./log";

const locale = vscode.env.language ;
import * as nls from "vscode-nls";
const localize = nls.config({ locale, messageFormat: nls.MessageFormat.both })();

const logFn = createLogFunction("VMS config");

export function activate(context: vscode.ExtensionContext) {

    const configApi = new ConfigApi(logFn);

    // vscode.commands.executeCommand("setContext", "vmssoftware.config-helper.test:enabled", true); // required "*" in "activationEvents" in package.json

    context.subscriptions.push( vscode.commands.registerCommand("vmssoftware.config-helper.test", async () => {
        //
        const configHelper = configApi.getConfigHelper("vmssoftware.config-helper");
        if (configHelper) {
            let test = await configHelper.getConfig().get(ConfigHelperSection.section);
            if (!ConfigHelperSection.is(test)) {
                configHelper.getConfig().add(new ConfigHelperSection());
                test = await configHelper.getConfig().get(ConfigHelperSection.section);
            }
            if (ConfigHelperSection.is(test)) {
                test.test = "passed";
                configHelper.getConfig().save();
            }
        }
    }));

    return configApi;
}

export function deactivate() {
    //
}
