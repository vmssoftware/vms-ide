import { ConfigEditor, CSA_Result, ConfigData, ConfigStorage } from "./config_v2";

/**
 * Dummy implementations
 * 
 * 
 */

export class DummyStorage implements ConfigStorage {
    
    isStoring(): boolean {
        return false;
    }

    fillStart(): Thenable<CSA_Result> {
        return Promise.resolve(CSA_Result.prepare_failed);
    }     
    
    fillData(section: string, data: ConfigData): Thenable<CSA_Result> {
        return Promise.resolve(CSA_Result.some_data_failed);
    }

    fillEnd(): Thenable<CSA_Result> {
        return Promise.resolve(CSA_Result.end_failed);
    }

    storeStart(): Thenable<CSA_Result> {
        return Promise.resolve(CSA_Result.prepare_failed);
    }

    storeData(section: string, data: ConfigData): Thenable<CSA_Result> {
        return Promise.resolve(CSA_Result.some_data_failed);
    }

    storeEnd(): Thenable<CSA_Result> {
        return Promise.resolve(CSA_Result.end_failed);
    }
 }

 
export class DummyEditor implements ConfigEditor {
    invoke() : Thenable<boolean> {
        return Promise.resolve(false);
    }
}
