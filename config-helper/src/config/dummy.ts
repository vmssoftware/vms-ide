import { ConfigEditor, CSA_Result, ConfigStorage } from "./config";

/**
 * Dummy implementations
 * 
 * 
 */

export class DummyStorage implements ConfigStorage {
    
    fillStart(): Promise<CSA_Result> {
        return Promise.resolve(CSA_Result.prepare_failed);
    }     
    
    fillData(): Promise<CSA_Result> {
        return Promise.resolve(CSA_Result.some_data_failed);
    }

    fillEnd(): Promise<CSA_Result> {
        return Promise.resolve(CSA_Result.end_failed);
    }

    storeStart(): Promise<CSA_Result> {
        return Promise.resolve(CSA_Result.prepare_failed);
    }

    storeData(): Promise<CSA_Result> {
        return Promise.resolve(CSA_Result.some_data_failed);
    }

    storeEnd(): Promise<CSA_Result> {
        return Promise.resolve(CSA_Result.end_failed);
    }
 }

 
export class DummyEditor implements ConfigEditor {
    invoke() : Promise<boolean> {
        return Promise.resolve(false);
    }
}
