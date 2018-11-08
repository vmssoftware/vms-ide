import fs, { exists } from "fs";
import path from "path";
import util from "util";

import { LogFunction, LogType } from "@vorfol/common";
import { CSAResult, IConfigData, IConfigStorage } from "./config";

const fsExist = util.promisify(fs.exists);
const fsReadFile = util.promisify(fs.readFile);
const fsWriteFile = util.promisify(fs.writeFile);
const fsMkDir = util.promisify(fs.mkdir);

// import * as nls from "vscode-nls";
// nls.config({messageFormat: nls.MessageFormat.both});
// const localize = nls.loadMessageBundle();

/**
 * FSConfigStorage
 */
export class FSConfigStorage implements IConfigStorage {

    public logFn: LogFunction;

    protected jsonData: any = {};
    protected fillStartPromise: Promise<CSAResult> | undefined;
    protected storePromise: Promise<CSAResult> | undefined;

    constructor(protected fileName: string, logFn?: LogFunction) {
        // tslint:disable-next-line:no-empty
        this.logFn = logFn || (() => {});
    }

    public fillStart(): Promise<CSAResult> {
        this.logFn(LogType.debug, () => "fillStart =");
        if (!this.fillStartPromise) {
            this.fillStartPromise = new Promise<CSAResult>((resolve) => {
                fsReadFile(this.fileName).then((data) => {
                    const content = data.toString("utf8");
                    this.jsonData = JSON.parse(content);
                    this.logFn(LogType.debug, () => "fillStart => ok");
                    return CSAResult.ok;
                }).catch((err) => {
                    this.logFn(LogType.debug, () => `${err}`);
                    return CSAResult.prepare_failed;
                }).then((result) => {
                    this.logFn(LogType.debug, () => "fillStart => clear");
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
            this.logFn(LogType.debug, () => "fillData => ok " + section);
            return Promise.resolve(CSAResult.ok);
        } else {
            this.logFn(LogType.debug, () => "fillData => fail " + section);
            return Promise.resolve(CSAResult.some_data_failed);
        }
    }

    public fillEnd(): Promise<CSAResult> {
        this.logFn(LogType.debug, () => "fillEnd");
        this.jsonData = {};
        return Promise.resolve(CSAResult.ok);
    }

    public storeStart(): Promise<CSAResult> {
        this.logFn(LogType.debug, () => "storeStart");
        this.jsonData = {};
        return Promise.resolve(CSAResult.ok);
    }

    public storeData(section: string, data: IConfigData): Promise<CSAResult> {
        // TODO: test if section was added before?
        this.logFn(LogType.debug, () => "storeData " + section);
        this.jsonData[section] = data;
        return Promise.resolve(CSAResult.ok);
    }

    public storeEnd(): Promise<CSAResult> {
        this.logFn(LogType.debug, () => "storeEnd =");
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
                            this.logFn(LogType.debug, () => "storeEnd => ok");
                            resolve(CSAResult.ok);
                        });
                }).catch((err) => {
                    this.logFn(LogType.debug, () => `storeEnd => fail ${err}`);
                    resolve(CSAResult.end_failed);
                }).then(() => {
                    this.storePromise = undefined;
                });
            });
        }
        return this.storePromise;
    }

}
