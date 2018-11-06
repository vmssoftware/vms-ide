
import { workspace, WorkspaceConfiguration } from "vscode";

import { LogFunction, LogType } from "@vorfol/common";
import { CSAResult, IConfigData, IConfigStorage, ValueData } from "./config";

// import * as nls from "vscode-nls";
// nls.config({messageFormat: nls.MessageFormat.both});
// const localize = nls.loadMessageBundle();

/**
 * VSCConfigStorage
 */
export class VSCConfigStorage implements IConfigStorage {

    protected storePromise: Promise<CSAResult> | undefined;

    constructor(protected section: string, public logFn?: LogFunction) {

    }

    public fillStart(): Promise<CSAResult> {
        if (this.logFn) {
            this.logFn(LogType.debug, () => "fillStart =");
        }
        return Promise.resolve(CSAResult.ok);
    }

    public fillData(section: string, data: IConfigData): Promise<CSAResult> {
        const configuration = workspace.getConfiguration(this.section);
        // tslint:disable-next-line:forin
        for (const key in data) {
            data[key] = this.setCfgValue(data[key], `${section}.${key}`, configuration);
        }
        if (this.logFn) {
            this.logFn(LogType.debug, () => "fillData => ok " + section);
        }
        return Promise.resolve(CSAResult.ok);
    }

    public fillEnd(): Promise<CSAResult> {
        if (this.logFn) {
            this.logFn(LogType.debug, () => "fillEnd");
        }
        return Promise.resolve(CSAResult.ok);
    }

    public storeStart(): Promise<CSAResult> {
        if (this.logFn) {
            this.logFn(LogType.debug, () => "storeStart");
        }
        return Promise.resolve(CSAResult.ok);
    }

    public storeData(section: string, data: IConfigData): Promise<CSAResult> {
        if (this.storePromise) {
            return this.storePromise;
        }
        this.storePromise = new Promise(async (resolve) => {
            let retCode = CSAResult.ok;
            const configuration = workspace.getConfiguration(this.section);
            // tslint:disable-next-line:forin
            for (const key in data) {
                const cfgKey = `${section}.${key}`;
                try {
                    await configuration.update(cfgKey, data[key]);
                } catch (err) {
                    if (this.logFn) {
                        this.logFn(LogType.debug, () => "update failed: " + cfgKey);
                    }
                    if (err instanceof Error) {
                        if (this.logFn) {
                            this.logFn(LogType.debug, () => err.message);
                        }
                    }
                    // tslint:disable-next-line:no-bitwise
                    retCode |= CSAResult.some_data_failed;
                }
            }
            if (this.logFn) {
                this.logFn(LogType.debug, () => "storeData " + section);
            }
            resolve(retCode);
            this.storePromise = undefined;
        });
        return this.storePromise;
    }

    public storeEnd(): Promise<CSAResult> {
        if (this.logFn) {
            this.logFn(LogType.debug, () => "storeEnd =");
        }
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
