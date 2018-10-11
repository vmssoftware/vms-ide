import { Disposable, window, workspace } from "vscode";
import { IAskPassword } from "./common/ask-password";
import { AskPasswordWindow } from "./common/ask-password-window";
import { ConfigHelper, IConfigHelper } from "./config/config";
import { ProjectSection } from "./config/sections/project";
import { ShellSection } from "./config/sections/shell";
import { UserPasswordSection } from "./config/sections/user-password";
import { PasswordResolver } from "./ssh/password-checker-4";
import { SimplyShellParser } from "./ssh/simply-shell-parser";
import { FSSource } from "./sync/fs-source";
import { ISync } from "./sync/sync";
import { SyncImplement } from "./sync/sync-impl";
import { SyncSiteTarget } from "./sync/sync-site-target";
import { IVmsSShSettings, VmsSshHelper } from "./vms/vms-ssh-helper";

// tslint:disable-next-line:no-console
export let logFn = console.log;
// tslint:disable-next-line:no-empty
logFn = () => {};

export interface ISyncResult {
    sent: number;
    all: number;
}

export class Synchronizer {

    private syncMaster: ISync | undefined;
    private vmsSshHelper: VmsSshHelper | undefined;
    private vmsTarget: SyncSiteTarget | undefined;
    private didLoadDispose: Disposable | undefined;
    private passwordChecker = new PasswordResolver(new AskPasswordWindow());
    private inProgress = false;
    private configHelper: IConfigHelper | undefined;
    private askPass: IAskPassword = new AskPasswordWindow();

    public get isInProgress(): boolean {
        return this.inProgress;
    }

    public SyncronizeProject(configHelper: IConfigHelper): Promise<ISyncResult> {
        this.inProgress = true;
        return new Promise<ISyncResult>(async (resolve) => {

            this.configHelper = configHelper;

            if (!this.syncMaster) {
                this.syncMaster = await this.BuildSynchronizer(configHelper);
            }

            if (!this.didLoadDispose) {
                this.didLoadDispose = configHelper.getConfig().onDidLoad( () => {
                    this.OnDidLoadNewConfiguration();
                });
            }

            if (!this.syncMaster) {
                window.showErrorMessage("Cannot create synchronizer");
                resolve(undefined);
                this.inProgress = false;
                return;
            }

            let disposables: Disposable[] = [];

            // add and remove workspaces on each call
            if (workspace.workspaceFolders) {
                for (const ws of workspace.workspaceFolders) {
                    disposables.push(this.syncMaster.addSource(new FSSource(ws.uri)));
                }
            }

            const syncronizer = this.syncMaster;    // save

            this.passwordChecker.clearCache();

            const project = await configHelper.getConfig().get(ProjectSection.section);
            if (!ProjectSection.is(project)) {
                window.showErrorMessage("Have no project settings");
                resolve(undefined);
                this.inProgress = false;
            } else {
                const source = workspace.findFiles(project.source, project.exclude);
                const headers = workspace.findFiles(project.headers, project.exclude);
                const resource = workspace.findFiles(project.resource, project.exclude);
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
                        if (this.vmsSshHelper && this.vmsSshHelper.lastError) {
                            window.showErrorMessage(String(this.vmsSshHelper.lastError));
                        }
                        this.inProgress = false;
                    }).catch((err) => {
                        logFn(`Failed: ${err}`);
                        resolve(undefined);
                        this.inProgress = false;
                    });
                }).catch((err) => {
                    logFn(`Find files filed: ${err}`);
                    window.showErrorMessage("Error while find project files");
                    resolve(undefined);
                    this.inProgress = false;
                });
            }
        });
    }

    private BuildVmsSettings(configHelper: IConfigHelper): Promise<IVmsSShSettings> {
        return Promise.resolve().then(async () => {
            const vmsSettings: IVmsSShSettings = {connectConfig: {}};
            let userPasswordSection = await configHelper.getConfig().get(UserPasswordSection.section);
            if (!userPasswordSection) {
                configHelper.getConfig().add(new UserPasswordSection());
                userPasswordSection = await configHelper.getConfig().get(UserPasswordSection.section);
            }
            if (UserPasswordSection.is(userPasswordSection)) {
                vmsSettings.connectConfig = Object.assign({}, userPasswordSection);
                vmsSettings.settingsResolver = this.passwordChecker;
            }
            let projectSection = await configHelper.getConfig().get(ProjectSection.section);
            if (!projectSection) {
                configHelper.getConfig().add(new ProjectSection());
                projectSection = await configHelper.getConfig().get(ProjectSection.section);
            }
            if (ProjectSection.is(projectSection)) {
                vmsSettings.root = projectSection.root;
            }
            let shellSection = await configHelper.getConfig().get(ShellSection.section);
            if (!shellSection) {
                configHelper.getConfig().add(new ShellSection());
                shellSection = await configHelper.getConfig().get(ShellSection.section);
            }
            if (ShellSection.is(shellSection)) {
                vmsSettings.parser = new SimplyShellParser(shellSection.ending);
            }
            return vmsSettings;
        });
    }

    private BuildSynchronizer(configHelper: IConfigHelper): Promise<ISync|undefined> {
        return Promise.resolve().then(async () => {
            const vmsSettings: IVmsSShSettings = await this.BuildVmsSettings(configHelper);
            this.vmsSshHelper = new VmsSshHelper(vmsSettings);
            this.vmsTarget = new SyncSiteTarget(this.vmsSshHelper);
            return new SyncImplement(this.vmsTarget);
        });
    }

    private OnDidLoadNewConfiguration(): void {
        logFn("New config did load");
        if (this.configHelper) {
            this.BuildVmsSettings(this.configHelper).then((settings) => {
                if (this.vmsSshHelper) {
                    this.vmsSshHelper.settingsChanged(settings);
                }
            });
        }
    }
}
