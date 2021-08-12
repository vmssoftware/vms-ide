import { Disposable, Uri, workspace, WorkspaceFolder } from "vscode";

import { Debouncer, LogFunction, LogType } from "../../common/main";

import { CSAResult, IConfig, IConfigEditor, IConfigHelper, IConfigStorage } from "./config";
import { ConfigPool } from "./config-pool";
import { VSCWorkspaceConfigEditor } from "./vsc-editor";
import { VSCConfigStorage } from "./vsc-storage";

// import * as nls from "vscode-nls";
// nls.config({messageFormat: nls.MessageFormat.both});
// const localize = nls.loadMessageBundle();

/**
 * ConfigHelper implementation
 */
export class VSCConfigHelper implements IConfigHelper {

    protected logFn: LogFunction;

    protected config: ConfigPool;
    protected storage: IConfigStorage;
    protected editor: IConfigEditor;
    protected debouncer = new Debouncer(3000);
    protected disposables: Disposable[] = [];

    constructor(public workspaceFolder: WorkspaceFolder | undefined, protected extension: string, logFn?: LogFunction) {
        // tslint:disable-next-line:no-empty
        this.logFn = logFn || (() => {});
        this.storage = new VSCConfigStorage(this.workspaceFolder, this.extension, logFn);
        this.config = new ConfigPool(this.storage, logFn);
        this.editor = new VSCWorkspaceConfigEditor(this.config, logFn);
        this.disposables.push( workspace.onDidChangeConfiguration((e) => {
            if (e.affectsConfiguration(this.extension)) {
                this.config.freeze();
                this.logFn(LogType.debug, () => "onDidChangeConfiguration");
                this.debouncer.debounce().then(async () => {
                    await this.config.load().then(result => this.config.lastResult |= result);
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
