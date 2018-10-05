import { Disposable, workspace } from "vscode";
import { IConfigHelper } from "./config/config";
import { ProjectSection } from "./config/sections/project";
import { FSSource } from "./sync/fs-source";
import { SshTarget } from "./sync/ssh-target";
import { SyncImplement } from "./sync/sync-impl";
import { VmsSshHelper } from "./vms/vms-ssh-helper";

// tslint:disable-next-line:no-console
export let logFn = console.log;
// tslint:disable-next-line:no-empty
logFn = () => {};

let syncMaster: SyncImplement | undefined;

export interface ISyncResult {
    sent: number;
    all: number;
}

export async function SyncronizeProject(configHelper: IConfigHelper) {
    return new Promise<ISyncResult>(async (resolve) => {
        if (!syncMaster) {
            // create syncronizer and attach target. forever? or watch config change?
            // or implement command "(dis|re)connect"?
            const vmsSshHelper = new VmsSshHelper(configHelper);
            const vmsTarget = new SshTarget(vmsSshHelper);
            syncMaster = new SyncImplement(vmsTarget);
        }

        let disposables: Disposable[] = [];

        // add and remove workspaces on each call. right?
        if (workspace.workspaceFolders) {
            for (const ws of workspace.workspaceFolders) {
                disposables.push(syncMaster.addSource(new FSSource(ws.uri)));
            }
        }

        const syncronizer = syncMaster;

        let projectSection = await configHelper.getConfig().get(ProjectSection.section);
        if (!projectSection) {
            configHelper.getConfig().add(new ProjectSection());
            projectSection = await configHelper.getConfig().get(ProjectSection.section);
        }
        if (ProjectSection.is(projectSection)) {
            const source = workspace.findFiles(projectSection.source, projectSection.exclude);
            const headers = workspace.findFiles(projectSection.headers, projectSection.exclude);
            const resource = workspace.findFiles(projectSection.resource, projectSection.exclude);
            Promise.all([source, headers, resource]).then((arrFound) => {
                const allUri = arrFound[0].concat(arrFound[1]).concat(arrFound[2]);
                const allFiles = allUri.map((uri) => syncronizer.postFile(uri).then((result) => {
                    logFn(`${uri} is processed: ${result}`);
                    return result;
                }));
                Promise.all(allFiles).then((results) => {
                    logFn("All done");
                    disposables.forEach((v) => v.dispose());
                    disposables = [];
                    const ret: ISyncResult = { sent: 0, all: 0};
                    results.reduce((acc, cur) => {
                        acc.all ++;
                        if (cur) {
                            acc.sent ++;
                        }
                        return acc;
                    }, ret);
                    resolve(ret);
                }).catch((err) => {
                    logFn(`Failed: ${err}`);
                    resolve(undefined);
                });
            }).catch((err) => {
                logFn(`Find files filed: ${err}`);
            });
        }
    });
}
