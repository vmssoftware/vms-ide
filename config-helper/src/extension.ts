import * as vscode from "vscode";

import { LogType } from "@vorfol/common";

import { IConfigHelper } from "./config/config";
import { FSConfigHelper } from "./config/fs-config-helper";
import { TestSection } from "./config/test-section";
import { VFSConfigHelper } from "./config/vfs-config-helper";
import { VSCConfigHelper } from "./config/vsc-config-helper";

let debugLogFn: LogType | undefined;
debugLogFn = undefined;
// tslint:disable-next-line:no-console
debugLogFn = console.log;

const locale = vscode.env.language ;
import * as nls from "vscode-nls";
const localize = nls.config({ locale })();

export function activate(context: vscode.ExtensionContext) {

    // uncomment next line to test configuration helper. also add "*" in activation events
    // vscode.commands.executeCommand("setContext", "vmssoftware.config-helper.test:enabled", true);

    const config = vscode.workspace.getConfiguration("vmssoftware.config-helper");
    const using = config.get<string>("using");
    let configHelperType: typeof FSConfigHelper | typeof VFSConfigHelper | typeof VSCConfigHelper;
    switch (using) {
        case "FS":
            configHelperType = FSConfigHelper;
            if (debugLogFn) {
                debugLogFn(localize("message.created", "{0} created", "FS"));
            }
            break;
        case "VFS":
            configHelperType = VFSConfigHelper;
            if (debugLogFn) {
                debugLogFn(localize("message.created", "{0} created", "VFS"));
            }
            break;
        default:
            configHelperType = VSCConfigHelper;
            if (debugLogFn) {
                debugLogFn(localize("message.created", "{0} created", "VSC"));
            }
            break;
    }

    context.subscriptions.push( vscode.commands.registerCommand("vmssoftware.config-helper.test", async () => {
        //
        const configHelper: IConfigHelper = configHelperType.getConfigHelper("vmssoftware");
        let test = await configHelper.getConfig().get(TestSection.section);
        if (!TestSection.is(test)) {
            configHelper.getConfig().add(new TestSection());
            test = await configHelper.getConfig().get(TestSection.section);
        }
        if (TestSection.is(test)) {
            test.test = "passed";
            configHelper.getConfig().save();
        }
    }));

    return configHelperType;
}

export function deactivate() {
    //
}
