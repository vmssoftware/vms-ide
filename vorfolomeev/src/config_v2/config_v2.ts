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

    fillStart() : Thenable<CSA_Result>;
    fillData(section: string, data: ConfigData) : Thenable<CSA_Result>;
    fillEnd() : Thenable<CSA_Result>;

    storeStart() : Thenable<CSA_Result>;
    storeData(section: string, data: ConfigData) : Thenable<CSA_Result>;
    storeEnd() : Thenable<CSA_Result>;

    isStoring(): boolean;
}

/**
 * 
 */
export interface Config {
    add(cfg: ConfigSection) : boolean;
    get(section: string) : Thenable<ConfigSection|undefined>;

    load() : Thenable<CSA_Result>;
    save() : Thenable<CSA_Result>;

    onDidChange: Event<null>;
}

/**
 * 
 */
export interface ConfigEditor {
    invoke() : Thenable<boolean>;
}

/**
 * 
 */
export interface ConfigHelper extends Disposable {

    getConfig() : Config;

    //getStorage() : ConfigStorage;

    getEditor() : ConfigEditor;

}
