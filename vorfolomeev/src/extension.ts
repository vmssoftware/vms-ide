
import {commands} from "vscode";
import {ExtensionContext} from "vscode";
import { HostCollection } from "./config/sections/host-collection";
import { InitCfg as ConnectionInitCfg } from "./create-ssh-client";
import { IConfigHelper } from "./ext-api/config";
import { InitCfg as FilesToSendInitCfg } from "./files-to-send";
import { TestFSSource } from "./sync/test";

import * as nls from "vscode-nls";

import { getConfigHelperFromApi } from "./ext-api/get";
import { ToOutputChannel } from "./output-channel";
import { SshHelper } from "./sync/ssh-helper";

const localize = nls.config()();

// tslint:disable-next-line:no-console
const logFn = console.log;
// tslint:disable-next-line:no-empty
// logFn = () => {};

export async function activate(context: ExtensionContext) {

    logFn(localize("extension.activated", "OpenVMS extension is activated"));

    let helper: IConfigHelper | undefined;
    getConfigHelperFromApi().then((helperApi) => {
        if (helperApi) {
            helper = helperApi.getConfigHelper("open-vms");
            context.subscriptions.push(helper);
        }
    });

    let ssh: SshHelper | undefined;

    context.subscriptions.push( commands.registerCommand("VMS.buildProject", async () => {
        logFn("build start");
        // TestFSSource();
        // await RunBuildCommand();
        if (helper) {
            if (!ssh) {
                ssh = new SshHelper(helper);
            }
            ssh.sendFile(`abcd1.txt`, Buffer.allocUnsafe(100)).then((result) => {
                ToOutputChannel(`"send" abcd1.txt: ${result}, ${ssh && ssh.lastError ? ssh.lastError : "no errors" }`);
            });
            ssh.sendFile(`abcd2.txt`, Buffer.allocUnsafe(100)).then((result) => {
                ToOutputChannel(`"send" abcd2.txt: ${result}, ${ssh && ssh.lastError ? ssh.lastError : "no errors" }`);
            });
            ssh.getFileModTime(`abcd1.txt`).then((result) => {
                // tslint:disable-next-line:max-line-length
                ToOutputChannel(`"modTime" abcd1.txt: ${result}, ${ssh && ssh.lastError ? ssh.lastError : "no errors" }`);
            });
            ssh.getFileModTime(`abcd2.txt`).then((result) => {
                // tslint:disable-next-line:max-line-length
                ToOutputChannel(`"modTime" abcd2.txt: ${result}, ${ssh && ssh.lastError ? ssh.lastError : "no errors" }`);
                if (ssh) {
                    ssh.dispose();
                    ssh = undefined;
                    logFn(`ssh disposed`);
                }
            });
        }
        logFn("build end");
    }));

    context.subscriptions.push( commands.registerCommand("VMS.editProject", async () => {
        logFn("edit start");
        if (helper) {
            const editor = helper.getEditor();
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
