
import { Uri, workspace, WorkspaceConfiguration, WorkspaceFolder } from "vscode";

import { LogFunction, LogType } from "../../common/main";
import { CSAResult, IConfigData, IConfigStorage, ValueData } from "./config";

// import * as nls from "vscode-nls";
// nls.config({messageFormat: nls.MessageFormat.both});
// const localize = nls.loadMessageBundle();

/**
 * VSCConfigStorage
 */
export class VSCConfigStorage implements IConfigStorage {
    protected logFn: LogFunction;

    protected storePromise: Promise<CSAResult> | undefined;

    constructor(protected workspaceFolder: WorkspaceFolder | undefined, protected section: string, logFn?: LogFunction) {
        // tslint:disable-next-line:no-empty
        this.logFn = logFn || (() => {});
    }

    public fillStart(): Promise<CSAResult> {
        this.logFn(LogType.debug, () => "fillStart =");
        return Promise.resolve(CSAResult.ok);
    }

    public fillData(section: string, data: IConfigData): Promise<CSAResult> {
        const configuration = workspace.getConfiguration(this.section, this.workspaceFolder ? this.workspaceFolder.uri : null);
        // tslint:disable-next-line:forin
        for (const key in data) {
            data[key] = this.setCfgValue(data[key], `${section}.${key}`, configuration);
        }
        this.logFn(LogType.debug, () => "fillData => ok " + section);
        return Promise.resolve(CSAResult.ok);
    }

    public fillEnd(): Promise<CSAResult> {
        this.logFn(LogType.debug, () => "fillEnd");
        return Promise.resolve(CSAResult.ok);
    }

    public storeStart(): Promise<CSAResult> {
        this.logFn(LogType.debug, () => "storeStart");
        return Promise.resolve(CSAResult.ok);
    }

    public storeData(section: string, data: IConfigData): Promise<CSAResult> {
        if (this.storePromise) {
            return this.storePromise;
        }
        this.storePromise = new Promise(async (resolve) => {
            let retCode = CSAResult.ok;
            const configuration = workspace.getConfiguration(this.section, this.workspaceFolder ? this.workspaceFolder.uri : null);
            // tslint:disable-next-line:forin
            for (const key in data) {
                const cfgKey = `${section}.${key}`;
                try {
                    await configuration.update(cfgKey, data[key]);
                } catch (err: any) {
                    this.logFn(LogType.debug, () => "update failed: " + cfgKey);
                    if (err instanceof Error) {
                        this.logFn(LogType.debug, () => err.message);
                    }
                    // tslint:disable-next-line:no-bitwise
                    retCode |= CSAResult.some_data_failed;
                }
            }
            this.logFn(LogType.debug, () => "storeData " + section);
            resolve(retCode);
            this.storePromise = undefined;
        });
        return this.storePromise;
    }

    public storeEnd(): Promise<CSAResult> {
        this.logFn(LogType.debug, () => "storeEnd =");
        return Promise.resolve(CSAResult.ok);
    }

    protected setCfgValue<T extends ValueData>(value: T, cfgKey: string, configuration: WorkspaceConfiguration): T {
        const tmp = configuration.get<T>(cfgKey);
        if (tmp !== undefined) {
            value = tmp;
        }
        return value;
    }

}
