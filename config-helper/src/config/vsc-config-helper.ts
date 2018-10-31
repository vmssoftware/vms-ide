import { Disposable, workspace } from "vscode";

import { Debouncer, LogType } from "@vorfol/common";

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

    public static getConfigHelper(section: string, debugLog?: LogType): VSCConfigHelper {
        if (VSCConfigHelper.instances.get(section) === undefined) {
            VSCConfigHelper.instances.set(section, new VSCConfigHelper(section, debugLog));
        }
        return VSCConfigHelper.instances.get(section)!;
    }

    private static instances: Map<string, VSCConfigHelper> = new Map<string, VSCConfigHelper>();

    protected config: ConfigPool;
    protected storage: IConfigStorage;
    protected editor: IConfigEditor;
    protected debouncer = new Debouncer(3000);
    protected disposables: Disposable[] = [];

    protected constructor(protected section: string, public debugLog?: LogType) {
        this.storage = new VSCConfigStorage(this.section, debugLog);
        this.config = new ConfigPool(this.storage, debugLog);
        this.editor = new VSCWorkspaceConfigEditor(this.config, debugLog);
        this.disposables.push( workspace.onDidChangeConfiguration((e) => {
            if (e.affectsConfiguration(this.section)) {
                this.config.freeze();
                if (this.debugLog) { this.debugLog("onDidChangeConfiguration"); }
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
