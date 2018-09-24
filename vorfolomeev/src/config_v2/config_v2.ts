import { Disposable } from "vscode";
import { Event } from "vscode";

/**
 * Base types and interfaces
 * 
 * 
 * 
 */

export type SimplyData = string | number | boolean | null;
export type ValueData = SimplyData | Array<ConfigData>;

/**
 * 
 */
export interface ConfigData {
    [key: string] : ValueData;
}

/**
 * 
 */
export interface ConfigSection {

    name(): string;

    store(): ConfigData;

    fillFrom(data: ConfigData): boolean;

    templateToFillFrom(): ConfigData;
}

/**
 * 
 */
export interface ConfigObject {
    [key:string] : ConfigSection;
}

/**
 * 
 */
export enum CSA_Result {
    ok = 0,
    fail = 1,
    prepare_failed = 2,
    some_data_failed = 4,
    end_failed = 8
}

/**
 * 
 */
export interface ConfigStorage {

    fillStart() : Promise<CSA_Result>;
    fillData(section: string, data: ConfigData) : Promise<CSA_Result>;
    fillEnd() : Promise<CSA_Result>;

    storeStart() : Promise<CSA_Result>;
    storeData(section: string, data: ConfigData) : Promise<CSA_Result>;
    storeEnd() : Promise<CSA_Result>;
}

/**
 * 
 */
export interface Config {
    /**
     * Add a config section to hold within
     * @param cfg - implementation of config section
     */
    add(cfg: ConfigSection) : boolean;

    /**
     * Retrieve config section
     * @param section - config section name
     */
    get(section: string) : Promise<ConfigSection|undefined>;

    /**
     * Load configuration from outer storage
     */
    load() : Promise<CSA_Result>;

    /*
     * Save configuration to outer storage
     */
    save() : Promise<CSA_Result>;

    /**
     * Calls when configuration did load
     */
    onDidLoad: Event<null>;
}

/**
 * 
 */
export interface ConfigEditor {
    invoke() : Promise<boolean>;
}

/**
 * 
 */
export interface ConfigHelper extends Disposable {

    getConfig() : Config;

    getEditor() : ConfigEditor;

}
