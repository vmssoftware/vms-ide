import { Disposable, workspace } from "vscode";

import { Debouncer, LogFunction, LogType } from "@vorfol/common";

import { ConfigHelper, IConfig, IConfigEditor, IConfigStorage } from "./config";
import { ConfigPool } from "./config-pool";
import { VSCWorkspaceConfigEditor } from "./vsc-editor";
import { VSCConfigStorage } from "./vsc-storage";

// import * as nls from "vscode-nls";
// nls.config({messageFormat: nls.MessageFormat.both});
// const localize = nls.loadMessageBundle();

/**
 * ConfigHelper implementation
 */
export class VSCConfigHelper implements ConfigHelper {

    public static getConfigHelper(section: string, logFn?: LogFunction): VSCConfigHelper {
        if (VSCConfigHelper.instances.get(section) === undefined) {
            VSCConfigHelper.instances.set(section, new VSCConfigHelper(section, logFn));
        }
        return VSCConfigHelper.instances.get(section)!;
    }

    private static instances: Map<string, VSCConfigHelper> = new Map<string, VSCConfigHelper>();

    protected config: ConfigPool;
    protected storage: IConfigStorage;
    protected editor: IConfigEditor;
    protected debouncer = new Debouncer(3000);
    protected disposables: Disposable[] = [];

    protected constructor(protected section: string, public logFn?: LogFunction) {
        this.storage = new VSCConfigStorage(this.section, logFn);
        this.config = new ConfigPool(this.storage, logFn);
        this.editor = new VSCWorkspaceConfigEditor(this.config, logFn);
        this.disposables.push( workspace.onDidChangeConfiguration((e) => {
            if (e.affectsConfiguration(this.section)) {
                this.config.freeze();
                if (this.logFn) {
                    this.logFn(LogType.debug, () => "onDidChangeConfiguration");
                }
                this.debouncer.debounce().then(async () => {
                    await this.config.load();
                    this.config.unfreeze();
                });
            }
        }));
    }

    public dispose() {
        for (const disp of this.disposables) {
            disp.dispose();
        }
        this.disposables = [];
    }

    public getConfig(): IConfig {
        return this.config;
    }

    public getEditor(): IConfigEditor {
        return this.editor;
    }
}
