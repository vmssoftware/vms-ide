
import {commands} from "vscode";
import {ExtensionContext} from "vscode";
import { IConfigHelper } from "./ext-api/config";

import * as nls from "vscode-nls";

import { getConfigHelperFromApi } from "./ext-api/get";
import { ToOutputChannel } from "./output-channel";
import { TestFSSourceVMSTarget } from "./sync/test/test";
import { VmsSshHelper } from "./vms/vms-ssh-helper";

const localize = nls.config()();

// tslint:disable-next-line:no-console
export let logFn = console.log;
// tslint:disable-next-line:no-empty
// logFn = () => {};

export async function activate(context: ExtensionContext) {

    require("./ssh/ssh-helper").logFn = logFn;
    require("./ssh/ssh-helper").logFn = logFn;
    require("./ssh/simply-shell-parser").logFn = logFn;
    require("./sync/sync-v1").logFn = logFn;
    require("./sync/test/test").logFn = logFn;
    require("./vms/vms-ssh-helper").logFn = logFn;

    logFn(localize("extension.activated", "OpenVMS extension is activated"));

    let configHelper: IConfigHelper | undefined;
    getConfigHelperFromApi().then((helperApi) => {
        if (helperApi) {
            configHelper = helperApi.getConfigHelper("open-vms");
            context.subscriptions.push(configHelper);
        }
    });

    // let vmsSsh: VmsSshHelper | undefined;

    context.subscriptions.push( commands.registerCommand("VMS.buildProject", async () => {
        logFn("build start");
        if (configHelper) {
            TestFSSourceVMSTarget(configHelper);
            // if (!vmsSsh) {
            //     vmsSsh = new VmsSshHelper(configHelper);
            // }

            // await vmsSsh.getModifiedTime(`abcd1.txt`).then(async (prevDate) => {
            //     if (prevDate) {
            //         ToOutputChannel(`previous time of abcd1.txt: ${prevDate}`);
            //     }
            //     if (vmsSsh) {
            //         const now = new Date();
            //         ToOutputChannel(`set time of abcd1.txt: ${now}`);
            //         await vmsSsh.setModifiedTime(`abcd1.txt`, now);
            //         const newDate = await vmsSsh.getModifiedTime(`abcd1.txt`);
            //         if (newDate) {
            //             ToOutputChannel(`new time of abcd1.txt: ${newDate}`);
            //         }
            //     }
            // });
            // vmsSsh.waitComplete().then((done) => {
            //     ToOutputChannel(`Done ${done}`);
            // });
        }
        logFn("build end");
    }));

    context.subscriptions.push( commands.registerCommand("VMS.editProject", async () => {
        logFn("edit start");
        if (configHelper) {
            const editor = configHelper.getEditor();
            await editor.invoke();
        }
        logFn("edit end");
    }));

    logFn("activation end");
}

// this method is called when your extension is deactivated
// tslint:disable-next-line:no-empty
export function deactivate() {
}
