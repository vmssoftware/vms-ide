import * as fs from "fs";
import { CSAResult, IConfigData, IConfigStorage } from "./config";

// tslint:disable-next-line:no-console
export let logFn = console.log;
// tslint:disable-next-line:no-empty
logFn = () => {};

/**
 * FSConfigStorage
 */
export class FSConfigStorage implements IConfigStorage {

    protected jsonData: any = {};
    protected fillStartPromise: Promise<CSAResult> | undefined;
    protected storePromise: Promise<CSAResult> | undefined;

    constructor(protected fileName: string) {
    }

    public fillStart(): Promise<CSAResult> {
        logFn("fillStart =");
        if (!this.fillStartPromise) {
            this.fillStartPromise = new Promise<CSAResult>(async (resolve) => {
                fs.readFile(this.fileName, (err, data) => {
                    if (err) {
                        resolve(CSAResult.prepare_failed);
                    } else {
                        const content = data.toString("utf8");
                        try {
                            this.jsonData = JSON.parse(content);
                            resolve(CSAResult.ok);
                            logFn("fillStart => ok");
                        } catch (error) {
                            resolve(CSAResult.prepare_failed);
                            logFn("fillStart => fail");
                        }
                    }
                    this.fillStartPromise = undefined;
                    logFn("fillStart => clear");
                });
            });
        }
        return this.fillStartPromise;
    }

    public fillData(section: string, data: IConfigData): Promise<CSAResult> {
        if (this.jsonData && this.jsonData[section]) {
            const jsonSection = this.jsonData[section];
            for (const key in data) {
                if (jsonSection[key] !== undefined) {
                    data[key] = jsonSection[key];
                }
            }
            logFn("fillData => ok " + section);
            return Promise.resolve(CSAResult.ok);
        } else {
            logFn("fillData => fail " + section);
            return Promise.resolve(CSAResult.some_data_failed);
        }
    }

    public fillEnd(): Promise<CSAResult> {
        logFn("fillEnd");
        this.jsonData = {};
        return Promise.resolve(CSAResult.ok);
    }

    public storeStart(): Promise<CSAResult> {
        logFn("storeStart");
        this.jsonData = {};
        return Promise.resolve(CSAResult.ok);
    }

    public storeData(section: string, data: IConfigData): Promise<CSAResult> {
        // TODO: test if section was added before?
        logFn("storeData " + section);
        this.jsonData[section] = data;
        return Promise.resolve(CSAResult.ok);
    }

    public storeEnd(): Promise<CSAResult> {
        logFn("storeEnd =");
        if (!this.storePromise) {
            this.storePromise = new Promise<CSAResult>((resolve) => {
                fs.writeFile(this.fileName, JSON.stringify(this.jsonData, null, 4), (err) => {
                    this.jsonData = {};
                    if (err) {
                        logFn("storeEnd => fail");
                        resolve(CSAResult.end_failed);
                    } else {
                        logFn("storeEnd => ok");
                        resolve(CSAResult.ok);
                    }
                    this.storePromise = undefined;
                });
            });
        }
        return this.storePromise;
    }

}
