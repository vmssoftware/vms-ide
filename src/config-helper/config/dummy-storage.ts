import { CSAResult, IConfigStorage } from "./config";

/**
 * Dummy Storage implementations
 */

export class DummyStorage implements IConfigStorage {

    public fillStart(): Promise<CSAResult> {
        return Promise.resolve(CSAResult.prepare_failed);
    }

    public fillData(): Promise<CSAResult> {
        return Promise.resolve(CSAResult.some_data_failed);
    }

    public fillEnd(): Promise<CSAResult> {
        return Promise.resolve(CSAResult.end_failed);
    }

    public storeStart(): Promise<CSAResult> {
        return Promise.resolve(CSAResult.prepare_failed);
    }

    public storeData(): Promise<CSAResult> {
        return Promise.resolve(CSAResult.some_data_failed);
    }

    public storeEnd(): Promise<CSAResult> {
        return Promise.resolve(CSAResult.end_failed);
    }
 }
