import { Event, EventEmitter } from "vscode";

import { LogFunction, LogType } from "../../common/main";
import { CSAResult, IConfig, IConfigSection, IConfigStorage } from "./config";

import * as nls from "vscode-nls";
nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

/**
 * ConfigPool
 */
export class ConfigPool implements IConfig {

    public onDidLoad: Event<null>;
    public logFn: LogFunction;

    protected pool: Map<string, IConfigSection> = new Map<string, IConfigSection>();
    protected loadPromise: Promise<CSAResult> | undefined = undefined;
    protected savePromise: Promise<CSAResult> | undefined = undefined;
    protected fireImmediate: any = undefined;
    protected changeEmitter = new EventEmitter<null>();
    protected freezePromise: Promise<boolean> | undefined = undefined;
    protected freezeResolve: ((value?: boolean | PromiseLike<boolean> | undefined) => void) | undefined = undefined;

    constructor(protected storage: IConfigStorage, logFn?: LogFunction) {
        // tslint:disable-next-line:no-empty
        this.logFn = logFn || (() => {});
        this.onDidLoad = this.changeEmitter.event;
    }

    public setStorage(storage: IConfigStorage) {
        this.logFn(LogType.debug, () => "setStorage");
        this.storage = storage;
        this.load();
    }

    /**
     * Add ConfigSection to pool. ConfigPool will keep it up to date.
     */
    public add(cfg: IConfigSection): boolean {
        this.logFn(LogType.debug, () => "add " + cfg.name());
        this.pool.set(cfg.name(), cfg);
        this.load();
        return true;
    }

    /**
     * Let it possible to freeze/unfreeze get() operation because of the changes that are being made outside.
     * Note - unstackable! Onle the last freeze/unfreeze is taking effect.
     */
    public freeze(): void {
        this.logFn(LogType.debug, () => "freeze");
        if (!this.freezePromise) {
            this.freezePromise = new Promise<boolean>((resolve) => {
                this.freezeResolve = resolve;
            });
        }
    }

    public unfreeze(): void {
        this.logFn(LogType.debug, () => "unfreeze");
        if (this.freezeResolve) {
            this.freezeResolve(true);
        }
        this.freezeResolve = undefined;
        this.freezePromise = undefined;
    }

    /**
     * Get kept ConfigSection.
     */
    public get(section: string): Promise<IConfigSection|undefined> {
        this.logFn(LogType.debug, () => "get = " + section);
        return new Promise<IConfigSection>(async (resolve) => {
            const promises: any[] = [];
            if (this.loadPromise) {
                promises.push(this.loadPromise);
            }
            if (this.freezePromise) {
                promises.push(this.freezePromise);
            }
            if (promises.length) {
                await Promise.all(promises);
            }
            resolve(this.pool.get(section));
            this.logFn(LogType.debug, () => "get => ok " + section);
        });
    }

    public load(storageT?: IConfigStorage): Promise<CSAResult> {
        const storage = storageT || this.storage;
        this.logFn(LogType.debug, () => "load =");
        if (!this.loadPromise) {
            let changed = false;
            this.loadPromise = new Promise<CSAResult>(async (resolve) => {
                // do load
                storage.fillStart().then(async (started) => {
                    if (started === CSAResult.ok) {
                        let retCode = CSAResult.ok;
                        for (const [sectionName, cfg] of this.pool) {
                            if (cfg.name() === sectionName) {
                                const data = cfg.templateToFillFrom();
                                try {
                                    const r = await storage.fillData(sectionName, data);
                                    if (r === CSAResult.ok) {
                                        changed = cfg.fillFrom(data) || changed;
                                    } else {
                                        // tslint:disable-next-line:no-bitwise
                                        retCode |= r;
                                    }
                                } catch (err) {
                                    this.logFn(LogType.debug, () => localize("config.filldata.failed", "filling data('{0}') failed", sectionName));
                                    this.logFn(LogType.error, () => String(err));
                                    // tslint:disable-next-line:no-bitwise
                                    retCode |= CSAResult.some_data_failed;
                                }
                            }
                        }
                        storage.fillEnd().then((ended) => {
                            // tslint:disable-next-line:no-bitwise
                            retCode |= ended;
                            resolve(retCode);
                            this.logFn(LogType.debug, () => "load => " + (retCode ? "fail" : "ok"));
                        });
                    } else {
                        resolve(started);   // didn't start
                        this.logFn(LogType.debug, () => "load => fail");
                    }
                    this.loadPromise = undefined;
                    this.logFn(LogType.debug, () => "load => clear");
                });
            });
            this.loadPromise.then(() => {
                if (changed) {
                    this.fireChangeSoon();
                }
            });
        }
        return this.loadPromise;
    }

    public save(storageT?: IConfigStorage): Promise<CSAResult> {
        const storage = storageT || this.storage;
        this.logFn(LogType.debug, () => "save =");
        if (!this.savePromise) {
            this.savePromise = new Promise<CSAResult>(async (resolve) => {
                // do save
                storage.storeStart().then( async (started) => {
                    if (started === CSAResult.ok) {
                        let retCode = CSAResult.ok;
                        for (const [sectionName, cfg] of this.pool) {
                            if (cfg.name() === sectionName) {
                                const data = cfg.store();
                                try {
                                    // tslint:disable-next-line:no-bitwise
                                    retCode |= await storage.storeData(sectionName, data);
                                } catch (err) {
                                    this.logFn(LogType.debug, () => localize("config.storedata.failed", "storing data('{0}') failed", sectionName));
                                    this.logFn(LogType.error, () => String(err));
                                    // tslint:disable-next-line:no-bitwise
                                    retCode |= CSAResult.some_data_failed;
                                }
                            }
                        }
                        storage.storeEnd().then((ended) => {
                            // tslint:disable-next-line:no-bitwise
                            retCode |= ended;
                            resolve(retCode);
                            this.savePromise = undefined;
                            this.logFn(LogType.debug, () => "save => " + (retCode ? "fail" : "ok"));
                        });
                    } else {
                        resolve(started);   // didn't start
                        this.savePromise = undefined;
                        this.logFn(LogType.debug, () => "save => fail");
                    }
                });
            });
        }
        return this.savePromise;
    }

    protected fireChangeSoon(): void {
        this.changeEmitter.fire();
    }

}
