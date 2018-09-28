import { Disposable, workspace } from "vscode";
import { Debouncer } from "../common/debounce";
import { IConfig, IConfigEditor, IConfigHelper, IConfigStorage } from "./config";
import { ConfigPool } from "./config-pool";
import { VSCWorkspaceConfigEditor } from "./vsc-editor";
import { VSCConfigStorage } from "./vsc-storage";

// tslint:disable-next-line:no-console
export let logFn = console.log;
// tslint:disable-next-line:no-empty
logFn = () => {};

/**
 * ConfigHelper implementation
 */
export class VSCConfigHelper implements IConfigHelper {

    public static getConfigHelper(section: string): VSCConfigHelper {
        if (VSCConfigHelper.instances.get(section) === undefined) {
            VSCConfigHelper.instances.set(section, new VSCConfigHelper(section));
        }
        return VSCConfigHelper.instances.get(section)!;
    }

    private static instances: Map<string, VSCConfigHelper> = new Map<string, VSCConfigHelper>();

    protected config: ConfigPool;
    protected storage: IConfigStorage;
    protected editor: IConfigEditor;
    protected debouncer = new Debouncer(3000);
    protected disposeables: Disposable[] = [];

    protected constructor(protected section: string) {
        this.storage = new VSCConfigStorage(this.section);
        this.config = new ConfigPool(this.storage);
        this.editor = new VSCWorkspaceConfigEditor(this.config);
        this.disposeables.push( workspace.onDidChangeConfiguration((e) => {
            if (e.affectsConfiguration(this.section)) {
                this.config.freeze();
                logFn("onDidChangeConfiguration");
                this.debouncer.debounce().then(async () => {
                    await this.config.load();
                    this.config.unfreeze();
                });
            }
        }));
    }

    public dispose() {
        for (const disp of this.disposeables) {
            disp.dispose();
        }
        this.disposeables = [];
    }

    public getConfig(): IConfig {
        return this.config;
    }

    public getEditor(): IConfigEditor {
        return this.editor;
    }
}
