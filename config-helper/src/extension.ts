import * as vscode from "vscode";

import { LogType } from "@vorfol/common";

import { IConfigHelper } from "./config/config";
import { ConfigHelperSection } from "./config/config-hepler-section";
import { FSConfigHelper } from "./config/fs-config-helper";
import { VFSConfigHelper } from "./config/vfs-config-helper";
import { VSCConfigHelper } from "./config/vsc-config-helper";
import { createLogFunction } from "./log";

const locale = vscode.env.language ;
import * as nls from "vscode-nls";
const localize = nls.config({ locale, messageFormat: nls.MessageFormat.both })();

const logFn = createLogFunction("VMS config");

export function activate(context: vscode.ExtensionContext) {

    const config = vscode.workspace.getConfiguration("vmssoftware.config-helper");
    const using = config.get<string>("using");
    let configHelperType: typeof FSConfigHelper | typeof VFSConfigHelper | typeof VSCConfigHelper;
    switch (using) {
        case "FS":
            configHelperType = FSConfigHelper;
            logFn(LogType.information, () => localize("message.created", "{0} created", "FS"));
            break;
        case "VFS":
            configHelperType = VFSConfigHelper;
            logFn(LogType.information, () => localize("message.created", "{0} created", "VFS"));
            break;
        default:
            configHelperType = VSCConfigHelper;
            logFn(LogType.information, () => localize("message.created", "{0} created", "VSC"));
            break;
    }

    context.subscriptions.push( vscode.commands.registerCommand("vmssoftware.config-helper.test", async () => {
        //
        const configHelper: IConfigHelper = configHelperType.getConfigHelper("vmssoftware", logFn);
        let test = await configHelper.getConfig().get(ConfigHelperSection.section);
        if (!ConfigHelperSection.is(test)) {
            configHelper.getConfig().add(new ConfigHelperSection());
            test = await configHelper.getConfig().get(ConfigHelperSection.section);
        }
        if (ConfigHelperSection.is(test)) {
            test.test = "passed";
            configHelper.getConfig().save();
        }
    }));

    return configHelperType;
}

export function deactivate() {
    //
}
