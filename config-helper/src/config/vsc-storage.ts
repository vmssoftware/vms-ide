
import { workspace, WorkspaceConfiguration } from "vscode";

import { CSAResult, IConfigData, IConfigStorage, ValueData } from "./config";

// tslint:disable-next-line:no-console
export let logFn = console.log;
// tslint:disable-next-line:no-empty
logFn = () => {};

/**
 * VSCConfigStorage
 */
export class VSCConfigStorage implements IConfigStorage {

    protected storePromise: Promise<CSAResult> | undefined;

    constructor(protected section: string) {

    }

    public fillStart(): Promise<CSAResult> {
        logFn("fillStart =");
        return Promise.resolve(CSAResult.ok);
    }

    public fillData(section: string, data: IConfigData): Promise<CSAResult> {
        const configuration = workspace.getConfiguration(this.section);
        // tslint:disable-next-line:forin
        for (const key in data) {
            data[key] = this.setCfgValue(data[key], `${section}.${key}`, configuration);
        }
        logFn("fillData => ok " + section);
        return Promise.resolve(CSAResult.ok);
    }

    public fillEnd(): Promise<CSAResult> {
        logFn("fillEnd");
        return Promise.resolve(CSAResult.ok);
    }

    public storeStart(): Promise<CSAResult> {
        logFn("storeStart");
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
                    logFn("update failed: " + cfgKey);
                    if (err instanceof Error) {
                        logFn(err.message);
                    }
                    // tslint:disable-next-line:no-bitwise
                    retCode |= CSAResult.some_data_failed;
                }
            }
            logFn("storeData " + section);
            resolve(retCode);
            this.storePromise = undefined;
        });
        return this.storePromise;
    }

    public storeEnd(): Promise<CSAResult> {
        logFn("storeEnd =");
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
