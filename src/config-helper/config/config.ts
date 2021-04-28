import { Disposable, WorkspaceFolder } from "vscode";
import { Event } from "vscode";

import { LogFunction } from "../../common/main";

/**
 * Base types and interfaces
 */

export type SimplyData = string | string[] | number | boolean | null | undefined;
export type ValueData = SimplyData | IConfigData[];

/**
 * ConfigData
 */
export interface IConfigData {
    [key: string]: ValueData;
}

/**
 * IConfigSection
 */
export interface IConfigSection {

    name(): string;

    store(): IConfigData;

    fillFrom(data: IConfigData): boolean;

    templateToFillFrom(): IConfigData;
}

/**
 * CSAResult
 */
export enum CSAResult {
    ok = 0,
    fail = 1,
    prepare_failed = 2,
    some_data_failed = 4,
    end_failed = 8,
}

/**
 * IConfigStorage
 */
export interface IConfigStorage {

    fillStart(): Promise<CSAResult>;
    fillData(section: string, data: IConfigData): Promise<CSAResult>;
    fillEnd(): Promise<CSAResult>;

    storeStart(): Promise<CSAResult>;
    storeData(section: string, data: IConfigData): Promise<CSAResult>;
    storeEnd(): Promise<CSAResult>;
}

/**
 * IConfig
 */
export interface IConfig {
    /**
     * Calls when configuration did load
     */
    onDidLoad: Event<null>;

    /**
     * Add a config section to hold within
     * @param cfg - implementation of config section
     */
    add(cfg: IConfigSection): boolean;

    /**
     * Retrieve config section
     * @param section - config section name
     */
    get(section: string): Promise<IConfigSection|undefined>;

    /**
     * Load configuration from outer storage
     */
    load(storageT?: IConfigStorage): Promise<CSAResult>;

    /*
     * Save configuration to outer storage
     */
    save(storageT?: IConfigStorage): Promise<CSAResult>;

}

/**
 * IConfigEditor
 */
export interface IConfigEditor {
    invoke(): Promise<boolean>;
}

/**
 * IConfigHelper
 */
export interface IConfigHelper extends Disposable {
    workspaceFolder: WorkspaceFolder | undefined;
    getConfig(): IConfig;
    getEditor(): IConfigEditor;
}

export interface IConfigApi {
    getConfigHelper(extension: string, scope?: string): IConfigHelper;
    createLogFunction(channelName: string): LogFunction;
}
