
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

    let configHelper: IConfigHelper | undefined;
    getConfigHelperFromApi().then((helperApi) => {
        if (helperApi) {
            configHelper = helperApi.getConfigHelper("open-vms");
            context.subscriptions.push(configHelper);
        }
    });

    let ssh: SshHelper | undefined;

    context.subscriptions.push( commands.registerCommand("VMS.buildProject", async () => {
        logFn("build start");
        // TestFSSource();
        // await RunBuildCommand();
        if (configHelper) {
            if (!ssh) {
                ssh = new SshHelper(configHelper);
            }
            ssh.updateContent(`abcd1.txt`, Buffer.allocUnsafe(100)).then((r) => {
                ToOutputChannel(`"send" abcd1.txt: ${r}, ${(ssh && ssh.lastError) ? ssh.lastError : "no errors" }`);
            });
            ssh.updateContent(`abcd2.txt`, Buffer.allocUnsafe(100)).then((r) => {
                ToOutputChannel(`"send" abcd2.txt: ${r}, ${(ssh && ssh.lastError) ? ssh.lastError : "no errors" }`);
            });
            ssh.getModifiedDate(`abcd1.txt`).then((r) => {
                ToOutputChannel(`"modTime" abcd1.txt: ${r}, ${(ssh && ssh.lastError) ? ssh.lastError : "no errors" }`);
            });
            ssh.executeShellCmd("dir").then((r) => {
                if (!r) {
                    ToOutputChannel(`"shellExec" dir: failed: ${ssh ? ssh.lastError : "..."} `);
                } else {
                    ToOutputChannel(r.stdout);
                    if (r.stderr) {
                        ToOutputChannel(`ERROR: ${r.stderr}`);
                    }
                }
            });
            ssh.getModifiedDate(`abcd2.txt`).then((r) => {
                ToOutputChannel(`"modTime" abcd2.txt: ${r}, ${ssh && ssh.lastError ? ssh.lastError : "no errors" }`);
            });
            ssh.updateContent(`abcd3.txt`, Buffer.allocUnsafe(100)).then((r) => {
                ToOutputChannel(`"send" abcd3.txt: ${r}, ${(ssh && ssh.lastError) ? ssh.lastError : "no errors" }`);
            });
            ssh.executeCmd("set def [.wrk]").then((r) => {
                if (!r) {
                    ToOutputChannel(`"exec" dir: failed: ${ssh ? ssh.lastError : "..."} `);
                } else {
                    ToOutputChannel(r.stdout);
                    if (r.stderr) {
                        ToOutputChannel(`ERROR: ${r.stderr}`);
                    }
                }
            });
            ssh.getModifiedDate(`abcd3.txt`).then((r) => {
                ToOutputChannel(`"modTime" abcd3.txt: ${r}, ${ssh && ssh.lastError ? ssh.lastError : "no errors" }`);
            });
            ssh.waitComplete().then((r) => {
                ToOutputChannel(`"complete" ${(ssh && ssh.lastError) ? ssh.lastError : "no errors" }`);
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
