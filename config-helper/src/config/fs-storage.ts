import fs, { exists } from "fs";
import path from "path";
import util from "util";

import { CSAResult, IConfigData, IConfigStorage } from "./config";

// tslint:disable-next-line:no-console
export let logFn = console.log;
// tslint:disable-next-line:no-empty
logFn = () => {};

const fsExist = util.promisify(fs.exists);
const fsReadFile = util.promisify(fs.readFile);
const fsWriteFile = util.promisify(fs.writeFile);
const fsMkDir = util.promisify(fs.mkdir);

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
            this.fillStartPromise = new Promise<CSAResult>((resolve) => {
                fsReadFile(this.fileName).then((data) => {
                    const content = data.toString("utf8");
                    this.jsonData = JSON.parse(content);
                    logFn("fillStart => clear");
                    logFn("fillStart => ok");
                    return CSAResult.ok;
                }).catch((err) => {
                    logFn(`${err}`);
                    return CSAResult.prepare_failed;
                }).then((result) => {
                    this.fillStartPromise = undefined;
                    resolve(result);
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
                const dir = path.dirname(this.fileName);
                fsExist(dir).then((ok) => {
                    if (!ok) {
                        return fsMkDir(dir);
                    }
                }).then(() => {
                    return fsWriteFile(this.fileName, JSON.stringify(this.jsonData, null, 4))
                        .then(() => {
                            this.jsonData = {};
                            logFn("storeEnd => ok");
                            resolve(CSAResult.ok);
                        });
                }).catch((err) => {
                    logFn(`storeEnd => fail ${err}`);
                    resolve(CSAResult.end_failed);
                }).then(() => {
                    this.storePromise = undefined;
                });
            });
        }
        return this.storePromise;
    }

}
